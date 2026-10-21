package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionRange {
    private static final /* synthetic */ TransactionRange[] $VALUES;
    public static final TransactionRange HIGH_VALUE;
    public static final TransactionRange LOW_VALUE;
    public static final TransactionRange UNKNOWN;

    static {
        TransactionRange transactionRange = new TransactionRange("LOW_VALUE", 0);
        LOW_VALUE = transactionRange;
        TransactionRange transactionRange2 = new TransactionRange("HIGH_VALUE", 1);
        HIGH_VALUE = transactionRange2;
        TransactionRange transactionRange3 = new TransactionRange("UNKNOWN", 2);
        UNKNOWN = transactionRange3;
        $VALUES = new TransactionRange[]{transactionRange, transactionRange2, transactionRange3};
    }

    public TransactionRange() {
        throw null;
    }

    public static TransactionRange valueOf(String str) {
        return (TransactionRange) Enum.valueOf(TransactionRange.class, str);
    }

    public static TransactionRange[] values() {
        return (TransactionRange[]) $VALUES.clone();
    }
}
