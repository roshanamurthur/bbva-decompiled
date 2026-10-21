package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.e;

/* JADX INFO: loaded from: classes10.dex */
public final class asg extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53745f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53746g = 1;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        apk apkVar;
        Object obj;
        Object obj2;
        int i14;
        apl aplVar;
        apk compoundDrawableTintBlendMode;
        apk compoundDrawableTintBlendMode2;
        apk compoundDrawableTintBlendMode3;
        int i15;
        apk onFocusChangeListener;
        apk onFocusChangeListener2;
        apk onFocusChangeListener3;
        asg asgVar;
        apl onEditorActionListener;
        apl y7;
        apk compoundDrawableTintBlendMode4;
        apk x4;
        apk compoundDrawableTintBlendMode5;
        int i16;
        asg asgVar2;
        int i17 = ~i10;
        int i18 = ~i11;
        int i19 = (((~(i17 | i12)) | i18) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i18 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i17 | i18 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317));
        if (i19 == 1) {
            asg asgVar3 = (asg) objArr[0];
            int i20 = f53745f;
            int i21 = i20 & 109;
            int i22 = i21 + ((i20 ^ 109) | i21);
            f53746g = i22 % 128;
            int i23 = i22 % 2;
            apk apkVar2 = asgVar3.setX;
            apk apkVar3 = asgVar3.setOnFocusChangeListener;
            if (!asgVar3.setIncludeFontPadding()) {
                int i24 = f53746g;
                int i25 = i24 & 85;
                int i26 = ((((i24 ^ 85) | i25) << 1) - (~(-((i24 | 85) & (~i25))))) - 1;
                f53745f = i26 % 128;
                if (i26 % 2 != 0) {
                    apkVar2.setOnDragListener();
                    throw null;
                }
                if (!apkVar2.setOnDragListener()) {
                    apk compoundDrawableTintBlendMode6 = apkVar3.setOnFocusChangeListener(apkVar2).setCompoundDrawableTintBlendMode(apkVar2);
                    apk apkVar4 = asgVar3.setY[0];
                    if (!apkVar4.getNavBarTitleString()) {
                        int i27 = f53746g + 9;
                        f53745f = i27 % 128;
                        int i28 = i27 % 2;
                        apk dividerPadding = compoundDrawableTintBlendMode6.setDividerPadding(apkVar4);
                        if (i28 != 0) {
                            int i29 = 83 / 0;
                        }
                        int i30 = f53745f;
                        i13 = 1;
                        int i31 = ((((i30 ^ 37) | (i30 & 37)) << 1) - (~(-(((~i30) & 37) | (i30 & (-38)))))) - 1;
                        f53746g = i31 % 128;
                        int i32 = i31 % 2;
                        apkVar = dividerPadding;
                    } else {
                        i13 = 1;
                        apkVar = compoundDrawableTintBlendMode6;
                    }
                    int i33 = f53745f;
                    int i34 = ((i33 | 46) << i13) - (i33 ^ 46);
                    int i35 = (i34 ^ (-1)) + (i34 << i13);
                    f53746g = i35 % 128;
                    int i36 = i35 % 2;
                    obj2 = apkVar;
                    obj2 = asgVar;
                    obj2 = onEditorActionListener;
                    obj2 = y7;
                    obj2 = asgVar2;
                    return obj2;
                }
            }
            int i37 = f53745f;
            int i38 = (i37 | 37) << 1;
            int i39 = -(i37 ^ 37);
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            f53746g = i40 % 128;
            int i41 = i40 % 2;
            obj = apkVar3;
            return obj;
        }
        if (i19 == 2) {
            asg asgVar4 = (asg) objArr[0];
            apl aplVar2 = (apl) objArr[1];
            int i42 = f53746g;
            int i43 = (i42 | 65) << 1;
            int i44 = -(((~i42) & 65) | (i42 & (-66)));
            int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
            f53745f = i45 % 128;
            int i46 = i45 % 2;
            if (asgVar4.setIncludeFontPadding()) {
                int i47 = f53746g;
                int i48 = (i47 ^ 87) + ((i47 & 87) << 1);
                int i49 = i48 % 128;
                f53745f = i49;
                int i50 = i48 % 2;
                int i51 = i49 & 7;
                int i52 = -(-((i49 ^ 7) | i51));
                int i53 = (i51 & i52) + (i52 | i51);
                f53746g = i53 % 128;
                int i54 = i53 % 2;
                return aplVar2;
            }
            if (aplVar2.setIncludeFontPadding()) {
                int i55 = f53746g;
                int i56 = i55 & 5;
                int i57 = ((i55 ^ 5) | i56) << 1;
                int i58 = -((~i56) & (i55 | 5));
                int i59 = (i57 & i58) + (i57 | i58);
                f53745f = i59 % 128;
                if (i59 % 2 != 0) {
                    throw null;
                }
                int i60 = i55 & 103;
                int i61 = (((i55 ^ 103) | i60) << 1) - ((i55 | 103) & (~i60));
                f53745f = i61 % 128;
                if (i61 % 2 == 0) {
                    return asgVar4;
                }
                throw null;
            }
            aph x6 = asgVar4.setX();
            apk compoundDrawableTintBlendMode7 = asgVar4.setX;
            apk onLongClickListener = aplVar2.setOnLongClickListener();
            if (!compoundDrawableTintBlendMode7.setOnDragListener()) {
                apk apkVar5 = asgVar4.setOnFocusChangeListener;
                apk apkVar6 = asgVar4.setY[0];
                apk onDragListener = aplVar2.setOnDragListener();
                apk y10 = aplVar2.setY(0);
                boolean navBarTitleString = apkVar6.getNavBarTitleString();
                if (navBarTitleString) {
                    compoundDrawableTintBlendMode = onLongClickListener;
                    compoundDrawableTintBlendMode2 = onDragListener;
                } else {
                    int i62 = f53746g;
                    int i63 = ((i62 ^ 105) | (i62 & 105)) << 1;
                    int i64 = -((i62 & (-106)) | (105 & (~i62)));
                    int i65 = ((i63 | i64) << 1) - (i63 ^ i64);
                    f53745f = i65 % 128;
                    int i66 = i65 % 2;
                    compoundDrawableTintBlendMode = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar6);
                    if (i66 != 0) {
                        compoundDrawableTintBlendMode2 = onDragListener.setCompoundDrawableTintBlendMode(apkVar6);
                        int i67 = 75 / 0;
                    } else {
                        compoundDrawableTintBlendMode2 = onDragListener.setCompoundDrawableTintBlendMode(apkVar6);
                    }
                    System.identityHashCode(asgVar4);
                    System.identityHashCode(asgVar4);
                }
                boolean navBarTitleString2 = y10.getNavBarTitleString();
                if (navBarTitleString2) {
                    compoundDrawableTintBlendMode3 = apkVar5;
                } else {
                    int i68 = f53746g + 9;
                    f53745f = i68 % 128;
                    int i69 = i68 % 2;
                    compoundDrawableTintBlendMode7 = compoundDrawableTintBlendMode7.setCompoundDrawableTintBlendMode(y10);
                    compoundDrawableTintBlendMode3 = apkVar5.setCompoundDrawableTintBlendMode(y10);
                    int i70 = f53745f + 75;
                    f53746g = i70 % 128;
                    int i71 = i70 % 2;
                }
                apk onFocusChangeListener4 = compoundDrawableTintBlendMode3.setOnFocusChangeListener(compoundDrawableTintBlendMode2);
                apk onFocusChangeListener5 = compoundDrawableTintBlendMode7.setOnFocusChangeListener(compoundDrawableTintBlendMode);
                if (!onFocusChangeListener5.setOnDragListener()) {
                    if (onLongClickListener.setOnDragListener()) {
                        int i72 = f53745f;
                        int i73 = i72 & 65;
                        int i74 = (i72 | 65) & (~i73);
                        int i75 = -(-(i73 << 1));
                        int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                        f53746g = i76 % 128;
                        int i77 = i76 % 2;
                        apl alwaysDrawnWithCacheEnabled = asgVar4.setAlwaysDrawnWithCacheEnabled();
                        apk navBarTitleString3 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                        apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                        apk dividerPadding2 = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString3);
                        onFocusChangeListener = e.b(dividerPadding2, dividerPadding2, navBarTitleString3).setOnFocusChangeListener(x6.getNavBarTitleString());
                        if (onFocusChangeListener.setOnDragListener()) {
                            asgVar = new asg(x6, onFocusChangeListener, x6.setOnLongClickListener().setOnLongClickListener());
                            int iIdentityHashCode = System.identityHashCode(asgVar4);
                            int i78 = ~iIdentityHashCode;
                            int i79 = 1779618629 & i78;
                            int i80 = (~i79) & (1779618629 | i78);
                            int i81 = ~((i80 & i79) | (i80 ^ i79));
                            int i82 = ((-1779470342) & i81) | ((~i81) & 1779470341);
                            int i83 = i81 & 1779470341;
                            int i84 = (i83 & i82) | (i82 ^ i83);
                            int i85 = (-1779618630) & iIdentityHashCode;
                            int i86 = (~i85) & ((-1779618630) | iIdentityHashCode);
                            int i87 = ~((i85 & i86) | (i86 ^ i85));
                            int i88 = -(-(((i84 & i87) | ((~i87) & i84) | ((~i84) & i87)) * (-338)));
                            int i89 = 2056754957 & i88;
                            int i90 = (i89 + ((i88 ^ 2056754957) | i89)) - (-546141412);
                            int i91 = ~((i78 & (-1779618630)) | (1779618629 & (~i78)) | i79);
                            int i92 = (-148289) & iIdentityHashCode;
                            int i93 = (iIdentityHashCode | (-148289)) & (~i92);
                            int i94 = ~((i93 & i92) | (i93 ^ i92));
                            int i95 = i91 & i94;
                            int i96 = (i94 | i91) & (~i95);
                            int i97 = ((i96 & i95) | (i96 ^ i95)) * 338;
                            int i98 = ((((i90 ^ i97) | (i90 & i97)) << 1) - (~(-((i97 & (~i90)) | ((~i97) & i90))))) - 1;
                            int iIdentityHashCode2 = System.identityHashCode(asgVar4);
                            int i99 = ~iIdentityHashCode2;
                            int i100 = (i99 | iIdentityHashCode2) & i99;
                            int i101 = -(-(((~((87594831 ^ i100) | (87594831 & i100))) | (~((-83886409) | iIdentityHashCode2))) * (-831)));
                            int i102 = (-14698098) & i101;
                            int i103 = (i101 | (-14698098)) & (~i102);
                            int i104 = i102 << 1;
                            int i105 = ((i103 | i104) << 1) - (i103 ^ i104);
                            int i106 = ((-671432849) & i99) | (671432848 & iIdentityHashCode2);
                            int i107 = (-671432849) & iIdentityHashCode2;
                            int i108 = (i107 & i106) | (i106 ^ i107);
                            int i109 = ~i108;
                            int i110 = -(~(((i108 | i109) & i109) * (-1662)));
                            int i111 = (((i105 | i110) << 1) - (i110 ^ i105)) - 1;
                            int i112 = (i100 & 755319256) | (755319256 ^ i100);
                            int i113 = ~i112;
                            int i114 = (i112 | i113) & i113;
                            int i115 = ((-755319257) & iIdentityHashCode2) | ((-755319257) ^ iIdentityHashCode2);
                            int i116 = ~i115;
                            int i117 = (i115 | i116) & i116;
                            int i118 = (i114 & i117) | ((~i117) & i114) | ((~i114) & i117);
                            int i119 = (i99 & (-87594832)) | (87594831 & iIdentityHashCode2);
                            int i120 = iIdentityHashCode2 & (-87594832);
                            int i121 = ~((i120 & i119) | (i119 ^ i120));
                            int i122 = ((~i121) & i118) | ((~i118) & i121);
                            int i123 = i121 & i118;
                            int i124 = ((i123 & i122) | (i122 ^ i123)) * 831;
                            int i125 = i111 & i124;
                            if (i98 > ((((i111 ^ i124) | i125) << 1) - (~(-((i124 | i111) & (~i125))))) - 1) {
                                obj2 = asgVar;
                                throw null;
                            }
                        } else {
                            onFocusChangeListener3 = dividerPadding2.setCompoundDrawableTintBlendMode(navBarTitleString3.setOnFocusChangeListener(onFocusChangeListener)).setOnFocusChangeListener(onFocusChangeListener).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(onFocusChangeListener).setOnFocusChangeListener(onFocusChangeListener);
                            onFocusChangeListener2 = x6.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                            int i126 = f53746g + 121;
                            f53745f = i126 % 128;
                            int i127 = i126 % 2;
                            i15 = 1;
                        }
                    } else {
                        apk x7 = onFocusChangeListener5.setX();
                        apk compoundDrawableTintBlendMode8 = onFocusChangeListener4.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode7);
                        apk compoundDrawableTintBlendMode9 = onFocusChangeListener4.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode);
                        apk compoundDrawableTintBlendMode10 = compoundDrawableTintBlendMode8.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode9);
                        if (compoundDrawableTintBlendMode10.setOnDragListener()) {
                            asg asgVar5 = new asg(x6, compoundDrawableTintBlendMode10, x6.setOnLongClickListener().setOnLongClickListener());
                            int i128 = f53745f;
                            int i129 = i128 & 117;
                            i14 = (i129 - (~(-(-((i128 ^ 117) | i129))))) - 1;
                            aplVar = asgVar5;
                            f53746g = i14 % 128;
                            int i130 = i14 % 2;
                            obj2 = aplVar;
                        } else {
                            apk compoundDrawableTintBlendMode11 = onFocusChangeListener4.setCompoundDrawableTintBlendMode(x7);
                            if (!navBarTitleString2) {
                                int i131 = f53746g;
                                int i132 = ((i131 ^ 112) + ((i131 & 112) << 1)) - 1;
                                f53745f = i132 % 128;
                                int i133 = i132 % 2;
                                compoundDrawableTintBlendMode11 = compoundDrawableTintBlendMode11.setCompoundDrawableTintBlendMode(y10);
                                int i134 = f53746g;
                                int i135 = ((i134 & (-72)) | ((~i134) & 71)) + ((i134 & 71) << 1);
                                f53745f = i135 % 128;
                                int i136 = i135 % 2;
                            }
                            apk y11 = compoundDrawableTintBlendMode9.setOnFocusChangeListener(x7).setY(compoundDrawableTintBlendMode11, apkVar5.setOnFocusChangeListener(apkVar6));
                            if (navBarTitleString) {
                                i15 = 1;
                            } else {
                                int i137 = f53745f;
                                int i138 = i137 & 33;
                                int i139 = (i137 | 33) & (~i138);
                                int i140 = -(-(i138 << 1));
                                int i141 = (i139 & i140) + (i139 | i140);
                                f53746g = i141 % 128;
                                int i142 = i141 % 2;
                                compoundDrawableTintBlendMode11 = compoundDrawableTintBlendMode11.setCompoundDrawableTintBlendMode(apkVar6);
                                int i143 = f53745f;
                                i15 = 1;
                                int i144 = (i143 & 1) + (i143 | 1);
                                f53746g = i144 % 128;
                                int i145 = i144 % 2;
                            }
                            onFocusChangeListener = compoundDrawableTintBlendMode10;
                            onFocusChangeListener2 = compoundDrawableTintBlendMode11;
                            onFocusChangeListener3 = y11;
                        }
                    }
                    apk[] apkVarArr = new apk[i15];
                    apkVarArr[0] = onFocusChangeListener2;
                    asg asgVar6 = new asg(x6, onFocusChangeListener, onFocusChangeListener3, apkVarArr);
                    int i146 = f53746g;
                    int i147 = (i146 & (-34)) | ((~i146) & 33);
                    int i148 = (i146 & 33) << i15;
                    int i149 = (i147 & i148) + (i148 | i147);
                    f53745f = i149 % 128;
                    obj = asgVar6;
                    if (i149 % 2 != 0) {
                        throw null;
                    }
                    return obj;
                }
                int i150 = f53745f + 74;
                int i151 = (i150 ^ (-1)) + (i150 << 1);
                f53746g = i151 % 128;
                int i152 = i151 % 2;
                if (!onFocusChangeListener4.setOnDragListener()) {
                    y7 = x6.setY();
                    int iIdentityHashCode3 = System.identityHashCode(asgVar4);
                    int i153 = ~iIdentityHashCode3;
                    int i154 = (-693026674) & i153;
                    int i155 = ((-693026674) ^ i153) | i154;
                    int i156 = (447651881 & i155) | ((~i155) & (-447651882));
                    int i157 = i155 & (-447651882);
                    int i158 = ~((i157 & i156) | (i156 ^ i157));
                    int i159 = ~(((-312475657) & iIdentityHashCode3) | ((-312475657) ^ iIdentityHashCode3));
                    int i160 = -(-(((i158 & i159) | (i158 ^ i159)) * 988));
                    int i161 = (-1463605997) & i160;
                    int i162 = ((((-1463605997) ^ i160) | i161) << 1) - ((i160 | (-1463605997)) & (~i161));
                    int i163 = i162 & 410125112;
                    int i164 = ((i162 ^ 410125112) | i163) << 1;
                    int i165 = -((410125112 | i162) & (~i163));
                    int i166 = i154 | (iIdentityHashCode3 & 693026673);
                    int i167 = iIdentityHashCode3 & (-693026674);
                    int i168 = (i167 & i166) | (i166 ^ i167);
                    int i169 = ~i168;
                    int i170 = (i168 | i169) & i169;
                    int i171 = 557850448 ^ i170;
                    int i172 = i170 & 557850448;
                    int i173 = (i172 & i171) | (i171 ^ i172);
                    int i174 = i153 & (-447651882);
                    int i175 = ((i153 | (-447651882)) & (~i174)) | i174;
                    int i176 = i175 & 693026673;
                    int i177 = (i175 | 693026673) & (~i176);
                    int i178 = ~((i177 & i176) | (i177 ^ i176));
                    int i179 = ((~i178) & i173) | ((~i173) & i178);
                    int i180 = i173 & i178;
                    int i181 = (((i164 & i165) + (i165 | i164)) - (~(((i180 & i179) | (i179 ^ i180)) * 988))) - 1;
                    int iIdentityHashCode4 = System.identityHashCode(asgVar4);
                    int i182 = ~iIdentityHashCode4;
                    int i183 = ((586265344 & i182) | (i182 ^ 586265344)) * (-192);
                    int i184 = (-545426733) & i183;
                    int i185 = ((i183 | (-545426733)) & (~i184)) + (i184 << 1);
                    int i186 = (i182 | iIdentityHashCode4) & i182;
                    int i187 = ~((i186 & 1056682756) | (1056682756 ^ i186));
                    int i188 = 263320 & i187;
                    int i189 = (i187 | 263320) & (~i188);
                    int i190 = -(-(((i189 & i188) | (i189 ^ i188)) * (-384)));
                    int i191 = i185 ^ i190;
                    int i192 = ((i185 & i190) | i191) << 1;
                    int i193 = -i191;
                    int i194 = ((i192 | i193) << 1) - (i192 ^ i193);
                    int i195 = (-263321) & iIdentityHashCode4;
                    int i196 = ((-263321) | iIdentityHashCode4) & (~i195);
                    int i197 = (i196 & i195) | (i196 ^ i195);
                    int i198 = ~i197;
                    int i199 = (i197 | i198) & i198;
                    int i200 = ((~i182) & 1056682756) | ((-1056682757) & i182);
                    int i201 = i182 & 1056682756;
                    int i202 = (i201 & i200) | (i200 ^ i201);
                    int i203 = ((-586528665) & i202) | ((~i202) & 586528664);
                    int i204 = i202 & 586528664;
                    int i205 = ~((i204 & i203) | (i203 ^ i204));
                    int i206 = ((~i205) & i199) | ((~i199) & i205);
                    int i207 = i205 & i199;
                    int i208 = (i207 & i206) | (i206 ^ i207);
                    int i209 = ~((iIdentityHashCode4 & (-470417413)) | ((-470417413) ^ iIdentityHashCode4));
                    int i210 = i208 ^ i209;
                    int i211 = i209 & i208;
                    int i212 = -(-(((i211 & i210) | (i210 ^ i211)) * 192));
                    if (i181 <= (i194 ^ i212) + ((i212 & i194) << 1)) {
                        obj2 = y7;
                        throw null;
                    }
                } else {
                    int i213 = f53746g;
                    int i214 = (i213 & (-120)) | ((~i213) & 119);
                    int i215 = (i213 & 119) << 1;
                    int i216 = (i214 ^ i215) + ((i215 & i214) << 1);
                    f53745f = i216 % 128;
                    int i217 = i216 % 2;
                    onEditorActionListener = asgVar4.setOnEditorActionListener();
                    int i218 = f53745f;
                    int i219 = ((i218 & (-126)) | ((~i218) & 125)) + ((i218 & 125) << 1);
                    f53746g = i219 % 128;
                    if (i219 % 2 == 0) {
                        obj2 = onEditorActionListener;
                        throw null;
                    }
                }
            } else {
                int i220 = f53746g;
                int i221 = i220 ^ 105;
                int i222 = (((i220 & 105) | i221) << 1) - i221;
                f53745f = i222 % 128;
                int i223 = i222 % 2;
                if (onLongClickListener.setOnDragListener()) {
                    int i224 = f53745f + 1;
                    f53746g = i224 % 128;
                    int i225 = i224 % 2;
                    apl y12 = x6.setY();
                    int i226 = f53745f;
                    int i227 = i226 & 25;
                    i14 = ((((i226 ^ 25) | i227) << 1) - (~(-((i226 | 25) & (~i227))))) - 1;
                    aplVar = y12;
                    f53746g = i14 % 128;
                    int i1310 = i14 % 2;
                    obj2 = aplVar;
                } else {
                    apl onFocusChangeListener6 = aplVar2.setOnFocusChangeListener(asgVar4);
                    int i228 = f53746g;
                    int i229 = i228 & 103;
                    int i230 = -(-((i228 ^ 103) | i229));
                    int i231 = (i229 ^ i230) + ((i230 & i229) << 1);
                    f53745f = i231 % 128;
                    int i232 = i231 % 2;
                    obj2 = onFocusChangeListener6;
                }
            }
        } else {
            if (i19 != 3) {
                asg asgVar7 = (asg) objArr[0];
                int i233 = f53745f;
                int i234 = i233 & 1;
                int i235 = i233 | 1;
                int i236 = (i234 & i235) + (i235 | i234);
                f53746g = i236 % 128;
                int i237 = i236 % 2;
                if (!(!asgVar7.setIncludeFontPadding())) {
                    int i238 = f53745f;
                    int i239 = (i238 ^ 59) + ((i238 & 59) << 1);
                    f53746g = i239 % 128;
                    int i240 = i239 % 2;
                    int i241 = (i238 ^ 125) + ((i238 & 125) << 1);
                    f53746g = i241 % 128;
                    if (i241 % 2 != 0) {
                        return asgVar7;
                    }
                    throw null;
                }
                apk apkVar7 = asgVar7.setX;
                if (!apkVar7.setOnDragListener()) {
                    apk apkVar8 = asgVar7.setOnFocusChangeListener;
                    apk apkVar9 = asgVar7.setY[0];
                    asg asgVar8 = new asg(asgVar7.setDividerPadding, apkVar7, apkVar8.setOnFocusChangeListener(apkVar9), new apk[]{apkVar9});
                    int i242 = f53746g;
                    int i243 = ((((i242 ^ 81) | (i242 & 81)) << 1) - (~(-(((~i242) & 81) | (i242 & (-82)))))) - 1;
                    f53745f = i243 % 128;
                    int i244 = i243 % 2;
                    return asgVar8;
                }
                int i245 = f53745f + 59;
                int i246 = i245 % 128;
                f53746g = i246;
                if (i245 % 2 == 0) {
                    throw null;
                }
                int i247 = (i246 ^ 69) + ((i246 & 69) << 1);
                f53745f = i247 % 128;
                int i248 = i247 % 2;
                return asgVar7;
            }
            asg asgVar9 = (asg) objArr[0];
            int i249 = f53746g;
            int i250 = i249 ^ 93;
            int i251 = ((i249 & 93) | i250) << 1;
            int i252 = -i250;
            int i253 = (i251 ^ i252) + ((i251 & i252) << 1);
            f53745f = i253 % 128;
            if (i253 % 2 != 0) {
                asgVar9.setIncludeFontPadding();
                throw null;
            }
            if (!(!asgVar9.setIncludeFontPadding())) {
                int i254 = f53746g;
                int i255 = i254 & 97;
                int i256 = (i255 - (~((i254 ^ 97) | i255))) - 1;
                f53745f = i256 % 128;
                if (i256 % 2 != 0) {
                    throw null;
                }
                int i257 = i254 | 31;
                int i258 = (i257 << 1) - ((~(i254 & 31)) & i257);
                f53745f = i258 % 128;
                if (i258 % 2 == 0) {
                    return asgVar9;
                }
                throw null;
            }
            aph x10 = asgVar9.setX();
            apk compoundDrawableTintBlendMode12 = asgVar9.setX;
            if (compoundDrawableTintBlendMode12.setOnDragListener()) {
                int i259 = f53745f;
                int i260 = (((i259 ^ 39) | (i259 & 39)) << 1) - (((~i259) & 39) | (i259 & (-40)));
                f53746g = i260 % 128;
                int i261 = i260 % 2;
                apl y13 = x10.setY();
                if (i261 == 0) {
                    int i262 = 65 / 0;
                }
                int i263 = f53745f;
                int i264 = (i263 & 33) + (i263 | 33);
                f53746g = i264 % 128;
                if (i264 % 2 != 0) {
                    return y13;
                }
                throw null;
            }
            apk apkVar10 = asgVar9.setOnFocusChangeListener;
            apk apkVar11 = asgVar9.setY[0];
            boolean navBarTitleString4 = apkVar11.getNavBarTitleString();
            if (navBarTitleString4) {
                int i265 = f53745f;
                int i266 = i265 ^ 33;
                int i267 = -(-((i265 & 33) << 1));
                int i268 = (i266 & i267) + (i267 | i266);
                f53746g = i268 % 128;
                if (i268 % 2 == 0) {
                    int i269 = 1 / 0;
                }
                compoundDrawableTintBlendMode4 = apkVar10;
            } else {
                compoundDrawableTintBlendMode4 = apkVar10.setCompoundDrawableTintBlendMode(apkVar11);
                int i270 = f53745f;
                int i271 = i270 & 67;
                int i272 = -(-((i270 ^ 67) | i271));
                int i273 = ((i271 | i272) << 1) - (i272 ^ i271);
                f53746g = i273 % 128;
                int i274 = i273 % 2;
            }
            if (navBarTitleString4) {
                int i275 = f53746g;
                int i276 = (i275 & 57) + (i275 | 57);
                f53745f = i276 % 128;
                int i277 = i276 % 2;
                int i278 = i275 | 75;
                int i279 = ((i278 << 1) - (~(-((~(i275 & 75)) & i278)))) - 1;
                f53745f = i279 % 128;
                int i280 = i279 % 2;
                x4 = apkVar11;
            } else {
                x4 = apkVar11.setX();
                int i281 = f53746g;
                int i282 = i281 ^ 43;
                int i283 = -(-((i281 & 43) << 1));
                int i284 = (i282 ^ i283) + ((i283 & i282) << 1);
                f53745f = i284 % 128;
                int i285 = i284 % 2;
            }
            apk navBarTitleString5 = x10.getNavBarTitleString();
            if (navBarTitleString4) {
                int i286 = f53746g;
                int i287 = ((i286 & 115) - (~(i286 | 115))) - 1;
                f53745f = i287 % 128;
                if (i287 % 2 != 0) {
                    throw null;
                }
                int i288 = i286 + 45;
                f53745f = i288 % 128;
                int i289 = i288 % 2;
            } else {
                navBarTitleString5 = navBarTitleString5.setCompoundDrawableTintBlendMode(x4);
                int i290 = f53746g;
                int i291 = i290 ^ 33;
                int i292 = (i290 & 33) << 1;
                int i293 = (i291 ^ i292) + ((i292 & i291) << 1);
                f53745f = i293 % 128;
                int i294 = i293 % 2;
            }
            apk apkVarB = e.b(apkVar10, compoundDrawableTintBlendMode4, navBarTitleString5);
            if (!apkVarB.setOnDragListener()) {
                apk x11 = apkVarB.setX();
                if (!navBarTitleString4) {
                    compoundDrawableTintBlendMode5 = apkVarB.setCompoundDrawableTintBlendMode(x4);
                    int i295 = f53746g;
                    int i296 = (i295 & 47) + (i295 | 47);
                    f53745f = i296 % 128;
                    int i297 = i296 % 2;
                } else {
                    int i298 = f53745f + 121;
                    f53746g = i298 % 128;
                    if (i298 % 2 == 0) {
                        int i299 = 86 / 0;
                    }
                    compoundDrawableTintBlendMode5 = apkVarB;
                }
                if (!navBarTitleString4) {
                    compoundDrawableTintBlendMode12 = compoundDrawableTintBlendMode12.setCompoundDrawableTintBlendMode(apkVar11);
                    int i300 = f53746g;
                    i16 = (-2) - (((i300 ^ 20) + ((i300 & 20) << 1)) ^ (-1));
                    f53745f = i16 % 128;
                } else {
                    int i301 = f53745f;
                    int i302 = i301 & 57;
                    int i303 = ((~i302) & (i301 | 57)) + (i302 << 1);
                    f53746g = i303 % 128;
                    int i304 = i303 % 2;
                    i16 = i301 + 113;
                    f53746g = i16 % 128;
                }
                int i305 = i16 % 2;
                asg asgVar10 = new asg(x10, x11, compoundDrawableTintBlendMode12.setY(apkVarB, compoundDrawableTintBlendMode4).setOnFocusChangeListener(x11).setOnFocusChangeListener(compoundDrawableTintBlendMode5), new apk[]{compoundDrawableTintBlendMode5});
                int i306 = f53746g;
                int i307 = ((i306 | 107) << 1) - (i306 ^ 107);
                f53745f = i307 % 128;
                if (i307 % 2 == 0) {
                    return asgVar10;
                }
                throw null;
            }
            asgVar2 = new asg(x10, apkVarB, x10.setOnLongClickListener().setOnLongClickListener());
            int i308 = f53745f;
            int i309 = (((i308 | 60) << 1) - (i308 ^ 60)) - 1;
            f53746g = i309 % 128;
            if (i309 % 2 == 0) {
                obj2 = asgVar2;
                int i310 = 41 / 0;
                obj2 = asgVar2;
            }
        }
        obj2 = asgVar;
        obj2 = onEditorActionListener;
        obj2 = y7;
        obj2 = asgVar2;
        return obj2;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1892812901, -1892812901, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, -1080849003, 1080849004, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1368503118, -1368503115, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, aplVar}, 1592319015, -1592319013, System.identityHashCode(this));
    }
}
