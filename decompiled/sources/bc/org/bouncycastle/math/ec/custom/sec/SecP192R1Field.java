package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP192R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25098a = {-1, -1, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25099b = {1, 0, 2, 0, 1, 0, -2, -1, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25100c = {-1, -1, -3, -1, -2, -1, 1, 0, 2};

    public static void a(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = j10 >> 32;
        if (j11 != 0) {
            long j12 = j11 + (((long) iArr[1]) & 4294967295L);
            iArr[1] = (int) j12;
            j11 = j12 >> 32;
        }
        long j13 = (4294967295L & ((long) iArr[2])) + 1 + j11;
        iArr[2] = (int) j13;
        if ((j13 >> 32) != 0) {
            e4.b(6, iArr, 3);
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (w3.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && w3.b(iArr3, f25098a))) {
            a(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((e4.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && e4.c(12, iArr3, f25099b))) && e4.a(9, f25100c, iArr3) != 0) {
            e4.b(12, iArr3, 9);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && w3.b(iArr2, f25098a))) {
            a(iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = w3.a(bigInteger);
        if (iArrA[5] == -1) {
            int[] iArr = f25098a;
            if (w3.b(iArrA, iArr)) {
                w3.d(iArr, iArrA);
            }
        }
        return iArrA;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            e4.a(6, iArr, 0, iArr2);
        } else {
            e4.c(6, iArr2, w3.a(iArr, f25098a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrC = w3.c();
        w3.c(iArr, iArr2, iArrC);
        reduce(iArrC, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((w3.d(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && e4.c(12, iArr3, f25099b))) && e4.a(9, f25100c, iArr3) != 0) {
            e4.b(12, iArr3, 9);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (w3.b(iArr)) {
            w3.d(iArr2);
        } else {
            w3.e(f25098a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[6]) & 4294967295L;
        long j11 = ((long) iArr[7]) & 4294967295L;
        long j12 = ((long) iArr[8]) & 4294967295L;
        long j13 = ((long) iArr[9]) & 4294967295L;
        long j14 = (((long) iArr[10]) & 4294967295L) + j10;
        long j15 = (((long) iArr[11]) & 4294967295L) + j11;
        long j16 = (((long) iArr[0]) & 4294967295L) + j14;
        long j17 = (((long) iArr[1]) & 4294967295L) + j15 + (j16 >> 32);
        int i10 = (int) j17;
        iArr2[1] = i10;
        long j18 = j14 + j12;
        long j19 = j15 + j13;
        long j20 = (((long) iArr[2]) & 4294967295L) + j18 + (j17 >> 32);
        long j21 = j20 & 4294967295L;
        long j22 = (((long) iArr[3]) & 4294967295L) + j19 + (j20 >> 32);
        iArr2[3] = (int) j22;
        long j23 = (((long) iArr[4]) & 4294967295L) + (j18 - j10) + (j22 >> 32);
        iArr2[4] = (int) j23;
        long j24 = (((long) iArr[5]) & 4294967295L) + (j19 - j11) + (j23 >> 32);
        iArr2[5] = (int) j24;
        long j25 = j24 >> 32;
        long j26 = j21 + j25;
        long j27 = j25 + (((long) ((int) j16)) & 4294967295L);
        iArr2[0] = (int) j27;
        long j28 = j27 >> 32;
        if (j28 != 0) {
            long j29 = j28 + (((long) i10) & 4294967295L);
            iArr2[1] = (int) j29;
            j26 += j29 >> 32;
        }
        iArr2[2] = (int) j26;
        if (((j26 >> 32) == 0 || e4.b(6, iArr2, 3) == 0) && !(iArr2[5] == -1 && w3.b(iArr2, f25098a))) {
            return;
        }
        a(iArr2);
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
                j13 = j14 >> 32;
            }
            long j15 = (4294967295L & ((long) iArr[2])) + j11 + j13;
            iArr[2] = (int) j15;
            j10 = j15 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || e4.b(6, iArr, 3) == 0) && !(iArr[5] == -1 && w3.b(iArr, f25098a))) {
            return;
        }
        a(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrC = w3.c();
        w3.c(iArr, iArrC);
        reduce(iArrC, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrC = w3.c();
        w3.c(iArr, iArrC);
        reduce(iArrC, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            w3.c(iArr2, iArrC);
            reduce(iArrC, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (w3.e(iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = j10 >> 32;
            if (j11 != 0) {
                long j12 = j11 + (((long) iArr3[1]) & 4294967295L);
                iArr3[1] = (int) j12;
                j11 = j12 >> 32;
            }
            long j13 = ((4294967295L & ((long) iArr3[2])) - 1) + j11;
            iArr3[2] = (int) j13;
            if ((j13 >> 32) != 0) {
                e4.a(6, iArr3, 3);
            }
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(12, iArr, iArr2, iArr3) == 0 || e4.e(9, f25100c, iArr3) == 0) {
            return;
        }
        e4.a(12, iArr3, 9);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && w3.b(iArr2, f25098a))) {
            a(iArr2);
        }
    }
}
