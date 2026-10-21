package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"Range"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class e extends b implements com.salesforce.marketingcloud.storage.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f64980e = "device_stats";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f64981f = com.salesforce.marketingcloud.g.a("DeviceStatsDbStorage");

    public e(@NonNull SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    private static ContentValues b(com.salesforce.marketingcloud.analytics.stats.b bVar, com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        if (bVar.b() != null) {
            contentValues.put("id", bVar.b());
        }
        contentValues.put("type", Integer.valueOf(bVar.d()));
        contentValues.put("date", Long.valueOf(bVar.a().getTime()));
        contentValues.put("event_data", cVar.a(bVar.c().a()));
        contentValues.put(a.C0270a.f64970f, Integer.valueOf(bVar.e() ? 1 : 0));
        return contentValues;
    }

    @Override // com.salesforce.marketingcloud.storage.d
    public int a() {
        try {
            return a("(type = ? OR type = ?) AND in_transit = 0 AND date <= ?", new String[]{String.valueOf(106), String.valueOf(107), String.valueOf(System.currentTimeMillis() - 1209600000)});
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64981f, e5, "Unable to purge old debug/telemetry data.", new Object[0]);
            return 0;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.d
    public void c(@NonNull String[] strArr) {
        if (strArr.length > 0) {
            try {
                com.salesforce.marketingcloud.g.c(f64981f, "Deleted %d items of %d items", Integer.valueOf(strArr.length), Integer.valueOf(c(Arrays.asList(strArr))));
            } catch (Exception unused) {
                com.salesforce.marketingcloud.g.e(f64981f, "Unable to clean up %s table.", o());
            }
        }
    }

    @Override // com.salesforce.marketingcloud.storage.d
    public void d(@NonNull String[] strArr) {
        if (strArr.length > 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("in_transit", (Integer) 0);
            try {
                a(contentValues, Arrays.asList(strArr));
            } catch (Exception unused) {
                com.salesforce.marketingcloud.g.e(f64981f, "Unable to update %s table.", o());
            }
        }
    }

    @Override // com.salesforce.marketingcloud.storage.d
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.stats.b> i(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return a(cVar, "SELECT * FROM device_stats WHERE ready_to_send=1 AND in_transit=0 AND type IN(105)");
    }

    @Override // com.salesforce.marketingcloud.storage.d
    public int j() {
        return i((String) null);
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return f64980e;
    }

    @Override // com.salesforce.marketingcloud.storage.d
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.stats.b> p(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        return a(cVar, "SELECT * FROM device_stats WHERE ready_to_send=1 AND in_transit=0 AND type IN(100, 101, 102, 103, 104, 106, 107)");
    }

    private static com.salesforce.marketingcloud.analytics.stats.b a(Cursor cursor, com.salesforce.marketingcloud.util.c cVar) {
        try {
            int i10 = cursor.getInt(cursor.getColumnIndex("id"));
            int i11 = cursor.getInt(cursor.getColumnIndex("type"));
            Date date = new Date(cursor.getLong(cursor.getColumnIndex("date")));
            com.salesforce.marketingcloud.analytics.stats.d dVarA = com.salesforce.marketingcloud.analytics.stats.d.a(cVar.b(cursor.getString(cursor.getColumnIndex("event_data"))));
            boolean z10 = true;
            if (cursor.getInt(cursor.getColumnIndex(a.C0270a.f64970f)) != 1) {
                z10 = false;
            }
            return com.salesforce.marketingcloud.analytics.stats.b.a(i10, i11, date, dVarA, z10);
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.b(f64981f, e5, "Unable to read analytic item from cursor.", new Object[0]);
            return null;
        }
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE device_stats(id INTEGER PRIMARY KEY, type INTEGER, date INTEGER, event_data TEXT, in_transit INTEGER DEFAULT 0, ready_to_send INTEGER DEFAULT 0);");
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement("SELECT id,type,date,event_data,in_transit,ready_to_send FROM device_stats");
            return true;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64981f, e5, "%s is invalid", f64980e);
            return false;
        }
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
            com.salesforce.marketingcloud.g.b(f64981f, e5, "Unable to recover %s", f64980e);
            return zC;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.d
    @NonNull
    public List<com.salesforce.marketingcloud.analytics.stats.b> o(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        List<com.salesforce.marketingcloud.analytics.stats.b> listEmptyList = Collections.emptyList();
        Cursor cursorRawQuery = this.f64976c.rawQuery("SELECT * FROM device_stats WHERE ready_to_send=0", null);
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                ArrayList arrayList = new ArrayList(cursorRawQuery.getCount());
                do {
                    arrayList.add(a(cursorRawQuery, cVar));
                } while (cursorRawQuery.moveToNext());
                listEmptyList = arrayList;
            }
            cursorRawQuery.close();
        }
        return listEmptyList;
    }

    @NonNull
    private List<com.salesforce.marketingcloud.analytics.stats.b> a(@NonNull com.salesforce.marketingcloud.util.c cVar, @NonNull String str) {
        List<com.salesforce.marketingcloud.analytics.stats.b> listEmptyList = Collections.emptyList();
        this.f64976c.beginTransaction();
        Cursor cursorRawQuery = this.f64976c.rawQuery(str, null);
        if (cursorRawQuery != null) {
            if (cursorRawQuery.moveToFirst()) {
                int count = cursorRawQuery.getCount();
                int columnIndex = cursorRawQuery.getColumnIndex("id");
                String[] strArr = new String[count];
                ArrayList arrayList = new ArrayList(count);
                int i10 = 0;
                while (true) {
                    arrayList.add(a(cursorRawQuery, cVar));
                    strArr[i10] = cursorRawQuery.getString(columnIndex);
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                    int i11 = i10 + 1;
                    if (i10 >= count) {
                        break;
                    }
                    i10 = i11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("in_transit", (Integer) 1);
                try {
                    a(contentValues, Arrays.asList(strArr));
                    this.f64976c.setTransactionSuccessful();
                } catch (Exception unused) {
                    com.salesforce.marketingcloud.g.e(f64981f, "Unable to update %s table.", o());
                }
                listEmptyList = arrayList;
            }
            cursorRawQuery.close();
            this.f64976c.endTransaction();
        }
        return listEmptyList;
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS device_stats");
    }

    @Override // com.salesforce.marketingcloud.storage.d
    public void a(@NonNull com.salesforce.marketingcloud.analytics.stats.b bVar, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValuesB = b(bVar, cVar);
        if (bVar.b() == null || a(contentValuesB, "id = ?", new String[]{bVar.b().toString()}) == 0) {
            a(contentValuesB);
        }
    }
}
