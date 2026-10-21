package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionType {
    private static final /* synthetic */ TransactionType[] $VALUES;
    public static final TransactionType CASH_OR_CASH_BACK;
    public static final char MERCHANT_CATEGORY_CODE_TRANSIT_4111 = 16657;
    public static final char MERCHANT_CATEGORY_CODE_TRANSIT_4131 = 16689;
    public static final char MERCHANT_CATEGORY_CODE_TRANSIT_4784 = 18308;
    public static final char MERCHANT_CATEGORY_CODE_TRANSIT_7523 = 29987;
    public static final TransactionType PURCHASE;
    public static final TransactionType REFUND;
    public static final TransactionType TRANSIT;
    public static final TransactionType UNKNOWN;

    static {
        TransactionType transactionType = new TransactionType("PURCHASE", 0);
        PURCHASE = transactionType;
        TransactionType transactionType2 = new TransactionType("REFUND", 1);
        REFUND = transactionType2;
        TransactionType transactionType3 = new TransactionType("CASH_OR_CASH_BACK", 2);
        CASH_OR_CASH_BACK = transactionType3;
        TransactionType transactionType4 = new TransactionType("TRANSIT", 3);
        TRANSIT = transactionType4;
        TransactionType transactionType5 = new TransactionType("UNKNOWN", 4);
        UNKNOWN = transactionType5;
        $VALUES = new TransactionType[]{transactionType, transactionType2, transactionType3, transactionType4, transactionType5};
    }

    public TransactionType() {
        throw null;
    }

    public static TransactionType of(byte b10, byte[] bArr, byte[] bArr2) {
        short s4;
        if (bArr2 != null && McmLiteUtils.isZero(bArr2) && bArr != null && ((s4 = McmLiteUtils.readShort(bArr, 0)) == 16657 || s4 == 16689 || s4 == 18308 || s4 == 29987)) {
            return TRANSIT;
        }
        if (b10 == 0) {
            return PURCHASE;
        }
        if (b10 == 1 || b10 == 9) {
            return CASH_OR_CASH_BACK;
        }
        return b10 != 32 ? UNKNOWN : REFUND;
    }

    public static TransactionType valueOf(String str) {
        return (TransactionType) Enum.valueOf(TransactionType.class, str);
    }

    public static TransactionType[] values() {
        return (TransactionType[]) $VALUES.clone();
    }
}
