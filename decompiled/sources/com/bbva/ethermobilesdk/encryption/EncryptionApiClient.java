package com.bbva.ethermobilesdk.encryption;

import android.content.Context;
import com.bbva.ethermobilesdk.ethercore.EtherClient;
import com.bbva.sl.ar.android.libmcrypt.impl.LibMCryptAndroid;
import com.bbva.sl.ar.core.libmcrypt.HostData;
import com.bbva.sl.ar.core.libmcrypt.KpubData;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EncryptionApiClient.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0006J&\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/encryption/EncryptionApiClient;", "Lcom/bbva/ethermobilesdk/ethercore/EtherClient;", "", "init$encryption_release", "()V", "init", "", "dataToKpubCheck", "Lcom/bbva/sl/ar/core/libmcrypt/KpubData;", LibMCryptConstants.GENERATE_K_PUB, "hostData", LibMCryptConstants.DECRYPT_HOST_DATA, "infoDataToCheck", "keyTag", "Lcom/bbva/sl/ar/core/libmcrypt/HostData;", LibMCryptConstants.ENCRYPT_HOST_DATA, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "encryption_release"}, k = 1, mv = {1, 4, 0})
public final class EncryptionApiClient implements EtherClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LibMCryptAndroid f29775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f29776b;

    public EncryptionApiClient(@NotNull Context context) {
        this.f29776b = context;
    }

    public static /* synthetic */ HostData encryptHostData$default(EncryptionApiClient encryptionApiClient, String str, String str2, String str3, int i10, Object obj) throws LibMCryptException {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        return encryptionApiClient.encryptHostData(str, str2, str3);
    }

    public static /* synthetic */ KpubData generateKpub$default(EncryptionApiClient encryptionApiClient, String str, int i10, Object obj) throws LibMCryptException {
        if ((i10 & 1) != 0) {
            str = null;
        }
        return encryptionApiClient.generateKpub(str);
    }

    @Nullable
    public final String decryptHostData(@NotNull String hostData) throws LibMCryptException {
        LibMCryptAndroid libMCryptAndroid = this.f29775a;
        if (libMCryptAndroid == null) {
            Intrinsics.throwUninitializedPropertyAccessException("encryption");
        }
        return libMCryptAndroid.decryptHostData(hostData);
    }

    @Nullable
    public final HostData encryptHostData(@NotNull String hostData, @Nullable String infoDataToCheck, @Nullable String keyTag) throws LibMCryptException {
        if (keyTag != null) {
            LibMCryptAndroid libMCryptAndroid = this.f29775a;
            if (libMCryptAndroid == null) {
                Intrinsics.throwUninitializedPropertyAccessException("encryption");
            }
            HostData hostDataEncryptHostData = libMCryptAndroid.encryptHostData(hostData, infoDataToCheck, keyTag);
            if (hostDataEncryptHostData != null) {
                return hostDataEncryptHostData;
            }
        }
        LibMCryptAndroid libMCryptAndroid2 = this.f29775a;
        if (libMCryptAndroid2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("encryption");
        }
        return libMCryptAndroid2.encryptHostData(hostData, infoDataToCheck);
    }

    @Nullable
    public final KpubData generateKpub(@Nullable String dataToKpubCheck) throws LibMCryptException {
        LibMCryptAndroid libMCryptAndroid = this.f29775a;
        if (libMCryptAndroid == null) {
            Intrinsics.throwUninitializedPropertyAccessException("encryption");
        }
        return libMCryptAndroid.generateKpub(dataToKpubCheck);
    }

    public final void init$encryption_release() throws LibMCryptException {
        this.f29775a = new LibMCryptAndroid(this.f29776b.getApplicationContext());
    }
}
