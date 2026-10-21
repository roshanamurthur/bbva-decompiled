package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public final class bed {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54629a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54630b = 1;

    public static int setCompoundDrawableTintBlendMode(int i10) {
        return ((Integer) setY(new Object[]{Integer.valueOf(i10)}, 1719558927, -1719558925, i10)).intValue();
    }

    public static boolean setOnFocusChangeListener(int i10) {
        return ((Boolean) setY(new Object[]{Integer.valueOf(i10)}, 76866021, -76866021, i10)).booleanValue();
    }

    public static int setX(int i10, int i11, int i12) {
        return ((Integer) setY(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)}, 1338242645, -1338242644, i10)).intValue();
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ~i10;
        int i15 = ~((~i12) | i14);
        int i16 = (((~(i10 | i11 | i12)) | i15) * 338) + ((~(i14 | i11)) * 338) + (((~((~i11) | i10)) | i15 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337));
        int i17 = 0;
        if (i16 == 1) {
            int iIntValue = ((Number) objArr[0]).intValue();
            int iIntValue2 = ((Number) objArr[1]).intValue();
            int iIntValue3 = ((Number) objArr[2]).intValue();
            int i18 = f54629a + 32;
            int i19 = (i18 ^ (-1)) + (i18 << 1);
            f54630b = i19 % 128;
            int i20 = i19 % 2;
            int iIntValue4 = ((Integer) setY(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue3)}, -1291602600, 1291602603, iIntValue)).intValue();
            int iIntValue5 = ((Integer) setY(new Object[]{Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3)}, -1291602600, 1291602603, iIntValue2)).intValue();
            if (iIntValue5 != 0) {
                int i21 = f54629a;
                int i22 = i21 & 83;
                int i23 = (i21 | 83) & (~i22);
                int i24 = -(-(i22 << 1));
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                f54630b = i25 % 128;
                int iIntValue6 = i25 % 2 == 0 ? 1 % ((Integer) setY(new Object[]{Integer.valueOf(iIntValue3)}, 1719558927, -1719558925, iIntValue3)).intValue() : 1 << ((Integer) setY(new Object[]{Integer.valueOf(iIntValue3)}, 1719558927, -1719558925, iIntValue3)).intValue();
                while (iIntValue4 != 0) {
                    int i26 = f54629a;
                    int i27 = (((i26 ^ 3) | (i26 & 3)) << 1) - ((i26 & (-4)) | ((~i26) & 3));
                    f54630b = i27 % 128;
                    int i28 = i27 % 2;
                    if (((byte) (iIntValue4 & 1)) == 1) {
                        int i29 = i26 & 93;
                        int i30 = i26 | 93;
                        int i31 = (i29 ^ i30) + ((i29 & i30) << 1);
                        f54630b = i31 % 128;
                        int i32 = i31 % 2;
                        int i33 = (~iIntValue5) & i17;
                        int i34 = (~i17) & iIntValue5;
                        i17 = (i34 & i33) | (i33 ^ i34);
                        int i35 = i26 + 35;
                        f54630b = i35 % 128;
                        int i36 = i35 % 2;
                    }
                    iIntValue4 >>>= 1;
                    iIntValue5 <<= 1;
                    if (iIntValue5 >= iIntValue6) {
                        int i37 = i26 & 13;
                        int i38 = -(-((i26 ^ 13) | i37));
                        int i39 = (i37 & i38) + (i38 | i37);
                        f54630b = i39 % 128;
                        if (i39 % 2 == 0) {
                            throw null;
                        }
                        int i40 = (~iIntValue3) & iIntValue5;
                        int i41 = (~iIntValue5) & iIntValue3;
                        iIntValue5 = (i41 & i40) | (i40 ^ i41);
                    }
                    int i42 = f54630b;
                    int i43 = i42 ^ 87;
                    int i44 = -(-((i42 & 87) << 1));
                    int i45 = (i43 & i44) + (i44 | i43);
                    f54629a = i45 % 128;
                    int i46 = i45 % 2;
                }
            }
            int i47 = f54629a;
            int i48 = i47 & 73;
            int i49 = -(-(i47 | 73));
            int i50 = (i48 & i49) + (i49 | i48);
            f54630b = i50 % 128;
            int i51 = i50 % 2;
            return Integer.valueOf(i17);
        }
        int i52 = -1;
        if (i16 == 2) {
            int iIntValue7 = ((Number) objArr[0]).intValue();
            int i53 = f54630b + 110;
            int i54 = (i53 ^ (-1)) + (i53 << 1);
            f54629a = i54 % 128;
            if (i54 % 2 != 0) {
                throw null;
            }
            while (iIntValue7 != 0) {
                int i55 = f54629a;
                int i56 = i55 & 45;
                int i57 = (((i55 | 45) & (~i56)) - (~(i56 << 1))) - 1;
                int i58 = i57 % 128;
                f54630b = i58;
                int i59 = i57 % 2;
                i52 = (i52 & 1) + (i52 | 1);
                iIntValue7 >>>= 1;
                int i60 = i58 & 83;
                int i61 = ((i58 ^ 83) | i60) << 1;
                int i62 = -((i58 | 83) & (~i60));
                int i63 = (i61 ^ i62) + ((i61 & i62) << 1);
                f54629a = i63 % 128;
                int i64 = i63 % 2;
            }
            int i65 = f54629a;
            int i66 = i65 & 95;
            int i67 = -(-(i65 | 95));
            int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
            f54630b = i68 % 128;
            if (i68 % 2 != 0) {
                return Integer.valueOf(i52);
            }
            throw null;
        }
        if (i16 == 3) {
            int iIntValue8 = ((Number) objArr[0]).intValue();
            int iIntValue9 = ((Number) objArr[1]).intValue();
            int i69 = f54630b;
            int i70 = (i69 & 115) + (i69 | 115);
            int i71 = i70 % 128;
            f54629a = i71;
            int i72 = i70 % 2;
            if (iIntValue9 == 0) {
                int i73 = ((i71 ^ 15) | (i71 & 15)) << 1;
                int i74 = -((i71 & (-16)) | ((~i71) & 15));
                int i75 = ((i73 | i74) << 1) - (i73 ^ i74);
                f54630b = i75 % 128;
                int i76 = i75 % 2;
                System.err.println("Error: to be divided by 0");
                i17 = i76 == 0 ? 1 : 0;
                int i77 = f54629a;
                int i78 = i77 & 51;
                int i79 = -(-((i77 ^ 51) | i78));
                int i80 = (i78 & i79) + (i79 | i78);
                f54630b = i80 % 128;
                if (i80 % 2 != 0) {
                    return Integer.valueOf(i17);
                }
                throw null;
            }
            int i81 = iIntValue8;
            for (int i82 = -1719558925; ((Integer) setY(new Object[]{Integer.valueOf(i81)}, 1719558927, i82, i81)).intValue() >= ((Integer) setY(new Object[]{Integer.valueOf(iIntValue9)}, 1719558927, i82, iIntValue9)).intValue(); i82 = -1719558925) {
                int i83 = f54630b;
                int i84 = i83 & 77;
                int i85 = -(-((i83 ^ 77) | i84));
                int i86 = (i84 & i85) + (i85 | i84);
                f54629a = i86 % 128;
                int i87 = i86 % 2;
                int iIntValue10 = ((Integer) setY(new Object[]{Integer.valueOf(i81)}, 1719558927, i82, i81)).intValue();
                int i88 = -((Integer) setY(new Object[]{Integer.valueOf(iIntValue9)}, 1719558927, i82, iIntValue9)).intValue();
                int i89 = i88 * 319;
                int i90 = -(~(iIntValue10 * (-317)));
                int i91 = ((i89 & i90) + (i89 | i90)) - 1;
                int i92 = ~iIntValue10;
                int i93 = ~i88;
                int i94 = i93 ^ iIntValue8;
                int i95 = ~iIntValue8;
                int i96 = i93 & iIntValue8;
                int i97 = (i96 & i94) | (i94 ^ i96);
                int i98 = ~i97;
                int i99 = (i97 | i98) & i98;
                int i100 = i92 & i99;
                int i101 = (i99 | i92) & (~i100);
                int i102 = -(-(((i101 & i100) | (i101 ^ i100)) * (-318)));
                int i103 = ((~i102) & i91) | ((~i91) & i102);
                int i104 = (i102 & i91) << 1;
                int i105 = (i103 & i104) + (i104 | i103);
                int i106 = (i92 | iIntValue10) & i92;
                int i107 = i106 & iIntValue8;
                int i108 = (i106 | iIntValue8) & (~i107);
                int i109 = ~((i108 & i107) | (i108 ^ i107));
                int i110 = i95 & i88;
                int i111 = (~i110) & (i95 | i88);
                int i112 = (i111 ^ i110) | (i110 & i111) | iIntValue10;
                int i113 = ~i112;
                int i114 = (i112 | i113) & i113;
                int i115 = i109 & i114;
                int i116 = (~i115) & (i109 | i114);
                int i117 = ((i116 & i115) | (i116 ^ i115)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                int i118 = (i105 ^ i117) + ((i117 & i105) << 1);
                int i119 = ((~i95) & i92) | ((~i92) & i95);
                int i120 = i92 & i95;
                int i121 = (i119 & i120) | (i119 ^ i120);
                int i122 = (i121 & i88) | (i121 ^ i88);
                int i123 = ~i122;
                int i124 = (i122 | i123) & i123;
                int i125 = (iIntValue10 & i88) | (i88 ^ iIntValue10);
                int i126 = (i125 & iIntValue8) | (i125 ^ iIntValue8);
                int i127 = ~i126;
                int i128 = (i126 | i127) & i127;
                int i129 = -(-(((i124 & i128) | (i124 ^ i128)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i130 = i118 & i129;
                int i131 = iIntValue9 << ((((i118 ^ i129) | i130) << 1) - ((i129 | i118) & (~i130)));
                int i132 = i81 & i131;
                i81 = (~i132) & ((i131 ^ i81) | i132);
                int i133 = f54630b;
                int i134 = i133 & 27;
                int i135 = i133 | 27;
                int i136 = ((i134 | i135) << 1) - (i135 ^ i134);
                f54629a = i136 % 128;
                int i137 = i136 % 2;
            }
            int i138 = f54630b;
            int i139 = i138 | 69;
            int i140 = i139 << 1;
            int i141 = -((~(i138 & 69)) & i139);
            int i142 = (i140 ^ i141) + ((i141 & i140) << 1);
            f54629a = i142 % 128;
            int i143 = i142 % 2;
            return Integer.valueOf(i81);
        }
        if (i16 != 4) {
            int iIntValue11 = ((Number) objArr[0]).intValue();
            int i144 = f54630b;
            int i145 = (((45 & (~i144)) | (i144 & (-46))) - (~((i144 & 45) << 1))) - 1;
            f54629a = i145 % 128;
            int i146 = i145 % 2;
            if (iIntValue11 == 0) {
                int i147 = i144 + 41;
                int i148 = i147 % 128;
                f54629a = i148;
                int i149 = i147 % 2;
                int i150 = (i148 & 17) + (i148 | 17);
                f54630b = i150 % 128;
                int i151 = i150 % 2;
            } else {
                int iIntValue12 = ((Integer) setY(new Object[]{Integer.valueOf(iIntValue11)}, 1719558927, -1719558925, iIntValue11)).intValue() >>> 1;
                int i152 = f54630b;
                int i153 = (((i152 | 77) << 1) - (~(-(((~i152) & 77) | (i152 & (-78)))))) - 1;
                f54629a = i153 % 128;
                int i154 = i153 % 2;
                int i155 = 0;
                int iIntValue13 = 2;
                while (true) {
                    if (i155 >= iIntValue12) {
                        int i156 = f54629a;
                        int i157 = i156 | 119;
                        int i158 = ((i157 << 1) - (~(-((~(i156 & 119)) & i157)))) - 1;
                        f54630b = i158 % 128;
                        if (i158 % 2 != 0) {
                            return Boolean.TRUE;
                        }
                        throw null;
                    }
                    int i159 = f54629a;
                    int i160 = ((i159 ^ 54) + ((i159 & 54) << 1)) - 1;
                    f54630b = i160 % 128;
                    if (i160 % 2 == 0) {
                        iIntValue13 = ((Integer) setY(new Object[]{Integer.valueOf(iIntValue13), Integer.valueOf(iIntValue13), Integer.valueOf(iIntValue11)}, 1338242645, -1338242644, iIntValue13)).intValue();
                        int i161 = (~(iIntValue13 & 4)) & (iIntValue13 | 4);
                        if (((Integer) setY(new Object[]{Integer.valueOf(i161), Integer.valueOf(iIntValue11)}, 994001964, -994001960, i161)).intValue() != 0) {
                            break;
                        }
                        int i162 = (i155 | (-69)) << 1;
                        int i163 = -(((~i155) & (-69)) | (i155 & 68));
                        int i164 = (i162 & i163) + (i163 | i162);
                        i155 = (-2) - (((i164 ^ 71) + ((i164 & 71) << 1)) ^ (-1));
                        int i165 = f54629a;
                        int i166 = (i165 & 65) + (i165 | 65);
                        f54630b = i166 % 128;
                        int i167 = i166 % 2;
                    } else {
                        iIntValue13 = ((Integer) setY(new Object[]{Integer.valueOf(iIntValue13), Integer.valueOf(iIntValue13), Integer.valueOf(iIntValue11)}, 1338242645, -1338242644, iIntValue13)).intValue();
                        int i168 = iIntValue13 & (-3);
                        int i169 = (~iIntValue13) & 2;
                        int i170 = (i168 & i169) | (i168 ^ i169);
                        if (((Integer) setY(new Object[]{Integer.valueOf(i170), Integer.valueOf(iIntValue11)}, 994001964, -994001960, i170)).intValue() != 1) {
                            break;
                        }
                        int i1610 = (i155 | (-69)) << 1;
                        int i1611 = -(((~i155) & (-69)) | (i155 & 68));
                        int i1612 = (i1610 & i1611) + (i1611 | i1610);
                        i155 = (-2) - (((i1612 ^ 71) + ((i1612 & 71) << 1)) ^ (-1));
                        int i1613 = f54629a;
                        int i1614 = (i1613 & 65) + (i1613 | 65);
                        f54630b = i1614 % 128;
                        int i1615 = i1614 % 2;
                    }
                }
                int i171 = f54629a;
                int i172 = (-2) - (((i171 & 116) + (i171 | 116)) ^ (-1));
                int i173 = i172 % 128;
                f54630b = i173;
                int i174 = i172 % 2;
                int i175 = ((i173 ^ 81) | (i173 & 81)) << 1;
                int i176 = -(((~i173) & 81) | (i173 & (-82)));
                int i177 = (i175 & i176) + (i175 | i176);
                f54629a = i177 % 128;
                if (i177 % 2 != 0) {
                    int i178 = 40 / 0;
                }
            }
            return Boolean.FALSE;
        }
        int iIntValue14 = ((Number) objArr[0]).intValue();
        Number number = (Number) objArr[1];
        while (true) {
            int iIntValue15 = number.intValue();
            while (true) {
                int i179 = iIntValue15;
                i13 = iIntValue14;
                iIntValue14 = i179;
                if (iIntValue14 == 0) {
                    int i180 = f54630b;
                    int i181 = (i180 & 85) + (i180 | 85);
                    f54629a = i181 % 128;
                    int i182 = i181 % 2;
                    return Integer.valueOf(i13);
                }
                int i183 = f54630b;
                int i184 = ((i183 ^ 80) + ((i183 & 80) << 1)) - 1;
                f54629a = i184 % 128;
                if (i184 % 2 != 0) {
                    iIntValue15 = ((Integer) setY(new Object[]{Integer.valueOf(i13), Integer.valueOf(iIntValue14)}, -1291602600, 1291602603, i13)).intValue();
                    int i185 = 52 / 0;
                }
            }
            number = (Integer) setY(new Object[]{Integer.valueOf(i13), Integer.valueOf(iIntValue14)}, -1291602600, 1291602603, i13);
        }
    }
}
