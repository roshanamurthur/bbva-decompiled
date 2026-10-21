package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.v3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP160R2Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25086a = {-21389, -2, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25087b = {457489321, 42778, 1, 0, 0, -42778, -3, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25088c = {-457489321, -42779, -2, -1, -1, 42777, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (v3.a(iArr, iArr2, iArr3) != 0 || (iArr3[4] == -1 && v3.b(iArr3, f25086a))) {
            e4.a(5, 21389, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((e4.a(10, iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && e4.c(10, iArr3, f25087b))) && e4.a(7, f25088c, iArr3) != 0) {
            e4.b(10, iArr3, 7);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(5, iArr, iArr2) != 0 || (iArr2[4] == -1 && v3.b(iArr2, f25086a))) {
            e4.a(5, 21389, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = v3.a(bigInteger);
        if (iArrA[4] == -1) {
            int[] iArr = f25086a;
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
            e4.c(5, iArr2, v3.a(iArr, f25086a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrB = v3.b();
        v3.c(iArr, iArr2, iArrB);
        reduce(iArrB, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((v3.d(iArr, iArr2, iArr3) != 0 || (iArr3[9] == -1 && e4.c(10, iArr3, f25087b))) && e4.a(7, f25088c, iArr3) != 0) {
            e4.b(10, iArr3, 7);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (v3.b(iArr)) {
            v3.d(iArr2);
        } else {
            v3.e(f25086a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (v3.a(21389, v3.a(21389, iArr, 5, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[4] == -1 && v3.b(iArr2, f25086a))) {
            e4.a(5, 21389, iArr2);
        }
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || v3.a(21389, i10, iArr, 0) == 0) && !(iArr[4] == -1 && v3.b(iArr, f25086a))) {
            return;
        }
        e4.a(5, 21389, iArr);
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
            e4.c(5, 21389, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(10, iArr, iArr2, iArr3) == 0 || e4.e(7, f25088c, iArr3) == 0) {
            return;
        }
        e4.a(10, iArr3, 7);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(5, iArr, 0, iArr2) != 0 || (iArr2[4] == -1 && v3.b(iArr2, f25086a))) {
            e4.a(5, 21389, iArr2);
        }
    }
}
