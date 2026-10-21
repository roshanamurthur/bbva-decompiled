package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile.componentinterface;

/* JADX INFO: loaded from: classes6.dex */
public interface BusinessLogicModule {
    byte[] getApplicationLifeCycleData();

    byte[] getCardLayoutDescription();

    String[] getCardholderValidators();

    int getCvmResetTimeout();

    int getDualTapResetTimeout();

    MagstripeCvmIssuerOptions getMagstripeCvmIssuerOptions();

    MChipCvmIssuerOptions getMchipCvmIssuerOptions();

    byte[] getSecurityWord();
}
