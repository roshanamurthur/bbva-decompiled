package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal;

/* JADX INFO: loaded from: classes10.dex */
public interface TerminalInformation {
    CdCvmSupport getCdCvmSupport();

    byte[] getDiscretionaryDataByTag(String str);

    PersistentTransactionContext getPersistentTransactionContext();

    TerminalTechnology getTerminalTechnology();

    TerminalType getTerminalType();
}
