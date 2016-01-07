package net.tiger.star.nsen.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

/**
 * 基底エンティティクラス
 * 登録日時 登録者ID 更新日時 更新者IDをもつ
 *
 * @author mikosu3
 */
@MappedSuperclass
public abstract class AbstractBaseEntity {
    /** registDateプロパティ */
    @Column(columnDefinition="datetime")
    public Timestamp createAt;

    @Column(length = 25, nullable = true, unique = false)
    public String createUser;

    /** updateDateプロパティ */
    @Column(columnDefinition="datetime")
    public Timestamp updateAt;

    @Column(length = 25, nullable = true, unique = false)
    public String updateUser;

    /** versionプロパティ */
    @Version
    public Long version = 0L;
}
