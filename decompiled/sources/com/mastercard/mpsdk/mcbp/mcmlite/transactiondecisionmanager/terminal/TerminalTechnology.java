package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal;

import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramType;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TerminalTechnology {
    private static final /* synthetic */ TerminalTechnology[] $VALUES;
    public static final TerminalTechnology CONTACTLESS_EMV;
    public static final TerminalTechnology CONTACTLESS_MAGSTRIPE;
    public static final TerminalTechnology REMOTE_DSRP_EMV;
    public static final TerminalTechnology REMOTE_DSRP_UCAF;

    static {
        TerminalTechnology terminalTechnology = new TerminalTechnology("CONTACTLESS_EMV", 0);
        CONTACTLESS_EMV = terminalTechnology;
        TerminalTechnology terminalTechnology2 = new TerminalTechnology("CONTACTLESS_MAGSTRIPE", 1);
        CONTACTLESS_MAGSTRIPE = terminalTechnology2;
        TerminalTechnology terminalTechnology3 = new TerminalTechnology("REMOTE_DSRP_EMV", 2);
        REMOTE_DSRP_EMV = terminalTechnology3;
        TerminalTechnology terminalTechnology4 = new TerminalTechnology("REMOTE_DSRP_UCAF", 3);
        REMOTE_DSRP_UCAF = terminalTechnology4;
        $VALUES = new TerminalTechnology[]{terminalTechnology, terminalTechnology2, terminalTechnology3, terminalTechnology4};
    }

    public TerminalTechnology() {
        throw null;
    }

    public static TerminalTechnology forRemotePayment(CryptogramType cryptogramType) {
        return cryptogramType == CryptogramType.DE55 ? REMOTE_DSRP_EMV : REMOTE_DSRP_UCAF;
    }

    public static TerminalTechnology valueOf(String str) {
        return (TerminalTechnology) Enum.valueOf(TerminalTechnology.class, str);
    }

    public static TerminalTechnology[] values() {
        return (TerminalTechnology[]) $VALUES.clone();
    }
}
