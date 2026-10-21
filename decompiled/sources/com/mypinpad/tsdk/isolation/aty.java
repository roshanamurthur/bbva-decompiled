package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;

/* JADX INFO: loaded from: classes10.dex */
public final class aty extends apl.setY {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53864f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53865g = 1;

    public static apl i(Object[] objArr) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        int i10;
        char c10;
        long[] jArr6;
        long[] jArr7;
        int i11;
        aph aphVar;
        att attVar;
        att attVar2;
        att attVar3;
        int i12;
        aty atyVar = (aty) objArr[0];
        apl aplVar = (apl) objArr[1];
        int i13 = f53865g;
        int i14 = i13 & 29;
        int i15 = (i13 ^ 29) | i14;
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        f53864f = i16 % 128;
        int i17 = i16 % 2;
        if (atyVar.setIncludeFontPadding()) {
            int i18 = f53864f;
            int i19 = ((i18 ^ 109) | (i18 & 109)) << 1;
            int i20 = -(((~i18) & 109) | (i18 & (-110)));
            int i21 = ((i19 | i20) << 1) - (i20 ^ i19);
            int i22 = i21 % 128;
            f53865g = i22;
            int i23 = i21 % 2;
            int i24 = i22 + 85;
            f53864f = i24 % 128;
            int i25 = i24 % 2;
            return aplVar;
        }
        if (aplVar.setIncludeFontPadding()) {
            int i26 = f53865g;
            int i27 = (i26 & 37) + (i26 | 37);
            f53864f = i27 % 128;
            int i28 = i27 % 2;
            int i29 = i26 ^ 73;
            int i30 = (((i26 & 73) | i29) << 1) - i29;
            f53864f = i30 % 128;
            int i31 = i30 % 2;
            return atyVar;
        }
        aph x4 = atyVar.setX();
        att attVar4 = (att) atyVar.setX;
        att attVar5 = (att) aplVar.setOnLongClickListener();
        if (attVar4.setOnDragListener()) {
            int i32 = f53865g;
            int i33 = (((i32 & (-58)) | ((~i32) & 57)) - (~((i32 & 57) << 1))) - 1;
            f53864f = i33 % 128;
            int i34 = i33 % 2;
            if (!attVar5.setOnDragListener()) {
                apl onFocusChangeListener = aplVar.setOnFocusChangeListener(atyVar);
                int i35 = f53864f + 27;
                f53865g = i35 % 128;
                if (i35 % 2 != 0) {
                    return onFocusChangeListener;
                }
                throw null;
            }
            int i36 = f53865g;
            int i37 = i36 & 15;
            int i38 = ((i36 | 15) & (~i37)) + (i37 << 1);
            f53864f = i38 % 128;
            int i39 = i38 % 2;
            apl y7 = x4.setY();
            int i40 = f53865g;
            int i41 = (((i40 | 64) << 1) - (i40 ^ 64)) - 1;
            f53864f = i41 % 128;
            int i42 = i41 % 2;
            return y7;
        }
        att attVar6 = (att) atyVar.setOnFocusChangeListener;
        att attVar7 = (att) atyVar.setY[0];
        att attVar8 = (att) aplVar.setOnDragListener();
        att attVar9 = (att) aplVar.setY(0);
        long[] jArr8 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr9 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr10 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        long[] jArr11 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        if (!(!attVar7.getNavBarTitleString())) {
            int i43 = f53865g;
            int i44 = i43 + 7;
            f53864f = i44 % 128;
            int i45 = i44 % 2;
            int i46 = ((i43 | 13) << 1) - (i43 ^ 13);
            f53864f = i46 % 128;
            int i47 = i46 % 2;
            jArr = null;
        } else {
            jArr = (long[]) atr.setOnFocusChangeListener(new Object[]{attVar7.setLayoutAnimation}, -1155663531, 1155663548, (int) System.currentTimeMillis());
            int i48 = f53865g;
            int i49 = i48 ^ 23;
            int i50 = ((i48 & 23) | i49) << 1;
            int i51 = -i49;
            int i52 = (i50 ^ i51) + ((i50 & i51) << 1);
            f53864f = i52 % 128;
            int i53 = i52 % 2;
        }
        if (jArr == null) {
            int i54 = f53865g;
            int i55 = i54 & 65;
            int i56 = ((~i55) & (i54 | 65)) + (i55 << 1);
            f53864f = i56 % 128;
            if (i56 % 2 != 0) {
                long[] jArr12 = attVar5.setLayoutAnimation;
                long[] jArr13 = attVar8.setLayoutAnimation;
                throw null;
            }
            jArr3 = attVar5.setLayoutAnimation;
            jArr2 = attVar8.setLayoutAnimation;
            int i57 = i54 & 61;
            int i58 = (((~i57) & (i54 | 61)) - (~(-(-(i57 << 1))))) - 1;
            f53864f = i58 % 128;
            int i59 = i58 % 2;
        } else {
            atr.setOnFocusChangeListener(new Object[]{attVar5.setLayoutAnimation, jArr, jArr9}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{attVar8.setLayoutAnimation, jArr, jArr11}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            int i60 = f53865g;
            int i61 = (i60 & 73) + (i60 | 73);
            f53864f = i61 % 128;
            int i62 = i61 % 2;
            jArr2 = jArr11;
            jArr3 = jArr9;
        }
        if (!attVar9.getNavBarTitleString()) {
            long[] jArr14 = (long[]) atr.setOnFocusChangeListener(new Object[]{attVar9.setLayoutAnimation}, -1155663531, 1155663548, (int) System.currentTimeMillis());
            int i63 = f53865g;
            int i64 = i63 ^ 115;
            int i65 = ((i63 & 115) | i64) << 1;
            int i66 = -i64;
            int i67 = (i65 ^ i66) + ((i65 & i66) << 1);
            f53864f = i67 % 128;
            int i68 = i67 % 2;
            jArr4 = jArr14;
        } else {
            int iIdentityHashCode = System.identityHashCode(atyVar);
            int i69 = ~iIdentityHashCode;
            int i70 = ~((424852698 ^ i69) | (424852698 & i69));
            int i71 = (-1797919954) ^ iIdentityHashCode;
            int i72 = (-1797919954) & iIdentityHashCode;
            int i73 = ~((i71 ^ i72) | (i71 & i72));
            int i74 = ((i70 ^ i73) | (i70 & i73)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
            int i75 = (-1274990340) ^ i74;
            int i76 = ((i75 | (i74 & (-1274990340))) << 1) - i75;
            int i77 = (-1797919954) ^ i69;
            int i78 = (-1797919954) & i69;
            int i79 = (i77 ^ i78) | (i77 & i78);
            int i80 = (424852698 & i79) | ((-424852699) & (~i79));
            int i81 = i79 & (-424852699);
            int i82 = ~((i81 & i80) | (i80 ^ i81));
            int i83 = iIdentityHashCode | 2071641307;
            int i84 = ~i83;
            int i85 = (i83 | i84) & i84;
            int i86 = i82 & i85;
            int i87 = -(-((((i85 | i82) & (~i86)) | i86) * ErrorCodes.ERR_CRY_IO_PROPERTIES));
            int i88 = i76 & i87;
            int i89 = ((i76 ^ i87) | i88) << 1;
            int i90 = -((i87 | i76) & (~i88));
            int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
            int iIdentityHashCode2 = System.identityHashCode(atyVar);
            int i92 = ~iIdentityHashCode2;
            int i93 = (i92 | iIdentityHashCode2) & i92;
            int i94 = (51082111 ^ i93) | (51082111 & i93);
            int i95 = ~i94;
            int i96 = i95 & (i94 | i95);
            int i97 = -(-(((i96 & 405834880) | (405834880 & (~i96)) | ((-405834881) & i96)) * 98));
            int i98 = 164953598 & i97;
            int i99 = -(-((i97 ^ 164953598) | i98));
            int i100 = (i98 ^ i99) + ((i99 & i98) << 1);
            int i101 = ~((439397608 ^ i92) | (439397608 & i92));
            int i102 = (51082111 ^ i101) | (51082111 & i101);
            int i103 = ((-439397609) & i92) | (439397608 & iIdentityHashCode2);
            int i104 = (-439397609) & iIdentityHashCode2;
            int i105 = ~((i103 ^ i104) | (i103 & i104));
            int i106 = ((~i105) & i102) | ((~i102) & i105);
            int i107 = i102 & i105;
            int i108 = -(~(-(-(((i106 & i107) | (i106 ^ i107)) * (-49)))));
            int i109 = (((i100 | i108) << 1) - (i108 ^ i100)) - 1;
            int i110 = (51082111 & i92) | ((-51082112) & iIdentityHashCode2);
            int i111 = 51082111 & iIdentityHashCode2;
            int i112 = ~((i111 & i110) | (i110 ^ i111));
            int i113 = i112 & 33562728;
            int i114 = (i112 | 33562728) & (~i113);
            int i115 = ((i114 & i113) | (i114 ^ i113)) * 49;
            int i116 = i109 ^ i115;
            int i117 = -(-((i109 & i115) << 1));
            if (i91 <= ((i116 | i117) << 1) - (i117 ^ i116)) {
                throw null;
            }
            jArr4 = null;
        }
        if (jArr4 == null) {
            int i118 = f53865g;
            int i119 = i118 ^ 113;
            int i120 = (((i118 & 113) | i119) << 1) - i119;
            f53864f = i120 % 128;
            int i121 = i120 % 2;
            long[] jArr15 = attVar4.setLayoutAnimation;
            jArr6 = attVar6.setLayoutAnimation;
            int i122 = i118 + 77;
            f53864f = i122 % 128;
            int i123 = i122 % 2;
            i10 = 1;
            i11 = 3;
            jArr5 = jArr10;
            c10 = 2;
            jArr7 = jArr15;
        } else {
            jArr5 = jArr10;
            atr.setOnFocusChangeListener(new Object[]{attVar4.setLayoutAnimation, jArr4, jArr8}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{attVar6.setLayoutAnimation, jArr4, jArr5}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            int i124 = f53865g;
            int i125 = i124 & 61;
            int i126 = (i124 ^ 61) | i125;
            i10 = 1;
            int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
            f53864f = i127 % 128;
            c10 = 2;
            int i128 = i127 % 2;
            jArr6 = jArr5;
            jArr7 = jArr8;
            i11 = 3;
        }
        Object[] objArr2 = new Object[i11];
        objArr2[0] = jArr6;
        objArr2[i10] = jArr2;
        objArr2[c10] = jArr5;
        long[] jArr16 = jArr5;
        atr.setOnFocusChangeListener(objArr2, 994738673, -994738669, (int) System.currentTimeMillis());
        Object[] objArr3 = new Object[i11];
        objArr3[0] = jArr7;
        objArr3[i10] = jArr3;
        objArr3[2] = jArr11;
        atr.setOnFocusChangeListener(objArr3, 994738673, -994738669, (int) System.currentTimeMillis());
        Object[] objArr4 = new Object[i10];
        objArr4[0] = jArr11;
        if (((Boolean) avi.setDividerPadding(objArr4, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue()) {
            int i129 = f53864f + 118;
            int i130 = (i129 ^ (-1)) + (i129 << 1);
            f53865g = i130 % 128;
            if (i130 % 2 == 0) {
                ((Boolean) avi.setDividerPadding(new Object[]{jArr16}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (!((Boolean) avi.setDividerPadding(new Object[]{jArr16}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue()) {
                apl y10 = x4.setY();
                int i131 = f53864f;
                int i132 = (i131 & 59) + (i131 | 59);
                f53865g = i132 % 128;
                int i133 = i132 % 2;
                return y10;
            }
            apl onEditorActionListener = atyVar.setOnEditorActionListener();
            int i134 = f53864f;
            int i135 = i134 & 121;
            int i136 = i135 + ((i134 ^ 121) | i135);
            f53865g = i136 % 128;
            if (i136 % 2 != 0) {
                return onEditorActionListener;
            }
            throw null;
        }
        if (!attVar5.setOnDragListener()) {
            atr.setOnFocusChangeListener(new Object[]{jArr11, jArr11}, -310260428, 310260449, (int) System.currentTimeMillis());
            long[] jArr17 = (long[]) atr.setOnFocusChangeListener(new Object[]{jArr16}, -1155663531, 1155663548, (int) System.currentTimeMillis());
            Object[] objArr5 = {jArr7, jArr17, jArr8};
            long[] jArr18 = jArr4;
            atr.setOnFocusChangeListener(objArr5, -1143789774, 1143789783, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{jArr3, jArr17, jArr9}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            attVar3 = new att(jArr8);
            atr.setOnFocusChangeListener(new Object[]{jArr8, jArr9, attVar3.setLayoutAnimation}, -253482889, 253482896, (int) System.currentTimeMillis());
            if (attVar3.setOnDragListener()) {
                aty atyVar2 = new aty(x4, attVar3, atx.f53860h);
                int i137 = f53864f;
                int i138 = (i137 & 37) + (i137 | 37);
                f53865g = i138 % 128;
                if (i138 % 2 != 0) {
                    return atyVar2;
                }
                throw null;
            }
            aphVar = x4;
            attVar2 = new att(jArr16);
            atr.setOnFocusChangeListener(new Object[]{jArr11, jArr17, attVar2.setLayoutAnimation}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            if (jArr18 != null) {
                int i139 = f53865g;
                int i140 = (i139 & (-2)) | ((~i139) & 1);
                int i141 = (i139 & 1) << 1;
                int i142 = (i140 & i141) + (i141 | i140);
                f53864f = i142 % 128;
                if (i142 % 2 != 0) {
                    long[] jArr19 = attVar2.setLayoutAnimation;
                    atr.setOnFocusChangeListener(new Object[]{jArr19, jArr18, jArr19}, -1143789774, 1143789783, (int) System.currentTimeMillis());
                    throw null;
                }
                long[] jArr20 = attVar2.setLayoutAnimation;
                i12 = 0;
                atr.setOnFocusChangeListener(new Object[]{jArr20, jArr18, jArr20}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            } else {
                i12 = 0;
            }
            long[] jArr21 = (long[]) avi.setDividerPadding(new Object[i12], 1969613513, -1969613507, (int) System.currentTimeMillis());
            Object[] objArr6 = new Object[3];
            objArr6[i12] = jArr9;
            objArr6[1] = jArr11;
            objArr6[2] = jArr11;
            atr.setOnFocusChangeListener(objArr6, 994738673, -994738669, (int) System.currentTimeMillis());
            Object[] objArr7 = new Object[2];
            objArr7[i12] = jArr11;
            objArr7[1] = jArr21;
            atr.setOnFocusChangeListener(objArr7, 1068960675, -1068960651, (int) System.currentTimeMillis());
            long[] jArr22 = attVar6.setLayoutAnimation;
            long[] jArr23 = attVar7.setLayoutAnimation;
            Object[] objArr8 = new Object[3];
            objArr8[i12] = jArr22;
            objArr8[1] = jArr23;
            objArr8[2] = jArr11;
            atr.setOnFocusChangeListener(objArr8, 994738673, -994738669, (int) System.currentTimeMillis());
            long[] jArr24 = attVar2.setLayoutAnimation;
            Object[] objArr9 = new Object[3];
            objArr9[i12] = jArr11;
            objArr9[1] = jArr24;
            objArr9[2] = jArr21;
            atr.setOnFocusChangeListener(objArr9, 378521458, -378521452, (int) System.currentTimeMillis());
            attVar = new att(jArr11);
            atr.setOnFocusChangeListener(new Object[]{jArr21, attVar.setLayoutAnimation}, 1843581176, -1843581157, (int) System.currentTimeMillis());
            if (jArr != 0) {
                int i143 = f53865g;
                int i144 = (i143 ^ 13) + ((i143 & 13) << 1);
                f53864f = i144 % 128;
                if (i144 % 2 != 0) {
                    long[] jArr25 = attVar2.setLayoutAnimation;
                    atr.setOnFocusChangeListener(new Object[]{jArr25, jArr, jArr25}, -1143789774, 1143789783, (int) System.currentTimeMillis());
                    throw null;
                }
                long[] jArr26 = attVar2.setLayoutAnimation;
                atr.setOnFocusChangeListener(new Object[]{jArr26, jArr, jArr26}, -1143789774, 1143789783, (int) System.currentTimeMillis());
            }
        } else {
            aphVar = x4;
            int i145 = f53865g + 53;
            f53864f = i145 % 128;
            int i146 = i145 % 2;
            apl alwaysDrawnWithCacheEnabled = atyVar.setAlwaysDrawnWithCacheEnabled();
            att attVar10 = (att) alwaysDrawnWithCacheEnabled.getNavBarTitleString();
            apk navigationOnClickListener = alwaysDrawnWithCacheEnabled.setNavigationOnClickListener();
            apk dividerPadding = navigationOnClickListener.setOnFocusChangeListener(attVar8).setDividerPadding(attVar10);
            att attVar11 = (att) dividerPadding.setX().setOnFocusChangeListener(dividerPadding).setOnFocusChangeListener(attVar10).setDividerPadding();
            if (attVar11.setOnDragListener()) {
                aty atyVar3 = new aty(aphVar, attVar11, atx.f53860h);
                int i147 = f53865g;
                int i148 = i147 & 61;
                int i149 = (i147 ^ 61) | i148;
                int i150 = (i148 & i149) + (i149 | i148);
                f53864f = i150 % 128;
                int i151 = i150 % 2;
                return atyVar3;
            }
            attVar = (att) dividerPadding.setCompoundDrawableTintBlendMode(attVar10.setOnFocusChangeListener(attVar11)).setOnFocusChangeListener(attVar11).setOnFocusChangeListener(navigationOnClickListener).setDividerPadding(attVar11).setOnFocusChangeListener(attVar11);
            attVar2 = (att) aphVar.setOnFocusChangeListener(apj.setOnFocusChangeListener);
            int i152 = f53864f;
            int i153 = i152 & 77;
            int i154 = i153 + ((i152 ^ 77) | i153);
            f53865g = i154 % 128;
            int i155 = i154 % 2;
            attVar3 = attVar11;
        }
        aty atyVar4 = new aty(aphVar, attVar3, attVar, new apk[]{attVar2});
        int i156 = f53865g;
        int i157 = (i156 ^ 19) + ((i156 & 19) << 1);
        f53864f = i157 % 128;
        if (i157 % 2 != 0) {
            int i158 = 58 / 0;
        }
        return atyVar4;
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        apk apkVar;
        Object obj;
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        aty atyVar;
        int i13 = ((~(i10 | i11 | i12)) * (-301)) + (i11 * 302) + (i10 * (-300));
        int i14 = ~i11;
        int i15 = (((~((~i10) | i12)) | i14) * 301) + (((~(i14 | i12)) | (~((~i12) | i10))) * (-301)) + i13;
        if (i15 == 1) {
            return i(objArr);
        }
        if (i15 == 2) {
            aty atyVar2 = (aty) objArr[0];
            int i16 = f53865g;
            int i17 = ((i16 & 32) + (i16 | 32)) - 1;
            f53864f = i17 % 128;
            if (i17 % 2 != 0) {
                apk apkVar2 = atyVar2.setX;
                atyVar2.setIncludeFontPadding();
                throw null;
            }
            apk apkVar3 = atyVar2.setX;
            apk apkVar4 = atyVar2.setOnFocusChangeListener;
            if (!(!atyVar2.setIncludeFontPadding()) || apkVar3.setOnDragListener()) {
                int i18 = f53865g;
                int i19 = (i18 ^ 35) + ((i18 & 35) << 1);
                f53864f = i19 % 128;
                int i20 = i19 % 2;
                return apkVar4;
            }
            apk compoundDrawableTintBlendMode = apkVar4.setOnFocusChangeListener(apkVar3).setCompoundDrawableTintBlendMode(apkVar3);
            apk apkVar5 = atyVar2.setY[0];
            if (!apkVar5.getNavBarTitleString()) {
                int i21 = f53864f;
                int i22 = i21 & 5;
                int i23 = (((i21 ^ 5) | i22) << 1) - ((i21 | 5) & (~i22));
                f53865g = i23 % 128;
                int i24 = i23 % 2;
                apk dividerPadding = compoundDrawableTintBlendMode.setDividerPadding(apkVar5);
                if (i24 == 0) {
                    apkVar = compoundDrawableTintBlendMode;
                    int i25 = 27 / 0;
                }
                apkVar = compoundDrawableTintBlendMode;
                apkVar = dividerPadding;
                int i26 = f53865g;
                int i27 = (((i26 ^ 125) | (i26 & 125)) << 1) - (((~i26) & 125) | (i26 & (-126)));
                f53864f = i27 % 128;
                int i28 = i27 % 2;
            }
            apkVar = compoundDrawableTintBlendMode;
            int i29 = f53864f;
            int i30 = i29 & 121;
            int i31 = ((i29 | 121) & (~i30)) + (i30 << 1);
            f53865g = i31 % 128;
            int i32 = i31 % 2;
            obj = apkVar;
        } else {
            if (i15 == 3) {
                aty atyVar3 = (aty) objArr[0];
                int i33 = f53864f;
                int i34 = i33 & 105;
                int i35 = -(-((i33 ^ 105) | i34));
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f53865g = i36 % 128;
                int i37 = i36 % 2;
                if (atyVar3.setIncludeFontPadding()) {
                    int i38 = (-2) - ((f53864f + 58) ^ (-1));
                    int i39 = i38 % 128;
                    f53865g = i39;
                    int i40 = i38 % 2;
                    int i41 = i39 + 34;
                    int i42 = (i41 ^ (-1)) + (i41 << 1);
                    f53864f = i42 % 128;
                    if (i42 % 2 == 0) {
                        return atyVar3;
                    }
                    int i43 = 87 / 0;
                    return atyVar3;
                }
                apk apkVar6 = atyVar3.setX;
                if (apkVar6.setOnDragListener()) {
                    int i44 = f53865g;
                    int i45 = ((i44 | 39) << 1) - (i44 ^ 39);
                    f53864f = i45 % 128;
                    if (i45 % 2 == 0) {
                        return atyVar3;
                    }
                    throw null;
                }
                apk apkVar7 = atyVar3.setOnFocusChangeListener;
                apk apkVar8 = atyVar3.setY[0];
                aty atyVar4 = new aty(atyVar3.setDividerPadding, apkVar6, apkVar7.setOnFocusChangeListener(apkVar8), new apk[]{apkVar8});
                int i46 = f53865g;
                int i47 = i46 & 111;
                int i48 = (i46 ^ 111) | i47;
                int i49 = (i47 & i48) + (i48 | i47);
                f53864f = i49 % 128;
                int i50 = i49 % 2;
                return atyVar4;
            }
            aty atyVar5 = (aty) objArr[0];
            int i51 = f53865g + 57;
            f53864f = i51 % 128;
            int i52 = i51 % 2;
            if (atyVar5.setIncludeFontPadding()) {
                int i53 = f53864f + 65;
                int i54 = i53 % 128;
                f53865g = i54;
                int i55 = i53 % 2;
                int i56 = ((i54 ^ 55) | (i54 & 55)) << 1;
                int i57 = -(((~i54) & 55) | (i54 & (-56)));
                int i58 = ((i56 | i57) << 1) - (i56 ^ i57);
                f53864f = i58 % 128;
                int i59 = i58 % 2;
                return atyVar5;
            }
            aph x4 = atyVar5.setX();
            att attVar = (att) atyVar5.setX;
            if (attVar.setOnDragListener()) {
                int i60 = f53864f;
                int i61 = (((i60 | 96) << 1) - (i60 ^ 96)) - 1;
                f53865g = i61 % 128;
                int i62 = i61 % 2;
                apl y7 = x4.setY();
                int i63 = f53865g;
                int i64 = i63 & 69;
                int i65 = ((i63 ^ 69) | i64) << 1;
                int i66 = -((i63 | 69) & (~i64));
                int i67 = (i65 & i66) + (i65 | i66);
                f53864f = i67 % 128;
                if (i67 % 2 == 0) {
                    return y7;
                }
                throw null;
            }
            att attVar2 = (att) atyVar5.setOnFocusChangeListener;
            att attVar3 = (att) atyVar5.setY[0];
            long[] jArr5 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
            long[] jArr6 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
            if (!attVar3.getNavBarTitleString()) {
                jArr = (long[]) atr.setOnFocusChangeListener(new Object[]{attVar3.setLayoutAnimation}, -1155663531, 1155663548, (int) System.currentTimeMillis());
                int i68 = f53864f;
                int i69 = i68 & 57;
                int i70 = i69 + ((i68 ^ 57) | i69);
                f53865g = i70 % 128;
                int i71 = i70 % 2;
            } else {
                int i72 = f53864f;
                int i73 = i72 & 111;
                int i74 = ((i72 ^ 111) | i73) << 1;
                int i75 = -((i72 | 111) & (~i73));
                int i76 = (i74 & i75) + (i75 | i74);
                f53865g = i76 % 128;
                if (i76 % 2 == 0) {
                    int i77 = 96 / 0;
                }
                jArr = null;
            }
            if (jArr == null) {
                int i78 = (-2) - ((f53865g + 126) ^ (-1));
                int i79 = i78 % 128;
                f53864f = i79;
                int i80 = i78 % 2;
                long[] jArr7 = attVar2.setLayoutAnimation;
                long[] jArr8 = attVar3.setLayoutAnimation;
                int i81 = (i79 & 57) + (i79 | 57);
                f53865g = i81 % 128;
                int i82 = i81 % 2;
                jArr3 = jArr8;
                jArr2 = jArr7;
            } else {
                atr.setOnFocusChangeListener(new Object[]{attVar2.setLayoutAnimation, jArr, jArr5}, -1143789774, 1143789783, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar3.setLayoutAnimation, jArr6}, -310260428, 310260449, (int) System.currentTimeMillis());
                int i83 = f53864f;
                int i84 = i83 | 11;
                int i85 = i84 << 1;
                int i86 = -((~(i83 & 11)) & i84);
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                f53865g = i87 % 128;
                int i88 = i87 % 2;
                jArr2 = jArr5;
                jArr3 = jArr6;
            }
            long[] jArr9 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{attVar2.setLayoutAnimation, jArr9}, -310260428, 310260449, (int) System.currentTimeMillis());
            atr.setOnFocusChangeListener(new Object[]{jArr2, jArr3, jArr9}, 1239421330, -1239421316, (int) System.currentTimeMillis());
            if (!((Boolean) avi.setDividerPadding(new Object[]{jArr9}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue()) {
                long[] jArr10 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{jArr9, jArr2, jArr10}, 378521458, -378521452, (int) System.currentTimeMillis());
                att attVar4 = new att(jArr5);
                atr.setOnFocusChangeListener(new Object[]{jArr9, attVar4.setLayoutAnimation}, -310260428, 310260449, (int) System.currentTimeMillis());
                att attVar5 = new att(jArr9);
                if (jArr != null) {
                    int i89 = f53864f + 61;
                    f53865g = i89 % 128;
                    int i90 = i89 % 2;
                    long[] jArr11 = attVar5.setLayoutAnimation;
                    atr.setOnFocusChangeListener(new Object[]{jArr11, jArr3, jArr11}, -253482889, 253482896, (int) System.currentTimeMillis());
                    int i91 = f53864f;
                    int i92 = (i91 & (-72)) | ((~i91) & 71);
                    int i93 = -(-((i91 & 71) << 1));
                    int i94 = (i92 ^ i93) + ((i93 & i92) << 1);
                    f53865g = i94 % 128;
                    int i95 = i94 % 2;
                }
                if (jArr == null) {
                    int i96 = f53864f;
                    int i97 = ((i96 & 84) + (i96 | 84)) - 1;
                    int i98 = i97 % 128;
                    f53865g = i98;
                    int i99 = i97 % 2;
                    jArr4 = attVar.setLayoutAnimation;
                    int i100 = (i98 ^ 77) + ((i98 & 77) << 1);
                    f53864f = i100 % 128;
                    int i101 = i100 % 2;
                } else {
                    atr.setOnFocusChangeListener(new Object[]{attVar.setLayoutAnimation, jArr, jArr6}, -1143789774, 1143789783, (int) System.currentTimeMillis());
                    int i102 = f53865g + 51;
                    f53864f = i102 % 128;
                    int i103 = i102 % 2;
                    jArr4 = jArr6;
                }
                atr.setOnFocusChangeListener(new Object[]{jArr4, jArr10}, 1068960675, -1068960651, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{jArr10, jArr6}, 1843581176, -1843581157, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar4.setLayoutAnimation, attVar5.setLayoutAnimation, jArr6}, 1239421330, -1239421316, (int) System.currentTimeMillis());
                aty atyVar6 = new aty(x4, attVar4, new att(jArr6), new apk[]{attVar5});
                int i104 = f53865g;
                int i105 = (-2) - (((i104 ^ 10) + ((i104 & 10) << 1)) ^ (-1));
                f53864f = i105 % 128;
                if (i105 % 2 == 0) {
                    return atyVar6;
                }
                throw null;
            }
            atyVar = new aty(x4, new att(jArr9), atx.f53860h);
            int i106 = f53865g;
            int i107 = ((i106 | 65) << 1) - (((~i106) & 65) | (i106 & (-66)));
            f53864f = i107 % 128;
            if (i107 % 2 != 0) {
                obj = atyVar;
                int i108 = 24 / 0;
                obj = atyVar;
            }
        }
        obj = atyVar;
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, -1050029902, 1050029905, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, -1357811560, 1357811562, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, -255904819, 255904819, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, -1610195458, 1610195459, System.identityHashCode(this));
    }
}
