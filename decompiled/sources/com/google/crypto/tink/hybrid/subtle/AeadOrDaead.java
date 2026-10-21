package com.google.crypto.tink.hybrid.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.DeterministicAead;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public class AeadOrDaead {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Aead f46589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeterministicAead f46590b;

    public AeadOrDaead(Aead aead) {
        this.f46589a = aead;
        this.f46590b = null;
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Aead aead = this.f46589a;
        return aead != null ? aead.decrypt(bArr, bArr2) : this.f46590b.decryptDeterministically(bArr, bArr2);
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Aead aead = this.f46589a;
        return aead != null ? aead.encrypt(bArr, bArr2) : this.f46590b.encryptDeterministically(bArr, bArr2);
    }

    public AeadOrDaead(DeterministicAead deterministicAead) {
        this.f46589a = null;
        this.f46590b = deterministicAead;
    }
}
