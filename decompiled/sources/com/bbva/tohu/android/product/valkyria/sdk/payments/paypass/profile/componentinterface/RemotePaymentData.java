package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface;

/* JADX INFO: loaded from: classes6.dex */
public interface RemotePaymentData {
    byte[] getAip();

    byte[] getApplicationExpiryDate();

    byte[] getCiacDecline();

    byte[] getCvrMaskAnd();

    byte[] getIssuerApplicationData();

    byte[] getPan();

    byte[] getPanSequenceNumber();

    byte[] getTrack2Equivalent();
}
