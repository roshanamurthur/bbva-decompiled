package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat192;

/* JADX INFO: loaded from: classes13.dex */
public class SecT131Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f90763a = {2791191049453778211L, 2791191049453778402L, 6};

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr2[2] ^ jArr[2];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(131, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        Nat192.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 131; i10 += 2) {
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            implSquare(jArr2, jArrCreate64);
            reduce(jArrCreate64, jArr2);
            jArr2[0] = jArr2[0] ^ jArr[0];
            jArr2[1] = jArr2[1] ^ jArr[1];
            jArr2[2] = jArr2[2] ^ jArr[2];
        }
    }

    public static void implCompactExt(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        jArr[0] = j10 ^ (j11 << 44);
        jArr[1] = (j11 >>> 20) ^ (j12 << 24);
        jArr[2] = ((j12 >>> 40) ^ (j13 << 4)) ^ (j14 << 48);
        jArr[3] = ((j13 >>> 60) ^ (j15 << 28)) ^ (j14 >>> 16);
        jArr[4] = j15 >>> 36;
        jArr[5] = 0;
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = ((jArr[2] << 40) ^ (j11 >>> 24)) & 17592186044415L;
        long j13 = ((j11 << 20) ^ (j10 >>> 44)) & 17592186044415L;
        long j14 = j10 & 17592186044415L;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = ((j16 >>> 24) ^ (jArr2[2] << 40)) & 17592186044415L;
        long j18 = ((j15 >>> 44) ^ (j16 << 20)) & 17592186044415L;
        long j19 = j15 & 17592186044415L;
        long[] jArr4 = new long[10];
        implMulw(j14, j19, jArr4, 0);
        implMulw(j12, j17, jArr4, 2);
        long j20 = (j14 ^ j13) ^ j12;
        long j21 = (j19 ^ j18) ^ j17;
        implMulw(j20, j21, jArr4, 4);
        long j22 = (j13 << 1) ^ (j12 << 2);
        long j23 = (j18 << 1) ^ (j17 << 2);
        implMulw(j14 ^ j22, j19 ^ j23, jArr4, 6);
        implMulw(j20 ^ j22, j21 ^ j23, jArr4, 8);
        long j24 = jArr4[6];
        long j25 = jArr4[8] ^ j24;
        long j26 = jArr4[7];
        long j27 = jArr4[9] ^ j26;
        long j28 = (j25 << 1) ^ j24;
        long j29 = (j25 ^ (j27 << 1)) ^ j26;
        long j30 = jArr4[0];
        long j31 = jArr4[1];
        long j32 = (j31 ^ j30) ^ jArr4[4];
        long j33 = j31 ^ jArr4[5];
        long j34 = jArr4[2];
        long j35 = ((j28 ^ j30) ^ (j34 << 4)) ^ (j34 << 1);
        long j36 = jArr4[3];
        long j37 = (((j32 ^ j29) ^ (j36 << 4)) ^ (j36 << 1)) ^ (j35 >>> 44);
        long j38 = (j33 ^ j27) ^ (j37 >>> 44);
        long j39 = ((j35 & 17592186044415L) >>> 1) ^ ((j37 & 1) << 43);
        long j40 = j39 ^ (j39 << 1);
        long j41 = j40 ^ (j40 << 2);
        long j42 = j41 ^ (j41 << 4);
        long j43 = j42 ^ (j42 << 8);
        long j44 = j43 ^ (j43 << 16);
        long j45 = (j44 ^ (j44 << 32)) & 17592186044415L;
        long j46 = (((j37 & 17592186044415L) >>> 1) ^ ((j38 & 1) << 43)) ^ (j45 >>> 43);
        long j47 = j46 ^ (j46 << 1);
        long j48 = j47 ^ (j47 << 2);
        long j49 = j48 ^ (j48 << 4);
        long j50 = j49 ^ (j49 << 8);
        long j51 = j50 ^ (j50 << 16);
        long j52 = (j51 ^ (j51 << 32)) & 17592186044415L;
        long j53 = (j52 >>> 43) ^ (j38 >>> 1);
        long j54 = j53 ^ (j53 << 1);
        long j55 = j54 ^ (j54 << 2);
        long j56 = j55 ^ (j55 << 4);
        long j57 = j56 ^ (j56 << 8);
        long j58 = j57 ^ (j57 << 16);
        long j59 = j58 ^ (j58 << 32);
        jArr3[0] = j30;
        jArr3[1] = (j32 ^ j45) ^ j34;
        jArr3[2] = ((j33 ^ j52) ^ j45) ^ j36;
        jArr3[3] = j59 ^ j52;
        jArr3[4] = jArr4[2] ^ j59;
        jArr3[5] = jArr4[3];
        implCompactExt(jArr3);
    }

    public static void implMulw(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        int i11 = (int) j10;
        long j16 = (jArr2[(i11 >>> 6) & 7] << 6) ^ (jArr2[i11 & 7] ^ (jArr2[(i11 >>> 3) & 7] << 3));
        long j17 = 0;
        int i12 = 33;
        do {
            int i13 = (int) (j10 >>> i12);
            long j18 = ((jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3)) ^ (jArr2[(i13 >>> 6) & 7] << 6)) ^ (jArr2[(i13 >>> 9) & 7] << 9);
            j16 ^= j18 << i12;
            j17 ^= j18 >>> (-i12);
            i12 -= 12;
        } while (i12 > 0);
        jArr[i10] = 17592186044415L & j16;
        jArr[i10 + 1] = (j16 >>> 44) ^ (j17 << 20);
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        jArr2[4] = ((long) Interleave.expand8to16((int) jArr[2])) & 4294967295L;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat192.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat192.create64();
        long[] jArrCreate65 = Nat192.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 4, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 8, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 16, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 32, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat192.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = j13 ^ (j14 >>> 59);
        long j16 = j10 ^ ((j15 << 61) ^ (j15 << 63));
        long j17 = (j11 ^ ((j14 << 61) ^ (j14 << 63))) ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5));
        long j18 = (j12 ^ ((((j14 >>> 3) ^ (j14 >>> 1)) ^ j14) ^ (j14 << 5))) ^ (j15 >>> 59);
        long j19 = j18 >>> 3;
        jArr2[0] = (((j16 ^ j19) ^ (j19 << 2)) ^ (j19 << 3)) ^ (j19 << 8);
        jArr2[1] = (j18 >>> 59) ^ j17;
        jArr2[2] = 7 & j18;
    }

    public static void reduce61(long[] jArr, int i10) {
        int i11 = i10 + 2;
        long j10 = jArr[i11];
        long j11 = j10 >>> 3;
        jArr[i10] = ((j11 << 8) ^ (((j11 << 2) ^ j11) ^ (j11 << 3))) ^ jArr[i10];
        int i12 = i10 + 1;
        jArr[i12] = jArr[i12] ^ (j10 >>> 59);
        jArr[i11] = j10 & 7;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat192.create64();
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j10 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        jArrCreate64[0] = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        jArrCreate64[1] = jUnshuffle3 >>> 32;
        multiply(jArrCreate64, f90763a, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ (jUnshuffle3 & 4294967295L);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        reduce(jArrCreate64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        addExt(jArr2, jArrCreate64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreate64 = Nat.create64(5);
        implSquare(jArr, jArrCreate64);
        while (true) {
            reduce(jArrCreate64, jArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreate64);
            }
        }
    }

    public static int trace(long[] jArr) {
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
