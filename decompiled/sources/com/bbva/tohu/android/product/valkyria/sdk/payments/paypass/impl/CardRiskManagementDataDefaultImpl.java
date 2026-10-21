package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.impl;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo.CardRiskManagement;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes6.dex */
public class CardRiskManagementDataDefaultImpl implements CardRiskManagementData {
    private CardRiskManagement cardRiskManagement;

    public CardRiskManagementDataDefaultImpl(CardRiskManagement cardRiskManagement) {
        this.cardRiskManagement = cardRiskManagement;
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData
    public byte[] getAdditionalCheckTable() {
        return McmLiteUtils.byteArrayFromHexString(this.cardRiskManagement.getAdditionalCheckTable());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData
    public byte[] getCrmCountryCode() {
        return McmLiteUtils.byteArrayFromHexString(this.cardRiskManagement.getCrmCountryCode());
    }

    @Override // com.mastercard.mpsdk.mcbp.mcmlite.profile.CardRiskManagementData
    public void wipe() {
    }
}
