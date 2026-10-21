package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import bc.org.bouncycastle.crypto.CryptoException;
import bc.org.bouncycastle.crypto.Digest;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public class e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static BigInteger f66026a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static BigInteger f66027b = BigInteger.valueOf(1);

    private static BigInteger a(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        int iBitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] bArrA = a(bigInteger2, iBitLength);
        byte[] bArrA2 = a(bigInteger3, iBitLength);
        byte[] bArrA3 = a(bigInteger4, iBitLength);
        digest.update(bArrA, 0, bArrA.length);
        digest.update(bArrA2, 0, bArrA2.length);
        digest.update(bArrA3, 0, bArrA3.length);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return new BigInteger(1, bArr);
    }

    public static BigInteger calculateK(Digest digest, BigInteger bigInteger, BigInteger bigInteger2) {
        return a(digest, bigInteger, bigInteger, bigInteger2);
    }

    public static BigInteger calculateKey(Digest digest, BigInteger bigInteger, BigInteger bigInteger2) {
        byte[] bArrA = a(bigInteger2, (bigInteger.bitLength() + 7) / 8);
        digest.update(bArrA, 0, bArrA.length);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return new BigInteger(1, bArr);
    }

    public static BigInteger calculateM1(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return a(digest, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static BigInteger calculateM2(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return a(digest, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static BigInteger calculateU(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return a(digest, bigInteger, bigInteger2, bigInteger3);
    }

    public static BigInteger calculateX(Digest digest, BigInteger bigInteger, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int digestSize = digest.getDigestSize();
        byte[] bArr4 = new byte[digestSize];
        digest.update(bArr2, 0, bArr2.length);
        digest.update((byte) 58);
        digest.update(bArr3, 0, bArr3.length);
        digest.doFinal(bArr4, 0);
        digest.update(bArr, 0, bArr.length);
        digest.update(bArr4, 0, digestSize);
        digest.doFinal(bArr4, 0);
        return new BigInteger(1, bArr4);
    }

    public static BigInteger generatePrivateValue(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        return o0.a(f66027b.shiftLeft(Math.min(256, bigInteger.bitLength() / 2) - 1), bigInteger.subtract(f66027b), secureRandom);
    }

    public static BigInteger validatePublicValue(BigInteger bigInteger, BigInteger bigInteger2) throws CryptoException {
        BigInteger bigIntegerMod = bigInteger2.mod(bigInteger);
        if (bigIntegerMod.equals(f66026a)) {
            throw new CryptoException("Invalid public value: 0");
        }
        return bigIntegerMod;
    }

    private static BigInteger a(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int iBitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] bArrA = a(bigInteger2, iBitLength);
        byte[] bArrA2 = a(bigInteger3, iBitLength);
        digest.update(bArrA, 0, bArrA.length);
        digest.update(bArrA2, 0, bArrA2.length);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return new BigInteger(1, bArr);
    }

    private static byte[] a(BigInteger bigInteger, int i10) {
        byte[] bArrA = o0.a(bigInteger);
        if (bArrA.length >= i10) {
            return bArrA;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(bArrA, 0, bArr, i10 - bArrA.length, bArrA.length);
        return bArr;
    }
}
