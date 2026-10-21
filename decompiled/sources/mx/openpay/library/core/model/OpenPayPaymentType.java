package mx.openpay.library.core.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lmx/openpay/library/core/model/OpenPayPaymentType;", "", "WITHOUT_INTEREST", "WITH_INTEREST", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayPaymentType {
    private static final /* synthetic */ OpenPayPaymentType[] $VALUES;
    public static final OpenPayPaymentType WITHOUT_INTEREST;
    public static final OpenPayPaymentType WITH_INTEREST;

    static {
        OpenPayPaymentType openPayPaymentType = new OpenPayPaymentType("WITHOUT_INTEREST", 0);
        WITHOUT_INTEREST = openPayPaymentType;
        OpenPayPaymentType openPayPaymentType2 = new OpenPayPaymentType("WITH_INTEREST", 1);
        WITH_INTEREST = openPayPaymentType2;
        $VALUES = new OpenPayPaymentType[]{openPayPaymentType, openPayPaymentType2};
    }

    public OpenPayPaymentType() {
        throw null;
    }

    public static OpenPayPaymentType valueOf(String str) {
        return (OpenPayPaymentType) Enum.valueOf(OpenPayPaymentType.class, str);
    }

    public static OpenPayPaymentType[] values() {
        return (OpenPayPaymentType[]) $VALUES.clone();
    }
}
