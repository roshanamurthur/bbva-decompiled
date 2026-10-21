package com.bbva.ethermobilesdk.deviceuid.store.impl;

import com.bbva.ethermobilesdk.deviceuid.store.UIDStore;
import com.bbva.ethermobilesdk.deviceuid.utils.Cache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MemoryStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0014R$\u0010\r\u001a\u0004\u0018\u00010\u00018\u0014@\u0014X\u0094\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/store/impl/MemoryStore;", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "", "uid", "", "save", "get", "a", "Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "getNextStore", "()Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "setNextStore", "(Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;)V", "nextStore", "b", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "key", "<init>", "(Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;Ljava/lang/String;)V", "deviceuid_release"}, k = 1, mv = {1, 8, 0})
public final class MemoryStore extends UIDStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public UIDStore nextStore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String key;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Cache<String> f29764c;

    public /* synthetic */ MemoryStore(UIDStore uIDStore, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(uIDStore, (i10 & 2) != 0 ? null : str);
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    @Nullable
    public String get() {
        String value = this.f29764c.getValue();
        if (value != null) {
            save(value);
            return value;
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

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    public void save(@Nullable String uid) {
        this.f29764c.refresh(uid);
    }

    @Override // com.bbva.ethermobilesdk.deviceuid.store.UIDStore
    public void setNextStore(@Nullable UIDStore uIDStore) {
        this.nextStore = uIDStore;
    }

    public MemoryStore(@Nullable UIDStore uIDStore, @Nullable String str) {
        this.nextStore = uIDStore;
        this.key = str;
        this.f29764c = new Cache<>();
    }
}
