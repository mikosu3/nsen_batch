package net.tiger.star.nsen.entity;

import javax.annotation.Generated;
import net.tiger.star.nsen.entity.ChannelLogNames._ChannelLogNames;
import net.tiger.star.nsen.entity.ChannelNames._ChannelNames;
import net.tiger.star.nsen.entity.MonitorNames._MonitorNames;
import net.tiger.star.nsen.entity.NsenUserNames._NsenUserNames;
import net.tiger.star.nsen.entity.ReportLogNames._ReportLogNames;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2014/06/20 23:17:59")
public class Names {

    /**
     * {@link Channel}の名前クラスを返します。
     * 
     * @return Channelの名前クラス
     */
    public static _ChannelNames channel() {
        return new _ChannelNames();
    }

    /**
     * {@link ChannelLog}の名前クラスを返します。
     * 
     * @return ChannelLogの名前クラス
     */
    public static _ChannelLogNames channelLog() {
        return new _ChannelLogNames();
    }

    /**
     * {@link Monitor}の名前クラスを返します。
     * 
     * @return Monitorの名前クラス
     */
    public static _MonitorNames monitor() {
        return new _MonitorNames();
    }

    /**
     * {@link NsenUser}の名前クラスを返します。
     * 
     * @return NsenUserの名前クラス
     */
    public static _NsenUserNames nsenUser() {
        return new _NsenUserNames();
    }

    /**
     * {@link ReportLog}の名前クラスを返します。
     * 
     * @return ReportLogの名前クラス
     */
    public static _ReportLogNames reportLog() {
        return new _ReportLogNames();
    }
}