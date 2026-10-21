package com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto;

import ad.d;
import com.bbva.tohu.android.product.valkyria.sdk.model.Token;

/* JADX INFO: loaded from: classes6.dex */
public class TokenDto {
    private String api;
    private String cardUniqueRef;
    private String dki;
    private String provider;

    /* JADX INFO: renamed from: sc, reason: collision with root package name */
    private String f36933sc;
    private String state;

    public TokenDto(Token token) {
        this.cardUniqueRef = token.getCardUniqueReference();
        this.provider = token.getProvider();
        this.state = token.getState();
        this.f36933sc = token.getSc() == null ? null : String.valueOf(token.getSc());
        this.dki = token.getDki();
        this.api = token.getApi();
    }

    public String getApi() {
        return this.api;
    }

    public String getCardUniqueRef() {
        return this.cardUniqueRef;
    }

    public String getDki() {
        return this.dki;
    }

    public String getProvider() {
        return this.provider;
    }

    public String getSc() {
        return this.f36933sc;
    }

    public String getState() {
        return this.state;
    }

    public void setApi(String str) {
        this.api = str;
    }

    public void setCardUniqueRef(String str) {
        this.cardUniqueRef = str;
    }

    public void setDki(String str) {
        this.dki = str;
    }

    public void setProvider(String str) {
        this.provider = str;
    }

    public void setSc(String str) {
        this.f36933sc = str;
    }

    public void setState(String str) {
        this.state = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TokenDto{cardUniqueRef='");
        sb2.append(this.cardUniqueRef);
        sb2.append("', provider='");
        sb2.append(this.provider);
        sb2.append("', state='");
        sb2.append(this.state);
        sb2.append("', sc='");
        sb2.append(this.f36933sc);
        sb2.append("', dki='");
        sb2.append(this.dki);
        sb2.append("', api='");
        return d.f(sb2, this.api, "'}");
    }
}
