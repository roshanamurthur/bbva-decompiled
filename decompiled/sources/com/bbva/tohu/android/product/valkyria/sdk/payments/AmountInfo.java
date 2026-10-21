package com.bbva.tohu.android.product.valkyria.sdk.payments;

/* JADX INFO: loaded from: classes6.dex */
public class AmountInfo {
    private String amount;
    private String currencyCode;

    public AmountInfo(String str, String str2) {
        this.amount = str;
        this.currencyCode = str2;
    }

    public String getAmount() {
        return this.amount;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setAmount(String str) {
        this.amount = str;
    }

    public void setCurrencyCode(String str) {
        this.currencyCode = str;
    }
}
