package com.bbva.tohu.android.product.valkyria.sdk.export.exceptions;

import com.bbva.tohu.android.product.valkyria.sdk.export.constants.ResponseCodes;

/* JADX INFO: loaded from: classes6.dex */
public class CardNotFoundException extends TohuSdkException {
    private String cardUniqueReference;

    public CardNotFoundException(Exception exc, String str) {
        super(ResponseCodes.TOHU_CARD_NOT_FOUND, exc);
        this.cardUniqueReference = str;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public CardNotFoundException(Exception exc) {
        super(ResponseCodes.TOHU_CARD_NOT_FOUND, exc);
    }
}
