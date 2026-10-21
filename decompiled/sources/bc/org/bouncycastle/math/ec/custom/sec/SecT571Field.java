package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.d4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.j3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecT571Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f25163a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    public static void a(long[] jArr, long[] jArr2, long[] jArr3) {
        b(jArr, precompMultiplicand(jArr2), jArr3);
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

    public static void b(long[] jArr, int i10, long[] jArr2, int i11, long[] jArr3, int i12) {
        for (int i13 = 0; i13 < 9; i13++) {
            int i14 = i12 + i13;
            jArr3[i14] = jArr3[i14] ^ (jArr[i10 + i13] ^ jArr2[i11 + i13]);
        }
    }

    public static long[] fromBigInteger(BigInteger bigInteger) {
        long[] jArrA = d4.a(bigInteger);
        reduce5(jArrA, 0);
        return jArrA;
    }

    public static void invert(long[] jArr, long[] jArr2) {
        if (d4.b(jArr)) {
            throw new IllegalStateException();
        }
        long[] jArrA = d4.a();
        long[] jArrA2 = d4.a();
        long[] jArrA3 = d4.a();
        square(jArr, jArrA3);
        square(jArrA3, jArrA);
        square(jArrA, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 2, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        multiply(jArrA, jArrA3, jArrA);
        squareN(jArrA, 5, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA2, 5, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 15, jArrA2);
        multiply(jArrA, jArrA2, jArrA3);
        squareN(jArrA3, 30, jArrA);
        squareN(jArrA, 30, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 60, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA2, 60, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA, 180, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        squareN(jArrA2, 180, jArrA2);
        multiply(jArrA, jArrA2, jArrA);
        multiply(jArrA, jArrA3, jArr2);
    }

    public static void multiply(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = d4.b();
        a(jArr, jArr2, jArrB);
        reduce(jArrB, jArr3);
    }

    public static void multiplyAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = d4.b();
        a(jArr, jArr2, jArrB);
        addExt(jArr3, jArrB, jArr3);
    }

    public static void multiplyPrecomp(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = d4.b();
        b(jArr, jArr2, jArrB);
        reduce(jArrB, jArr3);
    }

    public static void multiplyPrecompAddToExt(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArrB = d4.b();
        b(jArr, jArr2, jArrB);
        addExt(jArr3, jArrB, jArr3);
    }

    public static long[] precompMultiplicand(long[] jArr) {
        long[] jArr2 = new long[288];
        System.arraycopy(jArr, 0, jArr2, 9, 9);
        int i10 = 7;
        int i11 = 0;
        while (i10 > 0) {
            int i12 = i11 + 18;
            e4.a(9, jArr2, i12 >>> 1, 0L, jArr2, i12);
            reduce5(jArr2, i12);
            int i13 = i11 + 27;
            for (int i14 = 0; i14 < 9; i14++) {
                jArr2[i13 + i14] = jArr2[9 + i14] ^ jArr2[i12 + i14];
            }
            i10--;
            i11 = i12;
        }
        e4.a(144, jArr2, 0, 4, 0L, jArr2, 144);
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
        long[] jArrA = d4.a();
        long[] jArrA2 = d4.a();
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = i10 + 1;
            long jA = j3.a(jArr[i10]);
            i10 += 2;
            long jA2 = j3.a(jArr[i12]);
            jArrA[i11] = (4294967295L & jA) | (jA2 << 32);
            jArrA2[i11] = (jA >>> 32) | ((-4294967296L) & jA2);
        }
        long jA3 = j3.a(jArr[i10]);
        jArrA[4] = 4294967295L & jA3;
        jArrA2[4] = jA3 >>> 32;
        multiply(jArrA2, f25163a, jArr2);
        add(jArr2, jArrA, jArr2);
    }

    public static void square(long[] jArr, long[] jArr2) {
        long[] jArrB = d4.b();
        a(jArr, jArrB);
        reduce(jArrB, jArr2);
    }

    public static void squareAddToExt(long[] jArr, long[] jArr2) {
        long[] jArrB = d4.b();
        a(jArr, jArrB);
        addExt(jArr2, jArrB, jArr2);
    }

    public static void squareN(long[] jArr, int i10, long[] jArr2) {
        long[] jArrB = d4.b();
        a(jArr, jArrB);
        reduce(jArrB, jArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            a(jArr2, jArrB);
            reduce(jArrB, jArr2);
        }
    }

    public static int trace(long[] jArr) {
        long j10 = jArr[0];
        long j11 = jArr[8];
        return ((int) ((j10 ^ (j11 >>> 49)) ^ (j11 >>> 57))) & 1;
    }

    public static void b(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 56; i10 >= 0; i10 -= 8) {
            for (int i11 = 1; i11 < 9; i11 += 2) {
                int i12 = (int) (jArr[i11] >>> i10);
                b(jArr2, (i12 & 15) * 9, jArr2, (((i12 >>> 4) & 15) + 16) * 9, jArr3, i11 - 1);
            }
            e4.a(16, jArr3, 0, 8, 0L);
        }
        for (int i13 = 56; i13 >= 0; i13 -= 8) {
            for (int i14 = 0; i14 < 9; i14 += 2) {
                int i15 = (int) (jArr[i14] >>> i13);
                b(jArr2, (i15 & 15) * 9, jArr2, (((i15 >>> 4) & 15) + 16) * 9, jArr3, i14);
            }
            if (i13 > 0) {
                e4.a(18, jArr3, 0, 8, 0L);
            }
        }
    }

    public static void a(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < 9; i10++) {
            j3.a(jArr[i10], jArr2, i10 << 1);
        }
    }
}
