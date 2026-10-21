package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class RemotePaymentResultCode {
    private static final /* synthetic */ RemotePaymentResultCode[] $VALUES;
    public static final RemotePaymentResultCode DECLINED;
    public static final RemotePaymentResultCode ERROR_INVALID_INPUT;
    public static final RemotePaymentResultCode ERROR_UNEXPECTED_DATA;
    public static final RemotePaymentResultCode INTERNAL_ERROR;
    public static final RemotePaymentResultCode OK;

    static {
        RemotePaymentResultCode remotePaymentResultCode = new RemotePaymentResultCode("OK", 0);
        OK = remotePaymentResultCode;
        RemotePaymentResultCode remotePaymentResultCode2 = new RemotePaymentResultCode("INTERNAL_ERROR", 1);
        INTERNAL_ERROR = remotePaymentResultCode2;
        RemotePaymentResultCode remotePaymentResultCode3 = new RemotePaymentResultCode("ERROR_UNEXPECTED_DATA", 2);
        ERROR_UNEXPECTED_DATA = remotePaymentResultCode3;
        RemotePaymentResultCode remotePaymentResultCode4 = new RemotePaymentResultCode("ERROR_INVALID_INPUT", 3);
        ERROR_INVALID_INPUT = remotePaymentResultCode4;
        RemotePaymentResultCode remotePaymentResultCode5 = new RemotePaymentResultCode("DECLINED", 4);
        DECLINED = remotePaymentResultCode5;
        $VALUES = new RemotePaymentResultCode[]{remotePaymentResultCode, remotePaymentResultCode2, remotePaymentResultCode3, remotePaymentResultCode4, remotePaymentResultCode5};
    }

    public RemotePaymentResultCode() {
        throw null;
    }

    public static RemotePaymentResultCode valueOf(String str) {
        return (RemotePaymentResultCode) Enum.valueOf(RemotePaymentResultCode.class, str);
    }

    public static RemotePaymentResultCode[] values() {
        return (RemotePaymentResultCode[]) $VALUES.clone();
    }
}
