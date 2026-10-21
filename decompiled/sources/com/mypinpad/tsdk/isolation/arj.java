package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class arj extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53679c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53680d = 1;
    public static final BigInteger setOnDragListener = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] setNavigationOnClickListener;

    static {
        int i10 = f53679c + 93;
        f53680d = i10 % 128;
        int i11 = i10 % 2;
    }

    public arj(int[] iArr) {
        this.setNavigationOnClickListener = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0406  */
    /* JADX WARN: Code duplicated, block: B:24:0x041b  */
    /* JADX WARN: Code duplicated, block: B:83:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:84:0x08db  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14 = ~i12;
        switch ((((~((~i10) | i11)) | (~(i11 | i14))) * 560) + ((~(i12 | (~i11) | i10)) * (-560)) + ((~(i14 | i10)) * (-560)) + (i11 * 561) + (i10 * (-559))) {
            case 1:
                int i15 = f53679c;
                int i16 = (-2) - (((i15 & 16) + (i15 | 16)) ^ (-1));
                f53680d = i16 % 128;
                int i17 = i16 % 2;
                int iBitLength = setOnDragListener.bitLength();
                int i18 = f53679c;
                int i19 = i18 & 49;
                int i20 = ((i18 | 49) & (~i19)) + (i19 << 1);
                f53680d = i20 % 128;
                if (i20 % 2 != 0) {
                    return Integer.valueOf(iBitLength);
                }
                throw null;
            case 2:
                arj arjVar = (arj) objArr[0];
                int i21 = f53680d;
                int i22 = (i21 & 29) + (i21 | 29);
                f53679c = i22 % 128;
                int i23 = i22 % 2;
                int[] iArr = arjVar.setNavigationOnClickListener;
                Object[] objArr2 = new Object[1];
                if (i23 == 0) {
                    objArr2[0] = iArr;
                    if (((Integer) avf.setX(objArr2, 1932638258, -1932638241, (int) System.currentTimeMillis())).intValue() != 1) {
                        int i24 = f53680d;
                        int i25 = (i24 & (-22)) | ((~i24) & 21);
                        int i26 = (i24 & 21) << 1;
                        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                        f53679c = i27 % 128;
                        int i28 = i27 % 2;
                        objValueOf = Boolean.FALSE;
                    } else {
                        int i29 = f53680d;
                        int i30 = i29 & 9;
                        int i31 = (i29 ^ 9) | i30;
                        int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                        f53679c = i32 % 128;
                        int i33 = i32 % 2;
                        objValueOf = Boolean.TRUE;
                    }
                } else {
                    objArr2[0] = iArr;
                    if (((Integer) avf.setX(objArr2, 1932638258, -1932638241, (int) System.currentTimeMillis())).intValue() != 0) {
                        int i210 = f53680d;
                        int i211 = (i210 & (-22)) | ((~i210) & 21);
                        int i212 = (i210 & 21) << 1;
                        int i213 = (i211 ^ i212) + ((i212 & i211) << 1);
                        f53679c = i213 % 128;
                        int i214 = i213 % 2;
                        objValueOf = Boolean.FALSE;
                    } else {
                        int i215 = f53680d;
                        int i34 = i215 & 9;
                        int i35 = (i215 ^ 9) | i34;
                        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                        f53679c = i36 % 128;
                        int i37 = i36 % 2;
                        objValueOf = Boolean.TRUE;
                    }
                }
                break;
            case 3:
                arj arjVar2 = (arj) objArr[0];
                int[] iArr2 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar2.setNavigationOnClickListener, iArr2}, 2126596357, -2126596351, (int) System.currentTimeMillis());
                arj arjVar3 = new arj(iArr2);
                int i38 = f53680d;
                int i39 = i38 & 85;
                int i40 = (((i38 ^ 85) | i39) << 1) - ((i38 | 85) & (~i39));
                f53679c = i40 % 128;
                int i41 = i40 % 2;
                objValueOf = arjVar3;
                break;
            case 4:
                arj arjVar4 = (arj) objArr[0];
                apk apkVar = (apk) objArr[1];
                int[] iArr3 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar4.setNavigationOnClickListener, ((arj) apkVar).setNavigationOnClickListener, iArr3}, 1298842424, -1298842417, (int) System.currentTimeMillis());
                arj arjVar5 = new arj(iArr3);
                int i42 = f53679c;
                int i43 = (i42 ^ 58) + ((i42 & 58) << 1);
                int i44 = (i43 ^ (-1)) + (i43 << 1);
                f53680d = i44 % 128;
                objValueOf = arjVar5;
                if (i44 % 2 == 0) {
                    int i45 = 65 / 0;
                    objValueOf = arjVar5;
                }
                break;
            case 5:
                arj arjVar6 = (arj) objArr[0];
                int[] iArr4 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar6.setNavigationOnClickListener, iArr4}, 450232347, -450232330, (int) System.currentTimeMillis());
                arj arjVar7 = new arj(iArr4);
                int i46 = f53680d;
                int i47 = ((i46 & 78) + (i46 | 78)) - 1;
                f53679c = i47 % 128;
                objValueOf = arjVar7;
                if (i47 % 2 != 0) {
                    int i48 = 53 / 0;
                    objValueOf = arjVar7;
                }
                break;
            case 6:
                arj arjVar8 = (arj) objArr[0];
                int i49 = f53679c;
                int i50 = i49 & 37;
                int i51 = (i49 ^ 37) | i50;
                int i52 = (i50 ^ i51) + ((i51 & i50) << 1);
                f53680d = i52 % 128;
                int i53 = i52 % 2;
                BigInteger bigInteger = (BigInteger) avf.setX(new Object[]{arjVar8.setNavigationOnClickListener}, -651651242, 651651245, (int) System.currentTimeMillis());
                int i54 = f53680d;
                int i55 = (i54 & (-86)) | ((~i54) & 85);
                int i56 = -(-((i54 & 85) << 1));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f53679c = i57 % 128;
                objValueOf = bigInteger;
                if (i57 % 2 != 0) {
                    int i58 = 79 / 0;
                    objValueOf = bigInteger;
                }
                break;
            case 7:
                arj arjVar9 = (arj) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                int[] iArr5 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{((arj) apkVar2).setNavigationOnClickListener, iArr5}, 450232347, -450232330, (int) System.currentTimeMillis());
                arh.setY(new Object[]{iArr5, arjVar9.setNavigationOnClickListener, iArr5}, 1298842424, -1298842417, (int) System.currentTimeMillis());
                arj arjVar10 = new arj(iArr5);
                int i59 = f53680d;
                int i60 = i59 ^ 97;
                int i61 = (i59 & 97) << 1;
                int i62 = (i60 & i61) + (i61 | i60);
                f53679c = i62 % 128;
                int i63 = i62 % 2;
                objValueOf = arjVar10;
                break;
            case 8:
                arj arjVar11 = (arj) objArr[0];
                int i64 = f53680d;
                int i65 = i64 & 33;
                int i66 = i65 + ((i64 ^ 33) | i65);
                f53679c = i66 % 128;
                int i67 = i66 % 2;
                int iHashCode = setOnDragListener.hashCode();
                int iIntValue = ((Integer) bek.setOnFocusChangeListener(new Object[]{arjVar11.setNavigationOnClickListener, 8}, 1613127163, -1613127143, 8)).intValue();
                int i68 = (~iIntValue) & iHashCode;
                int i69 = iIntValue & (~iHashCode);
                int i70 = (i69 & i68) | (i68 ^ i69);
                int i71 = f53679c;
                int i72 = (((i71 ^ 45) | (i71 & 45)) << 1) - (((~i71) & 45) | (i71 & (-46)));
                f53680d = i72 % 128;
                int i73 = i72 % 2;
                return Integer.valueOf(i70);
            case 9:
                arj arjVar12 = (arj) objArr[0];
                int[] iArr6 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar12.setNavigationOnClickListener, iArr6}, -1404396491, 1404396499, (int) System.currentTimeMillis());
                arj arjVar13 = new arj(iArr6);
                int i74 = f53680d;
                int i75 = i74 ^ 3;
                int i76 = -(-((i74 & 3) << 1));
                int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                f53679c = i77 % 128;
                int i78 = i77 % 2;
                objValueOf = arjVar13;
                break;
            case 10:
                arj arjVar14 = (arj) objArr[0];
                int i79 = f53679c;
                int i80 = i79 ^ 75;
                int i81 = (i79 & 75) << 1;
                int i82 = (i80 & i81) + (i81 | i80);
                f53680d = i82 % 128;
                int i83 = i82 % 2;
                int[] iArr7 = arjVar14.setNavigationOnClickListener;
                Object[] objArr3 = new Object[1];
                if (i83 != 0) {
                    objArr3[0] = iArr7;
                    return Boolean.valueOf(((Boolean) avf.setX(objArr3, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue());
                }
                objArr3[0] = iArr7;
                ((Boolean) avf.setX(objArr3, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue();
                throw null;
            case 11:
                arj arjVar15 = (arj) objArr[0];
                int[] iArr8 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar15.setNavigationOnClickListener, iArr8}, -556356765, 556356770, (int) System.currentTimeMillis());
                arj arjVar16 = new arj(iArr8);
                int i84 = f53679c;
                int i85 = i84 ^ 43;
                int i86 = -(-((i84 & 43) << 1));
                int i87 = ((i85 | i86) << 1) - (i86 ^ i85);
                f53680d = i87 % 128;
                int i88 = i87 % 2;
                objValueOf = arjVar16;
                break;
            case 12:
                arj arjVar17 = (arj) objArr[0];
                Object obj = objArr[1];
                int i89 = f53680d;
                int i90 = i89 & 35;
                int i91 = (i90 - (~((i89 ^ 35) | i90))) - 1;
                int i92 = i91 % 128;
                f53679c = i92;
                int i93 = i91 % 2;
                if (obj == arjVar17) {
                    int i94 = (-2) - ((((i92 | 80) << 1) - (i92 ^ 80)) ^ (-1));
                    f53680d = i94 % 128;
                    int i95 = i94 % 2;
                    int i96 = (i92 ^ 53) + ((i92 & 53) << 1);
                    f53680d = i96 % 128;
                    if (i96 % 2 == 0) {
                        int i97 = 46 / 0;
                    }
                    objValueOf = Boolean.TRUE;
                } else if (obj instanceof arj) {
                    boolean zBooleanValue = ((Boolean) avf.setX(new Object[]{arjVar17.setNavigationOnClickListener, ((arj) obj).setNavigationOnClickListener}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue();
                    int i98 = f53679c;
                    int i99 = (((i98 | 20) << 1) - (i98 ^ 20)) - 1;
                    f53680d = i99 % 128;
                    if (i99 % 2 == 0) {
                        int i100 = 56 / 0;
                    }
                    objValueOf = Boolean.valueOf(zBooleanValue);
                } else {
                    int i101 = (-2) - ((i92 + 92) ^ (-1));
                    int i102 = i101 % 128;
                    f53680d = i102;
                    int i103 = i101 % 2;
                    int i104 = i102 & 101;
                    int i105 = (i102 | 101) & (~i104);
                    int i106 = -(-(i104 << 1));
                    int i107 = (i105 & i106) + (i106 | i105);
                    f53679c = i107 % 128;
                    if (i107 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
            case 13:
                arj arjVar18 = (arj) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                int[] iArr9 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar18.setNavigationOnClickListener, ((arj) apkVar3).setNavigationOnClickListener, iArr9}, -141739096, 141739100, (int) System.currentTimeMillis());
                arj arjVar19 = new arj(iArr9);
                int i108 = f53679c + 92;
                int i109 = (i108 ^ (-1)) + (i108 << 1);
                f53680d = i109 % 128;
                int i110 = i109 % 2;
                objValueOf = arjVar19;
                break;
            case 14:
                arj arjVar20 = (arj) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                int[] iArr10 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                arh.setY(new Object[]{arjVar20.setNavigationOnClickListener, ((arj) apkVar4).setNavigationOnClickListener, iArr10}, 980686848, -980686833, (int) System.currentTimeMillis());
                arj arjVar21 = new arj(iArr10);
                int i111 = f53680d;
                int i112 = ((i111 & 66) + (i111 | 66)) - 1;
                f53679c = i112 % 128;
                objValueOf = arjVar21;
                if (i112 % 2 != 0) {
                    throw null;
                }
                break;
            case 15:
                arj arjVar22 = (arj) objArr[0];
                int i113 = f53680d;
                int i114 = ((i113 & 62) + (i113 | 62)) - 1;
                f53679c = i114 % 128;
                int i115 = i114 % 2;
                int[] iArr11 = arjVar22.setNavigationOnClickListener;
                Object[] objArr4 = new Object[1];
                if (i115 != 0) {
                    objArr4[0] = iArr11;
                    ((Boolean) avf.setX(objArr4, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
                    throw null;
                }
                objArr4[0] = iArr11;
                boolean zBooleanValue2 = ((Boolean) avf.setX(objArr4, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
                int i116 = f53679c + 107;
                f53680d = i116 % 128;
                if (i116 % 2 == 0) {
                    int i117 = 11 / 0;
                }
                objValueOf = Boolean.valueOf(zBooleanValue2);
                break;
                break;
            default:
                arj arjVar23 = (arj) objArr[0];
                int i118 = f53680d;
                int i119 = (((i118 | 113) << 1) - (~(-(i118 ^ 113)))) - 1;
                f53679c = i119 % 128;
                int i120 = i119 % 2;
                int[] iArr12 = arjVar23.setNavigationOnClickListener;
                if (!((Boolean) avf.setX(new Object[]{iArr12}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue()) {
                    int i121 = f53680d;
                    int i122 = i121 & 85;
                    int i123 = ((i121 ^ 85) | i122) << 1;
                    int i124 = -((i121 | 85) & (~i122));
                    int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
                    f53679c = i125 % 128;
                    if (i125 % 2 != 0) {
                        ((Boolean) avf.setX(new Object[]{iArr12}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) avf.setX(new Object[]{iArr12}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue()) {
                        int i126 = f53679c;
                        int i127 = i126 & 51;
                        int i128 = (i126 ^ 51) | i127;
                        i13 = (i127 & i128) + (i128 | i127);
                        f53680d = i13 % 128;
                        objValueOf = arjVar23;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                    } else {
                        int[] iArr13 = (int[]) avf.setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
                        int[] iArr14 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr12, iArr14, iArr13}, 312842810, -312842799, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr14, iArr12, iArr14, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        int[] iArr15 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr14, iArr15, iArr13}, 312842810, -312842799, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr15, iArr12, iArr15, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        int[] iArr16 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr15, 3, iArr16, iArr13}, -1968232547, 1968232561, 3);
                        arh.setY(new Object[]{iArr16, iArr15, iArr16, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr16, 3, iArr16, iArr13}, -1968232547, 1968232561, 3);
                        arh.setY(new Object[]{iArr16, iArr15, iArr16, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr16, 2, iArr16, iArr13}, -1968232547, 1968232561, 2);
                        arh.setY(new Object[]{iArr16, iArr14, iArr16, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        int[] iArr17 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr16, 11, iArr17, iArr13}, -1968232547, 1968232561, 11);
                        arh.setY(new Object[]{iArr17, iArr16, iArr17, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr17, 22, iArr16, iArr13}, -1968232547, 1968232561, 22);
                        arh.setY(new Object[]{iArr16, iArr17, iArr16, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        int[] iArr18 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr16, 44, iArr18, iArr13}, -1968232547, 1968232561, 44);
                        arh.setY(new Object[]{iArr18, iArr16, iArr18, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        int[] iArr19 = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr18, 88, iArr19, iArr13}, -1968232547, 1968232561, 88);
                        arh.setY(new Object[]{iArr19, iArr18, iArr19, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr19, 44, iArr18, iArr13}, -1968232547, 1968232561, 44);
                        arh.setY(new Object[]{iArr18, iArr16, iArr18, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr18, 3, iArr16, iArr13}, -1968232547, 1968232561, 3);
                        arh.setY(new Object[]{iArr16, iArr15, iArr16, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr16, 23, iArr16, iArr13}, -1968232547, 1968232561, 23);
                        arh.setY(new Object[]{iArr16, iArr17, iArr16, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr16, 6, iArr16, iArr13}, -1968232547, 1968232561, 6);
                        arh.setY(new Object[]{iArr16, iArr14, iArr16, iArr13}, 126810060, -126810050, (int) System.currentTimeMillis());
                        arh.setY(new Object[]{iArr16, 2, iArr16, iArr13}, -1968232547, 1968232561, 2);
                        arh.setY(new Object[]{iArr16, iArr14, iArr13}, 312842810, -312842799, (int) System.currentTimeMillis());
                        if (!((Boolean) avf.setX(new Object[]{iArr12, iArr14}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue()) {
                            int i129 = f53679c;
                            int i130 = ((i129 & (-10)) | ((~i129) & 9)) + ((i129 & 9) << 1);
                            f53680d = i130 % 128;
                            if (i130 % 2 != 0) {
                                return null;
                            }
                            throw null;
                        }
                        arj arjVar24 = new arj(iArr16);
                        int i131 = f53679c;
                        int i132 = ((i131 | 119) << 1) - (i131 ^ 119);
                        f53680d = i132 % 128;
                        int i133 = i132 % 2;
                        objValueOf = arjVar24;
                    }
                } else {
                    int i1210 = f53679c;
                    int i1211 = i1210 & 51;
                    int i1212 = (i1210 ^ 51) | i1211;
                    i13 = (i1211 & i1212) + (i1212 | i1211);
                    f53680d = i13 % 128;
                    objValueOf = arjVar23;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                }
                break;
        }
        return objValueOf;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, -900707679, 900707691, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, 1758600624, -1758600614, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, 462908192, -462908184, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, 594504972, -594504970, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -656627247, 656627251, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -1827243617, 1827243624, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, 259452491, -259452486, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, -81964902, 81964917, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -1646275185, 1646275199, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setY(new Object[]{this}, 1232954648, -1232954648, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setY(new Object[]{this}, 1796566401, -1796566398, System.identityHashCode(this));
    }

    public arj() {
        this.setNavigationOnClickListener = (int[]) avf.setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, 227163918, -227163912, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setY(new Object[]{this}, -519504901, 519504910, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 453314732, -453314731, System.identityHashCode(this))).intValue();
    }

    public arj(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setOnDragListener) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.setNavigationOnClickListener = (int[]) arh.setY(new Object[]{bigInteger}, -1675741413, 1675741426, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setY(new Object[]{this}, 1931073435, -1931073424, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 2024952467, -2024952454, System.identityHashCode(this));
    }
}
