package com.google.crypto.tink.aead.internal;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.SubtleUtil;
import com.google.crypto.tink.subtle.Validators;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class InsecureNonceAesGcmJce {
    public static final int IV_SIZE_IN_BYTES = 12;
    public static final int TAG_SIZE_IN_BYTES = 16;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f46560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46561b;
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f46559c = new a();

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        public final Cipher initialValue() {
            try {
                return EngineFactory.CIPHER.getInstance("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e5) {
                throw new IllegalStateException(e5);
            }
        }
    }

    public InsecureNonceAesGcmJce(byte[] bArr, boolean z10) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        Validators.validateAesKeySize(bArr.length);
        this.f46560a = new SecretKeySpec(bArr, "AES");
        this.f46561b = z10;
    }

    public static AlgorithmParameterSpec a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        return (!SubtleUtil.isAndroid() || SubtleUtil.androidApiLevel() > 19) ? new GCMParameterSpec(128, bArr, 0, length) : new IvParameterSpec(bArr, 0, length);
    }

    public byte[] decrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z10 = this.f46561b;
        if (bArr2.length < (z10 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z10 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec algorithmParameterSpecA = a(bArr);
        a aVar = f46559c;
        aVar.get().init(2, this.f46560a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            aVar.get().updateAAD(bArr3);
        }
        int i10 = z10 ? 12 : 0;
        int length = bArr2.length;
        if (z10) {
            length -= 12;
        }
        return aVar.get().doFinal(bArr2, i10, length);
    }

    public byte[] encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z10 = this.f46561b;
        byte[] bArr4 = new byte[z10 ? bArr2.length + 28 : bArr2.length + 16];
        if (z10) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec algorithmParameterSpecA = a(bArr);
        a aVar = f46559c;
        aVar.get().init(1, this.f46560a, algorithmParameterSpecA);
        if (bArr3 != null && bArr3.length != 0) {
            aVar.get().updateAAD(bArr3);
        }
        int iDoFinal = aVar.get().doFinal(bArr2, 0, bArr2.length, bArr4, z10 ? 12 : 0);
        if (iDoFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - bArr2.length)));
    }
}
