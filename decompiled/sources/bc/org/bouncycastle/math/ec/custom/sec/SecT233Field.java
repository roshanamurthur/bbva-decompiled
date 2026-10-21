package bc.org.bouncycastle.math.ec.custom.sec;

import com.esotericsoftware.asm.Opcodes;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.j3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT233Field {
    public static void a(long[] jArr) {
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

    public static void b(long[] jArr, long[] jArr2) {
        j3.a(jArr[0], jArr2, 0);
        j3.a(jArr[1], jArr2, 2);
        j3.a(jArr[2], jArr2, 4);
        long j10 = jArr[3];
        jArr2[6] = j3.b((int) j10);
        jArr2[7] = ((long) j3.a((int) (j10 >>> 32))) & 4294967295L;
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrB = y3.b(bigInteger);
        reduce23(jArrB, 0);
        return jArrB;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (y3.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrB = y3.b();
        long[] jArrB2 = y3.b();
        square(jArr, jArrB);
        multiply(jArrB, jArr, jArrB);
        square(jArrB, jArrB);
        multiply(jArrB, jArr, jArrB);
        squareN(jArrB, 3, jArrB2);
        multiply(jArrB2, jArrB, jArrB2);
        square(jArrB2, jArrB2);
        multiply(jArrB2, jArr, jArrB2);
        squareN(jArrB2, 7, jArrB);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 14, jArrB2);
        multiply(jArrB2, jArrB, jArrB2);
        square(jArrB2, jArrB2);
        multiply(jArrB2, jArr, jArrB2);
        squareN(jArrB2, 29, jArrB);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 58, jArrB2);
        multiply(jArrB2, jArrB, jArrB2);
        squareN(jArrB2, 116, jArrB);
        multiply(jArrB, jArrB2, jArrB);
        square(jArrB, jArr2);
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
        long jA = j3.a(jArr[0]);
        long jA2 = j3.a(jArr[1]);
        long j10 = (jA & 4294967295L) | (jA2 << 32);
        long j11 = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = j3.a(jArr[2]);
        long jA4 = j3.a(jArr[3]);
        long j12 = (4294967295L & jA3) | (jA4 << 32);
        long j13 = (jA3 >>> 32) | ((-4294967296L) & jA4);
        long j14 = j13 >>> 27;
        long j15 = j13 ^ ((j11 >>> 27) | (j13 << 37));
        long j16 = j11 ^ (j11 << 37);
        long[] jArrD = y3.d();
        int[] iArr = {32, 117, Opcodes.ATHROW};
        for (int i10 = 0; i10 < 3; i10++) {
            int i11 = iArr[i10];
            int i12 = i11 >>> 6;
            int i13 = i11 & 63;
            jArrD[i12] = jArrD[i12] ^ (j16 << i13);
            int i14 = i12 + 1;
            int i15 = -i13;
            jArrD[i14] = jArrD[i14] ^ ((j15 << i13) | (j16 >>> i15));
            int i16 = i12 + 2;
            jArrD[i16] = jArrD[i16] ^ ((j14 << i13) | (j15 >>> i15));
            int i17 = i12 + 3;
            jArrD[i17] = jArrD[i17] ^ (j14 >>> i15);
        }
        reduce(jArrD, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ j12;
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }

    public static void a(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        jArr2[0] = j10 & 576460752303423487L;
        jArr2[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
        jArr2[3] = (j12 >>> 49) ^ (j13 << 15);
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
}
