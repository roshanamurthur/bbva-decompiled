package mx.openpay.library.domain.model.taponphone;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: DeviceNFCStatus.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/domain/model/taponphone/DeviceNFCStatus;", "", "NO_NFC", "NFC_DISABLED", "NFC_ENABLED", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceNFCStatus {
    private static final /* synthetic */ DeviceNFCStatus[] $VALUES;
    public static final DeviceNFCStatus NFC_DISABLED;
    public static final DeviceNFCStatus NFC_ENABLED;
    public static final DeviceNFCStatus NO_NFC;

    static {
        DeviceNFCStatus deviceNFCStatus = new DeviceNFCStatus("NO_NFC", 0);
        NO_NFC = deviceNFCStatus;
        DeviceNFCStatus deviceNFCStatus2 = new DeviceNFCStatus("NFC_DISABLED", 1);
        NFC_DISABLED = deviceNFCStatus2;
        DeviceNFCStatus deviceNFCStatus3 = new DeviceNFCStatus("NFC_ENABLED", 2);
        NFC_ENABLED = deviceNFCStatus3;
        $VALUES = new DeviceNFCStatus[]{deviceNFCStatus, deviceNFCStatus2, deviceNFCStatus3};
    }

    public DeviceNFCStatus() {
        throw null;
    }

    public static DeviceNFCStatus valueOf(String str) {
        return (DeviceNFCStatus) Enum.valueOf(DeviceNFCStatus.class, str);
    }

    public static DeviceNFCStatus[] values() {
        return (DeviceNFCStatus[]) $VALUES.clone();
    }
}
