package com.mastercard.mpsdk.mcbp.mcmlite.impl.output;

import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes10.dex */
public final class CryptogramOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f50890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f50892d;

    public CryptogramOutput(byte[] bArr, byte[] bArr2, byte[] bArr3, byte b10) {
        this.f50889a = bArr;
        this.f50890b = bArr2;
        this.f50891c = bArr3;
        this.f50892d = b10;
    }

    public final byte[] getAtc() {
        return this.f50889a;
    }

    public final byte getCid() {
        return this.f50892d;
    }

    public final byte[] getCryptogram() {
        return this.f50891c;
    }

    public final byte[] getIssuerApplicationData() {
        return this.f50890b;
    }

    public final void wipe() {
        McmLiteUtils.clearByteArray(this.f50889a);
        McmLiteUtils.clearByteArray(this.f50891c);
        McmLiteUtils.clearByteArray(this.f50890b);
    }
}
