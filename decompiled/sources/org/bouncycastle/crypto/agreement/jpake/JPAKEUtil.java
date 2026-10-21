package org.bouncycastle.crypto.agreement.jpake;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import java.math.BigInteger;
import java.security.SecureRandom;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes2.dex */
public class JPAKEUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f87933a = BigInteger.valueOf(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f87934b = BigInteger.valueOf(1);

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, String str, Digest digest) {
        digest.reset();
        c(bigInteger, digest);
        c(bigInteger2, digest);
        c(bigInteger3, digest);
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray(str);
        digest.update(b(uTF8ByteArray.length), 0, 4);
        digest.update(uTF8ByteArray, 0, uTF8ByteArray.length);
        Arrays.fill(uTF8ByteArray, (byte) 0);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return new BigInteger(bArr);
    }

    public static byte[] b(int i10) {
        return new byte[]{(byte) (i10 >>> 24), (byte) (i10 >>> 16), (byte) (i10 >>> 8), (byte) i10};
    }

    public static void c(BigInteger bigInteger, Digest digest) {
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger);
        digest.update(b(bArrAsUnsignedByteArray.length), 0, 4);
        digest.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
        Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
    }

    public static BigInteger calculateA(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return bigInteger3.modPow(bigInteger4, bigInteger);
    }

    public static BigInteger calculateGA(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        return bigInteger2.multiply(bigInteger3).multiply(bigInteger4).mod(bigInteger);
    }

    public static BigInteger calculateGx(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.modPow(bigInteger3, bigInteger);
    }

    public static BigInteger calculateKeyingMaterial(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, BigInteger bigInteger6) {
        return bigInteger3.modPow(bigInteger4.multiply(bigInteger5).negate().mod(bigInteger2), bigInteger).multiply(bigInteger6).modPow(bigInteger4, bigInteger);
    }

    public static BigInteger calculateMacTag(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, Digest digest) {
        digest.reset();
        byte[] bArrAsUnsignedByteArray = BigIntegers.asUnsignedByteArray(bigInteger5);
        digest.update(bArrAsUnsignedByteArray, 0, bArrAsUnsignedByteArray.length);
        Arrays.fill(bArrAsUnsignedByteArray, (byte) 0);
        byte[] uTF8ByteArray = Strings.toUTF8ByteArray("JPAKE_KC");
        digest.update(uTF8ByteArray, 0, uTF8ByteArray.length);
        Arrays.fill(uTF8ByteArray, (byte) 0);
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        HMac hMac = new HMac(digest);
        byte[] bArr2 = new byte[hMac.getMacSize()];
        hMac.init(new KeyParameter(bArr));
        byte[] uTF8ByteArray2 = Strings.toUTF8ByteArray("KC_1_U");
        hMac.update(uTF8ByteArray2, 0, uTF8ByteArray2.length);
        Arrays.fill(uTF8ByteArray2, (byte) 0);
        byte[] uTF8ByteArray3 = Strings.toUTF8ByteArray(str);
        hMac.update(uTF8ByteArray3, 0, uTF8ByteArray3.length);
        Arrays.fill(uTF8ByteArray3, (byte) 0);
        byte[] uTF8ByteArray4 = Strings.toUTF8ByteArray(str2);
        hMac.update(uTF8ByteArray4, 0, uTF8ByteArray4.length);
        Arrays.fill(uTF8ByteArray4, (byte) 0);
        byte[] bArrAsUnsignedByteArray2 = BigIntegers.asUnsignedByteArray(bigInteger);
        hMac.update(bArrAsUnsignedByteArray2, 0, bArrAsUnsignedByteArray2.length);
        Arrays.fill(bArrAsUnsignedByteArray2, (byte) 0);
        byte[] bArrAsUnsignedByteArray3 = BigIntegers.asUnsignedByteArray(bigInteger2);
        hMac.update(bArrAsUnsignedByteArray3, 0, bArrAsUnsignedByteArray3.length);
        Arrays.fill(bArrAsUnsignedByteArray3, (byte) 0);
        byte[] bArrAsUnsignedByteArray4 = BigIntegers.asUnsignedByteArray(bigInteger3);
        hMac.update(bArrAsUnsignedByteArray4, 0, bArrAsUnsignedByteArray4.length);
        Arrays.fill(bArrAsUnsignedByteArray4, (byte) 0);
        byte[] bArrAsUnsignedByteArray5 = BigIntegers.asUnsignedByteArray(bigInteger4);
        hMac.update(bArrAsUnsignedByteArray5, 0, bArrAsUnsignedByteArray5.length);
        Arrays.fill(bArrAsUnsignedByteArray5, (byte) 0);
        hMac.doFinal(bArr2, 0);
        Arrays.fill(bArr, (byte) 0);
        return new BigInteger(bArr2);
    }

    public static BigInteger calculateS(char[] cArr) {
        return new BigInteger(Strings.toUTF8ByteArray(cArr));
    }

    public static BigInteger calculateX2s(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        return bigInteger2.multiply(bigInteger3).mod(bigInteger);
    }

    public static BigInteger[] calculateZeroKnowledgeProof(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, String str, Digest digest, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomInRange = BigIntegers.createRandomInRange(f87933a, bigInteger2.subtract(f87934b), secureRandom);
        BigInteger bigIntegerModPow = bigInteger3.modPow(bigIntegerCreateRandomInRange, bigInteger);
        return new BigInteger[]{bigIntegerModPow, bigIntegerCreateRandomInRange.subtract(bigInteger5.multiply(a(bigInteger3, bigIntegerModPow, bigInteger4, str, digest))).mod(bigInteger2)};
    }

    public static BigInteger generateX1(BigInteger bigInteger, SecureRandom secureRandom) {
        return BigIntegers.createRandomInRange(f87933a, bigInteger.subtract(f87934b), secureRandom);
    }

    public static BigInteger generateX2(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = f87934b;
        return BigIntegers.createRandomInRange(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    public static void validateGa(BigInteger bigInteger) throws CryptoException {
        if (bigInteger.equals(f87934b)) {
            throw new CryptoException("ga is equal to 1.  It should not be.  The chances of this happening are on the order of 2^160 for a 160-bit q.  Try again.");
        }
    }

    public static void validateGx4(BigInteger bigInteger) throws CryptoException {
        if (bigInteger.equals(f87934b)) {
            throw new CryptoException("g^x validation failed.  g^x should not be 1.");
        }
    }

    public static void validateMacTag(String str, String str2, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, Digest digest, BigInteger bigInteger6) throws CryptoException {
        if (!calculateMacTag(str2, str, bigInteger3, bigInteger4, bigInteger, bigInteger2, bigInteger5, digest).equals(bigInteger6)) {
            throw new CryptoException("Partner MacTag validation failed. Therefore, the password, MAC, or digest algorithm of each participant does not match.");
        }
    }

    public static void validateNotNull(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(u.f(str, " must not be null"));
        }
    }

    public static void validateParticipantIdsDiffer(String str, String str2) throws CryptoException {
        if (str.equals(str2)) {
            throw new CryptoException(h0.b("Both participants are using the same participantId (", str, "). This is not allowed. Each participant must use a unique participantId."));
        }
    }

    public static void validateParticipantIdsEqual(String str, String str2) throws CryptoException {
        if (!str.equals(str2)) {
            throw new CryptoException(u.g("Received payload from incorrect partner (", str2, "). Expected to receive payload from ", str, Constant.DOT_STRING));
        }
    }

    public static void validateZeroKnowledgeProof(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger[] bigIntegerArr, String str, Digest digest) throws CryptoException {
        BigInteger bigInteger5 = bigIntegerArr[0];
        BigInteger bigInteger6 = bigIntegerArr[1];
        BigInteger bigIntegerA = a(bigInteger3, bigInteger5, bigInteger4, str, digest);
        if (bigInteger4.compareTo(f87933a) != 1 || bigInteger4.compareTo(bigInteger) != -1 || bigInteger4.modPow(bigInteger2, bigInteger).compareTo(f87934b) != 0 || bigInteger3.modPow(bigInteger6, bigInteger).multiply(bigInteger4.modPow(bigIntegerA, bigInteger)).mod(bigInteger).compareTo(bigInteger5) != 0) {
            throw new CryptoException("Zero-knowledge proof validation failed");
        }
    }
}
