package net.tiger.star.nsen.logic;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.bind.JAXB;

import net.tiger.star.nsen.dto.NsenDto;
import net.tiger.star.nsen.exception.NicoNicoLoginException;
import net.tiger.star.nsen.jaxb.Getplayerstatus;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.params.ClientPNames;
import org.apache.http.client.params.CookiePolicy;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.seasar.framework.log.Logger;
import org.seasar.framework.util.ResourceUtil;

/**
 * ニコニコ用ロジッククラス
 *
 * @author admin
 *
 */
public class NicoNicoLogic {

    private static final String PROP_NAME = "niconico.properties";

    private static final String LOGIN_URL = ResourceUtil.getProperties(PROP_NAME).getProperty("login.url");
    private static final String MAIL_ADDRESS = ResourceUtil.getProperties(PROP_NAME).getProperty("login.mail");
    private static final String PASSWORD = ResourceUtil.getProperties(PROP_NAME).getProperty("login.password");

    private static Logger log = Logger.getLogger(NicoNicoLogic.class);

    /**
     * Nsenの動画情報を取得する
     *
     * @param chUrl
     *            チャンネルURL
     * @param cookieStore
     *            認証クッキー
     * @return 動画情報
     * @throws ClientProtocolException
     * @throws IOException
     * @throws NicoNicoLoginException
     * @throws IllegalStateException
     */
    public NsenDto getNsenVideo(String chUrl, CookieStore cookieStore) throws ClientProtocolException,
            IOException, IllegalStateException, NicoNicoLoginException {

        DefaultHttpClient clientNsen = new DefaultHttpClient();
        clientNsen.setCookieStore(cookieStore);
        HttpPost postFlv = new HttpPost(chUrl);
        HttpResponse responseNsen = clientNsen.execute(postFlv);

        // DTOで取得
        NsenDto ret = getNsenDto(responseNsen.getEntity());

        // 切断
        clientNsen.getConnectionManager().shutdown();

        return ret;
    }

    /**
     * ニコニコへログインする
     * @return 認証クッキー
     * @throws ClientProtocolException
     * @throws IOException
     */
    public CookieStore login() {
        DefaultHttpClient client = new DefaultHttpClient();
        client.getParams().setParameter(ClientPNames.COOKIE_POLICY, CookiePolicy.BROWSER_COMPATIBILITY);
        client.getParams().setParameter("http.connection.timeout", 5000);
        client.getParams().setParameter("http.socket.timeout", 3000);

        HttpPost post = new HttpPost(LOGIN_URL);

        // 認証
        ArrayList<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("mail", MAIL_ADDRESS));
        params.add(new BasicNameValuePair("password", PASSWORD));

        try {
            post.setEntity(new UrlEncodedFormEntity(params, "utf-8"));
            client.execute(post);
        } catch (Exception e) {
            log.error("ニコニコ ログインエラー" + e);
            return null;
        }
        // cookie保存
        CookieStore cookieStore = client.getCookieStore();
        client.getConnectionManager().shutdown();

        return cookieStore;

    }

    /**
     * HttpEntityからNsenDtoを取得する
     *
     * @param entity
     * @throws IOException
     * @throws IllegalStateException
     * @throws NicoNicoLoginException
     */
    private NsenDto getNsenDto(HttpEntity entity) throws IllegalStateException,
            IOException, NicoNicoLoginException {
        NsenDto ret = new NsenDto();

        // XMLからDTOへ
        Getplayerstatus xml = JAXB.unmarshal(entity.getContent(), Getplayerstatus.class);

        ret.status = xml.getStatus();
        log.debug(ret.status);

        if (!"ok".equals(ret.status)) {
            throw new NicoNicoLoginException("動画情報の取得に失敗しました:" + ret.status);
        }

        try {
            ret.title = xml.getStream().getContentsList().getContents().getTitle();
            ret.video = xml.getStream().getContentsList().getContents().getValue().split(":")[1];
        } catch (NullPointerException e) {
            log.warn("動画情報が取得できませんでした。");
            return null;
        }
        return ret;
    }
}
