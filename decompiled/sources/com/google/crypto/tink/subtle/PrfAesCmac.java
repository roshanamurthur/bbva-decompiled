package com.google.crypto.tink.subtle;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.mac.internal.AesUtil;
import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public final class PrfAesCmac implements Prf {
    public static final TinkFipsUtil.AlgorithmFipsCompatibility FIPS = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f47470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f47471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f47472c;

    public PrfAesCmac(byte[] bArr) throws GeneralSecurityException {
        Validators.validateAesKeySize(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f47470a = secretKeySpec;
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, secretKeySpec);
        byte[] bArrDbl = AesUtil.dbl(engineFactory.doFinal(new byte[16]));
        this.f47471b = bArrDbl;
        this.f47472c = AesUtil.dbl(bArrDbl);
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] bArr, int i10) throws GeneralSecurityException {
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        if (!FIPS.isCompatible()) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher engineFactory = EngineFactory.CIPHER.getInstance("AES/ECB/NoPadding");
        engineFactory.init(1, this.f47470a);
        int iMax = Math.max(1, (int) Math.ceil(((double) bArr.length) / 16.0d));
        byte[] bArrXor = iMax * 16 == bArr.length ? Bytes.xor(bArr, (iMax - 1) * 16, this.f47471b, 0, 16) : Bytes.xor(AesUtil.cmacPad(Arrays.copyOfRange(bArr, (iMax - 1) * 16, bArr.length)), this.f47472c);
        byte[] bArrDoFinal = new byte[16];
        for (int i11 = 0; i11 < iMax - 1; i11++) {
            bArrDoFinal = engineFactory.doFinal(Bytes.xor(bArrDoFinal, 0, bArr, i11 * 16, 16));
        }
        return Arrays.copyOf(engineFactory.doFinal(Bytes.xor(bArrXor, bArrDoFinal)), i10);
    }
}
