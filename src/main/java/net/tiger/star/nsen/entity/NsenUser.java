package net.tiger.star.nsen.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/06/18 12:52:54")
public class NsenUser extends AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ユーザーID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long userId;

    /** ユーザー名 */
    @Column(length = 50, nullable = false, unique = false)
    public String screenName;

    /** ツイッターユーザーID */
    @Column(precision = 10, nullable = false, unique = false)
    public Long twitterUserId;

    /** アクセストークン */
    @Column(length = 90, nullable = true, unique = false)
    public String accessToken;

    /** アクセストークン秘密鍵 */
    @Column(length = 90, nullable = true, unique = false)
    public String accessTokenSecret;

    /** ログインチケット */
    @Column(length = 64, nullable = true, unique = false)
    public String ticket;

    /** 最終ログイン時 */
    @Column(nullable = false, unique = false)
    public Timestamp lastLogin;

    /** 枠リミット */
    @Column(precision = 3, nullable = false, unique = false)
    public Short targetLimit = 10;

    /** 管理者フラグ */
    @Column(nullable = false, unique = false)
    public boolean adminFlg = false;

    /** monitorList関連プロパティ */
    @OneToMany(mappedBy = "nsenUser")
    public List<Monitor> monitorList;

    /** reportLogList関連プロパティ */
    @OneToMany(mappedBy = "nsenUser")
    public List<ReportLog> reportLogList;

}