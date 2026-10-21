package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.databinding.f;

/* JADX INFO: loaded from: classes10.dex */
public final class aqh extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53584f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53585g = 1;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        char c10;
        apl aqhVar;
        int[] iArr;
        int i14;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        char c11;
        int[] iArr5;
        int[] iArr6;
        int i15;
        int i16;
        int i17;
        int[] iArr7;
        int i18 = ~i11;
        int i19 = (((~(i10 | i18 | i12)) | (~(i11 | (~i10)))) * 366) + (((~(i18 | i12)) | i10) * (-366)) + ((i10 | i11) * (-366)) + (i11 * 367) + (i10 * 367);
        if (i19 == 1) {
            aqh aqhVar2 = (aqh) objArr[0];
            int iIdentityHashCode = System.identityHashCode(aqhVar2);
            int i20 = ~iIdentityHashCode;
            int i21 = (2012734875 & i20) | ((-2012734876) & iIdentityHashCode);
            int i22 = 2012734875 & iIdentityHashCode;
            int i23 = ~((i22 & i21) | (i21 ^ i22));
            int i24 = i20 & (i20 | iIdentityHashCode);
            int i25 = (i24 & 1742144538) | ((~i24) & (-1742144539));
            int i26 = i24 & (-1742144539);
            int i27 = (i26 & i25) | (i25 ^ i26);
            int i28 = i27 ^ (-2008475012);
            int i29 = i27 & (-2008475012);
            int i30 = ~((i29 & i28) | (i28 ^ i29));
            int i31 = -(-(((i30 & i23) | (i23 ^ i30)) * (-318)));
            int i32 = ((((1750603251 ^ i31) | (1750603251 & i31)) << 1) - (~(-((i31 & (-1750603252)) | (1750603251 & (~i31)))))) - 1;
            int i33 = ~(((-1742144539) ^ iIdentityHashCode) | ((-1742144539) & iIdentityHashCode));
            int i34 = 4259864 & i33;
            int i35 = (i33 | 4259864) & (~i34);
            int i36 = -(-(((i35 & i34) | (i35 ^ i34)) * (-318)));
            int i37 = (i32 | i36) << 1;
            int i38 = -((i36 & (~i32)) | ((~i36) & i32));
            int i39 = (i37 & i38) + (i38 | i37);
            int i40 = iIdentityHashCode | 1742144538;
            int i41 = ~i40;
            int i42 = (i40 | i41) & i41;
            int i43 = 2008475011 & i42;
            int i44 = (i42 | 2008475011) & (~i43);
            int i45 = ((i44 & i43) | (i44 ^ i43)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
            int i46 = i39 & i45;
            int i47 = (i45 ^ i39) | i46;
            int i48 = (i46 & i47) + (i47 | i46);
            int i49 = ~System.identityHashCode(aqhVar2);
            int i50 = (i49 | (-1865039237)) & (-556719432);
            int i51 = (~i50) & ((-556408069) | i49);
            int i52 = (~((i50 & i51) | (i51 ^ i50))) * 52;
            int i53 = (((1186361751 ^ i52) | (1186361751 & i52)) << 1) - ((i52 & (-1186361752)) | (1186361751 & (~i52)));
            int i54 = (556719431 & i49) | (556719431 ^ i49);
            int i55 = ~i54;
            int i56 = (i54 | i55) & i55;
            int i57 = (i56 & 1308631168) | ((-1308631169) & i56) | ((~i56) & 1308631168);
            int i58 = ~(((-1865039237) & i49) | (i49 ^ (-1865039237)));
            int i59 = i57 & i58;
            int i60 = (i58 | i57) & (~i59);
            int i61 = ((i60 & i59) | (i60 ^ i59)) * (-52);
            int i62 = i53 & i61;
            int i63 = ((i53 ^ i61) | i62) << 1;
            int i64 = -((i61 | i53) & (~i62));
            int i65 = (i63 & i64) + (i64 | i63);
            int i66 = 1865039236 & i49;
            int i67 = (i49 | 1865039236) & (~i66);
            int i68 = (i67 & i66) | (i67 ^ i66);
            int i69 = ~i68;
            int i70 = (i68 | i69) & i69;
            int i71 = i70 ^ 311363;
            int i72 = i70 & 311363;
            int i73 = ((i72 & i71) | (i71 ^ i72)) * 52;
            if (i48 > ((i65 | i73) << 1) - (i73 ^ i65)) {
                aqhVar2.setIncludeFontPadding();
                throw null;
            }
            if (!aqhVar2.setIncludeFontPadding()) {
                aph x4 = aqhVar2.setX();
                aqp aqpVar = (aqp) aqhVar2.setOnFocusChangeListener;
                if (aqpVar.setOnDragListener()) {
                    int i74 = f53585g + 87;
                    f53584f = i74 % 128;
                    int i75 = i74 % 2;
                    apl y7 = x4.setY();
                    if (i75 != 0) {
                        int i76 = 55 / 0;
                    }
                    System.identityHashCode(aqhVar2);
                    System.identityHashCode(aqhVar2);
                    return y7;
                }
                aqp aqpVar2 = (aqp) aqhVar2.setX;
                aqp aqpVar3 = (aqp) aqhVar2.setY[0];
                int[] iArr8 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aql.setOnFocusChangeListener(new Object[]{aqpVar.setOnDragListener, iArr8}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                int[] iArr9 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aql.setOnFocusChangeListener(new Object[]{iArr8, iArr9}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                int[] iArr10 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                aql.setOnFocusChangeListener(new Object[]{aqpVar2.setOnDragListener, iArr10}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                int iIntValue = ((Integer) auz.setDividerPadding(new Object[]{iArr10, iArr10, iArr10}, 1240095778, -1240095774, (int) System.currentTimeMillis())).intValue();
                aql.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue), iArr10}, -1349954837, 1349954842, iIntValue);
                aql.setOnFocusChangeListener(new Object[]{iArr8, aqpVar2.setOnDragListener, iArr8}, -257166289, 257166290, (int) System.currentTimeMillis());
                int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr8, 0}, -841558252, 841558293, 5)).intValue();
                aql.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue2), iArr8}, -1349954837, 1349954842, iIntValue2);
                int[] iArr11 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr9, 0, iArr11}, -1850727291, 1850727294, 5)).intValue();
                aqp aqpVarE = f.e(new Object[]{Integer.valueOf(iIntValue3), iArr11}, -1349954837, 1349954842, iIntValue3, iArr9);
                aql.setOnFocusChangeListener(new Object[]{iArr10, aqpVarE.setOnDragListener}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                int[] iArr12 = aqpVarE.setOnDragListener;
                aql.setOnFocusChangeListener(new Object[]{iArr12, iArr8, iArr12}, -491159146, 491159155, (int) System.currentTimeMillis());
                int[] iArr13 = aqpVarE.setOnDragListener;
                aqp aqpVarE2 = f.e(new Object[]{iArr13, iArr8, iArr13}, -491159146, 491159155, (int) System.currentTimeMillis(), iArr8);
                aql.setOnFocusChangeListener(new Object[]{iArr8, aqpVarE.setOnDragListener, aqpVarE2.setOnDragListener}, -491159146, 491159155, (int) System.currentTimeMillis());
                int[] iArr14 = aqpVarE2.setOnDragListener;
                aql.setOnFocusChangeListener(new Object[]{iArr14, iArr10, iArr14}, -257166289, 257166290, (int) System.currentTimeMillis());
                int[] iArr15 = aqpVarE2.setOnDragListener;
                aqp aqpVarE3 = f.e(new Object[]{iArr15, iArr11, iArr15}, -491159146, 491159155, (int) System.currentTimeMillis(), iArr10);
                aql.setOnFocusChangeListener(new Object[]{aqpVar.setOnDragListener, aqpVarE3.setOnDragListener}, -646817109, 646817112, (int) System.currentTimeMillis());
                if (aqpVar3.getNavBarTitleString()) {
                    i13 = 1;
                    c10 = 0;
                } else {
                    int i77 = f53585g;
                    int i78 = ((i77 | 67) << 1) - (i77 ^ 67);
                    f53584f = i78 % 128;
                    if (i78 % 2 != 0) {
                        int[] iArr16 = aqpVarE3.setOnDragListener;
                        aql.setOnFocusChangeListener(new Object[]{iArr16, aqpVar3.setOnDragListener, iArr16}, -257166289, 257166290, (int) System.currentTimeMillis());
                        throw null;
                    }
                    int[] iArr17 = aqpVarE3.setOnDragListener;
                    c10 = 0;
                    i13 = 1;
                    aql.setOnFocusChangeListener(new Object[]{iArr17, aqpVar3.setOnDragListener, iArr17}, -257166289, 257166290, (int) System.currentTimeMillis());
                }
                apk[] apkVarArr = new apk[i13];
                apkVarArr[c10] = aqpVarE3;
                aqhVar2 = new aqh(x4, aqpVarE, aqpVarE2, apkVarArr);
                int i79 = f53584f;
                int i80 = i79 & 51;
                int i81 = ((i79 ^ 51) | i80) << i13;
                int i82 = -((i79 | 51) & (~i80));
                int i83 = (i81 ^ i82) + ((i82 & i81) << i13);
                f53585g = i83 % 128;
                int i84 = i83 % 2;
            } else {
                int i85 = f53585g;
                int i86 = ((i85 ^ 24) + ((i85 & 24) << 1)) - 1;
                f53584f = i86 % 128;
                int i87 = i86 % 2;
            }
            return aqhVar2;
        }
        if (i19 != 2) {
            aqh aqhVar3 = (aqh) objArr[0];
            aqhVar = (apl) objArr[1];
            int i88 = f53585g;
            int i89 = (i88 ^ 48) + ((i88 & 48) << 1);
            int i90 = (i89 ^ (-1)) + (i89 << 1);
            f53584f = i90 % 128;
            if (i90 % 2 != 0) {
                aqhVar3.setIncludeFontPadding();
                throw null;
            }
            if (!(!aqhVar3.setIncludeFontPadding())) {
                int i91 = f53584f;
                int i92 = (i91 ^ 53) + ((i91 & 53) << 1);
                f53585g = i92 % 128;
                if (i92 % 2 == 0) {
                    throw null;
                }
            } else {
                if (aqhVar.setIncludeFontPadding()) {
                    int i93 = f53584f;
                    int i94 = i93 & 67;
                    int i95 = (i93 ^ 67) | i94;
                    int i96 = (i94 & i95) + (i95 | i94);
                    int i97 = i96 % 128;
                    f53585g = i97;
                    int i98 = i96 % 2;
                    int i99 = i97 & 31;
                    int i100 = (i97 ^ 31) | i99;
                    int i101 = ((i99 | i100) << 1) - (i100 ^ i99);
                    f53584f = i101 % 128;
                    int i102 = i101 % 2;
                    return aqhVar3;
                }
                if (aqhVar3 == aqhVar) {
                    int i103 = f53584f;
                    int i104 = ((i103 ^ 83) | (i103 & 83)) << 1;
                    int i105 = -(((~i103) & 83) | (i103 & (-84)));
                    int i106 = (i104 & i105) + (i105 | i104);
                    f53585g = i106 % 128;
                    int i107 = i106 % 2;
                    apl onEditorActionListener = aqhVar3.setOnEditorActionListener();
                    int i108 = f53584f;
                    int i109 = (i108 & 107) + (i108 | 107);
                    f53585g = i109 % 128;
                    if (i109 % 2 != 0) {
                        return onEditorActionListener;
                    }
                    throw null;
                }
                aph x6 = aqhVar3.setX();
                aqp aqpVar4 = (aqp) aqhVar3.setX;
                aqp aqpVar5 = (aqp) aqhVar3.setOnFocusChangeListener;
                aqp aqpVar6 = (aqp) aqhVar.getNavBarTitleString();
                aqp aqpVar7 = (aqp) aqhVar.setNavigationOnClickListener();
                aqp aqpVar8 = (aqp) aqhVar3.setY[0];
                aqp aqpVar9 = (aqp) aqhVar.setY(0);
                int[] iArr18 = (int[]) auz.setDividerPadding(new Object[0], -529696917, 529696919, (int) System.currentTimeMillis());
                int[] iArr19 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                int[] iArr20 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                int[] iArr21 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                boolean navBarTitleString = aqpVar8.getNavBarTitleString();
                if (navBarTitleString) {
                    int i110 = f53584f;
                    int i111 = i110 & 93;
                    int i112 = (i110 ^ 93) | i111;
                    int i113 = (i111 & i112) + (i111 | i112);
                    f53585g = i113 % 128;
                    int i114 = i113 % 2;
                    int[] iArr22 = aqpVar6.setOnDragListener;
                    iArr3 = aqpVar7.setOnDragListener;
                    if (i114 == 0) {
                        int i115 = 80 / 0;
                    }
                    iArr = iArr21;
                    iArr2 = iArr22;
                    i14 = 1;
                } else {
                    aql.setOnFocusChangeListener(new Object[]{aqpVar8.setOnDragListener, iArr20}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                    aql.setOnFocusChangeListener(new Object[]{iArr20, aqpVar6.setOnDragListener, iArr19}, -257166289, 257166290, (int) System.currentTimeMillis());
                    iArr = iArr21;
                    aql.setOnFocusChangeListener(new Object[]{iArr20, aqpVar8.setOnDragListener, iArr20}, -257166289, 257166290, (int) System.currentTimeMillis());
                    i14 = 1;
                    aql.setOnFocusChangeListener(new Object[]{iArr20, aqpVar7.setOnDragListener, iArr20}, -257166289, 257166290, (int) System.currentTimeMillis());
                    int i116 = f53585g;
                    int i117 = (((i116 | 44) << 1) - (i116 ^ 44)) - 1;
                    f53584f = i117 % 128;
                    int i118 = i117 % 2;
                    iArr2 = iArr19;
                    iArr3 = iArr20;
                }
                boolean navBarTitleString2 = aqpVar9.getNavBarTitleString();
                if ((!navBarTitleString2) != i14) {
                    int i119 = f53585g;
                    int i120 = i119 & 21;
                    int i121 = (i119 | 21) & (~i120);
                    int i122 = i120 << i14;
                    int i123 = (i121 & i122) + (i121 | i122);
                    f53584f = i123 % 128;
                    if (i123 % 2 != 0) {
                        iArr7 = aqpVar4.setOnDragListener;
                        iArr5 = aqpVar5.setOnDragListener;
                        i17 = 0;
                        int i124 = 27 / 0;
                    } else {
                        i17 = 0;
                        iArr7 = aqpVar4.setOnDragListener;
                        iArr5 = aqpVar5.setOnDragListener;
                    }
                    iArr4 = iArr18;
                    i15 = i17;
                    iArr6 = iArr7;
                    c11 = 2;
                } else {
                    aql.setOnFocusChangeListener(new Object[]{aqpVar9.setOnDragListener, iArr}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                    aql.setOnFocusChangeListener(new Object[]{iArr, aqpVar4.setOnDragListener, iArr18}, -257166289, 257166290, (int) System.currentTimeMillis());
                    iArr4 = iArr18;
                    aql.setOnFocusChangeListener(new Object[]{iArr, aqpVar9.setOnDragListener, iArr}, -257166289, 257166290, (int) System.currentTimeMillis());
                    aql.setOnFocusChangeListener(new Object[]{iArr, aqpVar5.setOnDragListener, iArr}, -257166289, 257166290, (int) System.currentTimeMillis());
                    int i125 = f53585g;
                    int i126 = i125 & 93;
                    int i127 = (i125 ^ 93) | i126;
                    int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                    f53584f = i128 % 128;
                    c11 = 2;
                    int i129 = i128 % 2;
                    iArr5 = iArr;
                    iArr6 = iArr4;
                    i15 = 0;
                }
                int[] iArr23 = (int[]) auz.setDividerPadding(new Object[i15], -733151149, 733151160, (int) System.currentTimeMillis());
                Object[] objArr2 = new Object[3];
                objArr2[i15] = iArr6;
                objArr2[1] = iArr2;
                objArr2[c11] = iArr23;
                int[] iArr24 = iArr6;
                aql.setOnFocusChangeListener(objArr2, -491159146, 491159155, (int) System.currentTimeMillis());
                Object[] objArr3 = new Object[3];
                objArr3[i15] = iArr5;
                objArr3[1] = iArr3;
                objArr3[2] = iArr19;
                aql.setOnFocusChangeListener(objArr3, -491159146, 491159155, (int) System.currentTimeMillis());
                if (((Boolean) auz.setDividerPadding(new Object[]{iArr23}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue()) {
                    int i130 = f53585g;
                    int i131 = i130 & 57;
                    int i132 = (i130 | 57) & (~i131);
                    int i133 = -(-(i131 << 1));
                    int i134 = ((i132 | i133) << 1) - (i132 ^ i133);
                    f53584f = i134 % 128;
                    int i135 = i134 % 2;
                    if (((Boolean) auz.setDividerPadding(new Object[]{iArr19}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue()) {
                        int i136 = f53584f + 76;
                        int i137 = (i136 ^ (-1)) + (i136 << 1);
                        f53585g = i137 % 128;
                        int i138 = i137 % 2;
                        apl onEditorActionListener2 = aqhVar3.setOnEditorActionListener();
                        int i139 = f53584f + 123;
                        f53585g = i139 % 128;
                        if (i139 % 2 != 0) {
                            return onEditorActionListener2;
                        }
                        int i140 = 59 / 0;
                        return onEditorActionListener2;
                    }
                    aqhVar = x6.setY();
                    System.identityHashCode(aqhVar3);
                    System.identityHashCode(aqhVar3);
                } else {
                    aql.setOnFocusChangeListener(new Object[]{iArr23, iArr20}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                    int[] iArr25 = (int[]) auz.setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                    aql.setOnFocusChangeListener(new Object[]{iArr20, iArr23, iArr25}, -257166289, 257166290, (int) System.currentTimeMillis());
                    aql.setOnFocusChangeListener(new Object[]{iArr20, iArr24, iArr20}, -257166289, 257166290, (int) System.currentTimeMillis());
                    aql.setOnFocusChangeListener(new Object[]{iArr25, iArr25}, -2117483957, 2117483969, (int) System.currentTimeMillis());
                    auz.setDividerPadding(new Object[]{iArr5, iArr25, iArr4}, -751690120, 751690138, (int) System.currentTimeMillis());
                    int iIntValue4 = ((Integer) auz.setDividerPadding(new Object[]{iArr20, iArr20, iArr25}, 1240095778, -1240095774, (int) System.currentTimeMillis())).intValue();
                    aqp aqpVarE4 = f.e(new Object[]{Integer.valueOf(iIntValue4), iArr25}, -1349954837, 1349954842, iIntValue4, iArr);
                    aql.setOnFocusChangeListener(new Object[]{iArr19, aqpVarE4.setOnDragListener}, -1629487094, 1629487098, (int) System.currentTimeMillis());
                    int[] iArr26 = aqpVarE4.setOnDragListener;
                    aqp aqpVarE5 = f.e(new Object[]{iArr26, iArr25, iArr26}, -491159146, 491159155, (int) System.currentTimeMillis(), iArr25);
                    aql.setOnFocusChangeListener(new Object[]{iArr20, aqpVarE4.setOnDragListener, aqpVarE5.setOnDragListener}, -491159146, 491159155, (int) System.currentTimeMillis());
                    aql.setOnFocusChangeListener(new Object[]{aqpVarE5.setOnDragListener, iArr19, iArr4}, -1138809815, 1138809821, (int) System.currentTimeMillis());
                    aqp aqpVarE6 = f.e(new Object[]{iArr4, aqpVarE5.setOnDragListener}, -733608766, 733608780, (int) System.currentTimeMillis(), iArr23);
                    if (!navBarTitleString) {
                        int i141 = f53584f;
                        int i142 = i141 ^ 23;
                        int i143 = ((i141 & 23) | i142) << 1;
                        int i144 = -i142;
                        int i145 = ((i143 | i144) << 1) - (i143 ^ i144);
                        f53585g = i145 % 128;
                        int i146 = i145 % 2;
                        int[] iArr27 = aqpVarE6.setOnDragListener;
                        aql.setOnFocusChangeListener(new Object[]{iArr27, aqpVar8.setOnDragListener, iArr27}, -257166289, 257166290, (int) System.currentTimeMillis());
                        int i147 = f53585g;
                        int i148 = (i147 & 57) + (i147 | 57);
                        f53584f = i148 % 128;
                        int i149 = i148 % 2;
                    }
                    if (navBarTitleString2) {
                        i16 = 1;
                    } else {
                        int i150 = f53584f;
                        int i151 = ((i150 ^ 104) + ((i150 & 104) << 1)) - 1;
                        f53585g = i151 % 128;
                        int i152 = i151 % 2;
                        int[] iArr28 = aqpVarE6.setOnDragListener;
                        aql.setOnFocusChangeListener(new Object[]{iArr28, aqpVar9.setOnDragListener, iArr28}, -257166289, 257166290, (int) System.currentTimeMillis());
                        int i153 = f53585g;
                        int i154 = (i153 & 16) + (i153 | 16);
                        i16 = 1;
                        int i155 = i154 - 1;
                        f53584f = i155 % 128;
                        int i156 = i155 % 2;
                    }
                    apk[] apkVarArr2 = new apk[i16];
                    apkVarArr2[0] = aqpVarE6;
                    aqhVar = new aqh(x6, aqpVarE4, aqpVarE5, apkVarArr2);
                    int i157 = f53585g;
                    int i158 = ((((i157 ^ 33) | (i157 & 33)) << 1) - (~(-(((~i157) & 33) | (i157 & (-34)))))) - 1;
                    f53584f = i158 % 128;
                    int i159 = i158 % 2;
                }
            }
        } else {
            aqhVar = (aqh) objArr[0];
            int i160 = f53585g;
            int i161 = (i160 & 49) + (i160 | 49);
            f53584f = i161 % 128;
            int i162 = i161 % 2;
            if (!aqhVar.setIncludeFontPadding()) {
                aqh aqhVar4 = new aqh(aqhVar.setDividerPadding, aqhVar.setX, aqhVar.setOnFocusChangeListener.setY(), aqhVar.setY);
                int i163 = f53584f;
                int i164 = (((i163 | 50) << 1) - (i163 ^ 50)) - 1;
                f53585g = i164 % 128;
                if (i164 % 2 != 0) {
                    return aqhVar4;
                }
                int i165 = 83 / 0;
                return aqhVar4;
            }
            int i166 = f53584f;
            int i167 = i166 & 65;
            int i168 = -(-((i166 ^ 65) | i167));
            int i169 = ((i167 | i168) << 1) - (i168 ^ i167);
            int i170 = i169 % 128;
            f53585g = i170;
            int i171 = i169 % 2;
            int i172 = i170 & 99;
            int i173 = (i172 - (~((i170 ^ 99) | i172))) - 1;
            f53584f = i173 % 128;
            int i174 = i173 % 2;
        }
        return aqhVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, -574252595, 574252597, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, -1055347146, 1055347147, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, -680905451, 680905451, System.identityHashCode(this));
    }
}
