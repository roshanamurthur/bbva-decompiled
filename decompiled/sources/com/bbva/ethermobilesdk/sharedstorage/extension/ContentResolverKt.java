package com.bbva.ethermobilesdk.sharedstorage.extension;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bbva.ethermobilesdk.sharedstorage.ConstantsKt;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.networkplugin.command.impl.PutCommand;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ContentResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a&\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a.\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000\u001a\u001c\u0010\f\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u000bH\u0000\u001a\u001c\u0010\r\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\"\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¨\u0006\u000f"}, d2 = {"Landroid/content/ContentResolver;", "", "authority", "key", "scope", "Lcom/bbva/ethermobilesdk/sharedstorage/extension/CursorEntry;", "get", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "entry", "", "requestInsertion", "Landroid/content/ContentValues;", PutCommand.ID, "syncWithOtherProviders", "createInsertValues", "shared-storage_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nContentResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentResolver.kt\ncom/bbva/ethermobilesdk/sharedstorage/extension/ContentResolverKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class ContentResolverKt {
    public static final String access$key(ContentValues contentValues) {
        String asString = contentValues.getAsString("key");
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        return asString;
    }

    public static final String access$scope(ContentValues contentValues) {
        String asString = contentValues.getAsString("scope");
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        return asString;
    }

    public static final StorageEntry access$value(ContentValues contentValues) {
        return new StorageEntry(contentValues.getAsString("value"), contentValues.getAsString("created"), contentValues.getAsString("modified"), contentValues.getAsString("version"));
    }

    @NotNull
    public static final ContentValues createInsertValues(@NotNull String scope, @NotNull String key, @Nullable StorageEntry storageEntry) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(key, "key");
        ContentValues contentValues = new ContentValues();
        contentValues.put("scope", scope);
        contentValues.put("key", key);
        contentValues.put("value", storageEntry != null ? storageEntry.getValue() : null);
        contentValues.put("created", storageEntry != null ? storageEntry.getCreated() : null);
        contentValues.put("modified", storageEntry != null ? storageEntry.getModified() : null);
        contentValues.put("version", storageEntry != null ? storageEntry.getVersion() : null);
        return contentValues;
    }

    @Nullable
    public static final CursorEntry get(@NotNull ContentResolver contentResolver, @NotNull String authority, @NotNull String key, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(contentResolver, "<this>");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scope, "scope");
        String str = String.format(ConstantsKt.URI_FORMAT, Arrays.copyOf(new Object[]{authority, scope, key}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Cursor cursorQuery = contentResolver.query(Uri.parse(str), null, null, new String[]{scope, key}, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            CursorEntry value = CursorKt.getValue(cursorQuery);
            CloseableKt.closeFinally(cursorQuery, null);
            return value;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(cursorQuery, th2);
                throw th3;
            }
        }
    }

    public static final void put(@NotNull ContentResolver contentResolver, @NotNull String authority, @NotNull ContentValues entry) {
        Intrinsics.checkNotNullParameter(contentResolver, "<this>");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(entry, "entry");
        String asString = entry.getAsString("scope");
        Intrinsics.checkNotNullExpressionValue(asString, "getAsString(...)");
        String asString2 = entry.getAsString("key");
        Intrinsics.checkNotNullExpressionValue(asString2, "getAsString(...)");
        String str = String.format(ConstantsKt.URI_FORMAT, Arrays.copyOf(new Object[]{authority, asString, asString2}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        contentResolver.update(Uri.parse(str), entry, null, null);
    }

    public static final void requestInsertion(@NotNull ContentResolver contentResolver, @NotNull String authority, @NotNull String scope, @NotNull String key, @Nullable StorageEntry storageEntry) {
        Intrinsics.checkNotNullParameter(contentResolver, "<this>");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = String.format(ConstantsKt.URI_FORMAT, Arrays.copyOf(new Object[]{authority, scope, key}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        contentResolver.insert(Uri.parse(str), createInsertValues(scope, key, storageEntry));
    }

    public static final void syncWithOtherProviders(@NotNull ContentResolver contentResolver, @NotNull String authority, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(contentResolver, "<this>");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(scope, "scope");
        String str = String.format(ConstantsKt.URI_FORMAT, Arrays.copyOf(new Object[]{authority, scope, ""}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        contentResolver.bulkInsert(Uri.parse(str), new ContentValues[0]);
    }
}
