package com.mastercard.mpsdk.mcbp.mcmlite.listener;

import com.mastercard.mpsdk.mcbp.mcmlite.transactionlogging.ContactlessLog;

/* JADX INFO: loaded from: classes10.dex */
public interface ContactlessTransactionListener {
    void onContactlessReady();

    void onContactlessTransactionAbort(ContactlessLog contactlessLog);

    void onContactlessTransactionCompleted(ContactlessLog contactlessLog);
}
