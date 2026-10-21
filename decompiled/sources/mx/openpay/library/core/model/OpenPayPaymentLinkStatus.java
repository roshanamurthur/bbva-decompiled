package mx.openpay.library.core.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/core/model/OpenPayPaymentLinkStatus;", "", "AVAILABLE", "EXPIRED", "CANCELLED", "PROCESSED", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayPaymentLinkStatus {
    private static final /* synthetic */ OpenPayPaymentLinkStatus[] $VALUES;
    public static final OpenPayPaymentLinkStatus AVAILABLE;
    public static final OpenPayPaymentLinkStatus CANCELLED;
    public static final OpenPayPaymentLinkStatus EXPIRED;
    public static final OpenPayPaymentLinkStatus PROCESSED;

    static {
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus = new OpenPayPaymentLinkStatus("AVAILABLE", 0);
        AVAILABLE = openPayPaymentLinkStatus;
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus2 = new OpenPayPaymentLinkStatus("EXPIRED", 1);
        EXPIRED = openPayPaymentLinkStatus2;
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus3 = new OpenPayPaymentLinkStatus("CANCELLED", 2);
        CANCELLED = openPayPaymentLinkStatus3;
        OpenPayPaymentLinkStatus openPayPaymentLinkStatus4 = new OpenPayPaymentLinkStatus("PROCESSED", 3);
        PROCESSED = openPayPaymentLinkStatus4;
        $VALUES = new OpenPayPaymentLinkStatus[]{openPayPaymentLinkStatus, openPayPaymentLinkStatus2, openPayPaymentLinkStatus3, openPayPaymentLinkStatus4};
    }

    public OpenPayPaymentLinkStatus() {
        throw null;
    }

    public static OpenPayPaymentLinkStatus valueOf(String str) {
        return (OpenPayPaymentLinkStatus) Enum.valueOf(OpenPayPaymentLinkStatus.class, str);
    }

    public static OpenPayPaymentLinkStatus[] values() {
        return (OpenPayPaymentLinkStatus[]) $VALUES.clone();
    }
}
