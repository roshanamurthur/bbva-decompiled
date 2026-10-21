package com.nimbusds.jose.crypto.impl;

import net.jcip.annotations.Immutable;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class AuthenticatedCipherText {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f62594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f62595b;

    public AuthenticatedCipherText(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.f62594a = bArr;
        if (bArr2 == null) {
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        this.f62595b = bArr2;
    }

    public byte[] getAuthenticationTag() {
        return this.f62595b;
    }

    public byte[] getCipherText() {
        return this.f62594a;
    }
}
