package net.tiger.star.nsen.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import net.tiger.star.nsen.entity.NsenUserNames._NsenUserNames;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Monitor}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/06/20 23:17:58")
public class MonitorNames {

    /**
     * monitorIdのプロパティ名を返します。
     * 
     * @return monitorIdのプロパティ名
     */
    public static PropertyName<Long> monitorId() {
        return new PropertyName<Long>("monitorId");
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
    public static class _MonitorNames extends PropertyName<Monitor> {

        /**
         * インスタンスを構築します。
         */
        public _MonitorNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MonitorNames(final String name) {
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
        public _MonitorNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * monitorIdのプロパティ名を返します。
         *
         * @return monitorIdのプロパティ名
         */
        public PropertyName<Long> monitorId() {
            return new PropertyName<Long>(this, "monitorId");
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
         * nsenUserのプロパティ名を返します。
         * 
         * @return nsenUserのプロパティ名
         */
        public _NsenUserNames nsenUser() {
            return new _NsenUserNames(this, "nsenUser");
        }
    }
}