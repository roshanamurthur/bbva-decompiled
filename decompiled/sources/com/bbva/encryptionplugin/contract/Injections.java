package com.bbva.encryptionplugin.contract;

import android.app.Application;
import com.bbva.ethermobilesdk.encryption.EncryptionApiClient;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Injections.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/bbva/encryptionplugin/contract/Injections;", "", "getEncryptionApiClient", "Lcom/bbva/ethermobilesdk/encryption/EncryptionApiClient;", Constants.APPLICATION, "Landroid/app/Application;", "encryption_plugin_release"}, k = 1, mv = {1, 1, 16})
public interface Injections {
    @NotNull
    EncryptionApiClient getEncryptionApiClient(@NotNull Application application);
}
