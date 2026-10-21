package bc.org.bouncycastle.math.ec.custom.djb;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: loaded from: classes2.dex */
public class Curve25519Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25061a = {-19, -1, -1, -1, -1, -1, -1, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25062b = {361, 0, 0, 0, 0, 0, 0, 0, -19, -1, -1, -1, -1, -1, -1, LockFreeTaskQueueCore.MAX_CAPACITY_MASK};

    public static void a(int[] iArr) {
        long j10 = ((long) iArr[0]) & 4294967295L;
        int[] iArr2 = f25062b;
        long j11 = j10 - (((long) iArr2[0]) & 4294967295L);
        iArr[0] = (int) j11;
        long jA = j11 >> 32;
        if (jA != 0) {
            jA = e4.a(8, iArr, 1);
        }
        long j12 = (((long) iArr[8]) & 4294967295L) + 19 + jA;
        iArr[8] = (int) j12;
        long jB = j12 >> 32;
        if (jB != 0) {
            jB = e4.b(15, iArr, 9);
        }
        iArr[15] = (int) (((((long) iArr[15]) & 4294967295L) - (((long) (iArr2[15] + 1)) & 4294967295L)) + jB);
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        y3.a(iArr, iArr2, iArr3);
        if (y3.c(iArr3, f25061a)) {
            b(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        e4.a(16, iArr, iArr2, iArr3);
        if (e4.c(16, iArr3, f25062b)) {
            a(iArr3);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        e4.d(8, iArr, iArr2);
        if (y3.c(iArr2, f25061a)) {
            b(iArr2);
        }
    }

    public static void b(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 19;
        iArr[0] = (int) j10;
        long jB = j10 >> 32;
        if (jB != 0) {
            jB = e4.b(7, iArr, 1);
        }
        iArr[7] = (int) (((((long) iArr[7]) & 4294967295L) - SvgConstantsKt.SPECIFIED_SOLID_COLOR) + jB);
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = y3.a(bigInteger);
        while (true) {
            int[] iArr = f25061a;
            if (!y3.c(iArrA, iArr)) {
                return iArrA;
            }
            y3.e(iArr, iArrA);
        }
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            e4.a(8, iArr, 0, iArr2);
        } else {
            y3.a(iArr, f25061a, iArr2);
            e4.c(8, iArr2, 0);
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrC = y3.c();
        y3.c(iArr, iArr2, iArrC);
        reduce(iArrC, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        y3.d(iArr, iArr2, iArr3);
        if (e4.c(16, iArr3, f25062b)) {
            a(iArr3);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (y3.b(iArr)) {
            y3.d(iArr2);
        } else {
            y3.e(f25061a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i10 = iArr[7];
        e4.a(8, iArr, 8, i10, iArr2, 0);
        int iA = y3.a(19, iArr, iArr2) << 1;
        int i11 = iArr2[7];
        iArr2[7] = e4.b(7, (((i11 >>> 31) - (i10 >>> 31)) + iA) * 19, iArr2) + (Integer.MAX_VALUE & i11);
        if (y3.c(iArr2, f25061a)) {
            b(iArr2);
        }
    }

    public static void reduce27(int i10, int[] iArr) {
        int i11 = iArr[7];
        iArr[7] = e4.b(7, ((i10 << 1) | (i11 >>> 31)) * 19, iArr) + (i11 & Integer.MAX_VALUE);
        if (y3.c(iArr, f25061a)) {
            b(iArr);
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
            long j10 = (((long) iArr3[0]) & 4294967295L) - 19;
            iArr3[0] = (int) j10;
            long jA = j10 >> 32;
            if (jA != 0) {
                jA = e4.a(7, iArr3, 1);
            }
            iArr3[7] = (int) ((4294967295L & ((long) iArr3[7])) + SvgConstantsKt.SPECIFIED_SOLID_COLOR + jA);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(16, iArr, iArr2, iArr3) != 0) {
            long j10 = ((long) iArr3[0]) & 4294967295L;
            int[] iArr4 = f25062b;
            long j11 = j10 + (((long) iArr4[0]) & 4294967295L);
            iArr3[0] = (int) j11;
            long jB = j11 >> 32;
            if (jB != 0) {
                jB = e4.b(8, iArr3, 1);
            }
            long j12 = ((((long) iArr3[8]) & 4294967295L) - 19) + jB;
            iArr3[8] = (int) j12;
            long jA = j12 >> 32;
            if (jA != 0) {
                jA = e4.a(15, iArr3, 9);
            }
            iArr3[15] = (int) ((((long) iArr3[15]) & 4294967295L) + (((long) (iArr4[15] + 1)) & 4294967295L) + jA);
        }
    }

    public static void twice(int[] iArr, int[] iArr2) {
        e4.b(8, iArr, 0, iArr2);
        if (y3.c(iArr2, f25061a)) {
            b(iArr2);
        }
    }
}
