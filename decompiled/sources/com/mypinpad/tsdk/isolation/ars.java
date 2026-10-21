package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ars extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53706f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53707g = 1;

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        apl y7;
        apl aplVar;
        char c10;
        int[] iArr;
        int[] iArr2;
        char c11;
        int[] iArr3;
        int[] iArr4;
        int i13;
        char c12;
        int i14;
        int i15 = ~i10;
        int i16 = ~i12;
        int i17 = (~(i15 | i11)) | (~(i15 | i16));
        int i18 = ~i11;
        int i19 = ~(i10 | i18 | i12);
        int i20 = ((~(i18 | i16)) * 713) + (i19 * 1426) + ((i17 | i19) * (-713)) + (i11 * (-712)) + (i10 * 714);
        if (i20 != 1) {
            if (i20 != 2) {
                ars arsVar = (ars) objArr[0];
                int i21 = f53706f;
                int i22 = i21 & 107;
                int i23 = (i21 | 107) & (~i22);
                int i24 = -(-(i22 << 1));
                int i25 = (i23 & i24) + (i23 | i24);
                f53707g = i25 % 128;
                int i26 = i25 % 2;
                if (arsVar.setIncludeFontPadding()) {
                    int i27 = f53706f;
                    int i28 = i27 + 7;
                    f53707g = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = (((i27 | 74) << 1) - (i27 ^ 74)) - 1;
                    f53707g = i30 % 128;
                    int i31 = i30 % 2;
                    return arsVar;
                }
                y7 = new ars(arsVar.setDividerPadding, arsVar.setX, arsVar.setOnFocusChangeListener.setY(), arsVar.setY);
                int i32 = f53706f + 83;
                f53707g = i32 % 128;
                int i33 = i32 % 2;
            } else {
                aplVar = (ars) objArr[0];
                int i34 = f53707g;
                int i35 = i34 & 115;
                int i36 = (i35 - (~((i34 ^ 115) | i35))) - 1;
                f53706f = i36 % 128;
                int i37 = i36 % 2;
                if (aplVar.setIncludeFontPadding()) {
                    System.identityHashCode(aplVar);
                    System.identityHashCode(aplVar);
                    int i38 = f53707g;
                    int i39 = i38 & 75;
                    int i40 = (i39 - (~((i38 ^ 75) | i39))) - 1;
                    f53706f = i40 % 128;
                    if (i40 % 2 != 0) {
                        int i41 = 32 / 0;
                    }
                    return aplVar;
                }
                aph x4 = aplVar.setX();
                arp arpVar = (arp) aplVar.setOnFocusChangeListener;
                if (arpVar.setOnDragListener()) {
                    int i42 = f53706f;
                    int i43 = i42 & 23;
                    int i44 = (i43 - (~((i42 ^ 23) | i43))) - 1;
                    f53707g = i44 % 128;
                    int i45 = i44 % 2;
                    apl y10 = x4.setY();
                    if (i45 == 0) {
                        int i46 = 78 / 0;
                    }
                    int i47 = f53707g + 13;
                    f53706f = i47 % 128;
                    int i48 = i47 % 2;
                    return y10;
                }
                arp arpVar2 = (arp) aplVar.setX;
                arp arpVar3 = (arp) aplVar.setY[0];
                int[] iArr5 = (int[]) auy.setOnFocusChangeListener(new Object[]{24}, 1950542281, -1950542250, 24);
                int[] iArr6 = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
                int[] iArr7 = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
                int[] iArr8 = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
                aro.setDividerPadding(new Object[]{arpVar.setLayoutAnimation, iArr8, iArr5}, -1570771979, 1570771995, (int) System.currentTimeMillis());
                int[] iArr9 = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
                aro.setDividerPadding(new Object[]{iArr8, iArr9, iArr5}, -1570771979, 1570771995, (int) System.currentTimeMillis());
                boolean navBarTitleString = arpVar3.getNavBarTitleString();
                int[] iArr10 = arpVar3.setLayoutAnimation;
                if (navBarTitleString) {
                    c12 = 2;
                } else {
                    int i49 = f53706f;
                    int i50 = (-2) - (((i49 & 36) + (i49 | 36)) ^ (-1));
                    f53707g = i50 % 128;
                    int i51 = i50 % 2;
                    aro.setDividerPadding(new Object[]{iArr10, iArr7, iArr5}, -1570771979, 1570771995, (int) System.currentTimeMillis());
                    int i52 = f53706f;
                    int i53 = ((i52 | 7) << 1) - (i52 ^ 7);
                    f53707g = i53 % 128;
                    c12 = 2;
                    int i54 = i53 % 2;
                    iArr10 = iArr7;
                }
                Object[] objArr2 = new Object[3];
                objArr2[0] = arpVar2.setLayoutAnimation;
                objArr2[1] = iArr10;
                objArr2[c12] = iArr6;
                aro.setDividerPadding(objArr2, 977033749, -977033737, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{arpVar2.setLayoutAnimation, iArr10, iArr7}, 1798884365, -1798884355, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr7, iArr6, iArr7, iArr5}, 260671883, -260671883, (int) System.currentTimeMillis());
                int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr7, iArr7, iArr7}, 2040461132, -2040461110, 12)).intValue();
                aro.setDividerPadding(new Object[]{Integer.valueOf(iIntValue), iArr7}, 386780309, -386780296, iIntValue);
                aro.setDividerPadding(new Object[]{iArr8, arpVar2.setLayoutAnimation, iArr8, iArr5}, 260671883, -260671883, (int) System.currentTimeMillis());
                int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr8, 0}, -841558252, 841558293, 12)).intValue();
                aro.setDividerPadding(new Object[]{Integer.valueOf(iIntValue2), iArr8}, 386780309, -386780296, iIntValue2);
                int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr9, 0, iArr6}, -1850727291, 1850727294, 12)).intValue();
                aro.setDividerPadding(new Object[]{Integer.valueOf(iIntValue3), iArr6}, 386780309, -386780296, iIntValue3);
                arp arpVar4 = new arp(iArr9);
                aro.setDividerPadding(new Object[]{iArr7, arpVar4.setLayoutAnimation, iArr5}, -1570771979, 1570771995, (int) System.currentTimeMillis());
                int[] iArr11 = arpVar4.setLayoutAnimation;
                aro.setDividerPadding(new Object[]{iArr11, iArr8, iArr11}, 977033749, -977033737, (int) System.currentTimeMillis());
                int[] iArr12 = arpVar4.setLayoutAnimation;
                aro.setDividerPadding(new Object[]{iArr12, iArr8, iArr12}, 977033749, -977033737, (int) System.currentTimeMillis());
                arp arpVar5 = new arp(iArr8);
                aro.setDividerPadding(new Object[]{iArr8, arpVar4.setLayoutAnimation, arpVar5.setLayoutAnimation}, 977033749, -977033737, (int) System.currentTimeMillis());
                int[] iArr13 = arpVar5.setLayoutAnimation;
                aro.setDividerPadding(new Object[]{iArr13, iArr7, iArr13, iArr5}, 260671883, -260671883, (int) System.currentTimeMillis());
                int[] iArr14 = arpVar5.setLayoutAnimation;
                aro.setDividerPadding(new Object[]{iArr14, iArr6, iArr14}, 977033749, -977033737, (int) System.currentTimeMillis());
                arp arpVar6 = new arp(iArr7);
                aro.setDividerPadding(new Object[]{arpVar.setLayoutAnimation, arpVar6.setLayoutAnimation}, -1563856121, 1563856124, (int) System.currentTimeMillis());
                if (navBarTitleString) {
                    i14 = 1;
                } else {
                    int i55 = f53706f;
                    int i56 = i55 & 37;
                    int i57 = (i55 | 37) & (~i56);
                    int i58 = i56 << 1;
                    int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                    f53707g = i59 % 128;
                    int i60 = i59 % 2;
                    int[] iArr15 = arpVar6.setLayoutAnimation;
                    aro.setDividerPadding(new Object[]{iArr15, arpVar3.setLayoutAnimation, iArr15, iArr5}, 260671883, -260671883, (int) System.currentTimeMillis());
                    int i61 = f53706f;
                    i14 = 1;
                    int i62 = (i61 ^ 121) + ((i61 & 121) << 1);
                    f53707g = i62 % 128;
                    int i63 = i62 % 2;
                }
                apk[] apkVarArr = new apk[i14];
                apkVarArr[0] = arpVar6;
                y7 = new ars(x4, arpVar4, arpVar5, apkVarArr);
                int i64 = f53706f + 73;
                f53707g = i64 % 128;
                int i65 = i64 % 2;
            }
            return y7;
        }
        y7 = (ars) objArr[0];
        aplVar = (apl) objArr[1];
        int i66 = f53707g + 53;
        f53706f = i66 % 128;
        int i67 = i66 % 2;
        if (y7.setIncludeFontPadding()) {
            int i68 = f53707g;
            int i69 = i68 + 117;
            f53706f = i69 % 128;
            int i70 = i69 % 2;
            int i71 = (((i68 & (-18)) | ((~i68) & 17)) - (~(-(-((i68 & 17) << 1))))) - 1;
            f53706f = i71 % 128;
            int i72 = i71 % 2;
            return aplVar;
        }
        if (!(!aplVar.setIncludeFontPadding())) {
            int i73 = f53706f;
            int i74 = i73 | 45;
            int i75 = (i74 << 1) - ((~(i73 & 45)) & i74);
            int i76 = i75 % 128;
            f53707g = i76;
            int i77 = i75 % 2;
            int i78 = ((i76 ^ 47) | (i76 & 47)) << 1;
            int i79 = -(((~i76) & 47) | (i76 & (-48)));
            int i80 = ((i78 | i79) << 1) - (i79 ^ i78);
            f53706f = i80 % 128;
            if (i80 % 2 != 0) {
                int i81 = 50 / 0;
            }
        } else if (y7 == aplVar) {
            int i82 = f53707g + 101;
            f53706f = i82 % 128;
            int i83 = i82 % 2;
            y7 = y7.setOnEditorActionListener();
            int i84 = f53706f + 121;
            f53707g = i84 % 128;
            if (i84 % 2 == 0) {
                throw null;
            }
        } else {
            aph x6 = y7.setX();
            arp arpVar7 = (arp) y7.setX;
            arp arpVar8 = (arp) y7.setOnFocusChangeListener;
            arp arpVar9 = (arp) aplVar.getNavBarTitleString();
            arp arpVar10 = (arp) aplVar.setNavigationOnClickListener();
            arp arpVar11 = (arp) y7.setY[0];
            arp arpVar12 = (arp) aplVar.setY(0);
            int[] iArr16 = (int[]) auy.setOnFocusChangeListener(new Object[]{24}, 1950542281, -1950542250, 24);
            int[] iArr17 = (int[]) auy.setOnFocusChangeListener(new Object[]{24}, 1950542281, -1950542250, 24);
            int[] iArr18 = (int[]) auy.setOnFocusChangeListener(new Object[]{24}, 1950542281, -1950542250, 24);
            int[] iArr19 = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
            int[] iArr20 = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
            boolean navBarTitleString2 = arpVar11.getNavBarTitleString();
            if (navBarTitleString2) {
                int i85 = f53706f + 99;
                f53707g = i85 % 128;
                int i86 = i85 % 2;
                int[] iArr21 = arpVar9.setLayoutAnimation;
                iArr2 = arpVar10.setLayoutAnimation;
                if (i86 == 0) {
                    int i87 = 51 / 0;
                }
                iArr = iArr21;
                c10 = 2;
            } else {
                c10 = 2;
                aro.setDividerPadding(new Object[]{arpVar11.setLayoutAnimation, iArr19, iArr16}, -1570771979, 1570771995, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr19, arpVar9.setLayoutAnimation, iArr18, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr19, arpVar11.setLayoutAnimation, iArr19, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr19, arpVar10.setLayoutAnimation, iArr19, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                int i88 = f53706f + 1;
                f53707g = i88 % 128;
                int i89 = i88 % 2;
                iArr = iArr18;
                iArr2 = iArr19;
            }
            boolean navBarTitleString3 = arpVar12.getNavBarTitleString();
            if (navBarTitleString3) {
                int i90 = f53707g + 111;
                int i91 = i90 % 128;
                f53706f = i91;
                if (i90 % 2 != 0) {
                    iArr3 = arpVar7.setLayoutAnimation;
                    iArr4 = arpVar8.setLayoutAnimation;
                    int i92 = 8 / 0;
                } else {
                    iArr3 = arpVar7.setLayoutAnimation;
                    iArr4 = arpVar8.setLayoutAnimation;
                }
                int i93 = i91 & 11;
                int i94 = i93 + ((i91 ^ 11) | i93);
                f53707g = i94 % 128;
                int i95 = i94 % 2;
                i13 = 1;
                c11 = 2;
            } else {
                Object[] objArr3 = new Object[3];
                objArr3[0] = arpVar12.setLayoutAnimation;
                objArr3[1] = iArr20;
                objArr3[c10] = iArr16;
                aro.setDividerPadding(objArr3, -1570771979, 1570771995, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr20, arpVar7.setLayoutAnimation, iArr17, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr20, arpVar12.setLayoutAnimation, iArr20, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr20, arpVar8.setLayoutAnimation, iArr20, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                int i96 = f53707g + 23;
                f53706f = i96 % 128;
                c11 = 2;
                int i97 = i96 % 2;
                iArr3 = iArr17;
                iArr4 = iArr20;
                i13 = 1;
            }
            Object[] objArr4 = new Object[i13];
            objArr4[0] = 12;
            int[] iArr22 = (int[]) auy.setOnFocusChangeListener(objArr4, 1950542281, -1950542250, 12);
            Object[] objArr5 = new Object[3];
            objArr5[0] = iArr3;
            objArr5[i13] = iArr;
            objArr5[c11] = iArr22;
            int[] iArr23 = iArr4;
            aro.setDividerPadding(objArr5, 977033749, -977033737, (int) System.currentTimeMillis());
            Object[] objArr6 = new Object[i13];
            objArr6[0] = 12;
            int[] iArr24 = (int[]) auy.setOnFocusChangeListener(objArr6, 1950542281, -1950542250, 12);
            Object[] objArr7 = new Object[3];
            objArr7[0] = iArr23;
            objArr7[i13] = iArr2;
            objArr7[2] = iArr24;
            aro.setDividerPadding(objArr7, 977033749, -977033737, (int) System.currentTimeMillis());
            if (!((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr22}, -358164445, 358164482, 12)).booleanValue()) {
                aro.setDividerPadding(new Object[]{iArr22, iArr19, iArr16}, -1570771979, 1570771995, (int) System.currentTimeMillis());
                int[] iArr25 = (int[]) auy.setOnFocusChangeListener(new Object[]{12}, 1950542281, -1950542250, 12);
                aro.setDividerPadding(new Object[]{iArr19, iArr22, iArr25, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr19, iArr3, iArr19, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr25, iArr25}, -895516728, 895516742, (int) System.currentTimeMillis());
                avd.setX(new Object[]{iArr23, iArr25, iArr17}, -563638869, 563638870, (int) System.currentTimeMillis());
                int iIntValue4 = ((Integer) auy.setOnFocusChangeListener(new Object[]{12, iArr19, iArr19, iArr25}, 2040461132, -2040461110, 12)).intValue();
                aro.setDividerPadding(new Object[]{Integer.valueOf(iIntValue4), iArr25}, 386780309, -386780296, iIntValue4);
                arp arpVar13 = new arp(iArr20);
                aro.setDividerPadding(new Object[]{iArr24, arpVar13.setLayoutAnimation, iArr16}, -1570771979, 1570771995, (int) System.currentTimeMillis());
                int[] iArr26 = arpVar13.setLayoutAnimation;
                aro.setDividerPadding(new Object[]{iArr26, iArr25, iArr26}, 977033749, -977033737, (int) System.currentTimeMillis());
                arp arpVar14 = new arp(iArr25);
                aro.setDividerPadding(new Object[]{iArr19, arpVar13.setLayoutAnimation, arpVar14.setLayoutAnimation}, 977033749, -977033737, (int) System.currentTimeMillis());
                avd.setX(new Object[]{arpVar14.setLayoutAnimation, iArr24, iArr18}, -563638869, 563638870, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr17, iArr18, iArr17}, -1000115482, 1000115499, (int) System.currentTimeMillis());
                aro.setDividerPadding(new Object[]{iArr17, arpVar14.setLayoutAnimation}, -675644206, 675644210, (int) System.currentTimeMillis());
                arp arpVar15 = new arp(iArr22);
                if (!navBarTitleString2) {
                    int i98 = f53707g;
                    int i99 = ((i98 | 7) << 1) - (i98 ^ 7);
                    f53706f = i99 % 128;
                    if (i99 % 2 != 0) {
                        int[] iArr27 = arpVar15.setLayoutAnimation;
                        aro.setDividerPadding(new Object[]{iArr27, arpVar11.setLayoutAnimation, iArr27, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                        throw null;
                    }
                    int[] iArr28 = arpVar15.setLayoutAnimation;
                    aro.setDividerPadding(new Object[]{iArr28, arpVar11.setLayoutAnimation, iArr28, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                }
                if (!navBarTitleString3) {
                    int i100 = f53706f;
                    int i101 = ((i100 ^ 65) | (i100 & 65)) << 1;
                    int i102 = -(((~i100) & 65) | (i100 & (-66)));
                    int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                    f53707g = i103 % 128;
                    int i104 = i103 % 2;
                    int[] iArr29 = arpVar15.setLayoutAnimation;
                    aro.setDividerPadding(new Object[]{iArr29, arpVar12.setLayoutAnimation, iArr29, iArr16}, 260671883, -260671883, (int) System.currentTimeMillis());
                    int i105 = f53707g + 43;
                    f53706f = i105 % 128;
                    int i106 = i105 % 2;
                }
                ars arsVar2 = new ars(x6, arpVar13, arpVar14, new apk[]{arpVar15});
                int i107 = f53707g + 69;
                f53706f = i107 % 128;
                int i108 = i107 % 2;
                return arsVar2;
            }
            int i109 = f53707g;
            int i110 = i109 ^ 107;
            int i111 = (i109 & 107) << 1;
            int i112 = (i110 & i111) + (i111 | i110);
            f53706f = i112 % 128;
            if (i112 % 2 == 0 ? !(!((Boolean) auy.setOnFocusChangeListener(new Object[]{12, iArr24}, -358164445, 358164482, 12)).booleanValue()) : ((Boolean) auy.setOnFocusChangeListener(new Object[]{9, iArr24}, -358164445, 358164482, 9)).booleanValue()) {
                int i113 = f53707g;
                int i114 = i113 & 77;
                int i115 = (i114 - (~(-(-((i113 ^ 77) | i114))))) - 1;
                f53706f = i115 % 128;
                int i116 = i115 % 2;
                apl onEditorActionListener = y7.setOnEditorActionListener();
                int i117 = f53706f;
                int i118 = ((i117 | 49) << 1) - (i117 ^ 49);
                f53707g = i118 % 128;
                if (i118 % 2 != 0) {
                    return onEditorActionListener;
                }
                throw null;
            }
            y7 = x6.setY();
            int i119 = f53706f;
            int i120 = (i119 ^ 39) + ((i119 & 39) << 1);
            f53707g = i120 % 128;
            int i121 = i120 % 2;
        }
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setDividerPadding(new Object[]{this}, -1684790537, 1684790537, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setDividerPadding(new Object[]{this}, -1819192240, 1819192242, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setDividerPadding(new Object[]{this, aplVar}, -540238666, 540238667, System.identityHashCode(this));
    }
}
