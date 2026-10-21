package com.salesforce.marketingcloud.storage.db.upgrades;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import org.json.JSONException;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f65068a = com.salesforce.marketingcloud.g.a("Version2ToVersion3");

    private c() {
    }

    public static int a(@NonNull Cursor cursor) throws JSONException, NumberFormatException, NullPointerException {
        String string = cursor.getString(cursor.getColumnIndex("analytic_types"));
        if (string.contains(",")) {
            return string.contains("4") ? 5 : 2;
        }
        return Integer.parseInt(string.replaceAll("\\[", "").replaceAll("\\]", "").trim());
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE analytic_item_temp (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_types VARCHAR, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR)");
                sQLiteDatabase.execSQL("INSERT INTO analytic_item_temp SELECT id,event_date,analytic_product_type,analytic_types,value,ready_to_send,object_ids,json_payload FROM analytic_item");
                sQLiteDatabase.execSQL("DROP TABLE analytic_item");
                sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR)");
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM analytic_item_temp", null);
                if (cursorRawQuery != null) {
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            ContentValues contentValues = new ContentValues();
                            try {
                                contentValues.put("id", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("id"))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64967c, cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64967c)));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64973i, Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64973i))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64968d, Integer.valueOf(a(cursorRawQuery)));
                                contentValues.put("value", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("value"))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64970f, Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64970f))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64969e, cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64969e)));
                                contentValues.put("json_payload", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("json_payload")));
                                sQLiteDatabase.insert(com.salesforce.marketingcloud.storage.db.a.f64960e, null, contentValues);
                            } catch (Exception e5) {
                                com.salesforce.marketingcloud.g.b(f65068a, e5, "Failed to update item in Analytics local storage during upgrade.", new Object[0]);
                            }
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                }
                sQLiteDatabase.execSQL("DROP TABLE analytic_item_temp");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e7) {
                com.salesforce.marketingcloud.g.b(f65068a, e7, "Failed to upgrade Analytics local storage.  Starting fresh.  Some analytics items may have been lost.", new Object[0]);
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR)");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e10) {
                    com.salesforce.marketingcloud.g.b(f65068a, e10, "Failed to create local storage for Analytics.", new Object[0]);
                }
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static void c(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                ContentValues contentValues = new ContentValues(1);
                contentValues.put("message_type", (Integer) 8);
                sQLiteDatabase.update("cloud_page_messages", contentValues, null, null);
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.e(f65068a, e5, "Failed to convert CloudPageMessage to an InboxMessage.", new Object[0]);
                try {
                    sQLiteDatabase.execSQL("DELETE FROM cloud_page_messages WHERE content_type=2 AND message_type=1;");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Exception e7) {
                    com.salesforce.marketingcloud.g.b(f65068a, e7, "Failed to remove legacy CloudPage data.", new Object[0]);
                }
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        int i10;
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE inbox_message_status (id VARCHAR PRIMARY KEY, status INTEGER);");
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM cloud_page_messages", null);
                if (cursorRawQuery != null) {
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            boolean z10 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("message_deleted")) == 1;
                            boolean z11 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("read")) == 1;
                            String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("id"));
                            if (z10) {
                                i10 = 2;
                            } else {
                                i10 = z11 ? 1 : 0;
                            }
                            ContentValues contentValues = new ContentValues();
                            if (i10 > 0) {
                                try {
                                    contentValues.put("id", string);
                                    contentValues.put("status", Integer.valueOf(i10));
                                    sQLiteDatabase.insert("inbox_message_status", null, contentValues);
                                } catch (Exception e5) {
                                    com.salesforce.marketingcloud.g.e(f65068a, e5, "Failed to add message %s to inbox_message_status table.", string);
                                }
                            }
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e7) {
                com.salesforce.marketingcloud.g.b(f65068a, e7, "Failed to update inbox_message_status table.", new Object[0]);
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS inbox_message_status;");
                    sQLiteDatabase.execSQL("CREATE TABLE inbox_message_status (id VARCHAR PRIMARY KEY, status INTEGER);");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (Exception e10) {
                    com.salesforce.marketingcloud.g.b(f65068a, e10, "Failed to create inbox_message_status table.", new Object[0]);
                }
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static void e(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE reg_temp (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR );");
                sQLiteDatabase.execSQL("INSERT INTO reg_temp SELECT id,platform,subscriber_key,et_app_id,timezone,dst,tags,attributes,platform_version,push_enabled,location_enabled,hwid,system_token,device_id,app_version,sdk_version,locale FROM registration");
                sQLiteDatabase.execSQL("DROP TABLE registration");
                sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR );");
                sQLiteDatabase.execSQL("INSERT INTO registration SELECT id,platform,subscriber_key,et_app_id,timezone,dst,tags,attributes,platform_version,push_enabled,location_enabled,hwid,system_token,device_id,app_version,sdk_version,locale FROM reg_temp");
                sQLiteDatabase.execSQL("DROP TABLE reg_temp");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e5) {
                com.salesforce.marketingcloud.g.b(f65068a, e5, "Failed to upgrade Registration local storage.  Starting fresh.  Attributes, Tags and ContactKey will be lost.", new Object[0]);
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE registration (id INTEGER PRIMARY KEY AUTOINCREMENT, platform VARCHAR, subscriber_key VARCHAR, et_app_id VARCHAR, timezone INTEGER, dst SMALLINT, tags VARCHAR, attributes VARCHAR, platform_version VARCHAR, push_enabled SMALLINT, location_enabled SMALLINT, hwid VARCHAR, system_token VARCHAR, device_id VARCHAR, app_version VARCHAR, sdk_version VARCHAR, locale VARCHAR );");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e7) {
                    com.salesforce.marketingcloud.g.b(f65068a, e7, "Failed to create local storage for Registration.", new Object[0]);
                }
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void f(@NonNull SQLiteDatabase sQLiteDatabase) {
        b(sQLiteDatabase);
        e(sQLiteDatabase);
        d(sQLiteDatabase);
        c(sQLiteDatabase);
        a(sQLiteDatabase);
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN message_hash VARCHAR;");
                sQLiteDatabase.execSQL("ALTER TABLE cloud_page_messages ADD COLUMN request_id VARCHAR;");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e5) {
                com.salesforce.marketingcloud.g.b(f65068a, e5, "Failed to update cloud_page_messages table.", new Object[0]);
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS cloud_page_messages;");
                sQLiteDatabase.execSQL("CREATE TABLE cloud_page_messages (id VARCHAR PRIMARY KEY, start_date VARCHAR, end_date VARCHAR, message_type INTEGER, content_type INTEGER, url VARCHAR, subject VARCHAR, read SMALLINT, message_deleted SMALLINT, message_hash VARCHAR, request_id VARCHAR)");
                sQLiteDatabase.setTransactionSuccessful();
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
