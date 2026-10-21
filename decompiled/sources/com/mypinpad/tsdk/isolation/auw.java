package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.emoji2.text.flatbuffer.a;
import com.esotericsoftware.asm.Opcodes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class auw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53929a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53930b = 1;

    public static /* synthetic */ Object a() {
        int i10 = f53929a;
        int i11 = i10 & 111;
        int i12 = (i10 ^ 111) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f53930b = i14;
        int i15 = i13 % 2;
        int[] iArr = new int[4];
        int i16 = ((i14 | 5) << 1) - (i14 ^ 5);
        f53929a = i16 % 128;
        if (i16 % 2 != 0) {
            int i17 = 58 / 0;
        }
        return iArr;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        System.currentTimeMillis();
        System.currentTimeMillis();
        long j10 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (4294967295L & ((long) iArr[3]))) + (j12 >> 32);
        iArr2[3] = (int) j13;
        int i10 = (int) (j13 >> 32);
        int i11 = f53929a;
        int i12 = ((i11 | 75) << 1) - (i11 ^ 75);
        f53930b = i12 % 128;
        if (i12 % 2 != 0) {
            return Integer.valueOf(i10);
        }
        int i13 = 48 / 0;
        return Integer.valueOf(i10);
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53930b;
        int i11 = i10 & 41;
        int i12 = (((~i11) & (i10 | 41)) - (~(i11 << 1))) - 1;
        f53929a = i12 % 128;
        int i13 = i12 % 2;
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr[0]) & 4294967295L;
        long j15 = j14 * j10;
        iArr3[0] = (int) j15;
        char c10 = ' ';
        long j16 = (j14 * j11) + (j15 >>> 32);
        iArr3[1] = (int) j16;
        long j17 = (j14 * j12) + (j16 >>> 32);
        iArr3[2] = (int) j17;
        long j18 = (j14 * j13) + (j17 >>> 32);
        iArr3[3] = (int) j18;
        int i14 = 4;
        iArr3[4] = (int) (j18 >>> 32);
        int i15 = i10 + 101;
        f53929a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 1;
        while (i17 < i14) {
            int i18 = f53930b;
            int i19 = (i18 ^ 121) + ((i18 & 121) << 1);
            f53929a = i19 % 128;
            int i20 = i19 % 2;
            long j19 = ((long) iArr[i17]) & 4294967295L;
            long j20 = j13;
            long j21 = (j19 * j10) + (((long) iArr3[i17]) & 4294967295L);
            iArr3[i17] = (int) j21;
            int i21 = i17 & 2;
            int i22 = i21 << 1;
            long j22 = j10;
            long j23 = (j19 * j11) + (((long) iArr3[(-2) - (((i17 ^ 2) + i22) ^ (-1))]) & 4294967295L) + (j21 >>> c10);
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i23 = i17 * (-858);
            int i24 = 860 & i23;
            int i25 = i23 | 860;
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            int i27 = iCurrentTimeMillis & 1;
            int i28 = (~i27) & (iCurrentTimeMillis | 1);
            int i29 = ((i28 ^ i27) | (i27 & i28)) * (-859);
            int i30 = ((i26 | i29) << 1) - (i29 ^ i26);
            int i31 = ~iCurrentTimeMillis;
            int i32 = ~((i31 ^ 1) | (i31 & 1));
            long j24 = j11;
            int i33 = ~i17;
            int i34 = ~i33;
            int i35 = i33 & 1;
            int i36 = ((-2) & i34) | i35;
            int i37 = (-2) & i33;
            int i38 = (i36 ^ i37) | (i36 & i37);
            int i39 = (i38 & i31) | ((~i38) & iCurrentTimeMillis);
            int i40 = iCurrentTimeMillis & i38;
            int i41 = ~((i39 & i40) | (i39 ^ i40));
            int i42 = i32 ^ i41;
            int i43 = i41 & i32;
            int i44 = ((i43 & i42) | (i42 ^ i43)) * 859;
            int i45 = (i30 & i44) + (i44 | i30);
            int i46 = (i33 | i17) & i33;
            int i47 = ~((i31 & i46) | (i46 ^ i31));
            int i48 = (i33 ^ 1) | i35;
            int i49 = ~i48;
            int i50 = (i48 | i49) & i49;
            int i51 = i47 & i50;
            int i52 = -(-((((i47 | i50) & (~i51)) | i51) * 859));
            iArr3[(i45 ^ i52) + ((i45 & i52) << 1)] = (int) j23;
            long j25 = j19 * j12;
            long j26 = j12;
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i53 = i17 * 192;
            int i54 = (-762) & i53;
            int i55 = -(-(i53 | (-762)));
            int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
            int i57 = i56 & 573;
            int i58 = ((((i56 ^ 573) | i57) << 1) - (~(-((i56 | 573) & (~i57))))) - 1;
            int i59 = i17 ^ iCurrentTimeMillis2;
            int i60 = ~iCurrentTimeMillis2;
            int i61 = i17 & iCurrentTimeMillis2;
            int i62 = ~((i59 ^ i61) | (i59 & i61));
            int i63 = -(-(((i62 & 2) | (i62 ^ 2)) * Opcodes.ATHROW));
            int i64 = i58 & i63;
            int i65 = (i58 ^ i63) | i64;
            int i66 = (i64 & i65) + (i65 | i64);
            int i67 = (-3) & i17;
            int i68 = (~i67) & ((-3) | i17);
            int i69 = (i68 & i67) | (i68 ^ i67);
            int i70 = ~i69;
            int i71 = (i69 | i70) & i70;
            int i72 = (iCurrentTimeMillis2 | i60) & i60;
            int i73 = i72 & i17;
            int i74 = (i72 | i17) & (~i73);
            int i75 = ~((i74 & i73) | (i74 ^ i73));
            int i76 = i71 & i75;
            int i77 = (i71 | i75) & (~i76);
            int i78 = ((i77 & i76) | (i77 ^ i76)) * Opcodes.ATHROW;
            int i79 = ((i66 ^ i78) | (i66 & i78)) << 1;
            int i80 = -((i78 & (~i66)) | ((~i78) & i66));
            long j27 = j25 + (((long) iArr3[(i79 & i80) + (i80 | i79)]) & 4294967295L) + (j23 >>> 32);
            int i81 = (~i21) & (i17 | 2);
            int i82 = -(-i22);
            iArr3[((i81 | i82) << 1) - (i81 ^ i82)] = (int) j27;
            long j28 = j27 >>> 32;
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i83 = -(~(i17 * 1435));
            int i84 = ((-2148) & i83) + (i83 | (-2148));
            int i85 = i17 & 3;
            int i86 = ((-4) & i33) | i85;
            int i87 = i17 & (-4);
            int i88 = (((i84 ^ (-1)) + (i84 << 1)) - (~(-(~(-(-(((i86 & i87) | (i86 ^ i87)) * (-1434)))))))) - 2;
            int i89 = ~iCurrentTimeMillis3;
            int i90 = i89 | i17;
            int i91 = ~i90;
            int i92 = (i90 | i91) & i91;
            int i93 = ~((i17 ^ 3) | i85);
            int i94 = i92 & i93;
            int i95 = ((~i94) & (i92 | i93)) | i94;
            int i96 = (-4) & i46;
            int i97 = (~i96) & ((-4) | i46);
            int i98 = (i97 ^ i96) | (i97 & i96);
            int i99 = (i98 & i89) | ((~i98) & iCurrentTimeMillis3);
            int i100 = i98 & iCurrentTimeMillis3;
            int i101 = ~((i99 ^ i100) | (i99 & i100));
            int i102 = ((~i95) & i101) | ((~i101) & i95);
            int i103 = i95 & i101;
            int i104 = -(-(((i103 & i102) | (i102 ^ i103)) * 717));
            int i105 = (i88 & i104) + (i88 | i104);
            int i106 = i97 | i96;
            int i107 = ~((i106 & i89) | (i106 ^ i89));
            int i108 = (~i85) & (i17 | 3);
            int i109 = ~((i108 & i85) | (i108 ^ i85));
            int i110 = i107 ^ i109;
            int i111 = i107 & i109;
            int i112 = (i111 & i110) | (i110 ^ i111);
            int i113 = i17 & iCurrentTimeMillis3;
            int i114 = ((iCurrentTimeMillis3 | i17) & (~i113)) | i113;
            int i115 = ~i114;
            int i116 = (i114 | i115) & i115;
            int i117 = i112 ^ i116;
            int i118 = i116 & i112;
            long j29 = (j19 * j20) + (((long) iArr3[(i105 - (~(((i118 & i117) | (i117 ^ i118)) * 717))) - 1]) & 4294967295L) + j28;
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i119 = i17 * (-317);
            int i120 = (957 ^ i119) + ((i119 & 957) << 1);
            int i121 = ~iCurrentTimeMillis4;
            int i122 = ((-4) & i121) | (iCurrentTimeMillis4 & 3);
            int i123 = (-4) & iCurrentTimeMillis4;
            int i124 = (i123 & i122) | (i122 ^ i123);
            int i125 = ~i124;
            int i126 = (i124 | i125) & i125;
            int i127 = -(~(((i46 & i126) | (i46 ^ i126)) * (-318)));
            int i128 = (((i120 | i127) << 1) - (i127 ^ i120)) - 1;
            int i129 = (i33 & i121) | (iCurrentTimeMillis4 & i34);
            int i130 = i33 & iCurrentTimeMillis4;
            int i131 = ~((i129 & i130) | (i129 ^ i130));
            int i132 = (i121 | iCurrentTimeMillis4) & i121;
            int i133 = i132 & 3;
            int i134 = (i132 | 3) & (~i133);
            int i135 = (i134 & i133) | (i134 ^ i133);
            int i136 = i135 ^ i17;
            int i137 = i135 & i17;
            int i138 = -(-((i131 | (~((i137 & i136) | (i136 ^ i137)))) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            int i139 = ((((~i138) & i128) | ((~i128) & i138)) - (~((i138 & i128) << 1))) - 1;
            int i140 = i46 & i121;
            int i141 = (i46 | i121) & (~i140);
            int i142 = (i141 & i140) | (i141 ^ i140);
            int i143 = i142 & 3;
            int i144 = (i142 | 3) & (~i143);
            int i145 = (i144 & i143) | (i144 ^ i143);
            int i146 = ~i145;
            int i147 = (i145 | i146) & i146;
            int i148 = (i33 & 3) | i87;
            int i149 = (i148 & i85) | (i148 ^ i85);
            int i150 = i149 & iCurrentTimeMillis4;
            int i151 = (iCurrentTimeMillis4 | i149) & (~i150);
            int i152 = ~((i151 & i150) | (i151 ^ i150));
            int i153 = ((~i152) & i147) | ((~i147) & i152);
            int i154 = i152 & i147;
            int i155 = ((i154 & i153) | (i153 ^ i154)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
            iArr3[(i139 ^ i155) + ((i155 & i139) << 1)] = (int) j29;
            long j30 = j29 >>> 32;
            int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
            int i156 = i17 * (-55);
            int i157 = (-220) & i156;
            int i158 = (i156 | (-220)) & (~i157);
            int i159 = -(-(i157 << 1));
            int i160 = (i158 & i159) + (i158 | i159);
            int i161 = ~iCurrentTimeMillis5;
            int i162 = (i161 & 4) | (iCurrentTimeMillis5 & (-5));
            int i163 = iCurrentTimeMillis5 & 4;
            int i164 = ~((i162 & i163) | (i162 ^ i163));
            int i165 = ((~i164) & i17) | (i164 & i33);
            int i166 = i164 & i17;
            int i167 = -(-(((i166 & i165) | (i165 ^ i166)) * 56));
            int i168 = i160 & i167;
            int i169 = (i167 | i160) & (~i168);
            int i170 = i168 << 1;
            int i171 = (i169 & i170) + (i169 | i170);
            int i172 = i17 ^ 4;
            int i173 = i17 & 4;
            int i174 = (~((i172 & i173) | (i172 ^ i173))) * (-56);
            int i175 = ((i171 ^ i174) - (~((i174 & i171) << 1))) - 1;
            int i176 = (iCurrentTimeMillis5 | i161) & i161;
            int i177 = i176 & i17;
            int i178 = ((i176 | i17) & (~i177)) | i177;
            int i179 = ~i178;
            int i180 = (i178 | i179) & i179;
            int i181 = -(-(((i180 & 4) | (i180 ^ 4)) * 56));
            iArr3[((i175 | i181) << 1) - (i181 ^ i175)] = (int) j30;
            int i182 = i17 & 1;
            int i183 = (i17 ^ 1) | i182;
            i17 = ((i182 | i183) << 1) - (i183 ^ i182);
            int i184 = f53930b;
            int i185 = ((i184 & 118) + (i184 | 118)) - 1;
            f53929a = i185 % 128;
            int i186 = i185 % 2;
            c10 = ' ';
            i14 = 4;
            j13 = j20;
            j10 = j22;
            j11 = j24;
            j12 = j26;
        }
        int i187 = f53929a;
        int i188 = i187 ^ 121;
        int i189 = (((i187 & 121) | i188) << 1) - i188;
        f53930b = i189 % 128;
        if (i189 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean d(Object[] objArr) {
        int i10;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53930b;
        int i12 = (i11 & (-6)) | ((~i11) & 5);
        int i13 = -(-((i11 & 5) << 1));
        int i14 = (i12 & i13) + (i12 | i13);
        f53929a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i11 + 119;
        f53929a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (true) {
            if (i18 >= 4) {
                int i19 = f53930b;
                int i20 = (i19 & 31) + (i19 | 31);
                f53929a = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.TRUE;
            }
            i10 = f53930b;
            int i22 = (((i10 | 26) << 1) - (i10 ^ 26)) - 1;
            f53929a = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 73 / 0;
                if (iArr[i18] != 0) {
                    break;
                }
                int i24 = (i18 | (-120)) << 1;
                int i25 = -(((~i18) & (-120)) | (i18 & 119));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                int i27 = i26 & 121;
                int i28 = -(-(i26 | 121));
                i18 = ((i27 & i28) << 1) + (i27 ^ i28);
                int i29 = (i10 ^ 97) + ((i10 & 97) << 1);
                f53929a = i29 % 128;
                int i30 = i29 % 2;
            } else {
                if (iArr[i18] != 0) {
                    break;
                }
                int i210 = (i18 | (-120)) << 1;
                int i211 = -(((~i18) & (-120)) | (i18 & 119));
                int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
                int i213 = i212 & 121;
                int i214 = -(-(i212 | 121));
                i18 = ((i213 & i214) << 1) + (i213 ^ i214);
                int i215 = (i10 ^ 97) + ((i10 & 97) << 1);
                f53929a = i215 % 128;
                int i31 = i215 % 2;
            }
        }
        int i32 = (i10 | 79) << 1;
        int i33 = -((i10 & (-80)) | ((~i10) & 79));
        int i34 = (i32 ^ i33) + ((i32 & i33) << 1);
        f53929a = i34 % 128;
        if (i34 % 2 == 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Boolean e(Object[] objArr) {
        int i10;
        long[] jArr = (long[]) objArr[0];
        int i11 = f53930b;
        int i12 = i11 + 79;
        f53929a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i11 + 76;
        int i15 = (i14 ^ (-1)) + (i14 << 1);
        f53929a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (true) {
            if (i17 >= 2) {
                int i18 = f53930b;
                int i19 = i18 & 17;
                int i20 = i19 + ((i18 ^ 17) | i19);
                f53929a = i20 % 128;
                if (i20 % 2 == 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
            i10 = f53929a;
            int i21 = i10 & 21;
            int i22 = (i10 ^ 21) | i21;
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            int i24 = i23 % 128;
            f53930b = i24;
            if (i23 % 2 == 0) {
                if (jArr[i17] != 0) {
                    break;
                }
                int i25 = ((i17 | (-28)) << 1) - (i17 ^ (-28));
                i17 = (i25 & 29) + (i25 | 29);
                int i26 = i24 + 33;
                f53929a = i26 % 128;
                int i27 = i26 % 2;
            } else {
                if (jArr[i17] != 0) {
                    break;
                }
                int i28 = ((i17 | (-28)) << 1) - (i17 ^ (-28));
                i17 = (i28 & 29) + (i28 | 29);
                int i29 = i24 + 33;
                f53929a = i29 % 128;
                int i210 = i29 % 2;
            }
        }
        int i30 = (((i10 | 106) << 1) - (i10 ^ 106)) - 1;
        int i31 = i30 % 128;
        f53930b = i31;
        int i32 = i30 % 2;
        int i33 = ((i31 & 4) + (i31 | 4)) - 1;
        f53929a = i33 % 128;
        if (i33 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i34 = 85 / 0;
        return Boolean.FALSE;
    }

    public static /* synthetic */ Integer f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53930b;
        int i11 = i10 & 5;
        int i12 = (i10 ^ 5) | i11;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f53929a = i13 % 128;
        int i14 = i13 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        int i15 = (int) (j13 >> 32);
        int i16 = i10 | 59;
        int i17 = ((i16 << 1) - (~(-(i16 & (~(i10 & 59)))))) - 1;
        f53929a = i17 % 128;
        if (i17 % 2 == 0) {
            return Integer.valueOf(i15);
        }
        int i18 = 27 / 0;
        return Integer.valueOf(i15);
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long j10;
        int i10;
        int i11;
        int[] iArr;
        int[] iArr2 = (int[]) objArr[0];
        int[] iArr3 = (int[]) objArr[1];
        int i12 = f53929a;
        int i13 = i12 ^ 13;
        int i14 = ((i12 & 13) | i13) << 1;
        int i15 = -i13;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        f53930b = i16 % 128;
        long j11 = 4294967295L;
        if (i16 % 2 == 0) {
            j10 = ((long) iArr2[0]) | 4294967295L;
            i10 = 1;
            i11 = 4;
        } else {
            j10 = ((long) iArr2[0]) & 4294967295L;
            i10 = 0;
            i11 = 3;
        }
        int i17 = 8;
        while (true) {
            int i18 = ((i11 & (-120)) + (i11 | (-120))) - 1;
            int i19 = ((i18 & 121) + (i18 | 121)) - 1;
            iArr = iArr2;
            long j12 = ((long) iArr2[i11]) & j11;
            long j13 = j12 * j12;
            int i20 = i17 - 1;
            iArr3[i20] = (i10 << 31) | ((int) (j13 >>> 33));
            int i21 = i20 & 2;
            int i22 = (i20 ^ 2) | i21;
            int i23 = (i21 & i22) + (i21 | i22);
            int i24 = i23 & (-3);
            int i25 = (i23 ^ (-3)) | i24;
            i17 = ((i24 | i25) << 1) - (i24 ^ i25);
            iArr3[i17] = (int) (j13 >>> 1);
            i10 = (int) j13;
            if (i19 <= 0) {
                break;
            }
            j11 = 4294967295L;
            i11 = i19;
            iArr2 = iArr;
        }
        int i26 = f53929a;
        int i27 = ((i26 | 21) << 1) - (i26 ^ 21);
        f53930b = i27 % 128;
        int i28 = i27 % 2;
        long j14 = j10 * j10;
        long j15 = (((long) (i10 << 31)) & 4294967295L) | (j14 >>> 33);
        iArr3[0] = (int) j14;
        int i29 = ((int) (j14 >>> 32)) & 1;
        long j16 = ((long) iArr[1]) & 4294967295L;
        long j17 = ((long) iArr3[2]) & 4294967295L;
        long j18 = (j16 * j10) + j15;
        int i30 = (int) j18;
        int i31 = i30 << 1;
        iArr3[1] = (i29 & i31) | (i31 ^ i29);
        int i32 = i30 >>> 31;
        long j19 = ((long) iArr[2]) & 4294967295L;
        long j20 = ((long) iArr3[3]) & 4294967295L;
        long j21 = ((long) iArr3[4]) & 4294967295L;
        long j22 = (j19 * j10) + j17 + (j18 >>> 32);
        int i33 = (int) j22;
        int i34 = i33 << 1;
        int i35 = i34 & i32;
        int i36 = (i32 | i34) & (~i35);
        iArr3[2] = (i36 & i35) | (i36 ^ i35);
        int i37 = i33 >>> 31;
        long jA = a.a(j19, j16, j22 >>> 32, j20);
        long j23 = j21 + (jA >>> 32);
        long j24 = ((long) iArr[3]) & 4294967295L;
        long j25 = (((long) iArr3[5]) & 4294967295L) + (j23 >>> 32);
        long j26 = j23 & 4294967295L;
        long j27 = (((long) iArr3[6]) & 4294967295L) + (j25 >>> 32);
        long j28 = (j10 * j24) + (jA & 4294967295L);
        int i38 = (int) j28;
        int i39 = i38 << 1;
        int i40 = i39 & i37;
        int i41 = (i37 | i39) & (~i40);
        iArr3[3] = (i41 & i40) | (i41 ^ i40);
        int i42 = i38 >>> 31;
        long jA2 = a.a(j24, j16, j28 >>> 32, j26);
        long jA3 = a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
        long j29 = j27 + (jA3 >>> 32);
        int i43 = (int) jA2;
        int i44 = i43 << 1;
        iArr3[4] = (i42 & i44) | ((~i42) & i44) | ((~i44) & i42);
        int i45 = i43 >>> 31;
        int i46 = (int) (jA3 & 4294967295L);
        int i47 = i46 << 1;
        int i48 = i47 & i45;
        int i49 = (i45 | i47) & (~i48);
        iArr3[5] = (i49 & i48) | (i49 ^ i48);
        int i50 = i46 >>> 31;
        int i51 = (int) j29;
        int i52 = i51 << 1;
        int i53 = ((~i50) & i52) | ((~i52) & i50);
        int i54 = i50 & i52;
        iArr3[6] = (i54 & i53) | (i53 ^ i54);
        int i55 = i51 >>> 31;
        int i56 = iArr3[7];
        int i57 = (int) (j29 >>> 32);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i58 = (i56 * (-590)) + (i57 * 592);
        int i59 = ~i57;
        int i60 = -(-((~((i59 ^ i56) | (i59 & i56))) * (-1182)));
        int i61 = ((~i60) & i58) | ((~i58) & i60);
        int i62 = (i58 & i60) << 1;
        int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
        int i64 = (i59 | i57) & i59;
        int i65 = ~i56;
        int i66 = i64 & i65;
        int i67 = (i64 | i65) & (~i66);
        int i68 = (i67 & i66) | (i67 ^ i66);
        int i69 = ~iCurrentTimeMillis;
        int i70 = i69 & (i69 | iCurrentTimeMillis);
        int i71 = (i68 & i70) | (i68 ^ i70);
        int i72 = ~i71;
        int i73 = (i71 | i72) & i72;
        int i74 = i57 ^ i56;
        int i75 = i57 & i56;
        int i76 = ~((i75 & i74) | (i74 ^ i75));
        int i77 = -(-(((i76 & i73) | (i73 ^ i76)) * (-591)));
        int i78 = i63 ^ i77;
        int i79 = (i77 & i63) << 1;
        int i80 = (i78 & i79) + (i79 | i78);
        int i81 = (iCurrentTimeMillis | i59 | i65) * 591;
        int i82 = i80 & i81;
        int i83 = ((((i81 | i80) & (~i82)) - (~(-(-(i82 << 1))))) - 1) << 1;
        iArr3[7] = (i55 & i83) | ((~i55) & i83) | ((~i83) & i55);
        int i84 = f53929a;
        int i85 = (i84 & 85) + (i84 | 85);
        f53930b = i85 % 128;
        if (i85 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ BigInteger h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f53929a;
        int i11 = i10 ^ 11;
        int i12 = (i10 & 11) << 1;
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f53930b = i13 % 128;
        int i14 = i13 % 2;
        byte[] bArr = new byte[16];
        int i15 = i10 & 49;
        int i16 = ((i10 | 49) & (~i15)) + (i15 << 1);
        f53930b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (i18 < 2) {
            int i19 = (-2) - ((f53930b + 76) ^ (-1));
            int i20 = i19 % 128;
            f53929a = i20;
            int i21 = i19 % 2;
            long j10 = jArr[i18];
            if (j10 != 0) {
                int i22 = (i20 | 33) << 1;
                int i23 = -(((~i20) & 33) | (i20 & (-34)));
                int i24 = (i22 & i23) + (i22 | i23);
                f53930b = i24 % 128;
                if (i24 % 2 == 0) {
                    ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, 0}, 108647497, -108647488, 0);
                } else {
                    int i25 = -i18;
                    int i26 = ((i25 ^ 1) + ((i25 & 1) << 1)) << 3;
                    ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i26)}, 108647497, -108647488, i26);
                }
                int i27 = f53929a;
                int i28 = i27 & 63;
                int i29 = i27 | 63;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                f53930b = i30 % 128;
                int i31 = i30 % 2;
            }
            i18++;
            int i32 = f53929a;
            int i33 = i32 & 69;
            int i34 = ((i32 ^ 69) | i33) << 1;
            int i35 = -((i32 | 69) & (~i33));
            int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
            f53930b = i36 % 128;
            int i37 = i36 % 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        int i38 = f53929a;
        int i39 = i38 & 31;
        int i40 = -(-((i38 ^ 31) | i39));
        int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
        f53930b = i41 % 128;
        if (i41 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    public static /* synthetic */ BigInteger i(Object[] objArr) {
        byte[] bArr;
        int i10;
        boolean z10;
        boolean z11 = false;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53929a;
        int i12 = ((i11 & 60) + (i11 | 60)) - 1;
        f53930b = i12 % 128;
        int i13 = 2;
        if (i12 % 2 == 0) {
            bArr = new byte[106];
            i10 = 1;
        } else {
            bArr = new byte[16];
            i10 = 0;
        }
        int i14 = i11 & 23;
        int i15 = (i14 - (~((i11 ^ 23) | i14))) - 1;
        f53930b = i15 % 128;
        int i16 = i15 % 2;
        while (i10 < 4) {
            int i17 = f53929a;
            int i18 = i17 ^ 7;
            int i19 = ((((i17 & 7) | i18) << 1) - (~(-i18))) - 1;
            int i20 = i19 % 128;
            f53930b = i20;
            int i21 = i19 % i13;
            int i22 = iArr[i10];
            if (i22 != 0) {
                int i23 = (i20 ^ 19) + ((i20 & 19) << 1);
                f53929a = i23 % 128;
                int i24 = i23 % i13;
                int i25 = -i10;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i26 = i25 * (-574);
                int i27 = i26 ^ (-1722);
                int i28 = (((i26 & (-1722)) | i27) << 1) - i27;
                int i29 = ~i25;
                int i30 = ~iCurrentTimeMillis;
                int i31 = i29 ^ i30;
                int i32 = i29 & i30;
                int i33 = ~((i31 & i32) | (i31 ^ i32));
                int i34 = (-4) & iCurrentTimeMillis;
                int i35 = ((-4) & i30) | (iCurrentTimeMillis & 3) | i34;
                int i36 = ~i35;
                int i37 = i36 & (i35 | i36);
                int i38 = ((~i33) & i37) | ((~i37) & i33);
                int i39 = i37 & i33;
                int i40 = ((i39 & i38) | (i38 ^ i39)) * 1150;
                int i41 = ((i28 ^ i40) | (i28 & i40)) << 1;
                int i42 = -((i40 & (~i28)) | ((~i40) & i28));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                int i44 = ~(((-4) ^ iCurrentTimeMillis) | i34);
                int i45 = (i30 | iCurrentTimeMillis) & i30;
                int i46 = ~((i45 ^ 3) | (i45 & 3));
                int i47 = ((i44 & i46) | (i44 ^ i46)) * (-575);
                int i48 = ((i43 | i47) << 1) - (i47 ^ i43);
                int i49 = ~(i29 | iCurrentTimeMillis);
                int i50 = (i45 & i29) | ((~i45) & i25);
                int i51 = i45 & i25;
                int i52 = ~((i51 & i50) | (i50 ^ i51));
                int i53 = i49 & i52;
                int i54 = (((i49 | i52) & (~i53)) | i53) * 575;
                z10 = false;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i22), bArr, Integer.valueOf(((i48 & i54) + (i54 | i48)) << 2)}, -2092293587, 2092293591, i22);
                int i55 = f53930b;
                int i56 = i55 & 125;
                int i57 = (i55 | 125) & (~i56);
                int i58 = -(-(i56 << 1));
                int i59 = (i57 & i58) + (i57 | i58);
                f53929a = i59 % 128;
                int i60 = i59 % 2;
            } else {
                z10 = z11;
            }
            i10 = (i10 ^ (-53)) + ((i10 & (-53)) << 1) + 54;
            int i61 = f53930b;
            int i62 = (i61 & (-120)) | ((~i61) & 119);
            int i63 = (i61 & 119) << 1;
            int i64 = (i62 ^ i63) + ((i63 & i62) << 1);
            f53929a = i64 % 128;
            int i65 = i64 % 2;
            z11 = z10;
            i13 = 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        int i66 = f53929a;
        int i67 = (i66 ^ 7) + ((i66 & 7) << 1);
        f53930b = i67 % 128;
        if (i67 % 2 != 0) {
            return bigInteger;
        }
        throw null;
    }

    public static /* synthetic */ void j(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53930b;
        int i11 = i10 & 69;
        int i12 = ((~i11) & (i10 | 69)) + (i11 << 1);
        f53929a = i12 % 128;
        if (i12 % 2 != 0) {
            long j10 = jArr[1];
            jArr2[0] = j10;
            jArr2[0] = j10;
        } else {
            jArr2[0] = jArr[0];
            jArr2[1] = jArr[1];
        }
        int i13 = i10 & 95;
        int i14 = (i13 - (~((i10 ^ 95) | i13))) - 1;
        f53929a = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 73 / 0;
        }
    }

    public static /* synthetic */ Boolean k(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53930b;
        int i11 = i10 | 109;
        int i12 = i11 << 1;
        int i13 = -(i11 & (~(i10 & 109)));
        int i14 = (i12 & i13) + (i13 | i12);
        f53929a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = (-2) - ((i10 + 38) ^ (-1));
        f53929a = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 1;
        while (i18 >= 0) {
            int i19 = f53930b;
            int i20 = (i19 ^ 79) + ((i19 & 79) << 1);
            int i21 = i20 % 128;
            f53929a = i21;
            int i22 = i20 % 2;
            if (jArr[i18] != jArr2[i18]) {
                int i23 = ((i21 | 99) << 1) - (i21 ^ 99);
                int i24 = i23 % 128;
                f53930b = i24;
                int i25 = i23 % 2;
                int i26 = (i24 & (-92)) | ((~i24) & 91);
                int i27 = -(-((i24 & 91) << 1));
                int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
                f53929a = i28 % 128;
                if (i28 % 2 == 0) {
                    return Boolean.FALSE;
                }
                int i29 = 92 / 0;
                return Boolean.FALSE;
            }
            int i30 = ~i18;
            int i31 = i18 << 1;
            i18 = ((i30 | i31) << 1) - (i31 ^ i30);
            int i32 = ((i19 ^ 105) | (i19 & 105)) << 1;
            int i33 = -(((~i19) & 105) | (i19 & (-106)));
            int i34 = (i32 & i33) + (i33 | i32);
            f53929a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = f53930b;
        int i37 = ((i36 ^ 106) + ((i36 & 106) << 1)) - 1;
        f53929a = i37 % 128;
        int i38 = i37 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Boolean l(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53930b;
        int i11 = ((i10 | 50) << 1) - (i10 ^ 50);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        int i13 = i12 % 128;
        f53929a = i13;
        int i14 = i12 % 2;
        if (iArr[0] != 1) {
            int i15 = i13 & 93;
            int i16 = (~i15) & (i13 | 93);
            int i17 = -(-(i15 << 1));
            int i18 = (i16 & i17) + (i17 | i16);
            f53930b = i18 % 128;
            int i19 = i18 % 2;
            return Boolean.FALSE;
        }
        int i20 = (i13 ^ 113) + ((i13 & 113) << 1);
        f53930b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = 1;
        while (i22 < 4) {
            int i23 = f53929a;
            int i24 = (i23 & 53) + (i23 | 53);
            int i25 = i24 % 128;
            f53930b = i25;
            int i26 = i24 % 2;
            if (iArr[i22] != 0) {
                int i27 = i25 & 9;
                int i28 = ((i25 ^ 9) | i27) << 1;
                int i29 = -((~i27) & (i25 | 9));
                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                f53929a = i30 % 128;
                int i31 = i30 % 2;
                int i32 = i25 & 43;
                int i33 = -(-(i25 | 43));
                int i34 = (i32 & i33) + (i32 | i33);
                f53929a = i34 % 128;
                if (i34 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            int i35 = (-2) - ((i22 - 6) ^ (-1));
            i22 = ((i35 ^ 9) + ((i35 & 9) << 1)) - 1;
            int i36 = i25 + 43;
            f53929a = i36 % 128;
            int i37 = i36 % 2;
        }
        int i38 = f53929a;
        int i39 = (i38 ^ 123) + ((i38 & 123) << 1);
        f53930b = i39 % 128;
        if (i39 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Boolean m(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f53930b;
        int i11 = (i10 & (-100)) | ((~i10) & 99);
        int i12 = (i10 & 99) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f53929a = i14;
        int i15 = i13 % 2;
        if (jArr[0] != 1) {
            int i16 = ((i14 | 23) << 1) - (i14 ^ 23);
            int i17 = i16 % 128;
            f53930b = i17;
            boolean z10 = i16 % 2 == 0;
            int i18 = i17 + 3;
            f53929a = i18 % 128;
            int i19 = i18 % 2;
            return Boolean.valueOf(z10);
        }
        int i20 = (((i14 ^ 71) | (i14 & 71)) << 1) - ((i14 & (-72)) | ((~i14) & 71));
        f53930b = i20 % 128;
        int i21 = i20 % 2;
        int i22 = i14 + 95;
        int i23 = i22 % 128;
        f53930b = i23;
        int i24 = i22 % 2;
        if (jArr[1] == 0) {
            int i25 = ((i23 & 49) - (~(-(-(i23 | 49))))) - 1;
            int i26 = i25 % 128;
            f53929a = i26;
            int i27 = i25 % 2;
            int i28 = (i26 ^ 126) + ((i26 & 126) << 1);
            int i29 = (i28 ^ (-1)) + (i28 << 1);
            f53930b = i29 % 128;
            if (i29 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        int i30 = i14 & 55;
        int i31 = -(-((i14 ^ 55) | i30));
        int i32 = ((i30 | i31) << 1) - (i30 ^ i31);
        int i33 = i32 % 128;
        f53930b = i33;
        int i34 = i32 % 2;
        int i35 = (((i33 | 88) << 1) - (i33 ^ 88)) - 1;
        f53929a = i35 % 128;
        if (i35 % 2 == 0) {
            return Boolean.FALSE;
        }
        int i36 = 67 / 0;
        return Boolean.FALSE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0097  */
    /* JADX WARN: Code duplicated, block: B:18:0x009a  */
    /* JADX WARN: Code duplicated, block: B:20:0x009c A[LOOP:0: B:3:0x002d->B:20:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x007d A[SYNTHETIC] */
    public static /* synthetic */ Boolean n(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i13 = f53930b;
        int i14 = (i13 & 57) + (i13 | 57);
        int i15 = i14 % 128;
        f53929a = i15;
        int i16 = i14 % 2;
        int i17 = (i15 & (-6)) | ((~i15) & 5);
        int i18 = -(-((i15 & 5) << 1));
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        f53930b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 3;
        while (i21 >= 0) {
            int i22 = f53930b;
            int i23 = (i22 & 23) + (i22 | 23);
            int i24 = i23 % 128;
            f53929a = i24;
            if (i23 % 2 != 0) {
                int i25 = iArr[i21];
                int i26 = Integer.MAX_VALUE & i25;
                int i27 = (~i25) & Integer.MIN_VALUE;
                i10 = (i27 & i26) | (i26 ^ i27);
                int i28 = iArr2[i21];
                i11 = (Integer.MIN_VALUE | i28) & (~(i28 & Integer.MIN_VALUE));
                int i29 = 77 / 0;
                if (i10 < i11) {
                    int i30 = i24 & 45;
                    int i31 = (~i30) & (i24 | 45);
                    int i32 = i30 << 1;
                    int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                    f53930b = i33 % 128;
                    int i34 = i33 % 2;
                    return Boolean.FALSE;
                }
                if (i10 > i11) {
                    int i35 = ((i22 & 120) + (i22 | 120)) - 1;
                    int i36 = i35 % 128;
                    f53929a = i36;
                    int i37 = i35 % 2;
                    i12 = (i36 & 29) + (i36 | 29);
                    f53930b = i12 % 128;
                    if (i12 % 2 != 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
                int i38 = ~i21;
                int i39 = (i21 | i38) << 1;
                int i40 = -i38;
                i21 = ((i39 & i40) << 1) + (i39 ^ i40);
                int i41 = (i22 & (-100)) | ((~i22) & 99);
                int i42 = (i22 & 99) << 1;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f53929a = i43 % 128;
                int i44 = i43 % 2;
            } else {
                int i45 = iArr[i21];
                int i46 = i45 & Integer.MIN_VALUE;
                i10 = ((i45 ^ Integer.MIN_VALUE) | i46) & (~i46);
                i11 = Integer.MIN_VALUE ^ iArr2[i21];
                if (i10 < i11) {
                    int i310 = i24 & 45;
                    int i311 = (~i310) & (i24 | 45);
                    int i312 = i310 << 1;
                    int i313 = ((i311 | i312) << 1) - (i312 ^ i311);
                    f53930b = i313 % 128;
                    int i314 = i313 % 2;
                    return Boolean.FALSE;
                }
                if (i10 > i11) {
                    int i315 = ((i22 & 120) + (i22 | 120)) - 1;
                    int i316 = i315 % 128;
                    f53929a = i316;
                    int i317 = i315 % 2;
                    i12 = (i316 & 29) + (i316 | 29);
                    f53930b = i12 % 128;
                    if (i12 % 2 != 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
                int i318 = ~i21;
                int i319 = (i21 | i318) << 1;
                int i47 = -i318;
                i21 = ((i319 & i47) << 1) + (i319 ^ i47);
                int i48 = (i22 & (-100)) | ((~i22) & 99);
                int i49 = (i22 & 99) << 1;
                int i410 = (i48 ^ i49) + ((i49 & i48) << 1);
                f53929a = i410 % 128;
                int i411 = i410 % 2;
            }
        }
        int i50 = f53930b + 81;
        f53929a = i50 % 128;
        int i51 = i50 % 2;
        return Boolean.TRUE;
    }

    public static BigInteger setCompoundDrawableTintBlendMode(int[] iArr) {
        return (BigInteger) setOnFocusChangeListener(new Object[]{iArr}, -502725576, 502725579, (int) System.currentTimeMillis());
    }

    public static int setDividerPadding(int[] iArr, int[] iArr2) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, iArr2}, -425085130, 425085144, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        long j10;
        long j11;
        long j12;
        long j13;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ((~(i13 | i14)) * 979) + (i11 * (-978)) + (i10 * 980);
        int i16 = ((~(i10 | i14)) | (~(i13 | i12))) * 979;
        int i17 = 4;
        int i18 = 0;
        long j14 = 4294967295L;
        int i19 = 2;
        switch (i16 + ((i10 | i12) * (-979)) + i15) {
            case 1:
                c(objArr);
                return null;
            case 2:
                BigInteger bigIntegerShiftRight = (BigInteger) objArr[0];
                int i20 = f53930b;
                int i21 = i20 & 7;
                int i22 = ((((i20 ^ 7) | i21) << 1) - (~(-((i20 | 7) & (~i21))))) - 1;
                f53929a = i22 % 128;
                int i23 = i22 % 2;
                if (bigIntegerShiftRight.signum() >= 0) {
                    int i24 = f53930b;
                    int i25 = i24 ^ 103;
                    int i26 = (((i24 & 103) | i25) << 1) - i25;
                    f53929a = i26 % 128;
                    if (i26 % 2 == 0 ? bigIntegerShiftRight.bitLength() <= 128 : bigIntegerShiftRight.bitLength() <= 21957) {
                        int[] iArr = (int[]) setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
                        int i27 = f53929a;
                        int i28 = (i27 & 123) + (i27 | 123);
                        f53930b = i28 % 128;
                        int i29 = i28 % 2;
                        while (i18 < 4) {
                            int i30 = f53930b;
                            int i31 = (i30 ^ 45) + ((i30 & 45) << 1);
                            f53929a = i31 % 128;
                            int i32 = i31 % 2;
                            iArr[i18] = bigIntegerShiftRight.intValue();
                            bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                            int i33 = i18 - 72;
                            int i34 = i33 & 73;
                            int i35 = ((i33 ^ 73) | i34) << 1;
                            int i36 = -((i33 | 73) & (~i34));
                            i18 = (i35 & i36) + (i35 | i36);
                            int i37 = f53929a;
                            int i38 = (((i37 ^ 117) | (i37 & 117)) << 1) - (((~i37) & 117) | (i37 & (-118)));
                            f53930b = i38 % 128;
                            int i39 = i38 % 2;
                        }
                        int i40 = f53929a + 77;
                        f53930b = i40 % 128;
                        int i41 = i40 % 2;
                        return iArr;
                    }
                }
                throw new IllegalArgumentException();
            case 3:
                return i(objArr);
            case 4:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int i42 = f53929a;
                int i43 = i42 ^ 101;
                int i44 = (((i42 & 101) | i43) << 1) - i43;
                f53930b = i44 % 128;
                int i45 = i44 % 2;
                int i46 = (i42 ^ 51) + ((i42 & 51) << 1);
                f53930b = i46 % 128;
                int i47 = i46 % 2;
                int i48 = 3;
                while (i48 >= 0) {
                    int i49 = f53930b;
                    int i50 = i49 & 81;
                    int i51 = (i49 ^ 81) | i50;
                    int i52 = (i50 - (~i51)) - 1;
                    f53929a = i52 % 128;
                    int i53 = i52 % 2;
                    if (iArr2[i48] != iArr3[i48]) {
                        int i54 = ((i51 << 1) - (~(-((i49 | 81) & (~i50))))) - 1;
                        f53929a = i54 % 128;
                        int i55 = i54 % 2;
                        obj = Boolean.FALSE;
                    } else {
                        int i56 = i48 | (-70);
                        int i57 = i56 << 1;
                        int i58 = -(i56 & (~(i48 & (-70))));
                        int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
                        i48 = ((i59 & 70) + (i59 | 70)) - 1;
                        int i60 = (i49 ^ 65) + ((i49 & 65) << 1);
                        f53929a = i60 % 128;
                        int i61 = i60 % 2;
                    }
                    break;
                }
                int i62 = f53930b + 13;
                f53929a = i62 % 128;
                int i63 = i62 % 2;
                obj = Boolean.TRUE;
                break;
            case 5:
                return l(objArr);
            case 6:
                int[] iArr4 = (int[]) objArr[0];
                int i64 = f53929a;
                int i65 = i64 ^ 87;
                int i66 = ((i64 & 87) | i65) << 1;
                int i67 = -i65;
                int i68 = (i66 & i67) + (i66 | i67);
                int i69 = i68 % 128;
                f53930b = i69;
                int i70 = i68 % 2;
                int i71 = iArr4[0] & 1;
                int i72 = i69 & 97;
                int i73 = (((i69 | 97) & (~i72)) - (~(-(-(i72 << 1))))) - 1;
                f53929a = i73 % 128;
                int i74 = i73 % 2;
                return Integer.valueOf(i71);
            case 7:
                int i75 = f53929a;
                int i76 = (i75 ^ 105) + ((i75 & 105) << 1);
                f53930b = i76 % 128;
                long[] jArr = i76 % 2 == 0 ? new long[4] : new long[2];
                int i77 = i75 & 81;
                int i78 = -(-((i75 ^ 81) | i77));
                int i79 = ((i77 | i78) << 1) - (i78 ^ i77);
                f53930b = i79 % 128;
                int i80 = i79 % 2;
                return jArr;
            case 8:
                int[] iArr5 = (int[]) objArr[0];
                int[] iArr6 = (int[]) objArr[1];
                int[] iArr7 = (int[]) objArr[2];
                int i81 = f53930b + 63;
                int i82 = i81 % 128;
                f53929a = i82;
                int i83 = i81 % 2;
                long j15 = (((long) iArr5[0]) & 4294967295L) + (((long) iArr6[0]) & 4294967295L) + (((long) iArr7[0]) & 4294967295L);
                iArr7[0] = (int) j15;
                long j16 = (j15 >>> 32) + (((long) iArr5[1]) & 4294967295L) + (((long) iArr6[1]) & 4294967295L) + (((long) iArr7[1]) & 4294967295L);
                iArr7[1] = (int) j16;
                long j17 = (((long) iArr5[2]) & 4294967295L) + (((long) iArr6[2]) & 4294967295L) + (((long) iArr7[2]) & 4294967295L) + (j16 >>> 32);
                iArr7[2] = (int) j17;
                long j18 = (((long) iArr5[3]) & 4294967295L) + (((long) iArr6[3]) & 4294967295L) + (((long) iArr7[3]) & 4294967295L) + (j17 >>> 32);
                iArr7[3] = (int) j18;
                int i84 = (-2) - ((((i82 | 62) << 1) - (i82 ^ 62)) ^ (-1));
                f53930b = i84 % 128;
                int i85 = i84 % 2;
                return Integer.valueOf((int) (j18 >>> 32));
            case 9:
                return m(objArr);
            case 10:
                int i86 = f53930b;
                int i87 = (i86 & (-120)) | ((~i86) & 119);
                int i88 = (i86 & 119) << 1;
                int i89 = (i87 & i88) + (i87 | i88);
                f53929a = i89 % 128;
                long[] jArr2 = new long[i89 % 2 != 0 ? 3 : 4];
                int i90 = i86 + 89;
                f53929a = i90 % 128;
                int i91 = i90 % 2;
                return jArr2;
            case 11:
                return h(objArr);
            case 12:
                int[] iArr8 = (int[]) objArr[0];
                int[] iArr9 = (int[]) objArr[1];
                int[] iArr10 = (int[]) objArr[2];
                int i92 = f53929a;
                int i93 = (-2) - (((i92 ^ 44) + ((i92 & 44) << 1)) ^ (-1));
                f53930b = i93 % 128;
                if (i93 % 2 == 0) {
                    j12 = ((long) iArr9[1]) | 4294967295L;
                    long j19 = ((long) iArr9[0]) * 4294967295L;
                    long j20 = ((long) iArr9[5]) | 4294967295L;
                    j11 = ((long) iArr9[2]) | 4294967295L;
                    j13 = j20;
                    j10 = j19;
                    i18 = 1;
                } else {
                    long j21 = ((long) iArr9[0]) & 4294967295L;
                    j10 = ((long) iArr9[1]) & 4294967295L;
                    long j22 = ((long) iArr9[2]) & 4294967295L;
                    j11 = ((long) iArr9[3]) & 4294967295L;
                    j12 = j21;
                    j13 = j22;
                }
                long j23 = 0;
                while (i18 < i17) {
                    int i94 = f53930b;
                    int i95 = i94 & 43;
                    int i96 = (i94 ^ 43) | i95;
                    int i97 = (i95 & i96) + (i95 | i96);
                    f53929a = i97 % 128;
                    int i98 = i97 % i19;
                    long j24 = ((long) iArr8[i18]) & j14;
                    int[] iArr11 = iArr10;
                    long j25 = (j24 * j12) + (((long) iArr10[i18]) & j14);
                    iArr11[i18] = (int) j25;
                    long j26 = j24 * j10;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i99 = (i18 * (-858)) + 860;
                    int i100 = iCurrentTimeMillis ^ 1;
                    int[] iArr12 = iArr8;
                    int i101 = ~iCurrentTimeMillis;
                    int i102 = iCurrentTimeMillis & 1;
                    int i103 = ((i100 ^ i102) | (i100 & i102)) * (-859);
                    int i104 = ((i99 | i103) << 1) - (i99 ^ i103);
                    int i105 = i101 ^ 1;
                    int i106 = i101 & 1;
                    int i107 = ~((i105 ^ i106) | (i105 & i106));
                    int i108 = ~i18;
                    long j27 = j12;
                    int i109 = (-2) & i108;
                    int i110 = (~i109) & ((-2) | i108);
                    int i111 = (i110 ^ i109) | (i109 & i110);
                    long j28 = j10;
                    int i112 = (i111 & i101) | ((~i111) & iCurrentTimeMillis);
                    int i113 = iCurrentTimeMillis & i111;
                    int i114 = ~((i113 & i112) | (i112 ^ i113));
                    int i115 = ((~i114) & i107) | ((~i107) & i114);
                    int i116 = i114 & i107;
                    int i117 = -(-(((i116 & i115) | (i115 ^ i116)) * 859));
                    int i118 = i104 & i117;
                    int i119 = -(-((i104 ^ i117) | i118));
                    int i120 = (i118 & i119) + (i119 | i118);
                    int i121 = (~i101) & i108;
                    int i122 = ~i108;
                    int i123 = i121 | (i101 & i122);
                    int i124 = i101 & i108;
                    int i125 = ~((i124 & i123) | (i123 ^ i124));
                    int i126 = (i108 | i18) & i108;
                    int i127 = (i126 & (-2)) | ((~i126) & 1);
                    int i128 = i126 & 1;
                    int i129 = ~((i127 ^ i128) | (i127 & i128));
                    int i130 = -(~(((i125 & i129) | ((~i129) & i125) | ((~i125) & i129)) * 859));
                    long j29 = j26 + (((long) iArr11[(-2) - (((i120 ^ i130) + ((i130 & i120) << 1)) ^ (-1))]) & 4294967295L) + (j25 >>> 32);
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i131 = -(-(i18 * 192));
                    int i132 = ((-381) ^ i131) + ((i131 & (-381)) << 1) + 382;
                    int i133 = i18 ^ iCurrentTimeMillis2;
                    int i134 = ~iCurrentTimeMillis2;
                    int i135 = iCurrentTimeMillis2 & i18;
                    int i136 = (i133 ^ i135) | (i135 & i133);
                    int i137 = ~i136;
                    int i138 = (i136 | i137) & i137;
                    int i139 = i138 ^ 1;
                    int i140 = i138 & 1;
                    int i141 = -(-(((i139 ^ i140) | (i140 & i139)) * Opcodes.ATHROW));
                    int i142 = (i132 & i141) + (i141 | i132);
                    int i143 = ~(((-2) ^ i18) | ((-2) & i18));
                    int i144 = i134 & i18;
                    int i145 = ((~i144) & (i134 | i18)) | i144;
                    int i146 = ~i145;
                    int i147 = (i145 | i146) & i146;
                    int i148 = i143 & i147;
                    int i149 = (i143 | i147) & (~i148);
                    int i150 = ((i149 & i148) | (i149 ^ i148)) * Opcodes.ATHROW;
                    int i151 = i142 & i150;
                    iArr11[((i150 | i142) & (~i151)) + (i151 << 1)] = (int) j29;
                    int i152 = i18 + 3;
                    long j30 = (j24 * j13) + (((long) iArr11[(i152 ^ (-1)) + (i152 << 1)]) & 4294967295L) + (j29 >>> 32);
                    iArr11[((i18 | 2) << 1) - (i18 ^ 2)] = (int) j30;
                    long j31 = j30 >>> 32;
                    long j32 = j24 * j11;
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i153 = -(-(i18 * (-958)));
                    int i154 = (((-2874) | i153) << 1) - (i153 ^ (-2874));
                    int i155 = ~iCurrentTimeMillis3;
                    int i156 = (i126 ^ i155) | (i126 & i155);
                    int i157 = ~i156;
                    int i158 = (i156 | i157) & i157;
                    int i159 = (-4) & iCurrentTimeMillis3;
                    long j33 = j11;
                    int i160 = ~(((~i159) & ((-4) | iCurrentTimeMillis3)) | i159);
                    int i161 = i158 ^ i160;
                    int i162 = i160 & i158;
                    int i163 = (i162 & i161) | (i161 ^ i162);
                    int i164 = i155 & 3;
                    int i165 = (~i164) & (i155 | 3);
                    int i166 = ~((i164 & i165) | (i165 ^ i164));
                    int i167 = i163 ^ i166;
                    int i168 = i163 & i166;
                    int i169 = -(-(((i168 & i167) | (i167 ^ i168)) * 959));
                    int i170 = i154 ^ i169;
                    int i171 = (i169 & i154) << 1;
                    int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                    int i173 = i18 & 3;
                    int i174 = (~i173) & (i18 | 3);
                    int i175 = (i174 & i173) | (i174 ^ i173);
                    int i176 = ~i175;
                    int i177 = -(-(((i175 | i176) & i176) * (-959)));
                    int i178 = (i172 | i177) << 1;
                    int i179 = -(i177 ^ i172);
                    int i180 = (i178 ^ i179) + ((i179 & i178) << 1);
                    int i181 = (-4) & i155;
                    int i182 = (~i181) & ((-4) | i155);
                    int i183 = ~((i182 ^ i181) | (i181 & i182));
                    int i184 = (i155 & i108) | (iCurrentTimeMillis3 & i122);
                    int i185 = i108 & iCurrentTimeMillis3;
                    int i186 = (i184 ^ i185) | (i184 & i185);
                    int i187 = ~i186;
                    int i188 = (i186 | i187) & i187;
                    int i189 = i183 & i188;
                    int i190 = (~i189) & (i183 | i188);
                    int i191 = (i190 & i189) | (i190 ^ i189);
                    int i192 = ~((iCurrentTimeMillis3 & 3) | (iCurrentTimeMillis3 ^ 3));
                    int i193 = ((~i192) & i191) | ((~i191) & i192);
                    int i194 = i192 & i191;
                    int i195 = -(~(((i194 & i193) | (i193 ^ i194)) * 959));
                    int i196 = (i180 ^ i195) + ((i195 & i180) << 1);
                    long j34 = j32 + (((long) iArr11[(i196 ^ (-1)) + (i196 << 1)]) & 4294967295L) + j31;
                    int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                    int i197 = 1349 - (~(-(-(i18 * (-448)))));
                    int i198 = (-4) & i108;
                    int i199 = i173 | i198;
                    int i200 = (-4) & i18;
                    int i201 = (i199 & i200) | (i199 ^ i200);
                    int i202 = ~i201;
                    int i203 = (i201 | i202) & i202;
                    int i204 = i198 | (i122 & 3);
                    int i205 = i108 & 3;
                    int i206 = (i204 & i205) | (i204 ^ i205);
                    int i207 = i206 ^ iCurrentTimeMillis4;
                    int i208 = ~iCurrentTimeMillis4;
                    int i209 = i206 & iCurrentTimeMillis4;
                    int i210 = (i209 & i207) | (i207 ^ i209);
                    int i211 = ~i210;
                    int i212 = (i210 | i211) & i211;
                    int i213 = ((~i212) & i203) | ((~i203) & i212);
                    int i214 = i203 & i212;
                    int i215 = ((i214 & i213) | (i213 ^ i214)) * 449;
                    int i216 = i197 & i215;
                    int i217 = i215 | i197;
                    int i218 = ((i216 | i217) << 1) - (i217 ^ i216);
                    int i219 = (~((-4) | i18)) * (-1347);
                    int i220 = (i218 & i219) + (i219 | i218);
                    int i221 = ~(((-4) ^ i18) | i200);
                    int i222 = (iCurrentTimeMillis4 | i208) & i208;
                    int i223 = i108 ^ i222;
                    int i224 = i222 & i108;
                    int i225 = (i224 & i223) | (i223 ^ i224);
                    int i226 = i225 & 3;
                    int i227 = (i225 | 3) & (~i226);
                    int i228 = ~((i227 & i226) | (i227 ^ i226));
                    int i229 = ((~i228) & i221) | ((~i221) & i228);
                    int i230 = i228 & i221;
                    iArr11[(((i230 & i229) | (i229 ^ i230)) * 449) + i220] = (int) j34;
                    long j35 = j34 >>> 32;
                    int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
                    int i231 = i18 * (-885);
                    int i232 = ((7092 ^ i231) | (7092 & i231)) << 1;
                    int i233 = -((i231 & (-7093)) | (7092 & (~i231)));
                    int i234 = (i232 & i233) + (i233 | i232);
                    int i235 = i108 & 4;
                    int i236 = ((-5) & i122) | i235;
                    int i237 = (-5) & i108;
                    int i238 = ~((i236 & i237) | (i236 ^ i237));
                    int i239 = i108 & iCurrentTimeMillis5;
                    int i240 = (~i239) & (i108 | iCurrentTimeMillis5);
                    int i241 = ~iCurrentTimeMillis5;
                    int i242 = ~((i240 ^ i239) | (i239 & i240));
                    int i243 = i238 & i242;
                    int i244 = (~i243) & (i238 | i242);
                    int i245 = (i244 & i243) | (i244 ^ i243);
                    int i246 = (iCurrentTimeMillis5 | i241) & i241;
                    int i247 = i246 & 4;
                    int i248 = (i246 | 4) & (~i247);
                    int i249 = (i248 & i247) | (i248 ^ i247);
                    int i250 = ~((i249 & i18) | (i249 ^ i18));
                    int i251 = -(~(-(-(((i250 & i245) | (i245 ^ i250)) * 886))));
                    int i252 = ((i234 ^ i251) + ((i251 & i234) << 1)) - 1;
                    int i253 = ~i241;
                    int i254 = (i241 & i108) | (i18 & i253) | (i241 & i18);
                    int i255 = ~i254;
                    int i256 = (i254 | i255) & i255;
                    int i257 = i256 ^ 4;
                    int i258 = i256 & 4;
                    int i259 = -(-(((i258 & i257) | (i257 ^ i258)) * (-1772)));
                    int i260 = i252 & i259;
                    int i261 = (((i252 | i259) & (~i260)) - (~(-(-(i260 << 1))))) - 1;
                    int i262 = (i241 & (-5)) | (i253 & 4);
                    int i263 = i241 & 4;
                    long j36 = j35 + (((long) iArr11[(i261 - (~(-(-((~((i262 & i263) | (i262 ^ i263))) * 886))))) - 1]) & 4294967295L) + j23;
                    int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                    int i264 = (i18 * (-622)) + 2496;
                    int i265 = i108 ^ 4;
                    int i266 = (i265 & i235) | (i265 ^ i235);
                    int i267 = i266 & iCurrentTimeMillis6;
                    int i268 = (i266 | iCurrentTimeMillis6) & (~i267);
                    int i269 = -(~(-(-((~((i268 & i267) | (i268 ^ i267))) * 623))));
                    int i270 = (-2) - (((i264 ^ i269) + ((i264 & i269) << 1)) ^ (-1));
                    int i271 = ~iCurrentTimeMillis6;
                    int i272 = ~(((-5) & i18) | ((-5) ^ i18));
                    int i273 = i271 ^ i272;
                    int i274 = i272 & i271;
                    int i275 = -(-(((i274 & i273) | (i273 ^ i274)) * (-623)));
                    int i276 = ((i270 ^ i275) | (i270 & i275)) << 1;
                    int i277 = -((i275 & (~i270)) | ((~i275) & i270));
                    int i278 = ((i276 | i277) << 1) - (i277 ^ i276);
                    int i279 = i237 | (i122 & 4);
                    int i280 = ~((i279 & i235) | (i279 ^ i235));
                    int i281 = ~((i108 & iCurrentTimeMillis6) | (i108 ^ iCurrentTimeMillis6));
                    int i282 = ((~i281) & i280) | ((~i280) & i281);
                    int i283 = i280 & i281;
                    int i284 = (i283 & i282) | (i282 ^ i283);
                    int i285 = ~((iCurrentTimeMillis6 & 4) | (iCurrentTimeMillis6 ^ 4));
                    int i286 = i284 & i285;
                    int i287 = (i285 | i284) & (~i286);
                    int i288 = -(-(((i287 & i286) | (i287 ^ i286)) * 623));
                    int i289 = i278 ^ i288;
                    iArr11[((((i288 & i278) | i289) << 1) - (~(-i289))) - 1] = (int) j36;
                    j23 = j36 >>> 32;
                    int i290 = i18 ^ 1;
                    int i291 = -(-((i18 & 1) << 1));
                    i18 = ((i290 | i291) << 1) - (i290 ^ i291);
                    int i292 = f53929a;
                    int i293 = (i292 | 107) << 1;
                    int i294 = -(((~i292) & 107) | (i292 & (-108)));
                    int i295 = ((i293 | i294) << 1) - (i293 ^ i294);
                    f53930b = i295 % 128;
                    int i296 = i295 % 2;
                    j11 = j33;
                    iArr10 = iArr11;
                    iArr8 = iArr12;
                    j12 = j27;
                    j10 = j28;
                    i17 = 4;
                    j14 = 4294967295L;
                    i19 = 2;
                }
                int i297 = f53930b;
                int i298 = ((i297 | 1) << 1) - (i297 ^ 1);
                f53929a = i298 % 128;
                int i299 = i298 % 2;
                return Integer.valueOf((int) j23);
            case 13:
                g(objArr);
                return null;
            case 14:
                return b(objArr);
            case 15:
                j(objArr);
                return null;
            case 16:
                int[] iArr13 = (int[]) objArr[0];
                int[] iArr14 = (int[]) objArr[1];
                int[] iArr15 = (int[]) objArr[2];
                int i300 = f53929a;
                int i301 = i300 + 21;
                f53930b = i301 % 128;
                int i302 = i301 % 2;
                long j37 = (((long) iArr13[0]) & 4294967295L) + (((long) iArr14[0]) & 4294967295L);
                iArr15[0] = (int) j37;
                long j38 = (((long) iArr13[1]) & 4294967295L) + (((long) iArr14[1]) & 4294967295L) + (j37 >>> 32);
                iArr15[1] = (int) j38;
                long j39 = (((long) iArr13[2]) & 4294967295L) + (((long) iArr14[2]) & 4294967295L) + (j38 >>> 32);
                iArr15[2] = (int) j39;
                long j40 = (((long) iArr13[3]) & 4294967295L) + (((long) iArr14[3]) & 4294967295L) + (j39 >>> 32);
                iArr15[3] = (int) j40;
                int i303 = i300 & 85;
                int i304 = -(-((i300 ^ 85) | i303));
                int i305 = (i303 & i304) + (i303 | i304);
                f53930b = i305 % 128;
                int i306 = i305 % 2;
                return Integer.valueOf((int) (j40 >>> 32));
            case 17:
                int i307 = f53929a;
                int i308 = (i307 & 59) + (i307 | 59);
                f53930b = i308 % 128;
                obj = new int[i308 % 2 == 0 ? 48 : 8];
                break;
            case 18:
                return f(objArr);
            case 19:
                return a();
            case 20:
                return k(objArr);
            case 21:
                return n(objArr);
            case 22:
                return e(objArr);
            default:
                return d(objArr);
        }
        return obj;
    }

    public static boolean setX(int[] iArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{iArr}, 1085637402, -1085637402, (int) System.currentTimeMillis())).booleanValue();
    }

    public static BigInteger setY(long[] jArr) {
        return (BigInteger) setOnFocusChangeListener(new Object[]{jArr}, -54417229, 54417240, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 1496073495, -1496073494, (int) System.currentTimeMillis());
    }

    public static boolean setDividerPadding(long[] jArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{jArr}, -1950202807, 1950202829, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setX(long[] jArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{jArr}, 368740709, -368740700, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setY(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 2023888423, -2023888411, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{iArr, iArr2}, 563716878, -563716874, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setDividerPadding(int[] iArr) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr}, 2002673659, -2002673653, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setX(int[] iArr, int[] iArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{iArr, iArr2}, -1034679762, 1034679783, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setY(BigInteger bigInteger) {
        return (int[]) setOnFocusChangeListener(new Object[]{bigInteger}, 1614305678, -1614305676, (int) System.currentTimeMillis());
    }

    public static long[] setCompoundDrawableTintBlendMode() {
        return (long[]) setOnFocusChangeListener(new Object[0], 687837845, -687837835, (int) System.currentTimeMillis());
    }

    public static int[] setDividerPadding() {
        return (int[]) setOnFocusChangeListener(new Object[0], 282180333, -282180314, (int) System.currentTimeMillis());
    }

    public static int[] setX() {
        return (int[]) setOnFocusChangeListener(new Object[0], -1845968634, 1845968651, (int) System.currentTimeMillis());
    }

    public static long[] setY() {
        return (long[]) setOnFocusChangeListener(new Object[0], 1120999966, -1120999959, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setOnFocusChangeListener(new Object[]{jArr, jArr2}, -1339481376, 1339481391, (int) System.currentTimeMillis());
    }

    public static int setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, -563398411, 563398427, (int) System.currentTimeMillis())).intValue();
    }

    public static int setX(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 403538937, -403538929, (int) System.currentTimeMillis())).intValue();
    }

    public static int setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 1043272735, -1043272717, (int) System.currentTimeMillis())).intValue();
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2}, -239632748, 239632761, (int) System.currentTimeMillis());
    }

    public static boolean setOnFocusChangeListener(int[] iArr) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{iArr}, -709116516, 709116521, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{jArr, jArr2}, -176743705, 176743725, (int) System.currentTimeMillis())).booleanValue();
    }
}
