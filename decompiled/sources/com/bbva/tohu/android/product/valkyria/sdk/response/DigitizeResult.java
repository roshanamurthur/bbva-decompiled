package com.bbva.tohu.android.product.valkyria.sdk.response;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class DigitizeResult {
    private String cardUniqueReference;
    private String result;
    private String status;

    public DigitizeResult(String str, String str2, String str3) {
        this.cardUniqueReference = str;
        this.result = str2;
        this.status = str3;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getResult() {
        return this.result;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DigitizeResult{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', result='");
        sb2.append(this.result);
        sb2.append("', status='");
        return d.f(sb2, this.status, "'}");
    }
}
