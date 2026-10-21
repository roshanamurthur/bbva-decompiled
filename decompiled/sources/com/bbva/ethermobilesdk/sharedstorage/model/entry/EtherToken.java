package com.bbva.ethermobilesdk.sharedstorage.model.entry;

import androidx.camera.camera2.internal.compat.u;
import androidx.collection.f;
import com.bbva.ethermobilesdk.sharedstorage.model.SharedStorageResult;
import com.bbva.ethermobilesdk.sharedstorage.model.StorageEntry;
import com.bbva.ethermobilesdk.sharedstorage.provider.Provider;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtherToken.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EtherToken;", "", "", "id", "token", "", "addToken", "Lcom/bbva/ethermobilesdk/sharedstorage/model/SharedStorageResult;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/StorageEntry;", "getToken", "deleteToken", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/Entry;", "c", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/Entry;", "getIds", "()Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/Entry;", RelayedService.KEY_IDS, "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "storage", "<init>", "(Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final class EtherToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Provider f30015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f30016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Entry ids;

    public EtherToken(@NotNull Provider storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30015a = storage;
        String id = EntryType.EtherToken.getId();
        this.f30016b = id;
        this.ids = new Entry(u.f(id, ".ids"), storage);
    }

    public final void addToken(@NotNull String id, @NotNull String token) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(token, "token");
        new Entry(f.c(new StringBuilder(), this.f30016b, Constant.DOT_STRING, id), this.f30015a).set(token);
    }

    public final void deleteToken(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        new Entry(f.c(new StringBuilder(), this.f30016b, Constant.DOT_STRING, id), this.f30015a).delete();
    }

    @NotNull
    public final Entry getIds() {
        return this.ids;
    }

    @NotNull
    public final SharedStorageResult<StorageEntry> getToken(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return new Entry(f.c(new StringBuilder(), this.f30016b, Constant.DOT_STRING, id), this.f30015a).get();
    }
}
