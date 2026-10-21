package org.bouncycastle.math.ec.custom.sec;

import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;
import org.bouncycastle.math.raw.Interleave;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.math.raw.Nat256;

/* JADX INFO: loaded from: classes13.dex */
public class SecT233Field {
    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        return Nat.fromBigInteger64(233, bigInteger);
    }

    public static void halfTrace(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        Nat256.copy64(jArr, jArr2);
        for (int i10 = 1; i10 < 233; i10 += 2) {
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            implSquare(jArr2, jArrCreateExt64);
            reduce(jArrCreateExt64, jArr2);
            jArr2[0] = jArr2[0] ^ jArr[0];
            jArr2[1] = jArr2[1] ^ jArr[1];
            jArr2[2] = jArr2[2] ^ jArr[2];
            jArr2[3] = jArr2[3] ^ jArr[3];
        }
    }

    public static void implCompactExt(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        jArr[0] = j10 ^ (j11 << 59);
        jArr[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr[7] = j17 >>> 35;
    }

    public static void implExpand(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 576460752303423487L;
        jArr2[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
        jArr2[3] = (j12 >>> 49) ^ (j13 << 15);
    }

    public static void implMultiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        implExpand(jArr, jArr4);
        implExpand(jArr2, jArr5);
        implMulwAcc(jArr4[0], jArr5[0], jArr3, 0);
        implMulwAcc(jArr4[1], jArr5[1], jArr3, 1);
        implMulwAcc(jArr4[2], jArr5[2], jArr3, 2);
        implMulwAcc(jArr4[3], jArr5[3], jArr3, 3);
        for (int i10 = 5; i10 > 0; i10--) {
            jArr3[i10] = jArr3[i10] ^ jArr3[i10 - 1];
        }
        implMulwAcc(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        implMulwAcc(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i11 = 7; i11 > 1; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 2];
        }
        long j10 = jArr4[0] ^ jArr4[2];
        long j11 = jArr4[1] ^ jArr4[3];
        long j12 = jArr5[0] ^ jArr5[2];
        long j13 = jArr5[1] ^ jArr5[3];
        implMulwAcc(j10 ^ j11, j12 ^ j13, jArr3, 3);
        long[] jArr6 = new long[3];
        implMulwAcc(j10, j12, jArr6, 0);
        implMulwAcc(j11, j13, jArr6, 1);
        long j14 = jArr6[0];
        long j15 = jArr6[1];
        long j16 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j14;
        jArr3[3] = (j14 ^ j15) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j16 ^ j15);
        jArr3[5] = jArr3[5] ^ j16;
        implCompactExt(jArr3);
    }

    public static void implMulwAcc(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        int i11 = (int) j10;
        long j16 = (jArr2[(i11 >>> 3) & 7] << 3) ^ jArr2[i11 & 7];
        long j17 = 0;
        int i12 = 54;
        do {
            int i13 = (int) (j10 >>> i12);
            long j18 = jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3);
            j16 ^= j18 << i12;
            j17 ^= j18 >>> (-i12);
            i12 -= 6;
        } while (i12 > 0);
        jArr[i10] = jArr[i10] ^ (576460752303423487L & j16);
        int i14 = i10 + 1;
        jArr[i14] = jArr[i14] ^ ((j16 >>> 59) ^ (j17 << 5));
    }

    public static void implSquare(long[] jArr, long[] jArr2) {
        Interleave.expand64To128(jArr[0], jArr2, 0);
        Interleave.expand64To128(jArr[1], jArr2, 2);
        Interleave.expand64To128(jArr[2], jArr2, 4);
        Interleave.expand64To128(jArr[3], jArr2, 6);
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (Nat256.isZero64(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrCreate64 = Nat256.create64();
        long[] jArrCreate65 = Nat256.create64();
        square(jArr, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        square(jArrCreate64, jArrCreate64);
        multiply(jArrCreate64, jArr, jArrCreate64);
        squareN(jArrCreate64, 3, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 7, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 14, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        square(jArrCreate65, jArrCreate65);
        multiply(jArrCreate65, jArr, jArrCreate65);
        squareN(jArrCreate65, 29, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        squareN(jArrCreate64, 58, jArrCreate65);
        multiply(jArrCreate65, jArrCreate64, jArrCreate65);
        squareN(jArrCreate65, 116, jArrCreate64);
        multiply(jArrCreate64, jArrCreate65, jArrCreate64);
        square(jArrCreate64, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implMultiply(jArr, jArr2, jArrCreateExt64);
        addExt(jArr3, jArrCreateExt64, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = j15 ^ (j17 >>> 31);
        long j19 = (j14 ^ ((j17 >>> 41) ^ (j17 << 33))) ^ (j16 >>> 31);
        long j20 = ((j13 ^ (j17 << 23)) ^ ((j16 >>> 41) ^ (j16 << 33))) ^ (j18 >>> 31);
        long j21 = j10 ^ (j19 << 23);
        long j22 = (j11 ^ (j18 << 23)) ^ ((j19 >>> 41) ^ (j19 << 33));
        long j23 = ((j12 ^ (j16 << 23)) ^ ((j18 >>> 41) ^ (j18 << 33))) ^ (j19 >>> 31);
        long j24 = j20 >>> 41;
        jArr2[0] = j21 ^ j24;
        jArr2[1] = (j24 << 10) ^ j22;
        jArr2[2] = j23;
        jArr2[3] = 2199023255551L & j20;
    }

    public static void reduce23(long[] jArr, int i10) {
        int i11 = i10 + 3;
        long j10 = jArr[i11];
        long j11 = j10 >>> 41;
        jArr[i10] = jArr[i10] ^ j11;
        int i12 = i10 + 1;
        jArr[i12] = (j11 << 10) ^ jArr[i12];
        jArr[i11] = j10 & 2199023255551L;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jUnshuffle = Interleave.unshuffle(jArr[0]);
        long jUnshuffle2 = Interleave.unshuffle(jArr[1]);
        long j10 = (jUnshuffle & 4294967295L) | (jUnshuffle2 << 32);
        long j11 = (jUnshuffle >>> 32) | (jUnshuffle2 & (-4294967296L));
        long jUnshuffle3 = Interleave.unshuffle(jArr[2]);
        long jUnshuffle4 = Interleave.unshuffle(jArr[3]);
        long j12 = (4294967295L & jUnshuffle3) | (jUnshuffle4 << 32);
        long j13 = (jUnshuffle3 >>> 32) | ((-4294967296L) & jUnshuffle4);
        long j14 = j13 >>> 27;
        long j15 = j13 ^ ((j11 >>> 27) | (j13 << 37));
        long j16 = j11 ^ (j11 << 37);
        long[] jArrCreateExt64 = Nat256.createExt64();
        int[] iArr = {32, 117, Opcodes.ATHROW};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 >>> 6;
            int i13 = i11 & 63;
            jArrCreateExt64[i12] = jArrCreateExt64[i12] ^ (j16 << i13);
            int i14 = i12 + 1;
            int i15 = -i13;
            jArrCreateExt64[i14] = jArrCreateExt64[i14] ^ ((j15 << i13) | (j16 >>> i15));
            int i16 = i12 + 2;
            jArrCreateExt64[i16] = jArrCreateExt64[i16] ^ ((j14 << i13) | (j15 >>> i15));
            int i17 = i12 + 3;
            jArrCreateExt64[i17] = jArrCreateExt64[i17] ^ (j14 >>> i15);
        }
        reduce(jArrCreateExt64, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ j12;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        reduce(jArrCreateExt64, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
        implSquare(jArr, jArrCreateExt64);
        addExt(jArr2, jArrCreateExt64, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrCreateExt64 = Nat256.createExt64();
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
