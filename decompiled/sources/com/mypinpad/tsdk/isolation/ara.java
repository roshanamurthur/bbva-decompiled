package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;

/* JADX INFO: loaded from: classes10.dex */
public final class ara extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53646f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53647g = 1;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        apl y7;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        char c10;
        int[] iArr4;
        int[] iArr5;
        int i13;
        char c11;
        int i14;
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (((~(i10 | i16 | i11)) | (~(i12 | i15)) | (~((~i10) | i15))) * 988) + ((i10 | i15) * (-988)) + (((~(i15 | i16 | i10)) | (~(i10 | i11 | i12))) * 988) + (i11 * (-987)) + (i10 * 989);
        if (i17 == 1) {
            y7 = (ara) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i18 = f53646f;
            int i19 = i18 & 111;
            int i20 = ((i18 ^ 111) | i19) << 1;
            int i21 = -((i18 | 111) & (~i19));
            int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
            f53647g = i22 % 128;
            if (i22 % 2 == 0) {
                y7.setIncludeFontPadding();
                throw null;
            }
            if (y7.setIncludeFontPadding()) {
                int iIdentityHashCode = System.identityHashCode(y7);
                int i23 = ~iIdentityHashCode;
                int i24 = (-256175544) ^ i23;
                int i25 = i23 & (-256175544);
                int i26 = i24 | i25;
                int i27 = ~i26;
                int i28 = (i26 | i27) & i27;
                int i29 = i28 ^ 270743;
                int i30 = i28 & 270743;
                int i31 = ((i30 & i29) | (i29 ^ i30)) * (-245);
                int i32 = (1752801882 & i31) + (i31 | 1752801882);
                int i33 = (-256175544) & iIdentityHashCode;
                int i34 = ((-256175544) | iIdentityHashCode) & (~i33);
                int i35 = (i34 & i33) | (i34 ^ i33);
                int i36 = ~i35;
                int i37 = ((i35 | i36) & i36) * (-245);
                int i38 = i32 & i37;
                int i39 = (i37 ^ i32) | i38;
                int i40 = (i38 & i39) + (i39 | i38);
                int i41 = (iIdentityHashCode & 256175543) | i25;
                int i42 = ~((i41 & i33) | (i41 ^ i33));
                int i43 = ((~i42) & 532728928) | ((-532728929) & i42);
                int i44 = i42 & 532728928;
                int i45 = -(-(((i44 & i43) | (i43 ^ i44)) * 245));
                int i46 = i40 | i45;
                int i47 = (i46 << 1) - ((~(i45 & i40)) & i46);
                int iIdentityHashCode2 = System.identityHashCode(y7);
                int i48 = 181218686 & iIdentityHashCode2;
                int i49 = (181218686 | iIdentityHashCode2) & (~i48);
                int i50 = ~iIdentityHashCode2;
                int i51 = (i49 & i48) | (i49 ^ i48);
                int i52 = ~i51;
                int i53 = (i51 | i52) & i52;
                int i54 = (-183468032) & i53;
                int i55 = (i53 | (-183468032)) & (~i54);
                int i56 = -(~(-(-(((i55 & i54) | (i55 ^ i54)) * ReturnCode.ERR_CONN_IO))));
                int i57 = ((-1296107295) ^ i56) + ((i56 & (-1296107295)) << 1);
                int i58 = (i57 ^ (-1)) + (i57 << 1);
                int i59 = (i50 & (-2249346)) | (2249345 & iIdentityHashCode2);
                int i60 = iIdentityHashCode2 & (-2249346);
                int i61 = (i60 & i59) | (i59 ^ i60);
                int i62 = ~i61;
                int i63 = ((i61 | i62) & i62) * (-1504);
                int i64 = (i58 ^ i63) + ((i63 & i58) << 1);
                if (i47 > ((((i64 ^ 2035582448) | (i64 & 2035582448)) << 1) - (~(-((2035582448 & (~i64)) | ((-2035582449) & i64))))) - 1) {
                    return aplVar;
                }
                throw null;
            }
            if (aplVar.setIncludeFontPadding()) {
                int i65 = f53646f;
                int i66 = i65 + 97;
                f53647g = i66 % 128;
                if (i66 % 2 == 0) {
                    throw null;
                }
                int i67 = (i65 & 115) + (i65 | 115);
                f53647g = i67 % 128;
                int i68 = i67 % 2;
            } else if (y7 == aplVar) {
                int i69 = f53647g;
                int i70 = i69 & 91;
                int i71 = -(-((i69 ^ 91) | i70));
                int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
                f53646f = i72 % 128;
                int i73 = i72 % 2;
                y7 = y7.setOnEditorActionListener();
                int i74 = f53646f;
                int i75 = i74 ^ 63;
                int i76 = (i74 & 63) << 1;
                int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                f53647g = i77 % 128;
                int i78 = i77 % 2;
            } else {
                aph x4 = y7.setX();
                aqz aqzVar = (aqz) y7.setX;
                aqz aqzVar2 = (aqz) y7.setOnFocusChangeListener;
                aqz aqzVar3 = (aqz) aplVar.getNavBarTitleString();
                aqz aqzVar4 = (aqz) aplVar.setNavigationOnClickListener();
                aqz aqzVar5 = (aqz) y7.setY[0];
                aqz aqzVar6 = (aqz) aplVar.setY(0);
                int[] iArr6 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                int[] iArr7 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                int[] iArr8 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                int[] iArr9 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                boolean navBarTitleString = aqzVar5.getNavBarTitleString();
                if (navBarTitleString) {
                    int i79 = f53646f;
                    int i80 = i79 & 83;
                    int i81 = i80 + ((i79 ^ 83) | i80);
                    int i82 = i81 % 128;
                    f53647g = i82;
                    int i83 = i81 % 2;
                    iArr2 = aqzVar3.setNavigationOnClickListener;
                    iArr3 = aqzVar4.setNavigationOnClickListener;
                    int i84 = (i82 & (-126)) | ((~i82) & 125);
                    int i85 = -(-((i82 & 125) << 1));
                    int i86 = (i84 & i85) + (i84 | i85);
                    f53646f = i86 % 128;
                    int i87 = i86 % 2;
                    iArr = iArr8;
                } else {
                    arb.setDividerPadding(new Object[]{aqzVar5.setNavigationOnClickListener, iArr8}, 698806222, -698806208, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr8, aqzVar3.setNavigationOnClickListener, iArr7}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    iArr = iArr8;
                    arb.setDividerPadding(new Object[]{iArr8, aqzVar5.setNavigationOnClickListener, iArr8}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr, aqzVar4.setNavigationOnClickListener, iArr}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    int i88 = f53647g;
                    int i89 = (i88 & (-54)) | ((~i88) & 53);
                    int i90 = (i88 & 53) << 1;
                    int i91 = (i89 ^ i90) + ((i90 & i89) << 1);
                    f53646f = i91 % 128;
                    int i92 = i91 % 2;
                    iArr2 = iArr7;
                    iArr3 = iArr;
                }
                boolean navBarTitleString2 = aqzVar6.getNavBarTitleString();
                if (navBarTitleString2) {
                    int i93 = f53646f;
                    int i94 = i93 & 117;
                    int i95 = (i93 ^ 117) | i94;
                    int i96 = (i94 & i95) + (i94 | i95);
                    f53647g = i96 % 128;
                    int i97 = i96 % 2;
                    int[] iArr10 = aqzVar.setNavigationOnClickListener;
                    int[] iArr11 = aqzVar2.setNavigationOnClickListener;
                    int i98 = (i93 & 109) + (i93 | 109);
                    f53647g = i98 % 128;
                    int i99 = i98 % 2;
                    i13 = 0;
                    iArr4 = iArr11;
                    iArr5 = iArr10;
                    c10 = 2;
                } else {
                    arb.setDividerPadding(new Object[]{aqzVar6.setNavigationOnClickListener, iArr9}, 698806222, -698806208, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr9, aqzVar.setNavigationOnClickListener, iArr6}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr9, aqzVar6.setNavigationOnClickListener, iArr9}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr9, aqzVar2.setNavigationOnClickListener, iArr9}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    int i100 = f53646f;
                    int i101 = ((i100 | 109) << 1) - (i100 ^ 109);
                    f53647g = i101 % 128;
                    c10 = 2;
                    int i102 = i101 % 2;
                    iArr4 = iArr9;
                    iArr5 = iArr6;
                    i13 = 0;
                }
                int[] iArr12 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[i13], -1111614385, 1111614387, (int) System.currentTimeMillis());
                Object[] objArr2 = new Object[3];
                objArr2[i13] = iArr5;
                objArr2[1] = iArr2;
                objArr2[c10] = iArr12;
                int[] iArr13 = iArr5;
                arb.setDividerPadding(objArr2, -796404586, 796404594, (int) System.currentTimeMillis());
                Object[] objArr3 = new Object[3];
                objArr3[i13] = iArr4;
                objArr3[1] = iArr3;
                objArr3[2] = iArr7;
                arb.setDividerPadding(objArr3, -796404586, 796404594, (int) System.currentTimeMillis());
                Object[] objArr4 = new Object[1];
                objArr4[i13] = iArr12;
                if (!((Boolean) avb.setCompoundDrawableTintBlendMode(objArr4, -1700010143, 1700010151, (int) System.currentTimeMillis())).booleanValue()) {
                    arb.setDividerPadding(new Object[]{iArr12, iArr}, 698806222, -698806208, (int) System.currentTimeMillis());
                    int[] iArr14 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr, iArr12, iArr14}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr, iArr13, iArr}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr14, iArr14}, 1127209560, -1127209547, (int) System.currentTimeMillis());
                    avb.setCompoundDrawableTintBlendMode(new Object[]{iArr4, iArr14, iArr6}, 1112455082, -1112455081, (int) System.currentTimeMillis());
                    int iIntValue = ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr14}, -1985953730, 1985953735, (int) System.currentTimeMillis())).intValue();
                    arb.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr14}, 1276549985, -1276549981, iIntValue);
                    aqz aqzVar7 = new aqz(iArr9);
                    arb.setDividerPadding(new Object[]{iArr7, aqzVar7.setNavigationOnClickListener}, 698806222, -698806208, (int) System.currentTimeMillis());
                    int[] iArr15 = aqzVar7.setNavigationOnClickListener;
                    arb.setDividerPadding(new Object[]{iArr15, iArr14, iArr15}, -796404586, 796404594, (int) System.currentTimeMillis());
                    aqz aqzVar8 = new aqz(iArr14);
                    arb.setDividerPadding(new Object[]{iArr, aqzVar7.setNavigationOnClickListener, aqzVar8.setNavigationOnClickListener}, -796404586, 796404594, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{aqzVar8.setNavigationOnClickListener, iArr7, iArr6}, -2028013091, 2028013098, (int) System.currentTimeMillis());
                    arb.setDividerPadding(new Object[]{iArr6, aqzVar8.setNavigationOnClickListener}, -53995853, 53995859, (int) System.currentTimeMillis());
                    aqz aqzVar9 = new aqz(iArr12);
                    if (!navBarTitleString) {
                        int i103 = f53647g;
                        int i104 = (i103 ^ 19) + ((i103 & 19) << 1);
                        f53646f = i104 % 128;
                        if (i104 % 2 != 0) {
                            int[] iArr16 = aqzVar9.setNavigationOnClickListener;
                            arb.setDividerPadding(new Object[]{iArr16, aqzVar5.setNavigationOnClickListener, iArr16}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                            int i105 = 22 / 0;
                        } else {
                            int[] iArr17 = aqzVar9.setNavigationOnClickListener;
                            arb.setDividerPadding(new Object[]{iArr17, aqzVar5.setNavigationOnClickListener, iArr17}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                        }
                        int i106 = f53647g;
                        int i107 = ((i106 & 86) + (i106 | 86)) - 1;
                        f53646f = i107 % 128;
                        int i108 = i107 % 2;
                    }
                    if (navBarTitleString2) {
                        c11 = 0;
                        i14 = 1;
                    } else {
                        int i109 = f53647g;
                        int i110 = i109 & 125;
                        int i111 = i110 + ((i109 ^ 125) | i110);
                        f53646f = i111 % 128;
                        if (i111 % 2 != 0) {
                            int[] iArr18 = aqzVar9.setNavigationOnClickListener;
                            arb.setDividerPadding(new Object[]{iArr18, aqzVar6.setNavigationOnClickListener, iArr18}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                            throw null;
                        }
                        int[] iArr19 = aqzVar9.setNavigationOnClickListener;
                        c11 = 0;
                        i14 = 1;
                        arb.setDividerPadding(new Object[]{iArr19, aqzVar6.setNavigationOnClickListener, iArr19}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    }
                    apk[] apkVarArr = new apk[i14];
                    apkVarArr[c11] = aqzVar9;
                    ara araVar = new ara(x4, aqzVar7, aqzVar8, apkVarArr);
                    int i112 = f53646f;
                    int i113 = (i112 & 61) + (i112 | 61);
                    f53647g = i113 % 128;
                    if (i113 % 2 != 0) {
                        return araVar;
                    }
                    throw null;
                }
                int i114 = f53647g;
                int i115 = (i114 | 73) << 1;
                int i116 = -(i114 ^ 73);
                int i117 = (i115 & i116) + (i116 | i115);
                f53646f = i117 % 128;
                if (i117 % 2 != 0) {
                    ((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr7}, -1700010143, 1700010151, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr7}, -1700010143, 1700010151, (int) System.currentTimeMillis())).booleanValue()) {
                    y7 = y7.setOnEditorActionListener();
                    int i118 = f53647g;
                    int i119 = i118 & 47;
                    int i120 = i119 + ((i118 ^ 47) | i119);
                    f53646f = i120 % 128;
                    if (i120 % 2 != 0) {
                        throw null;
                    }
                } else {
                    y7 = x4.setY();
                    int i121 = f53646f;
                    int i122 = i121 & 9;
                    int i123 = (i121 ^ 9) | i122;
                    int i124 = ((i122 | i123) << 1) - (i123 ^ i122);
                    f53647g = i124 % 128;
                    if (i124 % 2 == 0) {
                        throw null;
                    }
                }
            }
        } else {
            if (i17 != 2) {
                ara araVar2 = (ara) objArr[0];
                int i125 = f53647g;
                int i126 = ((i125 ^ 98) + ((i125 & 98) << 1)) - 1;
                f53646f = i126 % 128;
                int i127 = i126 % 2;
                if (!(!araVar2.setIncludeFontPadding())) {
                    int i128 = f53647g;
                    int i129 = i128 & 81;
                    int i130 = i129 + ((i128 ^ 81) | i129);
                    int i131 = i130 % 128;
                    f53646f = i131;
                    if (i130 % 2 != 0) {
                        throw null;
                    }
                    int i132 = i131 & 77;
                    int i133 = -(-((i131 ^ 77) | i132));
                    int i134 = ((i132 | i133) << 1) - (i133 ^ i132);
                    f53647g = i134 % 128;
                    if (i134 % 2 != 0) {
                        return araVar2;
                    }
                    throw null;
                }
                aph x6 = araVar2.setX();
                aqz aqzVar10 = (aqz) araVar2.setOnFocusChangeListener;
                if (aqzVar10.setOnDragListener()) {
                    int i135 = f53647g;
                    int i136 = ((i135 & 64) + (i135 | 64)) - 1;
                    f53646f = i136 % 128;
                    if (i136 % 2 == 0) {
                        return x6.setY();
                    }
                    x6.setY();
                    throw null;
                }
                aqz aqzVar11 = (aqz) araVar2.setX;
                aqz aqzVar12 = (aqz) araVar2.setY[0];
                int[] iArr20 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                arb.setDividerPadding(new Object[]{aqzVar10.setNavigationOnClickListener, iArr20}, 698806222, -698806208, (int) System.currentTimeMillis());
                int[] iArr21 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                arb.setDividerPadding(new Object[]{iArr20, iArr21}, 698806222, -698806208, (int) System.currentTimeMillis());
                int[] iArr22 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                arb.setDividerPadding(new Object[]{aqzVar11.setNavigationOnClickListener, iArr22}, 698806222, -698806208, (int) System.currentTimeMillis());
                int iIntValue2 = ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr22, iArr22, iArr22}, -1985953730, 1985953735, (int) System.currentTimeMillis())).intValue();
                arb.setDividerPadding(new Object[]{Integer.valueOf(iIntValue2), iArr22}, 1276549985, -1276549981, iIntValue2);
                arb.setDividerPadding(new Object[]{iArr20, aqzVar11.setNavigationOnClickListener, iArr20}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr20, 0}, -841558252, 841558293, 7)).intValue();
                arb.setDividerPadding(new Object[]{Integer.valueOf(iIntValue3), iArr20}, 1276549985, -1276549981, iIntValue3);
                int[] iArr23 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                int iIntValue4 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr21, 0, iArr23}, -1850727291, 1850727294, 7)).intValue();
                arb.setDividerPadding(new Object[]{Integer.valueOf(iIntValue4), iArr23}, 1276549985, -1276549981, iIntValue4);
                aqz aqzVar13 = new aqz(iArr21);
                arb.setDividerPadding(new Object[]{iArr22, aqzVar13.setNavigationOnClickListener}, 698806222, -698806208, (int) System.currentTimeMillis());
                int[] iArr24 = aqzVar13.setNavigationOnClickListener;
                arb.setDividerPadding(new Object[]{iArr24, iArr20, iArr24}, -796404586, 796404594, (int) System.currentTimeMillis());
                int[] iArr25 = aqzVar13.setNavigationOnClickListener;
                arb.setDividerPadding(new Object[]{iArr25, iArr20, iArr25}, -796404586, 796404594, (int) System.currentTimeMillis());
                aqz aqzVar14 = new aqz(iArr20);
                arb.setDividerPadding(new Object[]{iArr20, aqzVar13.setNavigationOnClickListener, aqzVar14.setNavigationOnClickListener}, -796404586, 796404594, (int) System.currentTimeMillis());
                int[] iArr26 = aqzVar14.setNavigationOnClickListener;
                arb.setDividerPadding(new Object[]{iArr26, iArr22, iArr26}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                int[] iArr27 = aqzVar14.setNavigationOnClickListener;
                arb.setDividerPadding(new Object[]{iArr27, iArr23, iArr27}, -796404586, 796404594, (int) System.currentTimeMillis());
                aqz aqzVar15 = new aqz(iArr22);
                arb.setDividerPadding(new Object[]{aqzVar10.setNavigationOnClickListener, aqzVar15.setNavigationOnClickListener}, 107180563, -107180560, (int) System.currentTimeMillis());
                if (!aqzVar12.getNavBarTitleString()) {
                    int i137 = f53646f + 53;
                    f53647g = i137 % 128;
                    if (i137 % 2 == 0) {
                        int[] iArr28 = aqzVar15.setNavigationOnClickListener;
                        arb.setDividerPadding(new Object[]{iArr28, aqzVar12.setNavigationOnClickListener, iArr28}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                        throw null;
                    }
                    int[] iArr29 = aqzVar15.setNavigationOnClickListener;
                    arb.setDividerPadding(new Object[]{iArr29, aqzVar12.setNavigationOnClickListener, iArr29}, 1672659068, -1672659067, (int) System.currentTimeMillis());
                    int i138 = f53647g;
                    int i139 = i138 & 69;
                    int i140 = -(-((i138 ^ 69) | i139));
                    int i141 = ((i139 | i140) << 1) - (i140 ^ i139);
                    f53646f = i141 % 128;
                    int i142 = i141 % 2;
                }
                ara araVar3 = new ara(x6, aqzVar13, aqzVar14, new apk[]{aqzVar15});
                int i143 = f53647g;
                int i144 = i143 & 17;
                int i145 = (i143 ^ 17) | i144;
                int i146 = (i144 ^ i145) + ((i145 & i144) << 1);
                f53646f = i146 % 128;
                int i147 = i146 % 2;
                return araVar3;
            }
            y7 = (ara) objArr[0];
            int i148 = f53647g + 46;
            int i149 = (i148 ^ (-1)) + (i148 << 1);
            f53646f = i149 % 128;
            int i150 = i149 % 2;
            if (!y7.setIncludeFontPadding()) {
                ara araVar4 = new ara(y7.setDividerPadding, y7.setX, y7.setOnFocusChangeListener.setY(), y7.setY);
                int i151 = f53646f;
                int i152 = i151 & 31;
                int i153 = (i151 | 31) & (~i152);
                int i154 = -(-(i152 << 1));
                int i155 = (i153 & i154) + (i153 | i154);
                f53647g = i155 % 128;
                int i156 = i155 % 2;
                return araVar4;
            }
            int i157 = f53646f;
            int i158 = i157 + 32;
            int i159 = (i158 ^ (-1)) + (i158 << 1);
            f53647g = i159 % 128;
            if (i159 % 2 == 0) {
                throw null;
            }
            int i160 = ((i157 ^ 61) | (i157 & 61)) << 1;
            int i161 = -(((~i157) & 61) | (i157 & (-62)));
            int i162 = ((i160 | i161) << 1) - (i161 ^ i160);
            f53647g = i162 % 128;
            if (i162 % 2 == 0) {
                int i163 = 52 / 0;
            }
        }
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, -748914348, 748914350, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, -572750068, 572750068, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, -737903838, 737903839, System.identityHashCode(this));
    }
}
