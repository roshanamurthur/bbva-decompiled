package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class asd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f53736a = {2791191049453778211L, 2791191049453778402L, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53737b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53738c = 1;

    static {
        int i10 = 94 - 1;
        f53738c = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53738c;
        int i11 = (i10 | 63) << 1;
        int i12 = -((i10 & (-64)) | ((~i10) & 63));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f53737b = i13 % 128;
        int i14 = i13 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = j13 ^ (j14 >>> 59);
        long j16 = j10 ^ ((j15 << 61) ^ (j15 << 63));
        long j17 = (j11 ^ ((j14 << 61) ^ (j14 << 63))) ^ ((((j15 >>> 3) ^ (j15 >>> 1)) ^ j15) ^ (j15 << 5));
        long j18 = (j12 ^ ((((j14 >>> 3) ^ (j14 >>> 1)) ^ j14) ^ (j14 << 5))) ^ (j15 >>> 59);
        long j19 = j18 >>> 3;
        jArr2[0] = (((j16 ^ j19) ^ (j19 << 2)) ^ (j19 << 3)) ^ (j19 << 8);
        jArr2[1] = (j18 >>> 59) ^ j17;
        jArr2[2] = 7 & j18;
        int i15 = i10 & 23;
        int i16 = (~i15) & (i10 | 23);
        int i17 = i15 << 1;
        int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
        f53737b = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53738c;
        int i11 = i10 & 121;
        int i12 = i10 | 121;
        int i13 = (i11 & i12) + (i12 | i11);
        int i14 = i13 % 128;
        f53737b = i14;
        int i15 = i13 % 2;
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        int i16 = i14 + 109;
        f53738c = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 78 / 0;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = 1;
        long jLongValue = ((Number) objArr[1]).longValue();
        int i11 = 2;
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long[] jArr2 = (long[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i12 = f53737b;
        int i13 = i12 & 125;
        int i14 = i13 + ((i12 ^ 125) | i13);
        int i15 = i14 % 128;
        f53738c = i15;
        int i16 = i14 % 2;
        jArr[1] = jLongValue2;
        long j10 = jLongValue2 << 1;
        jArr[2] = j10;
        long j11 = j10 ^ jLongValue2;
        jArr[3] = j11;
        long j12 = jLongValue2 << 2;
        jArr[4] = j12;
        jArr[5] = j12 ^ jLongValue2;
        long j13 = j11 << 1;
        jArr[6] = j13;
        jArr[7] = jLongValue2 ^ j13;
        int i17 = (int) jLongValue;
        long j14 = (((jArr[i17 & 7] ^ (jArr[(i17 >>> 3) & 7] << 3)) ^ (jArr[(i17 >>> 6) & 7] << 6)) ^ (jArr[(i17 >>> 9) & 7] << 9)) ^ (jArr[(i17 >>> 12) & 7] << 12);
        int i18 = ((i15 ^ 69) | (i15 & 69)) << 1;
        int i19 = -((i15 & (-70)) | (69 & (~i15)));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        f53737b = i20 % 128;
        int i21 = i20 % 2;
        long j15 = 0;
        int i22 = 30;
        while (true) {
            int i23 = (int) (jLongValue >>> i22);
            long j16 = (((jArr[i23 & 7] ^ (jArr[(i23 >>> 3) & 7] << 3)) ^ (jArr[(i23 >>> 6) & 7] << 6)) ^ (jArr[(i23 >>> 9) & 7] << 9)) ^ (jArr[(i23 >>> 12) & 7] << 12);
            j14 ^= j16 << i22;
            j15 ^= j16 >>> (-i22);
            int i24 = i22 + 8;
            int i25 = (i24 ^ (-1)) + (i24 << i10);
            int i26 = ((i25 ^ (-22)) | (i25 & (-22))) << i10;
            int i27 = -(((-22) & (~i25)) | (i25 & 21));
            i22 = (i26 | i27) + (i26 & i27);
            if (i22 <= 0) {
                break;
            }
            i11 = i11;
            i10 = i10;
        }
        int i28 = f53738c;
        int i29 = (i28 & 98) + (i28 | 98);
        int i30 = (i29 ^ (-1)) + (i29 << i10);
        f53737b = i30 % 128;
        int i31 = i30 % i11;
        jArr2[iIntValue] = 17592186044415L & j14;
        int i32 = -(-(iIntValue * 569));
        int i33 = 569 & i32;
        int i34 = ((i32 | 569) & (~i33)) + (i33 << 1);
        int i35 = ~iIntValue;
        int i36 = ~i35;
        int i37 = i35 & 1;
        int i38 = (-2) & i35;
        int i39 = ((-2) & i36) | i37 | i38;
        int i40 = ~i39;
        int i41 = (i39 | i40) & i40;
        int i42 = (i35 | iIntValue) & i35;
        int i43 = ~i42;
        int i44 = i42 & 1;
        int i45 = ((-2) & i43) | i44;
        int i46 = (-2) & i42;
        int i47 = ~((i45 ^ i46) | (i45 & i46));
        int i48 = i41 & i47;
        int i49 = (~i48) & (i47 | i41);
        int i50 = (i49 & i48) | (i49 ^ i48);
        int i51 = ~((i35 ^ i35) | (i35 & i35));
        int i52 = i50 & i51;
        int i53 = (i50 | i51) & (~i52);
        int i54 = ((i53 & i52) | (i53 ^ i52)) * (-1136);
        int i55 = i34 & i54;
        int i56 = i54 | i34;
        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
        int i58 = (-2) & iIntValue;
        int i59 = (~i58) & ((-2) | iIntValue);
        int i60 = (i59 & i58) | (i59 ^ i58);
        int i61 = ~i60;
        int i62 = (i60 | i61) & i61;
        int i63 = i42 ^ iIntValue;
        int i64 = i42 & iIntValue;
        int i65 = ~((i63 & i64) | (i63 ^ i64));
        int i66 = i62 ^ i65;
        int i67 = i62 & i65;
        int i68 = (i67 & i66) | (i66 ^ i67);
        int i69 = i46 | (i43 & 1);
        int i70 = (i69 & i44) | (i69 ^ i44);
        int i71 = ~((i70 & iIntValue) | (i70 ^ iIntValue));
        int i72 = i68 ^ i71;
        int i73 = i68 & i71;
        int i74 = ((i73 & i72) | (i72 ^ i73)) * (-568);
        int i75 = ((~i74) & i57) | ((~i57) & i74);
        int i76 = -(-((i74 & i57) << 1));
        int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
        int i78 = (i36 & 1) | i38;
        int i79 = (i78 & i37) | (i78 ^ i37);
        int i80 = ~i79;
        int i81 = (i79 | i80) & i80;
        int i82 = (i42 & i35) | (iIntValue & i43);
        int i83 = (i82 & i64) | (i82 ^ i64);
        int i84 = ~i83;
        int i85 = (i83 | i84) & i84;
        int i86 = (i81 & i85) | ((~i85) & i81) | ((~i81) & i85);
        int i87 = (-2) ^ i42;
        int i88 = (i87 & i46) | (i87 ^ i46);
        int i89 = i88 & iIntValue;
        int i90 = (i88 | iIntValue) & (~i89);
        int i91 = ~((i90 & i89) | (i90 ^ i89));
        int i92 = -(-(((i86 & i91) | (i86 ^ i91)) * 568));
        jArr2[(((~i92) & i77) | ((~i77) & i92)) + ((i92 & i77) << 1)] = (j14 >>> 44) ^ (j15 << 20);
        int i93 = i28 + 91;
        f53737b = i93 % 128;
        if (i93 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53737b + 101;
        int i11 = i10 % 128;
        f53738c = i11;
        int i12 = i10 % 2;
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        int i13 = i11 & 17;
        int i14 = ((i11 ^ 17) | i13) << 1;
        int i15 = -((~i13) & (i11 | 17));
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        f53737b = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 18 / 0;
        }
    }

    public static /* synthetic */ Integer e(Object[] objArr) {
        long j10;
        long[] jArr = (long[]) objArr[0];
        int i10 = f53737b;
        int i11 = i10 & 87;
        int i12 = (((i10 | 87) & (~i11)) - (~(i11 << 1))) - 1;
        int i13 = i12 % 128;
        f53738c = i13;
        if (i12 % 2 == 0) {
            j10 = ((jArr[0] >> 102) ^ jArr[1]) / (jArr[5] << 1);
        } else {
            j10 = (jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1);
        }
        int i14 = ((int) j10) & 1;
        int i15 = i13 & 47;
        int i16 = -(-(i13 | 47));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f53737b = i17 % 128;
        if (i17 % 2 == 0) {
            return Integer.valueOf(i14);
        }
        throw null;
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f53738c;
        int i11 = (i10 ^ 67) + ((i10 & 67) << 1);
        f53737b = i11 % 128;
        int i12 = i11 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr[2];
        long j13 = jArr[3];
        long j14 = jArr[4];
        long j15 = jArr[5];
        jArr[0] = j10 ^ (j11 << 44);
        jArr[1] = (j11 >>> 20) ^ (j12 << 24);
        jArr[2] = ((j12 >>> 40) ^ (j13 << 4)) ^ (j14 << 48);
        jArr[3] = ((j13 >>> 60) ^ (j15 << 28)) ^ (j14 >>> 16);
        jArr[4] = j15 >>> 36;
        jArr[5] = 0;
        int i13 = (((i10 | 36) << 1) - (36 ^ i10)) - 1;
        f53737b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53738c;
        int i11 = ((i10 & 38) + (i10 | 38)) - 1;
        f53737b = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr3 = (long[]) auy.setOnFocusChangeListener(new Object[]{5}, 1783230509, -1783230493, 5);
        auv.setDividerPadding(new Object[]{jArr, jArr2}, -644509532, 644509562, (int) System.currentTimeMillis());
        int i13 = f53738c;
        int i14 = i13 & 101;
        int i15 = (i13 | 101) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
        f53737b = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 1;
        while (i19 < 131) {
            int i20 = f53738c;
            int i21 = i20 & 61;
            int i22 = (i20 | 61) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f53737b = i24 % 128;
            int i25 = i24 % 2;
            setY(new Object[]{jArr2, jArr3}, -1926038070, 1926038076, (int) System.currentTimeMillis());
            setY(new Object[]{jArr3, jArr2}, 291528995, -291528990, (int) System.currentTimeMillis());
            setY(new Object[]{jArr2, jArr3}, -1926038070, 1926038076, (int) System.currentTimeMillis());
            setY(new Object[]{jArr3, jArr2}, 291528995, -291528990, (int) System.currentTimeMillis());
            setY(new Object[]{jArr, jArr2}, 445328286, -445328273, (int) System.currentTimeMillis());
            int i26 = (i19 & (-17)) | ((~i19) & 16);
            int i27 = -(-((i19 & 16) << 1));
            int i28 = (i26 & i27) + (i27 | i26);
            i19 = ((i28 & (-13)) + (i28 | (-13))) - 1;
            int i29 = f53737b;
            int i30 = i29 ^ 77;
            int i31 = ((i29 & 77) | i30) << 1;
            int i32 = -i30;
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            f53738c = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = f53737b;
        int i36 = i35 & 51;
        int i37 = ((i35 ^ 51) | i36) << 1;
        int i38 = -((i35 | 51) & (~i36));
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        f53738c = i39 % 128;
        if (i39 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr2 = (long[]) objArr[2];
        int i10 = f53737b;
        int i11 = i10 & 105;
        int i12 = -(-((i10 ^ 105) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53738c = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr3 = (long[]) auy.setOnFocusChangeListener(new Object[]{5}, 1783230509, -1783230493, 5);
        setY(new Object[]{jArr, jArr3}, -1926038070, 1926038076, (int) System.currentTimeMillis());
        setY(new Object[]{jArr3, jArr2}, 291528995, -291528990, (int) System.currentTimeMillis());
        int i15 = f53737b;
        int i16 = i15 & 61;
        int i17 = -(-(i15 | 61));
        int i18 = i16 & i17;
        int i19 = i17 | i16;
        while (true) {
            int i20 = i18 + i19;
            f53738c = i20 % 128;
            int i21 = i20 % 2;
            iIntValue = (iIntValue << 1) + (~iIntValue);
            if (iIntValue <= 0) {
                return;
            }
            int i22 = f53737b;
            int i23 = i22 ^ 7;
            int i24 = ((i22 & 7) | i23) << 1;
            int i25 = -i23;
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f53738c = i26 % 128;
            Object[] objArr2 = new Object[2];
            if (i26 % 2 == 0) {
                objArr2[0] = jArr2;
                objArr2[1] = jArr3;
                setY(objArr2, -1926038070, 1926038076, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr2}, 291528995, -291528990, (int) System.currentTimeMillis());
                int i27 = 19 / 0;
            } else {
                objArr2[0] = jArr2;
                objArr2[1] = jArr3;
                setY(objArr2, -1926038070, 1926038076, (int) System.currentTimeMillis());
                setY(new Object[]{jArr3, jArr2}, 291528995, -291528990, (int) System.currentTimeMillis());
            }
            int i28 = f53737b;
            int i29 = (i28 & (-72)) | ((~i28) & 71);
            int i30 = (i28 & 71) << 1;
            i18 = i29 ^ i30;
            i19 = (i30 & i29) << 1;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -1085262173, 1085262187, (int) System.currentTimeMillis());
    }

    public static int setDividerPadding(long[] jArr) {
        return ((Integer) setY(new Object[]{jArr}, 676917530, -676917520, (int) System.currentTimeMillis())).intValue();
    }

    public static void setLayoutAnimation(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, -370098082, 370098086, (int) System.currentTimeMillis());
    }

    public static void setNavigationOnClickListener(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 1193286868, -1193286868, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 1515196094, -1515196077, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, int i10, long[] jArr2) {
        setY(new Object[]{jArr, Integer.valueOf(i10), jArr2}, -1771747778, 1771747787, i10);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i11;
        int i14 = ~(i13 | i10);
        int i15 = ~i10;
        switch (((~(i15 | (~i12) | i11)) * 501) + ((~(i13 | i15)) * 1002) + ((i14 | (~(i15 | i11 | i12))) * 501) + (i11 * (-500)) + (i10 * (-500))) {
            case 1:
                g(objArr);
                return null;
            case 2:
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                int i16 = f53738c;
                int i17 = (((i16 | 32) << 1) - (i16 ^ 32)) - 1;
                f53737b = i17 % 128;
                int i18 = i17 % 2;
                long[] jArr3 = (long[]) auv.setDividerPadding(new Object[0], -1915146282, 1915146293, (int) System.currentTimeMillis());
                long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j10 = (jLongValue & 4294967295L) | (jLongValue2 << 32);
                jArr3[0] = (jLongValue >>> 32) | (jLongValue2 & (-4294967296L));
                long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[2])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                long j11 = jLongValue3 & 4294967295L;
                jArr3[1] = jLongValue3 >>> 32;
                setY(new Object[]{jArr3, f53736a, jArr2}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                jArr2[0] = jArr2[0] ^ j10;
                jArr2[1] = jArr2[1] ^ j11;
                int i19 = f53738c;
                int i20 = i19 ^ 73;
                int i21 = -(-((i19 & 73) << 1));
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                f53737b = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 3:
                long[] jArr4 = (long[]) objArr[0];
                long[] jArr5 = (long[]) objArr[1];
                long[] jArr6 = (long[]) objArr[2];
                int i24 = f53738c;
                int i25 = ((i24 & (-74)) | ((~i24) & 73)) + ((i24 & 73) << 1);
                f53737b = i25 % 128;
                if (i25 % 2 != 0) {
                    long[] jArr7 = new long[108];
                    setY(new Object[]{jArr4, jArr5, jArr7}, -1944231433, 1944231451, (int) System.currentTimeMillis());
                    setY(new Object[]{jArr7, jArr6}, 291528995, -291528990, (int) System.currentTimeMillis());
                } else {
                    long[] jArr8 = new long[8];
                    setY(new Object[]{jArr4, jArr5, jArr8}, -1944231433, 1944231451, (int) System.currentTimeMillis());
                    setY(new Object[]{jArr8, jArr6}, 291528995, -291528990, (int) System.currentTimeMillis());
                }
                int i26 = f53738c + 43;
                f53737b = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 4:
                long[] jArr9 = (long[]) objArr[0];
                long[] jArr10 = (long[]) objArr[1];
                int i28 = f53737b;
                int i29 = ((((i28 ^ 53) | (i28 & 53)) << 1) - (~(-(((~i28) & 53) | (i28 & (-54)))))) - 1;
                f53738c = i29 % 128;
                int i30 = i29 % 2;
                long[] jArr11 = (long[]) auy.setOnFocusChangeListener(new Object[]{5}, 1783230509, -1783230493, 5);
                setY(new Object[]{jArr9, jArr11}, -1926038070, 1926038076, (int) System.currentTimeMillis());
                setY(new Object[]{jArr11, jArr10}, 291528995, -291528990, (int) System.currentTimeMillis());
                int i31 = f53737b;
                int i32 = i31 & 89;
                int i33 = (i31 | 89) & (~i32);
                int i34 = -(-(i32 << 1));
                int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                f53738c = i35 % 128;
                int i36 = i35 % 2;
                return null;
            case 5:
                a(objArr);
                return null;
            case 6:
                long[] jArr12 = (long[]) objArr[0];
                long[] jArr13 = (long[]) objArr[1];
                int i37 = f53737b + 49;
                f53738c = i37 % 128;
                if (i37 % 2 == 0) {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr12, 5, jArr13, 0}, 1056168849, -1056168849, 5);
                    int i38 = (int) jArr12[5];
                    jArr13[2] = ((long) ((Integer) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i38)}, -183025508, 183025515, i38)).intValue()) | 4294967295L;
                } else {
                    auu.setCompoundDrawableTintBlendMode(new Object[]{jArr12, 2, jArr13, 0}, 1056168849, -1056168849, 2);
                    int i39 = (int) jArr12[2];
                    jArr13[4] = ((long) ((Integer) auu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i39)}, -183025508, 183025515, i39)).intValue()) & 4294967295L;
                }
                int i40 = f53737b;
                int i41 = (i40 | 89) << 1;
                int i42 = -(i40 ^ 89);
                int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                f53738c = i43 % 128;
                int i44 = i43 % 2;
                return null;
            case 7:
                BigInteger bigInteger = (BigInteger) objArr[0];
                int i45 = f53737b;
                int i46 = (i45 | 97) << 1;
                int i47 = -(i45 ^ 97);
                int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                f53738c = i48 % 128;
                int i49 = i48 % 2;
                long[] jArr14 = (long[]) auy.setOnFocusChangeListener(new Object[]{131, bigInteger}, 1678029135, -1678029124, 131);
                int i50 = f53737b;
                int i51 = i50 & 15;
                int i52 = -(-((i50 ^ 15) | i51));
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                f53738c = i53 % 128;
                int i54 = i53 % 2;
                return jArr14;
            case 8:
                long[] jArr15 = (long[]) objArr[0];
                long[] jArr16 = (long[]) objArr[1];
                long[] jArr17 = (long[]) objArr[2];
                int i55 = f53738c + 51;
                f53737b = i55 % 128;
                if (i55 % 2 != 0) {
                    long[] jArr18 = new long[68];
                    setY(new Object[]{jArr15, jArr16, jArr18}, -1944231433, 1944231451, (int) System.currentTimeMillis());
                    setY(new Object[]{jArr17, jArr18, jArr17}, 490831258, -490831247, (int) System.currentTimeMillis());
                    return null;
                }
                long[] jArr19 = new long[8];
                setY(new Object[]{jArr15, jArr16, jArr19}, -1944231433, 1944231451, (int) System.currentTimeMillis());
                setY(new Object[]{jArr17, jArr19, jArr17}, 490831258, -490831247, (int) System.currentTimeMillis());
                return null;
            case 9:
                h(objArr);
                return null;
            case 10:
                return e(objArr);
            case 11:
                b(objArr);
                return null;
            case 12:
                d(objArr);
                return null;
            case 13:
                long[] jArr20 = (long[]) objArr[0];
                long[] jArr21 = (long[]) objArr[1];
                int i56 = f53737b;
                int i57 = ((i56 & 102) + (i56 | 102)) - 1;
                f53738c = i57 % 128;
                int i58 = i57 % 2;
                jArr21[0] = jArr21[0] ^ jArr20[0];
                jArr21[1] = jArr21[1] ^ jArr20[1];
                jArr21[2] = jArr21[2] ^ jArr20[2];
                int i59 = i56 + 11;
                f53738c = i59 % 128;
                int i60 = i59 % 2;
                return null;
            case 14:
                long[] jArr22 = (long[]) objArr[0];
                long[] jArr23 = (long[]) objArr[1];
                int i61 = f53738c;
                int i62 = (i61 ^ 13) + ((i61 & 13) << 1);
                f53737b = i62 % 128;
                int i63 = i62 % 2;
                if (((Boolean) auv.setDividerPadding(new Object[]{jArr22}, 1694485490, -1694485484, (int) System.currentTimeMillis())).booleanValue()) {
                    throw new IllegalStateException();
                }
                long[] jArr24 = (long[]) auv.setDividerPadding(new Object[0], -1915146282, 1915146293, (int) System.currentTimeMillis());
                long[] jArr25 = (long[]) auv.setDividerPadding(new Object[0], -1915146282, 1915146293, (int) System.currentTimeMillis());
                setY(new Object[]{jArr22, jArr24}, -370098082, 370098086, (int) System.currentTimeMillis());
                setY(new Object[]{jArr24, jArr22, jArr24}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr24, 2, jArr25}, -1771747778, 1771747787, 2);
                setY(new Object[]{jArr25, jArr24, jArr25}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr25, 4, jArr24}, -1771747778, 1771747787, 4);
                setY(new Object[]{jArr24, jArr25, jArr24}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr24, 8, jArr25}, -1771747778, 1771747787, 8);
                setY(new Object[]{jArr25, jArr24, jArr25}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr25, 16, jArr24}, -1771747778, 1771747787, 16);
                setY(new Object[]{jArr24, jArr25, jArr24}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr24, 32, jArr25}, -1771747778, 1771747787, 32);
                setY(new Object[]{jArr25, jArr24, jArr25}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr25, jArr25}, -370098082, 370098086, (int) System.currentTimeMillis());
                setY(new Object[]{jArr25, jArr22, jArr25}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr25, 65, jArr24}, -1771747778, 1771747787, 65);
                setY(new Object[]{jArr24, jArr25, jArr24}, 1043517295, -1043517292, (int) System.currentTimeMillis());
                setY(new Object[]{jArr24, jArr23}, -370098082, 370098086, (int) System.currentTimeMillis());
                int i64 = f53737b;
                int i65 = (i64 ^ 121) + ((i64 & 121) << 1);
                f53738c = i65 % 128;
                int i66 = i65 % 2;
                return null;
            case 15:
                f(objArr);
                return null;
            case 16:
                c(objArr);
                return null;
            case 17:
                long[] jArr26 = (long[]) objArr[0];
                long[] jArr27 = (long[]) objArr[1];
                int i67 = f53737b;
                int i68 = i67 & 83;
                int i69 = (i67 ^ 83) | i68;
                int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
                f53738c = i70 % 128;
                if (i70 % 2 == 0) {
                    jArr27[1] = jArr26[1];
                    jArr27[1] = jArr26[1];
                    jArr27[3] = jArr26[5];
                } else {
                    jArr27[0] = jArr26[0] ^ 1;
                    jArr27[1] = jArr26[1];
                    jArr27[2] = jArr26[2];
                }
                int i71 = i67 & 11;
                int i72 = (((~i71) & (i67 | 11)) - (~(i71 << 1))) - 1;
                f53738c = i72 % 128;
                int i73 = i72 % 2;
                return null;
            case 18:
                long[] jArr28 = (long[]) objArr[0];
                long[] jArr29 = (long[]) objArr[1];
                long[] jArr30 = (long[]) objArr[2];
                int i74 = f53737b;
                int i75 = i74 & 11;
                int i76 = (((i74 ^ 11) | i75) << 1) - ((i74 | 11) & (~i75));
                f53738c = i76 % 128;
                int i77 = i76 % 2;
                long j12 = jArr28[0];
                long j13 = jArr28[1];
                long j14 = ((j13 >>> 24) ^ (jArr28[2] << 40)) & 17592186044415L;
                long j15 = ((j12 >>> 44) ^ (j13 << 20)) & 17592186044415L;
                long j16 = j12 & 17592186044415L;
                long j17 = jArr29[0];
                long j18 = jArr29[1];
                long j19 = ((j18 >>> 24) ^ (jArr29[2] << 40)) & 17592186044415L;
                long j20 = ((j17 >>> 44) ^ (j18 << 20)) & 17592186044415L;
                long j21 = j17 & 17592186044415L;
                long[] jArr31 = new long[10];
                setY(new Object[]{jArr30, Long.valueOf(j16), Long.valueOf(j21), jArr31, 0}, 1839335161, -1839335145, 0);
                setY(new Object[]{jArr30, Long.valueOf(j14), Long.valueOf(j19), jArr31, 2}, 1839335161, -1839335145, 2);
                long j22 = (j16 ^ j15) ^ j14;
                long j23 = (j21 ^ j20) ^ j19;
                setY(new Object[]{jArr30, Long.valueOf(j22), Long.valueOf(j23), jArr31, 4}, 1839335161, -1839335145, 4);
                long j24 = (j15 << 1) ^ (j14 << 2);
                long j25 = (j20 << 1) ^ (j19 << 2);
                setY(new Object[]{jArr30, Long.valueOf(j16 ^ j24), Long.valueOf(j21 ^ j25), jArr31, 6}, 1839335161, -1839335145, 6);
                setY(new Object[]{jArr30, Long.valueOf(j22 ^ j24), Long.valueOf(j23 ^ j25), jArr31, 8}, 1839335161, -1839335145, 8);
                long j26 = jArr31[6];
                long j27 = jArr31[8] ^ j26;
                long j28 = jArr31[7];
                long j29 = jArr31[9] ^ j28;
                long j30 = (j27 ^ (j29 << 1)) ^ j28;
                long j31 = jArr31[0];
                long j32 = jArr31[1];
                long j33 = (j32 ^ j31) ^ jArr31[4];
                long j34 = j32 ^ jArr31[5];
                long j35 = jArr31[2];
                long j36 = ((((j27 << 1) ^ j26) ^ j31) ^ (j35 << 4)) ^ (j35 << 1);
                long j37 = jArr31[3];
                long j38 = (((j33 ^ j30) ^ (j37 << 4)) ^ (j37 << 1)) ^ (j36 >>> 44);
                long j39 = (j34 ^ j29) ^ (j38 >>> 44);
                long j40 = ((j36 & 17592186044415L) >>> 1) ^ ((j38 & 1) << 43);
                long j41 = j40 ^ (j40 << 1);
                long j42 = j41 ^ (j41 << 2);
                long j43 = j42 ^ (j42 << 4);
                long j44 = j43 ^ (j43 << 8);
                long j45 = j44 ^ (j44 << 16);
                long j46 = (j45 ^ (j45 << 32)) & 17592186044415L;
                long j47 = (((j38 & 17592186044415L) >>> 1) ^ ((j39 & 1) << 43)) ^ (j46 >>> 43);
                long j48 = j47 ^ (j47 << 1);
                long j49 = j48 ^ (j48 << 2);
                long j50 = j49 ^ (j49 << 4);
                long j51 = j50 ^ (j50 << 8);
                long j52 = j51 ^ (j51 << 16);
                long j53 = (j52 ^ (j52 << 32)) & 17592186044415L;
                long j54 = (j39 >>> 1) ^ (j53 >>> 43);
                long j55 = j54 ^ (j54 << 1);
                long j56 = j55 ^ (j55 << 2);
                long j57 = j56 ^ (j56 << 4);
                long j58 = j57 ^ (j57 << 8);
                long j59 = j58 ^ (j58 << 16);
                long j60 = j59 ^ (j59 << 32);
                jArr30[0] = j31;
                jArr30[1] = (j33 ^ j46) ^ j35;
                jArr30[2] = (j46 ^ (j34 ^ j53)) ^ j37;
                jArr30[3] = j60 ^ j53;
                jArr30[4] = jArr31[2] ^ j60;
                jArr30[5] = jArr31[3];
                setY(new Object[]{jArr30}, -980297683, 980297698, (int) System.currentTimeMillis());
                int i78 = f53737b;
                int i79 = i78 | 107;
                int i80 = (i79 << 1) - ((~(i78 & 107)) & i79);
                f53738c = i80 % 128;
                int i81 = i80 % 2;
                return null;
            default:
                long[] jArr32 = (long[]) objArr[0];
                long[] jArr33 = (long[]) objArr[1];
                int i82 = f53737b;
                int i83 = (i82 ^ 93) + ((i82 & 93) << 1);
                f53738c = i83 % 128;
                if (i83 % 2 == 0) {
                    long[] jArr34 = (long[]) auy.setOnFocusChangeListener(new Object[]{4}, 1783230509, -1783230493, 4);
                    setY(new Object[]{jArr32, jArr34}, -1926038070, 1926038076, (int) System.currentTimeMillis());
                    setY(new Object[]{jArr33, jArr34, jArr33}, 490831258, -490831247, (int) System.currentTimeMillis());
                    return null;
                }
                long[] jArr35 = (long[]) auy.setOnFocusChangeListener(new Object[]{5}, 1783230509, -1783230493, 5);
                setY(new Object[]{jArr32, jArr35}, -1926038070, 1926038076, (int) System.currentTimeMillis());
                setY(new Object[]{jArr33, jArr35, jArr33}, 490831258, -490831247, (int) System.currentTimeMillis());
                return null;
        }
    }

    public static long[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (long[]) setY(new Object[]{bigInteger}, 1293734004, -1293733997, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 291528995, -291528990, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, -1151964319, 1151964331, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, 1043517295, -1043517292, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2, long[] jArr3) {
        setY(new Object[]{jArr, jArr2, jArr3}, -539015690, 539015698, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 1762467187, -1762467186, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setY(new Object[]{jArr, jArr2}, 647457160, -647457158, (int) System.currentTimeMillis());
    }
}
