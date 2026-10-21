package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class avi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53960a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53961b = 1;

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -1909593140, 1909593141, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0249 A[PHI: r14
      0x0249: PHI (r14v8 long) = (r14v7 long), (r14v9 long) binds: [B:74:0x0247, B:71:0x0240] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16 = ~i10;
        int i17 = ~(i16 | i11);
        int i18 = ~(i16 | i12);
        int i19 = ~i11;
        int i20 = ((i18 | (~(i19 | i12))) * 140) + ((i17 | i18) * (-280)) + (i11 * (-139)) + (i10 * 141);
        int i21 = ~(i16 | i19 | i12);
        int i22 = ~i12;
        int i23 = (((~(i10 | i22 | i19)) | (~(i11 | i16 | i22)) | i21) * 140) + i20;
        long j11 = 0;
        long j12 = 1;
        int i24 = 9;
        int i25 = 2;
        switch (i23) {
            case 1:
                long[] jArr = (long[]) objArr[0];
                long[] jArr2 = (long[]) objArr[1];
                int i26 = f53960a;
                int i27 = (i26 | 105) << 1;
                int i28 = -(((~i26) & 105) | (i26 & (-106)));
                int i29 = (i27 & i28) + (i28 | i27);
                int i30 = i29 % 128;
                f53961b = i30;
                int i31 = i29 % 2;
                jArr2[0] = jArr[0];
                jArr2[1] = jArr[1];
                jArr2[2] = jArr[2];
                jArr2[3] = jArr[3];
                jArr2[4] = jArr[4];
                jArr2[5] = jArr[5];
                jArr2[6] = jArr[6];
                jArr2[7] = jArr[7];
                jArr2[8] = jArr[8];
                int i32 = (i30 & 45) + (i30 | 45);
                f53960a = i32 % 128;
                int i33 = i32 % 2;
                return null;
            case 2:
                int i34 = f53960a;
                int i35 = i34 + 115;
                f53961b = i35 % 128;
                objValueOf = new long[i35 % 2 == 0 ? 119 : 9];
                int i36 = (i34 ^ 75) + ((i34 & 75) << 1);
                f53961b = i36 % 128;
                if (i36 % 2 == 0) {
                    throw null;
                }
                break;
            case 3:
                long[] jArr3 = (long[]) objArr[0];
                int i37 = f53961b;
                int i38 = i37 + 29;
                f53960a = i38 % 128;
                int i39 = i38 % 2;
                byte[] bArr = new byte[72];
                int i40 = i37 & 77;
                int i41 = ((i37 ^ 77) | i40) << 1;
                int i42 = -((i37 | 77) & (~i40));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f53960a = i43 % 128;
                int i44 = i43 % 2;
                int i45 = 0;
                while (i45 < i24) {
                    int i46 = f53960a;
                    int i47 = i46 ^ 111;
                    int i48 = ((i46 & 111) | i47) << 1;
                    int i49 = -i47;
                    int i50 = ((i48 | i49) << 1) - (i48 ^ i49);
                    f53961b = i50 % 128;
                    if (i50 % i25 == 0) {
                        j10 = jArr3[i45];
                        if (j10 != j12) {
                            int i51 = -i45;
                            int iCurrentTimeMillis = (int) System.currentTimeMillis();
                            int i52 = -(~(-(-(i51 * (-963)))));
                            int i53 = (i52 ^ (-964)) + ((i52 & (-964)) << 1);
                            int i54 = (i53 ^ (-1)) + (i53 << 1);
                            int i55 = i54 & 7720;
                            int i56 = (i54 | 7720) & (~i55);
                            int i57 = -(-(i55 << 1));
                            int i58 = (i56 & i57) + (i56 | i57);
                            int i59 = ~i51;
                            int i60 = ~(((-9) ^ iCurrentTimeMillis) | ((-9) & iCurrentTimeMillis));
                            int i61 = i59 & i60;
                            int i62 = (i59 | i60) & (~i61);
                            int i63 = ((i61 & i62) | (i62 ^ i61)) * (-964);
                            int i64 = (i58 & i63) + (i63 | i58);
                            int i65 = ~((~iCurrentTimeMillis) | (-9));
                            int i66 = ((-9) ^ i51) | ((-9) & i51);
                            int i67 = (i66 | (~i66)) & (~i66);
                            int i68 = ((~i67) & i65) | ((~i65) & i67);
                            int i69 = i65 & i67;
                            int i70 = ((i69 & i68) | (i68 ^ i69)) * (-964);
                            int i71 = ((i64 & i70) + (i70 | i64)) << 3;
                            ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i71)}, 108647497, -108647488, i71);
                            int i72 = f53961b;
                            int i73 = ((i72 | 67) << 1) - (i72 ^ 67);
                            f53960a = i73 % 128;
                            int i74 = i73 % 2;
                        }
                    } else {
                        j10 = jArr3[i45];
                        if (j10 != j11) {
                            int i510 = -i45;
                            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                            int i511 = -(~(-(-(i510 * (-963)))));
                            int i512 = (i511 ^ (-964)) + ((i511 & (-964)) << 1);
                            int i513 = (i512 ^ (-1)) + (i512 << 1);
                            int i514 = i513 & 7720;
                            int i515 = (i513 | 7720) & (~i514);
                            int i516 = -(-(i514 << 1));
                            int i517 = (i515 & i516) + (i515 | i516);
                            int i518 = ~i510;
                            int i610 = ~(((-9) ^ iCurrentTimeMillis2) | ((-9) & iCurrentTimeMillis2));
                            int i611 = i518 & i610;
                            int i612 = (i518 | i610) & (~i611);
                            int i613 = ((i611 & i612) | (i612 ^ i611)) * (-964);
                            int i614 = (i517 & i613) + (i613 | i517);
                            int i615 = ~((~iCurrentTimeMillis2) | (-9));
                            int i616 = ((-9) ^ i510) | ((-9) & i510);
                            int i617 = (i616 | (~i616)) & (~i616);
                            int i618 = ((~i617) & i615) | ((~i615) & i617);
                            int i619 = i615 & i617;
                            int i75 = ((i619 & i618) | (i618 ^ i619)) * (-964);
                            int i76 = ((i614 & i75) + (i75 | i614)) << 3;
                            ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i76)}, 108647497, -108647488, i76);
                            int i77 = f53961b;
                            int i78 = ((i77 | 67) << 1) - (i77 ^ 67);
                            f53960a = i78 % 128;
                            int i79 = i78 % 2;
                        }
                    }
                    i45++;
                    int i80 = f53960a;
                    int i81 = ((i80 & (-50)) | ((~i80) & 49)) + ((i80 & 49) << 1);
                    f53961b = i81 % 128;
                    int i82 = i81 % 2;
                    j11 = 0;
                    j12 = 1;
                    i24 = 9;
                    i25 = 2;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                int i83 = f53960a + 26;
                int i84 = (i83 ^ (-1)) + (i83 << 1);
                f53961b = i84 % 128;
                int i85 = i84 % 2;
                return bigInteger;
            case 4:
                long[] jArr4 = (long[]) objArr[0];
                long[] jArr5 = (long[]) objArr[1];
                int i86 = f53961b;
                int i87 = (-2) - (((i86 & 96) + (i86 | 96)) ^ (-1));
                f53960a = i87 % 128;
                int i88 = i87 % 2 != 0 ? 2 : 8;
                while (true) {
                    if (i88 < 0) {
                        int i89 = f53961b;
                        int i90 = ((i89 ^ 113) | (i89 & 113)) << 1;
                        int i91 = -(((~i89) & 113) | (i89 & (-114)));
                        int i92 = (i90 & i91) + (i91 | i90);
                        f53960a = i92 % 128;
                        int i93 = i92 % 2;
                        objValueOf = Boolean.TRUE;
                        break;
                    } else {
                        i13 = f53961b;
                        int i94 = ((i13 | 49) << 1) - ((i13 & (-50)) | ((~i13) & 49));
                        int i95 = i94 % 128;
                        f53960a = i95;
                        if (i94 % 2 != 0) {
                            int i96 = 96 / 0;
                            if (jArr4[i88] == jArr5[i88]) {
                                i88 = (i88 - (~((~i88) | i88))) - 1;
                                int i97 = i95 & 43;
                                int i98 = (i95 ^ 43) | i97;
                                int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
                                f53961b = i99 % 128;
                                int i100 = i99 % 2;
                            }
                        } else if (jArr4[i88] == jArr5[i88]) {
                            i88 = (i88 - (~((~i88) | i88))) - 1;
                            int i910 = i95 & 43;
                            int i911 = (i95 ^ 43) | i910;
                            int i912 = (i910 ^ i911) + ((i910 & i911) << 1);
                            f53961b = i912 % 128;
                            int i101 = i912 % 2;
                        }
                    }
                }
                int i102 = i13 & 101;
                int i103 = (i102 - (~(-(-((i13 ^ 101) | i102))))) - 1;
                f53960a = i103 % 128;
                if (i103 % 2 != 0) {
                    int i104 = 21 / 0;
                }
                objValueOf = Boolean.FALSE;
                break;
            case 5:
                long[] jArr6 = (long[]) objArr[0];
                int i105 = f53960a;
                int i106 = i105 ^ 71;
                int i107 = ((i105 & 71) | i106) << 1;
                int i108 = -i106;
                int i109 = ((i107 | i108) << 1) - (i107 ^ i108);
                f53961b = i109 % 128;
                int i110 = i109 % 2 == 0 ? 1 : 0;
                while (true) {
                    if (i110 >= 9) {
                        int i111 = f53961b;
                        int i112 = (i111 & 101) + (i111 | 101);
                        f53960a = i112 % 128;
                        int i113 = i112 % 2;
                        objValueOf = Boolean.TRUE;
                        break;
                    } else {
                        int i114 = f53960a + 13;
                        i14 = i114 % 128;
                        f53961b = i14;
                        if (i114 % 2 == 0) {
                            if (jArr6[i110] == 1) {
                                int i115 = i110 ^ 1;
                                int i116 = (i110 & 1) << 1;
                                i110 = (i115 ^ i116) + ((i115 & i116) << 1);
                                int i117 = i14 & 27;
                                int i118 = -(-((i14 ^ 27) | i117));
                                int i119 = (i117 & i118) + (i117 | i118);
                                f53960a = i119 % 128;
                                int i120 = i119 % 2;
                            }
                        } else if (jArr6[i110] == 0) {
                            int i1110 = i110 ^ 1;
                            int i1111 = (i110 & 1) << 1;
                            i110 = (i1110 ^ i1111) + ((i1110 & i1111) << 1);
                            int i1112 = i14 & 27;
                            int i1113 = -(-((i14 ^ 27) | i1112));
                            int i1114 = (i1112 & i1113) + (i1112 | i1113);
                            f53960a = i1114 % 128;
                            int i121 = i1114 % 2;
                        }
                    }
                }
                int i122 = i14 & 19;
                int i123 = i122 + ((i14 ^ 19) | i122);
                f53960a = i123 % 128;
                if (i123 % 2 != 0) {
                    throw null;
                }
                objValueOf = Boolean.FALSE;
                break;
                break;
            case 6:
                int i124 = f53960a + 59;
                int i125 = i124 % 128;
                f53961b = i125;
                int i126 = i124 % 2;
                objValueOf = new long[18];
                int i127 = i125 & 115;
                int i128 = ((i125 | 115) & (~i127)) + (i127 << 1);
                f53960a = i128 % 128;
                if (i128 % 2 != 0) {
                    throw null;
                }
                break;
            default:
                long[] jArr7 = (long[]) objArr[0];
                int i129 = f53961b;
                int i130 = (-2) - (((i129 & 104) + (i129 | 104)) ^ (-1));
                int i131 = i130 % 128;
                f53960a = i131;
                int i132 = i130 % 2;
                if (jArr7[0] != 1) {
                    int i133 = i131 & 11;
                    int i134 = (i131 ^ 11) | i133;
                    int i135 = ((i133 | i134) << 1) - (i133 ^ i134);
                    f53961b = i135 % 128;
                    objValueOf = Boolean.valueOf(i135 % 2 == 0);
                } else {
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    int i136 = 1;
                    while (true) {
                        if (i136 >= 9) {
                            int i137 = f53960a;
                            int i138 = (i137 & 113) + (i137 | 113);
                            f53961b = i138 % 128;
                            if (i138 % 2 == 0) {
                                throw null;
                            }
                            objValueOf = Boolean.TRUE;
                            break;
                        } else {
                            i15 = f53961b;
                            int i139 = (i15 & 1) + (i15 | 1);
                            int i140 = i139 % 128;
                            f53960a = i140;
                            if (i139 % 2 != 0) {
                                if (jArr7[i136] == 0) {
                                    int i141 = i136 & 52;
                                    int i142 = i141 + ((i136 ^ 52) | i141);
                                    int i143 = i142 ^ (-51);
                                    int i144 = ((i142 & (-51)) | i143) << 1;
                                    int i145 = -i143;
                                    i136 = (i145 | i144) + (i144 & i145);
                                    int i146 = i140 & 103;
                                    int i147 = ((((i140 ^ 103) | i146) << 1) - (~(-((~i146) & (i140 | 103))))) - 1;
                                    f53961b = i147 % 128;
                                    int i148 = i147 % 2;
                                }
                            } else if (jArr7[i136] == 0) {
                                int i149 = i136 & 52;
                                int i1410 = i149 + ((i136 ^ 52) | i149);
                                int i1411 = i1410 ^ (-51);
                                int i1412 = ((i1410 & (-51)) | i1411) << 1;
                                int i1413 = -i1411;
                                i136 = (i1413 | i1412) + (i1412 & i1413);
                                int i1414 = i140 & 103;
                                int i1415 = ((((i140 ^ 103) | i1414) << 1) - (~(-((~i1414) & (i140 | 103))))) - 1;
                                f53961b = i1415 % 128;
                                int i1416 = i1415 % 2;
                            }
                        }
                    }
                    int i150 = (-2) - (((i15 ^ 36) + ((i15 & 36) << 1)) ^ (-1));
                    f53960a = i150 % 128;
                    if (i150 % 2 != 0) {
                        throw null;
                    }
                    objValueOf = Boolean.FALSE;
                }
                break;
        }
        return objValueOf;
    }

    public static boolean setOnFocusChangeListener(long[] jArr) {
        return ((Boolean) setDividerPadding(new Object[]{jArr}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setX(long[] jArr) {
        return ((Boolean) setDividerPadding(new Object[]{jArr}, -1614623958, 1614623958, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        return ((Boolean) setDividerPadding(new Object[]{jArr, jArr2}, -1456486518, 1456486522, (int) System.currentTimeMillis())).booleanValue();
    }

    public static long[] setOnFocusChangeListener() {
        return (long[]) setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
    }

    public static BigInteger setDividerPadding(long[] jArr) {
        return (BigInteger) setDividerPadding(new Object[]{jArr}, -1802999956, 1802999959, (int) System.currentTimeMillis());
    }

    public static long[] setDividerPadding() {
        return (long[]) setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
    }
}
