package mx.openpay.library.domain.model.link;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PaymentLink.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/domain/model/link/PaymentLinkStatus;", "", "AVAILABLE", "EXPIRED", "CANCELLED", "PROCESSED", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class PaymentLinkStatus {
    private static final /* synthetic */ PaymentLinkStatus[] $VALUES;
    public static final PaymentLinkStatus AVAILABLE;
    public static final PaymentLinkStatus CANCELLED;
    public static final PaymentLinkStatus EXPIRED;
    public static final PaymentLinkStatus PROCESSED;

    static {
        PaymentLinkStatus paymentLinkStatus = new PaymentLinkStatus("AVAILABLE", 0);
        AVAILABLE = paymentLinkStatus;
        PaymentLinkStatus paymentLinkStatus2 = new PaymentLinkStatus("EXPIRED", 1);
        EXPIRED = paymentLinkStatus2;
        PaymentLinkStatus paymentLinkStatus3 = new PaymentLinkStatus("CANCELLED", 2);
        CANCELLED = paymentLinkStatus3;
        PaymentLinkStatus paymentLinkStatus4 = new PaymentLinkStatus("PROCESSED", 3);
        PROCESSED = paymentLinkStatus4;
        $VALUES = new PaymentLinkStatus[]{paymentLinkStatus, paymentLinkStatus2, paymentLinkStatus3, paymentLinkStatus4};
    }

    public PaymentLinkStatus() {
        throw null;
    }

    public static PaymentLinkStatus valueOf(String str) {
        return (PaymentLinkStatus) Enum.valueOf(PaymentLinkStatus.class, str);
    }

    public static PaymentLinkStatus[] values() {
        return (PaymentLinkStatus[]) $VALUES.clone();
    }
}
