package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Reason {
    private static final /* synthetic */ Reason[] $VALUES;
    public static final Reason CONTEXT_NOT_MATCHING;
    public static final Reason CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM;
    public static final Reason CREDENTIALS_NOT_AVAILABLE;
    public static final Reason INSUFFICIENT_CD_CVM;
    public static final Reason INSUFFICIENT_POI_AUTHENTICATION;
    public static final Reason MISSING_CARD_DATA;
    public static final Reason MISSING_CD_CVM;
    public static final Reason MISSING_CONSENT;
    public static final Reason MISSING_TERMINAL_DATA;
    public static final Reason POI_DECISION;
    public static final Reason POI_ENFORCED;
    public static final Reason TRANSACTION_CONDITIONS_NOT_ALLOWED;
    public static final Reason UNSUPPORTED_TRANSIT;

    static {
        Reason reason = new Reason("CONTEXT_NOT_MATCHING", 0);
        CONTEXT_NOT_MATCHING = reason;
        Reason reason2 = new Reason("CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM", 1);
        CREDENTIALS_NOT_ACCESSIBLE_WITHOUT_CVM = reason2;
        Reason reason3 = new Reason("CREDENTIALS_NOT_AVAILABLE", 2);
        CREDENTIALS_NOT_AVAILABLE = reason3;
        Reason reason4 = new Reason("INSUFFICIENT_CD_CVM", 3);
        INSUFFICIENT_CD_CVM = reason4;
        Reason reason5 = new Reason("INSUFFICIENT_POI_AUTHENTICATION", 4);
        INSUFFICIENT_POI_AUTHENTICATION = reason5;
        Reason reason6 = new Reason("MISSING_CARD_DATA", 5);
        MISSING_CARD_DATA = reason6;
        Reason reason7 = new Reason("MISSING_CD_CVM", 6);
        MISSING_CD_CVM = reason7;
        Reason reason8 = new Reason("MISSING_CONSENT", 7);
        MISSING_CONSENT = reason8;
        Reason reason9 = new Reason("MISSING_TERMINAL_DATA", 8);
        MISSING_TERMINAL_DATA = reason9;
        Reason reason10 = new Reason("POI_DECISION", 9);
        POI_DECISION = reason10;
        Reason reason11 = new Reason("POI_ENFORCED", 10);
        POI_ENFORCED = reason11;
        Reason reason12 = new Reason("TRANSACTION_CONDITIONS_NOT_ALLOWED", 11);
        TRANSACTION_CONDITIONS_NOT_ALLOWED = reason12;
        Reason reason13 = new Reason("UNSUPPORTED_TRANSIT", 12);
        UNSUPPORTED_TRANSIT = reason13;
        $VALUES = new Reason[]{reason, reason2, reason3, reason4, reason5, reason6, reason7, reason8, reason9, reason10, reason11, reason12, reason13};
    }

    public Reason() {
        throw null;
    }

    public static Reason valueOf(String str) {
        return (Reason) Enum.valueOf(Reason.class, str);
    }

    public static Reason[] values() {
        return (Reason[]) $VALUES.clone();
    }
}
