package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class arq extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53700f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53701g = 1;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        arq arqVar;
        int i13;
        char c10;
        int i14;
        apl y7;
        int i15;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        arl arlVar;
        int[] iArr4;
        int[] iArr5;
        int i16;
        int i17 = ~i10;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = (((~(i10 | i11)) | (~(i17 | i19))) * 564) + ((~(i12 | i17 | i11)) * 1128) + (((~(i18 | i19)) | i17 | (~(i11 | i12))) * (-564)) + (i11 * 565) + (i10 * (-563));
        if (i20 != 1) {
            if (i20 == 2) {
                arq arqVar2 = (arq) objArr[0];
                int i21 = f53700f;
                int i22 = (i21 ^ 32) + ((i21 & 32) << 1);
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                f53701g = i23 % 128;
                int i24 = i23 % 2;
                if (arqVar2.setIncludeFontPadding()) {
                    int i25 = f53701g + 91;
                    int i26 = i25 % 128;
                    f53700f = i26;
                    int i27 = i25 % 2;
                    int i28 = (i26 & 77) + (i26 | 77);
                    f53701g = i28 % 128;
                    if (i28 % 2 == 0) {
                        int i29 = 64 / 0;
                    }
                    return arqVar2;
                }
                arq arqVar3 = new arq(arqVar2.setDividerPadding, arqVar2.setX, arqVar2.setOnFocusChangeListener.setY(), arqVar2.setY);
                int iIdentityHashCode = System.identityHashCode(arqVar2);
                int i30 = ~iIdentityHashCode;
                int i31 = (i30 ^ 1942056951) | (i30 & 1942056951);
                int i32 = ~i31;
                int i33 = (i31 | i32) & i32;
                int i34 = ((-4067337) & i33) | ((~i33) & 4067336);
                int i35 = i33 & 4067336;
                int i36 = (i35 & i34) | (i34 ^ i35);
                int i37 = (-1388399153) ^ iIdentityHashCode;
                int i38 = (-1388399153) & iIdentityHashCode;
                int i39 = ~((i37 & i38) | (i37 ^ i38));
                int i40 = ((~i39) & i36) | ((~i36) & i39);
                int i41 = i36 & i39;
                int i42 = -(~(((i41 & i40) | (i40 ^ i41)) * 717));
                int i43 = (((303703271 | i42) << 1) - (i42 ^ 303703271)) - 1;
                int i44 = (-1388399153) ^ i30;
                int i45 = i30 & (-1388399153);
                int i46 = (i45 & i44) | (i44 ^ i45);
                int i47 = ~i46;
                int i48 = (i46 | i47) & i47;
                int i49 = i48 ^ 4067336;
                int i50 = i48 & 4067336;
                int i51 = (i50 & i49) | (i49 ^ i50);
                int i52 = 1942056951 & iIdentityHashCode;
                int i53 = (iIdentityHashCode | 1942056951) & (~i52);
                int i54 = (i53 & i52) | (i53 ^ i52);
                int i55 = ~i54;
                int i56 = (i54 | i55) & i55;
                int i57 = i51 & i56;
                int i58 = (((i56 | i51) & (~i57)) | i57) * 717;
                int i59 = i43 ^ i58;
                int i60 = -(-((i58 & i43) << 1));
                int i61 = (i59 ^ i60) + ((i60 & i59) << 1);
                int iIdentityHashCode2 = System.identityHashCode(arqVar2);
                int i62 = ~iIdentityHashCode2;
                int i63 = (iIdentityHashCode2 | i62) & i62;
                int i64 = (1235380600 & i63) | (i63 ^ 1235380600);
                int i65 = i64 & 544036194;
                int i66 = (i64 | 544036194) & (~i65);
                int i67 = (i66 & i65) | (i66 ^ i65);
                int i68 = ~i67;
                int i69 = (i67 | i68) & i68;
                int i70 = -(-(((i69 & 2113888) | (2113888 ^ i69)) * (-828)));
                int i71 = ((1962739698 & i70) - (~(-(-(i70 | 1962739698))))) - 1;
                int i72 = -(-(((i63 & 1777302906) | (1777302906 ^ i63)) * (-828)));
                int i73 = (i71 & i72) + (i72 | i71);
                if (i61 <= (i73 & 1566975532) + (1566975532 | i73)) {
                    return arqVar3;
                }
                throw null;
            }
            apl y10 = (arq) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i74 = f53700f;
            int i75 = i74 & 97;
            int i76 = (i74 | 97) & (~i75);
            int i77 = -(-(i75 << 1));
            int i78 = (i76 ^ i77) + ((i76 & i77) << 1);
            f53701g = i78 % 128;
            int i79 = i78 % 2;
            if (y10.setIncludeFontPadding()) {
                int i80 = f53700f;
                int i81 = i80 | 85;
                int i82 = i81 << 1;
                int i83 = -((~(i80 & 85)) & i81);
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                int i85 = i84 % 128;
                f53701g = i85;
                if (i84 % 2 == 0) {
                    throw null;
                }
                int i86 = i85 & 71;
                int i87 = -(-((i85 ^ 71) | i86));
                int i88 = (i86 ^ i87) + ((i87 & i86) << 1);
                f53700f = i88 % 128;
                if (i88 % 2 == 0) {
                    return aplVar;
                }
                throw null;
            }
            if (!(!aplVar.setIncludeFontPadding())) {
                int i89 = f53701g;
                int i90 = i89 ^ 85;
                int i91 = (i89 & 85) << 1;
                int i92 = (i90 & i91) + (i91 | i90);
                int i93 = i92 % 128;
                f53700f = i93;
                int i94 = i92 % 2;
                int i95 = ((i93 ^ 21) | (i93 & 21)) << 1;
                int i96 = -(((~i93) & 21) | (i93 & (-22)));
                i15 = ((i95 | i96) << 1) - (i96 ^ i95);
            } else {
                if (y10 == aplVar) {
                    int i97 = f53700f;
                    int i98 = ((i97 & 116) + (i97 | 116)) - 1;
                    f53701g = i98 % 128;
                    int i99 = i98 % 2;
                    apl onEditorActionListener = y10.setOnEditorActionListener();
                    int i100 = f53700f;
                    int i101 = ((i100 & (-118)) | ((~i100) & 117)) + ((i100 & 117) << 1);
                    f53701g = i101 % 128;
                    if (i101 % 2 != 0) {
                        return onEditorActionListener;
                    }
                    throw null;
                }
                aph x4 = y10.setX();
                arl arlVar2 = (arl) y10.setX;
                arl arlVar3 = (arl) y10.setOnFocusChangeListener;
                arl arlVar4 = (arl) aplVar.getNavBarTitleString();
                arl arlVar5 = (arl) aplVar.setNavigationOnClickListener();
                arl arlVar6 = (arl) y10.setY[0];
                arl arlVar7 = (arl) aplVar.setY(0);
                int[] iArr6 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
                int[] iArr7 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
                int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                int[] iArr9 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                int[] iArr10 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                boolean navBarTitleString = arlVar6.getNavBarTitleString();
                if (!navBarTitleString) {
                    arm.setX(new Object[]{arlVar6.setOnDragListener, iArr9, iArr6}, 1905043206, -1905043200, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr9, arlVar4.setOnDragListener, iArr8, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr9, arlVar6.setOnDragListener, iArr9, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr9, arlVar5.setOnDragListener, iArr9, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    int i102 = f53700f;
                    int i103 = i102 & 81;
                    int i104 = ((i102 ^ 81) | i103) << 1;
                    int i105 = -((i102 | 81) & (~i103));
                    int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
                    f53701g = i106 % 128;
                    int i107 = i106 % 2;
                    iArr = iArr8;
                    iArr2 = iArr9;
                } else {
                    int i108 = f53701g;
                    int i109 = i108 & 91;
                    int i110 = -(-((i108 ^ 91) | i109));
                    int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                    f53700f = i111 % 128;
                    if (i111 % 2 != 0) {
                        int[] iArr11 = arlVar4.setOnDragListener;
                        int[] iArr12 = arlVar5.setOnDragListener;
                        throw null;
                    }
                    iArr = arlVar4.setOnDragListener;
                    iArr2 = arlVar5.setOnDragListener;
                    int i112 = i108 + 95;
                    f53700f = i112 % 128;
                    int i113 = i112 % 2;
                }
                boolean navBarTitleString2 = arlVar7.getNavBarTitleString();
                if (navBarTitleString2) {
                    int i114 = f53700f;
                    int i115 = i114 & 37;
                    int i116 = -(-(i114 | 37));
                    int i117 = (i115 & i116) + (i116 | i115);
                    int i118 = i117 % 128;
                    f53701g = i118;
                    int i119 = i117 % 2;
                    iArr4 = arlVar2.setOnDragListener;
                    iArr5 = arlVar3.setOnDragListener;
                    int i120 = i118 & 85;
                    int i121 = (i118 ^ 85) | i120;
                    int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
                    f53700f = i122 % 128;
                    int i123 = i122 % 2;
                    arlVar = arlVar7;
                    i16 = 0;
                    iArr3 = iArr10;
                } else {
                    iArr3 = iArr10;
                    arm.setX(new Object[]{arlVar7.setOnDragListener, iArr10, iArr6}, 1905043206, -1905043200, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr3, arlVar2.setOnDragListener, iArr7, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    arlVar = arlVar7;
                    arm.setX(new Object[]{iArr3, arlVar7.setOnDragListener, iArr3, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr3, arlVar3.setOnDragListener, iArr3, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    int i124 = f53700f;
                    int i125 = ((i124 | 59) << 1) - (((~i124) & 59) | (i124 & (-60)));
                    f53701g = i125 % 128;
                    int i126 = i125 % 2;
                    iArr4 = iArr7;
                    iArr5 = iArr3;
                    i16 = 0;
                }
                int[] iArr13 = (int[]) avf.setX(new Object[i16], 2141150830, -2141150807, (int) System.currentTimeMillis());
                Object[] objArr2 = new Object[3];
                objArr2[i16] = iArr4;
                objArr2[1] = iArr;
                objArr2[2] = iArr13;
                arm.setX(objArr2, -1114350457, 1114350462, (int) System.currentTimeMillis());
                arm.setX(new Object[]{iArr5, iArr2, iArr8}, -1114350457, 1114350462, (int) System.currentTimeMillis());
                if (((Boolean) avf.setX(new Object[]{iArr13}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
                    int i127 = f53700f;
                    int i128 = ((i127 | 74) << 1) - (i127 ^ 74);
                    int i129 = (i128 ^ (-1)) + (i128 << 1);
                    f53701g = i129 % 128;
                    int i130 = i129 % 2;
                    if (!(!((Boolean) avf.setX(new Object[]{iArr8}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue())) {
                        int i131 = f53700f;
                        int i132 = (((i131 | 80) << 1) - (i131 ^ 80)) - 1;
                        f53701g = i132 % 128;
                        if (i132 % 2 != 0) {
                            return y10.setOnEditorActionListener();
                        }
                        y10.setOnEditorActionListener();
                        throw null;
                    }
                    y10 = x4.setY();
                    int i133 = f53700f;
                    int i134 = i133 & 45;
                    int i135 = (i133 ^ 45) | i134;
                    i15 = (i134 & i135) + (i135 | i134);
                } else {
                    arm.setX(new Object[]{iArr13, iArr9, iArr6}, 1905043206, -1905043200, (int) System.currentTimeMillis());
                    int[] iArr14 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr9, iArr13, iArr14, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr9, iArr4, iArr9, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr14, iArr14}, -1728650277, 1728650279, (int) System.currentTimeMillis());
                    avf.setX(new Object[]{iArr5, iArr14, iArr7}, -701222223, 701222256, (int) System.currentTimeMillis());
                    int iIntValue = ((Integer) avf.setX(new Object[]{iArr9, iArr9, iArr14}, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
                    int i136 = 1;
                    arm.setX(new Object[]{Integer.valueOf(iIntValue), iArr14}, -232155518, 232155530, iIntValue);
                    arl arlVar8 = new arl(iArr3);
                    arm.setX(new Object[]{iArr8, arlVar8.setOnDragListener, iArr6}, 1905043206, -1905043200, (int) System.currentTimeMillis());
                    int[] iArr15 = arlVar8.setOnDragListener;
                    arm.setX(new Object[]{iArr15, iArr14, iArr15}, -1114350457, 1114350462, (int) System.currentTimeMillis());
                    arl arlVar9 = new arl(iArr14);
                    arm.setX(new Object[]{iArr9, arlVar8.setOnDragListener, arlVar9.setOnDragListener}, -1114350457, 1114350462, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{arlVar9.setOnDragListener, iArr8, iArr7}, -1272840337, 1272840340, (int) System.currentTimeMillis());
                    arm.setX(new Object[]{iArr7, arlVar9.setOnDragListener}, 1883843384, -1883843371, (int) System.currentTimeMillis());
                    arl arlVar10 = new arl(iArr13);
                    if (!navBarTitleString) {
                        int i137 = f53701g;
                        int i138 = (i137 & 10) + (i137 | 10);
                        int i139 = (i138 ^ (-1)) + (i138 << 1);
                        f53700f = i139 % 128;
                        int i140 = i139 % 2;
                        int[] iArr16 = arlVar10.setOnDragListener;
                        arm.setX(new Object[]{iArr16, arlVar6.setOnDragListener, iArr16, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                        int i141 = f53701g + 93;
                        f53700f = i141 % 128;
                        int i142 = i141 % 2;
                        i136 = 1;
                    }
                    if (navBarTitleString2 != i136) {
                        int i143 = f53700f;
                        int i144 = (i143 & 31) + (i143 | 31);
                        f53701g = i144 % 128;
                        int i145 = i144 % 2;
                        int[] iArr17 = arlVar10.setOnDragListener;
                        arm.setX(new Object[]{iArr17, arlVar.setOnDragListener, iArr17, iArr6}, -749654156, 749654164, (int) System.currentTimeMillis());
                        int i146 = f53701g + 3;
                        f53700f = i146 % 128;
                        int i147 = i146 % 2;
                        i136 = 1;
                    }
                    apk[] apkVarArr = new apk[i136];
                    apkVarArr[0] = arlVar10;
                    arqVar = new arq(x4, arlVar8, arlVar9, apkVarArr);
                    int i148 = f53701g + 97;
                    f53700f = i148 % 128;
                    if (i148 % 2 != 0) {
                        throw null;
                    }
                }
            }
            f53701g = i15 % 128;
            int i149 = i15 % 2;
            return y10;
        }
        arqVar = (arq) objArr[0];
        int i150 = f53700f;
        int i151 = i150 & 91;
        int i152 = (i151 - (~(-(-((i150 ^ 91) | i151))))) - 1;
        f53701g = i152 % 128;
        if (i152 % 2 == 0) {
            arqVar.setIncludeFontPadding();
            throw null;
        }
        if (!arqVar.setIncludeFontPadding()) {
            aph x6 = arqVar.setX();
            arl arlVar11 = (arl) arqVar.setOnFocusChangeListener;
            if (!(!arlVar11.setOnDragListener())) {
                int i153 = (-2) - ((f53700f + 62) ^ (-1));
                f53701g = i153 % 128;
                if (i153 % 2 == 0) {
                    y7 = x6.setY();
                    int i154 = 90 / 0;
                } else {
                    y7 = x6.setY();
                }
                int iIdentityHashCode3 = System.identityHashCode(arqVar);
                int i155 = ~iIdentityHashCode3;
                int i156 = (-363482044) - (~(-(-((((-1669307376) & i155) | (i155 ^ (-1669307376))) * 1324))));
                int i157 = ~(((-1097800457) & iIdentityHashCode3) | ((-1097800457) ^ iIdentityHashCode3));
                int i158 = (i155 & (-1650168808)) | (1650168807 & iIdentityHashCode3);
                int i159 = iIdentityHashCode3 & (-1650168808);
                int i160 = ~((i159 & i158) | (i158 ^ i159));
                int i161 = i157 & i160;
                int i162 = (((i160 | i157) & (~i161)) | i161) * (-1324);
                int i163 = ((i156 | i162) << 1) - (i162 ^ i156);
                int i164 = i163 & 165288458;
                int i165 = -(-((165288458 ^ i163) | i164));
                int i166 = (i164 & i165) + (i165 | i164);
                int iIdentityHashCode4 = System.identityHashCode(arqVar);
                int i167 = ~iIdentityHashCode4;
                int i168 = i167 & (i167 | iIdentityHashCode4);
                int i169 = (i168 & 783711903) | ((~i168) & 783711903) | ((-783711904) & i168);
                int i170 = i169 & (-692026645);
                int i171 = (i169 | (-692026645)) & (~i170);
                int i172 = (i171 & i170) | (i171 ^ i170);
                int i173 = ~i172;
                int i174 = (i172 | i173) & i173;
                int i175 = ~(((-674659349) & iIdentityHashCode4) | ((-674659349) ^ iIdentityHashCode4));
                int i176 = i174 & i175;
                int i177 = (i174 | i175) & (~i176);
                int i178 = -(~(((i177 & i176) | (i177 ^ i176)) * (-302)));
                int i179 = (-2) - ((((900084305 | i178) << 1) - (i178 ^ 900084305)) ^ (-1));
                int i180 = ((-17367297) & iIdentityHashCode4) | ((-17367297) ^ iIdentityHashCode4);
                int i181 = ~i180;
                int i182 = -(-(((i180 | i181) & i181) * (-604)));
                int i183 = i179 & i182;
                int i184 = (i179 ^ i182) | i183;
                int i185 = (i183 & i184) + (i184 | i183);
                int i186 = (iIdentityHashCode4 & (-692026645)) | ((-692026645) ^ iIdentityHashCode4);
                int i187 = ~i186;
                int i188 = (i186 | i187) & i187;
                if (i166 > (((i188 & 109052555) | (109052555 ^ i188)) * 302) + i185) {
                    return y7;
                }
                int i189 = 67 / 0;
                return y7;
            }
            arl arlVar12 = (arl) arqVar.setX;
            arl arlVar13 = (arl) arqVar.setY[0];
            int[] iArr18 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            int[] iArr19 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            int[] iArr20 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            int[] iArr21 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            arm.setX(new Object[]{arlVar11.setOnDragListener, iArr21, iArr18}, 1905043206, -1905043200, (int) System.currentTimeMillis());
            int[] iArr22 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            arm.setX(new Object[]{iArr21, iArr22, iArr18}, 1905043206, -1905043200, (int) System.currentTimeMillis());
            boolean navBarTitleString3 = arlVar13.getNavBarTitleString();
            int[] iArr23 = arlVar13.setOnDragListener;
            if (!(!navBarTitleString3)) {
                i13 = 3;
                navBarTitleString3 = navBarTitleString3;
                c10 = 0;
            } else {
                int i190 = f53700f;
                int i191 = i190 ^ 95;
                int i192 = -(-((i190 & 95) << 1));
                int i193 = (i191 & i192) + (i192 | i191);
                f53701g = i193 % 128;
                if (i193 % 2 == 0) {
                    c10 = 0;
                    arm.setX(new Object[]{iArr23, iArr20, iArr18}, 1905043206, -1905043200, (int) System.currentTimeMillis());
                    int i194 = 44 / 0;
                    i13 = 3;
                } else {
                    i13 = 3;
                    c10 = 0;
                    arm.setX(new Object[]{iArr23, iArr20, iArr18}, 1905043206, -1905043200, (int) System.currentTimeMillis());
                }
                iArr23 = iArr20;
            }
            Object[] objArr3 = new Object[i13];
            objArr3[c10] = arlVar12.setOnDragListener;
            objArr3[1] = iArr23;
            objArr3[2] = iArr19;
            arm.setX(objArr3, -1114350457, 1114350462, (int) System.currentTimeMillis());
            Object[] objArr4 = new Object[i13];
            objArr4[0] = arlVar12.setOnDragListener;
            objArr4[1] = iArr23;
            objArr4[2] = iArr20;
            arm.setX(objArr4, 2080958267, -2080958267, (int) System.currentTimeMillis());
            arm.setX(new Object[]{iArr20, iArr19, iArr20, iArr18}, -749654156, 749654164, (int) System.currentTimeMillis());
            int iIntValue2 = ((Integer) avf.setX(new Object[]{iArr20, iArr20, iArr20}, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
            arm.setX(new Object[]{Integer.valueOf(iIntValue2), iArr20}, -232155518, 232155530, iIntValue2);
            arm.setX(new Object[]{iArr21, arlVar12.setOnDragListener, iArr21, iArr18}, -749654156, 749654164, (int) System.currentTimeMillis());
            int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr21, 0}, -841558252, 841558293, 8)).intValue();
            arm.setX(new Object[]{Integer.valueOf(iIntValue3), iArr21}, -232155518, 232155530, iIntValue3);
            int iIntValue4 = ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr22, 0, iArr19}, -1850727291, 1850727294, 8)).intValue();
            arm.setX(new Object[]{Integer.valueOf(iIntValue4), iArr19}, -232155518, 232155530, iIntValue4);
            arl arlVar14 = new arl(iArr22);
            arm.setX(new Object[]{iArr20, arlVar14.setOnDragListener, iArr18}, 1905043206, -1905043200, (int) System.currentTimeMillis());
            int[] iArr24 = arlVar14.setOnDragListener;
            arm.setX(new Object[]{iArr24, iArr21, iArr24}, -1114350457, 1114350462, (int) System.currentTimeMillis());
            int[] iArr25 = arlVar14.setOnDragListener;
            arm.setX(new Object[]{iArr25, iArr21, iArr25}, -1114350457, 1114350462, (int) System.currentTimeMillis());
            arl arlVar15 = new arl(iArr21);
            arm.setX(new Object[]{iArr21, arlVar14.setOnDragListener, arlVar15.setOnDragListener}, -1114350457, 1114350462, (int) System.currentTimeMillis());
            int[] iArr26 = arlVar15.setOnDragListener;
            arm.setX(new Object[]{iArr26, iArr20, iArr26, iArr18}, -749654156, 749654164, (int) System.currentTimeMillis());
            int[] iArr27 = arlVar15.setOnDragListener;
            arm.setX(new Object[]{iArr27, iArr19, iArr27}, -1114350457, 1114350462, (int) System.currentTimeMillis());
            arl arlVar16 = new arl(iArr20);
            arm.setX(new Object[]{arlVar11.setOnDragListener, arlVar16.setOnDragListener}, 774945823, -774945807, (int) System.currentTimeMillis());
            if (navBarTitleString3) {
                i14 = 1;
            } else {
                int i195 = f53701g;
                int i196 = i195 & 45;
                int i197 = -(-((i195 ^ 45) | i196));
                int i198 = ((i196 | i197) << 1) - (i197 ^ i196);
                f53700f = i198 % 128;
                if (i198 % 2 != 0) {
                    int[] iArr28 = arlVar16.setOnDragListener;
                    arm.setX(new Object[]{iArr28, arlVar13.setOnDragListener, iArr28, iArr18}, -749654156, 749654164, (int) System.currentTimeMillis());
                    throw null;
                }
                int[] iArr29 = arlVar16.setOnDragListener;
                arm.setX(new Object[]{iArr29, arlVar13.setOnDragListener, iArr29, iArr18}, -749654156, 749654164, (int) System.currentTimeMillis());
                int i199 = f53700f;
                int i200 = i199 & 37;
                i14 = 1;
                int i201 = ((((i199 ^ 37) | i200) << 1) - (~(-((i199 | 37) & (~i200))))) - 1;
                f53701g = i201 % 128;
                int i202 = i201 % 2;
            }
            apk[] apkVarArr2 = new apk[i14];
            apkVarArr2[0] = arlVar16;
            arq arqVar4 = new arq(x6, arlVar14, arlVar15, apkVarArr2);
            int i203 = f53700f;
            int i204 = (i203 & 61) + (i203 | 61);
            f53701g = i204 % 128;
            if (i204 % 2 != 0) {
                return arqVar4;
            }
            throw null;
        }
        int i205 = f53700f;
        int i206 = (i205 & 45) + (i205 | 45);
        int i207 = i206 % 128;
        f53701g = i207;
        if (i206 % 2 == 0) {
            throw null;
        }
        int i208 = i207 | 121;
        int i209 = i208 << 1;
        int i210 = -((~(i207 & 121)) & i208);
        int i211 = (i209 ^ i210) + ((i210 & i209) << 1);
        f53700f = i211 % 128;
        if (i211 % 2 != 0) {
            int i212 = 18 / 0;
        }
        return arqVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, 293930065, -293930063, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, -1825513452, 1825513453, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 352289557, -352289557, System.identityHashCode(this));
    }
}
