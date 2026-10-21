package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class GetTransactionHistoryRequest {
    private String cardUniqueReference;

    public GetTransactionHistoryRequest(String str) {
        this.cardUniqueReference = str;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public String toString() {
        return d.f(new StringBuilder("GetTransactionHistoryRequest{cardUniqueReference='"), this.cardUniqueReference, "'}");
    }
}
