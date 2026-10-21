package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.x3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP224K1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25104a = {-6803, -2, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25105b = {46280809, 13606, 1, 0, 0, 0, 0, -13606, -3, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25106c = {-46280809, -13607, -2, -1, -1, -1, -1, 13605, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (x3.a(iArr, iArr2, iArr3) != 0 || (iArr3[6] == -1 && x3.c(iArr3, f25104a))) {
            e4.a(7, 6803, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((e4.a(14, iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && e4.c(14, iArr3, f25105b))) && e4.a(9, f25106c, iArr3) != 0) {
            e4.b(14, iArr3, 9);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(7, iArr, iArr2) != 0 || (iArr2[6] == -1 && x3.c(iArr2, f25104a))) {
            e4.a(7, 6803, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = x3.a(bigInteger);
        if (iArrA[6] == -1 && x3.c(iArrA, f25104a)) {
            e4.a(7, 6803, iArrA);
        }
        return iArrA;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            e4.a(7, iArr, 0, iArr2);
        } else {
            e4.c(7, iArr2, x3.a(iArr, f25104a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrB = x3.b();
        x3.c(iArr, iArr2, iArrB);
        reduce(iArrB, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((x3.d(iArr, iArr2, iArr3) != 0 || (iArr3[13] == -1 && e4.c(14, iArr3, f25105b))) && e4.a(9, f25106c, iArr3) != 0) {
            e4.b(14, iArr3, 9);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (x3.b(iArr)) {
            x3.d(iArr2);
        } else {
            x3.e(f25104a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (x3.a(6803, x3.a(6803, iArr, 7, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[6] == -1 && x3.c(iArr2, f25104a))) {
            e4.a(7, 6803, iArr2);
        }
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || x3.a(6803, i10, iArr, 0) == 0) && !(iArr[6] == -1 && x3.c(iArr, f25104a))) {
            return;
        }
        e4.a(7, 6803, iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrB = x3.b();
        x3.d(iArr, iArrB);
        reduce(iArrB, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrB = x3.b();
        x3.d(iArr, iArrB);
        reduce(iArrB, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            x3.d(iArr2, iArrB);
            reduce(iArrB, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (x3.e(iArr, iArr2, iArr3) != 0) {
            e4.c(7, 6803, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(14, iArr, iArr2, iArr3) == 0 || e4.e(9, f25106c, iArr3) == 0) {
            return;
        }
        e4.a(14, iArr3, 9);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(7, iArr, 0, iArr2) != 0 || (iArr2[6] == -1 && x3.c(iArr2, f25104a))) {
            e4.a(7, 6803, iArr2);
        }
    }
}
