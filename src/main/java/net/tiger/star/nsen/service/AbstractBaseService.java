package net.tiger.star.nsen.service;

import java.sql.Timestamp;

import javax.annotation.Generated;

import net.tiger.star.nsen.entity.AbstractBaseEntity;

import org.seasar.extension.jdbc.service.S2AbstractService;

/**
 * サービスの抽象クラスです。
 *
 * @param <ENTITY>
 *            エンティティの型
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.AbstServiceModelFactoryImpl"}, date = "2013/04/05 16:56:14")
public abstract class AbstractBaseService<ENTITY extends AbstractBaseEntity> extends S2AbstractService<ENTITY> {

    /** ユーザー名取得 */
    public abstract String getUserName();

    /**
     * テーブル共通のフッター情報をセットする
     * 更新日時 更新者ID
     */
    protected void setUpdateFootterData(ENTITY entity) {
        entity.updateAt = new Timestamp(System.currentTimeMillis());
        try {
            entity.updateUser = getUserName();
        } catch (Exception e) {
        }
    }

    /**
     * テーブル共通のフッター情報をセットする
     * 登録日時 登録者ID
     */
    protected void setRegistFootterData(ENTITY entity) {
        Timestamp now = new Timestamp(System.currentTimeMillis());
        entity.createAt = now;
        entity.updateAt = now;

        try {
            entity.createUser = getUserName();
            entity.updateUser = getUserName();
        } catch (Exception e) {
        }
    }

}