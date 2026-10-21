package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class StaticParams {
    private List<AidInfo> aidInfo;
    private String cardHolderNameVCPCS;
    private String countrycode5F55;
    private String issuerIdentificationNumber;
    private String kernelIdentifier;
    private MsdData msdData;
    private String pdol;
    private QVSDCData qVSDCData;
    private Track2DataDec track2DataDec;
    private Track2DataNotDec track2DataNotDec;

    public List<AidInfo> getAidInfo() {
        return this.aidInfo;
    }

    public String getCardHolderNameVCPCS() {
        return this.cardHolderNameVCPCS;
    }

    public String getCountrycode5F55() {
        return this.countrycode5F55;
    }

    public String getIssuerIdentificationNumber() {
        return this.issuerIdentificationNumber;
    }

    public String getKernelIdentifier() {
        return this.kernelIdentifier;
    }

    public MsdData getMsdData() {
        return this.msdData;
    }

    public String getPdol() {
        return this.pdol;
    }

    public Track2DataDec getTrack2DataDec() {
        return this.track2DataDec;
    }

    public Track2DataNotDec getTrack2DataNotDec() {
        return this.track2DataNotDec;
    }

    public QVSDCData getqVSDCData() {
        return this.qVSDCData;
    }

    public void setAidInfo(List<AidInfo> list) {
        this.aidInfo = list;
    }

    public void setCardHolderNameVCPCS(String str) {
        this.cardHolderNameVCPCS = str;
    }

    public void setCountrycode5F55(String str) {
        this.countrycode5F55 = str;
    }

    public void setIssuerIdentificationNumber(String str) {
        this.issuerIdentificationNumber = str;
    }

    public void setKernelIdentifier(String str) {
        this.kernelIdentifier = str;
    }

    public void setMsdData(MsdData msdData) {
        this.msdData = msdData;
    }

    public void setPdol(String str) {
        this.pdol = str;
    }

    public void setTrack2DataDec(Track2DataDec track2DataDec) {
        this.track2DataDec = track2DataDec;
    }

    public void setTrack2DataNotDec(Track2DataNotDec track2DataNotDec) {
        this.track2DataNotDec = track2DataNotDec;
    }

    public void setqVSDCData(QVSDCData qVSDCData) {
        this.qVSDCData = qVSDCData;
    }
}
