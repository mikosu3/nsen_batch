package net.tiger.star.nsen.main;

import java.io.IOException;

import net.tiger.star.nsen.logic.NicoNicoLogic;
import net.tiger.star.nsen.logic.NsenLogic;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;
import org.seasar.framework.log.Logger;

/**
 * Nsenで流れている曲を取得しつぶやく
 *
 * @author mikosu3
 *
 */
public class NsenMain {

    private static Logger log = Logger.getLogger(NsenMain.class);

    /**
     * メインクラス
     *
     * @param args
     * @throws IOException
     * @throws ClientProtocolException
     */
    public static void main(String[] args) {
        SingletonS2ContainerFactory.init();
        NsenLogic logic = SingletonS2Container.getComponent(NsenLogic.class);
        NicoNicoLogic nicoNicoLogic = SingletonS2Container
                .getComponent(NicoNicoLogic.class);

        // エラー回数
        int err = 0;

        // 初回ログイン
        CookieStore cookieStore = nicoNicoLogic.login();


        if (cookieStore == null) {
            try {
                log.warn("初回ログインに失敗しました。20分後に再ログインします。");
                Thread.sleep(20 * 60 * 1000);

                // 再ログイン
                cookieStore = nicoNicoLogic.login();

            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        if (cookieStore == null) {
            log.fatal("ログイン出来ないため終了します。");
            System.exit(2);
        }

        // メインループ
        while (true) {

            try {
                // Nsen情報取得
                logic.execute(cookieStore);

                // エラーカウンタリセット
                err = 0;

            } catch (Exception en) {
                log.error("動画情報取得に失敗 ", en);
                err++;

                // 再ログイン
                cookieStore = nicoNicoLogic.login();

                // 5回以上ログインに失敗している場合は1時間追加でまつ
                if (err > 5) {
                    try {
                        log.warn(err + "回ログインに失敗しました。30分後に再ログインします。");
                        Thread.sleep(30 * 60 * 1000);
                        err = 0;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }

            } finally {
                // 30秒まつ
                try {
                    Thread.sleep(30 * 1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
