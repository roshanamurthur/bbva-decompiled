package com.google.crypto.tink.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20Poly1305;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class XChaCha20Poly1305 implements Aead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InsecureNonceXChaCha20Poly1305 f47505a;

    public XChaCha20Poly1305(byte[] bArr) throws GeneralSecurityException {
        this.f47505a = new InsecureNonceXChaCha20Poly1305(bArr);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, 24);
        return this.f47505a.decrypt(ByteBuffer.wrap(bArr, 24, bArr.length - 24), bArrCopyOf, bArr2);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] bArrRandBytes = Random.randBytes(24);
        byteBufferAllocate.put(bArrRandBytes);
        this.f47505a.encrypt(byteBufferAllocate, bArrRandBytes, bArr, bArr2);
        return byteBufferAllocate.array();
    }
}
