package com.vasco.digipass.sdk.responses;

import com.vasco.digipass.sdk.obfuscated.q;

/* JADX INFO: loaded from: classes9.dex */
public class ManageApplicationResponse extends DigipassResponse {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f65839c;

    public ManageApplicationResponse(int i10) {
        super(i10);
    }

    public byte[] getDynamicVector() {
        return q.c(this.f65839c);
    }

    public ManageApplicationResponse(int i10, Throwable th2) {
        super(i10, th2);
    }

    public ManageApplicationResponse(int i10, byte[] bArr) {
        super(i10);
        this.f65839c = q.c(bArr);
    }
}
