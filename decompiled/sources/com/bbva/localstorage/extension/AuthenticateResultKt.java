package com.bbva.localstorage.extension;

import com.bbva.biometrics.authenticator.data.AuthenticateResult;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.localstorage.exception.SecureBiometricStorageException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AuthenticateResult.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0000¨\u0006\u0004"}, d2 = {"toResult", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "Lcom/bbva/biometrics/authenticator/data/AuthenticateResult;", "local-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class AuthenticateResultKt {
    @NotNull
    public static final Result<Boolean> toResult(@NotNull AuthenticateResult authenticateResult) {
        Result.Error error;
        Intrinsics.checkNotNullParameter(authenticateResult, "<this>");
        if (authenticateResult instanceof AuthenticateResult.Success) {
            return new Result.Success(Boolean.TRUE);
        }
        if (authenticateResult instanceof AuthenticateResult.HwUnavailable) {
            error = new Result.Error(new SecureBiometricStorageException.BiometricsException.HwUnavailable(authenticateResult.getState(), authenticateResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), authenticateResult.getDescription()));
        } else if (authenticateResult instanceof AuthenticateResult.NoneEnrolled) {
            error = new Result.Error(new SecureBiometricStorageException.BiometricsException.NoneEnrolled(authenticateResult.getState(), authenticateResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), authenticateResult.getDescription()));
        } else if (authenticateResult instanceof AuthenticateResult.NoHardware) {
            error = new Result.Error(new SecureBiometricStorageException.BiometricsException.NoHardware(authenticateResult.getState(), authenticateResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), authenticateResult.getDescription()));
        } else if (authenticateResult instanceof AuthenticateResult.CipherNotSupported) {
            error = new Result.Error(new SecureBiometricStorageException.BiometricsException.CipherNotSupported(authenticateResult.getState(), authenticateResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), authenticateResult.getDescription()));
        } else if (authenticateResult instanceof AuthenticateResult.Unknown) {
            error = new Result.Error(new SecureBiometricStorageException.BiometricsException.BiometricUnknown(authenticateResult.getState(), authenticateResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), authenticateResult.getDescription()));
        } else if (authenticateResult instanceof AuthenticateResult.Unsupported) {
            error = new Result.Error(new SecureBiometricStorageException.BiometricsException.Unsupported(authenticateResult.getState(), authenticateResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), authenticateResult.getDescription()));
        } else {
            if (!(authenticateResult instanceof AuthenticateResult.SecurityUpdate)) {
                throw new NoWhenBranchMatchedException();
            }
            error = new Result.Error(new SecureBiometricStorageException.BiometricsException.SecurityUpdate(authenticateResult.getState(), authenticateResult.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String(), authenticateResult.getDescription()));
        }
        return error;
    }
}
