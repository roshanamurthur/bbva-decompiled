package com.bbva.tohu.android.product.valkyria.sdk.response.backend;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class GetToken {
    private String cardProfile;
    private String cardUniqueReference;
    private String provider;
    private String status;

    public String getCardProfile() {
        return this.cardProfile;
    }

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getStatus() {
        return this.status;
    }

    public void setCardProfile(String str) {
        this.cardProfile = str;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("GetToken{cardUniqueReference='");
        sb2.append(this.cardUniqueReference);
        sb2.append("', cardProfile='***', status='");
        sb2.append(this.status);
        sb2.append("', provider='");
        return d.f(sb2, this.provider, "'}");
    }
}
