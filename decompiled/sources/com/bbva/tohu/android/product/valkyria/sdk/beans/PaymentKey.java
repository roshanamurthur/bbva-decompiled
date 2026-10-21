package com.bbva.tohu.android.product.valkyria.sdk.beans;

/* JADX INFO: loaded from: classes6.dex */
public class PaymentKey {
    private String type;
    private String value;

    public PaymentKey(String str, String str2) {
        this.type = str;
        this.value = str2;
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
