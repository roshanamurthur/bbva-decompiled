package com.bbva.ethermobilesdk.plugin.devicemanager.error;

import com.bbva.androidtoolkit.plugin.response.ErrorMessage;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 com.bbva.ethermobilesdk.plugin.devicemanager.error.DeviceManagerErrors[], still in use, count: 1, list:
  (r2v3 com.bbva.ethermobilesdk.plugin.devicemanager.error.DeviceManagerErrors[]) from 0x0025: INVOKE (r2v3 com.bbva.ethermobilesdk.plugin.devicemanager.error.DeviceManagerErrors[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:38)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: DeviceManagerErrors.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/bbva/ethermobilesdk/plugin/devicemanager/error/DeviceManagerErrors;", "Lcom/bbva/androidtoolkit/plugin/response/ErrorMessage;", "", "", "getCode", "", "getMessage", "code", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "message", "Ljava/lang/String;", "ErrorRetrievingGlobalResponseDeviceId", "ErrorRetrievingLocalResponseDeviceId", "devicemanager-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class DeviceManagerErrors implements ErrorMessage {
    ErrorRetrievingGlobalResponseDeviceId(ReturnCode.ERR_INIT_GENERAL, "Error retrieving global response from Device Id"),
    ErrorRetrievingLocalResponseDeviceId(ReturnCode.ERR_INIT_BAD_PARAMS, "Error retrieving local response from Device Id. Invalid Device Id");

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private final int code;

    @NotNull
    private final String message;

    static {
        $ENTRIES = EnumEntriesKt.enumEntries(deviceManagerErrorsArr);
    }

    public DeviceManagerErrors(int i10, String str) {
        super(str, i);
        this.code = i10;
        this.message = str;
    }

    @NotNull
    public static EnumEntries<DeviceManagerErrors> getEntries() {
        return $ENTRIES;
    }

    public static DeviceManagerErrors valueOf(String str) {
        return (DeviceManagerErrors) Enum.valueOf(DeviceManagerErrors.class, str);
    }

    public static DeviceManagerErrors[] values() {
        return (DeviceManagerErrors[]) $VALUES.clone();
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
