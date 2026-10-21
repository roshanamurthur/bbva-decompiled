package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager;

/* JADX INFO: loaded from: classes6.dex */
public class ConsentManagerDefaultImpl implements ConsentManager {
    @Override // com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager
    public boolean isConsentGiven() {
        return true;
    }
}
