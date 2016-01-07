package net.tiger.star.nsen.service;

import javax.annotation.Generated;

import org.seasar.extension.unit.S2TestCase;

/**
 * {@link ChannelLogService}のテストクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceTestModelFactoryImpl"}, date = "2014/06/19 21:31:11")
public class ChannelLogServiceTest extends S2TestCase {

    private ChannelLogService channelLogService;

    /**
     * 事前処理をします。
     *
     * @throws Exception
     */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        include("app.dicon");
    }

    /**
     * {@link #channelLogService}が利用可能であることをテストします。
     *
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(channelLogService);
    }

    /**
     * {@link #channelLogService}が利用可能であることをテストします。
     *
     * @throws Exception
     */
    public void testGetVideoCount() throws Exception {
        System.out.println(channelLogService.getVideoCount("sm18644381"));
        assertNotNull(channelLogService.getVideoCount("sm18644381"));
    }

}