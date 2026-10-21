package org.bouncycastle.math.ec.rfc7748;

import ai.a;
import androidx.camera.camera2.internal.n1;

/* JADX INFO: loaded from: classes13.dex */
public abstract class X448Field {
    public static final int SIZE = 16;

    public static void a(byte[] bArr, int i10, int[] iArr, int i11) {
        int i12 = (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16) | (bArr[i10 + 3] << 24);
        int i13 = ((bArr[i10 + 6] & 255) << 16) | (bArr[i10 + 4] & 255) | ((bArr[i10 + 5] & 255) << 8);
        iArr[i11] = 268435455 & i12;
        iArr[i11 + 1] = (i13 << 4) | (i12 >>> 28);
    }

    public static void add(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i10 = 0; i10 < 16; i10++) {
            iArr3[i10] = iArr[i10] + iArr2[i10];
        }
    }

    public static void addOne(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void b(byte[] bArr, int i10, int[] iArr, int i11) {
        int i12 = iArr[i10];
        int i13 = iArr[i10 + 1];
        int i14 = (i13 << 28) | i12;
        bArr[i11] = (byte) i14;
        bArr[i11 + 1] = (byte) (i14 >>> 8);
        bArr[i11 + 2] = (byte) (i14 >>> 16);
        bArr[i11 + 3] = (byte) (i14 >>> 24);
        bArr[i11 + 4] = (byte) (i13 >>> 4);
        bArr[i11 + 5] = (byte) (i13 >>> 12);
        bArr[i11 + 6] = (byte) (i13 >>> 20);
    }

    public static void c(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        sqr(iArr, iArrCreate);
        mul(iArr, iArrCreate, iArrCreate);
        int[] iArrCreate2 = create();
        sqr(iArrCreate, iArrCreate2);
        mul(iArr, iArrCreate2, iArrCreate2);
        int[] iArrCreate3 = create();
        sqr(iArrCreate2, 3, iArrCreate3);
        mul(iArrCreate2, iArrCreate3, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, 3, iArrCreate4);
        mul(iArrCreate2, iArrCreate4, iArrCreate4);
        int[] iArrCreate5 = create();
        sqr(iArrCreate4, 9, iArrCreate5);
        mul(iArrCreate4, iArrCreate5, iArrCreate5);
        int[] iArrCreate6 = create();
        sqr(iArrCreate5, iArrCreate6);
        mul(iArr, iArrCreate6, iArrCreate6);
        int[] iArrCreate7 = create();
        sqr(iArrCreate6, 18, iArrCreate7);
        mul(iArrCreate5, iArrCreate7, iArrCreate7);
        int[] iArrCreate8 = create();
        sqr(iArrCreate7, 37, iArrCreate8);
        mul(iArrCreate7, iArrCreate8, iArrCreate8);
        int[] iArrCreate9 = create();
        sqr(iArrCreate8, 37, iArrCreate9);
        mul(iArrCreate7, iArrCreate9, iArrCreate9);
        int[] iArrCreate10 = create();
        sqr(iArrCreate9, 111, iArrCreate10);
        mul(iArrCreate9, iArrCreate10, iArrCreate10);
        int[] iArrCreate11 = create();
        sqr(iArrCreate10, iArrCreate11);
        mul(iArr, iArrCreate11, iArrCreate11);
        int[] iArrCreate12 = create();
        sqr(iArrCreate11, 223, iArrCreate12);
        mul(iArrCreate12, iArrCreate10, iArr2);
    }

    public static void carry(int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        int i20 = iArr[10];
        int i21 = iArr[11];
        int i22 = iArr[12];
        int i23 = iArr[13];
        int i24 = i11 + (i10 >>> 28);
        int i25 = i15 + (i14 >>> 28);
        int i26 = i19 + (i18 >>> 28);
        int i27 = i23 + (i22 >>> 28);
        int i28 = i12 + (i24 >>> 28);
        int i29 = i16 + (i25 >>> 28);
        int i30 = i20 + (i26 >>> 28);
        int i31 = iArr[14] + (i27 >>> 28);
        int i32 = i13 + (i28 >>> 28);
        int i33 = i17 + (i29 >>> 28);
        int i34 = i21 + (i30 >>> 28);
        int i35 = iArr[15] + (i31 >>> 28);
        int i36 = i35 >>> 28;
        int i37 = (i10 & 268435455) + i36;
        int i38 = (i14 & 268435455) + (i32 >>> 28);
        int i39 = (i18 & 268435455) + i36 + (i33 >>> 28);
        int i40 = (i22 & 268435455) + (i34 >>> 28);
        iArr[0] = i37 & 268435455;
        iArr[1] = (i24 & 268435455) + (i37 >>> 28);
        iArr[2] = i28 & 268435455;
        iArr[3] = i32 & 268435455;
        iArr[4] = i38 & 268435455;
        iArr[5] = (i25 & 268435455) + (i38 >>> 28);
        iArr[6] = i29 & 268435455;
        iArr[7] = i33 & 268435455;
        iArr[8] = i39 & 268435455;
        iArr[9] = (i26 & 268435455) + (i39 >>> 28);
        iArr[10] = i30 & 268435455;
        iArr[11] = i34 & 268435455;
        iArr[12] = i40 & 268435455;
        iArr[13] = (i27 & 268435455) + (i40 >>> 28);
        iArr[14] = i31 & 268435455;
        iArr[15] = i35 & 268435455;
    }

    public static void cmov(int i10, int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = i12 + i13;
            int i15 = iArr2[i14];
            iArr2[i14] = i15 ^ ((iArr[i11 + i13] ^ i15) & i10);
        }
    }

    public static void cnegate(int i10, int[] iArr) {
        int[] iArrCreate = create();
        sub(iArrCreate, iArr, iArrCreate);
        cmov(-i10, iArrCreate, 0, iArr, 0);
    }

    public static void copy(int[] iArr, int i10, int[] iArr2, int i11) {
        for (int i12 = 0; i12 < 16; i12++) {
            iArr2[i11 + i12] = iArr[i10 + i12];
        }
    }

    public static int[] create() {
        return new int[16];
    }

    public static int[] createTable(int i10) {
        return new int[i10 * 16];
    }

    public static void cswap(int i10, int[] iArr, int[] iArr2) {
        int i11 = 0 - i10;
        for (int i12 = 0; i12 < 16; i12++) {
            int i13 = iArr[i12];
            int i14 = iArr2[i12];
            int i15 = (i13 ^ i14) & i11;
            iArr[i12] = i13 ^ i15;
            iArr2[i12] = i14 ^ i15;
        }
    }

    public static void d(int i10, int[] iArr) {
        int i11;
        int i12 = iArr[15];
        int i13 = i12 & 268435455;
        long j10 = (i12 >>> 28) + i10;
        int i14 = 0;
        long j11 = j10;
        while (true) {
            if (i14 >= 8) {
                break;
            }
            long j12 = j11 + (4294967295L & ((long) iArr[i14]));
            iArr[i14] = ((int) j12) & 268435455;
            j11 = j12 >> 28;
            i14++;
        }
        long j13 = j11 + j10;
        for (i11 = 8; i11 < 15; i11++) {
            long j14 = j13 + (((long) iArr[i11]) & 4294967295L);
            iArr[i11] = ((int) j14) & 268435455;
            j13 = j14 >> 28;
        }
        iArr[15] = i13 + ((int) j13);
    }

    public static void decode(byte[] bArr, int i10, int[] iArr) {
        a(bArr, i10, iArr, 0);
        a(bArr, i10 + 7, iArr, 2);
        a(bArr, i10 + 14, iArr, 4);
        a(bArr, i10 + 21, iArr, 6);
        a(bArr, i10 + 28, iArr, 8);
        a(bArr, i10 + 35, iArr, 10);
        a(bArr, i10 + 42, iArr, 12);
        a(bArr, i10 + 49, iArr, 14);
    }

    public static void encode(int[] iArr, byte[] bArr, int i10) {
        b(bArr, 0, iArr, i10);
        b(bArr, 2, iArr, i10 + 7);
        b(bArr, 4, iArr, i10 + 14);
        b(bArr, 6, iArr, i10 + 21);
        b(bArr, 8, iArr, i10 + 28);
        b(bArr, 10, iArr, i10 + 35);
        b(bArr, 12, iArr, i10 + 42);
        b(bArr, 14, iArr, i10 + 49);
    }

    public static void inv(int[] iArr, int[] iArr2) {
        int[] iArrCreate = create();
        c(iArr, iArrCreate);
        sqr(iArrCreate, 2, iArrCreate);
        mul(iArrCreate, iArr, iArr2);
    }

    public static int isZero(int[] iArr) {
        int i10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            i10 |= iArr[i11];
        }
        return (((i10 >>> 1) | (i10 & 1)) - 1) >> 31;
    }

    public static boolean isZeroVar(int[] iArr) {
        return isZero(iArr) != 0;
    }

    public static void mul(int[] iArr, int i10, int[] iArr2) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i20 = iArr[9];
        int i21 = iArr[10];
        int i22 = iArr[11];
        int i23 = iArr[12];
        int i24 = iArr[13];
        int i25 = iArr[14];
        int i26 = iArr[15];
        long j10 = i12;
        long j11 = i10;
        long j12 = j10 * j11;
        int i27 = ((int) j12) & 268435455;
        long j13 = ((long) i16) * j11;
        int i28 = ((int) j13) & 268435455;
        long j14 = ((long) i20) * j11;
        long j15 = ((long) i24) * j11;
        long j16 = (((long) i13) * j11) + (j12 >>> 28);
        iArr2[2] = ((int) j16) & 268435455;
        long j17 = (((long) i17) * j11) + (j13 >>> 28);
        iArr2[6] = ((int) j17) & 268435455;
        long j18 = (((long) i21) * j11) + (j14 >>> 28);
        iArr2[10] = ((int) j18) & 268435455;
        long j19 = (((long) i25) * j11) + (j15 >>> 28);
        iArr2[14] = ((int) j19) & 268435455;
        long j20 = (((long) i14) * j11) + (j16 >>> 28);
        iArr2[3] = ((int) j20) & 268435455;
        long j21 = j20 >>> 28;
        long j22 = (((long) i18) * j11) + (j17 >>> 28);
        iArr2[7] = ((int) j22) & 268435455;
        long j23 = (((long) i22) * j11) + (j18 >>> 28);
        iArr2[11] = ((int) j23) & 268435455;
        long j24 = j23 >>> 28;
        long j25 = (((long) i26) * j11) + (j19 >>> 28);
        iArr2[15] = ((int) j25) & 268435455;
        long j26 = j25 >>> 28;
        long j27 = (((long) i15) * j11) + j21;
        iArr2[4] = ((int) j27) & 268435455;
        long j28 = j27 >>> 28;
        long j29 = (((long) i19) * j11) + (j22 >>> 28) + j26;
        iArr2[8] = ((int) j29) & 268435455;
        long j30 = j29 >>> 28;
        long j31 = (((long) i23) * j11) + j24;
        iArr2[12] = ((int) j31) & 268435455;
        long j32 = j31 >>> 28;
        long j33 = (((long) i11) * j11) + j26;
        iArr2[0] = ((int) j33) & 268435455;
        iArr2[1] = i27 + ((int) (j33 >>> 28));
        iArr2[5] = i28 + ((int) j28);
        iArr2[9] = (((int) j14) & 268435455) + ((int) j30);
        iArr2[13] = (((int) j15) & 268435455) + ((int) j32);
    }

    public static void negate(int[] iArr, int[] iArr2) {
        sub(create(), iArr, iArr2);
    }

    public static void normalize(int[] iArr) {
        d(1, iArr);
        d(-1, iArr);
    }

    public static void one(int[] iArr) {
        iArr[0] = 1;
        for (int i10 = 1; i10 < 16; i10++) {
            iArr[i10] = 0;
        }
    }

    public static void sqr(int[] iArr, int i10, int[] iArr2) {
        sqr(iArr, iArr2);
        while (true) {
            i10--;
            if (i10 <= 0) {
                return;
            } else {
                sqr(iArr2, iArr2);
            }
        }
    }

    public static boolean sqrtRatioVar(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] iArrCreate = create();
        int[] iArrCreate2 = create();
        sqr(iArr, iArrCreate);
        mul(iArrCreate, iArr2, iArrCreate);
        sqr(iArrCreate, iArrCreate2);
        mul(iArrCreate, iArr, iArrCreate);
        mul(iArrCreate2, iArr, iArrCreate2);
        mul(iArrCreate2, iArr2, iArrCreate2);
        int[] iArrCreate3 = create();
        c(iArrCreate2, iArrCreate3);
        mul(iArrCreate3, iArrCreate, iArrCreate3);
        int[] iArrCreate4 = create();
        sqr(iArrCreate3, iArrCreate4);
        mul(iArrCreate4, iArr2, iArrCreate4);
        sub(iArr, iArrCreate4, iArrCreate4);
        normalize(iArrCreate4);
        if (!isZeroVar(iArrCreate4)) {
            return false;
        }
        copy(iArrCreate3, 0, iArr3, 0);
        return true;
    }

    public static void sub(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        int i20 = iArr[10];
        int i21 = iArr[11];
        int i22 = iArr[12];
        int i23 = iArr[13];
        int i24 = iArr[14];
        int i25 = iArr[15];
        int i26 = iArr2[0];
        int i27 = iArr2[1];
        int i28 = iArr2[2];
        int i29 = iArr2[3];
        int i30 = iArr2[4];
        int i31 = iArr2[5];
        int i32 = iArr2[6];
        int i33 = iArr2[7];
        int i34 = iArr2[8];
        int i35 = iArr2[9];
        int i36 = iArr2[10];
        int i37 = iArr2[11];
        int i38 = iArr2[12];
        int i39 = iArr2[13];
        int i40 = (i11 + 536870910) - i27;
        int i41 = (i15 + 536870910) - i31;
        int i42 = (i19 + 536870910) - i35;
        int i43 = (i23 + 536870910) - i39;
        int i44 = ((i12 + 536870910) - i28) + (i40 >>> 28);
        int i45 = ((i16 + 536870910) - i32) + (i41 >>> 28);
        int i46 = ((i20 + 536870910) - i36) + (i42 >>> 28);
        int i47 = ((i24 + 536870910) - iArr2[14]) + (i43 >>> 28);
        int i48 = ((i13 + 536870910) - i29) + (i44 >>> 28);
        int i49 = ((i17 + 536870910) - i33) + (i45 >>> 28);
        int i50 = ((i21 + 536870910) - i37) + (i46 >>> 28);
        int i51 = ((i25 + 536870910) - iArr2[15]) + (i47 >>> 28);
        int i52 = i51 >>> 28;
        int i53 = ((i10 + 536870910) - i26) + i52;
        int i54 = ((i14 + 536870910) - i30) + (i48 >>> 28);
        int i55 = ((i18 + 536870908) - i34) + i52 + (i49 >>> 28);
        int i56 = ((i22 + 536870910) - i38) + (i50 >>> 28);
        iArr3[0] = i53 & 268435455;
        iArr3[1] = (i40 & 268435455) + (i53 >>> 28);
        iArr3[2] = i44 & 268435455;
        iArr3[3] = i48 & 268435455;
        iArr3[4] = i54 & 268435455;
        iArr3[5] = (i41 & 268435455) + (i54 >>> 28);
        iArr3[6] = i45 & 268435455;
        iArr3[7] = i49 & 268435455;
        iArr3[8] = i55 & 268435455;
        iArr3[9] = (i42 & 268435455) + (i55 >>> 28);
        iArr3[10] = i46 & 268435455;
        iArr3[11] = i50 & 268435455;
        iArr3[12] = i56 & 268435455;
        iArr3[13] = (i43 & 268435455) + (i56 >>> 28);
        iArr3[14] = i47 & 268435455;
        iArr3[15] = i51 & 268435455;
    }

    public static void subOne(int[] iArr) {
        int[] iArrCreate = create();
        iArrCreate[0] = 1;
        sub(iArr, iArrCreate, iArr);
    }

    public static void zero(int[] iArr) {
        for (int i10 = 0; i10 < 16; i10++) {
            iArr[i10] = 0;
        }
    }

    public static void addOne(int[] iArr, int i10) {
        iArr[i10] = iArr[i10] + 1;
    }

    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        int i20 = iArr[10];
        int i21 = iArr[11];
        int i22 = iArr[12];
        int i23 = iArr[13];
        int i24 = iArr[14];
        int i25 = iArr[15];
        int i26 = iArr2[0];
        int i27 = iArr2[1];
        int i28 = iArr2[2];
        int i29 = iArr2[3];
        int i30 = iArr2[4];
        int i31 = iArr2[5];
        int i32 = iArr2[6];
        int i33 = iArr2[7];
        int i34 = iArr2[8];
        int i35 = iArr2[9];
        int i36 = iArr2[10];
        int i37 = iArr2[11];
        int i38 = iArr2[12];
        int i39 = iArr2[13];
        int i40 = iArr2[14];
        int i41 = iArr2[15];
        int i42 = i10 + i18;
        int i43 = i12 + i20;
        int i44 = i13 + i21;
        int i45 = i14 + i22;
        int i46 = i15 + i23;
        int i47 = i16 + i24;
        int i48 = i26 + i34;
        int i49 = i27 + i35;
        int i50 = i28 + i36;
        int i51 = i29 + i37;
        int i52 = i30 + i38;
        int i53 = i31 + i39;
        int i54 = i32 + i40;
        int i55 = i33 + i41;
        long j10 = i10;
        long j11 = i26;
        long j12 = j10 * j11;
        long j13 = i17;
        long j14 = i27;
        long j15 = j13 * j14;
        long j16 = i16;
        long j17 = i28;
        long j18 = (j16 * j17) + j15;
        long j19 = i15;
        long j20 = i29;
        long j21 = (j19 * j20) + j18;
        long j22 = i14;
        long j23 = i30;
        long j24 = (j22 * j23) + j21;
        long j25 = i13;
        long j26 = i31;
        long j27 = (j25 * j26) + j24;
        long j28 = i12;
        long j29 = i32;
        long j30 = (j28 * j29) + j27;
        long j31 = i11;
        long j32 = i33;
        long j33 = (j31 * j32) + j30;
        long j34 = i18;
        long j35 = i34;
        long j36 = j34 * j35;
        long j37 = i25;
        long j38 = i35;
        long j39 = j37 * j38;
        long j40 = i24;
        long j41 = i36;
        long j42 = (j40 * j41) + j39;
        long j43 = i23;
        long j44 = i37;
        long j45 = (j43 * j44) + j42;
        long j46 = i22;
        long j47 = i38;
        long j48 = (j46 * j47) + j45;
        long j49 = i21;
        long j50 = i39;
        long j51 = (j49 * j50) + j48;
        long j52 = i20;
        long j53 = i40;
        long j54 = (j52 * j53) + j51;
        long j55 = i19;
        long j56 = i41;
        long j57 = (j55 * j56) + j54;
        long j58 = i42;
        long j59 = i48;
        long j60 = j58 * j59;
        long j61 = i17 + i25;
        long j62 = i49;
        long j63 = j61 * j62;
        long j64 = i47;
        long j65 = i50;
        long j66 = (j64 * j65) + j63;
        long j67 = i46;
        long j68 = i51;
        long j69 = (j67 * j68) + j66;
        long j70 = i45;
        long j71 = i52;
        long j72 = (j70 * j71) + j69;
        long j73 = i44;
        long j74 = i53;
        long j75 = (j73 * j74) + j72;
        long j76 = i43;
        long j77 = i54;
        long j78 = (j76 * j77) + j75;
        long j79 = i11 + i19;
        long j80 = i55;
        long j81 = (j79 * j80) + j78;
        long j82 = ((j12 + j36) + j81) - j33;
        int i56 = ((int) j82) & 268435455;
        long j83 = j82 >>> 28;
        long jG = a.g(j57, j60, j12, j81);
        long j84 = (j10 * j14) + (j31 * j11);
        long j85 = (j34 * j38) + (j55 * j35);
        long j86 = (j52 * j56) + (j49 * j53) + (j46 * j50) + (j43 * j47) + (j40 * j44) + (j37 * j41);
        long j87 = (j58 * j62) + (j79 * j59);
        long j88 = (j76 * j80) + (j73 * j77) + (j70 * j74) + (j67 * j71) + (j64 * j68) + (j61 * j65);
        long jD = n1.d(j84, j85, j88, (j28 * j32) + (j25 * j29) + (j22 * j26) + (j19 * j23) + (j16 * j20) + (j13 * j17), j83);
        int i57 = ((int) jD) & 268435455;
        long j89 = jD >>> 28;
        long jB = bc.org.bouncycastle.math.ec.custom.sec.a.b(j86, j87, j84, j88, jG >>> 28);
        int i58 = ((int) jB) & 268435455;
        long j90 = jB >>> 28;
        long j91 = (j10 * j17) + (j31 * j14) + (j28 * j11);
        long j92 = (j34 * j41) + (j55 * j38) + (j52 * j35);
        long j93 = (j49 * j56) + (j46 * j53) + (j43 * j50) + (j40 * j47) + (j37 * j44);
        long j94 = (j58 * j65) + (j79 * j62) + (j76 * j59);
        long j95 = (j73 * j80) + (j70 * j77) + (j67 * j74) + (j64 * j71) + (j61 * j68);
        long jD2 = n1.d(j91, j92, j95, (j25 * j32) + (j22 * j29) + (j19 * j26) + (j16 * j23) + (j13 * j20), j89);
        int i59 = ((int) jD2) & 268435455;
        long j96 = jD2 >>> 28;
        long jB2 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j93, j94, j91, j95, j90);
        int i60 = ((int) jB2) & 268435455;
        long j97 = jB2 >>> 28;
        long j98 = (j10 * j20) + (j31 * j17) + (j28 * j14) + (j25 * j11);
        long j99 = (j34 * j44) + (j55 * j41) + (j52 * j38) + (j49 * j35);
        long j100 = (j46 * j56) + (j43 * j53) + (j40 * j50) + (j37 * j47);
        long j101 = (j58 * j68) + (j79 * j65) + (j76 * j62) + (j73 * j59);
        long j102 = (j70 * j80) + (j67 * j77) + (j64 * j74) + (j61 * j71);
        long jD3 = n1.d(j98, j99, j102, (j22 * j32) + (j19 * j29) + (j16 * j26) + (j13 * j23), j96);
        int i61 = ((int) jD3) & 268435455;
        long j103 = jD3 >>> 28;
        long jB3 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j100, j101, j98, j102, j97);
        int i62 = ((int) jB3) & 268435455;
        long j104 = jB3 >>> 28;
        long j105 = (j10 * j23) + (j31 * j20) + (j28 * j17) + (j25 * j14) + (j22 * j11);
        long j106 = (j34 * j47) + (j55 * j44) + (j52 * j41) + (j49 * j38) + (j46 * j35);
        long j107 = (j43 * j56) + (j40 * j53) + (j37 * j50);
        long j108 = (j58 * j71) + (j79 * j68) + (j76 * j65) + (j73 * j62) + (j70 * j59);
        long j109 = (j67 * j80) + (j64 * j77) + (j61 * j74);
        long jD4 = n1.d(j105, j106, j109, (j19 * j32) + (j16 * j29) + (j13 * j26), j103);
        int i63 = ((int) jD4) & 268435455;
        long j110 = jD4 >>> 28;
        long jB4 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j107, j108, j105, j109, j104);
        int i64 = ((int) jB4) & 268435455;
        long j111 = jB4 >>> 28;
        long j112 = (j10 * j26) + (j31 * j23) + (j28 * j20) + (j25 * j17) + (j22 * j14) + (j19 * j11);
        long j113 = (j34 * j50) + (j55 * j47) + (j52 * j44) + (j49 * j41) + (j46 * j38) + (j43 * j35);
        long j114 = (j40 * j56) + (j37 * j53);
        long j115 = (j58 * j74) + (j79 * j71) + (j76 * j68) + (j73 * j65) + (j70 * j62) + (j67 * j59);
        long j116 = (j64 * j80) + (j61 * j77);
        long jD5 = n1.d(j112, j113, j116, (j16 * j32) + (j13 * j29), j110);
        int i65 = ((int) jD5) & 268435455;
        long j117 = jD5 >>> 28;
        long jB5 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j114, j115, j112, j116, j111);
        int i66 = ((int) jB5) & 268435455;
        long j118 = jB5 >>> 28;
        long j119 = (j10 * j29) + (j31 * j26) + (j28 * j23) + (j25 * j20) + (j22 * j17) + (j19 * j14) + (j16 * j11);
        long j120 = j37 * j56;
        long j121 = (j58 * j77) + (j79 * j74) + (j76 * j71) + (j73 * j68) + (j70 * j65) + (j67 * j62) + (j64 * j59);
        long j122 = j61 * j80;
        long jD6 = n1.d(j119, (j34 * j53) + (j55 * j50) + (j52 * j47) + (j49 * j44) + (j46 * j41) + (j43 * j38) + (j40 * j35), j122, j13 * j32, j117);
        int i67 = ((int) jD6) & 268435455;
        long j123 = jD6 >>> 28;
        long jB6 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j120, j121, j119, j122, j118);
        long j124 = (j10 * j32) + (j31 * j29) + (j28 * j26) + (j25 * j23) + (j22 * j20) + (j19 * j17) + (j14 * j16) + (j11 * j13);
        long j125 = j124 + (j34 * j56) + (j55 * j53) + (j52 * j50) + (j49 * j47) + (j46 * j44) + (j41 * j43) + (j38 * j40) + (j37 * j35) + j123;
        long j126 = (((j58 * j80) + ((j79 * j77) + ((j76 * j74) + ((j73 * j71) + ((j70 * j68) + ((j67 * j65) + ((j64 * j62) + (j61 * j59)))))))) - j124) + (jB6 >>> 28);
        int i68 = ((int) j126) & 268435455;
        long j127 = j126 >>> 28;
        long j128 = (j125 >>> 28) + j127 + ((long) (((int) jG) & 268435455));
        long j129 = j127 + ((long) i56);
        iArr3[0] = ((int) j129) & 268435455;
        iArr3[1] = i57 + ((int) (j129 >>> 28));
        iArr3[2] = i59;
        iArr3[3] = i61;
        iArr3[4] = i63;
        iArr3[5] = i65;
        iArr3[6] = i67;
        iArr3[7] = ((int) j125) & 268435455;
        iArr3[8] = ((int) j128) & 268435455;
        iArr3[9] = i58 + ((int) (j128 >>> 28));
        iArr3[10] = i60;
        iArr3[11] = i62;
        iArr3[12] = i64;
        iArr3[13] = i66;
        iArr3[14] = ((int) jB6) & 268435455;
        iArr3[15] = i68;
    }

    public static void sqr(int[] iArr, int[] iArr2) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = iArr[4];
        int i15 = iArr[5];
        int i16 = iArr[6];
        int i17 = iArr[7];
        int i18 = iArr[8];
        int i19 = iArr[9];
        int i20 = iArr[10];
        int i21 = iArr[11];
        int i22 = iArr[12];
        int i23 = iArr[13];
        int i24 = iArr[14];
        int i25 = iArr[15];
        int i26 = i10 * 2;
        int i27 = i11 * 2;
        int i28 = i12 * 2;
        int i29 = i13 * 2;
        int i30 = i14 * 2;
        int i31 = i15 * 2;
        int i32 = i16 * 2;
        int i33 = i18 * 2;
        int i34 = i19 * 2;
        int i35 = i20 * 2;
        int i36 = i21 * 2;
        int i37 = i22 * 2;
        int i38 = i23 * 2;
        int i39 = i24 * 2;
        int i40 = i10 + i18;
        int i41 = i11 + i19;
        int i42 = i12 + i20;
        int i43 = i13 + i21;
        int i44 = i14 + i22;
        int i45 = i15 + i23;
        int i46 = i16 + i24;
        int i47 = i17 + i25;
        int i48 = i40 * 2;
        int i49 = i41 * 2;
        int i50 = i42 * 2;
        int i51 = i43 * 2;
        int i52 = i45 * 2;
        long j10 = i10;
        long j11 = j10 * j10;
        long j12 = i17;
        long j13 = i27;
        long j14 = j12 * j13;
        long j15 = i16;
        long j16 = i28;
        long j17 = (j15 * j16) + j14;
        long j18 = i15;
        long j19 = i29;
        long j20 = i14;
        long j21 = (j20 * j20) + (j18 * j19) + j17;
        long j22 = i18;
        long j23 = i25;
        long j24 = i34;
        long j25 = j23 * j24;
        long j26 = i24;
        long j27 = i35;
        long j28 = (j26 * j27) + j25;
        long j29 = i23;
        long j30 = i36;
        long j31 = (j29 * j30) + j28;
        long j32 = i22;
        long j33 = i40;
        long j34 = i47;
        long j35 = ((long) i49) & 4294967295L;
        long j36 = j34 * j35;
        long j37 = i46;
        long j38 = ((long) i50) & 4294967295L;
        long j39 = (j37 * j38) + j36;
        long j40 = i45;
        long j41 = ((long) i51) & 4294967295L;
        long j42 = (j40 * j41) + j39;
        long j43 = i44;
        long j44 = (j43 * j43) + j42;
        long j45 = ((j11 + (j22 * j22)) + j44) - j21;
        int i53 = ((int) j45) & 268435455;
        long j46 = j45 >>> 28;
        long jG = a.g((j32 * j32) + j31, j33 * j33, j11, j44);
        int i54 = ((int) jG) & 268435455;
        long j47 = jG >>> 28;
        long j48 = i11;
        long j49 = i26;
        long j50 = j48 * j49;
        long j51 = i30;
        long j52 = (j18 * j51) + (j15 * j19) + (j12 * j16);
        long j53 = i19;
        long j54 = i33;
        long j55 = j53 * j54;
        long j56 = (j26 * j30) + (j23 * j27);
        long j57 = i37;
        long j58 = (j29 * j57) + j56;
        long j59 = i41;
        long j60 = ((long) i48) & 4294967295L;
        long j61 = (j37 * j41) + (j34 * j38);
        long j62 = ((long) (i44 * 2)) & 4294967295L;
        long j63 = (j40 * j62) + j61;
        long jD = n1.d(j50, j55, j63, j52, j46);
        int i55 = ((int) jD) & 268435455;
        long j64 = jD >>> 28;
        long jB = bc.org.bouncycastle.math.ec.custom.sec.a.b(j58, j59 * j60, j50, j63, j47);
        int i56 = ((int) jB) & 268435455;
        long j65 = jB >>> 28;
        long j66 = i12;
        long j67 = (j48 * j48) + (j66 * j49);
        long j68 = i20;
        long j69 = (j53 * j53) + (j68 * j54);
        long j70 = (j29 * j29) + (j26 * j57) + (j23 * j30);
        long j71 = i42;
        long j72 = (j59 * j59) + (j71 * j60);
        long j73 = (j40 * j40) + (j37 * j62) + (j34 * j41);
        long jD2 = n1.d(j67, j69, j73, (j18 * j18) + (j15 * j51) + (j12 * j19), j64);
        int i57 = ((int) jD2) & 268435455;
        long j74 = jD2 >>> 28;
        long jB2 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j70, j72, j67, j73, j65);
        int i58 = ((int) jB2) & 268435455;
        long j75 = jB2 >>> 28;
        long j76 = i13;
        long j77 = (j66 * j13) + (j76 * j49);
        long j78 = i31;
        long j79 = (j15 * j78) + (j51 * j12);
        long j80 = i21;
        long j81 = (j68 * j24) + (j80 * j54);
        long j82 = i38;
        long j83 = (j26 * j82) + (j57 * j23);
        long j84 = i43;
        long j85 = j34 * j62;
        long j86 = ((long) i52) & 4294967295L;
        long j87 = (j37 * j86) + j85;
        long jD3 = n1.d(j77, j81, j87, j79, j74);
        int i59 = ((int) jD3) & 268435455;
        long j88 = jD3 >>> 28;
        long jB3 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j83, (j71 * j35) + (j84 * j60), j77, j87, j75);
        int i60 = ((int) jB3) & 268435455;
        long j89 = jB3 >>> 28;
        long j90 = (j66 * j66) + (j76 * j13) + (j20 * j49);
        long j91 = (j68 * j68) + (j80 * j24) + (j32 * j54);
        long j92 = (j71 * j71) + (j84 * j35) + (j43 * j60);
        long j93 = (j37 * j37) + (j34 * j86);
        long jD4 = n1.d(j90, j91, j93, (j15 * j15) + (j12 * j78), j88);
        int i61 = ((int) jD4) & 268435455;
        long j94 = jD4 >>> 28;
        long jB4 = bc.org.bouncycastle.math.ec.custom.sec.a.b((j26 * j26) + (j23 * j82), j92, j90, j93, j89);
        int i62 = ((int) jB4) & 268435455;
        long j95 = jB4 >>> 28;
        long j96 = (j76 * j16) + (j20 * j13) + (j18 * j49);
        long j97 = (j84 * j38) + (j43 * j35) + (j40 * j60);
        long j98 = j34 * (((long) (i46 * 2)) & 4294967295L);
        long jD5 = n1.d(j96, (j80 * j27) + (j32 * j24) + (j29 * j54), j98, j12 * ((long) i32), j94);
        int i63 = ((int) jD5) & 268435455;
        long j99 = jD5 >>> 28;
        long jB5 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j23 * ((long) i39), j97, j96, j98, j95);
        int i64 = ((int) jB5) & 268435455;
        long j100 = jB5 >>> 28;
        long j101 = (j76 * j76) + (j20 * j16) + (j18 * j13) + (j15 * j49);
        long j102 = (j80 * j80) + (j32 * j27) + (j29 * j24) + (j26 * j54);
        long j103 = (j84 * j84) + (j43 * j38) + (j40 * j35) + (j37 * j60);
        long j104 = j34 * j34;
        long jD6 = n1.d(j101, j102, j104, j12 * j12, j99);
        long jB6 = bc.org.bouncycastle.math.ec.custom.sec.a.b(j23 * j23, j103, j101, j104, j100);
        long j105 = (j20 * j19) + (j18 * j16) + (j15 * j13) + (j49 * j12);
        long j106 = j105 + (j32 * j30) + (j29 * j27) + (j26 * j24) + (j54 * j23) + (jD6 >>> 28);
        long j107 = (((j43 * j41) + ((j40 * j38) + ((j37 * j35) + (j34 * j60)))) - j105) + (jB6 >>> 28);
        int i65 = ((int) j107) & 268435455;
        long j108 = j107 >>> 28;
        long j109 = (j106 >>> 28) + j108 + ((long) i54);
        long j110 = j108 + ((long) i53);
        iArr2[0] = ((int) j110) & 268435455;
        iArr2[1] = i55 + ((int) (j110 >>> 28));
        iArr2[2] = i57;
        iArr2[3] = i59;
        iArr2[4] = i61;
        iArr2[5] = i63;
        iArr2[6] = ((int) jD6) & 268435455;
        iArr2[7] = ((int) j106) & 268435455;
        iArr2[8] = ((int) j109) & 268435455;
        iArr2[9] = i56 + ((int) (j109 >>> 28));
        iArr2[10] = i58;
        iArr2[11] = i60;
        iArr2[12] = i62;
        iArr2[13] = i64;
        iArr2[14] = ((int) jB6) & 268435455;
        iArr2[15] = i65;
    }
}
