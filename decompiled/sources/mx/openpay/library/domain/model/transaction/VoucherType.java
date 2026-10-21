package mx.openpay.library.domain.model.transaction;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: VoucherType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lmx/openpay/library/domain/model/transaction/VoucherType;", "", "PURCHASE", "REFUND", "ANNULMENT", "PREAUTHORIZED", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class VoucherType {
    private static final /* synthetic */ VoucherType[] $VALUES;
    public static final VoucherType ANNULMENT;
    public static final VoucherType PREAUTHORIZED;
    public static final VoucherType PURCHASE;
    public static final VoucherType REFUND;

    static {
        VoucherType voucherType = new VoucherType("PURCHASE", 0);
        PURCHASE = voucherType;
        VoucherType voucherType2 = new VoucherType("REFUND", 1);
        REFUND = voucherType2;
        VoucherType voucherType3 = new VoucherType("ANNULMENT", 2);
        ANNULMENT = voucherType3;
        VoucherType voucherType4 = new VoucherType("PREAUTHORIZED", 3);
        PREAUTHORIZED = voucherType4;
        $VALUES = new VoucherType[]{voucherType, voucherType2, voucherType3, voucherType4};
    }

    public VoucherType() {
        throw null;
    }

    public static VoucherType valueOf(String str) {
        return (VoucherType) Enum.valueOf(VoucherType.class, str);
    }

    public static VoucherType[] values() {
        return (VoucherType[]) $VALUES.clone();
    }
}
