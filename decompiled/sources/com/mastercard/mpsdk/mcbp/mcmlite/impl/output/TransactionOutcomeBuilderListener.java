package com.mastercard.mpsdk.mcbp.mcmlite.impl.output;

import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentials;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Reason;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public interface TransactionOutcomeBuilderListener<T> {
    T abort(List<Reason> list);

    T approveOnline(List<Reason> list, TransactionCredentials transactionCredentials);

    T authenticate(List<Reason> list, TransactionCredentials transactionCredentials);

    T decline(List<Reason> list);

    T error(List<Reason> list);
}
