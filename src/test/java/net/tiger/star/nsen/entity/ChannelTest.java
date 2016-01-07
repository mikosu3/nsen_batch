package net.tiger.star.nsen.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static net.tiger.star.nsen.entity.ChannelNames.*;

/**
 * {@link Channel}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2014/06/19 21:31:10")
public class ChannelTest extends S2TestCase {

    private JdbcManager jdbcManager;

    /**
     * 事前処理をします。
     * 
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("s2jdbc.dicon");
    }

    /**
     * 識別子による取得をテストします。
     * 
     * @throws Exception
     */
    public void testFindById() throws Exception {
        jdbcManager.from(Channel.class).id(1L).getSingleResult();
    }

    /**
     * channelLogListとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_channelLogList() throws Exception {
        jdbcManager.from(Channel.class).leftOuterJoin(channelLogList()).id(1L).getSingleResult();
    }
}