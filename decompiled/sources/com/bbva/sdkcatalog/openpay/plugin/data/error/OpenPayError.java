package com.bbva.sdkcatalog.openpay.plugin.data.error;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenPayError.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0006H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0012"}, d2 = {"Lcom/bbva/sdkcatalog/openpay/plugin/data/error/OpenPayError;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "code", "", "message", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "ErrorGeneric", "ErrorIncorrectParameters", "ErrorInitOpenPay", "ErrorBluetoothOff", "ErrorLocationDisabled", "ErrorBluetoothPermission", "ErrorStoragePermission", "getCode", "getMessage", "openpay-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public enum OpenPayError implements ErrorMessage {
    ErrorGeneric(0, ErrorMessages.GENERIC),
    ErrorIncorrectParameters(1, ErrorMessages.INCORRECT_PARAMETERS),
    ErrorInitOpenPay(100, ErrorMessages.INIT),
    ErrorBluetoothOff(702, ErrorMessages.BLUETOOTH_DISABLED),
    ErrorLocationDisabled(720, ErrorMessages.LOCATION_PERMISSION),
    ErrorBluetoothPermission(ErrorCodes.BLUETOOTH_PERMISSION, ErrorMessages.BLUETOOTH_PERMISSION),
    ErrorStoragePermission(ErrorCodes.STORAGE_PERMISSION, ErrorMessages.STORAGE_PERMISSION);

    private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());
    private final int code;

    @NotNull
    private final String message;

    OpenPayError(int i10, String str) {
        this.code = i10;
        this.message = str;
    }

    @NotNull
    public static EnumEntries<OpenPayError> getEntries() {
        return $ENTRIES;
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
