package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;

/* JADX INFO: loaded from: classes10.dex */
public final class asi extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53750f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53751g = 1;

    /* JADX WARN: Code duplicated, block: B:155:0x055d  */
    /* JADX WARN: Code duplicated, block: B:156:0x0580  */
    /* JADX WARN: Code duplicated, block: B:157:0x05a7  */
    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        apl asiVar;
        int i13;
        apk apkVar;
        apk compoundDrawableTintBlendMode;
        apk x4;
        apk compoundDrawableTintBlendMode2;
        asi asiVar2;
        apk compoundDrawableTintBlendMode3;
        apk compoundDrawableTintBlendMode4;
        apk apkVar2;
        apk compoundDrawableTintBlendMode5;
        apk y7;
        apk onFocusChangeListener;
        int i14;
        int i15;
        apk dividerPadding;
        int i16 = ~i10;
        int i17 = ~i12;
        int i18 = (((~(i16 | i12)) | (~(i11 | i17))) * 333) + (((~(i16 | i17)) | (~(i11 | i12))) * 333) + (i16 * (-333)) + (i11 * 334) + (i10 * (-665));
        if (i18 == 1) {
            asiVar = (asi) objArr[0];
            int i19 = f53750f + 5;
            f53751g = i19 % 128;
            if (i19 % 2 == 0) {
                int i20 = 3 / 0;
                if (asiVar.setIncludeFontPadding()) {
                    int i21 = f53751g;
                    int i22 = (i21 & 103) + (i21 | 103);
                    f53750f = i22 % 128;
                    int i23 = i22 % 2;
                    int i24 = (i21 ^ 1) + ((i21 & 1) << 1);
                    f53750f = i24 % 128;
                    int i25 = i24 % 2;
                } else {
                    i13 = 1;
                    apkVar = asiVar.setX;
                    if (((apkVar.setOnDragListener() ? 1 : 0) ^ i13) != 0) {
                        apk apkVar3 = asiVar.setOnFocusChangeListener;
                        apk apkVar4 = asiVar.setY[0];
                        aph aphVar = asiVar.setDividerPadding;
                        apk onFocusChangeListener2 = apkVar3.setOnFocusChangeListener(apkVar4);
                        apk[] apkVarArr = new apk[i13];
                        apkVarArr[0] = apkVar4;
                        asi asiVar3 = new asi(aphVar, apkVar, onFocusChangeListener2, apkVarArr);
                        int i26 = f53750f;
                        int i27 = (i26 & 105) + (i26 | 105);
                        f53751g = i27 % 128;
                        int i28 = i27 % 2;
                        return asiVar3;
                    }
                    int i29 = f53750f;
                    int i30 = i29 & 125;
                    int i31 = (i29 ^ 125) | i30;
                    int i32 = (i30 & i31) + (i31 | i30);
                    int i33 = i32 % 128;
                    f53751g = i33;
                    int i34 = i32 % 2;
                    int i35 = i33 & 41;
                    int i36 = (i33 | 41) & (~i35);
                    int i37 = -(-(i35 << 1));
                    int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                    f53750f = i38 % 128;
                    int i39 = i38 % 2;
                }
            } else {
                i13 = 1;
                if (!asiVar.setIncludeFontPadding()) {
                    apkVar = asiVar.setX;
                    if (((apkVar.setOnDragListener() ? 1 : 0) ^ i13) != 0) {
                        apk apkVar5 = asiVar.setOnFocusChangeListener;
                        apk apkVar6 = asiVar.setY[0];
                        aph aphVar2 = asiVar.setDividerPadding;
                        apk onFocusChangeListener3 = apkVar5.setOnFocusChangeListener(apkVar6);
                        apk[] apkVarArr2 = new apk[i13];
                        apkVarArr2[0] = apkVar6;
                        asi asiVar4 = new asi(aphVar2, apkVar, onFocusChangeListener3, apkVarArr2);
                        int i210 = f53750f;
                        int i211 = (i210 & 105) + (i210 | 105);
                        f53751g = i211 % 128;
                        int i212 = i211 % 2;
                        return asiVar4;
                    }
                    int i213 = f53750f;
                    int i310 = i213 & 125;
                    int i311 = (i213 ^ 125) | i310;
                    int i312 = (i310 & i311) + (i311 | i310);
                    int i313 = i312 % 128;
                    f53751g = i313;
                    int i314 = i312 % 2;
                    int i315 = i313 & 41;
                    int i316 = (i313 | 41) & (~i315);
                    int i317 = -(-(i315 << 1));
                    int i318 = ((i316 | i317) << 1) - (i316 ^ i317);
                    f53750f = i318 % 128;
                    int i319 = i318 % 2;
                } else {
                    int i214 = f53751g;
                    int i215 = (i214 & 103) + (i214 | 103);
                    f53750f = i215 % 128;
                    int i216 = i215 % 2;
                    int i217 = (i214 ^ 1) + ((i214 & 1) << 1);
                    f53750f = i217 % 128;
                    int i218 = i217 % 2;
                }
            }
        } else if (i18 == 2) {
            asiVar = (asi) objArr[0];
            int i40 = f53750f;
            int i41 = (i40 & 113) + (i40 | 113);
            f53751g = i41 % 128;
            int i42 = i41 % 2;
            if (asiVar.setIncludeFontPadding()) {
                int i43 = f53751g + 33;
                f53750f = i43 % 128;
                if (i43 % 2 != 0) {
                    throw null;
                }
            } else {
                aph x6 = asiVar.setX();
                apk compoundDrawableTintBlendMode6 = asiVar.setX;
                if (!(!compoundDrawableTintBlendMode6.setOnDragListener())) {
                    int i44 = f53751g;
                    int i45 = i44 & 111;
                    int i46 = (i44 ^ 111) | i45;
                    int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                    f53750f = i47 % 128;
                    if (i47 % 2 != 0) {
                        x6.setY();
                        throw null;
                    }
                    asiVar = x6.setY();
                    int i48 = f53751g;
                    int i49 = i48 | 37;
                    int i50 = i49 << 1;
                    int i51 = -((~(i48 & 37)) & i49);
                    int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                    f53750f = i52 % 128;
                    int i53 = i52 % 2;
                } else {
                    apk apkVar7 = asiVar.setOnFocusChangeListener;
                    apk apkVar8 = asiVar.setY[0];
                    boolean navBarTitleString = apkVar8.getNavBarTitleString();
                    if (!navBarTitleString) {
                        compoundDrawableTintBlendMode = apkVar7.setCompoundDrawableTintBlendMode(apkVar8);
                        int i54 = f53751g;
                        int i55 = (i54 ^ 109) + ((i54 & 109) << 1);
                        f53750f = i55 % 128;
                        int i56 = i55 % 2;
                    } else {
                        int i57 = f53751g;
                        int i58 = i57 & 107;
                        int i59 = i58 + ((i57 ^ 107) | i58);
                        f53750f = i59 % 128;
                        int i60 = i59 % 2;
                        int i61 = i57 ^ 33;
                        int i62 = ((((i57 & 33) | i61) << 1) - (~(-i61))) - 1;
                        f53750f = i62 % 128;
                        int i63 = i62 % 2;
                        compoundDrawableTintBlendMode = apkVar7;
                    }
                    if (navBarTitleString) {
                        int i64 = f53751g;
                        int i65 = ~i64;
                        int i66 = (((i64 ^ 43) | (i64 & 43)) << 1) - ((i64 & (-44)) | (i65 & 43));
                        f53750f = i66 % 128;
                        if (i66 % 2 != 0) {
                            throw null;
                        }
                        int i67 = ((((i64 ^ 51) | (i64 & 51)) << 1) - (~(-((i64 & (-52)) | (i65 & 51))))) - 1;
                        f53750f = i67 % 128;
                        int i68 = i67 % 2;
                        x4 = apkVar8;
                    } else {
                        x4 = apkVar8.setX();
                        int i69 = f53751g;
                        int i70 = (i69 ^ 71) + ((i69 & 71) << 1);
                        f53750f = i70 % 128;
                        int i71 = i70 % 2;
                    }
                    apk navBarTitleString2 = x6.getNavBarTitleString();
                    if (navBarTitleString) {
                        int i72 = f53750f;
                        int i73 = ((i72 ^ 14) + ((i72 & 14) << 1)) - 1;
                        f53751g = i73 % 128;
                        if (i73 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        navBarTitleString2 = navBarTitleString2.setCompoundDrawableTintBlendMode(x4);
                        int i74 = f53751g;
                        int i75 = ((i74 ^ 9) | (i74 & 9)) << 1;
                        int i76 = -(((~i74) & 9) | (i74 & (-10)));
                        int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                        f53750f = i77 % 128;
                        int i78 = i77 % 2;
                    }
                    apk apkVarB = e.b(apkVar7, compoundDrawableTintBlendMode, navBarTitleString2);
                    if (!apkVarB.setOnDragListener()) {
                        apk x7 = apkVarB.setX();
                        if (navBarTitleString) {
                            int i79 = f53751g;
                            int i80 = ((i79 & (-70)) | ((~i79) & 69)) + ((i79 & 69) << 1);
                            f53750f = i80 % 128;
                            if (i80 % 2 != 0) {
                                throw null;
                            }
                            int i81 = (i79 & 22) + (i79 | 22);
                            int i82 = (i81 ^ (-1)) + (i81 << 1);
                            f53750f = i82 % 128;
                            int i83 = i82 % 2;
                            compoundDrawableTintBlendMode2 = apkVarB;
                        } else {
                            compoundDrawableTintBlendMode2 = apkVarB.setCompoundDrawableTintBlendMode(x4);
                            int i84 = f53750f;
                            int i85 = i84 & 107;
                            int i86 = (i84 | 107) & (~i85);
                            int i87 = i85 << 1;
                            int i88 = ((i86 | i87) << 1) - (i86 ^ i87);
                            f53751g = i88 % 128;
                            int i89 = i88 % 2;
                        }
                        if (navBarTitleString) {
                            int i90 = f53750f + 17;
                            f53751g = i90 % 128;
                            if (i90 % 2 == 0) {
                                throw null;
                            }
                        } else {
                            compoundDrawableTintBlendMode6 = compoundDrawableTintBlendMode6.setCompoundDrawableTintBlendMode(apkVar8);
                            int i91 = f53750f;
                            int i92 = (i91 & 91) + (i91 | 91);
                            f53751g = i92 % 128;
                            int i93 = i92 % 2;
                        }
                        asiVar2 = new asi(x6, x7, compoundDrawableTintBlendMode6.setY(apkVarB, compoundDrawableTintBlendMode).setOnFocusChangeListener(x7).setOnFocusChangeListener(compoundDrawableTintBlendMode2), new apk[]{compoundDrawableTintBlendMode2});
                        int i94 = f53750f;
                        int i95 = (i94 & 59) + (i94 | 59);
                        f53751g = i95 % 128;
                        if (i95 % 2 == 0) {
                            int i96 = 91 / 0;
                        }
                        return asiVar2;
                    }
                    asiVar = new asi(x6, apkVarB, x6.setOnLongClickListener().setOnLongClickListener());
                    int i97 = (-2) - ((f53750f + 80) ^ (-1));
                    f53751g = i97 % 128;
                    int i98 = i97 % 2;
                }
            }
        } else {
            if (i18 != 3) {
                asi asiVar5 = (asi) objArr[0];
                int i99 = f53751g;
                int i100 = (i99 & (-2)) | ((~i99) & 1);
                int i101 = (i99 & 1) << 1;
                int i102 = (i100 & i101) + (i101 | i100);
                f53750f = i102 % 128;
                if (i102 % 2 != 0) {
                    apk apkVar9 = asiVar5.setX;
                    asiVar5.setIncludeFontPadding();
                    throw null;
                }
                apk apkVar10 = asiVar5.setX;
                apk apkVar11 = asiVar5.setOnFocusChangeListener;
                if (!(!asiVar5.setIncludeFontPadding()) || apkVar10.setOnDragListener()) {
                    int i103 = f53751g;
                    int i104 = i103 & 15;
                    int i105 = i104 + ((i103 ^ 15) | i104);
                    f53750f = i105 % 128;
                    if (i105 % 2 == 0) {
                        return apkVar11;
                    }
                    throw null;
                }
                apk compoundDrawableTintBlendMode7 = apkVar11.setOnFocusChangeListener(apkVar10).setCompoundDrawableTintBlendMode(apkVar10);
                apk apkVar12 = asiVar5.setY[0];
                if (!apkVar12.getNavBarTitleString()) {
                    int i106 = f53750f + 11;
                    f53751g = i106 % 128;
                    if (i106 % 2 == 0) {
                        compoundDrawableTintBlendMode7.setDividerPadding(apkVar12);
                        throw null;
                    }
                    dividerPadding = compoundDrawableTintBlendMode7.setDividerPadding(apkVar12);
                } else {
                    dividerPadding = compoundDrawableTintBlendMode7;
                }
                int i107 = f53750f;
                int i108 = i107 & 57;
                int i109 = (((i107 | 57) & (~i108)) - (~(i108 << 1))) - 1;
                f53751g = i109 % 128;
                if (i109 % 2 != 0) {
                    return dividerPadding;
                }
                int i110 = 95 / 0;
                return dividerPadding;
            }
            asiVar = (asi) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i111 = f53751g;
            int i112 = i111 & 119;
            int i113 = i112 + ((i111 ^ 119) | i112);
            f53750f = i113 % 128;
            if (i113 % 2 != 0) {
                asiVar.setIncludeFontPadding();
                throw null;
            }
            if (asiVar.setIncludeFontPadding()) {
                int i114 = f53750f;
                int i115 = ((i114 ^ 5) | (i114 & 5)) << 1;
                int i116 = -(((~i114) & 5) | (i114 & (-6)));
                int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
                f53751g = i117 % 128;
                if (i117 % 2 != 0) {
                    return aplVar;
                }
                throw null;
            }
            if (!aplVar.setIncludeFontPadding()) {
                aph x10 = asiVar.setX();
                apk apkVar13 = asiVar.setX;
                apk onLongClickListener = aplVar.setOnLongClickListener();
                if (apkVar13.setOnDragListener()) {
                    int i118 = f53751g;
                    int i119 = i118 ^ 1;
                    int i120 = ((i118 & 1) | i119) << 1;
                    int i121 = -i119;
                    int i122 = (i120 & i121) + (i120 | i121);
                    f53750f = i122 % 128;
                    int i123 = i122 % 2;
                    if (!onLongClickListener.setOnDragListener()) {
                        asiVar = aplVar.setOnFocusChangeListener(asiVar);
                        int i124 = f53751g;
                        i14 = (i124 & 77) + (i124 | 77);
                        f53750f = i14 % 128;
                        int i125 = i14 % 2;
                    } else {
                        int i126 = f53751g + 25;
                        f53750f = i126 % 128;
                        int i127 = i126 % 2;
                        asiVar = x10.setY();
                        int i128 = f53750f;
                        int i129 = (i128 ^ 111) + ((i128 & 111) << 1);
                        f53751g = i129 % 128;
                        if (i129 % 2 == 0) {
                            throw null;
                        }
                    }
                } else {
                    apk apkVar14 = asiVar.setOnFocusChangeListener;
                    apk apkVar15 = asiVar.setY[0];
                    apk onDragListener = aplVar.setOnDragListener();
                    apk y10 = aplVar.setY(0);
                    boolean navBarTitleString3 = apkVar15.getNavBarTitleString();
                    if (!navBarTitleString3) {
                        int i130 = f53750f;
                        int i131 = (i130 & 39) + (i130 | 39);
                        f53751g = i131 % 128;
                        int i132 = i131 % 2;
                        compoundDrawableTintBlendMode3 = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar15);
                        compoundDrawableTintBlendMode4 = onDragListener.setCompoundDrawableTintBlendMode(apkVar15);
                        int i133 = f53751g + 45;
                        f53750f = i133 % 128;
                        int i134 = i133 % 2;
                    } else {
                        compoundDrawableTintBlendMode3 = onLongClickListener;
                        compoundDrawableTintBlendMode4 = onDragListener;
                    }
                    boolean navBarTitleString4 = y10.getNavBarTitleString();
                    if (navBarTitleString4) {
                        apkVar2 = apkVar14;
                    } else {
                        int i135 = f53750f;
                        int i136 = i135 & 85;
                        int i137 = i135 | 85;
                        int i138 = (i136 & i137) + (i136 | i137);
                        f53751g = i138 % 128;
                        int i139 = i138 % 2;
                        apk compoundDrawableTintBlendMode8 = apkVar13.setCompoundDrawableTintBlendMode(y10);
                        apk compoundDrawableTintBlendMode9 = apkVar14.setCompoundDrawableTintBlendMode(y10);
                        if (i139 == 0) {
                            int i140 = 36 / 0;
                        }
                        apkVar13 = compoundDrawableTintBlendMode8;
                        apkVar2 = compoundDrawableTintBlendMode9;
                    }
                    apk onFocusChangeListener4 = apkVar2.setOnFocusChangeListener(compoundDrawableTintBlendMode4);
                    apk onFocusChangeListener5 = apkVar13.setOnFocusChangeListener(compoundDrawableTintBlendMode3);
                    if (!onFocusChangeListener5.setOnDragListener()) {
                        if (onLongClickListener.setOnDragListener()) {
                            int i141 = f53750f + 19;
                            f53751g = i141 % 128;
                            int i142 = i141 % 2;
                            apl alwaysDrawnWithCacheEnabled = asiVar.setAlwaysDrawnWithCacheEnabled();
                            apk navBarTitleString5 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                            apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                            apk dividerPadding2 = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString5);
                            onFocusChangeListener = e.b(dividerPadding2, dividerPadding2, navBarTitleString5).setOnFocusChangeListener(x10.getNavBarTitleString());
                            if (onFocusChangeListener.setOnDragListener()) {
                                asiVar = new asi(x10, onFocusChangeListener, x10.setOnLongClickListener().setOnLongClickListener());
                                int i143 = f53750f;
                                int i144 = (i143 & 91) + (i143 | 91);
                                f53751g = i144 % 128;
                                if (i144 % 2 == 0) {
                                    i15 = 11;
                                    int i145 = i15 / 0;
                                }
                            } else {
                                y7 = dividerPadding2.setCompoundDrawableTintBlendMode(navBarTitleString5.setOnFocusChangeListener(onFocusChangeListener)).setOnFocusChangeListener(onFocusChangeListener).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(onFocusChangeListener).setOnFocusChangeListener(onFocusChangeListener);
                                compoundDrawableTintBlendMode5 = x10.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                                int i146 = f53751g;
                                int i147 = ((i146 & 38) + (i146 | 38)) - 1;
                                f53750f = i147 % 128;
                                int i148 = i147 % 2;
                            }
                        } else {
                            apk x11 = onFocusChangeListener5.setX();
                            apk compoundDrawableTintBlendMode10 = onFocusChangeListener4.setCompoundDrawableTintBlendMode(apkVar13);
                            apk compoundDrawableTintBlendMode11 = onFocusChangeListener4.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode3);
                            apk compoundDrawableTintBlendMode12 = compoundDrawableTintBlendMode10.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode11);
                            if (compoundDrawableTintBlendMode12.setOnDragListener()) {
                                asiVar = new asi(x10, compoundDrawableTintBlendMode12, x10.setOnLongClickListener().setOnLongClickListener());
                                int i149 = f53751g;
                                i14 = (((i149 ^ 73) | (i149 & 73)) << 1) - (((~i149) & 73) | (i149 & (-74)));
                                f53750f = i14 % 128;
                                int i1210 = i14 % 2;
                            } else {
                                compoundDrawableTintBlendMode5 = onFocusChangeListener4.setCompoundDrawableTintBlendMode(x11);
                                if (!navBarTitleString4) {
                                    int i150 = f53751g;
                                    int i151 = i150 & 73;
                                    int i152 = (i150 | 73) & (~i151);
                                    int i153 = i151 << 1;
                                    int i154 = (i152 ^ i153) + ((i152 & i153) << 1);
                                    f53750f = i154 % 128;
                                    int i155 = i154 % 2;
                                    compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode5.setCompoundDrawableTintBlendMode(y10);
                                    int i156 = f53750f;
                                    int i157 = i156 & 49;
                                    int i158 = i157 + ((i156 ^ 49) | i157);
                                    f53751g = i158 % 128;
                                    int i159 = i158 % 2;
                                }
                                y7 = compoundDrawableTintBlendMode11.setOnFocusChangeListener(x11).setY(compoundDrawableTintBlendMode5, apkVar14.setOnFocusChangeListener(apkVar15));
                                if (!navBarTitleString3) {
                                    int i160 = f53751g;
                                    int i161 = (-2) - ((((i160 | 26) << 1) - (i160 ^ 26)) ^ (-1));
                                    f53750f = i161 % 128;
                                    int i162 = i161 % 2;
                                    compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode5.setCompoundDrawableTintBlendMode(apkVar15);
                                    int i163 = f53750f;
                                    int i164 = i163 & 23;
                                    int i165 = ((i163 ^ 23) | i164) << 1;
                                    int i166 = -((i163 | 23) & (~i164));
                                    int i167 = (i165 & i166) + (i166 | i165);
                                    f53751g = i167 % 128;
                                    int i168 = i167 % 2;
                                }
                                onFocusChangeListener = compoundDrawableTintBlendMode12;
                            }
                        }
                        asiVar2 = new asi(x10, onFocusChangeListener, y7, new apk[]{compoundDrawableTintBlendMode5});
                        int i169 = f53751g;
                        int i170 = i169 & 111;
                        int i171 = (i169 ^ 111) | i170;
                        int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                        f53750f = i172 % 128;
                        int i173 = i172 % 2;
                        return asiVar2;
                    }
                    int i174 = f53750f + 55;
                    f53751g = i174 % 128;
                    int i175 = i174 % 2;
                    if (!onFocusChangeListener4.setOnDragListener()) {
                        asiVar = x10.setY();
                        int i176 = f53751g;
                        int i177 = i176 & 49;
                        int i178 = (i176 ^ 49) | i177;
                        int i179 = (i177 & i178) + (i178 | i177);
                        f53750f = i179 % 128;
                        if (i179 % 2 != 0) {
                            i15 = 28;
                            int i1410 = i15 / 0;
                        }
                    } else {
                        int i180 = f53751g + 57;
                        f53750f = i180 % 128;
                        int i181 = i180 % 2;
                        asiVar = asiVar.setOnEditorActionListener();
                        int i182 = f53751g;
                        int i183 = i182 & 93;
                        int i184 = (i182 | 93) & (~i183);
                        int i185 = i183 << 1;
                        int i186 = (i184 ^ i185) + ((i184 & i185) << 1);
                        f53750f = i186 % 128;
                        int i187 = i186 % 2;
                    }
                }
            } else {
                int i188 = f53750f;
                int i189 = i188 + 13;
                f53751g = i189 % 128;
                int i190 = i189 % 2;
                int i191 = i188 + 37;
                f53751g = i191 % 128;
                int i192 = i191 % 2;
            }
        }
        return asiVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, 690694991, -690694990, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, -1657210914, 1657210914, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, 1942200083, -1942200081, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 1813147414, -1813147411, System.identityHashCode(this));
    }
}
