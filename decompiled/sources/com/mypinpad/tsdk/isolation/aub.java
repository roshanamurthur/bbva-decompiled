package com.mypinpad.tsdk.isolation;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53868a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53869b = 1;

    public static class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final setX f53870a = new setX();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f53871b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f53872c = 1;

        static {
            int i10 = f53871b;
            int i11 = i10 & 41;
            int i12 = (((i10 | 41) & (~i11)) - (~(-(-(i11 << 1))))) - 1;
            f53872c = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 16 / 0;
            }
        }

        public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
            int i13 = f53872c + 23;
            int i14 = i13 % 128;
            f53871b = i14;
            int i15 = i13 % 2;
            int i16 = ((i14 & 90) + (i14 | 90)) - 1;
            f53872c = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 51 / 0;
            }
            return f53870a;
        }
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53868a + 71;
        f53869b = i10 % 128;
        int i11 = i10 % 2;
        int[] iArr3 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
        int[] iArr4 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr, iArr2, iArr3, iArr4}, 755698546, -755698513, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr3}, -1366095932, 1366095952, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr4, iArr4}, -1366095932, 1366095952, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4, iArr}, 531007207, -531007182, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr4, iArr3}, 590383326, -590383288, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr3, iArr2}, 136098252, -136098252, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr4, iArr2}, 592434458, -592434457, (int) System.currentTimeMillis());
        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr2, iArr3, iArr2}, 531007207, -531007182, (int) System.currentTimeMillis());
        int i12 = f53868a;
        int i13 = i12 & 85;
        int i14 = ((i12 ^ 85) | i13) << 1;
        int i15 = -((i12 | 85) & (~i13));
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f53869b = i16 % 128;
        if (i16 % 2 == 0) {
            throw null;
        }
    }

    public static void setCompoundDrawableTintBlendMode(byte[] bArr, byte[] bArr2) {
        setY(new Object[]{bArr, bArr2}, 1965788600, -1965788597, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(SecureRandom secureRandom, byte[] bArr) {
        setY(new Object[]{secureRandom, bArr}, 1886179456, -1886179455, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:42:0x07b3  */
    /* JADX WARN: Code duplicated, block: B:44:0x07cd  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Boolean bool;
        int i13;
        int i14 = ~i10;
        int i15 = ~((~i12) | i14);
        char c10 = 1;
        switch ((((~(i10 | i11 | i12)) | i15) * 338) + ((~(i14 | i11)) * 338) + (((~((~i11) | i10)) | i15 | (~(i10 | i12))) * (-338)) + (i11 * 339) + (i10 * (-337))) {
            case 1:
                SecureRandom secureRandom = (SecureRandom) objArr[0];
                byte[] bArr = (byte[]) objArr[1];
                int i16 = f53869b + 1;
                f53868a = i16 % 128;
                if (i16 % 2 == 0 ? bArr.length != 32 : bArr.length != 53) {
                    throw new IllegalArgumentException("k");
                }
                secureRandom.nextBytes(bArr);
                bArr[0] = (byte) (bArr[0] & 248);
                byte b10 = (byte) (bArr[31] & 127);
                bArr[31] = b10;
                int i17 = b10 ^ 64;
                int i18 = b10 & 64;
                bArr[31] = (byte) ((i18 & i17) | (i17 ^ i18));
                int i19 = f53869b;
                int i20 = i19 ^ 103;
                int i21 = (i19 & 103) << 1;
                int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
                f53868a = i22 % 128;
                int i23 = i22 % 2;
                return null;
            case 2:
                byte[] bArr2 = (byte[]) objArr[0];
                byte[] bArr3 = (byte[]) objArr[1];
                byte[] bArr4 = (byte[]) objArr[2];
                int iIntValue = ((Number) objArr[3]).intValue();
                int i24 = f53869b + 118;
                int i25 = (i24 ^ (-1)) + (i24 << 1);
                f53868a = i25 % 128;
                Object[] objArr2 = new Object[6];
                if (i25 % 2 != 0) {
                    objArr2[0] = bArr2;
                    objArr2[1] = 1;
                    objArr2[2] = bArr3;
                    objArr2[3] = 0;
                    objArr2[4] = bArr4;
                    objArr2[5] = Integer.valueOf(iIntValue);
                    setY(objArr2, 283579501, -283579496, 1);
                    if (((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr4, Integer.valueOf(iIntValue)}, -1326375370, 1326375385, iIntValue)).booleanValue()) {
                        int i26 = f53868a;
                        int i27 = i26 | 51;
                        int i28 = i27 << 1;
                        int i29 = -((~(i26 & 51)) & i27);
                        int i30 = (i28 & i29) + (i29 | i28);
                        f53869b = i30 % 128;
                        int i31 = i30 % 2;
                        bool = Boolean.FALSE;
                    } else {
                        int i32 = f53869b;
                        int i33 = ((i32 | 95) << 1) - (i32 ^ 95);
                        f53868a = i33 % 128;
                        int i34 = i33 % 2;
                        bool = Boolean.TRUE;
                    }
                } else {
                    objArr2[0] = bArr2;
                    objArr2[1] = 0;
                    objArr2[2] = bArr3;
                    objArr2[3] = 0;
                    objArr2[4] = bArr4;
                    objArr2[5] = Integer.valueOf(iIntValue);
                    setY(objArr2, 283579501, -283579496, 0);
                    if (!(!((Boolean) bek.setOnFocusChangeListener(new Object[]{bArr4, Integer.valueOf(iIntValue)}, -1326375370, 1326375385, iIntValue)).booleanValue())) {
                        int i210 = f53868a;
                        int i211 = i210 | 51;
                        int i212 = i211 << 1;
                        int i213 = -((~(i210 & 51)) & i211);
                        int i35 = (i212 & i213) + (i213 | i212);
                        f53869b = i35 % 128;
                        int i36 = i35 % 2;
                        bool = Boolean.FALSE;
                    } else {
                        int i37 = f53869b;
                        int i38 = ((i37 | 95) << 1) - (i37 ^ 95);
                        f53868a = i38 % 128;
                        int i39 = i38 % 2;
                        bool = Boolean.TRUE;
                    }
                }
                return bool;
            case 3:
                byte[] bArr5 = (byte[]) objArr[0];
                byte[] bArr6 = (byte[]) objArr[1];
                int i40 = f53869b;
                int i41 = i40 & 23;
                int i42 = (i40 | 23) & (~i41);
                int i43 = i41 << 1;
                int i44 = (i42 ^ i43) + ((i42 & i43) << 1);
                f53868a = i44 % 128;
                int i45 = i44 % 2;
                setY(new Object[]{bArr5, 0, bArr6, 0}, -14216549, 14216555, 0);
                int i46 = f53868a;
                int i47 = i46 & 113;
                int i48 = -(-(i46 | 113));
                int i49 = (i47 & i48) + (i48 | i47);
                f53869b = i49 % 128;
                int i50 = i49 % 2;
                return null;
            case 4:
                a(objArr);
                return null;
            case 5:
                byte[] bArr7 = (byte[]) objArr[0];
                ((Number) objArr[1]).intValue();
                byte[] bArr8 = (byte[]) objArr[2];
                ((Number) objArr[3]).intValue();
                byte[] bArr9 = (byte[]) objArr[4];
                int iIntValue2 = ((Number) objArr[5]).intValue();
                int i51 = f53869b;
                int i52 = i51 & 29;
                int i53 = (i51 | 29) & (~i52);
                int i54 = -(-(i52 << 1));
                int i55 = ((i53 | i54) << 1) - (i53 ^ i54);
                f53868a = i55 % 128;
                int i56 = i55 % 2;
                int[] iArr = new int[8];
                setY(new Object[]{bArr7, 0, iArr}, -634718449, 634718449, 0);
                int[] iArr2 = iArr;
                int[] iArr3 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                aue.setCompoundDrawableTintBlendMode(new Object[]{bArr8, 0, iArr3}, -533663793, 533663808, 0);
                int[] iArr4 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                aue.setCompoundDrawableTintBlendMode(new Object[]{iArr3, 0, iArr4, 0}, -428053999, 428054005, 0);
                int[] iArr5 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                iArr5[0] = 1;
                int[] iArr6 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                iArr6[0] = 1;
                int[] iArr7 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                int[] iArr8 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                int[] iArr9 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                int i57 = f53869b;
                int i58 = i57 ^ 31;
                int i59 = (((i57 & 31) | i58) << 1) - i58;
                f53868a = i59 % 128;
                char c11 = 2;
                int i60 = i59 % 2;
                int i61 = 254;
                int i62 = 1;
                int i63 = 4;
                while (true) {
                    Object[] objArr3 = new Object[i63];
                    objArr3[0] = iArr6;
                    objArr3[c10] = iArr7;
                    objArr3[c11] = iArr8;
                    objArr3[3] = iArr6;
                    int[] iArr10 = iArr8;
                    aue.setCompoundDrawableTintBlendMode(objArr3, 755698546, -755698513, (int) System.currentTimeMillis());
                    Object[] objArr4 = new Object[i63];
                    objArr4[0] = iArr4;
                    objArr4[c10] = iArr5;
                    objArr4[2] = iArr7;
                    objArr4[3] = iArr4;
                    int[] iArr11 = iArr2;
                    aue.setCompoundDrawableTintBlendMode(objArr4, 755698546, -755698513, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr10, iArr4, iArr10}, 531007207, -531007182, (int) System.currentTimeMillis());
                    byte[] bArr10 = bArr9;
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr6, iArr7, iArr6}, 531007207, -531007182, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr7, iArr7}, -1366095932, 1366095952, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr4, iArr4}, -1366095932, 1366095952, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr7, iArr4, iArr9}, 590383326, -590383288, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr9, iArr5}, 136098252, -136098252, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr5, iArr4, iArr5}, 592434458, -592434457, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr5, iArr9, iArr5}, 531007207, -531007182, (int) System.currentTimeMillis());
                    int[] iArr12 = iArr9;
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr4, iArr7, iArr4}, 531007207, -531007182, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr10, iArr6, iArr6, iArr7}, 755698546, -755698513, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr6, iArr6}, -1366095932, 1366095952, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr7, iArr7}, -1366095932, 1366095952, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr7, iArr3, iArr7}, 531007207, -531007182, (int) System.currentTimeMillis());
                    i61 = (-2) - (~i61);
                    int i64 = (iArr11[i61 >>> 5] >>> (i61 & 31)) & 1;
                    int i65 = i62 & i64;
                    int i66 = (i65 | (i62 ^ i64)) & (~i65);
                    aue.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i66), iArr4, iArr6}, 1700618103, -1700618100, i66);
                    aue.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i66), iArr5, iArr7}, 1700618103, -1700618100, i66);
                    if (i61 < 3) {
                        int i67 = f53869b;
                        int i68 = i67 & 73;
                        int i69 = (i68 - (~((i67 ^ 73) | i68))) - 1;
                        int i70 = i69 % 128;
                        f53868a = i70;
                        int i71 = i69 % 2;
                        int i72 = i70 & 31;
                        int i73 = (i70 | 31) & (~i72);
                        int i74 = i72 << 1;
                        int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                        f53869b = i75 % 128;
                        int i76 = i75 % 2;
                        int i77 = 0;
                        while (i77 < 3) {
                            int i78 = f53868a;
                            int i79 = i78 & 23;
                            int i80 = (i78 | 23) & (~i79);
                            int i81 = i79 << 1;
                            int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                            f53869b = i82 % 128;
                            if (i82 % 2 == 0) {
                                setY(new Object[]{iArr4, iArr5}, 1779496009, -1779496005, (int) System.currentTimeMillis());
                                int i83 = i77 & 139;
                                int i84 = (i83 - (~(-(-((i77 ^ 139) | i83))))) - 1;
                                i77 = (((i84 | (-52)) << 1) - (i84 ^ (-52))) - 1;
                                i13 = 1;
                            } else {
                                setY(new Object[]{iArr4, iArr5}, 1779496009, -1779496005, (int) System.currentTimeMillis());
                                int i85 = i77 & (-118);
                                int i86 = -(-((i77 ^ (-118)) | i85));
                                i13 = 1;
                                int i87 = ((i85 | i86) << 1) - (i85 ^ i86);
                                int i88 = i87 ^ 119;
                                int i89 = ((i87 & 119) | i88) << 1;
                                int i90 = -i88;
                                i77 = ((i89 | i90) << 1) - (i90 ^ i89);
                            }
                            int i91 = f53868a + 88;
                            int i92 = (i91 ^ (-1)) + (i91 << i13);
                            f53869b = i92 % 128;
                            int i93 = i92 % 2;
                        }
                        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr5, iArr5}, -1625475869, 1625475897, (int) System.currentTimeMillis());
                        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr4, iArr5, iArr4}, 531007207, -531007182, (int) System.currentTimeMillis());
                        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr4}, 316623345, -316623313, (int) System.currentTimeMillis());
                        aue.setCompoundDrawableTintBlendMode(new Object[]{iArr4, bArr10, Integer.valueOf(iIntValue2)}, -1110993208, 1110993217, iIntValue2);
                        int i94 = f53869b + 9;
                        f53868a = i94 % 128;
                        int i95 = i94 % 2;
                        return null;
                    }
                    i62 = i64;
                    bArr9 = bArr10;
                    iArr8 = iArr10;
                    iArr2 = iArr11;
                    iArr9 = iArr12;
                    i63 = 4;
                    c10 = 1;
                    c11 = 2;
                }
                break;
            case 6:
                byte[] bArr11 = (byte[]) objArr[0];
                ((Number) objArr[1]).intValue();
                byte[] bArr12 = (byte[]) objArr[2];
                ((Number) objArr[3]).intValue();
                int i96 = f53868a;
                int i97 = ((i96 | 51) << 1) - (i96 ^ 51);
                f53869b = i97 % 128;
                if (i97 % 2 == 0) {
                    int[] iArr13 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                    int[] iArr14 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                    aug.setOnFocusChangeListener(new Object[]{(setX) setX.setCompoundDrawableTintBlendMode(new Object[0], 6013827, -6013827, (int) System.currentTimeMillis()), bArr11, 0, iArr13, iArr14}, -1332156953, 1332156972, 0);
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr14, iArr13, iArr13, iArr14}, 755698546, -755698513, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr14, iArr14}, -1625475869, 1625475897, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr13, iArr14, iArr13}, 531007207, -531007182, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr13}, 316623345, -316623313, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr13, bArr12, 0}, -1110993208, 1110993217, 0);
                } else {
                    int[] iArr15 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                    int[] iArr16 = (int[]) aue.setCompoundDrawableTintBlendMode(new Object[0], 193261318, -193261311, (int) System.currentTimeMillis());
                    aug.setOnFocusChangeListener(new Object[]{(setX) setX.setCompoundDrawableTintBlendMode(new Object[0], 6013827, -6013827, (int) System.currentTimeMillis()), bArr11, 0, iArr15, iArr16}, -1332156953, 1332156972, 0);
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr16, iArr15, iArr15, iArr16}, 755698546, -755698513, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr16, iArr16}, -1625475869, 1625475897, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr15, iArr16, iArr15}, 531007207, -531007182, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr15}, 316623345, -316623313, (int) System.currentTimeMillis());
                    aue.setCompoundDrawableTintBlendMode(new Object[]{iArr15, bArr12, 0}, -1110993208, 1110993217, 0);
                }
                int i98 = f53868a;
                int i99 = ((i98 | 51) << 1) - (i98 ^ 51);
                f53869b = i99 % 128;
                int i100 = i99 % 2;
                return null;
            case 7:
                byte[] bArr13 = (byte[]) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i101 = bArr13[iIntValue3] & 255;
                int i102 = iIntValue3 & 1;
                int i103 = (iIntValue3 ^ 1) | i102;
                int i104 = (i102 & i103) + (i103 | i102);
                int i105 = (bArr13[i104] & 255) << 8;
                int i106 = ((~i105) & i101) | ((~i101) & i105);
                int i107 = i105 & i101;
                int i108 = (i107 & i106) | (i106 ^ i107);
                int i109 = (((i104 & 34) | ((~i104) & (-35))) - (~((i104 & (-35)) << 1))) - 1;
                int i110 = ((i109 ^ 36) | (i109 & 36)) << 1;
                int i111 = -(((~i109) & 36) | (i109 & (-37)));
                int i112 = ((i110 | i111) << 1) - (i111 ^ i110);
                int i113 = (bArr13[i112] & 255) << 16;
                int i114 = (i108 & i113) | ((~i113) & i108) | ((~i108) & i113);
                int i115 = bArr13[((i112 & (-13)) + (i112 | (-13))) + 14] << 24;
                int i116 = ((~i115) & i114) | ((~i114) & i115);
                int i117 = i115 & i114;
                int i118 = (i117 & i116) | (i116 ^ i117);
                int i119 = f53869b;
                int i120 = i119 & 89;
                int i121 = ((i119 ^ 89) | i120) << 1;
                int i122 = -((i119 | 89) & (~i120));
                int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
                f53868a = i123 % 128;
                int i124 = i123 % 2;
                return Integer.valueOf(i118);
            default:
                byte[] bArr14 = (byte[]) objArr[0];
                int iIntValue4 = ((Number) objArr[1]).intValue();
                int[] iArr17 = (int[]) objArr[2];
                int i125 = f53869b;
                int i126 = (i125 & (-76)) | ((~i125) & 75);
                int i127 = -(-((i125 & 75) << 1));
                int i128 = ((i126 | i127) << 1) - (i127 ^ i126);
                f53868a = i128 % 128;
                int i129 = (i128 % 2 != 0 ? 0 : 1) ^ 1;
                while (i129 < 8) {
                    int i130 = f53868a;
                    int i131 = (i130 ^ 65) + ((i130 & 65) << 1);
                    f53869b = i131 % 128;
                    int i132 = i131 % 2;
                    int i133 = i129 << 2;
                    int i134 = ((i133 * (-103)) - (~(-(~(-(-(iIntValue4 * (-103)))))))) - 2;
                    int i135 = ~i133;
                    int i136 = ~iIntValue4;
                    int i137 = i135 ^ i136;
                    int i138 = i135 & i136;
                    int i139 = (i138 & i137) | (i137 ^ i138);
                    int i140 = ~i139;
                    int i141 = (i139 | i140) & i140;
                    int i142 = (i136 | iIntValue4) & i136;
                    int i143 = ~((i142 & iIntValue4) | (i142 ^ iIntValue4));
                    int i144 = ((~i143) & i141) | ((~i141) & i143);
                    int i145 = i141 & i143;
                    int i146 = -(-(((i145 & i144) | (i144 ^ i145)) * 104));
                    int i147 = i134 & i146;
                    int i148 = ((i134 ^ i146) | i147) << 1;
                    int i149 = -((i134 | i146) & (~i147));
                    int i150 = ((i148 | i149) << 1) - (i149 ^ i148);
                    int i151 = -(-((~((i136 ^ i133) | (i136 & i133) | iIntValue4)) * (-104)));
                    int i152 = i150 & i151;
                    int i153 = (i151 ^ i150) | i152;
                    int i154 = (i152 & i153) + (i153 | i152);
                    int i155 = -(~(((i133 & iIntValue4) | (i133 ^ iIntValue4)) * 104));
                    int i156 = (((i154 | i155) << 1) - (i155 ^ i154)) - 1;
                    iArr17[i129] = ((Integer) setY(new Object[]{bArr14, Integer.valueOf(i156)}, -56652158, 56652165, i156)).intValue();
                    i129 = ((i129 & 1) - (~(i129 | 1))) - 1;
                    int i157 = f53869b;
                    int i158 = (i157 & (-10)) | ((~i157) & 9);
                    int i159 = (i157 & 9) << 1;
                    int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                    f53868a = i160 % 128;
                    int i161 = i160 % 2;
                }
                iArr17[0] = iArr17[0] & (-8);
                int i162 = iArr17[7];
                int i163 = Integer.MAX_VALUE & i162;
                iArr17[7] = i163;
                iArr17[7] = (i162 & 1073741824) | (i163 ^ 1073741824);
                int i164 = f53868a;
                int i165 = i164 & 73;
                int i166 = (i164 ^ 73) | i165;
                int i167 = (i165 & i166) + (i166 | i165);
                f53869b = i167 % 128;
                int i168 = i167 % 2;
                return null;
        }
    }

    public static boolean setCompoundDrawableTintBlendMode(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        return ((Boolean) setY(new Object[]{bArr, bArr2, bArr3, Integer.valueOf(i10)}, 903755251, -903755249, i10)).booleanValue();
    }
}
