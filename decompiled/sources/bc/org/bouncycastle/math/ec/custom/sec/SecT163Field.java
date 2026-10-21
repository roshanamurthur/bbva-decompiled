package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.j3;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT163Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f25143a = {-5270498306774157648L, 5270498306774195053L, 19634136210L};

    public static void a(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        jArr[0] = j10 ^ (j11 << 55);
        jArr[1] = (j11 >>> 9) ^ (j12 << 46);
        jArr[2] = (j12 >>> 18) ^ (j13 << 37);
        jArr[3] = (j13 >>> 27) ^ (j14 << 28);
        jArr[4] = (j14 >>> 36) ^ (j15 << 19);
        jArr[5] = j15 >>> 45;
    }

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
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr2[5] ^ jArr[5];
    }

    public static void addOne(long[] jArr, long[] jArr2) {
        jArr2[0] = jArr[0] ^ 1;
        jArr2[1] = jArr[1];
        jArr2[2] = jArr[2];
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrB = w3.b(bigInteger);
        reduce29(jArrB, 0);
        return jArrB;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (w3.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrB = w3.b();
        long[] jArrB2 = w3.b();
        square(jArr, jArrB);
        squareN(jArrB, 1, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB2, 1, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 3, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB2, 3, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 9, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB2, 9, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 27, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB2, 27, jArrB2);
        multiply(jArrB, jArrB2, jArrB);
        squareN(jArrB, 81, jArrB2);
        multiply(jArrB, jArrB2, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrD = w3.d();
        a(jArr, jArr2, jArrD);
        reduce(jArrD, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrD = w3.d();
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
        long j16 = j13 ^ ((((j15 >>> 35) ^ (j15 >>> 32)) ^ (j15 >>> 29)) ^ (j15 >>> 28));
        long j17 = (j12 ^ ((((j15 << 29) ^ (j15 << 32)) ^ (j15 << 35)) ^ (j15 << 36))) ^ ((j14 >>> 28) ^ (((j14 >>> 35) ^ (j14 >>> 32)) ^ (j14 >>> 29)));
        long j18 = j10 ^ ((((j16 << 29) ^ (j16 << 32)) ^ (j16 << 35)) ^ (j16 << 36));
        long j19 = (j11 ^ ((((j14 << 29) ^ (j14 << 32)) ^ (j14 << 35)) ^ (j14 << 36))) ^ ((j16 >>> 28) ^ (((j16 >>> 35) ^ (j16 >>> 32)) ^ (j16 >>> 29)));
        long j20 = j17 >>> 35;
        jArr2[0] = (((j18 ^ j20) ^ (j20 << 3)) ^ (j20 << 6)) ^ (j20 << 7);
        jArr2[1] = j19;
        jArr2[2] = 34359738367L & j17;
    }

    public static void reduce29(long[] jArr, int i10) {
        int i11 = i10 + 2;
        long j10 = jArr[i11];
        long j11 = j10 >>> 35;
        jArr[i10] = ((j11 << 7) ^ (((j11 << 3) ^ j11) ^ (j11 << 6))) ^ jArr[i10];
        jArr[i11] = j10 & 34359738367L;
    }

    public static void sqrt(long[] jArr, long[] jArr2) {
        long[] jArrB = w3.b();
        long jA = j3.a(jArr[0]);
        long jA2 = j3.a(jArr[1]);
        long j10 = (jA & 4294967295L) | (jA2 << 32);
        jArrB[0] = (jA >>> 32) | (jA2 & (-4294967296L));
        long jA3 = j3.a(jArr[2]);
        jArrB[1] = jA3 >>> 32;
        multiply(jArrB, f25143a, jArr2);
        jArr2[0] = jArr2[0] ^ j10;
        jArr2[1] = jArr2[1] ^ (jA3 & 4294967295L);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrD = w3.d();
        a(jArr, jArrD);
        reduce(jArrD, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrD = w3.d();
        a(jArr, jArrD);
        addExt(jArr2, jArrD, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrD = w3.d();
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
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = (jArr[2] << 18) ^ (j11 >>> 46);
        long j13 = ((j11 << 9) ^ (j10 >>> 55)) & 36028797018963967L;
        long j14 = j10 & 36028797018963967L;
        long j15 = jArr2[0];
        long j16 = jArr2[1];
        long j17 = (j16 >>> 46) ^ (jArr2[2] << 18);
        long j18 = ((j15 >>> 55) ^ (j16 << 9)) & 36028797018963967L;
        long j19 = j15 & 36028797018963967L;
        long[] jArr4 = new long[10];
        a(j14, j19, jArr4, 0);
        a(j12, j17, jArr4, 2);
        long j20 = (j14 ^ j13) ^ j12;
        long j21 = (j19 ^ j18) ^ j17;
        a(j20, j21, jArr4, 4);
        long j22 = (j13 << 1) ^ (j12 << 2);
        long j23 = (j18 << 1) ^ (j17 << 2);
        a(j14 ^ j22, j19 ^ j23, jArr4, 6);
        a(j20 ^ j22, j21 ^ j23, jArr4, 8);
        long j24 = jArr4[6];
        long j25 = jArr4[8] ^ j24;
        long j26 = jArr4[7];
        long j27 = jArr4[9] ^ j26;
        long j28 = (j25 << 1) ^ j24;
        long j29 = jArr4[0];
        long j30 = jArr4[1];
        long j31 = (j30 ^ j29) ^ jArr4[4];
        long j32 = j30 ^ jArr4[5];
        long j33 = jArr4[2];
        long j34 = ((j28 ^ j29) ^ (j33 << 4)) ^ (j33 << 1);
        long j35 = jArr4[3];
        long j36 = (((j31 ^ ((j25 ^ (j27 << 1)) ^ j26)) ^ (j35 << 4)) ^ (j35 << 1)) ^ (j34 >>> 55);
        long j37 = (j32 ^ j27) ^ (j36 >>> 55);
        long j38 = ((j34 & 36028797018963967L) >>> 1) ^ ((j36 & 1) << 54);
        long j39 = j38 ^ (j38 << 1);
        long j40 = j39 ^ (j39 << 2);
        long j41 = j40 ^ (j40 << 4);
        long j42 = j41 ^ (j41 << 8);
        long j43 = j42 ^ (j42 << 16);
        long j44 = (j43 ^ (j43 << 32)) & 36028797018963967L;
        long j45 = (((j36 & 36028797018963967L) >>> 1) ^ ((j37 & 1) << 54)) ^ (j44 >>> 54);
        long j46 = j45 ^ (j45 << 1);
        long j47 = j46 ^ (j46 << 2);
        long j48 = j47 ^ (j47 << 4);
        long j49 = j48 ^ (j48 << 8);
        long j50 = j49 ^ (j49 << 16);
        long j51 = (j50 ^ (j50 << 32)) & 36028797018963967L;
        long j52 = (j37 >>> 1) ^ (j51 >>> 54);
        long j53 = j52 ^ (j52 << 1);
        long j54 = j53 ^ (j53 << 2);
        long j55 = j54 ^ (j54 << 4);
        long j56 = j55 ^ (j55 << 8);
        long j57 = j56 ^ (j56 << 16);
        long j58 = j57 ^ (j57 << 32);
        jArr3[0] = j29;
        jArr3[1] = (j31 ^ j44) ^ j33;
        jArr3[2] = ((j32 ^ j51) ^ j44) ^ j35;
        jArr3[3] = j58 ^ j51;
        jArr3[4] = jArr4[2] ^ j58;
        jArr3[5] = jArr4[3];
        a(jArr3);
    }

    public static void a(long j10, long j11, long[] jArr, int i10) {
        long j12 = j11 << 1;
        long j13 = j12 ^ j11;
        long j14 = j11 << 2;
        long j15 = j13 << 1;
        long[] jArr2 = {0, j11, j12, j13, j14, j14 ^ j11, j15, j15 ^ j11};
        long j16 = jArr2[((int) j10) & 3];
        long j17 = 0;
        int i11 = 47;
        do {
            int i12 = (int) (j10 >>> i11);
            long j18 = (jArr2[i12 & 7] ^ (jArr2[(i12 >>> 3) & 7] << 3)) ^ (jArr2[(i12 >>> 6) & 7] << 6);
            j16 ^= j18 << i11;
            j17 ^= j18 >>> (-i11);
            i11 -= 9;
        } while (i11 > 0);
        jArr[i10] = 36028797018963967L & j16;
        jArr[i10 + 1] = (j16 >>> 55) ^ (j17 << 9);
    }

    public static void a(long[] jArr, long[] jArr2) {
        j3.a(jArr[0], jArr2, 0);
        j3.a(jArr[1], jArr2, 2);
        long j10 = jArr[2];
        jArr2[4] = j3.b((int) j10);
        jArr2[5] = ((long) j3.c((int) (j10 >>> 32))) & 4294967295L;
    }
}
