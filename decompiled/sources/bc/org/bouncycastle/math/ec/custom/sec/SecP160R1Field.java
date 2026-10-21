package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP160R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25080a = {Integer.MAX_VALUE, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25081b = {1, 1073741825, 0, 0, 0, -2, -2, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25082c = {-1, -1073741826, -1, -1, -1, 1, 1};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v3.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && v3.b(iArr3, f25080a))) {
            e4.b(5, -2147483647, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((e4.a(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && e4.c(10, iArr3, f25081b))) && e4.a(7, f25082c, iArr3) != 0) {
            e4.b(10, iArr3, 7);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && v3.b(iArr2, f25080a))) {
            e4.b(5, -2147483647, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = v3.a(bigInteger);
        if (iArrA[4] == -1) {
            int[] iArr = f25080a;
            if (v3.b(iArrA, iArr)) {
                v3.d(iArr, iArrA);
            }
        }
        return iArrA;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            e4.a(5, iArr, 0, iArr2);
        } else {
            e4.c(5, iArr2, v3.a(iArr, f25080a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrB = v3.b();
        v3.c(iArr, iArr2, iArrB);
        reduce(iArrB, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((v3.d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && e4.c(10, iArr3, f25081b))) && e4.a(7, f25082c, iArr3) != 0) {
            e4.b(10, iArr3, 7);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (v3.b(iArr)) {
            v3.d(iArr2);
        } else {
            v3.e(f25080a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[5]) & 4294967295L;
        long j11 = ((long) iArr[6]) & 4294967295L;
        long j12 = ((long) iArr[7]) & 4294967295L;
        long j13 = ((long) iArr[8]) & 4294967295L;
        long j14 = ((long) iArr[9]) & 4294967295L;
        long j15 = (((long) iArr[0]) & 4294967295L) + j10 + (j10 << 31);
        iArr2[0] = (int) j15;
        long j16 = (((long) iArr[1]) & 4294967295L) + j11 + (j11 << 31) + (j15 >>> 32);
        iArr2[1] = (int) j16;
        long j17 = (((long) iArr[2]) & 4294967295L) + j12 + (j12 << 31) + (j16 >>> 32);
        iArr2[2] = (int) j17;
        long j18 = (((long) iArr[3]) & 4294967295L) + j13 + (j13 << 31) + (j17 >>> 32);
        iArr2[3] = (int) j18;
        long j19 = (4294967295L & ((long) iArr[4])) + j14 + (j14 << 31) + (j18 >>> 32);
        iArr2[4] = (int) j19;
        reduce32((int) (j19 >>> 32), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || v3.b(-2147483647, i10, iArr, 0) == 0) && !(iArr[4] == -1 && v3.b(iArr, f25080a))) {
            return;
        }
        e4.b(5, -2147483647, iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrB = v3.b();
        v3.c(iArr, iArrB);
        reduce(iArrB, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrB = v3.b();
        v3.c(iArr, iArrB);
        reduce(iArrB, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            v3.c(iArr2, iArrB);
            reduce(iArrB, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v3.e(iArr, iArr2, iArr3) != 0) {
            e4.d(5, -2147483647, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(10, iArr, iArr2, iArr3) == 0 || e4.e(7, f25082c, iArr3) == 0) {
            return;
        }
        e4.a(10, iArr3, 7);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && v3.b(iArr2, f25080a))) {
            e4.b(5, -2147483647, iArr2);
        }
    }
}
