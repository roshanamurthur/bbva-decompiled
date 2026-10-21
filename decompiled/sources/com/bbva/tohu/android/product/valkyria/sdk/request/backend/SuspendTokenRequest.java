package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class SuspendTokenRequest {
    private String cardUniqueReference;

    public SuspendTokenRequest(String str) {
        this.cardUniqueReference = str;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public String toString() {
        return d.f(new StringBuilder("SuspendTokenRequest{cardUniqueReference='"), this.cardUniqueReference, "'}");
    }
}
