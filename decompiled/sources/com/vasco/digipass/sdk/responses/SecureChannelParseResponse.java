package com.vasco.digipass.sdk.responses;

import com.vasco.digipass.sdk.models.SecureChannelMessage;

/* JADX INFO: loaded from: classes9.dex */
public class SecureChannelParseResponse extends DigipassResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SecureChannelMessage f65843c;

    public SecureChannelParseResponse(int i10) {
        super(i10);
    }

    public SecureChannelMessage getMessage() {
        return this.f65843c;
    }

    public SecureChannelParseResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public SecureChannelParseResponse(int i10, SecureChannelMessage secureChannelMessage) {
        super(i10);
        this.f65843c = secureChannelMessage;
    }
}
