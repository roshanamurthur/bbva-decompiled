package com.salesforce.marketingcloud.storage.db;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.util.Locale;

/* JADX INFO: loaded from: classes9.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class l extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @VisibleForTesting
    public static final int f65052d = 11;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f65053e = "mcsdk_%s.db";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f65054f = com.salesforce.marketingcloud.g.a("StorageSqliteOpenHelper");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f65055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.salesforce.marketingcloud.util.c f65056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f65057c;

    public l(Context context, com.salesforce.marketingcloud.util.c cVar, String str) {
        this(context, cVar, a(str), 11);
    }

    public static String a(String str) {
        return String.format(Locale.ENGLISH, f65053e, str);
    }

    public void b() throws Exception {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        a(writableDatabase);
        writableDatabase.execSQL("VACUUM");
        onCreate(writableDatabase);
    }

    public void c() throws IllegalStateException, com.salesforce.marketingcloud.storage.exceptions.a {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!k.c(writableDatabase)) {
            com.salesforce.marketingcloud.g.e(f65054f, "Database table %s was not initialized properly and will be dropped and recreated.  Some data may be lost.", k.f65031e);
            try {
                b();
                if (!k.c(writableDatabase)) {
                    throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", k.f65031e));
                }
                throw new com.salesforce.marketingcloud.storage.exceptions.a();
            } catch (Exception e5) {
                throw new IllegalStateException(e5.getMessage(), e5);
            }
        }
        if (!g.d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", g.f64988e));
        }
        if (!a.d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", a.f64960e));
        }
        if (!j.g(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", j.f65028e));
        }
        if (!i.d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", "messages"));
        }
        if (!h.d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", h.f64993e));
        }
        if (!m.d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", m.f65058g));
        }
        if (!f.m(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", f.f64982e));
        }
        if (!e.d(writableDatabase)) {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "%s could not be initialized.", "device_stats"));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            k.b(sQLiteDatabase);
            g.b(sQLiteDatabase);
            a.b(sQLiteDatabase);
            j.d(sQLiteDatabase);
            i.b(sQLiteDatabase);
            h.b(sQLiteDatabase);
            f.i(sQLiteDatabase);
            m.b(sQLiteDatabase);
            e.b(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        com.salesforce.marketingcloud.g.e(f65054f, "SQLite database being downgraded from %d to %d", Integer.valueOf(i11), Integer.valueOf(i10));
        this.f65057c = true;
        a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (sQLiteDatabase.isReadOnly()) {
            return;
        }
        sQLiteDatabase.execSQL("PRAGMA foreign_keys=ON");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws Throwable {
        if (i10 < 2) {
            com.salesforce.marketingcloud.storage.db.upgrades.b.b(sQLiteDatabase, this.f65055a, this.f65056b);
        }
        if (i10 < 3) {
            com.salesforce.marketingcloud.storage.db.upgrades.c.f(sQLiteDatabase);
        }
        if (i10 < 4) {
            com.salesforce.marketingcloud.storage.db.upgrades.d.c(sQLiteDatabase);
        }
        if (i10 < 5) {
            com.salesforce.marketingcloud.storage.db.upgrades.e.b(sQLiteDatabase);
        }
        if (i10 < 6) {
            com.salesforce.marketingcloud.storage.db.upgrades.f.b(sQLiteDatabase);
        }
        if (i10 < 7) {
            com.salesforce.marketingcloud.storage.db.upgrades.g.b(sQLiteDatabase);
        }
        if (i10 < 8) {
            com.salesforce.marketingcloud.storage.db.upgrades.h.a(sQLiteDatabase);
        }
        if (i10 < 9) {
            com.salesforce.marketingcloud.storage.db.upgrades.i.b(sQLiteDatabase);
        }
        if (i10 < 10) {
            com.salesforce.marketingcloud.storage.db.upgrades.j.b(sQLiteDatabase, this.f65056b);
        }
        if (i10 < 11) {
            com.salesforce.marketingcloud.storage.db.upgrades.a.b(sQLiteDatabase, this.f65056b);
        }
    }

    public l(Context context, com.salesforce.marketingcloud.util.c cVar, String str, int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f65055a = context;
        this.f65056b = cVar;
    }

    private void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        try {
            k.a(sQLiteDatabase);
            g.a(sQLiteDatabase);
            a.a(sQLiteDatabase);
            j.c(sQLiteDatabase);
            i.a(sQLiteDatabase);
            h.a(sQLiteDatabase);
            f.e(sQLiteDatabase);
            m.a(sQLiteDatabase);
            e.a(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public boolean a() {
        return this.f65057c;
    }
}
