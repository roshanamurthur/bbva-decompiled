package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class QVSDCData {
    private String auc;
    private String ced;
    private String cid;
    private String countryCode;
    private String ctq;
    private String cvn;
    private String digitalWalletID;
    private String ffi;
    private String psn;
    private QVSDCWithODA qVSDCWithODA;
    private QVSDCWithoutODA qVSDCWithoutODA;

    public String getAuc() {
        return this.auc;
    }

    public String getCed() {
        return this.ced;
    }

    public String getCid() {
        return this.cid;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCtq() {
        return this.ctq;
    }

    public String getCvn() {
        return this.cvn;
    }

    public String getDigitalWalletID() {
        return this.digitalWalletID;
    }

    public String getFfi() {
        return this.ffi;
    }

    public String getPsn() {
        return this.psn;
    }

    public QVSDCWithODA getqVSDCWithODA() {
        return this.qVSDCWithODA;
    }

    public QVSDCWithoutODA getqVSDCWithoutODA() {
        return this.qVSDCWithoutODA;
    }

    public void setAuc(String str) {
        this.auc = str;
    }

    public void setCed(String str) {
        this.ced = str;
    }

    public void setCid(String str) {
        this.cid = str;
    }

    public void setCountryCode(String str) {
        this.countryCode = str;
    }

    public void setCtq(String str) {
        this.ctq = str;
    }

    public void setCvn(String str) {
        this.cvn = str;
    }

    public void setDigitalWalletID(String str) {
        this.digitalWalletID = str;
    }

    public void setFfi(String str) {
        this.ffi = str;
    }

    public void setPsn(String str) {
        this.psn = str;
    }

    public void setqVSDCWithODA(QVSDCWithODA qVSDCWithODA) {
        this.qVSDCWithODA = qVSDCWithODA;
    }

    public void setqVSDCWithoutODA(QVSDCWithoutODA qVSDCWithoutODA) {
        this.qVSDCWithoutODA = qVSDCWithoutODA;
    }

    public String toString() {
        return "QVSDCData{ctq='" + this.ctq + "', ced='" + this.ced + "', ffi='" + this.ffi + "', auc='" + this.auc + "', psn='" + this.psn + "', cvn='" + this.cvn + "', digitalWalletID='" + this.digitalWalletID + "', countryCode='" + this.countryCode + "', cid='" + this.cid + "', qVSDCWithoutODA=" + this.qVSDCWithoutODA + ", qVSDCWithODA=" + this.qVSDCWithODA + AbstractJsonLexerKt.END_OBJ;
    }
}
