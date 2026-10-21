package com.mastercard.mpsdk.mcbp.mcmlite.profile;

/* JADX INFO: loaded from: classes10.dex */
public interface RemotePaymentData {
    byte[] getAip();

    byte[] getApplicationExpiryDate();

    byte[] getCiacDecline();

    byte[] getCvrMaskAnd();

    byte[] getIssuerApplicationData();

    byte[] getPan();

    byte[] getPanSequenceNumber();

    byte[] getTrack2EquivalentData();

    void wipe();
}
