package net.tiger.star.nsen.logic;

import javax.annotation.Resource;

import net.tiger.star.nsen.dto.NsenDto;
import net.tiger.star.nsen.entity.Channel;
import net.tiger.star.nsen.entity.ChannelLog;
import net.tiger.star.nsen.entity.NsenUser;
import net.tiger.star.nsen.entity.ReportLog;
import net.tiger.star.nsen.service.ChannelLogService;
import net.tiger.star.nsen.service.NsenUserService;
import net.tiger.star.nsen.service.ReportLogService;

import org.apache.commons.lang3.StringUtils;
import org.seasar.framework.log.Logger;
import org.seasar.framework.util.StringUtil;

import twitter4j.RateLimitStatus;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;

/**
 * ツイッターAPIを使用
 * @author mikosu3
 *
 */
public class TwitterLogic {

    private static Logger log = Logger.getLogger(TwitterLogic.class);

    private Twitter twitter;

    @Resource
    protected NsenUserService nsenUserService;

    @Resource
    protected ChannelLogService channelLogService;

    @Resource
    protected ReportLogService reportLogService;

    /**
     * ユーザー情報を取得する
     * @param screenName
     * @return
     */
    public User showUser(String screenName) {
        try {
            return twitter.showUser(screenName);
        } catch (TwitterException e) {
            log.error(e.getErrorMessage(), e);
            return null;
        }
    }

    /**
     * 公式垢で呟く
     */
    public Long tweetPublicCh(Channel ch, NsenDto dto) {

        // チャンネルログ最新1件取得
        ChannelLog channelLog =  channelLogService.getLastOne(ch.channelId);
        if (channelLog != null && StringUtil.equals(channelLog.video, dto.video)) {
            return channelLog.channelLogId;
        }

        // アカウント情報セット
        setOAuthAccessToken(getPublicAccount(ch));

        try {

            // ログ登録
            Long ret = insertChannelLog(ch, dto);

            // ツイート
            Status status = twitter.updateStatus(new StatusUpdate(getTweetMessage(ch, dto)));
            log.debug(status.getText());

            return ret;
        } catch (TwitterException e) {
            log.warn("ツイート失敗", e);

            // 文字数オーバー
            if (e.getErrorCode() == 186) {
                log.warn(dto.title  + " " + dto.title.length() + "文字");
            }

            // ツイート重複時は除外
            if (e.getErrorCode() == 187) {
                return insertChannelLog(ch, dto);
            } else {
                return null;
            }
        }
    }

    /**
     * 登録ユーザーで呟く
     */
    public void tweetNsenUser(Channel ch, NsenDto dto, NsenUser nsenUser, Long logid) {


        // 通知済みか
        if (!reportLogService.getReportedData(logid, nsenUser.userId).isEmpty()) {
            log.debug("通知済みの為スキップ" + logid);
            return;
        }

        // アカウント情報セット
        setOAuthAccessToken(nsenUser);

        try {
            // 呟く
            Status status = twitter.updateStatus(new StatusUpdate(getReplyMessage(ch, dto, nsenUser.screenName)));
            log.debug(status.getText());

            // ログ登録
            insertReportLog(ch, dto, nsenUser, logid);

        } catch (TwitterException e) {
            if (e.getErrorCode() == 89) {
                // アプリ連携が切られている場合はアクセストークンをクリアする
                clearToken(nsenUser.userId);
            }
            if (e.getErrorCode() == 186) {
                log.warn("@" + nsenUser.screenName + " " + dto.title  + " " + (dto.title.length() + nsenUser.screenName.length()) + "文字");
            }
            log.warn(e);
        }

    }

    /**
     * 呟く内容
     */
    public String getTweetMessage(Channel ch, NsenDto dto) {
        return "On Air: " + getMessage(ch, dto, "");
    }

    /**
     * リプ内容
     */
    public String getReplyMessage(Channel ch, NsenDto dto, String screenName) {
        return "@" + screenName + " オンエアなぅ: " + getMessage(ch, dto, screenName) + " #Nsen";
    }

    /**
     * API制限の状況を取得する
     * @return
     */
    public RateLimitStatus getRateLimitStatus() {
        try {
            return twitter.getRateLimitStatus().get("/application/rate_limit_status");
        } catch (Exception e) {
            log.error(e);
            return null;
        }
    }

    /**
     * チャンネルログの登録を行う
     * @param ch
     * @param dto
     * @return
     */
    private Long insertChannelLog(Channel ch, NsenDto dto) {

        ChannelLog entity = new ChannelLog();
        entity.channelId = ch.channelId;
        entity.video = dto.video;
        channelLogService.insert(entity);

        return entity.channelLogId;
    }

    /**
     * 通知ログの登録を行う
     * @param ch
     * @param dto
     * @return
     */
    private boolean insertReportLog(Channel ch, NsenDto dto, NsenUser nsenUser, Long logid) {
        ReportLog entity = new ReportLog();
        entity.channelLogId = logid;
        entity.userId = nsenUser.userId;
        return reportLogService.insert(entity) == 1;
    }

    /**
     * アクセストークンをclear
     * @param id
     * @return
     */
    private int clearToken(Long id) {
        NsenUser entity = nsenUserService.findById(id);
        entity.accessToken = null;
        entity.accessTokenSecret = null;
        return nsenUserService.update(entity);
    }

    /**
     * 本文
     */
    private String getMessage(Channel ch, NsenDto dto, String screenName) {
        return getTitle(dto, screenName) + " " + ch.livelUrl + " " + "http://www.nicovideo.jp/watch/" + dto.video + " 通算" + channelLogService.getVideoCount(dto.video) +  "回目" + " #" + dto.video;
    }

    /**
     * 公式アカウント情報
     * @param ch
     * @return
     */
    private NsenUser getPublicAccount(Channel ch) {
        NsenUser ret = new NsenUser();

        ret.accessToken = ch.accessToken;
        ret.accessTokenSecret = ch.accessTokenSecret;

        return ret;
    }

    /**
     * 動画タイトルを取得する　長い場合は端折る
     * @param dto dto
     * @param screenName ユーザー
     * @return タイトル
     */
    private String getTitle(NsenDto dto, String screenName) {
        String ret = dto.title;

        if (StringUtil.isNotEmpty(screenName)) {
            // スクリーンネームと動画タイトルの文字数が50を超えていれば動画タイトルを端折る
            if ((screenName.length() + dto.title.length()) > 50) {
                ret = StringUtils.substring(dto.title, 0, 33) + "…";
            }
        } else {
            if (dto.title.length() > 35) {
                ret = StringUtils.substring(dto.title, 0, 33) + "…";
            }
        }
        return ret;
    }

    /**
     * ユーザー情報でOAuth認証を行う
     * @param nsenUser
     */
    private void setOAuthAccessToken(NsenUser nsenUser) {
        // 初期化
        twitter = new TwitterFactory().getInstance();

        // ユーザーのアクセストークンで認証
        twitter.setOAuthAccessToken(new AccessToken(nsenUser.accessToken, nsenUser.accessTokenSecret));
    }
}
