package bc.org.bouncycastle.math.ec.custom.sec;

import androidx.camera.camera2.internal.n1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25123a = {-1, -1, -1, 0, 0, 0, 1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25124b = {1, 0, 0, -2, -1, -1, -2, 1, -2, 1, -2, 1, 1, -2, 2, -2};

    public static void a(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            long j13 = (j12 >> 32) + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j11 = j13 >> 32;
        }
        long j14 = ((((long) iArr[3]) & 4294967295L) - 1) + j11;
        iArr[3] = (int) j14;
        long j15 = j14 >> 32;
        if (j15 != 0) {
            long j16 = j15 + (((long) iArr[4]) & 4294967295L);
            iArr[4] = (int) j16;
            long j17 = (j16 >> 32) + (((long) iArr[5]) & 4294967295L);
            iArr[5] = (int) j17;
            j15 = j17 >> 32;
        }
        long j18 = ((((long) iArr[6]) & 4294967295L) - 1) + j15;
        iArr[6] = (int) j18;
        iArr[7] = (int) ((4294967295L & ((long) iArr[7])) + 1 + (j18 >> 32));
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (y3.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && y3.c(iArr3, f25123a))) {
            a(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        int iA = e4.a(16, iArr, iArr2, iArr3);
        int[] iArr4 = f25124b;
        if (iA != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && e4.c(16, iArr3, iArr4))) {
            e4.e(16, iArr4, iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && y3.c(iArr2, f25123a))) {
            a(iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = y3.a(bigInteger);
        if (iArrA[7] == -1) {
            int[] iArr = f25123a;
            if (y3.c(iArrA, iArr)) {
                y3.e(iArr, iArrA);
            }
        }
        return iArrA;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            e4.a(8, iArr, 0, iArr2);
        } else {
            e4.c(8, iArr2, y3.a(iArr, f25123a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrC = y3.c();
        y3.c(iArr, iArr2, iArrC);
        reduce(iArrC, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        int iD = y3.d(iArr, iArr2, iArr3);
        int[] iArr4 = f25124b;
        if (iD != 0 || ((iArr3[15] >>> 1) >= Integer.MAX_VALUE && e4.c(16, iArr3, iArr4))) {
            e4.e(16, iArr4, iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (y3.b(iArr)) {
            y3.d(iArr2);
        } else {
            y3.e(f25123a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[8]) & 4294967295L;
        long j11 = ((long) iArr[9]) & 4294967295L;
        long j12 = ((long) iArr[10]) & 4294967295L;
        long j13 = ((long) iArr[11]) & 4294967295L;
        long j14 = ((long) iArr[12]) & 4294967295L;
        long j15 = ((long) iArr[13]) & 4294967295L;
        long j16 = ((long) iArr[14]) & 4294967295L;
        long j17 = ((long) iArr[15]) & 4294967295L;
        long j18 = j10 - 6;
        long j19 = j18 + j11;
        long j20 = j11 + j12;
        long j21 = (j12 + j13) - j17;
        long j22 = j13 + j14;
        long j23 = j14 + j15;
        long j24 = j15 + j16;
        long j25 = j16 + j17;
        long j26 = j24 - j19;
        long j27 = ((((long) iArr[0]) & 4294967295L) - j22) - j26;
        iArr2[0] = (int) j27;
        long j28 = ((((((long) iArr[1]) & 4294967295L) + j20) - j23) - j25) + (j27 >> 32);
        iArr2[1] = (int) j28;
        long jG = ai.a.g(((long) iArr[2]) & 4294967295L, j21, j24, j28 >> 32);
        iArr2[2] = (int) jG;
        long jD = n1.d(((long) iArr[3]) & 4294967295L, j22 << 1, j26, j25, jG >> 32);
        iArr2[3] = (int) jD;
        long jD2 = n1.d(((long) iArr[4]) & 4294967295L, j23 << 1, j16, j20, jD >> 32);
        iArr2[4] = (int) jD2;
        long jG2 = ai.a.g(((long) iArr[5]) & 4294967295L, j24 << 1, j21, jD2 >> 32);
        iArr2[5] = (int) jG2;
        long j29 = (((long) iArr[6]) & 4294967295L) + (j25 << 1) + j26 + (jG2 >> 32);
        iArr2[6] = (int) j29;
        long j30 = (((((((long) iArr[7]) & 4294967295L) + (j17 << 1)) + j18) - j21) - j23) + (j29 >> 32);
        iArr2[7] = (int) j30;
        reduce32((int) ((j30 >> 32) + 6), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = ((long) i10) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11;
            iArr[0] = (int) j12;
            long j13 = j12 >> 32;
            if (j13 != 0) {
                long j14 = j13 + (((long) iArr[1]) & 4294967295L);
                iArr[1] = (int) j14;
                long j15 = (j14 >> 32) + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j15;
                j13 = j15 >> 32;
            }
            long j16 = ((((long) iArr[3]) & 4294967295L) - j11) + j13;
            iArr[3] = (int) j16;
            long j17 = j16 >> 32;
            if (j17 != 0) {
                long j18 = j17 + (((long) iArr[4]) & 4294967295L);
                iArr[4] = (int) j18;
                long j19 = (j18 >> 32) + (((long) iArr[5]) & 4294967295L);
                iArr[5] = (int) j19;
                j17 = j19 >> 32;
            }
            long j20 = ((((long) iArr[6]) & 4294967295L) - j11) + j17;
            iArr[6] = (int) j20;
            long j21 = (4294967295L & ((long) iArr[7])) + j11 + (j20 >> 32);
            iArr[7] = (int) j21;
            j10 = j21 >> 32;
        } else {
            j10 = 0;
        }
        if (j10 != 0 || (iArr[7] == -1 && y3.c(iArr, f25123a))) {
            a(iArr);
        }
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrC = y3.c();
        y3.d(iArr, iArrC);
        reduce(iArrC, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrC = y3.c();
        y3.d(iArr, iArrC);
        reduce(iArrC, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            y3.d(iArr2, iArrC);
            reduce(iArrC, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (y3.e(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                long j13 = (j12 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j11 = j13 >> 32;
            }
            long j14 = (((long) iArr3[3]) & 4294967295L) + 1 + j11;
            iArr3[3] = (int) j14;
            long j15 = j14 >> 32;
            if (j15 != 0) {
                long j16 = j15 + (((long) iArr3[4]) & 4294967295L);
                iArr3[4] = (int) j16;
                long j17 = (j16 >> 32) + (((long) iArr3[5]) & 4294967295L);
                iArr3[5] = (int) j17;
                j15 = j17 >> 32;
            }
            long j18 = (((long) iArr3[6]) & 4294967295L) + 1 + j15;
            iArr3[6] = (int) j18;
            iArr3[7] = (int) (((((long) iArr3[7]) & 4294967295L) - 1) + (j18 >> 32));
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(16, iArr, iArr2, iArr3) != 0) {
            e4.a(16, f25124b, iArr3);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && y3.c(iArr2, f25123a))) {
            a(iArr2);
        }
    }
}
