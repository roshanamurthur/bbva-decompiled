package com.google.crypto.tink.aead.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.subtle.AesGcmJce;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class AesGcmFactory implements AeadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46562a;

    public AesGcmFactory(int i10) throws GeneralSecurityException {
        if (i10 != 16 && i10 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid AES key size, expected 16 or 32, but got %d", Integer.valueOf(i10)));
        }
        this.f46562a = i10;
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public Aead createAead(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length == getKeySizeInBytes()) {
            return new AesGcmJce(bArr);
        }
        throw new GeneralSecurityException(String.format("Symmetric key has incorrect length; expected %s, but got %s", Integer.valueOf(getKeySizeInBytes()), Integer.valueOf(bArr.length)));
    }

    @Override // com.google.crypto.tink.aead.subtle.AeadFactory
    public int getKeySizeInBytes() {
        return this.f46562a;
    }
}
