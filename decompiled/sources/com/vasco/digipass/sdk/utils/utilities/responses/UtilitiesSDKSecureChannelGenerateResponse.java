package com.vasco.digipass.sdk.utils.utilities.responses;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKSecureChannelGenerateResponse extends UtilitiesSDKResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f66533c;

    public UtilitiesSDKSecureChannelGenerateResponse(int i10) {
        super(i10);
    }

    public String getMessage() {
        return this.f66533c;
    }

    public UtilitiesSDKSecureChannelGenerateResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public UtilitiesSDKSecureChannelGenerateResponse(int i10, String str) {
        super(i10);
        this.f66533c = str;
    }
}
