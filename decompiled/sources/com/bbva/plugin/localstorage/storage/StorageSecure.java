package com.bbva.plugin.localstorage.storage;

import android.content.Context;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.localstorage.model.BiometricsStorageData;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SecureStorage.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\tH&J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003H&J)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lcom/bbva/plugin/localstorage/storage/StorageSecure;", "", "get", "", "key", "biometricsStorageData", "Lcom/bbva/localstorage/model/BiometricsStorageData;", "(Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isBiometricAvailable", "", "context", "Landroid/content/Context;", Constants.authenticationType, "Lcom/bbva/biometrics/authenticator/data/AuthenticationType;", "isSecureHardware", RemoveCommand.ID, "", "save", "value", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StorageSecure {
    @Nullable
    Object get(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super String> continuation);

    boolean isBiometricAvailable(@NotNull Context context, @NotNull AuthenticationType authenticationType);

    boolean isSecureHardware();

    void remove(@NotNull String key);

    @Nullable
    Object save(@NotNull String str, @NotNull String str2, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Unit> continuation);
}
