package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public abstract class avd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53946a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53947b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53947b;
        int i11 = i10 & 105;
        int i12 = ((((i10 ^ 105) | i11) << 1) - (~(-((i10 | 105) & (~i11))))) - 1;
        f53946a = i12 % 128;
        int i13 = i12 % 2;
        auv.setDividerPadding(new Object[]{iArr, iArr2}, 955273017, -955272992, (int) System.currentTimeMillis());
        auv.setDividerPadding(new Object[]{iArr, iArr2}, -1280600837, 1280600841, (int) System.currentTimeMillis());
        int iIntValue = ((Integer) auv.setDividerPadding(new Object[]{iArr2, iArr2}, -77156620, 77156651, (int) System.currentTimeMillis())).intValue();
        int iIntValue2 = ((Integer) auv.setDividerPadding(new Object[]{iArr2, 0, iArr2, 6, 0}, -1286218780, 1286218793, 0)).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i14 = ((iIntValue2 * 302) - (~(-(~(-(-(iIntValue * TypedValues.MotionType.TYPE_EASING))))))) - 2;
        int i15 = ~iIntValue2;
        int i16 = ~iCurrentTimeMillis;
        int i17 = ~i16;
        int i18 = ~i15;
        int i19 = (i15 & i17) | (i16 & i18);
        int i20 = i15 & i16;
        int i21 = ~((i19 ^ i20) | (i19 & i20));
        int i22 = iIntValue & i21;
        int i23 = (~i22) & (i21 | iIntValue);
        int i24 = -(-(((i23 & i22) | (i23 ^ i22)) * (-602)));
        int i25 = i14 & i24;
        int i26 = (i24 ^ i14) | i25;
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        int i28 = (i15 | iIntValue2) & i15;
        int i29 = ~iIntValue;
        int i30 = i28 & i29;
        int i31 = ~(((~i30) & (i28 | i29)) | i30);
        int i32 = i20 | (iCurrentTimeMillis & i18);
        int i33 = iCurrentTimeMillis & i15;
        int i34 = ~((i32 & i33) | (i32 ^ i33));
        int i35 = ((~i34) & i31) | ((~i31) & i34);
        int i36 = i31 & i34;
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = ~((i16 ^ iIntValue2) | (i16 & iIntValue2) | iIntValue);
        int i39 = i37 & i38;
        int i40 = (i37 | i38) & (~i39);
        int i41 = ((i40 & i39) | (i40 ^ i39)) * (-301);
        int i42 = i27 ^ i41;
        int i43 = ((i41 & i27) | i42) << 1;
        int i44 = -i42;
        int i45 = ((i43 | i44) << 1) - (i43 ^ i44);
        int i46 = -(-((~((i16 & i29) | (i17 & iIntValue) | (i16 & iIntValue))) * 301));
        int i47 = i45 & i46;
        int i48 = (i46 | i45) & (~i47);
        int i49 = i47 << 1;
        int iIntValue3 = ((Integer) auv.setDividerPadding(new Object[]{iArr2, 18, iArr2, 12, Integer.valueOf((i48 & i49) + (i48 | i49))}, -1286218780, 1286218793, 18)).intValue();
        int i50 = iIntValue & iIntValue3;
        int i51 = ((((iIntValue ^ iIntValue3) | i50) << 1) - (~(-((iIntValue3 | iIntValue) & (~i50))))) - 1;
        int[] iArr3 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
        ((Boolean) auv.setDividerPadding(new Object[]{iArr, iArr, iArr3}, 1458157136, -1458157136, (int) System.currentTimeMillis())).booleanValue();
        int[] iArr4 = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
        auv.setDividerPadding(new Object[]{iArr3, iArr4}, 955273017, -955272992, (int) System.currentTimeMillis());
        int iIntValue4 = ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr4, iArr2, 6}, -1170765211, 1170765236, 12)).intValue();
        int i52 = ((i51 ^ iIntValue4) | (i51 & iIntValue4)) << 1;
        int i53 = -((iIntValue4 & (~i51)) | ((~iIntValue4) & i51));
        ((Integer) auy.setOnFocusChangeListener(new Object[]{24, Integer.valueOf((i52 & i53) + (i53 | i52)), iArr2, 18}, 167310318, -167310316, 24)).intValue();
        int i54 = f53947b;
        int i55 = (i54 ^ 53) + ((i54 & 53) << 1);
        f53946a = i55 % 128;
        if (i55 % 2 != 0) {
            throw null;
        }
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -890681907, 890681907, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -563638869, 563638870, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        boolean z10;
        int iIntValue;
        int i13 = ~i11;
        int i14 = (((~((~i10) | i12)) | i13) * (-318)) + (i11 * (-317)) + (i10 * 319);
        int i15 = ~(i13 | i12);
        int i16 = ~i12;
        if ((((~(i10 | i11 | i12)) | (~(i13 | i16 | i10))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + ((i15 | (~(i16 | i10 | i11))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + i14 != 1) {
            a(objArr);
            return null;
        }
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i17 = f53946a + 17;
        f53947b = i17 % 128;
        int i18 = i17 % 2;
        auv.setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1843135733, -1843135721, (int) System.currentTimeMillis());
        auv.setDividerPadding(new Object[]{iArr, iArr2, iArr3, 12}, 469762607, -469762592, 12);
        int iIntValue2 = ((Integer) auv.setDividerPadding(new Object[]{iArr3, iArr3}, -77156620, 77156651, (int) System.currentTimeMillis())).intValue();
        int iIntValue3 = ((Integer) auv.setDividerPadding(new Object[]{iArr3, 0, iArr3, 6, 0}, -1286218780, 1286218793, 0)).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i19 = iIntValue3 * 303;
        int i20 = -(-(iIntValue2 * (-301)));
        int i21 = i19 ^ i20;
        int i22 = ((i19 & i20) | i21) << 1;
        int i23 = -i21;
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        int i25 = ~iIntValue3;
        int i26 = ~iCurrentTimeMillis;
        int i27 = ((~i25) & i26) | ((~i26) & i25);
        int i28 = i25 & i26;
        int i29 = (i27 & i28) | (i27 ^ i28);
        int i30 = ~((i29 & iIntValue2) | (i29 ^ iIntValue2));
        int i31 = (iIntValue3 ^ iIntValue2) | (iIntValue3 & iIntValue2);
        int i32 = ~((i31 & iCurrentTimeMillis) | (i31 ^ iCurrentTimeMillis));
        int i33 = i30 & i32;
        int i34 = (i30 | i32) & (~i33);
        int i35 = (i24 - (~(((i34 & i33) | (i34 ^ i33)) * (-302)))) - 1;
        int i36 = (i25 | iIntValue3) & i25;
        int i37 = i36 ^ iIntValue2;
        int i38 = ~iIntValue2;
        int i39 = i36 & iIntValue2;
        int i40 = (i39 & i37) | (i37 ^ i39);
        int i41 = i40 & iCurrentTimeMillis;
        int i42 = ((i40 | iCurrentTimeMillis) & (~i41)) | i41;
        int i43 = ~i42;
        int i44 = ((i42 | i43) & i43) * (-604);
        int i45 = i35 & i44;
        int i46 = -(-((i44 ^ i35) | i45));
        int i47 = (i45 & i46) + (i46 | i45);
        int i48 = i38 ^ iIntValue3;
        int i49 = i38 & iIntValue3;
        int i50 = ~((i48 & i49) | (i48 ^ i49));
        int i51 = (iIntValue2 ^ iCurrentTimeMillis) | (iCurrentTimeMillis & iIntValue2);
        int i52 = ~i51;
        int i53 = (i51 | i52) & i52;
        int i54 = -(-(((i50 & i53) | ((~i53) & i50) | ((~i50) & i53)) * 302));
        int iIntValue4 = ((Integer) auv.setDividerPadding(new Object[]{iArr3, 18, iArr3, 12, Integer.valueOf((((~i54) & i47) | ((~i47) & i54)) + ((i54 & i47) << 1))}, -1286218780, 1286218793, 18)).intValue();
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i55 = iIntValue4 * (-919);
        int i56 = iIntValue2 * (-919);
        int i57 = ((((i55 ^ i56) | (i55 & i56)) << 1) - (~(-(((~i55) & i56) | ((~i56) & i55))))) - 1;
        int i58 = ~iIntValue4;
        int i59 = (i58 | iIntValue4) & i58;
        int i60 = i59 ^ i38;
        int i61 = i59 & i38;
        int i62 = i60 | i61;
        int i63 = ~iCurrentTimeMillis2;
        int i64 = i62 & i63;
        int i65 = i64 | ((~i62) & iCurrentTimeMillis2);
        int i66 = i62 & iCurrentTimeMillis2;
        int i67 = ~((i65 ^ i66) | (i65 & i66));
        int i68 = i38 & i63;
        int i69 = (~i68) & (i38 | i63);
        int i70 = (i69 ^ i68) | (i68 & i69);
        int i71 = (i70 & i58) | ((~i70) & iIntValue4);
        int i72 = i70 & iIntValue4;
        int i73 = ~((i72 & i71) | (i71 ^ i72));
        int i74 = i67 & i73;
        int i75 = (i73 | i67) & (~i74);
        int i76 = ((i75 & i74) | (i75 ^ i74)) * 920;
        int i77 = ((i57 ^ i76) | (i57 & i76)) << 1;
        int i78 = -((i76 & (~i57)) | ((~i76) & i57));
        int i79 = (i77 ^ i78) + ((i78 & i77) << 1);
        int i80 = ~((i60 ^ i61) | (i60 & i61));
        int i81 = (i63 | iCurrentTimeMillis2) & i63;
        int i82 = ((~i81) & i58) | ((~i58) & i81);
        int i83 = i81 & i58;
        int i84 = ~((i83 & i82) | (i82 ^ i83));
        int i85 = (i79 - (~(-(-(((i80 & i84) | (i80 ^ i84)) * 920))))) - 1;
        int i86 = i62 ^ i63;
        int i87 = ~((i86 & i64) | (i86 ^ i64));
        int i88 = (i58 ^ iIntValue2) | (i58 & iIntValue2);
        int i89 = ~((i88 & iCurrentTimeMillis2) | (i88 & i63) | ((~i88) & iCurrentTimeMillis2));
        int i90 = ((~i89) & i87) | ((~i87) & i89);
        int i91 = i87 & i89;
        int i92 = (i91 & i90) | (i90 ^ i91);
        int i93 = i38 ^ iIntValue4;
        int i94 = i38 & iIntValue4;
        int i95 = (i93 & i94) | (i93 ^ i94);
        int i96 = i95 ^ iCurrentTimeMillis2;
        int i97 = i95 & iCurrentTimeMillis2;
        int i98 = (i97 & i96) | (i96 ^ i97);
        int i99 = ~i98;
        int i100 = (i98 | i99) & i99;
        int i101 = i92 ^ i100;
        int i102 = i92 & i100;
        int i103 = ((i102 & i101) | (i101 ^ i102)) * 920;
        int i104 = i85 & i103;
        int i105 = ((i85 ^ i103) | i104) << 1;
        int i106 = -((i103 | i85) & (~i104));
        int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
        int[] iArr4 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
        int[] iArr5 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
        if (((Boolean) auv.setDividerPadding(new Object[]{iArr, iArr, iArr4}, 1458157136, -1458157136, (int) System.currentTimeMillis())).booleanValue() != ((Boolean) auv.setDividerPadding(new Object[]{iArr2, iArr2, iArr5}, 1458157136, -1458157136, (int) System.currentTimeMillis())).booleanValue()) {
            int i108 = f53946a;
            int i109 = (i108 & 58) + (i108 | 58);
            int i110 = (i109 ^ (-1)) + (i109 << 1);
            int i111 = i110 % 128;
            f53947b = i111;
            int i112 = i110 % 2;
            int i113 = (((i111 | 94) << 1) - (i111 ^ 94)) - 1;
            f53946a = i113 % 128;
            int i114 = i113 % 2;
            z10 = true;
        } else {
            int i115 = f53946a;
            int i116 = ((i115 & (-96)) | ((~i115) & 95)) + ((i115 & 95) << 1);
            f53947b = i116 % 128;
            int i117 = i116 % 2;
            z10 = false;
        }
        int[] iArr6 = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
        auv.setDividerPadding(new Object[]{iArr4, iArr5, iArr6}, 1843135733, -1843135721, (int) System.currentTimeMillis());
        if (z10) {
            int i118 = f53947b;
            int i119 = (i118 ^ 101) + ((i118 & 101) << 1);
            f53946a = i119 % 128;
            iIntValue = ((Integer) (i119 % 2 != 0 ? auy.setOnFocusChangeListener(new Object[]{41, iArr6, iArr3, 10}, -1551455300, 1551455340, 41) : auy.setOnFocusChangeListener(new Object[]{12, iArr6, iArr3, 6}, -1551455300, 1551455340, 12))).intValue();
            int i120 = f53946a;
            int i121 = ((i120 & (-10)) | ((~i120) & 9)) + ((i120 & 9) << 1);
            f53947b = i121 % 128;
            int i122 = i121 % 2;
        } else {
            iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr6, iArr3, 6}, -1170765211, 1170765236, 12)).intValue();
            int i123 = f53947b;
            int i124 = i123 & 111;
            int i125 = ((i123 ^ 111) | i124) << 1;
            int i126 = -((i123 | 111) & (~i124));
            int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
            f53946a = i127 % 128;
            int i128 = i127 % 2;
        }
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i129 = iIntValue * 71;
        int i130 = -(-(i107 * (-69)));
        int i131 = ((i129 | i130) << 1) - (i129 ^ i130);
        int i132 = ~iIntValue;
        int i133 = ~i107;
        int i134 = i132 & i107;
        int i135 = ~((i132 ^ i107) | i134);
        int i136 = i107 & iCurrentTimeMillis3;
        int i137 = (~i136) & (i107 | iCurrentTimeMillis3);
        int i138 = ~iCurrentTimeMillis3;
        int i139 = ~((i136 & i137) | (i137 ^ i136));
        int i140 = i131 - (~(-(-(((i135 & i139) | (i135 ^ i139)) * (-140)))));
        int i141 = (i140 ^ (-1)) + (i140 << 1);
        int i142 = iIntValue & i133;
        int i143 = i134 | i142;
        int i144 = iIntValue & i107;
        int i145 = (i143 & i144) | (i143 ^ i144);
        int i146 = i145 & iCurrentTimeMillis3;
        int i147 = -(-((~(((i145 | iCurrentTimeMillis3) & (~i146)) | i146)) * 70));
        int i148 = (((~i147) & i141) | ((~i141) & i147)) + ((i141 & i147) << 1);
        int i149 = (i132 | iIntValue) & i132;
        int i150 = i149 & i107;
        int i151 = (i149 | i107) & (~i150);
        int i152 = (i151 & i150) | (i151 ^ i150);
        int i153 = ~i152;
        int i154 = (i152 | i153) & i153;
        int i155 = (i133 & i132) | ((~i133) & iIntValue);
        int i156 = (i155 & i142) | (i155 ^ i142);
        int i157 = ~i156;
        int i158 = (i156 | i157) & i157;
        int i159 = i154 & i158;
        int i160 = (i154 | i158) & (~i159);
        int i161 = (i160 & i159) | (i160 ^ i159);
        int i162 = ~((iIntValue & iCurrentTimeMillis3) | (i132 & iCurrentTimeMillis3) | (iIntValue & i138));
        int i163 = -(~(-(-(((i162 & i161) | (i161 ^ i162)) * 70))));
        int i164 = (i148 & i163) + (i163 | i148);
        ((Integer) auy.setOnFocusChangeListener(new Object[]{24, Integer.valueOf((i164 ^ (-1)) + (i164 << 1)), iArr3, 18}, 167310318, -167310316, 24)).intValue();
        int i165 = f53946a;
        int i166 = i165 & 15;
        int i167 = ((((i165 ^ 15) | i166) << 1) - (~(-((i165 | 15) & (~i166))))) - 1;
        f53947b = i167 % 128;
        int i168 = i167 % 2;
        return null;
    }
}
