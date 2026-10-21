package com.bbva.ethermobilesdk.securesharing.database;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import androidx.appcompat.widget.a;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.extension.LoggerKt;
import com.bbva.ethermobilesdk.securesharing.extension.UriKt;
import com.bbva.ethermobilesdk.securesharing.model.ProviderInfo;
import com.bbva.sl.ar.android.storage.pss.provider.SharedProvider;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.e;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EntryDatabase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016Jk\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\b\u0002\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0012\b\u0002\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018J-\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u000e¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0010\u0010\u0012\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u000e¢\u0006\u0004\b#\u0010$¨\u0006*"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/database/EntryDatabase;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/database/sqlite/SQLiteDatabase;", "db", "", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "Landroid/net/Uri;", "uri", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "table", "", "", "projection", "selection", "selectionArgs", "sortOrder", "alternativeColumn", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;Lcom/bbva/ethermobilesdk/securesharing/database/Table;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "insert", "bulkInsert", "(Landroid/net/Uri;Lcom/bbva/ethermobilesdk/securesharing/database/Table;[Landroid/content/ContentValues;)I", "delete", "(Landroid/net/Uri;Lcom/bbva/ethermobilesdk/securesharing/database/Table;Ljava/lang/String;[Ljava/lang/String;)I", "update", "(Landroid/net/Uri;Lcom/bbva/ethermobilesdk/securesharing/database/Table;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "provider", "replace", "(Landroid/net/Uri;Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;[Landroid/content/ContentValues;)V", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class EntryDatabase extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Context f29949p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntryDatabase(@NotNull Context context) {
        super(context, "keyvalue.db", (SQLiteDatabase.CursorFactory) null, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29949p0 = context;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str, Map map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(((String) entry.getKey()) + ' ' + ((String) entry.getValue()));
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + str + " (" + CollectionsKt___CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null) + RootService.CLOSE_BRACKET);
    }

    public final int bulkInsert(@NotNull Uri uri, @NotNull Table table, @NotNull ContentValues[] values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            try {
                writableDatabase.beginTransaction();
                ArrayList arrayList = new ArrayList(values.length);
                for (ContentValues contentValues : values) {
                    arrayList.add(Long.valueOf(writableDatabase.insertWithOnConflict(table.getName(), null, contentValues, 5)));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((Number) obj).longValue() > 0) {
                        arrayList2.add(obj);
                    }
                }
                int size = arrayList2.size();
                writableDatabase.setTransactionSuccessful();
                if (size >= values.length) {
                    ContentResolver contentResolver = this.f29949p0.getContentResolver();
                    if (contentResolver != null) {
                        contentResolver.notifyChange(uri, null);
                    }
                    writableDatabase.endTransaction();
                    return size;
                }
                ExceptionKt.throwError$default("An error occurred when inserting rows [ insert " + size + " of " + values.length + AbstractJsonLexerKt.END_LIST, null, 2, null);
                throw new KotlinNothingValueException();
            } catch (Exception e5) {
                String message = e5.getMessage();
                if (message == null) {
                    message = "An error was throw while trying to insert a value";
                }
                ExceptionKt.throwError$default(message, null, 2, null);
                throw new KotlinNothingValueException();
            }
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public final int delete(@NotNull Uri uri, @NotNull Table table, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(table, "table");
        return getWritableDatabase().delete(table.getName(), UriKt.selectionCriteria(uri, table.getIdColumn(), selection), selectionArgs);
    }

    @NotNull
    public final Uri insert(@NotNull Uri uri, @NotNull Table table, @Nullable ContentValues values) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(table, "table");
        long jInsertWithOnConflict = getWritableDatabase().insertWithOnConflict(table.getName(), null, values, 5);
        if (jInsertWithOnConflict < 0) {
            throw q.d("An error occurred when inserting a row", null, 2, null);
        }
        Uri uriWithAppendedId = ContentUris.withAppendedId(uri, jInsertWithOnConflict);
        Intrinsics.checkNotNullExpressionValue(uriWithAppendedId, "withAppendedId(uri, id)");
        ContentResolver contentResolver = this.f29949p0.getContentResolver();
        if (contentResolver != null) {
            contentResolver.notifyChange(uriWithAppendedId, null);
        }
        return uriWithAppendedId;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@NotNull SQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        a(db2, EntryTable.INSTANCE.getName(), bk.q.mapOf(TuplesKt.to("key", "TEXT PRIMARY KEY"), TuplesKt.to("value", "TEXT"), TuplesKt.to(EntryTable.CREATED_AT, "INTEGER"), TuplesKt.to(EntryTable.MODIFIED_AT, "INTEGER")));
        a(db2, InfoTable.INSTANCE.getName(), bk.q.mapOf(TuplesKt.to(InfoTable.AUTHORITY, "TEXT PRIMARY KEY"), TuplesKt.to("priority", "INTEGER")));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@NotNull SQLiteDatabase db2, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(db2, "db");
        StringBuilder sb2 = new StringBuilder("Upgrading database from version ");
        sb2.append(oldVersion);
        sb2.append(" to ");
        LoggerKt.log(e.trimMargin$default(a.c(sb2, newVersion, ",\n                | which will destroy all old data"), null, 1, null));
        String strI = ai.a.i(new Object[]{EntryTable.INSTANCE.getName()}, 1, "DROP TABLE IF EXISTS %s", "java.lang.String.format(this, *args)");
        String strI2 = ai.a.i(new Object[]{InfoTable.INSTANCE.getName()}, 1, "DROP TABLE IF EXISTS %s", "java.lang.String.format(this, *args)");
        db2.execSQL(strI);
        db2.execSQL(strI2);
        onCreate(db2);
    }

    @Nullable
    public final Cursor query(@NotNull Uri uri, @NotNull Table table, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder, @Nullable String alternativeColumn) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(table, "table");
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        sQLiteQueryBuilder.setTables(table.getName());
        String string = uri.toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
        if (new Regex(SharedProvider.URI_CONTENT_ITEM_TYPE_REGEX).matches(string)) {
            sQLiteQueryBuilder.appendWhere((alternativeColumn == null ? table.getIdColumn() : alternativeColumn) + '=' + uri + ".itemId()");
        }
        return sQLiteQueryBuilder.query(getReadableDatabase(), projection, selection, selectionArgs, null, null, sortOrder);
    }

    public final void replace(@NotNull Uri uri, @NotNull ProviderInfo provider, @NotNull ContentValues[] values) {
        ContentResolver contentResolver;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(values, "values");
        Context context = this.f29949p0;
        ContentResolver contentResolver2 = context.getContentResolver();
        Cursor cursorQuery = contentResolver2 == null ? null : contentResolver2.query(uri, null, null, null, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() > 0 && (contentResolver = context.getContentResolver()) != null && contentResolver.delete(uri, null, null) <= 0) {
                    ExceptionKt.throwError$default("Cannot delete [" + provider.getAuthority() + "] from table with uri [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
                    throw new KotlinNothingValueException();
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        }
        Unit unit = Unit.INSTANCE;
        CloseableKt.closeFinally(cursorQuery, null);
        ContentResolver contentResolver3 = context.getContentResolver();
        if (contentResolver3 != null && contentResolver3.bulkInsert(uri, values) == 0) {
            throw q.d("Cannot insert [" + provider.getAuthority() + "] from table with uri [" + uri + AbstractJsonLexerKt.END_LIST, null, 2, null);
        }
    }

    public final int update(@NotNull Uri uri, @NotNull Table table, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(table, "table");
        int iUpdateWithOnConflict = getWritableDatabase().updateWithOnConflict(table.getName(), values, UriKt.selectionCriteria(uri, table.getIdColumn(), selection), selectionArgs, 5);
        ContentResolver contentResolver = this.f29949p0.getContentResolver();
        if (contentResolver != null) {
            contentResolver.notifyChange(uri, null);
        }
        return iUpdateWithOnConflict;
    }
}
