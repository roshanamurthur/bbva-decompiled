package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atr {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53845b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long[] f53844a = {3161836309350906777L, -7642453882179322845L, -3821226941089661423L, 7312758566309945096L, -556661012383879292L, 8945041530681231562L, -4750851271514160027L, 6847946401097695794L, 541669439031730457L};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53846c = 113 % 128;

    static {
        if (113 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object a(Object[] objArr) {
        long[] jArr;
        int i10;
        char c10;
        long[] jArr2 = (long[]) objArr[0];
        int i11 = f53845b;
        int i12 = (i11 ^ 61) + ((i11 & 61) << 1);
        f53846c = i12 % 128;
        if (i12 % 2 == 0) {
            jArr = new long[3570];
            System.arraycopy(jArr2, 1, jArr, 86, 47);
            i10 = 122;
        } else {
            jArr = new long[288];
            System.arraycopy(jArr2, 0, jArr, 9, 9);
            i10 = 7;
        }
        int i13 = f53846c + 21;
        f53845b = i13 % 128;
        int i14 = i13 % 2;
        int i15 = 0;
        while (i10 > 0) {
            int i16 = f53845b;
            int i17 = i16 & 61;
            int i18 = -(-((i16 ^ 61) | i17));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            f53846c = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = (i15 ^ 49) + ((i15 & 49) << 1);
                int i21 = (i20 ^ (-1)) | i20;
                int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
                ((Long) auy.setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i22), 1L, jArr, Integer.valueOf(i20)}, 965229704, -965229690, i22)).longValue();
                setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i20)}, 1261767183, -1261767173, i20);
                setOnFocusChangeListener(new Object[]{jArr, jArr, Integer.valueOf(i20), jArr, Integer.valueOf(((i20 ^ 40) - (~(-(-((i20 & 40) << 1))))) - 1)}, 362179533, -362179511, i20);
                i10 = (((i10 | 68) << 1) - (i10 ^ 68)) - 1;
                i15 = i20;
                c10 = '\t';
            } else {
                int i23 = ((i15 & 18) - (~(i15 | 18))) - 1;
                int i24 = i23 >>> 1;
                ((Long) auy.setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i24), 0L, jArr, Integer.valueOf(i23)}, 965229704, -965229690, i24)).longValue();
                setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i23)}, 1261767183, -1261767173, i23);
                c10 = '\t';
                setOnFocusChangeListener(new Object[]{jArr, jArr, Integer.valueOf(i23), jArr, Integer.valueOf(((i23 & (-10)) | ((~i23) & 9)) + ((i23 & 9) << 1))}, 362179533, -362179511, i23);
                i10--;
                i15 = i23;
            }
            int i25 = f53846c;
            int i26 = ((i25 ^ 85) | (i25 & 85)) << 1;
            int i27 = -(((~i25) & 85) | (i25 & (-86)));
            int i28 = (i26 & i27) + (i27 | i26);
            f53845b = i28 % 128;
            int i29 = i28 % 2;
        }
        ((Long) auy.setOnFocusChangeListener(new Object[]{jArr, 0L, jArr}, -1779800300, 1779800329, (int) System.currentTimeMillis())).longValue();
        int i30 = f53845b;
        int i31 = ((((i30 ^ 101) | (i30 & 101)) << 1) - (~(-(((~i30) & 101) | (i30 & (-102)))))) - 1;
        f53846c = i31 % 128;
        if (i31 % 2 != 0) {
            return jArr;
        }
        throw null;
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53845b;
        int i11 = ((i10 | 111) << 1) - (i10 ^ 111);
        f53846c = i11 % 128;
        if (i11 % 2 != 0) {
            long[] jArr3 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr3, jArr2}, -80511834, 80511836, (int) System.currentTimeMillis());
        } else {
            long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr4}, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr4, jArr2}, -80511834, 80511836, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int i10 = 0;
        long[] jArr = (long[]) objArr[0];
        int i11 = 1;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i12 = 2;
        long[] jArr2 = (long[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        long[] jArr3 = (long[]) objArr[4];
        int iIntValue3 = ((Number) objArr[5]).intValue();
        int i13 = f53845b;
        int i14 = ((i13 | 33) << 1) - (i13 ^ 33);
        int i15 = i14 % 128;
        f53846c = i15;
        int i16 = i14 % 2;
        int i17 = i15 & 67;
        int i18 = (i15 | 67) & (~i17);
        int i19 = i17 << 1;
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        f53845b = i20 % 128;
        int i21 = i20 % 2;
        while (i10 < 9) {
            int i22 = f53845b;
            int i23 = (i22 & 27) + (i22 | 27);
            f53846c = i23 % 128;
            int i24 = i23 % i12;
            int i25 = i10 * 253;
            int i26 = -(-(iIntValue3 * 253));
            int i27 = i25 & i26;
            int i28 = (i25 | i26) & (~i27);
            int i29 = i27 << 1;
            int i30 = ((i28 | i29) << i11) - (i28 ^ i29);
            int i31 = ~i10;
            int i32 = (i31 | i10) & i31;
            int i33 = ~iIntValue3;
            int i34 = i32 & i33;
            int i35 = (~i34) & (i32 | i33);
            int i36 = (i34 & i35) | (i35 ^ i34);
            int i37 = ~i36;
            int i38 = (i36 | i37) & i37;
            int i39 = ~iIntValue;
            int i40 = i33 & i39;
            int i41 = (~i40) & (i33 | i39);
            int i42 = ~((i41 ^ i40) | (i41 & i40));
            int i43 = (i42 & i38) | (i38 ^ i42);
            int i44 = i10 & iIntValue3;
            int i45 = (i10 ^ iIntValue3) | i44;
            int i46 = ~((i45 & i39) | ((~i45) & iIntValue) | (i45 & iIntValue));
            int i47 = ((i46 & i43) | (i43 ^ i46)) * (-252);
            int i48 = i30 & i47;
            int i49 = ((i30 ^ i47) | i48) << 1;
            int i50 = -((i47 | i30) & (~i48));
            int i51 = (i49 & i50) + (i50 | i49);
            int i52 = -(-((((~i44) & (i10 | iIntValue3)) | i44) * (-252)));
            int i53 = i51 & i52;
            int i54 = (i52 | i51) & (~i53);
            int i55 = i53 << 1;
            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
            int i57 = (i33 | iIntValue3) & i33;
            int i58 = (i57 & i39) | (i57 ^ i39);
            int i59 = i58 ^ i10;
            int i60 = i58 & i10;
            int i61 = ~((i60 & i59) | (i59 ^ i60));
            int i62 = (i10 & i33) | (iIntValue3 & i31);
            int i63 = (i62 & i44) | (i62 ^ i44);
            int i64 = i63 & iIntValue;
            int i65 = (i63 | iIntValue) & (~i64);
            int i66 = (i65 & i64) | (i65 ^ i64);
            int i67 = ~i66;
            int i68 = (i66 | i67) & i67;
            int i69 = ((~i68) & i61) | ((~i61) & i68);
            int i70 = i61 & i68;
            int i71 = -(-(((i70 & i69) | (i69 ^ i70)) * 252));
            int i72 = i56 & i71;
            int i73 = ((i56 ^ i71) | i72) << 1;
            int i74 = -((i71 | i56) & (~i72));
            int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
            long j10 = jArr3[i75];
            int i76 = i10 * (-167);
            int i77 = iIntValue * (-167);
            int i78 = i76 ^ i77;
            int i79 = -(-((i76 & i77) << 1));
            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
            int i81 = i32 & i39;
            int i82 = (i32 | i39) & (~i81);
            int i83 = (i81 & i82) | (i82 ^ i81);
            int i84 = ~i83;
            int i85 = (i83 | i84) & i84;
            int i86 = (i39 | iIntValue) & i39;
            int i87 = i86 ^ i86;
            int i88 = i86 & i86;
            int i89 = ~((i87 & i88) | (i87 ^ i88));
            int i90 = ((~i89) & i85) | ((~i85) & i89);
            int i91 = i85 & i89;
            int i92 = (i80 - (~(-(-(((i91 & i90) | (i90 ^ i91)) * 168))))) - 1;
            int i93 = i31 & i39;
            int i94 = (i31 ^ i39) | i93;
            int i95 = (i94 & i39) | ((~i94) & iIntValue);
            int i96 = i94 & iIntValue;
            int i97 = -(-((~((i96 & i95) | (i95 ^ i96))) * 168));
            int i98 = i92 & i97;
            int i99 = (((i92 ^ i97) | i98) << 1) - ((i97 | i92) & (~i98));
            int i100 = i31 & i86;
            int i101 = (~i100) & (i86 | i31);
            int i102 = ~((i100 & i101) | (i101 ^ i100));
            int i103 = ((~i31) & iIntValue) | i93;
            int i104 = i31 & iIntValue;
            int i105 = ~((i103 & i104) | (i103 ^ i104));
            int i106 = i102 ^ i105;
            int i107 = i102 & i105;
            int i108 = (i107 & i106) | (i106 ^ i107);
            int i109 = i39 & i10;
            int i110 = (~i109) & (i39 | i10);
            int i111 = (i109 & i110) | (i110 ^ i109);
            int i112 = i111 ^ iIntValue;
            int i113 = i111 & iIntValue;
            int i114 = ~((i113 & i112) | (i112 ^ i113));
            int i115 = i108 & i114;
            int i116 = (i108 | i114) & (~i115);
            int i117 = ((i116 & i115) | (i116 ^ i115)) * 168;
            int i118 = i99 & i117;
            int i119 = -(-((i117 ^ i99) | i118));
            long j11 = jArr[(i118 ^ i119) + ((i119 & i118) << 1)];
            int i120 = i10 * 50;
            int i121 = -(-(iIntValue2 * (-97)));
            int i122 = i120 ^ i121;
            int i123 = ((((i120 & i121) | i122) << 1) - (~(-i122))) - 1;
            int i124 = ~iIntValue2;
            int i125 = (i124 | iIntValue2) & i124;
            int i126 = i125 ^ i39;
            int i127 = i125 & i39;
            int i128 = (i126 ^ i127) | (i126 & i127);
            int i129 = ~i128;
            int i130 = (i128 | i129) & i129;
            int i131 = i125 & i10;
            long[] jArr4 = jArr;
            int i132 = (~i131) & (i125 | i10);
            int i133 = ~((i132 & i131) | (i132 ^ i131));
            int i134 = i130 & i133;
            int i135 = (i133 | i130) & (~i134);
            int i136 = -(-(((i135 & i134) | (i135 ^ i134)) * 98));
            int i137 = ((~i136) & i123) | ((~i123) & i136);
            int i138 = (i136 & i123) << 1;
            int i139 = (i137 & i138) + (i138 | i137);
            int i140 = (~i93) & (i31 | i39);
            int i141 = ~((i140 & i93) | (i140 ^ i93));
            int i142 = i124 ^ i141;
            int i143 = i141 & i124;
            int i144 = (i143 & i142) | (i142 ^ i143);
            int i145 = (i10 ^ iIntValue) | (i10 & iIntValue);
            int i146 = ~i145;
            int i147 = (i144 | ((i145 | i146) & i146)) * (-49);
            int i148 = i139 ^ i147;
            int i149 = ((((i147 & i139) | i148) << 1) - (~(-i148))) - 1;
            int i150 = ~(i124 | iIntValue);
            int i151 = (i10 ^ iIntValue2) | (i10 & iIntValue2);
            int i152 = ~i151;
            int i153 = (i151 | i152) & i152;
            int i154 = i150 & i153;
            int i155 = (i150 | i153) & (~i154);
            int i156 = ((i155 & i154) | (i155 ^ i154)) * 49;
            int i157 = i149 ^ i156;
            int i158 = (i149 & i156) << 1;
            jArr3[i75] = j10 ^ (j11 ^ jArr2[(i157 & i158) + (i158 | i157)]);
            int i159 = i10 & 57;
            i11 = 1;
            i10 = (((i10 | 57) & (~i159)) + (i159 << 1)) - 56;
            jArr = jArr4;
            i12 = 2;
        }
        int i160 = f53845b;
        int i161 = (i160 ^ 97) + ((i160 & 97) << i11);
        f53846c = i161 % 128;
        if (i161 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void d(Object[] objArr) {
        int i10 = 0;
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i11 = f53845b;
        int i12 = ((i11 | 89) << 1) - (i11 ^ 89);
        int i13 = i12 % 128;
        f53846c = i13;
        int i14 = i12 % 2;
        int i15 = i13 & 97;
        int i16 = -(-((i13 ^ 97) | i15));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f53845b = i17 % 128;
        int i18 = i17 % 2;
        while (i10 < 9) {
            int i19 = f53846c;
            int i20 = i19 & 89;
            int i21 = (i20 - (~(-(-((i19 ^ 89) | i20))))) - 1;
            f53845b = i21 % 128;
            if (i21 % 2 != 0) {
                jArr3[i10] = jArr3[i10] + (jArr[i10] & jArr2[i10]);
                int i22 = (i10 | (-64)) << 1;
                int i23 = -(((~i10) & (-64)) | (i10 & 63));
                int i24 = (i22 & i23) + (i23 | i22);
                int i25 = i24 & 121;
                int i26 = -(-((i24 ^ 121) | i25));
                i10 = (i25 & i26) + (i25 | i26);
            } else {
                jArr3[i10] = jArr3[i10] ^ (jArr[i10] ^ jArr2[i10]);
                int i27 = (((i10 ^ 111) | (i10 & 111)) << 1) - (((~i10) & 111) | (i10 & (-112)));
                i10 = ((i27 ^ (-110)) - (~((i27 & (-110)) << 1))) - 1;
            }
        }
        int i28 = f53845b + 91;
        f53846c = i28 % 128;
        if (i28 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr;
        long[] jArr2 = (long[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53846c;
        int i11 = i10 & 103;
        int i12 = i11 + ((i10 ^ 103) | i11);
        f53845b = i12 % 128;
        if (i12 % 2 != 0) {
            jArr = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr}, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, 1843581176, -1843581157, (int) System.currentTimeMillis());
            int i13 = 15 / 0;
        } else {
            jArr = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr}, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, 1843581176, -1843581157, (int) System.currentTimeMillis());
        }
        int i14 = f53845b;
        int i15 = i14 & 1;
        int i16 = ((((i14 ^ 1) | i15) << 1) - (~(-((i14 | 1) & (~i15))))) - 1;
        f53846c = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            iIntValue = (-2) - (iIntValue ^ (-1));
            if (iIntValue <= 0) {
                int i18 = f53846c;
                int i19 = i18 & 9;
                int i20 = (((i18 | 9) & (~i19)) - (~(i19 << 1))) - 1;
                f53845b = i20 % 128;
                if (i20 % 2 != 0) {
                    int i21 = 48 / 0;
                    return;
                }
                return;
            }
            int i22 = f53845b;
            int i23 = (i22 & 65) + (i22 | 65);
            f53846c = i23 % 128;
            Object[] objArr2 = new Object[2];
            if (i23 % 2 == 0) {
                objArr2[0] = jArr3;
                objArr2[1] = jArr;
                setOnFocusChangeListener(objArr2, 839511758, -839511758, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr, jArr3}, 1843581176, -1843581157, (int) System.currentTimeMillis());
                throw null;
            }
            objArr2[0] = jArr3;
            objArr2[1] = jArr;
            setOnFocusChangeListener(objArr2, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, 1843581176, -1843581157, (int) System.currentTimeMillis());
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53846c;
        int i11 = i10 & 83;
        int i12 = -(-((i10 ^ 83) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53845b = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr3 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
        avi.setDividerPadding(new Object[]{jArr, jArr2}, -1909593140, 1909593141, (int) System.currentTimeMillis());
        int i15 = f53845b + 39;
        f53846c = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 1;
        while (i17 < 571) {
            int i18 = f53846c;
            int i19 = (i18 | 9) << 1;
            int i20 = -(((~i18) & 9) | (i18 & (-10)));
            int i21 = (i19 & i20) + (i20 | i19);
            f53845b = i21 % 128;
            int i22 = i21 % 2;
            setOnFocusChangeListener(new Object[]{jArr2, jArr3}, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 1843581176, -1843581157, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr2, jArr3}, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 1843581176, -1843581157, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr2}, -926570558, 926570581, (int) System.currentTimeMillis());
            int i23 = ((i17 | 3) << 1) - (i17 ^ 3);
            i17 = (i23 ^ (-1)) + (i23 << 1);
            int i24 = f53846c;
            int i25 = ((i24 | 17) << 1) - (i24 ^ 17);
            f53845b = i25 % 128;
            int i26 = i25 % 2;
        }
        int i27 = f53845b;
        int i28 = ((i27 | 85) << 1) - (i27 ^ 85);
        f53846c = i28 % 128;
        if (i28 % 2 == 0) {
            int i29 = 36 / 0;
        }
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        long j10;
        long j11;
        long[] jArr = (long[]) objArr[0];
        int i10 = f53845b;
        int i11 = i10 & 107;
        int i12 = i10 | 107;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f53846c = i14;
        if (i13 % 2 == 0) {
            j10 = jArr[0] | (jArr[73] >>> 11);
            j11 = jArr[109] >> 40;
        } else {
            long j12 = jArr[0];
            long j13 = jArr[8];
            j10 = j12 ^ (j13 >>> 49);
            j11 = j13 >>> 57;
        }
        int i15 = ((int) (j10 ^ j11)) & 1;
        int i16 = (((i14 | 9) << 1) - (~(-(((~i14) & 9) | (i14 & (-10)))))) - 1;
        f53845b = i16 % 128;
        if (i16 % 2 == 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static void getNavBarTitleString(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 1068960675, -1068960651, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53846c;
        int i11 = i10 & 37;
        int i12 = (i11 - (~((i10 ^ 37) | i11))) - 1;
        f53845b = i12 % 128;
        int i13 = i12 % 2;
        if (((Boolean) avi.setDividerPadding(new Object[]{jArr}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue()) {
            throw new IllegalStateException();
        }
        long[] jArr3 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr5 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr, jArr5}, -310260428, 310260449, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr5, jArr3}, -310260428, 310260449, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, jArr4}, -310260428, 310260449, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, 2, jArr4}, 1331770537, -1331770517, 2);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, jArr5, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, 5, jArr4}, 1331770537, -1331770517, 5);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr4, 5, jArr4}, 1331770537, -1331770517, 5);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, 15, jArr4}, 1331770537, -1331770517, 15);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr5}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr5, 30, jArr3}, 1331770537, -1331770517, 30);
        setOnFocusChangeListener(new Object[]{jArr3, 30, jArr4}, 1331770537, -1331770517, 30);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, 60, jArr4}, 1331770537, -1331770517, 60);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr4, 60, jArr4}, 1331770537, -1331770517, 60);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, 180, jArr4}, 1331770537, -1331770517, 180);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr4, 180, jArr4}, 1331770537, -1331770517, 180);
        setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr3, jArr5, jArr2}, -253482889, 253482896, (int) System.currentTimeMillis());
        int i14 = f53846c;
        int i15 = (i14 ^ 43) + ((i14 & 43) << 1);
        f53845b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53845b;
        int i11 = i10 & 19;
        int i12 = i11 + ((i10 ^ 19) | i11);
        f53846c = i12 % 128;
        if (i12 % 2 != 0) {
            long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr4}, 1493585179, -1493585161, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr4, jArr3}, -80511834, 80511836, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr5}, 1493585179, -1493585161, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr5, jArr3}, -80511834, 80511836, (int) System.currentTimeMillis());
            int i13 = 0 / 0;
        }
    }

    public static /* synthetic */ void j(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53846c;
        int i11 = (i10 & 43) + (i10 | 43);
        f53845b = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr4}, 809554108, -809554103, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr4, jArr3}, 1843581176, -1843581157, (int) System.currentTimeMillis());
        int i13 = f53846c + 115;
        f53845b = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void k(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i10 = f53845b + 48;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f53846c = i11 % 128;
        if (i11 % 2 != 0) {
            long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr4}, 1493585179, -1493585161, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr4, jArr3}, 1843581176, -1843581157, (int) System.currentTimeMillis());
        } else {
            long[] jArr5 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr5}, 1493585179, -1493585161, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr5, jArr3}, 1843581176, -1843581157, (int) System.currentTimeMillis());
            throw null;
        }
    }

    public static /* synthetic */ void l(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53845b;
        int i11 = i10 & 113;
        int i12 = (i10 | 113) & (~i11);
        int i13 = i11 << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f53846c = i14 % 128;
        if (i14 % 2 == 0) {
            long[] jArr3 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr, jArr3}, 839511758, -839511758, (int) System.currentTimeMillis());
            setOnFocusChangeListener(new Object[]{jArr3, jArr2}, 1843581176, -1843581157, (int) System.currentTimeMillis());
            throw null;
        }
        long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr, jArr4}, 839511758, -839511758, (int) System.currentTimeMillis());
        setOnFocusChangeListener(new Object[]{jArr4, jArr2}, 1843581176, -1843581157, (int) System.currentTimeMillis());
        int i15 = f53846c;
        int i16 = i15 & 21;
        int i17 = (i15 | 21) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = (i17 & i18) + (i17 | i18);
        f53845b = i19 % 128;
        int i20 = i19 % 2;
    }

    public static /* synthetic */ void m(Object[] objArr) {
        int i10;
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i11 = 2;
        long[] jArr3 = (long[]) objArr[2];
        int i12 = f53845b;
        int i13 = i12 & 9;
        int i14 = i12 | 9;
        int i15 = (i13 & i14) + (i13 | i14);
        f53846c = i15 % 128;
        int i16 = i15 % 2 == 0 ? 125 : 56;
        int i17 = i12 & 15;
        int i18 = i17 + ((i12 ^ 15) | i17);
        f53846c = i18 % 128;
        int i19 = i18 % 2;
        while (true) {
            int i20 = 16;
            if (i16 < 0) {
                break;
            }
            int i21 = f53845b;
            int i22 = (((81 & (~i21)) | (i21 & (-82))) - (~((i21 & 81) << 1))) - 1;
            f53846c = i22 % 128;
            int i23 = i22 % i11 == 0 ? 0 : 1;
            int i24 = i21 + 109;
            f53846c = i24 % 128;
            int i25 = i24 % i11;
            for (int i26 = 9; i23 < i26; i26 = 9) {
                int i27 = f53845b;
                int i28 = (((i27 ^ 89) | (i27 & 89)) << 1) - ((i27 & (-90)) | (89 & (~i27)));
                f53846c = i28 % 128;
                int i29 = i28 % i11;
                int i30 = (int) (jArr[i23] >>> i16);
                int i31 = i30 & 15;
                int i32 = (i30 >>> 4) & 15;
                int i33 = i31 * i26;
                int i34 = (((i32 | 16) << 1) - (i32 ^ i20)) * 9;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i35 = -(~(-(-(i23 * (-661)))));
                int i36 = (((661 | i35) << 1) - (661 ^ i35)) - 1;
                int i37 = ~iCurrentTimeMillis;
                int i38 = ~i23;
                int i39 = ~i38;
                int i40 = i37 & i39;
                int i41 = (~i40) & (i39 | i37);
                int i42 = ((i41 & i40) | (i41 ^ i40)) * 1324;
                int i43 = (i36 & i42) + (i36 | i42);
                int i44 = (-1) ^ iCurrentTimeMillis;
                int i45 = ~((i44 & iCurrentTimeMillis) | (i44 ^ iCurrentTimeMillis));
                int i46 = ~((iCurrentTimeMillis & i23) | (i37 & i23) | (iCurrentTimeMillis & i38));
                int i47 = -(~(-(-(((i45 & i46) | (i45 ^ i46)) * (-1324)))));
                int i48 = (-2) - ((((i43 | i47) << 1) - (i47 ^ i43)) ^ (-1));
                int i49 = (i38 | i23) & i38;
                int i50 = ~i49;
                int i51 = (i49 & i50) | (i50 ^ i49);
                int i52 = ~i51;
                int i53 = (i51 | i52) & i52;
                int i54 = ((i53 & i38) | (i38 ^ i53)) * 662;
                setOnFocusChangeListener(new Object[]{jArr2, Integer.valueOf(i33), jArr2, Integer.valueOf(i34), jArr3, Integer.valueOf((i48 ^ i54) + ((i48 & i54) << 1))}, -1233274573, 1233274584, i33);
                i23 += 2;
                int i55 = f53846c;
                int i56 = i55 & 89;
                int i57 = (i55 ^ 89) | i56;
                int i58 = (i56 & i57) + (i57 | i56);
                f53845b = i58 % 128;
                i11 = 2;
                int i59 = i58 % 2;
                i20 = 16;
            }
            Object[] objArr2 = new Object[3];
            objArr2[0] = 16;
            objArr2[1] = jArr3;
            objArr2[i11] = 0L;
            ((Long) auy.setOnFocusChangeListener(objArr2, 1596686284, -1596686251, 16)).longValue();
            i16 = ((i16 | (-8)) << 1) - ((i16 & 7) | ((~i16) & (-8)));
            int i60 = f53846c;
            int i61 = (i60 | 45) << 1;
            int i62 = -(((~i60) & 45) | (i60 & (-46)));
            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
            f53845b = i63 % 128;
            int i64 = i63 % 2;
            i11 = 2;
        }
        int i65 = f53846c;
        int i66 = i65 & 65;
        int i67 = (i65 | 65) & (~i66);
        int i68 = i66 << 1;
        int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
        f53845b = i69 % 128;
        int i70 = 2;
        int i71 = i69 % 2;
        int i72 = 56;
        while (i72 >= 0) {
            int i73 = f53845b;
            int i74 = i73 + 121;
            f53846c = i74 % 128;
            int i75 = i74 % i70;
            int i76 = i73 + 51;
            f53846c = i76 % 128;
            int i77 = i76 % i70;
            int i78 = 0;
            int i79 = 9;
            while (i78 < i79) {
                int i80 = f53845b;
                int i81 = i80 ^ 1;
                int i82 = -(-((i80 & 1) << 1));
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f53846c = i83 % 128;
                if (i83 % 2 == 0) {
                    int i84 = (int) (jArr[i78] << i72);
                    int i85 = i84 & 97;
                    int i86 = i84 >>> 3;
                    int i87 = i85 >> 11;
                    int i88 = (i86 & 88) ^ (-107);
                    int i89 = -(-((i86 & 16) << 1));
                    setOnFocusChangeListener(new Object[]{jArr2, Integer.valueOf(i87), jArr2, Integer.valueOf(((i88 ^ i89) + ((i89 & i88) << 1)) * 20), jArr3, Integer.valueOf(i78)}, -1233274573, 1233274584, i87);
                    int i90 = i78 & 80;
                    int i91 = -(-((i78 ^ 80) | i90));
                    i78 = (i90 ^ i91) + ((i90 & i91) << 1);
                    i10 = 9;
                } else {
                    int i92 = (int) (jArr[i78] >>> i72);
                    i10 = 9;
                    int i93 = (i92 & 15) * 9;
                    int i94 = ((i92 >>> 4) & 15) | 16;
                    setOnFocusChangeListener(new Object[]{jArr2, Integer.valueOf(i93), jArr2, Integer.valueOf(((i94 << 1) - i94) * 9), jArr3, Integer.valueOf(i78)}, -1233274573, 1233274584, i93);
                    int i95 = i78 & (-40);
                    i78 = (-2) - (((((i78 | (-40)) & (~i95)) - (~(i95 << 1))) + 42) ^ (-1));
                }
                int i96 = f53845b;
                int i97 = i96 & 13;
                int i98 = -(-(i96 | 13));
                int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
                f53846c = i99 % 128;
                int i100 = i99 % 2;
                i79 = i10;
            }
            if (i72 > 0) {
                int i101 = f53845b;
                int i102 = ((i101 & 119) - (~(-(-(i101 | 119))))) - 1;
                f53846c = i102 % 128;
                int i103 = i102 % 2;
                ((Long) auy.setOnFocusChangeListener(new Object[]{18, jArr3, 0L}, 1596686284, -1596686251, 18)).longValue();
                int i104 = f53845b;
                int i105 = (((i104 | 14) << 1) - (i104 ^ 14)) - 1;
                f53846c = i105 % 128;
                int i106 = i105 % 2;
            }
            int i107 = ((i72 ^ (-8)) | (i72 & (-8))) << 1;
            int i108 = -(((~i72) & (-8)) | (i72 & 7));
            i72 = ((i107 | i108) << 1) - (i107 ^ i108);
            int i109 = f53845b;
            int i110 = i109 ^ 3;
            int i111 = ((i109 & 3) | i110) << 1;
            int i112 = -i110;
            int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
            f53846c = i113 % 128;
            int i114 = i113 % 2;
            i70 = 2;
        }
        int i115 = f53845b + 75;
        f53846c = i115 % 128;
        if (i115 % i70 == 0) {
            int i116 = 0 / 0;
        }
    }

    public static /* synthetic */ void n(Object[] objArr) {
        int i10;
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i11 = f53845b;
        int i12 = i11 & 75;
        int i13 = -(-((i11 ^ 75) | i12));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        f53846c = i15;
        if (i14 % 2 == 0) {
            jArr2[0] = jArr[0];
        } else {
            jArr2[0] = jArr[0] ^ 1;
        }
        int i16 = i15 & 11;
        int i17 = (((i15 | 11) & (~i16)) - (~(-(-(i16 << 1))))) - 1;
        f53845b = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 1;
        while (i19 < 9) {
            int i20 = f53846c;
            int i21 = (i20 & 29) + (i20 | 29);
            f53845b = i21 % 128;
            if (i21 % 2 != 0) {
                jArr2[i19] = jArr[i19];
                i10 = (i19 ^ 74) + ((i19 & 74) << 1);
            } else {
                jArr2[i19] = jArr[i19];
                i10 = (((i19 & (-129)) | ((~i19) & 128)) - (~(-(-((i19 & 128) << 1))))) - 128;
            }
            i19 = i10;
        }
        int i22 = f53846c + 93;
        f53845b = i22 % 128;
        if (i22 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object o(Object[] objArr) {
        BigInteger bigInteger = (BigInteger) objArr[0];
        int i10 = f53846c + 49;
        f53845b = i10 % 128;
        long[] jArr = (long[]) (i10 % 2 != 0 ? auy.setOnFocusChangeListener(new Object[]{25383, bigInteger}, 1678029135, -1678029124, 25383) : auy.setOnFocusChangeListener(new Object[]{571, bigInteger}, 1678029135, -1678029124, 571));
        int i11 = f53845b;
        int i12 = ((i11 ^ 41) | (i11 & 41)) << 1;
        int i13 = -(((~i11) & 41) | (i11 & (-42)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        f53846c = i14 % 128;
        if (i14 % 2 != 0) {
            return jArr;
        }
        throw null;
    }

    public static /* synthetic */ void p(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53845b;
        int i11 = ((i10 ^ 31) | (i10 & 31)) << 1;
        int i12 = -(((~i10) & 31) | (i10 & (-32)));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53846c = i13 % 128;
        if (i13 % 2 == 0) {
            auu.setCompoundDrawableTintBlendMode(new Object[]{jArr, 15, jArr2, 1}, 1056168849, -1056168849, 15);
        } else {
            auu.setCompoundDrawableTintBlendMode(new Object[]{jArr, 9, jArr2, 0}, 1056168849, -1056168849, 9);
        }
        int i14 = f53846c;
        int i15 = i14 & 53;
        int i16 = -(-((i14 ^ 53) | i15));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f53845b = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 14 / 0;
        }
    }

    public static /* synthetic */ void q(Object[] objArr) {
        int i10 = 0;
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        long[] jArr3 = (long[]) objArr[2];
        int i11 = f53846c;
        int i12 = ((i11 & (-88)) | ((~i11) & 87)) + ((i11 & 87) << 1);
        int i13 = i12 % 128;
        f53845b = i13;
        int i14 = i12 % 2;
        int i15 = (((i13 ^ 105) | (i13 & 105)) << 1) - (((~i13) & 105) | (i13 & (-106)));
        f53846c = i15 % 128;
        int i16 = i15 % 2;
        while (i10 < 9) {
            int i17 = f53845b;
            int i18 = ((i17 & 120) + (i17 | 120)) - 1;
            f53846c = i18 % 128;
            if (i18 % 2 == 0) {
                jArr3[i10] = jArr[i10] - jArr2[i10];
                i10 = (-2) - ((i10 + 114) ^ (-1));
            } else {
                jArr3[i10] = jArr[i10] ^ jArr2[i10];
                int i19 = ((i10 | (-64)) << 1) - (i10 ^ (-64));
                i10 = (i19 & 65) + (i19 | 65);
            }
        }
        int i20 = f53845b;
        int i21 = ((i20 & 70) + (i20 | 70)) - 1;
        f53846c = i21 % 128;
        if (i21 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void r(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        long jLongValue2 = ((Number) objArr[2]).longValue();
        long[] jArr2 = (long[]) objArr[3];
        int iIntValue = ((Number) objArr[4]).intValue();
        int i10 = f53845b;
        int i11 = ((i10 ^ 47) | (i10 & 47)) << 1;
        int i12 = -((i10 & (-48)) | ((~i10) & 47));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f53846c = i13 % 128;
        int i14 = i13 % 2;
        jArr[1] = jLongValue2;
        int i15 = i10 & 73;
        int i16 = ((((i10 ^ 73) | i15) << 1) - (~(-((i10 | 73) & (~i15))))) - 1;
        f53846c = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 2;
        while (i18 < 16) {
            int i19 = f53845b;
            int i20 = i19 + 25;
            f53846c = i20 % 128;
            if (i20 % 2 == 0) {
                long j10 = jArr[i18 >>> 1];
                jArr[i18] = j10;
                jArr[i18] = j10 | jLongValue2;
                int i21 = ((i18 & (-34)) + (i18 | (-34))) - 1;
                i18 = (i21 ^ 57) + ((i21 & 57) << 1);
            } else {
                long j11 = jArr[i18 >>> 1] << 1;
                jArr[i18] = j11;
                jArr[i18 + 1] = j11 ^ jLongValue2;
                int i22 = (i18 | 2) << 1;
                int i23 = -(((~i18) & 2) | (i18 & (-3)));
                i18 = (i22 ^ i23) + ((i23 & i22) << 1);
            }
            int i24 = i19 & 75;
            int i25 = (i19 | 75) & (~i24);
            int i26 = -(-(i24 << 1));
            int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
            f53846c = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = (int) jLongValue;
        long j12 = jArr[i29 & 15] ^ (jArr[(i29 >>> 4) & 15] << 4);
        int i30 = f53845b;
        int i31 = (((i30 | 120) << 1) - (i30 ^ 120)) - 1;
        f53846c = i31 % 128;
        int i32 = i31 % 2;
        long j13 = 0;
        int i33 = 56;
        do {
            int i34 = (int) (jLongValue >>> i33);
            long j14 = jArr[i34 & 15] ^ (jArr[(i34 >>> 4) & 15] << 4);
            j12 ^= j14 << i33;
            j13 ^= j14 >>> (-i33);
            int i35 = i33 | (-129);
            int i36 = i35 << 1;
            int i37 = -(i35 & (~(i33 & (-129))));
            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
            i33 = ((i38 | 121) << 1) - (i38 ^ 121);
        } while (i33 > 0);
        int i39 = f53845b;
        int i40 = i39 ^ 25;
        int i41 = (((i39 & 25) | i40) << 1) - i40;
        f53846c = i41 % 128;
        int i42 = i41 % 2;
        int i43 = i39 & 93;
        int i44 = (i43 - (~((i39 ^ 93) | i43))) - 1;
        f53846c = i44 % 128;
        int i45 = i44 % 2;
        int i46 = 0;
        while (i46 < 7) {
            int i47 = f53845b;
            int i48 = i47 ^ 1;
            int i49 = (((i47 & 1) | i48) << 1) - i48;
            int i50 = i49 % 128;
            f53846c = i50;
            int i51 = i49 % 2;
            jLongValue = (jLongValue & (-72340172838076674L)) >>> 1;
            j13 ^= jLongValue & ((jLongValue2 << i46) >> 63);
            int i52 = (((i46 ^ 14) | (i46 & 14)) << 1) - (((~i46) & 14) | (i46 & (-15)));
            int i53 = i52 ^ (-13);
            int i54 = ((i52 & (-13)) | i53) << 1;
            int i55 = -i53;
            i46 = ((i54 | i55) << 1) - (i55 ^ i54);
            int i56 = i50 ^ 107;
            int i57 = ((i50 & 107) | i56) << 1;
            int i58 = -i56;
            int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
            f53845b = i59 % 128;
            int i60 = i59 % 2;
        }
        jArr2[iIntValue] = jArr2[iIntValue] ^ j12;
        int i61 = 68 - (~(iIntValue * (-67)));
        int i62 = ~iIntValue;
        int i63 = (-2) ^ i62;
        int i64 = (-2) & i62;
        int i65 = (i63 ^ i64) | (i63 & i64);
        int i66 = ~i62;
        int i67 = (i65 & i66) | ((~i65) & i62);
        int i68 = i65 & i62;
        int i69 = ~((i68 & i67) | (i67 ^ i68));
        int i70 = (i62 & 1) | (iIntValue & (-2)) | (iIntValue & 1);
        int i71 = ~i70;
        int i72 = (i70 | i71) & i71;
        int i73 = (i69 & i72) | (i69 ^ i72);
        int i74 = iIntValue & iIntValue;
        int i75 = ~(i74 | ((~i74) & (iIntValue | iIntValue)));
        int i76 = -(-(((i73 & i75) | (i73 ^ i75)) * (-68)));
        int i77 = ((~i76) & i61) | ((~i61) & i76);
        int i78 = (i61 & i76) << 1;
        int i79 = (i77 & i78) + (i78 | i77);
        int i80 = i63 | i64;
        int i81 = (i79 - (~((~((i80 & iIntValue) | (i80 ^ iIntValue))) * (-68)))) - 1;
        int i82 = i62 & i66;
        int i83 = ~(i82 | i82 | (i62 & i62));
        int i84 = ((~i83) & (-2)) | (i83 & 1);
        int i85 = i83 & (-2);
        int i86 = ((i85 & i84) | (i84 ^ i85)) * 68;
        int i87 = i81 & i86;
        int i88 = (i86 | i81) & (~i87);
        int i89 = i87 << 1;
        int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
        jArr2[i90] = jArr2[i90] ^ j13;
        int i91 = f53846c;
        int i92 = i91 & 19;
        int i93 = -(-((i91 ^ 19) | i92));
        int i94 = (i92 & i93) + (i93 | i92);
        f53845b = i94 % 128;
        if (i94 % 2 != 0) {
            int i95 = 48 / 0;
        }
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 1843581176, -1843581157, (int) System.currentTimeMillis());
    }

    public static int setDividerPadding(long[] jArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{jArr}, 544051941, -544051940, (int) System.currentTimeMillis())).intValue();
    }

    public static void setNavigationOnClickListener(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -310260428, 310260449, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
        int i17 = ~i11;
        int i18 = i10 | i15;
        int i19 = (((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16;
        int i20 = 5;
        int i21 = 0;
        int i22 = 2;
        switch (i19) {
            case 1:
                return g(objArr);
            case 2:
                int i23 = 0;
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                long[] jArr3 = (long[]) objArr[2];
                int i24 = f53845b;
                int i25 = i24 & 23;
                int i26 = (((i24 | 23) & (~i25)) - (~(-(-(i25 << 1))))) - 1;
                int i27 = i26 % 128;
                f53846c = i27;
                int i28 = i26 % 2;
                int i29 = ((i27 & (-102)) | ((~i27) & 101)) + ((i27 & 101) << 1);
                f53845b = i29 % 128;
                while (true) {
                    int i30 = i29 % 2;
                    if (i23 >= 18) {
                        int i31 = f53846c + 101;
                        f53845b = i31 % 128;
                        int i32 = i31 % 2;
                        return null;
                    }
                    int i33 = f53846c;
                    int i34 = (i33 ^ 97) + ((i33 & 97) << 1);
                    int i35 = i34 % 128;
                    f53845b = i35;
                    int i36 = i34 % 2;
                    jArr3[i23] = jArr[i23] ^ jArr2[i23];
                    int i37 = (((i23 | 121) << 1) - (i23 ^ 121)) - 1;
                    i23 = (-2) - (((i37 & (-118)) + (i37 | (-118))) ^ (-1));
                    i29 = i35 + 95;
                    f53846c = i29 % 128;
                }
                break;
            case 3:
                f(objArr);
                return null;
            case 4:
                q(objArr);
                return null;
            case 5:
                m(objArr);
                return null;
            case 6:
                i(objArr);
                return null;
            case 7:
                k(objArr);
                return null;
            case 8:
                long[] jArr4 = (long[]) objArr[0];
                long[] jArr5 = (long[]) objArr[1];
                int i38 = f53845b;
                int i39 = ((i38 ^ 75) | (i38 & 75)) << 1;
                int i40 = -(((~i38) & 75) | (i38 & (-76)));
                int i41 = ((i39 | i40) << 1) - (i39 ^ i40);
                f53846c = i41 % 128;
                int i42 = i41 % 2;
                long[] jArr6 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                long[] jArr7 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                int i43 = f53845b + 23;
                f53846c = i43 % 128;
                int i44 = i43 % 2;
                int i45 = 0;
                int i46 = 0;
                while (i45 < 4) {
                    int i47 = f53845b;
                    int i48 = i47 & 115;
                    int i49 = ((i47 | 115) & (~i48)) + (i48 << 1);
                    f53846c = i49 % 128;
                    int i50 = i49 % 2;
                    int i51 = i46 & 1;
                    int i52 = (~i51) & (i46 | 1);
                    int i53 = -(-(i51 << 1));
                    int i54 = (i52 & i53) + (i53 | i52);
                    long jLongValue = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr4[i46])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                    int i55 = i54 & 1;
                    i46 = (((i54 ^ 1) | i55) << 1) - ((~i55) & (i54 | 1));
                    long jLongValue2 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr4[i54])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                    jArr6[i45] = (4294967295L & jLongValue) | (jLongValue2 << 32);
                    jArr7[i45] = (jLongValue2 & (-4294967296L)) | (jLongValue >>> 32);
                    i45++;
                    int i56 = f53845b;
                    int i57 = (i56 & 88) + (i56 | 88);
                    int i58 = (i57 ^ (-1)) + (i57 << 1);
                    f53846c = i58 % 128;
                    int i59 = i58 % 2;
                }
                long jLongValue3 = ((Long) auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr4[8])}, 896881784, -896881782, (int) System.currentTimeMillis())).longValue();
                jArr6[4] = 4294967295L & jLongValue3;
                jArr7[4] = jLongValue3 >>> 32;
                setOnFocusChangeListener(new Object[]{jArr7, f53844a, jArr5}, -253482889, 253482896, (int) System.currentTimeMillis());
                setOnFocusChangeListener(new Object[]{jArr5, jArr6, jArr5}, 994738673, -994738669, (int) System.currentTimeMillis());
                int i60 = f53845b;
                int i61 = i60 & 11;
                int i62 = (i60 | 11) & (~i61);
                int i63 = -(-(i61 << 1));
                int i64 = (i62 & i63) + (i62 | i63);
                f53846c = i64 % 128;
                int i65 = i64 % 2;
                return null;
            case 9:
                j(objArr);
                return null;
            case 10:
                long[] jArr8 = (long[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i66 = f53845b;
                int i67 = i66 & 35;
                int i68 = (i66 | 35) & (~i67);
                int i69 = -(-(i67 << 1));
                int i70 = (i68 & i69) + (i69 | i68);
                int i71 = i70 % 128;
                f53846c = i71;
                int i72 = i70 % 2;
                int i73 = iIntValue & (-9);
                int i74 = ~iIntValue;
                int i75 = i73 | (8 & i74);
                int i76 = iIntValue & 8;
                int i77 = -(-(i76 << 1));
                long j10 = jArr8[(i75 ^ i77) + ((i75 & i77) << 1)];
                long j11 = j10 >>> 59;
                jArr8[iIntValue] = ((j11 << 10) ^ (((j11 << 2) ^ j11) ^ (j11 << 5))) ^ jArr8[iIntValue];
                int i78 = iIntValue * (-112);
                int i79 = ((-896) & i78) + (i78 | (-896));
                int i80 = (~i74) & i74;
                int i81 = i80 | i80;
                int i82 = i74 & i74;
                int i83 = ~((i81 & i82) | (i81 ^ i82));
                int i84 = ((i83 & 8) | (i83 ^ 8)) * 226;
                int i85 = ((i79 ^ i84) | (i79 & i84)) << 1;
                int i86 = -((i84 & (~i79)) | ((~i84) & i79));
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                int i88 = ((-9) & i74) | i76;
                int i89 = ~((i88 ^ i73) | (i88 & i73));
                int i90 = ~(i73 | i88);
                int i91 = (i90 & i89) | (i89 ^ i90);
                int i92 = (i74 ^ i74) | i82;
                int i93 = i92 ^ 8;
                int i94 = i92 & 8;
                int i95 = ~((i94 & i93) | (i93 ^ i94));
                int i96 = ((~i95) & i91) | ((~i91) & i95);
                int i97 = i91 & i95;
                int i98 = ((i97 & i96) | (i96 ^ i97)) * (-113);
                int i99 = (i87 | i98) << 1;
                int i100 = -(i98 ^ i87);
                int i101 = (i99 ^ i100) + ((i100 & i99) << 1);
                int i102 = i74 & iIntValue;
                int i103 = (iIntValue | i74) & (~i102);
                jArr8[(i101 - (~((~((i103 & i102) | (i103 ^ i102))) * 113))) - 1] = 576460752303423487L & j10;
                int i104 = i71 & 11;
                int i105 = (i71 | 11) & (~i104);
                int i106 = i104 << 1;
                int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
                f53845b = i107 % 128;
                int i108 = i107 % 2;
                return null;
            case 11:
                c(objArr);
                return null;
            case 12:
                n(objArr);
                return null;
            case 13:
                return o(objArr);
            case 14:
                d(objArr);
                return null;
            case 15:
                h(objArr);
                return null;
            case 16:
                r(objArr);
                return null;
            case 17:
                return a(objArr);
            case 18:
                long[] jArr9 = (long[]) objArr[0];
                long[] jArr10 = (long[]) objArr[1];
                long[] jArr11 = (long[]) objArr[2];
                int i109 = f53845b;
                int i110 = ((i109 ^ 123) | (i109 & 123)) << 1;
                int i111 = -((i109 & (-124)) | ((~i109) & 123));
                int i112 = (i110 ^ i111) + ((i110 & i111) << 1);
                int i113 = i112 % 128;
                f53846c = i113;
                int i114 = i112 % 2;
                long[] jArr12 = new long[16];
                int i115 = ((i113 ^ 57) | (i113 & 57)) << 1;
                int i116 = -((i113 & (-58)) | ((~i113) & 57));
                int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
                f53845b = i117 % 128;
                int i118 = i117 % 2;
                int i119 = 0;
                int i120 = 9;
                while (i119 < i120) {
                    int i121 = f53845b;
                    int i122 = i121 & 29;
                    int i123 = -(-((i121 ^ 29) | i122));
                    int i124 = (i122 ^ i123) + ((i122 & i123) << 1);
                    f53846c = i124 % 128;
                    int i125 = i124 % 2;
                    long j12 = jArr9[i119];
                    long j13 = jArr10[i119];
                    int i126 = i119 << 1;
                    Object[] objArr2 = new Object[i20];
                    objArr2[i21] = jArr12;
                    objArr2[1] = Long.valueOf(j12);
                    objArr2[2] = Long.valueOf(j13);
                    objArr2[3] = jArr11;
                    objArr2[4] = Integer.valueOf(i126);
                    setOnFocusChangeListener(objArr2, 231427054, -231427038, i126);
                    int i127 = i119 & 1;
                    int i128 = (~i127) & (i119 | 1);
                    int i129 = i127 << 1;
                    i119 = (i128 ^ i129) + ((i129 & i128) << 1);
                    int i130 = f53846c;
                    int i131 = ((((i130 ^ 55) | (i130 & 55)) << 1) - (~(-(((~i130) & 55) | (i130 & (-56)))))) - 1;
                    f53845b = i131 % 128;
                    int i132 = i131 % 2;
                    i120 = 9;
                    i21 = 0;
                    i20 = 5;
                }
                long j14 = jArr11[i21];
                long j15 = jArr11[1];
                long j16 = j14 ^ jArr11[2];
                long j17 = j16 ^ j15;
                jArr11[1] = j17;
                long j18 = j15 ^ jArr11[3];
                long j19 = j16 ^ jArr11[4];
                long j20 = j19 ^ j18;
                jArr11[2] = j20;
                long j21 = j18 ^ jArr11[5];
                long j22 = j19 ^ jArr11[6];
                long j23 = j22 ^ j21;
                jArr11[3] = j23;
                long j24 = j21 ^ jArr11[7];
                long j25 = j22 ^ jArr11[8];
                long j26 = j25 ^ j24;
                jArr11[4] = j26;
                long j27 = j24 ^ jArr11[9];
                long j28 = j25 ^ jArr11[10];
                long j29 = j28 ^ j27;
                jArr11[5] = j29;
                long j30 = j27 ^ jArr11[11];
                long j31 = j28 ^ jArr11[12];
                long j32 = j31 ^ j30;
                jArr11[6] = j32;
                long j33 = j30 ^ jArr11[13];
                long j34 = j31 ^ jArr11[14];
                long j35 = j34 ^ j33;
                jArr11[7] = j35;
                long j36 = j33 ^ jArr11[15];
                long j37 = j34 ^ jArr11[16];
                long j38 = j37 ^ j36;
                jArr11[8] = j38;
                long j39 = j37 ^ (j36 ^ jArr11[17]);
                jArr11[9] = j14 ^ j39;
                jArr11[10] = j17 ^ j39;
                jArr11[11] = j20 ^ j39;
                jArr11[12] = j23 ^ j39;
                jArr11[13] = j26 ^ j39;
                jArr11[14] = j29 ^ j39;
                jArr11[15] = j32 ^ j39;
                jArr11[16] = j35 ^ j39;
                jArr11[17] = j38 ^ j39;
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[1]), Long.valueOf(jArr10[0] ^ jArr10[1]), jArr11, 1}, 231427054, -231427038, 1);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[2]), Long.valueOf(jArr10[0] ^ jArr10[2]), jArr11, 2}, 231427054, -231427038, 2);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[3]), Long.valueOf(jArr10[0] ^ jArr10[3]), jArr11, 3}, 231427054, -231427038, 3);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[1] ^ jArr9[2]), Long.valueOf(jArr10[1] ^ jArr10[2]), jArr11, 3}, 231427054, -231427038, 3);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[4]), Long.valueOf(jArr10[0] ^ jArr10[4]), jArr11, 4}, 231427054, -231427038, 4);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[1] ^ jArr9[3]), Long.valueOf(jArr10[1] ^ jArr10[3]), jArr11, 4}, 231427054, -231427038, 4);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[5]), Long.valueOf(jArr10[0] ^ jArr10[5]), jArr11, 5}, 231427054, -231427038, 5);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[1] ^ jArr9[4]), Long.valueOf(jArr10[1] ^ jArr10[4]), jArr11, 5}, 231427054, -231427038, 5);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[2] ^ jArr9[3]), Long.valueOf(jArr10[2] ^ jArr10[3]), jArr11, 5}, 231427054, -231427038, 5);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[6]), Long.valueOf(jArr10[0] ^ jArr10[6]), jArr11, 6}, 231427054, -231427038, 6);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[1] ^ jArr9[5]), Long.valueOf(jArr10[1] ^ jArr10[5]), jArr11, 6}, 231427054, -231427038, 6);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[2] ^ jArr9[4]), Long.valueOf(jArr10[2] ^ jArr10[4]), jArr11, 6}, 231427054, -231427038, 6);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[7]), Long.valueOf(jArr10[0] ^ jArr10[7]), jArr11, 7}, 231427054, -231427038, 7);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[1] ^ jArr9[6]), Long.valueOf(jArr10[1] ^ jArr10[6]), jArr11, 7}, 231427054, -231427038, 7);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[2] ^ jArr9[5]), Long.valueOf(jArr10[2] ^ jArr10[5]), jArr11, 7}, 231427054, -231427038, 7);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[3] ^ jArr9[4]), Long.valueOf(jArr10[3] ^ jArr10[4]), jArr11, 7}, 231427054, -231427038, 7);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[0] ^ jArr9[8]), Long.valueOf(jArr10[0] ^ jArr10[8]), jArr11, 8}, 231427054, -231427038, 8);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[1] ^ jArr9[7]), Long.valueOf(jArr10[1] ^ jArr10[7]), jArr11, 8}, 231427054, -231427038, 8);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[2] ^ jArr9[6]), Long.valueOf(jArr10[2] ^ jArr10[6]), jArr11, 8}, 231427054, -231427038, 8);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[3] ^ jArr9[5]), Long.valueOf(jArr10[3] ^ jArr10[5]), jArr11, 8}, 231427054, -231427038, 8);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[1] ^ jArr9[8]), Long.valueOf(jArr10[1] ^ jArr10[8]), jArr11, 9}, 231427054, -231427038, 9);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[2] ^ jArr9[7]), Long.valueOf(jArr10[2] ^ jArr10[7]), jArr11, 9}, 231427054, -231427038, 9);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[3] ^ jArr9[6]), Long.valueOf(jArr10[3] ^ jArr10[6]), jArr11, 9}, 231427054, -231427038, 9);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[4] ^ jArr9[5]), Long.valueOf(jArr10[4] ^ jArr10[5]), jArr11, 9}, 231427054, -231427038, 9);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[2] ^ jArr9[8]), Long.valueOf(jArr10[2] ^ jArr10[8]), jArr11, 10}, 231427054, -231427038, 10);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[3] ^ jArr9[7]), Long.valueOf(jArr10[3] ^ jArr10[7]), jArr11, 10}, 231427054, -231427038, 10);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[4] ^ jArr9[6]), Long.valueOf(jArr10[4] ^ jArr10[6]), jArr11, 10}, 231427054, -231427038, 10);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[3] ^ jArr9[8]), Long.valueOf(jArr10[3] ^ jArr10[8]), jArr11, 11}, 231427054, -231427038, 11);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[4] ^ jArr9[7]), Long.valueOf(jArr10[4] ^ jArr10[7]), jArr11, 11}, 231427054, -231427038, 11);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[5] ^ jArr9[6]), Long.valueOf(jArr10[5] ^ jArr10[6]), jArr11, 11}, 231427054, -231427038, 11);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[4] ^ jArr9[8]), Long.valueOf(jArr10[4] ^ jArr10[8]), jArr11, 12}, 231427054, -231427038, 12);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[5] ^ jArr9[7]), Long.valueOf(jArr10[5] ^ jArr10[7]), jArr11, 12}, 231427054, -231427038, 12);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[5] ^ jArr9[8]), Long.valueOf(jArr10[5] ^ jArr10[8]), jArr11, 13}, 231427054, -231427038, 13);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[6] ^ jArr9[7]), Long.valueOf(jArr10[6] ^ jArr10[7]), jArr11, 13}, 231427054, -231427038, 13);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[6] ^ jArr9[8]), Long.valueOf(jArr10[6] ^ jArr10[8]), jArr11, 14}, 231427054, -231427038, 14);
                setOnFocusChangeListener(new Object[]{jArr12, Long.valueOf(jArr9[7] ^ jArr9[8]), Long.valueOf(jArr10[8] ^ jArr10[7]), jArr11, 15}, 231427054, -231427038, 15);
                int i133 = f53845b;
                int i134 = i133 & 91;
                int i135 = (i133 ^ 91) | i134;
                int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
                f53846c = i136 % 128;
                int i137 = i136 % 2;
                return null;
            case 19:
                long[] jArr13 = (long[]) objArr[0];
                long[] jArr14 = (long[]) objArr[1];
                int i138 = f53846c;
                int i139 = (-2) - (((i138 & 98) + (i138 | 98)) ^ (-1));
                f53845b = i139 % 128;
                int i140 = i139 % 2;
                long j40 = jArr13[9];
                long j41 = jArr13[17];
                long j42 = (((j40 ^ (j41 >>> 59)) ^ (j41 >>> 57)) ^ (j41 >>> 54)) ^ (j41 >>> 49);
                long j43 = (j41 << 15) ^ (((jArr13[8] ^ (j41 << 5)) ^ (j41 << 7)) ^ (j41 << 10));
                int i141 = i138 + 31;
                f53845b = i141 % 128;
                int i142 = i141 % 2;
                int i143 = 16;
                while (i143 >= 10) {
                    int i144 = f53845b;
                    int i145 = i144 & 79;
                    int i146 = ((i144 ^ 79) | i145) << 1;
                    int i147 = -((i144 | 79) & (~i145));
                    int i148 = ((i146 | i147) << 1) - (i147 ^ i146);
                    int i149 = i148 % 128;
                    f53846c = i149;
                    int i150 = i148 % 2;
                    long j44 = jArr13[i143];
                    jArr14[(i143 & (-8)) + (i143 | (-8))] = (((j43 ^ (j44 >>> 59)) ^ (j44 >>> 57)) ^ (j44 >>> 54)) ^ (j44 >>> 49);
                    j43 = (((jArr13[i143 - 9] ^ (j44 << 5)) ^ (j44 << 7)) ^ (j44 << 10)) ^ (j44 << 15);
                    int i151 = (i143 | 9) << 1;
                    int i152 = -(((~i143) & 9) | (i143 & (-10)));
                    int i153 = ((i151 ^ i152) + ((i152 & i151) << 1)) - 10;
                    int i154 = i149 & 65;
                    int i155 = (i149 ^ 65) | i154;
                    int i156 = (i154 & i155) + (i154 | i155);
                    f53845b = i156 % 128;
                    int i157 = i156 % 2;
                    i143 = i153;
                }
                jArr14[1] = (((j43 ^ (j42 >>> 59)) ^ (j42 >>> 57)) ^ (j42 >>> 54)) ^ (j42 >>> 49);
                long j45 = (j42 << 15) ^ (((jArr13[0] ^ (j42 << 5)) ^ (j42 << 7)) ^ (j42 << 10));
                long j46 = jArr14[8];
                long j47 = j46 >>> 59;
                jArr14[0] = (((j45 ^ j47) ^ (j47 << 2)) ^ (j47 << 5)) ^ (j47 << 10);
                jArr14[8] = 576460752303423487L & j46;
                int i158 = f53846c;
                int i159 = i158 & 1;
                int i160 = (i158 ^ 1) | i159;
                int i161 = (i159 ^ i160) + ((i160 & i159) << 1);
                f53845b = i161 % 128;
                int i162 = i161 % 2;
                return null;
            case 20:
                e(objArr);
                return null;
            case 21:
                l(objArr);
                return null;
            case 22:
                long[] jArr15 = (long[]) objArr[0];
                long[] jArr16 = (long[]) objArr[1];
                int iIntValue2 = ((Number) objArr[2]).intValue();
                long[] jArr17 = (long[]) objArr[3];
                int iIntValue3 = ((Number) objArr[4]).intValue();
                int i163 = f53845b;
                int i164 = i163 + 65;
                f53846c = i164 % 128;
                int i165 = i164 % 2;
                int i166 = (i163 & (-38)) | ((~i163) & 37);
                int i167 = -(-((i163 & 37) << 1));
                int i168 = (i166 ^ i167) + ((i167 & i166) << 1);
                f53846c = i168 % 128;
                int i169 = i168 % 2;
                for (int i170 = 9; i21 < i170; i170 = 9) {
                    int i171 = f53845b;
                    int i172 = i171 ^ 25;
                    int i173 = (((i171 & 25) | i172) << 1) - i172;
                    int i174 = i173 % 128;
                    f53846c = i174;
                    int i175 = i173 % i22;
                    int i176 = i21 * 50;
                    int i177 = -(~(iIntValue3 * (-97)));
                    int i178 = (-2) - (((i176 & i177) + (i176 | i177)) ^ (-1));
                    int i179 = ~iIntValue3;
                    int i180 = ~iIntValue2;
                    int i181 = (i180 | iIntValue2) & i180;
                    int i182 = i179 & i181;
                    int i183 = (i181 | i179) & (~i182);
                    int i184 = (i183 & i182) | (i183 ^ i182);
                    int i185 = ~i184;
                    int i186 = (i184 | i185) & i185;
                    int i187 = ~i21;
                    int i188 = ((~i179) & i21) | (i179 & i187);
                    int i189 = i179 & i21;
                    int i190 = (i188 ^ i189) | (i188 & i189);
                    int i191 = ~i190;
                    int i192 = (i190 | i191) & i191;
                    int i193 = i186 & i192;
                    int i194 = (~i193) & (i192 | i186);
                    int i195 = ((i194 & i193) | (i194 ^ i193)) * 98;
                    int i196 = i178 & i195;
                    int i197 = i196 + ((i195 ^ i178) | i196);
                    int i198 = i187 & i180;
                    int i199 = (~i198) & (i187 | i180);
                    int i200 = ~((i198 & i199) | (i199 ^ i198));
                    int i201 = i179 ^ i200;
                    int i202 = i200 & i179;
                    int i203 = (i202 & i201) | (i201 ^ i202);
                    int i204 = (i21 & i180) | (iIntValue2 & i187);
                    int i205 = i21 & iIntValue2;
                    int i206 = ~((i204 & i205) | (i204 ^ i205));
                    int i207 = ((~i206) & i203) | ((~i203) & i206);
                    int i208 = i203 & i206;
                    int i209 = (-2) - ((i197 - (~(-(-(((i208 & i207) | (i207 ^ i208)) * (-49)))))) ^ (-1));
                    int i210 = ~(i179 | iIntValue2);
                    int i211 = (i21 ^ iIntValue3) | (i21 & iIntValue3);
                    int i212 = ~i211;
                    int i213 = (i211 | i212) & i212;
                    jArr17[(i209 - (~(((i210 & i213) | (((~i213) & i210) | ((~i210) & i213))) * 49))) - 1] = jArr15[(i21 ^ 9) + ((i21 & 9) << 1)] ^ jArr16[iIntValue2 + i21];
                    int i214 = (i21 ^ 2) + ((i21 & 2) << 1);
                    i21 = (i214 ^ (-1)) + (i214 << 1);
                    int i215 = i174 & 63;
                    int i216 = ((i174 ^ 63) | i215) << 1;
                    int i217 = -((~i215) & (i174 | 63));
                    int i218 = (i216 & i217) + (i216 | i217);
                    f53845b = i218 % 128;
                    int i219 = i218 % 2;
                    i22 = 2;
                }
                int i220 = f53845b;
                int i221 = (i220 & 99) + (i220 | 99);
                f53846c = i221 % 128;
                int i222 = i221 % 2;
                return null;
            case 23:
                long[] jArr18 = (long[]) objArr[0];
                long[] jArr19 = (long[]) objArr[1];
                int i223 = f53846c;
                int i224 = i223 & 115;
                int i225 = i224 + ((i223 ^ 115) | i224);
                f53845b = i225 % 128;
                int i226 = i225 % 2;
                int i227 = ((i223 | 47) << 1) - (i223 ^ 47);
                while (true) {
                    f53845b = i227 % 128;
                    int i228 = i227 % 2;
                    if (i21 >= 9) {
                        int i229 = f53845b;
                        int i230 = ((i229 ^ 57) | (i229 & 57)) << 1;
                        int i231 = -(((~i229) & 57) | (i229 & (-58)));
                        int i232 = ((i230 | i231) << 1) - (i231 ^ i230);
                        f53846c = i232 % 128;
                        int i233 = i232 % 2;
                        return null;
                    }
                    int i234 = f53846c;
                    int i235 = (((i234 ^ 21) | (i234 & 21)) << 1) - ((i234 & (-22)) | ((~i234) & 21));
                    f53845b = i235 % 128;
                    int i236 = i235 % 2;
                    jArr19[i21] = jArr19[i21] ^ jArr18[i21];
                    int i237 = (i21 & (-2)) | ((~i21) & 1);
                    int i238 = -(-((i21 & 1) << 1));
                    i21 = ((i237 | i238) << 1) - (i238 ^ i237);
                    i227 = (((i234 | 68) << 1) - (i234 ^ 68)) - 1;
                }
                break;
            case 24:
                b(objArr);
                return null;
            default:
                p(objArr);
                return null;
        }
    }

    public static void setX(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, 378521458, -378521452, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, int i10, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, Integer.valueOf(i10), jArr2}, 1331770537, -1331770517, i10);
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, -253482889, 253482896, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, -1143789774, 1143789783, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -1657265198, 1657265213, (int) System.currentTimeMillis());
    }

    public static long[] setY(long[] jArr) {
        return (long[]) setOnFocusChangeListener(new Object[]{jArr}, -1155663531, 1155663548, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -386758368, 386758380, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, 1461527585, -1461527582, (int) System.currentTimeMillis());
    }

    public static long[] setY(BigInteger bigInteger) {
        return (long[]) setOnFocusChangeListener(new Object[]{bigInteger}, 116917515, -116917502, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, 994738673, -994738669, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -695938683, 695938691, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2, long[] jArr3) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2, jArr3}, 1239421330, -1239421316, (int) System.currentTimeMillis());
    }
}
