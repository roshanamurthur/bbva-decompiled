package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import ad.d;

/* JADX INFO: loaded from: classes6.dex */
public class IccCrtPrivateKey {
    String CoefDmodP;
    String CoefDmodQ;
    String CoefQinvModP;
    String exponent;
    String modulus;
    String primeP;
    String primeQ;

    public String getCoefDmodP() {
        return this.CoefDmodP;
    }

    public String getCoefDmodQ() {
        return this.CoefDmodQ;
    }

    public String getCoefQinvModP() {
        return this.CoefQinvModP;
    }

    public String getExponent() {
        return this.exponent;
    }

    public String getModulus() {
        return this.modulus;
    }

    public String getPrimeP() {
        return this.primeP;
    }

    public String getPrimeQ() {
        return this.primeQ;
    }

    public void setCoefDmodP(String str) {
        this.CoefDmodP = str;
    }

    public void setCoefDmodQ(String str) {
        this.CoefDmodQ = str;
    }

    public void setCoefQinvModP(String str) {
        this.CoefQinvModP = str;
    }

    public void setExponent(String str) {
        this.exponent = str;
    }

    public void setModulus(String str) {
        this.modulus = str;
    }

    public void setPrimeP(String str) {
        this.primeP = str;
    }

    public void setPrimeQ(String str) {
        this.primeQ = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("IccCrtPrivateKey{modulus='");
        sb2.append(this.modulus);
        sb2.append("', exponent='");
        sb2.append(this.exponent);
        sb2.append("', primeP='");
        sb2.append(this.primeP);
        sb2.append("', primeQ='");
        sb2.append(this.primeQ);
        sb2.append("', CoefDmodP='");
        sb2.append(this.CoefDmodP);
        sb2.append("', CoefDmodQ='");
        sb2.append(this.CoefDmodQ);
        sb2.append("', CoefQinvModP='");
        return d.f(sb2, this.CoefQinvModP, "'}");
    }
}
