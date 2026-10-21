package mf;

import com.google.crypto.tink.annotations.Alpha;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.util.Arrays;

/* JADX INFO: compiled from: Field25519.java */
/* JADX INFO: loaded from: classes10.dex */
@Alpha
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f83423a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f83424b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f83425c = {67108863, 33554431};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f83426d = {26, 25};

    public static byte[] a(long[] jArr) {
        int[] iArr;
        int i10;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i11 = 0;
        while (true) {
            iArr = f83426d;
            i10 = 2;
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j10 = jArrCopyOf[i12];
                int i13 = iArr[i12 & 1];
                int i14 = -((int) (((j10 >> 31) & j10) >> i13));
                jArrCopyOf[i12] = j10 + ((long) (i14 << i13));
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - ((long) i14);
            }
            long j11 = jArrCopyOf[9];
            int i15 = -((int) (((j11 >> 31) & j11) >> 25));
            jArrCopyOf[9] = j11 + ((long) (i15 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - ((long) (i15 * 19));
            i11++;
        }
        long j12 = jArrCopyOf[0];
        int i16 = -((int) (((j12 >> 31) & j12) >> 26));
        jArrCopyOf[0] = j12 + ((long) (i16 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i16);
        int i17 = 0;
        while (true) {
            iArr2 = f83425c;
            if (i17 >= i10) {
                break;
            }
            int i18 = 0;
            while (i18 < 9) {
                long j13 = jArrCopyOf[i18];
                int i19 = i18 & 1;
                int i20 = (int) (j13 >> iArr[i19]);
                jArrCopyOf[i18] = j13 & ((long) iArr2[i19]);
                i18++;
                jArrCopyOf[i18] = jArrCopyOf[i18] + ((long) i20);
            }
            i17++;
            i10 = 2;
        }
        long j14 = jArrCopyOf[9];
        jArrCopyOf[9] = j14 & 33554431;
        long j15 = jArrCopyOf[0] + ((long) (((int) (j14 >> 25)) * 19));
        jArrCopyOf[0] = j15;
        int i21 = ~((((int) j15) - 67108845) >> 31);
        for (int i22 = 1; i22 < 10; i22++) {
            int i23 = ~(((int) jArrCopyOf[i22]) ^ iArr2[i22 & 1]);
            int i24 = i23 & (i23 << 16);
            int i25 = i24 & (i24 << 8);
            int i26 = i25 & (i25 << 4);
            int i27 = i26 & (i26 << 2);
            i21 &= (i27 & (i27 << 1)) >> 31;
        }
        jArrCopyOf[0] = jArrCopyOf[0] - ((long) (67108845 & i21));
        long j16 = 33554431 & i21;
        jArrCopyOf[1] = jArrCopyOf[1] - j16;
        for (int i28 = 2; i28 < 10; i28 += 2) {
            jArrCopyOf[i28] = jArrCopyOf[i28] - ((long) (67108863 & i21));
            int i29 = i28 + 1;
            jArrCopyOf[i29] = jArrCopyOf[i29] - j16;
        }
        for (int i30 = 0; i30 < 10; i30++) {
            jArrCopyOf[i30] = jArrCopyOf[i30] << f83424b[i30];
        }
        byte[] bArr = new byte[32];
        for (int i31 = 0; i31 < 10; i31++) {
            int i32 = f83423a[i31];
            long j17 = bArr[i32];
            long j18 = jArrCopyOf[i31];
            bArr[i32] = (byte) (j17 | (j18 & 255));
            int i33 = i32 + 1;
            bArr[i33] = (byte) (((long) bArr[i33]) | ((j18 >> 8) & 255));
            int i34 = i32 + 2;
            bArr[i34] = (byte) (((long) bArr[i34]) | ((j18 >> 16) & 255));
            int i35 = i32 + 3;
            bArr[i35] = (byte) (((long) bArr[i35]) | ((j18 >> 24) & 255));
        }
        return bArr;
    }

    public static long[] b(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = f83423a[i10];
            jArr[i10] = ((((((long) (bArr[i11] & 255)) | (((long) (bArr[i11 + 1] & 255)) << 8)) | (((long) (bArr[i11 + 2] & 255)) << 16)) | (((long) (bArr[i11 + 3] & 255)) << 24)) >> f83424b[i10]) & ((long) f83425c[i10 & 1]);
        }
        return jArr;
    }

    public static void c(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        i(jArr3, jArr2);
        i(jArr12, jArr3);
        i(jArr11, jArr12);
        d(jArr4, jArr11, jArr2);
        d(jArr5, jArr4, jArr3);
        i(jArr11, jArr5);
        d(jArr6, jArr11, jArr4);
        i(jArr11, jArr6);
        i(jArr12, jArr11);
        i(jArr11, jArr12);
        i(jArr12, jArr11);
        i(jArr11, jArr12);
        d(jArr7, jArr11, jArr6);
        i(jArr11, jArr7);
        i(jArr12, jArr11);
        for (int i10 = 2; i10 < 10; i10 += 2) {
            i(jArr11, jArr12);
            i(jArr12, jArr11);
        }
        d(jArr8, jArr12, jArr7);
        i(jArr11, jArr8);
        i(jArr12, jArr11);
        for (int i11 = 2; i11 < 20; i11 += 2) {
            i(jArr11, jArr12);
            i(jArr12, jArr11);
        }
        d(jArr11, jArr12, jArr8);
        i(jArr12, jArr11);
        i(jArr11, jArr12);
        for (int i12 = 2; i12 < 10; i12 += 2) {
            i(jArr12, jArr11);
            i(jArr11, jArr12);
        }
        d(jArr9, jArr11, jArr7);
        i(jArr11, jArr9);
        i(jArr12, jArr11);
        for (int i13 = 2; i13 < 50; i13 += 2) {
            i(jArr11, jArr12);
            i(jArr12, jArr11);
        }
        d(jArr10, jArr12, jArr9);
        i(jArr12, jArr10);
        i(jArr11, jArr12);
        for (int i14 = 2; i14 < 100; i14 += 2) {
            i(jArr12, jArr11);
            i(jArr11, jArr12);
        }
        d(jArr12, jArr11, jArr10);
        i(jArr11, jArr12);
        i(jArr12, jArr11);
        for (int i15 = 2; i15 < 50; i15 += 2) {
            i(jArr11, jArr12);
            i(jArr12, jArr11);
        }
        d(jArr11, jArr12, jArr9);
        i(jArr12, jArr11);
        i(jArr11, jArr12);
        i(jArr12, jArr11);
        i(jArr11, jArr12);
        i(jArr12, jArr11);
        d(jArr, jArr12, jArr5);
    }

    public static void d(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        e(jArr4, jArr2, jArr3);
        f(jArr4, jArr);
    }

    public static void e(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j10 = jArr2[0];
        long j11 = jArr3[1] * j10;
        long j12 = jArr2[1];
        long j13 = jArr3[0];
        jArr[1] = (j12 * j13) + j11;
        long j14 = jArr2[1];
        long j15 = jArr3[1];
        jArr[2] = (jArr2[2] * j13) + (jArr3[2] * j10) + (j14 * 2 * j15);
        long j16 = jArr3[2];
        long j17 = jArr2[2];
        jArr[3] = (jArr2[3] * j13) + (jArr3[3] * j10) + (j17 * j15) + (j14 * j16);
        long j18 = jArr3[3];
        long j19 = jArr2[3];
        jArr[4] = (jArr2[4] * j13) + (jArr3[4] * j10) + (((j19 * j15) + (j14 * j18)) * 2) + (j17 * j16);
        long j20 = jArr3[4];
        long j21 = (j14 * j20) + (j19 * j16) + (j17 * j18);
        long j22 = jArr2[4];
        jArr[5] = (jArr2[5] * j13) + (jArr3[5] * j10) + (j22 * j15) + j21;
        long j23 = jArr3[5];
        long j24 = jArr2[5];
        jArr[6] = (jArr2[6] * j13) + (jArr3[6] * j10) + (j22 * j16) + (j17 * j20) + (((j24 * j15) + (j14 * j23) + (j19 * j18)) * 2);
        long j25 = (j24 * j16) + (j17 * j23) + (j22 * j18) + (j19 * j20);
        long j26 = jArr3[6];
        long j27 = (j14 * j26) + j25;
        long j28 = jArr2[6];
        jArr[7] = (jArr2[7] * j13) + (jArr3[7] * j10) + (j28 * j15) + j27;
        long j29 = jArr3[7];
        long j30 = (j14 * j29) + (j24 * j18) + (j19 * j23);
        long j31 = jArr2[7];
        long j32 = (((j31 * j15) + j30) * 2) + (j22 * j20);
        jArr[8] = (jArr2[8] * j13) + (jArr3[8] * j10) + (j28 * j16) + (j17 * j26) + j32;
        long j33 = (j31 * j16) + (j17 * j29) + (j28 * j18) + (j19 * j26) + (j24 * j20) + (j22 * j23);
        long j34 = jArr3[8];
        long j35 = (j14 * j34) + j33;
        long j36 = jArr2[8];
        jArr[9] = (jArr2[9] * j13) + (j10 * jArr3[9]) + (j36 * j15) + j35;
        long j37 = (j31 * j18) + (j19 * j29) + (j24 * j23);
        long j38 = jArr3[9];
        long j39 = jArr2[9];
        long j40 = j22 * j26;
        jArr[10] = (j36 * j16) + (j17 * j34) + (j28 * j20) + j40 + (((j15 * j39) + (j14 * j38) + j37) * 2);
        long j41 = j17 * j38;
        long j42 = j16 * j39;
        jArr[11] = j42 + j41 + (j36 * j18) + (j19 * j34) + (j31 * j20) + (j22 * j29) + (j28 * j23) + (j24 * j26);
        long j43 = j19 * j38;
        long j44 = j18 * j39;
        long j45 = j36 * j20;
        jArr[12] = j45 + (j22 * j34) + ((j44 + j43 + (j31 * j23) + (j24 * j29)) * 2) + (j28 * j26);
        long j46 = j22 * j38;
        long j47 = j20 * j39;
        jArr[13] = j47 + j46 + (j36 * j23) + (j24 * j34) + (j31 * j26) + (j28 * j29);
        long j48 = j23 * j39;
        long j49 = j36 * j26;
        jArr[14] = j49 + (j28 * j34) + ((j48 + (j24 * j38) + (j31 * j29)) * 2);
        long j50 = j28 * j38;
        long j51 = j26 * j39;
        jArr[15] = j51 + j50 + (j36 * j29) + (j31 * j34);
        jArr[16] = (((j29 * j39) + (j31 * j38)) * 2) + (j36 * j34);
        jArr[17] = (j34 * j39) + (j36 * j38);
        jArr[18] = j39 * 2 * j38;
    }

    public static void f(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        h(jArr);
        g(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void g(long[] jArr) {
        jArr[10] = 0;
        int i10 = 0;
        while (i10 < 10) {
            long j10 = jArr[i10];
            long j11 = j10 / SvgConstantsKt.SPECIFIED_STOP_COLOR;
            jArr[i10] = j10 - (j11 << 26);
            int i11 = i10 + 1;
            long j12 = jArr[i11] + j11;
            jArr[i11] = j12;
            long j13 = j12 / SvgConstantsKt.SPECIFIED_VISIBILITY;
            jArr[i11] = j12 - (j13 << 25);
            i10 += 2;
            jArr[i10] = jArr[i10] + j13;
        }
        long j14 = jArr[0];
        long j15 = jArr[10];
        long j16 = j14 + (j15 << 4);
        jArr[0] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[0] = j17;
        long j18 = j17 + j15;
        jArr[0] = j18;
        jArr[10] = 0;
        long j19 = j18 / SvgConstantsKt.SPECIFIED_STOP_COLOR;
        jArr[0] = j18 - (j19 << 26);
        jArr[1] = jArr[1] + j19;
    }

    public static void h(long[] jArr) {
        long j10 = jArr[8];
        long j11 = jArr[18];
        long j12 = j10 + (j11 << 4);
        jArr[8] = j12;
        long j13 = j12 + (j11 << 1);
        jArr[8] = j13;
        jArr[8] = j13 + j11;
        long j14 = jArr[7];
        long j15 = jArr[17];
        long j16 = j14 + (j15 << 4);
        jArr[7] = j16;
        long j17 = j16 + (j15 << 1);
        jArr[7] = j17;
        jArr[7] = j17 + j15;
        long j18 = jArr[6];
        long j19 = jArr[16];
        long j20 = j18 + (j19 << 4);
        jArr[6] = j20;
        long j21 = j20 + (j19 << 1);
        jArr[6] = j21;
        jArr[6] = j21 + j19;
        long j22 = jArr[5];
        long j23 = jArr[15];
        long j24 = j22 + (j23 << 4);
        jArr[5] = j24;
        long j25 = j24 + (j23 << 1);
        jArr[5] = j25;
        jArr[5] = j25 + j23;
        long j26 = jArr[4];
        long j27 = jArr[14];
        long j28 = j26 + (j27 << 4);
        jArr[4] = j28;
        long j29 = j28 + (j27 << 1);
        jArr[4] = j29;
        jArr[4] = j29 + j27;
        long j30 = jArr[3];
        long j31 = jArr[13];
        long j32 = j30 + (j31 << 4);
        jArr[3] = j32;
        long j33 = j32 + (j31 << 1);
        jArr[3] = j33;
        jArr[3] = j33 + j31;
        long j34 = jArr[2];
        long j35 = jArr[12];
        long j36 = j34 + (j35 << 4);
        jArr[2] = j36;
        long j37 = j36 + (j35 << 1);
        jArr[2] = j37;
        jArr[2] = j37 + j35;
        long j38 = jArr[1];
        long j39 = jArr[11];
        long j40 = j38 + (j39 << 4);
        jArr[1] = j40;
        long j41 = j40 + (j39 << 1);
        jArr[1] = j41;
        jArr[1] = j41 + j39;
        long j42 = jArr[0];
        long j43 = jArr[10];
        long j44 = j42 + (j43 << 4);
        jArr[0] = j44;
        long j45 = j44 + (j43 << 1);
        jArr[0] = j45;
        jArr[0] = j45 + j43;
    }

    public static void i(long[] jArr, long[] jArr2) {
        long j10 = jArr2[0];
        long j11 = jArr2[0];
        long j12 = j11 * 2;
        long j13 = jArr2[1];
        long j14 = jArr2[2] * j11;
        long j15 = jArr2[2];
        long j16 = jArr2[3] * j11;
        long j17 = jArr2[3];
        long j18 = j12 * jArr2[4];
        long j19 = jArr2[4];
        long j20 = jArr2[5] * j11;
        long j21 = (jArr2[6] * j11) + (j15 * j19) + (j17 * j17);
        long j22 = jArr2[5];
        long j23 = jArr2[6];
        long j24 = (jArr2[8] * j11) + (j15 * j23);
        long j25 = jArr2[7];
        long j26 = jArr2[8];
        long j27 = jArr2[9];
        f(new long[]{j10 * j10, jArr2[1] * j12, (j14 + (j13 * j13)) * 2, (j16 + (j13 * j15)) * 2, j18 + (j13 * 4 * j17) + (j15 * j15), (j20 + (j13 * j19) + (j15 * j17)) * 2, ((j13 * 2 * j22) + j21) * 2, ((jArr2[7] * j11) + (j13 * j23) + (j15 * j22) + (j17 * j19)) * 2, (((((j17 * j22) + (j13 * j25)) * 2) + j24) * 2) + (j19 * j19), ((j11 * jArr2[9]) + (j13 * j26) + (j15 * j25) + (j17 * j23) + (j19 * j22)) * 2, ((((j13 * j27) + (j17 * j25)) * 2) + (j15 * j26) + (j19 * j23) + (j22 * j22)) * 2, ((j15 * j27) + (j17 * j26) + (j19 * j25) + (j22 * j23)) * 2, (((((j17 * j27) + (j22 * j25)) * 2) + (j19 * j26)) * 2) + (j23 * j23), ((j19 * j27) + (j22 * j26) + (j23 * j25)) * 2, ((j22 * 2 * j27) + (j23 * j26) + (j25 * j25)) * 2, ((j23 * j27) + (j25 * j26)) * 2, (j25 * 4 * j27) + (j26 * j26), j26 * 2 * j27, 2 * j27 * j27}, jArr);
    }

    public static void j(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] - jArr3[i10];
        }
    }

    public static void k(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i10 = 0; i10 < 10; i10++) {
            jArr[i10] = jArr2[i10] + jArr3[i10];
        }
    }
}
