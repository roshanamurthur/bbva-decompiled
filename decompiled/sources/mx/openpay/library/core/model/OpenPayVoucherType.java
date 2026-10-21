package mx.openpay.library.core.model;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/core/model/OpenPayVoucherType;", "", "PURCHASE", "REFUND", "ANNULMENT", "PREAUTHORIZED", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OpenPayVoucherType {
    private static final /* synthetic */ OpenPayVoucherType[] $VALUES;
    public static final OpenPayVoucherType ANNULMENT;
    public static final OpenPayVoucherType PREAUTHORIZED;
    public static final OpenPayVoucherType PURCHASE;
    public static final OpenPayVoucherType REFUND;

    static {
        OpenPayVoucherType openPayVoucherType = new OpenPayVoucherType("PURCHASE", 0);
        PURCHASE = openPayVoucherType;
        OpenPayVoucherType openPayVoucherType2 = new OpenPayVoucherType("REFUND", 1);
        REFUND = openPayVoucherType2;
        OpenPayVoucherType openPayVoucherType3 = new OpenPayVoucherType("ANNULMENT", 2);
        ANNULMENT = openPayVoucherType3;
        OpenPayVoucherType openPayVoucherType4 = new OpenPayVoucherType("PREAUTHORIZED", 3);
        PREAUTHORIZED = openPayVoucherType4;
        $VALUES = new OpenPayVoucherType[]{openPayVoucherType, openPayVoucherType2, openPayVoucherType3, openPayVoucherType4};
    }

    public OpenPayVoucherType() {
        throw null;
    }

    public static OpenPayVoucherType valueOf(String str) {
        return (OpenPayVoucherType) Enum.valueOf(OpenPayVoucherType.class, str);
    }

    public static OpenPayVoucherType[] values() {
        return (OpenPayVoucherType[]) $VALUES.clone();
    }
}
