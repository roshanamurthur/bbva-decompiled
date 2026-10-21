package com.mastercard.mpsdk.mcbp.mcmlite.cvm.riskmanager;

import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;

/* JADX INFO: loaded from: classes10.dex */
public interface CvmRiskManager {
    public static final int MAXIMUM_USER_VALIDATION_VALIDITY = 300;

    boolean isUserSufficientlyAuthenticated(boolean z10, long j10, TransactionInformation transactionInformation);

    void update(TransactionInformation transactionInformation);
}
