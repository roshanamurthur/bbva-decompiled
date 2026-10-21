package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness", "Range"})
public class m extends b implements com.salesforce.marketingcloud.storage.n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65058g = "triggers";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f65059h = com.salesforce.marketingcloud.g.a("TriggerDbStorage");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SQLiteStatement f65060e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SQLiteStatement f65061f;

    public m(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
        this.f65060e = sQLiteDatabase.compileStatement("UPDATE triggers SET app_open_count = app_open_count + 1 WHERE (start_date IS NULL OR start_date < ?)");
        this.f65061f = sQLiteDatabase.compileStatement("SELECT app_open_count FROM triggers WHERE id = ?");
    }

    private static ContentValues c(com.salesforce.marketingcloud.events.h hVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", hVar.h());
        contentValues.put("_key", hVar.i());
        contentValues.put("start_date", hVar.l() != null ? Long.valueOf(hVar.l().getTime()) : null);
        contentValues.put("_trigger", hVar.m().toString());
        return contentValues;
    }

    public static boolean d(SQLiteDatabase sQLiteDatabase) {
        boolean zC = c(sQLiteDatabase);
        if (zC) {
            return zC;
        }
        try {
            a(sQLiteDatabase);
            b(sQLiteDatabase);
            return c(sQLiteDatabase);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f65059h, e5, "Unable to recover %s", f65058g);
            return zC;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public int a(@NonNull com.salesforce.marketingcloud.events.h hVar) {
        if (hVar != null) {
            try {
                this.f65061f.bindString(1, hVar.h());
                return (int) this.f65061f.simpleQueryForLong();
            } catch (Exception unused) {
            }
        }
        return 0;
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public int b(@NonNull Collection<String> collection) {
        if (collection.size() == 0) {
            return i(null);
        }
        try {
            return a(o(), collection);
        } catch (Exception unused) {
            com.salesforce.marketingcloud.g.e(f65059h, "Unable to clean up %s table.", o());
            return 0;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.n
    @NonNull
    public JSONArray n() {
        JSONArray jSONArray = new JSONArray();
        Cursor cursorA = a(new String[]{"_trigger", "app_open_count"}, (String) null);
        if (cursorA != null) {
            try {
                if (cursorA.moveToFirst()) {
                    int columnIndex = cursorA.getColumnIndex("_trigger");
                    int columnIndex2 = cursorA.getColumnIndex("app_open_count");
                    do {
                        try {
                            JSONObject jSONObject = new JSONObject(cursorA.getString(columnIndex));
                            jSONObject.put("appOpenCount", cursorA.getInt(columnIndex2));
                            jSONArray.put(jSONObject);
                        } catch (JSONException e5) {
                            com.salesforce.marketingcloud.g.b(f65059h, e5, "Unable to read trigger information from cursor.", new Object[0]);
                        }
                    } while (cursorA.moveToNext());
                }
                cursorA.close();
            } catch (Throwable th2) {
                cursorA.close();
                throw th2;
            }
        }
        return jSONArray;
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return f65058g;
    }

    @Nullable
    private static com.salesforce.marketingcloud.events.h a(@NonNull Cursor cursor) {
        try {
            return new com.salesforce.marketingcloud.events.h(new JSONObject(cursor.getString(cursor.getColumnIndex("_trigger"))));
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f65059h, e5, "Unable to read trigger from DB", new Object[0]);
            return null;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.n
    @Nullable
    public com.salesforce.marketingcloud.events.h b(@NonNull String str) {
        Cursor cursorA = a(new String[]{"_trigger"}, "id = ?", new String[]{str});
        com.salesforce.marketingcloud.events.h hVarA = null;
        if (cursorA != null) {
            hVarA = cursorA.moveToFirst() ? a(cursorA) : null;
            cursorA.close();
        }
        return hVarA;
    }

    @Override // com.salesforce.marketingcloud.storage.n
    @NonNull
    public List<com.salesforce.marketingcloud.events.h> c(@NonNull String str) {
        ArrayList arrayList;
        Cursor cursorA = a(new String[]{"_trigger"}, "lower(_key) = lower(?) AND (start_date IS NULL OR start_date < ?)", new String[]{str, String.valueOf(System.currentTimeMillis())});
        try {
            if (cursorA.moveToFirst()) {
                arrayList = new ArrayList(cursorA.getCount());
                do {
                    arrayList.add(a(cursorA));
                } while (cursorA.moveToNext());
            } else {
                arrayList = null;
            }
            cursorA.close();
            return arrayList != null ? arrayList : Collections.emptyList();
        } catch (Throwable th2) {
            cursorA.close();
            throw th2;
        }
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS triggers");
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE triggers(id TEXT PRIMARY KEY, _key TEXT, start_date INTEGER DEFAULT NULL, _trigger TEXT, app_open_count INTEGER DEFAULT 0);");
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public void c() {
        this.f65060e.bindString(1, String.valueOf(System.currentTimeMillis()));
        this.f65060e.execute();
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,_key,start_date,_trigger,app_open_count FROM triggers");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.n
    public void b(@NonNull com.salesforce.marketingcloud.events.h hVar) throws Exception {
        ContentValues contentValuesC = c(hVar);
        if (a(contentValuesC, "id = ?", new String[]{hVar.h()}) == 0) {
            a(contentValuesC);
        }
    }
}
