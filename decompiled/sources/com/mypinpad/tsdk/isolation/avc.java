package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class avc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53944a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53945b = 1;

    public static /* synthetic */ Boolean a(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53945b;
        int i11 = i10 & 93;
        int i12 = ((((i10 ^ 93) | i11) << 1) - (~(-((~i11) & (i10 | 93))))) - 1;
        f53944a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i10 & 11;
        int i15 = (i10 | 11) & (~i14);
        int i16 = -(-(i14 << 1));
        int i17 = ((i15 | i16) << 1) - (i15 ^ i16);
        f53944a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 4;
        while (i19 >= 0) {
            int i20 = f53945b;
            int i21 = i20 + 97;
            int i22 = i21 % 128;
            f53944a = i22;
            int i23 = i21 % 2;
            if (jArr[i19] != jArr2[i19]) {
                int i24 = i22 + 5;
                int i25 = i24 % 128;
                f53945b = i25;
                int i26 = i24 % 2;
                int i27 = ((i25 | 43) << 1) - (i25 ^ 43);
                f53944a = i27 % 128;
                int i28 = i27 % 2;
                return Boolean.FALSE;
            }
            int i29 = i19 - 30;
            int i30 = (i29 ^ (-1)) + (i29 << 1);
            int i31 = i30 & 30;
            int i32 = -(-((i30 ^ 30) | i31));
            i19 = (i31 | i32) + (i31 & i32);
            int i33 = i20 + 111;
            f53944a = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = (-2) - ((f53944a + 74) ^ (-1));
        f53945b = i35 % 128;
        if (i35 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~i12;
        int i18 = (((~(i16 | i17)) | i15) * 68) + ((~(i11 | i15 | i17)) * (-68)) + (((~(i10 | i11)) | (~(i15 | i16 | i17)) | (~(i12 | i11))) * (-68)) + (i11 * (-67)) + (i10 * 69);
        long j10 = 0;
        switch (i18) {
            case 1:
                int i19 = f53945b;
                int i20 = (i19 & (-96)) | ((~i19) & 95);
                int i21 = -(-((i19 & 95) << 1));
                int i22 = ((i20 | i21) << 1) - (i20 ^ i21);
                f53944a = i22 % 128;
                int i23 = i22 % 2;
                long[] jArr = new long[10];
                int i24 = i19 & 1;
                int i25 = ((((i19 ^ 1) | i24) << 1) - (~(-((i19 | 1) & (~i24))))) - 1;
                f53944a = i25 % 128;
                int i26 = i25 % 2;
                return jArr;
            case 2:
                long[] jArr2 = (long[]) objArr[0];
                int i27 = f53944a;
                int i28 = i27 & 105;
                int i29 = ((i27 ^ 105) | i28) << 1;
                int i30 = -((i27 | 105) & (~i28));
                int i31 = (i29 & i30) + (i30 | i29);
                int i32 = i31 % 128;
                f53945b = i32;
                int i33 = i31 % 2;
                byte[] bArr = new byte[40];
                int i34 = (i32 & (-80)) | ((~i32) & 79);
                int i35 = (i32 & 79) << 1;
                int i36 = (i34 & i35) + (i35 | i34);
                f53944a = i36 % 128;
                int i37 = i36 % 2;
                int i38 = 0;
                for (int i39 = 5; i38 < i39; i39 = 5) {
                    int i40 = f53944a;
                    int i41 = ((i40 | 103) << 1) - (i40 ^ 103);
                    f53945b = i41 % 128;
                    int i42 = i41 % 2;
                    long j11 = jArr2[i38];
                    if (j11 != j10) {
                        int i43 = i40 & 97;
                        int i44 = -(-((i40 ^ 97) | i43));
                        int i45 = (i43 & i44) + (i44 | i43);
                        f53945b = i45 % 128;
                        int i46 = i45 % 2;
                        int i47 = -i38;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i48 = i47 * (-947);
                        int i49 = i48 ^ 3796;
                        int i50 = ((i48 & 3796) | i49) << 1;
                        int i51 = -i49;
                        int i52 = (i50 & i51) + (i50 | i51);
                        int i53 = ~i47;
                        int i54 = (i53 | i47) & i53;
                        int i55 = (-5) & iCurrentTimeMillis;
                        int i56 = (~i55) & ((-5) | iCurrentTimeMillis);
                        int i57 = (i56 ^ i55) | (i55 & i56);
                        int i58 = ~i57;
                        int i59 = (i57 | i58) & i58;
                        int i60 = i54 & i59;
                        int i61 = (i59 | i54) & (~i60);
                        int i62 = -(-(((i61 & i60) | (i61 ^ i60)) * (-948)));
                        int i63 = ((i52 ^ i62) - (~(-(-((i52 & i62) << 1))))) - 1;
                        int i64 = (i53 & 4) | ((-5) & (~i53));
                        int i65 = i53 & (-5);
                        int i66 = (i64 & i65) | (i64 ^ i65);
                        int i67 = ~iCurrentTimeMillis;
                        int i68 = i66 ^ i67;
                        int i69 = i66 & i67;
                        int i70 = (i69 & i68) | (i68 ^ i69);
                        int i71 = ~i70;
                        int i72 = (i63 - (~(-(-(((i70 | i71) & i71) * (-948)))))) - 1;
                        int i73 = i47 & (-5);
                        int i74 = (~i73) & (i47 | (-5));
                        int i75 = -(-(((i73 & i74) | (i74 ^ i73)) * 948));
                        int i76 = i72 & i75;
                        int i77 = -(-((i75 ^ i72) | i76));
                        int i78 = (((i76 | i77) << 1) - (i77 ^ i76)) << 3;
                        ber.setDividerPadding(new Object[]{Long.valueOf(j11), bArr, Integer.valueOf(i78)}, 108647497, -108647488, i78);
                        int i79 = f53944a;
                        int i80 = i79 & 107;
                        int i81 = i80 + ((i79 ^ 107) | i80);
                        f53945b = i81 % 128;
                        int i82 = i81 % 2;
                    }
                    int i83 = i38 & 1;
                    i38 = (((~i83) & (i38 | 1)) - (~(i83 << 1))) - 1;
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    j10 = 0;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                int i84 = f53944a;
                int i85 = ((i84 & (-92)) | ((~i84) & 91)) + ((i84 & 91) << 1);
                f53945b = i85 % 128;
                int i86 = i85 % 2;
                return bigInteger;
            case 3:
                long[] jArr3 = (long[]) objArr[0];
                long[] jArr4 = (long[]) objArr[1];
                int i87 = f53945b;
                int i88 = (((i87 & (-26)) | ((~i87) & 25)) - (~(-(-((i87 & 25) << 1))))) - 1;
                f53944a = i88 % 128;
                int i89 = i88 % 2;
                jArr4[0] = jArr3[0];
                jArr4[1] = jArr3[1];
                jArr4[2] = jArr3[2];
                jArr4[3] = jArr3[3];
                jArr4[4] = jArr3[4];
                int i90 = (i87 | 37) << 1;
                int i91 = -(i87 ^ 37);
                int i92 = (i90 & i91) + (i90 | i91);
                f53944a = i92 % 128;
                if (i92 % 2 == 0) {
                    return null;
                }
                throw null;
            case 4:
                int i93 = f53944a;
                int i94 = (i93 & 83) + (i93 | 83);
                f53945b = i94 % 128;
                int i95 = i94 % 2;
                obj = new long[5];
                break;
            case 5:
                return a(objArr);
            case 6:
                long[] jArr5 = (long[]) objArr[0];
                int i96 = f53945b;
                int i97 = (((i96 | 55) << 1) - (~(-(((~i96) & 55) | (i96 & (-56)))))) - 1;
                f53944a = i97 % 128;
                int i98 = i97 % 2;
                int i99 = 0;
                while (true) {
                    if (i99 >= 5) {
                        int i100 = f53945b;
                        int i101 = ((i100 | 101) << 1) - (i100 ^ 101);
                        f53944a = i101 % 128;
                        if (i101 % 2 != 0) {
                            int i102 = 3 / 0;
                        }
                        obj = Boolean.TRUE;
                        break;
                    } else {
                        int i103 = f53945b;
                        int i104 = ((i103 | 69) << 1) - (i103 ^ 69);
                        i13 = i104 % 128;
                        f53944a = i13;
                        if (i104 % 2 != 0) {
                            if (jArr5[i99] == 0) {
                                i99++;
                                int i105 = (i13 | 91) << 1;
                                int i106 = -(i13 ^ 91);
                                int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                                f53945b = i107 % 128;
                                int i108 = i107 % 2;
                            }
                        } else if (jArr5[i99] == 0) {
                            i99++;
                            int i109 = (i13 | 91) << 1;
                            int i1010 = -(i13 ^ 91);
                            int i1011 = (i109 ^ i1010) + ((i1010 & i109) << 1);
                            f53945b = i1011 % 128;
                            int i1012 = i1011 % 2;
                        }
                    }
                }
                int i110 = (i13 & 113) + (i13 | 113);
                f53945b = i110 % 128;
                if (i110 % 2 == 0) {
                    throw null;
                }
                obj = Boolean.FALSE;
                break;
                break;
            default:
                long[] jArr6 = (long[]) objArr[0];
                int i111 = f53945b;
                int i112 = i111 & 11;
                int i113 = -(-((i111 ^ 11) | i112));
                int i114 = (i112 ^ i113) + ((i112 & i113) << 1);
                int i115 = i114 % 128;
                f53944a = i115;
                if (i114 % 2 == 0 ? jArr6[0] == 1 : jArr6[1] == 0) {
                    int i116 = i115 + 37;
                    f53945b = i116 % 128;
                    int i117 = i116 % 2;
                    int i118 = 1;
                    while (true) {
                        if (i118 >= 5) {
                            int i119 = f53944a;
                            int i120 = i119 & 93;
                            int i121 = i120 + ((i119 ^ 93) | i120);
                            f53945b = i121 % 128;
                            if (i121 % 2 == 0) {
                                int i122 = 46 / 0;
                            }
                            obj = Boolean.TRUE;
                            break;
                        } else {
                            i14 = f53945b;
                            int i123 = (i14 & (-56)) | ((~i14) & 55);
                            int i124 = -(-((i14 & 55) << 1));
                            int i125 = (i123 ^ i124) + ((i123 & i124) << 1);
                            int i126 = i125 % 128;
                            f53944a = i126;
                            if (i125 % 2 != 0) {
                                if (jArr6[i118] == 0) {
                                    i118 = ((i118 & 2) + (i118 | 2)) - 1;
                                    int i127 = i126 & 113;
                                    int i128 = ((i126 | 113) & (~i127)) + (i127 << 1);
                                    f53945b = i128 % 128;
                                    int i129 = i128 % 2;
                                }
                            } else if (jArr6[i118] == 0) {
                                i118 = ((i118 & 2) + (i118 | 2)) - 1;
                                int i1210 = i126 & 113;
                                int i1211 = ((i126 | 113) & (~i1210)) + (i1210 << 1);
                                f53945b = i1211 % 128;
                                int i1212 = i1211 % 2;
                            }
                        }
                    }
                    int i130 = i14 ^ 67;
                    int i131 = (((i14 & 67) | i130) << 1) - i130;
                    f53944a = i131 % 128;
                    if (i131 % 2 != 0) {
                        int i132 = 6 / 0;
                    }
                } else {
                    int i133 = (i111 & (-42)) | ((~i111) & 41);
                    int i134 = -(-((i111 & 41) << 1));
                    int i135 = ((i133 | i134) << 1) - (i133 ^ i134);
                    f53944a = i135 % 128;
                    if (i135 % 2 != 0) {
                        throw null;
                    }
                }
                obj = Boolean.FALSE;
                break;
        }
        return obj;
    }

    public static boolean setOnFocusChangeListener(long[] jArr) {
        return ((Boolean) setDividerPadding(new Object[]{jArr}, 263394784, -263394778, (int) System.currentTimeMillis())).booleanValue();
    }

    public static BigInteger setX(long[] jArr) {
        return (BigInteger) setDividerPadding(new Object[]{jArr}, -226230156, 226230158, (int) System.currentTimeMillis());
    }

    public static boolean setY(long[] jArr) {
        return ((Boolean) setDividerPadding(new Object[]{jArr}, -102028197, 102028197, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        return ((Boolean) setDividerPadding(new Object[]{jArr, jArr2}, 502156939, -502156934, (int) System.currentTimeMillis())).booleanValue();
    }

    public static long[] setY() {
        return (long[]) setDividerPadding(new Object[0], 1500667029, -1500667028, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -1373809177, 1373809180, (int) System.currentTimeMillis());
    }

    public static long[] setDividerPadding() {
        return (long[]) setDividerPadding(new Object[0], 961547691, -961547687, (int) System.currentTimeMillis());
    }
}
