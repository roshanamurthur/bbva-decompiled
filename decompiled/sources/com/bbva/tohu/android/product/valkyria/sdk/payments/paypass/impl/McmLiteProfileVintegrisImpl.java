package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.CardProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.ContactlessPaymentData;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.RemotePaymentData;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes6.dex */
public class McmLiteProfileVintegrisImpl implements McmLiteProfile {
    private CardRiskManagementData cardRiskManagementData;
    private ContactlessPaymentData contactlessPaymentData;
    private RemotePaymentData remotePaymentData = null;

    public McmLiteProfileVintegrisImpl(CardProfile cardProfile) throws GeneralSecurityException {
        this.contactlessPaymentData = new ContactlessPaymentDataDefaultImpl(cardProfile.getMppLiteModule().getContactlessPaymentData(), cardProfile.getIccKek());
        this.cardRiskManagementData = new CardRiskManagementDataDefaultImpl(cardProfile.getMppLiteModule().getCardRiskManagement());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
    public CardRiskManagementData getCardRiskManagementData() {
        return this.cardRiskManagementData;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
    public ContactlessPaymentData getContactlessPaymentData() {
        return this.contactlessPaymentData;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
    public RemotePaymentData getRemotePaymentData() {
        return this.remotePaymentData;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile
    public void wipe() {
    }
}
