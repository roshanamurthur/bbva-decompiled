package mx.openpay.library.core.model.extra;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/core/model/extra/PaymentLinkStatusFilter;", "", "CANCELLED", "AVAILABLE", "PROCESSED", "EXPIRED", "library_release"}, k = 1, mv = {1, 8, 0})
public final class PaymentLinkStatusFilter {
    private static final /* synthetic */ PaymentLinkStatusFilter[] $VALUES;
    public static final PaymentLinkStatusFilter AVAILABLE;
    public static final PaymentLinkStatusFilter CANCELLED;
    public static final PaymentLinkStatusFilter EXPIRED;
    public static final PaymentLinkStatusFilter PROCESSED;

    static {
        PaymentLinkStatusFilter paymentLinkStatusFilter = new PaymentLinkStatusFilter("CANCELLED", 0);
        CANCELLED = paymentLinkStatusFilter;
        PaymentLinkStatusFilter paymentLinkStatusFilter2 = new PaymentLinkStatusFilter("AVAILABLE", 1);
        AVAILABLE = paymentLinkStatusFilter2;
        PaymentLinkStatusFilter paymentLinkStatusFilter3 = new PaymentLinkStatusFilter("PROCESSED", 2);
        PROCESSED = paymentLinkStatusFilter3;
        PaymentLinkStatusFilter paymentLinkStatusFilter4 = new PaymentLinkStatusFilter("EXPIRED", 3);
        EXPIRED = paymentLinkStatusFilter4;
        $VALUES = new PaymentLinkStatusFilter[]{paymentLinkStatusFilter, paymentLinkStatusFilter2, paymentLinkStatusFilter3, paymentLinkStatusFilter4};
    }

    public PaymentLinkStatusFilter() {
        throw null;
    }

    public static PaymentLinkStatusFilter valueOf(String str) {
        return (PaymentLinkStatusFilter) Enum.valueOf(PaymentLinkStatusFilter.class, str);
    }

    public static PaymentLinkStatusFilter[] values() {
        return (PaymentLinkStatusFilter[]) $VALUES.clone();
    }
}
