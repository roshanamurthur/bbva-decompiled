package com.bbva.tohu.android.product.valkyria.sdk.utils;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class UpdateTokenStateMessage {
    private List<TokenMessage> tokens;

    public List<TokenMessage> getTokens() {
        return this.tokens;
    }

    public void setTokens(List<TokenMessage> list) {
        this.tokens = list;
    }

    public String toString() {
        return "{\"tokens\":" + this.tokens.toString() + "}";
    }
}
