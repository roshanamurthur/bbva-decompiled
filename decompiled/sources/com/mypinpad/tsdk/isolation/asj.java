package com.mypinpad.tsdk.isolation;

import androidx.databinding.e;

/* JADX INFO: loaded from: classes10.dex */
public final class asj extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53752f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53753g = 1;

    /* JADX WARN: Code duplicated, block: B:57:0x0293 A[PHI: r3
      0x0293: PHI (r3v44 com.mypinpad.tsdk.i.apk) = (r3v43 com.mypinpad.tsdk.i.apk), (r3v58 com.mypinpad.tsdk.i.apk) binds: [B:56:0x0291, B:53:0x0288] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:60:0x029a  */
    /* JADX WARN: Code duplicated, block: B:63:0x02ae  */
    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        apl onFocusChangeListener;
        apk compoundDrawableTintBlendMode;
        apk compoundDrawableTintBlendMode2;
        apk compoundDrawableTintBlendMode3;
        apk compoundDrawableTintBlendMode4;
        apk compoundDrawableTintBlendMode5;
        apk y7;
        asj asjVar;
        asj asjVar2;
        apl onEditorActionListener;
        Object obj;
        asj asjVar3;
        apk apkVar;
        apk compoundDrawableTintBlendMode6;
        apk apkVar2;
        apk apkVar3;
        apk compoundDrawableTintBlendMode7;
        apk compoundDrawableTintBlendMode8;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (i16 * 701) + ((i15 | i11) * (-701)) + ((~(i15 | i16)) * 701) + (i11 * 702) + (i10 * (-700));
        int i18 = 0;
        if (i17 == 1) {
            asj asjVar4 = (asj) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i19 = f53752f;
            int i20 = i19 ^ 45;
            int i21 = ((((i19 & 45) | i20) << 1) - (~(-i20))) - 1;
            f53753g = i21 % 128;
            int i22 = i21 % 2;
            if (asjVar4.setIncludeFontPadding()) {
                int i23 = f53752f;
                int i24 = (i23 ^ 105) + ((i23 & 105) << 1);
                f53753g = i24 % 128;
                if (i24 % 2 == 0) {
                    int i25 = 60 / 0;
                }
                return aplVar;
            }
            if (!aplVar.setIncludeFontPadding()) {
                aph x4 = asjVar4.setX();
                apk compoundDrawableTintBlendMode9 = asjVar4.setX;
                apk onLongClickListener = aplVar.setOnLongClickListener();
                if (!compoundDrawableTintBlendMode9.setOnDragListener()) {
                    apk apkVar4 = asjVar4.setOnFocusChangeListener;
                    apk apkVar5 = asjVar4.setY[0];
                    apk onDragListener = aplVar.setOnDragListener();
                    apk y10 = aplVar.setY(0);
                    boolean navBarTitleString = apkVar5.getNavBarTitleString();
                    if (navBarTitleString) {
                        compoundDrawableTintBlendMode = onLongClickListener;
                        compoundDrawableTintBlendMode2 = onDragListener;
                    } else {
                        int i26 = f53752f;
                        int i27 = i26 & 107;
                        int i28 = (i26 ^ 107) | i27;
                        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
                        f53753g = i29 % 128;
                        int i30 = i29 % 2;
                        compoundDrawableTintBlendMode = onLongClickListener.setCompoundDrawableTintBlendMode(apkVar5);
                        compoundDrawableTintBlendMode2 = onDragListener.setCompoundDrawableTintBlendMode(apkVar5);
                        int i31 = f53753g;
                        int i32 = ((i31 & 65) - (~(-(-(i31 | 65))))) - 1;
                        f53752f = i32 % 128;
                        int i33 = i32 % 2;
                    }
                    boolean navBarTitleString2 = y10.getNavBarTitleString();
                    if (navBarTitleString2) {
                        compoundDrawableTintBlendMode3 = apkVar4;
                    } else {
                        int i34 = f53753g + 125;
                        f53752f = i34 % 128;
                        int i35 = i34 % 2;
                        compoundDrawableTintBlendMode9 = compoundDrawableTintBlendMode9.setCompoundDrawableTintBlendMode(y10);
                        compoundDrawableTintBlendMode3 = apkVar4.setCompoundDrawableTintBlendMode(y10);
                        int i36 = f53752f;
                        int i37 = ((i36 | 62) << 1) - (i36 ^ 62);
                        int i38 = (i37 ^ (-1)) + (i37 << 1);
                        f53753g = i38 % 128;
                        int i39 = i38 % 2;
                    }
                    apk onFocusChangeListener2 = compoundDrawableTintBlendMode3.setOnFocusChangeListener(compoundDrawableTintBlendMode2);
                    apk onFocusChangeListener3 = compoundDrawableTintBlendMode9.setOnFocusChangeListener(compoundDrawableTintBlendMode);
                    if (onFocusChangeListener3.setOnDragListener()) {
                        int i40 = f53753g;
                        int i41 = i40 & 9;
                        int i42 = (i40 ^ 9) | i41;
                        int i43 = ((i41 | i42) << 1) - (i42 ^ i41);
                        f53752f = i43 % 128;
                        int i44 = i43 % 2;
                        if (!onFocusChangeListener2.setOnDragListener()) {
                            apl y11 = x4.setY();
                            int i45 = f53752f;
                            int i46 = ((i45 | 85) << 1) - (i45 ^ 85);
                            f53753g = i46 % 128;
                            int i47 = i46 % 2;
                            obj = y11;
                        } else {
                            int i48 = f53753g;
                            int i49 = i48 | 117;
                            int i50 = i49 << 1;
                            int i51 = -((~(i48 & 117)) & i49);
                            int i52 = (i50 & i51) + (i51 | i50);
                            f53752f = i52 % 128;
                            int i53 = i52 % 2;
                            onEditorActionListener = asjVar4.setOnEditorActionListener();
                            int i54 = f53753g;
                            int i55 = (-2) - ((((i54 | 54) << 1) - (i54 ^ 54)) ^ (-1));
                            f53752f = i55 % 128;
                            if (i55 % 2 != 0) {
                                obj = onEditorActionListener;
                                throw null;
                            }
                        }
                    } else if (onLongClickListener.setOnDragListener()) {
                        int i56 = f53753g;
                        int i57 = (i56 & 19) + (i56 | 19);
                        f53752f = i57 % 128;
                        int i58 = i57 % 2;
                        apl alwaysDrawnWithCacheEnabled = asjVar4.setAlwaysDrawnWithCacheEnabled();
                        apk navBarTitleString3 = alwaysDrawnWithCacheEnabled.getNavBarTitleString();
                        apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
                        apk dividerPadding = navigationOnClickListener.setOnFocusChangeListener(onDragListener).setDividerPadding(navBarTitleString3);
                        compoundDrawableTintBlendMode4 = dividerPadding.setX().setOnFocusChangeListener(dividerPadding).setOnFocusChangeListener(navBarTitleString3).setDividerPadding();
                        if (compoundDrawableTintBlendMode4.setOnDragListener()) {
                            asjVar2 = new asj(x4, compoundDrawableTintBlendMode4, x4.setOnLongClickListener());
                            int i59 = (-2) - ((f53753g + 40) ^ (-1));
                            f53752f = i59 % 128;
                            if (i59 % 2 != 0) {
                                obj = asjVar2;
                                int i60 = 31 / 0;
                                obj = asjVar2;
                            }
                        } else {
                            y7 = dividerPadding.setCompoundDrawableTintBlendMode(navBarTitleString3.setOnFocusChangeListener(compoundDrawableTintBlendMode4)).setOnFocusChangeListener(compoundDrawableTintBlendMode4).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(compoundDrawableTintBlendMode4).setOnFocusChangeListener(compoundDrawableTintBlendMode4);
                            compoundDrawableTintBlendMode5 = x4.setOnFocusChangeListener(apj.setOnFocusChangeListener);
                            int i61 = f53753g;
                            int i62 = ((i61 & 56) + (i61 | 56)) - 1;
                            f53752f = i62 % 128;
                            int i63 = i62 % 2;
                            asjVar4 = new asj(x4, compoundDrawableTintBlendMode4, y7, new apk[]{compoundDrawableTintBlendMode5});
                            int i64 = f53753g;
                            int i65 = i64 & 83;
                            i13 = (((i64 | 83) & (~i65)) - (~(i65 << 1))) - 1;
                        }
                    } else {
                        apk x6 = onFocusChangeListener3.setX();
                        apk compoundDrawableTintBlendMode10 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode9);
                        apk compoundDrawableTintBlendMode11 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode);
                        compoundDrawableTintBlendMode4 = compoundDrawableTintBlendMode10.setCompoundDrawableTintBlendMode(compoundDrawableTintBlendMode11);
                        if (compoundDrawableTintBlendMode4.setOnDragListener()) {
                            asjVar = new asj(x4, compoundDrawableTintBlendMode4, x4.setOnLongClickListener());
                            int i66 = f53753g;
                            int i67 = ((i66 & 50) + (i66 | 50)) - 1;
                            f53752f = i67 % 128;
                            if (i67 % 2 != 0) {
                                obj = asjVar;
                                throw null;
                            }
                        } else {
                            apk compoundDrawableTintBlendMode12 = onFocusChangeListener2.setCompoundDrawableTintBlendMode(x6);
                            if (!navBarTitleString2) {
                                int i68 = f53753g;
                                int i69 = i68 & 9;
                                int i70 = ((i68 ^ 9) | i69) << 1;
                                int i71 = -((i68 | 9) & (~i69));
                                int i72 = ((i70 | i71) << 1) - (i71 ^ i70);
                                f53752f = i72 % 128;
                                int i73 = i72 % 2;
                                compoundDrawableTintBlendMode12 = compoundDrawableTintBlendMode12.setCompoundDrawableTintBlendMode(y10);
                                int i74 = f53752f;
                                int i75 = i74 & 69;
                                int i76 = i74 | 69;
                                int i77 = (i75 ^ i76) + ((i76 & i75) << 1);
                                f53753g = i77 % 128;
                                int i78 = i77 % 2;
                            }
                            compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode12;
                            y7 = compoundDrawableTintBlendMode11.setOnFocusChangeListener(x6).setY(compoundDrawableTintBlendMode5, apkVar4.setOnFocusChangeListener(apkVar5));
                            if (!navBarTitleString) {
                                int i79 = f53753g + 95;
                                f53752f = i79 % 128;
                                if (i79 % 2 != 0) {
                                    compoundDrawableTintBlendMode5.setCompoundDrawableTintBlendMode(apkVar5);
                                    throw null;
                                }
                                compoundDrawableTintBlendMode5 = compoundDrawableTintBlendMode5.setCompoundDrawableTintBlendMode(apkVar5);
                            }
                            asjVar4 = new asj(x4, compoundDrawableTintBlendMode4, y7, new apk[]{compoundDrawableTintBlendMode5});
                            int i610 = f53753g;
                            int i611 = i610 & 83;
                            i13 = (((i610 | 83) & (~i611)) - (~(i611 << 1))) - 1;
                        }
                    }
                } else {
                    int i80 = f53753g;
                    int i81 = i80 & 119;
                    int i82 = i81 + ((i80 ^ 119) | i81);
                    f53752f = i82 % 128;
                    int i83 = i82 % 2;
                    if (!(!onLongClickListener.setOnDragListener())) {
                        int i84 = f53753g;
                        int i85 = ((i84 | 79) << 1) - (((~i84) & 79) | (i84 & (-80)));
                        f53752f = i85 % 128;
                        int i86 = i85 % 2;
                        apl y12 = x4.setY();
                        if (i86 != 0) {
                            int i87 = 53 / 0;
                        }
                        int i88 = f53753g + 29;
                        f53752f = i88 % 128;
                        int i89 = i88 % 2;
                        obj = y12;
                    } else {
                        onFocusChangeListener = aplVar.setOnFocusChangeListener(asjVar4);
                        int i90 = f53753g + 59;
                        f53752f = i90 % 128;
                        if (i90 % 2 != 0) {
                            obj = onFocusChangeListener;
                            throw null;
                        }
                    }
                }
            } else {
                int i91 = f53752f;
                int i92 = i91 & 35;
                int i93 = ((((i91 ^ 35) | i92) << 1) - (~(-((i91 | 35) & (~i92))))) - 1;
                int i94 = i93 % 128;
                f53753g = i94;
                if (i93 % 2 == 0) {
                    throw null;
                }
                i13 = (-2) - ((((i94 | 96) << 1) - (i94 ^ 96)) ^ (-1));
            }
            f53752f = i13 % 128;
            int i95 = i13 % 2;
            return asjVar4;
        }
        if (i17 != 2) {
            if (i17 == 3) {
                asj asjVar5 = (asj) objArr[0];
                int i96 = f53753g;
                int i97 = ((i96 | 49) << 1) - (i96 ^ 49);
                f53752f = i97 % 128;
                int i98 = i97 % 2;
                apk apkVar6 = asjVar5.setX;
                if (i98 != 0) {
                    apkVar = asjVar5.setOnFocusChangeListener;
                    int i99 = 40 / 0;
                    if (!asjVar5.setIncludeFontPadding()) {
                        if (!apkVar6.setOnDragListener()) {
                            compoundDrawableTintBlendMode6 = apkVar.setOnFocusChangeListener(apkVar6).setCompoundDrawableTintBlendMode(apkVar6);
                            apkVar2 = asjVar5.setY[0];
                            if (!apkVar2.getNavBarTitleString()) {
                                apkVar3 = compoundDrawableTintBlendMode6;
                                int i100 = f53752f;
                                int i101 = i100 & 1;
                                int i102 = (i101 - (~(-(-((i100 ^ 1) | i101))))) - 1;
                                f53753g = i102 % 128;
                                int i103 = i102 % 2;
                                apk dividerPadding2 = compoundDrawableTintBlendMode6.setDividerPadding(apkVar2);
                                int i104 = f53752f;
                                int i105 = i104 & 13;
                                int i106 = ((i104 ^ 13) | i105) << 1;
                                int i107 = -((i104 | 13) & (~i105));
                                int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                                f53753g = i108 % 128;
                                int i109 = i108 % 2;
                                apkVar3 = dividerPadding2;
                            }
                            apkVar3 = compoundDrawableTintBlendMode6;
                            int i110 = f53753g;
                            int i111 = (((i110 ^ 57) | (i110 & 57)) << 1) - (((~i110) & 57) | (i110 & (-58)));
                            f53752f = i111 % 128;
                            int i112 = i111 % 2;
                            obj = apkVar3;
                        }
                    }
                } else {
                    apkVar = asjVar5.setOnFocusChangeListener;
                    if (!asjVar5.setIncludeFontPadding()) {
                        if (!apkVar6.setOnDragListener()) {
                            compoundDrawableTintBlendMode6 = apkVar.setOnFocusChangeListener(apkVar6).setCompoundDrawableTintBlendMode(apkVar6);
                            apkVar2 = asjVar5.setY[0];
                            if (!apkVar2.getNavBarTitleString()) {
                                apkVar3 = compoundDrawableTintBlendMode6;
                                int i1010 = f53752f;
                                int i1011 = i1010 & 1;
                                int i1012 = (i1011 - (~(-(-((i1010 ^ 1) | i1011))))) - 1;
                                f53753g = i1012 % 128;
                                int i1013 = i1012 % 2;
                                apk dividerPadding3 = compoundDrawableTintBlendMode6.setDividerPadding(apkVar2);
                                int i1014 = f53752f;
                                int i1015 = i1014 & 13;
                                int i1016 = ((i1014 ^ 13) | i1015) << 1;
                                int i1017 = -((i1014 | 13) & (~i1015));
                                int i1018 = ((i1016 | i1017) << 1) - (i1017 ^ i1016);
                                f53753g = i1018 % 128;
                                int i1019 = i1018 % 2;
                                apkVar3 = dividerPadding3;
                            }
                            apkVar3 = compoundDrawableTintBlendMode6;
                            int i113 = f53753g;
                            int i114 = (((i113 ^ 57) | (i113 & 57)) << 1) - (((~i113) & 57) | (i113 & (-58)));
                            f53752f = i114 % 128;
                            int i115 = i114 % 2;
                            obj = apkVar3;
                        }
                    }
                }
                int i116 = f53753g;
                int i117 = (i116 & 85) + (i116 | 85);
                f53752f = i117 % 128;
                if (i117 % 2 == 0) {
                    return apkVar;
                }
                throw null;
            }
            asj asjVar6 = (asj) objArr[0];
            int i118 = f53753g;
            int i119 = (i118 | 115) << 1;
            int i120 = -(i118 ^ 115);
            int i121 = (i119 & i120) + (i120 | i119);
            f53752f = i121 % 128;
            if (i121 % 2 != 0) {
                asjVar6.setIncludeFontPadding();
                throw null;
            }
            if (asjVar6.setIncludeFontPadding()) {
                int i122 = f53753g;
                int i123 = i122 & 89;
                int i124 = i122 | 89;
                int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
                f53752f = i125 % 128;
                if (i125 % 2 == 0) {
                    return asjVar6;
                }
                i14 = 77;
            } else {
                aph x7 = asjVar6.setX();
                apk apkVar7 = asjVar6.setX;
                if (apkVar7.setOnDragListener()) {
                    int i126 = f53753g + 35;
                    f53752f = i126 % 128;
                    if (i126 % 2 == 0) {
                        return x7.setY();
                    }
                    x7.setY();
                    throw null;
                }
                apk apkVar8 = asjVar6.setOnFocusChangeListener;
                apk x10 = asjVar6.setY[0];
                boolean navBarTitleString4 = x10.getNavBarTitleString();
                if (!(!navBarTitleString4)) {
                    int i127 = f53752f;
                    int i128 = ((i127 & (-118)) | ((~i127) & 117)) + ((i127 & 117) << 1);
                    f53753g = i128 % 128;
                    int i129 = i128 % 2;
                    int i130 = ((i127 | 47) << 1) - (i127 ^ 47);
                    f53753g = i130 % 128;
                    int i131 = i130 % 2;
                    compoundDrawableTintBlendMode7 = apkVar8;
                } else {
                    compoundDrawableTintBlendMode7 = apkVar8.setCompoundDrawableTintBlendMode(x10);
                    int i132 = f53753g;
                    int i133 = i132 & 41;
                    int i134 = i133 + ((i132 ^ 41) | i133);
                    f53752f = i134 % 128;
                    int i135 = i134 % 2;
                }
                if (navBarTitleString4) {
                    int iIdentityHashCode = System.identityHashCode(asjVar6);
                    int i136 = ~iIdentityHashCode;
                    int i137 = i136 & (i136 | iIdentityHashCode);
                    int i138 = ((-1521816743) & i137) | ((~i137) & 1521816742) | (i137 & 1521816742);
                    int i139 = ~i138;
                    int i140 = (i138 | i139) & i139;
                    int i141 = (-1588975271) & i140;
                    int i142 = (~i141) & (i140 | (-1588975271));
                    int i143 = -(-(((i142 & i141) | (i142 ^ i141)) * (-108)));
                    int i144 = (456343545 ^ i143) + ((i143 & 456343545) << 1);
                    int i145 = ~((76599810 & iIdentityHashCode) | (76599810 ^ iIdentityHashCode));
                    int i146 = ((-9441283) & i145) | (9441282 & (~i145));
                    int i147 = i145 & 9441282;
                    int i148 = (i147 & i146) | (i146 ^ i147);
                    int i149 = i137 ^ (-76599811);
                    int i150 = i137 & (-76599811);
                    int i151 = (i150 & i149) | (i149 ^ i150);
                    int i152 = ~i151;
                    int i153 = (i151 | i152) & i152;
                    int i154 = i148 & i153;
                    int i155 = (((i148 | i153) & (~i154)) | i154) * 54;
                    int i156 = ((i144 | i155) << 1) - (i155 ^ i144);
                    int i157 = -(~(-(-(((iIdentityHashCode ^ 9441282) | (iIdentityHashCode & 9441282)) * 54))));
                    int i158 = ((i156 & i157) + (i157 | i156)) - 1;
                    int iIdentityHashCode2 = System.identityHashCode(asjVar6);
                    int i159 = iIdentityHashCode2 & 68485177;
                    int i160 = (~i159) & (iIdentityHashCode2 | 68485177);
                    int i161 = (i159 & i160) | (i160 ^ i159);
                    int i162 = ((i161 & 549586052) | (i161 ^ 549586052)) * 614;
                    int i163 = ((((~i162) & (-2082460961)) | (2082460960 & i162)) - (~((i162 & (-2082460961)) << 1))) - 1;
                    int i164 = ~iIdentityHashCode2;
                    int i165 = (-387299644) ^ i164;
                    int i166 = (-387299644) & i164;
                    int i167 = ~((i166 & i165) | (i165 ^ i166));
                    int i168 = i167 & 68485177;
                    int i169 = (68485177 | i167) & (~i168);
                    int i170 = (i169 & i168) | (i169 ^ i168);
                    int i171 = i164 & 868400518;
                    int i172 = (~i171) & (i164 | 868400518);
                    int i173 = ~((i172 ^ i171) | (i171 & i172));
                    int i174 = i170 & i173;
                    int i175 = (i170 | i173) & (~i174);
                    int i176 = ((i175 & i174) | (i175 ^ i174)) * (-1228);
                    int i177 = ((i163 | i176) << 1) - (i176 ^ i163);
                    int i178 = (-318814467) & i164;
                    int i179 = ~((((-318814467) | i164) & (~i178)) | i178);
                    int i180 = (i164 & 387299643) | (i164 ^ 387299643);
                    int i181 = i180 ^ 868400518;
                    int i182 = i180 & 868400518;
                    int i183 = ~((i182 & i181) | (i181 ^ i182));
                    int i184 = ((~i183) & i179) | ((~i179) & i183);
                    int i185 = i183 & i179;
                    int i186 = ((i185 & i184) | (i184 ^ i185)) * 614;
                    if (i158 <= (i177 & i186) + (i186 | i177)) {
                        throw null;
                    }
                } else {
                    x10 = x10.setX();
                    int i187 = f53753g + 37;
                    f53752f = i187 % 128;
                    int i188 = i187 % 2;
                }
                apk apkVarB = e.b(apkVar8, compoundDrawableTintBlendMode7, x10);
                if (apkVarB.setOnDragListener()) {
                    asjVar6 = new asj(x7, apkVarB, x7.setOnLongClickListener());
                    int i189 = f53753g;
                    int i190 = i189 & 93;
                    int i191 = -(-((i189 ^ 93) | i190));
                    int i192 = (i190 ^ i191) + ((i191 & i190) << 1);
                    f53752f = i192 % 128;
                    if (i192 % 2 == 0) {
                        return asjVar6;
                    }
                    i14 = 68;
                    i18 = 0;
                } else {
                    apk x11 = apkVarB.setX();
                    if (navBarTitleString4) {
                        int i193 = f53752f;
                        int i194 = (i193 ^ 29) + ((i193 & 29) << 1);
                        f53753g = i194 % 128;
                        if (i194 % 2 == 0) {
                            throw null;
                        }
                        compoundDrawableTintBlendMode8 = apkVarB;
                    } else {
                        compoundDrawableTintBlendMode8 = apkVarB.setCompoundDrawableTintBlendMode(x10);
                        int i195 = f53753g;
                        int i196 = ((i195 ^ 91) | (i195 & 91)) << 1;
                        int i197 = -(((~i195) & 91) | (i195 & (-92)));
                        int i198 = ((i196 | i197) << 1) - (i197 ^ i196);
                        f53752f = i198 % 128;
                        int i199 = i198 % 2;
                    }
                    apk x12 = apkVar8.setOnFocusChangeListener(apkVar7).setX();
                    asjVar3 = new asj(x7, x11, x12.setOnFocusChangeListener(apkVarB).setOnFocusChangeListener(x10).setCompoundDrawableTintBlendMode(x12).setOnFocusChangeListener(x11), new apk[]{compoundDrawableTintBlendMode8});
                    int i200 = f53753g;
                    int i201 = i200 & 23;
                    int i202 = (i201 - (~(-(-((i200 ^ 23) | i201))))) - 1;
                    f53752f = i202 % 128;
                    if (i202 % 2 != 0) {
                        throw null;
                    }
                }
            }
            int i203 = i14 / i18;
            return asjVar6;
        }
        asj asjVar7 = (asj) objArr[0];
        int i204 = f53752f;
        int i205 = ((i204 | 41) << 1) - (i204 ^ 41);
        f53753g = i205 % 128;
        int i206 = i205 % 2;
        if (asjVar7.setIncludeFontPadding()) {
            int i207 = f53752f;
            int i208 = ((i207 | 93) << 1) - (i207 ^ 93);
            f53753g = i208 % 128;
            if (i208 % 2 != 0) {
                return asjVar7;
            }
            throw null;
        }
        apk apkVar9 = asjVar7.setX;
        if (!(!apkVar9.setOnDragListener())) {
            int i209 = f53752f;
            int i210 = i209 & 43;
            int i211 = ((i209 ^ 43) | i210) << 1;
            int i212 = -((i209 | 43) & (~i210));
            int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
            int i214 = i213 % 128;
            f53753g = i214;
            int i215 = i213 % 2;
            int i216 = (i214 | 7) << 1;
            int i217 = -(((~i214) & 7) | (i214 & (-8)));
            int i218 = (i216 ^ i217) + ((i217 & i216) << 1);
            f53752f = i218 % 128;
            int i219 = i218 % 2;
            return asjVar7;
        }
        apk apkVar10 = asjVar7.setOnFocusChangeListener;
        apk apkVar11 = asjVar7.setY[0];
        asjVar3 = new asj(asjVar7.setDividerPadding, apkVar9, apkVar10.setOnFocusChangeListener(apkVar11), new apk[]{apkVar11});
        int i220 = f53753g;
        int i221 = i220 & 57;
        int i222 = -(-((i220 ^ 57) | i221));
        int i223 = ((i221 | i222) << 1) - (i222 ^ i221);
        f53752f = i223 % 128;
        if (i223 % 2 != 0) {
            int i224 = 5 / 0;
        }
        return asjVar3;
        obj = onFocusChangeListener;
        obj = asjVar;
        obj = asjVar2;
        obj = onEditorActionListener;
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, 1744124459, -1744124457, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, 325104602, -325104599, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, 1864894536, -1864894536, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, -1775019701, 1775019702, System.identityHashCode(this));
    }
}
