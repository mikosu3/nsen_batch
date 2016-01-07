package net.tiger.star.nsen.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
*
*
*/
@Entity
public class ReportLog extends AbstractBaseEntity {

    /** レポートログID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long reportLogId;

    /** チャンネルログID */
    @Column(precision = 10, nullable = false, unique = false)
    public Long channelLogId;

    /** NsenユーザーID */
    @Column(precision = 10, nullable = false, unique = false)
    public Long userId;

    /** channelLog関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "channel_log_id", referencedColumnName = "channel_log_id")
    public ChannelLog channelLog;

    /** nsenUser関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    public NsenUser nsenUser;
}
