package com.google.crypto.tink.aead.internal;

import cf.b;
import cf.c;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes10.dex */
public final class InsecureNonceChaCha20Poly1305 extends c {
    public InsecureNonceChaCha20Poly1305(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // cf.c
    public final b b(int i10, byte[] bArr) throws InvalidKeyException {
        return new InsecureNonceChaCha20(bArr, i10);
    }

    @Override // cf.c
    public /* bridge */ /* synthetic */ byte[] decrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.decrypt(byteBuffer, bArr, bArr2);
    }

    @Override // cf.c
    public /* bridge */ /* synthetic */ void encrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        super.encrypt(byteBuffer, bArr, bArr2, bArr3);
    }

    @Override // cf.c
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return super.decrypt(bArr, bArr2, bArr3);
    }

    @Override // cf.c
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return super.encrypt(bArr, bArr2, bArr3);
    }
}
