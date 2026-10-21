package com.mypinpad.tsdk.api.models;

import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/mypinpad/tsdk/api/models/TransactionType;", "", "", "setY", "B", "getType", "()B", "type", "PURCHASE", "REFUND"}, k = 1, mv = {1, 8, 0})
public final class TransactionType {
    public static final TransactionType PURCHASE;
    public static final TransactionType REFUND;
    private static final /* synthetic */ TransactionType[] setCompoundDrawableTintBlendMode;
    private static int setDividerPadding = 1;
    private static int setOnFocusChangeListener;

    /* JADX INFO: renamed from: setY, reason: from kotlin metadata */
    private final byte type;

    static {
        TransactionType transactionType = new TransactionType("PURCHASE", 0, (byte) 0);
        PURCHASE = transactionType;
        TransactionType transactionType2 = new TransactionType("REFUND", 1, (byte) 32);
        REFUND = transactionType2;
        int i10 = 1 + 103;
        int i11 = i10 % 128;
        setOnFocusChangeListener = i11;
        int i12 = i10 % 2;
        TransactionType[] transactionTypeArr = {transactionType, transactionType2};
        int i13 = i11 & 37;
        int i14 = -(-((i11 ^ 37) | i13));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        setDividerPadding = i15 % 128;
        if (i15 % 2 == 0) {
            throw null;
        }
        setCompoundDrawableTintBlendMode = transactionTypeArr;
        int i16 = i11 + 61;
        setDividerPadding = i16 % 128;
        int i17 = i16 % 2;
    }

    public TransactionType(String str, int i10, byte b10) {
        super(str, i10);
        this.type = b10;
    }

    public static TransactionType valueOf(String str) {
        int i10 = setDividerPadding + 14;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        setOnFocusChangeListener = i11 % 128;
        int i12 = i11 % 2;
        TransactionType transactionType = (TransactionType) Enum.valueOf(TransactionType.class, str);
        int i13 = setOnFocusChangeListener + 71;
        setDividerPadding = i13 % 128;
        if (i13 % 2 != 0) {
            return transactionType;
        }
        throw null;
    }

    public static TransactionType[] values() {
        int i10 = setOnFocusChangeListener;
        int i11 = i10 & 3;
        int i12 = i11 + ((i10 ^ 3) | i11);
        setDividerPadding = i12 % 128;
        int i13 = i12 % 2;
        TransactionType[] transactionTypeArr = (TransactionType[]) setCompoundDrawableTintBlendMode.clone();
        int i14 = setDividerPadding;
        int i15 = ((i14 | 27) << 1) - (i14 ^ 27);
        setOnFocusChangeListener = i15 % 128;
        if (i15 % 2 == 0) {
            return transactionTypeArr;
        }
        throw null;
    }

    @JvmName(name = "getType")
    public final byte getType() {
        int i10 = setDividerPadding;
        int i11 = (i10 & (-106)) | ((~i10) & 105);
        int i12 = (i10 & 105) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        setOnFocusChangeListener = i14;
        int i15 = i13 % 2;
        byte b10 = this.type;
        int i16 = ((-1) << 1) - ((-1) ^ (((i14 | 10) << 1) - (i14 ^ 10)));
        setDividerPadding = i16 % 128;
        if (i16 % 2 != 0) {
            return b10;
        }
        throw null;
    }
}
