package net.tiger.star.nsen.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import net.tiger.star.nsen.entity.MonitorNames._MonitorNames;
import net.tiger.star.nsen.entity.ReportLogNames._ReportLogNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link NsenUser}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/06/20 23:17:59")
public class NsenUserNames {

    /**
     * userIdのプロパティ名を返します。
     * 
     * @return userIdのプロパティ名
     */
    public static PropertyName<Long> userId() {
        return new PropertyName<Long>("userId");
    }

    /**
     * screenNameのプロパティ名を返します。
     * 
     * @return screenNameのプロパティ名
     */
    public static PropertyName<String> screenName() {
        return new PropertyName<String>("screenName");
    }

    /**
     * twitterUserIdのプロパティ名を返します。
     * 
     * @return twitterUserIdのプロパティ名
     */
    public static PropertyName<Long> twitterUserId() {
        return new PropertyName<Long>("twitterUserId");
    }

    /**
     * accessTokenのプロパティ名を返します。
     * 
     * @return accessTokenのプロパティ名
     */
    public static PropertyName<String> accessToken() {
        return new PropertyName<String>("accessToken");
    }

    /**
     * accessTokenSecretのプロパティ名を返します。
     * 
     * @return accessTokenSecretのプロパティ名
     */
    public static PropertyName<String> accessTokenSecret() {
        return new PropertyName<String>("accessTokenSecret");
    }

    /**
     * ticketのプロパティ名を返します。
     * 
     * @return ticketのプロパティ名
     */
    public static PropertyName<String> ticket() {
        return new PropertyName<String>("ticket");
    }

    /**
     * lastLoginのプロパティ名を返します。
     * 
     * @return lastLoginのプロパティ名
     */
    public static PropertyName<Timestamp> lastLogin() {
        return new PropertyName<Timestamp>("lastLogin");
    }

    /**
     * targetLimitのプロパティ名を返します。
     * 
     * @return targetLimitのプロパティ名
     */
    public static PropertyName<Short> targetLimit() {
        return new PropertyName<Short>("targetLimit");
    }

    /**
     * adminFlgのプロパティ名を返します。
     * 
     * @return adminFlgのプロパティ名
     */
    public static PropertyName<Boolean> adminFlg() {
        return new PropertyName<Boolean>("adminFlg");
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
     * monitorListのプロパティ名を返します。
     * 
     * @return monitorListのプロパティ名
     */
    public static _MonitorNames monitorList() {
        return new _MonitorNames("monitorList");
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
    public static class _NsenUserNames extends PropertyName<NsenUser> {

        /**
         * インスタンスを構築します。
         */
        public _NsenUserNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _NsenUserNames(final String name) {
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
        public _NsenUserNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * screenNameのプロパティ名を返します。
         *
         * @return screenNameのプロパティ名
         */
        public PropertyName<String> screenName() {
            return new PropertyName<String>(this, "screenName");
        }

        /**
         * twitterUserIdのプロパティ名を返します。
         *
         * @return twitterUserIdのプロパティ名
         */
        public PropertyName<Long> twitterUserId() {
            return new PropertyName<Long>(this, "twitterUserId");
        }

        /**
         * accessTokenのプロパティ名を返します。
         *
         * @return accessTokenのプロパティ名
         */
        public PropertyName<String> accessToken() {
            return new PropertyName<String>(this, "accessToken");
        }

        /**
         * accessTokenSecretのプロパティ名を返します。
         *
         * @return accessTokenSecretのプロパティ名
         */
        public PropertyName<String> accessTokenSecret() {
            return new PropertyName<String>(this, "accessTokenSecret");
        }

        /**
         * ticketのプロパティ名を返します。
         *
         * @return ticketのプロパティ名
         */
        public PropertyName<String> ticket() {
            return new PropertyName<String>(this, "ticket");
        }

        /**
         * lastLoginのプロパティ名を返します。
         *
         * @return lastLoginのプロパティ名
         */
        public PropertyName<Timestamp> lastLogin() {
            return new PropertyName<Timestamp>(this, "lastLogin");
        }

        /**
         * targetLimitのプロパティ名を返します。
         *
         * @return targetLimitのプロパティ名
         */
        public PropertyName<Short> targetLimit() {
            return new PropertyName<Short>(this, "targetLimit");
        }

        /**
         * adminFlgのプロパティ名を返します。
         *
         * @return adminFlgのプロパティ名
         */
        public PropertyName<Boolean> adminFlg() {
            return new PropertyName<Boolean>(this, "adminFlg");
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
         * monitorListのプロパティ名を返します。
         * 
         * @return monitorListのプロパティ名
         */
        public _MonitorNames monitorList() {
            return new _MonitorNames(this, "monitorList");
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