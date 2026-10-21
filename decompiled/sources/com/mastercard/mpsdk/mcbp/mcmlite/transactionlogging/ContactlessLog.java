package com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.TransactionSummary;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;

/* JADX INFO: loaded from: classes10.dex */
public interface ContactlessLog {
    byte[] getAmount();

    byte[] getAtc();

    byte[] getCryptogram();

    byte[] getCurrencyNumericCode();

    byte[] getDate();

    byte[] getMagstripeDynamicTrack1Data();

    byte[] getMagstripeDynamicTrack2Data();

    TransactionSummary getResult();

    TerminalInformation getTerminalInformation();

    TransactionInformation getTransactionInformation();

    byte[] getUnpredictableNumber();

    void wipe();
}
