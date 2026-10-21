package com.mypinpad.tsdk.api.callbacks;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/mypinpad/tsdk/api/callbacks/TransactionCancelReason;", "", "TRANSACTION_WAS_TERMINATED", "USER_CANCELLED_PIN_PAD", "SESSION_DEACTIVATED", "DEVICE_STATE_FAILURE", "TIME_CHECK_ERROR", "TERMINAL_DISPOSED"}, k = 1, mv = {1, 8, 0})
public final class TransactionCancelReason {
    public static final TransactionCancelReason DEVICE_STATE_FAILURE;
    public static final TransactionCancelReason SESSION_DEACTIVATED;
    public static final TransactionCancelReason TERMINAL_DISPOSED;
    public static final TransactionCancelReason TIME_CHECK_ERROR;
    public static final TransactionCancelReason TRANSACTION_WAS_TERMINATED;
    public static final TransactionCancelReason USER_CANCELLED_PIN_PAD;
    private static int setOnFocusChangeListener = 1;
    private static int setX;
    private static final /* synthetic */ TransactionCancelReason[] setY;

    static {
        TransactionCancelReason[] transactionCancelReasonArr;
        TransactionCancelReason transactionCancelReason = new TransactionCancelReason("TRANSACTION_WAS_TERMINATED", 0);
        TRANSACTION_WAS_TERMINATED = transactionCancelReason;
        TransactionCancelReason transactionCancelReason2 = new TransactionCancelReason("USER_CANCELLED_PIN_PAD", 1);
        USER_CANCELLED_PIN_PAD = transactionCancelReason2;
        TransactionCancelReason transactionCancelReason3 = new TransactionCancelReason("SESSION_DEACTIVATED", 2);
        SESSION_DEACTIVATED = transactionCancelReason3;
        TransactionCancelReason transactionCancelReason4 = new TransactionCancelReason("DEVICE_STATE_FAILURE", 3);
        DEVICE_STATE_FAILURE = transactionCancelReason4;
        TransactionCancelReason transactionCancelReason5 = new TransactionCancelReason("TIME_CHECK_ERROR", 4);
        TIME_CHECK_ERROR = transactionCancelReason5;
        TransactionCancelReason transactionCancelReason6 = new TransactionCancelReason("TERMINAL_DISPOSED", 5);
        TERMINAL_DISPOSED = transactionCancelReason6;
        int i10 = 1 & 15;
        int i11 = (i10 - (~(-(-((1 ^ 15) | i10))))) - 1;
        setX = i11 % 128;
        if (i11 % 2 != 0) {
            transactionCancelReasonArr = new TransactionCancelReason[45];
            transactionCancelReasonArr[1] = transactionCancelReason;
            transactionCancelReasonArr[0] = transactionCancelReason2;
            transactionCancelReasonArr[5] = transactionCancelReason3;
            transactionCancelReasonArr[5] = transactionCancelReason4;
            transactionCancelReasonArr[2] = transactionCancelReason5;
            transactionCancelReasonArr[2] = transactionCancelReason6;
        } else {
            transactionCancelReasonArr = new TransactionCancelReason[]{transactionCancelReason, transactionCancelReason2, transactionCancelReason3, transactionCancelReason4, transactionCancelReason5, transactionCancelReason6};
        }
        int i12 = ((1 ^ 110) + ((1 & 110) << 1)) - 1;
        setX = i12 % 128;
        int i13 = i12 % 2;
        setY = transactionCancelReasonArr;
        int i14 = 1 & 5;
        int i15 = ((~i14) & (1 | 5)) + (i14 << 1);
        setX = i15 % 128;
        int i16 = i15 % 2;
    }

    public TransactionCancelReason() {
        throw null;
    }

    public static TransactionCancelReason valueOf(String str) {
        int i10 = setOnFocusChangeListener;
        int i11 = ((i10 | 125) << 1) - (i10 ^ 125);
        setX = i11 % 128;
        int i12 = i11 % 2;
        TransactionCancelReason transactionCancelReason = (TransactionCancelReason) Enum.valueOf(TransactionCancelReason.class, str);
        int i13 = setX;
        int i14 = (i13 ^ 121) + ((i13 & 121) << 1);
        setOnFocusChangeListener = i14 % 128;
        if (i14 % 2 != 0) {
            return transactionCancelReason;
        }
        throw null;
    }

    public static TransactionCancelReason[] values() {
        int i10 = setX;
        int i11 = ((i10 ^ 6) + ((i10 & 6) << 1)) - 1;
        setOnFocusChangeListener = i11 % 128;
        int i12 = i11 % 2;
        TransactionCancelReason[] transactionCancelReasonArr = setY;
        if (i12 != 0) {
            return (TransactionCancelReason[]) transactionCancelReasonArr.clone();
        }
        throw null;
    }
}
