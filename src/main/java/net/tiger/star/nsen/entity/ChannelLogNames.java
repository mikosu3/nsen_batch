package net.tiger.star.nsen.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import net.tiger.star.nsen.entity.ChannelNames._ChannelNames;
import net.tiger.star.nsen.entity.ReportLogNames._ReportLogNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link ChannelLog}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/06/20 23:17:58")
public class ChannelLogNames {

    /**
     * channelLogIdのプロパティ名を返します。
     * 
     * @return channelLogIdのプロパティ名
     */
    public static PropertyName<Long> channelLogId() {
        return new PropertyName<Long>("channelLogId");
    }

    /**
     * channelIdのプロパティ名を返します。
     * 
     * @return channelIdのプロパティ名
     */
    public static PropertyName<Long> channelId() {
        return new PropertyName<Long>("channelId");
    }

    /**
     * videoのプロパティ名を返します。
     * 
     * @return videoのプロパティ名
     */
    public static PropertyName<String> video() {
        return new PropertyName<String>("video");
    }

    /**
     * createAtのプロパティ名を返します。
     * 
     * @return createAtのプロパティ名
     */
    public static PropertyName<Timestamp> createAt() {
        return new PropertyName<Timestamp>("createAt");
    }

    /**
     * createUserのプロパティ名を返します。
     * 
     * @return createUserのプロパティ名
     */
    public static PropertyName<String> createUser() {
        return new PropertyName<String>("createUser");
    }

    /**
     * updateAtのプロパティ名を返します。
     * 
     * @return updateAtのプロパティ名
     */
    public static PropertyName<Timestamp> updateAt() {
        return new PropertyName<Timestamp>("updateAt");
    }

    /**
     * updateUserのプロパティ名を返します。
     * 
     * @return updateUserのプロパティ名
     */
    public static PropertyName<String> updateUser() {
        return new PropertyName<String>("updateUser");
    }

    /**
     * versionのプロパティ名を返します。
     * 
     * @return versionのプロパティ名
     */
    public static PropertyName<Long> version() {
        return new PropertyName<Long>("version");
    }

    /**
     * channelのプロパティ名を返します。
     * 
     * @return channelのプロパティ名
     */
    public static _ChannelNames channel() {
        return new _ChannelNames("channel");
    }

    /**
     * reportLogListのプロパティ名を返します。
     * 
     * @return reportLogListのプロパティ名
     */
    public static _ReportLogNames reportLogList() {
        return new _ReportLogNames("reportLogList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _ChannelLogNames extends PropertyName<ChannelLog> {

        /**
         * インスタンスを構築します。
         */
        public _ChannelLogNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ChannelLogNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _ChannelLogNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * channelLogIdのプロパティ名を返します。
         *
         * @return channelLogIdのプロパティ名
         */
        public PropertyName<Long> channelLogId() {
            return new PropertyName<Long>(this, "channelLogId");
        }

        /**
         * channelIdのプロパティ名を返します。
         *
         * @return channelIdのプロパティ名
         */
        public PropertyName<Long> channelId() {
            return new PropertyName<Long>(this, "channelId");
        }

        /**
         * videoのプロパティ名を返します。
         *
         * @return videoのプロパティ名
         */
        public PropertyName<String> video() {
            return new PropertyName<String>(this, "video");
        }

        /**
         * createAtのプロパティ名を返します。
         *
         * @return createAtのプロパティ名
         */
        public PropertyName<Timestamp> createAt() {
            return new PropertyName<Timestamp>(this, "createAt");
        }

        /**
         * createUserのプロパティ名を返します。
         *
         * @return createUserのプロパティ名
         */
        public PropertyName<String> createUser() {
            return new PropertyName<String>(this, "createUser");
        }

        /**
         * updateAtのプロパティ名を返します。
         *
         * @return updateAtのプロパティ名
         */
        public PropertyName<Timestamp> updateAt() {
            return new PropertyName<Timestamp>(this, "updateAt");
        }

        /**
         * updateUserのプロパティ名を返します。
         *
         * @return updateUserのプロパティ名
         */
        public PropertyName<String> updateUser() {
            return new PropertyName<String>(this, "updateUser");
        }

        /**
         * versionのプロパティ名を返します。
         *
         * @return versionのプロパティ名
         */
        public PropertyName<Long> version() {
            return new PropertyName<Long>(this, "version");
        }

        /**
         * channelのプロパティ名を返します。
         * 
         * @return channelのプロパティ名
         */
        public _ChannelNames channel() {
            return new _ChannelNames(this, "channel");
        }

        /**
         * reportLogListのプロパティ名を返します。
         * 
         * @return reportLogListのプロパティ名
         */
        public _ReportLogNames reportLogList() {
            return new _ReportLogNames(this, "reportLogList");
        }
    }
}