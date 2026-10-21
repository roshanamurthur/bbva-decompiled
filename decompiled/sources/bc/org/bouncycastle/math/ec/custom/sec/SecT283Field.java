package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.j3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.z3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT283Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f25156a = {878416384462358536L, 3513665537849438403L, -9076969306111048948L, 585610922974906400L, 34087042};

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
        jArr[0] = j10 ^ (j11 << 57);
        jArr[1] = (j11 >>> 7) ^ (j12 << 50);
        jArr[2] = (j12 >>> 14) ^ (j13 << 43);
        jArr[3] = (j13 >>> 21) ^ (j14 << 36);
        jArr[4] = (j14 >>> 28) ^ (j15 << 29);
        jArr[5] = (j15 >>> 35) ^ (j16 << 22);
        jArr[6] = (j16 >>> 42) ^ (j17 << 15);
        jArr[7] = (j17 >>> 49) ^ (j18 << 8);
        jArr[8] = (j18 >>> 56) ^ (j19 << 1);
        jArr[9] = j19 >>> 63;
    }

    public static void add(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr2[4] ^ jArr[4];
    }

    public static void addExt(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr[7] ^ jArr2[7];
        jArr3[8] = jArr2[8] ^ jArr[8];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
        jArr2[3] = jArr[3];
        jArr2[4] = jArr[4];
    }

    public static void b(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < 4; i10++) {
            j3.a(jArr[i10], jArr2, i10 << 1);
        }
        jArr2[8] = j3.b((int) jArr[4]);
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrA = z3.a(bigInteger);
        reduce37(jArrA, 0);
        return jArrA;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (z3.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = z3.a();
        long[] jArrA2 = z3.a();
        square(jArr, jArrA);
        multiply(jArrA, jArr, jArrA);
        squareN(jArrA, 2, jArrA2);
        multiply(jArrA2, jArrA, jArrA2);
        squareN(jArrA2, 4, jArrA);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 8, jArrA2);
        multiply(jArrA2, jArrA, jArrA2);
        square(jArrA2, jArrA2);
        multiply(jArrA2, jArr, jArrA2);
        squareN(jArrA2, 17, jArrA);
        multiply(jArrA, jArrA2, jArrA);
        square(jArrA, jArrA);
        multiply(jArrA, jArr, jArrA);
        squareN(jArrA, 35, jArrA2);
        multiply(jArrA2, jArrA, jArrA2);
        squareN(jArrA2, 70, jArrA);
        multiply(jArrA, jArrA2, jArrA);
        square(jArrA, jArrA);
        multiply(jArrA, jArr, jArrA);
        squareN(jArrA, 141, jArrA2);
        multiply(jArrA2, jArrA, jArrA2);
        square(jArrA2, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = z3.b();
        a(jArr, jArr2, jArrB);
        reduce(jArrB, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = z3.b();
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
        long j18 = jArr[8];
        long j19 = j14 ^ ((((j18 >>> 27) ^ (j18 >>> 22)) ^ (j18 >>> 20)) ^ (j18 >>> 15));
        long j20 = j10 ^ ((((j15 << 37) ^ (j15 << 42)) ^ (j15 << 44)) ^ (j15 << 49));
        long j21 = (j11 ^ ((((j16 << 37) ^ (j16 << 42)) ^ (j16 << 44)) ^ (j16 << 49))) ^ ((((j15 >>> 27) ^ (j15 >>> 22)) ^ (j15 >>> 20)) ^ (j15 >>> 15));
        long j22 = j19 >>> 27;
        jArr2[0] = (((j20 ^ j22) ^ (j22 << 5)) ^ (j22 << 7)) ^ (j22 << 12);
        jArr2[1] = j21;
        jArr2[2] = (j12 ^ ((((j17 << 37) ^ (j17 << 42)) ^ (j17 << 44)) ^ (j17 << 49))) ^ ((((j16 >>> 27) ^ (j16 >>> 22)) ^ (j16 >>> 20)) ^ (j16 >>> 15));
        jArr2[3] = (j13 ^ ((((j18 << 37) ^ (j18 << 42)) ^ (j18 << 44)) ^ (j18 << 49))) ^ ((((j17 >>> 27) ^ (j17 >>> 22)) ^ (j17 >>> 20)) ^ (j17 >>> 15));
        jArr2[4] = 134217727 & j19;
    }

    public static void reduce37(long[] jArr, int i10) {
        int i11 = i10 + 4;
        long j10 = jArr[i11];
        long j11 = j10 >>> 27;
        jArr[i10] = ((j11 << 12) ^ (((j11 << 5) ^ j11) ^ (j11 << 7))) ^ jArr[i10];
        jArr[i11] = j10 & 134217727;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrA = z3.a();
        long jA = j3.a(jArr[0]);
        long jA2 = j3.a(jArr[1]);
        long j10 = (jA & 4294967295L) | (jA2 << 32);
        jArrA[0] = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = j3.a(jArr[2]);
        long jA4 = j3.a(jArr[3]);
        long j11 = (jA3 & 4294967295L) | (jA4 << 32);
        jArrA[1] = (jA3 >>> 32) | ((-4294967296L) & jA4);
        long jA5 = j3.a(jArr[4]);
        jArrA[2] = jA5 >>> 32;
        multiply(jArrA, f25156a, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ j11;
        jArr2[2] = jArr2[2] ^ (4294967295L & jA5);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrB = e4.b(9);
        b(jArr, jArrB);
        reduce(jArrB, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrB = e4.b(9);
        b(jArr, jArrB);
        addExt(jArr2, jArrB, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrB = e4.b(9);
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
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }

    public static void a(long[] jArr, long[] jArr2) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        jArr2[0] = j10 & 144115188075855871L;
        jArr2[1] = ((j10 >>> 57) ^ (j11 << 7)) & 144115188075855871L;
        jArr2[2] = ((j11 >>> 50) ^ (j12 << 14)) & 144115188075855871L;
        jArr2[3] = ((j12 >>> 43) ^ (j13 << 21)) & 144115188075855871L;
        jArr2[4] = (j13 >>> 36) ^ (j14 << 28);
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        a(jArr, jArr4);
        a(jArr2, jArr5);
        long[] jArr6 = new long[26];
        a(jArr4[0], jArr5[0], jArr6, 0);
        a(jArr4[1], jArr5[1], jArr6, 2);
        a(jArr4[2], jArr5[2], jArr6, 4);
        a(jArr4[3], jArr5[3], jArr6, 6);
        a(jArr4[4], jArr5[4], jArr6, 8);
        long j10 = jArr4[0];
        long j11 = j10 ^ jArr4[1];
        long j12 = jArr5[0];
        long j13 = j12 ^ jArr5[1];
        long j14 = jArr4[2];
        long j15 = j10 ^ j14;
        long j16 = jArr5[2];
        long j17 = j12 ^ j16;
        long j18 = jArr4[4];
        long j19 = j14 ^ j18;
        long j20 = jArr5[4];
        long j21 = j16 ^ j20;
        long j22 = jArr4[3];
        long j23 = j22 ^ j18;
        long j24 = jArr5[3];
        long j25 = j24 ^ j20;
        a(j15 ^ j22, j17 ^ j24, jArr6, 18);
        a(j19 ^ jArr4[1], j21 ^ jArr5[1], jArr6, 20);
        long j26 = j11 ^ j23;
        long j27 = j13 ^ j25;
        long j28 = j26 ^ jArr4[2];
        long j29 = jArr5[2] ^ j27;
        a(j26, j27, jArr6, 22);
        a(j28, j29, jArr6, 24);
        a(j11, j13, jArr6, 10);
        a(j15, j17, jArr6, 12);
        a(j19, j21, jArr6, 14);
        a(j23, j25, jArr6, 16);
        jArr3[0] = jArr6[0];
        jArr3[9] = jArr6[9];
        long j30 = jArr6[0];
        long j31 = jArr6[1] ^ j30;
        long j32 = jArr6[2] ^ j31;
        long j33 = jArr6[10] ^ j32;
        jArr3[1] = j33;
        long j34 = jArr6[3] ^ jArr6[4];
        long j35 = j32 ^ (j34 ^ (jArr6[11] ^ jArr6[12]));
        jArr3[2] = j35;
        long j36 = j31 ^ j34;
        long j37 = jArr6[5] ^ jArr6[6];
        long j38 = jArr6[8];
        long j39 = (j36 ^ j37) ^ j38;
        long j40 = jArr6[13] ^ jArr6[14];
        long j41 = jArr6[18];
        long j42 = jArr6[22];
        long j43 = jArr6[24];
        jArr3[3] = (j39 ^ j40) ^ ((j41 ^ j42) ^ j43);
        long j44 = jArr6[7] ^ j38;
        long j45 = jArr6[9];
        long j46 = j44 ^ j45;
        long j47 = j46 ^ jArr6[17];
        jArr3[8] = j47;
        long j48 = (j46 ^ j37) ^ (jArr6[15] ^ jArr6[16]);
        jArr3[7] = j48;
        long j49 = j48 ^ j33;
        long j50 = jArr6[19] ^ jArr6[20];
        long j51 = jArr6[25];
        long j52 = j51 ^ j43;
        long j53 = jArr6[23];
        long j54 = j50 ^ j52;
        jArr3[4] = (j54 ^ (j41 ^ j53)) ^ j49;
        long j55 = jArr6[21];
        jArr3[5] = ((j35 ^ j47) ^ j54) ^ (j55 ^ j42);
        jArr3[6] = (((((j39 ^ j30) ^ j45) ^ j40) ^ j55) ^ j53) ^ j51;
        a(jArr3);
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
}
