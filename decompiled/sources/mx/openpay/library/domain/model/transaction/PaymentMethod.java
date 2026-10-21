package mx.openpay.library.domain.model.transaction;

import kotlin.Metadata;
import mx.openpay.library.domain.util.Constant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: TransactionFilter.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/domain/model/transaction/PaymentMethod;", "", "CARD_PRESENT", "LINK_COBRO", "QR", Constant.CARD_METHOD, "domain_release"}, k = 1, mv = {1, 8, 0})
public final class PaymentMethod {
    private static final /* synthetic */ PaymentMethod[] $VALUES;
    public static final PaymentMethod CARD;
    public static final PaymentMethod CARD_PRESENT;
    public static final PaymentMethod LINK_COBRO;
    public static final PaymentMethod QR;

    static {
        PaymentMethod paymentMethod = new PaymentMethod("CARD_PRESENT", 0);
        CARD_PRESENT = paymentMethod;
        PaymentMethod paymentMethod2 = new PaymentMethod("LINK_COBRO", 1);
        LINK_COBRO = paymentMethod2;
        PaymentMethod paymentMethod3 = new PaymentMethod("QR", 2);
        QR = paymentMethod3;
        PaymentMethod paymentMethod4 = new PaymentMethod(Constant.CARD_METHOD, 3);
        CARD = paymentMethod4;
        $VALUES = new PaymentMethod[]{paymentMethod, paymentMethod2, paymentMethod3, paymentMethod4};
    }

    public PaymentMethod() {
        throw null;
    }

    public static PaymentMethod valueOf(String str) {
        return (PaymentMethod) Enum.valueOf(PaymentMethod.class, str);
    }

    public static PaymentMethod[] values() {
        return (PaymentMethod[]) $VALUES.clone();
    }
}
