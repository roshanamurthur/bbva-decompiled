package com.mastercard.mpsdk.mcbp.mcmlite.mobilekernel;

import com.mastercard.mpsdk.mcbp.mcmlite.impl.output.CryptogramOutput;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes10.dex */
public class TransactionOutput {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f50965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f50966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f50967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f50968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f50969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f50970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CryptogramOutput f50971g;

    public TransactionOutput(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, boolean z10, CryptogramOutput cryptogramOutput) {
        this.f50965a = bArr;
        this.f50966b = bArr2;
        this.f50967c = bArr3;
        this.f50968d = bArr4;
        this.f50969e = bArr5;
        this.f50970f = z10;
        this.f50971g = cryptogramOutput;
    }

    public byte[] getAip() {
        return this.f50968d;
    }

    public CryptogramOutput getCryptogramOutput() {
        return this.f50971g;
    }

    public byte[] getExpiryDate() {
        return this.f50969e;
    }

    public byte[] getPan() {
        return this.f50966b;
    }

    public byte[] getPanSequenceNumber() {
        return this.f50967c;
    }

    public byte[] getTrack2EquivalentData() {
        return this.f50965a;
    }

    public boolean isCvmEntered() {
        return this.f50970f;
    }

    public void wipe() {
        McmLiteUtils.clearByteArray(this.f50968d);
        McmLiteUtils.clearByteArray(this.f50969e);
        McmLiteUtils.clearByteArray(this.f50966b);
        McmLiteUtils.clearByteArray(this.f50967c);
        McmLiteUtils.clearByteArray(this.f50965a);
        this.f50971g.wipe();
    }
}
