package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aqq extends apk.setDividerPadding {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53610c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f53611d = 1;
    public static final BigInteger setOnLongClickListener = new BigInteger(1, (byte[]) bfb.setCompoundDrawableTintBlendMode(new Object[]{"FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"}, -666540625, 666540626, (int) System.currentTimeMillis()));
    protected int[] setOnDragListener;

    static {
        int i10 = f53610c;
        int i11 = (i10 & (-26)) | ((~i10) & 25);
        int i12 = -(-((i10 & 25) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        f53611d = i13 % 128;
        int i14 = i13 % 2;
    }

    public aqq(int[] iArr) {
        this.setOnDragListener = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:83:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x07e4  */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        aqq aqqVar;
        int i14;
        int i15 = ~i12;
        int i16 = ~(i15 | i10);
        int i17 = ((i11 | i16) * 764) + (i11 * (-1527)) + (i10 * 765);
        int i18 = ~((~i10) | i11);
        switch ((((~(i10 | (~i11))) | i18 | i16) * 764) + (((~(i15 | i11)) | i18) * (-1528)) + i17) {
            case 1:
                aqq aqqVar2 = (aqq) objArr[0];
                int i19 = f53611d;
                int i20 = (i19 ^ 27) + ((i19 & 27) << 1);
                f53610c = i20 % 128;
                int i21 = i20 % 2;
                int[] iArr = aqqVar2.setOnDragListener;
                if (i21 == 0) {
                    return (BigInteger) auv.setDividerPadding(new Object[]{iArr}, 1614125874, -1614125856, (int) System.currentTimeMillis());
                }
                throw null;
            case 2:
                aqq aqqVar3 = (aqq) objArr[0];
                int i22 = f53611d;
                int i23 = ((i22 ^ 29) | (i22 & 29)) << 1;
                int i24 = -((i22 & (-30)) | ((~i22) & 29));
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f53610c = i25 % 128;
                int i26 = i25 % 2;
                int[] iArr2 = aqqVar3.setOnDragListener;
                if (!(!((Boolean) auv.setDividerPadding(new Object[]{iArr2}, -1281041716, 1281041721, (int) System.currentTimeMillis())).booleanValue())) {
                    int i27 = f53611d;
                    i13 = ((i27 | 85) << 1) - (i27 ^ 85);
                    f53610c = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    aqqVar = aqqVar3;
                } else {
                    int i28 = f53610c;
                    int i29 = (i28 ^ 7) + ((i28 & 7) << 1);
                    f53611d = i29 % 128;
                    if (i29 % 2 == 0) {
                        ((Boolean) auv.setDividerPadding(new Object[]{iArr2}, 21461862, -21461835, (int) System.currentTimeMillis())).booleanValue();
                        throw null;
                    }
                    if (!((Boolean) auv.setDividerPadding(new Object[]{iArr2}, 21461862, -21461835, (int) System.currentTimeMillis())).booleanValue()) {
                        int[] iArr3 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr2, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
                        int[] iArr4 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr4, iArr2, iArr4}, 414135046, -414135033, (int) System.currentTimeMillis());
                        int[] iArr5 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr4, 3, iArr5}, 2126003926, -2126003916, 3);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr5, iArr4, iArr5}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr5, 2, iArr5}, 2126003926, -2126003916, 2);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr5, iArr3, iArr5}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr5, 8, iArr3}, 2126003926, -2126003916, 8);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr5, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, 3, iArr5}, 2126003926, -2126003916, 3);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr5, iArr4, iArr5}, 414135046, -414135033, (int) System.currentTimeMillis());
                        int[] iArr6 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr5, 16, iArr6}, 2126003926, -2126003916, 16);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr6, iArr3, iArr6}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr6, 35, iArr3}, 2126003926, -2126003916, 35);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr6, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, 70, iArr6}, 2126003926, -2126003916, 70);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr6, iArr3, iArr6}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr6, 19, iArr3}, 2126003926, -2126003916, 19);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr5, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, 20, iArr3}, 2126003926, -2126003916, 20);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr5, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, 4, iArr3}, 2126003926, -2126003916, 4);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, 6, iArr3}, 2126003926, -2126003916, 6);
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4, iArr3}, 414135046, -414135033, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr3}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                        aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                        if (((Boolean) auv.setDividerPadding(new Object[]{iArr2, iArr4}, -556949880, 556949904, (int) System.currentTimeMillis())).booleanValue()) {
                            aqqVar = new aqq(iArr3);
                            int i30 = f53610c;
                            int i31 = (i30 ^ 5) + ((i30 & 5) << 1);
                            f53611d = i31 % 128;
                            if (i31 % 2 == 0) {
                                int i32 = 80 / 0;
                            }
                        } else {
                            int i33 = f53610c + 67;
                            f53611d = i33 % 128;
                            if (i33 % 2 == 0) {
                                int i34 = 34 / 0;
                            }
                            aqqVar = null;
                        }
                    } else {
                        int i210 = f53611d;
                        i13 = ((i210 | 85) << 1) - (i210 ^ 85);
                        f53610c = i13 % 128;
                        if (i13 % 2 == 0) {
                            throw null;
                        }
                        aqqVar = aqqVar3;
                    }
                }
                return aqqVar;
            case 3:
                aqq aqqVar4 = (aqq) objArr[0];
                apk apkVar = (apk) objArr[1];
                int[] iArr7 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{((aqq) apkVar).setOnDragListener, iArr7}, 1580055306, -1580055302, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{iArr7, aqqVar4.setOnDragListener, iArr7}, 414135046, -414135033, (int) System.currentTimeMillis());
                aqq aqqVar5 = new aqq(iArr7);
                int i35 = f53610c;
                int i36 = i35 ^ 47;
                int i37 = -(-((i35 & 47) << 1));
                int i38 = (i36 & i37) + (i37 | i36);
                f53611d = i38 % 128;
                if (i38 % 2 != 0) {
                    return aqqVar5;
                }
                int i39 = 88 / 0;
                return aqqVar5;
            case 4:
                aqq aqqVar6 = (aqq) objArr[0];
                int i40 = f53611d;
                int i41 = (i40 & (-56)) | ((~i40) & 55);
                int i42 = (i40 & 55) << 1;
                int i43 = (i41 & i42) + (i42 | i41);
                f53610c = i43 % 128;
                int i44 = i43 % 2;
                int iHashCode = setOnLongClickListener.hashCode();
                int[] iArr8 = aqqVar6.setOnDragListener;
                Object[] objArr2 = new Object[2];
                if (i44 != 0) {
                    objArr2[0] = iArr8;
                    objArr2[1] = 10;
                    int iIntValue = ((Integer) bek.setOnFocusChangeListener(objArr2, 1613127163, -1613127143, 10)).intValue();
                    i14 = (iIntValue & (~iHashCode)) | ((~iIntValue) & iHashCode);
                } else {
                    objArr2[0] = iArr8;
                    objArr2[1] = 6;
                    int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(objArr2, 1613127163, -1613127143, 6)).intValue();
                    int i45 = (~iIntValue2) & iHashCode;
                    int i46 = iIntValue2 & (~iHashCode);
                    i14 = (i46 & i45) | (i45 ^ i46);
                }
                int i47 = f53610c;
                int i48 = ((i47 ^ 105) - (~((i47 & 105) << 1))) - 1;
                f53611d = i48 % 128;
                int i49 = i48 % 2;
                return Integer.valueOf(i14);
            case 5:
                aqq aqqVar7 = (aqq) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                int[] iArr9 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar7.setOnDragListener, ((aqq) apkVar2).setOnDragListener, iArr9}, -686706983, 686706985, (int) System.currentTimeMillis());
                aqq aqqVar8 = new aqq(iArr9);
                int i50 = f53610c;
                int i51 = ((i50 & (-122)) | ((~i50) & 121)) + ((i50 & 121) << 1);
                f53611d = i51 % 128;
                if (i51 % 2 != 0) {
                    return aqqVar8;
                }
                int i52 = 92 / 0;
                return aqqVar8;
            case 6:
                aqq aqqVar9 = (aqq) objArr[0];
                Object obj = objArr[1];
                int i53 = f53610c;
                int i54 = i53 + 91;
                f53611d = i54 % 128;
                if (i54 % 2 == 0) {
                    throw null;
                }
                if (obj == aqqVar9) {
                    int i55 = i53 ^ 53;
                    int i56 = -(-((i53 & 53) << 1));
                    int i57 = ((i55 | i56) << 1) - (i55 ^ i56);
                    f53611d = i57 % 128;
                    if (i57 % 2 == 0) {
                        int i58 = 79 / 0;
                    }
                    return Boolean.TRUE;
                }
                if (!(obj instanceof aqq)) {
                    int i59 = i53 & 7;
                    int i60 = (((~i59) & (i53 | 7)) - (~(-(-(i59 << 1))))) - 1;
                    f53611d = i60 % 128;
                    int i61 = i60 % 2;
                    int i62 = i53 + 65;
                    f53611d = i62 % 128;
                    int i63 = i62 % 2;
                    return Boolean.FALSE;
                }
                boolean zBooleanValue = ((Boolean) auv.setDividerPadding(new Object[]{aqqVar9.setOnDragListener, ((aqq) obj).setOnDragListener}, -556949880, 556949904, (int) System.currentTimeMillis())).booleanValue();
                int i64 = f53611d;
                int i65 = i64 ^ 7;
                int i66 = ((i64 & 7) | i65) << 1;
                int i67 = -i65;
                int i68 = ((i66 | i67) << 1) - (i66 ^ i67);
                f53610c = i68 % 128;
                if (i68 % 2 == 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            case 7:
                aqq aqqVar10 = (aqq) objArr[0];
                int[] iArr10 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar10.setOnDragListener, iArr10}, -164590307, 164590308, (int) System.currentTimeMillis());
                aqq aqqVar11 = new aqq(iArr10);
                int i69 = f53611d;
                int i70 = ((i69 | 3) << 1) - (((~i69) & 3) | (i69 & (-4)));
                f53610c = i70 % 128;
                if (i70 % 2 == 0) {
                    return aqqVar11;
                }
                throw null;
            case 8:
                aqq aqqVar12 = (aqq) objArr[0];
                int[] iArr11 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar12.setOnDragListener, iArr11}, -939934994, 939935001, (int) System.currentTimeMillis());
                aqq aqqVar13 = new aqq(iArr11);
                int i71 = f53610c;
                int i72 = ((i71 ^ 53) | (i71 & 53)) << 1;
                int i73 = -(((~i71) & 53) | (i71 & (-54)));
                int i74 = ((i72 | i73) << 1) - (i73 ^ i72);
                f53611d = i74 % 128;
                if (i74 % 2 != 0) {
                    return aqqVar13;
                }
                throw null;
            case 9:
                aqq aqqVar14 = (aqq) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                int[] iArr12 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar14.setOnDragListener, ((aqq) apkVar3).setOnDragListener, iArr12}, 414135046, -414135033, (int) System.currentTimeMillis());
                aqq aqqVar15 = new aqq(iArr12);
                int i75 = f53610c;
                int i76 = i75 & 77;
                int i77 = (i75 ^ 77) | i76;
                int i78 = (i76 ^ i77) + ((i77 & i76) << 1);
                f53611d = i78 % 128;
                int i79 = i78 % 2;
                return aqqVar15;
            case 10:
                aqq aqqVar16 = (aqq) objArr[0];
                apk apkVar4 = (apk) objArr[1];
                int[] iArr13 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar16.setOnDragListener, ((aqq) apkVar4).setOnDragListener, iArr13}, 2077221675, -2077221664, (int) System.currentTimeMillis());
                aqq aqqVar17 = new aqq(iArr13);
                int i80 = f53610c;
                int i81 = ((i80 & 86) + (i80 | 86)) - 1;
                f53611d = i81 % 128;
                if (i81 % 2 != 0) {
                    return aqqVar17;
                }
                throw null;
            case 11:
                aqq aqqVar18 = (aqq) objArr[0];
                int i82 = f53611d;
                int i83 = (((i82 | 80) << 1) - (i82 ^ 80)) - 1;
                f53610c = i83 % 128;
                int i84 = i83 % 2;
                int[] iArr14 = aqqVar18.setOnDragListener;
                if (i84 == 0 ? ((Integer) auv.setDividerPadding(new Object[]{iArr14}, -1406133537, 1406133560, (int) System.currentTimeMillis())).intValue() != 1 : ((Integer) auv.setDividerPadding(new Object[]{iArr14}, -1406133537, 1406133560, (int) System.currentTimeMillis())).intValue() != 0) {
                    int i85 = f53610c + 117;
                    f53611d = i85 % 128;
                    if (i85 % 2 == 0) {
                        int i86 = 85 / 0;
                    }
                    return Boolean.FALSE;
                }
                int i87 = f53611d;
                int i88 = i87 & 43;
                int i89 = i88 + ((i87 ^ 43) | i88);
                int i90 = i89 % 128;
                f53610c = i90;
                int i91 = i89 % 2;
                int i92 = ((i90 & (-14)) | ((~i90) & 13)) + ((i90 & 13) << 1);
                f53611d = i92 % 128;
                if (i92 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            case 12:
                aqq aqqVar19 = (aqq) objArr[0];
                int[] iArr15 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar19.setOnDragListener, iArr15}, -1052434624, 1052434630, (int) System.currentTimeMillis());
                aqq aqqVar20 = new aqq(iArr15);
                int i93 = f53611d;
                int i94 = i93 & 15;
                int i95 = (((i93 | 15) & (~i94)) - (~(i94 << 1))) - 1;
                f53610c = i95 % 128;
                if (i95 % 2 == 0) {
                    return aqqVar20;
                }
                int i96 = 8 / 0;
                return aqqVar20;
            case 13:
                aqq aqqVar21 = (aqq) objArr[0];
                int i97 = f53610c + 27;
                f53611d = i97 % 128;
                int i98 = i97 % 2;
                boolean zBooleanValue2 = ((Boolean) auv.setDividerPadding(new Object[]{aqqVar21.setOnDragListener}, 21461862, -21461835, (int) System.currentTimeMillis())).booleanValue();
                int i99 = f53610c;
                int i100 = i99 ^ 115;
                int i101 = ((i99 & 115) | i100) << 1;
                int i102 = -i100;
                int i103 = ((i101 | i102) << 1) - (i101 ^ i102);
                f53611d = i103 % 128;
                int i104 = i103 % 2;
                return Boolean.valueOf(zBooleanValue2);
            case 14:
                int i105 = f53610c;
                int i106 = (i105 | 123) << 1;
                int i107 = -(i105 ^ 123);
                int i108 = (i106 ^ i107) + ((i107 & i106) << 1);
                f53611d = i108 % 128;
                int i109 = i108 % 2;
                int iBitLength = setOnLongClickListener.bitLength();
                int i110 = f53610c;
                int i111 = i110 & 69;
                int i112 = ((((i110 ^ 69) | i111) << 1) - (~(-((i110 | 69) & (~i111))))) - 1;
                f53611d = i112 % 128;
                int i113 = i112 % 2;
                return Integer.valueOf(iBitLength);
            case 15:
                aqq aqqVar22 = (aqq) objArr[0];
                int[] iArr16 = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                aqr.setCompoundDrawableTintBlendMode(new Object[]{aqqVar22.setOnDragListener, iArr16}, 1580055306, -1580055302, (int) System.currentTimeMillis());
                aqq aqqVar23 = new aqq(iArr16);
                int i114 = f53611d;
                int i115 = i114 & 67;
                int i116 = (i115 - (~(-(-((i114 ^ 67) | i115))))) - 1;
                f53610c = i116 % 128;
                int i117 = i116 % 2;
                return aqqVar23;
            default:
                aqq aqqVar24 = (aqq) objArr[0];
                int i118 = f53610c;
                int i119 = i118 & 75;
                int i120 = ((((i118 ^ 75) | i119) << 1) - (~(-((i118 | 75) & (~i119))))) - 1;
                f53611d = i120 % 128;
                int i121 = i120 % 2;
                boolean zBooleanValue3 = ((Boolean) auv.setDividerPadding(new Object[]{aqqVar24.setOnDragListener}, -1281041716, 1281041721, (int) System.currentTimeMillis())).booleanValue();
                int i122 = f53610c + 17;
                f53611d = i122 % 128;
                int i123 = i122 % 2;
                return Boolean.valueOf(zBooleanValue3);
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setDividerPadding(new Object[]{this, obj}, -1152373537, 1152373543, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1540550264, 1540550277, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setDividerPadding(new Object[]{this}, 978009902, -978009898, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setDividerPadding(new Object[]{this}, 318644931, -318644920, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 217709014, -217709005, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -1902961534, 1902961549, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setDividerPadding(new Object[]{this}, -1279996932, 1279996932, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, -408682983, 408682988, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setDividerPadding(new Object[]{this}, -1836240000, 1836240002, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setDividerPadding(new Object[]{this}, -2129208826, 2129208838, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setDividerPadding(new Object[]{this}, -1586781397, 1586781404, System.identityHashCode(this));
    }

    public aqq() {
        this.setOnDragListener = (int[]) auv.setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setDividerPadding(new Object[]{this}, 685803650, -685803649, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setDividerPadding(new Object[]{this}, -903319018, 903319032, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 339360161, -339360151, System.identityHashCode(this));
    }

    public aqq(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(setOnLongClickListener) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.setOnDragListener = (int[]) aqr.setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1280384229, -1280384215, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setDividerPadding(new Object[]{this, apkVar}, 273377290, -273377287, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setDividerPadding(new Object[]{this}, 82825793, -82825785, System.identityHashCode(this));
    }
}
