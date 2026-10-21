package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

import com.mastercard.mpsdk.mcbp.mcmlite.utils.Date;

/* JADX INFO: loaded from: classes10.dex */
public class DsrpInputData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f50942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f50943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public char f50944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f50945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f50946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CryptogramType f50947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Date f50948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f50949h;

    public char getCountryCode() {
        return this.f50949h;
    }

    public CryptogramType getCryptogramType() {
        return this.f50947f;
    }

    public char getCurrencyCode() {
        return this.f50944c;
    }

    public long getOtherAmount() {
        return this.f50943b;
    }

    public long getTransactionAmount() {
        return this.f50942a;
    }

    public Date getTransactionDate() {
        if (this.f50948g == null) {
            this.f50948g = new Date(0, 0, 0);
        }
        return this.f50948g;
    }

    public byte getTransactionType() {
        return this.f50945d;
    }

    public long getUnpredictableNumber() {
        return this.f50946e;
    }

    public void setCountryCode(char c10) {
        this.f50949h = c10;
    }

    public void setCryptogramType(CryptogramType cryptogramType) {
        this.f50947f = cryptogramType;
    }

    public void setCurrencyCode(char c10) {
        this.f50944c = c10;
    }

    public void setOtherAmount(long j10) {
        this.f50943b = j10;
    }

    public void setTransactionAmount(long j10) {
        this.f50942a = j10;
    }

    public void setTransactionDate(Date date) {
        this.f50948g = date;
    }

    public void setTransactionType(byte b10) {
        this.f50945d = b10;
    }

    public void setUnpredictableNumber(long j10) {
        this.f50946e = j10;
    }
}
