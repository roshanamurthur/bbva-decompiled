package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.location.LatLon;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness", "Range"})
public final class h extends b implements com.salesforce.marketingcloud.storage.i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64993e = "location_table";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f64994f = "CREATE TABLE location_table (id INTEGER PRIMARY KEY CHECK (id = 0), latitude VARCHAR, longitude VARCHAR );";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String[] f64995g = {"id", "latitude", "longitude"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f64996h = com.salesforce.marketingcloud.g.a("LocationDbStorage");

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f64997a = "id";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final String f64998b = "latitude";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f64999c = "longitude";
    }

    public h(SQLiteDatabase sQLiteDatabase) {
        super(sQLiteDatabase);
    }

    public static void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS location_table");
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.compileStatement(c.a("SELECT %s FROM %s", TextUtils.join(",", f64995g), f64993e));
            return true;
        } catch (Exception e5) {
            com.salesforce.marketingcloud.g.e(f64996h, e5, "%s is invalid", f64993e);
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
            com.salesforce.marketingcloud.g.b(f64996h, e5, "Unable to recover %s", f64993e);
            return zC;
        }
    }

    @Override // com.salesforce.marketingcloud.storage.i
    public int b() {
        return i(null);
    }

    @Override // com.salesforce.marketingcloud.storage.i
    @Nullable
    public LatLon l(@NonNull com.salesforce.marketingcloud.util.c cVar) {
        Cursor cursorA = a(f64995g, String.format(Locale.ENGLISH, "%s = ?", "id"), new String[]{"0"});
        LatLon latLon = null;
        if (cursorA != null) {
            if (cursorA.moveToFirst()) {
                try {
                    latLon = new LatLon(Double.valueOf(cVar.b(cursorA.getString(cursorA.getColumnIndex("latitude")))).doubleValue(), Double.valueOf(cVar.b(cursorA.getString(cursorA.getColumnIndex("longitude")))).doubleValue());
                } catch (Exception e5) {
                    com.salesforce.marketingcloud.g.b(f64996h, e5, "Unable to read location from database.", new Object[0]);
                }
            }
            cursorA.close();
        }
        return latLon;
    }

    @Override // com.salesforce.marketingcloud.storage.db.b
    public String o() {
        return f64993e;
    }

    public static void b(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(f64994f);
    }

    @Override // com.salesforce.marketingcloud.storage.i
    public void a(@NonNull LatLon latLon, @NonNull com.salesforce.marketingcloud.util.c cVar) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", (Integer) 0);
        contentValues.put("latitude", cVar.a(Double.toString(latLon.latitude())));
        contentValues.put("longitude", cVar.a(Double.toString(latLon.longitude())));
        if (a(contentValues, String.format(Locale.ENGLISH, "%s = ?", "id"), new String[]{"0"}) == 0) {
            a(contentValues);
        }
    }
}
