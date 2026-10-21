package com.bbva.ethermobilesdk.tokencompat.extension;

import android.content.ContentValues;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ContentValues.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001a\u0010\u0000\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toStorageEntry", "Lkotlin/Pair;", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "Landroid/content/ContentValues;", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContentValuesKt {
    @NotNull
    public static final Pair<String, StorageEntry> toStorageEntry(@NotNull ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(contentValues, "<this>");
        return new Pair<>(contentValues.getAsString("key"), new StorageEntry(contentValues.getAsString("value"), contentValues.getAsString("created"), contentValues.getAsString("modified"), contentValues.getAsString("version")));
    }
}
