package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class Purpose {
    private static final /* synthetic */ Purpose[] $VALUES;
    public static final Purpose AUTHENTICATE;
    public static final Purpose AUTHORIZE;
    public static final Purpose UNKNOWN;

    static {
        Purpose purpose = new Purpose("AUTHORIZE", 0);
        AUTHORIZE = purpose;
        Purpose purpose2 = new Purpose("AUTHENTICATE", 1);
        AUTHENTICATE = purpose2;
        Purpose purpose3 = new Purpose("UNKNOWN", 2);
        UNKNOWN = purpose3;
        $VALUES = new Purpose[]{purpose, purpose2, purpose3};
    }

    public Purpose() {
        throw null;
    }

    public static Purpose forMagstripe(TerminalType terminalType) {
        return (terminalType == TerminalType.MERCHANT_ATTENDED || terminalType == TerminalType.MERCHANT_UNATTENDED) ? AUTHORIZE : UNKNOWN;
    }

    public static Purpose forMchip(GenerateAcCommandApdu generateAcCommandApdu) {
        if (generateAcCommandApdu.isArqcRequested() || generateAcCommandApdu.isTcRequested()) {
            return AUTHORIZE;
        }
        return generateAcCommandApdu.isAacRequested() ? AUTHENTICATE : UNKNOWN;
    }

    public static Purpose forRemotePayment() {
        return AUTHORIZE;
    }

    public static Purpose valueOf(String str) {
        return (Purpose) Enum.valueOf(Purpose.class, str);
    }

    public static Purpose[] values() {
        return (Purpose[]) $VALUES.clone();
    }
}
