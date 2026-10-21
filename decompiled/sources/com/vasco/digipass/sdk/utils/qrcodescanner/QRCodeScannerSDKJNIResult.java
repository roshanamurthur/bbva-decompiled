package com.vasco.digipass.sdk.utils.qrcodescanner;

/* JADX INFO: loaded from: classes9.dex */
public class QRCodeScannerSDKJNIResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f65853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f65854b;

    public int getCodePoints() {
        return this.f65853a;
    }

    public byte[] getProcessedCrontoImage() {
        return this.f65854b;
    }

    public void setCodePoints(int i10) {
        this.f65853a = i10;
    }

    public void setProcessedCrontoImage(byte[] bArr) {
        this.f65854b = bArr;
    }
}
