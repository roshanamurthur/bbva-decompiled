package com.bbva.encryptionplugin;

import android.app.Application;
import android.content.Context;
import com.bbva.encryptionplugin.contract.Injections;
import com.bbva.ethermobilesdk.encryption.EncryptionApi;
import com.bbva.ethermobilesdk.encryption.EncryptionApiClient;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InjectionsImpl.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0005\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/bbva/encryptionplugin/InjectionsImpl;", "Lcom/bbva/encryptionplugin/contract/Injections;", "Landroid/app/Application;", Constants.APPLICATION, "Lcom/bbva/ethermobilesdk/encryption/EncryptionApiClient;", "getEncryptionApiClient", "a", "Lcom/bbva/ethermobilesdk/encryption/EncryptionApiClient;", "()Lcom/bbva/ethermobilesdk/encryption/EncryptionApiClient;", "setEncryptionApiClient", "(Lcom/bbva/ethermobilesdk/encryption/EncryptionApiClient;)V", "encryptionApiClient", "<init>", "()V", "encryption_plugin_release"}, k = 1, mv = {1, 4, 0})
public final class InjectionsImpl implements Injections {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public EncryptionApiClient encryptionApiClient;

    @Nullable
    public final EncryptionApiClient getEncryptionApiClient() {
        return this.encryptionApiClient;
    }

    public final void setEncryptionApiClient(@Nullable EncryptionApiClient encryptionApiClient) {
        this.encryptionApiClient = encryptionApiClient;
    }

    @Override // com.bbva.encryptionplugin.contract.Injections
    @NotNull
    public EncryptionApiClient getEncryptionApiClient(@NotNull Application application) {
        if (this.encryptionApiClient == null) {
            this.encryptionApiClient = new EncryptionApi().createClient((Context) application);
        }
        EncryptionApiClient encryptionApiClient = this.encryptionApiClient;
        if (encryptionApiClient == null) {
            Intrinsics.throwNpe();
        }
        return encryptionApiClient;
    }
}
