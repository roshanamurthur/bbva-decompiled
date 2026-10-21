package com.bbva.tohu.android.product.valkyria.sdk.utils;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class DigitizeMessage {
    private String cardUniqueReference;
    private String statusCode;

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getStatusCode() {
        return this.statusCode;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setStatusCode(String str) {
        this.statusCode = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\"cardUniqueReference\":\"");
        sb2.append(this.cardUniqueReference);
        sb2.append("\", \"statusCode\":\"");
        return d.f(sb2, this.statusCode, "\"}");
    }
}
