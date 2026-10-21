package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal;

import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.input.MobileSupportIndicator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class PersistentTransactionContext {
    private static final /* synthetic */ PersistentTransactionContext[] $VALUES;
    public static final PersistentTransactionContext NO;
    public static final PersistentTransactionContext UNKNOWN;
    public static final PersistentTransactionContext YES;

    static {
        PersistentTransactionContext persistentTransactionContext = new PersistentTransactionContext("YES", 0);
        YES = persistentTransactionContext;
        PersistentTransactionContext persistentTransactionContext2 = new PersistentTransactionContext("NO", 1);
        NO = persistentTransactionContext2;
        PersistentTransactionContext persistentTransactionContext3 = new PersistentTransactionContext("UNKNOWN", 2);
        UNKNOWN = persistentTransactionContext3;
        $VALUES = new PersistentTransactionContext[]{persistentTransactionContext, persistentTransactionContext2, persistentTransactionContext3};
    }

    public PersistentTransactionContext() {
        throw null;
    }

    public static PersistentTransactionContext forMagstripe(MobileSupportIndicator mobileSupportIndicator) {
        return mobileSupportIndicator.isMobileSupported() ? YES : NO;
    }

    public static PersistentTransactionContext forMchip(MobileSupportIndicator mobileSupportIndicator) {
        return mobileSupportIndicator.isMobileSupported() ? YES : NO;
    }

    public static PersistentTransactionContext valueOf(String str) {
        return (PersistentTransactionContext) Enum.valueOf(PersistentTransactionContext.class, str);
    }

    public static PersistentTransactionContext[] values() {
        return (PersistentTransactionContext[]) $VALUES.clone();
    }
}
