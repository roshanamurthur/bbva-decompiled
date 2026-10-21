package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class UnsuspendTokenRequest {
    private String cardUniqueReference;

    public UnsuspendTokenRequest(String str) {
        this.cardUniqueReference = str;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public String toString() {
        return d.f(new StringBuilder("UnsuspendTokenRequest{cardUniqueReference='"), this.cardUniqueReference, "'}");
    }
}
