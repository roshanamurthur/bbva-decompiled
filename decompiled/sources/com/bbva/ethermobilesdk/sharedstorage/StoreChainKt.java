package com.bbva.ethermobilesdk.sharedstorage;

import android.content.Context;
import com.bbva.ethermobilesdk.sharedstorage.provider.EncryptedInternalProvider;
import com.bbva.ethermobilesdk.sharedstorage.provider.InternalProvider;
import com.bbva.ethermobilesdk.sharedstorage.provider.Provider;
import kotlin.Metadata;

/* JADX INFO: compiled from: StoreChain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shared-storage_release"}, k = 2, mv = {1, 9, 0})
public final class StoreChainKt {
    public static final Provider access$createInternalProvider(Context context, String str, String str2) {
        if (!InternalProvider.INSTANCE.wasCreated(context, str, str2)) {
            return new EncryptedInternalProvider(context, str, str2);
        }
        InternalProvider internalProvider = new InternalProvider(context, str, str2);
        EncryptedInternalProvider encryptedInternalProvider = new EncryptedInternalProvider(context, str, str2);
        encryptedInternalProvider.setNext(internalProvider);
        internalProvider.setPrevious(encryptedInternalProvider);
        return encryptedInternalProvider;
    }
}
