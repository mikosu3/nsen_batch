package net.tiger.star.nsen.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.JdbcManager;
import org.seasar.extension.unit.S2TestCase;

import static net.tiger.star.nsen.entity.ReportLogNames.*;

/**
 * {@link ReportLog}のテストクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityTestModelFactoryImpl"}, date = "2014/06/19 21:31:10")
public class ReportLogTest extends S2TestCase {

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
        jdbcManager.from(ReportLog.class).id(1L).getSingleResult();
    }

    /**
     * channelLogとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_channelLog() throws Exception {
        jdbcManager.from(ReportLog.class).leftOuterJoin(channelLog()).id(1L).getSingleResult();
    }

    /**
     * nsenUserとの外部結合をテストします。
     * 
     * @throws Exception
     */
    public void testLeftOuterJoin_nsenUser() throws Exception {
        jdbcManager.from(ReportLog.class).leftOuterJoin(nsenUser()).id(1L).getSingleResult();
    }
}