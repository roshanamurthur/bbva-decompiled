package com.salesforce.marketingcloud.storage.db.upgrades;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"Range"})
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f65062a = com.salesforce.marketingcloud.g.a("Version10ToVersion11");

    private a() {
    }

    private static void a(SQLiteDatabase sQLiteDatabase, com.salesforce.marketingcloud.util.c cVar) {
        try {
            try {
                sQLiteDatabase.beginTransaction();
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE analytic_item_temp (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, json_payload VARCHAR, request_id VARCHAR, predictive_intelligence_identifier VARCHAR DEFAULT NULL)");
                sQLiteDatabase.execSQL("INSERT INTO analytic_item_temp SELECT id,event_date,analytic_product_type,analytic_type,value,ready_to_send,object_ids,json_payload,request_id,predictive_intelligence_identifier FROM analytic_item");
                sQLiteDatabase.execSQL("DROP TABLE analytic_item");
                sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, enc_json_pi_payload VARCHAR, enc_json_et_payload VARCHAR, predictive_intelligence_identifier VARCHAR DEFAULT NULL)");
                String str = null;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM analytic_item_temp", null);
                if (cursorRawQuery != null) {
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            ContentValues contentValues = new ContentValues();
                            try {
                                contentValues.put("id", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("id"))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64967c, cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64967c)));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64973i, Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64973i))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64968d, Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64968d))));
                                contentValues.put("value", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("value"))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64970f, Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64970f))));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64969e, cursorRawQuery.getString(cursorRawQuery.getColumnIndex(com.salesforce.marketingcloud.storage.db.a.C0270a.f64969e)));
                                contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64972h, cursorRawQuery.getString(cursorRawQuery.getColumnIndex("json_payload")));
                                String string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("request_id"));
                                if (!TextUtils.isEmpty(string)) {
                                    JSONObject jSONObject = new JSONObject();
                                    jSONObject.put("requestId", string);
                                    try {
                                        contentValues.put(com.salesforce.marketingcloud.storage.db.a.C0270a.f64971g, cVar.a(jSONObject.toString()));
                                    } catch (Exception e5) {
                                        e = e5;
                                        com.salesforce.marketingcloud.g.b(f65062a, e, "Failed to update item in Analytics local storage during upgrade.", new Object[0]);
                                    }
                                }
                                sQLiteDatabase.insert(com.salesforce.marketingcloud.storage.db.a.f64960e, str, contentValues);
                            } catch (Exception e7) {
                                e = e7;
                            }
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            } else {
                                str = null;
                            }
                        }
                    }
                    cursorRawQuery.close();
                }
                sQLiteDatabase.execSQL("DROP TABLE analytic_item_temp");
                sQLiteDatabase.setTransactionSuccessful();
            } catch (SQLException e10) {
                com.salesforce.marketingcloud.g.b(f65062a, e10, "Failed to upgrade Analytics local storage.  Starting fresh.  Some analytics items may have been lost.", new Object[0]);
                try {
                    sQLiteDatabase.execSQL("CREATE TABLE analytic_item (id INTEGER PRIMARY KEY AUTOINCREMENT, event_date VARCHAR, analytic_product_type INTEGER, analytic_type INTEGER, value INTEGER, ready_to_send SMALLINT, object_ids VARCHAR, enc_json_pi_payload VARCHAR, enc_json_et_payload VARCHAR, predictive_intelligence_identifier VARCHAR DEFAULT NULL)");
                    sQLiteDatabase.setTransactionSuccessful();
                } catch (SQLException e11) {
                    com.salesforce.marketingcloud.g.b(f65062a, e11, "Failed to create local storage for Analytics.", new Object[0]);
                }
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static void b(@NonNull SQLiteDatabase sQLiteDatabase, @NonNull com.salesforce.marketingcloud.util.c cVar) {
        a(sQLiteDatabase, cVar);
    }
}
