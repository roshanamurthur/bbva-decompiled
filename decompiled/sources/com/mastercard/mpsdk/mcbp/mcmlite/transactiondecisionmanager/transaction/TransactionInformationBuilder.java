package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.ComputeCcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolValues;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcCommandApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel.CryptogramInput;
import yh.a;
import yh.b;
import yh.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class TransactionInformationBuilder {
    private static final /* synthetic */ TransactionInformationBuilder[] $VALUES;
    public static final TransactionInformationBuilder INSTANCE;

    static {
        TransactionInformationBuilder transactionInformationBuilder = new TransactionInformationBuilder("INSTANCE", 0);
        INSTANCE = transactionInformationBuilder;
        $VALUES = new TransactionInformationBuilder[]{transactionInformationBuilder};
    }

    public TransactionInformationBuilder() {
        throw null;
    }

    public static TransactionInformation forMagstripe(byte[] bArr, byte[] bArr2, ComputeCcCommandApdu computeCcCommandApdu, DolValues dolValues) {
        return new a(bArr, bArr2, computeCcCommandApdu, dolValues);
    }

    public static TransactionInformation forMchip(byte[] bArr, byte[] bArr2, GenerateAcCommandApdu generateAcCommandApdu, DolValues dolValues) {
        return new b(bArr, bArr2, generateAcCommandApdu, dolValues);
    }

    public static TransactionInformation forRemotePayment(byte[] bArr, CryptogramInput cryptogramInput) {
        return new c(bArr, cryptogramInput);
    }

    public static TransactionInformationBuilder valueOf(String str) {
        return (TransactionInformationBuilder) Enum.valueOf(TransactionInformationBuilder.class, str);
    }

    public static TransactionInformationBuilder[] values() {
        return (TransactionInformationBuilder[]) $VALUES.clone();
    }
}
