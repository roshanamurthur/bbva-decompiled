package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager;

import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;

/* JADX INFO: loaded from: classes10.dex */
public interface AdviceManager {
    Advice adviseTransactionOutcome(Advice advice, TransactionInformation transactionInformation, TerminalInformation terminalInformation);
}
