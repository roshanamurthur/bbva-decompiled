package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;

/* JADX INFO: loaded from: classes10.dex */
public final class ary extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53721f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53722g = 1;

    /* JADX WARN: Code duplicated, block: B:118:0x0441  */
    /* JADX WARN: Code duplicated, block: B:120:0x045e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0464  */
    /* JADX WARN: Code duplicated, block: B:123:0x0470  */
    /* JADX WARN: Code duplicated, block: B:125:0x0484  */
    /* JADX WARN: Code duplicated, block: B:128:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:129:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:133:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:134:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:136:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:138:0x0504  */
    /* JADX WARN: Code duplicated, block: B:139:0x0506  */
    /* JADX WARN: Code duplicated, block: B:140:0x0507  */
    /* JADX WARN: Code duplicated, block: B:143:0x0525  */
    /* JADX WARN: Code duplicated, block: B:144:0x0544  */
    /* JADX WARN: Code duplicated, block: B:147:0x0561  */
    /* JADX WARN: Code duplicated, block: B:150:0x057e  */
    /* JADX WARN: Code duplicated, block: B:151:0x057f  */
    /* JADX WARN: Code duplicated, block: B:153:0x0585  */
    /* JADX WARN: Code duplicated, block: B:155:0x0596  */
    /* JADX WARN: Code duplicated, block: B:156:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:157:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:159:0x05bc  */
    /* JADX WARN: Code duplicated, block: B:160:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:163:0x0617  */
    /* JADX WARN: Code duplicated, block: B:165:0x0619  */
    /* JADX WARN: Code duplicated, block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x0355  */
    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        ary aryVar;
        aph x4;
        apk compoundDrawableTintBlendMode;
        apk apkVar;
        apk apkVar2;
        boolean navBarTitleString;
        apk compoundDrawableTintBlendMode2;
        apk x6;
        apk navBarTitleString2;
        apk apkVarB;
        apk compoundDrawableTintBlendMode3;
        ary aryVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        apl y7;
        int i19;
        int i20;
        apk compoundDrawableTintBlendMode4;
        apk compoundDrawableTintBlendMode5;
        apk compoundDrawableTintBlendMode6;
        apk y10;
        int i21;
        apk apkVar3;
        apk onFocusChangeListener;
        ary aryVar3;
        int i22;
        apk apkVar4;
        int i23 = ~i11;
        int i24 = ~i12;
        int i25 = (((~(i10 | i11)) | (~(i12 | i23))) * 49) + (((~((~i10) | i24)) | i23 | (~(i10 | i12))) * (-49)) + (((~(i23 | i24)) | (~(i23 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        if (i25 == 1) {
            aryVar = (ary) objArr[0];
            int i26 = f53721f;
            int i27 = i26 & 67;
            int i28 = (i26 ^ 67) | i27;
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f53722g = i29 % 128;
            int i30 = i29 % 2;
            boolean includeFontPadding = aryVar.setIncludeFontPadding();
            if (i30 != 0) {
                if (includeFontPadding) {
                    int i31 = f53721f;
                    int i32 = i31 & 25;
                    int i33 = ((i31 | 25) & (~i32)) + (i32 << 1);
                    int i34 = i33 % 128;
                    f53722g = i34;
                    int i35 = i33 % 2;
                    i20 = (i34 ^ 55) + ((i34 & 55) << 1);
                    f53721f = i20 % 128;
                    if (i20 % 2 != 0) {
                        int i36 = 54 / 0;
                    }
                } else {
                    x4 = aryVar.setX();
                    compoundDrawableTintBlendMode = aryVar.setX;
                    if (compoundDrawableTintBlendMode.setOnDragListener()) {
                        int i37 = f53722g;
                        int i38 = i37 & 59;
                        int i39 = -(-((i37 ^ 59) | i38));
                        i18 = (i38 & i39) + (i39 | i38);
                        f53721f = i18 % 128;
                        if (i18 % 2 == 0) {
                            x4.setY();
                            throw null;
                        }
                        y7 = x4.setY();
                        int i40 = f53722g;
                        int i41 = i40 & 17;
                        int i42 = -(-((i40 ^ 17) | i41));
                        i19 = ((i41 | i42) << 1) - (i42 ^ i41);
                        f53721f = i19 % 128;
                        if (i19 % 2 != 0) {
                            throw null;
                        }
                        return y7;
                    }
                    apkVar = aryVar.setOnFocusChangeListener;
                    apkVar2 = aryVar.setY[0];
                    navBarTitleString = apkVar2.getNavBarTitleString();
                    if (navBarTitleString) {
                        int i43 = f53721f;
                        int i44 = (i43 & 119) + (i43 | 119);
                        int i45 = i44 % 128;
                        f53722g = i45;
                        int i46 = i44 % 2;
                        int i47 = i45 & 5;
                        int i48 = (((i45 | 5) & (~i47)) - (~(i47 << 1))) - 1;
                        f53721f = i48 % 128;
                        int i49 = i48 % 2;
                        compoundDrawableTintBlendMode2 = apkVar;
                    } else {
                        compoundDrawableTintBlendMode2 = apkVar.setCompoundDrawableTintBlendMode(apkVar2);
                        int i50 = f53721f;
                        int i51 = i50 & 77;
                        int i52 = ((((i50 ^ 77) | i51) << 1) - (~(-((i50 | 77) & (~i51))))) - 1;
                        f53722g = i52 % 128;
                        int i53 = i52 % 2;
                    }
                    if (navBarTitleString) {
                        int i54 = f53722g;
                        i17 = (((i54 ^ 115) | (i54 & 115)) << 1) - (((~i54) & 115) | (i54 & (-116)));
                        f53721f = i17 % 128;
                        if (i17 % 2 == 0) {
                            throw null;
                        }
                        x6 = apkVar2;
                    } else {
                        x6 = apkVar2.setX();
                        int i55 = f53722g;
                        int i56 = i55 & 117;
                        int i57 = -(-((i55 ^ 117) | i56));
                        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                        f53721f = i58 % 128;
                        int i59 = i58 % 2;
                    }
                    navBarTitleString2 = x4.getNavBarTitleString();
                    if (navBarTitleString) {
                        int i60 = f53722g;
                        int i61 = ((i60 ^ 52) + ((i60 & 52) << 1)) - 1;
                        f53721f = i61 % 128;
                        int i62 = i61 % 2;
                        int i63 = i60 & 7;
                        int i64 = (i60 ^ 7) | i63;
                        int i65 = ((i63 | i64) << 1) - (i64 ^ i63);
                        f53721f = i65 % 128;
                        int i66 = i65 % 2;
                    } else {
                        navBarTitleString2 = navBarTitleString2.setCompoundDrawableTintBlendMode(x6);
                        int i67 = f53722g;
                        int i68 = (((i67 | 108) << 1) - (i67 ^ 108)) - 1;
                        f53721f = i68 % 128;
                        int i69 = i68 % 2;
                    }
                    apkVarB = e.b(apkVar, compoundDrawableTintBlendMode2, navBarTitleString2);
                    if (apkVarB.setOnDragListener()) {
                        apk x7 = apkVarB.setX();
                        if (navBarTitleString) {
                            int i70 = f53722g;
                            i14 = ((i70 ^ 20) + ((i70 & 20) << 1)) - 1;
                            i15 = i14 % 128;
                            f53721f = i15;
                            if (i14 % 2 == 0) {
                                throw null;
                            }
                            int i71 = i15 & 119;
                            int i72 = ((i15 | 119) & (~i71)) + (i71 << 1);
                            f53722g = i72 % 128;
                            int i73 = i72 % 2;
                            compoundDrawableTintBlendMode3 = apkVarB;
                        } else {
                            compoundDrawableTintBlendMode3 = apkVarB.setCompoundDrawableTintBlendMode(x6);
                            int i74 = f53722g;
                            int i75 = (-2) - (((i74 & 102) + (i74 | 102)) ^ (-1));
                            f53721f = i75 % 128;
                            int i76 = i75 % 2;
                        }
                        if (navBarTitleString) {
                            int i77 = f53722g;
                            int i78 = (i77 ^ 77) + ((i77 & 77) << 1);
                            f53721f = i78 % 128;
                            int i79 = i78 % 2;
                            int i80 = (i77 & 61) + (i77 | 61);
                            f53721f = i80 % 128;
                            int i81 = i80 % 2;
                        } else {
                            compoundDrawableTintBlendMode = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(apkVar2);
                            int i82 = f53721f;
                            int i83 = i82 ^ 109;
                            int i84 = ((i82 & 109) | i83) << 1;
                            int i85 = -i83;
                            int i86 = ((i84 | i85) << 1) - (i84 ^ i85);
                            f53722g = i86 % 128;
                            int i87 = i86 % 2;
                        }
                        aryVar2 = new ary(x4, x7, compoundDrawableTintBlendMode.setY(apkVarB, compoundDrawableTintBlendMode2).setOnFocusChangeListener(x7).setOnFocusChangeListener(compoundDrawableTintBlendMode3), new apk[]{compoundDrawableTintBlendMode3});
                        int i88 = f53721f;
                        int i89 = i88 & 101;
                        int i90 = i88 | 101;
                        i13 = (i89 ^ i90) + ((i90 & i89) << 1);
                        f53722g = i13 % 128;
                        if (i13 % 2 != 0) {
                            return aryVar2;
                        }
                        throw null;
                    }
                    aryVar = new ary(x4, apkVarB, x4.setOnLongClickListener().setOnLongClickListener());
                    int i91 = f53721f;
                    i16 = (i91 & 67) + (i91 | 67);
                    f53722g = i16 % 128;
                    if (i16 % 2 == 0) {
                        throw null;
                    }
                }
                return aryVar;
            }
            int i92 = 59 / 0;
            if (!includeFontPadding) {
                x4 = aryVar.setX();
                compoundDrawableTintBlendMode = aryVar.setX;
                if (compoundDrawableTintBlendMode.setOnDragListener()) {
                    int i310 = f53722g;
                    int i311 = i310 & 59;
                    int i312 = -(-((i310 ^ 59) | i311));
                    i18 = (i311 & i312) + (i312 | i311);
                    f53721f = i18 % 128;
                    if (i18 % 2 == 0) {
                        x4.setY();
                        throw null;
                    }
                    y7 = x4.setY();
                    int i410 = f53722g;
                    int i411 = i410 & 17;
                    int i412 = -(-((i410 ^ 17) | i411));
                    i19 = ((i411 | i412) << 1) - (i412 ^ i411);
                    f53721f = i19 % 128;
                    if (i19 % 2 != 0) {
                        throw null;
                    }
                    return y7;
                }
                apkVar = aryVar.setOnFocusChangeListener;
                apkVar2 = aryVar.setY[0];
                navBarTitleString = apkVar2.getNavBarTitleString();
                if (navBarTitleString) {
                    int i413 = f53721f;
                    int i414 = (i413 & 119) + (i413 | 119);
                    int i415 = i414 % 128;
                    f53722g = i415;
                    int i416 = i414 % 2;
                    int i417 = i415 & 5;
                    int i418 = (((i415 | 5) & (~i417)) - (~(i417 << 1))) - 1;
                    f53721f = i418 % 128;
                    int i419 = i418 % 2;
                    compoundDrawableTintBlendMode2 = apkVar;
                } else {
                    compoundDrawableTintBlendMode2 = apkVar.setCompoundDrawableTintBlendMode(apkVar2);
                    int i510 = f53721f;
                    int i511 = i510 & 77;
                    int i512 = ((((i510 ^ 77) | i511) << 1) - (~(-((i510 | 77) & (~i511))))) - 1;
                    f53722g = i512 % 128;
                    int i513 = i512 % 2;
                }
                if (navBarTitleString) {
                    int i514 = f53722g;
                    i17 = (((i514 ^ 115) | (i514 & 115)) << 1) - (((~i514) & 115) | (i514 & (-116)));
                    f53721f = i17 % 128;
                    if (i17 % 2 == 0) {
                        throw null;
                    }
                    x6 = apkVar2;
                } else {
                    x6 = apkVar2.setX();
                    int i515 = f53722g;
                    int i516 = i515 & 117;
                    int i517 = -(-((i515 ^ 117) | i516));
                    int i518 = ((i516 | i517) << 1) - (i517 ^ i516);
                    f53721f = i518 % 128;
                    int i519 = i518 % 2;
                }
                navBarTitleString2 = x4.getNavBarTitleString();
                if (navBarTitleString) {
                    int i610 = f53722g;
                    int i611 = ((i610 ^ 52) + ((i610 & 52) << 1)) - 1;
                    f53721f = i611 % 128;
                    int i612 = i611 % 2;
                    int i613 = i610 & 7;
                    int i614 = (i610 ^ 7) | i613;
                    int i615 = ((i613 | i614) << 1) - (i614 ^ i613);
                    f53721f = i615 % 128;
                    int i616 = i615 % 2;
                } else {
                    navBarTitleString2 = navBarTitleString2.setCompoundDrawableTintBlendMode(x6);
                    int i617 = f53722g;
                    int i618 = (((i617 | 108) << 1) - (i617 ^ 108)) - 1;
                    f53721f = i618 % 128;
                    int i619 = i618 % 2;
                }
                apkVarB = e.b(apkVar, compoundDrawableTintBlendMode2, navBarTitleString2);
                if (apkVarB.setOnDragListener()) {
                    apk x10 = apkVarB.setX();
                    if (navBarTitleString) {
                        int i710 = f53722g;
                        i14 = ((i710 ^ 20) + ((i710 & 20) << 1)) - 1;
                        i15 = i14 % 128;
                        f53721f = i15;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        int i711 = i15 & 119;
                        int i712 = ((i15 | 119) & (~i711)) + (i711 << 1);
                        f53722g = i712 % 128;
                        int i713 = i712 % 2;
                        compoundDrawableTintBlendMode3 = apkVarB;
                    } else {
                        compoundDrawableTintBlendMode3 = apkVarB.setCompoundDrawableTintBlendMode(x6);
                        int i714 = f53722g;
                        int i715 = (-2) - (((i714 & 102) + (i714 | 102)) ^ (-1));
                        f53721f = i715 % 128;
                        int i716 = i715 % 2;
                    }
                    if (navBarTitleString) {
                        int i717 = f53722g;
                        int i718 = (i717 ^ 77) + ((i717 & 77) << 1);
                        f53721f = i718 % 128;
                        int i719 = i718 % 2;
                        int i810 = (i717 & 61) + (i717 | 61);
                        f53721f = i810 % 128;
                        int i811 = i810 % 2;
                    } else {
                        compoundDrawableTintBlendMode = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(apkVar2);
                        int i812 = f53721f;
                        int i813 = i812 ^ 109;
                        int i814 = ((i812 & 109) | i813) << 1;
                        int i815 = -i813;
                        int i816 = ((i814 | i815) << 1) - (i814 ^ i815);
                        f53722g = i816 % 128;
                        int i817 = i816 % 2;
                    }
                    aryVar2 = new ary(x4, x10, compoundDrawableTintBlendMode.setY(apkVarB, compoundDrawableTintBlendMode2).setOnFocusChangeListener(x10).setOnFocusChangeListener(compoundDrawableTintBlendMode3), new apk[]{compoundDrawableTintBlendMode3});
                    int i818 = f53721f;
                    int i819 = i818 & 101;
                    int i93 = i818 | 101;
                    i13 = (i819 ^ i93) + ((i93 & i819) << 1);
                    f53722g = i13 % 128;
                    if (i13 % 2 != 0) {
                        return aryVar2;
                    }
                    throw null;
                }
                aryVar = new ary(x4, apkVarB, x4.setOnLongClickListener().setOnLongClickListener());
                int i94 = f53721f;
                i16 = (i94 & 67) + (i94 | 67);
                f53722g = i16 % 128;
                if (i16 % 2 == 0) {
                    throw null;
                }
            } else {
                int i313 = f53721f;
                int i314 = i313 & 25;
                int i315 = ((i313 | 25) & (~i314)) + (i314 << 1);
                int i316 = i315 % 128;
                f53722g = i316;
                int i317 = i315 % 2;
                i20 = (i316 ^ 55) + ((i316 & 55) << 1);
                f53721f = i20 % 128;
                if (i20 % 2 != 0) {
                    int i318 = 54 / 0;
                }
            }
            return aryVar;
        }
        if (i25 == 2) {
            aryVar = (ary) objArr[0];
            int i95 = f53722g;
            int i96 = i95 & 25;
            int i97 = (i95 | 25) & (~i96);
            int i98 = i96 << 1;
            int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
            f53721f = i99 % 128;
            if (i99 % 2 != 0) {
                aryVar.setIncludeFontPadding();
                throw null;
            }
            if (!(!aryVar.setIncludeFontPadding())) {
                int i100 = f53722g;
                int i101 = i100 & 109;
                int i102 = -(-(i100 | 109));
                int i103 = ((i101 | i102) << 1) - (i102 ^ i101);
                int i104 = i103 % 128;
                f53721f = i104;
                int i105 = i103 % 2;
                int i106 = (i104 & 1) + (i104 | 1);
                f53722g = i106 % 128;
                if (i106 % 2 == 0) {
                    throw null;
                }
            } else {
                apk apkVar5 = aryVar.setX;
                if (!apkVar5.setOnDragListener()) {
                    apk apkVar6 = aryVar.setOnFocusChangeListener;
                    apk apkVar7 = aryVar.setY[0];
                    ary aryVar4 = new ary(aryVar.setDividerPadding, apkVar5, apkVar6.setOnFocusChangeListener(apkVar7), new apk[]{apkVar7});
                    int i107 = f53721f;
                    int i108 = (i107 | 39) << 1;
                    int i109 = -(((~i107) & 39) | (i107 & (-40)));
                    int i110 = (i108 & i109) + (i109 | i108);
                    f53722g = i110 % 128;
                    if (i110 % 2 != 0) {
                        return aryVar4;
                    }
                    throw null;
                }
                int i111 = f53721f;
                int i112 = i111 & 81;
                int i113 = -(-((i111 ^ 81) | i112));
                int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                int i115 = i114 % 128;
                f53722g = i115;
                int i116 = i114 % 2;
                int i117 = i115 & 65;
                int i118 = (i115 | 65) & (~i117);
                int i119 = -(-(i117 << 1));
                int i120 = (i118 ^ i119) + ((i118 & i119) << 1);
                f53721f = i120 % 128;
                if (i120 % 2 != 0) {
                    throw null;
                }
            }
            return aryVar;
        }
        if (i25 != 3) {
            ary aryVar5 = (ary) objArr[0];
            int i121 = f53721f;
            int i122 = i121 & 105;
            int i123 = (((i121 ^ 105) | i122) << 1) - ((i121 | 105) & (~i122));
            f53722g = i123 % 128;
            int i124 = i123 % 2;
            apk apkVar8 = aryVar5.setX;
            apk apkVar9 = aryVar5.setOnFocusChangeListener;
            if (!aryVar5.setIncludeFontPadding()) {
                int i125 = f53722g;
                int i126 = i125 & 103;
                int i127 = (i126 - (~((i125 ^ 103) | i126))) - 1;
                f53721f = i127 % 128;
                int i128 = i127 % 2;
                if (!apkVar8.setOnDragListener()) {
                    apk compoundDrawableTintBlendMode7 = apkVar9.setOnFocusChangeListener(apkVar8).setCompoundDrawableTintBlendMode(apkVar8);
                    apk apkVar10 = aryVar5.setY[0];
                    if (apkVar10.getNavBarTitleString()) {
                        apkVar4 = compoundDrawableTintBlendMode7;
                    } else {
                        int i129 = f53722g;
                        int i130 = i129 ^ 59;
                        int i131 = ((i129 & 59) | i130) << 1;
                        int i132 = -i130;
                        int i133 = (i131 ^ i132) + ((i131 & i132) << 1);
                        f53721f = i133 % 128;
                        int i134 = i133 % 2;
                        apk dividerPadding = compoundDrawableTintBlendMode7.setDividerPadding(apkVar10);
                        int i135 = f53722g;
                        int i136 = ((i135 & 52) + (i135 | 52)) - 1;
                        f53721f = i136 % 128;
                        int i137 = i136 % 2;
                        apkVar4 = dividerPadding;
                    }
                    int i138 = f53721f + 11;
                    f53722g = i138 % 128;
                    int i139 = i138 % 2;
                    return apkVar4;
                }
            }
            int i140 = f53722g;
            int i141 = ((i140 ^ 121) - (~(-(-((i140 & 121) << 1))))) - 1;
            f53721f = i141 % 128;
            int i142 = i141 % 2;
            return apkVar9;
        }
        y7 = (ary) objArr[0];
        apl aplVar = (apl) objArr[1];
        int i143 = f53721f;
        int i144 = i143 & 25;
        int i145 = (((i143 ^ 25) | i144) << 1) - ((i143 | 25) & (~i144));
        f53722g = i145 % 128;
        if (i145 % 2 == 0) {
            y7.setIncludeFontPadding();
            throw null;
        }
        if (y7.setIncludeFontPadding()) {
            int i146 = f53721f + 3;
            f53722g = i146 % 128;
            if (i146 % 2 != 0) {
                return aplVar;
            }
            throw null;
        }
        if (aplVar.setIncludeFontPadding()) {
            int i147 = f53722g + 123;
            f53721f = i147 % 128;
            if (i147 % 2 != 0) {
                throw null;
            }
        } else {
            aph x11 = y7.setX();
            apk compoundDrawableTintBlendMode8 = y7.setX;
            apk onLongClickListener = aplVar.setOnLongClickListener();
            if (compoundDrawableTintBlendMode8.setOnDragListener()) {
                int i148 = f53722g + 109;
                f53721f = i148 % 128;
                int i149 = i148 % 2;
                if (!onLongClickListener.setOnDragListener()) {
                    y7 = aplVar.setOnFocusChangeListener(y7);
                    int i150 = f53721f;
                    int i151 = i150 & 71;
                    int i152 = ((i150 | 71) & (~i151)) + (i151 << 1);
                    f53722g = i152 % 128;
                    if (i152 % 2 == 0) {
                        throw null;
                    }
                } else {
                    int i153 = f53722g;
                    int i154 = (i153 & 91) + (i153 | 91);
                    f53721f = i154 % 128;
                    int i155 = i154 % 2;
                    y7 = x11.setY();
                    int i156 = f53722g + 59;
                    f53721f = i156 % 128;
                    if (i156 % 2 != 0) {
                        throw null;
                    }
                }
            } else {
                apk apkVar11 = y7.setOnFocusChangeListener;
                apk apkVar12 = y7.setY[0];
                apk onDragListener = aplVar.setOnDragListener();
                apk y11 = aplVar.setY(0);
                boolean navBarTitleString3 = apkVar12.getNavBarTitleString();
                if (!navBarTitleString3) {
                    int i157 = f53722g + 24;
                    int i158 = (i157 ^ (-1)) + (i157 << 1);
                    f53721f = i158 % 128;
                    int i159 = i158 % 2;
                    compoundDrawableTintBlendMode4 = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar12);
                    if (i159 != 0) {
                        compoundDrawableTintBlendMode5 = onDragListener.setCompoundDrawableTintBlendMode(apkVar12);
                        int i160 = 4 / 0;
                    } else {
                        compoundDrawableTintBlendMode5 = onDragListener.setCompoundDrawableTintBlendMode(apkVar12);
                    }
                } else {
                    compoundDrawableTintBlendMode4 = onLongClickListener;
                    compoundDrawableTintBlendMode5 = onDragListener;
                }
                boolean navBarTitleString4 = y11.getNavBarTitleString();
                if (navBarTitleString4) {
                    compoundDrawableTintBlendMode6 = apkVar11;
                } else {
                    int i161 = f53722g;
                    int i162 = ((i161 ^ 113) | (i161 & 113)) << 1;
                    int i163 = -((i161 & (-114)) | ((~i161) & 113));
                    int i164 = (i162 & i163) + (i162 | i163);
                    f53721f = i164 % 128;
                    if (i164 % 2 != 0) {
                        compoundDrawableTintBlendMode8.setCompoundDrawableTintBlendMode(y11);
                        apkVar11.setCompoundDrawableTintBlendMode(y11);
                        throw null;
                    }
                    compoundDrawableTintBlendMode8 = compoundDrawableTintBlendMode8.setCompoundDrawableTintBlendMode(y11);
                    compoundDrawableTintBlendMode6 = apkVar11.setCompoundDrawableTintBlendMode(y11);
                }
                apk onFocusChangeListener2 = compoundDrawableTintBlendMode6.setOnFocusChangeListener(compoundDrawableTintBlendMode5);
                apk onFocusChangeListener3 = compoundDrawableTintBlendMode8.setOnFocusChangeListener(compoundDrawableTintBlendMode4);
                if (onFocusChangeListener3.setOnDragListener()) {
                    int i165 = f53721f;
                    int i166 = i165 & 93;
                    int i167 = -(-((i165 ^ 93) | i166));
                    int i168 = (i166 & i167) + (i167 | i166);
                    f53722g = i168 % 128;
                    int i169 = i168 % 2;
                    if (!onFocusChangeListener2.setOnDragListener()) {
                        y7 = x11.setY();
                        int i170 = f53721f + 97;
                        f53722g = i170 % 128;
                        if (i170 % 2 == 0) {
                            int i171 = 92 / 0;
                        }
                    } else {
                        int i172 = f53721f;
                        int i173 = (((i172 | 100) << 1) - (i172 ^ 100)) - 1;
                        f53722g = i173 % 128;
                        if (i173 % 2 == 0) {
                            y7.setOnEditorActionListener();
                            throw null;
                        }
                        y7 = y7.setOnEditorActionListener();
                    }
                } else if (onLongClickListener.setOnDragListener()) {
                    int i174 = f53722g;
                    int i175 = (i174 ^ 33) + ((i174 & 33) << 1);
                    f53721f = i175 % 128;
                    int i176 = i175 % 2;
                    apl alwaysDrawnWithCacheEnabled = y7.setAlwaysDrawnWithCacheEnabled();
                    apk navBarTitleString5 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                    apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                    apk dividerPadding2 = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString5);
                    apk onFocusChangeListener4 = e.b(dividerPadding2, dividerPadding2, navBarTitleString5).setOnFocusChangeListener(x11.getNavBarTitleString());
                    if (!onFocusChangeListener4.setOnDragListener()) {
                        y10 = dividerPadding2.setCompoundDrawableTintBlendMode(navBarTitleString5.setOnFocusChangeListener(onFocusChangeListener4)).setOnFocusChangeListener(onFocusChangeListener4).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(onFocusChangeListener4).setOnFocusChangeListener(onFocusChangeListener4);
                        onFocusChangeListener = x11.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                        int i177 = f53721f;
                        int i178 = (i177 ^ 7) + ((i177 & 7) << 1);
                        f53722g = i178 % 128;
                        int i179 = i178 % 2;
                        apkVar3 = onFocusChangeListener4;
                        i21 = 1;
                        apk[] apkVarArr = new apk[i21];
                        apkVarArr[0] = onFocusChangeListener;
                        aryVar3 = new ary(x11, apkVar3, y10, apkVarArr);
                        int i180 = f53721f;
                        i22 = ((i180 | 81) << i21) - (i180 ^ 81);
                        f53722g = i22 % 128;
                        if (i22 % 2 == 0) {
                            return aryVar3;
                        }
                        int i181 = 46 / 0;
                        return aryVar3;
                    }
                    y7 = new ary(x11, onFocusChangeListener4, x11.setOnLongClickListener().setOnLongClickListener());
                    int i182 = f53722g;
                    int i183 = i182 & 111;
                    int i184 = (i182 | 111) & (~i183);
                    int i185 = i183 << 1;
                    int i186 = (i184 ^ i185) + ((i184 & i185) << 1);
                    f53721f = i186 % 128;
                    int i187 = i186 % 2;
                } else {
                    apk x12 = onFocusChangeListener3.setX();
                    apk compoundDrawableTintBlendMode9 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode8);
                    apk compoundDrawableTintBlendMode10 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode4);
                    apk compoundDrawableTintBlendMode11 = compoundDrawableTintBlendMode9.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode10);
                    if (!compoundDrawableTintBlendMode11.setOnDragListener()) {
                        apk compoundDrawableTintBlendMode12 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(x12);
                        if (!navBarTitleString4) {
                            int i188 = f53722g;
                            int i189 = (i188 ^ 63) + ((i188 & 63) << 1);
                            f53721f = i189 % 128;
                            int i190 = i189 % 2;
                            compoundDrawableTintBlendMode12 = compoundDrawableTintBlendMode12.setCompoundDrawableTintBlendMode(y11);
                            int i191 = f53721f;
                            int i192 = i191 & 55;
                            int i193 = ((i191 ^ 55) | i192) << 1;
                            int i194 = -((i191 | 55) & (~i192));
                            int i195 = ((i193 | i194) << 1) - (i194 ^ i193);
                            f53722g = i195 % 128;
                            int i196 = i195 % 2;
                        }
                        y10 = compoundDrawableTintBlendMode10.setOnFocusChangeListener(x12).setY(compoundDrawableTintBlendMode12, apkVar11.setOnFocusChangeListener(apkVar12));
                        i21 = 1;
                        if (!navBarTitleString3) {
                            int i197 = f53721f;
                            int i198 = i197 & 19;
                            int i199 = (i197 ^ 19) | i198;
                            int i200 = (i198 ^ i199) + ((i199 & i198) << 1);
                            f53722g = i200 % 128;
                            int i201 = i200 % 2;
                            compoundDrawableTintBlendMode12 = compoundDrawableTintBlendMode12.setCompoundDrawableTintBlendMode(apkVar12);
                            int i202 = f53721f;
                            int i203 = (i202 & 76) + (i202 | 76);
                            i21 = 1;
                            int i204 = i203 - 1;
                            f53722g = i204 % 128;
                            int i205 = i204 % 2;
                        }
                        apk apkVar13 = compoundDrawableTintBlendMode12;
                        apkVar3 = compoundDrawableTintBlendMode11;
                        onFocusChangeListener = apkVar13;
                        apk[] apkVarArr2 = new apk[i21];
                        apkVarArr2[0] = onFocusChangeListener;
                        aryVar3 = new ary(x11, apkVar3, y10, apkVarArr2);
                        int i1810 = f53721f;
                        i22 = ((i1810 | 81) << i21) - (i1810 ^ 81);
                        f53722g = i22 % 128;
                        if (i22 % 2 == 0) {
                            return aryVar3;
                        }
                        int i1811 = 46 / 0;
                        return aryVar3;
                    }
                    y7 = new ary(x11, compoundDrawableTintBlendMode11, x11.setOnLongClickListener().setOnLongClickListener());
                    int i206 = f53722g;
                    int i207 = (i206 ^ 81) + ((i206 & 81) << 1);
                    f53721f = i207 % 128;
                    int i208 = i207 % 2;
                }
            }
        }
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, -121784106, 121784108, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, 2025891227, -2025891227, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, 1388424112, -1388424111, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 217675193, -217675190, System.identityHashCode(this));
    }
}
