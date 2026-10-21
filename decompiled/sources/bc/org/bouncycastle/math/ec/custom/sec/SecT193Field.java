package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.j3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT193Field {
    public static void a(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        jArr[0] = j10 ^ (j11 << 49);
        jArr[1] = (j11 >>> 15) ^ (j12 << 34);
        jArr[2] = (j12 >>> 30) ^ (j13 << 19);
        jArr[3] = ((j13 >>> 45) ^ (j14 << 4)) ^ (j15 << 53);
        jArr[4] = ((j14 >>> 60) ^ (j16 << 38)) ^ (j15 >>> 11);
        jArr[5] = (j16 >>> 26) ^ (j17 << 23);
        jArr[6] = j17 >>> 41;
        jArr[7] = 0;
    }

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
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
    }

    public static void b(long[] jArr, long[] jArr2) {
        j3.a(jArr[0], jArr2, 0);
        j3.a(jArr[1], jArr2, 2);
        j3.a(jArr[2], jArr2, 4);
        jArr2[6] = jArr[3] & 1;
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrB = y3.b(bigInteger);
        reduce63(jArrB, 0);
        return jArrB;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (y3.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrB = y3.b();
        long[] jArrB2 = y3.b();
        square(jArr, jArrB);
        squareN(jArrB, 1, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB2, 1, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 3, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 6, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 12, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 24, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 48, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 96, jArrB2);
        multiply(jArrB, jArrB2, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrD = y3.d();
        a(jArr, jArr2, jArrD);
        reduce(jArrD, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrD = y3.d();
        a(jArr, jArr2, jArrD);
        addExt(jArr3, jArrD, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = j14 ^ (j16 >>> 50);
        long j18 = (j13 ^ ((j16 >>> 1) ^ (j16 << 14))) ^ (j15 >>> 50);
        long j19 = j10 ^ (j17 << 63);
        long j20 = (j11 ^ (j15 << 63)) ^ ((j17 >>> 1) ^ (j17 << 14));
        long j21 = ((j12 ^ (j16 << 63)) ^ ((j15 >>> 1) ^ (j15 << 14))) ^ (j17 >>> 50);
        long j22 = j18 >>> 1;
        jArr2[0] = (j19 ^ j22) ^ (j22 << 15);
        jArr2[1] = (j18 >>> 50) ^ j20;
        jArr2[2] = j21;
        jArr2[3] = 1 & j18;
    }

    public static void reduce63(long[] jArr, int i10) {
        int i11 = i10 + 3;
        long j10 = jArr[i11];
        long j11 = j10 >>> 1;
        jArr[i10] = (j11 ^ (j11 << 15)) ^ jArr[i10];
        int i12 = i10 + 1;
        jArr[i12] = jArr[i12] ^ (j10 >>> 50);
        jArr[i11] = j10 & 1;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jA = j3.a(jArr[0]);
        long jA2 = j3.a(jArr[1]);
        long j10 = (jA & 4294967295L) | (jA2 << 32);
        long j11 = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = j3.a(jArr[2]);
        long j12 = (jA3 & 4294967295L) ^ (jArr[3] << 32);
        long j13 = jA3 >>> 32;
        jArr2[0] = j10 ^ (j11 << 8);
        jArr2[1] = ((j12 ^ (j13 << 8)) ^ (j11 >>> 56)) ^ (j11 << 33);
        jArr2[2] = (j11 >>> 31) ^ ((jA3 >>> 88) ^ (j13 << 33));
        jArr2[3] = jA3 >>> 63;
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrD = y3.d();
        b(jArr, jArrD);
        reduce(jArrD, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrD = y3.d();
        b(jArr, jArrD);
        addExt(jArr2, jArrD, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrD = y3.d();
        b(jArr, jArrD);
        reduce(jArrD, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            b(jArr2, jArrD);
            reduce(jArrD, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }

    public static void a(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 562949953421311L;
        jArr2[1] = ((j10 >>> 49) ^ (j11 << 15)) & 562949953421311L;
        jArr2[2] = ((j11 >>> 34) ^ (j12 << 30)) & 562949953421311L;
        jArr2[3] = (j12 >>> 19) ^ (j13 << 45);
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        a(jArr, jArr4);
        a(jArr2, jArr5);
        a(jArr4[0], jArr5[0], jArr3, 0);
        a(jArr4[1], jArr5[1], jArr3, 1);
        a(jArr4[2], jArr5[2], jArr3, 2);
        a(jArr4[3], jArr5[3], jArr3, 3);
        for (int i10 = 5; i10 > 0; i10--) {
            jArr3[i10] = jArr3[i10] ^ jArr3[i10 - 1];
        }
        a(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        a(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i11 = 7; i11 > 1; i11--) {
            jArr3[i11] = jArr3[i11] ^ jArr3[i11 - 2];
        }
        long j10 = jArr4[0] ^ jArr4[2];
        long j11 = jArr4[1] ^ jArr4[3];
        long j12 = jArr5[0] ^ jArr5[2];
        long j13 = jArr5[1] ^ jArr5[3];
        a(j10 ^ j11, j12 ^ j13, jArr3, 3);
        long[] jArr6 = new long[3];
        a(j10, j12, jArr6, 0);
        a(j11, j13, jArr6, 1);
        long j14 = jArr6[0];
        long j15 = jArr6[1];
        long j16 = jArr6[2];
        jArr3[2] = jArr3[2] ^ j14;
        jArr3[3] = (j14 ^ j15) ^ jArr3[3];
        jArr3[4] = jArr3[4] ^ (j16 ^ j15);
        jArr3[5] = jArr3[5] ^ j16;
        a(jArr3);
    }

    public static void a(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        int i11 = (int) j10;
        long j16 = (jArr2[(i11 >>> 3) & 7] << 3) ^ jArr2[i11 & 7];
        long j17 = 0;
        int i12 = 36;
        do {
            int i13 = (int) (j10 >>> i12);
            long j18 = (((jArr2[i13 & 7] ^ (jArr2[(i13 >>> 3) & 7] << 3)) ^ (jArr2[(i13 >>> 6) & 7] << 6)) ^ (jArr2[(i13 >>> 9) & 7] << 9)) ^ (jArr2[(i13 >>> 12) & 7] << 12);
            j16 ^= j18 << i12;
            j17 ^= j18 >>> (-i12);
            i12 -= 15;
        } while (i12 > 0);
        jArr[i10] = jArr[i10] ^ (562949953421311L & j16);
        int i14 = i10 + 1;
        jArr[i14] = jArr[i14] ^ ((j16 >>> 49) ^ (j17 << 15));
    }
}
