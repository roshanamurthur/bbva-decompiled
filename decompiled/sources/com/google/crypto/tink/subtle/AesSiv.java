package com.google.crypto.tink.subtle;

import androidx.appcompat.widget.a;
import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.mac.internal.AesUtil;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
public final class AesSiv implements DeterministicAead {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f47420c = Arrays.asList(64);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f47421d = new byte[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f47422e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PrfAesCmac f47423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f47424b;

    public AesSiv(byte[] bArr) throws GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f47420c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(a.c(new StringBuilder("invalid key size: "), bArr.length, " bytes; key must have 64 bytes"));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f47424b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f47423a = new PrfAesCmac(bArrCopyOfRange);
    }

    public final byte[] a(byte[]... bArr) throws GeneralSecurityException {
        int length = bArr.length;
        PrfAesCmac prfAesCmac = this.f47423a;
        if (length == 0) {
            return prfAesCmac.compute(f47422e, 16);
        }
        byte[] bArrCompute = prfAesCmac.compute(f47421d, 16);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrCompute = Bytes.xor(AesUtil.dbl(bArrCompute), prfAesCmac.compute(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return prfAesCmac.compute(bArr3.length >= 16 ? Bytes.xorEnd(bArr3, bArrCompute) : Bytes.xor(AesUtil.cmacPad(bArr3), AesUtil.dbl(bArrCompute)), 16);
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] decryptDeterministically(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        engineFactory.init(2, new SecretKeySpec(this.f47424b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = engineFactory.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && SubtleUtil.isAndroid()) {
            bArrDoFinal = new byte[0];
        }
        if (Bytes.equal(bArrCopyOfRange, a(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    @Override // com.google.crypto.tink.DeterministicAead
    public byte[] encryptDeterministically(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/CTR/NoPadding");
        byte[] bArrA = a(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrA.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        engineFactory.init(1, new SecretKeySpec(this.f47424b, "AES"), new IvParameterSpec(bArr3));
        return Bytes.concat(bArrA, engineFactory.doFinal(bArr));
    }
}
