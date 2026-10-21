package org.bouncycastle.math.raw;

import java.math.BigInteger;
import org.bouncycastle.util.Pack;

/* JADX INFO: loaded from: classes13.dex */
public abstract class Nat448 {
    public static void copy64(long[] jArr, int i10, long[] jArr2, int i11) {
        jArr2[i11] = jArr[i10];
        jArr2[i11 + 1] = jArr[i10 + 1];
        jArr2[i11 + 2] = jArr[i10 + 2];
        jArr2[i11 + 3] = jArr[i10 + 3];
        jArr2[i11 + 4] = jArr[i10 + 4];
        jArr2[i11 + 5] = jArr[i10 + 5];
        jArr2[i11 + 6] = jArr[i10 + 6];
    }

    public static long[] create64() {
        return new long[7];
    }

    public static long[] createExt64() {
        return new long[14];
    }

    public static boolean eq64(long[] jArr, long[] jArr2) {
        for (int i10 = 6; i10 >= 0; i10--) {
            if (jArr[i10] != jArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public static long[] fromBigInteger64(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 448) {
            throw new IllegalArgumentException();
        }
        long[] jArrCreate64 = create64();
        int i10 = 0;
        while (bigInteger.signum() != 0) {
            jArrCreate64[i10] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i10++;
        }
        return jArrCreate64;
    }

    public static boolean isOne64(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i10 = 1; i10 < 7; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isZero64(long[] jArr) {
        for (int i10 = 0; i10 < 7; i10++) {
            if (jArr[i10] != 0) {
                return false;
            }
        }
        return true;
    }

    public static BigInteger toBigInteger64(long[] jArr) {
        byte[] bArr = new byte[56];
        for (int i10 = 0; i10 < 7; i10++) {
            long j10 = jArr[i10];
            if (j10 != 0) {
                Pack.longToBigEndian(j10, bArr, (6 - i10) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static void copy64(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }
}
