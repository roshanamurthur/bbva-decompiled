package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;

/* JADX INFO: loaded from: classes10.dex */
public abstract class avh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53958a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53959b = 1;

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        boolean z10;
        int iIntValue;
        int i14 = ~i11;
        int i15 = ~i12;
        if ((((~(i10 | i11)) | (~(i12 | i14))) * 49) + (((~((~i10) | i15)) | i14 | (~(i10 | i12))) * (-49)) + (((~(i14 | i15)) | (~(i14 | i10))) * 98) + (i11 * (-97)) + (i10 * 50) == 1) {
            int[] iArr = (int[]) objArr[0];
            int[] iArr2 = (int[]) objArr[1];
            int i16 = f53958a;
            int i17 = (((i16 | 19) << 1) - (~(-(i16 ^ 19)))) - 1;
            f53959b = i17 % 128;
            int i18 = i17 % 2;
            avf.setX(new Object[]{iArr, iArr2}, -44054691, 44054719, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr, iArr2}, 1466054543, -1466054530, (int) System.currentTimeMillis());
            int iIntValue2 = ((Integer) avf.setX(new Object[]{iArr2, iArr2}, -1750371744, 1750371778, (int) System.currentTimeMillis())).intValue();
            int iIntValue3 = ((Integer) avf.setX(new Object[]{iArr2, 0, iArr2, 8, 0}, -1800016288, 1800016318, 0)).intValue();
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i19 = iIntValue3 * (-209);
            int i20 = -(-(iIntValue2 * (-209)));
            int i21 = i19 & i20;
            int i22 = -(-((i19 ^ i20) | i21));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            int i24 = ~iIntValue3;
            int i25 = ~iIntValue2;
            int i26 = (~((i24 & i25) | (i24 ^ i25))) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
            int i27 = i23 & i26;
            int i28 = i26 | i23;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            int i30 = ~iIntValue2;
            int i31 = ~iCurrentTimeMillis;
            int i32 = i30 | i31;
            int i33 = (i32 | (~i32)) & (~i32);
            int i34 = ~iIntValue3;
            int i35 = ((~i34) & iCurrentTimeMillis) | (i34 & i31);
            int i36 = i34 & iCurrentTimeMillis;
            int i37 = ~((i35 ^ i36) | (i35 & i36));
            int i38 = -(~(-(-(((i33 & i37) | (i33 ^ i37)) * ErrorCodes.ERR_CRY_IO_PROPERTIES))));
            int i39 = ((i29 & i38) + (i38 | i29)) - 1;
            int i40 = (~iIntValue3) & (i34 | iIntValue3);
            int i41 = (i40 & i31) | (i40 ^ i31);
            int i42 = (i30 & i41) | ((~i41) & iIntValue2);
            int i43 = i41 & iIntValue2;
            int i44 = ~((i42 & i43) | (i42 ^ i43));
            int i45 = i25 & iIntValue3;
            int i46 = (iIntValue3 | i25) & (~i45);
            int i47 = (i46 & i45) | (i46 ^ i45);
            int i48 = i47 & iCurrentTimeMillis;
            int i49 = (i47 | iCurrentTimeMillis) & (~i48);
            int i50 = ~((i49 & i48) | (i49 ^ i48));
            int i51 = ((~i50) & i44) | ((~i44) & i50);
            int i52 = i50 & i44;
            int i53 = -(~(-(-(((i52 & i51) | (i51 ^ i52)) * ErrorCodes.ERR_CRY_IO_PROPERTIES))));
            int iIntValue4 = ((Integer) avf.setX(new Object[]{iArr2, 24, iArr2, 16, Integer.valueOf(((i39 ^ i53) + ((i53 & i39) << 1)) - 1)}, -1800016288, 1800016318, 24)).intValue();
            int i54 = (iIntValue2 | iIntValue4) << 1;
            int i55 = -(iIntValue4 ^ iIntValue2);
            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
            int[] iArr3 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            ((Boolean) avf.setX(new Object[]{iArr, iArr, iArr3}, -1853348607, 1853348623, (int) System.currentTimeMillis())).booleanValue();
            int[] iArr4 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr3, iArr4}, -44054691, 44054719, (int) System.currentTimeMillis());
            int iIntValue5 = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr4, iArr2, 8}, -1170765211, 1170765236, 16)).intValue();
            int i57 = i56 & iIntValue5;
            ((Integer) auy.setOnFocusChangeListener(new Object[]{32, Integer.valueOf(i57 + ((iIntValue5 ^ i56) | i57)), iArr2, 24}, 167310318, -167310316, 32)).intValue();
            int i58 = f53959b;
            int i59 = i58 & 91;
            int i60 = ((i58 ^ 91) | i59) << 1;
            int i61 = -((i58 | 91) & (~i59));
            int i62 = (i60 ^ i61) + ((i61 & i60) << 1);
            f53958a = i62 % 128;
            int i63 = i62 % 2;
            return null;
        }
        int[] iArr5 = (int[]) objArr[0];
        int[] iArr6 = (int[]) objArr[1];
        int[] iArr7 = (int[]) objArr[2];
        int i64 = f53959b;
        int i65 = ((i64 | 27) << 1) - (i64 ^ 27);
        f53958a = i65 % 128;
        int i66 = i65 % 2;
        avf.setX(new Object[]{iArr5, iArr6, iArr7}, -701222223, 701222256, (int) System.currentTimeMillis());
        avf.setX(new Object[]{iArr5, iArr6, iArr7, 16}, 559032188, -559032183, 16);
        int iIntValue6 = ((Integer) avf.setX(new Object[]{iArr7, iArr7}, -1750371744, 1750371778, (int) System.currentTimeMillis())).intValue();
        int iIntValue7 = ((Integer) avf.setX(new Object[]{iArr7, 0, iArr7, 8, 0}, -1800016288, 1800016318, 0)).intValue();
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i67 = iIntValue7 * 55;
        int i68 = iIntValue6 * (-107);
        int i69 = i67 & i68;
        int i70 = (i67 ^ i68) | i69;
        int i71 = (i69 & i70) + (i69 | i70);
        int i72 = ~iIntValue7;
        int i73 = ~iIntValue6;
        int i74 = i72 & i73;
        int i75 = ~(i74 | ((~i72) & iIntValue6) | (i72 & iIntValue6));
        int i76 = ~iCurrentTimeMillis2;
        int i77 = i76 & (i76 | iCurrentTimeMillis2);
        int i78 = i77 & iIntValue6;
        int i79 = ~(i78 | ((~i78) & (i77 | iIntValue6)));
        int i80 = ((~i75) & i79) | ((~i79) & i75);
        int i81 = i75 & i79;
        int i82 = (i71 - (~(((i81 & i80) | (i80 ^ i81)) * (-108)))) - 1;
        int i83 = (i72 | iIntValue7) & i72;
        int i84 = (i83 & i76) | ((~i83) & iCurrentTimeMillis2);
        int i85 = i83 & iCurrentTimeMillis2;
        int i86 = ~((i85 & i84) | (i84 ^ i85));
        int i87 = (i73 | iIntValue6) & i73;
        int i88 = i87 & iIntValue7;
        int i89 = (i87 | iIntValue7) & (~i88);
        int i90 = (i89 & i88) | (i89 ^ i88);
        int i91 = ~i90;
        int i92 = (i90 | i91) & i91;
        int i93 = ((~i92) & i86) | ((~i86) & i92);
        int i94 = i86 & i92;
        int i95 = (i94 & i93) | (i93 ^ i94);
        int i96 = i76 & iIntValue7;
        int i97 = (i76 | iIntValue7) & (~i96);
        int i98 = ~((i97 & i96) | (i97 ^ i96));
        int i99 = i95 ^ i98;
        int i100 = i95 & i98;
        int i101 = -(-(((i100 & i99) | (i99 ^ i100)) * 54));
        int i102 = ((i82 ^ i101) + ((i101 & i82) << 1)) - (~(-(-(((~((i74 | ((~i73) & iIntValue7)) | (i73 & iIntValue7))) | iCurrentTimeMillis2) * 54))));
        int i103 = -(-((Integer) avf.setX(new Object[]{iArr7, 24, iArr7, 16, Integer.valueOf((i102 ^ (-1)) + (i102 << 1))}, -1800016288, 1800016318, 24)).intValue());
        int i104 = iIntValue6 ^ i103;
        int i105 = (i103 & iIntValue6) << 1;
        int i106 = ((i104 | i105) << 1) - (i105 ^ i104);
        int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        int[] iArr9 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        if (((Boolean) avf.setX(new Object[]{iArr5, iArr5, iArr8}, -1853348607, 1853348623, (int) System.currentTimeMillis())).booleanValue() != ((Boolean) avf.setX(new Object[]{iArr6, iArr6, iArr9}, -1853348607, 1853348623, (int) System.currentTimeMillis())).booleanValue()) {
            int i107 = f53959b;
            int i108 = ((i107 & 32) + (i107 | 32)) - 1;
            f53958a = i108 % 128;
            z10 = i108 % 2 == 0;
            i13 = 0;
        } else {
            int i109 = f53959b + 105;
            f53958a = i109 % 128;
            int i110 = i109 % 2;
            i13 = 0;
            z10 = false;
        }
        int[] iArr10 = (int[]) avf.setX(new Object[i13], 959688236, -959688227, (int) System.currentTimeMillis());
        Object[] objArr2 = new Object[3];
        objArr2[i13] = iArr8;
        objArr2[1] = iArr9;
        objArr2[2] = iArr10;
        avf.setX(objArr2, -701222223, 701222256, (int) System.currentTimeMillis());
        if (z10) {
            int i111 = f53958a;
            int i112 = ((i111 & 77) - (~(-(-(i111 | 77))))) - 1;
            f53959b = i112 % 128;
            int i113 = i112 % 2;
            iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr10, iArr7, 8}, -1551455300, 1551455340, 16)).intValue();
            int i114 = f53959b;
            int i115 = i114 & 91;
            int i116 = (i115 - (~(-(-((i114 ^ 91) | i115))))) - 1;
            f53958a = i116 % 128;
            int i117 = i116 % 2;
        } else {
            iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{16, iArr10, iArr7, 8}, -1170765211, 1170765236, 16)).intValue();
            int i118 = f53959b;
            int i119 = (((i118 ^ 3) | (i118 & 3)) << 1) - (((~i118) & 3) | (i118 & (-4)));
            f53958a = i119 % 128;
            int i120 = i119 % 2;
        }
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i121 = iIntValue * (-711);
        int i122 = -(-(i106 * 713));
        int i123 = i121 & i122;
        int i124 = (i121 ^ i122) | i123;
        int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
        int i126 = ~i106;
        int i127 = ~iIntValue;
        int i128 = (i126 & i127) | ((~i126) & iIntValue);
        int i129 = i126 & iIntValue;
        int i130 = ~((i128 & i129) | (i128 ^ i129));
        int i131 = ~iCurrentTimeMillis3;
        int i132 = (i131 & i127) | ((~i131) & iIntValue);
        int i133 = i131 & iIntValue;
        int i134 = ~((i132 & i133) | (i132 ^ i133));
        int i135 = i130 & i134;
        int i136 = -(-((((i130 | i134) & (~i135)) | i135) * (-712)));
        int i137 = (i125 & i136) + (i125 | i136);
        int i138 = (i126 | i106) & i126;
        int i139 = (i131 | iCurrentTimeMillis3) & i131;
        int i140 = ((~i139) & i138) | ((~i138) & i139);
        int i141 = i138 & i139;
        int i142 = (i141 & i140) | (i140 ^ i141);
        int i143 = i142 & iIntValue;
        int i144 = ((i142 | iIntValue) & (~i143)) | i143;
        int i145 = ~i144;
        int i146 = (i144 | i145) & i145;
        int i147 = (i127 & i106) | i129;
        int i148 = i106 & iIntValue;
        int i149 = (i148 & i147) | (i147 ^ i148);
        int i150 = (iCurrentTimeMillis3 & i149) | (i149 ^ iCurrentTimeMillis3);
        int i151 = ~i150;
        int i152 = (i150 | i151) & i151;
        int i153 = i146 ^ i152;
        int i154 = i152 & i146;
        int i155 = ((i154 & i153) | (i153 ^ i154)) * (-712);
        int i156 = ((i137 | i155) << 1) - (i155 ^ i137);
        int i157 = (iIntValue | i131) & (~i133);
        int i158 = ~((i157 & i133) | (i157 ^ i133));
        int i159 = i126 & i158;
        ((Integer) auy.setOnFocusChangeListener(new Object[]{32, Integer.valueOf((i156 - (~(-(~((((i158 | i126) & (~i159)) | i159) * 712))))) - 2), iArr7, 24}, 167310318, -167310316, 32)).intValue();
        int i160 = f53959b;
        int i161 = i160 & 119;
        int i162 = -(-((i160 ^ 119) | i161));
        int i163 = ((i161 | i162) << 1) - (i162 ^ i161);
        f53958a = i163 % 128;
        if (i163 % 2 == 0) {
            return null;
        }
        int i164 = 68 / 0;
        return null;
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -173321722, 173321722, (int) System.currentTimeMillis());
    }

    public static void setX(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -451579636, 451579637, (int) System.currentTimeMillis());
    }
}
