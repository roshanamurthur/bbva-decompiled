package com.bbva.tohu.android.product.valkyria.sdk.managers.impl;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.bbva.tohu.android.product.valkyria.sdk.database.DatabaseHelper;
import com.bbva.tohu.android.product.valkyria.sdk.exceptions.NotFoundEntityException;
import com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager;
import com.bbva.tohu.android.product.valkyria.sdk.model.Bullet;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;
import com.bbva.tohu.android.product.valkyria.sdk.model.TransactionCredential;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class DatabaseManagerDefaultImpl implements DatabaseManager {
    private static final String BULLETS_QUERY = "SELECT *  FROM bullet INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference";
    private static final String SELECT_STAR = "SELECT *  FROM ";
    private static final String TOKENS_QUERY = "SELECT *  FROM token";
    private Context dbContext;
    private DatabaseHelper dbHelper;
    private SQLiteDatabase sqLiteDatabase;

    public DatabaseManagerDefaultImpl(Context context) {
        this.dbHelper = new DatabaseHelper(context);
        this.dbContext = context;
    }

    private ContentValues createContentValuesByBullet(Bullet bullet) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("bullet_id", bullet.getBulletId());
        contentValues.put("status", bullet.getStatus());
        Token token = bullet.getToken();
        contentValues.put("card_unique_reference", token == null ? null : token.getCardUniqueReference());
        contentValues.put(SqlContracts.BulletEntry.ATC, bullet.getAtc());
        contentValues.put(SqlContracts.BulletEntry.TRANSACTION_TYPE, bullet.getTransactionType());
        contentValues.put(SqlContracts.BulletEntry.UNPREDICTABLE_NUMBER, bullet.getUnpredictableNumber());
        contentValues.put("timestamp", bullet.getTimestamp());
        contentValues.put(SqlContracts.BulletEntry.KEY_LOCATOR, bullet.getKeyLocator());
        return contentValues;
    }

    private ContentValues createContentValuesByToken(Token token) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("card_unique_reference", token.getCardUniqueReference());
        contentValues.put("provider", token.getProvider());
        contentValues.put("state", token.getState());
        contentValues.put(SqlContracts.TokenEntry.SC, token.getSc());
        contentValues.put(SqlContracts.TokenEntry.DKI, token.getDki());
        contentValues.put(SqlContracts.TokenEntry.API, token.getApi());
        return contentValues;
    }

    private List<TransactionCredential> getTransactionCredentialListByCursor(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            do {
                arrayList.add(new TransactionCredential(cursor));
            } while (cursor.moveToNext());
        }
        return arrayList;
    }

    @SuppressLint({"Range"})
    private List<String> getTransactionCredentialsIdListFromCursor(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor.moveToFirst()) {
            do {
                arrayList.add(cursor.getString(cursor.getColumnIndex(SqlContracts.TransactionCredentialEntry.TRANSACTION_CREDENTIAL_ID_KEY_ID)));
            } while (cursor.moveToNext());
        }
        return arrayList;
    }

    private void getWritableDB() {
        SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
        this.sqLiteDatabase = writableDatabase;
        writableDatabase.enableWriteAheadLogging();
    }

    private void saveBulletAndTransactionCredentials(Bullet bullet, List<String> list) {
        if (bullet.getBulletId() == null) {
            bullet.setBulletId(buildRandomId(SqlContracts.BulletEntry.ID_PREFIX));
        }
        ContentValues contentValuesCreateContentValuesByBullet = createContentValuesByBullet(bullet);
        ContentValues contentValues = new ContentValues();
        this.sqLiteDatabase.insertOrThrow(SqlContracts.BulletEntry.TABLE_NAME, null, contentValuesCreateContentValuesByBullet);
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            contentValues.clear();
            contentValues.put(SqlContracts.TransactionCredentialEntry.TRANSACTION_CREDENTIAL_ID_KEY_ID, str);
            contentValues.put("bullet_id", bullet.getBulletId());
            this.sqLiteDatabase.insertOrThrow(SqlContracts.TransactionCredentialEntry.TABLE_NAME, null, contentValues);
        }
    }

    @NonNull
    public String buildRandomId(String str) {
        return str.concat(UUID.randomUUID().toString());
    }

    public void closeConnectionAndCursor(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } finally {
                this.sqLiteDatabase.close();
            }
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public long countTokens() {
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        try {
            return DatabaseUtils.queryNumEntries(readableDatabase, "token");
        } finally {
            this.sqLiteDatabase.close();
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void deleteAll() {
        getWritableDB();
        this.sqLiteDatabase.beginTransaction();
        try {
            this.sqLiteDatabase.delete(SqlContracts.TransactionCredentialEntry.TABLE_NAME, null, null);
            this.sqLiteDatabase.delete(SqlContracts.BulletEntry.TABLE_NAME, null, null);
            this.sqLiteDatabase.delete("token", null, null);
            this.sqLiteDatabase.setTransactionSuccessful();
            this.sqLiteDatabase.endTransaction();
            this.sqLiteDatabase.close();
        } catch (Throwable th2) {
            this.sqLiteDatabase.endTransaction();
            this.sqLiteDatabase.close();
            throw th2;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void deleteBulletAndTransactionCredentialsByBulletId(String str) {
        getWritableDB();
        this.sqLiteDatabase.beginTransaction();
        try {
            int iDelete = this.sqLiteDatabase.delete(SqlContracts.BulletEntry.TABLE_NAME, "bullet_id =? ", new String[]{str});
            int iDelete2 = this.sqLiteDatabase.delete(SqlContracts.TransactionCredentialEntry.TABLE_NAME, "bullet_id =? ", new String[]{str});
            if (iDelete > 0 || iDelete2 > 0) {
                this.sqLiteDatabase.setTransactionSuccessful();
            }
            this.sqLiteDatabase.endTransaction();
            this.sqLiteDatabase.close();
        } catch (Throwable th2) {
            this.sqLiteDatabase.endTransaction();
            this.sqLiteDatabase.close();
            throw th2;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void deleteBulletsByCardUniqueReference(String str) {
        getWritableDB();
        try {
            this.sqLiteDatabase.delete(SqlContracts.BulletEntry.TABLE_NAME, "card_unique_reference =? ", new String[]{str});
            this.sqLiteDatabase.close();
        } catch (Throwable th2) {
            this.sqLiteDatabase.close();
            throw th2;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void deleteTokenByCardUniqueReference(String str) {
        getWritableDB();
        try {
            this.sqLiteDatabase.delete("token", "card_unique_reference =? ", new String[]{str});
            this.sqLiteDatabase.close();
        } catch (Throwable th2) {
            this.sqLiteDatabase.close();
            throw th2;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<String> deleteTransactionCredentialsAndBulletsByCardUniqRef(String str) throws SQLException {
        List<String> transactionCredentialsIdListFromCursor;
        Cursor cursorRawQuery = null;
        try {
            try {
                getWritableDB();
                this.sqLiteDatabase.beginTransaction();
                cursorRawQuery = this.sqLiteDatabase.rawQuery(" SELECT *  FROM transaction_credential WHERE bullet_id IN(SELECT bullet_id FROM bullet WHERE card_unique_reference = ? )", new String[]{str});
                transactionCredentialsIdListFromCursor = getTransactionCredentialsIdListFromCursor(cursorRawQuery);
                if (!transactionCredentialsIdListFromCursor.isEmpty()) {
                    this.sqLiteDatabase.delete(SqlContracts.TransactionCredentialEntry.TABLE_NAME, "bullet_id IN(SELECT bullet_id FROM bullet WHERE card_unique_reference = ? )", new String[]{str});
                }
                this.sqLiteDatabase.delete(SqlContracts.BulletEntry.TABLE_NAME, "card_unique_reference =? ", new String[]{str});
                this.sqLiteDatabase.setTransactionSuccessful();
                this.sqLiteDatabase.endTransaction();
                closeConnectionAndCursor(cursorRawQuery);
            } catch (Exception e5) {
                throw new SQLException("Failed delete bullet and transaction credendential", e5);
            }
        } catch (Throwable th2) {
            this.sqLiteDatabase.endTransaction();
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return transactionCredentialsIdListFromCursor;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<String> deleteTransactionCredentialsByCardUniqueReference(String str) {
        List<String> transactionCredentialsIdListFromCursor;
        getWritableDB();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.sqLiteDatabase.rawQuery("SELECT * FROM transaction_credential WHERE bullet_id  IN(SELECT bullet_id FROM bullet WHERE card_unique_reference = ? )", new String[]{str});
            transactionCredentialsIdListFromCursor = getTransactionCredentialsIdListFromCursor(cursorRawQuery);
            if (!transactionCredentialsIdListFromCursor.isEmpty()) {
                this.sqLiteDatabase.delete(SqlContracts.TransactionCredentialEntry.TABLE_NAME, "bullet_id  IN(SELECT bullet_id FROM bullet WHERE card_unique_reference = ? )", new String[]{str});
            }
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return transactionCredentialsIdListFromCursor;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized boolean existUsableBulletsByCardUniqueReference(String str) {
        return !getUsableBulletsByCardUniqueReference(str).isEmpty();
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized Token getActiveTokenByCardUniqueReference(String str) throws NotFoundEntityException {
        Token token;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        try {
            Cursor cursorQuery = readableDatabase.query("token", null, "card_unique_reference =?  AND state =? ", new String[]{str, "ACTIVE"}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                throw new NotFoundEntityException();
            }
            token = new Token(cursorQuery);
            closeConnectionAndCursor(cursorQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(null);
            throw th2;
        }
        return token;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<TransactionCredential> getAllTransactionCredentials() {
        List<TransactionCredential> transactionCredentialListByCursor;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = readableDatabase.rawQuery("SELECT *  FROM transaction_credential INNER JOIN bullet ON transaction_credential.bullet_id = bullet.bullet_id INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference", null);
            transactionCredentialListByCursor = getTransactionCredentialListByCursor(cursorRawQuery);
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return transactionCredentialListByCursor;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized Bullet getBulletByCardUniqueReferenceAndAtc(String str, String str2) throws NotFoundEntityException {
        Bullet bullet;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        try {
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM bullet INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference WHERE bullet.card_unique_reference =?  AND atc =? ", new String[]{str, str2});
            if (!cursorRawQuery.moveToFirst()) {
                throw new NotFoundEntityException();
            }
            bullet = new Bullet(cursorRawQuery);
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(null);
            throw th2;
        }
        return bullet;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public List<Bullet> getBullets() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = readableDatabase.rawQuery(BULLETS_QUERY, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(new Bullet(cursorRawQuery));
                } while (cursorRawQuery.moveToNext());
            }
            return arrayList;
        } finally {
            closeConnectionAndCursor(cursorRawQuery);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<Bullet> getBulletsByCardUniqueReference(String str) {
        ArrayList arrayList;
        this.sqLiteDatabase = this.dbHelper.getReadableDatabase();
        arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.sqLiteDatabase.rawQuery("SELECT * FROM bullet INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference WHERE bullet.card_unique_reference =?  ORDER BY bullet.atc ASC", new String[]{str});
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(new Bullet(cursorRawQuery));
                } while (cursorRawQuery.moveToNext());
            }
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return arrayList;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized Bullet getInactiveBulletByCardUniqueReference(String str) throws NotFoundEntityException {
        Bullet bullet;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        try {
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM bullet INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference WHERE bullet.card_unique_reference =? AND  status =? ", new String[]{str, "INACTIVE"});
            if (!cursorRawQuery.moveToFirst()) {
                throw new NotFoundEntityException();
            }
            bullet = new Bullet(cursorRawQuery);
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(null);
            throw th2;
        }
        return bullet;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized Token getTokenByCardUniqueReference(String str) throws NotFoundEntityException {
        Token token;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        try {
            Cursor cursorQuery = readableDatabase.query("token", null, "card_unique_reference =? ", new String[]{str}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                throw new NotFoundEntityException();
            }
            token = new Token(cursorQuery);
            closeConnectionAndCursor(cursorQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(null);
            throw th2;
        }
        return token;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public List<Token> getTokens() {
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = readableDatabase.rawQuery(TOKENS_QUERY, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(new Token(cursorRawQuery));
                } while (cursorRawQuery.moveToNext());
            }
            return arrayList;
        } finally {
            closeConnectionAndCursor(cursorRawQuery);
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<TransactionCredential> getTransactionCredentials(String str) {
        List<TransactionCredential> transactionCredentialListByCursor;
        this.sqLiteDatabase = this.dbHelper.getReadableDatabase();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.sqLiteDatabase.rawQuery("SELECT *  FROM transaction_credential INNER JOIN bullet ON transaction_credential.bullet_id = bullet.bullet_id AND transaction_credential.bullet_id IN (" + str + ") INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference", null);
            transactionCredentialListByCursor = getTransactionCredentialListByCursor(cursorRawQuery);
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return transactionCredentialListByCursor;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<TransactionCredential> getTransactionCredentialsByBulletId(String str) {
        List<TransactionCredential> transactionCredentialListByCursor;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = readableDatabase.rawQuery("SELECT *  FROM transaction_credential INNER JOIN bullet ON transaction_credential.bullet_id = bullet.bullet_id INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference WHERE transaction_credential.bullet_id =? ", new String[]{str});
            transactionCredentialListByCursor = getTransactionCredentialListByCursor(cursorRawQuery);
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return transactionCredentialListByCursor;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<TransactionCredential> getTransactionCredentialsByCardUniqueReference(String str) {
        List<TransactionCredential> transactionCredentialListByCursor;
        SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
        this.sqLiteDatabase = readableDatabase;
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = readableDatabase.rawQuery("SELECT *  FROM transaction_credential INNER JOIN bullet ON transaction_credential.bullet_id = bullet.bullet_id INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference WHERE token.card_unique_reference =? ", new String[]{str});
            transactionCredentialListByCursor = getTransactionCredentialListByCursor(cursorRawQuery);
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return transactionCredentialListByCursor;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<Bullet> getUsableBulletsByCardUniqueReference(String str) {
        ArrayList arrayList;
        this.sqLiteDatabase = this.dbHelper.getReadableDatabase();
        arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.sqLiteDatabase.rawQuery("SELECT * FROM bullet INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference WHERE bullet.card_unique_reference =?  AND status =?  ORDER BY bullet.atc ASC", new String[]{str, "ACTIVE"});
            if (cursorRawQuery.moveToFirst()) {
                do {
                    Bullet bullet = new Bullet(cursorRawQuery);
                    if (bullet.isUsable(this.dbContext)) {
                        arrayList.add(bullet);
                    }
                } while (cursorRawQuery.moveToNext());
            }
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return arrayList;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void saveBulletsAndTransactionCredentials(Map<Bullet, List<String>> map) {
        try {
            getWritableDB();
            this.sqLiteDatabase.beginTransaction();
            ArrayList arrayList = new ArrayList(map.entrySet());
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Map.Entry entry = (Map.Entry) arrayList.get(i10);
                saveBulletAndTransactionCredentials((Bullet) entry.getKey(), (List) entry.getValue());
            }
            this.sqLiteDatabase.setTransactionSuccessful();
            this.sqLiteDatabase.endTransaction();
            this.sqLiteDatabase.close();
        } catch (Throwable th2) {
            this.sqLiteDatabase.endTransaction();
            this.sqLiteDatabase.close();
            throw th2;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void saveToken(Token token) {
        getWritableDB();
        try {
            this.sqLiteDatabase.insert("token", null, createContentValuesByToken(token));
            this.sqLiteDatabase.close();
        } catch (Throwable th2) {
            this.sqLiteDatabase.close();
            throw th2;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void updateBullet(Bullet bullet) throws NotFoundEntityException {
        try {
            getWritableDB();
            try {
                int iUpdate = this.sqLiteDatabase.update(SqlContracts.BulletEntry.TABLE_NAME, createContentValuesByBullet(bullet), "bullet_id =? ", new String[]{bullet.getBulletId()});
                this.sqLiteDatabase.close();
                if (iUpdate == 0) {
                    throw new NotFoundEntityException();
                }
            } catch (Throwable th2) {
                this.sqLiteDatabase.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized int updateBullets(List<Bullet> list) {
        if (list == null) {
            return 0;
        }
        getWritableDB();
        this.sqLiteDatabase.beginTransaction();
        int iUpdate = 0;
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                Bullet bullet = list.get(i10);
                iUpdate += this.sqLiteDatabase.update(SqlContracts.BulletEntry.TABLE_NAME, createContentValuesByBullet(bullet), "bullet_id =? ", new String[]{bullet.getBulletId()});
            } catch (Throwable th2) {
                this.sqLiteDatabase.endTransaction();
                this.sqLiteDatabase.close();
                throw th2;
            }
        }
        this.sqLiteDatabase.setTransactionSuccessful();
        this.sqLiteDatabase.endTransaction();
        this.sqLiteDatabase.close();
        return iUpdate;
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized void updateToken(Token token) throws NotFoundEntityException {
        getWritableDB();
        try {
            if (this.sqLiteDatabase.update("token", createContentValuesByToken(token), "card_unique_reference =? ", new String[]{token.getCardUniqueReference()}) == 0) {
                throw new NotFoundEntityException();
            }
            this.sqLiteDatabase.close();
        } catch (Throwable th2) {
            this.sqLiteDatabase.close();
            throw th2;
        }
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.managers.DatabaseManager
    public synchronized List<Bullet> getBulletsByCardUniqueReference(String str, Integer num) {
        ArrayList arrayList;
        this.sqLiteDatabase = this.dbHelper.getReadableDatabase();
        arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            cursorRawQuery = this.sqLiteDatabase.rawQuery("SELECT * FROM bullet INNER JOIN token ON bullet.card_unique_reference = token.card_unique_reference WHERE bullet.card_unique_reference =?  ORDER BY bullet.timestamp DESC LIMIT " + num, new String[]{str});
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(new Bullet(cursorRawQuery));
                } while (cursorRawQuery.moveToNext());
            }
            closeConnectionAndCursor(cursorRawQuery);
        } catch (Throwable th2) {
            closeConnectionAndCursor(cursorRawQuery);
            throw th2;
        }
        return arrayList;
    }
}
