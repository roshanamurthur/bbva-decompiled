package mx.openpay.library.domain.model.eglobal;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: PaymentType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lmx/openpay/library/domain/model/eglobal/PaymentType;", "", "WITHOUT_INTEREST", "WITH_INTEREST", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class PaymentType {
    private static final /* synthetic */ PaymentType[] $VALUES;
    public static final PaymentType WITHOUT_INTEREST;
    public static final PaymentType WITH_INTEREST;

    static {
        PaymentType paymentType = new PaymentType("WITHOUT_INTEREST", 0);
        WITHOUT_INTEREST = paymentType;
        PaymentType paymentType2 = new PaymentType("WITH_INTEREST", 1);
        WITH_INTEREST = paymentType2;
        $VALUES = new PaymentType[]{paymentType, paymentType2};
    }

    public PaymentType() {
        throw null;
    }

    public static PaymentType valueOf(String str) {
        return (PaymentType) Enum.valueOf(PaymentType.class, str);
    }

    public static PaymentType[] values() {
        return (PaymentType[]) $VALUES.clone();
    }
}
