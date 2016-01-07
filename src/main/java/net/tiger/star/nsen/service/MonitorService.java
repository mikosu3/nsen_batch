package net.tiger.star.nsen.service;

import static net.tiger.star.nsen.entity.MonitorNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import net.tiger.star.nsen.entity.Monitor;

import org.seasar.extension.jdbc.JoinType;

/**
 * {@link Monitor}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/06/18 12:52:59")
public class MonitorService extends AbstractService<Monitor> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param monitorId
     *            識別子
     * @return エンティティ
     */
    public Monitor findById(Long monitorId) {
        return select().id(monitorId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<Monitor> findAllOrderById() {
        return select().orderBy(asc(monitorId())).getResultList();
    }

    /**
     * 動画から監視対象を検索する
     * @param video
     * @return
     */
    public List<Monitor> findByVideo(String video) {
        return select().join(nsenUser(), JoinType.INNER).where(eq(video(), video), isNotNull(nsenUser().accessToken()), isNotNull(nsenUser().accessTokenSecret())).getResultList();
    }
}