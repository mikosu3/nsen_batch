package net.tiger.star.nsen.entity;

import java.io.Serializable;

import javax.annotation.Generated;
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
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/06/18 12:52:54")
public class Monitor extends AbstractBaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    /** モニターID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Long monitorId;

    /** NsenユーザーID */
    @Column(precision = 10, nullable = false, unique = false)
    public Long userId;

    /** 動画 */
    @Column(length = 20, nullable = false, unique = false)
    public String video;

    /** nsenUser関連プロパティ */
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    public NsenUser nsenUser;

}