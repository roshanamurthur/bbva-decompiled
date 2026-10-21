package bc.org.bouncycastle.math.ec.custom.sec;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.c4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP521R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25134a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 511};

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        c4.a(iArr, iArr2, iArr3);
        int i10 = iArr[16];
        int i11 = iArr2[16];
        iArr3[32] = (i10 * i11) + e4.a(16, i10, iArr2, i11, iArr, iArr3, 16);
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        int iA = e4.a(16, iArr, iArr2, iArr3) + iArr[16] + iArr2[16];
        if (iA > 511 || (iA == 511 && e4.b(16, iArr3, f25134a))) {
            iA = (e4.c(16, iArr3) + iA) & 511;
        }
        iArr3[16] = iA;
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        int iD = e4.d(16, iArr, iArr2) + iArr[16];
        if (iD > 511 || (iD == 511 && e4.b(16, iArr2, f25134a))) {
            iD = (e4.c(16, iArr2) + iD) & 511;
        }
        iArr2[16] = iD;
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = e4.a(ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY, bigInteger);
        if (e4.b(17, iArrA, f25134a)) {
            e4.g(17, iArrA);
        }
        return iArrA;
    }

    public static void half(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (e4.a(16, iArr, i10, iArr2) >>> 23) | (i10 >>> 1);
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrA = e4.a(33);
        a(iArr, iArr2, iArrA);
        reduce(iArrA, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (e4.e(17, iArr)) {
            e4.g(17, iArr2);
        } else {
            e4.c(17, f25134a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        int i10 = iArr[32];
        int iA = e4.a(16, iArr, iArr2) + (e4.a(16, iArr, 16, 9, i10, iArr2, 0) >>> 23) + (i10 >>> 9);
        if (iA > 511 || (iA == 511 && e4.b(16, iArr2, f25134a))) {
            iA = (e4.c(16, iArr2) + iA) & 511;
        }
        iArr2[16] = iA;
    }

    public static void reduce23(int[] iArr) {
        int i10 = iArr[16];
        int iB = e4.b(16, i10 >>> 9, iArr) + (i10 & 511);
        if (iB > 511 || (iB == 511 && e4.b(16, iArr, f25134a))) {
            iB = (e4.c(16, iArr) + iB) & 511;
        }
        iArr[16] = iB;
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrA = e4.a(33);
        a(iArr, iArrA);
        reduce(iArrA, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrA = e4.a(33);
        a(iArr, iArrA);
        reduce(iArrA, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            a(iArr2, iArrA);
            reduce(iArrA, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        int iC = (e4.c(16, iArr, iArr2, iArr3) + iArr[16]) - iArr2[16];
        if (iC < 0) {
            iC = (e4.b(16, iArr3) + iC) & 511;
        }
        iArr3[16] = iC;
    }

    public static void twice(int[] iArr, int[] iArr2) {
        int i10 = iArr[16];
        iArr2[16] = (e4.b(16, iArr, i10 << 23, iArr2) | (i10 << 1)) & 511;
    }

    public static void a(int[] iArr, int[] iArr2) {
        c4.a(iArr, iArr2);
        int i10 = iArr[16];
        iArr2[32] = (i10 * i10) + e4.a(16, i10 << 1, iArr, 0, iArr2, 16);
    }
}
