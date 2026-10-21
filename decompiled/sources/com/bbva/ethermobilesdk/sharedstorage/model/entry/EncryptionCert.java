package com.bbva.ethermobilesdk.sharedstorage.model.entry;

import com.bbva.ethermobilesdk.sharedstorage.provider.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptionCert.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EncryptionCert;", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/Entry;", "storage", "Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;", "(Lcom/bbva/ethermobilesdk/sharedstorage/provider/Provider;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EncryptionCert extends Entry {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EncryptionCert(@NotNull Provider storage) {
        super(EntryType.EncryptionCert.getId(), storage);
        Intrinsics.checkNotNullParameter(storage, "storage");
    }
}
