package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ave {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53948a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53949b = 1;

    public static boolean setDividerPadding(long[] jArr) {
        return ((Boolean) setX(new Object[]{jArr}, -1712005618, 1712005622, (int) System.currentTimeMillis())).booleanValue();
    }

    public static BigInteger setOnFocusChangeListener(long[] jArr) {
        return (BigInteger) setX(new Object[]{jArr}, -1987896608, 1987896613, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13;
        int i14;
        int i15 = ~i10;
        int i16 = ~i11;
        long j10 = 0;
        int i17 = 7;
        int i18 = 2;
        switch ((((~(i10 | i16)) | (~((~i12) | i16))) * (-964)) + ((i15 | (~(i16 | i12))) * (-964)) + (i11 * 965) + ((i10 * (-963)) - 964)) {
            case 1:
                long[] jArr = (long[]) objArr[0];
                int i19 = f53949b;
                int i20 = ((-1) << 1) - (((i19 & 48) + (i19 | 48)) ^ (-1));
                f53948a = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 0;
                while (true) {
                    if (i22 >= 7) {
                        int i23 = f53948a;
                        int i24 = (i23 | 111) << 1;
                        int i25 = -(i23 ^ 111);
                        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                        f53949b = i26 % 128;
                        int i27 = i26 % 2;
                        objValueOf = Boolean.TRUE;
                    } else {
                        int i28 = f53949b;
                        int i29 = (((i28 | 34) << 1) - (i28 ^ 34)) - 1;
                        f53948a = i29 % 128;
                        if (i29 % 2 != 0) {
                            if (jArr[i22] != 0) {
                                int i30 = ((-1) << 1) - (((i28 & 28) + (i28 | 28)) ^ (-1));
                                f53948a = i30 % 128;
                                int i31 = i30 % 2;
                                objValueOf = false;
                            } else {
                                int i32 = i22 & 1;
                                int i33 = (i22 | 1) & (~i32);
                                int i34 = i32 << 1;
                                i22 = ((i33 | i34) << 1) - (i33 ^ i34);
                                int i35 = i28 & 41;
                                int i36 = (i28 ^ 41) | i35;
                                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                                f53948a = i37 % 128;
                                int i38 = i37 % 2;
                            }
                        } else if (jArr[i22] != 0) {
                            int i39 = ((-1) << 1) - (((i28 & 28) + (i28 | 28)) ^ (-1));
                            f53948a = i39 % 128;
                            int i310 = i39 % 2;
                            objValueOf = false;
                        } else {
                            int i311 = i22 & 1;
                            int i312 = (i22 | 1) & (~i311);
                            int i313 = i311 << 1;
                            i22 = ((i312 | i313) << 1) - (i312 ^ i313);
                            int i314 = i28 & 41;
                            int i315 = (i28 ^ 41) | i314;
                            int i316 = (i314 ^ i315) + ((i315 & i314) << 1);
                            f53948a = i316 % 128;
                            int i317 = i316 % 2;
                        }
                    }
                    break;
                }
                break;
            case 2:
                int i40 = f53948a;
                int i41 = (i40 & 97) + (i40 | 97);
                int i42 = i41 % 128;
                f53949b = i42;
                int i43 = i41 % 2;
                objValueOf = new long[7];
                int i44 = i42 & 23;
                int i45 = -(-(i42 | 23));
                int i46 = (i44 & i45) + (i45 | i44);
                f53948a = i46 % 128;
                if (i46 % 2 != 0) {
                    throw null;
                }
                break;
            case 3:
                int i47 = f53948a;
                int i48 = i47 & 29;
                int i49 = (((i47 ^ 29) | i48) << 1) - ((i47 | 29) & (~i48));
                int i50 = i49 % 128;
                f53949b = i50;
                long[] jArr2 = new long[i49 % 2 == 0 ? 50 : 14];
                int i51 = (i50 ^ 23) + ((i50 & 23) << 1);
                f53948a = i51 % 128;
                int i52 = i51 % 2;
                return jArr2;
            case 4:
                long[] jArr3 = (long[]) objArr[0];
                int i53 = f53948a;
                int i54 = (i53 ^ 7) + ((i53 & 7) << 1);
                f53949b = i54 % 128;
                int i55 = i54 % 2;
                if (jArr3[0] == 1) {
                    int i56 = i53 & 83;
                    int i57 = (i53 ^ 83) | i56;
                    int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                    f53949b = i58 % 128;
                    int i59 = i58 % 2;
                    int i60 = 1;
                    while (true) {
                        if (i60 >= 7) {
                            int i61 = f53948a;
                            int i62 = i61 & 53;
                            int i63 = ((i61 | 53) & (~i62)) + (i62 << 1);
                            f53949b = i63 % 128;
                            if (i63 % 2 == 0) {
                                int i64 = 92 / 0;
                            }
                            objValueOf = Boolean.TRUE;
                            break;
                        } else {
                            i13 = f53948a;
                            int i65 = (-2) - (((i13 & 14) + (i13 | 14)) ^ (-1));
                            f53949b = i65 % 128;
                            if (i65 % 2 == 0) {
                                if (jArr3[i60] == 1) {
                                    int i66 = i60 - 112;
                                    int i67 = (i66 | 113) << 1;
                                    int i68 = -(i66 ^ 113);
                                    i60 = (i67 ^ i68) + ((i67 & i68) << 1);
                                    System.currentTimeMillis();
                                    System.currentTimeMillis();
                                }
                            } else if (jArr3[i60] == 0) {
                                int i69 = i60 - 112;
                                int i610 = (i69 | 113) << 1;
                                int i611 = -(i69 ^ 113);
                                i60 = (i610 ^ i611) + ((i610 & i611) << 1);
                                System.currentTimeMillis();
                                System.currentTimeMillis();
                            }
                        }
                    }
                    int i70 = i13 ^ 115;
                    int i71 = (i13 & 115) << 1;
                    int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                    f53949b = i72 % 128;
                    int i73 = i72 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i74 = i53 + 57;
                    int i75 = i74 % 128;
                    f53949b = i75;
                    boolean z10 = i74 % 2 == 0;
                    int i76 = i75 ^ 61;
                    int i77 = ((i75 & 61) | i76) << 1;
                    int i78 = -i76;
                    int i79 = ((i77 | i78) << 1) - (i77 ^ i78);
                    f53948a = i79 % 128;
                    int i80 = i79 % 2;
                    objValueOf = Boolean.valueOf(z10);
                }
                break;
            case 5:
                long[] jArr4 = (long[]) objArr[0];
                int i81 = f53949b;
                int i82 = ((i81 | 75) << 1) - (i81 ^ 75);
                int i83 = i82 % 128;
                f53948a = i83;
                int i84 = i82 % 2;
                byte[] bArr = new byte[56];
                int i85 = i83 & 107;
                int i86 = ((i83 ^ 107) | i85) << 1;
                int i87 = -((i83 | 107) & (~i85));
                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                f53949b = i88 % 128;
                int i89 = i88 % 2;
                int i90 = 0;
                while (i90 < i17) {
                    int i91 = f53948a;
                    int i92 = ~i91;
                    int i93 = (((i91 ^ 95) | (i91 & 95)) << 1) - ((i91 & (-96)) | (i92 & 95));
                    f53949b = i93 % 128;
                    int i94 = i93 % i18;
                    long j11 = jArr4[i90];
                    if (j11 != j10) {
                        int i95 = (i91 & (-90)) | (i92 & 89);
                        int i96 = -(-((i91 & 89) << 1));
                        int i97 = ((i95 | i96) << 1) - (i95 ^ i96);
                        f53949b = i97 % 128;
                        int i98 = i97 % i18;
                        int i99 = -i90;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i100 = (i99 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 3119;
                        int i101 = (i100 ^ (-1)) + (i100 << 1);
                        int i102 = ~iCurrentTimeMillis;
                        int i103 = ~((i102 ^ 6) | (i102 & 6));
                        int i104 = i99 & i103;
                        int i105 = (((i103 | i99) & (~i104)) | i104) * (-1042);
                        int i106 = i101 & i105;
                        int i107 = (i105 | i101) & (~i106);
                        int i108 = -(-(i106 << 1));
                        int i109 = (((iCurrentTimeMillis ^ 6) | (iCurrentTimeMillis & 6)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i107 & i108) + (i107 | i108);
                        int i110 = ~i99;
                        int i111 = ~((i110 ^ (-7)) | (i110 & (-7)));
                        int i112 = (i110 | i99) & i110;
                        int i113 = i112 ^ iCurrentTimeMillis;
                        int i114 = i112 & iCurrentTimeMillis;
                        int i115 = ~((i113 ^ i114) | (i113 & i114));
                        int i116 = (i111 ^ i115) | (i111 & i115);
                        int i117 = (iCurrentTimeMillis | i102) & i102;
                        int i118 = (i110 & i117) | ((~i117) & i99) | (i117 & i99);
                        int i119 = i118 & 6;
                        int i120 = (i118 | 6) & (~i119);
                        int i121 = (i120 & i119) | (i120 ^ i119);
                        int i122 = ~i121;
                        int i123 = (i121 | i122) & i122;
                        int i124 = ((i109 - (~(-(-(((i123 & i116) | (i116 ^ i123)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))) - 1) << 3;
                        ber.setDividerPadding(new Object[]{Long.valueOf(j11), bArr, Integer.valueOf(i124)}, 108647497, -108647488, i124);
                        int i125 = f53948a;
                        int i126 = ((i125 & (-110)) | ((~i125) & 109)) + ((i125 & 109) << 1);
                        f53949b = i126 % 128;
                        int i127 = i126 % 2;
                    }
                    int i128 = i90 & 1;
                    int i129 = (i90 | 1) & (~i128);
                    int i130 = i128 << 1;
                    i90 = ((i129 & i130) << 1) + (i129 ^ i130);
                    int i131 = f53949b;
                    int i132 = i131 & 43;
                    int i133 = (i131 ^ 43) | i132;
                    int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                    f53948a = i134 % 128;
                    int i135 = i134 % 2;
                    j10 = 0;
                    i17 = 7;
                    i18 = 2;
                }
                objValueOf = new BigInteger(1, bArr);
                int i136 = f53949b;
                int i137 = i136 & 51;
                int i138 = (((i136 | 51) & (~i137)) - (~(-(-(i137 << 1))))) - 1;
                f53948a = i138 % 128;
                if (i138 % 2 != 0) {
                    throw null;
                }
                break;
            case 6:
                long[] jArr5 = (long[]) objArr[0];
                long[] jArr6 = (long[]) objArr[1];
                int i139 = f53948a;
                int i140 = (i139 & 37) + (i139 | 37);
                int i141 = i140 % 128;
                f53949b = i141;
                int i142 = i140 % 2;
                jArr6[0] = jArr5[0];
                jArr6[1] = jArr5[1];
                jArr6[2] = jArr5[2];
                jArr6[3] = jArr5[3];
                jArr6[4] = jArr5[4];
                jArr6[5] = jArr5[5];
                jArr6[6] = jArr5[6];
                int i143 = i141 ^ 65;
                int i144 = ((((i141 & 65) | i143) << 1) - (~(-i143))) - 1;
                f53948a = i144 % 128;
                int i145 = i144 % 2;
                return null;
            default:
                long[] jArr7 = (long[]) objArr[0];
                long[] jArr8 = (long[]) objArr[1];
                int i146 = f53949b;
                int i147 = i146 + 59;
                f53948a = i147 % 128;
                int i148 = i147 % 2 != 0 ? 51 : 6;
                int i149 = (i146 & 126) + (i146 | 126);
                while (true) {
                    int i150 = i149 - 1;
                    f53948a = i150 % 128;
                    int i151 = i150 % 2;
                    if (i148 < 0) {
                        int i152 = f53948a;
                        int i153 = i152 & 117;
                        int i154 = (((i152 | 117) & (~i153)) - (~(i153 << 1))) - 1;
                        f53949b = i154 % 128;
                        int i155 = i154 % 2;
                        objValueOf = Boolean.TRUE;
                        break;
                    } else {
                        i14 = f53949b;
                        int i156 = i14 & 105;
                        int i157 = (~i156) & (i14 | 105);
                        int i158 = i156 << 1;
                        int i159 = (i157 ^ i158) + ((i158 & i157) << 1);
                        f53948a = i159 % 128;
                        if (i159 % 2 != 0) {
                            int i160 = 93 / 0;
                            if (jArr7[i148] == jArr8[i148]) {
                                int i161 = i148 - 45;
                                i148 = ((i161 | 44) << 1) - (i161 ^ 44);
                                i149 = ((i14 | 28) << 1) - (i14 ^ 28);
                            }
                        } else if (jArr7[i148] == jArr8[i148]) {
                            int i162 = i148 - 45;
                            i148 = ((i162 | 44) << 1) - (i162 ^ 44);
                            i149 = ((i14 | 28) << 1) - (i14 ^ 28);
                        }
                    }
                }
                int i163 = i14 | 97;
                int i164 = i163 << 1;
                int i165 = -(i163 & (~(i14 & 97)));
                int i166 = ((i164 | i165) << 1) - (i165 ^ i164);
                f53948a = i166 % 128;
                int i167 = i166 % 2;
                objValueOf = Boolean.FALSE;
                break;
        }
        return objValueOf;
    }

    public static long[] setDividerPadding() {
        return (long[]) setX(new Object[0], 1520214409, -1520214407, (int) System.currentTimeMillis());
    }

    public static boolean setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        return ((Boolean) setX(new Object[]{jArr, jArr2}, 1841458189, -1841458189, (int) System.currentTimeMillis())).booleanValue();
    }

    public static long[] setOnFocusChangeListener() {
        return (long[]) setX(new Object[0], 576198305, -576198302, (int) System.currentTimeMillis());
    }

    public static boolean setX(long[] jArr) {
        return ((Boolean) setX(new Object[]{jArr}, 13321272, -13321271, (int) System.currentTimeMillis())).booleanValue();
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setX(new Object[]{jArr, jArr2}, -1864536113, 1864536119, (int) System.currentTimeMillis());
    }
}
