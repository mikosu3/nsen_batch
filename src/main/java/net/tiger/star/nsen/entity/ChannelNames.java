package net.tiger.star.nsen.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import net.tiger.star.nsen.entity.ChannelLogNames._ChannelLogNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Channel}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/06/20 23:17:58")
public class ChannelNames {

    /**
     * channelIdのプロパティ名を返します。
     * 
     * @return channelIdのプロパティ名
     */
    public static PropertyName<Long> channelId() {
        return new PropertyName<Long>("channelId");
    }

    /**
     * channelNameのプロパティ名を返します。
     * 
     * @return channelNameのプロパティ名
     */
    public static PropertyName<String> channelName() {
        return new PropertyName<String>("channelName");
    }

    /**
     * livelUrlのプロパティ名を返します。
     * 
     * @return livelUrlのプロパティ名
     */
    public static PropertyName<String> livelUrl() {
        return new PropertyName<String>("livelUrl");
    }

    /**
     * channelUrlのプロパティ名を返します。
     * 
     * @return channelUrlのプロパティ名
     */
    public static PropertyName<String> channelUrl() {
        return new PropertyName<String>("channelUrl");
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
     * channelLogListのプロパティ名を返します。
     * 
     * @return channelLogListのプロパティ名
     */
    public static _ChannelLogNames channelLogList() {
        return new _ChannelLogNames("channelLogList");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _ChannelNames extends PropertyName<Channel> {

        /**
         * インスタンスを構築します。
         */
        public _ChannelNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _ChannelNames(final String name) {
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
        public _ChannelNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
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
         * channelNameのプロパティ名を返します。
         *
         * @return channelNameのプロパティ名
         */
        public PropertyName<String> channelName() {
            return new PropertyName<String>(this, "channelName");
        }

        /**
         * livelUrlのプロパティ名を返します。
         *
         * @return livelUrlのプロパティ名
         */
        public PropertyName<String> livelUrl() {
            return new PropertyName<String>(this, "livelUrl");
        }

        /**
         * channelUrlのプロパティ名を返します。
         *
         * @return channelUrlのプロパティ名
         */
        public PropertyName<String> channelUrl() {
            return new PropertyName<String>(this, "channelUrl");
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
         * channelLogListのプロパティ名を返します。
         * 
         * @return channelLogListのプロパティ名
         */
        public _ChannelLogNames channelLogList() {
            return new _ChannelLogNames(this, "channelLogList");
        }
    }
}