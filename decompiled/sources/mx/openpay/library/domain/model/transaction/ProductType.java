package mx.openpay.library.domain.model.transaction;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: ProductType.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/domain/model/transaction/ProductType;", "", "TAP_ON_PHONE", "MPOS", "PAYMENT_LINK", "domain_release"}, k = 1, mv = {1, 8, 0})
public final class ProductType {
    private static final /* synthetic */ ProductType[] $VALUES;
    public static final ProductType MPOS;
    public static final ProductType PAYMENT_LINK;
    public static final ProductType TAP_ON_PHONE;

    static {
        ProductType productType = new ProductType("TAP_ON_PHONE", 0);
        TAP_ON_PHONE = productType;
        ProductType productType2 = new ProductType("MPOS", 1);
        MPOS = productType2;
        ProductType productType3 = new ProductType("PAYMENT_LINK", 2);
        PAYMENT_LINK = productType3;
        $VALUES = new ProductType[]{productType, productType2, productType3};
    }

    public ProductType() {
        throw null;
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
