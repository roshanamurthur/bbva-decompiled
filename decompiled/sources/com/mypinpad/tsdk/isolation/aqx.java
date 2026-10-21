package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.esotericsoftware.asm.Opcodes;

/* JADX INFO: loaded from: classes10.dex */
public final class aqx extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53631f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53632g = 1;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        aqx aqxVar;
        int i13;
        int[] iArr;
        int[] iArr2;
        aqq aqqVar;
        char c10;
        int[] iArr3;
        int[] iArr4;
        apl onEditorActionListener;
        int i14;
        int i15;
        int i16;
        char c11;
        int i17 = ~i10;
        int i18 = ~i11;
        int i19 = (~(i17 | i18)) | (~(i18 | i12));
        int i20 = ~(i11 | (~i12) | i10);
        int i21 = (((~(i10 | i18 | i12)) | i20) * 470) + ((i19 | i20) * (-470)) + ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i22 = 0;
        if (i21 == 1) {
            aqxVar = (aqx) objArr[0];
            int i23 = f53631f;
            int i24 = i23 & 69;
            int i25 = i24 + ((i23 ^ 69) | i24);
            f53632g = i25 % 128;
            if (i25 % 2 == 0) {
                aqxVar.setIncludeFontPadding();
                throw null;
            }
            if (!aqxVar.setIncludeFontPadding()) {
                aqx aqxVar2 = new aqx(aqxVar.setDividerPadding, aqxVar.setX, aqxVar.setOnFocusChangeListener.setY(), aqxVar.setY);
                int i26 = f53631f;
                int i27 = ((i26 & (-26)) | ((~i26) & 25)) + ((i26 & 25) << 1);
                f53632g = i27 % 128;
                if (i27 % 2 != 0) {
                    return aqxVar2;
                }
                throw null;
            }
            int i28 = f53632g + 59;
            int i29 = i28 % 128;
            f53631f = i29;
            if (i28 % 2 != 0) {
                throw null;
            }
            int i30 = i29 & 35;
            int i31 = i30 + ((i29 ^ 35) | i30);
            f53632g = i31 % 128;
            if (i31 % 2 == 0) {
                int i32 = 89 / 0;
            }
        } else {
            if (i21 != 2) {
                apl onEditorActionListener2 = (aqx) objArr[0];
                apl aplVar = (apl) objArr[1];
                int iIdentityHashCode = System.identityHashCode(onEditorActionListener2);
                int i33 = (2137609108 ^ iIdentityHashCode) | (2137609108 & iIdentityHashCode);
                int i34 = ~i33;
                int i35 = (i33 | i34) & i34;
                int i36 = (((-2133413074) ^ i35) | (i35 & (-2133413074))) * Opcodes.ATHROW;
                int i37 = (((-274353253) & (~i36)) | (i36 & 274353252)) + (((-274353253) & i36) << 1);
                int i38 = ~iIdentityHashCode;
                int i39 = ~((i38 & 2137609108) | (i38 ^ 2137609108));
                int i40 = ((-2137612246) & (~i39)) | (i39 & 2137612245);
                int i41 = (-2137612246) & i39;
                int i42 = -(-(((i40 ^ i41) | (i41 & i40)) * Opcodes.ATHROW));
                int i43 = i37 & i42;
                int i44 = -(-((i42 ^ i37) | i43));
                int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
                int iIdentityHashCode2 = System.identityHashCode(onEditorActionListener2);
                int i46 = ~iIdentityHashCode2;
                int i47 = i46 & (i46 | iIdentityHashCode2);
                int i48 = ((-2078158763) ^ i47) | ((-2078158763) & i47);
                int i49 = ~i48;
                int i50 = ((i48 | i49) & i49) * 979;
                int i51 = (1799745860 | i50) << 1;
                int i52 = -(((~i50) & 1799745860) | (i50 & (-1799745861)));
                int i53 = ((i51 | i52) << 1) - (i51 ^ i52);
                int i54 = (((-1215593290) ^ iIdentityHashCode2) | ((-1215593290) & iIdentityHashCode2)) * (-979);
                int i55 = ((~i54) & i53) | ((~i53) & i54);
                int i56 = -(-((i53 & i54) << 1));
                int i57 = (i55 & i56) + (i55 | i56);
                int i58 = ~((-2078158763) | iIdentityHashCode2);
                int i59 = i46 & (-1215593290);
                int i60 = (i46 | (-1215593290)) & (~i59);
                int i61 = (i58 | (~((i60 & i59) | (i60 ^ i59)))) * 979;
                if (i45 > (i57 ^ i61) + ((i61 & i57) << 1)) {
                    onEditorActionListener2.setIncludeFontPadding();
                    throw null;
                }
                if (onEditorActionListener2.setIncludeFontPadding()) {
                    int i62 = f53631f;
                    int i63 = (i62 & (-32)) | ((~i62) & 31);
                    int i64 = -(-((i62 & 31) << 1));
                    int i65 = (i63 & i64) + (i63 | i64);
                    f53632g = i65 % 128;
                    int i66 = i65 % 2;
                    int i67 = i62 ^ 45;
                    int i68 = ((i62 & 45) | i67) << 1;
                    int i69 = -i67;
                    int i70 = (i68 ^ i69) + ((i68 & i69) << 1);
                    f53632g = i70 % 128;
                    int i71 = i70 % 2;
                    return aplVar;
                }
                if (aplVar.setIncludeFontPadding()) {
                    int iIdentityHashCode3 = System.identityHashCode(onEditorActionListener2);
                    int i72 = ((-42104789) & iIdentityHashCode3) | ((-42104789) ^ iIdentityHashCode3);
                    int i73 = ~i72;
                    int i74 = (i72 | i73) & i73;
                    int i75 = 41973652 ^ i74;
                    int i76 = i74 & 41973652;
                    int i77 = -(-(((i76 & i75) | (i75 ^ i76)) * ReturnCode.ERR_CONN_IO));
                    int i78 = ((1006440594 | i77) << 1) - (i77 ^ 1006440594);
                    int i79 = ((~iIdentityHashCode3) & (-131137)) | (131136 & iIdentityHashCode3);
                    int i80 = iIdentityHashCode3 & (-131137);
                    int i81 = (~((i80 & i79) | (i79 ^ i80))) * (-1504);
                    int i82 = ((i78 | i81) << 1) - (i81 ^ i78);
                    int i83 = (i82 | (-901195424)) << 1;
                    int i84 = -((-901195424) ^ i82);
                    int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                    int iIdentityHashCode4 = System.identityHashCode(onEditorActionListener2);
                    int i86 = ~iIdentityHashCode4;
                    int i87 = i86 & (-932770683);
                    int i88 = ((~i86) & 932770682) | i87;
                    int i89 = 932770682 & i86;
                    int i90 = ~((i88 & i89) | (i88 ^ i89));
                    int i91 = 1220645088 & i90;
                    int i92 = (((i90 | 1220645088) & (~i91)) | i91) * (-865);
                    int i93 = 2044809546 & i92;
                    int i94 = ((2044809546 ^ i92) | i93) << 1;
                    int i95 = -((i92 | 2044809546) & (~i93));
                    int i96 = (i94 ^ i95) + ((i95 & i94) << 1);
                    int i97 = (-932770683) & iIdentityHashCode4;
                    int i98 = (~i97) & ((-932770683) | iIdentityHashCode4);
                    int i99 = (i97 & i98) | (i98 ^ i97);
                    int i100 = ~i99;
                    int i101 = (i96 - (~(-(~(-(-(((i99 | i100) & i100) * 865))))))) - 1;
                    int i102 = (i101 ^ (-1)) + (i101 << 1);
                    int i103 = (iIdentityHashCode4 | i86) & i86;
                    int i104 = ((~i103) & 1220645088) | ((-1220645089) & i103);
                    int i105 = i103 & 1220645088;
                    int i106 = ~((i105 & i104) | (i104 ^ i105));
                    int i107 = (i86 ^ (-932770683)) | i87;
                    int i108 = ~i107;
                    int i109 = (i107 | i108) & i108;
                    int i110 = i106 & i109;
                    int i111 = (i106 | i109) & (~i110);
                    int i112 = ((i111 & i110) | (i111 ^ i110)) * 865;
                    if (i85 > (i102 & i112) + (i112 | i102)) {
                        throw null;
                    }
                    int i113 = f53632g;
                    int i114 = i113 ^ 25;
                    int i115 = ((((i113 & 25) | i114) << 1) - (~(-i114))) - 1;
                    f53631f = i115 % 128;
                    if (i115 % 2 == 0) {
                        return onEditorActionListener2;
                    }
                    i13 = 73;
                    i22 = 0;
                } else {
                    if (onEditorActionListener2 != aplVar) {
                        aph x4 = onEditorActionListener2.setX();
                        aqq aqqVar2 = (aqq) onEditorActionListener2.setX;
                        aqq aqqVar3 = (aqq) onEditorActionListener2.setOnFocusChangeListener;
                        aqq aqqVar4 = (aqq) aplVar.getNavBarTitleString();
                        aqq aqqVar5 = (aqq) aplVar.setNavigationOnClickListener();
                        aqq aqqVar6 = (aqq) onEditorActionListener2.setY[0];
                        aqq aqqVar7 = (aqq) aplVar.setY(0);
                        int[] iArr5 = (int[]) auv.setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
                        int[] iArr6 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        int[] iArr7 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        int[] iArr8 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        boolean z10 = !aqqVar6.getNavBarTitleString();
                        if (!z10) {
                            int i116 = f53632g;
                            int i117 = i116 & 113;
                            int i118 = -(-((i116 ^ 113) | i117));
                            int i119 = (i117 ^ i118) + ((i118 & i117) << 1);
                            f53631f = i119 % 128;
                            if (i119 % 2 != 0) {
                                int[] iArr9 = aqqVar4.setOnDragListener;
                                int[] iArr10 = aqqVar5.setOnDragListener;
                                throw null;
                            }
                            iArr2 = aqqVar4.setOnDragListener;
                            iArr = aqqVar5.setOnDragListener;
                            int i120 = (i116 & 29) + (i116 | 29);
                            f53631f = i120 % 128;
                            int i121 = i120 % 2;
                        } else {
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar6.setOnDragListener, iArr7}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr7, aqqVar4.setOnDragListener, iArr6}, 414135046, -414135033, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr7, aqqVar6.setOnDragListener, iArr7}, 414135046, -414135033, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr7, aqqVar5.setOnDragListener, iArr7}, 414135046, -414135033, (int) System.currentTimeMillis());
                            int i122 = f53632g;
                            int i123 = i122 & 21;
                            int i124 = -(-((i122 ^ 21) | i123));
                            int i125 = (i123 & i124) + (i124 | i123);
                            f53631f = i125 % 128;
                            int i126 = i125 % 2;
                            iArr = iArr7;
                            iArr2 = iArr6;
                        }
                        int i127 = !aqqVar7.getNavBarTitleString() ? 1 : 0;
                        if (i127 != 1) {
                            int i128 = f53631f;
                            int i129 = ((i128 & (-14)) | ((~i128) & 13)) + ((i128 & 13) << 1);
                            f53632g = i129 % 128;
                            c10 = 2;
                            if (i129 % 2 == 0) {
                                int[] iArr11 = aqqVar2.setOnDragListener;
                                int[] iArr12 = aqqVar3.setOnDragListener;
                                throw null;
                            }
                            iArr4 = aqqVar2.setOnDragListener;
                            iArr3 = aqqVar3.setOnDragListener;
                            aqqVar = aqqVar7;
                        } else {
                            aqqVar = aqqVar7;
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar7.setOnDragListener, iArr8}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr8, aqqVar2.setOnDragListener, iArr5}, 414135046, -414135033, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr8, aqqVar.setOnDragListener, iArr8}, 414135046, -414135033, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr8, aqqVar3.setOnDragListener, iArr8}, 414135046, -414135033, (int) System.currentTimeMillis());
                            int i130 = f53631f + 116;
                            int i131 = (i130 ^ (-1)) + (i130 << 1);
                            f53632g = i131 % 128;
                            c10 = 2;
                            int i132 = i131 % 2;
                            iArr3 = iArr8;
                            iArr4 = iArr5;
                        }
                        int[] iArr13 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        Object[] objArr2 = new Object[3];
                        objArr2[0] = iArr4;
                        objArr2[1] = iArr2;
                        objArr2[c10] = iArr13;
                        int[] iArr14 = iArr4;
                        aqr.setCompoundDrawableTintBlendMode(objArr2, 2077221675, -2077221664, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr, iArr6}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                        if (!((Boolean) auv.setDividerPadding(new Object[]{iArr13}, -1281041716, 1281041721, (int) System.currentTimeMillis())).booleanValue()) {
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr13, iArr7}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                            int[] iArr15 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr7, iArr13, iArr15}, 414135046, -414135033, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr7, iArr14, iArr7}, 414135046, -414135033, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr15, iArr15}, -164590307, 164590308, (int) System.currentTimeMillis());
                            auv.setDividerPadding(new Object[]{iArr3, iArr15, iArr5}, 1843135733, -1843135721, (int) System.currentTimeMillis());
                            int iIntValue = ((Integer) auv.setDividerPadding(new Object[]{iArr7, iArr7, iArr15}, 2131517316, -2131517295, (int) System.currentTimeMillis())).intValue();
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue), iArr15}, 448806955, -448806940, iIntValue);
                            aqq aqqVar8 = new aqq(iArr8);
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr6, aqqVar8.setOnDragListener}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                            int[] iArr16 = aqqVar8.setOnDragListener;
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr16, iArr15, iArr16}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                            aqq aqqVar9 = new aqq(iArr15);
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr7, aqqVar8.setOnDragListener, aqqVar9.setOnDragListener}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar9.setOnDragListener, iArr6, iArr5}, -429793923, 429793931, (int) System.currentTimeMillis());
                            aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr5, aqqVar9.setOnDragListener}, -1276704570, 1276704575, (int) System.currentTimeMillis());
                            aqq aqqVar10 = new aqq(iArr13);
                            if (z10) {
                                int i133 = f53632g;
                                int i134 = (i133 & 9) + (i133 | 9);
                                f53631f = i134 % 128;
                                int i135 = i134 % 2;
                                int[] iArr17 = aqqVar10.setOnDragListener;
                                i16 = 1;
                                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr17, aqqVar6.setOnDragListener, iArr17}, 414135046, -414135033, (int) System.currentTimeMillis());
                                int i136 = f53632g;
                                int i137 = ((i136 ^ 46) + ((i136 & 46) << 1)) - 1;
                                f53631f = i137 % 128;
                                int i138 = i137 % 2;
                            } else {
                                i16 = 1;
                            }
                            if (i127 != i16) {
                                c11 = 0;
                            } else {
                                int i139 = f53632g;
                                int i140 = (i139 & 38) + (i139 | 38);
                                int i141 = (i140 ^ (-1)) + (i140 << i16);
                                f53631f = i141 % 128;
                                if (i141 % 2 != 0) {
                                    int[] iArr18 = aqqVar10.setOnDragListener;
                                    aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr18, aqqVar.setOnDragListener, iArr18}, 414135046, -414135033, (int) System.currentTimeMillis());
                                    throw null;
                                }
                                int[] iArr19 = aqqVar10.setOnDragListener;
                                int[] iArr20 = aqqVar.setOnDragListener;
                                Object[] objArr3 = new Object[3];
                                c11 = 0;
                                objArr3[0] = iArr19;
                                objArr3[i16] = iArr20;
                                objArr3[2] = iArr19;
                                aqr.setCompoundDrawableTintBlendMode(objArr3, 414135046, -414135033, (int) System.currentTimeMillis());
                            }
                            apk[] apkVarArr = new apk[i16];
                            apkVarArr[c11] = aqqVar10;
                            onEditorActionListener = new aqx(x4, aqqVar8, aqqVar9, apkVarArr);
                            int i142 = f53632g;
                            i14 = (i142 & (-62)) | ((~i142) & 61);
                            i15 = (i142 & 61) << 1;
                        } else {
                            int i143 = f53632g;
                            int i144 = i143 & 21;
                            int i145 = -(-((i143 ^ 21) | i144));
                            int i146 = ((i144 | i145) << 1) - (i145 ^ i144);
                            f53631f = i146 % 128;
                            int i147 = i146 % 2;
                            if (!((Boolean) auv.setDividerPadding(new Object[]{iArr6}, -1281041716, 1281041721, (int) System.currentTimeMillis())).booleanValue()) {
                                apl y7 = x4.setY();
                                int i148 = f53632g;
                                int i149 = i148 & 57;
                                int i150 = -(-((i148 ^ 57) | i149));
                                int i151 = (i149 ^ i150) + ((i150 & i149) << 1);
                                f53631f = i151 % 128;
                                if (i151 % 2 == 0) {
                                    return y7;
                                }
                                throw null;
                            }
                            int i152 = f53632g;
                            int i153 = i152 ^ 91;
                            int i154 = -(-((i152 & 91) << 1));
                            int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
                            f53631f = i155 % 128;
                            if (i155 % 2 != 0) {
                                onEditorActionListener2.setOnEditorActionListener();
                                throw null;
                            }
                            onEditorActionListener = onEditorActionListener2.setOnEditorActionListener();
                            int i156 = f53632g;
                            i14 = ((i156 ^ 23) | (i156 & 23)) << 1;
                            i15 = -(((~i156) & 23) | (i156 & (-24)));
                        }
                        int i157 = ((i14 | i15) << 1) - (i15 ^ i14);
                        f53631f = i157 % 128;
                        int i158 = i157 % 2;
                        return onEditorActionListener;
                    }
                    int i159 = f53631f;
                    int i160 = i159 & 87;
                    int i161 = (i159 | 87) & (~i160);
                    int i162 = -(-(i160 << 1));
                    int i163 = (i161 & i162) + (i161 | i162);
                    f53632g = i163 % 128;
                    if (i163 % 2 == 0) {
                        onEditorActionListener2.setOnEditorActionListener();
                        throw null;
                    }
                    onEditorActionListener2 = onEditorActionListener2.setOnEditorActionListener();
                    int i164 = f53632g;
                    int i165 = i164 & 115;
                    int i166 = (i164 ^ 115) | i165;
                    int i167 = ((i165 | i166) << 1) - (i166 ^ i165);
                    f53631f = i167 % 128;
                    if (i167 % 2 == 0) {
                        return onEditorActionListener2;
                    }
                    i13 = 74;
                }
                int i168 = i13 / i22;
                return onEditorActionListener2;
            }
            aqxVar = (aqx) objArr[0];
            int i169 = f53632g;
            int i170 = (i169 & 105) + (i169 | 105);
            f53631f = i170 % 128;
            if (i170 % 2 != 0) {
                aqxVar.setIncludeFontPadding();
                throw null;
            }
            if (!aqxVar.setIncludeFontPadding()) {
                aph x6 = aqxVar.setX();
                aqq aqqVar11 = (aqq) aqxVar.setOnFocusChangeListener;
                if (aqqVar11.setOnDragListener()) {
                    int i171 = f53631f;
                    int i172 = i171 & 55;
                    int i173 = (i172 - (~((i171 ^ 55) | i172))) - 1;
                    f53632g = i173 % 128;
                    int i174 = i173 % 2;
                    apl y10 = x6.setY();
                    if (i174 == 0) {
                        int i175 = 79 / 0;
                    }
                    int i176 = f53632g;
                    int i177 = ((i176 | 7) << 1) - (i176 ^ 7);
                    f53631f = i177 % 128;
                    int i178 = i177 % 2;
                    return y10;
                }
                aqq aqqVar12 = (aqq) aqxVar.setX;
                aqq aqqVar13 = (aqq) aqxVar.setY[0];
                int[] iArr21 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar11.setOnDragListener, iArr21}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                int[] iArr22 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr21, iArr22}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                int[] iArr23 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar12.setOnDragListener, iArr23}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                int iIntValue2 = ((Integer) auv.setDividerPadding(new Object[]{iArr23, iArr23, iArr23}, 2131517316, -2131517295, (int) System.currentTimeMillis())).intValue();
                aqr.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue2), iArr23}, 448806955, -448806940, iIntValue2);
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr21, aqqVar12.setOnDragListener, iArr21}, 414135046, -414135033, (int) System.currentTimeMillis());
                int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr21, 0}, -841558252, 841558293, 6)).intValue();
                aqr.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue3), iArr21}, 448806955, -448806940, iIntValue3);
                int[] iArr24 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                int iIntValue4 = ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr22, 0, iArr24}, -1850727291, 1850727294, 6)).intValue();
                aqr.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(iIntValue4), iArr24}, 448806955, -448806940, iIntValue4);
                aqq aqqVar14 = new aqq(iArr22);
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr23, aqqVar14.setOnDragListener}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                int[] iArr25 = aqqVar14.setOnDragListener;
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr25, iArr21, iArr25}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                int[] iArr26 = aqqVar14.setOnDragListener;
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr26, iArr21, iArr26}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                aqq aqqVar15 = new aqq(iArr21);
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr21, aqqVar14.setOnDragListener, aqqVar15.setOnDragListener}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                int[] iArr27 = aqqVar15.setOnDragListener;
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr27, iArr23, iArr27}, 414135046, -414135033, (int) System.currentTimeMillis());
                int[] iArr28 = aqqVar15.setOnDragListener;
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr28, iArr24, iArr28}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                aqq aqqVar16 = new aqq(iArr23);
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar11.setOnDragListener, aqqVar16.setOnDragListener}, 786843980, -786843971, (int) System.currentTimeMillis());
                if (!aqqVar13.getNavBarTitleString()) {
                    int i179 = f53632g;
                    int i180 = i179 ^ 19;
                    int i181 = (((i179 & 19) | i180) << 1) - i180;
                    f53631f = i181 % 128;
                    if (i181 % 2 != 0) {
                        int[] iArr29 = aqqVar16.setOnDragListener;
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr29, aqqVar13.setOnDragListener, iArr29}, 414135046, -414135033, (int) System.currentTimeMillis());
                        throw null;
                    }
                    int[] iArr30 = aqqVar16.setOnDragListener;
                    aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr30, aqqVar13.setOnDragListener, iArr30}, 414135046, -414135033, (int) System.currentTimeMillis());
                    int i182 = f53631f + 77;
                    f53632g = i182 % 128;
                    int i183 = i182 % 2;
                }
                aqxVar = new aqx(x6, aqqVar14, aqqVar15, new apk[]{aqqVar16});
                int i184 = f53631f;
                int i185 = ((i184 & (-90)) | ((~i184) & 89)) + ((i184 & 89) << 1);
                f53632g = i185 % 128;
                if (i185 % 2 == 0) {
                    throw null;
                }
            } else {
                int i186 = ~System.identityHashCode(aqxVar);
                int i187 = (-220762395) & i186;
                int i188 = ~(((-220762395) ^ i186) | i187);
                int i189 = 203984920 & i188;
                int i190 = (i188 | 203984920) & (~i189);
                int i191 = -(-(((i190 & i189) | (i190 ^ i189)) * (-241)));
                int i192 = ((-93668680) & i191) + (i191 | (-93668680));
                int i193 = i192 & (-902458782);
                int i194 = ((-902458782) | i192) & (~i193);
                int i195 = -(-(i193 << 1));
                int i196 = (i194 ^ i195) + ((i194 & i195) << 1);
                int i197 = (i186 & 220762394) | ((-220762395) & (~i186));
                int i198 = (i197 & i187) | (i197 ^ i187);
                int i199 = (50548034 & i198) | ((~i198) & (-50548035));
                int i200 = i198 & (-50548035);
                int i201 = ~((i200 & i199) | (i199 ^ i200));
                int i202 = ((~i201) & (-254532955)) | (254532954 & i201);
                int i203 = i201 & (-254532955);
                int i204 = -(-(((i203 & i202) | (i202 ^ i203)) * 241));
                int i205 = (((i196 | i204) << 1) - (~(-((i204 & (~i196)) | ((~i204) & i196))))) - 1;
                int iIdentityHashCode5 = System.identityHashCode(aqxVar);
                int i206 = 109283685 & iIdentityHashCode5;
                int i207 = (~i206) & (109283685 | iIdentityHashCode5);
                int i208 = (i206 & i207) | (i207 ^ i206);
                int i209 = (i208 & 4048215) | ((~i208) & (-4048216));
                int i210 = i208 & (-4048216);
                int i211 = (-2) - (((-1842010833) - (~(-(~(-(-(((i210 & i209) | (i209 ^ i210)) * (-627)))))))) ^ (-1));
                int i212 = (-109283686) & iIdentityHashCode5;
                int i213 = (~i212) & ((-109283686) | iIdentityHashCode5);
                int i214 = ~iIdentityHashCode5;
                int i215 = ~((i212 & i213) | (i213 ^ i212));
                int i216 = 4048215 & i215;
                int i217 = (i215 | 4048215) & (~i216);
                int i218 = -(-(((i217 & i216) | (i217 ^ i216)) * (-627)));
                int i219 = i211 & i218;
                int i220 = ((i211 ^ i218) | i219) << 1;
                int i221 = -((i211 | i218) & (~i219));
                int i222 = ((i220 | i221) << 1) - (i221 ^ i220);
                int i223 = (i214 | iIdentityHashCode5) & i214;
                int i224 = ((-109283686) & i223) | ((~i223) & 109283685);
                int i225 = 109283685 & i223;
                int i226 = ~((i225 & i224) | (i224 ^ i225));
                int i227 = 4048215 & iIdentityHashCode5;
                int i228 = ~(((iIdentityHashCode5 | 4048215) & (~i227)) | i227);
                int i229 = -(-(((i228 & i226) | (i226 ^ i228)) * 627));
                int i230 = i222 & i229;
                if (i205 <= i230 + ((i229 ^ i222) | i230)) {
                    int i231 = 80 / 0;
                }
                int i232 = f53631f;
                int i233 = i232 & 31;
                int i234 = (i232 ^ 31) | i233;
                int i235 = (i233 ^ i234) + ((i234 & i233) << 1);
                f53632g = i235 % 128;
                if (i235 % 2 == 0) {
                    throw null;
                }
            }
        }
        return aqxVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, -1003408401, 1003408402, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, 585512194, -585512192, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 1092064559, -1092064559, System.identityHashCode(this));
    }
}
