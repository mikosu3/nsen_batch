package net.tiger.star.nsen.entity;

import java.io.Serializable;
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
public class Channel extends AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** チャンネルID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long channelId;

    /** チャンネル名 */
    @Column(length = 20, nullable = false, unique = false)
    public String channelName;

    /** ライブURL */
    @Column(length = 100, nullable = false, unique = false)
    public String livelUrl;

    /** チャンネルURL */
    @Column(length = 100, nullable = false, unique = false)
    public String channelUrl;

    /** アクセストークン */
    @Column(length = 90, nullable = false, unique = false)
    public String accessToken;

    /** アクセストークン秘密鍵 */
    @Column(length = 90, nullable = false, unique = false)
    public String accessTokenSecret;

    /** channelLogList関連プロパティ */
    @OneToMany(mappedBy = "channel")
    public List<ChannelLog> channelLogList;
}