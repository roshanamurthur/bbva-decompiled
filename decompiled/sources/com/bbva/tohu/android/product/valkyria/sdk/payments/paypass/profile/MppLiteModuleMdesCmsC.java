package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
class MppLiteModuleMdesCmsC {

    @JSON(name = "cardRiskManagementData")
    private CardRiskManagementDataMdesCmsC cardRiskManagementData;

    @JSON(name = "contactlessPaymentData")
    private ContactlessPaymentDataMdesCmsC contactlessPaymentData;

    @JSON(name = "remotePaymentData")
    private RemotePaymentDataMdesCmsC remotePaymentData;

    public CardRiskManagementDataMdesCmsC getCardRiskManagementData() {
        return this.cardRiskManagementData;
    }

    public ContactlessPaymentDataMdesCmsC getContactlessPaymentData() {
        return this.contactlessPaymentData;
    }

    public RemotePaymentDataMdesCmsC getRemotePaymentData() {
        return this.remotePaymentData;
    }

    public void setCardRiskManagementData(CardRiskManagementDataMdesCmsC cardRiskManagementDataMdesCmsC) {
        this.cardRiskManagementData = cardRiskManagementDataMdesCmsC;
    }

    public void setContactlessPaymentData(ContactlessPaymentDataMdesCmsC contactlessPaymentDataMdesCmsC) {
        this.contactlessPaymentData = contactlessPaymentDataMdesCmsC;
    }

    public void setRemotePaymentData(RemotePaymentDataMdesCmsC remotePaymentDataMdesCmsC) {
        this.remotePaymentData = remotePaymentDataMdesCmsC;
    }
}
