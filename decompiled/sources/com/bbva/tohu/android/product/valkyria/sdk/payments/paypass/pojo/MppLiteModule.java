package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class MppLiteModule {
    private CardRiskManagement cardRiskManagement;
    private ContactlessPayment contactlessPaymentData;
    private RemotePayment remotePaymentData;

    public CardRiskManagement getCardRiskManagement() {
        return this.cardRiskManagement;
    }

    public ContactlessPayment getContactlessPaymentData() {
        return this.contactlessPaymentData;
    }

    public RemotePayment getRemotePaymentData() {
        return this.remotePaymentData;
    }

    public void setCardRiskManagement(CardRiskManagement cardRiskManagement) {
        this.cardRiskManagement = cardRiskManagement;
    }

    public void setContactlessPaymentData(ContactlessPayment contactlessPayment) {
        this.contactlessPaymentData = contactlessPayment;
    }

    public void setRemotePaymentData(RemotePayment remotePayment) {
        this.remotePaymentData = remotePayment;
    }
}
