package com.bbva.plugin.localstorage.extension;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.localstorage.exception.SecureBiometricStorageException;
import com.bbva.plugin.localstorage.error.StorageErrors;
import com.bbva.plugin.localstorage.exception.IllegalActivityType;
import com.bbva.plugin.localstorage.exception.IllegalAuthenticationType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Throwable.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"manageException", "", "", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "local-storage-plugin_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ThrowableKt {
    public static final void manageException(@NotNull Throwable th2, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (th2 instanceof UnsupportedOperationException) {
            callback.sendError(StorageErrors.ErrorCipherFound);
            return;
        }
        if (th2 instanceof IllegalAuthenticationType) {
            callback.sendError(StorageErrors.ErrorInvalidAuthenticationType);
            return;
        }
        if (th2 instanceof IllegalActivityType) {
            callback.sendError(StorageErrors.ErrorInvalidActivityType);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.SecureKeyDecryption) {
            callback.sendError(StorageErrors.ErrorSecureKeyDecryption);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.SecureKeyEncryption) {
            callback.sendError(StorageErrors.ErrorSecureKeyEncryption);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.KeyPermanentlyInvalidatedException) {
            callback.sendError(StorageErrors.ErrorKeyPermanentlyInvalidated);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.SecureDataStorageNotFound) {
            callback.sendError(StorageErrors.ErrorKeyNotFound);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.UnknownError) {
            callback.sendError(StorageErrors.ErrorUnknown);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.HwUnavailable) {
            callback.sendError(StorageErrors.ErrorKeyNotFound);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.NoneEnrolled) {
            callback.sendError(StorageErrors.ErrorBiometricNoneEnrolled);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.NoHardware) {
            callback.sendError(StorageErrors.ErrorBiometricNoHardware);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.CipherNotSupported) {
            callback.sendError(StorageErrors.ErrorBiometricCipherNotSupported);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.BiometricUnknown) {
            callback.sendError(StorageErrors.ErrorBiometricUnknown);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.Unsupported) {
            callback.sendError(StorageErrors.ErrorBiometricUnsupported);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.SecurityUpdate) {
            callback.sendError(StorageErrors.ErrorBiometricSecurityUpdate);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.UnableToProcess) {
            callback.sendError(StorageErrors.ErrorBiometricUnableToProcess);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.Timeout) {
            callback.sendError(StorageErrors.ErrorBiometricTimeout);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.NoSpace) {
            callback.sendError(StorageErrors.ErrorBiometricNoSpace);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.Canceled) {
            callback.sendError(StorageErrors.ErrorBiometricCanceled);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.Lockout) {
            callback.sendError(StorageErrors.ErrorBiometricLockout);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.Vendor) {
            callback.sendError(StorageErrors.ErrorBiometricVendor);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.LockoutPermanent) {
            callback.sendError(StorageErrors.ErrorBiometricLockoutPermanent);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.UserCanceled) {
            callback.sendError(StorageErrors.ErrorBiometricUserCanceled);
            return;
        }
        if (th2 instanceof SecureBiometricStorageException.BiometricsException.NegativeButton) {
            callback.sendError(StorageErrors.ErrorBiometricNegativeButton);
        } else if (th2 instanceof SecureBiometricStorageException.BiometricsException.NoDeviceCredential) {
            callback.sendError(StorageErrors.ErrorBiometricNoDeviceCredential);
        } else {
            callback.sendError(Errors.ErrorDefault);
        }
    }
}
