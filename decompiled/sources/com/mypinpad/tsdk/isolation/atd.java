package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.e;

/* JADX INFO: loaded from: classes10.dex */
public final class atd extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53808f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53809g = 1;

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        atd atdVar;
        apk x4;
        apk onFocusChangeListener;
        apk compoundDrawableTintBlendMode;
        atd atdVar2;
        int i13;
        int i14;
        apk compoundDrawableTintBlendMode2;
        apk compoundDrawableTintBlendMode3;
        apk compoundDrawableTintBlendMode4;
        apk apkVarB;
        apk onFocusChangeListener2;
        apk onFocusChangeListener3;
        int i15;
        int i16 = ~i10;
        int i17 = (((~(i10 | (~i11))) | (~(i11 | i12))) * 302) + ((~(i16 | i11 | i12)) * (-604)) + (((~((~i12) | i16 | i11)) | (~(i10 | i11 | i12))) * (-302)) + (i11 * (-301)) + (i10 * 303);
        if (i17 == 1) {
            atdVar = (atd) objArr[0];
            int i18 = f53808f;
            int i19 = (i18 & (-66)) | ((~i18) & 65);
            int i20 = (i18 & 65) << 1;
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            f53809g = i21 % 128;
            int i22 = i21 % 2;
            if (atdVar.setIncludeFontPadding()) {
                int i23 = f53809g;
                int i24 = (i23 & 123) + (i23 | 123);
                int i25 = i24 % 128;
                f53808f = i25;
                if (i24 % 2 != 0) {
                    throw null;
                }
                int i26 = (-2) - (((i25 & 90) + (i25 | 90)) ^ (-1));
                f53809g = i26 % 128;
                if (i26 % 2 == 0) {
                    throw null;
                }
            } else {
                aph x6 = atdVar.setX();
                apk apkVar = atdVar.setX;
                if (!(!apkVar.setOnDragListener())) {
                    int i27 = f53809g;
                    int i28 = ((i27 ^ 22) + ((i27 & 22) << 1)) - 1;
                    f53808f = i28 % 128;
                    if (i28 % 2 != 0) {
                        x6.setY();
                        throw null;
                    }
                    apl y7 = x6.setY();
                    int i29 = f53809g + 99;
                    f53808f = i29 % 128;
                    if (i29 % 2 == 0) {
                        return y7;
                    }
                    throw null;
                }
                apk apkVar2 = atdVar.setOnFocusChangeListener;
                apk x7 = atdVar.setY[0];
                boolean navBarTitleString = x7.getNavBarTitleString();
                if (!navBarTitleString) {
                    x4 = x7.setX();
                    int i30 = f53808f + 23;
                    f53809g = i30 % 128;
                    int i31 = i30 % 2;
                } else {
                    int i32 = f53809g + 45;
                    int i33 = i32 % 128;
                    f53808f = i33;
                    int i34 = i32 % 2;
                    int i35 = (i33 & 95) + (i33 | 95);
                    f53809g = i35 % 128;
                    int i36 = i35 % 2;
                    x4 = x7;
                }
                if (!navBarTitleString) {
                    onFocusChangeListener = apkVar2.setOnFocusChangeListener(x7).setCompoundDrawableTintBlendMode(apkVar2);
                    int i37 = f53809g;
                    int i38 = i37 & 105;
                    int i39 = ((i37 ^ 105) | i38) << 1;
                    int i40 = -((i37 | 105) & (~i38));
                    int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
                    f53808f = i41 % 128;
                    int i42 = i41 % 2;
                } else {
                    int i43 = f53809g;
                    int i44 = i43 & 55;
                    int i45 = ((i43 | 55) & (~i44)) + (i44 << 1);
                    f53808f = i45 % 128;
                    int i46 = i45 % 2;
                    onFocusChangeListener = apkVar2.setX().setOnFocusChangeListener(apkVar2);
                    int i47 = f53808f;
                    int i48 = i47 & 7;
                    int i49 = (i48 - (~(-(-((i47 ^ 7) | i48))))) - 1;
                    f53809g = i49 % 128;
                    int i50 = i49 % 2;
                }
                if (!onFocusChangeListener.setOnDragListener()) {
                    apk x10 = onFocusChangeListener.setX();
                    if (!navBarTitleString) {
                        compoundDrawableTintBlendMode = onFocusChangeListener.setCompoundDrawableTintBlendMode(x4);
                        System.identityHashCode(atdVar);
                        System.identityHashCode(atdVar);
                    } else {
                        int i51 = f53809g;
                        int i52 = ((i51 | 62) << 1) - (i51 ^ 62);
                        int i53 = (i52 ^ (-1)) + (i52 << 1);
                        int i54 = i53 % 128;
                        f53808f = i54;
                        int i55 = i53 % 2;
                        int i56 = (i54 ^ 35) + ((i54 & 35) << 1);
                        f53809g = i56 % 128;
                        int i57 = i56 % 2;
                        compoundDrawableTintBlendMode = onFocusChangeListener;
                    }
                    apk x11 = apkVar2.setOnFocusChangeListener(apkVar).setX();
                    if (navBarTitleString) {
                        int i58 = f53809g;
                        int i59 = i58 & 79;
                        int i60 = -(-(i58 | 79));
                        int i61 = ((i59 | i60) << 1) - (i60 ^ i59);
                        f53808f = i61 % 128;
                        if (i61 % 2 != 0) {
                            throw null;
                        }
                    } else {
                        x7 = x4.setX();
                        int i62 = f53808f;
                        int i63 = i62 & 65;
                        int i64 = (i62 | 65) & (~i63);
                        int i65 = i63 << 1;
                        int i66 = (i64 ^ i65) + ((i64 & i65) << 1);
                        f53809g = i66 % 128;
                        int i67 = i66 % 2;
                    }
                    atdVar2 = new atd(x6, x10, x11.setOnFocusChangeListener(onFocusChangeListener).setOnFocusChangeListener(x4).setCompoundDrawableTintBlendMode(x11).setOnFocusChangeListener(x7).setOnFocusChangeListener(x10).setOnFocusChangeListener(compoundDrawableTintBlendMode), new apk[]{compoundDrawableTintBlendMode});
                    int i68 = f53808f;
                    int i69 = i68 & 39;
                    int i70 = (i68 ^ 39) | i69;
                    int i71 = (i69 & i70) + (i70 | i69);
                    f53809g = i71 % 128;
                    int i72 = i71 % 2;
                    return atdVar2;
                }
                atdVar = new atd(x6, onFocusChangeListener, x6.setOnLongClickListener());
                int i73 = f53809g;
                int i74 = (i73 & 29) + (i73 | 29);
                f53808f = i74 % 128;
                if (i74 % 2 != 0) {
                    throw null;
                }
            }
            return atdVar;
        }
        if (i17 == 2) {
            atdVar = (atd) objArr[0];
            int i75 = f53809g;
            int i76 = (i75 | 79) << 1;
            int i77 = -(((~i75) & 79) | (i75 & (-80)));
            int i78 = (i76 & i77) + (i77 | i76);
            f53808f = i78 % 128;
            int i79 = i78 % 2;
            if (atdVar.setIncludeFontPadding()) {
                int i80 = f53808f;
                int i81 = i80 & 89;
                int i82 = (~i81) & (i80 | 89);
                int i83 = i81 << 1;
                int i84 = (i82 ^ i83) + ((i83 & i82) << 1);
                f53809g = i84 % 128;
                int i85 = i84 % 2;
                int i86 = i80 & 37;
                int i87 = -(-((i80 ^ 37) | i86));
                int i88 = (i86 & i87) + (i87 | i86);
                f53809g = i88 % 128;
                int i89 = i88 % 2;
            } else {
                apk apkVar3 = atdVar.setX;
                if (!apkVar3.setOnDragListener()) {
                    apk apkVar4 = atdVar.setOnFocusChangeListener;
                    apk apkVar5 = atdVar.setY[0];
                    atd atdVar3 = new atd(atdVar.setDividerPadding, apkVar3, apkVar4.setOnFocusChangeListener(apkVar5), new apk[]{apkVar5});
                    int i90 = f53808f;
                    int i91 = i90 & 65;
                    int i92 = ((i90 ^ 65) | i91) << 1;
                    int i93 = -((i90 | 65) & (~i91));
                    int i94 = (i92 & i93) + (i93 | i92);
                    f53809g = i94 % 128;
                    if (i94 % 2 == 0) {
                        int i95 = 77 / 0;
                    }
                    return atdVar3;
                }
                int i96 = f53808f + 125;
                int i97 = i96 % 128;
                f53809g = i97;
                if (i96 % 2 == 0) {
                    int i98 = 48 / 0;
                }
                int i99 = (-2) - (((i97 ^ 106) + ((i97 & 106) << 1)) ^ (-1));
                f53808f = i99 % 128;
                int i100 = i99 % 2;
            }
            return atdVar;
        }
        if (i17 == 3) {
            atd atdVar4 = (atd) objArr[0];
            int i101 = f53809g;
            int i102 = i101 & 99;
            int i103 = -(-((i101 ^ 99) | i102));
            int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
            f53808f = i104 % 128;
            int i105 = i104 % 2;
            apk apkVar6 = atdVar4.setX;
            apk apkVar7 = atdVar4.setOnFocusChangeListener;
            if (!(!atdVar4.setIncludeFontPadding())) {
                i13 = 1;
            } else {
                int i106 = f53809g + 83;
                f53808f = i106 % 128;
                int i107 = i106 % 2;
                i13 = 1;
                if (!apkVar6.setOnDragListener()) {
                    apk compoundDrawableTintBlendMode5 = apkVar7.setOnFocusChangeListener(apkVar6).setCompoundDrawableTintBlendMode(apkVar6);
                    apk apkVar8 = atdVar4.setY[0];
                    if (!apkVar8.getNavBarTitleString()) {
                        int i108 = f53808f;
                        int i109 = i108 & 73;
                        int i110 = i109 + ((i108 ^ 73) | i109);
                        f53809g = i110 % 128;
                        int i111 = i110 % 2;
                        compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode5.setDividerPadding(apkVar8);
                        int i112 = f53809g;
                        int i113 = ((i112 ^ 6) + ((i112 & 6) << 1)) - 1;
                        f53808f = i113 % 128;
                        int i114 = i113 % 2;
                    }
                    int i115 = f53808f;
                    int i116 = i115 & 85;
                    int i117 = -(-((i115 ^ 85) | i116));
                    int i118 = (i116 ^ i117) + ((i117 & i116) << 1);
                    f53809g = i118 % 128;
                    if (i118 % 2 != 0) {
                        return compoundDrawableTintBlendMode5;
                    }
                    throw null;
                }
            }
            int i119 = f53808f;
            int i120 = ((((i119 ^ 79) | (i119 & 79)) << i13) - (~(-(((~i119) & 79) | (i119 & (-80)))))) - i13;
            f53809g = i120 % 128;
            if (i120 % 2 != 0) {
                return apkVar7;
            }
            throw null;
        }
        apl y10 = (atd) objArr[0];
        apl aplVar = (apl) objArr[1];
        int i121 = f53809g;
        int i122 = (-2) - (((i121 & 74) + (i121 | 74)) ^ (-1));
        f53808f = i122 % 128;
        int i123 = i122 % 2;
        if (!(!y10.setIncludeFontPadding())) {
            int i124 = f53808f;
            int i125 = i124 & 89;
            int i126 = (i124 ^ 89) | i125;
            int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
            f53809g = i127 % 128;
            if (i127 % 2 != 0) {
                return aplVar;
            }
            throw null;
        }
        if (!aplVar.setIncludeFontPadding()) {
            aph x12 = y10.setX();
            apk compoundDrawableTintBlendMode6 = y10.setX;
            apk onLongClickListener = aplVar.setOnLongClickListener();
            if (compoundDrawableTintBlendMode6.setOnDragListener()) {
                int i128 = f53809g;
                int i129 = i128 & 105;
                int i130 = (((i128 | 105) & (~i129)) - (~(i129 << 1))) - 1;
                f53808f = i130 % 128;
                int i131 = i130 % 2;
                if (!onLongClickListener.setOnDragListener()) {
                    apl onFocusChangeListener4 = aplVar.setOnFocusChangeListener(y10);
                    int i132 = f53808f;
                    int i133 = ((i132 & 120) + (i132 | 120)) - 1;
                    f53809g = i133 % 128;
                    if (i133 % 2 != 0) {
                        return onFocusChangeListener4;
                    }
                    throw null;
                }
                int i134 = f53809g;
                int i135 = i134 ^ 77;
                int i136 = ((i134 & 77) | i135) << 1;
                int i137 = -i135;
                int i138 = ((i136 | i137) << 1) - (i136 ^ i137);
                f53808f = i138 % 128;
                int i139 = i138 % 2;
                apl y11 = x12.setY();
                if (i139 == 0) {
                    return y11;
                }
                int i140 = 17 / 0;
                return y11;
            }
            apk apkVar9 = y10.setOnFocusChangeListener;
            apk apkVar10 = y10.setY[0];
            apk onDragListener = aplVar.setOnDragListener();
            apk y12 = aplVar.setY(0);
            boolean z10 = !apkVar10.getNavBarTitleString();
            if (z10) {
                int i141 = f53808f;
                int i142 = (i141 ^ 80) + ((i141 & 80) << 1);
                int i143 = (i142 ^ (-1)) + (i142 << 1);
                f53809g = i143 % 128;
                int i144 = i143 % 2;
                compoundDrawableTintBlendMode2 = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar10);
                compoundDrawableTintBlendMode3 = onDragListener.setCompoundDrawableTintBlendMode(apkVar10);
                int i145 = f53808f;
                int i146 = (i145 & 55) + (i145 | 55);
                f53809g = i146 % 128;
                int i147 = i146 % 2;
            } else {
                compoundDrawableTintBlendMode2 = onLongClickListener;
                compoundDrawableTintBlendMode3 = onDragListener;
            }
            boolean navBarTitleString2 = y12.getNavBarTitleString();
            if (navBarTitleString2) {
                compoundDrawableTintBlendMode4 = apkVar9;
            } else {
                int i148 = f53808f;
                int i149 = i148 & 51;
                int i150 = i149 + ((i148 ^ 51) | i149);
                f53809g = i150 % 128;
                int i151 = i150 % 2;
                compoundDrawableTintBlendMode6 = compoundDrawableTintBlendMode6.setCompoundDrawableTintBlendMode(y12);
                compoundDrawableTintBlendMode4 = apkVar9.setCompoundDrawableTintBlendMode(y12);
                int i152 = f53808f;
                int i153 = i152 & 7;
                int i154 = (i152 ^ 7) | i153;
                int i155 = ((i153 | i154) << 1) - (i153 ^ i154);
                f53809g = i155 % 128;
                int i156 = i155 % 2;
            }
            apk onFocusChangeListener5 = compoundDrawableTintBlendMode4.setOnFocusChangeListener(compoundDrawableTintBlendMode3);
            apk onFocusChangeListener6 = compoundDrawableTintBlendMode6.setOnFocusChangeListener(compoundDrawableTintBlendMode2);
            if (!onFocusChangeListener6.setOnDragListener()) {
                if (!onLongClickListener.setOnDragListener()) {
                    apk x13 = onFocusChangeListener6.setX();
                    apk compoundDrawableTintBlendMode7 = onFocusChangeListener5.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode6);
                    apk compoundDrawableTintBlendMode8 = onFocusChangeListener5.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode2);
                    apkVarB = compoundDrawableTintBlendMode7.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode8);
                    if (apkVarB.setOnDragListener()) {
                        atd atdVar5 = new atd(x12, apkVarB, x12.setOnLongClickListener());
                        int i157 = f53809g;
                        int i158 = (i157 & 47) + (i157 | 47);
                        f53808f = i158 % 128;
                        if (i158 % 2 == 0) {
                            return atdVar5;
                        }
                        throw null;
                    }
                    onFocusChangeListener3 = onFocusChangeListener5.setCompoundDrawableTintBlendMode(x13);
                    if (!navBarTitleString2) {
                        int i159 = f53809g + 80;
                        int i160 = (i159 ^ (-1)) + (i159 << 1);
                        f53808f = i160 % 128;
                        int i161 = i160 % 2;
                        onFocusChangeListener3 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(y12);
                        int i162 = f53809g;
                        int i163 = (i162 ^ 41) + ((i162 & 41) << 1);
                        f53808f = i163 % 128;
                        int i164 = i163 % 2;
                    }
                    onFocusChangeListener2 = compoundDrawableTintBlendMode8.setOnFocusChangeListener(x13).setY(onFocusChangeListener3, apkVar9.setOnFocusChangeListener(apkVar10));
                    if (!z10) {
                        i15 = 1;
                    } else {
                        int i165 = f53808f;
                        int i166 = ((i165 | 95) << 1) - (i165 ^ 95);
                        f53809g = i166 % 128;
                        int i167 = i166 % 2;
                        onFocusChangeListener3 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(apkVar10);
                        int i168 = f53809g + 25;
                        f53808f = i168 % 128;
                        int i169 = i168 % 2;
                        i15 = 1;
                    }
                } else {
                    int i170 = f53808f;
                    int i171 = i170 & 119;
                    int i172 = -(-((i170 ^ 119) | i171));
                    int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
                    f53809g = i173 % 128;
                    int i174 = i173 % 2;
                    apl alwaysDrawnWithCacheEnabled = y10.setAlwaysDrawnWithCacheEnabled();
                    apk navBarTitleString3 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                    apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                    if (i174 == 0) {
                        apk dividerPadding = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString3);
                        dividerPadding.setX().setOnFocusChangeListener(dividerPadding).setOnFocusChangeListener(navBarTitleString3).setOnDragListener();
                        throw null;
                    }
                    apk dividerPadding2 = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString3);
                    apkVarB = e.b(dividerPadding2, dividerPadding2, navBarTitleString3);
                    if (apkVarB.setOnDragListener()) {
                        atd atdVar6 = new atd(x12, apkVarB, x12.setOnLongClickListener());
                        int i175 = f53808f;
                        int i176 = ((i175 ^ 71) | (i175 & 71)) << 1;
                        int i177 = -(((~i175) & 71) | (i175 & (-72)));
                        int i178 = ((i176 | i177) << 1) - (i177 ^ i176);
                        f53809g = i178 % 128;
                        int i179 = i178 % 2;
                        return atdVar6;
                    }
                    onFocusChangeListener2 = dividerPadding2.setCompoundDrawableTintBlendMode(navBarTitleString3.setOnFocusChangeListener(apkVarB)).setOnFocusChangeListener(apkVarB).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(apkVarB).setOnFocusChangeListener(apkVarB);
                    onFocusChangeListener3 = x12.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                    int i180 = f53808f;
                    int i181 = i180 ^ 5;
                    i15 = 1;
                    int i182 = ((((i180 & 5) | i181) << 1) - (~(-i181))) - 1;
                    f53809g = i182 % 128;
                    int i183 = i182 % 2;
                }
                apk[] apkVarArr = new apk[i15];
                apkVarArr[0] = onFocusChangeListener3;
                atdVar2 = new atd(x12, apkVarB, onFocusChangeListener2, apkVarArr);
                int i184 = f53808f;
                int i185 = i184 | 51;
                int i186 = i185 << 1;
                int i187 = -((~(i184 & 51)) & i185);
                int i188 = (i186 & i187) + (i187 | i186);
                f53809g = i188 % 128;
                if (i188 % 2 == 0) {
                    int i189 = 85 / 0;
                }
                return atdVar2;
            }
            int i190 = f53809g;
            int i191 = i190 & 69;
            int i192 = -(-((i190 ^ 69) | i191));
            int i193 = (i191 & i192) + (i192 | i191);
            f53808f = i193 % 128;
            int i194 = i193 % 2;
            if (onFocusChangeListener5.setOnDragListener()) {
                int iIdentityHashCode = System.identityHashCode(y10);
                int i195 = 711901659 & iIdentityHashCode;
                int i196 = (~i195) & (711901659 | iIdentityHashCode);
                int i197 = (((~((i196 & i195) | (i196 ^ i195))) | (-1048499164)) * 992) - 1964620656;
                int i198 = 711901659 ^ iIdentityHashCode;
                int i199 = ~((i198 & i195) | (i198 ^ i195));
                int i200 = (i199 & (-1048499164)) | ((-1048499164) ^ i199);
                int i201 = ~iIdentityHashCode;
                int i202 = (i201 & (-711901660)) | (i201 ^ (-711901660));
                int i203 = ~((i202 & (-377393812)) | (i202 ^ (-377393812)));
                int i204 = (-2) - (((i197 - (~(-(~(-(-(((i200 & i203) | (i200 ^ i203)) * (-496)))))))) - 1) ^ (-1));
                int i205 = (-377393812) & iIdentityHashCode;
                int i206 = -(-((((iIdentityHashCode | (-377393812)) & (~i205)) | i205) * 496));
                int i207 = ((i204 ^ i206) | (i204 & i206)) << 1;
                int i208 = -((i206 & (~i204)) | ((~i206) & i204));
                int i209 = (i207 ^ i208) + ((i208 & i207) << 1);
                int iIdentityHashCode2 = System.identityHashCode(y10);
                int i210 = ~(((-311953105) & iIdentityHashCode2) | ((-311953105) ^ iIdentityHashCode2));
                int i211 = ~iIdentityHashCode2;
                int i212 = i211 & (i211 | iIdentityHashCode2);
                int i213 = (i212 & 1939586808) | (i212 ^ 1939586808);
                int i214 = i213 ^ 519587797;
                int i215 = i213 & 519587797;
                int i216 = ~((i215 & i214) | (i214 ^ i215));
                int i217 = i210 & i216;
                int i218 = (i210 | i216) & (~i217);
                int i219 = ((i218 & i217) | (i218 ^ i217)) * (-318);
                int i220 = 1871055187 & i219;
                int i221 = (i220 - (~((i219 ^ 1871055187) | i220))) - 1;
                int i222 = 1939586808 & iIdentityHashCode2;
                int i223 = (~i222) & (1939586808 | iIdentityHashCode2);
                int i224 = ~((i222 & i223) | (i223 ^ i222));
                int i225 = (i221 - (~(((i224 & 207634693) | (207634693 ^ i224)) * (-318)))) - 1;
                int i226 = (-1939586809) & iIdentityHashCode2;
                int i227 = (iIdentityHashCode2 | (-1939586809)) & (~i226);
                int i228 = ~((i227 & i226) | (i227 ^ i226));
                int i229 = -(-(((i228 & (-519587798)) | ((-519587798) ^ i228)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
                int i230 = (i225 | i229) << 1;
                int i231 = -(i229 ^ i225);
                int i232 = (i230 & i231) + (i231 | i230);
                apl onEditorActionListener = y10.setOnEditorActionListener();
                if (i209 <= i232) {
                    int i233 = 68 / 0;
                }
                int i234 = f53808f + 55;
                f53809g = i234 % 128;
                int i235 = i234 % 2;
                return onEditorActionListener;
            }
            y10 = x12.setY();
            int i236 = f53809g;
            i14 = ((i236 | 51) << 1) - (i236 ^ 51);
            f53808f = i14 % 128;
        } else {
            int i237 = f53809g;
            int i238 = i237 ^ 105;
            int i239 = (i237 & 105) << 1;
            int i240 = ((i238 | i239) << 1) - (i239 ^ i238);
            int i241 = i240 % 128;
            f53808f = i241;
            int i242 = i240 % 2;
            i14 = (i241 ^ 89) + ((i241 & 89) << 1);
            f53809g = i14 % 128;
        }
        int i243 = i14 % 2;
        return y10;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setDividerPadding(new Object[]{this}, -66198163, 66198165, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, 1748791690, -1748791687, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setDividerPadding(new Object[]{this}, 597729688, -597729687, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setDividerPadding(new Object[]{this, aplVar}, -634980106, 634980106, System.identityHashCode(this));
    }
}
