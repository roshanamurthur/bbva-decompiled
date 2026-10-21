package com.salesforce.marketingcloud.storage.db.upgrades;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f65072a = com.salesforce.marketingcloud.g.a("Version6ToVersion7");

    private static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("ALTER TABLE registration ADD COLUMN signed_string VARCHAR DEFAULT NULL");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e5) {
                try {
                    com.salesforce.marketingcloud.g.b(f65072a, e5, "Unable to update registration table", new Object[0]);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS registration");
                    sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, proximity_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, signed_string VARCHAR, locale VARCHAR );");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e7) {
                    com.salesforce.marketingcloud.g.b(f65072a, e7, "Unable to create registration table", new Object[0]);
                }
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void b(@NonNull SQLiteDatabase sQLiteDatabase) {
        a(sQLiteDatabase);
    }
}
