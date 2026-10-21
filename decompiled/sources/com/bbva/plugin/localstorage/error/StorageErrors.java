package com.bbva.plugin.localstorage.error;

import androidx.room.RoomDatabase;
import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageErrors.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006%"}, d2 = {"Lcom/bbva/plugin/localstorage/error/StorageErrors;", "", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "message", "Ljava/lang/String;", "ErrorBiometricNoDeviceCredential", "ErrorBiometricUserCanceled", "ErrorNullKey", "ErrorJSONData", "ErrorBiometricCanceled", "ErrorKeyNotFound", "ErrorCipherFound", "ErrorUnknown", "ErrorInvalidAuthenticationType", "ErrorInvalidActivityType", "ErrorSecureKeyDecryption", "ErrorSecureKeyEncryption", "ErrorKeyPermanentlyInvalidated", "ErrorBiometricNoneEnrolled", "ErrorBiometricNoHardware", "ErrorBiometricCipherNotSupported", "ErrorBiometricUnknown", "ErrorBiometricUnsupported", "ErrorBiometricSecurityUpdate", "ErrorBiometricUnableToProcess", "ErrorBiometricTimeout", "ErrorBiometricNoSpace", "ErrorBiometricLockout", "ErrorBiometricVendor", "ErrorBiometricLockoutPermanent", "ErrorBiometricNegativeButton", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0})
public enum StorageErrors implements ErrorMessage {
    ErrorBiometricNoDeviceCredential(-20, "Biometry not enrolled"),
    ErrorBiometricUserCanceled(-2, "User cancel"),
    ErrorNullKey(843, "Null key"),
    ErrorJSONData(844, ""),
    ErrorBiometricCanceled(972, "The operation was canceled because the biometric sensor is unavailable"),
    ErrorKeyNotFound(RoomDatabase.MAX_BIND_PARAMETER_CNT, "Error: can't extract a non-existent object from local storage"),
    ErrorCipherFound(998, "Trying to encrypt or decrypt a value but the cipher is absent"),
    ErrorUnknown(ReturnCode.ERR_INIT, "An unknown error has been occurred"),
    ErrorInvalidAuthenticationType(ReturnCode.ERR_INIT_GENERAL, "Invalid authenticator type"),
    ErrorInvalidActivityType(ReturnCode.ERR_INIT_BAD_PARAMS, "A FragmentActivity is required"),
    ErrorSecureKeyDecryption(ReturnCode.ERR_INIT_NODEVICEUID, "A problem has just occur decrypting secure key"),
    ErrorSecureKeyEncryption(ReturnCode.ERR_INIT_DEVICEID_ALREADY_DEFINED, "A problem has just occur creating secure key"),
    ErrorKeyPermanentlyInvalidated(ReturnCode.ERR_INIT_INVALID_CUSTOM_ID, "Keystore key is permanently invalidated"),
    ErrorBiometricNoneEnrolled(1106, "Biometric data is not enrolled"),
    ErrorBiometricNoHardware(1107, "Biometric hardware is not present"),
    ErrorBiometricCipherNotSupported(1108, "Device does not support cipher biometric"),
    ErrorBiometricUnknown(1109, "Biometric error unknown"),
    ErrorBiometricUnsupported(1110, "Biometric is not supported"),
    ErrorBiometricSecurityUpdate(1111, "Biometric need security update"),
    ErrorBiometricUnableToProcess(1112, "Sensor was unable to process the current image"),
    ErrorBiometricTimeout(1113, "The current operation has been running too long and has timed out"),
    ErrorBiometricNoSpace(1114, "The operation can't be completed because there is not enough device storage remaining"),
    ErrorBiometricLockout(1115, "The operation was canceled because the API is locked out due to too many attempts"),
    ErrorBiometricVendor(1116, "The operation failed due to a vendor-specific error"),
    ErrorBiometricLockoutPermanent(1117, "The operation was canceled because ERROR_LOCKOUT occurred too many times. Biometric authentication is disabled until the user unlocks with their device credential"),
    ErrorBiometricNegativeButton(1118, "The user pressed the negative button");

    private final int code;

    @NotNull
    private final String message;

    StorageErrors(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    public int getCode() {
        return this.code;
    }

    @Override // com.bbva.androidtoolkit.plugin.response.ErrorMessage
    @NotNull
    public String getMessage() {
        return this.message;
    }
}
