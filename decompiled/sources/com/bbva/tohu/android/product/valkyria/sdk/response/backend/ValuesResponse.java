package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class ValuesResponse {
    private String key;
    private String type;

    public String getKey() {
        return this.key;
    }

    public String getType() {
        return this.type;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ValuesResponse{type='");
        sb2.append(this.type);
        sb2.append("', key='");
        return d.f(sb2, this.key, "'}");
    }
}
