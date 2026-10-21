package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.BigIntegers;

/* JADX INFO: loaded from: classes2.dex */
public class SRP6Util {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f87968a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f87969b = BigInteger.valueOf(1);

    public static byte[] a(BigInteger bigInteger, int i10) {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger);
        if (bArrAsUnsignedByteArray.length >= i10) {
            return bArrAsUnsignedByteArray;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(bArrAsUnsignedByteArray, 0, bArr, i10 - bArrAsUnsignedByteArray.length, bArrAsUnsignedByteArray.length);
        return bArr;
    }

    public static BigInteger b(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        int iBitLength = (bigInteger.bitLength() + 7) / 8;
        byte[] bArrA = a(bigInteger2, iBitLength);
        byte[] bArrA2 = a(bigInteger3, iBitLength);
        digest.update(bArrA, 0, bArrA.length);
        digest.update(bArrA2, 0, bArrA2.length);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return new BigInteger(1, bArr);
    }

    public static BigInteger c(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
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
        return b(digest, bigInteger, bigInteger, bigInteger2);
    }

    public static BigInteger calculateKey(Digest digest, BigInteger bigInteger, BigInteger bigInteger2) {
        byte[] bArrA = a(bigInteger2, (bigInteger.bitLength() + 7) / 8);
        digest.update(bArrA, 0, bArrA.length);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return new BigInteger(1, bArr);
    }

    public static BigInteger calculateM1(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return c(digest, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static BigInteger calculateM2(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return c(digest, bigInteger, bigInteger2, bigInteger3, bigInteger4);
    }

    public static BigInteger calculateU(Digest digest, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return b(digest, bigInteger, bigInteger2, bigInteger3);
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
        int iMin = Math.min(256, bigInteger.bitLength() / 2) - 1;
        BigInteger bigInteger3 = f87969b;
        return BigIntegers.createRandomInRange(bigInteger3.shiftLeft(iMin), bigInteger.subtract(bigInteger3), secureRandom);
    }

    public static BigInteger validatePublicValue(BigInteger bigInteger, BigInteger bigInteger2) throws CryptoException {
        BigInteger bigIntegerMod = bigInteger2.mod(bigInteger);
        if (bigIntegerMod.equals(f87968a)) {
            throw new CryptoException("Invalid public value: 0");
        }
        return bigIntegerMod;
    }
}
