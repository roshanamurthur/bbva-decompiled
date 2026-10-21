package com.vasco.digipass.sdk.responses;

/* JADX INFO: loaded from: classes9.dex */
public class GenerationResponse extends GenericResponse {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f65834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f65835g;

    public GenerationResponse(int i10) {
        super(i10);
    }

    public String getHostCode() {
        return this.f65835g;
    }

    public String getResponse() {
        return this.f65834f;
    }

    public GenerationResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public GenerationResponse(int i10, int i11, byte[] bArr, int i12, String str, String str2) {
        super(i10, i11, bArr, i12);
        this.f65834f = str;
        this.f65835g = str2;
    }
}
