package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class api {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53491a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53492b = 1;

    public static boolean setCompoundDrawableTintBlendMode(aph aphVar) {
        return ((Boolean) setX(new Object[]{aphVar}, 784073018, -784073015, (int) System.currentTimeMillis())).booleanValue();
    }

    public static apl setOnFocusChangeListener(apl aplVar, BigInteger bigInteger) {
        return (apl) setX(new Object[]{aplVar, bigInteger}, 479453798, -479453793, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:73:0x036b  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object objUiMessageCallbackKtWhenMappings;
        boolean zBooleanValue;
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-368)) + (i11 * 185) + (i10 * (-183));
        int i15 = ~i11;
        int i16 = ~i12;
        boolean z10 = false;
        switch ((((~(i10 | i11)) | (~(i13 | i15)) | (~(i16 | i10))) * 184) + ((i10 | i15 | i16) * 184) + i14) {
            case 1:
                apk[] apkVarArr = (apk[]) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i17 = f53492b;
                int i18 = ((i17 ^ 110) + ((i17 & 110) << 1)) - 1;
                f53491a = i18 % 128;
                int i19 = i18 % 2;
                apk[] apkVarArr2 = new apk[iIntValue];
                apkVarArr2[0] = apkVarArr[0];
                int i20 = i17 & 95;
                int i21 = (((i17 | 95) & (~i20)) - (~(-(-(i20 << 1))))) - 1;
                f53491a = i21 % 128;
                int i22 = i21 % 2;
                int i23 = 0;
                while (true) {
                    int i24 = i23 + 1;
                    if (i24 >= iIntValue) {
                        apk navigationOnClickListener = apkVarArr2[i23].setNavigationOnClickListener();
                        int i25 = f53492b + 29;
                        f53491a = i25 % 128;
                        int i26 = i25 % 2;
                        while (i23 > 0) {
                            int i27 = f53492b;
                            int i28 = (((i27 | 24) << 1) - (i27 ^ 24)) - 1;
                            f53491a = i28 % 128;
                            int i29 = i28 % 2;
                            int i30 = i23 ^ 50;
                            int i31 = (i23 & 50) << 1;
                            int i32 = ((i30 & i31) + (i30 | i31)) - 51;
                            int i33 = i23 * 141;
                            int i34 = ~i23;
                            int i35 = ~((i34 | i23) & i34);
                            int i36 = i34 | iIntValue;
                            int i37 = ~i36;
                            int i38 = i35 ^ i37;
                            int i39 = i37 & i35;
                            int i40 = -(-(((i38 & i39) | (i38 ^ i39)) * (-280)));
                            int i41 = i33 & i40;
                            int i42 = (~i41) & (i40 | i33);
                            int i43 = -(-(i41 << 1));
                            int i44 = (i42 & i43) + (i42 | i43);
                            int i45 = i34 & iIntValue;
                            int i46 = (~i45) & i36;
                            int i47 = ~iIntValue;
                            int i48 = ~((i45 & i46) | (i46 ^ i45));
                            int i49 = ~(((-1) ^ iIntValue) | iIntValue);
                            int i50 = i48 & i49;
                            int i51 = (i48 | i49) & (~i50);
                            int i52 = ((i51 & i50) | (i51 ^ i50)) * 140;
                            int i53 = i44 & i52;
                            int i54 = (((i44 ^ i52) | i53) << 1) - ((i52 | i44) & (~i53));
                            int i55 = ~i34;
                            int i56 = i55 | i34;
                            int i57 = (i56 & iIntValue) | (i56 ^ iIntValue);
                            int i58 = ~i57;
                            int i59 = (i57 | i58) & i58;
                            int i60 = (i47 | iIntValue) & i47;
                            int i61 = (i55 & i60) | ((~i60) & i34);
                            int i62 = i60 & i34;
                            int i63 = ~((i61 & i62) | (i61 ^ i62));
                            int i64 = i59 ^ i63;
                            int i65 = i63 & i59;
                            int i66 = (i65 & i64) | (i64 ^ i65);
                            int i67 = ((-1) ^ i47) | i47;
                            int i68 = i67 & i23;
                            int i69 = ~(((i23 | i67) & (~i68)) | i68);
                            int i70 = i66 & i69;
                            int i71 = (i69 | i66) & (~i70);
                            int i72 = (((i71 & i70) | (i71 ^ i70)) * 140) + i54;
                            apk apkVar = apkVarArr[i72];
                            apkVarArr[i72] = apkVarArr2[i32].setCompoundDrawableTintBlendMode(navigationOnClickListener);
                            navigationOnClickListener = navigationOnClickListener.setCompoundDrawableTintBlendMode(apkVar);
                            int i73 = f53491a + 13;
                            f53492b = i73 % 128;
                            int i74 = i73 % 2;
                            i23 = i32;
                            z10 = false;
                        }
                        apkVarArr[z10 ? 1 : 0] = navigationOnClickListener;
                        int i75 = f53492b;
                        int i76 = i75 & 5;
                        int i77 = ((i75 ^ 5) | i76) << 1;
                        int i78 = -((i75 | 5) & (~i76));
                        int i79 = (i77 & i78) + (i78 | i77);
                        f53491a = i79 % 128;
                        if (i79 % 2 != 0) {
                            int i80 = 65 / 0;
                        }
                        return null;
                    }
                    int i81 = f53491a;
                    int i82 = i81 & 55;
                    int i83 = (i81 | 55) & (~i82);
                    int i84 = -(-(i82 << 1));
                    int i85 = (i83 & i84) + (i83 | i84);
                    f53492b = i85 % 128;
                    if (i85 % 2 == 0) {
                        apkVarArr2[i24] = apkVarArr2[i24 >>> 1].setCompoundDrawableTintBlendMode(apkVarArr[i24]);
                    } else {
                        apkVarArr2[i24] = apkVarArr2[i23].setCompoundDrawableTintBlendMode(apkVarArr[i24]);
                    }
                    int i86 = f53491a;
                    int i87 = (((i86 | 46) << 1) - (i86 ^ 46)) - 1;
                    f53492b = i87 % 128;
                    int i88 = i87 % 2;
                    i23 = i24;
                }
                break;
            case 2:
                aul aulVar = (aul) objArr[0];
                int i89 = f53492b;
                int i90 = (i89 & 71) + (i89 | 71);
                f53491a = i90 % 128;
                int i91 = i90 % 2;
                int dividerPadding = aulVar.setDividerPadding();
                if (i91 == 0 ? dividerPadding <= 1 : dividerPadding <= 0) {
                    int i92 = f53491a;
                    int i93 = i92 & 105;
                    int i94 = -(-((i92 ^ 105) | i93));
                    int i95 = (i93 & i94) + (i94 | i93);
                    f53492b = i95 % 128;
                    int i96 = i95 % 2;
                    objUiMessageCallbackKtWhenMappings = Boolean.FALSE;
                } else if (!aulVar.setY().equals(apj.setDividerPadding)) {
                    int i97 = f53491a;
                    int i98 = i97 & 105;
                    int i99 = -(-((i97 ^ 105) | i98));
                    int i910 = (i98 & i99) + (i99 | i98);
                    f53492b = i910 % 128;
                    int i911 = i910 % 2;
                    objUiMessageCallbackKtWhenMappings = Boolean.FALSE;
                } else {
                    int i100 = f53492b;
                    int i101 = i100 & 69;
                    int i102 = (i100 ^ 69) | i101;
                    int i103 = (i101 ^ i102) + ((i101 & i102) << 1);
                    f53491a = i103 % 128;
                    int i104 = i103 % 2;
                    if (!(aulVar instanceof auq)) {
                        int i912 = f53491a;
                        int i913 = i912 & 105;
                        int i914 = -(-((i912 ^ 105) | i913));
                        int i915 = (i913 & i914) + (i914 | i913);
                        f53492b = i915 % 128;
                        int i916 = i915 % 2;
                        objUiMessageCallbackKtWhenMappings = Boolean.FALSE;
                    } else {
                        int i105 = ((i100 ^ 21) | (i100 & 21)) << 1;
                        int i106 = -((i100 & (-22)) | ((~i100) & 21));
                        int i107 = (i105 ^ i106) + ((i105 & i106) << 1);
                        f53491a = i107 % 128;
                        int i108 = i107 % 2;
                        int i109 = ((i100 ^ 5) | (i100 & 5)) << 1;
                        int i110 = -(((~i100) & 5) | (i100 & (-6)));
                        int i111 = (i109 ^ i110) + ((i109 & i110) << 1);
                        f53491a = i111 % 128;
                        int i112 = i111 % 2;
                        objUiMessageCallbackKtWhenMappings = Boolean.TRUE;
                    }
                }
                break;
            case 3:
                aph aphVar = (aph) objArr[0];
                int i113 = f53492b;
                int i114 = ((i113 & 15) - (~(-(-(i113 | 15))))) - 1;
                f53491a = i114 % 128;
                if (i114 % 2 != 0) {
                    zBooleanValue = ((Boolean) setX(new Object[]{(aul) aph.setX(new Object[]{aphVar}, 444393625, -444393611, System.identityHashCode(aphVar))}, -146465815, 146465817, (int) System.currentTimeMillis())).booleanValue();
                    int i115 = 16 / 0;
                } else {
                    zBooleanValue = ((Boolean) setX(new Object[]{(aul) aph.setX(new Object[]{aphVar}, 444393625, -444393611, System.identityHashCode(aphVar))}, -146465815, 146465817, (int) System.currentTimeMillis())).booleanValue();
                }
                int i116 = f53492b;
                int i117 = i116 & 61;
                int i118 = ((i116 ^ 61) | i117) << 1;
                int i119 = -((i116 | 61) & (~i117));
                int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                f53491a = i120 % 128;
                int i121 = i120 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 4:
                aul aulVar2 = (aul) objArr[0];
                int i122 = f53492b;
                int i123 = i122 & 111;
                int i124 = i122 | 111;
                int i125 = (i123 & i124) + (i124 | i123);
                f53491a = i125 % 128;
                int i126 = i125 % 2;
                if (aulVar2.setDividerPadding() == 1) {
                    int i127 = f53492b;
                    int i128 = i127 + 23;
                    f53491a = i128 % 128;
                    int i129 = i128 % 2;
                    int i130 = i127 & 13;
                    int i131 = (i127 | 13) & (~i130);
                    int i132 = -(-(i130 << 1));
                    int i133 = (i131 & i132) + (i131 | i132);
                    f53491a = i133 % 128;
                    int i134 = i133 % 2;
                    objUiMessageCallbackKtWhenMappings = Boolean.TRUE;
                } else {
                    int i135 = f53492b;
                    int i136 = ((i135 | 63) << 1) - (i135 ^ 63);
                    f53491a = i136 % 128;
                    if (i136 % 2 != 0) {
                        throw null;
                    }
                    objUiMessageCallbackKtWhenMappings = Boolean.FALSE;
                }
                break;
            case 5:
                apl onEditorActionListener = (apl) objArr[0];
                BigInteger bigInteger = (BigInteger) objArr[1];
                int i137 = f53491a;
                int i138 = ((i137 ^ 79) | (i137 & 79)) << 1;
                int i139 = -(((~i137) & 79) | (i137 & (-80)));
                int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
                f53492b = i140 % 128;
                int i141 = i140 % 2;
                BigInteger bigIntegerAbs = bigInteger.abs();
                apl y7 = ((aph) apl.setOnFocusChangeListener(new Object[]{onEditorActionListener}, 498238248, -498238246, System.identityHashCode(onEditorActionListener))).setY();
                int iBitLength = bigIntegerAbs.bitLength();
                if (iBitLength > 0) {
                    int i142 = f53491a + 29;
                    f53492b = i142 % 128;
                    if (i142 % 2 != 0 ? bigIntegerAbs.testBit(0) : !(!bigIntegerAbs.testBit(0))) {
                        int i143 = f53491a;
                        int i144 = (((i143 ^ 105) | (i143 & 105)) << 1) - (((~i143) & 105) | (i143 & (-106)));
                        f53492b = i144 % 128;
                        if (i144 % 2 == 0) {
                            throw null;
                        }
                        y7 = onEditorActionListener;
                    }
                    int i145 = f53492b;
                    int i146 = ((i145 & 86) + (i145 | 86)) - 1;
                    f53491a = i146 % 128;
                    int i147 = i146 % 2;
                    int i148 = 1;
                    while (i148 < iBitLength) {
                        int i149 = f53491a;
                        int i150 = ((i149 | 49) << 1) - (i149 ^ 49);
                        f53492b = i150 % 128;
                        int i151 = i150 % 2;
                        onEditorActionListener = onEditorActionListener.setOnEditorActionListener();
                        if (bigIntegerAbs.testBit(i148)) {
                            int i152 = f53492b;
                            int i153 = i152 & 77;
                            int i154 = i152 | 77;
                            int i155 = ((i153 | i154) << 1) - (i154 ^ i153);
                            f53491a = i155 % 128;
                            if (i155 % 2 != 0) {
                                y7.setOnFocusChangeListener(onEditorActionListener);
                                throw null;
                            }
                            y7 = y7.setOnFocusChangeListener(onEditorActionListener);
                            int i156 = f53491a;
                            int i157 = (i156 | 1) << 1;
                            int i158 = -(((~i156) & 1) | (i156 & (-2)));
                            int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                            f53492b = i159 % 128;
                            int i160 = i159 % 2;
                        }
                        int i161 = i148 & 44;
                        int i162 = ((((i148 ^ 44) | i161) << 1) - ((i148 | 44) & (~i161))) - 42;
                        i148 = (i162 ^ (-1)) + (i162 << 1);
                        int i163 = f53492b;
                        int i164 = ((i163 ^ 96) + ((i163 & 96) << 1)) - 1;
                        f53491a = i164 % 128;
                        int i165 = i164 % 2;
                    }
                }
                if (bigInteger.signum() >= 0) {
                    int i166 = f53492b;
                    int i167 = (i166 & 21) + (i166 | 21);
                    f53491a = i167 % 128;
                    int i168 = i167 % 2;
                    return y7;
                }
                int i169 = f53491a;
                int i170 = (i169 & (-62)) | ((~i169) & 61);
                int i171 = (i169 & 61) << 1;
                int i172 = ((i170 | i171) << 1) - (i171 ^ i170);
                f53492b = i172 % 128;
                int i173 = i172 % 2;
                objUiMessageCallbackKtWhenMappings = y7.UiMessageCallbackKtWhenMappings();
                int i174 = f53492b;
                int i175 = ((i174 & 16) + (i174 | 16)) - 1;
                f53491a = i175 % 128;
                if (i175 % 2 != 0) {
                    throw null;
                }
                break;
            case 6:
                aph aphVar2 = (aph) objArr[0];
                int i176 = f53492b;
                int i177 = ((i176 ^ 98) + ((i176 & 98) << 1)) - 1;
                f53491a = i177 % 128;
                int i178 = i177 % 2;
                boolean zBooleanValue2 = ((Boolean) setX(new Object[]{(aul) aph.setX(new Object[]{aphVar2}, 444393625, -444393611, System.identityHashCode(aphVar2))}, -242622568, 242622572, (int) System.currentTimeMillis())).booleanValue();
                int i179 = f53491a;
                int i180 = (((i179 | 80) << 1) - (i179 ^ 80)) - 1;
                f53492b = i180 % 128;
                if (i180 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue2);
                }
                throw null;
            default:
                aph aphVar3 = (aph) objArr[0];
                apl aplVar = (apl) objArr[1];
                int i181 = f53492b;
                int i182 = (i181 ^ 67) + ((i181 & 67) << 1);
                f53491a = i182 % 128;
                if (i182 % 2 != 0) {
                    ((Boolean) aph.setX(new Object[]{aphVar3, (aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))}, 349213807, -349213802, System.identityHashCode(aphVar3))).booleanValue();
                    throw null;
                }
                if (!((Boolean) aph.setX(new Object[]{aphVar3, (aph) apl.setOnFocusChangeListener(new Object[]{aplVar}, 498238248, -498238246, System.identityHashCode(aplVar))}, 349213807, -349213802, System.identityHashCode(aphVar3))).booleanValue()) {
                    throw new IllegalArgumentException("Point must be on the same curve");
                }
                objUiMessageCallbackKtWhenMappings = aphVar3.setOnFocusChangeListener(aplVar);
                int i183 = f53491a;
                int i184 = ((i183 | 45) << 1) - (i183 ^ 45);
                f53492b = i184 % 128;
                if (i184 % 2 == 0) {
                    throw null;
                }
                break;
        }
        return objUiMessageCallbackKtWhenMappings;
    }

    public static apl setOnFocusChangeListener(aph aphVar, apl aplVar) {
        return (apl) setX(new Object[]{aphVar, aplVar}, -2091094345, 2091094345, (int) System.currentTimeMillis());
    }

    public static boolean setOnFocusChangeListener(aph aphVar) {
        return ((Boolean) setX(new Object[]{aphVar}, 2068174862, -2068174856, (int) System.currentTimeMillis())).booleanValue();
    }

    public static void setX(apk[] apkVarArr, int i10, apk apkVar) {
        setX(new Object[]{apkVarArr, Integer.valueOf(i10), apkVar}, -360518298, 360518299, i10);
    }
}
