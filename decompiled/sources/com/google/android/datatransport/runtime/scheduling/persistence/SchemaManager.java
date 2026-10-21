package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.collection.h;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;
import yd.i;
import yd.j;
import yd.k;
import yd.l;
import yd.m;

/* JADX INFO: loaded from: classes9.dex */
public final class SchemaManager extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f43880r0 = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f43881s0 = 5;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final List<Migration> f43882t0 = Arrays.asList(new i(), new j(), new k(), new l(), new m());

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f43883p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f43884q0;

    public interface Migration {
        void upgrade(SQLiteDatabase sQLiteDatabase);
    }

    @Inject
    public SchemaManager(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i10) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f43884q0 = false;
        this.f43883p0 = i10;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        List<Migration> list = f43882t0;
        if (i11 <= list.size()) {
            while (i10 < i11) {
                list.get(i10).upgrade(sQLiteDatabase);
                i10++;
            }
        } else {
            StringBuilder sbE = h.e("Migration from ", i10, " to ", i11, " was requested, but cannot be performed. Only ");
            sbE.append(list.size());
            sbE.append(" migrations are provided");
            throw new IllegalArgumentException(sbE.toString());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f43884q0 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (!this.f43884q0) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, this.f43883p0);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.f43884q0) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, 0, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f43884q0) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (!this.f43884q0) {
            onConfigure(sQLiteDatabase);
        }
        a(sQLiteDatabase, i10, i11);
    }
}
