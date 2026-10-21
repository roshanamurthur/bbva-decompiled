package com.mastercard.mpsdk.mcbp.mcmlite.profile;

/* JADX INFO: loaded from: classes10.dex */
public interface ContactlessPaymentData {
    byte[] getAid();

    AlternateContactlessPaymentData getAlternateContactlessPaymentData();

    int getCdol1RelatedDataLength();

    byte[] getCiacDecline();

    byte[] getCiacDeclineOnPpms();

    byte[] getCvrMaskAnd();

    byte[] getGpoResponse();

    IccPrivateKeyCrtComponents getIccPrivateKeyCrtComponents();

    byte[] getIssuerApplicationData();

    byte[] getPaymentFci();

    byte[] getPinIvCvc3Track2();

    byte[] getPpseFci();

    Record[] getRecords();

    boolean isAlternateAidMchipDataValid();

    boolean isMagstripeDataValid();

    boolean isPrimaryAidMchipDataValid();

    void wipe();
}
