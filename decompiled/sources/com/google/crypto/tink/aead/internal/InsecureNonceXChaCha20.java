package com.google.crypto.tink.aead.internal;

import cf.a;
import cf.b;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public class InsecureNonceXChaCha20 extends b {
    public static final int NONCE_SIZE_IN_BYTES = 24;

    public InsecureNonceXChaCha20(byte[] bArr, int i10) throws InvalidKeyException {
        super(bArr, i10);
    }

    @Override // cf.b
    public final int[] createInitialState(int[] iArr, int i10) {
        if (iArr.length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        int[] iArr3 = new int[16];
        int[] iArr4 = this.f25432a;
        int[] iArr5 = a.f25431a;
        System.arraycopy(iArr5, 0, iArr3, 0, iArr5.length);
        System.arraycopy(iArr4, 0, iArr3, iArr5.length, 8);
        iArr3[12] = iArr[0];
        iArr3[13] = iArr[1];
        iArr3[14] = iArr[2];
        iArr3[15] = iArr[3];
        a.b(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        int[] iArrCopyOf = Arrays.copyOf(iArr3, 8);
        System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
        System.arraycopy(iArrCopyOf, 0, iArr2, iArr5.length, 8);
        iArr2[12] = i10;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
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
    public final int nonceSizeInBytes() {
        return 24;
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
