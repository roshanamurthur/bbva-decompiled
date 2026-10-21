package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionNotAuthorisedReason;", "", "ONLINE_DECLINED", "OFFLINE_DECLINED", "INVALID_AUTHORISATION_DATA", "NO_CARD_APPLICATION", "NO_CARD_APPLICATION_SELECTOR_MISMATCHED", "PROCESSING_ERROR", "CARD_ERROR"}, k = 1, mv = {1, 8, 0})
public final class TransactionNotAuthorisedReason {
    public static final TransactionNotAuthorisedReason CARD_ERROR;
    public static final TransactionNotAuthorisedReason INVALID_AUTHORISATION_DATA;
    public static final TransactionNotAuthorisedReason NO_CARD_APPLICATION;
    public static final TransactionNotAuthorisedReason NO_CARD_APPLICATION_SELECTOR_MISMATCHED;
    public static final TransactionNotAuthorisedReason OFFLINE_DECLINED;
    public static final TransactionNotAuthorisedReason ONLINE_DECLINED;
    public static final TransactionNotAuthorisedReason PROCESSING_ERROR;
    private static final /* synthetic */ TransactionNotAuthorisedReason[] setCompoundDrawableTintBlendMode;
    private static int setDividerPadding = 0;
    private static int setY = 1;

    static {
        TransactionNotAuthorisedReason transactionNotAuthorisedReason = new TransactionNotAuthorisedReason("ONLINE_DECLINED", 0);
        ONLINE_DECLINED = transactionNotAuthorisedReason;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason2 = new TransactionNotAuthorisedReason("OFFLINE_DECLINED", 1);
        OFFLINE_DECLINED = transactionNotAuthorisedReason2;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason3 = new TransactionNotAuthorisedReason("INVALID_AUTHORISATION_DATA", 2);
        INVALID_AUTHORISATION_DATA = transactionNotAuthorisedReason3;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason4 = new TransactionNotAuthorisedReason("NO_CARD_APPLICATION", 3);
        NO_CARD_APPLICATION = transactionNotAuthorisedReason4;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason5 = new TransactionNotAuthorisedReason("NO_CARD_APPLICATION_SELECTOR_MISMATCHED", 4);
        NO_CARD_APPLICATION_SELECTOR_MISMATCHED = transactionNotAuthorisedReason5;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason6 = new TransactionNotAuthorisedReason("PROCESSING_ERROR", 5);
        PROCESSING_ERROR = transactionNotAuthorisedReason6;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason7 = new TransactionNotAuthorisedReason("CARD_ERROR", 6);
        CARD_ERROR = transactionNotAuthorisedReason7;
        int i10 = 124 - 1;
        setY = i10 % 128;
        int i11 = i10 % 2;
        TransactionNotAuthorisedReason[] transactionNotAuthorisedReasonArr = {transactionNotAuthorisedReason, transactionNotAuthorisedReason2, transactionNotAuthorisedReason3, transactionNotAuthorisedReason4, transactionNotAuthorisedReason5, transactionNotAuthorisedReason6, transactionNotAuthorisedReason7};
        int i12 = (26 << 1) - 26;
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        int i14 = i13 % 128;
        setY = i14;
        int i15 = i13 % 2;
        setCompoundDrawableTintBlendMode = transactionNotAuthorisedReasonArr;
        int i16 = i14 & 51;
        int i17 = (i14 | 51) & (~i16);
        int i18 = i16 << 1;
        int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
        setDividerPadding = i19 % 128;
        if (i19 % 2 != 0) {
            throw null;
        }
    }

    public TransactionNotAuthorisedReason() {
        throw null;
    }

    public static TransactionNotAuthorisedReason valueOf(String str) {
        int i10 = setDividerPadding;
        int i11 = ((i10 ^ 45) - (~(-(-((i10 & 45) << 1))))) - 1;
        setY = i11 % 128;
        int i12 = i11 % 2;
        TransactionNotAuthorisedReason transactionNotAuthorisedReason = (TransactionNotAuthorisedReason) Enum.valueOf(TransactionNotAuthorisedReason.class, str);
        int i13 = setDividerPadding + 27;
        setY = i13 % 128;
        if (i13 % 2 != 0) {
            return transactionNotAuthorisedReason;
        }
        throw null;
    }

    public static TransactionNotAuthorisedReason[] values() {
        int i10 = setDividerPadding;
        int i11 = (i10 ^ 111) + ((i10 & 111) << 1);
        setY = i11 % 128;
        int i12 = i11 % 2;
        TransactionNotAuthorisedReason[] transactionNotAuthorisedReasonArr = (TransactionNotAuthorisedReason[]) setCompoundDrawableTintBlendMode.clone();
        int i13 = setDividerPadding;
        int i14 = (i13 & 45) + (i13 | 45);
        setY = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 47 / 0;
        }
        return transactionNotAuthorisedReasonArr;
    }
}
