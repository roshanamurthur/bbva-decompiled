package com.vasco.digipass.sdk.utils.qrcodescanner;

/* JADX INFO: loaded from: classes9.dex */
public class QRCodeScannerSDKException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f65852a;

    public QRCodeScannerSDKException(int i10) {
        this(i10, null);
    }

    public int getErrorCode() {
        return this.f65852a;
    }

    public QRCodeScannerSDKException(int i10, Throwable th2) {
        super(th2);
        this.f65852a = i10;
    }
}
