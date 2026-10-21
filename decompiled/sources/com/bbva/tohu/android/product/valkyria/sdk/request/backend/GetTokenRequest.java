package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class GetTokenRequest {
    private String cardUniqueReference;

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public String toString() {
        return d.f(new StringBuilder("GetTokenRequest{cardUniqueReference='"), this.cardUniqueReference, "'}");
    }
}
