package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f54625a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f54626b = 1;

    public static /* synthetic */ Object a(Object[] objArr) {
        byte[] bArr;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = f54625a;
        int i11 = (i10 ^ 37) + ((i10 & 37) << 1);
        int i12 = i11 % 128;
        f54626b = i12;
        if (i11 % 2 == 0) {
            bArr = new byte[2];
            bArr[1] = (byte) iIntValue;
            bArr[0] = (byte) (iIntValue % 75);
            bArr[4] = (byte) ((iIntValue ^ 18) + ((iIntValue & 18) << 1));
            bArr[5] = (byte) (iIntValue % 70);
        } else {
            bArr = new byte[]{(byte) iIntValue, (byte) (iIntValue >>> 8), (byte) (iIntValue >>> 16), (byte) (iIntValue >>> 24)};
        }
        int i13 = i12 & 29;
        int i14 = (i12 | 29) & (~i13);
        int i15 = -(-(i13 << 1));
        int i16 = (i14 & i15) + (i15 | i14);
        f54625a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 94 / 0;
        }
        return bArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = (~i10) | i11;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = (((~(i10 | i17)) | (~((~i11) | i10)) | (~(i15 | i12))) * 140) + ((i16 | (~(i17 | i11))) * (-280)) + ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        int i19 = 0;
        if (i18 == 1) {
            byte[] bArr = (byte[]) objArr[0];
            int i20 = f54625a;
            int i21 = (((i20 & (-108)) | ((~i20) & 107)) - (~(-(-((i20 & 107) << 1))))) - 1;
            int i22 = i21 % 128;
            f54626b = i22;
            int i23 = i21 % 2;
            int i24 = bArr[0] & 255;
            int i25 = (bArr[1] & 255) << 8;
            int i26 = (i24 & i25) | (i24 ^ i25);
            int i27 = (bArr[2] & 255) << 16;
            int i28 = i26 & i27;
            int i29 = (i26 | i27) & (~i28);
            int i30 = (i29 & i28) | (i29 ^ i28);
            int i31 = (bArr[3] & 255) << 24;
            int i32 = (i31 & i30) | ((~i31) & i30) | ((~i30) & i31);
            int i33 = (i22 | 77) << 1;
            int i34 = -(((~i22) & 77) | (i22 & (-78)));
            int i35 = (i33 & i34) + (i34 | i33);
            f54625a = i35 % 128;
            int i36 = i35 % 2;
            return Integer.valueOf(i32);
        }
        if (i18 == 2) {
            byte[] bArr2 = (byte[]) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int i37 = f54625a;
            int i38 = i37 & 15;
            int i39 = (i37 ^ 15) | i38;
            int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
            f54626b = i40 % 128;
            int i41 = i40 % 2;
            int i42 = ((~iIntValue2) | iIntValue2) << 1;
            int i43 = -(~iIntValue2);
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            while (true) {
                int i45 = f54626b;
                if (i44 < 0) {
                    int i46 = ((i45 & 44) + (i45 | 44)) - 1;
                    f54625a = i46 % 128;
                    int i47 = i46 % 2;
                    return Integer.valueOf(i19);
                }
                int i48 = ((i45 | 125) << 1) - (i45 ^ 125);
                int i49 = i48 % 128;
                f54625a = i49;
                int i50 = i48 % 2;
                int i51 = (bArr2[(iIntValue ^ i44) + ((iIntValue & i44) << 1)] & 255) << (i44 << 3);
                int i52 = ((~i51) & i19) | ((~i19) & i51);
                int i53 = i19 & i51;
                i19 = (i53 & i52) | (i52 ^ i53);
                i44 = ((~i44) - (~(i44 << 1))) - 1;
                int i54 = ((i49 & 107) - (~(i49 | 107))) - 1;
                f54626b = i54 % 128;
                int i55 = i54 % 2;
            }
        } else {
            if (i18 == 3) {
                return a(objArr);
            }
            if (i18 == 4) {
                byte[] bArr3 = (byte[]) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i56 = f54625a;
                int i57 = i56 | 113;
                int i58 = (i57 << 1) - (i57 & (~(i56 & 113)));
                f54626b = i58 % 128;
                int i59 = i58 % 2;
                int i60 = iIntValue3 & 1;
                int i61 = ((~i60) & (iIntValue3 | 1)) + (i60 << 1);
                int i62 = bArr3[iIntValue3] & 255;
                int i63 = i61 + 1;
                int i64 = (bArr3[i61] & 255) << 8;
                int i65 = i62 & i64;
                int i66 = ((i62 | i64) & (~i65)) | i65;
                int i67 = (i63 & 90) | ((~i63) & (-91));
                int i68 = -(-((i63 & (-91)) << 1));
                int i69 = (i67 ^ i68) + ((i67 & i68) << 1);
                int i70 = (bArr3[i63] & 255) << 16;
                int i71 = i66 & i70;
                int i72 = ((i66 | i70) & (~i71)) | i71;
                int i73 = (bArr3[(((i69 | 93) << 1) - (i69 ^ 93)) - 1] & 255) << 24;
                int i74 = (i72 & i73) | (i72 ^ i73);
                int i75 = i56 & 49;
                int i76 = (((i56 | 49) & (~i75)) - (~(-(-(i75 << 1))))) - 1;
                f54626b = i76 % 128;
                if (i76 % 2 == 0) {
                    int i77 = 39 / 0;
                }
                return Integer.valueOf(i74);
            }
            if (i18 != 5) {
                int iIntValue4 = ((Number) objArr[0]).intValue();
                byte[] bArr4 = (byte[]) objArr[1];
                int iIntValue5 = ((Number) objArr[2]).intValue();
                int i78 = f54625a;
                int i79 = i78 + 83;
                f54626b = i79 % 128;
                int i80 = i79 % 2;
                int i81 = (iIntValue5 | (-83)) << 1;
                int i82 = -((iIntValue5 & 82) | ((~iIntValue5) & (-83)));
                int i83 = (i81 ^ i82) + ((i81 & i82) << 1);
                int i84 = i83 & 84;
                int i85 = (~i84) & (i83 | 84);
                int i86 = i84 << 1;
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                bArr4[iIntValue5] = (byte) iIntValue4;
                int i88 = i87 & 1;
                int i89 = ((i87 ^ 1) | i88) << 1;
                int i90 = -((~i88) & (i87 | 1));
                int i91 = (i89 ^ i90) + ((i89 & i90) << 1);
                bArr4[i87] = (byte) (iIntValue4 >>> 8);
                int i92 = i91 & 1;
                int i93 = ((~i92) & (i91 | 1)) + (i92 << 1);
                bArr4[i91] = (byte) (iIntValue4 >>> 16);
                bArr4[i93] = (byte) (iIntValue4 >>> 24);
                int i94 = i78 + 7;
                f54626b = i94 % 128;
                int i95 = i94 % 2;
                return null;
            }
            int iIntValue6 = ((Number) objArr[0]).intValue();
            byte[] bArr5 = (byte[]) objArr[1];
            int iIntValue7 = ((Number) objArr[2]).intValue();
            int iIntValue8 = ((Number) objArr[3]).intValue();
            int i96 = f54625a;
            int i97 = i96 & 33;
            int i98 = ((i96 ^ 33) | i97) << 1;
            int i99 = -((~i97) & (i96 | 33));
            int i100 = (i98 & i99) + (i98 | i99);
            f54626b = i100 % 128;
            if (i100 % 2 == 0) {
                int i101 = iIntValue8 & 31;
                int i102 = -(-((iIntValue8 ^ 31) | i101));
                i13 = i101 ^ i102;
                i14 = (i102 & i101) << 1;
            } else {
                int i103 = ~iIntValue8;
                int i104 = -(-(iIntValue8 << 1));
                i13 = i103 & i104;
                i14 = i104 | i103;
            }
            int i105 = i13 + i14;
            int i106 = i96 & 111;
            int i107 = -(-((i96 ^ 111) | i106));
            int i108 = (i106 & i107) + (i106 | i107);
            f54626b = i108 % 128;
            int i109 = i108 % 2;
            while (true) {
                int i110 = f54626b;
                if (i105 < 0) {
                    int i111 = ((i110 | 21) << 1) - (((~i110) & 21) | (i110 & (-22)));
                    f54625a = i111 % 128;
                    int i112 = i111 % 2;
                    return null;
                }
                int i113 = i110 + 60;
                int i114 = (i113 ^ (-1)) + (i113 << 1);
                f54625a = i114 % 128;
                if (i114 % 2 != 0) {
                    int i115 = -(~(-i105));
                    bArr5[(((iIntValue7 | i115) << 1) - (i115 ^ iIntValue7)) - 1] = (byte) (iIntValue6 / (i105 + 3));
                    i105 += 95;
                } else {
                    int i116 = -(~i105);
                    int i117 = (iIntValue7 & i116) + (i116 | iIntValue7);
                    bArr5[(i117 ^ (-1)) + (i117 << 1)] = (byte) (iIntValue6 >>> (i105 << 3));
                    int i118 = (i105 ^ (-35)) + ((i105 & (-35)) << 1);
                    int i119 = (i118 ^ (-1)) + (i118 << 1);
                    int i120 = i119 ^ 35;
                    int i121 = ((i119 & 35) | i120) << 1;
                    int i122 = -i120;
                    i105 = (i121 ^ i122) + ((i122 & i121) << 1);
                }
            }
        }
    }

    public static int setX(byte[] bArr, int i10, int i11) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 546359863, -546359861, i10)).intValue();
    }

    public static void setY(int i10, byte[] bArr, int i11, int i12) {
        setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10), bArr, Integer.valueOf(i11), Integer.valueOf(i12)}, -64321997, 64322002, i10);
    }

    public static int setX(byte[] bArr, int i10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(i10)}, -1589824718, 1589824722, i10)).intValue();
    }

    public static void setY(int i10, byte[] bArr, int i11) {
        setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10), bArr, Integer.valueOf(i11)}, 518212810, -518212810, i10);
    }

    public static byte[] setY(int i10) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i10)}, 1963840984, -1963840981, i10);
    }

    public static int setCompoundDrawableTintBlendMode(byte[] bArr) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{bArr}, -395531773, 395531774, (int) System.currentTimeMillis())).intValue();
    }
}
