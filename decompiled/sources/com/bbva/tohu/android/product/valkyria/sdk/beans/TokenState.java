package com.bbva.tohu.android.product.valkyria.sdk.beans;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class TokenState {
    private String cardUniqueReference;
    private String status;

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TokenState{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', status='");
        return d.f(sb2, this.status, "'}");
    }
}
