package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class atw extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53857f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53858g = 1;

    public static apl i(Object[] objArr) {
        long[] jArr;
        int i10;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        char c10;
        long[] jArr5;
        long[] jArr6;
        int i11;
        aph aphVar;
        int i12;
        att attVar;
        att attVar2;
        att attVar3;
        atw atwVar = (atw) objArr[0];
        apl aplVar = (apl) objArr[1];
        int i13 = (-2) - ((f53858g + 78) ^ (-1));
        f53857f = i13 % 128;
        int i14 = i13 % 2;
        if (atwVar.setIncludeFontPadding()) {
            int i15 = f53857f;
            int i16 = i15 & 97;
            int i17 = (i16 - (~(-(-((i15 ^ 97) | i16))))) - 1;
            int i18 = i17 % 128;
            f53858g = i18;
            if (i17 % 2 == 0) {
                throw null;
            }
            int i19 = i18 & 119;
            int i20 = i19 + ((i18 ^ 119) | i19);
            f53857f = i20 % 128;
            int i21 = i20 % 2;
            return aplVar;
        }
        if (aplVar.setIncludeFontPadding()) {
            int i22 = f53857f + 103;
            int i23 = i22 % 128;
            f53858g = i23;
            int i24 = i22 % 2;
            int i25 = i23 & 21;
            int i26 = -(-((i23 ^ 21) | i25));
            int i27 = (i25 & i26) + (i25 | i26);
            f53857f = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 60 / 0;
            }
            return atwVar;
        }
        aph x4 = atwVar.setX();
        att attVar4 = (att) atwVar.setX;
        att attVar5 = (att) aplVar.setOnLongClickListener();
        if (attVar4.setOnDragListener()) {
            int i29 = f53857f;
            int i30 = i29 & 89;
            int i31 = (((i29 ^ 89) | i30) << 1) - ((i29 | 89) & (~i30));
            f53858g = i31 % 128;
            int i32 = i31 % 2;
            if (attVar5.setOnDragListener()) {
                int i33 = f53858g;
                int i34 = i33 & 109;
                int i35 = i33 | 109;
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                f53857f = i36 % 128;
                if (i36 % 2 == 0) {
                    return x4.setY();
                }
                x4.setY();
                throw null;
            }
            apl onFocusChangeListener = aplVar.setOnFocusChangeListener(atwVar);
            int iIdentityHashCode = System.identityHashCode(atwVar);
            int i37 = ~iIdentityHashCode;
            int i38 = (-58792001) ^ i37;
            int i39 = (-58792001) & i37;
            int i40 = ~((i39 & i38) | (i38 ^ i39));
            int i41 = ~(1603369410 | iIdentityHashCode);
            int i42 = ((~i41) & i40) | ((~i40) & i41);
            int i43 = i40 & i41;
            int i44 = ((i43 & i42) | (i42 ^ i43)) * 520;
            int i45 = (-463957542) & i44;
            int i46 = (((i44 | (-463957542)) & (~i45)) - (~(-(-(i45 << 1))))) - 1;
            int i47 = (i37 | iIdentityHashCode) & i37;
            int i48 = (i47 & (-1603369411)) | ((-1603369411) ^ i47);
            int i49 = ~i48;
            int i50 = (i48 | i49) & i49;
            int i51 = ((-2088691640) & i37) | (iIdentityHashCode & 2088691639);
            int i52 = (-2088691640) & iIdentityHashCode;
            int i53 = ~((i51 & i52) | (i51 ^ i52));
            int i54 = (i46 - (~(((i50 & i53) | (((~i53) & i50) | ((~i50) & i53))) * (-1040)))) - 1;
            int i55 = (i37 & 2088691639) | (2088691639 ^ i37);
            int i56 = ~i55;
            int i57 = (i55 | i56) & i56;
            int i58 = (iIdentityHashCode | (-2088691640)) & (~i52);
            int i59 = (i58 & i52) | (i58 ^ i52);
            int i60 = ~i59;
            int i61 = -(-((((i59 | i60) & i60) | (i57 & 1544577410) | (i57 ^ 1544577410)) * 520));
            int i62 = i54 & i61;
            int i63 = i62 + ((i61 ^ i54) | i62);
            int iIdentityHashCode2 = System.identityHashCode(atwVar);
            int i64 = -(-((((-933535834) ^ iIdentityHashCode2) | ((-933535834) & iIdentityHashCode2)) * (-50)));
            int i65 = (-663241611) ^ i64;
            int i66 = -(-((i64 & (-663241611)) << 1));
            int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
            int i68 = ~(((-139139365) & iIdentityHashCode2) | ((-139139365) ^ iIdentityHashCode2));
            int i69 = ~iIdentityHashCode2;
            int i70 = ~i69;
            int i71 = (-181377326) & i69;
            int i72 = ((-181377326) ^ i69) | i71;
            int i73 = ~((i72 & (-933535834)) | (933535833 & i72) | ((~i72) & (-933535834)));
            int i74 = ((i68 & i73) | (i68 ^ i73)) * 50;
            int i75 = i67 & i74;
            int i76 = (((i74 | i67) & (~i75)) - (~(i75 << 1))) - 1;
            int i77 = ((-181377326) & i70) | (181377325 & i69);
            int i78 = (i77 & i71) | (i77 ^ i71);
            int i79 = ~i78;
            int i80 = (i78 | i79) & i79;
            int i81 = (i80 & 42237961) | ((-42237962) & i80) | ((~i80) & 42237961);
            int i82 = (iIdentityHashCode2 | i69) & i69;
            int i83 = i82 & (-933535834);
            int i84 = (i82 | (-933535834)) & (~i83);
            int i85 = ~((i84 & i83) | (i84 ^ i83));
            int i86 = i81 & i85;
            int i87 = (i85 | i81) & (~i86);
            int i88 = -(~(((i87 & i86) | (i87 ^ i86)) * 50));
            if (i63 > (-2) - (((i76 ^ i88) + ((i88 & i76) << 1)) ^ (-1))) {
                return onFocusChangeListener;
            }
            throw null;
        }
        att attVar6 = (att) atwVar.setOnFocusChangeListener;
        att attVar7 = (att) atwVar.setY[0];
        att attVar8 = (att) aplVar.setOnDragListener();
        att attVar9 = (att) aplVar.setY(0);
        long[] jArr7 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr8 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr9 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr10 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        if (attVar7.getNavBarTitleString()) {
            int i89 = f53857f;
            int i90 = i89 & 1;
            int i91 = (~i90) & (i89 | 1);
            int i92 = -(-(i90 << 1));
            int i93 = (i91 & i92) + (i91 | i92);
            f53858g = i93 % 128;
            if (i93 % 2 == 0) {
                throw null;
            }
            int i94 = i89 + 47;
            f53858g = i94 % 128;
            int i95 = i94 % 2;
            jArr = null;
        } else {
            jArr = (long[]) atr.setOnFocusChangeListener(new Object[]{attVar7.setLayoutAnimation}, -1155663531, 1155663548, (int) System.currentTimeMillis());
            int i96 = f53858g;
            int i97 = i96 & 99;
            int i98 = (i96 ^ 99) | i97;
            int i99 = (i97 ^ i98) + ((i98 & i97) << 1);
            f53857f = i99 % 128;
            int i100 = i99 % 2;
        }
        if (jArr == null) {
            int i101 = (-2) - ((f53857f + 32) ^ (-1));
            int i102 = i101 % 128;
            f53858g = i102;
            int i103 = i101 % 2;
            long[] jArr11 = attVar5.setLayoutAnimation;
            long[] jArr12 = attVar8.setLayoutAnimation;
            if (i103 == 0) {
                int i104 = 64 / 0;
            }
            int i105 = i102 & 107;
            int i106 = (~i105) & (i102 | 107);
            int i107 = i105 << 1;
            int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
            f53857f = i108 % 128;
            int i109 = i108 % 2;
            i10 = 1;
            jArr2 = jArr12;
            jArr3 = jArr11;
        } else {
            atr.setOnFocusChangeListener(new Object[]{attVar5.setLayoutAnimation, jArr, jArr8}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{attVar8.setLayoutAnimation, jArr, jArr10}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            int i110 = f53858g;
            int i111 = i110 & 97;
            int i112 = i111 - (~(-(-((i110 ^ 97) | i111))));
            i10 = 1;
            int i113 = i112 - 1;
            f53857f = i113 % 128;
            int i114 = i113 % 2;
            jArr2 = jArr10;
            jArr3 = jArr8;
        }
        if (attVar9.getNavBarTitleString() != i10) {
            Object[] objArr2 = new Object[i10];
            objArr2[0] = attVar9.setLayoutAnimation;
            jArr4 = (long[]) atr.setOnFocusChangeListener(objArr2, -1155663531, 1155663548, (int) System.currentTimeMillis());
            int i115 = f53858g;
            int i116 = ((i115 | 27) << i10) - (i115 ^ 27);
            f53857f = i116 % 128;
            int i117 = i116 % 2;
        } else {
            int i118 = f53857f;
            int i119 = i118 | 41;
            int i120 = i119 << 1;
            int i121 = -(i119 & (~(i118 & 41)));
            int i122 = (i120 ^ i121) + ((i121 & i120) << 1);
            f53858g = i122 % 128;
            int i123 = i122 % 2;
            int i124 = ((i118 ^ 101) | (i118 & 101)) << 1;
            int i125 = -((101 & (~i118)) | (i118 & (-102)));
            int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
            f53858g = i126 % 128;
            int i127 = i126 % 2;
            jArr4 = null;
        }
        if (jArr4 == null) {
            int i128 = f53858g;
            int i129 = i128 & 95;
            int i130 = ((i128 ^ 95) | i129) << 1;
            int i131 = -((i128 | 95) & (~i129));
            int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
            int i133 = i132 % 128;
            f53857f = i133;
            int i134 = i132 % 2;
            long[] jArr13 = attVar4.setLayoutAnimation;
            long[] jArr14 = attVar6.setLayoutAnimation;
            int i135 = ((i133 | 64) << 1) - (i133 ^ 64);
            int i136 = (i135 ^ (-1)) + (i135 << 1);
            f53858g = i136 % 128;
            int i137 = i136 % 2;
            c10 = 2;
            jArr5 = jArr14;
            i11 = 3;
            jArr6 = jArr13;
        } else {
            atr.setOnFocusChangeListener(new Object[]{attVar4.setLayoutAnimation, jArr4, jArr7}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{attVar6.setLayoutAnimation, jArr4, jArr9}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            int i138 = f53857f;
            int i139 = i138 & 117;
            int i140 = ((i138 ^ 117) | i139) << 1;
            int i141 = -((i138 | 117) & (~i139));
            int i142 = (i140 & i141) + (i141 | i140);
            f53858g = i142 % 128;
            c10 = 2;
            int i143 = i142 % 2;
            jArr5 = jArr9;
            jArr6 = jArr7;
            i11 = 3;
        }
        Object[] objArr3 = new Object[i11];
        objArr3[0] = jArr5;
        objArr3[1] = jArr2;
        objArr3[c10] = jArr9;
        atr.setOnFocusChangeListener(objArr3, 994738673, -994738669, (int) System.currentTimeMillis());
        Object[] objArr4 = new Object[i11];
        objArr4[0] = jArr6;
        objArr4[1] = jArr3;
        objArr4[2] = jArr10;
        atr.setOnFocusChangeListener(objArr4, 994738673, -994738669, (int) System.currentTimeMillis());
        if (((Boolean) avi.setDividerPadding(new Object[]{jArr10}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue()) {
            int i144 = f53858g;
            int i145 = (i144 | 59) << 1;
            int i146 = -(((~i144) & 59) | (i144 & (-60)));
            int i147 = ((i145 | i146) << 1) - (i146 ^ i145);
            f53857f = i147 % 128;
            int i148 = i147 % 2;
            if (!((Boolean) avi.setDividerPadding(new Object[]{jArr9}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue()) {
                apl y7 = x4.setY();
                int i149 = f53858g + 33;
                f53857f = i149 % 128;
                int i150 = i149 % 2;
                return y7;
            }
            int i151 = f53857f;
            int i152 = (i151 ^ 33) + ((i151 & 33) << 1);
            f53858g = i152 % 128;
            int i153 = i152 % 2;
            apl onEditorActionListener = atwVar.setOnEditorActionListener();
            int i154 = f53858g;
            int i155 = i154 ^ 77;
            int i156 = -(-((i154 & 77) << 1));
            int i157 = ((i155 | i156) << 1) - (i156 ^ i155);
            f53857f = i157 % 128;
            if (i157 % 2 != 0) {
                int i158 = 99 / 0;
            }
            return onEditorActionListener;
        }
        if (attVar5.setOnDragListener()) {
            int i159 = f53857f + 66;
            int i160 = (i159 ^ (-1)) + (i159 << 1);
            f53858g = i160 % 128;
            int i161 = i160 % 2;
            apl alwaysDrawnWithCacheEnabled = r7.setAlwaysDrawnWithCacheEnabled();
            att attVar10 = (att) alwaysDrawnWithCacheEnabled.getNavBarTitleString();
            apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
            apk dividerPadding = navigationOnClickListener.setOnFocusChangeListener(attVar8).setDividerPadding(attVar10);
            attVar2 = (att) dividerPadding.setX().setOnFocusChangeListener(dividerPadding).setOnFocusChangeListener(attVar10);
            if (attVar2.setOnDragListener()) {
                atw atwVar2 = new atw(x4, attVar2, x4.setOnLongClickListener());
                int i162 = f53858g;
                int i163 = ((i162 | 61) << 1) - (i162 ^ 61);
                f53857f = i163 % 128;
                if (i163 % 2 == 0) {
                    return atwVar2;
                }
                throw null;
            }
            aphVar = x4;
            attVar = (att) dividerPadding.setCompoundDrawableTintBlendMode(attVar10.setOnFocusChangeListener(attVar2)).setOnFocusChangeListener(attVar2).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(attVar2).setOnFocusChangeListener(attVar2);
            attVar3 = (att) aphVar.setOnFocusChangeListener(apj.setOnFocusChangeListener);
            int i164 = f53858g;
            int i165 = i164 & 113;
            int i166 = -(-(i164 | 113));
            int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
            f53857f = i167 % 128;
            int i168 = i167 % 2;
            i12 = 1;
        } else {
            aphVar = x4;
            atr.setOnFocusChangeListener(new Object[]{jArr10, jArr10}, -310260428, 310260449, (int) System.currentTimeMillis());
            long[] jArr15 = (long[]) atr.setOnFocusChangeListener(new Object[]{jArr9}, -1155663531, 1155663548, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{jArr6, jArr15, jArr7}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{jArr3, jArr15, jArr8}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            att attVar11 = new att(jArr7);
            atr.setOnFocusChangeListener(new Object[]{jArr7, jArr8, attVar11.setLayoutAnimation}, -253482889, 253482896, (int) System.currentTimeMillis());
            if (attVar11.setOnDragListener()) {
                atw atwVar3 = new atw(aphVar, attVar11, aphVar.setOnLongClickListener());
                int i169 = f53857f;
                int i170 = (i169 & 105) + (i169 | 105);
                f53858g = i170 % 128;
                if (i170 % 2 != 0) {
                    return atwVar3;
                }
                throw null;
            }
            att attVar12 = new att(jArr9);
            atr.setOnFocusChangeListener(new Object[]{jArr10, jArr15, attVar12.setLayoutAnimation}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            if (jArr4 != null) {
                int i171 = f53858g + 14;
                int i172 = (i171 ^ (-1)) + (i171 << 1);
                f53857f = i172 % 128;
                int i173 = i172 % 2;
                long[] jArr16 = attVar12.setLayoutAnimation;
                atr.setOnFocusChangeListener(new Object[]{jArr16, jArr4, jArr16}, -1143789774, 1143789783, (int) System.currentTimeMillis());
                int i174 = f53858g;
                int i175 = i174 & 23;
                int i176 = (i174 | 23) & (~i175);
                int i177 = i175 << 1;
                int i178 = ((i176 | i177) << 1) - (i176 ^ i177);
                f53857f = i178 % 128;
                int i179 = i178 % 2;
            }
            long[] jArr17 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{jArr8, jArr10, jArr10}, 994738673, -994738669, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{jArr10, jArr17}, 1068960675, -1068960651, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{attVar6.setLayoutAnimation, attVar7.setLayoutAnimation, jArr10}, 994738673, -994738669, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{jArr10, attVar12.setLayoutAnimation, jArr17}, 378521458, -378521452, (int) System.currentTimeMillis());
            att attVar13 = new att(jArr10);
            atr.setOnFocusChangeListener(new Object[]{jArr17, attVar13.setLayoutAnimation}, 1843581176, -1843581157, (int) System.currentTimeMillis());
            if (jArr != 0) {
                int i180 = f53857f;
                int i181 = i180 & 113;
                int i182 = ((i180 ^ 113) | i181) << 1;
                int i183 = -((i180 | 113) & (~i181));
                int i184 = ((i182 | i183) << 1) - (i183 ^ i182);
                f53858g = i184 % 128;
                if (i184 % 2 == 0) {
                    long[] jArr18 = attVar12.setLayoutAnimation;
                    atr.setOnFocusChangeListener(new Object[]{jArr18, jArr, jArr18}, -1143789774, 1143789783, (int) System.currentTimeMillis());
                    throw null;
                }
                long[] jArr19 = attVar12.setLayoutAnimation;
                atr.setOnFocusChangeListener(new Object[]{jArr19, jArr, jArr19}, -1143789774, 1143789783, (int) System.currentTimeMillis());
                int i185 = f53857f;
                int i186 = (((i185 ^ 69) | (i185 & 69)) << 1) - (((~i185) & 69) | (i185 & (-70)));
                f53858g = i186 % 128;
                int i187 = i186 % 2;
            }
            i12 = 1;
            attVar = attVar13;
            attVar2 = attVar11;
            attVar3 = attVar12;
        }
        apk[] apkVarArr = new apk[i12];
        apkVarArr[0] = attVar3;
        return new atw(aphVar, attVar2, attVar, apkVarArr);
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        apk x4;
        apk compoundDrawableTintBlendMode;
        apk compoundDrawableTintBlendMode2;
        int i13 = ~i10;
        int i14 = (~(i13 | i12)) | (~((~i11) | i13));
        int i15 = ((i11 | i12) * 496) + (((~(i10 | (~i12) | i11)) | i14) * (-496)) + (i14 * 992) + (i11 * (-495)) + (i10 * (-495));
        if (i15 == 1) {
            return i(objArr);
        }
        if (i15 == 2) {
            atw atwVar = (atw) objArr[0];
            int i16 = f53857f;
            int i17 = ((i16 | 13) << 1) - (i16 ^ 13);
            f53858g = i17 % 128;
            if (i17 % 2 == 0) {
                atwVar.setIncludeFontPadding();
                throw null;
            }
            if (atwVar.setIncludeFontPadding()) {
                int i18 = f53858g;
                int i19 = ((i18 & (-114)) | ((~i18) & 113)) + ((i18 & 113) << 1);
                f53857f = i19 % 128;
                int i20 = i19 % 2;
                return atwVar;
            }
            apk apkVar = atwVar.setX;
            if (!apkVar.setOnDragListener()) {
                apk apkVar2 = atwVar.setOnFocusChangeListener;
                apk apkVar3 = atwVar.setY[0];
                atw atwVar2 = new atw(atwVar.setDividerPadding, apkVar, apkVar2.setOnFocusChangeListener(apkVar3), new apk[]{apkVar3});
                int i21 = f53858g + 120;
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                f53857f = i22 % 128;
                int i23 = i22 % 2;
                return atwVar2;
            }
            int i24 = f53857f;
            int i25 = (i24 | 21) << 1;
            int i26 = -(i24 ^ 21);
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            f53858g = i27 % 128;
            int i28 = i27 % 2;
            int i29 = i24 + 115;
            f53858g = i29 % 128;
            int i30 = i29 % 2;
            return atwVar;
        }
        if (i15 == 3) {
            atw atwVar3 = (atw) objArr[0];
            int i31 = f53857f + 57;
            f53858g = i31 % 128;
            int i32 = i31 % 2;
            apk apkVar4 = atwVar3.setX;
            apk apkVar5 = atwVar3.setOnFocusChangeListener;
            if (!atwVar3.setIncludeFontPadding()) {
                int i33 = f53857f;
                int i34 = i33 & 73;
                int i35 = ((i33 ^ 73) | i34) << 1;
                int i36 = -((i33 | 73) & (~i34));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f53858g = i37 % 128;
                if (i37 % 2 == 0) {
                    apkVar4.setOnDragListener();
                    throw null;
                }
                if (!apkVar4.setOnDragListener()) {
                    apk compoundDrawableTintBlendMode3 = apkVar5.setOnFocusChangeListener(apkVar4).setCompoundDrawableTintBlendMode(apkVar4);
                    apk apkVar6 = atwVar3.setY[0];
                    if (!apkVar6.getNavBarTitleString()) {
                        int i38 = f53858g;
                        int i39 = ((i38 ^ 97) | (i38 & 97)) << 1;
                        int i40 = -(((~i38) & 97) | (i38 & (-98)));
                        int i41 = (i39 & i40) + (i40 | i39);
                        f53857f = i41 % 128;
                        int i42 = i41 % 2;
                        compoundDrawableTintBlendMode3 = compoundDrawableTintBlendMode3.setDividerPadding(apkVar6);
                        int i43 = f53858g + 95;
                        f53857f = i43 % 128;
                        int i44 = i43 % 2;
                    }
                    int i45 = f53857f;
                    int i46 = (i45 ^ 59) + ((i45 & 59) << 1);
                    f53858g = i46 % 128;
                    int i47 = i46 % 2;
                    return compoundDrawableTintBlendMode3;
                }
            }
            int i48 = f53857f;
            int i49 = (i48 ^ 43) + ((i48 & 43) << 1);
            f53858g = i49 % 128;
            if (i49 % 2 != 0) {
                return apkVar5;
            }
            throw null;
        }
        atw atwVar4 = (atw) objArr[0];
        int i50 = f53858g;
        int i51 = ((i50 | 73) << 1) - (i50 ^ 73);
        f53857f = i51 % 128;
        if (i51 % 2 != 0) {
            atwVar4.setIncludeFontPadding();
            throw null;
        }
        if (atwVar4.setIncludeFontPadding()) {
            int i52 = f53858g;
            int i53 = (-2) - (((i52 ^ 46) + ((i52 & 46) << 1)) ^ (-1));
            f53857f = i53 % 128;
            int i54 = i53 % 2;
            return atwVar4;
        }
        aph x6 = atwVar4.setX();
        apk apkVar7 = atwVar4.setX;
        if (apkVar7.setOnDragListener()) {
            int i55 = f53857f;
            int i56 = i55 & 13;
            int i57 = (i56 - (~((i55 ^ 13) | i56))) - 1;
            f53858g = i57 % 128;
            int i58 = i57 % 2;
            apl y7 = x6.setY();
            if (i58 == 0) {
                int i59 = 18 / 0;
            }
            int i60 = f53857f;
            int i61 = i60 & 91;
            int i62 = ((i60 ^ 91) | i61) << 1;
            int i63 = -((i60 | 91) & (~i61));
            int i64 = (i62 & i63) + (i62 | i63);
            f53858g = i64 % 128;
            int i65 = i64 % 2;
            return y7;
        }
        apk apkVar8 = atwVar4.setOnFocusChangeListener;
        apk x7 = atwVar4.setY[0];
        boolean navBarTitleString = x7.getNavBarTitleString();
        if (!navBarTitleString) {
            x4 = x7.setX();
            int i66 = f53857f;
            int i67 = ((i66 | 29) << 1) - (i66 ^ 29);
            f53858g = i67 % 128;
            int i68 = i67 % 2;
        } else {
            int i69 = f53858g + 4;
            int i70 = (i69 ^ (-1)) + (i69 << 1);
            int i71 = i70 % 128;
            f53857f = i71;
            int i72 = i70 % 2;
            int i73 = (i71 ^ 73) + ((i71 & 73) << 1);
            f53858g = i73 % 128;
            int i74 = i73 % 2;
            x4 = x7;
        }
        if (navBarTitleString) {
            int i75 = f53858g + 85;
            f53857f = i75 % 128;
            int i76 = i75 % 2;
            compoundDrawableTintBlendMode = apkVar8.setX().setOnFocusChangeListener(apkVar8);
            int i77 = f53857f + 1;
            f53858g = i77 % 128;
            int i78 = i77 % 2;
        } else {
            compoundDrawableTintBlendMode = apkVar8.setOnFocusChangeListener(x7).setCompoundDrawableTintBlendMode(apkVar8);
            int i79 = f53858g;
            int i80 = i79 ^ 81;
            int i81 = ((i79 & 81) | i80) << 1;
            int i82 = -i80;
            int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
            f53857f = i83 % 128;
            int i84 = i83 % 2;
        }
        if (compoundDrawableTintBlendMode.setOnDragListener()) {
            atw atwVar5 = new atw(x6, compoundDrawableTintBlendMode, x6.setOnLongClickListener());
            int i85 = f53858g;
            int i86 = (i85 & 99) + (i85 | 99);
            f53857f = i86 % 128;
            if (i86 % 2 == 0) {
                return atwVar5;
            }
            throw null;
        }
        apk x10 = compoundDrawableTintBlendMode.setX();
        if (navBarTitleString) {
            int i87 = f53857f;
            int i88 = (i87 ^ 27) + ((i87 & 27) << 1);
            int i89 = i88 % 128;
            f53858g = i89;
            if (i88 % 2 == 0) {
                throw null;
            }
            int i90 = i89 & 3;
            int i91 = (3 ^ i89) | i90;
            int i92 = (i90 ^ i91) + ((i91 & i90) << 1);
            f53857f = i92 % 128;
            int i93 = i92 % 2;
            compoundDrawableTintBlendMode2 = compoundDrawableTintBlendMode;
        } else {
            compoundDrawableTintBlendMode2 = compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode(x4);
            int i94 = f53858g;
            int i95 = i94 & 37;
            int i96 = (i94 | 37) & (~i95);
            int i97 = i95 << 1;
            int i98 = (i96 & i97) + (i96 | i97);
            f53857f = i98 % 128;
            int i99 = i98 % 2;
        }
        apk x11 = apkVar8.setOnFocusChangeListener(apkVar7).setX();
        if (!(!navBarTitleString)) {
            int i100 = f53858g + 113;
            int i101 = i100 % 128;
            f53857f = i101;
            if (i100 % 2 != 0) {
                throw null;
            }
            int i102 = ((i101 ^ 40) + ((i101 & 40) << 1)) - 1;
            f53858g = i102 % 128;
            int i103 = i102 % 2;
        } else {
            x7 = x4.setX();
            int i104 = f53857f;
            int i105 = i104 & 7;
            int i106 = -(-((i104 ^ 7) | i105));
            int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
            f53858g = i107 % 128;
            int i108 = i107 % 2;
        }
        atw atwVar6 = new atw(x6, x10, x11.setOnFocusChangeListener(compoundDrawableTintBlendMode).setOnFocusChangeListener(x4).setCompoundDrawableTintBlendMode(x11).setOnFocusChangeListener(x7).setOnFocusChangeListener(x10).setOnFocusChangeListener(compoundDrawableTintBlendMode2), new apk[]{compoundDrawableTintBlendMode2});
        int i109 = f53857f;
        int i110 = (i109 & 67) + (i109 | 67);
        f53858g = i110 % 128;
        int i111 = i110 % 2;
        return atwVar6;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setDividerPadding(new Object[]{this}, -1124377015, 1124377017, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, 1079515234, -1079515231, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setDividerPadding(new Object[]{this}, 1081425859, -1081425859, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setDividerPadding(new Object[]{this, aplVar}, -893075838, 893075839, System.identityHashCode(this));
    }
}
