package com.bbva.ethermobilesdk.securesharing.storage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.datastore.preferences.protobuf.q;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.securesharing.database.Table;
import com.bbva.ethermobilesdk.securesharing.extension.ContextKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.extension.UriKt;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ProviderConnector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b(\u0010)J#\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eJ\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H&J\u0012\u0010\u0015\u001a\u00020\u000b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003J\u0018\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003J=\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cH\u0004¢\u0006\u0004\b\u0011\u0010\u001eR\u0014\u0010\u0019\u001a\u00020\u00188$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00038$X¤\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006*"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/storage/ProviderConnector;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "key", "alternativeAuthority", "get", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, AnalyticsConstants.Key.ITEM, "", "create", "(Ljava/lang/Object;Ljava/lang/String;)V", "", FirebaseAnalytics.Param.ITEMS, "createAll", "delete", "", "keys", "from", Constants.deleteAll, "targetAuthority", "getAll", "Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "table", "authority", "selection", "", "selectionArgs", "(Lcom/bbva/ethermobilesdk/securesharing/database/Table;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getTable", "()Lcom/bbva/ethermobilesdk/securesharing/database/Table;", "getIndexColumn", "()Ljava/lang/String;", "indexColumn", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/securesharing/storage/Mapper;", "mapper", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/bbva/ethermobilesdk/securesharing/storage/Mapper;)V", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public abstract class ProviderConnector<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f29970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Mapper<T> f29971c;

    public ProviderConnector(@NotNull Context context, @NotNull String authority, @NotNull Mapper<T> mapper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f29969a = context;
        this.f29970b = authority;
        this.f29971c = mapper;
    }

    public static /* synthetic */ void create$default(ProviderConnector providerConnector, Object obj, String str, int i10, Object obj2) throws Exception {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        providerConnector.create(obj, str);
    }

    public static /* synthetic */ void delete$default(ProviderConnector providerConnector, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        providerConnector.delete(str, str2);
    }

    public static /* synthetic */ void deleteAll$default(ProviderConnector providerConnector, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteAll");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        providerConnector.deleteAll(str);
    }

    public static /* synthetic */ Object get$default(ProviderConnector providerConnector, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return providerConnector.get(str, str2);
    }

    public static /* synthetic */ List getAll$default(ProviderConnector providerConnector, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAll");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return providerConnector.getAll(str);
    }

    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return get$default(this, key, null, 2, null) != null;
    }

    public final void create(T item, @Nullable String alternativeAuthority) throws Exception {
        if (alternativeAuthority == null) {
            alternativeAuthority = this.f29970b;
        }
        Context context = this.f29969a;
        ContextKt.verifyAuthority(context, alternativeAuthority);
        try {
            if (context.getContentResolver().insert(UriKt.contentUri(alternativeAuthority, getTable().getPath()), this.f29971c.toContentValues(item)) != null) {
                return;
            }
            ExceptionKt.throwError$default("Could not create row [" + item + AbstractJsonLexerKt.END_LIST, null, 2, null);
            throw new KotlinNothingValueException();
        } catch (Exception e5) {
            ExceptionKt.throwError("Could not create row [" + item + AbstractJsonLexerKt.END_LIST, e5);
            throw new KotlinNothingValueException();
        }
    }

    public final void createAll(@NotNull List<? extends T> items) throws Exception {
        Intrinsics.checkNotNullParameter(items, "items");
        Context context = this.f29969a;
        String str = this.f29970b;
        ContextKt.verifyAuthority(context, str);
        Uri uriContentUri = UriKt.contentUri(str, getTable().getPath());
        List<? extends T> list = items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f29971c.toContentValues(it.next()));
        }
        Object[] array = arrayList.toArray(new ContentValues[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        ContentValues[] contentValuesArr = (ContentValues[]) array;
        try {
            int iBulkInsert = context.getContentResolver().bulkInsert(uriContentUri, contentValuesArr);
            if (iBulkInsert <= contentValuesArr.length) {
                return;
            }
            ExceptionKt.throwError$default("Could not create all entries [" + iBulkInsert + "/+" + contentValuesArr.length + AbstractJsonLexerKt.END_LIST, null, 2, null);
            throw new KotlinNothingValueException();
        } catch (Exception e5) {
            ExceptionKt.throwError("Error creating entries", e5);
            throw new KotlinNothingValueException();
        }
    }

    public final void delete(@NotNull String key, @Nullable String alternativeAuthority) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (alternativeAuthority == null) {
            alternativeAuthority = this.f29970b;
        }
        ContextKt.verifyAuthority(this.f29969a, alternativeAuthority);
        delete(getTable(), alternativeAuthority, Intrinsics.stringPlus(getIndexColumn(), "=?"), new String[]{key});
    }

    public final void deleteAll(@Nullable String from) {
        String str = this.f29970b;
        ContextKt.verifyAuthority(this.f29969a, from == null ? str : from);
        delete$default(this, getTable(), from == null ? str : from, null, null, 12, null);
    }

    @Nullable
    public final T get(@NotNull String key, @Nullable String alternativeAuthority) throws Exception {
        Intrinsics.checkNotNullParameter(key, "key");
        if (alternativeAuthority == null) {
            alternativeAuthority = this.f29970b;
        }
        Context context = this.f29969a;
        ContextKt.verifyAuthority(context, alternativeAuthority);
        try {
            Cursor cursorQuery = context.getContentResolver().query(UriKt.contentUri(alternativeAuthority, getTable().getPath()), null, Intrinsics.stringPlus(getIndexColumn(), "=?"), new String[]{key}, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() != 0 && cursorQuery.moveToFirst()) {
                        T item = this.f29971c.toItem(cursorQuery);
                        CloseableKt.closeFinally(cursorQuery, null);
                        return item;
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
            CloseableKt.closeFinally(cursorQuery, null);
            return null;
        } catch (Exception e5) {
            ExceptionKt.throwError("Error getting row associated to id [" + key + AbstractJsonLexerKt.END_LIST, e5);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public final List<T> getAll(@Nullable String targetAuthority) throws Exception {
        Context context = this.f29969a;
        String str = this.f29970b;
        ContextKt.verifyAuthority(context, str);
        if (targetAuthority == null) {
            targetAuthority = str;
        }
        try {
            Cursor cursorQuery = context.getContentResolver().query(UriKt.contentUri(targetAuthority, getTable().getPath()), null, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        List<T> list = this.f29971c.toList(cursorQuery);
                        CloseableKt.closeFinally(cursorQuery, null);
                        return list;
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
            List<T> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            CloseableKt.closeFinally(cursorQuery, null);
            return listEmptyList;
        } catch (Exception e5) {
            ExceptionKt.throwError("Error getting all row/s", e5);
            throw new KotlinNothingValueException();
        }
    }

    @NotNull
    public abstract String getIndexColumn();

    @NotNull
    public abstract Table getTable();

    @NotNull
    public abstract Set<String> keys();

    public static /* synthetic */ void delete$default(ProviderConnector providerConnector, Table table, String str, String str2, String[] strArr, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            strArr = null;
        }
        providerConnector.delete(table, str, str2, strArr);
    }

    public final void delete(@NotNull Table table, @NotNull String authority, @Nullable String selection, @Nullable String[] selectionArgs) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(authority, "authority");
        try {
            if (this.f29969a.getContentResolver().delete(UriKt.contentUri(authority, table.getPath()), selection, selectionArgs) == 0) {
                StringBuilder sb2 = new StringBuilder("Could not row with primary key [");
                sb2.append((Object) (selectionArgs == null ? null : (String) ArraysKt___ArraysKt.firstOrNull(selectionArgs)));
                sb2.append(AbstractJsonLexerKt.END_LIST);
                ExceptionKt.throwError$default(sb2.toString(), null, 2, null);
                throw new KotlinNothingValueException();
            }
        } catch (Exception unused) {
            StringBuilder sb3 = new StringBuilder("Error deleting row with primary key [");
            sb3.append((Object) (selectionArgs == null ? null : (String) ArraysKt___ArraysKt.firstOrNull(selectionArgs)));
            sb3.append(AbstractJsonLexerKt.END_LIST);
            throw q.d(sb3.toString(), null, 2, null);
        }
    }
}
