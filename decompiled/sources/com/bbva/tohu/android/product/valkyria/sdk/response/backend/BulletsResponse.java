package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class BulletsResponse {
    private String atc;
    private String keyLocator;

    public String getAtc() {
        return this.atc;
    }

    public String getKeyLocator() {
        return this.keyLocator;
    }

    public void setAtc(String str) {
        this.atc = str;
    }

    public void setKeyLocator(String str) {
        this.keyLocator = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BulletsResponse{atc='");
        sb2.append(this.atc);
        sb2.append("', keyLocator='");
        return d.f(sb2, this.keyLocator, "'}");
    }
}
