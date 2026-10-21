package com.mastercard.mpsdk.mcbp.mcmlite.impl.state;

import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.DolRequestList;
import com.mastercard.mpsdk.mcbp.mcmlite.credentials.TransactionCredentialsManager;
import com.mastercard.mpsdk.mcbp.mcmlite.crypto.McmLiteCrypto;
import com.mastercard.mpsdk.mcbp.mcmlite.cvm.CdCvmValidatorInformation;
import com.mastercard.mpsdk.mcbp.mcmlite.profile.McmLiteProfile;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.AdviceManager;
import com.mastercard.mpsdk.mcbp.mcmlite.transactiondecisionmanager.ConsentManager;
import java.util.List;
import wh.e;
import wh.g;

/* JADX INFO: loaded from: classes10.dex */
public final class McmLiteStateContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final McmLiteProfile f50919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TransactionCredentialsManager f50920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConsentManager f50921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdviceManager f50922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CdCvmValidatorInformation f50923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<DolRequestList.DolItem> f50924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<DolRequestList.DolItem> f50925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f50926h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final McmLiteCrypto f50927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public McmLiteState f50928j = new g(this);

    public McmLiteStateContext(McmLiteCrypto mcmLiteCrypto, McmLiteProfile mcmLiteProfile, TransactionCredentialsManager transactionCredentialsManager, CdCvmValidatorInformation cdCvmValidatorInformation, ConsentManager consentManager, AdviceManager adviceManager, List<DolRequestList.DolItem> list, List<DolRequestList.DolItem> list2, boolean z10) {
        this.f50927i = mcmLiteCrypto;
        this.f50919a = mcmLiteProfile;
        this.f50920b = transactionCredentialsManager;
        this.f50923e = cdCvmValidatorInformation;
        this.f50921c = consentManager;
        this.f50922d = adviceManager;
        this.f50924f = list;
        this.f50925g = list2;
        this.f50926h = z10;
    }

    public final List<DolRequestList.DolItem> getAdditionalPdolList() {
        return this.f50924f;
    }

    public final List<DolRequestList.DolItem> getAdditionalUdolList() {
        return this.f50925g;
    }

    public final AdviceManager getAdviceManager() {
        return this.f50922d;
    }

    public final CdCvmValidatorInformation getCdCvmValidatorInformation() {
        return this.f50923e;
    }

    public final ConsentManager getConsentManager() {
        return this.f50921c;
    }

    public final McmLiteProfile getProfile() {
        return this.f50919a;
    }

    public final McmLiteState getState() {
        return this.f50928j;
    }

    public final TransactionCredentialsManager getTransactionCredentialsManager() {
        return this.f50920b;
    }

    public boolean isMaskMchipInAipForUsTransactions() {
        return this.f50926h;
    }

    public final void setInitializedState() {
        this.f50928j = new e(this.f50927i, this);
    }

    public final void setState(McmLiteState mcmLiteState) {
        this.f50928j = mcmLiteState;
    }

    public final void setStoppedState() {
        this.f50928j = new g(this);
    }

    public final void wipe() {
        McmLiteProfile mcmLiteProfile = this.f50919a;
        if (mcmLiteProfile != null) {
            mcmLiteProfile.wipe();
        }
    }
}
