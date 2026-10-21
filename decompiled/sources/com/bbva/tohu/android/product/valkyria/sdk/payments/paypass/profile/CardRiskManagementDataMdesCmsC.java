package com.bbva.tohu.android.product.valkyria.sdk.payments.paypass.profile;

import flexjson.JSON;

/* JADX INFO: loaded from: classes6.dex */
class CardRiskManagementDataMdesCmsC {

    @JSON(name = "additionalCheckTable")
    private String additionalCheckTable;

    @JSON(name = "crmCountryCode")
    private String crmCountryCode;

    public String getAdditionalCheckTable() {
        return this.additionalCheckTable;
    }

    public String getCrmCountryCode() {
        return this.crmCountryCode;
    }

    public void setAdditionalCheckTable(String str) {
        this.additionalCheckTable = str;
    }

    public void setCrmCountryCode(String str) {
        this.crmCountryCode = str;
    }
}
