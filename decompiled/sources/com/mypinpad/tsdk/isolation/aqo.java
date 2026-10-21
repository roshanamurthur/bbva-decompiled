package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aqo extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53606f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53607g = 1;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        apl aqoVar;
        apl aqoVar2;
        int[] iArr;
        int[] iArr2;
        int i13;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int i14;
        int i15;
        int i16 = ~i11;
        int i17 = (~i12) | i16;
        int i18 = (((~i17) | i10) * 226) + (i11 * (-112)) + (i10 * (-112));
        int i19 = ~i10;
        int i20 = ((~(i16 | i12)) * 113) + (((~(i10 | i17)) | (~(i11 | i19)) | (~(i19 | i12))) * (-113)) + i18;
        if (i20 == 1) {
            aqoVar = (aqo) objArr[0];
            int i21 = f53606f;
            int i22 = i21 ^ 85;
            int i23 = -(-((i21 & 85) << 1));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f53607g = i24 % 128;
            int i25 = i24 % 2;
            if (!aqoVar.setIncludeFontPadding()) {
                aqoVar2 = new aqo(aqoVar.setDividerPadding, aqoVar.setX, aqoVar.setOnFocusChangeListener.setY(), aqoVar.setY);
                int i26 = f53606f + 15;
                f53607g = i26 % 128;
                if (i26 % 2 == 0) {
                    throw null;
                }
                return aqoVar2;
            }
            int i27 = f53607g;
            int i28 = i27 & 3;
            int i29 = (((i27 ^ 3) | i28) << 1) - ((i27 | 3) & (~i28));
            f53606f = i29 % 128;
            if (i29 % 2 != 0) {
                throw null;
            }
            return aqoVar;
        }
        if (i20 != 2) {
            aqo aqoVar3 = (aqo) objArr[0];
            int i30 = f53606f;
            int i31 = i30 & 25;
            int i32 = (((i30 ^ 25) | i31) << 1) - ((~i31) & (i30 | 25));
            f53607g = i32 % 128;
            int i33 = i32 % 2;
            if (aqoVar3.setIncludeFontPadding()) {
                int i34 = f53606f + 19;
                f53607g = i34 % 128;
                if (i34 % 2 != 0) {
                    return aqoVar3;
                }
                int i35 = 24 / 0;
                return aqoVar3;
            }
            aph x4 = aqoVar3.setX();
            aqn aqnVar = (aqn) aqoVar3.setOnFocusChangeListener;
            if (aqnVar.setOnDragListener()) {
                int i36 = f53607g;
                int i37 = i36 & 93;
                int i38 = ((i36 ^ 93) | i37) << 1;
                int i39 = -((i36 | 93) & (~i37));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                f53606f = i40 % 128;
                if (i40 % 2 != 0) {
                    x4.setY();
                    throw null;
                }
                apl y7 = x4.setY();
                int i41 = f53606f;
                int i42 = i41 & 75;
                int i43 = -(-((i41 ^ 75) | i42));
                int i44 = (i42 & i43) + (i43 | i42);
                f53607g = i44 % 128;
                if (i44 % 2 != 0) {
                    return y7;
                }
                throw null;
            }
            aqn aqnVar2 = (aqn) aqoVar3.setX;
            aqn aqnVar3 = (aqn) aqoVar3.setY[0];
            int[] iArr6 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
            int[] iArr7 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
            int[] iArr8 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
            aqm.setDividerPadding(new Object[]{aqnVar.setLayoutAnimation, iArr8}, -990119338, 990119342, (int) System.currentTimeMillis());
            int[] iArr9 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
            aqm.setDividerPadding(new Object[]{iArr8, iArr9}, -990119338, 990119342, (int) System.currentTimeMillis());
            boolean navBarTitleString = aqnVar3.getNavBarTitleString();
            int[] iArr10 = aqnVar3.setLayoutAnimation;
            if (!navBarTitleString) {
                int i45 = f53607g;
                int i46 = ((i45 & (-120)) | ((~i45) & 119)) + ((i45 & 119) << 1);
                f53606f = i46 % 128;
                int i47 = i46 % 2;
                aqm.setDividerPadding(new Object[]{iArr10, iArr7}, -990119338, 990119342, (int) System.currentTimeMillis());
                int i48 = f53606f;
                int i49 = ((i48 & 102) + (i48 | 102)) - 1;
                f53607g = i49 % 128;
                int i50 = i49 % 2;
                iArr10 = iArr7;
            }
            aqm.setDividerPadding(new Object[]{r28.setLayoutAnimation, iArr10, iArr6}, -420062112, 420062117, (int) System.currentTimeMillis());
            aqm.setDividerPadding(new Object[]{r28.setLayoutAnimation, iArr10, iArr7}, 404134666, -404134655, (int) System.currentTimeMillis());
            aqm.setDividerPadding(new Object[]{iArr7, iArr6, iArr7}, 1881006800, -1881006800, (int) System.currentTimeMillis());
            int iIntValue = ((Integer) auz.setDividerPadding(new Object[]{iArr7, iArr7, iArr7}, 1240095778, -1240095774, (int) System.currentTimeMillis())).intValue();
            aqm.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr7}, -1829539249, 1829539252, iIntValue);
            aqm.setDividerPadding(new Object[]{iArr8, aqnVar2.setLayoutAnimation, iArr8}, 1881006800, -1881006800, (int) System.currentTimeMillis());
            int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr8, 0}, -841558252, 841558293, 5)).intValue();
            aqm.setDividerPadding(new Object[]{Integer.valueOf(iIntValue2), iArr8}, -1829539249, 1829539252, iIntValue2);
            int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr9, 0, iArr6}, -1850727291, 1850727294, 5)).intValue();
            aqm.setDividerPadding(new Object[]{Integer.valueOf(iIntValue3), iArr6}, -1829539249, 1829539252, iIntValue3);
            aqn aqnVar4 = new aqn(iArr9);
            aqm.setDividerPadding(new Object[]{iArr7, aqnVar4.setLayoutAnimation}, -990119338, 990119342, (int) System.currentTimeMillis());
            int[] iArr11 = aqnVar4.setLayoutAnimation;
            aqm.setDividerPadding(new Object[]{iArr11, iArr8, iArr11}, -420062112, 420062117, (int) System.currentTimeMillis());
            int[] iArr12 = aqnVar4.setLayoutAnimation;
            aqm.setDividerPadding(new Object[]{iArr12, iArr8, iArr12}, -420062112, 420062117, (int) System.currentTimeMillis());
            aqn aqnVar5 = new aqn(iArr8);
            aqm.setDividerPadding(new Object[]{iArr8, aqnVar4.setLayoutAnimation, aqnVar5.setLayoutAnimation}, -420062112, 420062117, (int) System.currentTimeMillis());
            int[] iArr13 = aqnVar5.setLayoutAnimation;
            aqm.setDividerPadding(new Object[]{iArr13, iArr7, iArr13}, 1881006800, -1881006800, (int) System.currentTimeMillis());
            int[] iArr14 = aqnVar5.setLayoutAnimation;
            aqm.setDividerPadding(new Object[]{iArr14, iArr6, iArr14}, -420062112, 420062117, (int) System.currentTimeMillis());
            aqn aqnVar6 = new aqn(iArr7);
            aqm.setDividerPadding(new Object[]{aqnVar.setLayoutAnimation, aqnVar6.setLayoutAnimation}, -1312640771, 1312640784, (int) System.currentTimeMillis());
            if (navBarTitleString) {
                i15 = 1;
            } else {
                int i51 = f53607g;
                int i52 = i51 & 123;
                int i53 = ((i51 ^ 123) | i52) << 1;
                int i54 = -((i51 | 123) & (~i52));
                int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                f53606f = i55 % 128;
                if (i55 % 2 != 0) {
                    int[] iArr15 = aqnVar6.setLayoutAnimation;
                    aqm.setDividerPadding(new Object[]{iArr15, aqnVar3.setLayoutAnimation, iArr15}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    throw null;
                }
                int[] iArr16 = aqnVar6.setLayoutAnimation;
                aqm.setDividerPadding(new Object[]{iArr16, aqnVar3.setLayoutAnimation, iArr16}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                int i56 = f53606f;
                int i57 = i56 & 11;
                i15 = 1;
                int i58 = ((i56 | 11) & (~i57)) + (i57 << 1);
                f53607g = i58 % 128;
                int i59 = i58 % 2;
            }
            apk[] apkVarArr = new apk[i15];
            apkVarArr[0] = aqnVar6;
            aqo aqoVar4 = new aqo(x4, aqnVar4, aqnVar5, apkVarArr);
            int i60 = f53606f;
            int i61 = (i60 & (-106)) | ((~i60) & 105);
            int i62 = (i60 & 105) << 1;
            int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
            f53607g = i63 % 128;
            int i64 = i63 % 2;
            return aqoVar4;
        }
        aqoVar = (aqo) objArr[0];
        aqoVar2 = (apl) objArr[1];
        int i65 = f53606f + 119;
        f53607g = i65 % 128;
        if (i65 % 2 == 0) {
            aqoVar.setIncludeFontPadding();
            throw null;
        }
        if (aqoVar.setIncludeFontPadding()) {
            int i66 = f53606f;
            int i67 = i66 ^ 101;
            int i68 = ((i66 & 101) | i67) << 1;
            int i69 = -i67;
            int i70 = (i68 & i69) + (i68 | i69);
            f53607g = i70 % 128;
            if (i70 % 2 == 0) {
                throw null;
            }
            return aqoVar2;
        }
        if (!aqoVar2.setIncludeFontPadding()) {
            if (aqoVar == aqoVar2) {
                int i71 = f53606f;
                int i72 = ((i71 | 41) << 1) - (i71 ^ 41);
                f53607g = i72 % 128;
                int i73 = i72 % 2;
                aqoVar = aqoVar.setOnEditorActionListener();
                int i74 = f53606f;
                i14 = ((i74 ^ 26) + ((i74 & 26) << 1)) - 1;
            } else {
                aph x6 = aqoVar.setX();
                aqn aqnVar7 = (aqn) aqoVar.setX;
                aqn aqnVar8 = (aqn) aqoVar.setOnFocusChangeListener;
                aqn aqnVar9 = (aqn) aqoVar2.getNavBarTitleString();
                aqn aqnVar10 = (aqn) aqoVar2.setNavigationOnClickListener();
                aqn aqnVar11 = (aqn) aqoVar.setY[0];
                aqn aqnVar12 = (aqn) aqoVar2.setY(0);
                int[] iArr17 = (int[]) auz.setDividerPadding(new Object[0], -529696917, 529696919, (int) System.currentTimeMillis());
                int[] iArr18 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                int[] iArr19 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                int[] iArr20 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                boolean navBarTitleString2 = aqnVar11.getNavBarTitleString();
                if (navBarTitleString2) {
                    int i75 = (-2) - ((f53607g + 54) ^ (-1));
                    int i76 = i75 % 128;
                    f53606f = i76;
                    int i77 = i75 % 2;
                    iArr = aqnVar9.setLayoutAnimation;
                    iArr2 = aqnVar10.setLayoutAnimation;
                    int i78 = i76 & 27;
                    int i79 = (i76 | 27) & (~i78);
                    int i80 = i78 << 1;
                    int i81 = ((i79 | i80) << 1) - (i80 ^ i79);
                    f53607g = i81 % 128;
                    int i82 = i81 % 2;
                } else {
                    aqm.setDividerPadding(new Object[]{aqnVar11.setLayoutAnimation, iArr19}, -990119338, 990119342, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr19, aqnVar9.setLayoutAnimation, iArr18}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr19, aqnVar11.setLayoutAnimation, iArr19}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr19, aqnVar10.setLayoutAnimation, iArr19}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    System.identityHashCode(aqoVar);
                    System.identityHashCode(aqoVar);
                    iArr = iArr18;
                    iArr2 = iArr19;
                }
                boolean navBarTitleString3 = aqnVar12.getNavBarTitleString();
                if (navBarTitleString3) {
                    int i83 = f53606f;
                    int i84 = i83 & 111;
                    int i85 = ((~i84) & (i83 | 111)) + (i84 << 1);
                    f53607g = i85 % 128;
                    if (i85 % 2 == 0) {
                        int[] iArr21 = aqnVar7.setLayoutAnimation;
                        int[] iArr22 = aqnVar8.setLayoutAnimation;
                        throw null;
                    }
                    int[] iArr23 = aqnVar7.setLayoutAnimation;
                    int[] iArr24 = aqnVar8.setLayoutAnimation;
                    int i86 = i83 + 99;
                    f53607g = i86 % 128;
                    int i87 = i86 % 2;
                    iArr4 = iArr24;
                    i13 = 0;
                    iArr5 = iArr23;
                    iArr3 = iArr20;
                } else {
                    i13 = 0;
                    aqm.setDividerPadding(new Object[]{aqnVar12.setLayoutAnimation, iArr20}, -990119338, 990119342, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr20, aqnVar7.setLayoutAnimation, iArr17}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr20, aqnVar12.setLayoutAnimation, iArr20}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    iArr3 = iArr20;
                    aqm.setDividerPadding(new Object[]{iArr20, aqnVar8.setLayoutAnimation, iArr20}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    System.identityHashCode(aqoVar);
                    System.identityHashCode(aqoVar);
                    iArr4 = iArr3;
                    iArr5 = iArr17;
                }
                int[] iArr25 = (int[]) auz.setDividerPadding(new Object[i13], -733151149, 733151160, (int) System.currentTimeMillis());
                Object[] objArr2 = new Object[3];
                objArr2[i13] = iArr5;
                objArr2[1] = iArr;
                objArr2[2] = iArr25;
                aqm.setDividerPadding(objArr2, -420062112, 420062117, (int) System.currentTimeMillis());
                aqm.setDividerPadding(new Object[]{iArr4, iArr2, iArr18}, -420062112, 420062117, (int) System.currentTimeMillis());
                if (((Boolean) auz.setDividerPadding(new Object[]{iArr25}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue()) {
                    int i88 = f53606f;
                    int i89 = i88 & 53;
                    int i90 = ((i88 ^ 53) | i89) << 1;
                    int i91 = -((i88 | 53) & (~i89));
                    int i92 = (i90 & i91) + (i91 | i90);
                    f53607g = i92 % 128;
                    if (i92 % 2 == 0) {
                        ((Boolean) auz.setDividerPadding(new Object[]{iArr18}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) auz.setDividerPadding(new Object[]{iArr18}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue()) {
                        aqoVar = aqoVar.setOnEditorActionListener();
                        int i93 = f53606f;
                        int i94 = i93 & 81;
                        int i95 = -(-((i93 ^ 81) | i94));
                        int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                        f53607g = i96 % 128;
                        if (i96 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        aqoVar = x6.setY();
                        int i97 = (-2) - ((f53606f + 70) ^ (-1));
                        f53607g = i97 % 128;
                        if (i97 % 2 == 0) {
                            int i98 = 21 / 0;
                        }
                    }
                } else {
                    aqm.setDividerPadding(new Object[]{iArr25, iArr19}, -990119338, 990119342, (int) System.currentTimeMillis());
                    int[] iArr26 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr19, iArr25, iArr26}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr19, iArr5, iArr19}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr26, iArr26}, 113776561, -113776554, (int) System.currentTimeMillis());
                    auz.setDividerPadding(new Object[]{iArr4, iArr26, iArr17}, -751690120, 751690138, (int) System.currentTimeMillis());
                    int iIntValue4 = ((Integer) auz.setDividerPadding(new Object[]{iArr19, iArr19, iArr26}, 1240095778, -1240095774, (int) System.currentTimeMillis())).intValue();
                    aqm.setDividerPadding(new Object[]{Integer.valueOf(iIntValue4), iArr26}, -1829539249, 1829539252, iIntValue4);
                    aqn aqnVar13 = new aqn(iArr3);
                    aqm.setDividerPadding(new Object[]{iArr18, aqnVar13.setLayoutAnimation}, -990119338, 990119342, (int) System.currentTimeMillis());
                    int[] iArr27 = aqnVar13.setLayoutAnimation;
                    aqm.setDividerPadding(new Object[]{iArr27, iArr26, iArr27}, -420062112, 420062117, (int) System.currentTimeMillis());
                    aqn aqnVar14 = new aqn(iArr26);
                    aqm.setDividerPadding(new Object[]{iArr19, aqnVar13.setLayoutAnimation, aqnVar14.setLayoutAnimation}, -420062112, 420062117, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{aqnVar14.setLayoutAnimation, iArr18, iArr17}, -1442327241, 1442327242, (int) System.currentTimeMillis());
                    aqm.setDividerPadding(new Object[]{iArr17, aqnVar14.setLayoutAnimation}, -1148753475, 1148753489, (int) System.currentTimeMillis());
                    aqn aqnVar15 = new aqn(iArr25);
                    if (!navBarTitleString2) {
                        int i99 = f53606f;
                        int i100 = (i99 & 105) + (i99 | 105);
                        f53607g = i100 % 128;
                        int i101 = i100 % 2;
                        int[] iArr28 = aqnVar15.setLayoutAnimation;
                        aqm.setDividerPadding(new Object[]{iArr28, aqnVar11.setLayoutAnimation, iArr28}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                        int i102 = f53606f;
                        int i103 = ((i102 ^ 41) - (~(-(-((i102 & 41) << 1))))) - 1;
                        f53607g = i103 % 128;
                        int i104 = i103 % 2;
                    }
                    if (!navBarTitleString3) {
                        int i105 = f53606f;
                        int i106 = (i105 ^ 89) + ((i105 & 89) << 1);
                        f53607g = i106 % 128;
                        if (i106 % 2 == 0) {
                            int[] iArr29 = aqnVar15.setLayoutAnimation;
                            aqm.setDividerPadding(new Object[]{iArr29, aqnVar12.setLayoutAnimation, iArr29}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                            throw null;
                        }
                        int[] iArr30 = aqnVar15.setLayoutAnimation;
                        aqm.setDividerPadding(new Object[]{iArr30, aqnVar12.setLayoutAnimation, iArr30}, 1881006800, -1881006800, (int) System.currentTimeMillis());
                        int i107 = f53606f;
                        int i108 = i107 & 87;
                        int i109 = ((i107 | 87) & (~i108)) + (i108 << 1);
                        f53607g = i109 % 128;
                        int i110 = i109 % 2;
                    }
                    aqoVar = new aqo(x6, aqnVar13, aqnVar14, new apk[]{aqnVar15});
                    int i111 = f53607g;
                    i14 = (i111 & 79) + (i111 | 79);
                    f53606f = i14 % 128;
                    int i112 = i14 % 2;
                }
            }
            return aqoVar;
        }
        int i113 = f53606f;
        int i114 = i113 + 83;
        f53607g = i114 % 128;
        int i115 = i114 % 2;
        i14 = (((i113 ^ 93) | (i113 & 93)) << 1) - (((~i113) & 93) | (i113 & (-94)));
        f53607g = i14 % 128;
        int i116 = i14 % 2;
        return aqoVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -1122371115, 1122371116, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1830499630, -1830499630, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, aplVar}, 1669854519, -1669854517, System.identityHashCode(this));
    }
}
