package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
class BusinessLogicModuleMdesCmsC {

    @JSON(name = "applicationLifeCycleData")
    private String applicationLifeCycleData;

    @JSON(name = "cardLayoutDescription")
    private String cardLayoutDescription;

    @JSON(name = "cardholderValidators")
    private String[] cardholderValidators;

    @JSON(name = "cvmResetTimeout")
    private int cvmResetTimeout;

    @JSON(name = "dualTapResetTimeout")
    private int dualTapResetTimeout;

    @JSON(name = "mChipCvmIssuerOptions")
    private CvmIssuerOptionsMdesCmsC mChipCvmIssuerOptions;

    @JSON(name = "magstripeCvmIssuerOptions")
    private CvmIssuerOptionsMdesCmsC magstripeCvmIssuerOptions;

    @JSON(name = "securityWord")
    private String securityWord;

    public String getApplicationLifeCycleData() {
        return this.applicationLifeCycleData;
    }

    public String getCardLayoutDescription() {
        return this.cardLayoutDescription;
    }

    public String[] getCardholderValidators() {
        return this.cardholderValidators;
    }

    public int getCvmResetTimeout() {
        return this.cvmResetTimeout;
    }

    public int getDualTapResetTimeout() {
        return this.dualTapResetTimeout;
    }

    public CvmIssuerOptionsMdesCmsC getMagstripeCvmIssuerOptions() {
        return this.magstripeCvmIssuerOptions;
    }

    public String getSecurityWord() {
        return this.securityWord;
    }

    public CvmIssuerOptionsMdesCmsC getmChipCvmIssuerOptions() {
        return this.mChipCvmIssuerOptions;
    }

    public void setApplicationLifeCycleData(String str) {
        this.applicationLifeCycleData = str;
    }

    public void setCardLayoutDescription(String str) {
        this.cardLayoutDescription = str;
    }

    public void setCardholderValidators(String[] strArr) {
        this.cardholderValidators = strArr;
    }

    public void setCvmResetTimeout(int i10) {
        this.cvmResetTimeout = i10;
    }

    public void setDualTapResetTimeout(int i10) {
        this.dualTapResetTimeout = i10;
    }

    public void setMagstripeCvmIssuerOptions(CvmIssuerOptionsMdesCmsC cvmIssuerOptionsMdesCmsC) {
        this.magstripeCvmIssuerOptions = cvmIssuerOptionsMdesCmsC;
    }

    public void setSecurityWord(String str) {
        this.securityWord = str;
    }

    public void setmChipCvmIssuerOptions(CvmIssuerOptionsMdesCmsC cvmIssuerOptionsMdesCmsC) {
        this.mChipCvmIssuerOptions = cvmIssuerOptionsMdesCmsC;
    }
}
