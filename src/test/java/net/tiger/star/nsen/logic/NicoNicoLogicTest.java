package net.tiger.star.nsen.logic;

import org.seasar.extension.unit.S2TestCase;

public class NicoNicoLogicTest extends S2TestCase {

    private NicoNicoLogic nicoNicoLogic;

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
     * {@link #nsenUserService}が利用可能であることをテストします。
     *
     * @throws Exception
     */
    public void testAvailable() throws Exception {
        assertNotNull(nicoNicoLogic);
    }

    public void testGetVideoInfo() throws Exception {
        System.out.println(nicoNicoLogic.getNsenVideo("http://watch.live.nicovideo.jp/api/getplayerstatus/nsen/toho", nicoNicoLogic.login()).status);
    }
}
