package com.bbva.localstorage.storage;

import android.content.Context;
import com.bbva.biometrics.authenticator.data.AuthenticationType;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.localstorage.model.BiometricsStorageData;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.plugin.localstorage.command.SetCommand;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StorageSecure.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J'\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ'\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H&J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u001c\u001a\u00020\u0006H&J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJ/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010 J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010!J/\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010\"J1\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH¦@ø\u0001\u0000¢\u0006\u0002\u0010#\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/bbva/localstorage/storage/StorageSecure;", "", "getBoolean", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "key", "", "biometricsStorageData", "Lcom/bbva/localstorage/model/BiometricsStorageData;", "(Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFloat", "", "getInt", "", "getLong", "", "getString", "isBiometricAvailable", "context", "Landroid/content/Context;", Constants.authenticationType, "Lcom/bbva/biometrics/authenticator/data/AuthenticationType;", "isSecureHardware", "keys", "", RemoveCommand.ID, "", "removeAlias", "secureKey", SetCommand.ID, "value", "(Ljava/lang/String;ZLcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;FLcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;ILcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;JLcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/localstorage/model/BiometricsStorageData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "local-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StorageSecure {
    @Nullable
    Object getBoolean(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Boolean>> continuation);

    @Nullable
    Object getFloat(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Float>> continuation);

    @Nullable
    Object getInt(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Integer>> continuation);

    @Nullable
    Object getLong(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Long>> continuation);

    @Nullable
    Object getString(@NotNull String str, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<String>> continuation);

    @NotNull
    Result<Boolean> isBiometricAvailable(@NotNull Context context, @NotNull AuthenticationType authenticationType);

    @NotNull
    Result<Boolean> isSecureHardware();

    @NotNull
    Set<String> keys();

    void remove(@NotNull String key);

    @NotNull
    Result<Unit> removeAlias(@NotNull String secureKey);

    @Nullable
    Object set(@NotNull String str, float f6, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    Object set(@NotNull String str, int i10, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    Object set(@NotNull String str, long j10, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    Object set(@NotNull String str, @Nullable String str2, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation);

    @Nullable
    Object set(@NotNull String str, boolean z10, @NotNull BiometricsStorageData biometricsStorageData, @NotNull Continuation<? super Result<Unit>> continuation);
}
