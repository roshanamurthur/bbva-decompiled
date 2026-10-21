package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class arw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53717a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53718b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53718b;
        int i11 = (i10 & 105) + (i10 | 105);
        f53717a = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr3 = (long[]) auw.setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
        auw.setOnFocusChangeListener(new Object[]{jArr, jArr2}, -1339481376, 1339481391, (int) System.currentTimeMillis());
        int i13 = f53717a;
        int i14 = i13 & 69;
        int i15 = i14 + ((i13 ^ 69) | i14);
        f53718b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 1;
        while (i17 < 113) {
            int i18 = f53718b;
            int i19 = ((i18 ^ 63) | (i18 & 63)) << 1;
            int i20 = -(((~i18) & 63) | (i18 & (-64)));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            f53717a = i21 % 128;
            if (i21 % 2 != 0) {
                setOnFocusChangeListener(new Object[]{jArr2, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr2, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr, jArr2}, -1451086950, 1451086957, (int) System.currentTimeMillis());
                int i22 = i17 & 100;
                i17 = ((i17 | 100) & (~i22)) + (i22 << 1);
            } else {
                setOnFocusChangeListener(new Object[]{jArr2, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr2, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr, jArr2}, -1451086950, 1451086957, (int) System.currentTimeMillis());
                int i23 = i17 & 2;
                i17 = i23 + ((i17 ^ 2) | i23);
            }
            int i24 = f53718b + 107;
            f53717a = i24 % 128;
            int i25 = i24 % 2;
        }
        int i26 = f53717a;
        int i27 = (i26 ^ 24) + ((i26 & 24) << 1);
        int i28 = (i27 ^ (-1)) + (i27 << 1);
        f53718b = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 84 / 0;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr2 = (long[]) objArr[2];
        int i10 = f53717a + 120;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f53718b = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr3 = (long[]) auw.setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
        int i13 = f53718b;
        int i14 = (((i13 | 124) << 1) - (i13 ^ 124)) - 1;
        while (true) {
            f53717a = i14 % 128;
            int i15 = i14 % 2;
            int i16 = iIntValue & (-16);
            int i17 = (((iIntValue ^ (-16)) | i16) << 1) - ((iIntValue | (-16)) & (~i16));
            int i18 = i17 ^ 15;
            int i19 = ((i17 & 15) | i18) << 1;
            int i20 = -i18;
            iIntValue = (i19 ^ i20) + ((i19 & i20) << 1);
            if (iIntValue <= 0) {
                break;
            }
            int i21 = f53718b;
            int i22 = i21 ^ 21;
            int i23 = ((i21 & 21) | i22) << 1;
            int i24 = -i22;
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            f53717a = i25 % 128;
            int i26 = i25 % 2;
            setOnFocusChangeListener(new Object[]{jArr2, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
            int i27 = f53718b;
            int i28 = i27 & 85;
            i14 = (((i27 ^ 85) | i28) << 1) - ((i27 | 85) & (~i28));
        }
        int i29 = f53717a;
        int i30 = (i29 | 99) << 1;
        int i31 = -(i29 ^ 99);
        int i32 = (i30 ^ i31) + ((i31 & i30) << 1);
        f53718b = i32 % 128;
        if (i32 % 2 == 0) {
            int i33 = 5 / 0;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53718b;
        int i11 = (((i10 | 93) << 1) - (~(-(((~i10) & 93) | (i10 & (-94)))))) - 1;
        f53717a = i11 % 128;
        if (i11 % 2 != 0) {
            long[] jArr3 = (long[]) auw.setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr3, jArr2}, -1848361404, 1848361404, (int) System.currentTimeMillis());
            int i12 = 51 / 0;
        } else {
            long[] jArr4 = (long[]) auw.setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr4}, 1183329762, -1183329753, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr4, jArr2}, -1848361404, 1848361404, (int) System.currentTimeMillis());
        }
        int i13 = f53718b + 111;
        f53717a = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53717a + 59;
        f53718b = i10 % 128;
        int i11 = i10 % 2;
        long[] jArr4 = new long[8];
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr4}, 1709766941, -1709766929, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -1848361404, 1848361404, (int) System.currentTimeMillis());
        int i12 = f53717a;
        int i13 = i12 & 33;
        int i14 = (((i12 ^ 33) | i13) << 1) - ((i12 | 33) & (~i13));
        f53718b = i14 % 128;
        if (i14 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object e(Object[] objArr) {
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i10 = f53717a;
        int i11 = ((i10 & 24) + (i10 | 24)) - 1;
        f53718b = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr = (long[]) auy.setOnFocusChangeListener(new Object[]{113, bigInteger}, 1678029135, -1678029124, 113);
        int i13 = f53717a;
        int i14 = ((i13 | 87) << 1) - (((~i13) & 87) | (i13 & (-88)));
        f53718b = i14 % 128;
        if (i14 % 2 != 0) {
            return jArr;
        }
        throw null;
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53717a;
        int i11 = ((i10 | 1) << 1) - (i10 ^ 1);
        f53718b = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr3 = (long[]) auw.setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr, jArr3}, 1183329762, -1183329753, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
        int i13 = f53718b;
        int i14 = i13 ^ 75;
        int i15 = ((i13 & 75) | i14) << 1;
        int i16 = -i14;
        int i17 = (i15 & i16) + (i15 | i16);
        f53717a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 28 / 0;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53717a;
        int i11 = i10 & 13;
        int i12 = -(-((i10 ^ 13) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53718b = i13 % 128;
        int i14 = i13 % 2;
        long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[0])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
        long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[1])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
        long j10 = (4294967295L & jLongValue) | (jLongValue2 << 32);
        long j11 = (jLongValue2 & (-4294967296L)) | (jLongValue >>> 32);
        jArr2[0] = (j10 ^ (j11 << 57)) ^ (j11 << 5);
        jArr2[1] = (j11 >>> 59) ^ (j11 >>> 7);
        int i15 = f53717a;
        int i16 = i15 & 107;
        int i17 = (i16 - (~(-(-((i15 ^ 107) | i16))))) - 1;
        f53718b = i17 % 128;
        if (i17 % 2 == 0) {
            int i18 = 6 / 0;
        }
    }

    public static /* synthetic */ Integer h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f53718b + 101;
        int i11 = i10 % 128;
        f53717a = i11;
        int i12 = ((int) (i10 % 2 != 0 ? jArr[0] : jArr[0])) & 1;
        int i13 = i11 & 57;
        int i14 = i13 + ((i11 ^ 57) | i13);
        f53718b = i14 % 128;
        if (i14 % 2 != 0) {
            return Integer.valueOf(i12);
        }
        throw null;
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, int i10, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i10), jArr2}, 1533568612, -1533568608, i10);
    }

    public static int setDividerPadding(long[] jArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{jArr}, 834423774, -834423772, (int) System.currentTimeMillis())).intValue();
    }

    public static void setOnDragListener(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 1914883636, -1914883621, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = i11 | i12;
        switch (((i13 | i14) * 465) + ((i11 | (~(i13 | i12))) * 930) + (((~i14) | i13) * (-465)) + (i11 * (-929)) + (i10 * (-464))) {
            case 1:
                g(objArr);
                return null;
            case 2:
                return h(objArr);
            case 3:
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                int i15 = f53717a + 107;
                int i16 = i15 % 128;
                f53718b = i16;
                int i17 = i15 % 2;
                jArr2[0] = jArr[0] ^ 1;
                jArr2[1] = jArr[1];
                int i18 = i16 | 83;
                int i19 = i18 << 1;
                int i20 = -(i18 & (~(i16 & 83)));
                int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
                f53717a = i21 % 128;
                int i22 = i21 % 2;
                return null;
            case 4:
                b(objArr);
                return null;
            case 5:
                long[] jArr3 = (long[]) objArr[0];
                long[] jArr4 = (long[]) objArr[1];
                long[] jArr5 = (long[]) objArr[2];
                int i23 = f53718b;
                int i24 = (((i23 | 8) << 1) - (i23 ^ 8)) - 1;
                f53717a = i24 % 128;
                int i25 = i24 % 2;
                jArr5[0] = jArr3[0] ^ jArr4[0];
                jArr5[1] = jArr3[1] ^ jArr4[1];
                int i26 = i23 + 35;
                f53717a = i26 % 128;
                int i27 = i26 % 2;
                return null;
            case 6:
                return e(objArr);
            case 7:
                long[] jArr6 = (long[]) objArr[0];
                long[] jArr7 = (long[]) objArr[1];
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i28 = ~iCurrentTimeMillis;
                int i29 = (-1871855729) & i28;
                int i30 = ((-1871855729) | i28) & (~i29);
                int i31 = ~((i30 & i29) | (i30 ^ i29));
                int i32 = ((~i31) & 177225792) | ((-177225793) & i31);
                int i33 = i31 & 177225792;
                int i34 = (i33 & i32) | (i32 ^ i33);
                int i35 = ((-275102085) & i28) | (275102084 & iCurrentTimeMillis);
                int i36 = iCurrentTimeMillis & (-275102085);
                int i37 = ~((i36 & i35) | (i35 ^ i36));
                int i38 = ((~i37) & i34) | ((~i34) & i37);
                int i39 = i34 & i37;
                int i40 = (-1324841926) - (~(((i39 & i38) | (i38 ^ i39)) * (-502)));
                int i41 = i28 ^ (-1871855729);
                int i42 = (i41 & i29) | (i41 ^ i29);
                int i43 = i42 ^ (-1969732021);
                int i44 = i42 & (-1969732021);
                int i45 = (i44 & i43) | (i43 ^ i44);
                int i46 = ~i45;
                int i47 = (i45 | i46) & i46;
                int i48 = i47 ^ i37;
                int i49 = i37 & i47;
                int i50 = ((i49 & i48) | (i48 ^ i49)) * 502;
                int i51 = i40 & i50;
                int i52 = (i50 ^ i40) | i51;
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i54 = ~iCurrentTimeMillis2;
                int i55 = 1867944234 & i54;
                int i56 = (iCurrentTimeMillis2 & (-1867944235)) | i55;
                int i57 = 1867944234 & iCurrentTimeMillis2;
                int i58 = (i56 & i57) | (i56 ^ i57);
                int i59 = ~i58;
                int i60 = (i58 | i59) & i59;
                int i61 = ((~i60) & 8407557) | ((-8407558) & i60);
                int i62 = i60 & 8407557;
                int i63 = ((i62 & i61) | (i61 ^ i62)) * (-280);
                int i64 = (407400961 & i63) + (i63 | 407400961);
                int i65 = (260102671 & i54) | ((-260102672) & iCurrentTimeMillis2);
                int i66 = 260102671 & iCurrentTimeMillis2;
                int i67 = ~((i66 & i65) | (i65 ^ i66));
                int i68 = i59 & i67;
                int i69 = (i67 | i59) & (~i68);
                int i70 = -(-(((i69 & i68) | (i69 ^ i68)) * 140));
                int i71 = i64 ^ i70;
                int i72 = -(-((i70 & i64) << 1));
                int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                int i74 = (1876351791 & i54) | ((-1876351792) & iCurrentTimeMillis2);
                int i75 = 1876351791 & iCurrentTimeMillis2;
                int i76 = ~((i75 & i74) | (i74 ^ i75));
                int i77 = 1867944234 ^ i54;
                int i78 = (i55 & i77) | (i77 ^ i55);
                int i79 = ~((i78 & (-260102672)) | (i78 ^ (-260102672)));
                int i80 = (i79 & i76) | (i76 ^ i79);
                int i81 = (iCurrentTimeMillis2 | i54) & i54;
                int i82 = 260102671 & i81;
                int i83 = (i81 | 260102671) & (~i82);
                int i84 = (i83 & i82) | (i83 ^ i82);
                int i85 = (i84 & 1867944234) | ((~i84) & (-1867944235));
                int i86 = i84 & (-1867944235);
                int i87 = ~((i86 & i85) | (i85 ^ i86));
                if (i53 <= (((i87 & i80) | (i80 ^ i87)) * 140) + i73) {
                    long j10 = jArr7[0] * jArr6[1];
                    jArr7[0] = j10;
                    jArr7[0] = j10 | jArr6[0];
                } else {
                    jArr7[0] = jArr7[0] ^ jArr6[0];
                    jArr7[1] = jArr7[1] ^ jArr6[1];
                }
                int i88 = f53717a;
                int i89 = (((i88 ^ 91) | (i88 & 91)) << 1) - (((~i88) & 91) | (i88 & (-92)));
                f53718b = i89 % 128;
                int i90 = i89 % 2;
                return null;
            case 8:
                c(objArr);
                return null;
            case 9:
                long[] jArr8 = (long[]) objArr[0];
                long[] jArr9 = (long[]) objArr[1];
                int i91 = f53717a;
                int i92 = i91 & 9;
                int i93 = (i91 | 9) & (~i92);
                int i94 = i92 << 1;
                int i95 = (i93 & i94) + (i93 | i94);
                f53718b = i95 % 128;
                Object[] objArr2 = new Object[4];
                if (i95 % 2 == 0) {
                    objArr2[0] = jArr8;
                    objArr2[1] = 2;
                    objArr2[2] = jArr9;
                    objArr2[3] = 0;
                    auu.setCompoundDrawableTintBlendMode(objArr2, 1056168849, -1056168849, 2);
                } else {
                    objArr2[0] = jArr8;
                    objArr2[1] = 2;
                    objArr2[2] = jArr9;
                    objArr2[3] = 0;
                    auu.setCompoundDrawableTintBlendMode(objArr2, 1056168849, -1056168849, 2);
                }
                int i96 = f53717a + 77;
                f53718b = i96 % 128;
                int i97 = i96 % 2;
                return null;
            case 10:
                long[] jArr10 = (long[]) objArr[0];
                long jLongValue = ((Number) objArr[1]).longValue();
                long jLongValue2 = ((Number) objArr[2]).longValue();
                long[] jArr11 = (long[]) objArr[3];
                int iIntValue = ((Number) objArr[4]).intValue();
                int i98 = f53718b + 31;
                int i99 = i98 % 128;
                f53717a = i99;
                int i100 = i98 % 2;
                jArr10[1] = jLongValue2;
                long j11 = jLongValue2 << 1;
                jArr10[2] = j11;
                long j12 = j11 ^ jLongValue2;
                jArr10[3] = j12;
                long j13 = jLongValue2 << 2;
                jArr10[4] = j13;
                jArr10[5] = j13 ^ jLongValue2;
                long j14 = j12 << 1;
                jArr10[6] = j14;
                jArr10[7] = j14 ^ jLongValue2;
                long j15 = jArr10[((int) jLongValue) & 7];
                int i101 = (i99 ^ 83) + ((i99 & 83) << 1);
                f53718b = i101 % 128;
                int i102 = i101 % 2;
                int i103 = 48;
                long j16 = 0;
                do {
                    int i104 = (int) (jLongValue >>> i103);
                    long j17 = (jArr10[i104 & 7] ^ (jArr10[(i104 >>> 3) & 7] << 3)) ^ (jArr10[(i104 >>> 6) & 7] << 6);
                    j15 ^= j17 << i103;
                    j16 ^= j17 >>> (-i103);
                    int i105 = i103 & (-25);
                    int i106 = ((((i103 ^ (-25)) | i105) << 1) - (~(-((i103 | (-25)) & (~i105))))) - 1;
                    i103 = (((i106 ^ 16) | (i106 & 16)) << 1) - (((~i106) & 16) | (i106 & (-17)));
                } while (i103 > 0);
                int i107 = f53717a;
                int i108 = (-2) - ((((i107 | 48) << 1) - (i107 ^ 48)) ^ (-1));
                f53718b = i108 % 128;
                int i109 = i108 % 2;
                jArr11[iIntValue] = j15 & 144115188075855871L;
                int i110 = (iIntValue * (-885)) + 1773;
                int i111 = ~iIntValue;
                int i112 = ~i111;
                int i113 = i111 & 1;
                int i114 = ((-2) & i112) | i113;
                int i115 = (-2) & i111;
                int i116 = ~((i115 & i114) | (i114 ^ i115));
                int i117 = (i112 & iIntValue) | (i111 & i111);
                int i118 = i111 & iIntValue;
                int i119 = ~((i117 ^ i118) | (i117 & i118));
                int i120 = ((~i116) & i119) | ((~i119) & i116);
                int i121 = i116 & i119;
                int i122 = (i120 & i121) | (i120 ^ i121);
                int i123 = (i111 ^ 1) | i113;
                int i124 = i123 & iIntValue;
                int i125 = (i123 | iIntValue) & (~i124);
                int i126 = ~((i125 & i124) | (i125 ^ i124));
                int i127 = ((~i126) & i122) | ((~i122) & i126);
                int i128 = i122 & i126;
                int i129 = -(-(((i128 & i127) | (i127 ^ i128)) * 886));
                int i130 = i110 ^ i129;
                int i131 = (((i129 & i110) | i130) << 1) - i130;
                int i132 = i117 | i118;
                int i133 = ~i132;
                int i134 = (i132 | i133) & i133;
                int i135 = i134 ^ 1;
                int i136 = i134 & 1;
                int i137 = -(~(-(-(((i136 & i135) | (i135 ^ i136)) * (-1772)))));
                int i138 = ((i131 ^ i137) + ((i131 & i137) << 1)) - 1;
                int i139 = (~i113) & (i111 | 1);
                jArr11[((~((i139 & i113) | (i139 ^ i113))) * 886) + i138] = ((j16 ^ (((jLongValue & 72198606942111744L) & ((jLongValue2 << 7) >> 63)) >>> 8)) << 7) ^ (j15 >>> 57);
                int i140 = i107 & 71;
                int i141 = ((((i107 ^ 71) | i140) << 1) - (~(-((i107 | 71) & (~i140))))) - 1;
                f53718b = i141 % 128;
                int i142 = i141 % 2;
                return null;
            case 11:
                d(objArr);
                return null;
            case 12:
                long[] jArr12 = (long[]) objArr[0];
                long[] jArr13 = (long[]) objArr[1];
                long[] jArr14 = (long[]) objArr[2];
                int i143 = f53718b;
                int i144 = i143 & 89;
                int i145 = -(-((i143 ^ 89) | i144));
                int i146 = ((i144 | i145) << 1) - (i144 ^ i145);
                f53717a = i146 % 128;
                int i147 = i146 % 2;
                long j18 = jArr12[0];
                long j19 = ((j18 >>> 57) ^ (jArr12[1] << 7)) & 144115188075855871L;
                long j20 = j18 & 144115188075855871L;
                long j21 = jArr13[0];
                long j22 = ((j21 >>> 57) ^ (jArr13[1] << 7)) & 144115188075855871L;
                long j23 = j21 & 144115188075855871L;
                long[] jArr15 = new long[6];
                setOnFocusChangeListener(new Object[]{jArr14, Long.valueOf(j20), Long.valueOf(j23), jArr15, 0}, -1917110859, 1917110869, 0);
                setOnFocusChangeListener(new Object[]{jArr14, Long.valueOf(j19), Long.valueOf(j22), jArr15, 2}, -1917110859, 1917110869, 2);
                setOnFocusChangeListener(new Object[]{jArr14, Long.valueOf(j20 ^ j19), Long.valueOf(j23 ^ j22), jArr15, 4}, -1917110859, 1917110869, 4);
                long j24 = jArr15[1] ^ jArr15[2];
                long j25 = jArr15[0];
                long j26 = jArr15[3];
                long j27 = (jArr15[4] ^ j25) ^ j24;
                long j28 = (jArr15[5] ^ j26) ^ j24;
                jArr14[0] = j25 ^ (j27 << 57);
                jArr14[1] = (j27 >>> 7) ^ (j28 << 50);
                jArr14[2] = (j28 >>> 14) ^ (j26 << 43);
                jArr14[3] = j26 >>> 21;
                int i148 = f53718b;
                int i149 = i148 & 11;
                int i150 = ((i148 | 11) & (~i149)) + (i149 << 1);
                f53717a = i150 % 128;
                int i151 = i150 % 2;
                return null;
            case 13:
                a(objArr);
                return null;
            case 14:
                long[] jArr16 = (long[]) objArr[0];
                long[] jArr17 = (long[]) objArr[1];
                int i152 = f53718b;
                int i153 = ((i152 | 119) << 1) - (i152 ^ 119);
                int i154 = i153 % 128;
                f53717a = i154;
                int i155 = i153 % 2;
                long j29 = jArr16[0];
                long j30 = jArr16[1];
                long j31 = jArr16[2];
                long j32 = jArr16[3];
                long j33 = j30 ^ ((j32 << 15) ^ (j32 << 24));
                long j34 = j31 ^ ((j32 >>> 49) ^ (j32 >>> 40));
                long j35 = j29 ^ ((j34 << 15) ^ (j34 << 24));
                long j36 = j33 ^ ((j34 >>> 49) ^ (j34 >>> 40));
                long j37 = j36 >>> 49;
                jArr17[0] = (j35 ^ j37) ^ (j37 << 9);
                jArr17[1] = 562949953421311L & j36;
                int i156 = ((i154 ^ 50) + ((i154 & 50) << 1)) - 1;
                f53718b = i156 % 128;
                int i157 = i156 % 2;
                return null;
            case 15:
                f(objArr);
                return null;
            case 16:
                long[] jArr18 = (long[]) objArr[0];
                long[] jArr19 = (long[]) objArr[1];
                long[] jArr20 = (long[]) objArr[2];
                int i158 = f53718b;
                int i159 = i158 & 105;
                int i160 = ((((i158 ^ 105) | i159) << 1) - (~(-((i158 | 105) & (~i159))))) - 1;
                f53717a = i160 % 128;
                if (i160 % 2 != 0) {
                    long[] jArr21 = new long[84];
                    setOnFocusChangeListener(new Object[]{jArr18, jArr19, jArr21}, 1709766941, -1709766929, (int) System.currentTimeMillis());
                    setOnFocusChangeListener(new Object[]{jArr21, jArr20}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                    return null;
                }
                long[] jArr22 = new long[8];
                setOnFocusChangeListener(new Object[]{jArr18, jArr19, jArr22}, 1709766941, -1709766929, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr22, jArr20}, 2114234539, -2114234525, (int) System.currentTimeMillis());
                return null;
            case 17:
                long[] jArr23 = (long[]) objArr[0];
                long[] jArr24 = (long[]) objArr[1];
                int i161 = f53717a + 111;
                f53718b = i161 % 128;
                int i162 = i161 % 2;
                if (((Boolean) auw.setOnFocusChangeListener(new Object[]{jArr23}, -1950202807, 1950202829, (int) System.currentTimeMillis())).booleanValue()) {
                    throw new IllegalStateException();
                }
                long[] jArr25 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                long[] jArr26 = (long[]) auw.setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr23, jArr25}, 1914883636, -1914883621, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr25, jArr23, jArr25}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr25, jArr25}, 1914883636, -1914883621, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr25, jArr23, jArr25}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr25, 3, jArr26}, 1533568612, -1533568608, 3);
                setOnFocusChangeListener(new Object[]{jArr26, jArr25, jArr26}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr26, jArr26}, 1914883636, -1914883621, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr26, jArr23, jArr26}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr26, 7, jArr25}, 1533568612, -1533568608, 7);
                setOnFocusChangeListener(new Object[]{jArr25, jArr26, jArr25}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr25, 14, jArr26}, 1533568612, -1533568608, 14);
                setOnFocusChangeListener(new Object[]{jArr26, jArr25, jArr26}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr26, 28, jArr25}, 1533568612, -1533568608, 28);
                setOnFocusChangeListener(new Object[]{jArr25, jArr26, jArr25}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr25, 56, jArr26}, 1533568612, -1533568608, 56);
                setOnFocusChangeListener(new Object[]{jArr26, jArr25, jArr26}, -834024073, 834024089, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr26, jArr24}, 1914883636, -1914883621, (int) System.currentTimeMillis());
                int i163 = f53717a;
                int i164 = i163 & 57;
                int i165 = (i163 | 57) & (~i164);
                int i166 = i164 << 1;
                int i167 = (i165 & i166) + (i165 | i166);
                f53718b = i167 % 128;
                int i168 = i167 % 2;
                return null;
            default:
                long[] jArr27 = (long[]) objArr[0];
                long[] jArr28 = (long[]) objArr[1];
                long[] jArr29 = (long[]) objArr[2];
                int i169 = f53718b;
                int i170 = i169 & 99;
                int i171 = (i169 ^ 99) | i170;
                int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                int i173 = i172 % 128;
                f53717a = i173;
                int i174 = i172 % 2;
                jArr29[0] = jArr27[0] ^ jArr28[0];
                jArr29[1] = jArr27[1] ^ jArr28[1];
                jArr29[2] = jArr27[2] ^ jArr28[2];
                jArr29[3] = jArr28[3] ^ jArr27[3];
                int i175 = (i173 & 98) + (i173 | 98);
                int i176 = (i175 ^ (-1)) + (i175 << 1);
                f53718b = i176 % 128;
                int i177 = i176 % 2;
                return null;
        }
    }

    public static void setOnLongClickListener(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 175366159, -175366151, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 2114234539, -2114234525, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -325621027, 325621040, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, -1240715377, 1240715388, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 1948026200, -1948026197, (int) System.currentTimeMillis());
    }

    public static long[] setY(BigInteger bigInteger) {
        return (long[]) setOnFocusChangeListener(new Object[]{bigInteger}, 1275615993, -1275615987, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -1215063950, 1215063967, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, -1489277526, 1489277531, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 1015272824, -1015272823, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, -834024073, 834024089, (int) System.currentTimeMillis());
    }
}
