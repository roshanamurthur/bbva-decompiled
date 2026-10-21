package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;

/* JADX INFO: loaded from: classes10.dex */
public final class atp extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53839f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53840g = 1;

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        apl atpVar;
        apk compoundDrawableTintBlendMode;
        apk x4;
        apk compoundDrawableTintBlendMode2;
        int i13;
        Object obj;
        apk compoundDrawableTintBlendMode3;
        apk compoundDrawableTintBlendMode4;
        apk apkVar;
        apk compoundDrawableTintBlendMode5;
        apk y7;
        apk dividerPadding;
        int i14 = ~i11;
        int i15 = ~(i14 | i12);
        int i16 = ~i12;
        int i17 = i15 | (~(i16 | i10));
        int i18 = ~(i16 | i11);
        int i19 = ~i10;
        int i20 = (((~(i19 | i11)) | i18) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i14 | i19)) | (~(i19 | i16 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i17 | i18) * (-516)) + (i11 * 517) + (i10 * (-515));
        if (i20 == 1) {
            atpVar = (atp) objArr[0];
            int i21 = f53840g;
            int i22 = ((i21 ^ 89) | (i21 & 89)) << 1;
            int i23 = -(((~i21) & 89) | (i21 & (-90)));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            f53839f = i24 % 128;
            int i25 = i24 % 2;
            if (atpVar.setIncludeFontPadding()) {
                int i26 = f53840g;
                int i27 = (i26 & 61) + (i26 | 61);
                f53839f = i27 % 128;
                if (i27 % 2 != 0) {
                    throw null;
                }
            } else {
                aph x6 = atpVar.setX();
                apk compoundDrawableTintBlendMode6 = atpVar.setX;
                if (compoundDrawableTintBlendMode6.setOnDragListener()) {
                    int i28 = f53840g;
                    int i29 = ((i28 | 63) << 1) - (i28 ^ 63);
                    f53839f = i29 % 128;
                    int i30 = i29 % 2;
                    apl y10 = x6.setY();
                    int i31 = f53840g;
                    int i32 = (((i31 ^ 109) | (i31 & 109)) << 1) - (((~i31) & 109) | (i31 & (-110)));
                    f53839f = i32 % 128;
                    int i33 = i32 % 2;
                    return y10;
                }
                apk apkVar2 = atpVar.setOnFocusChangeListener;
                apk apkVar3 = atpVar.setY[0];
                boolean navBarTitleString = apkVar3.getNavBarTitleString();
                if (navBarTitleString) {
                    int i34 = f53840g;
                    int i35 = (-2) - ((i34 + 50) ^ (-1));
                    f53839f = i35 % 128;
                    int i36 = i35 % 2;
                    int i37 = i34 + 47;
                    f53839f = i37 % 128;
                    int i38 = i37 % 2;
                    compoundDrawableTintBlendMode = apkVar2;
                } else {
                    compoundDrawableTintBlendMode = apkVar2.setCompoundDrawableTintBlendMode(apkVar3);
                    int i39 = f53839f;
                    int i40 = (i39 & (-116)) | ((~i39) & 115);
                    int i41 = -(-((i39 & 115) << 1));
                    int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
                    f53840g = i42 % 128;
                    int i43 = i42 % 2;
                }
                boolean z10 = !navBarTitleString;
                if (!z10) {
                    int i44 = f53840g;
                    int i45 = i44 & 113;
                    int i46 = ((i44 ^ 113) | i45) << 1;
                    int i47 = -((i44 | 113) & (~i45));
                    int i48 = (i46 & i47) + (i47 | i46);
                    int i49 = i48 % 128;
                    f53839f = i49;
                    int i50 = i48 % 2;
                    int i51 = (i49 ^ 15) + ((i49 & 15) << 1);
                    f53840g = i51 % 128;
                    int i52 = i51 % 2;
                    x4 = apkVar3;
                } else {
                    x4 = apkVar3.setX();
                    int i53 = f53839f;
                    int i54 = i53 & 15;
                    int i55 = -(-((i53 ^ 15) | i54));
                    int i56 = (i54 & i55) + (i55 | i54);
                    f53840g = i56 % 128;
                    int i57 = i56 % 2;
                }
                apk apkVarB = e.b(apkVar2, compoundDrawableTintBlendMode, x4);
                if (!apkVarB.setOnDragListener()) {
                    apk x7 = apkVarB.setX();
                    if (!z10) {
                        int i58 = f53839f;
                        int i59 = i58 & 17;
                        int i60 = i59 + ((i58 ^ 17) | i59);
                        int i61 = i60 % 128;
                        f53840g = i61;
                        int i62 = i60 % 2;
                        int i63 = i61 & 83;
                        int i64 = ((i61 ^ 83) | i63) << 1;
                        int i65 = -((i61 | 83) & (~i63));
                        int i66 = (i64 & i65) + (i65 | i64);
                        f53839f = i66 % 128;
                        int i67 = i66 % 2;
                        compoundDrawableTintBlendMode2 = apkVarB;
                    } else {
                        compoundDrawableTintBlendMode2 = apkVarB.setCompoundDrawableTintBlendMode(x4);
                        int i68 = f53839f;
                        int i69 = i68 ^ 51;
                        int i70 = ((i68 & 51) | i69) << 1;
                        int i71 = -i69;
                        int i72 = (i70 ^ i71) + ((i70 & i71) << 1);
                        f53840g = i72 % 128;
                        int i73 = i72 % 2;
                    }
                    if (navBarTitleString) {
                        int i74 = f53840g;
                        int i75 = i74 ^ 1;
                        int i76 = ((i74 & 1) | i75) << 1;
                        int i77 = -i75;
                        int i78 = (i76 & i77) + (i77 | i76);
                        f53839f = i78 % 128;
                        int i79 = i78 % 2;
                        i13 = ((i74 | 29) << 1) - (i74 ^ 29);
                        f53839f = i13 % 128;
                    } else {
                        compoundDrawableTintBlendMode6 = compoundDrawableTintBlendMode6.setCompoundDrawableTintBlendMode(apkVar3);
                        int i80 = f53839f;
                        int i81 = i80 & 123;
                        i13 = i81 + ((i80 ^ 123) | i81);
                        f53840g = i13 % 128;
                    }
                    int i82 = i13 % 2;
                    atp atpVar2 = new atp(x6, x7, compoundDrawableTintBlendMode6.setY(apkVarB, compoundDrawableTintBlendMode).setOnFocusChangeListener(x7).setOnFocusChangeListener(compoundDrawableTintBlendMode2), new apk[]{compoundDrawableTintBlendMode2});
                    int i83 = f53840g + 45;
                    f53839f = i83 % 128;
                    obj = atpVar2;
                    if (i83 % 2 != 0) {
                        int i84 = 1 / 0;
                        obj = atpVar2;
                    }
                    return obj;
                }
                atpVar = new atp(x6, apkVarB, x6.setOnLongClickListener().setOnLongClickListener());
                int i85 = f53840g;
                int i86 = (-2) - (((i85 ^ 50) + ((i85 & 50) << 1)) ^ (-1));
                f53839f = i86 % 128;
                if (i86 % 2 != 0) {
                    throw null;
                }
            }
            return atpVar;
        }
        if (i20 != 2) {
            if (i20 != 3) {
                atp atpVar3 = (atp) objArr[0];
                int i87 = f53840g + 41;
                f53839f = i87 % 128;
                int i88 = i87 % 2;
                if (!(!atpVar3.setIncludeFontPadding())) {
                    int i89 = f53839f;
                    int i90 = i89 & 73;
                    int i91 = ((i89 | 73) & (~i90)) + (i90 << 1);
                    int i92 = i91 % 128;
                    f53840g = i92;
                    int i93 = i91 % 2;
                    int i94 = i92 ^ 119;
                    int i95 = ((i92 & 119) | i94) << 1;
                    int i96 = -i94;
                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                    f53839f = i97 % 128;
                    if (i97 % 2 == 0) {
                        return atpVar3;
                    }
                    throw null;
                }
                apk apkVar4 = atpVar3.setX;
                if (apkVar4.setOnDragListener()) {
                    int i98 = f53840g;
                    int i99 = ((i98 | 9) << 1) - ((i98 & (-10)) | (9 & (~i98)));
                    f53839f = i99 % 128;
                    int i100 = i99 % 2;
                    int i101 = ((i98 & 47) - (~(i98 | 47))) - 1;
                    f53839f = i101 % 128;
                    int i102 = i101 % 2;
                    return atpVar3;
                }
                apk apkVar5 = atpVar3.setOnFocusChangeListener;
                apk apkVar6 = atpVar3.setY[0];
                atp atpVar4 = new atp(atpVar3.setDividerPadding, apkVar4, apkVar5.setOnFocusChangeListener(apkVar6), new apk[]{apkVar6});
                int i103 = f53839f;
                int i104 = i103 & 49;
                int i105 = ((i103 | 49) & (~i104)) + (i104 << 1);
                f53840g = i105 % 128;
                int i106 = i105 % 2;
                return atpVar4;
            }
            atp atpVar5 = (atp) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i107 = f53840g;
            int i108 = (((i107 ^ 103) | (i107 & 103)) << 1) - (((~i107) & 103) | (i107 & (-104)));
            f53839f = i108 % 128;
            int i109 = i108 % 2;
            if (!(!atpVar5.setIncludeFontPadding())) {
                int i110 = f53840g;
                int i111 = i110 & 37;
                int i112 = (i110 ^ 37) | i111;
                int i113 = (i111 & i112) + (i112 | i111);
                int i114 = i113 % 128;
                f53839f = i114;
                int i115 = i113 % 2;
                int i116 = i114 + 19;
                f53840g = i116 % 128;
                if (i116 % 2 != 0) {
                    return aplVar;
                }
                throw null;
            }
            if (aplVar.setIncludeFontPadding()) {
                int i117 = f53839f;
                int i118 = i117 & 55;
                int i119 = (i117 ^ 55) | i118;
                int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                f53840g = i120 % 128;
                if (i120 % 2 != 0) {
                    return atpVar5;
                }
                throw null;
            }
            aph x10 = atpVar5.setX();
            apk apkVar7 = atpVar5.setX;
            apk onLongClickListener = aplVar.setOnLongClickListener();
            if (!apkVar7.setOnDragListener()) {
                apk apkVar8 = atpVar5.setOnFocusChangeListener;
                apk apkVar9 = atpVar5.setY[0];
                apk onDragListener = aplVar.setOnDragListener();
                apk y11 = aplVar.setY(0);
                boolean navBarTitleString2 = apkVar9.getNavBarTitleString();
                if (navBarTitleString2) {
                    compoundDrawableTintBlendMode3 = onLongClickListener;
                    compoundDrawableTintBlendMode4 = onDragListener;
                } else {
                    int i121 = f53840g;
                    int i122 = i121 | 59;
                    int i123 = ((i122 << 1) - (~(-((~(i121 & 59)) & i122)))) - 1;
                    f53839f = i123 % 128;
                    int i124 = i123 % 2;
                    compoundDrawableTintBlendMode3 = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar9);
                    compoundDrawableTintBlendMode4 = onDragListener.setCompoundDrawableTintBlendMode(apkVar9);
                    int i125 = f53839f;
                    int i126 = i125 & 23;
                    int i127 = i126 + ((i125 ^ 23) | i126);
                    f53840g = i127 % 128;
                    int i128 = i127 % 2;
                }
                boolean navBarTitleString3 = y11.getNavBarTitleString();
                if (!navBarTitleString3) {
                    int i129 = f53840g;
                    int i130 = i129 & 61;
                    int i131 = ((i129 ^ 61) | i130) << 1;
                    int i132 = -((~i130) & (i129 | 61));
                    int i133 = ((i131 | i132) << 1) - (i131 ^ i132);
                    f53839f = i133 % 128;
                    int i134 = i133 % 2;
                    apk compoundDrawableTintBlendMode7 = apkVar7.setCompoundDrawableTintBlendMode(y11);
                    apk compoundDrawableTintBlendMode8 = apkVar8.setCompoundDrawableTintBlendMode(y11);
                    if (i134 != 0) {
                        int i135 = 15 / 0;
                    }
                    apkVar7 = compoundDrawableTintBlendMode7;
                    apkVar = compoundDrawableTintBlendMode8;
                } else {
                    apkVar = apkVar8;
                }
                apk onFocusChangeListener = apkVar.setOnFocusChangeListener(compoundDrawableTintBlendMode4);
                apk onFocusChangeListener2 = apkVar7.setOnFocusChangeListener(compoundDrawableTintBlendMode3);
                if (!onFocusChangeListener2.setOnDragListener()) {
                    if (onLongClickListener.setOnDragListener()) {
                        int i136 = f53840g + 67;
                        f53839f = i136 % 128;
                        int i137 = i136 % 2;
                        apl alwaysDrawnWithCacheEnabled = atpVar5.setAlwaysDrawnWithCacheEnabled();
                        apk navBarTitleString4 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                        apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                        apk dividerPadding2 = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString4);
                        dividerPadding = dividerPadding2.setX().setOnFocusChangeListener(dividerPadding2).setOnFocusChangeListener(navBarTitleString4).setDividerPadding();
                        if (dividerPadding.setOnDragListener()) {
                            atp atpVar6 = new atp(x10, dividerPadding, x10.setOnLongClickListener().setOnLongClickListener());
                            int i138 = f53839f + 27;
                            f53840g = i138 % 128;
                            if (i138 % 2 != 0) {
                                return atpVar6;
                            }
                            throw null;
                        }
                        y7 = dividerPadding2.setCompoundDrawableTintBlendMode(navBarTitleString4.setOnFocusChangeListener(dividerPadding)).setOnFocusChangeListener(dividerPadding).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(dividerPadding).setOnFocusChangeListener(dividerPadding);
                        compoundDrawableTintBlendMode5 = x10.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                        int i139 = f53840g + 17;
                        f53839f = i139 % 128;
                        int i140 = i139 % 2;
                    } else {
                        apk x11 = onFocusChangeListener2.setX();
                        apk compoundDrawableTintBlendMode9 = onFocusChangeListener.setCompoundDrawableTintBlendMode(apkVar7);
                        apk compoundDrawableTintBlendMode10 = onFocusChangeListener.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode3);
                        apk compoundDrawableTintBlendMode11 = compoundDrawableTintBlendMode9.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode10);
                        if (compoundDrawableTintBlendMode11.setOnDragListener()) {
                            atp atpVar7 = new atp(x10, compoundDrawableTintBlendMode11, x10.setOnLongClickListener().setOnLongClickListener());
                            int i141 = f53840g;
                            int i142 = (i141 & 103) + (i141 | 103);
                            f53839f = i142 % 128;
                            if (i142 % 2 == 0) {
                                return atpVar7;
                            }
                            throw null;
                        }
                        apk compoundDrawableTintBlendMode12 = onFocusChangeListener.setCompoundDrawableTintBlendMode(x11);
                        if (navBarTitleString3) {
                            compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode12;
                        } else {
                            int i143 = f53840g;
                            int i144 = i143 & 75;
                            int i145 = (i144 - (~((i143 ^ 75) | i144))) - 1;
                            f53839f = i145 % 128;
                            int i146 = i145 % 2;
                            compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode12.setCompoundDrawableTintBlendMode(y11);
                            if (i146 != 0) {
                                int i147 = 3 / 0;
                            }
                        }
                        y7 = compoundDrawableTintBlendMode10.setOnFocusChangeListener(x11).setY(compoundDrawableTintBlendMode5, apkVar8.setOnFocusChangeListener(apkVar9));
                        if (!navBarTitleString2) {
                            int i148 = f53839f;
                            int i149 = (i148 ^ 82) + ((i148 & 82) << 1);
                            int i150 = (i149 ^ (-1)) + (i149 << 1);
                            f53840g = i150 % 128;
                            int i151 = i150 % 2;
                            compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode5.setCompoundDrawableTintBlendMode(apkVar9);
                            int i152 = f53839f + 23;
                            f53840g = i152 % 128;
                            int i153 = i152 % 2;
                        }
                        dividerPadding = compoundDrawableTintBlendMode11;
                    }
                    atp atpVar8 = new atp(x10, dividerPadding, y7, new apk[]{compoundDrawableTintBlendMode5});
                    int i154 = f53839f;
                    int i155 = (-2) - ((((i154 | 24) << 1) - (i154 ^ 24)) ^ (-1));
                    f53840g = i155 % 128;
                    obj = atpVar8;
                    if (i155 % 2 == 0) {
                        int i156 = 26 / 0;
                        obj = atpVar8;
                    }
                } else {
                    int i157 = f53840g;
                    int i158 = (((i157 | 40) << 1) - (i157 ^ 40)) - 1;
                    f53839f = i158 % 128;
                    int i159 = i158 % 2;
                    if (!onFocusChangeListener.setOnDragListener()) {
                        apl y12 = x10.setY();
                        int i160 = f53840g;
                        int i161 = (((i160 | 72) << 1) - (i160 ^ 72)) - 1;
                        f53839f = i161 % 128;
                        if (i161 % 2 == 0) {
                            return y12;
                        }
                        int i162 = 57 / 0;
                        return y12;
                    }
                    int i163 = f53839f;
                    int i164 = i163 ^ 9;
                    int i165 = ((i163 & 9) | i164) << 1;
                    int i166 = -i164;
                    int i167 = (i165 & i166) + (i165 | i166);
                    f53840g = i167 % 128;
                    int i168 = i167 % 2;
                    atpVar = atpVar5.setOnEditorActionListener();
                    System.identityHashCode(atpVar5);
                    System.identityHashCode(atpVar5);
                }
            } else {
                int i169 = f53839f;
                int i170 = i169 & 35;
                int i171 = (i169 | 35) & (~i170);
                int i172 = -(-(i170 << 1));
                int i173 = (i171 ^ i172) + ((i171 & i172) << 1);
                f53840g = i173 % 128;
                int i174 = i173 % 2;
                if (onLongClickListener.setOnDragListener()) {
                    int i175 = f53839f;
                    int i176 = i175 & 83;
                    int i177 = (((i175 | 83) & (~i176)) - (~(i176 << 1))) - 1;
                    f53840g = i177 % 128;
                    int i178 = i177 % 2;
                    apl y13 = x10.setY();
                    int i179 = f53839f;
                    int i180 = i179 & 95;
                    int i181 = (i180 - (~(-(-((i179 ^ 95) | i180))))) - 1;
                    f53840g = i181 % 128;
                    int i182 = i181 % 2;
                    return y13;
                }
                atpVar = aplVar.setOnFocusChangeListener(atpVar5);
                int iIdentityHashCode = System.identityHashCode(atpVar5);
                int i183 = ~iIdentityHashCode;
                int i184 = 254898360 & i183;
                int i185 = (iIdentityHashCode & (-254898361)) | i184;
                int i186 = 254898360 & iIdentityHashCode;
                int i187 = ~((i185 & i186) | (i185 ^ i186));
                int i188 = (i183 | iIdentityHashCode) & i183;
                int i189 = (i188 & 406470213) | ((~i188) & (-406470214));
                int i190 = i188 & (-406470214);
                int i191 = ~((i190 & i189) | (i189 ^ i190));
                int i192 = ((~i191) & i187) | ((~i187) & i191);
                int i193 = i187 & i191;
                int i194 = (i193 & i192) | (i192 ^ i193);
                int i195 = i183 & (-254898361);
                int i196 = ~(((~i195) & (i183 | (-254898361))) | i195);
                int i197 = (((i194 & i196) | (i194 ^ i196)) * (-516)) + 240296245;
                int i198 = (523992829 & i183) | ((-523992830) & iIdentityHashCode);
                int i199 = iIdentityHashCode & 523992829;
                int i200 = (i199 & i198) | (i198 ^ i199);
                int i201 = ~i200;
                int i202 = (i200 | i201) & i201;
                int i203 = ~i183;
                int i204 = (406470213 & i203) | ((-406470214) & i183);
                int i205 = i183 & 406470213;
                int i206 = (i205 & i204) | (i204 ^ i205);
                int i207 = (254898360 & i206) | ((~i206) & (-254898361));
                int i208 = i206 & (-254898361);
                int i209 = (i208 & i207) | (i207 ^ i208);
                int i210 = ~i209;
                int i211 = (i209 | i210) & i210;
                int i212 = i202 & i211;
                int i213 = (((i202 | i211) & (~i212)) | i212) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                int i214 = (((~i213) & i197) | ((~i197) & i213)) + ((i213 & i197) << 1);
                int i215 = ((-254898361) & i203) | i184;
                int i216 = -(-(((~((i215 & i195) | (i215 ^ i195))) | 117522616) * LibMCryptConstants.IND_HEX_SEGMENTO2));
                int i217 = (i214 & i216) + (i216 | i214);
                int iIdentityHashCode2 = System.identityHashCode(atpVar5);
                int i218 = ~iIdentityHashCode2;
                int i219 = i218 & (-1690631380);
                int i220 = ((-1690631380) | i218) & (~i219);
                int i221 = ~((i220 & i219) | (i220 ^ i219));
                int i222 = 1615128576 & i221;
                int i223 = -(~(-(-((((i221 | 1615128576) & (~i222)) | i222) * (-1188)))));
                int i224 = (-2) - ((((227396956 | i223) << 1) - (i223 ^ 227396956)) ^ (-1));
                int i225 = 1690631379 | iIdentityHashCode2;
                int i226 = ~i225;
                int i227 = (i225 | i226) & i226;
                int i228 = ((~i227) & 1615128576) | ((-1615128577) & i227);
                int i229 = 1615128576 & i227;
                int i230 = (i229 & i228) | (i228 ^ i229);
                int i231 = (iIdentityHashCode2 | i218) & i218;
                int i232 = i231 & 2070341664;
                int i233 = ~(((i231 | 2070341664) & (~i232)) | i232);
                int i234 = i230 ^ i233;
                int i235 = i233 & i230;
                int i236 = -(-(((i235 & i234) | (i234 ^ i235)) * 594));
                int i237 = i224 & i236;
                int i238 = -(-(i236 | i224));
                int i239 = ((i237 | i238) << 1) - (i238 ^ i237);
                int i240 = ~i218;
                int i241 = (1690631379 & i240) | i219;
                int i242 = 1690631379 & i218;
                int i243 = ~((i241 & i242) | (i241 ^ i242));
                int i244 = i243 ^ (-2145844468);
                int i245 = i243 & (-2145844468);
                int i246 = (i245 & i244) | (i244 ^ i245);
                int i247 = (i240 & 2070341664) | ((-2070341665) & i218) | (i218 & 2070341664);
                int i248 = ~i247;
                int i249 = (i247 | i248) & i248;
                int i250 = i246 & i249;
                int i251 = (i249 | i246) & (~i250);
                int i252 = -(-(((i251 & i250) | (i251 ^ i250)) * 594));
                int i253 = i239 & i252;
                if (i217 > i253 + ((i252 ^ i239) | i253)) {
                    throw null;
                }
            }
            return atpVar;
        }
        atp atpVar9 = (atp) objArr[0];
        int i254 = f53839f;
        int i255 = i254 & 95;
        int i256 = ((i254 | 95) & (~i255)) + (i255 << 1);
        f53840g = i256 % 128;
        int i257 = i256 % 2;
        apk apkVar10 = atpVar9.setX;
        apk apkVar11 = atpVar9.setOnFocusChangeListener;
        if (!atpVar9.setIncludeFontPadding()) {
            int i258 = f53839f;
            int i259 = i258 & 55;
            int i260 = i258 | 55;
            int i261 = (i259 ^ i260) + ((i260 & i259) << 1);
            f53840g = i261 % 128;
            if (i261 % 2 == 0) {
                apkVar10.setOnDragListener();
                throw null;
            }
            if (!apkVar10.setOnDragListener()) {
                apk compoundDrawableTintBlendMode13 = apkVar11.setOnFocusChangeListener(apkVar10).setCompoundDrawableTintBlendMode(apkVar10);
                apk apkVar12 = atpVar9.setY[0];
                if (!apkVar12.getNavBarTitleString()) {
                    int i262 = f53839f + 31;
                    f53840g = i262 % 128;
                    int i263 = i262 % 2;
                    compoundDrawableTintBlendMode13 = compoundDrawableTintBlendMode13.setDividerPadding(apkVar12);
                    int i264 = f53839f;
                    int i265 = ((i264 & (-84)) | ((~i264) & 83)) + ((i264 & 83) << 1);
                    f53840g = i265 % 128;
                    int i266 = i265 % 2;
                }
                int i267 = f53840g;
                int i268 = i267 & 119;
                int i269 = ((((i267 ^ 119) | i268) << 1) - (~(-((i267 | 119) & (~i268))))) - 1;
                f53839f = i269 % 128;
                int i270 = i269 % 2;
                return compoundDrawableTintBlendMode13;
            }
        }
        int i271 = f53840g;
        int i272 = (-2) - (((i271 & 58) + (i271 | 58)) ^ (-1));
        f53839f = i272 % 128;
        obj = apkVar11;
        if (i272 % 2 != 0) {
            throw null;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setDividerPadding(new Object[]{this}, 1630864789, -1630864789, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -402999482, 402999484, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setDividerPadding(new Object[]{this}, -2029707004, 2029707005, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setDividerPadding(new Object[]{this, aplVar}, -1636017927, 1636017930, System.identityHashCode(this));
    }
}
