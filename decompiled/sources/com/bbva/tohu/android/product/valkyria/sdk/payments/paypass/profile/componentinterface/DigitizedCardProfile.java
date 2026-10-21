package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface;

/* JADX INFO: loaded from: classes6.dex */
public interface DigitizedCardProfile {
    BusinessLogicModule getBusinessLogicModule();

    byte[] getCardMetadata();

    byte[] getContent();

    String getDigitizedCardId();

    int getMaximumPinTry();

    MppLiteModule getMppLiteModule();

    void wipe();
}
