package com.mastercard.mpsdk.mcbp.mcmlite.profile;

/* JADX INFO: loaded from: classes10.dex */
public interface McmLiteProfile {
    CardRiskManagementData getCardRiskManagementData();

    ContactlessPaymentData getContactlessPaymentData();

    RemotePaymentData getRemotePaymentData();

    void wipe();
}
