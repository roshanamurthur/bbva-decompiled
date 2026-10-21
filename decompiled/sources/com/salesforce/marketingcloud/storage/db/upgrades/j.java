package com.salesforce.marketingcloud.storage.db.upgrades;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.mastercard.sonic.androidsvg.SVGParser;
import com.salesforce.marketingcloud.util.l;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"Range"})
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f65075a = com.salesforce.marketingcloud.g.a("Version9ToVersion10");

    private j() {
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE device_stats(id INTEGER PRIMARY KEY, type INTEGER, date INTEGER, event_data TEXT, in_transit INTEGER DEFAULT 0, ready_to_send INTEGER DEFAULT 0);");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f65075a, e5, "Unable to create device stats table.", new Object[0]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE triggers (id TEXT PRIMARY KEY, _key TEXT, start_date INTEGER DEFAULT NULL, _trigger TEXT, app_open_count INTEGER DEFAULT 0);");
                sQLiteDatabase.execSQL("CREATE TABLE in_app_messages(id TEXT PRIMARY KEY, priority INTEGER DEFAULT 999, start_date DATETIME, end_date DATETIME, modified_date DATETIME, display_limit INTEGER DEFAULT 1, media_url TEXT DEFAULT NULL, message_json TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE iam_state(id TEXT PRIMARY KEY, display_count integer DEFAULT 0, FOREIGN KEY (id) REFERENCES in_app_messages(id) ON DELETE CASCADE);");
                sQLiteDatabase.execSQL("CREATE TRIGGER iam_state_init AFTER INSERT ON in_app_messages BEGIN INSERT INTO iam_state (id) VALUES (NEW.id); END;");
                sQLiteDatabase.execSQL("CREATE VIEW iam_view AS SELECT in_app_messages.id,in_app_messages.priority,in_app_messages.start_date,in_app_messages.end_date,in_app_messages.modified_date,in_app_messages.display_limit,in_app_messages.message_json,iam_state.display_count FROM in_app_messages INNER JOIN iam_state ON iam_state.id = in_app_messages.id;");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Exception e5) {
                com.salesforce.marketingcloud.g.b(f65075a, e5, "Unable to create in app message table", new Object[0]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    private static void c(@NonNull SQLiteDatabase sQLiteDatabase) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TABLE region_messages ( region_id TEXT, message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
                sQLiteDatabase.execSQL("INSERT INTO region_messages SELECT region_id,message_id FROM region_message;");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_message");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e5) {
                com.salesforce.marketingcloud.g.b(f65075a, e5, "Unable to create region_messages table and migrate data from region_message.", new Object[0]);
                try {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_messages");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS region_message");
                    sQLiteDatabase.execSQL("CREATE TABLE region_messages ( region_id TEXT, message_id TEXT, FOREIGN KEY (region_id) REFERENCES regions(id) ON DELETE CASCADE, PRIMARY KEY (region_id, message_id));");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e7) {
                    com.salesforce.marketingcloud.g.b(f65075a, e7, "Unable to create region_messages table", new Object[0]);
                }
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    /* JADX WARN: Code duplicated, block: B:124:0x0284 A[EDGE_INSN: B:124:0x0284->B:87:0x0284 BREAK  A[LOOP:0: B:85:0x0269->B:88:0x0285], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0229 A[EDGE_INSN: B:125:0x0229->B:68:0x0229 BREAK  A[LOOP:1: B:111:0x0036->B:69:0x022a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x016e  */
    /* JADX WARN: Code duplicated, block: B:69:0x022a A[LOOP:1: B:111:0x0036->B:69:0x022a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0263 A[Catch: all -> 0x0288, Exception -> 0x028a, TryCatch #2 {Exception -> 0x028a, blocks: (B:81:0x025a, B:83:0x0263, B:85:0x0269, B:93:0x028c, B:94:0x028f), top: B:107:0x025a, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0269 A[Catch: all -> 0x0288, Exception -> 0x028a, LOOP:0: B:85:0x0269->B:88:0x0285, LOOP_START, PHI: r18
      0x0269: PHI (r18v3 java.lang.String) = (r18v2 java.lang.String), (r18v4 java.lang.String) binds: [B:84:0x0267, B:88:0x0285] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x028a, blocks: (B:81:0x025a, B:83:0x0263, B:85:0x0269, B:93:0x028c, B:94:0x028f), top: B:107:0x025a, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0285 A[LOOP:0: B:85:0x0269->B:88:0x0285, LOOP_END] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private static void a(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Throwable {
        String str;
        Cursor cursorRawQuery;
        String str2;
        String str3;
        String str4;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str5 = "custom";
        String str6 = "subject";
        String str7 = "id";
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS inbox_messages;");
                sQLiteDatabase2.execSQL("CREATE TABLE inbox_messages(id TEXT PRIMARY KEY, start_date INTEGER DEFAULT NULL, end_date INTEGER DEFAULT NULL, is_deleted INTEGER DEFAULT 0, is_read INTEGER DEFAULT 0, is_dirty INTEGER DEFAULT 0, message_hash TEXT DEFAULT NULL, message_json TEXT);");
                Cursor cursorRawQuery2 = sQLiteDatabase2.rawQuery("SELECT * FROM cloud_page_messages", null);
                if (cursorRawQuery2 != null) {
                    if (cursorRawQuery2.moveToFirst()) {
                        while (true) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                ContentValues contentValues = new ContentValues();
                                try {
                                    try {
                                        String string = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(str7));
                                        contentValues.put(str7, string);
                                        jSONObject.put(str7, string);
                                        String string2 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("start_date"));
                                        if (string2 != null) {
                                            try {
                                                str = str7;
                                                try {
                                                    contentValues.put("start_date", Long.valueOf(l.f(string2).getTime()));
                                                    jSONObject.put("startDateUtc", string2);
                                                } catch (Exception e5) {
                                                    e = e5;
                                                    sQLiteDatabase2 = sQLiteDatabase;
                                                    str3 = str5;
                                                    str4 = str6;
                                                    try {
                                                        com.salesforce.marketingcloud.g.b(f65075a, e, "Unable to update Inbox message.", new Object[0]);
                                                        if (!cursorRawQuery2.moveToNext()) {
                                                            break;
                                                            cursorRawQuery2.close();
                                                            sQLiteDatabase.setTransactionSuccessful();
                                                            sQLiteDatabase.endTransaction();
                                                            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS cloud_page_messages");
                                                            sQLiteDatabase.beginTransaction();
                                                            try {
                                                                cursorRawQuery = sQLiteDatabase2.rawQuery("SELECT id FROM inbox_message_status", null);
                                                                if (cursorRawQuery != null) {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        while (true) {
                                                                            str2 = str;
                                                                            sQLiteDatabase2.execSQL("UPDATE inbox_messages SET is_dirty=1 WHERE id=?", new String[]{cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2))});
                                                                            if (!cursorRawQuery.moveToNext()) {
                                                                                break;
                                                                            } else {
                                                                                str = str2;
                                                                            }
                                                                        }
                                                                    }
                                                                    cursorRawQuery.close();
                                                                }
                                                                sQLiteDatabase.setTransactionSuccessful();
                                                            } catch (Exception e7) {
                                                                com.salesforce.marketingcloud.g.b(f65075a, e7, "Unable to update inbox status values", new Object[0]);
                                                            }
                                                            sQLiteDatabase.endTransaction();
                                                            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS inbox_message_status");
                                                        }
                                                        str7 = str;
                                                        str5 = str3;
                                                        str6 = str4;
                                                    } catch (Exception e10) {
                                                        e = e10;
                                                        com.salesforce.marketingcloud.g.b(f65075a, e, "Unable to update any Inbox messages.", new Object[0]);
                                                    }
                                                }
                                            } catch (Exception e11) {
                                                e = e11;
                                                str = str7;
                                            }
                                        } else {
                                            str = str7;
                                        }
                                        String string3 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("end_date"));
                                        if (string3 != null) {
                                            contentValues.put("end_date", Long.valueOf(l.f(string3).getTime()));
                                            jSONObject.put("endDateUtc", string3);
                                        }
                                        jSONObject.put("messageType", 8);
                                        jSONObject.put("contentType", 2);
                                        jSONObject.put("url", cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("url"))));
                                        jSONObject.put(str6, cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(str6))));
                                        contentValues.put("is_read", Integer.valueOf(cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("read"))));
                                        contentValues.put("is_deleted", Integer.valueOf(cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("message_deleted"))));
                                        jSONObject.put(str5, cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(str5))));
                                        String strB = cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("keys")));
                                        if (strB != null) {
                                            try {
                                                Map<String, String> mapC = l.c(strB);
                                                if (mapC.isEmpty()) {
                                                    str3 = str5;
                                                    str4 = str6;
                                                } else {
                                                    JSONArray jSONArray = new JSONArray();
                                                    Iterator<Map.Entry<String, String>> it = mapC.entrySet().iterator();
                                                    while (it.hasNext()) {
                                                        Map.Entry<String, String> next = it.next();
                                                        Iterator<Map.Entry<String, String>> it2 = it;
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        str3 = str5;
                                                        str4 = str6;
                                                        try {
                                                            jSONObject2.put("key", next.getKey());
                                                            jSONObject2.put("value", next.getValue());
                                                            jSONArray.put(jSONObject2);
                                                            it = it2;
                                                            str5 = str3;
                                                            str6 = str4;
                                                        } catch (Exception e12) {
                                                            e = e12;
                                                            sQLiteDatabase2 = sQLiteDatabase;
                                                            com.salesforce.marketingcloud.g.b(f65075a, e, "Unable to update Inbox message.", new Object[0]);
                                                            if (!cursorRawQuery2.moveToNext()) {
                                                                break;
                                                                cursorRawQuery2.close();
                                                                sQLiteDatabase.setTransactionSuccessful();
                                                                sQLiteDatabase.endTransaction();
                                                                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS cloud_page_messages");
                                                                sQLiteDatabase.beginTransaction();
                                                                cursorRawQuery = sQLiteDatabase2.rawQuery("SELECT id FROM inbox_message_status", null);
                                                                if (cursorRawQuery != null) {
                                                                    if (cursorRawQuery.moveToFirst()) {
                                                                        while (true) {
                                                                            str2 = str;
                                                                            sQLiteDatabase2.execSQL("UPDATE inbox_messages SET is_dirty=1 WHERE id=?", new String[]{cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2))});
                                                                            if (!cursorRawQuery.moveToNext()) {
                                                                                break;
                                                                                break;
                                                                            }
                                                                            str = str2;
                                                                        }
                                                                    }
                                                                    cursorRawQuery.close();
                                                                }
                                                                sQLiteDatabase.setTransactionSuccessful();
                                                                sQLiteDatabase.endTransaction();
                                                                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS inbox_message_status");
                                                            }
                                                            str7 = str;
                                                            str5 = str3;
                                                            str6 = str4;
                                                        }
                                                    }
                                                    str3 = str5;
                                                    str4 = str6;
                                                    jSONObject.put("keys", jSONArray);
                                                }
                                            } catch (Exception e13) {
                                                e = e13;
                                                str3 = str5;
                                                str4 = str6;
                                            }
                                        } else {
                                            str3 = str5;
                                            str4 = str6;
                                        }
                                        jSONObject.put("title", cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("title"))));
                                        jSONObject.put("alert", cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("alert"))));
                                        jSONObject.put("sound", cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("sound")));
                                        String strB2 = cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(com.salesforce.marketingcloud.storage.db.i.a.f65008e)));
                                        String strB3 = cVar.b(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex(com.salesforce.marketingcloud.storage.db.i.a.f65009f)));
                                        if (strB2 != null || strB3 != null) {
                                            JSONObject jSONObject3 = new JSONObject();
                                            if (strB2 != null) {
                                                jSONObject3.put("androidUrl", strB2);
                                            }
                                            if (strB3 != null) {
                                                jSONObject3.put("alt", strB3);
                                            }
                                            jSONObject.put(SVGParser.XML_STYLESHEET_ATTR_MEDIA, jSONObject3);
                                        }
                                        String string4 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("message_hash"));
                                        contentValues.put("message_hash", string4);
                                        jSONObject.put(HashCommand.ID, string4);
                                        jSONObject.put("requestId", cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("request_id")));
                                        contentValues.put("message_json", cVar.a(jSONObject.toString()));
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        try {
                                            sQLiteDatabase2.insert(com.salesforce.marketingcloud.storage.db.g.f64988e, null, contentValues);
                                        } catch (Exception e14) {
                                            e = e14;
                                            com.salesforce.marketingcloud.g.b(f65075a, e, "Unable to update Inbox message.", new Object[0]);
                                        }
                                    } catch (Exception e15) {
                                        e = e15;
                                        sQLiteDatabase2 = sQLiteDatabase;
                                        str3 = str5;
                                        str4 = str6;
                                        str = str7;
                                        com.salesforce.marketingcloud.g.b(f65075a, e, "Unable to update Inbox message.", new Object[0]);
                                        if (!cursorRawQuery2.moveToNext()) {
                                            break;
                                            cursorRawQuery2.close();
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS cloud_page_messages");
                                            sQLiteDatabase.beginTransaction();
                                            cursorRawQuery = sQLiteDatabase2.rawQuery("SELECT id FROM inbox_message_status", null);
                                            if (cursorRawQuery != null) {
                                                if (cursorRawQuery.moveToFirst()) {
                                                    while (true) {
                                                        str2 = str;
                                                        sQLiteDatabase2.execSQL("UPDATE inbox_messages SET is_dirty=1 WHERE id=?", new String[]{cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2))});
                                                        if (!cursorRawQuery.moveToNext()) {
                                                            break;
                                                            break;
                                                        }
                                                        str = str2;
                                                    }
                                                }
                                                cursorRawQuery.close();
                                            }
                                            sQLiteDatabase.setTransactionSuccessful();
                                            sQLiteDatabase.endTransaction();
                                            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS inbox_message_status");
                                        }
                                        str7 = str;
                                        str5 = str3;
                                        str6 = str4;
                                    }
                                    if (!cursorRawQuery2.moveToNext()) {
                                        break;
                                    }
                                    str7 = str;
                                    str5 = str3;
                                    str6 = str4;
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabase.endTransaction();
                                    throw th;
                                }
                            } catch (Exception e16) {
                                e = e16;
                            }
                        }
                    } else {
                        str = "id";
                    }
                    cursorRawQuery2.close();
                } else {
                    str = "id";
                }
                sQLiteDatabase.setTransactionSuccessful();
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e17) {
            e = e17;
            str = "id";
        }
        sQLiteDatabase.endTransaction();
        sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS cloud_page_messages");
        sQLiteDatabase.beginTransaction();
        try {
            cursorRawQuery = sQLiteDatabase2.rawQuery("SELECT id FROM inbox_message_status", null);
            if (cursorRawQuery != null) {
                if (cursorRawQuery.moveToFirst()) {
                    while (true) {
                        str2 = str;
                        sQLiteDatabase2.execSQL("UPDATE inbox_messages SET is_dirty=1 WHERE id=?", new String[]{cursorRawQuery.getString(cursorRawQuery.getColumnIndex(str2))});
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                            break;
                        }
                        str = str2;
                    }
                }
                cursorRawQuery.close();
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS inbox_message_status");
        } catch (Throwable th4) {
            sQLiteDatabase.endTransaction();
            throw th4;
        }
    }

    public static void b(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Throwable {
        a(sQLiteDatabase, cVar);
        b(sQLiteDatabase);
        a(sQLiteDatabase);
        c(sQLiteDatabase);
    }
}
