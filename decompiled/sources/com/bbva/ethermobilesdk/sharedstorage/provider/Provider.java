package com.bbva.ethermobilesdk.sharedstorage.provider;

import com.bbva.ethermobilesdk.sharedstorage.BuildConfig;
import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.networkplugin.command.impl.PutCommand;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Provider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b&\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\u0016\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0000J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H$J\u0014\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007H$J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H$J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0004R$\u0010\u0018\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "", "", "key", "Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "get", "", "getAll", "value", "", PutCommand.ID, "provider", "addToTail", "read", "readAll", "write", "reversePut", "a", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "getNext", "()Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "setNext", "(Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;)V", "next", "b", "getPrevious", "setPrevious", "previous", "group", "<init>", "(Ljava/lang/String;)V", "Companion", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public abstract class Provider {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Provider$Companion$dateFormatterThreadLocal$1 f30024c = new ThreadLocal<SimpleDateFormat>() { // from class: com.bbva.ethermobilesdk.sharedstorage.provider.Provider$Companion$dateFormatterThreadLocal$1
        @Override // java.lang.ThreadLocal
        @NotNull
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ROOT);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Provider next;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Provider previous;

    public Provider(@NotNull String group) {
        Intrinsics.checkNotNullParameter(group, "group");
    }

    public final void a(String str, StorageEntry storageEntry) {
        write(str, storageEntry);
        Provider provider = this.previous;
        if (provider != null) {
            provider.a(str, storageEntry);
        }
    }

    public final void addToTail(@NotNull Provider provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Provider provider2 = this.next;
        if (provider2 == null) {
            this.next = provider;
        } else if (provider2 != null) {
            provider2.addToTail(provider);
        }
    }

    @NotNull
    public final SharedStorageResult<StorageEntry> get(@NotNull String key) {
        SharedStorageResult<StorageEntry> sharedStorageResult;
        Intrinsics.checkNotNullParameter(key, "key");
        SharedStorageResult<StorageEntry> sharedStorageResult2 = read(key);
        if (!(sharedStorageResult2 instanceof SharedStorageResult.Success)) {
            Provider provider = this.next;
            return (provider == null || (sharedStorageResult = provider.read(key)) == null) ? sharedStorageResult2 : sharedStorageResult;
        }
        StorageEntry storageEntry = (StorageEntry) ((SharedStorageResult.Success) sharedStorageResult2).getValue();
        write(key, storageEntry);
        Provider provider2 = this.previous;
        if (provider2 == null) {
            return sharedStorageResult2;
        }
        provider2.write(key, storageEntry);
        return sharedStorageResult2;
    }

    @NotNull
    public final Map<String, StorageEntry> getAll() {
        return readAll();
    }

    @Nullable
    public final Provider getNext() {
        return this.next;
    }

    @Nullable
    public final Provider getPrevious() {
        return this.previous;
    }

    public final void put(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        String strAccess$now = ProviderKt.access$now(f30024c);
        SharedStorageResult<StorageEntry> sharedStorageResult = get(key);
        put(key, sharedStorageResult instanceof SharedStorageResult.Success ? StorageEntry.copy$default((StorageEntry) ((SharedStorageResult.Success) sharedStorageResult).getValue(), value, null, strAccess$now, BuildConfig.VERSION_NAME, 2, null) : new StorageEntry(value, strAccess$now, strAccess$now, BuildConfig.VERSION_NAME));
    }

    @NotNull
    public abstract SharedStorageResult<StorageEntry> read(@NotNull String key);

    @NotNull
    public abstract Map<String, StorageEntry> readAll();

    public final void reversePut(@NotNull String key, @NotNull StorageEntry value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Provider provider = this.previous;
        if (provider != null) {
            provider.a(key, value);
        }
    }

    public final void setNext(@Nullable Provider provider) {
        this.next = provider;
    }

    public final void setPrevious(@Nullable Provider provider) {
        this.previous = provider;
    }

    @NotNull
    public abstract SharedStorageResult<Unit> write(@NotNull String key, @NotNull StorageEntry value);

    public final void put(@NotNull String key, @NotNull StorageEntry value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        write(key, value);
        Provider provider = this.next;
        if (provider != null) {
            provider.put(key, value);
        }
    }
}
