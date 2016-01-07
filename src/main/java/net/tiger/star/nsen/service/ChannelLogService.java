package net.tiger.star.nsen.service;

import static net.tiger.star.nsen.entity.ChannelLogNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import net.tiger.star.nsen.SqlFiles;
import net.tiger.star.nsen.dto.RankRowDto;
import net.tiger.star.nsen.entity.ChannelLog;

/**
 * {@link ChannelLog}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/06/18 12:52:59")
public class ChannelLogService extends AbstractService<ChannelLog> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param channelLogId
     *            識別子
     * @return エンティティ
     */
    public ChannelLog findById(BigInteger channelLogId) {
        return select().id(channelLogId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<ChannelLog> findAllOrderById() {
        return select().orderBy(asc(channelLogId())).getResultList();
    }

    /**
     * 最新1件を取得する
     * @return
     */
    public ChannelLog getLastOne(Long channelId) {
        return select().where(eq(channelId(), channelId)).orderBy(desc(channelLogId())).limit(1).getSingleResult();
    }

    /**
     * 放送回数を取得する
     * @param video
     * @return
     */
    public Long getVideoCount(String video) {
        return select().where(eq(video(), video)).getCount();
    }

    /**
     * 動画情報を取得する
     * @param video
     * @return
     */
    public List<ChannelLog> getVideo(String video) {
        Map<String, String> param = new HashMap<>();
        param.put("video", video);
        return selectBySqlFile(ChannelLog.class, SqlFiles.SQL_CHANNEL_LOG_SERVICE_GET_VIDEO, param).getResultList();
    }

    /**
     * ランキングを取得する
     * @param video
     * @return
     */
    public List<RankRowDto> getRanking(Long channelId, Integer limit) {
        Map<String, Long> param = new HashMap<>();
        param.put("CHANNEL_ID", channelId);
        return selectBySqlFile(RankRowDto.class, SqlFiles.SQL_CHANNEL_LOG_SERVICE_GET_RANKING, param).limit(limit).getResultList();
    }
}