package com.salesforce.marketingcloud.storage.db.upgrades;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"Range"})
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f65073a = com.salesforce.marketingcloud.g.a("Version7ToVersion8");

    private h() {
    }

    public static void a(@NonNull SQLiteDatabase sQLiteDatabase) {
        boolean z10;
        int i10;
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT id,read,message_deleted FROM cloud_page_messages WHERE message_type=1", null);
            if (cursorRawQuery != null) {
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        z10 = true;
                        try {
                            if (cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("message_deleted")) == 1) {
                                i10 = 2;
                            } else {
                                i10 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("read")) == 1 ? 1 : -1;
                            }
                            if (i10 != -1) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("id", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("id")));
                                contentValues.put("status", Integer.valueOf(i10));
                                sQLiteDatabase.insert("inbox_message_status", null, contentValues);
                            }
                        } catch (Exception e5) {
                            e = e5;
                            com.salesforce.marketingcloud.g.b(f65073a, e, "Unable to set inbox message statuses for legacy messages", new Object[0]);
                        }
                    } while (cursorRawQuery.moveToNext());
                } else {
                    z10 = false;
                }
                cursorRawQuery.close();
                if (z10) {
                    try {
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("message_type", (Integer) 8);
                        sQLiteDatabase.update("cloud_page_messages", contentValues2, null, null);
                    } catch (Exception e7) {
                        com.salesforce.marketingcloud.g.b(f65073a, e7, "Unable to update message_type for legacy Inbox messages.  Attempting to delete them.", new Object[0]);
                        try {
                            sQLiteDatabase.execSQL("DELETE FROM cloud_page_messages WHERE message_type=1", null);
                        } catch (Exception e10) {
                            com.salesforce.marketingcloud.g.b(f65073a, e10, "Unable to delete legacy Inbox messages.", new Object[0]);
                        }
                    }
                }
            }
        } catch (Exception e11) {
            e = e11;
            z10 = false;
        }
        try {
            sQLiteDatabase.execSQL("DELETE FROM cloud_page_messages WHERE message_type=1", null);
        } catch (Exception e12) {
            com.salesforce.marketingcloud.g.b(f65073a, e12, "Final attempt to delete legacy Inbox messages failed.", new Object[0]);
        }
    }
}
