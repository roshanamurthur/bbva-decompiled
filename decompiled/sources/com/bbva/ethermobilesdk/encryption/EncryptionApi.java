package com.bbva.ethermobilesdk.encryption;

import android.content.Context;
import com.bbva.ethermobilesdk.ethercore.EtherApi;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EncryptionApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/ethermobilesdk/encryption/EncryptionApi;", "Lcom/bbva/ethermobilesdk/ethercore/EtherApi;", "Lcom/bbva/ethermobilesdk/encryption/EncryptionApiClient;", "Landroid/content/Context;", "context", "createClient", "<init>", "()V", "encryption_release"}, k = 1, mv = {1, 4, 0})
public final class EncryptionApi implements EtherApi<EncryptionApiClient> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public EncryptionApiClient f29774a;

    @Override // com.bbva.ethermobilesdk.ethercore.EtherApi
    @NotNull
    public EncryptionApiClient createClient(@NotNull Context context) throws LibMCryptException {
        EncryptionApiClient encryptionApiClient = new EncryptionApiClient(context);
        this.f29774a = encryptionApiClient;
        encryptionApiClient.init$encryption_release();
        EncryptionApiClient encryptionApiClient2 = this.f29774a;
        if (encryptionApiClient2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("client");
        }
        return encryptionApiClient2;
    }
}
