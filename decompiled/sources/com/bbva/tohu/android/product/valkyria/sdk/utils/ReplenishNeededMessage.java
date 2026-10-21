package com.bbva.tohu.android.product.valkyria.sdk.utils;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class ReplenishNeededMessage {
    private String cardUniqueReference;
    private String type;

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getType() {
        return this.type;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\"cardUniqueReference\":\"");
        sb2.append(this.cardUniqueReference);
        sb2.append("\", \"type\":\"");
        return d.f(sb2, this.type, "\"}");
    }
}
