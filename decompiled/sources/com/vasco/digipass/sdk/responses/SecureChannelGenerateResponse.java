package com.vasco.digipass.sdk.responses;

import com.vasco.digipass.sdk.models.SecureChannelMessage;

/* JADX INFO: loaded from: classes9.dex */
public class SecureChannelGenerateResponse extends DigipassResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureChannelMessage f65842c;

    public SecureChannelGenerateResponse(int i10) {
        super(i10);
    }

    public SecureChannelMessage getSecureChannelMessage() {
        return this.f65842c;
    }

    public SecureChannelGenerateResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public SecureChannelGenerateResponse(int i10, SecureChannelMessage secureChannelMessage) {
        super(i10);
        this.f65842c = secureChannelMessage;
    }
}
