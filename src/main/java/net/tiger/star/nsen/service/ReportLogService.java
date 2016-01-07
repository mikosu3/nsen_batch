package net.tiger.star.nsen.service;

import static net.tiger.star.nsen.entity.ReportLogNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import net.tiger.star.nsen.entity.ReportLog;

/**
 * {@link ReportLog}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/06/19 21:21:19")
public class ReportLogService extends AbstractService<ReportLog> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param reportLogId
     *            識別子
     * @return エンティティ
     */
    public ReportLog findById(Long reportLogId) {
        return select().id(reportLogId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<ReportLog> findAllOrderById() {
        return select().orderBy(asc(reportLogId())).getResultList();
    }

    /**
     * 通知済みのログを取得する
     * @param channelLogId
     * @param userId
     * @return
     */
    public List<ReportLog> getReportedData(Long channelLogId, Long userId) {
        return select().where(eq(userId(), userId), eq(channelLogId(), channelLogId)).getResultList();
    }

}