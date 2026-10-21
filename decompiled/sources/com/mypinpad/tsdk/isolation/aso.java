package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;

/* JADX INFO: loaded from: classes10.dex */
public final class aso extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53765f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53766g = 1;

    /* JADX WARN: Code duplicated, block: B:107:0x04f0  */
    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        apl asoVar;
        apk compoundDrawableTintBlendMode;
        apk x4;
        apk compoundDrawableTintBlendMode2;
        apl y7;
        int i13;
        apk compoundDrawableTintBlendMode3;
        apk compoundDrawableTintBlendMode4;
        apk compoundDrawableTintBlendMode5;
        apk dividerPadding;
        apk onFocusChangeListener;
        apk onFocusChangeListener2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        apk apkVar;
        int i19 = ~i10;
        int i20 = ~i11;
        int i21 = i19 | i20;
        int i22 = ~i12;
        int i23 = (((~(i10 | i20 | i22)) | (~(i19 | i12))) * 765) + (((~i21) | (~(i19 | i22))) * 1530) + (((~(i11 | i19 | i12)) | (~(i21 | i22)) | (~(i20 | i10 | i12))) * 765) + (i11 * (-764)) + (i10 * (-1529));
        int i24 = 0;
        if (i23 == 1) {
            asoVar = (aso) objArr[0];
            int i25 = f53766g;
            int i26 = ((i25 | 79) << 1) - (i25 ^ 79);
            f53765f = i26 % 128;
            int i27 = i26 % 2;
            if (!(!asoVar.setIncludeFontPadding())) {
                int i28 = f53766g;
                int i29 = (i28 ^ 105) + ((i28 & 105) << 1);
                f53765f = i29 % 128;
                if (i29 % 2 != 0) {
                    throw null;
                }
                int i30 = i28 + 103;
                f53765f = i30 % 128;
                if (i30 % 2 != 0) {
                    throw null;
                }
            } else {
                aph x6 = asoVar.setX();
                apk compoundDrawableTintBlendMode6 = asoVar.setX;
                if (compoundDrawableTintBlendMode6.setOnDragListener()) {
                    int i31 = f53766g;
                    int i32 = i31 & 113;
                    int i33 = (i31 | 113) & (~i32);
                    int i34 = i32 << 1;
                    int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
                    f53765f = i35 % 128;
                    int i36 = i35 % 2;
                    y7 = x6.setY();
                    int i37 = f53766g;
                    int i38 = (i37 & (-70)) | ((~i37) & 69);
                    int i39 = (i37 & 69) << 1;
                    int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
                    f53765f = i40 % 128;
                    if (i40 % 2 != 0) {
                        throw null;
                    }
                    return y7;
                }
                apk apkVar2 = asoVar.setOnFocusChangeListener;
                apk apkVar3 = asoVar.setY[0];
                boolean navBarTitleString = apkVar3.getNavBarTitleString();
                boolean z10 = !navBarTitleString;
                if (z10) {
                    compoundDrawableTintBlendMode = apkVar2.setCompoundDrawableTintBlendMode(apkVar3);
                    int i41 = f53765f;
                    int i42 = (i41 & 103) + (i41 | 103);
                    f53766g = i42 % 128;
                    int i43 = i42 % 2;
                } else {
                    int i44 = f53766g;
                    int i45 = (i44 & 67) + (i44 | 67);
                    f53765f = i45 % 128;
                    if (i45 % 2 != 0) {
                        throw null;
                    }
                    compoundDrawableTintBlendMode = apkVar2;
                }
                if (!z10) {
                    int i46 = f53765f;
                    int i47 = ((i46 ^ 68) + ((i46 & 68) << 1)) - 1;
                    f53766g = i47 % 128;
                    int i48 = i47 % 2;
                    System.identityHashCode(asoVar);
                    System.identityHashCode(asoVar);
                    x4 = apkVar3;
                } else {
                    x4 = apkVar3.setX();
                    int i49 = f53766g;
                    int i50 = i49 & 21;
                    int i51 = (i49 ^ 21) | i50;
                    int i52 = ((i50 | i51) << 1) - (i51 ^ i50);
                    f53765f = i52 % 128;
                    int i53 = i52 % 2;
                }
                apk apkVarB = e.b(apkVar2, compoundDrawableTintBlendMode, x4);
                if (!apkVarB.setOnDragListener()) {
                    apk x7 = apkVarB.setX();
                    if (navBarTitleString) {
                        int i54 = f53766g;
                        int i55 = i54 ^ 95;
                        int i56 = ((i54 & 95) | i55) << 1;
                        int i57 = -i55;
                        int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                        int i59 = i58 % 128;
                        f53765f = i59;
                        int i60 = i58 % 2;
                        int i61 = (i59 ^ 63) + ((i59 & 63) << 1);
                        f53766g = i61 % 128;
                        int i62 = i61 % 2;
                        compoundDrawableTintBlendMode2 = apkVarB;
                    } else {
                        compoundDrawableTintBlendMode2 = apkVarB.setCompoundDrawableTintBlendMode(x4);
                        int i63 = f53766g;
                        int i64 = (i63 ^ 118) + ((i63 & 118) << 1);
                        int i65 = (i64 ^ (-1)) + (i64 << 1);
                        f53765f = i65 % 128;
                        int i66 = i65 % 2;
                    }
                    if (navBarTitleString) {
                        int i67 = f53765f;
                        int i68 = (i67 ^ 109) + ((i67 & 109) << 1);
                        f53766g = i68 % 128;
                        int i69 = i68 % 2;
                        System.identityHashCode(asoVar);
                        System.identityHashCode(asoVar);
                    } else {
                        compoundDrawableTintBlendMode6 = compoundDrawableTintBlendMode6.setCompoundDrawableTintBlendMode(apkVar3);
                        int i70 = f53766g;
                        int i71 = i70 ^ 93;
                        int i72 = ((i70 & 93) | i71) << 1;
                        int i73 = -i71;
                        int i74 = (i72 & i73) + (i72 | i73);
                        f53765f = i74 % 128;
                        int i75 = i74 % 2;
                    }
                    aso asoVar2 = new aso(x6, x7, compoundDrawableTintBlendMode6.setY(apkVarB, compoundDrawableTintBlendMode).setOnFocusChangeListener(x7).setOnFocusChangeListener(compoundDrawableTintBlendMode2), new apk[]{compoundDrawableTintBlendMode2});
                    int i76 = f53766g;
                    int i77 = ((i76 | 117) << 1) - (i76 ^ 117);
                    f53765f = i77 % 128;
                    if (i77 % 2 == 0) {
                        return asoVar2;
                    }
                    throw null;
                }
                asoVar = new aso(x6, apkVarB, x6.setOnLongClickListener().setOnLongClickListener());
                int i78 = f53765f;
                int i79 = i78 & 111;
                int i80 = (((i78 ^ 111) | i79) << 1) - ((i78 | 111) & (~i79));
                f53766g = i80 % 128;
                if (i80 % 2 == 0) {
                    throw null;
                }
            }
            return asoVar;
        }
        if (i23 == 2) {
            y7 = (aso) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i81 = f53765f;
            int i82 = i81 & 111;
            int i83 = -(-((i81 ^ 111) | i82));
            int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
            f53766g = i84 % 128;
            int i85 = i84 % 2;
            if (y7.setIncludeFontPadding()) {
                int i86 = f53766g;
                int i87 = (((i86 | 8) << 1) - (i86 ^ 8)) - 1;
                int i88 = i87 % 128;
                f53765f = i88;
                int i89 = i87 % 2;
                int i90 = (i88 & 55) + (i88 | 55);
                f53766g = i90 % 128;
                if (i90 % 2 != 0) {
                    return aplVar;
                }
                throw null;
            }
            if (aplVar.setIncludeFontPadding()) {
                int i91 = f53766g;
                int i92 = i91 ^ 101;
                int i93 = -(-((i91 & 101) << 1));
                int i94 = ((i92 | i93) << 1) - (i93 ^ i92);
                f53765f = i94 % 128;
                if (i94 % 2 != 0) {
                    i18 = 62;
                    int i95 = i18 / i24;
                }
            } else {
                aph x10 = y7.setX();
                apk compoundDrawableTintBlendMode7 = y7.setX;
                apk onLongClickListener = aplVar.setOnLongClickListener();
                if (!compoundDrawableTintBlendMode7.setOnDragListener()) {
                    apk apkVar4 = y7.setOnFocusChangeListener;
                    apk apkVar5 = y7.setY[0];
                    apk onDragListener = aplVar.setOnDragListener();
                    apk y10 = aplVar.setY(0);
                    boolean navBarTitleString2 = apkVar5.getNavBarTitleString();
                    if (!navBarTitleString2) {
                        int i96 = f53765f;
                        int i97 = ((i96 ^ 25) | (i96 & 25)) << 1;
                        int i98 = -(((~i96) & 25) | (i96 & (-26)));
                        int i99 = (i97 & i98) + (i98 | i97);
                        f53766g = i99 % 128;
                        if (i99 % 2 == 0) {
                            onLongClickListener.setCompoundDrawableTintBlendMode(apkVar5);
                            onDragListener.setCompoundDrawableTintBlendMode(apkVar5);
                            throw null;
                        }
                        compoundDrawableTintBlendMode3 = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar5);
                        compoundDrawableTintBlendMode4 = onDragListener.setCompoundDrawableTintBlendMode(apkVar5);
                        System.identityHashCode(y7);
                        System.identityHashCode(y7);
                    } else {
                        compoundDrawableTintBlendMode3 = onLongClickListener;
                        compoundDrawableTintBlendMode4 = onDragListener;
                    }
                    boolean navBarTitleString3 = y10.getNavBarTitleString();
                    if (navBarTitleString3) {
                        compoundDrawableTintBlendMode5 = apkVar4;
                    } else {
                        int i100 = f53766g;
                        int i101 = ((i100 | 123) << 1) - (i100 ^ 123);
                        f53765f = i101 % 128;
                        if (i101 % 2 != 0) {
                            compoundDrawableTintBlendMode7.setCompoundDrawableTintBlendMode(y10);
                            apkVar4.setCompoundDrawableTintBlendMode(y10);
                            throw null;
                        }
                        compoundDrawableTintBlendMode7 = compoundDrawableTintBlendMode7.setCompoundDrawableTintBlendMode(y10);
                        compoundDrawableTintBlendMode5 = apkVar4.setCompoundDrawableTintBlendMode(y10);
                        int i102 = f53766g;
                        int i103 = i102 ^ 11;
                        int i104 = -(-((i102 & 11) << 1));
                        int i105 = (i103 ^ i104) + ((i103 & i104) << 1);
                        f53765f = i105 % 128;
                        int i106 = i105 % 2;
                    }
                    apk onFocusChangeListener3 = compoundDrawableTintBlendMode5.setOnFocusChangeListener(compoundDrawableTintBlendMode4);
                    apk onFocusChangeListener4 = compoundDrawableTintBlendMode7.setOnFocusChangeListener(compoundDrawableTintBlendMode3);
                    if (onFocusChangeListener4.setOnDragListener()) {
                        int i107 = f53765f;
                        int i108 = i107 & 5;
                        int i109 = ((i107 ^ 5) | i108) << 1;
                        int i110 = -((i107 | 5) & (~i108));
                        int i111 = (i109 & i110) + (i110 | i109);
                        f53766g = i111 % 128;
                        int i112 = i111 % 2;
                        if (!onFocusChangeListener3.setOnDragListener()) {
                            asoVar = x10.setY();
                            System.identityHashCode(y7);
                            System.identityHashCode(y7);
                            return asoVar;
                        }
                        int i113 = f53766g;
                        int i114 = ((i113 | 115) << 1) - (i113 ^ 115);
                        f53765f = i114 % 128;
                        int i115 = i114 % 2;
                        y7 = y7.setOnEditorActionListener();
                        int i116 = f53766g;
                        int i117 = i116 & 9;
                        int i118 = -(-((i116 ^ 9) | i117));
                        i13 = (i117 ^ i118) + ((i118 & i117) << 1);
                        f53765f = i13 % 128;
                        int i119 = i13 % 2;
                    } else if (!(!onLongClickListener.setOnDragListener())) {
                        int i120 = f53765f;
                        int i121 = ((i120 ^ 75) | (i120 & 75)) << 1;
                        int i122 = -(((~i120) & 75) | (i120 & (-76)));
                        int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                        f53766g = i123 % 128;
                        int i124 = i123 % 2;
                        apl alwaysDrawnWithCacheEnabled = y7.setAlwaysDrawnWithCacheEnabled();
                        apk navBarTitleString4 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                        apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                        apk dividerPadding2 = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString4);
                        dividerPadding = dividerPadding2.setX().setOnFocusChangeListener(dividerPadding2).setOnFocusChangeListener(navBarTitleString4).setDividerPadding();
                        if (!dividerPadding.setOnDragListener()) {
                            onFocusChangeListener2 = dividerPadding2.setCompoundDrawableTintBlendMode(navBarTitleString4.setOnFocusChangeListener(dividerPadding)).setOnFocusChangeListener(dividerPadding).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(dividerPadding).setOnFocusChangeListener(dividerPadding);
                            onFocusChangeListener = x10.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                            System.identityHashCode(y7);
                            System.identityHashCode(y7);
                            aso asoVar3 = new aso(x10, dividerPadding, onFocusChangeListener2, new apk[]{onFocusChangeListener});
                            int iIdentityHashCode = System.identityHashCode(y7);
                            int i125 = ~iIdentityHashCode;
                            int i126 = i125 ^ 1495699389;
                            int i127 = i125 & 1495699389;
                            int i128 = ~((i126 & i127) | (i126 ^ i127));
                            int i129 = 580895112 ^ i128;
                            int i130 = i128 & 580895112;
                            int i131 = -(-(((i130 & i129) | (i129 ^ i130)) * (-1042)));
                            int i132 = (-2090031256) ^ i131;
                            int i133 = ((i131 & (-2090031256)) | i132) << 1;
                            int i134 = -i132;
                            int i135 = (((i133 & i134) + (i133 | i134)) - (~(-(-((1495699389 | iIdentityHashCode) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))) - 1;
                            int i136 = (-580895113) & iIdentityHashCode;
                            int i137 = (iIdentityHashCode | (-580895113)) & (~i136);
                            int i138 = ~((i137 & i136) | (i137 ^ i136));
                            int i139 = (i138 & 426376) | (426376 ^ i138);
                            int i140 = i125 & 580895112;
                            int i141 = ((i125 | 580895112) & (~i140)) | i140;
                            int i142 = ((-1495699390) & i141) | ((~i141) & 1495699389);
                            int i143 = i141 & 1495699389;
                            int i144 = ~((i143 & i142) | (i142 ^ i143));
                            int i145 = ((~i144) & i139) | ((~i139) & i144);
                            int i146 = i139 & i144;
                            i14 = (((i146 & i145) | (i145 ^ i146)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i135;
                            int iIdentityHashCode2 = System.identityHashCode(y7);
                            int i147 = ~iIdentityHashCode2;
                            int i148 = ~((i147 & (-1621262691)) | ((-1621262691) ^ i147));
                            int i149 = 1795082215 ^ iIdentityHashCode2;
                            int i150 = 1795082215 & iIdentityHashCode2;
                            int i151 = ~((i150 & i149) | (i149 ^ i150));
                            int i152 = -(-(((i148 & i151) | (i148 ^ i151)) * (-272)));
                            int i153 = (446967321 & i152) + (i152 | 446967321);
                            int i154 = (-1789560804) ^ iIdentityHashCode2;
                            int i155 = (-1789560804) & iIdentityHashCode2;
                            int i156 = ~((i155 & i154) | (i154 ^ i155));
                            int i157 = 168298113 & i156;
                            int i158 = (i156 | 168298113) & (~i157);
                            int i159 = -(-(((i158 & i157) | (i158 ^ i157)) * (-272)));
                            i15 = ((((~i159) & i153) | ((~i153) & i159)) - (~(-(-((i159 & i153) << 1))))) - 1;
                            int i160 = 1789560803 & iIdentityHashCode2;
                            int i161 = (iIdentityHashCode2 | 1789560803) & (~i160);
                            int i162 = ~((i161 & i160) | (i161 ^ i160));
                            i16 = 1626784102 & i162;
                            i17 = (i162 | 1626784102) & (~i16);
                            if (i14 <= (i15 - (~(-(-(((i17 & i16) | (i17 ^ i16)) * 272))))) - 1) {
                                int i163 = 50 / 0;
                            }
                            return asoVar3;
                        }
                        y7 = new aso(x10, dividerPadding, x10.setOnLongClickListener().setOnLongClickListener());
                        int i164 = f53765f;
                        int i165 = i164 & 99;
                        int i166 = -(-(i164 | 99));
                        int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                        f53766g = i167 % 128;
                        if (i167 % 2 == 0) {
                            i18 = 91;
                            i24 = 0;
                            int i910 = i18 / i24;
                        }
                    } else {
                        apk x11 = onFocusChangeListener4.setX();
                        apk compoundDrawableTintBlendMode8 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode7);
                        apk compoundDrawableTintBlendMode9 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode3);
                        apk compoundDrawableTintBlendMode10 = compoundDrawableTintBlendMode8.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode9);
                        if (!compoundDrawableTintBlendMode10.setOnDragListener()) {
                            apk compoundDrawableTintBlendMode11 = onFocusChangeListener3.setCompoundDrawableTintBlendMode(x11);
                            if (!navBarTitleString3) {
                                int i168 = f53766g;
                                int i169 = i168 & 31;
                                int i170 = ((((i168 ^ 31) | i169) << 1) - (~(-((i168 | 31) & (~i169))))) - 1;
                                f53765f = i170 % 128;
                                int i171 = i170 % 2;
                                compoundDrawableTintBlendMode11 = compoundDrawableTintBlendMode11.setCompoundDrawableTintBlendMode(y10);
                                int i172 = f53766g;
                                int i173 = (i172 & (-120)) | ((~i172) & 119);
                                int i174 = (i172 & 119) << 1;
                                int i175 = ((i173 | i174) << 1) - (i174 ^ i173);
                                f53765f = i175 % 128;
                                int i176 = i175 % 2;
                            }
                            apk y11 = compoundDrawableTintBlendMode9.setOnFocusChangeListener(x11).setY(compoundDrawableTintBlendMode11, apkVar4.setOnFocusChangeListener(apkVar5));
                            if (!navBarTitleString2) {
                                int i177 = f53765f;
                                int i178 = i177 & 27;
                                int i179 = ((i177 ^ 27) | i178) << 1;
                                int i180 = -((i177 | 27) & (~i178));
                                int i181 = (i179 & i180) + (i180 | i179);
                                f53766g = i181 % 128;
                                int i182 = i181 % 2;
                                compoundDrawableTintBlendMode11 = compoundDrawableTintBlendMode11.setCompoundDrawableTintBlendMode(apkVar5);
                                int i183 = f53765f;
                                int i184 = ((i183 ^ 93) | (i183 & 93)) << 1;
                                int i185 = -(((~i183) & 93) | (i183 & (-94)));
                                int i186 = (i184 & i185) + (i185 | i184);
                                f53766g = i186 % 128;
                                int i187 = i186 % 2;
                            }
                            dividerPadding = compoundDrawableTintBlendMode10;
                            onFocusChangeListener = compoundDrawableTintBlendMode11;
                            onFocusChangeListener2 = y11;
                            aso asoVar4 = new aso(x10, dividerPadding, onFocusChangeListener2, new apk[]{onFocusChangeListener});
                            int iIdentityHashCode3 = System.identityHashCode(y7);
                            int i1210 = ~iIdentityHashCode3;
                            int i1211 = i1210 ^ 1495699389;
                            int i1212 = i1210 & 1495699389;
                            int i1213 = ~((i1211 & i1212) | (i1211 ^ i1212));
                            int i1214 = 580895112 ^ i1213;
                            int i1310 = i1213 & 580895112;
                            int i1311 = -(-(((i1310 & i1214) | (i1214 ^ i1310)) * (-1042)));
                            int i1312 = (-2090031256) ^ i1311;
                            int i1313 = ((i1311 & (-2090031256)) | i1312) << 1;
                            int i1314 = -i1312;
                            int i1315 = (((i1313 & i1314) + (i1313 | i1314)) - (~(-(-((1495699389 | iIdentityHashCode3) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))) - 1;
                            int i1316 = (-580895113) & iIdentityHashCode3;
                            int i1317 = (iIdentityHashCode3 | (-580895113)) & (~i1316);
                            int i1318 = ~((i1317 & i1316) | (i1317 ^ i1316));
                            int i1319 = (i1318 & 426376) | (426376 ^ i1318);
                            int i1410 = i1210 & 580895112;
                            int i1411 = ((i1210 | 580895112) & (~i1410)) | i1410;
                            int i1412 = ((-1495699390) & i1411) | ((~i1411) & 1495699389);
                            int i1413 = i1411 & 1495699389;
                            int i1414 = ~((i1413 & i1412) | (i1412 ^ i1413));
                            int i1415 = ((~i1414) & i1319) | ((~i1319) & i1414);
                            int i1416 = i1319 & i1414;
                            i14 = (((i1416 & i1415) | (i1415 ^ i1416)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i1315;
                            int iIdentityHashCode4 = System.identityHashCode(y7);
                            int i1417 = ~iIdentityHashCode4;
                            int i1418 = ~((i1417 & (-1621262691)) | ((-1621262691) ^ i1417));
                            int i1419 = 1795082215 ^ iIdentityHashCode4;
                            int i1510 = 1795082215 & iIdentityHashCode4;
                            int i1511 = ~((i1510 & i1419) | (i1419 ^ i1510));
                            int i1512 = -(-(((i1418 & i1511) | (i1418 ^ i1511)) * (-272)));
                            int i1513 = (446967321 & i1512) + (i1512 | 446967321);
                            int i1514 = (-1789560804) ^ iIdentityHashCode4;
                            int i1515 = (-1789560804) & iIdentityHashCode4;
                            int i1516 = ~((i1515 & i1514) | (i1514 ^ i1515));
                            int i1517 = 168298113 & i1516;
                            int i1518 = (i1516 | 168298113) & (~i1517);
                            int i1519 = -(-(((i1518 & i1517) | (i1518 ^ i1517)) * (-272)));
                            i15 = ((((~i1519) & i1513) | ((~i1513) & i1519)) - (~(-(-((i1519 & i1513) << 1))))) - 1;
                            int i1610 = 1789560803 & iIdentityHashCode4;
                            int i1611 = (iIdentityHashCode4 | 1789560803) & (~i1610);
                            int i1612 = ~((i1611 & i1610) | (i1611 ^ i1610));
                            i16 = 1626784102 & i1612;
                            i17 = (i1612 | 1626784102) & (~i16);
                            if (i14 <= (i15 - (~(-(-(((i17 & i16) | (i17 ^ i16)) * 272))))) - 1) {
                                int i1613 = 50 / 0;
                            }
                            return asoVar4;
                        }
                        y7 = new aso(x10, compoundDrawableTintBlendMode10, x10.setOnLongClickListener().setOnLongClickListener());
                        int i188 = (-2) - ((f53766g + 44) ^ (-1));
                        f53765f = i188 % 128;
                        if (i188 % 2 != 0) {
                            throw null;
                        }
                    }
                } else {
                    int i189 = f53765f;
                    int i190 = ((i189 & 96) + (i189 | 96)) - 1;
                    f53766g = i190 % 128;
                    int i191 = i190 % 2;
                    if (onLongClickListener.setOnDragListener()) {
                        int i192 = f53766g;
                        int i193 = (i192 & 39) + (i192 | 39);
                        f53765f = i193 % 128;
                        if (i193 % 2 != 0) {
                            x10.setY();
                            throw null;
                        }
                        y7 = x10.setY();
                        int i194 = f53766g;
                        int i195 = i194 & 103;
                        int i196 = i194 | 103;
                        i13 = ((i195 | i196) << 1) - (i196 ^ i195);
                        f53765f = i13 % 128;
                        int i1110 = i13 % 2;
                    } else {
                        y7 = aplVar.setOnFocusChangeListener(y7);
                        int i197 = f53766g;
                        int i198 = i197 & 109;
                        int i199 = (i198 - (~((i197 ^ 109) | i198))) - 1;
                        f53765f = i199 % 128;
                        int i200 = i199 % 2;
                    }
                }
            }
        } else {
            if (i23 != 3) {
                aso asoVar5 = (aso) objArr[0];
                int i201 = f53765f;
                int i202 = i201 & 75;
                int i203 = (i201 ^ 75) | i202;
                int i204 = ((i202 | i203) << 1) - (i203 ^ i202);
                f53766g = i204 % 128;
                int i205 = i204 % 2;
                apk apkVar6 = asoVar5.setX;
                apk apkVar7 = asoVar5.setOnFocusChangeListener;
                if (!asoVar5.setIncludeFontPadding()) {
                    int i206 = f53766g;
                    int i207 = i206 & 67;
                    int i208 = -(-(i206 | 67));
                    int i209 = (i207 & i208) + (i208 | i207);
                    f53765f = i209 % 128;
                    if (i209 % 2 != 0) {
                        apkVar6.setOnDragListener();
                        throw null;
                    }
                    if (!apkVar6.setOnDragListener()) {
                        apk compoundDrawableTintBlendMode12 = apkVar7.setOnFocusChangeListener(apkVar6).setCompoundDrawableTintBlendMode(apkVar6);
                        apk apkVar8 = asoVar5.setY[0];
                        if (!apkVar8.getNavBarTitleString()) {
                            int i210 = f53765f + 55;
                            f53766g = i210 % 128;
                            if (i210 % 2 == 0) {
                                compoundDrawableTintBlendMode12.setDividerPadding(apkVar8);
                                throw null;
                            }
                            apk dividerPadding3 = compoundDrawableTintBlendMode12.setDividerPadding(apkVar8);
                            int i211 = f53766g;
                            int i212 = i211 & 75;
                            int i213 = (((i211 | 75) & (~i212)) - (~(i212 << 1))) - 1;
                            f53765f = i213 % 128;
                            int i214 = i213 % 2;
                            apkVar = dividerPadding3;
                        } else {
                            apkVar = compoundDrawableTintBlendMode12;
                        }
                        System.identityHashCode(asoVar5);
                        System.identityHashCode(asoVar5);
                        return apkVar;
                    }
                }
                int i215 = f53766g;
                int i216 = (i215 ^ 75) + ((i215 & 75) << 1);
                f53765f = i216 % 128;
                int i217 = i216 % 2;
                return apkVar7;
            }
            y7 = (aso) objArr[0];
            int i218 = f53766g;
            int i219 = i218 & 21;
            int i220 = (i218 | 21) & (~i219);
            int i221 = -(-(i219 << 1));
            int i222 = (i220 ^ i221) + ((i220 & i221) << 1);
            f53765f = i222 % 128;
            if (i222 % 2 != 0) {
                y7.setIncludeFontPadding();
                throw null;
            }
            if (!y7.setIncludeFontPadding()) {
                apk apkVar9 = y7.setX;
                if (!apkVar9.setOnDragListener()) {
                    apk apkVar10 = y7.setOnFocusChangeListener;
                    apk apkVar11 = y7.setY[0];
                    aso asoVar6 = new aso(y7.setDividerPadding, apkVar9, apkVar10.setOnFocusChangeListener(apkVar11), new apk[]{apkVar11});
                    int i223 = f53766g;
                    int i224 = (i223 & (-82)) | ((~i223) & 81);
                    int i225 = (i223 & 81) << 1;
                    int i226 = (i224 & i225) + (i225 | i224);
                    f53765f = i226 % 128;
                    if (i226 % 2 != 0) {
                        int i227 = 40 / 0;
                    }
                    return asoVar6;
                }
                int i228 = f53765f;
                int i229 = i228 & 1;
                int i230 = ((i228 ^ 1) | i229) << 1;
                int i231 = -((~i229) & (i228 | 1));
                int i232 = ((i230 | i231) << 1) - (i230 ^ i231);
                f53766g = i232 % 128;
                int i233 = i232 % 2;
                int i234 = ((i228 ^ 30) + ((i228 & 30) << 1)) - 1;
                f53766g = i234 % 128;
                int i235 = i234 % 2;
            } else {
                int i236 = f53766g;
                int i237 = (((i236 | 42) << 1) - (i236 ^ 42)) - 1;
                f53765f = i237 % 128;
                if (i237 % 2 != 0) {
                    throw null;
                }
            }
        }
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, 46132840, -46132837, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, 1067855916, -1067855916, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, -1327364628, 1327364629, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 317413064, -317413062, System.identityHashCode(this));
    }
}
