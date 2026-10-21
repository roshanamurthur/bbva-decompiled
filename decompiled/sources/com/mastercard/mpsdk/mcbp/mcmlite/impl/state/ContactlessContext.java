package com.mastercard.mpsdk.mcbp.mcmlite.impl.state;

import com.mastercard.mpsdk.mcbp.mcmlite.BusinessLogicTransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolRequestList;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.impl.logic.contactless.ContactlessTransactionContext;
import com.mastercard.mpsdk.mcbp.mcmlite.listener.ContactlessTransactionListener;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.advice.Advice;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.terminal.TerminalInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.transaction.TransactionInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.List;
import jh.a;
import wh.c;
import wh.d;

/* JADX INFO: loaded from: classes10.dex */
public final class ContactlessContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f50904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f50905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50906c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final McmLiteProfile f50908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TransactionCredentialsManager f50909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CdCvmValidatorInformation f50910g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConsentManager f50911h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AdviceManager f50912i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final McmLiteCrypto f50913j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<DolRequestList.DolItem> f50914k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<DolRequestList.DolItem> f50915l;
    public final boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f50916n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ContactlessTransactionListener f50917o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f50918p = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ContactlessTransactionContext f50907d = new ContactlessTransactionContext();

    public ContactlessContext(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager, List<DolRequestList.DolItem> list, List<DolRequestList.DolItem> list2, boolean z10, ContactlessTransactionListener contactlessTransactionListener, BusinessLogicTransactionInformation businessLogicTransactionInformation) {
        this.f50913j = mcmLiteCrypto;
        this.f50910g = cdCvmValidatorInformation;
        this.f50911h = consentManager;
        this.f50909f = transactionCredentialsManager;
        this.f50912i = adviceManager;
        this.f50914k = list;
        this.f50915l = list2;
        this.m = z10;
        long amount = businessLogicTransactionInformation.getAmount();
        if (amount >= 0) {
            this.f50905b = McmLiteUtils.longToBcd(amount, 6);
            this.f50906c = McmLiteUtils.longToBcd(businessLogicTransactionInformation.getCurrencyCode(), 2);
        } else {
            this.f50905b = null;
            this.f50906c = null;
        }
        this.f50904a = businessLogicTransactionInformation.isExactAmount();
        this.f50908e = mcmLiteProfile;
        this.f50917o = contactlessTransactionListener;
    }

    public final List<DolRequestList.DolItem> getAdditionalPdolList() {
        return this.f50914k;
    }

    public final List<DolRequestList.DolItem> getAdditionalUdolList() {
        return this.f50915l;
    }

    public final byte[] getBlAmount() {
        return this.f50905b;
    }

    public final byte[] getBlCurrency() {
        return this.f50906c;
    }

    public final McmLiteProfile getCardProfile() {
        return this.f50908e;
    }

    public final long getLastSuccessfulAuthenticationTimeInMilliseconds() {
        return this.f50910g.getLastSuccessfulAuthenticationTimeInMilliseconds();
    }

    public final c getState() {
        return this.f50916n;
    }

    public final ContactlessTransactionContext getTransactionContext() {
        return this.f50907d;
    }

    public final TransactionCredentialsManager getTransactionCredentialsManager() {
        return this.f50909f;
    }

    public final ContactlessTransactionListener getTransactionListener() {
        return this.f50917o;
    }

    public final CdCvmValidatorInformation.UmdValidity getUmdValidity() {
        return this.f50910g.getUmdValidity();
    }

    public final Advice getWalletAdvice(Advice advice, TransactionInformation transactionInformation, TerminalInformation terminalInformation) {
        AdviceManager adviceManager = this.f50912i;
        return adviceManager == null ? advice : adviceManager.adviseTransactionOutcome(advice, transactionInformation, terminalInformation);
    }

    public final boolean isBlExactAmount() {
        return this.f50904a;
    }

    public final boolean isCdCvmEnabled() {
        return this.f50910g.isOnDeviceCvmEnabled();
    }

    public final boolean isCdCvmEntered() {
        return this.f50910g.isAuthenticated();
    }

    public final boolean isConsentGiven() {
        return this.f50911h.isConsentGiven();
    }

    public boolean isMaskMchipInAipForUsTransactions() {
        return this.m;
    }

    public final boolean isNotificationRequested() {
        return this.f50918p;
    }

    public final void requestListenerNotification() {
        this.f50918p = true;
    }

    public final void setContactlessInitiatedState() {
        this.f50916n = new a(this.f50913j, this);
    }

    public final void setContactlessNotSelectedState() {
        this.f50916n = new wh.a(this);
    }

    public final void setContactlessSelectedState() {
        d dVar = new d();
        dVar.f94252a = this;
        this.f50916n = dVar;
    }

    public void wipe() {
        McmLiteUtils.clearByteArray(this.f50905b);
        McmLiteUtils.clearByteArray(this.f50906c);
        this.f50907d.wipe();
        this.f50916n = null;
    }
}
