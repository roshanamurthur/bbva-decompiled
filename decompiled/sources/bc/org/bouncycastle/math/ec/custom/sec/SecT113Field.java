package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.j3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.u3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT113Field {
    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = ((jArr[1] << 7) ^ (j10 >>> 57)) & 144115188075855871L;
        long j12 = j10 & 144115188075855871L;
        long j13 = jArr2[0];
        long j14 = ((jArr2[1] << 7) ^ (j13 >>> 57)) & 144115188075855871L;
        long j15 = 144115188075855871L & j13;
        long[] jArr4 = new long[6];
        a(j12, j15, jArr4, 0);
        a(j11, j14, jArr4, 2);
        a(j12 ^ j11, j15 ^ j14, jArr4, 4);
        long j16 = jArr4[1] ^ jArr4[2];
        long j17 = jArr4[0];
        long j18 = jArr4[3];
        long j19 = (jArr4[4] ^ j17) ^ j16;
        long j20 = j16 ^ (jArr4[5] ^ j18);
        jArr3[0] = j17 ^ (j19 << 57);
        jArr3[1] = (j19 >>> 7) ^ (j20 << 50);
        jArr3[2] = (j20 >>> 14) ^ (j18 << 43);
        jArr3[3] = j18 >>> 21;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr2[1] ^ jArr[1];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr2[3] ^ jArr[3];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrB = u3.b(bigInteger);
        reduce15(jArrB, 0);
        return jArrB;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (u3.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrB = u3.b();
        long[] jArrB2 = u3.b();
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
        squareN(jArrB2, 28, jArrB);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 56, jArrB2);
        multiply(jArrB2, jArrB, jArrB2);
        square(jArrB2, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrD = u3.d();
        a(jArr, jArr2, jArrD);
        reduce(jArrD, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrD = u3.d();
        a(jArr, jArr2, jArrD);
        addExt(jArr3, jArrD, jArr3);
    }

    public static void reduce(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = j12 ^ ((j13 >>> 40) ^ (j13 >>> 49));
        long j15 = j10 ^ ((j14 << 15) ^ (j14 << 24));
        long j16 = (j11 ^ ((j13 << 15) ^ (j13 << 24))) ^ ((j14 >>> 40) ^ (j14 >>> 49));
        long j17 = j16 >>> 49;
        jArr2[0] = (j15 ^ j17) ^ (j17 << 9);
        jArr2[1] = 562949953421311L & j16;
    }

    public static void reduce15(long[] jArr, int i10) {
        int i11 = i10 + 1;
        long j10 = jArr[i11];
        long j11 = j10 >>> 49;
        jArr[i10] = (j11 ^ (j11 << 9)) ^ jArr[i10];
        jArr[i11] = j10 & 562949953421311L;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jA = j3.a(jArr[0]);
        long jA2 = j3.a(jArr[1]);
        long j10 = (4294967295L & jA) | (jA2 << 32);
        long j11 = (jA >>> 32) | (jA2 & (-4294967296L));
        jArr2[0] = ((j11 << 57) ^ j10) ^ (j11 << 5);
        jArr2[1] = (j11 >>> 59) ^ (j11 >>> 7);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrD = u3.d();
        a(jArr, jArrD);
        reduce(jArrD, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrD = u3.d();
        a(jArr, jArrD);
        addExt(jArr2, jArrD, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrD = u3.d();
        a(jArr, jArrD);
        reduce(jArrD, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            a(jArr2, jArrD);
            reduce(jArrD, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        return ((int) jArr[0]) & 1;
    }

    public static void a(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        long j16 = jArr2[((int) j10) & 7];
        long j17 = 0;
        int i11 = 48;
        do {
            int i12 = (int) (j10 >>> i11);
            long j18 = (jArr2[i12 & 7] ^ (jArr2[(i12 >>> 3) & 7] << 3)) ^ (jArr2[(i12 >>> 6) & 7] << 6);
            j16 ^= j18 << i11;
            j17 ^= j18 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr[i10] = 144115188075855871L & j16;
        jArr[i10 + 1] = (((((j10 & 72198606942111744L) & ((j11 << 7) >> 63)) >>> 8) ^ j17) << 7) ^ (j16 >>> 57);
    }

    public static void a(long[] jArr, long[] jArr2) {
        j3.a(jArr[0], jArr2, 0);
        j3.a(jArr[1], jArr2, 2);
    }
}
