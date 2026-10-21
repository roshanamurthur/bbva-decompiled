package com.vasco.digipass.sdk.responses;

/* JADX INFO: loaded from: classes9.dex */
public class MultiDeviceLicenseActivationResponse extends ActivationResponse {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f65840g;

    public MultiDeviceLicenseActivationResponse(int i10) {
        super(i10);
    }

    public String getDeviceCode() {
        return this.f65840g;
    }

    public MultiDeviceLicenseActivationResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public MultiDeviceLicenseActivationResponse(int i10, int i11, byte[] bArr, byte[] bArr2, String str) {
        super(i10, i11, bArr2, 0);
        super.setStaticVector(bArr);
        this.f65840g = str;
    }
}
