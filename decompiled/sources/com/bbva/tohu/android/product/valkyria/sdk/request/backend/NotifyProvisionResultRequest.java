package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class NotifyProvisionResultRequest {
    private String cardUniqueReference;
    private String errorCode;
    private String errorDescription;
    private String result;

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public String getErrorDescription() {
        return this.errorDescription;
    }

    public String getResult() {
        return this.result;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    public void setErrorDescription(String str) {
        this.errorDescription = str;
    }

    public void setResult(String str) {
        this.result = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyProvisionResultRequest{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', result='");
        sb2.append(this.result);
        sb2.append("', errorCode='");
        sb2.append(this.errorCode);
        sb2.append("', errorDescription='");
        return d.f(sb2, this.errorDescription, "'}");
    }
}
