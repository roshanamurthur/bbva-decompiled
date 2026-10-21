package com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction;

import java.util.Currency;

/* JADX INFO: loaded from: classes10.dex */
public interface TransactionInformation {
    double getAuthorizedAmount();

    ConditionOfUse getConditionOfUse();

    Currency getCurrency();

    ExpectedUserActionOnPoi getExpectedUserActionOnPoi();

    double getOtherAmount();

    ProductType getProductType();

    Purpose getPurpose();

    TransactionRange getTransactionRange();

    TransactionType getTransactionType();

    boolean hasTerminalDelegatedCdCvm();
}
