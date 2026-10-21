package com.bbva.ethermobilesdk.sharedstorage.extension;

import android.annotation.SuppressLint;
import android.database.Cursor;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0001¨\u0006\u0003"}, d2 = {"getValue", "Lcom/bbva/ethermobilesdk/sharedstorage/extension/CursorEntry;", "Landroid/database/Cursor;", "shared-storage_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class CursorKt {
    @SuppressLint({"Range"})
    @Nullable
    public static final CursorEntry getValue(@NotNull Cursor cursor) {
        Intrinsics.checkNotNullParameter(cursor, "<this>");
        if (!cursor.moveToFirst()) {
            return null;
        }
        String string = cursor.getString(cursor.getColumnIndex(CustomCursor.ID));
        String string2 = cursor.getString(cursor.getColumnIndex("value"));
        String string3 = cursor.getString(cursor.getColumnIndex("created"));
        String string4 = cursor.getString(cursor.getColumnIndex("modified"));
        String string5 = cursor.getString(cursor.getColumnIndex("version"));
        Intrinsics.checkNotNull(string);
        return new CursorEntry(string, new StorageEntry(string2, string3, string4, string5));
    }
}
