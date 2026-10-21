package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.b4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.j3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT409Field {
    public static void a(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        long j17 = jArr[7];
        long j18 = jArr[8];
        long j19 = jArr[9];
        long j20 = jArr[10];
        long j21 = jArr[11];
        long j22 = jArr[12];
        long j23 = jArr[13];
        jArr[0] = j10 ^ (j11 << 59);
        jArr[1] = (j11 >>> 5) ^ (j12 << 54);
        jArr[2] = (j12 >>> 10) ^ (j13 << 49);
        jArr[3] = (j13 >>> 15) ^ (j14 << 44);
        jArr[4] = (j14 >>> 20) ^ (j15 << 39);
        jArr[5] = (j15 >>> 25) ^ (j16 << 34);
        jArr[6] = (j16 >>> 30) ^ (j17 << 29);
        jArr[7] = (j17 >>> 35) ^ (j18 << 24);
        jArr[8] = (j18 >>> 40) ^ (j19 << 19);
        jArr[9] = (j19 >>> 45) ^ (j20 << 14);
        jArr[10] = (j20 >>> 50) ^ (j21 << 9);
        jArr[11] = ((j21 >>> 55) ^ (j22 << 4)) ^ (j23 << 63);
        jArr[12] = (j22 >>> 60) ^ (j23 >>> 1);
        jArr[13] = 0;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr2[6] ^ jArr[6];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 13; i10++) {
            jArr3[i10] = jArr[i10] ^ jArr2[i10];
        }
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
        jArr2[5] = jArr[5];
        jArr2[6] = jArr[6];
    }

    public static void b(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < 6; i10++) {
            j3.a(jArr[i10], jArr2, i10 << 1);
        }
        jArr2[12] = j3.b((int) jArr[6]);
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrA = b4.a(bigInteger);
        reduce39(jArrA, 0);
        return jArrA;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (b4.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = b4.a();
        long[] jArrA2 = b4.a();
        long[] jArrA3 = b4.a();
        square(jArr, jArrA);
        squareN(jArrA, 1, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA2, 1, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 3, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 6, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 12, jArrA2);
        multiply(jArrA, jArrA2, jArrA3);
        squareN(jArrA3, 24, jArrA);
        squareN(jArrA, 24, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 48, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 96, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 192, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        multiply(jArrA, jArrA3, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = b4.b();
        a(jArr, jArr2, jArrB);
        reduce(jArrB, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = b4.b();
        a(jArr, jArr2, jArrB);
        addExt(jArr3, jArrB, jArr3);
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
        long j18 = jArr[12];
        long j19 = j15 ^ (j18 << 39);
        long j20 = j16 ^ ((j18 >>> 25) ^ (j18 << 62));
        long j21 = j17 ^ (j18 >>> 2);
        long j22 = jArr[11];
        long j23 = j14 ^ (j22 << 39);
        long j24 = j19 ^ ((j22 >>> 25) ^ (j22 << 62));
        long j25 = j20 ^ (j22 >>> 2);
        long j26 = jArr[10];
        long j27 = j13 ^ (j26 << 39);
        long j28 = j23 ^ ((j26 >>> 25) ^ (j26 << 62));
        long j29 = j24 ^ (j26 >>> 2);
        long j30 = jArr[9];
        long j31 = j12 ^ (j30 << 39);
        long j32 = j27 ^ ((j30 >>> 25) ^ (j30 << 62));
        long j33 = j28 ^ (j30 >>> 2);
        long j34 = jArr[8];
        long j35 = j10 ^ (j21 << 39);
        long j36 = (j11 ^ (j34 << 39)) ^ ((j21 >>> 25) ^ (j21 << 62));
        long j37 = (j31 ^ ((j34 >>> 25) ^ (j34 << 62))) ^ (j21 >>> 2);
        long j38 = j25 >>> 25;
        jArr2[0] = j35 ^ j38;
        jArr2[1] = (j38 << 23) ^ j36;
        jArr2[2] = j37;
        jArr2[3] = j32 ^ (j34 >>> 2);
        jArr2[4] = j33;
        jArr2[5] = j29;
        jArr2[6] = j25 & 33554431;
    }

    public static void reduce39(long[] jArr, int i10) {
        int i11 = i10 + 6;
        long j10 = jArr[i11];
        long j11 = j10 >>> 25;
        jArr[i10] = jArr[i10] ^ j11;
        int i12 = i10 + 1;
        jArr[i12] = (j11 << 23) ^ jArr[i12];
        jArr[i11] = j10 & 33554431;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long jA = j3.a(jArr[0]);
        long jA2 = j3.a(jArr[1]);
        long j10 = (jA & 4294967295L) | (jA2 << 32);
        long j11 = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = j3.a(jArr[2]);
        long jA4 = j3.a(jArr[3]);
        long j12 = (jA3 & 4294967295L) | (jA4 << 32);
        long j13 = (jA3 >>> 32) | (jA4 & (-4294967296L));
        long jA5 = j3.a(jArr[4]);
        long jA6 = j3.a(jArr[5]);
        long j14 = (jA5 >>> 32) | (jA6 & (-4294967296L));
        long jA7 = j3.a(jArr[6]);
        long j15 = jA7 >>> 32;
        jArr2[0] = j10 ^ (j11 << 44);
        jArr2[1] = (j12 ^ (j13 << 44)) ^ (j11 >>> 20);
        jArr2[2] = (((jA5 & 4294967295L) | (jA6 << 32)) ^ (j14 << 44)) ^ (j13 >>> 20);
        jArr2[3] = (((j15 << 44) ^ (jA7 & 4294967295L)) ^ (j14 >>> 20)) ^ (j11 << 13);
        jArr2[4] = (j11 >>> 51) ^ ((jA7 >>> 52) ^ (j13 << 13));
        jArr2[5] = (j14 << 13) ^ (j13 >>> 51);
        jArr2[6] = (j15 << 13) ^ (j14 >>> 51);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrB = e4.b(13);
        b(jArr, jArrB);
        reduce(jArrB, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrB = e4.b(13);
        b(jArr, jArrB);
        addExt(jArr2, jArrB, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrB = e4.b(13);
        b(jArr, jArrB);
        reduce(jArrB, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            b(jArr2, jArrB);
            reduce(jArrB, jArr2);
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
        long j14 = jArr[4];
        long j15 = jArr[5];
        long j16 = jArr[6];
        jArr2[0] = j10 & 576460752303423487L;
        jArr2[1] = ((j10 >>> 59) ^ (j11 << 5)) & 576460752303423487L;
        jArr2[2] = ((j11 >>> 54) ^ (j12 << 10)) & 576460752303423487L;
        jArr2[3] = ((j12 >>> 49) ^ (j13 << 15)) & 576460752303423487L;
        jArr2[4] = ((j13 >>> 44) ^ (j14 << 20)) & 576460752303423487L;
        jArr2[5] = ((j14 >>> 39) ^ (j15 << 25)) & 576460752303423487L;
        jArr2[6] = (j15 >>> 34) ^ (j16 << 30);
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[7];
        long[] jArr5 = new long[7];
        a(jArr, jArr4);
        a(jArr2, jArr5);
        for (int i10 = 0; i10 < 7; i10++) {
            a(jArr4, jArr5[i10], jArr3, i10);
        }
        a(jArr3);
    }

    public static void a(long[] jArr, long j10, long[] jArr2, int i10) {
        long j11 = j10 << 1;
        long j12 = j11 ^ j10;
        long j13 = j10 << 2;
        long j14 = j12 << 1;
        long[] jArr3 = {0, j10, j11, j12, j13, j13 ^ j10, j14, j14 ^ j10};
        for (int i11 = 0; i11 < 7; i11++) {
            long j15 = jArr[i11];
            int i12 = (int) j15;
            long j16 = jArr3[i12 & 7] ^ (jArr3[(i12 >>> 3) & 7] << 3);
            long j17 = 0;
            int i13 = 54;
            do {
                int i14 = (int) (j15 >>> i13);
                long j18 = jArr3[i14 & 7] ^ (jArr3[(i14 >>> 3) & 7] << 3);
                j16 ^= j18 << i13;
                j17 ^= j18 >>> (-i13);
                i13 -= 6;
            } while (i13 > 0);
            int i15 = i10 + i11;
            jArr2[i15] = jArr2[i15] ^ (576460752303423487L & j16);
            int i16 = i15 + 1;
            jArr2[i16] = jArr2[i16] ^ ((j16 >>> 59) ^ (j17 << 5));
        }
    }
}
