package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

/* JADX INFO: loaded from: classes10.dex */
public class CryptogramInput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f50934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50936d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f50937e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f50938f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f50939g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f50940h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CryptogramType f50941i;

    public CryptogramInput(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte[] bArr7, byte[] bArr8, CryptogramType cryptogramType) {
        this.f50933a = bArr;
        this.f50934b = bArr2;
        this.f50935c = bArr3;
        this.f50936d = bArr4;
        this.f50937e = bArr5;
        this.f50938f = bArr6;
        this.f50939g = bArr7;
        this.f50940h = bArr8;
        this.f50941i = cryptogramType;
    }

    public static CryptogramInput forDe55(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, byte[] bArr6, byte b10) {
        return new CryptogramInput(bArr, bArr2, bArr3, new byte[5], bArr4, bArr5, new byte[]{b10}, bArr6, CryptogramType.DE55);
    }

    public static CryptogramInput forUcaf(byte[] bArr) {
        return new CryptogramInput(new byte[6], new byte[6], new byte[2], new byte[5], new byte[2], new byte[3], new byte[]{0}, bArr, CryptogramType.UCAF);
    }

    public byte[] getAmountAuthorized() {
        return this.f50933a;
    }

    public byte[] getAmountOther() {
        return this.f50934b;
    }

    public CryptogramType getCryptogramType() {
        return this.f50941i;
    }

    public byte[] getTerminalCountryCode() {
        return this.f50935c;
    }

    public byte[] getTransactionCurrencyCode() {
        return this.f50937e;
    }

    public byte[] getTransactionDate() {
        return this.f50938f;
    }

    public byte[] getTransactionType() {
        return this.f50939g;
    }

    public byte[] getTvr() {
        return this.f50936d;
    }

    public byte[] getUnpredictableNumber() {
        return this.f50940h;
    }
}
