package net.tiger.star.nsen.service;

import static net.tiger.star.nsen.entity.NsenUserNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import net.tiger.star.nsen.entity.NsenUser;

/**
 * {@link NsenUser}のサービスクラスです。
 *
 */
@Generated(value = {"S2JDBC-Gen 2.4.45", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/06/18 13:20:34")
public class NsenUserService extends AbstractService<NsenUser> {

    /**
     * 識別子でエンティティを検索します。
     *
     * @param userId
     *            識別子
     * @return エンティティ
     */
    public NsenUser findById(Long userId) {
        return select().id(userId).getSingleResult();
    }

    /**
     * 識別子とバージョン番号でエンティティを検索します。
     *
     * @param userId
     *            識別子
     * @param version
     *            バージョン番号
     * @return エンティティ
     */
    public NsenUser findByIdVersion(Long userId, Long version) {
        return select().id(userId).version(version).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     *
     * @return エンティティのリスト
     */
    public List<NsenUser> findAllOrderById() {
        return select().orderBy(asc(userId())).getResultList();
    }

    /**
     * アクセストークンが生きているアクティブユーザーかどうか
     * @param userId
     * @return
     */
    public boolean isActiveUser(Long userId) {
        return select().where(eq(userId(), userId), isNotNull(accessToken()), isNotNull(accessTokenSecret())).getSingleResult() != null;
    }

    /**
     * チケット情報をクリアする
     * @param userId
     */
    public void clearTicket(Long userId) {
        // チケットクリア
        NsenUser entity = findById(userId);
        entity.ticket = "";
        update(entity);
    }

    /**
     * アクセストークンをクリアする
     * @param userId
     */
    public void clearToken(Long userId) {
        // トークンクリア
        NsenUser entity = findById(userId);
        entity.accessToken = null;
        entity.accessTokenSecret = null;
        update(entity);
    }

    /**
     * ツイッターIDから情報取得
     * @param id
     * @return
     */
    public NsenUser findByTwitterId(Long id) {
        return select().where(eq(twitterUserId(), id)).getSingleResult();
    }

    /**
     * scrennNameで取得
     * @param scrennName
     * @return
     */
    public NsenUser findByScreenName(String name) {
        return select().where(eq(screenName(), name)).getSingleResult();
    }

    /**
     * ツイッターIDから情報取得
     * @param id
     * @return
     */
    public NsenUser findByTwitterId(long id) {
        return select().where(eq(twitterUserId(), id)).getSingleResult();
    }

    /**
     * チケットからユーザー情報を取得する
     * @param ticket
     * @return
     */
    public NsenUser findByTicket(String ticket) {
        try {
            return select().where(eq(ticket(), ticket)).getSingleResult();
        } catch(Exception e) {
            return null;
        }
    }
}