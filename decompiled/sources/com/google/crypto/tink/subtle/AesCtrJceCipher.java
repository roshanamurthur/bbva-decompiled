package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class AesCtrJceCipher implements IndCpaCipher {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f47394d = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f47395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f47396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f47397c;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e5) {
                throw new IllegalStateException(e5);
            }
        }
    }

    public AesCtrJceCipher(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateAesKeySize(bArr.length);
        this.f47395a = new SecretKeySpec(bArr, "AES");
        int blockSize = f47394d.get().getBlockSize();
        this.f47397c = blockSize;
        if (i10 < 12 || i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f47396b = i10;
    }

    public final void a(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, byte[] bArr3, boolean z10) throws GeneralSecurityException {
        Cipher cipher = f47394d.get();
        byte[] bArr4 = new byte[this.f47397c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f47396b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        SecretKeySpec secretKeySpec = this.f47395a;
        if (z10) {
            cipher.init(1, secretKeySpec, ivParameterSpec);
        } else {
            cipher.init(2, secretKeySpec, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i10, i11, bArr2, i12) != i11) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] decrypt(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f47396b;
        if (length < i10) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int length2 = bArr.length;
        int i11 = this.f47396b;
        byte[] bArr3 = new byte[length2 - i11];
        a(bArr, i11, bArr.length - i11, bArr3, 0, bArr2, false);
        return bArr3;
    }

    @Override // com.google.crypto.tink.subtle.IndCpaCipher
    public byte[] encrypt(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f47396b;
        if (length > Integer.MAX_VALUE - i10) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - i10));
        }
        byte[] bArr2 = new byte[bArr.length + i10];
        byte[] bArrRandBytes = Random.randBytes(i10);
        System.arraycopy(bArrRandBytes, 0, bArr2, 0, i10);
        a(bArr, 0, bArr.length, bArr2, this.f47396b, bArrRandBytes, true);
        return bArr2;
    }
}
