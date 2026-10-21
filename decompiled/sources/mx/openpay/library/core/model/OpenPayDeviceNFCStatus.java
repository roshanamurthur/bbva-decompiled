package mx.openpay.library.core.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/core/model/OpenPayDeviceNFCStatus;", "", "NO_NFC", "NFC_DISABLED", "NFC_ENABLED", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayDeviceNFCStatus {
    private static final /* synthetic */ OpenPayDeviceNFCStatus[] $VALUES;
    public static final OpenPayDeviceNFCStatus NFC_DISABLED;
    public static final OpenPayDeviceNFCStatus NFC_ENABLED;
    public static final OpenPayDeviceNFCStatus NO_NFC;

    static {
        OpenPayDeviceNFCStatus openPayDeviceNFCStatus = new OpenPayDeviceNFCStatus("NO_NFC", 0);
        NO_NFC = openPayDeviceNFCStatus;
        OpenPayDeviceNFCStatus openPayDeviceNFCStatus2 = new OpenPayDeviceNFCStatus("NFC_DISABLED", 1);
        NFC_DISABLED = openPayDeviceNFCStatus2;
        OpenPayDeviceNFCStatus openPayDeviceNFCStatus3 = new OpenPayDeviceNFCStatus("NFC_ENABLED", 2);
        NFC_ENABLED = openPayDeviceNFCStatus3;
        $VALUES = new OpenPayDeviceNFCStatus[]{openPayDeviceNFCStatus, openPayDeviceNFCStatus2, openPayDeviceNFCStatus3};
    }

    public OpenPayDeviceNFCStatus() {
        throw null;
    }

    public static OpenPayDeviceNFCStatus valueOf(String str) {
        return (OpenPayDeviceNFCStatus) Enum.valueOf(OpenPayDeviceNFCStatus.class, str);
    }

    public static OpenPayDeviceNFCStatus[] values() {
        return (OpenPayDeviceNFCStatus[]) $VALUES.clone();
    }
}
