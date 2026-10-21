package org.bouncycastle.util;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes13.dex */
public final class BigIntegers {
    public static final BigInteger ZERO = BigInteger.valueOf(0);
    public static final BigInteger ONE = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final BigInteger f91630a = BigInteger.valueOf(2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final BigInteger f91631b = BigInteger.valueOf(3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final BigInteger f91632c = new BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f91633d = BigInteger.valueOf(743).bitLength();

    public static byte[] a(int i10, SecureRandom secureRandom) throws IllegalArgumentException {
        if (i10 < 1) {
            throw new IllegalArgumentException("bitLength must be at least 1");
        }
        int i11 = (i10 + 7) / 8;
        byte[] bArr = new byte[i11];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (bArr[0] & ((byte) (255 >>> ((i11 * 8) - i10))));
        return bArr;
    }

    public static byte[] asUnsignedByteArray(int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i10) {
            return byteArray;
        }
        int i11 = byteArray[0] == 0 ? 1 : 0;
        int length = byteArray.length - i11;
        if (length > i10) {
            throw new IllegalArgumentException("standard length exceeded for value");
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(byteArray, i11, bArr, i10 - length, length);
        return bArr;
    }

    public static BigInteger createRandomBigInteger(int i10, SecureRandom secureRandom) {
        return new BigInteger(1, a(i10, secureRandom));
    }

    public static BigInteger createRandomInRange(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        BigInteger bigIntegerCreateRandomBigInteger;
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            bigIntegerCreateRandomBigInteger = createRandomInRange(ZERO, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i10 = 0; i10 < 1000; i10++) {
                BigInteger bigIntegerCreateRandomBigInteger2 = createRandomBigInteger(bigInteger2.bitLength(), secureRandom);
                if (bigIntegerCreateRandomBigInteger2.compareTo(bigInteger) >= 0 && bigIntegerCreateRandomBigInteger2.compareTo(bigInteger2) <= 0) {
                    return bigIntegerCreateRandomBigInteger2;
                }
            }
            bigIntegerCreateRandomBigInteger = createRandomBigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return bigIntegerCreateRandomBigInteger.add(bigInteger);
    }

    public static BigInteger createRandomPrime(int i10, int i11, SecureRandom secureRandom) {
        BigInteger bigInteger;
        if (i10 < 2) {
            throw new IllegalArgumentException("bitLength < 2");
        }
        BigInteger bigInteger2 = f91630a;
        if (i10 == 2) {
            return secureRandom.nextInt() < 0 ? bigInteger2 : f91631b;
        }
        do {
            byte[] bArrA = a(i10, secureRandom);
            bArrA[0] = (byte) (((byte) (1 << (7 - ((bArrA.length * 8) - i10)))) | bArrA[0]);
            int length = bArrA.length - 1;
            bArrA[length] = (byte) (bArrA[length] | 1);
            bigInteger = new BigInteger(1, bArrA);
            if (i10 > f91633d) {
                while (!bigInteger.gcd(f91632c).equals(ONE)) {
                    bigInteger = bigInteger.add(bigInteger2);
                }
            }
        } while (!bigInteger.isProbablePrime(i11));
        return bigInteger;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static int getUnsignedByteLength(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static int intValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new ArithmeticException("BigInteger out of int range");
    }

    public static long longValueExact(BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new ArithmeticException("BigInteger out of long range");
    }

    public static byte[] asUnsignedByteArray(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    public static BigInteger fromUnsignedByteArray(byte[] bArr, int i10, int i11) {
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }
}
