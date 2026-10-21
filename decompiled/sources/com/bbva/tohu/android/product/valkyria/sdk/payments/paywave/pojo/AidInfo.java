package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes6.dex */
public class AidInfo {
    private String CVMrequired;
    private ODAData ODAData;
    private String aid;
    private String applicationLabel;
    private String asrpd;
    private String cap;
    private String priority;
    private QVSDCData qVSDCData;

    public String getAid() {
        return this.aid;
    }

    public String getApplicationLabel() {
        return this.applicationLabel;
    }

    public String getAsrpd() {
        return this.asrpd;
    }

    public String getCVMrequired() {
        return this.CVMrequired;
    }

    public String getCap() {
        return this.cap;
    }

    public ODAData getODAData() {
        return this.ODAData;
    }

    public String getPriority() {
        return this.priority;
    }

    public QVSDCData getqVSDCData() {
        return this.qVSDCData;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setApplicationLabel(String str) {
        this.applicationLabel = str;
    }

    public void setAsrpd(String str) {
        this.asrpd = str;
    }

    public void setCVMrequired(String str) {
        this.CVMrequired = str;
    }

    public void setCap(String str) {
        this.cap = str;
    }

    public void setODAData(ODAData oDAData) {
        this.ODAData = oDAData;
    }

    public void setPriority(String str) {
        this.priority = str;
    }

    public void setqVSDCData(QVSDCData qVSDCData) {
        this.qVSDCData = qVSDCData;
    }

    public String toString() {
        return "AidInfo{applicationLabel='" + this.applicationLabel + "', aid='" + this.aid + "', priority='" + this.priority + "', cap='" + this.cap + "', CVMrequired='" + this.CVMrequired + "', asrpd='" + this.asrpd + "', qVSDCData=" + this.qVSDCData + ", ODAData=" + this.ODAData + AbstractJsonLexerKt.END_OBJ;
    }
}
