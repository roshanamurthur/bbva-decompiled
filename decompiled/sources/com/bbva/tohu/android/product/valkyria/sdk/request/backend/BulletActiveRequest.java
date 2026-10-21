package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class BulletActiveRequest {
    private String atc;
    private String timestamp;

    public String getAtc() {
        return this.atc;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setAtc(String str) {
        this.atc = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("BulletActiveRequest{atc='");
        sb2.append(this.atc);
        sb2.append("', timestamp='");
        return d.f(sb2, this.timestamp, "'}");
    }
}
