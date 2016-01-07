package net.tiger.star.nsen.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import net.tiger.star.nsen.entity.ChannelLogNames._ChannelLogNames;
import net.tiger.star.nsen.entity.NsenUserNames._NsenUserNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link ReportLog}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/06/20 23:17:59")
public class ReportLogNames {

    /**
     * reportLogIdのプロパティ名を返します。
     * 
     * @return reportLogIdのプロパティ名
     */
    public static PropertyName<Long> reportLogId() {
        return new PropertyName<Long>("reportLogId");
    }

    /**
     * channelLogIdのプロパティ名を返します。
     * 
     * @return channelLogIdのプロパティ名
     */
    public static PropertyName<Long> channelLogId() {
        return new PropertyName<Long>("channelLogId");
    }

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Long> userId() {
        return new PropertyName<Long>("userId");
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
     * channelLogのプロパティ名を返します。
     * 
     * @return channelLogのプロパティ名
     */
    public static _ChannelLogNames channelLog() {
        return new _ChannelLogNames("channelLog");
    }

    /**
     * nsenUserのプロパティ名を返します。
     * 
     * @return nsenUserのプロパティ名
     */
    public static _NsenUserNames nsenUser() {
        return new _NsenUserNames("nsenUser");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _ReportLogNames extends PropertyName<ReportLog> {

        /**
         * インスタンスを構築します。
         */
        public _ReportLogNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ReportLogNames(final String name) {
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
        public _ReportLogNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * reportLogIdのプロパティ名を返します。
         *
         * @return reportLogIdのプロパティ名
         */
        public PropertyName<Long> reportLogId() {
            return new PropertyName<Long>(this, "reportLogId");
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
         * userIdのプロパティ名を返します。
         *
         * @return userIdのプロパティ名
         */
        public PropertyName<Long> userId() {
            return new PropertyName<Long>(this, "userId");
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
         * channelLogのプロパティ名を返します。
         * 
         * @return channelLogのプロパティ名
         */
        public _ChannelLogNames channelLog() {
            return new _ChannelLogNames(this, "channelLog");
        }

        /**
         * nsenUserのプロパティ名を返します。
         * 
         * @return nsenUserのプロパティ名
         */
        public _NsenUserNames nsenUser() {
            return new _NsenUserNames(this, "nsenUser");
        }
    }
}