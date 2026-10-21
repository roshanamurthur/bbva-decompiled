package bc.org.bouncycastle.math.ec.custom.sec;

import androidx.camera.camera2.internal.n1;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.a4;
import com.vasco.digipass.sdk.utils.utilities.obfuscated.e4;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class SecP384R1Field {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f25128a = {-1, 0, 0, -1, -2, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f25129b = {1, -2, 0, 2, 0, -2, 0, 2, 1, 0, 0, 0, -2, 1, 0, -2, -3, -1, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f25130c = {-1, 1, -1, -3, -1, 1, -1, -3, -2, -1, -1, -1, 1, -2, -1, 1, 2};

    public static void a(int[] iArr) {
        long j10 = (((long) iArr[0]) & 4294967295L) + 1;
        iArr[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - 1) + (j10 >> 32);
        iArr[1] = (int) j11;
        long j12 = j11 >> 32;
        if (j12 != 0) {
            long j13 = j12 + (((long) iArr[2]) & 4294967295L);
            iArr[2] = (int) j13;
            j12 = j13 >> 32;
        }
        long j14 = (((long) iArr[3]) & 4294967295L) + 1 + j12;
        iArr[3] = (int) j14;
        long j15 = (4294967295L & ((long) iArr[4])) + 1 + (j14 >> 32);
        iArr[4] = (int) j15;
        if ((j15 >> 32) != 0) {
            e4.b(12, iArr, 5);
        }
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.a(12, iArr, iArr2, iArr3) != 0 || (iArr3[11] == -1 && e4.c(12, iArr3, f25128a))) {
            a(iArr3);
        }
    }

    public static void addExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if ((e4.a(24, iArr, iArr2, iArr3) != 0 || (iArr3[23] == -1 && e4.c(24, iArr3, f25129b))) && e4.a(17, f25130c, iArr3) != 0) {
            e4.b(24, iArr3, 17);
        }
    }

    public static void addOne(int[] iArr, int[] iArr2) {
        if (e4.d(12, iArr, iArr2) != 0 || (iArr2[11] == -1 && e4.c(12, iArr2, f25128a))) {
            a(iArr2);
        }
    }

    public static int[] fromBigInteger(BigInteger bigInteger) {
        int[] iArrA = e4.a(BluetoothState.REQUEST_CONNECT_DEVICE, bigInteger);
        if (iArrA[11] == -1) {
            int[] iArr = f25128a;
            if (e4.c(12, iArrA, iArr)) {
                e4.e(12, iArr, iArrA);
            }
        }
        return iArrA;
    }

    public static void half(int[] iArr, int[] iArr2) {
        if ((iArr[0] & 1) == 0) {
            e4.a(12, iArr, 0, iArr2);
        } else {
            e4.c(12, iArr2, e4.a(12, iArr, f25128a, iArr2));
        }
    }

    public static void multiply(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrA = e4.a(24);
        a4.a(iArr, iArr2, iArrA);
        reduce(iArrA, iArr3);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        if (e4.e(12, iArr)) {
            e4.g(12, iArr2);
        } else {
            e4.c(12, f25128a, iArr, iArr2);
        }
    }

    public static void reduce(int[] iArr, int[] iArr2) {
        long j10 = ((long) iArr[16]) & 4294967295L;
        long j11 = ((long) iArr[17]) & 4294967295L;
        long j12 = ((long) iArr[18]) & 4294967295L;
        long j13 = ((long) iArr[19]) & 4294967295L;
        long j14 = ((long) iArr[20]) & 4294967295L;
        long j15 = ((long) iArr[21]) & 4294967295L;
        long j16 = ((long) iArr[22]) & 4294967295L;
        long j17 = ((long) iArr[23]) & 4294967295L;
        long j18 = ((((long) iArr[12]) & 4294967295L) + j14) - 1;
        long j19 = (((long) iArr[13]) & 4294967295L) + j16;
        long j20 = (((long) iArr[14]) & 4294967295L) + j16 + j17;
        long j21 = (((long) iArr[15]) & 4294967295L) + j17;
        long j22 = j11 + j15;
        long j23 = j15 - j17;
        long j24 = j16 - j17;
        long j25 = j18 + j23;
        long j26 = (((long) iArr[0]) & 4294967295L) + j25;
        iArr2[0] = (int) j26;
        long jB = a.b(((long) iArr[1]) & 4294967295L, j17, j18, j19, j26 >> 32);
        iArr2[1] = (int) jB;
        long j27 = (((((long) iArr[2]) & 4294967295L) - j15) - j19) + j20 + (jB >> 32);
        iArr2[2] = (int) j27;
        long j28 = ((((long) iArr[3]) & 4294967295L) - j20) + j21 + j25 + (j27 >> 32);
        iArr2[3] = (int) j28;
        long j29 = (((((((long) iArr[4]) & 4294967295L) + j10) + j15) + j19) - j21) + j25 + (j28 >> 32);
        iArr2[4] = (int) j29;
        long j30 = ((((long) iArr[5]) & 4294967295L) - j10) + j19 + j20 + j22 + (j29 >> 32);
        iArr2[5] = (int) j30;
        long j31 = (((((long) iArr[6]) & 4294967295L) + j12) - j11) + j20 + j21 + (j30 >> 32);
        iArr2[6] = (int) j31;
        long j32 = ((((((long) iArr[7]) & 4294967295L) + j10) + j13) - j12) + j21 + (j31 >> 32);
        iArr2[7] = (int) j32;
        long j33 = (((((((long) iArr[8]) & 4294967295L) + j10) + j11) + j14) - j13) + (j32 >> 32);
        iArr2[8] = (int) j33;
        long jB2 = a.b(((long) iArr[9]) & 4294967295L, j12, j14, j22, j33 >> 32);
        iArr2[9] = (int) jB2;
        long j34 = ((((((long) iArr[10]) & 4294967295L) + j12) + j13) - j23) + j24 + (jB2 >> 32);
        iArr2[10] = (int) j34;
        long jD = n1.d(((long) iArr[11]) & 4294967295L, j13, j14, j24, j34 >> 32);
        iArr2[11] = (int) jD;
        reduce32((int) ((jD >> 32) + 1), iArr2);
    }

    public static void reduce32(int i10, int[] iArr) {
        long j10;
        if (i10 != 0) {
            long j11 = ((long) i10) & 4294967295L;
            long j12 = (((long) iArr[0]) & 4294967295L) + j11;
            iArr[0] = (int) j12;
            long j13 = ((((long) iArr[1]) & 4294967295L) - j11) + (j12 >> 32);
            iArr[1] = (int) j13;
            long j14 = j13 >> 32;
            if (j14 != 0) {
                long j15 = j14 + (((long) iArr[2]) & 4294967295L);
                iArr[2] = (int) j15;
                j14 = j15 >> 32;
            }
            long j16 = (((long) iArr[3]) & 4294967295L) + j11 + j14;
            iArr[3] = (int) j16;
            long j17 = (4294967295L & ((long) iArr[4])) + j11 + (j16 >> 32);
            iArr[4] = (int) j17;
            j10 = j17 >> 32;
        } else {
            j10 = 0;
        }
        if ((j10 == 0 || e4.b(12, iArr, 5) == 0) && !(iArr[11] == -1 && e4.c(12, iArr, f25128a))) {
            return;
        }
        a(iArr);
    }

    public static void square(int[] iArr, int[] iArr2) {
        int[] iArrA = e4.a(24);
        a4.a(iArr, iArrA);
        reduce(iArrA, iArr2);
    }

    public static void squareN(int[] iArr, int i10, int[] iArr2) {
        int[] iArrA = e4.a(24);
        a4.a(iArr, iArrA);
        reduce(iArrA, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            }
            a4.a(iArr2, iArrA);
            reduce(iArrA, iArr2);
        }
    }

    public static void subtract(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(12, iArr, iArr2, iArr3) != 0) {
            long j10 = (((long) iArr3[0]) & 4294967295L) - 1;
            iArr3[0] = (int) j10;
            long j11 = (((long) iArr3[1]) & 4294967295L) + 1 + (j10 >> 32);
            iArr3[1] = (int) j11;
            long j12 = j11 >> 32;
            if (j12 != 0) {
                long j13 = j12 + (((long) iArr3[2]) & 4294967295L);
                iArr3[2] = (int) j13;
                j12 = j13 >> 32;
            }
            long j14 = ((((long) iArr3[3]) & 4294967295L) - 1) + j12;
            iArr3[3] = (int) j14;
            long j15 = ((4294967295L & ((long) iArr3[4])) - 1) + (j14 >> 32);
            iArr3[4] = (int) j15;
            if ((j15 >> 32) != 0) {
                e4.a(12, iArr3, 5);
            }
        }
    }

    public static void subtractExt(int[] iArr, int[] iArr2, int[] iArr3) {
        if (e4.c(24, iArr, iArr2, iArr3) == 0 || e4.e(17, f25130c, iArr3) == 0) {
            return;
        }
        e4.a(24, iArr3, 17);
    }

    public static void twice(int[] iArr, int[] iArr2) {
        if (e4.b(12, iArr, 0, iArr2) != 0 || (iArr2[11] == -1 && e4.c(12, iArr2, f25128a))) {
            a(iArr2);
        }
    }
}
