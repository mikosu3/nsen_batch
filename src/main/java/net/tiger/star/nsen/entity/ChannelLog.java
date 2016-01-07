package net.tiger.star.nsen.entity;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 *
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/06/18 12:52:54")
public class ChannelLog extends AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** チャンネルログID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long channelLogId;

    /** チャンネルID */
    @Column(precision = 10, nullable = false, unique = false)
    public Long channelId;

    /** 動画 */
    @Column(length = 20, nullable = false, unique = false)
    public String video;

    /** channel関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "channel_id", referencedColumnName = "channel_id")
    public Channel channel;

    /** reportLogList関連プロパティ */
    @OneToMany(mappedBy = "channelLog")
    public List<ReportLog> reportLogList;

}