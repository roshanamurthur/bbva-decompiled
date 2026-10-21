package com.mastercard.mpsdk.mcbp.mcmlite.profile;

/* JADX INFO: loaded from: classes10.dex */
public interface AlternateContactlessPaymentData {
    byte[] getAid();

    byte[] getCiacDecline();

    byte[] getCvrMaskAnd();

    byte[] getGpoResponse();

    byte[] getPaymentFci();

    void wipe();
}
