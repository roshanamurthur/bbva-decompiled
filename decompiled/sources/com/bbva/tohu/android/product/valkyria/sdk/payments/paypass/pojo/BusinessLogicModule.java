package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class BusinessLogicModule {
    private String applicationLifeCycleData;
    private String cardLayoutDescription;
    private String[] cardholderValidators;
    private int cvmResetTimeout;
    private int dualTapResetTimeout;
    private CvmIssuerOptions mChipCvmIssuerOptions;
    private CvmIssuerOptions magstripeCvmIssuerOptions;
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

    public CvmIssuerOptions getMagstripeCvmIssuerOptions() {
        return this.magstripeCvmIssuerOptions;
    }

    public String getSecurityWord() {
        return this.securityWord;
    }

    public CvmIssuerOptions getmChipCvmIssuerOptions() {
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

    public void setMagstripeCvmIssuerOptions(CvmIssuerOptions cvmIssuerOptions) {
        this.magstripeCvmIssuerOptions = cvmIssuerOptions;
    }

    public void setSecurityWord(String str) {
        this.securityWord = str;
    }

    public void setmChipCvmIssuerOptions(CvmIssuerOptions cvmIssuerOptions) {
        this.mChipCvmIssuerOptions = cvmIssuerOptions;
    }
}
