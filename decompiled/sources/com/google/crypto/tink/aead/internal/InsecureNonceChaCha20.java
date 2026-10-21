package com.google.crypto.tink.aead.internal;

import cf.a;
import cf.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes10.dex */
public class InsecureNonceChaCha20 extends b {
    public InsecureNonceChaCha20(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // cf.b
    public int[] createInitialState(int[] iArr, int i10) {
        if (iArr.length != nonceSizeInBytes() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = this.f25432a;
        int[] iArr4 = a.f25431a;
        System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
        System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
        iArr2[12] = i10;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // cf.b
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.decrypt(bArr, byteBuffer);
    }

    @Override // cf.b
    public /* bridge */ /* synthetic */ void encrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        super.encrypt(byteBuffer, bArr, bArr2);
    }

    @Override // cf.b
    public int nonceSizeInBytes() {
        return 12;
    }

    @Override // cf.b
    public /* bridge */ /* synthetic */ byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.decrypt(bArr, bArr2);
    }

    @Override // cf.b
    public /* bridge */ /* synthetic */ byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.encrypt(bArr, bArr2);
    }
}
