package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TerminalType {
    private static final /* synthetic */ TerminalType[] $VALUES;
    public static final TerminalType BANK_ATTENDED;
    public static final TerminalType BANK_UNATTENDED;
    public static final TerminalType CARDHOLDER_OPERATED;
    public static final TerminalType MERCHANT_ATTENDED;
    public static final TerminalType MERCHANT_UNATTENDED;
    public static final TerminalType UNKNOWN;

    static {
        TerminalType terminalType = new TerminalType("BANK_ATTENDED", 0);
        BANK_ATTENDED = terminalType;
        TerminalType terminalType2 = new TerminalType("BANK_UNATTENDED", 1);
        BANK_UNATTENDED = terminalType2;
        TerminalType terminalType3 = new TerminalType("MERCHANT_ATTENDED", 2);
        MERCHANT_ATTENDED = terminalType3;
        TerminalType terminalType4 = new TerminalType("MERCHANT_UNATTENDED", 3);
        MERCHANT_UNATTENDED = terminalType4;
        TerminalType terminalType5 = new TerminalType("CARDHOLDER_OPERATED", 4);
        CARDHOLDER_OPERATED = terminalType5;
        TerminalType terminalType6 = new TerminalType("UNKNOWN", 5);
        UNKNOWN = terminalType6;
        $VALUES = new TerminalType[]{terminalType, terminalType2, terminalType3, terminalType4, terminalType5, terminalType6};
    }

    public TerminalType() {
        throw null;
    }

    public static TerminalType of(byte b10) {
        switch (b10) {
            case 17:
            case 18:
            case 19:
                return BANK_ATTENDED;
            case 20:
            case 21:
            case 22:
                return BANK_UNATTENDED;
            default:
                switch (b10) {
                    case 33:
                    case 34:
                    case 35:
                        return MERCHANT_ATTENDED;
                    case 36:
                    case 37:
                    case 38:
                        return MERCHANT_UNATTENDED;
                    default:
                        switch (b10) {
                            case 52:
                            case 53:
                            case 54:
                                return CARDHOLDER_OPERATED;
                            default:
                                return UNKNOWN;
                        }
                }
        }
    }

    public static TerminalType valueOf(String str) {
        return (TerminalType) Enum.valueOf(TerminalType.class, str);
    }

    public static TerminalType[] values() {
        return (TerminalType[]) $VALUES.clone();
    }
}
