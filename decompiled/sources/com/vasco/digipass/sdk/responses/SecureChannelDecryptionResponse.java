package com.vasco.digipass.sdk.responses;

/* JADX INFO: loaded from: classes9.dex */
public class SecureChannelDecryptionResponse extends DigipassResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f65841c;

    public SecureChannelDecryptionResponse(int i10) {
        super(i10);
    }

    public String getMessageBody() {
        return this.f65841c;
    }

    public SecureChannelDecryptionResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public SecureChannelDecryptionResponse(int i10, String str) {
        super(i10);
        this.f65841c = str;
    }
}
