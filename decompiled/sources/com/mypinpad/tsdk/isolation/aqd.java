package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aqd extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53572c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53573d = 1;
    public static final BigInteger setLayoutAnimation = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] setOnDragListener;

    static {
        int i10 = f53573d;
        int i11 = (((i10 ^ 19) | (i10 & 19)) << 1) - (((~i10) & 19) | (i10 & (-20)));
        f53572c = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 98 / 0;
        }
    }

    public aqd(int[] iArr) {
        this.setOnDragListener = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0749  */
    /* JADX WARN: Code duplicated, block: B:75:0x0757  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        aqd aqdVar;
        boolean zBooleanValue;
        switch ((((~(i10 | i12)) | (~(i11 | (~i12)))) * 627) + (((~((~i11) | i12)) | i10) * (-627)) + ((i11 | i12 | (~i10)) * (-627)) + (i11 * 628) + (i10 * 628)) {
            case 1:
                aqd aqdVar2 = (aqd) objArr[0];
                apk apkVar = (apk) objArr[1];
                int[] iArr = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar2.setOnDragListener, ((aqd) apkVar).setOnDragListener, iArr}, 1561294226, -1561294226, (int) System.currentTimeMillis());
                aqd aqdVar3 = new aqd(iArr);
                int i14 = f53572c;
                int i15 = (((i14 ^ 63) | (i14 & 63)) << 1) - (((~i14) & 63) | (i14 & (-64)));
                f53573d = i15 % 128;
                int i16 = i15 % 2;
                return aqdVar3;
            case 2:
                aqd aqdVar4 = (aqd) objArr[0];
                int i17 = f53573d;
                int i18 = i17 & 105;
                int i19 = (i17 ^ 105) | i18;
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f53572c = i20 % 128;
                if (i20 % 2 != 0) {
                    ((Boolean) avf.setX(new Object[]{aqdVar4.setOnDragListener}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                int[] iArr2 = aqdVar4.setOnDragListener;
                if (((Boolean) avf.setX(new Object[]{iArr2}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
                    int i21 = f53572c;
                    i13 = (i21 & 121) + (i21 | 121);
                    f53573d = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i22 = 75 / 0;
                    }
                    aqdVar = aqdVar4;
                } else {
                    int i23 = f53573d;
                    int i24 = i23 & 49;
                    int i25 = i24 + ((i23 ^ 49) | i24);
                    f53572c = i25 % 128;
                    int i26 = i25 % 2;
                    if (((Boolean) avf.setX(new Object[]{iArr2}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue()) {
                        int i27 = f53572c;
                        i13 = (i27 & 121) + (i27 | 121);
                        f53573d = i13 % 128;
                        if (i13 % 2 == 0) {
                            int i28 = 75 / 0;
                        }
                        aqdVar = aqdVar4;
                    } else {
                        int[] iArr3 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr2, iArr3}, 171882311, -171882296, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr3, iArr2, iArr3}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        int[] iArr4 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr3, 2, iArr4}, -453831595, 453831606, 2);
                        aqa.setX(new Object[]{iArr4, iArr3, iArr4}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        int[] iArr5 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr4, 2, iArr5}, -453831595, 453831606, 2);
                        aqa.setX(new Object[]{iArr5, iArr3, iArr5}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr5, 6, iArr3}, -453831595, 453831606, 6);
                        aqa.setX(new Object[]{iArr3, iArr5, iArr3}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        int[] iArr6 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr3, 12, iArr6}, -453831595, 453831606, 12);
                        aqa.setX(new Object[]{iArr6, iArr3, iArr6}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr6, 6, iArr3}, -453831595, 453831606, 6);
                        aqa.setX(new Object[]{iArr3, iArr5, iArr3}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr3, iArr5}, 171882311, -171882296, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr5, iArr2, iArr5}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr5, 31, iArr6}, -453831595, 453831606, 31);
                        aqa.setX(new Object[]{iArr6, iArr5, iArr3}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr6, 32, iArr6}, -453831595, 453831606, 32);
                        aqa.setX(new Object[]{iArr6, iArr3, iArr6}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr6, 62, iArr6}, -453831595, 453831606, 62);
                        aqa.setX(new Object[]{iArr6, iArr3, iArr6}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr6, 4, iArr6}, -453831595, 453831606, 4);
                        aqa.setX(new Object[]{iArr6, iArr4, iArr6}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr6, 32, iArr6}, -453831595, 453831606, 32);
                        aqa.setX(new Object[]{iArr6, iArr2, iArr6}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                        aqa.setX(new Object[]{iArr6, 62, iArr6}, -453831595, 453831606, 62);
                        aqa.setX(new Object[]{iArr6, iArr4}, 171882311, -171882296, (int) System.currentTimeMillis());
                        if (((Boolean) avf.setX(new Object[]{iArr2, iArr4}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue()) {
                            aqdVar = new aqd(iArr6);
                            int i29 = f53573d;
                            int i30 = ((i29 | 84) << 1) - (i29 ^ 84);
                            int i31 = (i30 ^ (-1)) + (i30 << 1);
                            f53572c = i31 % 128;
                            int i32 = i31 % 2;
                        } else {
                            int i33 = f53573d;
                            int i34 = i33 & 119;
                            int i35 = i34 + ((i33 ^ 119) | i34);
                            f53572c = i35 % 128;
                            int i36 = i35 % 2;
                            aqdVar = null;
                        }
                    }
                }
                return aqdVar;
            case 3:
                aqd aqdVar5 = (aqd) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                int[] iArr7 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar5.setOnDragListener, ((aqd) apkVar2).setOnDragListener, iArr7}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                aqd aqdVar6 = new aqd(iArr7);
                int i37 = f53573d;
                int i38 = i37 & 65;
                int i39 = (((i37 | 65) & (~i38)) - (~(i38 << 1))) - 1;
                f53572c = i39 % 128;
                int i40 = i39 % 2;
                return aqdVar6;
            case 4:
                aqd aqdVar7 = (aqd) objArr[0];
                int i41 = f53572c;
                int i42 = (((i41 ^ 113) | (i41 & 113)) << 1) - (((~i41) & 113) | (i41 & (-114)));
                f53573d = i42 % 128;
                int i43 = i42 % 2;
                int iHashCode = setLayoutAnimation.hashCode();
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{aqdVar7.setOnDragListener, 8}, 1613127163, -1613127143, 8)).intValue();
                int i44 = iHashCode & iIntValue;
                int i45 = ((iIntValue ^ iHashCode) | i44) & (~i44);
                int i46 = f53573d;
                int i47 = (i46 ^ 13) + ((i46 & 13) << 1);
                f53572c = i47 % 128;
                int i48 = i47 % 2;
                return Integer.valueOf(i45);
            case 5:
                aqd aqdVar8 = (aqd) objArr[0];
                int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar8.setOnDragListener, iArr8}, 171882311, -171882296, (int) System.currentTimeMillis());
                aqd aqdVar9 = new aqd(iArr8);
                int i49 = f53572c + 51;
                f53573d = i49 % 128;
                int i50 = i49 % 2;
                return aqdVar9;
            case 6:
                aqd aqdVar10 = (aqd) objArr[0];
                int[] iArr9 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar10.setOnDragListener, iArr9}, -1165991312, 1165991325, (int) System.currentTimeMillis());
                aqd aqdVar11 = new aqd(iArr9);
                int i51 = f53573d + 89;
                f53572c = i51 % 128;
                int i52 = i51 % 2;
                return aqdVar11;
            case 7:
                aqd aqdVar12 = (aqd) objArr[0];
                Object obj = objArr[1];
                int i53 = f53572c;
                int i54 = i53 + 71;
                int i55 = i54 % 128;
                f53573d = i55;
                if (i54 % 2 == 0) {
                    throw null;
                }
                if (obj == aqdVar12) {
                    int i56 = ((i55 & 54) + (i55 | 54)) - 1;
                    f53572c = i56 % 128;
                    int i57 = i56 % 2;
                    return Boolean.TRUE;
                }
                if (!(!(obj instanceof aqd))) {
                    zBooleanValue = ((Boolean) avf.setX(new Object[]{aqdVar12.setOnDragListener, ((aqd) obj).setOnDragListener}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue();
                    int i58 = f53573d;
                    int i59 = (((i58 & (-58)) | ((~i58) & 57)) - (~(-(-((i58 & 57) << 1))))) - 1;
                    f53572c = i59 % 128;
                    if (i59 % 2 != 0) {
                        int i60 = 28 / 0;
                    }
                } else {
                    int i61 = i53 + 49;
                    f53573d = i61 % 128;
                    zBooleanValue = !(i61 % 2 != 0);
                }
                return Boolean.valueOf(zBooleanValue);
            case 8:
                int i62 = f53572c + 71;
                f53573d = i62 % 128;
                int i63 = i62 % 2;
                int iBitLength = setLayoutAnimation.bitLength();
                int i64 = f53572c;
                int i65 = (((i64 | 52) << 1) - (i64 ^ 52)) - 1;
                f53573d = i65 % 128;
                int i66 = i65 % 2;
                return Integer.valueOf(iBitLength);
            case 9:
                aqd aqdVar13 = (aqd) objArr[0];
                int i67 = f53573d;
                int i68 = ((i67 ^ 49) | (i67 & 49)) << 1;
                int i69 = -(((~i67) & 49) | (i67 & (-50)));
                int i70 = (i68 & i69) + (i69 | i68);
                f53572c = i70 % 128;
                int i71 = i70 % 2;
                int[] iArr10 = aqdVar13.setOnDragListener;
                if (i71 != 0) {
                    ((Boolean) avf.setX(new Object[]{iArr10}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                boolean zBooleanValue2 = ((Boolean) avf.setX(new Object[]{iArr10}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue();
                int i72 = f53573d;
                int i73 = ((((i72 ^ 1) | (i72 & 1)) << 1) - (~(-(((~i72) & 1) | (i72 & (-2)))))) - 1;
                f53572c = i73 % 128;
                int i74 = i73 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 10:
                aqd aqdVar14 = (aqd) objArr[0];
                int[] iArr11 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar14.setOnDragListener, iArr11}, -2065004979, 2065004983, (int) System.currentTimeMillis());
                aqd aqdVar15 = new aqd(iArr11);
                int i75 = f53573d + 67;
                f53572c = i75 % 128;
                int i76 = i75 % 2;
                return aqdVar15;
            case 11:
                aqd aqdVar16 = (aqd) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                int[] iArr12 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar16.setOnDragListener, ((aqd) apkVar3).setOnDragListener, iArr12}, 1656767316, -1656767306, (int) System.currentTimeMillis());
                aqd aqdVar17 = new aqd(iArr12);
                int i77 = f53573d;
                int i78 = i77 ^ 91;
                int i79 = -(-((i77 & 91) << 1));
                int i80 = (i78 & i79) + (i79 | i78);
                f53572c = i80 % 128;
                if (i80 % 2 == 0) {
                    return aqdVar17;
                }
                throw null;
            case 12:
                aqd aqdVar18 = (aqd) objArr[0];
                int[] iArr13 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{aqdVar18.setOnDragListener, iArr13}, -1984289514, 1984289531, (int) System.currentTimeMillis());
                aqd aqdVar19 = new aqd(iArr13);
                int i81 = f53572c;
                int i82 = i81 & 51;
                int i83 = ((i81 ^ 51) | i82) << 1;
                int i84 = -((i81 | 51) & (~i82));
                int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                f53573d = i85 % 128;
                int i86 = i85 % 2;
                return aqdVar19;
            case 13:
                aqd aqdVar20 = (aqd) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                int[] iArr14 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{((aqd) apkVar4).setOnDragListener, iArr14}, -1984289514, 1984289531, (int) System.currentTimeMillis());
                aqa.setX(new Object[]{iArr14, aqdVar20.setOnDragListener, iArr14}, -1040559401, 1040559406, (int) System.currentTimeMillis());
                aqd aqdVar21 = new aqd(iArr14);
                int i87 = f53573d;
                int i88 = i87 & 49;
                int i89 = i88 + ((i87 ^ 49) | i88);
                f53572c = i89 % 128;
                if (i89 % 2 == 0) {
                    return aqdVar21;
                }
                int i90 = 5 / 0;
                return aqdVar21;
            case 14:
                aqd aqdVar22 = (aqd) objArr[0];
                int i91 = f53573d;
                int i92 = i91 & 111;
                int i93 = (((i91 | 111) & (~i92)) - (~(-(-(i92 << 1))))) - 1;
                f53572c = i93 % 128;
                int i94 = i93 % 2;
                if (((Integer) avf.setX(new Object[]{aqdVar22.setOnDragListener}, 1932638258, -1932638241, (int) System.currentTimeMillis())).intValue() == 1) {
                    int i95 = f53573d;
                    int i96 = ((i95 | 83) << 1) - (i95 ^ 83);
                    f53572c = i96 % 128;
                    boolean z10 = i96 % 2 == 0;
                    int i97 = (i95 ^ 53) + ((i95 & 53) << 1);
                    f53572c = i97 % 128;
                    int i98 = i97 % 2;
                    return Boolean.valueOf(z10);
                }
                int i99 = f53572c;
                int i100 = i99 & 51;
                int i101 = (i99 | 51) & (~i100);
                int i102 = -(-(i100 << 1));
                int i103 = (i101 ^ i102) + ((i101 & i102) << 1);
                f53573d = i103 % 128;
                if (i103 % 2 == 0) {
                    int i104 = 43 / 0;
                }
                return Boolean.FALSE;
            case 15:
                aqd aqdVar23 = (aqd) objArr[0];
                int i105 = f53573d;
                int i106 = i105 ^ 27;
                int i107 = (i105 & 27) << 1;
                int i108 = (i106 & i107) + (i107 | i106);
                f53572c = i108 % 128;
                int i109 = i108 % 2;
                BigInteger bigInteger = (BigInteger) avf.setX(new Object[]{aqdVar23.setOnDragListener}, -651651242, 651651245, (int) System.currentTimeMillis());
                int i110 = f53573d;
                int i111 = i110 ^ 107;
                int i112 = -(-((i110 & 107) << 1));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                f53572c = i113 % 128;
                if (i113 % 2 == 0) {
                    return bigInteger;
                }
                throw null;
            default:
                aqd aqdVar24 = (aqd) objArr[0];
                int i114 = f53573d;
                int i115 = i114 & 1;
                int i116 = ((((i114 ^ 1) | i115) << 1) - (~(-((i114 | 1) & (~i115))))) - 1;
                f53572c = i116 % 128;
                int i117 = i116 % 2;
                int[] iArr15 = aqdVar24.setOnDragListener;
                Object[] objArr2 = new Object[1];
                if (i117 != 0) {
                    objArr2[0] = iArr15;
                    ((Boolean) avf.setX(objArr2, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                objArr2[0] = iArr15;
                boolean zBooleanValue3 = ((Boolean) avf.setX(objArr2, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
                int i118 = f53573d;
                int i119 = (i118 & (-40)) | ((~i118) & 39);
                int i120 = -(-((i118 & 39) << 1));
                int i121 = ((i119 | i120) << 1) - (i120 ^ i119);
                f53572c = i121 % 128;
                if (i121 % 2 != 0) {
                    int i122 = 56 / 0;
                }
                return Boolean.valueOf(zBooleanValue3);
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -1900777335, 1900777342, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -367279149, 367279158, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, -1293996974, 1293996978, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -2111890923, 2111890937, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 431278384, -431278381, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -355635145, 355635157, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -935619671, 935619671, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 1977058483, -1977058472, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -582516255, 582516257, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setDividerPadding(new Object[]{this}, 54258690, -54258685, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setDividerPadding(new Object[]{this}, 1566356764, -1566356758, System.identityHashCode(this));
    }

    public aqd() {
        this.setOnDragListener = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setDividerPadding(new Object[]{this}, 1001804426, -1001804411, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, 4714517, -4714509, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 187425250, -187425249, System.identityHashCode(this));
    }

    public aqd(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setLayoutAnimation) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.setOnDragListener = (int[]) aqa.setX(new Object[]{bigInteger}, 1792036173, -1792036172, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 935147649, -935147636, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setDividerPadding(new Object[]{this}, -1470824402, 1470824412, System.identityHashCode(this));
    }
}
