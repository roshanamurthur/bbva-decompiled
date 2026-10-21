package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

/* JADX INFO: loaded from: classes6.dex */
public class GenericPubKeyCert {
    private String certificate;
    private ExpirationDate expirationDate;
    private String exponent;
    private String remainder;

    public String getCertificate() {
        return this.certificate;
    }

    public ExpirationDate getExpirationDate() {
        return this.expirationDate;
    }

    public String getExponent() {
        return this.exponent;
    }

    public String getRemainder() {
        return this.remainder;
    }

    public void setCertificate(String str) {
        this.certificate = str;
    }

    public void setExpirationDate(ExpirationDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public void setExponent(String str) {
        this.exponent = str;
    }

    public void setRemainder(String str) {
        this.remainder = str;
    }
}
