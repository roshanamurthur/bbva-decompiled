package com.bbva.tohu.android.product.valkyria.sdk.request.backend.dto;

import ad.d;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class SharedPreferencesDto {
    private String activePayment;
    private String did;
    private String favorite;
    private String mpInit;
    private String push;
    private List<String> replNeededCards;
    private String threshold;

    public String getActivePayment() {
        return this.activePayment;
    }

    public String getDid() {
        return this.did;
    }

    public String getFavorite() {
        return this.favorite;
    }

    public String getMpInit() {
        return this.mpInit;
    }

    public String getPush() {
        return this.push;
    }

    public List<String> getReplNeededCards() {
        return this.replNeededCards;
    }

    public String getThreshold() {
        return this.threshold;
    }

    public void setActivePayment(Boolean bool) {
        this.activePayment = String.valueOf(bool);
    }

    public void setDid(String str) {
        this.did = str;
    }

    public void setFavorite(String str) {
        this.favorite = str;
    }

    public void setMpInit(boolean z10) {
        this.mpInit = String.valueOf(z10);
    }

    public void setPush(String str) {
        this.push = str;
    }

    public void setReplNeededCards(List<String> list) {
        this.replNeededCards = list;
    }

    public void setThreshold(int i10) {
        this.threshold = String.valueOf(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SharedPreferencesDto{favorite='");
        sb2.append(this.favorite);
        sb2.append("', threshold='");
        sb2.append(this.threshold);
        sb2.append("', activePayment='");
        sb2.append(this.activePayment);
        sb2.append("', replNeededCards=");
        sb2.append(this.replNeededCards);
        sb2.append(", mpInit='");
        sb2.append(this.mpInit);
        sb2.append("', did='");
        sb2.append(this.did);
        sb2.append("', push='");
        return d.f(sb2, this.push, "'}");
    }
}
