package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aqi extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53586f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53587g = 1;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        apl y7;
        char c10;
        int[] iArr;
        int i13;
        int[] iArr2;
        int[] iArr3;
        aqj aqjVar;
        char c11;
        int[] iArr4;
        int[] iArr5;
        int i14 = ~i10;
        int i15 = (~(i14 | i12)) | (~((~i11) | i14));
        int i16 = ((i11 | i12) * 496) + (((~(i10 | (~i12) | i11)) | i15) * (-496)) + (i15 * 992) + (i11 * (-495)) + (i10 * (-495));
        if (i16 != 1) {
            if (i16 == 2) {
                aqi aqiVar = (aqi) objArr[0];
                int i17 = f53586f;
                int i18 = (i17 & (-82)) | ((~i17) & 81);
                int i19 = (i17 & 81) << 1;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f53587g = i20 % 128;
                if (i20 % 2 == 0) {
                    aqiVar.setIncludeFontPadding();
                    throw null;
                }
                if (aqiVar.setIncludeFontPadding()) {
                    int i21 = f53587g;
                    int i22 = ((i21 ^ 33) | (i21 & 33)) << 1;
                    int i23 = -(((~i21) & 33) | (i21 & (-34)));
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    f53586f = i24 % 128;
                    if (i24 % 2 != 0) {
                        throw null;
                    }
                } else {
                    aph x4 = aqiVar.setX();
                    aqj aqjVar2 = (aqj) aqiVar.setOnFocusChangeListener;
                    if (!aqjVar2.setOnDragListener()) {
                        aqj aqjVar3 = (aqj) aqiVar.setX;
                        aqj aqjVar4 = (aqj) aqiVar.setY[0];
                        int[] iArr6 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
                        int[] iArr7 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
                        int[] iArr8 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
                        aqc.setX(new Object[]{aqjVar2.getNavBarTitleString, iArr8}, -975657781, 975657784, (int) System.currentTimeMillis());
                        int[] iArr9 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
                        aqc.setX(new Object[]{iArr8, iArr9}, -975657781, 975657784, (int) System.currentTimeMillis());
                        boolean navBarTitleString = aqjVar4.getNavBarTitleString();
                        int[] iArr10 = aqjVar4.getNavBarTitleString;
                        if (navBarTitleString) {
                            iArr = iArr10;
                            c10 = 2;
                        } else {
                            int i25 = f53587g;
                            int i26 = i25 ^ 13;
                            int i27 = (i25 & 13) << 1;
                            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                            f53586f = i28 % 128;
                            if (i28 % 2 != 0) {
                                aqc.setX(new Object[]{iArr10, iArr7}, -975657781, 975657784, (int) System.currentTimeMillis());
                                throw null;
                            }
                            aqc.setX(new Object[]{iArr10, iArr7}, -975657781, 975657784, (int) System.currentTimeMillis());
                            int i29 = f53587g;
                            int i30 = ((i29 & (-126)) | ((~i29) & 125)) + ((i29 & 125) << 1);
                            f53586f = i30 % 128;
                            c10 = 2;
                            int i31 = i30 % 2;
                            iArr = iArr7;
                        }
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = aqjVar3.getNavBarTitleString;
                        objArr2[1] = iArr;
                        objArr2[c10] = iArr6;
                        aqc.setX(objArr2, 1933393358, -1933393343, (int) System.currentTimeMillis());
                        aqc.setX(new Object[]{aqjVar3.getNavBarTitleString, iArr, iArr7}, -918821368, 918821372, (int) System.currentTimeMillis());
                        aqc.setX(new Object[]{iArr7, iArr6, iArr7}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                        int iIntValue = ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr7, iArr7, iArr7}, 403538937, -403538929, (int) System.currentTimeMillis())).intValue();
                        aqc.setX(new Object[]{Integer.valueOf(iIntValue), iArr7}, -1452770434, 1452770439, iIntValue);
                        aqc.setX(new Object[]{iArr8, aqjVar3.getNavBarTitleString, iArr8}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                        int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{4, iArr8, 0}, -841558252, 841558293, 4)).intValue();
                        aqc.setX(new Object[]{Integer.valueOf(iIntValue2), iArr8}, -1452770434, 1452770439, iIntValue2);
                        int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{4, iArr9, 0, iArr6}, -1850727291, 1850727294, 4)).intValue();
                        aqc.setX(new Object[]{Integer.valueOf(iIntValue3), iArr6}, -1452770434, 1452770439, iIntValue3);
                        aqj aqjVar5 = new aqj(iArr9);
                        aqc.setX(new Object[]{iArr7, aqjVar5.getNavBarTitleString}, -975657781, 975657784, (int) System.currentTimeMillis());
                        int[] iArr11 = aqjVar5.getNavBarTitleString;
                        aqc.setX(new Object[]{iArr11, iArr8, iArr11}, 1933393358, -1933393343, (int) System.currentTimeMillis());
                        int[] iArr12 = aqjVar5.getNavBarTitleString;
                        aqc.setX(new Object[]{iArr12, iArr8, iArr12}, 1933393358, -1933393343, (int) System.currentTimeMillis());
                        aqj aqjVar6 = new aqj(iArr8);
                        aqc.setX(new Object[]{iArr8, aqjVar5.getNavBarTitleString, aqjVar6.getNavBarTitleString}, 1933393358, -1933393343, (int) System.currentTimeMillis());
                        int[] iArr13 = aqjVar6.getNavBarTitleString;
                        aqc.setX(new Object[]{iArr13, iArr7, iArr13}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                        int[] iArr14 = aqjVar6.getNavBarTitleString;
                        aqc.setX(new Object[]{iArr14, iArr6, iArr14}, 1933393358, -1933393343, (int) System.currentTimeMillis());
                        aqj aqjVar7 = new aqj(iArr7);
                        aqc.setX(new Object[]{aqjVar2.getNavBarTitleString, aqjVar7.getNavBarTitleString}, -530007090, 530007100, (int) System.currentTimeMillis());
                        if (navBarTitleString) {
                            i13 = 1;
                        } else {
                            int i32 = f53586f;
                            i13 = 1;
                            int i33 = (i32 ^ 65) + ((i32 & 65) << 1);
                            f53587g = i33 % 128;
                            int i34 = i33 % 2;
                            int[] iArr15 = aqjVar7.getNavBarTitleString;
                            aqc.setX(new Object[]{iArr15, aqjVar4.getNavBarTitleString, iArr15}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                            int i35 = f53586f;
                            int i36 = i35 ^ 17;
                            int i37 = -(-((i35 & 17) << 1));
                            int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                            f53587g = i38 % 128;
                            int i39 = i38 % 2;
                        }
                        apk[] apkVarArr = new apk[i13];
                        apkVarArr[0] = aqjVar7;
                        aqiVar = new aqi(x4, aqjVar5, aqjVar6, apkVarArr);
                        int i40 = f53587g + 31;
                        f53586f = i40 % 128;
                        if (i40 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        int i41 = f53586f;
                        int i42 = ((i41 | 109) << 1) - (i41 ^ 109);
                        f53587g = i42 % 128;
                        if (i42 % 2 == 0) {
                            x4.setY();
                            throw null;
                        }
                        y7 = x4.setY();
                        int i43 = f53587g;
                        int i44 = i43 ^ 25;
                        int i45 = ((i43 & 25) | i44) << 1;
                        int i46 = -i44;
                        int i47 = (i45 & i46) + (i45 | i46);
                        f53586f = i47 % 128;
                        if (i47 % 2 != 0) {
                            int i48 = 99 / 0;
                        }
                    }
                }
                return aqiVar;
            }
            aqi aqiVar2 = (aqi) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i49 = f53587g;
            int i50 = ((((i49 ^ 93) | (i49 & 93)) << 1) - (~(-(((~i49) & 93) | (i49 & (-94)))))) - 1;
            f53586f = i50 % 128;
            int i51 = i50 % 2;
            if (aqiVar2.setIncludeFontPadding()) {
                int i52 = f53587g;
                int i53 = (i52 & (-20)) | ((~i52) & 19);
                int i54 = (i52 & 19) << 1;
                int i55 = (i53 & i54) + (i54 | i53);
                int i56 = i55 % 128;
                f53586f = i56;
                if (i55 % 2 != 0) {
                    throw null;
                }
                int i57 = (-2) - (((i56 & 82) + (i56 | 82)) ^ (-1));
                f53587g = i57 % 128;
                int i58 = i57 % 2;
                return aplVar;
            }
            if (aplVar.setIncludeFontPadding()) {
                int i59 = f53586f;
                int i60 = ((i59 ^ 101) | (i59 & 101)) << 1;
                int i61 = -(((~i59) & 101) | (i59 & (-102)));
                int i62 = (i60 & i61) + (i61 | i60);
                f53587g = i62 % 128;
                if (i62 % 2 != 0) {
                    return aqiVar2;
                }
                throw null;
            }
            if (aqiVar2 == aplVar) {
                int i63 = f53587g;
                int i64 = (i63 & 95) + (i63 | 95);
                f53586f = i64 % 128;
                int i65 = i64 % 2;
                apl onEditorActionListener = aqiVar2.setOnEditorActionListener();
                int i66 = f53586f;
                int i67 = (((i66 | 12) << 1) - (i66 ^ 12)) - 1;
                f53587g = i67 % 128;
                if (i67 % 2 != 0) {
                    return onEditorActionListener;
                }
                int i68 = 45 / 0;
                return onEditorActionListener;
            }
            aph x6 = aqiVar2.setX();
            aqj aqjVar8 = (aqj) aqiVar2.setX;
            aqj aqjVar9 = (aqj) aqiVar2.setOnFocusChangeListener;
            aqj aqjVar10 = (aqj) aplVar.getNavBarTitleString();
            aqj aqjVar11 = (aqj) aplVar.setNavigationOnClickListener();
            aqj aqjVar12 = (aqj) aqiVar2.setY[0];
            aqj aqjVar13 = (aqj) aplVar.setY(0);
            int[] iArr16 = (int[]) auw.setOnFocusChangeListener(new Object[0], -1845968634, 1845968651, (int) System.currentTimeMillis());
            int[] iArr17 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
            int[] iArr18 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
            int[] iArr19 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
            boolean navBarTitleString2 = aqjVar12.getNavBarTitleString();
            if (navBarTitleString2) {
                int i69 = f53587g;
                int i70 = ((i69 ^ 103) | (i69 & 103)) << 1;
                int i71 = -((i69 & (-104)) | ((~i69) & 103));
                int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                f53586f = i72 % 128;
                int i73 = i72 % 2;
                iArr3 = aqjVar10.getNavBarTitleString;
                int[] iArr20 = aqjVar11.getNavBarTitleString;
                int i74 = (-2) - ((i69 + 62) ^ (-1));
                f53586f = i74 % 128;
                int i75 = i74 % 2;
                iArr2 = iArr20;
            } else {
                aqc.setX(new Object[]{aqjVar12.getNavBarTitleString, iArr18}, -975657781, 975657784, (int) System.currentTimeMillis());
                aqc.setX(new Object[]{iArr18, aqjVar10.getNavBarTitleString, iArr17}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                aqc.setX(new Object[]{iArr18, aqjVar12.getNavBarTitleString, iArr18}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                aqc.setX(new Object[]{iArr18, aqjVar11.getNavBarTitleString, iArr18}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                int i76 = f53586f;
                int i77 = (((i76 & (-34)) | ((~i76) & 33)) - (~((i76 & 33) << 1))) - 1;
                f53587g = i77 % 128;
                int i78 = i77 % 2;
                iArr2 = iArr18;
                iArr3 = iArr17;
            }
            boolean navBarTitleString3 = aqjVar13.getNavBarTitleString();
            if (navBarTitleString3) {
                int i79 = f53587g;
                int i80 = (i79 ^ 100) + ((i79 & 100) << 1);
                int i81 = (i80 ^ (-1)) + (i80 << 1);
                int i82 = i81 % 128;
                f53586f = i82;
                int i83 = i81 % 2;
                iArr4 = aqjVar8.getNavBarTitleString;
                int[] iArr21 = aqjVar9.getNavBarTitleString;
                int i84 = (i82 ^ 103) + ((i82 & 103) << 1);
                f53587g = i84 % 128;
                int i85 = i84 % 2;
                c11 = 2;
                iArr5 = iArr21;
                aqjVar = aqjVar13;
            } else {
                aqc.setX(new Object[]{aqjVar13.getNavBarTitleString, iArr19}, -975657781, 975657784, (int) System.currentTimeMillis());
                aqc.setX(new Object[]{iArr19, aqjVar8.getNavBarTitleString, iArr16}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                aqjVar = aqjVar13;
                aqc.setX(new Object[]{iArr19, aqjVar13.getNavBarTitleString, iArr19}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                c11 = 2;
                aqc.setX(new Object[]{iArr19, aqjVar9.getNavBarTitleString, iArr19}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                int i86 = f53587g + 89;
                f53586f = i86 % 128;
                int i87 = i86 % 2;
                iArr4 = iArr16;
                iArr5 = iArr19;
            }
            int[] iArr22 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
            Object[] objArr3 = new Object[3];
            objArr3[0] = iArr4;
            objArr3[1] = iArr3;
            objArr3[c11] = iArr22;
            int[] iArr23 = iArr4;
            aqc.setX(objArr3, 1933393358, -1933393343, (int) System.currentTimeMillis());
            aqc.setX(new Object[]{iArr5, iArr2, iArr17}, 1933393358, -1933393343, (int) System.currentTimeMillis());
            if (((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr22}, 1085637402, -1085637402, (int) System.currentTimeMillis())).booleanValue()) {
                int i88 = f53587g + 19;
                f53586f = i88 % 128;
                int i89 = i88 % 2;
                if (!((Boolean) auw.setOnFocusChangeListener(new Object[]{iArr17}, 1085637402, -1085637402, (int) System.currentTimeMillis())).booleanValue()) {
                    apl y10 = x6.setY();
                    int i90 = f53587g;
                    int i91 = i90 & 47;
                    int i92 = (47 | i90) & (~i91);
                    int i93 = -(-(i91 << 1));
                    int i94 = ((i92 | i93) << 1) - (i92 ^ i93);
                    f53586f = i94 % 128;
                    int i95 = i94 % 2;
                    return y10;
                }
                int i96 = f53587g;
                int i97 = i96 & 29;
                int i98 = (i97 - (~((i96 ^ 29) | i97))) - 1;
                f53586f = i98 % 128;
                int i99 = i98 % 2;
                apl onEditorActionListener2 = aqiVar2.setOnEditorActionListener();
                int i100 = f53586f + 41;
                f53587g = i100 % 128;
                if (i100 % 2 != 0) {
                    return onEditorActionListener2;
                }
                int i101 = 47 / 0;
                return onEditorActionListener2;
            }
            aqc.setX(new Object[]{iArr22, iArr18}, -975657781, 975657784, (int) System.currentTimeMillis());
            int[] iArr24 = (int[]) auw.setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
            aqc.setX(new Object[]{iArr18, iArr22, iArr24}, 1790962205, -1790962191, (int) System.currentTimeMillis());
            aqc.setX(new Object[]{iArr18, iArr23, iArr18}, 1790962205, -1790962191, (int) System.currentTimeMillis());
            aqc.setX(new Object[]{iArr24, iArr24}, 1627570594, -1627570594, (int) System.currentTimeMillis());
            auw.setOnFocusChangeListener(new Object[]{iArr5, iArr24, iArr16}, 1496073495, -1496073494, (int) System.currentTimeMillis());
            int iIntValue4 = ((Integer) auw.setOnFocusChangeListener(new Object[]{iArr18, iArr18, iArr24}, 403538937, -403538929, (int) System.currentTimeMillis())).intValue();
            aqc.setX(new Object[]{Integer.valueOf(iIntValue4), iArr24}, -1452770434, 1452770439, iIntValue4);
            aqj aqjVar14 = new aqj(iArr19);
            aqc.setX(new Object[]{iArr17, aqjVar14.getNavBarTitleString}, -975657781, 975657784, (int) System.currentTimeMillis());
            int[] iArr25 = aqjVar14.getNavBarTitleString;
            aqc.setX(new Object[]{iArr25, iArr24, iArr25}, 1933393358, -1933393343, (int) System.currentTimeMillis());
            aqj aqjVar15 = new aqj(iArr24);
            aqc.setX(new Object[]{iArr18, aqjVar14.getNavBarTitleString, aqjVar15.getNavBarTitleString}, 1933393358, -1933393343, (int) System.currentTimeMillis());
            aqc.setX(new Object[]{aqjVar15.getNavBarTitleString, iArr17, iArr16}, -2084538997, 2084539014, (int) System.currentTimeMillis());
            aqc.setX(new Object[]{iArr16, aqjVar15.getNavBarTitleString}, -719831553, 719831564, (int) System.currentTimeMillis());
            aqj aqjVar16 = new aqj(iArr22);
            if (!navBarTitleString2) {
                int i102 = f53587g;
                int i103 = i102 & 119;
                int i104 = (((i102 | 119) & (~i103)) - (~(-(-(i103 << 1))))) - 1;
                f53586f = i104 % 128;
                if (i104 % 2 != 0) {
                    int[] iArr26 = aqjVar16.getNavBarTitleString;
                    aqc.setX(new Object[]{iArr26, aqjVar12.getNavBarTitleString, iArr26}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                    throw null;
                }
                int[] iArr27 = aqjVar16.getNavBarTitleString;
                aqc.setX(new Object[]{iArr27, aqjVar12.getNavBarTitleString, iArr27}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                int i105 = f53586f + 51;
                f53587g = i105 % 128;
                int i106 = i105 % 2;
            }
            if (!navBarTitleString3) {
                int i107 = f53587g;
                int i108 = (i107 & 117) + (i107 | 117);
                f53586f = i108 % 128;
                int i109 = i108 % 2;
                int[] iArr28 = aqjVar16.getNavBarTitleString;
                aqc.setX(new Object[]{iArr28, aqjVar.getNavBarTitleString, iArr28}, 1790962205, -1790962191, (int) System.currentTimeMillis());
                int i110 = f53587g + 25;
                f53586f = i110 % 128;
                int i111 = i110 % 2;
            }
            aqi aqiVar3 = new aqi(x6, aqjVar14, aqjVar15, new apk[]{aqjVar16});
            int i112 = f53587g;
            int i113 = i112 & 99;
            int i114 = (i112 | 99) & (~i113);
            int i115 = -(-(i113 << 1));
            int i116 = (i114 & i115) + (i114 | i115);
            f53586f = i116 % 128;
            int i117 = i116 % 2;
            return aqiVar3;
        }
        y7 = (aqi) objArr[0];
        int i118 = f53587g;
        int i119 = i118 & 23;
        int i120 = -(-((i118 ^ 23) | i119));
        int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
        f53586f = i121 % 128;
        if (i121 % 2 != 0) {
            y7.setIncludeFontPadding();
            throw null;
        }
        if (!y7.setIncludeFontPadding()) {
            aqi aqiVar4 = new aqi(y7.setDividerPadding, y7.setX, y7.setOnFocusChangeListener.setY(), y7.setY);
            int i122 = f53586f;
            int i123 = i122 ^ 31;
            int i124 = ((i122 & 31) | i123) << 1;
            int i125 = -i123;
            int i126 = ((i124 | i125) << 1) - (i124 ^ i125);
            f53587g = i126 % 128;
            if (i126 % 2 != 0) {
                return aqiVar4;
            }
            throw null;
        }
        int i127 = f53587g;
        int i128 = ((i127 ^ 81) - (~((i127 & 81) << 1))) - 1;
        f53586f = i128 % 128;
        int i129 = i128 % 2;
        int i130 = (i127 & 87) + (i127 | 87);
        f53586f = i130 % 128;
        int i131 = i130 % 2;
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, -1688867796, 1688867797, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, 2051529576, -2051529574, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 658678425, -658678425, System.identityHashCode(this));
    }
}
