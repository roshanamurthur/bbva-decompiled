package com.bbva.ethermobilesdk.sharedstorage.model.entry;

import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.ethermobilesdk.sharedstorage.provider.Provider;
import com.bbva.plugin.localstorage.command.SetCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Entry.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/Entry;", "", "Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "get", "", "value", "", SetCommand.ID, "delete", "key", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "storage", "<init>", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public class Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f30013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Provider f30014b;

    public Entry(@NotNull String key, @NotNull Provider storage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30013a = key;
        this.f30014b = storage;
    }

    public final void delete() {
        this.f30014b.put(this.f30013a, (String) null);
    }

    @NotNull
    public final SharedStorageResult<StorageEntry> get() {
        return this.f30014b.get(this.f30013a);
    }

    public final void set(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f30014b.put(this.f30013a, value);
    }
}
