package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;

/* JADX INFO: loaded from: classes10.dex */
public final class arz extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53723f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53724g = 1;

    /* JADX WARN: Code duplicated, block: B:108:0x0499  */
    /* JADX WARN: Code duplicated, block: B:110:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:113:0x04c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x04c3  */
    /* JADX WARN: Code duplicated, block: B:117:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:143:0x062b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0640  */
    /* JADX WARN: Code duplicated, block: B:147:0x0648  */
    /* JADX WARN: Code duplicated, block: B:148:0x0668  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:31:0x010f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0110  */
    /* JADX WARN: Code duplicated, block: B:34:0x011c  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0140  */
    /* JADX WARN: Code duplicated, block: B:39:0x0144  */
    /* JADX WARN: Code duplicated, block: B:41:0x0150  */
    /* JADX WARN: Code duplicated, block: B:42:0x016a  */
    /* JADX WARN: Code duplicated, block: B:44:0x0182  */
    /* JADX WARN: Code duplicated, block: B:45:0x0198  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:52:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0212  */
    /* JADX WARN: Code duplicated, block: B:56:0x0218  */
    /* JADX WARN: Code duplicated, block: B:57:0x022b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0248  */
    /* JADX WARN: Code duplicated, block: B:61:0x0263  */
    /* JADX WARN: Code duplicated, block: B:65:0x0291  */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        apl arzVar;
        int i13;
        int i14;
        apk apkVar;
        apk compoundDrawableTintBlendMode;
        apk compoundDrawableTintBlendMode2;
        apk apkVar2;
        apk compoundDrawableTintBlendMode3;
        apk compoundDrawableTintBlendMode4;
        apk y7;
        int i15;
        int i16;
        int i17;
        int i18;
        apl onFocusChangeListener;
        int i19;
        aph x4;
        apk compoundDrawableTintBlendMode5;
        apk apkVar3;
        apk apkVar4;
        boolean navBarTitleString;
        apk compoundDrawableTintBlendMode6;
        apk x6;
        apk navBarTitleString2;
        apk apkVarB;
        apk compoundDrawableTintBlendMode7;
        int i20;
        arz arzVar2;
        int i21;
        int i22;
        apk apkVar5;
        int i23 = ~i12;
        int i24 = (((~((~i10) | i11)) | (~(i11 | i23))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i23 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559));
        if (i24 == 1) {
            arzVar = (arz) objArr[0];
            int i25 = f53723f;
            int i26 = (i25 & 5) + (i25 | 5);
            f53724g = i26 % 128;
            int i27 = i26 % 2;
            boolean includeFontPadding = arzVar.setIncludeFontPadding();
            if (i27 == 0) {
                int i28 = 41 / 0;
                if (includeFontPadding) {
                    int i29 = f53723f;
                    int i30 = i29 & 47;
                    int i31 = (i29 | 47) & (~i30);
                    int i32 = i30 << 1;
                    i13 = i31 ^ i32;
                    i14 = i31 & i32;
                } else {
                    apkVar = arzVar.setX;
                    if (!apkVar.setOnDragListener()) {
                        apk apkVar6 = arzVar.setOnFocusChangeListener;
                        apk apkVar7 = arzVar.setY[0];
                        arz arzVar3 = new arz(arzVar.setDividerPadding, apkVar, apkVar6.setOnFocusChangeListener(apkVar7), new apk[]{apkVar7});
                        int i33 = f53724g + 91;
                        f53723f = i33 % 128;
                        int i34 = i33 % 2;
                        return arzVar3;
                    }
                    int i35 = f53723f;
                    int i36 = ((i35 ^ 10) + ((i35 & 10) << 1)) - 1;
                    f53724g = i36 % 128;
                    int i37 = i36 % 2;
                    int i38 = i35 & 115;
                    int i39 = ((i35 ^ 115) | i38) << 1;
                    int i40 = -((i35 | 115) & (~i38));
                    i13 = i39 ^ i40;
                    i14 = i40 & i39;
                }
            } else if (includeFontPadding) {
                int i210 = f53723f;
                int i310 = i210 & 47;
                int i311 = (i210 | 47) & (~i310);
                int i312 = i310 << 1;
                i13 = i311 ^ i312;
                i14 = i311 & i312;
            } else {
                apkVar = arzVar.setX;
                if (!apkVar.setOnDragListener()) {
                    apk apkVar8 = arzVar.setOnFocusChangeListener;
                    apk apkVar9 = arzVar.setY[0];
                    arz arzVar4 = new arz(arzVar.setDividerPadding, apkVar, apkVar8.setOnFocusChangeListener(apkVar9), new apk[]{apkVar9});
                    int i313 = f53724g + 91;
                    f53723f = i313 % 128;
                    int i314 = i313 % 2;
                    return arzVar4;
                }
                int i315 = f53723f;
                int i316 = ((i315 ^ 10) + ((i315 & 10) << 1)) - 1;
                f53724g = i316 % 128;
                int i317 = i316 % 2;
                int i318 = i315 & 115;
                int i319 = ((i315 ^ 115) | i318) << 1;
                int i41 = -((i315 | 115) & (~i318));
                i13 = i319 ^ i41;
                i14 = i41 & i319;
            }
            int i42 = i13 + (i14 << 1);
            f53724g = i42 % 128;
            int i43 = i42 % 2;
        } else {
            if (i24 == 2) {
                arzVar = (arz) objArr[0];
                apl arzVar5 = (apl) objArr[1];
                int i44 = f53723f;
                int i45 = ((i44 | 120) << 1) - (i44 ^ 120);
                int i46 = (i45 ^ (-1)) + (i45 << 1);
                f53724g = i46 % 128;
                int i47 = i46 % 2;
                if (arzVar.setIncludeFontPadding()) {
                    int i48 = f53723f;
                    int i49 = i48 & 109;
                    int i50 = (i49 - (~((i48 ^ 109) | i49))) - 1;
                    f53724g = i50 % 128;
                    int i51 = i50 % 2;
                    i16 = ((i48 & 38) + (i48 | 38)) - 1;
                    f53724g = i16 % 128;
                } else if (arzVar5.setIncludeFontPadding()) {
                    int i52 = f53723f;
                    int i53 = ((((i52 ^ 115) | (i52 & 115)) << 1) - (~(-(((~i52) & 115) | (i52 & (-116)))))) - 1;
                    f53724g = i53 % 128;
                    if (i53 % 2 == 0) {
                        throw null;
                    }
                } else {
                    aph x7 = arzVar.setX();
                    apk apkVar10 = arzVar.setX;
                    apk onLongClickListener = arzVar5.setOnLongClickListener();
                    if (apkVar10.setOnDragListener()) {
                        int i54 = f53724g;
                        int i55 = i54 & 31;
                        int i56 = (i54 ^ 31) | i55;
                        int i57 = (i55 & i56) + (i56 | i55);
                        f53723f = i57 % 128;
                        int i58 = i57 % 2;
                        if (!onLongClickListener.setOnDragListener()) {
                            onFocusChangeListener = arzVar5.setOnFocusChangeListener(arzVar);
                            System.identityHashCode(arzVar);
                            System.identityHashCode(arzVar);
                            return onFocusChangeListener;
                        }
                        int iIdentityHashCode = System.identityHashCode(arzVar);
                        int i59 = (-265378340) ^ iIdentityHashCode;
                        int i60 = ~iIdentityHashCode;
                        int i61 = (-265378340) & iIdentityHashCode;
                        int i62 = (i59 & i61) | (i59 ^ i61);
                        int i63 = -(-(((i62 & 1476887236) | (i62 ^ 1476887236)) * (-627)));
                        int i64 = 1073878124 & i63;
                        int i65 = -(-(i63 | 1073878124));
                        int i66 = (i64 & i65) + (i65 | i64);
                        int i67 = 265378339 & iIdentityHashCode;
                        int i68 = (265378339 | iIdentityHashCode) & (~i67);
                        int i69 = (i68 & i67) | (i68 ^ i67);
                        int i70 = ~i69;
                        int i71 = (i69 | i70) & i70;
                        int i72 = (-1476887237) & i71;
                        int i73 = (((i71 | (-1476887237)) & (~i72)) | i72) * (-627);
                        int i74 = ((i66 | i73) << 1) - ((i73 & (~i66)) | ((~i73) & i66));
                        int i75 = (-265378340) | i60;
                        int i76 = ~i75;
                        int i77 = (i75 | i76) & i76;
                        int i78 = (iIdentityHashCode & (-1476887237)) | ((-1476887237) ^ iIdentityHashCode);
                        int i79 = ~i78;
                        int i80 = (i78 | i79) & i79;
                        int i81 = i77 ^ i80;
                        int i82 = i80 & i77;
                        int i83 = ((i82 & i81) | (i81 ^ i82)) * 627;
                        int i84 = (i74 ^ i83) + ((i83 & i74) << 1);
                        int i85 = ~System.identityHashCode(arzVar);
                        int i86 = i85 & (-276783309);
                        int i87 = ((-276783309) | i85) & (~i86);
                        int i88 = (i87 & i86) | (i87 ^ i86);
                        int i89 = (i88 & (-1747384918)) | (1747384917 & i88) | ((~i88) & (-1747384918));
                        int i90 = ~i89;
                        int i91 = (i89 | i90) & i90;
                        int i92 = (-2021653214) & i91;
                        int i93 = (i91 | (-2021653214)) & (~i92);
                        int i94 = -(-(((i93 & i92) | (i93 ^ i92)) * (-828)));
                        int i95 = 1296752553 & i94;
                        int i96 = i95 + ((i94 ^ 1296752553) | i95);
                        int i97 = (-2515013) & i85;
                        int i98 = (i85 | (-2515013)) & (~i97);
                        int i99 = ((i98 & i97) | (i98 ^ i97)) * (-828);
                        int i100 = i96 ^ i99;
                        int i101 = ((i99 & i96) | i100) << 1;
                        int i102 = -i100;
                        int i103 = (i101 & i102) + (i101 | i102);
                        int i104 = i103 & 2082429936;
                        if (i84 <= (i104 - (~((2082429936 ^ i103) | i104))) - 1) {
                            x7.setY();
                            throw null;
                        }
                        arzVar = x7.setY();
                        int i105 = (-2) - ((f53724g + 72) ^ (-1));
                        f53723f = i105 % 128;
                        int i106 = i105 % 2;
                    } else {
                        apk apkVar11 = arzVar.setOnFocusChangeListener;
                        apk apkVar12 = arzVar.setY[0];
                        apk onDragListener = arzVar5.setOnDragListener();
                        apk y10 = arzVar5.setY(0);
                        boolean navBarTitleString3 = apkVar12.getNavBarTitleString();
                        if (navBarTitleString3) {
                            compoundDrawableTintBlendMode = onLongClickListener;
                            compoundDrawableTintBlendMode2 = onDragListener;
                        } else {
                            int i107 = f53723f;
                            int i108 = (((i107 ^ 45) | (i107 & 45)) << 1) - ((i107 & (-46)) | (45 & (~i107)));
                            f53724g = i108 % 128;
                            if (i108 % 2 == 0) {
                                onLongClickListener.setCompoundDrawableTintBlendMode(apkVar12);
                                onDragListener.setCompoundDrawableTintBlendMode(apkVar12);
                                throw null;
                            }
                            compoundDrawableTintBlendMode = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar12);
                            compoundDrawableTintBlendMode2 = onDragListener.setCompoundDrawableTintBlendMode(apkVar12);
                        }
                        boolean navBarTitleString4 = y10.getNavBarTitleString();
                        if (navBarTitleString4) {
                            apkVar2 = apkVar11;
                        } else {
                            int i109 = f53723f;
                            int i110 = (i109 | 15) << 1;
                            int i111 = -((i109 & (-16)) | (15 & (~i109)));
                            int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                            f53724g = i112 % 128;
                            int i113 = i112 % 2;
                            apk compoundDrawableTintBlendMode8 = apkVar10.setCompoundDrawableTintBlendMode(y10);
                            apk compoundDrawableTintBlendMode9 = apkVar11.setCompoundDrawableTintBlendMode(y10);
                            if (i113 == 0) {
                                int i114 = 12 / 0;
                            }
                            apkVar10 = compoundDrawableTintBlendMode8;
                            apkVar2 = compoundDrawableTintBlendMode9;
                        }
                        apk onFocusChangeListener2 = apkVar2.setOnFocusChangeListener(compoundDrawableTintBlendMode2);
                        apk onFocusChangeListener3 = apkVar10.setOnFocusChangeListener(compoundDrawableTintBlendMode);
                        if (onFocusChangeListener3.setOnDragListener()) {
                            int i115 = f53723f;
                            int i116 = i115 & 79;
                            int i117 = ((i115 | 79) & (~i116)) + (i116 << 1);
                            f53724g = i117 % 128;
                            if (i117 % 2 == 0) {
                                int i118 = 26 / 0;
                                if (onFocusChangeListener2.setOnDragListener()) {
                                    int i119 = f53723f;
                                    int i120 = i119 & 1;
                                    i17 = (((i119 ^ 1) | i120) << 1) - ((i119 | 1) & (~i120));
                                    f53724g = i17 % 128;
                                    if (i17 % 2 != 0) {
                                        arzVar.setOnEditorActionListener();
                                        throw null;
                                    }
                                    arzVar = arzVar.setOnEditorActionListener();
                                    int i121 = f53724g;
                                    i18 = (i121 ^ 25) + ((i121 & 25) << 1);
                                    f53723f = i18 % 128;
                                    if (i18 % 2 != 0) {
                                        throw null;
                                    }
                                } else {
                                    arzVar = x7.setY();
                                    int i122 = f53724g;
                                    int i123 = (i122 | 31) << 1;
                                    int i124 = -(((~i122) & 31) | (i122 & (-32)));
                                    int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                                    f53723f = i125 % 128;
                                    int i126 = i125 % 2;
                                }
                            } else if (onFocusChangeListener2.setOnDragListener()) {
                                int i1110 = f53723f;
                                int i127 = i1110 & 1;
                                i17 = (((i1110 ^ 1) | i127) << 1) - ((i1110 | 1) & (~i127));
                                f53724g = i17 % 128;
                                if (i17 % 2 != 0) {
                                    arzVar.setOnEditorActionListener();
                                    throw null;
                                }
                                arzVar = arzVar.setOnEditorActionListener();
                                int i128 = f53724g;
                                i18 = (i128 ^ 25) + ((i128 & 25) << 1);
                                f53723f = i18 % 128;
                                if (i18 % 2 != 0) {
                                    throw null;
                                }
                            } else {
                                arzVar = x7.setY();
                                int i129 = f53724g;
                                int i1210 = (i129 | 31) << 1;
                                int i1211 = -(((~i129) & 31) | (i129 & (-32)));
                                int i1212 = (i1210 ^ i1211) + ((i1211 & i1210) << 1);
                                f53723f = i1212 % 128;
                                int i1213 = i1212 % 2;
                            }
                        } else if (onLongClickListener.setOnDragListener()) {
                            int i130 = f53723f;
                            int i131 = i130 & 25;
                            int i132 = i131 + ((i130 ^ 25) | i131);
                            f53724g = i132 % 128;
                            int i133 = i132 % 2;
                            apl alwaysDrawnWithCacheEnabled = arzVar.setAlwaysDrawnWithCacheEnabled();
                            apk navBarTitleString5 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                            apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                            apk dividerPadding = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString5);
                            compoundDrawableTintBlendMode3 = e.b(dividerPadding, dividerPadding, navBarTitleString5).setOnFocusChangeListener(x7.getNavBarTitleString());
                            if (compoundDrawableTintBlendMode3.setOnDragListener()) {
                                arzVar = new arz(x7, compoundDrawableTintBlendMode3, x7.setOnLongClickListener().setOnLongClickListener());
                                int i134 = f53724g;
                                i15 = ((i134 ^ 116) + ((i134 & 116) << 1)) - 1;
                                f53723f = i15 % 128;
                                int i135 = i15 % 2;
                            } else {
                                y7 = dividerPadding.setCompoundDrawableTintBlendMode(navBarTitleString5.setOnFocusChangeListener(compoundDrawableTintBlendMode3)).setOnFocusChangeListener(compoundDrawableTintBlendMode3).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(compoundDrawableTintBlendMode3).setOnFocusChangeListener(compoundDrawableTintBlendMode3);
                                compoundDrawableTintBlendMode4 = x7.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                                int i136 = f53723f;
                                int i137 = (-2) - (((i136 & 26) + (i136 | 26)) ^ (-1));
                                f53724g = i137 % 128;
                                int i138 = i137 % 2;
                                arzVar5 = new arz(x7, compoundDrawableTintBlendMode3, y7, new apk[]{compoundDrawableTintBlendMode4});
                                int i139 = f53724g;
                                i16 = ((i139 | 93) << 1) - (i139 ^ 93);
                                f53723f = i16 % 128;
                            }
                        } else {
                            apk x10 = onFocusChangeListener3.setX();
                            apk compoundDrawableTintBlendMode10 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(apkVar10);
                            apk compoundDrawableTintBlendMode11 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode);
                            compoundDrawableTintBlendMode3 = compoundDrawableTintBlendMode10.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode11);
                            if (compoundDrawableTintBlendMode3.setOnDragListener()) {
                                arzVar = new arz(x7, compoundDrawableTintBlendMode3, x7.setOnLongClickListener().setOnLongClickListener());
                                int i140 = f53724g;
                                int i141 = i140 & 105;
                                int i142 = -(-((i140 ^ 105) | i141));
                                i15 = (i141 & i142) + (i142 | i141);
                                f53723f = i15 % 128;
                                int i1310 = i15 % 2;
                            } else {
                                compoundDrawableTintBlendMode4 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(x10);
                                if (!navBarTitleString4) {
                                    int i143 = f53723f;
                                    int i144 = ((i143 & 47) - (~(i143 | 47))) - 1;
                                    f53724g = i144 % 128;
                                    int i145 = i144 % 2;
                                    compoundDrawableTintBlendMode4 = compoundDrawableTintBlendMode4.setCompoundDrawableTintBlendMode(y10);
                                    int i146 = f53723f;
                                    int i147 = (i146 & 95) + (i146 | 95);
                                    f53724g = i147 % 128;
                                    int i148 = i147 % 2;
                                }
                                y7 = compoundDrawableTintBlendMode11.setOnFocusChangeListener(x10).setY(compoundDrawableTintBlendMode4, apkVar11.setOnFocusChangeListener(apkVar12));
                                if (!navBarTitleString3) {
                                    int i149 = f53723f + 110;
                                    int i150 = (i149 ^ (-1)) + (i149 << 1);
                                    f53724g = i150 % 128;
                                    int i151 = i150 % 2;
                                    compoundDrawableTintBlendMode4 = compoundDrawableTintBlendMode4.setCompoundDrawableTintBlendMode(apkVar12);
                                    int i152 = f53723f;
                                    int i153 = ((i152 | 69) << 1) - (i152 ^ 69);
                                    f53724g = i153 % 128;
                                    int i154 = i153 % 2;
                                }
                                arzVar5 = new arz(x7, compoundDrawableTintBlendMode3, y7, new apk[]{compoundDrawableTintBlendMode4});
                                int i1311 = f53724g;
                                i16 = ((i1311 | 93) << 1) - (i1311 ^ 93);
                                f53723f = i16 % 128;
                            }
                        }
                    }
                }
                int i155 = i16 % 2;
                return arzVar5;
            }
            if (i24 != 3) {
                arz arzVar6 = (arz) objArr[0];
                int i156 = f53724g;
                int i157 = (i156 ^ 49) + ((i156 & 49) << 1);
                f53723f = i157 % 128;
                int i158 = i157 % 2;
                apk apkVar13 = arzVar6.setX;
                apk apkVar14 = arzVar6.setOnFocusChangeListener;
                if (!arzVar6.setIncludeFontPadding()) {
                    int i159 = f53723f;
                    int i160 = (i159 & (-38)) | ((~i159) & 37);
                    int i161 = (i159 & 37) << 1;
                    int i162 = (i160 & i161) + (i161 | i160);
                    f53724g = i162 % 128;
                    int i163 = i162 % 2;
                    if (!apkVar13.setOnDragListener()) {
                        apk compoundDrawableTintBlendMode12 = apkVar14.setOnFocusChangeListener(apkVar13).setCompoundDrawableTintBlendMode(apkVar13);
                        apk apkVar15 = arzVar6.setY[0];
                        if (!apkVar15.getNavBarTitleString()) {
                            int i164 = f53724g;
                            int i165 = (i164 ^ 13) + ((i164 & 13) << 1);
                            f53723f = i165 % 128;
                            int i166 = i165 % 2;
                            apk dividerPadding2 = compoundDrawableTintBlendMode12.setDividerPadding(apkVar15);
                            int i167 = f53724g;
                            int i168 = i167 & 7;
                            int i169 = (i167 | 7) & (~i168);
                            int i170 = -(-(i168 << 1));
                            int i171 = (i169 ^ i170) + ((i169 & i170) << 1);
                            f53723f = i171 % 128;
                            int i172 = i171 % 2;
                            apkVar5 = dividerPadding2;
                        } else {
                            apkVar5 = compoundDrawableTintBlendMode12;
                        }
                        int i173 = f53724g;
                        int i174 = (((i173 & (-84)) | ((~i173) & 83)) - (~(-(-((i173 & 83) << 1))))) - 1;
                        f53723f = i174 % 128;
                        int i175 = i174 % 2;
                        return apkVar5;
                    }
                }
                int i176 = f53724g;
                int i177 = ((i176 ^ 17) | (i176 & 17)) << 1;
                int i178 = -(((~i176) & 17) | (i176 & (-18)));
                int i179 = ((i177 | i178) << 1) - (i178 ^ i177);
                f53723f = i179 % 128;
                if (i179 % 2 == 0) {
                    return apkVar14;
                }
                throw null;
            }
            arzVar = (arz) objArr[0];
            int i180 = f53724g;
            int i181 = i180 & 87;
            int i182 = i181 + ((i180 ^ 87) | i181);
            f53723f = i182 % 128;
            int i183 = i182 % 2;
            boolean includeFontPadding2 = arzVar.setIncludeFontPadding();
            if (i183 != 0) {
                int i184 = 44 / 0;
                if (!(!includeFontPadding2)) {
                    int i185 = f53723f;
                    int i186 = i185 ^ 83;
                    int i187 = (i185 & 83) << 1;
                    i19 = ((i186 | i187) << 1) - (i187 ^ i186);
                    f53724g = i19 % 128;
                    if (i19 % 2 == 0) {
                        throw null;
                    }
                } else {
                    x4 = arzVar.setX();
                    compoundDrawableTintBlendMode5 = arzVar.setX;
                    if (compoundDrawableTintBlendMode5.setOnDragListener()) {
                        apkVar3 = arzVar.setOnFocusChangeListener;
                        apkVar4 = arzVar.setY[0];
                        navBarTitleString = apkVar4.getNavBarTitleString();
                        if (navBarTitleString) {
                            int i188 = f53724g;
                            int i189 = i188 + 5;
                            f53723f = i189 % 128;
                            int i190 = i189 % 2;
                            int i191 = ((i188 & (-28)) | ((~i188) & 27)) + ((i188 & 27) << 1);
                            f53723f = i191 % 128;
                            int i192 = i191 % 2;
                            compoundDrawableTintBlendMode6 = apkVar3;
                        } else {
                            compoundDrawableTintBlendMode6 = apkVar3.setCompoundDrawableTintBlendMode(apkVar4);
                            int i193 = f53724g;
                            int i194 = i193 & 73;
                            int i195 = (((i193 ^ 73) | i194) << 1) - ((i193 | 73) & (~i194));
                            f53723f = i195 % 128;
                            int i196 = i195 % 2;
                        }
                        if (!navBarTitleString) {
                            x6 = apkVar4.setX();
                            int i197 = f53723f;
                            int i198 = i197 & 75;
                            int i199 = (i198 - (~(-(-((i197 ^ 75) | i198))))) - 1;
                            f53724g = i199 % 128;
                            int i200 = i199 % 2;
                        } else {
                            int i201 = f53724g;
                            int i202 = i201 + 107;
                            f53723f = i202 % 128;
                            int i203 = i202 % 2;
                            int i204 = ((i201 | 61) << 1) - (i201 ^ 61);
                            f53723f = i204 % 128;
                            int i205 = i204 % 2;
                            x6 = apkVar4;
                        }
                        navBarTitleString2 = x4.getNavBarTitleString();
                        if (navBarTitleString) {
                            int i206 = f53724g;
                            int i207 = i206 & 49;
                            int i208 = ((i206 ^ 49) | i207) << 1;
                            int i209 = -((i206 | 49) & (~i207));
                            int i211 = ((i208 | i209) << 1) - (i209 ^ i208);
                            int i212 = i211 % 128;
                            f53723f = i212;
                            int i213 = i211 % 2;
                            int i214 = (i212 & 67) + (i212 | 67);
                            f53724g = i214 % 128;
                            int i215 = i214 % 2;
                        } else {
                            navBarTitleString2 = navBarTitleString2.setCompoundDrawableTintBlendMode(x6);
                            System.identityHashCode(arzVar);
                            System.identityHashCode(arzVar);
                        }
                        apkVarB = e.b(apkVar3, compoundDrawableTintBlendMode6, navBarTitleString2);
                        if (apkVarB.setOnDragListener()) {
                            onFocusChangeListener = new arz(x4, apkVarB, x4.setOnLongClickListener().setOnLongClickListener());
                            int i216 = f53724g;
                            int i217 = ((i216 ^ 85) | (i216 & 85)) << 1;
                            int i218 = -(((~i216) & 85) | (i216 & (-86)));
                            int i219 = (i217 & i218) + (i218 | i217);
                            f53723f = i219 % 128;
                            int i220 = i219 % 2;
                            return onFocusChangeListener;
                        }
                        apk x11 = apkVarB.setX();
                        if (!navBarTitleString) {
                            compoundDrawableTintBlendMode7 = apkVarB.setCompoundDrawableTintBlendMode(x6);
                            int i221 = f53724g;
                            int i222 = (((i221 | 62) << 1) - (i221 ^ 62)) - 1;
                            f53723f = i222 % 128;
                            int i223 = i222 % 2;
                        } else {
                            int i224 = f53723f;
                            int i225 = i224 + 57;
                            f53724g = i225 % 128;
                            int i226 = i225 % 2;
                            int i227 = i224 ^ 11;
                            int i228 = -(-((i224 & 11) << 1));
                            int i229 = (i227 ^ i228) + ((i228 & i227) << 1);
                            f53724g = i229 % 128;
                            int i230 = i229 % 2;
                            compoundDrawableTintBlendMode7 = apkVarB;
                        }
                        if (navBarTitleString) {
                            int i231 = f53724g;
                            int i232 = (((i231 | 49) << 1) - (~(-((49 & (~i231)) | (i231 & (-50)))))) - 1;
                            int i233 = i232 % 128;
                            f53723f = i233;
                            int i234 = i232 % 2;
                            i20 = i233 + 33;
                        } else {
                            compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode5.setCompoundDrawableTintBlendMode(apkVar4);
                            i20 = f53723f + 11;
                        }
                        f53724g = i20 % 128;
                        int i235 = i20 % 2;
                        arzVar2 = new arz(x4, x11, compoundDrawableTintBlendMode5.setY(apkVarB, compoundDrawableTintBlendMode6).setOnFocusChangeListener(x11).setOnFocusChangeListener(compoundDrawableTintBlendMode7), new apk[]{compoundDrawableTintBlendMode7});
                        int i236 = f53724g;
                        i21 = (i236 & 107) + (i236 | 107);
                        f53723f = i21 % 128;
                        if (i21 % 2 == 0) {
                            return arzVar2;
                        }
                        throw null;
                    }
                    int i237 = f53723f;
                    i22 = ((i237 | 55) << 1) - (i237 ^ 55);
                    f53724g = i22 % 128;
                    if (i22 % 2 != 0) {
                        x4.setY();
                        throw null;
                    }
                    arzVar = x4.setY();
                    int i238 = f53724g;
                    int i239 = i238 & 47;
                    int i240 = i238 | 47;
                    int i241 = (i239 ^ i240) + ((i240 & i239) << 1);
                    f53723f = i241 % 128;
                    int i242 = i241 % 2;
                }
            } else if (!(!includeFontPadding2)) {
                int i1810 = f53723f;
                int i1811 = i1810 ^ 83;
                int i1812 = (i1810 & 83) << 1;
                i19 = ((i1811 | i1812) << 1) - (i1812 ^ i1811);
                f53724g = i19 % 128;
                if (i19 % 2 == 0) {
                    throw null;
                }
            } else {
                x4 = arzVar.setX();
                compoundDrawableTintBlendMode5 = arzVar.setX;
                if (compoundDrawableTintBlendMode5.setOnDragListener()) {
                    apkVar3 = arzVar.setOnFocusChangeListener;
                    apkVar4 = arzVar.setY[0];
                    navBarTitleString = apkVar4.getNavBarTitleString();
                    if (navBarTitleString) {
                        int i1813 = f53724g;
                        int i1814 = i1813 + 5;
                        f53723f = i1814 % 128;
                        int i1910 = i1814 % 2;
                        int i1911 = ((i1813 & (-28)) | ((~i1813) & 27)) + ((i1813 & 27) << 1);
                        f53723f = i1911 % 128;
                        int i1912 = i1911 % 2;
                        compoundDrawableTintBlendMode6 = apkVar3;
                    } else {
                        compoundDrawableTintBlendMode6 = apkVar3.setCompoundDrawableTintBlendMode(apkVar4);
                        int i1913 = f53724g;
                        int i1914 = i1913 & 73;
                        int i1915 = (((i1913 ^ 73) | i1914) << 1) - ((i1913 | 73) & (~i1914));
                        f53723f = i1915 % 128;
                        int i1916 = i1915 % 2;
                    }
                    if (!navBarTitleString) {
                        x6 = apkVar4.setX();
                        int i1917 = f53723f;
                        int i1918 = i1917 & 75;
                        int i1919 = (i1918 - (~(-(-((i1917 ^ 75) | i1918))))) - 1;
                        f53724g = i1919 % 128;
                        int i2010 = i1919 % 2;
                    } else {
                        int i2011 = f53724g;
                        int i2012 = i2011 + 107;
                        f53723f = i2012 % 128;
                        int i2013 = i2012 % 2;
                        int i2014 = ((i2011 | 61) << 1) - (i2011 ^ 61);
                        f53723f = i2014 % 128;
                        int i2015 = i2014 % 2;
                        x6 = apkVar4;
                    }
                    navBarTitleString2 = x4.getNavBarTitleString();
                    if (navBarTitleString) {
                        int i2016 = f53724g;
                        int i2017 = i2016 & 49;
                        int i2018 = ((i2016 ^ 49) | i2017) << 1;
                        int i2019 = -((i2016 | 49) & (~i2017));
                        int i2110 = ((i2018 | i2019) << 1) - (i2019 ^ i2018);
                        int i2111 = i2110 % 128;
                        f53723f = i2111;
                        int i2112 = i2110 % 2;
                        int i2113 = (i2111 & 67) + (i2111 | 67);
                        f53724g = i2113 % 128;
                        int i2114 = i2113 % 2;
                    } else {
                        navBarTitleString2 = navBarTitleString2.setCompoundDrawableTintBlendMode(x6);
                        System.identityHashCode(arzVar);
                        System.identityHashCode(arzVar);
                    }
                    apkVarB = e.b(apkVar3, compoundDrawableTintBlendMode6, navBarTitleString2);
                    if (apkVarB.setOnDragListener()) {
                        onFocusChangeListener = new arz(x4, apkVarB, x4.setOnLongClickListener().setOnLongClickListener());
                        int i2115 = f53724g;
                        int i2116 = ((i2115 ^ 85) | (i2115 & 85)) << 1;
                        int i2117 = -(((~i2115) & 85) | (i2115 & (-86)));
                        int i2118 = (i2116 & i2117) + (i2117 | i2116);
                        f53723f = i2118 % 128;
                        int i2210 = i2118 % 2;
                        return onFocusChangeListener;
                    }
                    apk x12 = apkVarB.setX();
                    if (!navBarTitleString) {
                        compoundDrawableTintBlendMode7 = apkVarB.setCompoundDrawableTintBlendMode(x6);
                        int i2211 = f53724g;
                        int i2212 = (((i2211 | 62) << 1) - (i2211 ^ 62)) - 1;
                        f53723f = i2212 % 128;
                        int i2213 = i2212 % 2;
                    } else {
                        int i2214 = f53723f;
                        int i2215 = i2214 + 57;
                        f53724g = i2215 % 128;
                        int i2216 = i2215 % 2;
                        int i2217 = i2214 ^ 11;
                        int i2218 = -(-((i2214 & 11) << 1));
                        int i2219 = (i2217 ^ i2218) + ((i2218 & i2217) << 1);
                        f53724g = i2219 % 128;
                        int i2310 = i2219 % 2;
                        compoundDrawableTintBlendMode7 = apkVarB;
                    }
                    if (navBarTitleString) {
                        int i2311 = f53724g;
                        int i2312 = (((i2311 | 49) << 1) - (~(-((49 & (~i2311)) | (i2311 & (-50)))))) - 1;
                        int i2313 = i2312 % 128;
                        f53723f = i2313;
                        int i2314 = i2312 % 2;
                        i20 = i2313 + 33;
                    } else {
                        compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode5.setCompoundDrawableTintBlendMode(apkVar4);
                        i20 = f53723f + 11;
                    }
                    f53724g = i20 % 128;
                    int i2315 = i20 % 2;
                    arzVar2 = new arz(x4, x12, compoundDrawableTintBlendMode5.setY(apkVarB, compoundDrawableTintBlendMode6).setOnFocusChangeListener(x12).setOnFocusChangeListener(compoundDrawableTintBlendMode7), new apk[]{compoundDrawableTintBlendMode7});
                    int i2316 = f53724g;
                    i21 = (i2316 & 107) + (i2316 | 107);
                    f53723f = i21 % 128;
                    if (i21 % 2 == 0) {
                        return arzVar2;
                    }
                    throw null;
                }
                int i2317 = f53723f;
                i22 = ((i2317 | 55) << 1) - (i2317 ^ 55);
                f53724g = i22 % 128;
                if (i22 % 2 != 0) {
                    x4.setY();
                    throw null;
                }
                arzVar = x4.setY();
                int i2318 = f53724g;
                int i2319 = i2318 & 47;
                int i243 = i2318 | 47;
                int i244 = (i2319 ^ i243) + ((i243 & i2319) << 1);
                f53723f = i244 % 128;
                int i245 = i244 % 2;
            }
        }
        return arzVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setDividerPadding(new Object[]{this}, -1870085437, 1870085438, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, 1701219662, -1701219662, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setDividerPadding(new Object[]{this}, 568617764, -568617761, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setDividerPadding(new Object[]{this, aplVar}, -778454916, 778454918, System.identityHashCode(this));
    }
}
