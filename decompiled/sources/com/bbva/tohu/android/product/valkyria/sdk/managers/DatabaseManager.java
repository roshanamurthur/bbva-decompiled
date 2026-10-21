package com.bbva.tohu.android.product.valkyria.sdk.managers;

import android.database.SQLException;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.model.TransactionCredential;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public interface DatabaseManager {
    long countTokens();

    void deleteAll();

    void deleteBulletAndTransactionCredentialsByBulletId(String str);

    void deleteBulletsByCardUniqueReference(String str);

    void deleteTokenByCardUniqueReference(String str);

    List<String> deleteTransactionCredentialsAndBulletsByCardUniqRef(String str) throws SQLException;

    List<String> deleteTransactionCredentialsByCardUniqueReference(String str);

    boolean existUsableBulletsByCardUniqueReference(String str);

    Token getActiveTokenByCardUniqueReference(String str) throws NotFoundEntityException;

    List<TransactionCredential> getAllTransactionCredentials();

    Bullet getBulletByCardUniqueReferenceAndAtc(String str, String str2) throws NotFoundEntityException;

    List<Bullet> getBullets();

    List<Bullet> getBulletsByCardUniqueReference(String str);

    List<Bullet> getBulletsByCardUniqueReference(String str, Integer num);

    Bullet getInactiveBulletByCardUniqueReference(String str) throws NotFoundEntityException;

    Token getTokenByCardUniqueReference(String str) throws NotFoundEntityException;

    List<Token> getTokens();

    List<TransactionCredential> getTransactionCredentials(String str);

    List<TransactionCredential> getTransactionCredentialsByBulletId(String str);

    List<TransactionCredential> getTransactionCredentialsByCardUniqueReference(String str);

    List<Bullet> getUsableBulletsByCardUniqueReference(String str);

    void saveBulletsAndTransactionCredentials(Map<Bullet, List<String>> map);

    void saveToken(Token token);

    void updateBullet(Bullet bullet) throws NotFoundEntityException;

    int updateBullets(List<Bullet> list);

    void updateToken(Token token) throws NotFoundEntityException;
}
