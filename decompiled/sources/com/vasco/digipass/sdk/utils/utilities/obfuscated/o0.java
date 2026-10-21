package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes9.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final BigInteger f66239a = BigInteger.valueOf(0);

    public static byte[] a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    public static byte[] a(int i10, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i10) {
            return byteArray;
        }
        int i11 = byteArray[0] == 0 ? 1 : 0;
        int length = byteArray.length - i11;
        if (length <= i10) {
            byte[] bArr = new byte[i10];
            System.arraycopy(byteArray, i11, bArr, i10 - length, length);
            return bArr;
        }
        throw new IllegalArgumentException("standard length exceeded for value");
    }

    public static BigInteger a(BigInteger bigInteger, BigInteger bigInteger2, SecureRandom secureRandom) {
        int iCompareTo = bigInteger.compareTo(bigInteger2);
        if (iCompareTo >= 0) {
            if (iCompareTo <= 0) {
                return bigInteger;
            }
            throw new IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            return a(f66239a, bigInteger2.subtract(bigInteger), secureRandom).add(bigInteger);
        }
        for (int i10 = 0; i10 < 1000; i10++) {
            BigInteger bigInteger3 = new BigInteger(bigInteger2.bitLength(), secureRandom);
            if (bigInteger3.compareTo(bigInteger) >= 0 && bigInteger3.compareTo(bigInteger2) <= 0) {
                return bigInteger3;
            }
        }
        return new BigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom).add(bigInteger);
    }

    public static BigInteger a(byte[] bArr, int i10, int i11) {
        if (i10 != 0 || i11 != bArr.length) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }
}
