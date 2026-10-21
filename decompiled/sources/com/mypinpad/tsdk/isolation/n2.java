package com.mypinpad.tsdk.isolation;

import com.esotericsoftware.asm.Opcodes;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f57191a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57192b = 1;

    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) {
        short[][] sArr;
        int i13 = ~i10;
        int i14 = ~i12;
        int i15 = (((~(i13 | i12)) | (~(i11 | i14))) * 333) + (((~(i13 | i14)) | (~(i11 | i12))) * 333) + (i13 * (-333)) + (i11 * 334) + (i10 * (-665));
        if (i15 != 1) {
            int i16 = -2;
            if (i15 == 2) {
                short[][] sArr2 = (short[][]) objArr[0];
                int i17 = f57192b;
                int i18 = (i17 ^ 97) + ((i17 & 97) << 1);
                f57191a = i18 % 128;
                int i19 = i18 % 2;
                short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr2[0].length, sArr2.length);
                int i20 = f57192b;
                int i21 = (((i20 ^ 63) | (i20 & 63)) << 1) - (((~i20) & 63) | (i20 & (-64)));
                f57191a = i21 % 128;
                int i22 = i21 % 2;
                int i23 = 0;
                while (i23 < sArr2.length) {
                    int i24 = f57191a;
                    int i25 = (i24 & 67) + (i24 | 67);
                    f57192b = i25 % 128;
                    int i26 = i25 % 2;
                    int i27 = 0;
                    while (i27 < sArr2[0].length) {
                        int i28 = f57191a;
                        int i29 = (-2) - (((i28 ^ 114) + ((i28 & 114) << 1)) ^ (-1));
                        f57192b = i29 % 128;
                        int i30 = i29 % 2;
                        sArr3[i27][i23] = sArr2[i23][i27];
                        int i31 = i27 & 1;
                        int i32 = ((i27 ^ 1) | i31) << 1;
                        int i33 = -((i27 | 1) & (~i31));
                        i27 = (i33 | i32) + (i32 & i33);
                        int i34 = i28 + 11;
                        f57192b = i34 % 128;
                        int i35 = i34 % 2;
                    }
                    int i36 = i23 & (-117);
                    int i37 = (i23 ^ (-117)) | i36;
                    int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
                    int i39 = i38 & 118;
                    int i40 = -(-((i38 ^ 118) | i39));
                    i23 = (i39 | i40) + (i39 & i40);
                    int i41 = f57192b;
                    int i42 = (i41 & 87) + (i41 | 87);
                    f57191a = i42 % 128;
                    int i43 = i42 % 2;
                }
                int i44 = f57191a;
                int i45 = (i44 | 119) << 1;
                int i46 = -(i44 ^ 119);
                int i47 = (i45 & i46) + (i46 | i45);
                f57192b = i47 % 128;
                int i48 = i47 % 2;
                return sArr3;
            }
            if (i15 == 3) {
                return b(objArr);
            }
            if (i15 == 4) {
                short[][] sArr4 = (short[][]) objArr[0];
                short[][] sArr5 = (short[][]) objArr[1];
                int i49 = f57192b;
                int i50 = i49 & 51;
                int i51 = (i49 | 51) & (~i50);
                int i52 = i50 << 1;
                int i53 = (i51 & i52) + (i51 | i52);
                int i54 = i53 % 128;
                f57191a = i54;
                if (i53 % 2 != 0) {
                    int length = sArr4.length;
                    int length2 = sArr5.length;
                    throw null;
                }
                if (sArr4.length == sArr5.length) {
                    int i55 = ((i54 | 7) << 1) - (i54 ^ 7);
                    f57192b = i55 % 128;
                    if (i55 % 2 != 0 ? sArr4[0].length == sArr5[0].length : sArr4[0].length == sArr5[0].length) {
                        sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr4.length, sArr4[0].length);
                        int i56 = f57191a;
                        int i57 = ((i56 | 57) << 1) - (i56 ^ 57);
                        f57192b = i57 % 128;
                        int i58 = i57 % 2;
                        int i59 = 0;
                        while (i59 < sArr4.length) {
                            int i60 = f57191a;
                            int i61 = i60 & 63;
                            int i62 = (i61 - (~(-(-((i60 ^ 63) | i61))))) - 1;
                            f57192b = i62 % 128;
                            int i63 = i62 % 2;
                            int i64 = 0;
                            while (i64 < sArr4[0].length) {
                                int i65 = f57192b;
                                int i66 = i65 & 125;
                                int i67 = (i65 ^ 125) | i66;
                                int i68 = ((i66 | i67) << 1) - (i67 ^ i66);
                                f57191a = i68 % 128;
                                if (i68 % 2 != 0) {
                                    sArr[i59][i64] = ((Short) l2.a(new Object[]{Short.valueOf(sArr4[i59][i64]), Short.valueOf(sArr5[i59][i64])}, 1293451345, -1293451343, (int) System.currentTimeMillis())).shortValue();
                                    int i69 = i64 & 21;
                                    i64 = ((((i64 ^ 21) | i69) << 1) - (~(-((i64 | 21) & (~i69))))) - 1;
                                } else {
                                    sArr[i59][i64] = ((Short) l2.a(new Object[]{Short.valueOf(sArr4[i59][i64]), Short.valueOf(sArr5[i59][i64])}, 1293451345, -1293451343, (int) System.currentTimeMillis())).shortValue();
                                    int i70 = i64 ^ (-105);
                                    int i71 = ((i64 & (-105)) | i70) << 1;
                                    int i72 = -i70;
                                    int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
                                    i64 = ((i73 & 107) + (i73 | 107)) - 1;
                                }
                            }
                            int i74 = (-2) - ((i59 + 7) ^ (-1));
                            int i75 = i74 ^ (-5);
                            int i76 = ((i74 & (-5)) | i75) << 1;
                            int i77 = -i75;
                            i59 = ((i76 & i77) << 1) + (i76 ^ i77);
                            int i78 = f57191a;
                            int i79 = i78 & 3;
                            int i80 = i78 | 3;
                            int i81 = (i79 ^ i80) + ((i80 & i79) << 1);
                            f57192b = i81 % 128;
                            int i82 = i81 % 2;
                        }
                        int i83 = f57191a + 27;
                        f57192b = i83 % 128;
                        if (i83 % 2 == 0) {
                            throw null;
                        }
                    }
                }
                throw new RuntimeException("Addition is not possible!");
            }
            if (i15 != 5) {
                short[][] sArr6 = (short[][]) objArr[0];
                int i84 = f57192b;
                int i85 = i84 & 53;
                int i86 = (i84 ^ 53) | i85;
                int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                f57191a = i87 % 128;
                int i88 = i87 % 2;
                if (sArr6.length != sArr6[0].length) {
                    throw new RuntimeException("Addition is not possible!");
                }
                short[][] sArr7 = (short[][]) a(new Object[]{sArr6, (short[][]) a(new Object[]{sArr6}, -1612271514, 1612271516, (int) System.currentTimeMillis())}, 768921800, -768921796, (int) System.currentTimeMillis());
                int i89 = f57192b;
                int i90 = (i89 & 32) + (i89 | 32);
                int i91 = (i90 ^ (-1)) + (i90 << 1);
                f57191a = i91 % 128;
                if (i91 % 2 == 0) {
                    return sArr7;
                }
                int i92 = 86 / 0;
                return sArr7;
            }
            short[][] sArr8 = (short[][]) objArr[0];
            int i93 = f57191a;
            int i94 = i93 | 113;
            int i95 = i94 << 1;
            int i96 = -((~(i93 & 113)) & i94);
            int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
            f57192b = i97 % 128;
            int i98 = i97 % 2;
            int length3 = sArr8.length;
            if (i98 != 0 ? length3 != sArr8[0].length : length3 != sArr8[0].length) {
                throw new RuntimeException("Computation to upper triangular matrix is not possible!");
            }
            short[][] sArr9 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr8.length, sArr8.length);
            int i99 = f57192b;
            int i100 = i99 & 29;
            int i101 = (i99 | 29) & (~i100);
            int i102 = i100 << 1;
            int i103 = ((i101 | i102) << 1) - (i101 ^ i102);
            f57191a = i103 % 128;
            int i104 = i103 % 2;
            int i105 = 0;
            while (i105 < sArr8.length) {
                int i106 = f57191a;
                int i107 = i106 ^ 79;
                int i108 = (((i106 & 79) | i107) << 1) - i107;
                f57192b = i108 % 128;
                int i109 = i108 % 2;
                sArr9[i105][i105] = sArr8[i105][i105];
                System.currentTimeMillis();
                int i110 = 1648 - (~(-(~(-(-(i105 * 825))))));
                int i111 = (i110 ^ (-1)) + (i110 << 1);
                int i112 = ~i105;
                int i113 = (i112 | i105) & i112;
                int i114 = i113 & 1;
                int i115 = (i113 | 1) & (~i114);
                int i116 = -(-(((i115 & i114) | (i115 ^ i114)) * (-824)));
                int i117 = i111 | i116;
                int i118 = ((i117 << 1) - (~(-((~(i111 & i116)) & i117)))) - 1;
                int i119 = ((i105 ^ 1) | (i105 & 1)) * (-1648);
                int i120 = i118 & i119;
                int i121 = ((i118 ^ i119) | i120) << 1;
                int i122 = -((i119 | i118) & (~i120));
                int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                int i124 = -(-(((i112 & i16) | (i16 ^ i112)) * 824));
                int i125 = (i123 | i124) << 1;
                int i126 = -((i124 & (~i123)) | ((~i124) & i123));
                int i127 = ((i125 | i126) << 1) - (i126 ^ i125);
                int i128 = f57192b;
                int i129 = i128 & 105;
                int i130 = (((i128 | 105) & (~i129)) - (~(i129 << 1))) - 1;
                f57191a = i130 % 128;
                int i131 = i130 % 2;
                while (i127 < sArr8[0].length) {
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i132 = ~iCurrentTimeMillis;
                    int i133 = (-1183497464) & i132;
                    int i134 = (-1630291856) - (~(-(~(-(-((~(((~i133) & ((-1183497464) | i132)) | i133)) * 979))))));
                    int i135 = 938374516 & iCurrentTimeMillis;
                    int i136 = (~i135) & (938374516 | iCurrentTimeMillis);
                    int i137 = ((i136 ^ i135) | (i136 & i135)) * (-979);
                    int i138 = i134 & i137;
                    int i139 = -(-((i137 ^ i134) | i138));
                    int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
                    int i141 = (1183497463 & iCurrentTimeMillis) | i133;
                    int i142 = (-1183497464) & iCurrentTimeMillis;
                    int i143 = ~((i141 & i142) | (i141 ^ i142));
                    int i144 = (i132 | iCurrentTimeMillis) & i132;
                    int i145 = ~((i144 & 938374516) | (i144 ^ 938374516));
                    int i146 = i143 ^ i145;
                    int i147 = i143 & i145;
                    int i148 = -(~(((i147 & i146) | (i146 ^ i147)) * 979));
                    int i149 = ((i140 | i148) << 1) - (i148 ^ i140);
                    int i150 = (i149 ^ (-1)) + (i149 << 1);
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i151 = 1658623170 & iCurrentTimeMillis2;
                    int i152 = (~i151) & (1658623170 | iCurrentTimeMillis2);
                    int i153 = ~iCurrentTimeMillis2;
                    int i154 = ~((i151 & i152) | (i152 ^ i151));
                    int i155 = ((~i154) & 446990384) | ((-446990385) & i154);
                    int i156 = i154 & 446990384;
                    int i157 = ((i156 & i155) | (i155 ^ i156)) * Opcodes.ATHROW;
                    int i158 = 1599241887 & i157;
                    int i159 = (((i157 | 1599241887) & (~i158)) - (~(i158 << 1))) - 1;
                    int i160 = ~((i153 & 1658623170) | (i153 ^ 1658623170));
                    int i161 = -(-(((i160 & 404752432) | ((~i160) & 404752432) | ((-404752433) & i160)) * Opcodes.ATHROW));
                    if (i150 <= ((i159 | i161) << 1) - ((i161 & (~i159)) | ((~i161) & i159))) {
                        sArr9[i105][i127] = ((Short) l2.a(new Object[]{Short.valueOf(sArr8[i105][i127]), Short.valueOf(sArr8[i127][i105])}, 1293451345, -1293451343, (int) System.currentTimeMillis())).shortValue();
                        int i162 = ((i127 | 7) << 1) - (i127 ^ 7);
                        i127 = (i162 ^ (-1)) + (i162 << 1);
                    } else {
                        sArr9[i105][i127] = ((Short) l2.a(new Object[]{Short.valueOf(sArr8[i105][i127]), Short.valueOf(sArr8[i127][i105])}, 1293451345, -1293451343, (int) System.currentTimeMillis())).shortValue();
                        int i163 = i127 ^ (-85);
                        int i164 = ((((i127 & (-85)) | i163) << 1) - (~(-i163))) - 1;
                        i127 = ((i164 & 87) + (i164 | 87)) - 1;
                    }
                    int i165 = f57192b;
                    int i166 = ((i165 & (-72)) | ((~i165) & 71)) + ((i165 & 71) << 1);
                    f57191a = i166 % 128;
                    int i167 = i166 % 2;
                }
                i105 = (-2) - ((i105 + 2) ^ (-1));
                int i168 = f57192b;
                int i169 = i168 & 55;
                int i170 = ((((i168 ^ 55) | i169) << 1) - (~(-((i168 | 55) & (~i169))))) - 1;
                f57191a = i170 % 128;
                int i171 = i170 % 2;
                i16 = -2;
            }
            int i172 = f57192b;
            int i173 = ((i172 | 111) << 1) - (i172 ^ 111);
            f57191a = i173 % 128;
            if (i173 % 2 != 0) {
                int i174 = 72 / 0;
            }
            return sArr9;
        }
        short[][] sArr10 = (short[][]) objArr[0];
        short[][] sArr11 = (short[][]) objArr[1];
        int i175 = f57191a;
        int i176 = ((i175 ^ 99) | (i175 & 99)) << 1;
        int i177 = -(((~i175) & 99) | (i175 & (-100)));
        int i178 = ((i176 | i177) << 1) - (i177 ^ i176);
        f57192b = i178 % 128;
        if (i178 % 2 != 0 ? sArr10[0].length != sArr11.length : sArr10[0].length != sArr11.length) {
            throw new RuntimeException("Multiplication is not possible!");
        }
        sArr = (short[][]) Array.newInstance((Class<?>) Short.TYPE, sArr10.length, sArr11[0].length);
        int i179 = f57192b;
        int i180 = i179 & 85;
        int i181 = (i180 - (~(-(-((i179 ^ 85) | i180))))) - 1;
        f57191a = i181 % 128;
        int i182 = i181 % 2;
        int i183 = 0;
        while (i183 < sArr10.length) {
            int i184 = f57192b;
            int i185 = i184 & 71;
            int i186 = (i184 ^ 71) | i185;
            int i187 = (i185 ^ i186) + ((i185 & i186) << 1);
            f57191a = i187 % 128;
            int i188 = i187 % 2;
            int i189 = ((i184 & (-116)) | ((~i184) & 115)) + ((i184 & 115) << 1);
            f57191a = i189 % 128;
            int i190 = i189 % 2;
            int i191 = 0;
            while (i191 < sArr11.length) {
                int i192 = f57191a + 19;
                f57192b = i192 % 128;
                int i193 = i192 % 2;
                int i194 = 0;
                while (i194 < sArr11[0].length) {
                    int i195 = f57192b + 89;
                    f57191a = i195 % 128;
                    int i196 = i195 % 2;
                    short sShortValue = ((Short) l2.a(new Object[]{Short.valueOf(sArr10[i183][i191]), Short.valueOf(sArr11[i191][i194])}, 2127821789, -2127821779, (int) System.currentTimeMillis())).shortValue();
                    short[] sArr12 = sArr[i183];
                    sArr12[i194] = ((Short) l2.a(new Object[]{Short.valueOf(sArr12[i194]), Short.valueOf(sShortValue)}, 1293451345, -1293451343, (int) System.currentTimeMillis())).shortValue();
                    i194++;
                    int i197 = f57191a;
                    int i198 = (i197 ^ 84) + ((i197 & 84) << 1);
                    int i199 = (i198 ^ (-1)) + (i198 << 1);
                    f57192b = i199 % 128;
                    int i200 = i199 % 2;
                }
                int i201 = i191 & 122;
                int i202 = ((((i191 ^ 122) | i201) << 1) - (~(-((i191 | 122) & (~i201))))) - 1;
                i191 = ((i202 & 120) | ((~i202) & (-121))) + ((i202 & (-121)) << 1);
                int i203 = f57191a;
                int i204 = (i203 ^ 107) + ((i203 & 107) << 1);
                f57192b = i204 % 128;
                int i205 = i204 % 2;
            }
            i183++;
            int i206 = f57191a + 107;
            f57192b = i206 % 128;
            int i207 = i206 % 2;
        }
        int i208 = f57192b;
        int i209 = (((i208 ^ 103) | (i208 & 103)) << 1) - (((~i208) & 103) | (i208 & (-104)));
        f57191a = i209 % 128;
        int i210 = i209 % 2;
        return sArr;
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        int i10 = 0;
        short[][] sArr = (short[][]) objArr[0];
        short[][][] sArr2 = (short[][][]) objArr[1];
        short[][][] sArr3 = (short[][][]) objArr[2];
        int i11 = f57191a;
        int i12 = i11 ^ 53;
        int i13 = (i11 & 53) << 1;
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f57192b = i14 % 128;
        int i15 = i14 % 2;
        short[][] sArr4 = sArr2[0];
        int length = sArr4.length;
        short[][] sArr5 = sArr3[0];
        if (length == sArr5.length) {
            int i16 = (i11 & (-16)) | ((~i11) & 15);
            int i17 = -(-((i11 & 15) << 1));
            int i18 = (i16 & i17) + (i17 | i16);
            int i19 = i18 % 128;
            f57192b = i19;
            int i20 = i18 % 2;
            int length2 = sArr4[0].length;
            short[] sArr6 = sArr5[0];
            if (length2 == sArr6.length) {
                int i21 = i19 & 95;
                int i22 = ((i19 ^ 95) | i21) << 1;
                int i23 = -((~i21) & (i19 | 95));
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                f57191a = i24 % 128;
                int i25 = i24 % 2;
                if (sArr2.length == sArr[0].length) {
                    int i26 = i19 & 69;
                    int i27 = i26 + ((i19 ^ 69) | i26);
                    f57191a = i27 % 128;
                    if (i27 % 2 != 0) {
                        throw null;
                    }
                    if (sArr3.length == sArr.length) {
                        short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, sArr3.length, sArr5.length, sArr6.length);
                        int i28 = f57192b;
                        int i29 = ((i28 & (-28)) | ((~i28) & 27)) + ((i28 & 27) << 1);
                        f57191a = i29 % 128;
                        int i30 = i29 % 2;
                        int i31 = 0;
                        while (i31 < sArr2[i10].length) {
                            int i32 = f57192b;
                            int i33 = i32 & 113;
                            int i34 = (i32 ^ 113) | i33;
                            int i35 = ((i33 | i34) << 1) - (i33 ^ i34);
                            f57191a = i35 % 128;
                            int i36 = i35 % 2;
                            int i37 = ((i32 | 71) << 1) - (i32 ^ 71);
                            f57191a = i37 % 128;
                            int i38 = i37 % 2;
                            int i39 = i10;
                            while (i39 < sArr2[i10][i10].length) {
                                int i40 = f57191a;
                                int i41 = (i40 ^ 12) + ((i40 & 12) << 1);
                                int i42 = (i41 ^ (-1)) + (i41 << 1);
                                f57192b = i42 % 128;
                                int i43 = i42 % 2;
                                int i44 = i10;
                                while (i44 < sArr.length) {
                                    int i45 = f57191a;
                                    int i46 = i45 & 125;
                                    int i47 = i45 | 125;
                                    int i48 = (i46 ^ i47) + ((i47 & i46) << 1);
                                    int i49 = i48 % 128;
                                    f57192b = i49;
                                    int i50 = i48 % 2;
                                    int i51 = ((i49 ^ 121) | (i49 & 121)) << 1;
                                    int i52 = -(((~i49) & 121) | (i49 & (-122)));
                                    int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                                    f57191a = i53 % 128;
                                    int i54 = i53 % 2;
                                    int i55 = i10;
                                    while (i55 < sArr[i10].length) {
                                        int i56 = f57192b;
                                        int i57 = i56 & 93;
                                        int i58 = (i57 - (~((i56 ^ 93) | i57))) - 1;
                                        f57191a = i58 % 128;
                                        int i59 = i58 % 2;
                                        short s4 = sArr[i44][i55];
                                        short s7 = sArr2[i55][i31][i39];
                                        Object[] objArr2 = new Object[2];
                                        objArr2[i10] = Short.valueOf(s4);
                                        objArr2[1] = Short.valueOf(s7);
                                        short sShortValue = ((Short) l2.a(objArr2, 2127821789, -2127821779, (int) System.currentTimeMillis())).shortValue();
                                        short[] sArr8 = sArr7[i44][i31];
                                        Object[] objArr3 = new Object[2];
                                        objArr3[i10] = Short.valueOf(sArr8[i39]);
                                        objArr3[1] = Short.valueOf(sShortValue);
                                        short[][] sArr9 = sArr;
                                        sArr8[i39] = ((Short) l2.a(objArr3, 1293451345, -1293451343, (int) System.currentTimeMillis())).shortValue();
                                        int i60 = i55 & 1;
                                        int i61 = i55 | 1;
                                        i55 = (i60 ^ i61) + ((i60 & i61) << 1);
                                        int i62 = f57191a + 11;
                                        f57192b = i62 % 128;
                                        int i63 = i62 % 2;
                                        sArr = sArr9;
                                        i10 = 0;
                                    }
                                    short[] sArr10 = sArr7[i44][i31];
                                    sArr = sArr;
                                    sArr10[i39] = ((Short) l2.a(new Object[]{Short.valueOf(sArr3[i44][i31][i39]), Short.valueOf(sArr10[i39])}, 1293451345, -1293451343, (int) System.currentTimeMillis())).shortValue();
                                    i44++;
                                    int i64 = f57192b + 113;
                                    f57191a = i64 % 128;
                                    int i65 = i64 % 2;
                                    i10 = 0;
                                }
                                int i66 = i10;
                                int i67 = i39 & 1;
                                int i68 = ((i39 ^ 1) | i67) << 1;
                                int i69 = -((i39 | 1) & (~i67));
                                i39 = (i68 ^ i69) + ((i68 & i69) << 1);
                                int i70 = f57192b;
                                int i71 = i70 & 89;
                                int i72 = (i70 ^ 89) | i71;
                                int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                                f57191a = i73 % 128;
                                int i74 = i73 % 2;
                                i10 = i66;
                            }
                            int i75 = i10;
                            int i76 = i31 & 1;
                            i31 = (((i31 ^ 1) | i76) << 1) - ((i31 | 1) & (~i76));
                            int i77 = f57191a;
                            int i78 = i77 ^ 99;
                            int i79 = (i77 & 99) << 1;
                            int i80 = (i78 & i79) + (i79 | i78);
                            f57192b = i80 % 128;
                            int i81 = i80 % 2;
                            i10 = i75;
                        }
                        int i82 = f57191a;
                        int i83 = i82 & 25;
                        int i84 = i82 | 25;
                        int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                        f57192b = i85 % 128;
                        if (i85 % 2 != 0) {
                            return sArr7;
                        }
                        throw null;
                    }
                }
            }
        }
        throw new RuntimeException("Multiplication not possible!");
    }
}
