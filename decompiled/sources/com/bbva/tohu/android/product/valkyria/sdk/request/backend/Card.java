package com.bbva.tohu.android.product.valkyria.sdk.request.backend;

/* JADX INFO: loaded from: classes6.dex */
public class Card {
    private String cardUniqueReference;
    private String expiryMonth;
    private String expiryYear;
    private PanInfo panInfo;

    public String getCardUniqueReference() {
        return this.cardUniqueReference;
    }

    public String getExpiryMonth() {
        return this.expiryMonth;
    }

    public String getExpiryYear() {
        return this.expiryYear;
    }

    public PanInfo getPanInfo() {
        return this.panInfo;
    }

    public void setCardUniqueReference(String str) {
        this.cardUniqueReference = str;
    }

    public void setExpiryMonth(String str) {
        this.expiryMonth = str;
    }

    public void setExpiryYear(String str) {
        this.expiryYear = str;
    }

    public void setPanInfo(PanInfo panInfo) {
        this.panInfo = panInfo;
    }
}
