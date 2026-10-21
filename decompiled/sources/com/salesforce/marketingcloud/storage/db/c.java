package com.salesforce.marketingcloud.storage.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
class c {
    private c() {
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.ENGLISH, str, objArr);
    }

    public static boolean a(SQLiteDatabase sQLiteDatabase, String str, String str2) {
        boolean z10 = false;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery(String.format(Locale.ENGLISH, "SELECT EXISTS(SELECT 1 FROM sqlite_master WHERE type='%s' and name='%s')", str, str2), null);
        if (cursorRawQuery.moveToFirst() && cursorRawQuery.getInt(0) == 0) {
            z10 = true;
        }
        cursorRawQuery.close();
        return z10;
    }
}
