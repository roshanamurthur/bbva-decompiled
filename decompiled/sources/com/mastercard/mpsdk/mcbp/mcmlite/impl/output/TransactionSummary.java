package com.mastercard.mpsdk.mcbp.mcmlite.impl.output;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionSummary {
    private static final /* synthetic */ TransactionSummary[] $VALUES;
    public static final TransactionSummary ABORT_PERSISTENT_CONTEXT;
    public static final TransactionSummary ABORT_UNKNOWN_CONTEXT;
    public static final TransactionSummary AUTHENTICATE_ONLINE;
    public static final TransactionSummary AUTHORIZE_ONLINE;
    public static final TransactionSummary DECLINE;
    public static final TransactionSummary ERROR;
    public static final TransactionSummary ERROR_CONTEXT_CONFLICT;

    static {
        TransactionSummary transactionSummary = new TransactionSummary("AUTHORIZE_ONLINE", 0);
        AUTHORIZE_ONLINE = transactionSummary;
        TransactionSummary transactionSummary2 = new TransactionSummary("AUTHENTICATE_ONLINE", 1);
        AUTHENTICATE_ONLINE = transactionSummary2;
        TransactionSummary transactionSummary3 = new TransactionSummary("ABORT_PERSISTENT_CONTEXT", 2);
        ABORT_PERSISTENT_CONTEXT = transactionSummary3;
        TransactionSummary transactionSummary4 = new TransactionSummary("ABORT_UNKNOWN_CONTEXT", 3);
        ABORT_UNKNOWN_CONTEXT = transactionSummary4;
        TransactionSummary transactionSummary5 = new TransactionSummary("DECLINE", 4);
        DECLINE = transactionSummary5;
        TransactionSummary transactionSummary6 = new TransactionSummary("ERROR", 5);
        ERROR = transactionSummary6;
        TransactionSummary transactionSummary7 = new TransactionSummary("ERROR_CONTEXT_CONFLICT", 6);
        ERROR_CONTEXT_CONFLICT = transactionSummary7;
        $VALUES = new TransactionSummary[]{transactionSummary, transactionSummary2, transactionSummary3, transactionSummary4, transactionSummary5, transactionSummary6, transactionSummary7};
    }

    public TransactionSummary() {
        throw null;
    }

    public static TransactionSummary valueOf(String str) {
        return (TransactionSummary) Enum.valueOf(TransactionSummary.class, str);
    }

    public static TransactionSummary[] values() {
        return (TransactionSummary[]) $VALUES.clone();
    }
}
