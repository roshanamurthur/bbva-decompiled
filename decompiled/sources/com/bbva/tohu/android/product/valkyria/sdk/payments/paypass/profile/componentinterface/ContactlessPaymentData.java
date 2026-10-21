package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface;

/* JADX INFO: loaded from: classes6.dex */
public interface ContactlessPaymentData {
    byte[] getAid();

    AlternateContactlessPaymentData getAlternateContactlessPaymentData();

    byte[] getCdol1RelatedDataLength();

    byte[] getCiacDecline();

    byte[] getCiacDeclineOnPpms();

    byte[] getCvrMaskAnd();

    byte[] getGpoResponse();

    IccPrivateKeyCrtComponents getIccPrivateKeyCrtComponents();

    byte[] getIssuerApplicationData();

    byte[] getPaymentFci();

    byte[] getPinIvCvc3Track2();

    byte[] getPpseFci();

    Records[] getRecords();
}
