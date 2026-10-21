package bc.org.bouncycastle.math.ec.custom.sec;

import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.w3;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP192K1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25092a = {-4553, -2, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25093b = {20729809, 9106, 1, 0, 0, 0, -9106, -3, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25094c = {-20729809, -9107, -2, -1, -1, -1, 9105, 2};

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (w3.a(iArr, iArr2, iArr3) != 0 || (iArr3[5] == -1 && w3.b(iArr3, f25092a))) {
            e4.a(6, 4553, iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((e4.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && e4.c(12, iArr3, f25093b))) && e4.a(8, f25094c, iArr3) != 0) {
            e4.b(12, iArr3, 8);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(6, iArr, iArr2) != 0 || (iArr2[5] == -1 && w3.b(iArr2, f25092a))) {
            e4.a(6, 4553, iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = w3.a(bigInteger);
        if (iArrA[5] == -1) {
            int[] iArr = f25092a;
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
            e4.c(6, iArr2, w3.a(iArr, f25092a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrC = w3.c();
        w3.c(iArr, iArr2, iArrC);
        reduce(iArrC, iArr3);
    }

    public static void multiplyAddToExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((w3.d(iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && e4.c(12, iArr3, f25093b))) && e4.a(8, f25094c, iArr3) != 0) {
            e4.b(12, iArr3, 8);
        }
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (w3.b(iArr)) {
            w3.d(iArr2);
        } else {
            w3.e(f25092a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        if (w3.a(4553, w3.a(4553, iArr, 6, iArr, 0, iArr2, 0), iArr2, 0) != 0 || (iArr2[5] == -1 && w3.b(iArr2, f25092a))) {
            e4.a(6, 4553, iArr2);
        }
    }

    public static void reduce32(int i10, int[] iArr) {
        if ((i10 == 0 || w3.a(4553, i10, iArr, 0) == 0) && !(iArr[5] == -1 && w3.b(iArr, f25092a))) {
            return;
        }
        e4.a(6, 4553, iArr);
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
            e4.c(6, 4553, iArr3);
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(12, iArr, iArr2, iArr3) == 0 || e4.e(8, f25094c, iArr3) == 0) {
            return;
        }
        e4.a(12, iArr3, 8);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(6, iArr, 0, iArr2) != 0 || (iArr2[5] == -1 && w3.b(iArr2, f25092a))) {
            e4.a(6, 4553, iArr2);
        }
    }
}
