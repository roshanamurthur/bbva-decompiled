package org.bouncycastle.math.ec.custom.sec;

import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat576;

/* JADX INFO: loaded from: classes13.dex */
public class SecT571Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f90829a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void a(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = i12 + i13;
            jArr3[i14] = jArr3[i14] ^ (jArr[i10 + i13] ^ jArr2[i11 + i13]);
        }
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 9; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void addBothTo(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 9; i10++) {
            jArr3[i10] = jArr3[i10] ^ (jArr[i10] ^ jArr2[i10]);
        }
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 18; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        for (int i10 = 1; i10 < 9; i10++) {
            jArr2[i10] = jArr[i10];
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(571, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        Nat576.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 571; i10 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            for (int i11 = 0; i11 < 9; i11++) {
                jArr2[i11] = jArr2[i11] ^ jArr[i11];
            }
        }
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        implMultiplyPrecomp(jArr, precompMultiplicand(jArr2), jArr3);
    }

    public static void implMultiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 56; i10 >= 0; i10 -= 8) {
            for (int i11 = 1; i11 < 9; i11 += 2) {
                int i12 = (int) (jArr[i11] >>> i10);
                a(jArr2, (i12 & 15) * 9, jArr2, (((i12 >>> 4) & 15) + 16) * 9, jArr3, i11 - 1);
            }
            Nat.shiftUpBits64(16, jArr3, 0, 8, 0L);
        }
        for (int i13 = 56; i13 >= 0; i13 -= 8) {
            for (int i14 = 0; i14 < 9; i14 += 2) {
                int i15 = (int) (jArr[i14] >>> i13);
                a(jArr2, (i15 & 15) * 9, jArr2, (((i15 >>> 4) & 15) + 16) * 9, jArr3, i14);
            }
            if (i13 > 0) {
                Nat.shiftUpBits64(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void implMulwAcc(long[] jArr, long j10, long[] jArr2, int i10) {
        long[] jArr3 = new long[32];
        jArr3[1] = j10;
        for (int i11 = 2; i11 < 32; i11 += 2) {
            long j11 = jArr3[i11 >>> 1] << 1;
            jArr3[i11] = j11;
            jArr3[i11 + 1] = j11 ^ j10;
        }
        int i12 = 0;
        long j12 = 0;
        while (i12 < 9) {
            long j13 = jArr[i12];
            long j14 = j12 ^ jArr3[((int) j13) & 31];
            int i13 = 60;
            long j15 = 0;
            do {
                long j16 = jArr3[((int) (j13 >>> i13)) & 31];
                j14 ^= j16 << i13;
                j15 ^= j16 >>> (-i13);
                i13 -= 5;
            } while (i13 > 0);
            for (int i14 = 0; i14 < 4; i14++) {
                j13 = (j13 & (-1190112520884487202L)) >>> 1;
                j15 ^= ((j10 << i14) >> 63) & j13;
            }
            int i15 = i10 + i12;
            jArr2[i15] = j14 ^ jArr2[i15];
            i12++;
            j12 = j15;
        }
        int i16 = i10 + 9;
        jArr2[i16] = jArr2[i16] ^ j12;
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        Interleave.expand64To128(jArr[2], jArr2, 4);
        Interleave.expand64To128(jArr[3], jArr2, 6);
        Interleave.expand64To128(jArr[4], jArr2, 8);
        Interleave.expand64To128(jArr[5], jArr2, 10);
        Interleave.expand64To128(jArr[6], jArr2, 12);
        Interleave.expand64To128(jArr[7], jArr2, 14);
        Interleave.expand64To128(jArr[8], jArr2, 16);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat576.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate65 = Nat576.create64();
        long[] jArrCreate66 = Nat576.create64();
        square(jArr, jArrCreate66);
        square(jArrCreate66, jArrCreate64);
        square(jArrCreate64, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 2, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate66, jArrCreate64);
        squareN(jArrCreate64, 5, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 5, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 15, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate66);
        squareN(jArrCreate66, 30, jArrCreate64);
        squareN(jArrCreate64, 30, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 60, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 60, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 180, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate65, 180, jArrCreate65);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        multiply(jArrCreate64, jArrCreate66, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void multiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyPrecompAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implMultiplyPrecomp(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static long[] precompMultiplicand(long[] jArr) {
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i10 = 7;
        int i11 = 0;
        while (i10 > 0) {
            int i12 = i11 + 18;
            Nat.shiftUpBit64(9, jArr2, i12 >>> 1, 0L, jArr2, i12);
            reduce5(jArr2, i12);
            int i13 = i11 + 27;
            for (int i14 = 0; i14 < 9; i14++) {
                jArr2[i13 + i14] = jArr2[9 + i14] ^ jArr2[i12 + i14];
            }
            i10--;
            i11 = i12;
        }
        Nat.shiftUpBits64(144, jArr2, 0, 4, 0L, jArr2, 144);
        return jArr2;
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j10 = jArr[9];
        long j11 = jArr[17];
        long j12 = (((j10 ^ (j11 >>> 59)) ^ (j11 >>> 57)) ^ (j11 >>> 54)) ^ (j11 >>> 49);
        long j13 = (j11 << 15) ^ (((jArr[8] ^ (j11 << 5)) ^ (j11 << 7)) ^ (j11 << 10));
        for (int i10 = 16; i10 >= 10; i10--) {
            long j14 = jArr[i10];
            jArr2[i10 - 8] = (((j13 ^ (j14 >>> 59)) ^ (j14 >>> 57)) ^ (j14 >>> 54)) ^ (j14 >>> 49);
            j13 = (((jArr[i10 - 9] ^ (j14 << 5)) ^ (j14 << 7)) ^ (j14 << 10)) ^ (j14 << 15);
        }
        jArr2[1] = (((j13 ^ (j12 >>> 59)) ^ (j12 >>> 57)) ^ (j12 >>> 54)) ^ (j12 >>> 49);
        long j15 = (j12 << 15) ^ (((jArr[0] ^ (j12 << 5)) ^ (j12 << 7)) ^ (j12 << 10));
        long j16 = jArr2[8];
        long j17 = j16 >>> 59;
        jArr2[0] = (((j15 ^ j17) ^ (j17 << 2)) ^ (j17 << 5)) ^ (j17 << 10);
        jArr2[8] = 576460752303423487L & j16;
    }

    public static void reduce5(long[] jArr, int i10) {
        int i11 = i10 + 8;
        long j10 = jArr[i11];
        long j11 = j10 >>> 59;
        jArr[i10] = ((j11 << 10) ^ (((j11 << 2) ^ j11) ^ (j11 << 5))) ^ jArr[i10];
        jArr[i11] = j10 & 576460752303423487L;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrCreate64 = Nat576.create64();
        long[] jArrCreate65 = Nat576.create64();
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 + 1;
            long jUnshuffle = Interleave.unshuffle(jArr[i10]);
            i10 += 2;
            long jUnshuffle2 = Interleave.unshuffle(jArr[i12]);
            jArrCreate64[i11] = (4294967295L & jUnshuffle) | (jUnshuffle2 << 32);
            jArrCreate65[i11] = (jUnshuffle >>> 32) | ((-4294967296L) & jUnshuffle2);
        }
        long jUnshuffle3 = Interleave.unshuffle(jArr[i10]);
        jArrCreate64[4] = 4294967295L & jUnshuffle3;
        jArrCreate65[4] = jUnshuffle3 >>> 32;
        multiply(jArrCreate65, f90829a, jArr2);
        add(jArr2, jArrCreate64, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreateExt64 = Nat576.createExt64();
        implSquare(jArr, jArrCreateExt64);
        while (true) {
            reduce(jArrCreateExt64, jArr2);
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                implSquare(jArr2, jArrCreateExt64);
            }
        }
    }

    public static int trace(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[8];
        return ((int) ((j10 ^ (j11 >>> 49)) ^ (j11 >>> 57))) & 1;
    }
}
