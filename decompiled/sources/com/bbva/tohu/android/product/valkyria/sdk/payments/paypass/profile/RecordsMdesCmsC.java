package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
public class RecordsMdesCmsC {

    @JSON(name = "recordNumber")
    private int recordNumber;

    @JSON(name = "recordValue")
    private String recordValue;

    @JSON(name = "sfi")
    private String sfi;

    public int getRecordNumber() {
        return this.recordNumber;
    }

    public String getRecordValue() {
        return this.recordValue;
    }

    public String getSfi() {
        return this.sfi;
    }

    public void setRecordNumber(int i10) {
        this.recordNumber = i10;
    }

    public void setRecordValue(String str) {
        this.recordValue = str;
    }

    public void setSfi(String str) {
        this.sfi = str;
    }
}
