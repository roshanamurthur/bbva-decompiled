package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class arg extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53667f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53668g = 1;

    /* JADX WARN: Code duplicated, block: B:100:0x092c  */
    /* JADX WARN: Code duplicated, block: B:102:0x093d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0952  */
    /* JADX WARN: Code duplicated, block: B:74:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:76:0x060c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0623  */
    /* JADX WARN: Code duplicated, block: B:79:0x0628  */
    /* JADX WARN: Code duplicated, block: B:81:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:83:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:85:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:90:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:92:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:93:0x08db  */
    /* JADX WARN: Code duplicated, block: B:98:0x092a  */
    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        arg argVar;
        int i13;
        int i14;
        int i15;
        aph x4;
        arf arfVar;
        arf arfVar2;
        int[] iArr;
        boolean navBarTitleString;
        int[] iArr2;
        arf arfVar3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int[] iArr3;
        int[] iArr4;
        arf arfVar4;
        char c10;
        int[] iArr5;
        int[] iArr6;
        int i21;
        int i22 = ~i10;
        int i23 = ~(i22 | i11);
        int i24 = ~i11;
        int i25 = ((i12 | i23 | (~(i24 | i10))) * 614) + (i11 * (-613)) + (i10 * 615);
        int i26 = ~i12;
        int i27 = (((~(i10 | i26 | i11)) | (~(i22 | i24 | i26))) * 614) + (((~(i22 | i26)) | i23 | (~(i26 | i11))) * (-1228)) + i25;
        if (i27 == 1) {
            argVar = (arg) objArr[0];
            int i28 = f53668g;
            int i29 = i28 ^ 109;
            int i30 = ((i28 & 109) | i29) << 1;
            int i31 = -i29;
            int i32 = (i30 & i31) + (i30 | i31);
            f53667f = i32 % 128;
            int i33 = i32 % 2;
            boolean includeFontPadding = argVar.setIncludeFontPadding();
            if (i33 != 0) {
                int i34 = 46 / 0;
                if (includeFontPadding) {
                    int i35 = f53667f;
                    i14 = ((i35 | 59) << 1) - (i35 ^ 59);
                    int i36 = i14 % 128;
                    f53668g = i36;
                    if (i14 % 2 == 0) {
                        int i37 = 39 / 0;
                    }
                    int i38 = i36 | 113;
                    i15 = (i38 << 1) - ((~(i36 & 113)) & i38);
                    f53667f = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i39 = 2 / 0;
                    }
                } else {
                    i13 = 1;
                    x4 = argVar.setX();
                    arfVar = (arf) argVar.setOnFocusChangeListener;
                    if (arfVar.setOnDragListener()) {
                        int i40 = f53668g;
                        i20 = (((i40 | 42) << i13) - (i40 ^ 42)) - 1;
                        f53667f = i20 % 128;
                        if (i20 % 2 == 0) {
                            x4.setY();
                            throw null;
                        }
                        apl y7 = x4.setY();
                        int i41 = f53668g;
                        int i42 = i41 ^ 67;
                        int i43 = (((i41 & 67) | i42) << 1) - i42;
                        f53667f = i43 % 128;
                        int i44 = i43 % 2;
                        return y7;
                    }
                    arf arfVar5 = (arf) argVar.setX;
                    arfVar2 = (arf) argVar.setY[0];
                    int[] iArr7 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    iArr = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    int[] iArr8 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{arfVar.setLayoutAnimation, iArr8}, -779819085, 779819085, (int) System.currentTimeMillis());
                    int[] iArr9 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr8, iArr9}, -779819085, 779819085, (int) System.currentTimeMillis());
                    navBarTitleString = arfVar2.getNavBarTitleString();
                    iArr2 = arfVar2.setLayoutAnimation;
                    if (!navBarTitleString) {
                        i19 = (-2) - ((f53667f + 18) ^ (-1));
                        f53668g = i19 % 128;
                        if (i19 % 2 != 0) {
                            ari.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -779819085, 779819085, (int) System.currentTimeMillis());
                            throw null;
                        }
                        ari.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -779819085, 779819085, (int) System.currentTimeMillis());
                        int i45 = f53668g;
                        int i46 = i45 & 1;
                        int i47 = (i45 | 1) & (~i46);
                        int i48 = i46 << 1;
                        int i49 = (i47 & i48) + (i47 | i48);
                        f53667f = i49 % 128;
                        int i50 = i49 % 2;
                        iArr2 = iArr;
                    }
                    ari.setOnFocusChangeListener(new Object[]{arfVar5.setLayoutAnimation, iArr2, iArr7}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{arfVar5.setLayoutAnimation, iArr2, iArr}, 250520891, -250520889, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr, iArr7, iArr}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int iIntValue = ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr}, -1985953730, 1985953735, (int) System.currentTimeMillis())).intValue();
                    ari.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue), iArr}, 133532328, -133532324, iIntValue);
                    ari.setOnFocusChangeListener(new Object[]{iArr8, arfVar5.setLayoutAnimation, iArr8}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr8, 0}, -841558252, 841558293, 7)).intValue();
                    ari.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue2), iArr8}, 133532328, -133532324, iIntValue2);
                    int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr9, 0, iArr7}, -1850727291, 1850727294, 7)).intValue();
                    ari.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue3), iArr7}, 133532328, -133532324, iIntValue3);
                    arf arfVar6 = new arf(iArr9);
                    ari.setOnFocusChangeListener(new Object[]{iArr, arfVar6.setLayoutAnimation}, -779819085, 779819085, (int) System.currentTimeMillis());
                    int[] iArr10 = arfVar6.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr10, iArr8, iArr10}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    int[] iArr11 = arfVar6.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr11, iArr8, iArr11}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    arf arfVar7 = new arf(iArr8);
                    ari.setOnFocusChangeListener(new Object[]{iArr8, arfVar6.setLayoutAnimation, arfVar7.setLayoutAnimation}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    int[] iArr12 = arfVar7.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr12, iArr, iArr12}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int[] iArr13 = arfVar7.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr13, iArr7, iArr13}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    arfVar3 = new arf(iArr);
                    ari.setOnFocusChangeListener(new Object[]{arfVar.setLayoutAnimation, arfVar3.setLayoutAnimation}, 1116618120, -1116618105, (int) System.currentTimeMillis());
                    if (!navBarTitleString) {
                        int i51 = f53667f;
                        i17 = (((i51 & (-124)) | ((~i51) & 123)) - (~((i51 & 123) << 1))) - 1;
                        f53668g = i17 % 128;
                        if (i17 % 2 == 0) {
                            int[] iArr14 = arfVar3.setLayoutAnimation;
                            ari.setOnFocusChangeListener(new Object[]{iArr14, arfVar2.setLayoutAnimation, iArr14}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                            int i52 = 15 / 0;
                            i18 = 1;
                        } else {
                            int[] iArr15 = arfVar3.setLayoutAnimation;
                            i18 = 1;
                            ari.setOnFocusChangeListener(new Object[]{iArr15, arfVar2.setLayoutAnimation, iArr15}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                        }
                        int i53 = f53667f;
                        int i54 = i53 ^ 105;
                        int i55 = -(-((i53 & 105) << i18));
                        int i56 = (i54 & i55) + (i55 | i54);
                        f53668g = i56 % 128;
                        int i57 = i56 % 2;
                    }
                    argVar = new arg(x4, arfVar6, arfVar7, new apk[]{arfVar3});
                    int i58 = f53668g;
                    i16 = ((i58 & 108) + (i58 | 108)) - 1;
                    f53667f = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                }
            } else {
                i13 = 1;
                if (!includeFontPadding) {
                    x4 = argVar.setX();
                    arfVar = (arf) argVar.setOnFocusChangeListener;
                    if (arfVar.setOnDragListener()) {
                        int i410 = f53668g;
                        i20 = (((i410 | 42) << i13) - (i410 ^ 42)) - 1;
                        f53667f = i20 % 128;
                        if (i20 % 2 == 0) {
                            x4.setY();
                            throw null;
                        }
                        apl y10 = x4.setY();
                        int i411 = f53668g;
                        int i412 = i411 ^ 67;
                        int i413 = (((i411 & 67) | i412) << 1) - i412;
                        f53667f = i413 % 128;
                        int i414 = i413 % 2;
                        return y10;
                    }
                    arf arfVar8 = (arf) argVar.setX;
                    arfVar2 = (arf) argVar.setY[0];
                    int[] iArr16 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    iArr = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    int[] iArr17 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{arfVar.setLayoutAnimation, iArr17}, -779819085, 779819085, (int) System.currentTimeMillis());
                    int[] iArr18 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr17, iArr18}, -779819085, 779819085, (int) System.currentTimeMillis());
                    navBarTitleString = arfVar2.getNavBarTitleString();
                    iArr2 = arfVar2.setLayoutAnimation;
                    if (!navBarTitleString) {
                        i19 = (-2) - ((f53667f + 18) ^ (-1));
                        f53668g = i19 % 128;
                        if (i19 % 2 != 0) {
                            ari.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -779819085, 779819085, (int) System.currentTimeMillis());
                            throw null;
                        }
                        ari.setOnFocusChangeListener(new Object[]{iArr2, iArr}, -779819085, 779819085, (int) System.currentTimeMillis());
                        int i415 = f53668g;
                        int i416 = i415 & 1;
                        int i417 = (i415 | 1) & (~i416);
                        int i418 = i416 << 1;
                        int i419 = (i417 & i418) + (i417 | i418);
                        f53667f = i419 % 128;
                        int i59 = i419 % 2;
                        iArr2 = iArr;
                    }
                    ari.setOnFocusChangeListener(new Object[]{arfVar8.setLayoutAnimation, iArr2, iArr16}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{arfVar8.setLayoutAnimation, iArr2, iArr}, 250520891, -250520889, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr, iArr16, iArr}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int iIntValue4 = ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr, iArr}, -1985953730, 1985953735, (int) System.currentTimeMillis())).intValue();
                    ari.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue4), iArr}, 133532328, -133532324, iIntValue4);
                    ari.setOnFocusChangeListener(new Object[]{iArr17, arfVar8.setLayoutAnimation, iArr17}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int iIntValue5 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr17, 0}, -841558252, 841558293, 7)).intValue();
                    ari.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue5), iArr17}, 133532328, -133532324, iIntValue5);
                    int iIntValue6 = ((Integer) auy.setOnFocusChangeListener(new Object[]{7, iArr18, 0, iArr16}, -1850727291, 1850727294, 7)).intValue();
                    ari.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue6), iArr16}, 133532328, -133532324, iIntValue6);
                    arf arfVar9 = new arf(iArr18);
                    ari.setOnFocusChangeListener(new Object[]{iArr, arfVar9.setLayoutAnimation}, -779819085, 779819085, (int) System.currentTimeMillis());
                    int[] iArr19 = arfVar9.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr19, iArr17, iArr19}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    int[] iArr110 = arfVar9.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr110, iArr17, iArr110}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    arf arfVar10 = new arf(iArr17);
                    ari.setOnFocusChangeListener(new Object[]{iArr17, arfVar9.setLayoutAnimation, arfVar10.setLayoutAnimation}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    int[] iArr111 = arfVar10.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr111, iArr, iArr111}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int[] iArr112 = arfVar10.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr112, iArr16, iArr112}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                    arfVar3 = new arf(iArr);
                    ari.setOnFocusChangeListener(new Object[]{arfVar.setLayoutAnimation, arfVar3.setLayoutAnimation}, 1116618120, -1116618105, (int) System.currentTimeMillis());
                    if (!navBarTitleString) {
                        int i510 = f53667f;
                        i17 = (((i510 & (-124)) | ((~i510) & 123)) - (~((i510 & 123) << 1))) - 1;
                        f53668g = i17 % 128;
                        if (i17 % 2 == 0) {
                            int[] iArr113 = arfVar3.setLayoutAnimation;
                            ari.setOnFocusChangeListener(new Object[]{iArr113, arfVar2.setLayoutAnimation, iArr113}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                            int i511 = 15 / 0;
                            i18 = 1;
                        } else {
                            int[] iArr114 = arfVar3.setLayoutAnimation;
                            i18 = 1;
                            ari.setOnFocusChangeListener(new Object[]{iArr114, arfVar2.setLayoutAnimation, iArr114}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                        }
                        int i512 = f53667f;
                        int i513 = i512 ^ 105;
                        int i514 = -(-((i512 & 105) << i18));
                        int i515 = (i513 & i514) + (i514 | i513);
                        f53668g = i515 % 128;
                        int i516 = i515 % 2;
                    }
                    argVar = new arg(x4, arfVar9, arfVar10, new apk[]{arfVar3});
                    int i517 = f53668g;
                    i16 = ((i517 & 108) + (i517 | 108)) - 1;
                    f53667f = i16 % 128;
                    if (i16 % 2 != 0) {
                        throw null;
                    }
                } else {
                    int i310 = f53667f;
                    i14 = ((i310 | 59) << 1) - (i310 ^ 59);
                    int i311 = i14 % 128;
                    f53668g = i311;
                    if (i14 % 2 == 0) {
                        int i312 = 39 / 0;
                    }
                    int i313 = i311 | 113;
                    i15 = (i313 << 1) - ((~(i311 & 113)) & i313);
                    f53667f = i15 % 128;
                    if (i15 % 2 != 0) {
                        int i314 = 2 / 0;
                    }
                }
            }
        } else {
            if (i27 != 2) {
                arg argVar2 = (arg) objArr[0];
                apl aplVar = (apl) objArr[1];
                int i60 = f53667f + 15;
                f53668g = i60 % 128;
                int i61 = i60 % 2;
                if (argVar2.setIncludeFontPadding()) {
                    int i62 = f53667f;
                    int i63 = (-2) - ((((i62 | 92) << 1) - (i62 ^ 92)) ^ (-1));
                    f53668g = i63 % 128;
                    if (i63 % 2 != 0) {
                        return aplVar;
                    }
                    throw null;
                }
                if (aplVar.setIncludeFontPadding()) {
                    int i64 = f53667f;
                    int i65 = i64 ^ 77;
                    int i66 = (((i64 & 77) | i65) << 1) - i65;
                    f53668g = i66 % 128;
                    if (i66 % 2 != 0) {
                        return argVar2;
                    }
                    throw null;
                }
                if (argVar2 == aplVar) {
                    int i67 = f53667f + 58;
                    int i68 = (i67 ^ (-1)) + (i67 << 1);
                    f53668g = i68 % 128;
                    int i69 = i68 % 2;
                    apl onEditorActionListener = argVar2.setOnEditorActionListener();
                    int i70 = f53667f;
                    int i71 = i70 & 35;
                    int i72 = (i71 - (~(-(-((i70 ^ 35) | i71))))) - 1;
                    f53668g = i72 % 128;
                    if (i72 % 2 != 0) {
                        return onEditorActionListener;
                    }
                    int i73 = 7 / 0;
                    return onEditorActionListener;
                }
                aph x6 = argVar2.setX();
                arf arfVar11 = (arf) argVar2.setX;
                arf arfVar12 = (arf) argVar2.setOnFocusChangeListener;
                arf arfVar13 = (arf) aplVar.getNavBarTitleString();
                arf arfVar14 = (arf) aplVar.setNavigationOnClickListener();
                arf arfVar15 = (arf) argVar2.setY[0];
                arf arfVar16 = (arf) aplVar.setY(0);
                int[] iArr20 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1039101633, 1039101643, (int) System.currentTimeMillis());
                int[] iArr21 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                int[] iArr22 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                int[] iArr23 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                boolean navBarTitleString2 = arfVar15.getNavBarTitleString();
                if (!navBarTitleString2) {
                    ari.setOnFocusChangeListener(new Object[]{arfVar15.setLayoutAnimation, iArr22}, -779819085, 779819085, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr22, arfVar13.setLayoutAnimation, iArr21}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr22, arfVar15.setLayoutAnimation, iArr22}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr22, arfVar14.setLayoutAnimation, iArr22}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int i74 = f53668g;
                    int i75 = i74 & 45;
                    int i76 = ((((i74 ^ 45) | i75) << 1) - (~(-((i74 | 45) & (~i75))))) - 1;
                    f53667f = i76 % 128;
                    int i77 = i76 % 2;
                    iArr3 = iArr21;
                    iArr4 = iArr22;
                } else {
                    int i78 = f53668g;
                    int i79 = i78 ^ 107;
                    int i80 = ((i78 & 107) | i79) << 1;
                    int i81 = -i79;
                    int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                    f53667f = i82 % 128;
                    if (i82 % 2 != 0) {
                        int[] iArr24 = arfVar13.setLayoutAnimation;
                        int[] iArr25 = arfVar14.setLayoutAnimation;
                        throw null;
                    }
                    iArr3 = arfVar13.setLayoutAnimation;
                    iArr4 = arfVar14.setLayoutAnimation;
                    int i83 = ((i78 & (-94)) | ((~i78) & 93)) + ((i78 & 93) << 1);
                    f53667f = i83 % 128;
                    int i84 = i83 % 2;
                }
                boolean navBarTitleString3 = arfVar16.getNavBarTitleString();
                if (navBarTitleString3) {
                    int i85 = f53668g;
                    int i86 = i85 + 85;
                    f53667f = i86 % 128;
                    int i87 = i86 % 2;
                    iArr5 = arfVar11.setLayoutAnimation;
                    int[] iArr26 = arfVar12.setLayoutAnimation;
                    int i88 = ((i85 ^ 37) - (~((i85 & 37) << 1))) - 1;
                    f53667f = i88 % 128;
                    int i89 = i88 % 2;
                    c10 = 2;
                    iArr6 = iArr26;
                    i21 = 0;
                    arfVar4 = arfVar16;
                } else {
                    arfVar4 = arfVar16;
                    ari.setOnFocusChangeListener(new Object[]{arfVar4.setLayoutAnimation, iArr23}, -779819085, 779819085, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr23, arfVar11.setLayoutAnimation, iArr20}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr23, arfVar4.setLayoutAnimation, iArr23}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    ari.setOnFocusChangeListener(new Object[]{iArr23, arfVar12.setLayoutAnimation, iArr23}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int i90 = f53667f;
                    int i91 = i90 & 95;
                    int i92 = -(-((i90 ^ 95) | i91));
                    int i93 = (i91 & i92) + (i92 | i91);
                    f53668g = i93 % 128;
                    c10 = 2;
                    int i94 = i93 % 2;
                    iArr5 = iArr20;
                    iArr6 = iArr23;
                    i21 = 0;
                }
                int[] iArr27 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[i21], -1111614385, 1111614387, (int) System.currentTimeMillis());
                Object[] objArr2 = new Object[3];
                objArr2[i21] = iArr5;
                objArr2[1] = iArr3;
                objArr2[c10] = iArr27;
                int[] iArr28 = iArr6;
                ari.setOnFocusChangeListener(objArr2, -1190829516, 1190829517, (int) System.currentTimeMillis());
                Object[] objArr3 = new Object[3];
                objArr3[i21] = iArr28;
                objArr3[1] = iArr4;
                objArr3[2] = iArr21;
                ari.setOnFocusChangeListener(objArr3, -1190829516, 1190829517, (int) System.currentTimeMillis());
                if (((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr27}, -1700010143, 1700010151, (int) System.currentTimeMillis())).booleanValue()) {
                    int i95 = f53667f + 5;
                    f53668g = i95 % 128;
                    int i96 = i95 % 2;
                    if (!((Boolean) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr21}, -1700010143, 1700010151, (int) System.currentTimeMillis())).booleanValue()) {
                        apl y11 = x6.setY();
                        int i97 = f53668g;
                        int i98 = i97 & 69;
                        int i99 = (i98 - (~(-(-((i97 ^ 69) | i98))))) - 1;
                        f53667f = i99 % 128;
                        if (i99 % 2 == 0) {
                            return y11;
                        }
                        int i100 = 2 / 0;
                        return y11;
                    }
                    int i101 = f53667f;
                    int i102 = ((i101 | 45) << 1) - (i101 ^ 45);
                    f53668g = i102 % 128;
                    int i103 = i102 % 2;
                    apl onEditorActionListener2 = argVar2.setOnEditorActionListener();
                    int i104 = f53668g;
                    int i105 = i104 & 5;
                    int i106 = ((i104 | 5) & (~i105)) + (i105 << 1);
                    f53667f = i106 % 128;
                    int i107 = i106 % 2;
                    return onEditorActionListener2;
                }
                ari.setOnFocusChangeListener(new Object[]{iArr27, iArr22}, -779819085, 779819085, (int) System.currentTimeMillis());
                int[] iArr29 = (int[]) avb.setCompoundDrawableTintBlendMode(new Object[0], -1111614385, 1111614387, (int) System.currentTimeMillis());
                ari.setOnFocusChangeListener(new Object[]{iArr22, iArr27, iArr29}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                ari.setOnFocusChangeListener(new Object[]{iArr22, iArr5, iArr22}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                ari.setOnFocusChangeListener(new Object[]{iArr29, iArr29}, -480701941, 480701951, (int) System.currentTimeMillis());
                avb.setCompoundDrawableTintBlendMode(new Object[]{iArr28, iArr29, iArr20}, 1112455082, -1112455081, (int) System.currentTimeMillis());
                int iIntValue7 = ((Integer) avb.setCompoundDrawableTintBlendMode(new Object[]{iArr22, iArr22, iArr29}, -1985953730, 1985953735, (int) System.currentTimeMillis())).intValue();
                ari.setOnFocusChangeListener(new Object[]{Integer.valueOf(iIntValue7), iArr29}, 133532328, -133532324, iIntValue7);
                arf arfVar17 = new arf(iArr23);
                ari.setOnFocusChangeListener(new Object[]{iArr21, arfVar17.setLayoutAnimation}, -779819085, 779819085, (int) System.currentTimeMillis());
                int[] iArr30 = arfVar17.setLayoutAnimation;
                ari.setOnFocusChangeListener(new Object[]{iArr30, iArr29, iArr30}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                arf arfVar18 = new arf(iArr29);
                ari.setOnFocusChangeListener(new Object[]{iArr22, arfVar17.setLayoutAnimation, arfVar18.setLayoutAnimation}, -1190829516, 1190829517, (int) System.currentTimeMillis());
                ari.setOnFocusChangeListener(new Object[]{arfVar18.setLayoutAnimation, iArr21, iArr20}, 2139494229, -2139494213, (int) System.currentTimeMillis());
                ari.setOnFocusChangeListener(new Object[]{iArr20, arfVar18.setLayoutAnimation}, 1402837881, -1402837870, (int) System.currentTimeMillis());
                arf arfVar19 = new arf(iArr27);
                if (!navBarTitleString2) {
                    int i108 = f53668g;
                    int i109 = i108 & 17;
                    int i110 = (i108 | 17) & (~i109);
                    int i111 = -(-(i109 << 1));
                    int i112 = (i110 & i111) + (i110 | i111);
                    f53667f = i112 % 128;
                    if (i112 % 2 != 0) {
                        int[] iArr31 = arfVar19.setLayoutAnimation;
                        ari.setOnFocusChangeListener(new Object[]{iArr31, arfVar15.setLayoutAnimation, iArr31}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                        throw null;
                    }
                    int[] iArr32 = arfVar19.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr32, arfVar15.setLayoutAnimation, iArr32}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int i113 = f53667f;
                    int i114 = i113 & 33;
                    int i115 = -(-(i113 | 33));
                    int i116 = ((i114 | i115) << 1) - (i115 ^ i114);
                    f53668g = i116 % 128;
                    int i117 = i116 % 2;
                }
                if (!navBarTitleString3) {
                    int i118 = f53668g;
                    int i119 = ((i118 & (-40)) | ((~i118) & 39)) + ((i118 & 39) << 1);
                    f53667f = i119 % 128;
                    int i120 = i119 % 2;
                    int[] iArr33 = arfVar19.setLayoutAnimation;
                    ari.setOnFocusChangeListener(new Object[]{iArr33, arfVar4.setLayoutAnimation, iArr33}, 1075082301, -1075082295, (int) System.currentTimeMillis());
                    int i121 = f53667f;
                    int i122 = (-2) - (((i121 & 120) + (i121 | 120)) ^ (-1));
                    f53668g = i122 % 128;
                    int i123 = i122 % 2;
                }
                arg argVar3 = new arg(x6, arfVar17, arfVar18, new apk[]{arfVar19});
                int i124 = f53667f;
                int i125 = ((((i124 ^ 67) | (i124 & 67)) << 1) - (~(-(((~i124) & 67) | (i124 & (-68)))))) - 1;
                f53668g = i125 % 128;
                int i126 = i125 % 2;
                return argVar3;
            }
            argVar = (arg) objArr[0];
            int i127 = f53667f + 107;
            f53668g = i127 % 128;
            int i128 = i127 % 2;
            if (!argVar.setIncludeFontPadding()) {
                arg argVar4 = new arg(argVar.setDividerPadding, argVar.setX, argVar.setOnFocusChangeListener.setY(), argVar.setY);
                int i129 = f53668g;
                int i130 = i129 & 81;
                int i131 = (i130 - (~((i129 ^ 81) | i130))) - 1;
                f53667f = i131 % 128;
                if (i131 % 2 == 0) {
                    return argVar4;
                }
                int i132 = 36 / 0;
                return argVar4;
            }
            int i133 = f53667f;
            int i134 = (((i133 | 8) << 1) - (i133 ^ 8)) - 1;
            int i135 = i134 % 128;
            f53668g = i135;
            if (i134 % 2 == 0) {
                throw null;
            }
            int i136 = (i135 & 69) + (i135 | 69);
            f53667f = i136 % 128;
            if (i136 % 2 != 0) {
                int i137 = 49 / 0;
            }
        }
        return argVar;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, 1802519573, -1802519571, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this}, -1514342067, 1514342068, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setCompoundDrawableTintBlendMode(new Object[]{this, aplVar}, 1373140747, -1373140747, System.identityHashCode(this));
    }
}
