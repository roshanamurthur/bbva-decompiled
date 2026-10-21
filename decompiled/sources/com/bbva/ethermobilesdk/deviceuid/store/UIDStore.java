package com.bbva.ethermobilesdk.deviceuid.store;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UIDStore.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H$J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H$J\u0010\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u0000X¤\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "", "()V", "key", "", "getKey", "()Ljava/lang/String;", "nextStore", "getNextStore", "()Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;", "setNextStore", "(Lcom/bbva/ethermobilesdk/deviceuid/store/UIDStore;)V", "get", "getUID", "save", "", "uid", "saveUID", "deviceuid_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class UIDStore {
    @Nullable
    public abstract String get();

    @Nullable
    public abstract String getKey();

    @Nullable
    public abstract UIDStore getNextStore();

    @Nullable
    public final String getUID() {
        String str = get();
        if (str != null) {
            return str;
        }
        UIDStore nextStore = getNextStore();
        if (nextStore != null) {
            return nextStore.get();
        }
        return null;
    }

    public abstract void save(@Nullable String uid);

    public final void saveUID(@Nullable String uid) {
        if (uid != null) {
            save(uid);
            UIDStore nextStore = getNextStore();
            if (nextStore != null) {
                nextStore.saveUID(uid);
            }
        }
    }

    public abstract void setNextStore(@Nullable UIDStore uIDStore);
}
