package com.viergegroup.sdk.taptophone;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/viergegroup/sdk/taptophone/DeviceNfcStatus;", "", "NO_NFC", "NFC_DISABLED", "NFC_ENABLED", "PinPadSdk1032_1.0.32E_release"}, k = 1, mv = {1, 8, 0})
public final class DeviceNfcStatus {
    private static final /* synthetic */ DeviceNfcStatus[] AssetInjection;
    public static final DeviceNfcStatus NFC_DISABLED;
    public static final DeviceNfcStatus NFC_ENABLED;
    public static final DeviceNfcStatus NO_NFC;

    static {
        DeviceNfcStatus deviceNfcStatus = new DeviceNfcStatus("NO_NFC", 0);
        NO_NFC = deviceNfcStatus;
        DeviceNfcStatus deviceNfcStatus2 = new DeviceNfcStatus("NFC_DISABLED", 1);
        NFC_DISABLED = deviceNfcStatus2;
        DeviceNfcStatus deviceNfcStatus3 = new DeviceNfcStatus("NFC_ENABLED", 2);
        NFC_ENABLED = deviceNfcStatus3;
        AssetInjection = new DeviceNfcStatus[]{deviceNfcStatus, deviceNfcStatus2, deviceNfcStatus3};
    }

    public DeviceNfcStatus() {
        throw null;
    }

    public static DeviceNfcStatus valueOf(String str) {
        return (DeviceNfcStatus) Enum.valueOf(DeviceNfcStatus.class, str);
    }

    public static DeviceNfcStatus[] values() {
        return (DeviceNfcStatus[]) AssetInjection.clone();
    }
}
