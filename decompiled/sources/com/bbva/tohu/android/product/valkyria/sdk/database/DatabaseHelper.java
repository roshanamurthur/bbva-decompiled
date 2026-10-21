package com.bbva.tohu.android.product.valkyria.sdk.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.collection.k;
import com.bbva.tohu.android.core.utils.LogTohu;

/* JADX INFO: loaded from: classes6.dex */
public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String CREATE_TABLE_BULLETS = "CREATE TABLE IF NOT EXISTS bullet(bullet_id TEXT PRIMARY KEY,status TEXT,card_unique_reference TEXT,atc INTEGER,transaction_type TEXT,unpredictable_number TEXT,timestamp TEXT,key_locator TEXT,FOREIGN KEY (card_unique_reference) REFERENCES token(card_unique_reference));";
    private static final String CREATE_TABLE_TOKEN = "CREATE TABLE IF NOT EXISTS token(card_unique_reference TEXT PRIMARY KEY,provider TEXT NOT NULL,state TEXT,sc INTEGER,dki TEXT,api TEXT);";
    private static final String CREATE_TABLE_TRANSACTION_CREDENTIAL = "CREATE TABLE IF NOT EXISTS transaction_credential(transaction_credential_id TEXT PRIMARY KEY,bullet_id INTEGER, FOREIGN KEY (bullet_id) REFERENCES bullet( bullet_id ));";
    private static final int DATABASE_VERSION = 1;
    private static final String DATA_BASE_NAME = "Tohu";
    private static final String TAG = "DatabaseHelper";

    public DatabaseHelper(Context context) {
        super(context, DATA_BASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        LogTohu.w(TAG, "On Create database : Tohu", new Object[0]);
        sQLiteDatabase.execSQL(CREATE_TABLE_TOKEN);
        sQLiteDatabase.execSQL(CREATE_TABLE_BULLETS);
        sQLiteDatabase.execSQL(CREATE_TABLE_TRANSACTION_CREDENTIAL);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        onUpgrade(sQLiteDatabase, i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        LogTohu.w(TAG, k.c("Upgrading database from version ", i10, " to ", i11, " ."), new Object[0]);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS bullet");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS token");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS transaction_credential");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS issuer_token");
        onCreate(sQLiteDatabase);
    }
}
