package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.internal.InsecureNonceChaCha20Poly1305;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class ChaCha20Poly1305 implements Aead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsecureNonceChaCha20Poly1305 f47430a;

    public ChaCha20Poly1305(byte[] bArr) throws GeneralSecurityException {
        this.f47430a = new InsecureNonceChaCha20Poly1305(bArr);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
        return this.f47430a.decrypt(ByteBuffer.wrap(bArr, 12, bArr.length - 12), bArrCopyOf, bArr2);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] bArrRandBytes = Random.randBytes(12);
        byteBufferAllocate.put(bArrRandBytes);
        this.f47430a.encrypt(byteBufferAllocate, bArrRandBytes, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}
