package com.bbva.ethermobilesdk.securesharing.extension;

import android.database.Cursor;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.securesharing.database.EntryTable;
import com.bbva.ethermobilesdk.securesharing.database.InfoTable;
import com.bbva.ethermobilesdk.securesharing.model.Entry;
import com.bbva.ethermobilesdk.securesharing.model.ProviderInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u0000H\u0000\u001a\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005*\u00020\u0000H\u0000¨\u0006\b"}, d2 = {"Landroid/database/Cursor;", "Lcom/bbva/ethermobilesdk/securesharing/model/ProviderInfo;", "toProviderInfo", "Lcom/bbva/ethermobilesdk/securesharing/model/Entry;", "toEntry", "", "toEntryList", "toProviderInfoList", "securesharing_release"}, k = 2, mv = {1, 5, 1})
public final class CursorKt {

    /* JADX INFO: compiled from: Cursor.kt */
    public static final class a extends Lambda implements Function1<Cursor, Entry> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Cursor f29956p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Cursor cursor) {
            super(1);
            this.f29956p0 = cursor;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Entry invoke(Cursor cursor) {
            Cursor it = cursor;
            Intrinsics.checkNotNullParameter(it, "it");
            return CursorKt.toEntry(this.f29956p0);
        }
    }

    /* JADX INFO: compiled from: Cursor.kt */
    public static final class b extends Lambda implements Function1<Cursor, ProviderInfo> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Cursor f29957p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Cursor cursor) {
            super(1);
            this.f29957p0 = cursor;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ProviderInfo invoke(Cursor cursor) {
            Cursor it = cursor;
            Intrinsics.checkNotNullParameter(it, "it");
            return CursorKt.toProviderInfo(this.f29957p0);
        }
    }

    public static final <T> List<T> a(Cursor cursor, Function1<? super Cursor, ? extends T> function1) {
        try {
            ArrayList arrayList = new ArrayList();
            if (!cursor.moveToFirst()) {
                return arrayList;
            }
            while (!cursor.isAfterLast()) {
                arrayList.add(function1.invoke(cursor));
                cursor.moveToNext();
            }
            return arrayList;
        } catch (Exception e5) {
            String message = e5.getMessage();
            if (message == null) {
                message = "An error has happened while trying to read the entry list";
            }
            LoggerKt.log(message);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public static final Entry toEntry(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        try {
            int columnIndex = cursor.getColumnIndex("key");
            if (columnIndex == -1) {
                ExceptionKt.throwError$default("Invalid row scheme, no 'key' column was found", null, 2, null);
                throw new KotlinNothingValueException();
            }
            String key = cursor.getString(columnIndex);
            if (key == null || l.isBlank(key)) {
                ExceptionKt.throwError$default("Could not parse key: Null or invalid repository entry representation", null, 2, null);
                throw new KotlinNothingValueException();
            }
            String value = cursor.getString(cursor.getColumnIndexOrThrow("value"));
            long j10 = cursor.getLong(cursor.getColumnIndexOrThrow(EntryTable.CREATED_AT));
            long j11 = cursor.getLong(cursor.getColumnIndexOrThrow(EntryTable.MODIFIED_AT));
            Intrinsics.checkNotNullExpressionValue(key, "key");
            Intrinsics.checkNotNullExpressionValue(value, "value");
            return new Entry(key, value, j10, j11);
        } catch (Exception unused) {
            throw q.d("Could not get column index", null, 2, null);
        }
    }

    @NotNull
    public static final List<Entry> toEntryList(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        return a(cursor, new a(cursor));
    }

    @NotNull
    public static final ProviderInfo toProviderInfo(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        int columnIndex = cursor.getColumnIndex(InfoTable.AUTHORITY);
        if (columnIndex == -1) {
            throw q.d("Invalid row scheme, no providerName column was found", null, 2, null);
        }
        String authority = cursor.getString(columnIndex);
        if (authority == null || authority.length() == 0) {
            throw q.d("Could not parse application info authority: Null or invalid repository entry representation", null, 2, null);
        }
        try {
            long j10 = cursor.getLong(cursor.getColumnIndexOrThrow("priority"));
            Intrinsics.checkNotNullExpressionValue(authority, "authority");
            return new ProviderInfo(authority, j10);
        } catch (Exception unused) {
            throw q.d("Could not get column index", null, 2, null);
        }
    }

    @NotNull
    public static final List<ProviderInfo> toProviderInfoList(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        return a(cursor, new b(cursor));
    }
}
