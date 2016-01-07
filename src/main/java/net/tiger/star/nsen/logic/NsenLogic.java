package net.tiger.star.nsen.logic;

import java.io.IOException;

import javax.annotation.Resource;

import net.tiger.star.nsen.dto.NsenDto;
import net.tiger.star.nsen.entity.Channel;
import net.tiger.star.nsen.entity.Monitor;
import net.tiger.star.nsen.exception.NicoNicoLoginException;
import net.tiger.star.nsen.service.ChannelService;
import net.tiger.star.nsen.service.MonitorService;

import org.apache.http.client.CookieStore;
import org.seasar.framework.log.Logger;

/**
 * Nsen情報取得ロジック
 * @author admin
 *
 */
public class NsenLogic {

    @Resource
    protected NicoNicoLogic nicoNicoLogic;

    @Resource
    protected TwitterLogic twitterLogic;

    @Resource
    protected ChannelService channelService;

    @Resource
    protected MonitorService monitorService;

    private static Logger log = Logger.getLogger(NsenLogic.class);


    public void execute(CookieStore cookieStore) throws NicoNicoLoginException {

        // ログイン可能か
        if (cookieStore == null) {
            log.error("ログイン情報なし");
            throw new NicoNicoLoginException("ログインしていない");
        }

        // チャンネル情報取得
        for (Channel ch : channelService.findAll()) {

            try {
                // Nsen情報取得
                NsenDto dto = nicoNicoLogic.getNsenVideo(ch.channelUrl, cookieStore);

                if (dto == null) {
                    continue;
                }

                // 取得したNsen情報を呟く
                log.debug("Nsenのアカウントで呟く");
                Long logid = twitterLogic.tweetPublicCh(ch, dto);


                // お知らせ対象の場合は通知する
                log.debug("お知らせなぅ");
                report(ch, dto, logid);

            } catch (IllegalStateException | IOException
                    | NicoNicoLoginException e) {
                log.warn(e);
                throw new NicoNicoLoginException(e.getMessage());
            }
        }
    }

    /**
     * 監視対象に登録しているユーザーに通知する
     * @param ch
     * @param dto
     */
    private void report(Channel ch, NsenDto dto, Long logid) {

        // 登録しているユーザー全員
        for (Monitor monitor : monitorService.findByVideo(dto.video)) {
            // 本人のアカウントで呟く
            twitterLogic.tweetNsenUser(ch, dto, monitor.nsenUser, logid);
        }
    }
}
