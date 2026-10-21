package com.bbva.ethermobilesdk.sharedstorage.extension;

import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/extension/CursorEntry;", "", "", "component1", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "component2", "key", "entry", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "b", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "getEntry", "()Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "<init>", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class CursorEntry {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StorageEntry entry;

    public CursorEntry(@NotNull String key, @NotNull StorageEntry entry) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.key = key;
        this.entry = entry;
    }

    public static /* synthetic */ CursorEntry copy$default(CursorEntry cursorEntry, String str, StorageEntry storageEntry, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cursorEntry.key;
        }
        if ((i10 & 2) != 0) {
            storageEntry = cursorEntry.entry;
        }
        return cursorEntry.copy(str, storageEntry);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final StorageEntry getEntry() {
        return this.entry;
    }

    @NotNull
    public final CursorEntry copy(@NotNull String key, @NotNull StorageEntry entry) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(entry, "entry");
        return new CursorEntry(key, entry);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CursorEntry)) {
            return false;
        }
        CursorEntry cursorEntry = (CursorEntry) other;
        return Intrinsics.areEqual(this.key, cursorEntry.key) && Intrinsics.areEqual(this.entry, cursorEntry.entry);
    }

    @NotNull
    public final StorageEntry getEntry() {
        return this.entry;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public int hashCode() {
        return this.entry.hashCode() + (this.key.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "CursorEntry(key=" + this.key + ", entry=" + this.entry + ")";
    }
}
