package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
public abstract class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final String f64975d = "%s = ?";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final SQLiteDatabase f64976c;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.f64976c = sQLiteDatabase;
    }

    public final int a(ContentValues contentValues, String str, String[] strArr) {
        return this.f64976c.update(o(), contentValues, str, strArr);
    }

    public void b(String str, @NonNull Collection<String> collection) {
        this.f64976c.execSQL(c.a("DROP TABLE IF EXISTS tmp_%s;", str));
        this.f64976c.execSQL(c.a("CREATE TEMPORARY TABLE tmp_%s(id VARCHAR);", str));
        ContentValues contentValues = new ContentValues();
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            contentValues.put("id", it.next());
            this.f64976c.insert(c.a("tmp_%s", str), null, contentValues);
        }
    }

    public final int c(@NonNull Collection<String> collection) throws SQLException {
        return a(o(), collection, false);
    }

    public void h(String str) {
        this.f64976c.execSQL(c.a("DROP TABLE IF EXISTS tmp_%s;", str));
    }

    public final int i(String str) {
        return a(str, (String[]) null);
    }

    public abstract String o();

    public final int a(@NonNull String str, @NonNull Collection<String> collection) throws SQLException {
        return a(str, collection, true);
    }

    private int a(@NonNull String str, Collection<String> collection, boolean z10) {
        try {
            this.f64976c.beginTransaction();
            b(str, collection);
            SQLiteDatabase sQLiteDatabase = this.f64976c;
            Object[] objArr = new Object[2];
            objArr[0] = str;
            objArr[1] = z10 ? "IS NULL" : "IS NOT NULL";
            int iDelete = sQLiteDatabase.delete(str, c.a("id IN(SELECT %1$s.id FROM %1$s LEFT JOIN tmp_%1$s ON %1$s.id = tmp_%1$s.id WHERE tmp_%1$s.id %2$s)", objArr), null);
            h(str);
            this.f64976c.setTransactionSuccessful();
            this.f64976c.endTransaction();
            return iDelete;
        } catch (SQLException e5) {
            this.f64976c.endTransaction();
            throw e5;
        }
    }

    public final int a(String str, String[] strArr) {
        return this.f64976c.delete(o(), str, strArr);
    }

    public final long a(ContentValues contentValues) {
        return this.f64976c.insert(o(), null, contentValues);
    }

    public final Cursor a(String str, String[] strArr, String str2, String[] strArr2) {
        return this.f64976c.query(str, strArr, str2, strArr2, null, null, null);
    }

    public final Cursor a(String[] strArr, String str) {
        return a(strArr, str, null, null, null, null, null);
    }

    public final Cursor a(String[] strArr, String str, String[] strArr2) {
        return a(strArr, str, strArr2, null, null, null, null);
    }

    public final Cursor a(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4) {
        return this.f64976c.query(false, o(), strArr, str, strArr2, str2, str3, str4, null);
    }

    public final Cursor a(String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        return this.f64976c.query(false, o(), strArr, str, strArr2, str2, str3, str4, str5);
    }

    public final void a(ContentValues contentValues, @NonNull Collection<String> collection) {
        try {
            this.f64976c.beginTransactionNonExclusive();
            b(o(), collection);
            a(contentValues, c.a("id IN(SELECT %1$s.id FROM %1$s LEFT JOIN tmp_%1$s ON %1$s.id = tmp_%1$s.id WHERE tmp_%1$s.id IS NOT NULL)", o()), (String[]) null);
            h(o());
            this.f64976c.setTransactionSuccessful();
            this.f64976c.endTransaction();
        } catch (SQLException e5) {
            this.f64976c.endTransaction();
            throw e5;
        }
    }
}
