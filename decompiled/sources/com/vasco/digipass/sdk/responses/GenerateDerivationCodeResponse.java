package com.vasco.digipass.sdk.responses;

/* JADX INFO: loaded from: classes9.dex */
public class GenerateDerivationCodeResponse extends GenericResponse {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f65833f;

    public GenerateDerivationCodeResponse(int i10) {
        super(i10);
    }

    public String getDerivationCode() {
        return this.f65833f;
    }

    public GenerateDerivationCodeResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public GenerateDerivationCodeResponse(int i10, int i11, byte[] bArr, int i12, String str) {
        super(i10, i11, bArr, i12);
        this.f65833f = str;
    }
}
