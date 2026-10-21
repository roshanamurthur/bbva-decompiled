package com.mastercard.mpsdk.mcbp.mcmlite.impl.state;

import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;

/* JADX INFO: loaded from: classes10.dex */
public final class RemotePaymentContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransactionCredentialsManager f50929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CdCvmValidatorInformation f50930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConsentManager f50931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdviceManager f50932d;

    public RemotePaymentContext(TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager) {
        this.f50929a = transactionCredentialsManager;
        this.f50930b = cdCvmValidatorInformation;
        this.f50931c = consentManager;
        this.f50932d = adviceManager;
    }

    public final TransactionCredentialsManager getTransactionCredentialsManager() {
        return this.f50929a;
    }

    public final CdCvmValidatorInformation.UmdValidity getUmdValidity() {
        return this.f50930b.getUmdValidity();
    }

    public final Advice getWalletAdvice(Advice advice, TransactionInformation transactionInformation, TerminalInformation terminalInformation) {
        AdviceManager adviceManager = this.f50932d;
        return adviceManager == null ? advice : adviceManager.adviseTransactionOutcome(advice, transactionInformation, terminalInformation);
    }

    public final boolean isCdCvmEnabled() {
        return this.f50930b.isOnDeviceCvmEnabled();
    }

    public final boolean isCdCvmEntered() {
        return this.f50930b.isAuthenticated();
    }

    public final boolean isConsentGiven() {
        return this.f50931c.isConsentGiven();
    }
}
