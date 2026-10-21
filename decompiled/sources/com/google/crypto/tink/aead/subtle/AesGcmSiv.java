package com.google.crypto.tink.aead.subtle;

import com.google.crypto.tink.Aead;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Random;
import com.google.crypto.tink.subtle.SubtleUtil;
import com.google.crypto.tink.subtle.Validators;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class AesGcmSiv implements Aead {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46563b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f46564a;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e5) {
                throw new IllegalStateException(e5);
            }
        }
    }

    public AesGcmSiv(byte[] bArr) throws GeneralSecurityException {
        Validators.validateAesKeySize(bArr.length);
        this.f46564a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec a(int i10, byte[] bArr) throws GeneralSecurityException {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, 0, i10);
        } catch (ClassNotFoundException unused) {
            if (SubtleUtil.isAndroid()) {
                return new IvParameterSpec(bArr, 0, i10);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = a(12, bArr);
        a aVar = f46563b;
        aVar.get().init(2, this.f46564a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        return aVar.get().doFinal(bArr, 12, bArr.length - 12);
    }

    @Override // com.google.crypto.tink.Aead
    public byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] bArrRandBytes = Random.randBytes(12);
        System.arraycopy(bArrRandBytes, 0, bArr3, 0, 12);
        AlgorithmParameterSpec algorithmParameterSpecA = a(bArrRandBytes.length, bArrRandBytes);
        a aVar = f46563b;
        aVar.get().init(1, this.f46564a, algorithmParameterSpecA);
        if (bArr2 != null && bArr2.length != 0) {
            aVar.get().updateAAD(bArr2);
        }
        int iDoFinal = aVar.get().doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (iDoFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr.length)));
    }
}
