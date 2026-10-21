package mx.openpay.library.core.model;

import kotlin.Metadata;
import mx.openpay.library.domain.util.Constant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/core/model/OpenPayPaymentMethod;", "", "CARD_PRESENT", "LINK_COBRO", "QR", Constant.CARD_METHOD, "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayPaymentMethod {
    private static final /* synthetic */ OpenPayPaymentMethod[] $VALUES;
    public static final OpenPayPaymentMethod CARD;
    public static final OpenPayPaymentMethod CARD_PRESENT;
    public static final OpenPayPaymentMethod LINK_COBRO;
    public static final OpenPayPaymentMethod QR;

    static {
        OpenPayPaymentMethod openPayPaymentMethod = new OpenPayPaymentMethod("CARD_PRESENT", 0);
        CARD_PRESENT = openPayPaymentMethod;
        OpenPayPaymentMethod openPayPaymentMethod2 = new OpenPayPaymentMethod("LINK_COBRO", 1);
        LINK_COBRO = openPayPaymentMethod2;
        OpenPayPaymentMethod openPayPaymentMethod3 = new OpenPayPaymentMethod("QR", 2);
        QR = openPayPaymentMethod3;
        OpenPayPaymentMethod openPayPaymentMethod4 = new OpenPayPaymentMethod(Constant.CARD_METHOD, 3);
        CARD = openPayPaymentMethod4;
        $VALUES = new OpenPayPaymentMethod[]{openPayPaymentMethod, openPayPaymentMethod2, openPayPaymentMethod3, openPayPaymentMethod4};
    }

    public OpenPayPaymentMethod() {
        throw null;
    }

    public static OpenPayPaymentMethod valueOf(String str) {
        return (OpenPayPaymentMethod) Enum.valueOf(OpenPayPaymentMethod.class, str);
    }

    public static OpenPayPaymentMethod[] values() {
        return (OpenPayPaymentMethod[]) $VALUES.clone();
    }
}
