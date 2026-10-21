package com.vasco.digipass.sdk.utils.utilities.responses;

import com.vasco.digipass.sdk.utils.utilities.sc.UtilitiesSDKSecureChannelMessage;

/* JADX INFO: loaded from: classes9.dex */
public class UtilitiesSDKSecureChannelParseResponse extends UtilitiesSDKResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private UtilitiesSDKSecureChannelMessage f66534c;

    public UtilitiesSDKSecureChannelParseResponse(int i10) {
        super(i10);
    }

    public UtilitiesSDKSecureChannelMessage getMessage() {
        return this.f66534c;
    }

    public UtilitiesSDKSecureChannelParseResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public UtilitiesSDKSecureChannelParseResponse(int i10, UtilitiesSDKSecureChannelMessage utilitiesSDKSecureChannelMessage) {
        super(i10);
        this.f66534c = utilitiesSDKSecureChannelMessage;
    }
}
