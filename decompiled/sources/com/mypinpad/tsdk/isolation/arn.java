package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class arn extends apl.setX {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53691f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53692g = 1;

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        apl y7;
        int[] iArr;
        arj arjVar;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5;
        int[] iArr6;
        int i13 = ~i12;
        int i14 = ~(i13 | i10);
        int i15 = ~((~i10) | i11);
        int i16 = (((~(i10 | (~i11))) | i15 | i14) * 764) + (((~(i13 | i11)) | i15) * (-1528)) + ((i11 | i14) * 764) + (i11 * (-1527)) + (i10 * 765);
        if (i16 == 1) {
            y7 = (arn) objArr[0];
            int i17 = f53691f + 87;
            f53692g = i17 % 128;
            if (i17 % 2 == 0) {
                y7.setIncludeFontPadding();
                throw null;
            }
            if (!y7.setIncludeFontPadding()) {
                arn arnVar = new arn(y7.setDividerPadding, y7.setX, y7.setOnFocusChangeListener.setY(), y7.setY);
                int i18 = f53692g;
                int i19 = ((i18 & (-42)) | ((~i18) & 41)) + ((i18 & 41) << 1);
                f53691f = i19 % 128;
                if (i19 % 2 == 0) {
                    return arnVar;
                }
                throw null;
            }
            int i20 = f53691f;
            int i21 = (-2) - ((((i20 | 88) << 1) - (i20 ^ 88)) ^ (-1));
            f53692g = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
        } else {
            if (i16 != 2) {
                arn arnVar2 = (arn) objArr[0];
                int i22 = f53691f + 35;
                f53692g = i22 % 128;
                if (i22 % 2 == 0) {
                    arnVar2.setIncludeFontPadding();
                    throw null;
                }
                if (!(!arnVar2.setIncludeFontPadding())) {
                    int i23 = f53692g + 109;
                    int i24 = i23 % 128;
                    f53691f = i24;
                    int i25 = i23 % 2;
                    int i26 = i24 & 77;
                    int i27 = i26 + ((i24 ^ 77) | i26);
                    f53692g = i27 % 128;
                    int i28 = i27 % 2;
                    return arnVar2;
                }
                aph x4 = arnVar2.setX();
                arj arjVar2 = (arj) arnVar2.setOnFocusChangeListener;
                if (!(!arjVar2.setOnDragListener())) {
                    int i29 = f53691f;
                    int i30 = ((i29 ^ 79) | (i29 & 79)) << 1;
                    int i31 = -((79 & (~i29)) | (i29 & (-80)));
                    int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                    f53692g = i32 % 128;
                    int i33 = i32 % 2;
                    apl y10 = x4.setY();
                    int i34 = f53691f;
                    int i35 = (i34 ^ 50) + ((i34 & 50) << 1);
                    int i36 = (i35 ^ (-1)) + (i35 << 1);
                    f53692g = i36 % 128;
                    int i37 = i36 % 2;
                    return y10;
                }
                arj arjVar3 = (arj) arnVar2.setX;
                arj arjVar4 = (arj) arnVar2.setY[0];
                int[] iArr7 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
                int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar2.setNavigationOnClickListener, iArr8, iArr7}, 312842810, -312842799, (int) System.currentTimeMillis());
                int[] iArr9 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr8, iArr9, iArr7}, 312842810, -312842799, (int) System.currentTimeMillis());
                int[] iArr10 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar3.setNavigationOnClickListener, iArr10, iArr7}, 312842810, -312842799, (int) System.currentTimeMillis());
                int iIntValue = ((Integer) avf.setX(new Object[]{iArr10, iArr10, iArr10}, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
                arh.setY(new Object[]{Integer.valueOf(iIntValue), iArr10}, 655116825, -655116825, iIntValue);
                arh.setY(new Object[]{iArr8, arjVar3.setNavigationOnClickListener, iArr8, iArr7}, 126810060, -126810050, (int) System.currentTimeMillis());
                int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr8, 0}, -841558252, 841558293, 8)).intValue();
                arh.setY(new Object[]{Integer.valueOf(iIntValue2), iArr8}, 655116825, -655116825, iIntValue2);
                int[] iArr11 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                int iIntValue3 = ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr9, 0, iArr11}, -1850727291, 1850727294, 8)).intValue();
                arh.setY(new Object[]{Integer.valueOf(iIntValue3), iArr11}, 655116825, -655116825, iIntValue3);
                arj arjVar5 = new arj(iArr9);
                arh.setY(new Object[]{iArr10, arjVar5.setNavigationOnClickListener, iArr7}, 312842810, -312842799, (int) System.currentTimeMillis());
                int[] iArr12 = arjVar5.setNavigationOnClickListener;
                arh.setY(new Object[]{iArr12, iArr8, iArr12}, -141739096, 141739100, (int) System.currentTimeMillis());
                int[] iArr13 = arjVar5.setNavigationOnClickListener;
                arh.setY(new Object[]{iArr13, iArr8, iArr13}, -141739096, 141739100, (int) System.currentTimeMillis());
                arj arjVar6 = new arj(iArr8);
                arh.setY(new Object[]{iArr8, arjVar5.setNavigationOnClickListener, arjVar6.setNavigationOnClickListener}, -141739096, 141739100, (int) System.currentTimeMillis());
                int[] iArr14 = arjVar6.setNavigationOnClickListener;
                arh.setY(new Object[]{iArr14, iArr10, iArr14, iArr7}, 126810060, -126810050, (int) System.currentTimeMillis());
                int[] iArr15 = arjVar6.setNavigationOnClickListener;
                arh.setY(new Object[]{iArr15, iArr11, iArr15}, -141739096, 141739100, (int) System.currentTimeMillis());
                arj arjVar7 = new arj(iArr10);
                arh.setY(new Object[]{arjVar2.setNavigationOnClickListener, arjVar7.setNavigationOnClickListener}, -1100424883, 1100424895, (int) System.currentTimeMillis());
                if (!arjVar4.getNavBarTitleString()) {
                    int i38 = f53692g;
                    int i39 = (i38 & (-14)) | ((~i38) & 13);
                    int i40 = (i38 & 13) << 1;
                    int i41 = (i39 & i40) + (i40 | i39);
                    f53691f = i41 % 128;
                    int i42 = i41 % 2;
                    int[] iArr16 = arjVar7.setNavigationOnClickListener;
                    arh.setY(new Object[]{iArr16, arjVar4.setNavigationOnClickListener, iArr16, iArr7}, 126810060, -126810050, (int) System.currentTimeMillis());
                    System.identityHashCode(arnVar2);
                    System.identityHashCode(arnVar2);
                }
                arn arnVar3 = new arn(x4, arjVar5, arjVar6, new apk[]{arjVar7});
                int i43 = f53692g;
                int i44 = i43 & 109;
                int i45 = (i43 ^ 109) | i44;
                int i46 = (i44 & i45) + (i45 | i44);
                f53691f = i46 % 128;
                if (i46 % 2 == 0) {
                    return arnVar3;
                }
                throw null;
            }
            arn arnVar4 = (arn) objArr[0];
            apl aplVar = (apl) objArr[1];
            int i47 = f53692g + 75;
            f53691f = i47 % 128;
            int i48 = i47 % 2;
            if (arnVar4.setIncludeFontPadding()) {
                int i49 = f53692g + 61;
                int i50 = i49 % 128;
                f53691f = i50;
                int i51 = i49 % 2;
                int i52 = i50 & 93;
                int i53 = (((i50 | 93) & (~i52)) - (~(-(-(i52 << 1))))) - 1;
                f53692g = i53 % 128;
                if (i53 % 2 == 0) {
                    int i54 = 25 / 0;
                }
                return aplVar;
            }
            if (!(!aplVar.setIncludeFontPadding())) {
                int i55 = f53692g;
                int i56 = i55 & 37;
                int i57 = -(-((i55 ^ 37) | i56));
                int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
                int i59 = i58 % 128;
                f53691f = i59;
                int i60 = i58 % 2;
                int i61 = (i59 & (-52)) | ((~i59) & 51);
                int i62 = -(-((i59 & 51) << 1));
                int i63 = (i61 & i62) + (i62 | i61);
                f53692g = i63 % 128;
                if (i63 % 2 == 0) {
                    int i64 = 83 / 0;
                }
                return arnVar4;
            }
            if (arnVar4 == aplVar) {
                int i65 = f53691f;
                int i66 = ((i65 & 124) + (i65 | 124)) - 1;
                f53692g = i66 % 128;
                int i67 = i66 % 2;
                apl onEditorActionListener = arnVar4.setOnEditorActionListener();
                int i68 = f53691f + 113;
                f53692g = i68 % 128;
                int i69 = i68 % 2;
                return onEditorActionListener;
            }
            aph x6 = arnVar4.setX();
            arj arjVar8 = (arj) arnVar4.setX;
            arj arjVar9 = (arj) arnVar4.setOnFocusChangeListener;
            arj arjVar10 = (arj) aplVar.getNavBarTitleString();
            arj arjVar11 = (arj) aplVar.setNavigationOnClickListener();
            arj arjVar12 = (arj) arnVar4.setY[0];
            arj arjVar13 = (arj) aplVar.setY(0);
            int[] iArr17 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            int[] iArr18 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
            int[] iArr19 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            int[] iArr20 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            int[] iArr21 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            boolean navBarTitleString = arjVar12.getNavBarTitleString();
            if (!navBarTitleString) {
                arh.setY(new Object[]{arjVar12.setNavigationOnClickListener, iArr20, iArr17}, 312842810, -312842799, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr20, arjVar10.setNavigationOnClickListener, iArr19, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                iArr = iArr20;
                arh.setY(new Object[]{iArr20, arjVar12.setNavigationOnClickListener, iArr20, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                arjVar = arjVar12;
                arh.setY(new Object[]{iArr, arjVar11.setNavigationOnClickListener, iArr, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                int i70 = f53692g;
                int i71 = i70 & 79;
                int i72 = -(-((i70 ^ 79) | i71));
                int i73 = ((i71 | i72) << 1) - (i72 ^ i71);
                f53691f = i73 % 128;
                int i74 = i73 % 2;
                iArr2 = iArr19;
                iArr3 = iArr;
            } else {
                iArr = iArr20;
                arjVar = arjVar12;
                int i75 = f53692g;
                int i76 = i75 & 21;
                int i77 = ((i75 | 21) & (~i76)) + (i76 << 1);
                int i78 = i77 % 128;
                f53691f = i78;
                int i79 = i77 % 2;
                iArr2 = arjVar10.setNavigationOnClickListener;
                int[] iArr22 = arjVar11.setNavigationOnClickListener;
                int i80 = ((i78 & 68) + (i78 | 68)) - 1;
                f53692g = i80 % 128;
                int i81 = i80 % 2;
                iArr3 = iArr22;
            }
            boolean navBarTitleString2 = arjVar13.getNavBarTitleString();
            if (navBarTitleString2) {
                int i82 = f53691f;
                int i83 = ((i82 | 45) << 1) - ((45 & (~i82)) | (i82 & (-46)));
                int i84 = i83 % 128;
                f53692g = i84;
                int i85 = i83 % 2;
                int[] iArr23 = arjVar8.setNavigationOnClickListener;
                int[] iArr24 = arjVar9.setNavigationOnClickListener;
                int i86 = (i84 & 125) + (i84 | 125);
                f53691f = i86 % 128;
                int i87 = i86 % 2;
                iArr5 = iArr23;
                iArr6 = iArr24;
                iArr4 = iArr21;
            } else {
                iArr4 = iArr21;
                arh.setY(new Object[]{arjVar13.setNavigationOnClickListener, iArr21, iArr17}, 312842810, -312842799, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr4, arjVar8.setNavigationOnClickListener, iArr18, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr4, arjVar13.setNavigationOnClickListener, iArr4, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr4, arjVar9.setNavigationOnClickListener, iArr4, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                int i88 = f53691f;
                int i89 = ((i88 ^ 69) | (i88 & 69)) << 1;
                int i90 = -(((~i88) & 69) | (i88 & (-70)));
                int i91 = (i89 & i90) + (i90 | i89);
                f53692g = i91 % 128;
                int i92 = i91 % 2;
                iArr5 = iArr18;
                iArr6 = iArr4;
            }
            int[] iArr25 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
            arh.setY(new Object[]{iArr5, iArr2, iArr25}, -141739096, 141739100, (int) System.currentTimeMillis());
            arh.setY(new Object[]{iArr6, iArr3, iArr19}, -141739096, 141739100, (int) System.currentTimeMillis());
            if (!((Boolean) avf.setX(new Object[]{iArr25}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
                arh.setY(new Object[]{iArr25, iArr, iArr17}, 312842810, -312842799, (int) System.currentTimeMillis());
                int[] iArr26 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr, iArr25, iArr26, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr, iArr5, iArr, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr26, iArr26}, -556356765, 556356770, (int) System.currentTimeMillis());
                avf.setX(new Object[]{iArr6, iArr26, iArr18}, -701222223, 701222256, (int) System.currentTimeMillis());
                int iIntValue4 = ((Integer) avf.setX(new Object[]{iArr, iArr, iArr26}, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
                arh.setY(new Object[]{Integer.valueOf(iIntValue4), iArr26}, 655116825, -655116825, iIntValue4);
                arj arjVar14 = new arj(iArr4);
                arh.setY(new Object[]{iArr19, arjVar14.setNavigationOnClickListener, iArr17}, 312842810, -312842799, (int) System.currentTimeMillis());
                int[] iArr27 = arjVar14.setNavigationOnClickListener;
                arh.setY(new Object[]{iArr27, iArr26, iArr27}, -141739096, 141739100, (int) System.currentTimeMillis());
                arj arjVar15 = new arj(iArr26);
                arh.setY(new Object[]{iArr, arjVar14.setNavigationOnClickListener, arjVar15.setNavigationOnClickListener}, -141739096, 141739100, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar15.setNavigationOnClickListener, iArr19, iArr18}, -635217836, 635217852, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr18, arjVar15.setNavigationOnClickListener}, -232433780, 232433783, (int) System.currentTimeMillis());
                arj arjVar16 = new arj(iArr25);
                if (!navBarTitleString) {
                    int i93 = f53692g;
                    int i94 = (i93 & (-80)) | (79 & (~i93));
                    int i95 = -(-((i93 & 79) << 1));
                    int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                    f53691f = i96 % 128;
                    if (i96 % 2 != 0) {
                        int[] iArr28 = arjVar16.setNavigationOnClickListener;
                        arh.setY(new Object[]{iArr28, arjVar.setNavigationOnClickListener, iArr28, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                        throw null;
                    }
                    int[] iArr29 = arjVar16.setNavigationOnClickListener;
                    arh.setY(new Object[]{iArr29, arjVar.setNavigationOnClickListener, iArr29, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                }
                if (!navBarTitleString2) {
                    int i97 = f53692g;
                    int i98 = (i97 ^ 34) + ((i97 & 34) << 1);
                    int i99 = (i98 ^ (-1)) + (i98 << 1);
                    f53691f = i99 % 128;
                    int i100 = i99 % 2;
                    int[] iArr30 = arjVar16.setNavigationOnClickListener;
                    arh.setY(new Object[]{iArr30, arjVar13.setNavigationOnClickListener, iArr30, iArr17}, 126810060, -126810050, (int) System.currentTimeMillis());
                    int i101 = f53691f;
                    int i102 = (i101 & 115) + (i101 | 115);
                    f53692g = i102 % 128;
                    int i103 = i102 % 2;
                }
                arn arnVar5 = new arn(x6, arjVar14, arjVar15, new apk[]{arjVar16});
                int i104 = f53691f;
                int i105 = i104 & 41;
                int i106 = (((i104 | 41) & (~i105)) - (~(-(-(i105 << 1))))) - 1;
                f53692g = i106 % 128;
                if (i106 % 2 != 0) {
                    return arnVar5;
                }
                int i107 = 90 / 0;
                return arnVar5;
            }
            int i108 = f53692g + 114;
            int i109 = (i108 ^ (-1)) + (i108 << 1);
            f53691f = i109 % 128;
            if (i109 % 2 != 0) {
                ((Boolean) avf.setX(new Object[]{iArr19}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            }
            if (((Boolean) avf.setX(new Object[]{iArr19}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
                int i110 = f53691f;
                int i111 = i110 & 71;
                int i112 = (i110 | 71) & (~i111);
                int i113 = -(-(i111 << 1));
                int i114 = (i112 & i113) + (i112 | i113);
                f53692g = i114 % 128;
                int i115 = i114 % 2;
                y7 = arnVar4.setOnEditorActionListener();
                int i116 = f53692g;
                int i117 = (i116 ^ 57) + ((i116 & 57) << 1);
                f53691f = i117 % 128;
                int i118 = i117 % 2;
            } else {
                y7 = x6.setY();
                int i119 = f53691f;
                int i120 = i119 & 23;
                int i121 = i120 + ((i119 ^ 23) | i120);
                f53692g = i121 % 128;
                if (i121 % 2 == 0) {
                    throw null;
                }
            }
        }
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl UiMessageCallbackKtWhenMappings() {
        return (apl) setY(new Object[]{this}, -219302398, 219302399, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnEditorActionListener() {
        return (apl) setY(new Object[]{this}, 1473920408, -1473920408, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apl
    public final apl setOnFocusChangeListener(apl aplVar) {
        return (apl) setY(new Object[]{this, aplVar}, 1494621308, -1494621306, System.identityHashCode(this));
    }
}
