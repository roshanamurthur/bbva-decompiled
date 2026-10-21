package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;

/* JADX INFO: loaded from: classes10.dex */
public final class atk extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53827f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53828g = 1;

    /* JADX WARN: Code duplicated, block: B:120:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:80:0x0281 A[PHI: r2
      0x0281: PHI (r2v74 int) = (r2v72 int), (r2v80 int) binds: [B:79:0x027f, B:76:0x0276] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:84:0x02bb  */
    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        apl atkVar;
        apk x4;
        apk compoundDrawableTintBlendMode;
        apk compoundDrawableTintBlendMode2;
        int i13;
        apk compoundDrawableTintBlendMode3;
        apk compoundDrawableTintBlendMode4;
        apk apkVar;
        apk apkVarB;
        apk onFocusChangeListener;
        apk onFocusChangeListener2;
        int i14;
        int i15;
        int i16;
        int i17;
        apk apkVar2;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = (((~(i10 | i11)) | (~(i12 | i18))) * 49) + (((~((~i10) | i19)) | i18 | (~(i10 | i12))) * (-49)) + (((~(i18 | i19)) | (~(i18 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        if (i20 == 1) {
            atkVar = (atk) objArr[0];
            int i21 = f53827f;
            int i22 = i21 ^ 63;
            int i23 = ((i21 & 63) | i22) << 1;
            int i24 = -i22;
            int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
            f53828g = i25 % 128;
            int i26 = i25 % 2;
            if (atkVar.setIncludeFontPadding()) {
                int i27 = f53827f + 41;
                f53828g = i27 % 128;
                if (i27 % 2 == 0) {
                    throw null;
                }
            } else {
                aph x6 = atkVar.setX();
                apk apkVar3 = atkVar.setX;
                if (apkVar3.setOnDragListener()) {
                    int i28 = f53828g + 3;
                    f53827f = i28 % 128;
                    if (i28 % 2 != 0) {
                        x6.setY();
                        throw null;
                    }
                    atkVar = x6.setY();
                    int i29 = f53828g;
                    int i30 = (((i29 | 78) << 1) - (i29 ^ 78)) - 1;
                    f53827f = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    apk apkVar4 = atkVar.setOnFocusChangeListener;
                    apk x7 = atkVar.setY[0];
                    boolean navBarTitleString = x7.getNavBarTitleString();
                    if (navBarTitleString) {
                        System.identityHashCode(atkVar);
                        System.identityHashCode(atkVar);
                        int i32 = f53828g;
                        int i33 = (i32 ^ 119) + ((i32 & 119) << 1);
                        f53827f = i33 % 128;
                        int i34 = i33 % 2;
                        x4 = x7;
                    } else {
                        x4 = x7.setX();
                        int i35 = f53828g;
                        int i36 = i35 ^ 91;
                        int i37 = (i35 & 91) << 1;
                        int i38 = (i36 & i37) + (i37 | i36);
                        f53827f = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    if (navBarTitleString) {
                        int i40 = f53827f;
                        int i41 = i40 ^ 67;
                        int i42 = -(-((i40 & 67) << 1));
                        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                        f53828g = i43 % 128;
                        int i44 = i43 % 2;
                        compoundDrawableTintBlendMode = apkVar4.setX().setOnFocusChangeListener(apkVar4);
                        System.identityHashCode(atkVar);
                        System.identityHashCode(atkVar);
                    } else {
                        compoundDrawableTintBlendMode = apkVar4.setOnFocusChangeListener(x7).setCompoundDrawableTintBlendMode(apkVar4);
                        int i45 = f53828g;
                        int i46 = (i45 & 23) + (i45 | 23);
                        f53827f = i46 % 128;
                        int i47 = i46 % 2;
                    }
                    if (!compoundDrawableTintBlendMode.setOnDragListener()) {
                        apk x10 = compoundDrawableTintBlendMode.setX();
                        if (navBarTitleString) {
                            int i48 = f53828g;
                            int i49 = i48 & 49;
                            int i50 = -(-(i48 | 49));
                            int i51 = ((i49 | i50) << 1) - (i49 ^ i50);
                            f53827f = i51 % 128;
                            int i52 = i51 % 2;
                            int i53 = i48 + 35;
                            f53827f = i53 % 128;
                            int i54 = i53 % 2;
                            compoundDrawableTintBlendMode2 = compoundDrawableTintBlendMode;
                        } else {
                            compoundDrawableTintBlendMode2 = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(x4);
                            int i55 = f53827f + 77;
                            f53828g = i55 % 128;
                            int i56 = i55 % 2;
                        }
                        apk x11 = apkVar4.setOnFocusChangeListener(apkVar3).setX();
                        if (navBarTitleString) {
                            int i57 = f53827f;
                            int i58 = i57 & 111;
                            int i59 = i57 | 111;
                            int i60 = (i58 & i59) + (i59 | i58);
                            int i61 = i60 % 128;
                            f53828g = i61;
                            int i62 = i60 % 2;
                            int i63 = (i61 | 69) << 1;
                            int i64 = -(((~i61) & 69) | (i61 & (-70)));
                            int i65 = (i63 & i64) + (i64 | i63);
                            f53827f = i65 % 128;
                            int i66 = i65 % 2;
                        } else {
                            x7 = x4.setX();
                            int i67 = f53828g;
                            int i68 = i67 & 95;
                            int i69 = (((i67 ^ 95) | i68) << 1) - ((i67 | 95) & (~i68));
                            f53827f = i69 % 128;
                            int i70 = i69 % 2;
                        }
                        atk atkVar2 = new atk(x6, x10, x11.setOnFocusChangeListener(compoundDrawableTintBlendMode).setOnFocusChangeListener(x4).setCompoundDrawableTintBlendMode(x11).setOnFocusChangeListener(x7).setOnFocusChangeListener(x10).setOnFocusChangeListener(compoundDrawableTintBlendMode2), new apk[]{compoundDrawableTintBlendMode2});
                        int i71 = f53828g;
                        int i72 = (i71 & (-52)) | ((~i71) & 51);
                        int i73 = (i71 & 51) << 1;
                        int i74 = (i72 ^ i73) + ((i73 & i72) << 1);
                        f53827f = i74 % 128;
                        if (i74 % 2 != 0) {
                            int i75 = 22 / 0;
                        }
                        return atkVar2;
                    }
                    atkVar = new atk(x6, compoundDrawableTintBlendMode, x6.setOnLongClickListener());
                    int i76 = f53827f + 4;
                    int i77 = (i76 ^ (-1)) + (i76 << 1);
                    f53828g = i77 % 128;
                    if (i77 % 2 == 0) {
                        throw null;
                    }
                }
            }
        } else {
            if (i20 == 2) {
                atkVar = (atk) objArr[0];
                apl atkVar3 = (apl) objArr[1];
                int i78 = f53827f;
                int i79 = i78 ^ 65;
                int i80 = ((i78 & 65) | i79) << 1;
                int i81 = -i79;
                int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                f53828g = i82 % 128;
                if (i82 % 2 == 0) {
                    atkVar.setIncludeFontPadding();
                    throw null;
                }
                if (atkVar.setIncludeFontPadding()) {
                    int i83 = f53827f;
                    int i84 = (((i83 | 66) << 1) - (i83 ^ 66)) - 1;
                    f53828g = i84 % 128;
                    if (i84 % 2 == 0) {
                        int i85 = 29 / 0;
                    }
                } else if (atkVar3.setIncludeFontPadding()) {
                    System.identityHashCode(atkVar);
                    System.identityHashCode(atkVar);
                    int i86 = f53827f;
                    int i87 = i86 | 115;
                    int i88 = i87 << 1;
                    int i89 = -((~(i86 & 115)) & i87);
                    int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
                    f53828g = i90 % 128;
                    if (i90 % 2 == 0) {
                        throw null;
                    }
                } else {
                    aph x12 = atkVar.setX();
                    apk apkVar5 = atkVar.setX;
                    apk onLongClickListener = atkVar3.setOnLongClickListener();
                    if (!apkVar5.setOnDragListener()) {
                        apk apkVar6 = atkVar.setOnFocusChangeListener;
                        apk apkVar7 = atkVar.setY[0];
                        apk onDragListener = atkVar3.setOnDragListener();
                        apk y7 = atkVar3.setY(0);
                        boolean navBarTitleString2 = apkVar7.getNavBarTitleString();
                        if (navBarTitleString2) {
                            compoundDrawableTintBlendMode3 = onLongClickListener;
                            compoundDrawableTintBlendMode4 = onDragListener;
                        } else {
                            int i91 = f53828g;
                            int i92 = (i91 | 25) << 1;
                            int i93 = -((25 & (~i91)) | (i91 & (-26)));
                            int i94 = (i92 & i93) + (i93 | i92);
                            f53827f = i94 % 128;
                            int i95 = i94 % 2;
                            compoundDrawableTintBlendMode3 = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar7);
                            compoundDrawableTintBlendMode4 = onDragListener.setCompoundDrawableTintBlendMode(apkVar7);
                            int i96 = f53827f + 93;
                            f53828g = i96 % 128;
                            int i97 = i96 % 2;
                        }
                        boolean navBarTitleString3 = y7.getNavBarTitleString();
                        if (navBarTitleString3) {
                            apkVar = apkVar6;
                        } else {
                            int i98 = f53828g;
                            int i99 = (((i98 | 58) << 1) - (i98 ^ 58)) - 1;
                            f53827f = i99 % 128;
                            int i100 = i99 % 2;
                            apk compoundDrawableTintBlendMode5 = apkVar5.setCompoundDrawableTintBlendMode(y7);
                            apk compoundDrawableTintBlendMode6 = apkVar6.setCompoundDrawableTintBlendMode(y7);
                            if (i100 != 0) {
                                int i101 = 18 / 0;
                            }
                            apkVar5 = compoundDrawableTintBlendMode5;
                            apkVar = compoundDrawableTintBlendMode6;
                        }
                        apk onFocusChangeListener3 = apkVar.setOnFocusChangeListener(compoundDrawableTintBlendMode4);
                        apk onFocusChangeListener4 = apkVar5.setOnFocusChangeListener(compoundDrawableTintBlendMode3);
                        if (onFocusChangeListener4.setOnDragListener()) {
                            int i102 = f53828g;
                            int i103 = i102 & 83;
                            int i104 = (i102 ^ 83) | i103;
                            int i105 = ((i103 | i104) << 1) - (i104 ^ i103);
                            f53827f = i105 % 128;
                            if (i105 % 2 != 0) {
                                int i106 = 94 / 0;
                                i16 = 1;
                                if (!onFocusChangeListener3.setOnDragListener()) {
                                    atkVar = x12.setY();
                                    i17 = f53827f + 33;
                                    f53828g = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                } else {
                                    int i107 = f53828g;
                                    int i108 = (i107 & (-62)) | ((~i107) & 61);
                                    int i109 = (i107 & 61) << i16;
                                    int i110 = (i108 ^ i109) + ((i109 & i108) << i16);
                                    f53827f = i110 % 128;
                                    int i111 = i110 % 2;
                                    atkVar = atkVar.setOnEditorActionListener();
                                    int i112 = f53827f;
                                    int i113 = (i112 ^ 125) + ((i112 & 125) << 1);
                                    f53828g = i113 % 128;
                                    int i114 = i113 % 2;
                                }
                            } else {
                                i16 = 1;
                                if (!(!onFocusChangeListener3.setOnDragListener())) {
                                    int i1010 = f53828g;
                                    int i1011 = (i1010 & (-62)) | ((~i1010) & 61);
                                    int i1012 = (i1010 & 61) << i16;
                                    int i115 = (i1011 ^ i1012) + ((i1012 & i1011) << i16);
                                    f53827f = i115 % 128;
                                    int i116 = i115 % 2;
                                    atkVar = atkVar.setOnEditorActionListener();
                                    int i117 = f53827f;
                                    int i118 = (i117 ^ 125) + ((i117 & 125) << 1);
                                    f53828g = i118 % 128;
                                    int i119 = i118 % 2;
                                } else {
                                    atkVar = x12.setY();
                                    i17 = f53827f + 33;
                                    f53828g = i17 % 128;
                                    if (i17 % 2 == 0) {
                                        throw null;
                                    }
                                }
                            }
                        } else {
                            if (!onLongClickListener.setOnDragListener()) {
                                apk x13 = onFocusChangeListener4.setX();
                                apk compoundDrawableTintBlendMode7 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(apkVar5);
                                apk compoundDrawableTintBlendMode8 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode3);
                                apkVarB = compoundDrawableTintBlendMode7.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode8);
                                if (apkVarB.setOnDragListener()) {
                                    atkVar = new atk(x12, apkVarB, x12.setOnLongClickListener());
                                    int i120 = f53828g;
                                    int i121 = i120 ^ 81;
                                    int i122 = ((i120 & 81) | i121) << 1;
                                    int i123 = -i121;
                                    int i124 = ((i122 | i123) << 1) - (i122 ^ i123);
                                    f53827f = i124 % 128;
                                    if (i124 % 2 != 0) {
                                        throw null;
                                    }
                                } else {
                                    onFocusChangeListener2 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(x13);
                                    if (!navBarTitleString3) {
                                        int i125 = f53827f;
                                        int i126 = (i125 ^ 45) + ((i125 & 45) << 1);
                                        f53828g = i126 % 128;
                                        if (i126 % 2 == 0) {
                                            onFocusChangeListener2.setCompoundDrawableTintBlendMode(y7);
                                            throw null;
                                        }
                                        onFocusChangeListener2 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(y7);
                                        int i127 = f53827f;
                                        int i128 = i127 & 59;
                                        int i129 = (((i127 | 59) & (~i128)) - (~(i128 << 1))) - 1;
                                        f53828g = i129 % 128;
                                        int i130 = i129 % 2;
                                    }
                                    onFocusChangeListener = compoundDrawableTintBlendMode8.setOnFocusChangeListener(x13).setY(onFocusChangeListener2, apkVar6.setOnFocusChangeListener(apkVar7));
                                    if (!navBarTitleString2) {
                                        int i131 = f53827f;
                                        int i132 = ((i131 ^ 76) + ((i131 & 76) << 1)) - 1;
                                        f53828g = i132 % 128;
                                        if (i132 % 2 == 0) {
                                            onFocusChangeListener2.setCompoundDrawableTintBlendMode(apkVar7);
                                            throw null;
                                        }
                                        onFocusChangeListener2 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(apkVar7);
                                        i14 = f53827f + 107;
                                        f53828g = i14 % 128;
                                    }
                                    atkVar3 = new atk(x12, apkVarB, onFocusChangeListener, new apk[]{onFocusChangeListener2});
                                    i15 = f53828g + 71;
                                    f53827f = i15 % 128;
                                    if (i15 % 2 != 0) {
                                        throw null;
                                    }
                                }
                            } else {
                                int i133 = f53828g;
                                int i134 = ((i133 & 92) + (i133 | 92)) - 1;
                                f53827f = i134 % 128;
                                if (i134 % 2 != 0) {
                                    apl alwaysDrawnWithCacheEnabled = atkVar.setAlwaysDrawnWithCacheEnabled();
                                    apk navBarTitleString4 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                                    apk dividerPadding = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener().setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString4);
                                    dividerPadding.setX().setOnFocusChangeListener(dividerPadding).setOnFocusChangeListener(navBarTitleString4).setOnDragListener();
                                    throw null;
                                }
                                apl alwaysDrawnWithCacheEnabled2 = atkVar.setAlwaysDrawnWithCacheEnabled();
                                apk navBarTitleString5 = alwaysDrawnWithCacheEnabled2.getNavBarTitleString();
                                apk navigationOnClickListener = alwaysDrawnWithCacheEnabled2.setNavigationOnClickListener();
                                apk dividerPadding2 = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString5);
                                apkVarB = e.b(dividerPadding2, dividerPadding2, navBarTitleString5);
                                if (apkVarB.setOnDragListener()) {
                                    atkVar = new atk(x12, apkVarB, x12.setOnLongClickListener());
                                    int i135 = f53827f;
                                    i13 = (-2) - ((((i135 | 54) << 1) - (i135 ^ 54)) ^ (-1));
                                    f53828g = i13 % 128;
                                    int i136 = i13 % 2;
                                } else {
                                    onFocusChangeListener = dividerPadding2.setCompoundDrawableTintBlendMode(navBarTitleString5.setOnFocusChangeListener(apkVarB)).setOnFocusChangeListener(apkVarB).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(apkVarB).setOnFocusChangeListener(apkVarB);
                                    onFocusChangeListener2 = x12.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                                    int i137 = f53828g;
                                    i14 = (-2) - (((i137 & 80) + (i137 | 80)) ^ (-1));
                                    f53827f = i14 % 128;
                                }
                            }
                            int i138 = i14 % 2;
                            atkVar3 = new atk(x12, apkVarB, onFocusChangeListener, new apk[]{onFocusChangeListener2});
                            i15 = f53828g + 71;
                            f53827f = i15 % 128;
                            if (i15 % 2 != 0) {
                                throw null;
                            }
                        }
                    } else {
                        int i139 = f53827f;
                        int i140 = (i139 & 5) + (i139 | 5);
                        f53828g = i140 % 128;
                        if (i140 % 2 == 0) {
                            onLongClickListener.setOnDragListener();
                            throw null;
                        }
                        if (onLongClickListener.setOnDragListener()) {
                            int i141 = f53828g;
                            int i142 = (i141 ^ 95) + ((i141 & 95) << 1);
                            f53827f = i142 % 128;
                            int i143 = i142 % 2;
                            atkVar = x12.setY();
                            int i144 = f53828g;
                            int i145 = ((i144 & 68) + (i144 | 68)) - 1;
                            f53827f = i145 % 128;
                            if (i145 % 2 != 0) {
                                throw null;
                            }
                        } else {
                            atkVar = atkVar3.setOnFocusChangeListener(atkVar);
                            int i146 = f53828g;
                            i13 = (-2) - ((((i146 | 52) << 1) - (i146 ^ 52)) ^ (-1));
                            f53827f = i13 % 128;
                            int i1310 = i13 % 2;
                        }
                    }
                }
                return atkVar3;
            }
            if (i20 != 3) {
                atk atkVar4 = (atk) objArr[0];
                int i147 = f53827f;
                int i148 = i147 & 41;
                int i149 = (i148 - (~(-(-((i147 ^ 41) | i148))))) - 1;
                f53828g = i149 % 128;
                int i150 = i149 % 2;
                apk apkVar8 = atkVar4.setX;
                apk apkVar9 = atkVar4.setOnFocusChangeListener;
                if (!atkVar4.setIncludeFontPadding()) {
                    int i151 = f53827f;
                    int i152 = (i151 & (-42)) | ((~i151) & 41);
                    int i153 = -(-((i151 & 41) << 1));
                    int i154 = (i152 & i153) + (i153 | i152);
                    f53828g = i154 % 128;
                    if (i154 % 2 == 0) {
                        apkVar8.setOnDragListener();
                        throw null;
                    }
                    if (!apkVar8.setOnDragListener()) {
                        apk compoundDrawableTintBlendMode9 = apkVar9.setOnFocusChangeListener(apkVar8).setCompoundDrawableTintBlendMode(apkVar8);
                        apk apkVar10 = atkVar4.setY[0];
                        if (!apkVar10.getNavBarTitleString()) {
                            int i155 = f53827f;
                            int i156 = i155 | 59;
                            int i157 = (i156 << 1) - ((~(i155 & 59)) & i156);
                            f53828g = i157 % 128;
                            int i158 = i157 % 2;
                            apk dividerPadding3 = compoundDrawableTintBlendMode9.setDividerPadding(apkVar10);
                            int i159 = f53827f;
                            int i160 = i159 & 75;
                            int i161 = ((i159 | 75) & (~i160)) + (i160 << 1);
                            f53828g = i161 % 128;
                            int i162 = i161 % 2;
                            apkVar2 = dividerPadding3;
                        } else {
                            apkVar2 = compoundDrawableTintBlendMode9;
                        }
                        int i163 = f53827f;
                        int i164 = i163 & 31;
                        int i165 = ((i163 | 31) & (~i164)) + (i164 << 1);
                        f53828g = i165 % 128;
                        if (i165 % 2 != 0) {
                            return apkVar2;
                        }
                        throw null;
                    }
                }
                int i166 = f53828g;
                int i167 = i166 & 57;
                int i168 = (i166 | 57) & (~i167);
                int i169 = i167 << 1;
                int i170 = (i168 ^ i169) + ((i168 & i169) << 1);
                f53827f = i170 % 128;
                int i171 = i170 % 2;
                return apkVar9;
            }
            atkVar = (atk) objArr[0];
            int i172 = f53828g;
            int i173 = i172 & 75;
            int i174 = (i172 ^ 75) | i173;
            int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
            f53827f = i175 % 128;
            if (i175 % 2 != 0) {
                atkVar.setIncludeFontPadding();
                throw null;
            }
            if (atkVar.setIncludeFontPadding()) {
                int i176 = f53827f + 119;
                int i177 = i176 % 128;
                f53828g = i177;
                if (i176 % 2 == 0) {
                    int i178 = 60 / 0;
                }
                int i179 = ((i177 & (-88)) | ((~i177) & 87)) + ((i177 & 87) << 1);
                f53827f = i179 % 128;
                int i180 = i179 % 2;
            } else {
                apk apkVar11 = atkVar.setX;
                if (!apkVar11.setOnDragListener()) {
                    apk apkVar12 = atkVar.setOnFocusChangeListener;
                    apk apkVar13 = atkVar.setY[0];
                    atk atkVar5 = new atk(atkVar.setDividerPadding, apkVar11, apkVar12.setOnFocusChangeListener(apkVar13), new apk[]{apkVar13});
                    int i181 = f53827f;
                    int i182 = ((i181 ^ 54) + ((i181 & 54) << 1)) - 1;
                    f53828g = i182 % 128;
                    int i183 = i182 % 2;
                    return atkVar5;
                }
                int i184 = f53828g;
                int i185 = i184 & 49;
                int i186 = (~i185) & (i184 | 49);
                int i187 = -(-(i185 << 1));
                int i188 = (i186 ^ i187) + ((i187 & i186) << 1);
                f53827f = i188 % 128;
                if (i188 % 2 != 0) {
                    int i189 = 85 / 0;
                }
                int i190 = ((i184 & 32) + (i184 | 32)) - 1;
                f53827f = i190 % 128;
                if (i190 % 2 != 0) {
                    int i191 = 53 / 0;
                }
            }
        }
        return atkVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, 626263993, -626263990, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, -986555711, 986555711, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, -19563345, 19563346, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 1238807129, -1238807127, System.identityHashCode(this));
    }
}
