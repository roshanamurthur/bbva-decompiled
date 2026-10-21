package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ProductType {
    private static final /* synthetic */ ProductType[] $VALUES;
    public static final ProductType CREDIT;
    public static final ProductType DEBIT;
    public static final ProductType UNKNOWN;

    static {
        ProductType productType = new ProductType("CREDIT", 0);
        CREDIT = productType;
        ProductType productType2 = new ProductType("DEBIT", 1);
        DEBIT = productType2;
        ProductType productType3 = new ProductType("UNKNOWN", 2);
        UNKNOWN = productType3;
        $VALUES = new ProductType[]{productType, productType2, productType3};
    }

    public ProductType() {
        throw null;
    }

    public static ProductType a(byte[] bArr) {
        if (bArr == null) {
            return UNKNOWN;
        }
        String lowerCase = new String(bArr).toLowerCase();
        if (lowerCase.equalsIgnoreCase("mastercard")) {
            return CREDIT;
        }
        return (lowerCase.contains("maestro") || lowerCase.contains("debit")) ? DEBIT : UNKNOWN;
    }

    public static ProductType valueOf(String str) {
        return (ProductType) Enum.valueOf(ProductType.class, str);
    }

    public static ProductType[] values() {
        return (ProductType[]) $VALUES.clone();
    }
}
