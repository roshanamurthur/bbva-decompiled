package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import xh.a;
import xh.b;
import xh.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TerminalInformationBuilder {
    private static final /* synthetic */ TerminalInformationBuilder[] $VALUES;
    public static final TerminalInformationBuilder INSTANCE;

    static {
        TerminalInformationBuilder terminalInformationBuilder = new TerminalInformationBuilder("INSTANCE", 0);
        INSTANCE = terminalInformationBuilder;
        $VALUES = new TerminalInformationBuilder[]{terminalInformationBuilder};
    }

    public TerminalInformationBuilder() {
        throw null;
    }

    public static TerminalInformation forMagstripe(ComputeCcCommandApdu computeCcCommandApdu, DolValues dolValues, DolValues dolValues2) {
        return new a(computeCcCommandApdu, dolValues, dolValues2);
    }

    public static TerminalInformation forMchip(GenerateAcCommandApdu generateAcCommandApdu, DolValues dolValues, DolValues dolValues2) {
        return new b(generateAcCommandApdu, dolValues, dolValues2);
    }

    public static TerminalInformation forRemotePayment(CryptogramInput cryptogramInput) {
        return new c(cryptogramInput);
    }

    public static TerminalInformationBuilder valueOf(String str) {
        return (TerminalInformationBuilder) Enum.valueOf(TerminalInformationBuilder.class, str);
    }

    public static TerminalInformationBuilder[] values() {
        return (TerminalInformationBuilder[]) $VALUES.clone();
    }
}
