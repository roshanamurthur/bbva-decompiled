package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;

/* JADX INFO: loaded from: classes10.dex */
public final class aqe extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53574f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53575g = 1;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        char c10;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int i16;
        char c11;
        int i17 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) + (i10 * (-520));
        int i18 = ~i10;
        int i19 = ((~(i18 | i11 | i12)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + i17;
        int i20 = ~(i10 | (~i11));
        int i21 = ((i20 | (~(i11 | (~i12) | i18))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i20 * (-1042)) + i19;
        if (i21 == 1) {
            aqe aqeVar = (aqe) objArr[0];
            int i22 = f53575g;
            int i23 = i22 & 21;
            int i24 = (i22 ^ 21) | i23;
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            f53574f = i25 % 128;
            int i26 = i25 % 2;
            if (!aqeVar.setIncludeFontPadding()) {
                aqe aqeVar2 = new aqe(aqeVar.setDividerPadding, aqeVar.setX, aqeVar.setOnFocusChangeListener.setY(), aqeVar.setY);
                int i27 = f53575g;
                int i28 = i27 & 5;
                int i29 = (i28 - (~(-(-((i27 ^ 5) | i28))))) - 1;
                f53574f = i29 % 128;
                int i30 = i29 % 2;
                return aqeVar2;
            }
            int i31 = f53574f;
            int i32 = (i31 ^ 23) + ((i31 & 23) << 1);
            int i33 = i32 % 128;
            f53575g = i33;
            if (i32 % 2 == 0) {
                throw null;
            }
            int i34 = i33 + 38;
            int i35 = (i34 ^ (-1)) + (i34 << 1);
            f53574f = i35 % 128;
            if (i35 % 2 == 0) {
                return aqeVar;
            }
            throw null;
        }
        if (i21 == 2) {
            aqe aqeVar3 = (aqe) objArr[0];
            int i36 = f53575g;
            int i37 = ((i36 | 89) << 1) - (i36 ^ 89);
            f53574f = i37 % 128;
            int i38 = i37 % 2;
            if (!aqeVar3.setIncludeFontPadding()) {
                aph x4 = aqeVar3.setX();
                aqd aqdVar = (aqd) aqeVar3.setOnFocusChangeListener;
                if (aqdVar.setOnDragListener()) {
                    int i39 = f53574f;
                    int i40 = (((i39 & (-120)) | ((~i39) & 119)) - (~(-(-((i39 & 119) << 1))))) - 1;
                    f53575g = i40 % 128;
                    if (i40 % 2 == 0) {
                        x4.setY();
                        throw null;
                    }
                    apl y7 = x4.setY();
                    int i41 = f53574f + 107;
                    f53575g = i41 % 128;
                    int i42 = i41 % 2;
                    return y7;
                }
                aqd aqdVar2 = (aqd) aqeVar3.setX;
                aqd aqdVar3 = (aqd) aqeVar3.setY[0];
                int[] iArr5 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                int[] iArr6 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                int[] iArr7 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar.setOnDragListener, iArr7}, 171882311, -171882296, (int) System.currentTimeMillis());
                int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{iArr7, iArr8}, 171882311, -171882296, (int) System.currentTimeMillis());
                boolean navBarTitleString = aqdVar3.getNavBarTitleString();
                int[] iArr9 = aqdVar3.setOnDragListener;
                if (navBarTitleString) {
                    i14 = 2;
                } else {
                    int i43 = f53575g;
                    int i44 = i43 & 101;
                    int i45 = i44 + ((i43 ^ 101) | i44);
                    f53574f = i45 % 128;
                    int i46 = i45 % 2;
                    aqa.setX(new Object[]{iArr9, iArr6}, 171882311, -171882296, (int) System.currentTimeMillis());
                    int i47 = f53575g;
                    int i48 = (i47 & 9) + (i47 | 9);
                    f53574f = i48 % 128;
                    i14 = 2;
                    int i49 = i48 % 2;
                    iArr9 = iArr6;
                }
                Object[] objArr2 = new Object[3];
                objArr2[0] = aqdVar2.setOnDragListener;
                objArr2[1] = iArr9;
                objArr2[i14] = iArr5;
                aqa.setX(objArr2, 1561294226, -1561294226, (int) System.currentTimeMillis());
                Object[] objArr3 = new Object[3];
                objArr3[0] = aqdVar2.setOnDragListener;
                objArr3[1] = iArr9;
                objArr3[i14] = iArr6;
                aqa.setX(objArr3, 1656767316, -1656767306, (int) System.currentTimeMillis());
                Object[] objArr4 = new Object[3];
                objArr4[0] = iArr6;
                objArr4[1] = iArr5;
                objArr4[i14] = iArr6;
                aqa.setX(objArr4, -1040559401, 1040559406, (int) System.currentTimeMillis());
                Object[] objArr5 = new Object[3];
                objArr5[0] = iArr6;
                objArr5[1] = iArr6;
                objArr5[i14] = iArr6;
                int iIntValue = ((Integer) avf.setX(objArr5, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
                Object[] objArr6 = new Object[i14];
                objArr6[0] = Integer.valueOf(iIntValue);
                objArr6[1] = iArr6;
                aqa.setX(objArr6, 878708821, -878708813, iIntValue);
                int[] iArr10 = aqdVar2.setOnDragListener;
                Object[] objArr7 = new Object[3];
                objArr7[0] = iArr7;
                objArr7[1] = iArr10;
                objArr7[i14] = iArr7;
                aqa.setX(objArr7, -1040559401, 1040559406, (int) System.currentTimeMillis());
                Object[] objArr8 = new Object[3];
                objArr8[0] = 8;
                objArr8[1] = iArr7;
                objArr8[i14] = 0;
                int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(objArr8, -841558252, 841558293, 8)).intValue();
                Object[] objArr9 = new Object[i14];
                objArr9[0] = Integer.valueOf(iIntValue2);
                objArr9[1] = iArr7;
                aqa.setX(objArr9, 878708821, -878708813, iIntValue2);
                Object[] objArr10 = new Object[4];
                objArr10[0] = 8;
                objArr10[1] = iArr8;
                objArr10[i14] = 0;
                objArr10[3] = iArr5;
                int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(objArr10, -1850727291, 1850727294, 8)).intValue();
                Object[] objArr11 = new Object[i14];
                objArr11[0] = Integer.valueOf(iIntValue3);
                objArr11[1] = iArr5;
                aqa.setX(objArr11, 878708821, -878708813, iIntValue3);
                aqd aqdVar4 = new aqd(iArr8);
                int[] iArr11 = aqdVar4.setOnDragListener;
                Object[] objArr12 = new Object[i14];
                objArr12[0] = iArr6;
                objArr12[1] = iArr11;
                aqa.setX(objArr12, 171882311, -171882296, (int) System.currentTimeMillis());
                int[] iArr12 = aqdVar4.setOnDragListener;
                Object[] objArr13 = new Object[3];
                objArr13[0] = iArr12;
                objArr13[1] = iArr7;
                objArr13[i14] = iArr12;
                aqa.setX(objArr13, 1561294226, -1561294226, (int) System.currentTimeMillis());
                int[] iArr13 = aqdVar4.setOnDragListener;
                Object[] objArr14 = new Object[3];
                objArr14[0] = iArr13;
                objArr14[1] = iArr7;
                objArr14[i14] = iArr13;
                aqa.setX(objArr14, 1561294226, -1561294226, (int) System.currentTimeMillis());
                aqd aqdVar5 = new aqd(iArr7);
                int[] iArr14 = aqdVar4.setOnDragListener;
                int[] iArr15 = aqdVar5.setOnDragListener;
                Object[] objArr15 = new Object[3];
                objArr15[0] = iArr7;
                objArr15[1] = iArr14;
                objArr15[i14] = iArr15;
                aqa.setX(objArr15, 1561294226, -1561294226, (int) System.currentTimeMillis());
                int[] iArr16 = aqdVar5.setOnDragListener;
                Object[] objArr16 = new Object[3];
                objArr16[0] = iArr16;
                objArr16[1] = iArr6;
                objArr16[i14] = iArr16;
                aqa.setX(objArr16, -1040559401, 1040559406, (int) System.currentTimeMillis());
                int[] iArr17 = aqdVar5.setOnDragListener;
                Object[] objArr17 = new Object[3];
                objArr17[0] = iArr17;
                objArr17[1] = iArr5;
                objArr17[i14] = iArr17;
                aqa.setX(objArr17, 1561294226, -1561294226, (int) System.currentTimeMillis());
                aqd aqdVar6 = new aqd(iArr6);
                int[] iArr18 = aqdVar.setOnDragListener;
                int[] iArr19 = aqdVar6.setOnDragListener;
                Object[] objArr18 = new Object[i14];
                objArr18[0] = iArr18;
                objArr18[1] = iArr19;
                aqa.setX(objArr18, 170840950, -170840941, (int) System.currentTimeMillis());
                if (!navBarTitleString) {
                    int i50 = f53574f;
                    int i51 = ((((i50 ^ 83) | (i50 & 83)) << 1) - (~(-(((~i50) & 83) | (i50 & (-84)))))) - 1;
                    f53575g = i51 % 128;
                    if (i51 % 2 == 0) {
                        int[] iArr20 = aqdVar6.setOnDragListener;
                        aqa.setX(new Object[]{iArr20, aqdVar3.setOnDragListener, iArr20}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        throw null;
                    }
                    int[] iArr21 = aqdVar6.setOnDragListener;
                    aqa.setX(new Object[]{iArr21, aqdVar3.setOnDragListener, iArr21}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                    int i52 = f53575g;
                    int i53 = i52 & 1;
                    int i54 = -(-((i52 ^ 1) | i53));
                    int i55 = ((i53 | i54) << 1) - (i54 ^ i53);
                    f53574f = i55 % 128;
                    int i56 = i55 % 2;
                    c10 = 0;
                    i15 = 1;
                } else {
                    i15 = 1;
                    c10 = 0;
                }
                apk[] apkVarArr = new apk[i15];
                apkVarArr[c10] = aqdVar6;
                aqeVar3 = new aqe(x4, aqdVar4, aqdVar5, apkVarArr);
                int i57 = f53575g;
                i13 = (((i57 ^ 121) | (i57 & 121)) << i15) - (((~i57) & 121) | (i57 & (-122)));
            } else {
                int i58 = f53574f;
                int i59 = (-2) - (((i58 ^ 52) + ((i58 & 52) << 1)) ^ (-1));
                int i60 = i59 % 128;
                f53575g = i60;
                if (i59 % 2 == 0) {
                    int i61 = 40 / 0;
                }
                i13 = i60 + 107;
            }
            f53574f = i13 % 128;
            int i62 = i13 % 2;
            return aqeVar3;
        }
        aqe aqeVar4 = (aqe) objArr[0];
        apl aplVar = (apl) objArr[1];
        int i63 = f53575g + 29;
        f53574f = i63 % 128;
        if (i63 % 2 != 0) {
            aqeVar4.setIncludeFontPadding();
            throw null;
        }
        if (aqeVar4.setIncludeFontPadding()) {
            int iIdentityHashCode = System.identityHashCode(aqeVar4);
            int i64 = ~iIdentityHashCode;
            int i65 = ~((2133001940 ^ i64) | (2133001940 & i64));
            int i66 = (-885501229) & iIdentityHashCode;
            int i67 = (~i66) & ((-885501229) | iIdentityHashCode);
            int i68 = ~((i66 & i67) | (i67 ^ i66));
            int i69 = i65 & i68;
            int i70 = 478199872 - (~(-(-((((i65 | i68) & (~i69)) | i69) * 959))));
            int i71 = (i70 ^ (-1144427564)) + (((-1144427564) & i70) << 1);
            int i72 = 2133001940 & iIdentityHashCode;
            int i73 = ~(((iIdentityHashCode | 2133001940) & (~i72)) | i72);
            int i74 = i64 & (-885501229);
            int i75 = (i64 | (-885501229)) & (~i74);
            int i76 = ~((i75 & i74) | (i75 ^ i74));
            int i77 = i73 & i76;
            int i78 = (i73 | i76) & (~i77);
            int i79 = -(-(((i78 & i77) | (i78 ^ i77)) * 959));
            int i80 = i71 ^ i79;
            int i81 = ((((i79 & i71) | i80) << 1) - (~(-i80))) - 1;
            int iIdentityHashCode2 = System.identityHashCode(aqeVar4);
            int i82 = (-1924558564) & iIdentityHashCode2;
            int i83 = (~i82) & ((-1924558564) | iIdentityHashCode2);
            int i84 = -(-(((i82 & i83) | (i83 ^ i82)) * 140));
            int i85 = (-1112678448) & i84;
            int i86 = ((i84 | (-1112678448)) & (~i85)) + (i85 << 1);
            int i87 = ~iIdentityHashCode2;
            int i88 = (i87 | iIdentityHashCode2) & i87;
            int i89 = i88 & (-1924558564);
            int i90 = (((-1924558564) | i88) & (~i89)) | i89;
            int i91 = ~i90;
            int i92 = (i90 | i91) & i91;
            int i93 = 1652950688 & i92;
            int i94 = (i92 | 1652950688) & (~i93);
            int i95 = ((i94 & i93) | (i94 ^ i93)) * (-280);
            int i96 = ((i86 | i95) << 1) - (i95 ^ i86);
            int i97 = i87 ^ (-343533660);
            int i98 = (-343533660) & i87;
            int i99 = ~((i98 & i97) | (i97 ^ i98));
            int i100 = ((~i99) & 71925784) | ((-71925785) & i99);
            int i101 = i99 & 71925784;
            int i102 = (i101 & i100) | (i100 ^ i101);
            int i103 = (-1652950689) & iIdentityHashCode2;
            int i104 = ((iIdentityHashCode2 | (-1652950689)) & (~i103)) | i103;
            int i105 = ~i104;
            int i106 = (i104 | i105) & i105;
            int i107 = ((~i106) & i102) | ((~i102) & i106);
            int i108 = i106 & i102;
            int i109 = ((i108 & i107) | (i107 ^ i108)) * 140;
            int i110 = (i96 | i109) << 1;
            int i111 = -((i109 & (~i96)) | ((~i109) & i96));
            if (i81 > ((i110 | i111) << 1) - (i111 ^ i110)) {
                int i112 = 67 / 0;
            }
            return aplVar;
        }
        if (aplVar.setIncludeFontPadding()) {
            int i113 = f53574f;
            int i114 = i113 + 125;
            f53575g = i114 % 128;
            int i115 = i114 % 2;
            int i116 = i113 ^ 29;
            int i117 = (((i113 & 29) | i116) << 1) - i116;
            f53575g = i117 % 128;
            if (i117 % 2 != 0) {
                return aqeVar4;
            }
            throw null;
        }
        if (aqeVar4 == aplVar) {
            int i118 = f53575g;
            int i119 = i118 & 89;
            int i120 = ((((i118 ^ 89) | i119) << 1) - (~(-((i118 | 89) & (~i119))))) - 1;
            f53574f = i120 % 128;
            int i121 = i120 % 2;
            apl onEditorActionListener = aqeVar4.setOnEditorActionListener();
            int i122 = f53575g + 59;
            f53574f = i122 % 128;
            int i123 = i122 % 2;
            return onEditorActionListener;
        }
        aph x6 = aqeVar4.setX();
        aqd aqdVar7 = (aqd) aqeVar4.setX;
        aqd aqdVar8 = (aqd) aqeVar4.setOnFocusChangeListener;
        aqd aqdVar9 = (aqd) aplVar.getNavBarTitleString();
        aqd aqdVar10 = (aqd) aplVar.setNavigationOnClickListener();
        aqd aqdVar11 = (aqd) aqeVar4.setY[0];
        aqd aqdVar12 = (aqd) aplVar.setY(0);
        int[] iArr22 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
        int[] iArr23 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        int[] iArr24 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        int[] iArr25 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        boolean navBarTitleString2 = aqdVar11.getNavBarTitleString();
        if (navBarTitleString2) {
            int i124 = f53574f;
            int i125 = (((i124 ^ 65) | (i124 & 65)) << 1) - ((i124 & (-66)) | ((~i124) & 65));
            f53575g = i125 % 128;
            if (i125 % 2 == 0) {
                int[] iArr26 = aqdVar9.setOnDragListener;
                int[] iArr27 = aqdVar10.setOnDragListener;
                throw null;
            }
            iArr2 = aqdVar9.setOnDragListener;
            iArr = aqdVar10.setOnDragListener;
            int i126 = (i124 ^ 9) + ((i124 & 9) << 1);
            f53575g = i126 % 128;
            int i127 = i126 % 2;
        } else {
            aqa.setX(new Object[]{aqdVar11.setOnDragListener, iArr24}, 171882311, -171882296, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr24, aqdVar9.setOnDragListener, iArr23}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr24, aqdVar11.setOnDragListener, iArr24}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr24, aqdVar10.setOnDragListener, iArr24}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            int i128 = f53574f;
            int i129 = ((i128 ^ 11) | (i128 & 11)) << 1;
            int i130 = -(((~i128) & 11) | (i128 & (-12)));
            int i131 = (i129 ^ i130) + ((i130 & i129) << 1);
            f53575g = i131 % 128;
            int i132 = i131 % 2;
            iArr = iArr24;
            iArr2 = iArr23;
        }
        boolean navBarTitleString3 = aqdVar12.getNavBarTitleString();
        if (!(!navBarTitleString3)) {
            int i133 = f53574f;
            int i134 = i133 & 119;
            int i135 = (i133 ^ 119) | i134;
            int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
            int i137 = i136 % 128;
            f53575g = i137;
            int i138 = i136 % 2;
            iArr4 = aqdVar7.setOnDragListener;
            iArr3 = aqdVar8.setOnDragListener;
            int i139 = ((((i137 ^ 87) | (i137 & 87)) << 1) - (~(-(((~i137) & 87) | (i137 & (-88)))))) - 1;
            f53574f = i139 % 128;
            int i140 = i139 % 2;
        } else {
            aqa.setX(new Object[]{aqdVar12.setOnDragListener, iArr25}, 171882311, -171882296, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr25, aqdVar7.setOnDragListener, iArr22}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr25, aqdVar12.setOnDragListener, iArr25}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr25, aqdVar8.setOnDragListener, iArr25}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            int i141 = (-2) - ((f53574f + 118) ^ (-1));
            f53575g = i141 % 128;
            int i142 = i141 % 2;
            iArr3 = iArr25;
            iArr4 = iArr22;
        }
        int[] iArr28 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
        aqa.setX(new Object[]{iArr4, iArr2, iArr28}, 1561294226, -1561294226, (int) System.currentTimeMillis());
        aqa.setX(new Object[]{iArr3, iArr, iArr23}, 1561294226, -1561294226, (int) System.currentTimeMillis());
        if (!((Boolean) avf.setX(new Object[]{iArr28}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
            aqa.setX(new Object[]{iArr28, iArr24}, 171882311, -171882296, (int) System.currentTimeMillis());
            int[] iArr29 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr24, iArr28, iArr29}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr24, iArr4, iArr24}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr29, iArr29}, -1165991312, 1165991325, (int) System.currentTimeMillis());
            avf.setX(new Object[]{iArr3, iArr29, iArr22}, -701222223, 701222256, (int) System.currentTimeMillis());
            int iIntValue4 = ((Integer) avf.setX(new Object[]{iArr24, iArr24, iArr29}, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
            aqa.setX(new Object[]{Integer.valueOf(iIntValue4), iArr29}, 878708821, -878708813, iIntValue4);
            aqd aqdVar13 = new aqd(iArr25);
            aqa.setX(new Object[]{iArr23, aqdVar13.setOnDragListener}, 171882311, -171882296, (int) System.currentTimeMillis());
            int[] iArr30 = aqdVar13.setOnDragListener;
            aqa.setX(new Object[]{iArr30, iArr29, iArr30}, 1561294226, -1561294226, (int) System.currentTimeMillis());
            aqd aqdVar14 = new aqd(iArr29);
            aqa.setX(new Object[]{iArr24, aqdVar13.setOnDragListener, aqdVar14.setOnDragListener}, 1561294226, -1561294226, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{aqdVar14.setOnDragListener, iArr23, iArr22}, -148253694, 148253701, (int) System.currentTimeMillis());
            aqa.setX(new Object[]{iArr22, aqdVar14.setOnDragListener}, -1800460062, 1800460064, (int) System.currentTimeMillis());
            aqd aqdVar15 = new aqd(iArr28);
            if (!navBarTitleString2) {
                int i143 = f53574f;
                int i144 = (i143 ^ 19) + ((i143 & 19) << 1);
                f53575g = i144 % 128;
                int i145 = i144 % 2;
                int[] iArr31 = aqdVar15.setOnDragListener;
                aqa.setX(new Object[]{iArr31, aqdVar11.setOnDragListener, iArr31}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                int i146 = f53575g;
                int i147 = i146 & 81;
                int i148 = (i147 - (~((i146 ^ 81) | i147))) - 1;
                f53574f = i148 % 128;
                int i149 = i148 % 2;
            }
            if (navBarTitleString3) {
                i16 = 1;
                c11 = 0;
            } else {
                int i150 = f53574f;
                int i151 = (i150 & 45) - (~(i150 | 45));
                i16 = 1;
                int i152 = i151 - 1;
                f53575g = i152 % 128;
                if (i152 % 2 == 0) {
                    int[] iArr32 = aqdVar15.setOnDragListener;
                    aqa.setX(new Object[]{iArr32, aqdVar12.setOnDragListener, iArr32}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                    throw null;
                }
                int[] iArr33 = aqdVar15.setOnDragListener;
                c11 = 0;
                aqa.setX(new Object[]{iArr33, aqdVar12.setOnDragListener, iArr33}, -1040559401, 1040559406, (int) System.currentTimeMillis());
            }
            apk[] apkVarArr2 = new apk[i16];
            apkVarArr2[c11] = aqdVar15;
            aqe aqeVar5 = new aqe(x6, aqdVar13, aqdVar14, apkVarArr2);
            int i153 = f53574f;
            int i154 = i153 & 79;
            int i155 = (i153 ^ 79) | i154;
            int i156 = ((i154 | i155) << 1) - (i155 ^ i154);
            f53575g = i156 % 128;
            int i157 = i156 % 2;
            return aqeVar5;
        }
        int iIdentityHashCode3 = System.identityHashCode(aqeVar4);
        int i158 = ~iIdentityHashCode3;
        int i159 = 450290347 & i158;
        int i160 = (450290347 | i158) & (~i159);
        int i161 = (i160 & i159) | (i160 ^ i159);
        int i162 = ~i161;
        int i163 = (i161 | i162) & i162;
        int i164 = 1219490158 & i158;
        int i165 = (iIdentityHashCode3 & (-1219490159)) | i164 | (1219490158 & iIdentityHashCode3);
        int i166 = ~i165;
        int i167 = (i165 | i166) & i166;
        int i168 = ((i163 & i167) | (i163 ^ i167)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
        int i169 = (-1692594389) & i168;
        int i170 = -(-((i168 ^ (-1692594389)) | i169));
        int i171 = (i158 & (-1219490159)) | ((~i158) & 1219490158);
        int i172 = (i171 & i164) | (i171 ^ i164);
        int i173 = i172 & (-450290348);
        int i174 = (i172 | (-450290348)) & (~i173);
        int i175 = ~((i174 & i173) | (i174 ^ i173));
        int i176 = ~((iIdentityHashCode3 & (-1076433221)) | ((-1076433221) ^ iIdentityHashCode3));
        int i177 = ((((i169 | i170) << 1) - (i170 ^ i169)) - (~(-(-(((i176 & i175) | (((~i176) & i175) | ((~i175) & i176))) * ErrorCodes.ERR_CRY_IO_PROPERTIES))))) - 1;
        int iIdentityHashCode4 = System.identityHashCode(aqeVar4);
        int i178 = ~iIdentityHashCode4;
        int i179 = (iIdentityHashCode4 | i178) & i178;
        int i180 = ~i179;
        int i181 = ((-1569729314) & i180) | (i179 & 1569729313);
        int i182 = (-1569729314) & i179;
        int i183 = (i181 & i182) | (i181 ^ i182);
        int i184 = i183 ^ (-1550746662);
        int i185 = i183 & (-1550746662);
        int i186 = (i185 & i184) | (i184 ^ i185);
        int i187 = ~i186;
        int i188 = (i186 | i187) & i187;
        int i189 = 1550746661 & i178;
        int i190 = (~i189) & (1550746661 | i178);
        int i191 = (i190 ^ i189) | (i190 & i189);
        int i192 = i191 & 1569729313;
        int i193 = (~i192) & (i191 | 1569729313);
        int i194 = ~((i193 & i192) | (i193 ^ i192));
        int i195 = i188 & i194;
        int i196 = (i194 | i188) & (~i195);
        int i197 = -(-(((i196 & i195) | (i196 ^ i195)) * (-184)));
        int i198 = (821142163 ^ i197) + ((i197 & 821142163) << 1);
        int i199 = ~((i178 & (-1569729314)) | ((~i178) & (-1569729314)) | (i178 & 1569729313));
        int i200 = 26225408 & i199;
        int i201 = ((i199 | 26225408) & (~i200)) | i200;
        int i202 = (i180 & 1550746661) | (i179 & (-1550746662));
        int i203 = i179 & 1550746661;
        int i204 = ~((i203 & i202) | (i202 ^ i203));
        int i205 = i201 & i204;
        int i206 = (i204 | i201) & (~i205);
        int i207 = -(-(((i206 & i205) | (i206 ^ i205)) * 184));
        int i208 = i198 & i207;
        if (i177 > (i208 + ((i207 ^ i198) | i208)) - 1332667288) {
            ((Boolean) avf.setX(new Object[]{iArr23}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        if (!((Boolean) avf.setX(new Object[]{iArr23}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
            apl y10 = x6.setY();
            int i209 = f53574f + 3;
            f53575g = i209 % 128;
            if (i209 % 2 != 0) {
                return y10;
            }
            throw null;
        }
        apl onEditorActionListener2 = aqeVar4.setOnEditorActionListener();
        int i210 = f53574f;
        int i211 = i210 & 91;
        int i212 = ((((i210 ^ 91) | i211) << 1) - (~(-((i210 | 91) & (~i211))))) - 1;
        f53575g = i212 % 128;
        if (i212 % 2 != 0) {
            return onEditorActionListener2;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 2028132241, -2028132240, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1949591295, -1949591293, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, aplVar}, -724335709, 724335709, System.identityHashCode(this));
    }
}
