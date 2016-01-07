package net.tiger.star.nsen.service;

import java.util.List;
import javax.annotation.Generated;
import net.tiger.star.nsen.entity.Channel;

import static net.tiger.star.nsen.entity.ChannelNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Channel}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/06/18 12:52:59")
public class ChannelService extends AbstractService<Channel> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param channelId
     *            識別子
     * @return エンティティ
     */
    public Channel findById(Long channelId) {
        return select().id(channelId).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Channel> findAllOrderById() {
        return select().orderBy(asc(channelId())).getResultList();
    }
}