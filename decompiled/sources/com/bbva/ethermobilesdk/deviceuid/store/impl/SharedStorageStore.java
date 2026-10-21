package com.bbva.ethermobilesdk.deviceuid.store.impl;

import android.content.Context;
import com.bbva.ethermobilesdk.deviceuid.store.UIDStore;
import com.bbva.ethermobilesdk.sharedstorage.SharedStorage;
import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedStorageStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014R.\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0014@VX\u0094\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u00018\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/store/impl/SharedStorageStore;", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "", "uid", "", "save", "get", "<set-?>", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "key", "b", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "getNextStore", "()Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "setNextStore", "(Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;)V", "nextStore", "Lcom/bbva/ethermobilesdk/sharedstorage/SharedStorage;", "c", "Lcom/bbva/ethermobilesdk/sharedstorage/SharedStorage;", "getSharedStorage$deviceuid_release", "()Lcom/bbva/ethermobilesdk/sharedstorage/SharedStorage;", "sharedStorage", "Landroid/content/Context;", "context", "group", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;)V", "deviceuid_release"}, k = 1, mv = {1, 8, 0})
public final class SharedStorageStore extends UIDStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UIDStore nextStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SharedStorage sharedStorage;

    public /* synthetic */ SharedStorageStore(Context context, String str, String str2, UIDStore uIDStore, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? null : str2, uIDStore);
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public String get() {
        SharedStorageResult<StorageEntry> sharedStorageResult = this.sharedStorage.getDeviceUid().get();
        if (sharedStorageResult instanceof SharedStorageResult.Success) {
            return ((StorageEntry) ((SharedStorageResult.Success) sharedStorageResult).getValue()).getValue();
        }
        UIDStore nextStore = getNextStore();
        if (nextStore != null) {
            return nextStore.getUID();
        }
        return null;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public String getKey() {
        return this.key;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public UIDStore getNextStore() {
        return this.nextStore;
    }

    @NotNull
    /* JADX INFO: renamed from: getSharedStorage$deviceuid_release, reason: from getter */
    public final SharedStorage getSharedStorage() {
        return this.sharedStorage;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    public void save(@Nullable String uid) {
        if (uid != null) {
            this.sharedStorage.getDeviceUid().set(uid);
        }
    }

    public void setKey(@Nullable String str) {
        this.key = str;
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    public void setNextStore(@Nullable UIDStore uIDStore) {
        this.nextStore = uIDStore;
    }

    public SharedStorageStore(@NotNull Context context, @NotNull String group, @Nullable String str, @Nullable UIDStore uIDStore) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        this.key = str;
        this.nextStore = uIDStore;
        this.sharedStorage = new SharedStorage(context, group);
    }
}
