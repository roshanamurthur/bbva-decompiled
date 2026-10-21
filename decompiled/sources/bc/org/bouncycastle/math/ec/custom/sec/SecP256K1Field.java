package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.y3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP256K1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25117a = {-977, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25118b = {954529, 1954, 1, 0, 0, 0, 0, 0, -1954, -3, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25119c = {-954529, -1955, -2, -1, -1, -1, -1, -1, 1953, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (y3.a(iArr, iArr2, iArr3) != 0 || (iArr3[7] == -1 && y3.c(iArr3, f25117a))) {
            e4.a(8, 977, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((e4.a(16, iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && e4.c(16, iArr3, f25118b))) && e4.a(10, f25119c, iArr3) != 0) {
            e4.b(16, iArr3, 10);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(8, iArr, iArr2) != 0 || (iArr2[7] == -1 && y3.c(iArr2, f25117a))) {
            e4.a(8, 977, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = y3.a(bigInteger);
        if (iArrA[7] == -1) {
            int[] iArr = f25117a;
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
            e4.c(8, iArr2, y3.a(iArr, f25117a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrC = y3.c();
        y3.c(iArr, iArr2, iArrC);
        reduce(iArrC, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((y3.d(iArr, iArr2, iArr3) != 0 || (iArr3[15] == -1 && e4.c(16, iArr3, f25118b))) && e4.a(10, f25119c, iArr3) != 0) {
            e4.b(16, iArr3, 10);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (y3.b(iArr)) {
            y3.d(iArr2);
        } else {
            y3.e(f25117a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (y3.a(977, y3.a(977, iArr, 8, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[7] == -1 && y3.c(iArr2, f25117a))) {
            e4.a(8, 977, iArr2);
        }
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || y3.a(977, i10, iArr, 0) == 0) && !(iArr[7] == -1 && y3.c(iArr, f25117a))) {
            return;
        }
        e4.a(8, 977, iArr);
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
            e4.c(8, 977, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(16, iArr, iArr2, iArr3) == 0 || e4.e(10, f25119c, iArr3) == 0) {
            return;
        }
        e4.a(16, iArr3, 10);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(8, iArr, 0, iArr2) != 0 || (iArr2[7] == -1 && y3.c(iArr2, f25117a))) {
            e4.a(8, 977, iArr2);
        }
    }
}
