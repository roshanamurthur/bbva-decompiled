package com.bbva.localstorage.extension;

import android.security.keystore.KeyPermanentlyInvalidatedException;
import com.bbva.ethermobilesdk.cipher.biometrics.exception.BiometricCipherException;
import com.bbva.localstorage.exception.SecureBiometricStorageException;
import com.bbva.localstorage.model.SecureKeyOperation;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Throwable.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000*\n\u0010\u0006\"\u00020\u00072\u00020\u0007*\n\u0010\b\"\u00020\t2\u00020\t*\n\u0010\n\"\u00020\u000b2\u00020\u000b*\n\u0010\f\"\u00020\r2\u00020\r*\n\u0010\u000e\"\u00020\u000f2\u00020\u000f*\n\u0010\u0010\"\u00020\u00112\u00020\u0011*\n\u0010\u0012\"\u00020\u00132\u00020\u0013*\n\u0010\u0014\"\u00020\u00152\u00020\u0015*\n\u0010\u0016\"\u00020\u00172\u00020\u0017*\n\u0010\u0018\"\u00020\u00192\u00020\u0019*\n\u0010\u001a\"\u00020\u001b2\u00020\u001b*\n\u0010\u001c\"\u00020\u001d2\u00020\u001d*\n\u0010\u001e\"\u00020\u001f2\u00020\u001f*\n\u0010 \"\u00020!2\u00020!*\n\u0010\"\"\u00020#2\u00020#*\n\u0010$\"\u00020%2\u00020%*\n\u0010&\"\u00020'2\u00020'*\n\u0010(\"\u00020)2\u00020)¨\u0006*"}, d2 = {"manageSecureKeyOperationError", "", "", "secureKeyOperation", "Lcom/bbva/localstorage/model/SecureKeyOperation;", "throwError", "AndroidKeyPermanentlyInvalidatedException", "Landroid/security/keystore/KeyPermanentlyInvalidatedException;", "BiometricCanceled", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$Canceled;", "BiometricLockout", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$Lockout;", "BiometricLockoutPermanent", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$LockoutPermanent;", "BiometricNegativeButton", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$NegativeButton;", "BiometricNoDeviceCredential", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$NoDeviceCredential;", "BiometricNoSpace", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$NoSpace;", "BiometricSecurityUpdate", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$SecurityUpdate;", "BiometricTimeout", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$Timeout;", "BiometricUnableToProcess", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$UnableToProcess;", "BiometricUnsupported", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$Unsupported;", "BiometricUserCanceled", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$UserCanceled;", "BiometricVendor", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$Vendor;", "BiometricsCipherNotSupported", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$CipherNotSupported;", "BiometricsHwUnavailable", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$HwUnavailable;", "BiometricsNoHardware", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$NoHardware;", "BiometricsNoneEnrolled", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$NoneEnrolled;", "BiometricsUnknown", "Lcom/bbva/ethermobilesdk/cipher/biometrics/exception/BiometricCipherException$BiometricsException$Unknown;", "local-storage_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ThrowableKt {

    /* JADX INFO: compiled from: Throwable.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureKeyOperation.values().length];
            try {
                iArr[SecureKeyOperation.UNPROTECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureKeyOperation.PROTECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Void manageSecureKeyOperationError(@NotNull Throwable th2, @NotNull SecureKeyOperation secureKeyOperation) throws SecureBiometricStorageException.SecureKeyEncryption, SecureBiometricStorageException.SecureKeyDecryption {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(secureKeyOperation, "secureKeyOperation");
        int i10 = WhenMappings.$EnumSwitchMapping$0[secureKeyOperation.ordinal()];
        if (i10 == 1) {
            throw new SecureBiometricStorageException.SecureKeyDecryption(th2);
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        throw new SecureBiometricStorageException.SecureKeyEncryption(th2);
    }

    @NotNull
    public static final Void throwError(@NotNull Throwable th2, @NotNull SecureKeyOperation secureKeyOperation) throws Exception {
        Intrinsics.checkNotNullParameter(th2, "<this>");
        Intrinsics.checkNotNullParameter(secureKeyOperation, "secureKeyOperation");
        if (th2 instanceof BiometricCipherException.BadEncryptedData) {
            throw new SecureBiometricStorageException.SecureKeyDecryption(th2);
        }
        if (th2 instanceof BiometricCipherException.UnavailableKeyToDecrypt) {
            manageSecureKeyOperationError(th2, secureKeyOperation);
            throw new KotlinNothingValueException();
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.HwUnavailable) {
            BiometricCipherException.BiometricsException.HwUnavailable hwUnavailable = (BiometricCipherException.BiometricsException.HwUnavailable) th2;
            throw new SecureBiometricStorageException.BiometricsException.HwUnavailable(hwUnavailable.getState(), hwUnavailable.getBiometricType(), hwUnavailable.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.NoneEnrolled) {
            BiometricCipherException.BiometricsException.NoneEnrolled noneEnrolled = (BiometricCipherException.BiometricsException.NoneEnrolled) th2;
            throw new SecureBiometricStorageException.BiometricsException.NoneEnrolled(noneEnrolled.getState(), noneEnrolled.getBiometricType(), noneEnrolled.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.NoHardware) {
            BiometricCipherException.BiometricsException.NoHardware noHardware = (BiometricCipherException.BiometricsException.NoHardware) th2;
            throw new SecureBiometricStorageException.BiometricsException.NoHardware(noHardware.getState(), noHardware.getBiometricType(), noHardware.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.CipherNotSupported) {
            BiometricCipherException.BiometricsException.CipherNotSupported cipherNotSupported = (BiometricCipherException.BiometricsException.CipherNotSupported) th2;
            throw new SecureBiometricStorageException.BiometricsException.CipherNotSupported(cipherNotSupported.getState(), cipherNotSupported.getBiometricType(), cipherNotSupported.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.Unknown) {
            BiometricCipherException.BiometricsException.Unknown unknown = (BiometricCipherException.BiometricsException.Unknown) th2;
            throw new SecureBiometricStorageException.BiometricsException.BiometricUnknown(unknown.getState(), unknown.getBiometricType(), unknown.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.Unsupported) {
            BiometricCipherException.BiometricsException.Unsupported unsupported = (BiometricCipherException.BiometricsException.Unsupported) th2;
            throw new SecureBiometricStorageException.BiometricsException.Unsupported(unsupported.getState(), unsupported.getBiometricType(), unsupported.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.SecurityUpdate) {
            BiometricCipherException.BiometricsException.SecurityUpdate securityUpdate = (BiometricCipherException.BiometricsException.SecurityUpdate) th2;
            throw new SecureBiometricStorageException.BiometricsException.SecurityUpdate(securityUpdate.getState(), securityUpdate.getBiometricType(), securityUpdate.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.UnableToProcess) {
            BiometricCipherException.BiometricsException.UnableToProcess unableToProcess = (BiometricCipherException.BiometricsException.UnableToProcess) th2;
            throw new SecureBiometricStorageException.BiometricsException.UnableToProcess(unableToProcess.getState(), unableToProcess.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.Timeout) {
            BiometricCipherException.BiometricsException.Timeout timeout = (BiometricCipherException.BiometricsException.Timeout) th2;
            throw new SecureBiometricStorageException.BiometricsException.Timeout(timeout.getState(), timeout.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.NoSpace) {
            BiometricCipherException.BiometricsException.NoSpace noSpace = (BiometricCipherException.BiometricsException.NoSpace) th2;
            throw new SecureBiometricStorageException.BiometricsException.NoSpace(noSpace.getState(), noSpace.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.Canceled) {
            BiometricCipherException.BiometricsException.Canceled canceled = (BiometricCipherException.BiometricsException.Canceled) th2;
            throw new SecureBiometricStorageException.BiometricsException.Canceled(canceled.getState(), canceled.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.Lockout) {
            BiometricCipherException.BiometricsException.Lockout lockout = (BiometricCipherException.BiometricsException.Lockout) th2;
            throw new SecureBiometricStorageException.BiometricsException.Lockout(lockout.getState(), lockout.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.Vendor) {
            BiometricCipherException.BiometricsException.Vendor vendor = (BiometricCipherException.BiometricsException.Vendor) th2;
            throw new SecureBiometricStorageException.BiometricsException.Vendor(vendor.getState(), vendor.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.LockoutPermanent) {
            BiometricCipherException.BiometricsException.LockoutPermanent lockoutPermanent = (BiometricCipherException.BiometricsException.LockoutPermanent) th2;
            throw new SecureBiometricStorageException.BiometricsException.LockoutPermanent(lockoutPermanent.getState(), lockoutPermanent.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.UserCanceled) {
            BiometricCipherException.BiometricsException.UserCanceled userCanceled = (BiometricCipherException.BiometricsException.UserCanceled) th2;
            throw new SecureBiometricStorageException.BiometricsException.UserCanceled(userCanceled.getState(), userCanceled.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.NegativeButton) {
            BiometricCipherException.BiometricsException.NegativeButton negativeButton = (BiometricCipherException.BiometricsException.NegativeButton) th2;
            throw new SecureBiometricStorageException.BiometricsException.NegativeButton(negativeButton.getState(), negativeButton.getDescription());
        }
        if (th2 instanceof BiometricCipherException.BiometricsException.NoDeviceCredential) {
            BiometricCipherException.BiometricsException.NoDeviceCredential noDeviceCredential = (BiometricCipherException.BiometricsException.NoDeviceCredential) th2;
            throw new SecureBiometricStorageException.BiometricsException.NoDeviceCredential(noDeviceCredential.getState(), noDeviceCredential.getDescription());
        }
        if (!(th2 instanceof BiometricCipherException)) {
            manageSecureKeyOperationError(th2, secureKeyOperation);
            throw new KotlinNothingValueException();
        }
        if (th2.getCause() instanceof KeyPermanentlyInvalidatedException) {
            throw new SecureBiometricStorageException.KeyPermanentlyInvalidatedException(th2);
        }
        String message = th2.getMessage();
        if (message == null) {
            message = "";
        }
        throw new SecureBiometricStorageException.UnknownError(message, th2);
    }
}
