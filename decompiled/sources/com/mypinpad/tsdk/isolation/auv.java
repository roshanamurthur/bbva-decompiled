package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class auv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53927a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53928b = 1;

    public static /* synthetic */ Integer a(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53928b;
        int i11 = ~i10;
        int i12 = (i10 & (-90)) | (i11 & 89);
        int i13 = (i10 & 89) << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f53927a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = iArr[0] & 1;
        int i17 = ((i10 & (-56)) | (i11 & 55)) + ((i10 & 55) << 1);
        f53927a = i17 % 128;
        if (i17 % 2 == 0) {
            return Integer.valueOf(i16);
        }
        int i18 = 12 / 0;
        return Integer.valueOf(i16);
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53927a;
        int i11 = i10 & 95;
        int i12 = ((~i11) & (i10 | 95)) + (i11 << 1);
        f53928b = i12 % 128;
        int i13 = i12 % 2;
        long j10 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[12]) & 4294967295L);
        int i14 = (int) j10;
        iArr[6] = i14;
        iArr2[12] = i14;
        long j11 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[13]) & 4294967295L) + (j10 >>> 32);
        int i15 = (int) j11;
        iArr[7] = i15;
        iArr2[13] = i15;
        long j12 = (((long) iArr[8]) & 4294967295L) + (((long) iArr2[14]) & 4294967295L) + (j11 >>> 32);
        int i16 = (int) j12;
        iArr[8] = i16;
        iArr2[14] = i16;
        long j13 = (((long) iArr[9]) & 4294967295L) + (((long) iArr2[15]) & 4294967295L) + (j12 >>> 32);
        int i17 = (int) j13;
        iArr[9] = i17;
        iArr2[15] = i17;
        long j14 = (((long) iArr[10]) & 4294967295L) + (((long) iArr2[16]) & 4294967295L) + (j13 >>> 32);
        int i18 = (int) j14;
        iArr[10] = i18;
        iArr2[16] = i18;
        long j15 = (((long) iArr[11]) & 4294967295L) + (4294967295L & ((long) iArr2[17])) + (j14 >>> 32);
        int i19 = (int) j15;
        iArr[11] = i19;
        iArr2[17] = i19;
        int i20 = (int) (j15 >>> 32);
        int i21 = ((i10 | 57) << 1) - (i10 ^ 57);
        f53928b = i21 % 128;
        if (i21 % 2 != 0) {
            return Integer.valueOf(i20);
        }
        throw null;
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53927a;
        int i11 = ((i10 ^ 117) - (~(-(-((i10 & 117) << 1))))) - 1;
        f53928b = i11 % 128;
        int i12 = i11 % 2 == 0 ? 3 : 5;
        while (i12 >= 0) {
            int i13 = f53928b;
            int i14 = ((((i13 ^ 47) | (i13 & 47)) << 1) - (~(-(((~i13) & 47) | (i13 & (-48)))))) - 1;
            int i15 = i14 % 128;
            f53927a = i15;
            int i16 = i14 % 2;
            int i17 = iArr[i12];
            int i18 = Integer.MAX_VALUE & i17;
            int i19 = (~i17) & Integer.MIN_VALUE;
            int i20 = (i19 & i18) | (i18 ^ i19);
            int i21 = iArr2[i12];
            int i22 = i21 & Integer.MIN_VALUE;
            int i23 = ((i21 ^ Integer.MIN_VALUE) | i22) & (~i22);
            if (i20 < i23) {
                int i24 = ((((i15 ^ 91) | (i15 & 91)) << 1) - (~(-((i15 & (-92)) | ((~i15) & 91))))) - 1;
                f53928b = i24 % 128;
                return Boolean.valueOf(i24 % 2 == 0);
            }
            if (i20 > i23) {
                int i25 = i15 & 91;
                int i26 = (~i25) & (i15 | 91);
                int i27 = i25 << 1;
                int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
                int i29 = i28 % 128;
                f53928b = i29;
                boolean z10 = i28 % 2 != 0;
                int i30 = (-2) - ((i29 + 98) ^ (-1));
                f53927a = i30 % 128;
                if (i30 % 2 == 0) {
                    return Boolean.valueOf(z10);
                }
                throw null;
            }
            i12 = (i12 << 1) + (i12 ^ (-1));
            int i31 = i15 + 57;
            f53928b = i31 % 128;
            int i32 = i31 % 2;
        }
        int i33 = f53928b + 41;
        f53927a = i33 % 128;
        int i34 = i33 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53928b;
        int i11 = (i10 & (-114)) | ((~i10) & 113);
        int i12 = -(-((i10 & 113) << 1));
        int i13 = (i11 & i12) + (i11 | i12);
        f53927a = i13 % 128;
        int i14 = i13 % 2;
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr2[4]) & 4294967295L;
        long j15 = ((long) iArr2[5]) & 4294967295L;
        int i15 = i10 & 15;
        int i16 = (((i10 | 15) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
        f53927a = i16 % 128;
        int i17 = i16 % 2;
        long j16 = 0;
        int i18 = 0;
        while (i18 < 6) {
            int i19 = f53928b;
            int i20 = (i19 & 77) + (i19 | 77);
            long j17 = j16;
            f53927a = i20 % 128;
            int i21 = i20 % 2;
            long j18 = ((long) iArr[i18]) & 4294967295L;
            long j19 = j10;
            long j20 = (j18 * j10) + (((long) iArr3[i18]) & 4294967295L);
            iArr3[i18] = (int) j20;
            long j21 = j18 * j11;
            long j22 = j11;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i22 = -(-(i18 * 713));
            int i23 = (-711) ^ i22;
            int i24 = ((i23 | ((-711) & i22)) << 1) - i23;
            int i25 = ~i18;
            long j23 = j15;
            int i26 = ~i25;
            int i27 = (i25 & (-2)) | (i26 & 1);
            long j24 = j14;
            int i28 = i25 & 1;
            int i29 = ~((i27 & i28) | (i27 ^ i28));
            int i30 = ~iCurrentTimeMillis;
            long j25 = j13;
            int i31 = i30 & 1;
            int i32 = (~i31) & (i30 | 1);
            int i33 = ~((i32 ^ i31) | (i31 & i32));
            int i34 = -(-(((i29 & i33) | ((~i33) & i29) | ((~i29) & i33)) * (-712)));
            int i35 = i24 & i34;
            int i36 = i35 + ((i34 ^ i24) | i35);
            int i37 = i25 & i30;
            int i38 = (~i37) & (i25 | i30);
            int i39 = (i37 & i38) | (i38 ^ i37);
            int i40 = i39 & 1;
            int i41 = (i39 | 1) & (~i40);
            int i42 = ~((i41 & i40) | (i41 ^ i40));
            int i43 = (i18 & (-2)) | i28;
            int i44 = i18 & 1;
            int i45 = (i43 & i44) | (i43 ^ i44);
            int i46 = i45 & iCurrentTimeMillis;
            int i47 = (i45 | iCurrentTimeMillis) & (~i46);
            int i48 = ~((i47 & i46) | (i47 ^ i46));
            int i49 = i42 & i48;
            int i50 = (i42 | i48) & (~i49);
            int i51 = (i36 - (~(((i50 & i49) | (i50 ^ i49)) * (-712)))) - 1;
            int i52 = i30 & (i30 | iCurrentTimeMillis);
            int i53 = i52 ^ 1;
            int i54 = i52 & 1;
            int i55 = ~((i53 ^ i54) | (i54 & i53));
            int i56 = (i26 & i55) | ((~i55) & i25);
            int i57 = i55 & i25;
            int i58 = -(-(((i56 & i57) | (i56 ^ i57)) * 712));
            int i59 = ((i51 ^ i58) | (i51 & i58)) << 1;
            int i60 = -((i58 & (~i51)) | ((~i58) & i51));
            long j26 = j21 + (((long) iArr3[(i59 ^ i60) + ((i60 & i59) << 1)]) & 4294967295L) + (j20 >>> 32);
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i61 = -(-(i18 * 965));
            int i62 = (-1927) & i61;
            int i63 = ((((-1927) ^ i61) | i62) << 1) - ((i61 | (-1927)) & (~i62));
            int i64 = (i25 | i18) & i25;
            int i65 = ~((i64 ^ iCurrentTimeMillis2) | (i64 & iCurrentTimeMillis2));
            int i66 = (-2) & i65;
            int i67 = (i65 | (-2)) & (~i66);
            int i68 = (((i67 & i66) | (i67 ^ i66)) * (-964)) + i63;
            int i69 = ~iCurrentTimeMillis2;
            int i70 = i25 & i69;
            int i71 = (i69 | i25) & (~i70);
            int i72 = ~((i71 & i70) | (i71 ^ i70));
            int i73 = (~i28) & (i25 | 1);
            int i74 = (i28 & i73) | (i73 ^ i28);
            int i75 = ~i74;
            int i76 = (i74 | i75) & i75;
            int i77 = i72 ^ i76;
            int i78 = i76 & i72;
            int i79 = ((i78 & i77) | (i77 ^ i78)) * (-964);
            int i80 = i68 & i79;
            int i81 = (i79 | i68) & (~i80);
            int i82 = -(-(i80 << 1));
            iArr3[(i81 ^ i82) + ((i81 & i82) << 1)] = (int) j26;
            long j27 = (j18 * j12) + (((long) iArr3[(i18 ^ 2) + ((i18 & 2) << 1)]) & 4294967295L) + (j26 >>> 32);
            iArr3[i18 + 2] = (int) j27;
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i83 = -(-(i18 * (-219)));
            int i84 = 663 & i83;
            int i85 = (i83 ^ 663) | i84;
            int i86 = (i84 & i85) + (i85 | i84);
            int i87 = ((~i64) & (-4)) | (i64 & 3);
            int i88 = i64 & (-4);
            int i89 = ~((i87 & i88) | (i87 ^ i88));
            int i90 = ~iCurrentTimeMillis3;
            int i91 = i90 | 3;
            int i92 = (i91 & i25) | ((~i91) & i18);
            int i93 = i91 & i18;
            int i94 = ~((i93 & i92) | (i92 ^ i93));
            int i95 = ((i89 & i94) | (i89 ^ i94)) * 220;
            int i96 = i86 & i95;
            int i97 = (i95 | i86) & (~i96);
            int i98 = i96 << 1;
            int i99 = (i97 ^ i98) + ((i97 & i98) << 1);
            int i100 = (i90 | iCurrentTimeMillis3) & i90;
            int i101 = ~((i100 & i18) | (i100 ^ i18));
            int i102 = ((~i101) & 3) | (i101 & (-4));
            int i103 = i101 & 3;
            int i104 = ((i103 & i102) | (i102 ^ i103)) * (-440);
            int i105 = (i99 | i104) << 1;
            int i106 = -((i104 & (~i99)) | ((~i104) & i99));
            int i107 = ((i105 | i106) << 1) - (i106 ^ i105);
            int i108 = (i18 ^ 3) | (i18 & 3);
            int i109 = -(-(((iCurrentTimeMillis3 & i108) | (i90 & i108) | ((~i108) & iCurrentTimeMillis3)) * 220));
            int i110 = i107 & i109;
            long j28 = (j18 * j25) + (((long) iArr3[i110 + ((i109 ^ i107) | i110)]) & 4294967295L) + (j27 >>> 32);
            int i111 = i108 << 1;
            int i112 = -((i18 & (-4)) | (3 & i25));
            iArr3[(i111 & i112) + (i112 | i111)] = (int) j28;
            long j29 = (j18 * j24) + (((long) iArr3[((i18 ^ 5) + ((i18 & 5) << 1)) - 1]) & 4294967295L) + (j28 >>> 32);
            int i113 = i18 & 4;
            int i114 = -(-((i18 ^ 4) | i113));
            iArr3[(i113 ^ i114) + ((i113 & i114) << 1)] = (int) j29;
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i115 = -(-(i18 * (-107)));
            int i116 = 275 & i115;
            int i117 = (i115 | 275) & (~i116);
            int i118 = -(-(i116 << 1));
            int i119 = ((i117 | i118) << 1) - (i117 ^ i118);
            int i120 = ((-6) ^ i18) | ((-6) & i18);
            int i121 = ~i120;
            int i122 = (i120 | i121) & i121;
            int i123 = ~iCurrentTimeMillis4;
            int i124 = i123 & i18;
            int i125 = (~i124) & (i123 | i18);
            int i126 = ~((i125 ^ i124) | (i125 & i124));
            int i127 = ((i126 & i122) | ((~i122) & i126) | ((~i126) & i122)) * (-108);
            int i128 = ((i119 ^ i127) | (i119 & i127)) << 1;
            int i129 = -((i127 & (~i119)) | ((~i127) & i119));
            int i130 = (i128 ^ i129) + ((i129 & i128) << 1);
            int i131 = ((-6) & i123) | (iCurrentTimeMillis4 & 5);
            int i132 = (-6) & iCurrentTimeMillis4;
            int i133 = ~((i132 & i131) | (i131 ^ i132));
            int i134 = (i25 ^ 5) | (i25 & 5);
            int i135 = ~i134;
            int i136 = (i133 & i135) | (i133 ^ i135);
            int i137 = i123 & 5;
            int i138 = ~(((i123 | 5) & (~i137)) | i137);
            int i139 = ((~i138) & i136) | ((~i136) & i138);
            int i140 = i136 & i138;
            int i141 = ((i140 & i139) | (i139 ^ i140)) * 54;
            int i142 = i130 & i141;
            int i143 = ((i130 ^ i141) | i142) << 1;
            int i144 = -((i141 | i130) & (~i142));
            int i145 = (i143 & i144) + (i144 | i143);
            int i146 = (iCurrentTimeMillis4 | ((i135 | i134) & i135)) * 54;
            int i147 = i145 & i146;
            int i148 = (i146 | i145) & (~i147);
            int i149 = -(-(i147 << 1));
            long j30 = (j18 * j23) + (((long) iArr3[(i148 & i149) + (i148 | i149)]) & 4294967295L) + (j29 >>> 32);
            int i150 = i18 | 6;
            int i151 = i18 ^ 6;
            iArr3[((i150 << 1) - i151) - 1] = (int) j30;
            int i152 = i18 & 6;
            int i153 = i151 | i152;
            long j31 = (j30 >>> 32) + (((long) iArr3[(i153 << 1) - (i150 & (~i152))]) & 4294967295L) + j17;
            iArr3[(i152 - (~i153)) - 1] = (int) j31;
            long j32 = j31 >>> 32;
            int i154 = ((i18 ^ (-12)) - (~((i18 & (-12)) << 1))) - 1;
            i18 = ((i154 ^ 14) + ((i154 & 14) << 1)) - 1;
            int i155 = f53927a - (-2);
            int i156 = (i155 ^ (-1)) + (i155 << 1);
            f53928b = i156 % 128;
            int i157 = i156 % 2;
            j16 = j32;
            j10 = j19;
            j11 = j22;
            j15 = j23;
            j14 = j24;
            j13 = j25;
        }
        int i158 = (int) j16;
        int i159 = f53928b;
        int i160 = (((i159 ^ 105) | (i159 & 105)) << 1) - (((~i159) & 105) | (i159 & (-106)));
        f53927a = i160 % 128;
        if (i160 % 2 == 0) {
            return Integer.valueOf(i158);
        }
        throw null;
    }

    public static /* synthetic */ Boolean e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53928b;
        int i11 = i10 + 55;
        f53927a = i11 % 128;
        if (i11 % 2 == 0 ? iArr[0] != 1 : iArr[0] != 1) {
            int i12 = ((i10 ^ 9) | (i10 & 9)) << 1;
            int i13 = -((i10 & (-10)) | ((~i10) & 9));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            f53927a = i14 % 128;
            int i15 = i14 % 2;
            return Boolean.FALSE;
        }
        int i16 = i10 & 125;
        int i17 = ((i10 | 125) & (~i16)) + (i16 << 1);
        f53927a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 1;
        while (i19 < 6) {
            int i20 = f53928b;
            int i21 = ~i20;
            int i22 = (((i20 ^ 47) | (i20 & 47)) << 1) - ((i20 & (-48)) | (i21 & 47));
            f53927a = i22 % 128;
            int i23 = i22 % 2;
            if (iArr[i19] != 0) {
                int i24 = i20 + 25;
                f53927a = i24 % 128;
                int i25 = i24 % 2;
                int i26 = (-2) - (((i20 & 36) + (i20 | 36)) ^ (-1));
                f53927a = i26 % 128;
                if (i26 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            i19 = ((i19 | 1) << 1) - (i19 ^ 1);
            int i27 = ((i20 & (-78)) | (i21 & 77)) + ((i20 & 77) << 1);
            f53927a = i27 % 128;
            int i28 = i27 % 2;
        }
        int i29 = f53928b;
        int i30 = i29 & 7;
        int i31 = ((i29 ^ 7) | i30) << 1;
        int i32 = -((i29 | 7) & (~i30));
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        f53927a = i33 % 128;
        if (i33 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Long f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53928b;
        int i11 = (i10 & (-16)) | ((~i10) & 15);
        int i12 = (i10 & 15) << 1;
        int i13 = (i11 & i12) + (i11 | i12);
        f53927a = i13 % 128;
        int i14 = i13 % 2;
        long j10 = ((long) iArr[6]) & 4294967295L;
        long j11 = (j10 * 4553) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j11;
        long j12 = j11 >>> 32;
        long j13 = ((long) iArr[7]) & 4294967295L;
        long j14 = (j13 * 4553) + j10 + (((long) iArr2[1]) & 4294967295L) + j12;
        iArr3[1] = (int) j14;
        long j15 = ((long) iArr[8]) & 4294967295L;
        long j16 = (j15 * 4553) + j13 + (((long) iArr2[2]) & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j16;
        long j17 = ((long) iArr[9]) & 4294967295L;
        long j18 = (j17 * 4553) + j15 + (((long) iArr2[3]) & 4294967295L) + (j16 >>> 32);
        iArr3[3] = (int) j18;
        long j19 = ((long) iArr[10]) & 4294967295L;
        long j20 = (j19 * 4553) + j17 + (((long) iArr2[4]) & 4294967295L) + (j18 >>> 32);
        iArr3[4] = (int) j20;
        long j21 = ((long) iArr[11]) & 4294967295L;
        long j22 = (4553 * j21) + j19 + (((long) iArr2[5]) & 4294967295L) + (j20 >>> 32);
        iArr3[5] = (int) j22;
        long j23 = (j22 >>> 32) + j21;
        int i15 = (i10 & 100) + (i10 | 100);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        f53927a = i16 % 128;
        if (i16 % 2 == 0) {
            return Long.valueOf(j23);
        }
        throw null;
    }

    public static /* synthetic */ Boolean g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53927a;
        int i11 = (i10 & 55) + (i10 | 55);
        f53928b = i11 % 128;
        int i12 = i11 % 2;
        int i13 = 0;
        while (i13 < 6) {
            int i14 = f53927a;
            int i15 = i14 & 71;
            int i16 = i15 + ((i14 ^ 71) | i15);
            int i17 = i16 % 128;
            f53928b = i17;
            if (i16 % 2 == 0) {
                int i18 = iArr[i13];
                throw null;
            }
            if (iArr[i13] != 0) {
                int i19 = (i17 ^ 112) + ((i17 & 112) << 1);
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                int i21 = i20 % 128;
                f53927a = i21;
                boolean z10 = i20 % 2 != 0;
                int i22 = i21 ^ 27;
                int i23 = ((i21 & 27) | i22) << 1;
                int i24 = -i22;
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                f53928b = i25 % 128;
                if (i25 % 2 != 0) {
                    return Boolean.valueOf(z10);
                }
                throw null;
            }
            int i26 = ((i13 & (-123)) | ((~i13) & 122)) + ((i13 & 122) << 1);
            int i27 = (i26 ^ (-120)) + ((i26 & (-120)) << 1);
            i13 = (i27 << 1) + (i27 ^ (-1));
            int i28 = i17 | 39;
            int i29 = ((i28 << 1) - (~(-((~(i17 & 39)) & i28)))) - 1;
            f53927a = i29 % 128;
            int i30 = i29 % 2;
        }
        int i31 = f53928b;
        int i32 = ((i31 ^ 74) + ((i31 & 74) << 1)) - 1;
        f53927a = i32 % 128;
        if (i32 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Integer h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53927a + 51;
        int i11 = i10 % 128;
        f53928b = i11;
        int i12 = i10 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
        iArr3[2] = (int) j12;
        long j13 = ((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32);
        iArr3[3] = (int) j13;
        long j14 = ((((long) iArr[4]) & 4294967295L) - (((long) iArr2[4]) & 4294967295L)) + (j13 >> 32);
        iArr3[4] = (int) j14;
        long j15 = ((((long) iArr[5]) & 4294967295L) - (4294967295L & ((long) iArr2[5]))) + (j14 >> 32);
        iArr3[5] = (int) j15;
        int i13 = (int) (j15 >> 32);
        int i14 = (i11 ^ 55) + ((i11 & 55) << 1);
        f53927a = i14 % 128;
        if (i14 % 2 == 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    public static /* synthetic */ Object i() {
        int i10 = f53928b;
        int i11 = i10 & 113;
        int i12 = -(-(i10 | 113));
        int i13 = (i11 & i12) + (i11 | i12);
        f53927a = i13 % 128;
        int i14 = i13 % 2;
        int[] iArr = new int[12];
        int i15 = ((i10 & 85) - (~(i10 | 85))) - 1;
        f53927a = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 56 / 0;
        }
        return iArr;
    }

    public static /* synthetic */ Object j() {
        int i10 = f53928b;
        int i11 = i10 & 35;
        int i12 = -(-((i10 ^ 35) | i11));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f53927a = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr = new long[6];
        int i15 = (i10 & (-86)) | ((~i10) & 85);
        int i16 = -(-((i10 & 85) << 1));
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        f53927a = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 33 / 0;
        }
        return jArr;
    }

    public static /* synthetic */ Boolean k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = 2;
        int[] iArr2 = (int[]) objArr[2];
        ((Number) objArr[3]).intValue();
        int i11 = f53927a;
        int i12 = ((i11 ^ 39) | (i11 & 39)) << 1;
        int i13 = -((i11 & (-40)) | ((~i11) & 39));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f53928b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = i11 + 77;
        f53928b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 5;
        while (i18 >= 0) {
            int i19 = f53928b;
            int i20 = ((i19 | 115) << 1) - (i19 ^ 115);
            int i21 = i20 % 128;
            f53927a = i21;
            int i22 = i20 % i10;
            int i23 = (i18 ^ 7) + ((i18 & 7) << 1);
            int i24 = iArr[(i23 ^ (-1)) + (i23 << 1)];
            int i25 = i24 & Integer.MIN_VALUE;
            int i26 = ((i24 ^ Integer.MIN_VALUE) | i25) & (~i25);
            int i27 = -(-(i18 * (-495)));
            int i28 = i27 << 1;
            int i29 = -i27;
            int i30 = (i28 & i29) + (i29 | i28);
            int i31 = ~i18;
            int i32 = (~i31) | i31;
            int i33 = ~i32;
            int i34 = (i32 | i33) & i33;
            int i35 = ~iIntValue;
            int i36 = ~((i35 ^ iIntValue) | (i35 & iIntValue));
            int i37 = (((~i34) & i36) | ((~i36) & i34) | (i34 & i36)) * 992;
            int i38 = i30 ^ i37;
            int i39 = ((((i37 & i30) | i38) << 1) - (~(-i38))) - 1;
            int i40 = i31 | ((-1) ^ i31);
            int i41 = ~i40;
            int i42 = (i40 | i41) & i41;
            int i43 = ~(((-1) ^ iIntValue) | iIntValue);
            int i44 = (i43 & i42) | ((~i43) & i42) | ((~i42) & i43);
            int i45 = i35 & i18;
            int i46 = i45 | ((~i45) & (i35 | i18));
            int i47 = ~i46;
            int i48 = (i46 | i47) & i47;
            int i49 = -(~(-(-(((i44 & i48) | ((~i48) & i44) | ((~i44) & i48)) * (-496)))));
            int i50 = (((i39 | i49) << 1) - (i39 ^ i49)) - 1;
            int i51 = ((i18 ^ iIntValue) | (i18 & iIntValue)) * 496;
            int i52 = ((i50 ^ i51) | (i50 & i51)) << 1;
            int i53 = -((i51 & (~i50)) | ((~i51) & i50));
            int i54 = iArr2[((i52 | i53) << 1) - (i53 ^ i52)];
            int i55 = ((~i54) & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i54);
            if (i26 < i55) {
                int i56 = (i19 ^ 31) + ((i19 & 31) << 1);
                f53927a = i56 % 128;
                int i57 = i56 % 2;
                int i58 = i19 & 73;
                int i59 = -(-((i19 ^ 73) | i58));
                int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
                f53927a = i60 % 128;
                int i61 = i60 % 2;
                return Boolean.FALSE;
            }
            if (i26 > i55) {
                int i62 = i21 & 59;
                int i63 = ((~i62) & (i21 | 59)) + (i62 << 1);
                f53928b = i63 % 128;
                int i64 = i63 % 2;
                int i65 = ((i21 | 5) << 1) - (i21 ^ 5);
                f53928b = i65 % 128;
                int i66 = i65 % 2;
                return Boolean.TRUE;
            }
            int i67 = i18 & 101;
            int i68 = i67 + ((i18 ^ 101) | i67);
            int i69 = i68 & (-102);
            int i70 = -(-((i68 ^ (-102)) | i69));
            i18 = (i69 ^ i70) + ((i70 & i69) << 1);
            int i71 = ((i21 & 94) + (i21 | 94)) - 1;
            f53928b = i71 % 128;
            int i72 = i71 % 2;
            i10 = 2;
        }
        int i73 = f53927a + 107;
        f53928b = i73 % 128;
        if (i73 % i10 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074 A[LOOP:0: B:16:0x0071->B:18:0x0074, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:8:0x002d  */
    public static /* synthetic */ Object l(Object[] objArr) {
        int i10;
        int[] iArr;
        int i11 = 0;
        BigInteger bigIntegerShiftRight = (BigInteger) objArr[0];
        int i12 = f53927a;
        int i13 = (i12 & (-122)) | ((~i12) & 121);
        int i14 = -(-((i12 & 121) << 1));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f53928b = i15 % 128;
        int i16 = i15 % 2;
        int iSignum = bigIntegerShiftRight.signum();
        if (i16 == 0) {
            int i17 = 59 / 0;
            if (iSignum >= 0) {
                int i18 = f53927a;
                int i19 = (i18 & 59) + (i18 | 59);
                f53928b = i19 % 128;
                i10 = i19 % 2;
                int iBitLength = bigIntegerShiftRight.bitLength();
                if (i10 == 0 ? iBitLength <= 192 : iBitLength <= 24088) {
                    iArr = (int[]) setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                    int i20 = f53928b;
                    int i21 = ((-1) << 1) - ((((i20 | 114) << 1) - (i20 ^ 114)) ^ (-1));
                    f53927a = i21 % 128;
                    int i22 = i21 % 2;
                    while (i11 < 6) {
                        int i23 = f53928b + 125;
                        f53927a = i23 % 128;
                        int i24 = i23 % 2;
                        iArr[i11] = bigIntegerShiftRight.intValue();
                        bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                        i11 = ((i11 | 1) << 1) - (i11 ^ 1);
                        int i25 = f53928b;
                        int i26 = i25 & 107;
                        int i27 = -(-(i25 | 107));
                        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                        f53927a = i28 % 128;
                        int i29 = i28 % 2;
                    }
                    System.currentTimeMillis();
                    System.currentTimeMillis();
                    return iArr;
                }
            }
        } else if (iSignum >= 0) {
            int i110 = f53927a;
            int i111 = (i110 & 59) + (i110 | 59);
            f53928b = i111 % 128;
            i10 = i111 % 2;
            int iBitLength2 = bigIntegerShiftRight.bitLength();
            if (i10 == 0) {
                iArr = (int[]) setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
                int i210 = f53928b;
                int i211 = ((-1) << 1) - ((((i210 | 114) << 1) - (i210 ^ 114)) ^ (-1));
                f53927a = i211 % 128;
                int i212 = i211 % 2;
                while (i11 < 6) {
                    int i213 = f53928b + 125;
                    f53927a = i213 % 128;
                    int i214 = i213 % 2;
                    iArr[i11] = bigIntegerShiftRight.intValue();
                    bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                    i11 = ((i11 | 1) << 1) - (i11 ^ 1);
                    int i215 = f53928b;
                    int i216 = i215 & 107;
                    int i217 = -(-(i215 | 107));
                    int i218 = ((i216 | i217) << 1) - (i217 ^ i216);
                    f53927a = i218 % 128;
                    int i219 = i218 % 2;
                }
                System.currentTimeMillis();
                System.currentTimeMillis();
                return iArr;
            }
            iArr = (int[]) setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
            int i2110 = f53928b;
            int i2111 = ((-1) << 1) - ((((i2110 | 114) << 1) - (i2110 ^ 114)) ^ (-1));
            f53927a = i2111 % 128;
            int i2112 = i2111 % 2;
            while (i11 < 6) {
                int i2113 = f53928b + 125;
                f53927a = i2113 % 128;
                int i2114 = i2113 % 2;
                iArr[i11] = bigIntegerShiftRight.intValue();
                bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                i11 = ((i11 | 1) << 1) - (i11 ^ 1);
                int i2115 = f53928b;
                int i2116 = i2115 & 107;
                int i2117 = -(-(i2115 | 107));
                int i2118 = ((i2116 | i2117) << 1) - (i2117 ^ i2116);
                f53927a = i2118 % 128;
                int i2119 = i2118 % 2;
            }
            System.currentTimeMillis();
            System.currentTimeMillis();
            return iArr;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void m(Object[] objArr) {
        long j10;
        int i10;
        int i11;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i12 = f53928b;
        int i13 = (-2) - (((i12 ^ 76) + ((i12 & 76) << 1)) ^ (-1));
        int i14 = i13 % 128;
        f53927a = i14;
        int i15 = 6;
        long j11 = 4294967295L;
        if (i13 % 2 != 0) {
            j10 = ((long) iArr[72]) * 4294967295L;
            i10 = 2;
            i11 = 14;
        } else {
            j10 = ((long) iArr[6]) & 4294967295L;
            i10 = 5;
            i11 = 12;
        }
        int i16 = i14 + 67;
        f53928b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 0;
        while (true) {
            int i19 = (~i10) + (i10 << 1);
            int i20 = -(-i10);
            long j12 = ((long) iArr[((((i20 ^ 6) | (i20 & 6)) << 1) - (~(-(((~i20) & i15) | (i20 & (-7)))))) - 1]) & j11;
            long j13 = j12 * j12;
            int i21 = ((~i11) - (~(i11 << 1))) - 1;
            int i22 = i21 & 12;
            int i23 = i21 | 12;
            int i24 = i18 << 31;
            int i25 = (int) (j13 >>> 33);
            int i26 = i24 ^ i25;
            int i27 = i24 & i25;
            iArr2[(i22 & i23) + (i22 | i23)] = (i27 & i26) | (i26 ^ i27);
            int i28 = (i21 & 101) | ((~i21) & (-102));
            int i29 = (i21 & (-102)) << 1;
            int i30 = (i28 & i29) + (i29 | i28);
            int i31 = i30 & 101;
            int i32 = (~i31) & (i30 | 101);
            int i33 = -(-(i31 << 1));
            int i34 = ((i33 & i32) << 1) + (i32 ^ i33);
            int i35 = -(-i34);
            iArr2[((i35 | 12) << 1) - (i35 ^ 12)] = (int) (j13 >>> 1);
            i18 = (int) j13;
            if (i19 <= 0) {
                break;
            }
            i11 = i34;
            i10 = i19;
            i15 = 6;
            j11 = 4294967295L;
        }
        System.currentTimeMillis();
        System.currentTimeMillis();
        long j14 = j10 * j10;
        long j15 = (((long) (i18 << 31)) & 4294967295L) | (j14 >>> 33);
        iArr2[12] = (int) j14;
        int i36 = ((int) (j14 >>> 32)) & 1;
        long j16 = ((long) iArr[7]) & 4294967295L;
        long j17 = ((long) iArr2[14]) & 4294967295L;
        long j18 = (j16 * j10) + j15;
        int i37 = (int) j18;
        int i38 = i37 << 1;
        iArr2[13] = (i38 & i36) | (i38 ^ i36);
        int i39 = i37 >>> 31;
        long j19 = ((long) iArr[8]) & 4294967295L;
        long j20 = ((long) iArr2[15]) & 4294967295L;
        long j21 = ((long) iArr2[16]) & 4294967295L;
        long j22 = (j19 * j10) + j17 + (j18 >>> 32);
        int i40 = (int) j22;
        int i41 = i40 << 1;
        int i42 = ((~i39) & i41) | ((~i41) & i39);
        int i43 = i39 & i41;
        iArr2[14] = (i42 & i43) | (i42 ^ i43);
        int i44 = i40 >>> 31;
        long jA = a.a(j19, j16, j22 >>> 32, j20);
        long j23 = j21 + (jA >>> 32);
        long j24 = ((long) iArr[9]) & 4294967295L;
        long j25 = (((long) iArr2[17]) & 4294967295L) + (j23 >>> 32);
        long j26 = j23 & 4294967295L;
        long j27 = (((long) iArr2[18]) & 4294967295L) + (j25 >>> 32);
        long j28 = (j24 * j10) + (jA & 4294967295L);
        int i45 = (int) j28;
        int i46 = i45 << 1;
        iArr2[15] = (i44 & i46) | ((~i46) & i44) | ((~i44) & i46);
        int i47 = i45 >>> 31;
        long jA2 = a.a(j24, j16, j28 >>> 32, j26);
        long jA3 = a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
        long j29 = j27 + (jA3 >>> 32);
        long j30 = jA3 & 4294967295L;
        long j31 = ((long) iArr[10]) & 4294967295L;
        long j32 = j10;
        long j33 = (((long) iArr2[19]) & 4294967295L) + (j29 >>> 32);
        long j34 = (((long) iArr2[20]) & 4294967295L) + (j33 >>> 32);
        long j35 = (j31 * j32) + (jA2 & 4294967295L);
        int i48 = (int) j35;
        int i49 = i48 << 1;
        int i50 = i49 ^ i47;
        int i51 = i47 & i49;
        iArr2[16] = (i51 & i50) | (i50 ^ i51);
        int i52 = i48 >>> 31;
        long jA4 = a.a(j31, j16, j35 >>> 32, j30);
        long jA5 = a.a(j31, j19, jA4 >>> 32, j29 & 4294967295L);
        long jA6 = a.a(j31, j24, jA5 >>> 32, j33 & 4294967295L);
        long j36 = jA5 & 4294967295L;
        long j37 = j34 + (jA6 >>> 32);
        long j38 = jA6 & 4294967295L;
        long j39 = ((long) iArr[11]) & 4294967295L;
        long j40 = (((long) iArr2[21]) & 4294967295L) + (j37 >>> 32);
        long j41 = j37 & 4294967295L;
        long j42 = (((long) iArr2[22]) & 4294967295L) + (j40 >>> 32);
        long j43 = (j39 * j32) + (jA4 & 4294967295L);
        int i53 = (int) j43;
        int i54 = i53 << 1;
        iArr2[17] = (i52 & i54) | (i54 ^ i52);
        int i55 = i53 >>> 31;
        long jA7 = a.a(j39, j16, j43 >>> 32, j36);
        long jA8 = a.a(j39, j19, jA7 >>> 32, j38);
        long jA9 = a.a(j39, j24, jA8 >>> 32, j41);
        long jA10 = a.a(j39, j31, jA9 >>> 32, j40 & 4294967295L);
        long j44 = j42 + (jA10 >>> 32);
        int i56 = (int) jA7;
        int i57 = i56 << 1;
        iArr2[18] = (i55 & i57) | (i57 ^ i55);
        int i58 = i56 >>> 31;
        int i59 = (int) jA8;
        int i60 = i59 << 1;
        iArr2[19] = (i58 & i60) | (i60 ^ i58);
        int i61 = i59 >>> 31;
        int i62 = (int) jA9;
        int i63 = i62 << 1;
        int i64 = i63 ^ i61;
        int i65 = i61 & i63;
        iArr2[20] = (i65 & i64) | (i64 ^ i65);
        int i66 = i62 >>> 31;
        int i67 = (int) jA10;
        int i68 = i67 << 1;
        int i69 = i68 & i66;
        int i70 = (i66 | i68) & (~i69);
        iArr2[21] = (i70 & i69) | (i70 ^ i69);
        int i71 = i67 >>> 31;
        int i72 = (int) j44;
        int i73 = i72 << 1;
        int i74 = i73 & i71;
        iArr2[22] = ((i71 | i73) & (~i74)) | i74;
        int i75 = i72 >>> 31;
        int i76 = iArr2[23];
        int i77 = (int) (j44 >>> 32);
        int i78 = (((((~i77) & i76) | ((~i76) & i77)) - (~(-(-((i76 & i77) << 1))))) - 1) << 1;
        int i79 = i78 & i75;
        int i80 = (i75 | i78) & (~i79);
        iArr2[23] = (i80 & i79) | (i80 ^ i79);
        int i81 = f53928b;
        int i82 = i81 & 107;
        int i83 = (i82 - (~((i81 ^ 107) | i82))) - 1;
        f53927a = i83 % 128;
        if (i83 % 2 != 0) {
            int i84 = 74 / 0;
        }
    }

    public static /* synthetic */ Boolean n(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = (-2) - ((f53928b + 122) ^ (-1));
        f53927a = i10 % 128;
        int i11 = i10 % 2 != 0 ? 1 : 0;
        while (i11 < 3) {
            int i12 = f53928b;
            int i13 = ((i12 & (-8)) | ((~i12) & 7)) + ((i12 & 7) << 1);
            int i14 = i13 % 128;
            f53927a = i14;
            int i15 = i13 % 2;
            if (jArr[i11] != 0) {
                int i16 = i14 & 45;
                int i17 = ((((i14 ^ 45) | i16) << 1) - (~(-((~i16) & (i14 | 45))))) - 1;
                int i18 = i17 % 128;
                f53928b = i18;
                int i19 = i17 % 2;
                int i20 = (i18 & 45) + (i18 | 45);
                f53927a = i20 % 128;
                int i21 = i20 % 2;
                return Boolean.FALSE;
            }
            i11 = ((((i11 ^ 1) | (i11 & 1)) << 1) - (~(-(((~i11) & 1) | (i11 & (-2)))))) - 1;
            int i22 = i12 & 119;
            int i23 = ((i12 | 119) & (~i22)) + (i22 << 1);
            f53927a = i23 % 128;
            int i24 = i23 % 2;
        }
        int i25 = f53928b;
        int i26 = i25 & 45;
        int i27 = -(-((i25 ^ 45) | i26));
        int i28 = (i26 & i27) + (i27 | i26);
        f53927a = i28 % 128;
        if (i28 % 2 == 0) {
            return Boolean.TRUE;
        }
        int i29 = 51 / 0;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Integer o(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53928b + 67;
        int i11 = i10 % 128;
        f53927a = i11;
        int i12 = i10 % 2;
        long j10 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j13 >> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j14 >> 32);
        iArr2[5] = (int) j15;
        int i13 = (int) (j15 >> 32);
        int i14 = i11 + 45;
        f53928b = i14 % 128;
        if (i14 % 2 != 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    public static /* synthetic */ Integer p(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53928b;
        int i11 = ((((i10 ^ 35) | (i10 & 35)) << 1) - (~(-(((~i10) & 35) | (i10 & (-36)))))) - 1;
        int i12 = i11 % 128;
        f53927a = i12;
        int i13 = i11 % 2;
        long j10 = ((long) iIntValue) & 4294967295L;
        long j11 = (4553 * j10) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = j10 + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
        iArr[1] = (int) j12;
        long j13 = (j12 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j13;
        if ((j13 >>> 32) != 0) {
            int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, 0, 3}, 716282167, -716282152, 6)).intValue();
            int i14 = f53927a;
            int i15 = ((i14 ^ 120) + ((i14 & 120) << 1)) - 1;
            f53928b = i15 % 128;
            int i16 = i15 % 2;
            return Integer.valueOf(iIntValue2);
        }
        int i17 = i12 & 63;
        int i18 = (i12 ^ 63) | i17;
        int i19 = (i17 & i18) + (i17 | i18);
        f53928b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = i12 & 19;
        int i22 = -(-((i12 ^ 19) | i21));
        int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
        f53928b = i23 % 128;
        if (i23 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    public static /* synthetic */ Boolean q(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53927a + 6;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f53928b = i11 % 128;
        int i12 = i11 % 2;
        boolean zBooleanValue = ((Boolean) setDividerPadding(new Object[]{iArr, 6, iArr2, 0}, -2759503, 2759512, 6)).booleanValue();
        if (zBooleanValue) {
            int i13 = f53927a;
            int i14 = i13 ^ 101;
            int i15 = ((i13 & 101) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 & i16) + (i16 | i15);
            f53928b = i17 % 128;
            ((Integer) (i17 % 2 == 0 ? setDividerPadding(new Object[]{iArr, 115, iArr2, 1, iArr3, 1}, -1617174670, 1617174699, 115) : setDividerPadding(new Object[]{iArr, 6, iArr2, 0, iArr3, 0}, -1617174670, 1617174699, 6))).intValue();
        } else {
            ((Integer) setDividerPadding(new Object[]{iArr2, 0, iArr, 6, iArr3, 0}, -1617174670, 1617174699, 0)).intValue();
            int i18 = f53928b;
            int i19 = ((i18 | 121) << 1) - (i18 ^ 121);
            f53927a = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = f53928b + 25;
        f53927a = i21 % 128;
        if (i21 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        int i22 = 25 / 0;
        return Boolean.valueOf(zBooleanValue);
    }

    public static /* synthetic */ BigInteger r(Object[] objArr) {
        byte[] bArr;
        int i10;
        int[] iArr = (int[]) objArr[0];
        int i11 = f53927a;
        int i12 = i11 & 33;
        int i13 = (((i11 ^ 33) | i12) << 1) - ((i11 | 33) & (~i12));
        f53928b = i13 % 128;
        if (i13 % 2 == 0) {
            bArr = new byte[124];
            i10 = 1;
        } else {
            bArr = new byte[24];
            i10 = 0;
        }
        while (i10 < 6) {
            int i14 = f53928b;
            int i15 = ((i14 ^ 90) + ((i14 & 90) << 1)) - 1;
            f53927a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = iArr[i10];
            if (i17 != 0) {
                int i18 = ((i14 | 76) << 1) - (i14 ^ 76);
                int i19 = (i18 ^ (-1)) + (i18 << 1);
                f53927a = i19 % 128;
                int i20 = i19 % 2;
                int i21 = -i10;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i22 = (-2) - (((i21 * 69) - 334) ^ (-1));
                int i23 = ~i21;
                int i24 = i23 & 5;
                int i25 = ((~i23) & (-6)) | i24;
                int i26 = i23 & (-6);
                int i27 = (i25 & i26) | (i25 ^ i26);
                int i28 = ~iCurrentTimeMillis;
                int i29 = i27 ^ i28;
                int i30 = i27 & i28;
                int i31 = (i29 ^ i30) | (i30 & i29);
                int i32 = ~i31;
                int i33 = (i31 | i32) & i32;
                int i34 = i24 | (i21 & (-6));
                int i35 = i21 & 5;
                int i36 = (i34 ^ i35) | (i34 & i35);
                int i37 = ~i36;
                int i38 = (i36 | i37) & i37;
                int i39 = (i38 & i33) | (i33 ^ i38);
                int i40 = (iCurrentTimeMillis & 5) | (iCurrentTimeMillis ^ 5);
                int i41 = ~i40;
                int i42 = (((i40 | i41) & i41) | i39) * (-68);
                int i43 = i22 & i42;
                int i44 = i43 + ((i42 ^ i22) | i43);
                int i45 = (i21 | i23) & i23;
                int i46 = ((~i28) & i45) | ((~i45) & i28);
                int i47 = i45 & i28;
                int i48 = (i47 & i46) | (i46 ^ i47);
                int i49 = (i48 & (-6)) | ((~i48) & 5);
                int i50 = i48 & 5;
                int i51 = -(-((~((i50 & i49) | (i49 ^ i50))) * (-68)));
                int i52 = i44 & i51;
                int i53 = ((i44 ^ i51) | i52) << 1;
                int i54 = -((i51 | i44) & (~i52));
                int i55 = (i53 & i54) + (i54 | i53);
                int i56 = ~(((-6) ^ i28) | ((-6) & i28));
                int i57 = i23 ^ i56;
                int i58 = i56 & i23;
                int i59 = ((i58 & i57) | (i57 ^ i58)) * 68;
                int i60 = ((~i59) & i55) | ((~i55) & i59);
                int i61 = (i59 & i55) << 1;
                ber.setDividerPadding(new Object[]{Integer.valueOf(i17), bArr, Integer.valueOf((((i60 | i61) << 1) - (i61 ^ i60)) << 2)}, -2092293587, 2092293591, i17);
                int i62 = f53928b;
                int i63 = i62 & 81;
                int i64 = -(-((i62 ^ 81) | i63));
                int i65 = (i63 ^ i64) + ((i64 & i63) << 1);
                f53927a = i65 % 128;
                int i66 = i65 % 2;
            }
            int i67 = i10 & 44;
            int i68 = ((i10 ^ 44) | i67) << 1;
            int i69 = -((i10 | 44) & (~i67));
            i10 = (((i68 | i69) << 1) - (i69 ^ i68)) - 43;
            int i70 = f53927a;
            int i71 = i70 & 93;
            int i72 = i71 + ((i70 ^ 93) | i71);
            f53928b = i72 % 128;
            int i73 = i72 % 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        int i74 = f53928b;
        int i75 = i74 & 35;
        int i76 = (i74 | 35) & (~i75);
        int i77 = -(-(i75 << 1));
        int i78 = ((i76 | i77) << 1) - (i76 ^ i77);
        f53927a = i78 % 128;
        if (i78 % 2 != 0) {
            int i79 = 16 / 0;
        }
        return bigInteger;
    }

    public static BigInteger setCompoundDrawableTintBlendMode(long[] jArr) {
        return (BigInteger) setDividerPadding(new Object[]{jArr}, -585436216, 585436236, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object objValueOf;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~(i13 | i10);
        int iValueOf = 0;
        switch ((((~(i10 | i12)) | i16) * 464) + ((i13 | (~i10) | i12) * (-464)) + (((~(i14 | i10)) | i15 | i16) * 464) + (i11 * (-463)) + (i10 * 465)) {
            case 1:
                int i17 = f53928b;
                int i18 = i17 & 75;
                int i19 = -(-((i17 ^ 75) | i18));
                int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
                f53927a = i20 % 128;
                objValueOf = new int[i20 % 2 != 0 ? 8 : 6];
                return objValueOf;
            case 2:
                return f(objArr);
            case 3:
                return p(objArr);
            case 4:
                m(objArr);
                return null;
            case 5:
                return g(objArr);
            case 6:
                return n(objArr);
            case 7:
                return j();
            case 8:
                return i();
            case 9:
                return k(objArr);
            case 10:
                long jLongValue = ((Number) objArr[0]).longValue();
                int[] iArr = (int[]) objArr[1];
                int i21 = f53928b;
                int i22 = i21 + 9;
                f53927a = i22 % 128;
                int i23 = i22 % 2;
                long j10 = jLongValue & 4294967295L;
                long j11 = (4553 * j10) + (((long) iArr[0]) & 4294967295L);
                iArr[0] = (int) j11;
                long j12 = jLongValue >>> 32;
                long j13 = (4553 * j12) + j10 + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
                iArr[1] = (int) j13;
                long j14 = j12 + (((long) iArr[2]) & 4294967295L) + (j13 >>> 32);
                iArr[2] = (int) j14;
                long j15 = (j14 >>> 32) + (((long) iArr[3]) & 4294967295L);
                iArr[3] = (int) j15;
                if ((j15 >>> 32) == 0) {
                    int i24 = i21 ^ 121;
                    int i25 = ((i21 & 121) | i24) << 1;
                    int i26 = -i24;
                    int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                    f53927a = i27 % 128;
                    int i28 = i27 % 2;
                } else {
                    int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{6, iArr, 0, 4}, 716282167, -716282152, 6)).intValue();
                    int i29 = f53927a;
                    int i30 = i29 ^ 79;
                    int i31 = ((((i29 & 79) | i30) << 1) - (~(-i30))) - 1;
                    f53928b = i31 % 128;
                    int i32 = i31 % 2;
                    iValueOf = Integer.valueOf(iIntValue);
                }
                return iValueOf;
            case 11:
                int i33 = f53928b;
                int i34 = (((i33 & (-78)) | ((~i33) & 77)) - (~(-(-((i33 & 77) << 1))))) - 1;
                f53927a = i34 % 128;
                long[] jArr = new long[i34 % 2 != 0 ? 5 : 3];
                System.currentTimeMillis();
                System.currentTimeMillis();
                return jArr;
            case 12:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int[] iArr4 = (int[]) objArr[2];
                int i35 = f53927a;
                int i36 = i35 & 85;
                int i37 = (~i36) & (i35 | 85);
                int i38 = -(-(i36 << 1));
                int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
                f53928b = i39 % 128;
                int i40 = i39 % 2;
                long j16 = ((long) iArr3[0]) & 4294967295L;
                long j17 = ((long) iArr3[1]) & 4294967295L;
                long j18 = ((long) iArr3[2]) & 4294967295L;
                long j19 = ((long) iArr3[3]) & 4294967295L;
                long j20 = ((long) iArr3[4]) & 4294967295L;
                long j21 = ((long) iArr3[5]) & 4294967295L;
                long j22 = ((long) iArr2[0]) & 4294967295L;
                long j23 = j22 * j16;
                iArr4[0] = (int) j23;
                long j24 = (j22 * j17) + (j23 >>> 32);
                iArr4[1] = (int) j24;
                long j25 = (j22 * j18) + (j24 >>> 32);
                iArr4[2] = (int) j25;
                long j26 = (j22 * j19) + (j25 >>> 32);
                iArr4[3] = (int) j26;
                long j27 = (j22 * j20) + (j26 >>> 32);
                iArr4[4] = (int) j27;
                long j28 = (j22 * j21) + (j27 >>> 32);
                iArr4[5] = (int) j28;
                iArr4[6] = (int) (j28 >>> 32);
                int i41 = i35 ^ 37;
                int i42 = ((i35 & 37) | i41) << 1;
                int i43 = -i41;
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                f53928b = i44 % 128;
                int i45 = i44 % 2;
                int i46 = 1;
                while (i46 < 6) {
                    int i47 = f53927a;
                    int i48 = i47 ^ 5;
                    int i49 = ((((i47 & 5) | i48) << 1) - (~(-i48))) - 1;
                    f53928b = i49 % 128;
                    int i50 = i49 % 2;
                    long j29 = ((long) iArr2[i46]) & 4294967295L;
                    long j30 = (j29 * j16) + (((long) iArr4[i46]) & 4294967295L);
                    iArr4[i46] = (int) j30;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i51 = i46 * 111;
                    int i52 = (((-109) ^ i51) | ((-109) & i51)) << 1;
                    int i53 = -(((-109) & (~i51)) | (i51 & 108));
                    int i54 = (i52 & i53) + (i52 | i53);
                    int i55 = (~iCurrentTimeMillis) & i46;
                    int i56 = ~i46;
                    int i57 = i55 | (iCurrentTimeMillis & i56);
                    int i58 = i46 & iCurrentTimeMillis;
                    int i59 = ~((i57 ^ i58) | (i57 & i58));
                    int i60 = (-2) & i59;
                    int[] iArr5 = iArr2;
                    int i61 = (~i60) & ((-2) | i59);
                    int i62 = (i54 - (~(((i61 & i60) | (i61 ^ i60)) * (-220)))) - 1;
                    int i63 = i46 & 1;
                    int i64 = (~i63) & (i46 | 1);
                    int i65 = ~((i64 ^ i63) | (i64 & i63));
                    int i66 = ~(iCurrentTimeMillis | i46);
                    int i67 = i65 ^ i66;
                    int i68 = i66 & i65;
                    int i69 = ((i67 & i68) | (i67 ^ i68)) * 220;
                    int i70 = i62 & i69;
                    int i71 = ((i62 ^ i69) | i70) << 1;
                    int i72 = -((i69 | i62) & (~i70));
                    int i73 = (i71 ^ i72) + ((i72 & i71) << 1);
                    int i74 = ~(((-2) ^ i46) | ((-2) & i46));
                    int i75 = i56 & 1;
                    int i76 = (~i75) & (i56 | 1);
                    int i77 = (i76 ^ i75) | (i75 & i76);
                    int i78 = ~i77;
                    int i79 = (i77 | i78) & i78;
                    int i80 = -(-(((i79 & i74) | (i74 ^ i79)) * 110));
                    int i81 = i73 & i80;
                    int i82 = (i80 | i73) & (~i81);
                    int i83 = i81 << 1;
                    long j31 = (j29 * j17) + (((long) iArr4[(i82 ^ i83) + ((i82 & i83) << 1)]) & 4294967295L) + (j30 >>> 32);
                    int i84 = i46 ^ 1;
                    int i85 = -(-(i63 << 1));
                    iArr4[(i84 ^ i85) + ((i85 & i84) << 1)] = (int) j31;
                    int i86 = i46 + 2;
                    long j32 = (j29 * j18) + (((long) iArr4[i86]) & 4294967295L) + (j31 >>> 32);
                    iArr4[i86] = (int) j32;
                    int i87 = i46 ^ 4;
                    int i88 = i46 & 4;
                    long j33 = (j29 * j19) + (((long) iArr4[((i88 << 1) + i87) - 1]) & 4294967295L) + (j32 >>> 32);
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i89 = i46 * (-463);
                    int i90 = ((1395 ^ i89) - (~((i89 & 1395) << 1))) - 1;
                    int i91 = (i56 | i46) & i56;
                    int i92 = ~iCurrentTimeMillis2;
                    int i93 = ~((i91 ^ i92) | (i91 & i92));
                    int i94 = (i56 & (-4)) | ((~i56) & 3);
                    int i95 = i56 & 3;
                    int i96 = ~((i94 ^ i95) | (i94 & i95));
                    int i97 = (i93 ^ i96) | (i96 & i93);
                    long j34 = j16;
                    int i98 = ((~i92) & 3) | (i92 & (-4));
                    int i99 = i92 & 3;
                    int i100 = ~((i98 & i99) | (i98 ^ i99));
                    int i101 = i97 & i100;
                    int i102 = (i97 | i100) & (~i101);
                    int i103 = ((i102 & i101) | (i102 ^ i101)) * 464;
                    int i104 = i90 & i103;
                    int i105 = i104 + ((i90 ^ i103) | i104);
                    int i106 = iCurrentTimeMillis2 & (-4);
                    int i107 = (iCurrentTimeMillis2 ^ (-4)) | i106;
                    int i108 = i107 ^ i91;
                    int i109 = i107 & i91;
                    int i110 = ((i109 & i108) | (i108 ^ i109)) * (-464);
                    int i111 = i105 ^ i110;
                    int i112 = -(-((i110 & i105) << 1));
                    int i113 = (i111 & i112) + (i112 | i111);
                    int i114 = i94 | i95;
                    int i115 = ~i114;
                    int i116 = (i114 | i115) & i115;
                    int i117 = i99 | i106;
                    int i118 = iCurrentTimeMillis2 & 3;
                    int i119 = (i117 & i118) | (i117 ^ i118);
                    int i120 = ~i119;
                    int i121 = (i119 | i120) & i120;
                    int i122 = i116 & i121;
                    int i123 = (i116 | i121) & (~i122);
                    int i124 = -(~(-(-(((i123 & i122) | (i123 ^ i122)) * 464))));
                    iArr4[(((i113 | i124) << 1) - (i124 ^ i113)) - 1] = (int) j33;
                    int i125 = i87 | i88;
                    int i126 = i125 << 1;
                    int i127 = -((~i88) & (i46 | 4));
                    long j35 = (j29 * j20) + (((long) iArr4[((i126 | i127) << 1) - (i127 ^ i126)]) & 4294967295L) + (j33 >>> 32);
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i128 = -(-(i46 * (-493)));
                    int i129 = 1980 & i128;
                    int i130 = ((1980 ^ i128) | i129) << 1;
                    int i131 = -((~i129) & (i128 | 1980));
                    int i132 = ((i130 | i131) << 1) - (i131 ^ i130);
                    int i133 = i56 & 4;
                    int i134 = (~i133) & (i56 | 4);
                    int i135 = ((i133 & i134) | (i134 ^ i133)) * (-988);
                    int i136 = i132 & i135;
                    int i137 = (i135 ^ i132) | i136;
                    int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                    int i139 = (i46 ^ (-5)) | (i46 & (-5));
                    int i140 = ~iCurrentTimeMillis3;
                    int i141 = -(-(((i139 & i140) | (i139 ^ i140)) * 494));
                    int i142 = (i138 & i141) + (i141 | i138);
                    int i143 = (-5) & i56;
                    int i144 = (~i143) & ((-5) | i56);
                    int i145 = (i144 ^ i143) | (i143 & i144);
                    int i146 = ~i145;
                    int i147 = (i145 | i146) & i146;
                    int i148 = (i56 & i140) | ((~i140) & i46);
                    int i149 = i140 & i46;
                    int i150 = ~((i149 & i148) | (i148 ^ i149));
                    int i151 = i147 ^ i150;
                    int i152 = i150 & i147;
                    int i153 = (i152 & i151) | (i151 ^ i152);
                    int i154 = ~i125;
                    int i155 = i153 & i154;
                    int i156 = (i154 | i153) & (~i155);
                    int i157 = ((i156 & i155) | (i156 ^ i155)) * 494;
                    int i158 = ((i142 ^ i157) | (i142 & i157)) << 1;
                    int i159 = -((i157 & (~i142)) | ((~i157) & i142));
                    iArr4[(i158 & i159) + (i159 | i158)] = (int) j35;
                    long j36 = (j29 * j21) + (((long) iArr4[(i46 ^ 5) + ((i46 & 5) << 1)]) & 4294967295L) + (j35 >>> 32);
                    iArr4[i46 + 5] = (int) j36;
                    iArr4[i46 + 6] = (int) (j36 >>> 32);
                    i46++;
                    int i160 = f53928b;
                    int i161 = (i160 ^ 76) + ((i160 & 76) << 1);
                    int i162 = (i161 ^ (-1)) + (i161 << 1);
                    f53927a = i162 % 128;
                    int i163 = i162 % 2;
                    iArr2 = iArr5;
                    j16 = j34;
                }
                int i164 = f53927a;
                int i165 = ((i164 & (-100)) | ((~i164) & 99)) + ((i164 & 99) << 1);
                f53928b = i165 % 128;
                int i166 = i165 % 2;
                return null;
            case 13:
                int[] iArr6 = (int[]) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int[] iArr7 = (int[]) objArr[2];
                int iIntValue3 = ((Number) objArr[3]).intValue();
                int iIntValue4 = ((Number) objArr[4]).intValue();
                int i167 = f53928b;
                int i168 = i167 & 79;
                int i169 = (i167 ^ 79) | i168;
                int i170 = ((i168 | i169) << 1) - (i169 ^ i168);
                int i171 = i170 % 128;
                f53927a = i171;
                int i172 = i170 % 2;
                long j37 = (((long) iArr6[iIntValue2]) & 4294967295L) + (((long) iArr7[iIntValue3]) & 4294967295L) + (((long) iIntValue4) & 4294967295L);
                iArr7[iIntValue3] = (int) j37;
                long j38 = j37 >>> 32;
                int i173 = -(-(iIntValue2 * 829));
                int i174 = (((829 | i173) << 1) - (~(-((i173 & (-830)) | (829 & (~i173)))))) - 1;
                int i175 = ~iIntValue2;
                int i176 = ~i175;
                int i177 = (-2) & i175;
                int i178 = (~i177) & ((-2) | i175);
                int i179 = ~((i178 & i177) | (i178 ^ i177));
                int i180 = (i175 | iIntValue2) & i175;
                int i181 = i180 | 1;
                int i182 = i181 & iIntValue2;
                int i183 = (i181 | iIntValue2) & (~i182);
                int i184 = ~((i183 & i182) | (i183 ^ i182));
                int i185 = (i174 - (~(-(~(((i179 & i184) | (i179 ^ i184)) * (-828)))))) - 2;
                int i186 = iIntValue2 & 1;
                int i187 = (iIntValue2 ^ 1) | i186;
                int i188 = i187 ^ i180;
                int i189 = ~i180;
                int i190 = i187 & i180;
                int i191 = (i185 - (~(((i188 ^ i190) | (i190 & i188)) * (-828)))) - 1;
                int i192 = (~i186) & (iIntValue2 | 1);
                int i193 = -(-((~((i192 & i186) | (i192 ^ i186))) * 828));
                long j39 = ((long) iArr6[(i191 ^ i193) + ((i191 & i193) << 1)]) & 4294967295L;
                int i194 = -(-(iIntValue3 * (-489)));
                int i195 = 491 & i194;
                int i196 = -(-((i194 ^ 491) | i195));
                int i197 = ((i195 | i196) << 1) - (i195 ^ i196);
                int i198 = ~iIntValue3;
                int i199 = (-2) ^ i198;
                int i200 = ~i198;
                int i201 = (-2) & i198;
                int i202 = (i199 ^ i201) | (i199 & i201);
                int i203 = (i197 - (~(((i202 ^ i175) | (i202 & i175)) * (-490)))) - 1;
                int i204 = i201 | (i200 & 1);
                int i205 = i198 & 1;
                int i206 = ~((i204 ^ i205) | (i204 & i205));
                int i207 = i198 & (i198 | iIntValue3);
                int i208 = ~i207;
                int i209 = (i207 & i175) | (iIntValue2 & i208) | (i207 & iIntValue2);
                int i210 = ~i209;
                int i211 = i210 & (i209 | i210);
                int i212 = (((i206 & i211) | (i206 ^ i211)) * 490) + i203;
                int i213 = i212 & (-980);
                int i214 = -(-((i212 ^ (-980)) | i213));
                long j40 = j39 + (((long) iArr7[(i213 & i214) + (i214 | i213)]) & 4294967295L) + j38;
                int i215 = iIntValue3 & 1;
                int i216 = -(-((iIntValue3 ^ 1) | i215));
                iArr7[(i215 & i216) + (i215 | i216)] = (int) j40;
                int i217 = iIntValue3 & 2;
                long j41 = (((long) iArr6[(((iIntValue2 & (-3)) | (i175 & 2)) - (~((iIntValue2 & 2) << 1))) - 1]) & 4294967295L) + (((long) iArr7[(i217 - (~(iIntValue3 | 2))) - 1]) & 4294967295L) + (j40 >>> 32);
                iArr7[(iIntValue3 ^ 2) + (i217 << 1)] = (int) j41;
                int i218 = iIntValue2 & 3;
                int i219 = iIntValue2 | 3;
                int i220 = iIntValue3 ^ 3;
                int i221 = iIntValue3 & 3;
                long j42 = (((long) iArr6[(i218 ^ i219) + ((i218 & i219) << 1)]) & 4294967295L) + (((long) iArr7[((i220 | i221) << 1) - i220]) & 4294967295L) + (j41 >>> 32);
                int i222 = -(-(iIntValue3 * 421));
                int i223 = (-1257) ^ i222;
                int i224 = ((((i222 & (-1257)) | i223) << 1) - (~(-i223))) - 1;
                int i225 = iIntValue3 ^ iIntValue2;
                int i226 = iIntValue3 & iIntValue2;
                int i227 = -(-((~((i225 & i226) | (i225 ^ i226))) * TypedValues.CycleType.TYPE_EASING));
                int i228 = i224 & i227;
                int i229 = (i224 | i227) & (~i228);
                int i230 = -(-(i228 << 1));
                int i231 = (i229 ^ i230) + ((i229 & i230) << 1);
                int i232 = i221 | ((-4) & i198);
                int i233 = iIntValue3 & (-4);
                int i234 = -(-(((i232 & i233) | (i232 ^ i233)) * (-420)));
                int i235 = i231 & i234;
                int i236 = (((i234 | i231) & (~i235)) - (~(i235 << 1))) - 1;
                int i237 = ((-4) & i208) | (i207 & 3);
                int i238 = (-4) & i207;
                int i239 = ~((i238 & i237) | (i237 ^ i238));
                int i240 = i175 & i198;
                int i241 = (iIntValue3 & i176) | i240;
                int i242 = i175 & iIntValue3;
                int i243 = (i241 & i242) | (i241 ^ i242);
                int i244 = ~i243;
                int i245 = (i243 | i244) & i244;
                int i246 = -(~(((i239 & i245) | (i239 ^ i245)) * TypedValues.CycleType.TYPE_EASING));
                iArr7[(((i236 | i246) << 1) - (i236 ^ i246)) - 1] = (int) j42;
                int i247 = (-3677) - (~(iIntValue2 * (-919)));
                int i248 = (-5) & i175;
                int i249 = ((~i248) & ((-5) | i175)) | i248;
                int i250 = ~((i249 & iIntValue2) | (i249 ^ iIntValue2));
                int i251 = (i175 & i189) | (i180 & i176);
                int i252 = i175 & i180;
                int i253 = (i251 & i252) | (i251 ^ i252);
                int i254 = (i253 & (-5)) | ((~i253) & 4);
                int i255 = i253 & 4;
                int i256 = ~((i255 & i254) | (i254 ^ i255));
                int i257 = i250 ^ i256;
                int i258 = i250 & i256;
                int i259 = (i247 - (~(((i258 & i257) | (i257 ^ i258)) * 920))) - 1;
                int i260 = ~(i248 | ((-5) ^ i175));
                int i261 = i180 & 4;
                int i262 = ((-5) & i189) | i261;
                int i263 = (-5) & i180;
                int i264 = (i262 ^ i263) | (i262 & i263);
                int i265 = ~i264;
                int i266 = ((~i265) & i260) | ((~i260) & i265);
                int i267 = i260 & i265;
                int i268 = i259 - (~(((i266 & i267) | (i266 ^ i267)) * 920));
                int i269 = (i268 ^ (-1)) + (i268 << 1);
                int i270 = i264 | i175;
                int i271 = ~i270;
                int i272 = (i270 | i271) & i271;
                int i273 = (-5) ^ iIntValue2;
                int i274 = (-5) & iIntValue2;
                int i275 = i273 | i274;
                int i276 = (i275 & i175) | ((~i275) & iIntValue2);
                int i277 = i275 & iIntValue2;
                int i278 = ~((i276 ^ i277) | (i277 & i276));
                int i279 = i272 ^ i278;
                int i280 = i272 & i278;
                int i281 = (i280 & i279) | (i279 ^ i280);
                int i282 = (i180 ^ 4) | i261;
                int i283 = ~((i282 & iIntValue2) | (i282 & i175) | ((~i282) & iIntValue2));
                int i284 = i281 ^ i283;
                int i285 = i281 & i283;
                long j43 = ((long) iArr6[(i269 - (~(((i285 & i284) | (i284 ^ i285)) * 920))) - 1]) & 4294967295L;
                int i286 = iIntValue3 * (-167);
                int i287 = ((-668) ^ i286) + ((i286 & (-668)) << 1);
                int i288 = (-5) & i207;
                int i289 = (~i288) & ((-5) | i207);
                int i290 = ~((i289 & i288) | (i289 ^ i288));
                int i291 = i198 ^ i175;
                int i292 = ~((i240 & i291) | (i291 ^ i240));
                int i293 = i290 & i292;
                int i294 = -(-((((i290 | i292) & (~i293)) | i293) * 168));
                int i295 = i287 | i294;
                int i296 = i295 << 1;
                int i297 = -((~(i287 & i294)) & i295);
                int i298 = (i296 & i297) + (i297 | i296);
                int i299 = (-5) ^ i198;
                int i300 = (-5) & i198;
                int i301 = (i299 ^ i300) | (i299 & i300);
                int i302 = i301 & iIntValue2;
                int i303 = (i301 | iIntValue2) & (~i302);
                int i304 = (i303 & i302) | (i303 ^ i302);
                int i305 = ~i304;
                int i306 = ((i304 | i305) & i305) * 168;
                int i307 = (i298 ^ i306) + ((i306 & i298) << 1);
                int i308 = ~((-5) | i180);
                int i309 = (-5) & iIntValue3;
                int i310 = (~i309) & ((-5) | iIntValue3);
                int i311 = ~((i310 & i309) | (i310 ^ i309));
                int i312 = i308 & i311;
                int i313 = (i311 | i308) & (~i312);
                int i314 = (i313 & i312) | (i313 ^ i312);
                int i315 = i300 | (i200 & 4);
                int i316 = i198 & 4;
                int i317 = (i315 & i316) | (i315 ^ i316);
                int i318 = i317 & iIntValue2;
                int i319 = (i317 | iIntValue2) & (~i318);
                int i320 = ~((i319 & i318) | (i319 ^ i318));
                int i321 = i314 & i320;
                int i322 = (i314 | i320) & (~i321);
                int i323 = ((i322 & i321) | (i322 ^ i321)) * 168;
                long j44 = j43 + (((long) iArr7[(((~i323) & i307) | ((~i307) & i323)) + ((i323 & i307) << 1)]) & 4294967295L) + (j42 >>> 32);
                int i324 = (iIntValue3 * 471) + 944;
                int i325 = (-5) ^ i180;
                int i326 = ~((i325 & i263) | (i325 ^ i263));
                int i327 = iIntValue3 & i326;
                int i328 = (i326 | iIntValue3) & (~i327);
                int i329 = -(-(((i328 & i327) | (i328 ^ i327)) * (-235)));
                int i330 = (i324 & i329) + (i324 | i329);
                int i331 = ~((i273 ^ i274) | (i273 & i274));
                int i332 = ((~i331) & iIntValue3) | (i331 & i198);
                int i333 = i331 & iIntValue3;
                int i334 = ((i333 & i332) | (i332 ^ i333)) * (-470);
                int i335 = i330 & i334;
                int i336 = (((i330 ^ i334) | i335) << 1) - ((i334 | i330) & (~i335));
                int i337 = ((~i316) & (4 | i198)) | i316;
                int i338 = ~i337;
                int i339 = (i337 | i338) & i338;
                int i340 = i300 | (iIntValue3 & 4);
                int i341 = (i340 & i309) | (i340 ^ i309);
                int i342 = ~((i341 & iIntValue2) | (i341 ^ iIntValue2));
                int i343 = -(-(((i339 & i342) | ((~i342) & i339) | ((~i339) & i342)) * 235));
                iArr7[((i336 | i343) << 1) - ((i343 & (~i336)) | ((~i343) & i336))] = (int) j44;
                long j45 = j44 >>> 32;
                int i344 = -(-(iIntValue2 * 111));
                int i345 = ((-545) | i344) << 1;
                int i346 = -((i344 & 544) | ((-545) & (~i344)));
                int i347 = ((i345 | i346) << 1) - (i346 ^ i345);
                int i348 = iIntValue2 & i175;
                int i349 = i348 | i348;
                int i350 = iIntValue2 & iIntValue2;
                int i351 = ~((i349 & i350) | (i349 ^ i350));
                int i352 = ((~i351) & (-6)) | (i351 & 5);
                int i353 = i351 & (-6);
                int i354 = (((i353 & i352) | (i352 ^ i353)) * (-220)) + i347;
                int i355 = i175 & 5;
                int i356 = iIntValue2 & (-6);
                int i357 = i355 | i356;
                int i358 = iIntValue2 & 5;
                int i359 = (i357 & i358) | (i357 ^ i358);
                int i360 = ~i359;
                int i361 = (i359 | i360) & i360;
                int i362 = (~i350) & (iIntValue2 | iIntValue2);
                int i363 = ~((i350 & i362) | (i362 ^ i350));
                int i364 = i361 & i363;
                int i365 = (i363 | i361) & (~i364);
                int i366 = ((i365 & i364) | (i365 ^ i364)) * 220;
                int i367 = i354 & i366;
                int i368 = -(-((i354 ^ i366) | i367));
                int i369 = (i367 & i368) + (i368 | i367);
                int i370 = ~(((~i356) & (iIntValue2 | (-6))) | i356);
                int i371 = ~((i175 ^ 5) | i355);
                int i372 = ((~i371) & i370) | ((~i370) & i371);
                int i373 = i370 & i371;
                int i374 = -(-(((i373 & i372) | (i372 ^ i373)) * 110));
                int i375 = iIntValue3 ^ 5;
                long j46 = (((long) iArr6[(i369 ^ i374) + ((i374 & i369) << 1)]) & 4294967295L) + (((long) iArr7[((iIntValue3 | 5) << 1) - i375]) & 4294967295L) + j45;
                int i376 = (iIntValue3 & 5) << 1;
                iArr7[(i375 & i376) + (i376 | i375)] = (int) j46;
                int i377 = ((i171 ^ 51) | (i171 & 51)) << 1;
                int i378 = -((i171 & (-52)) | ((~i171) & 51));
                int i379 = (i377 & i378) + (i377 | i378);
                f53928b = i379 % 128;
                int i380 = i379 % 2;
                return Integer.valueOf((int) (j46 >>> 32));
            case 14:
                return c(objArr);
            case 15:
                int[] iArr8 = (int[]) objArr[0];
                int[] iArr9 = (int[]) objArr[1];
                int[] iArr10 = (int[]) objArr[2];
                int iIntValue5 = ((Number) objArr[3]).intValue();
                int i381 = f53927a;
                int i382 = ((i381 | 19) << 1) - ((i381 & (-20)) | ((~i381) & 19));
                int i383 = i382 % 128;
                f53928b = i383;
                int i384 = i382 % 2;
                long j47 = ((long) iArr9[6]) & 4294967295L;
                long j48 = ((long) iArr9[7]) & 4294967295L;
                long j49 = ((long) iArr9[8]) & 4294967295L;
                long j50 = ((long) iArr9[9]) & 4294967295L;
                long j51 = ((long) iArr9[10]) & 4294967295L;
                long j52 = ((long) iArr9[11]) & 4294967295L;
                long j53 = ((long) iArr8[6]) & 4294967295L;
                int i385 = iIntValue5;
                long j54 = j53 * j47;
                iArr10[12] = (int) j54;
                long j55 = (j53 * j48) + (j54 >>> 32);
                iArr10[13] = (int) j55;
                long j56 = (j53 * j49) + (j55 >>> 32);
                iArr10[14] = (int) j56;
                long j57 = (j53 * j50) + (j56 >>> 32);
                iArr10[15] = (int) j57;
                long j58 = (j53 * j51) + (j57 >>> 32);
                iArr10[16] = (int) j58;
                long j59 = (j53 * j52) + (j58 >>> 32);
                iArr10[17] = (int) j59;
                iArr10[18] = (int) (j59 >>> 32);
                int i386 = ((i383 & 70) + (i383 | 70)) - 1;
                f53927a = i386 % 128;
                int i387 = i386 % 2;
                int i388 = i385;
                int i389 = 1;
                int i390 = 6;
                while (i389 < i390) {
                    int i391 = f53928b;
                    int i392 = i391 & 13;
                    int i393 = ((i391 ^ 13) | i392) << 1;
                    int i394 = -((i391 | 13) & (~i392));
                    int i395 = ((i393 | i394) << 1) - (i394 ^ i393);
                    int i396 = i395 % 128;
                    f53927a = i396;
                    int i397 = i395 % 2;
                    i388 = ((i388 & 1) << 1) + ((i388 & (-2)) | ((~i388) & 1));
                    int i398 = i389 * 965;
                    int i399 = ((-6742) ^ i398) + ((i398 & (-6742)) << 1);
                    int i400 = ~i389;
                    int i401 = i385;
                    int i402 = ~i401;
                    int i403 = i400 & i402;
                    int i404 = ((~i400) & i401) | i403;
                    int i405 = i400 & i401;
                    int i406 = ~((i404 ^ i405) | (i404 & i405));
                    int i407 = (-7) ^ i406;
                    int i408 = (-7) & i406;
                    int i409 = ((i407 ^ i408) | (i407 & i408)) * (-964);
                    int i410 = ((i399 ^ i409) | (i399 & i409)) << 1;
                    int i411 = i389;
                    int i412 = -(((~i409) & i399) | (i409 & (~i399)));
                    int i413 = ((i410 | i412) << 1) - (i410 ^ i412);
                    int i414 = ~(((~i403) & (i400 | i402)) | i403);
                    int i415 = i400 & 6;
                    int i416 = (~i415) & (i400 | 6);
                    int i417 = ~((i416 ^ i415) | (i415 & i416));
                    int i418 = ((~i414) & i417) | ((~i417) & i414);
                    int i419 = i414 & i417;
                    int i420 = -(-(((i419 & i418) | (i418 ^ i419)) * (-964)));
                    long j60 = ((long) iArr8[(i413 & i420) + (i420 | i413)]) & 4294967295L;
                    long j61 = j47;
                    long j62 = (j60 * j47) + (((long) iArr10[i388]) & 4294967295L);
                    iArr10[i388] = (int) j62;
                    long j63 = j62 >>> 32;
                    long j64 = j60 * j48;
                    int i421 = i388 * (-932);
                    int[] iArr11 = iArr8;
                    int i422 = ((((934 ^ i421) | (934 & i421)) << 1) - (~(-(((~i421) & 934) | (i421 & (-935)))))) - 1;
                    int i423 = ~i388;
                    int i424 = (-2) & i402;
                    int i425 = ((-2) ^ i402) | i424;
                    int i426 = ~i425;
                    int i427 = (i425 | i426) & i426;
                    int i428 = (~i427) & i423;
                    long j65 = j48;
                    int i429 = ~i423;
                    int i430 = (i427 & i429) | i428;
                    int i431 = i427 & i423;
                    int i432 = -(~(-(-(((i431 & i430) | (i430 ^ i431)) * (-933)))));
                    int i433 = ((i422 | i432) << 1) - (i432 ^ i422);
                    int i434 = (i433 ^ (-1)) + (i433 << 1);
                    int i435 = (i423 | i388) & i423;
                    int i436 = (i402 | i401) & i402;
                    int i437 = i435 ^ i436;
                    int i438 = i435 & i436;
                    int i439 = ~((i437 ^ i438) | (i437 & i438));
                    int i440 = ~(i423 | 1);
                    int i441 = ((~i439) & i440) | ((~i440) & i439);
                    int i442 = i439 & i440;
                    int i443 = -(~(((i441 & i442) | (i441 ^ i442)) * 933));
                    int i444 = (-2) - (((i434 & i443) + (i443 | i434)) ^ (-1));
                    int i445 = i388 & 1;
                    int i446 = (~i445) & (i388 | 1);
                    int i447 = (~((i445 & i446) | (i446 ^ i445))) * 933;
                    int i448 = i444 ^ i447;
                    int i449 = ((i444 & i447) | i448) << 1;
                    int i450 = -i448;
                    long j66 = j64 + (((long) iArr10[((i449 | i450) << 1) - (i449 ^ i450)]) & 4294967295L) + j63;
                    int i451 = -(-(i388 * (-215)));
                    int i452 = (217 ^ i451) + ((i451 & 217) << 1);
                    int i453 = (~(i401 | 1)) * 216;
                    int i454 = i452 ^ i453;
                    int i455 = (((i453 & i452) | i454) << 1) - i454;
                    int i456 = (i423 ^ 1) | (i423 & 1);
                    int i457 = i456 & i436;
                    int i458 = (((i456 | i436) & (~i457)) | i457) * (-216);
                    int i459 = ((i455 | i458) << 1) - (((~i455) & i458) | ((~i458) & i455));
                    int i460 = i424 | ((~i402) & 1);
                    int i461 = i402 & 1;
                    int i462 = ~((i460 & i461) | (i460 ^ i461));
                    int i463 = i388 ^ i462;
                    int i464 = i462 & i388;
                    int i465 = ((i464 & i463) | (i463 ^ i464)) * 216;
                    iArr10[((i459 ^ i465) - (~(-(-((i465 & i459) << 1))))) - 1] = (int) j66;
                    int i466 = i388 ^ 3;
                    int i467 = i388 & 3;
                    long j67 = (j60 * j49) + (((long) iArr10[((i467 << 1) + i466) - 1]) & 4294967295L) + (j66 >>> 32);
                    int i468 = i388 * 868;
                    int i469 = ((((1736 ^ i468) | (1736 & i468)) << 1) - (~(-((i468 & (-1737)) | (1736 & (~i468)))))) - 1;
                    int i470 = ~i436;
                    int i471 = ((-3) & i470) | (i436 & 2);
                    int i472 = (-3) & i436;
                    int i473 = (i471 ^ i472) | (i471 & i472);
                    int i474 = ~i473;
                    int i475 = (i473 | i474) & i474;
                    int i476 = ~(i437 | i438);
                    int i477 = i475 ^ i476;
                    int i478 = i475 & i476;
                    int i479 = ((i477 & i478) | (i477 ^ i478)) * (-867);
                    int i480 = i469 & i479;
                    long j68 = j49;
                    int i481 = (i469 | i479) & (~i480);
                    int i482 = i480 << 1;
                    int i483 = (i481 & i482) + (i481 | i482);
                    int i484 = (-3) | i423;
                    int i485 = ~i484;
                    int i486 = (i484 | i485) & i485;
                    int i487 = (-3) & i401;
                    int i488 = (~i487) & ((-3) | i401);
                    int i489 = ~((i488 & i487) | (i488 ^ i487));
                    int i490 = (i489 & i486) | (i486 ^ i489);
                    int i491 = i423 & i401;
                    int i492 = (~i491) & (i423 | i401);
                    int i493 = (i492 & i491) | (i492 ^ i491);
                    int i494 = ~i493;
                    int i495 = (i493 | i494) & i494;
                    int i496 = i490 ^ i495;
                    int i497 = i490 & i495;
                    int i498 = ((i497 & i496) | (i496 ^ i497)) * (-1734);
                    int i499 = i483 & i498;
                    int i500 = (i498 ^ i483) | i499;
                    int i501 = (i499 & i500) + (i500 | i499);
                    int i502 = i423 & 2;
                    int i503 = ((-3) & i429) | i502;
                    int i504 = (-3) & i423;
                    int i505 = ~((i503 ^ i504) | (i503 & i504) | i436);
                    int i506 = ((-3) ^ i388) | ((-3) & i388);
                    int i507 = (i506 ^ i401) | (i506 & i401);
                    int i508 = ~i507;
                    int i509 = i508 & (i507 | i508);
                    int i510 = (i509 & i505) | ((~i505) & i509) | ((~i509) & i505);
                    int i511 = i504 | (i429 & 2);
                    int i512 = (i511 & i502) | (i511 ^ i502);
                    int i513 = i512 ^ i401;
                    int i514 = i512 & i401;
                    int i515 = ~((i514 & i513) | (i513 ^ i514));
                    int i516 = ((~i515) & i510) | ((~i510) & i515);
                    int i517 = i510 & i515;
                    int i518 = ((i517 & i516) | (i516 ^ i517)) * 867;
                    int i519 = i501 ^ i518;
                    int i520 = ((i518 & i501) | i519) << 1;
                    int i521 = -i519;
                    iArr10[((i520 | i521) << 1) - (i520 ^ i521)] = (int) j67;
                    int i522 = (i466 | i467) << 1;
                    int i523 = -((~i467) & (i388 | 3));
                    long j69 = (j60 * j50) + (((long) iArr10[(i522 ^ i523) + ((i522 & i523) << 1)]) & 4294967295L) + (j67 >>> 32);
                    int i524 = i388 * TypedValues.MotionType.TYPE_EASING;
                    int i525 = (906 ^ i524) + ((i524 & 906) << 1);
                    int i526 = (-4) ^ i402;
                    int i527 = (-4) & i402;
                    int i528 = ~((i526 ^ i527) | (i526 & i527));
                    int i529 = i388 ^ i528;
                    int i530 = i528 & i388;
                    int i531 = (i525 - (~(-(-(((i530 & i529) | (i529 ^ i530)) * (-602)))))) - 1;
                    int i532 = ((-4) & i429) | (i423 & 3);
                    int i533 = i423 & (-4);
                    int i534 = ~((i533 & i532) | (i532 ^ i533));
                    int i535 = ((-4) ^ i401) | ((-4) & i401);
                    int i536 = ~i535;
                    int i537 = (i535 | i536) & i536;
                    int i538 = (i534 & i537) | (i534 ^ i537);
                    int i539 = i402 ^ 3;
                    int i540 = i402 & 3;
                    int i541 = (i539 & i540) | (i539 ^ i540);
                    int i542 = (i541 & i388) | (i541 ^ i388);
                    int i543 = ~i542;
                    int i544 = (i542 | i543) & i543;
                    int i545 = ((~i544) & i538) | ((~i538) & i544);
                    int i546 = i538 & i544;
                    int i547 = ((i546 & i545) | (i545 ^ i546)) * (-301);
                    int i548 = i531 & i547;
                    int i549 = i402 & i388;
                    iArr10[((i548 + ((i547 ^ i531) | i548)) - (~(-(-((~((i402 ^ i388) | i549)) * 301))))) - 1] = (int) j69;
                    long j70 = j69 >>> 32;
                    long j71 = j60 * j51;
                    int i550 = -(-(i388 * (-753)));
                    int i551 = 3020 & i550;
                    int i552 = (i551 - (~(-(-((i550 ^ 3020) | i551))))) - 1;
                    int i553 = (-5) ^ i388;
                    int i554 = (-5) & i388;
                    int i555 = ~((i553 ^ i554) | (i553 & i554));
                    int i556 = (-5) & i401;
                    int i557 = (~i556) & ((-5) | i401);
                    int i558 = (i557 & i556) | (i557 ^ i556);
                    int i559 = ~i558;
                    int i560 = (i558 | i559) & i559;
                    int i561 = i549 | i491 | (i388 & i401);
                    int i562 = ~i561;
                    int i563 = -(-(((i560 & i555) | (i555 ^ i560) | ((i561 | i562) & i562)) * (-754)));
                    int i564 = (i552 & i563) + (i563 | i552);
                    int i565 = i553 | i554;
                    int i566 = ~((i565 & i401) | (i565 ^ i401));
                    int i567 = i402 & 4;
                    int i568 = i567 | ((i402 | 4) & (~i567));
                    int i569 = i568 & i388;
                    int i570 = ~(((i568 | i388) & (~i569)) | i569);
                    int i571 = i566 & i570;
                    int i572 = (i566 | i570) & (~i571);
                    int i573 = ((i572 & i571) | (i572 ^ i571)) * (-754);
                    int i574 = i564 & i573;
                    int i575 = i574 + ((i573 ^ i564) | i574);
                    int i576 = ((-5) & i470) | (i436 & 4);
                    int i577 = (-5) & i436;
                    int i578 = ((i576 ^ i577) | (i576 & i577)) * 754;
                    long j72 = j71 + (((long) iArr10[((i575 ^ i578) - (~(-(-((i578 & i575) << 1))))) - 1]) & 4294967295L) + j70;
                    int i579 = i388 & 4;
                    int i580 = -(-((i388 ^ 4) | i579));
                    iArr10[(i579 ^ i580) + ((i579 & i580) << 1)] = (int) j72;
                    int i581 = i388 & 5;
                    long j73 = (j60 * j52) + (((long) iArr10[(i388 | 5) + i581]) & 4294967295L) + (j72 >>> 32);
                    iArr10[(i581 - (~((i388 ^ 5) | i581))) - 1] = (int) j73;
                    iArr10[i388 + 6] = (int) (j73 >>> 32);
                    int i582 = ((i411 ^ 53) | (i411 & 53)) << 1;
                    int i583 = -((i411 & (-54)) | (i400 & 53));
                    int i584 = (i582 ^ i583) + ((i582 & i583) << 1);
                    int i585 = i584 & (-52);
                    int i586 = i584 | (-52);
                    int i587 = ((i585 & i586) << 1) + (i585 ^ i586);
                    int i588 = (((i396 | 108) << 1) - (i396 ^ 108)) - 1;
                    f53928b = i588 % 128;
                    int i589 = i588 % 2;
                    i389 = i587;
                    i385 = i401;
                    j47 = j61;
                    j49 = j68;
                    j48 = j65;
                    i390 = 6;
                    iArr8 = iArr11;
                }
                int i590 = f53928b;
                int i591 = ((i590 | 117) << 1) - (i590 ^ 117);
                f53927a = i591 % 128;
                int i592 = i591 % 2;
                return null;
            case 16:
                long[] jArr2 = (long[]) objArr[0];
                long[] jArr3 = (long[]) objArr[1];
                int i593 = f53927a;
                int i594 = i593 & 35;
                int i595 = i594 + ((i593 ^ 35) | i594);
                f53928b = i595 % 128;
                int i596 = i595 % 2 == 0 ? 4 : 2;
                while (i596 >= 0) {
                    int i597 = f53927a;
                    int i598 = i597 & 69;
                    int i599 = (((~i598) & (i597 | 69)) - (~(-(-(i598 << 1))))) - 1;
                    int i600 = i599 % 128;
                    f53928b = i600;
                    int i601 = i599 % 2;
                    if (jArr2[i596] != jArr3[i596]) {
                        int i602 = i597 ^ 11;
                        int i603 = ((i597 & 11) | i602) << 1;
                        int i604 = -i602;
                        int i605 = (i603 ^ i604) + ((i604 & i603) << 1);
                        f53928b = i605 % 128;
                        int i606 = i605 % 2;
                        objValueOf = Boolean.FALSE;
                        return objValueOf;
                    }
                    i596 = (-2) - (i596 ^ (-1));
                    int i607 = (i600 & (-40)) | ((~i600) & 39);
                    int i608 = -(-((i600 & 39) << 1));
                    int i609 = ((i607 | i608) << 1) - (i607 ^ i608);
                    f53927a = i609 % 128;
                    int i610 = i609 % 2;
                }
                int i611 = f53928b;
                int i612 = i611 & 113;
                int i613 = i612 + ((i611 ^ 113) | i612);
                f53927a = i613 % 128;
                int i614 = i613 % 2;
                objValueOf = Boolean.TRUE;
                return objValueOf;
            case 17:
                return o(objArr);
            case 18:
                return r(objArr);
            case 19:
                return h(objArr);
            case 20:
                long[] jArr4 = (long[]) objArr[0];
                int i615 = f53927a;
                int i616 = i615 & 89;
                int i617 = (i615 ^ 89) | i616;
                int i618 = (i616 ^ i617) + ((i617 & i616) << 1);
                f53928b = i618 % 128;
                byte[] bArr = new byte[i618 % 2 == 0 ? 127 : 24];
                int i619 = 0;
                while (i619 < 3) {
                    int i620 = f53927a;
                    int i621 = (-2) - ((i620 + 66) ^ (-1));
                    f53928b = i621 % 128;
                    int i622 = i621 % 2;
                    long j74 = jArr4[i619];
                    if (j74 != 0) {
                        int i623 = i620 & 71;
                        int i624 = ((i620 | 71) & (~i623)) + (i623 << 1);
                        f53928b = i624 % 128;
                        int i625 = i624 % 2;
                        int i626 = (2 - i619) << 3;
                        ber.setDividerPadding(new Object[]{Long.valueOf(j74), bArr, Integer.valueOf(i626)}, 108647497, -108647488, i626);
                        int i627 = f53928b;
                        int i628 = (((i627 & (-40)) | ((~i627) & 39)) - (~(-(-((i627 & 39) << 1))))) - 1;
                        f53927a = i628 % 128;
                        int i629 = i628 % 2;
                    }
                    int i630 = ((i619 & 1) - (~(i619 | 1))) - 1;
                    int i631 = f53928b;
                    int i632 = i631 & 121;
                    int i633 = (i631 ^ 121) | i632;
                    int i634 = (i632 ^ i633) + ((i633 & i632) << 1);
                    f53927a = i634 % 128;
                    int i635 = i634 % 2;
                    i619 = i630;
                }
                BigInteger bigInteger = new BigInteger(1, bArr);
                int i636 = f53928b;
                int i637 = (i636 ^ 27) + ((i636 & 27) << 1);
                f53927a = i637 % 128;
                int i638 = i637 % 2;
                return bigInteger;
            case 21:
                int[] iArr12 = (int[]) objArr[0];
                int[] iArr13 = (int[]) objArr[1];
                int[] iArr14 = (int[]) objArr[2];
                int i639 = f53927a;
                int i640 = (i639 | 3) << 1;
                int i641 = -((i639 & (-4)) | ((~i639) & 3));
                int i642 = (i640 & i641) + (i641 | i640);
                f53928b = i642 % 128;
                int i643 = i642 % 2;
                long j75 = (((long) iArr12[0]) & 4294967295L) + (((long) iArr13[0]) & 4294967295L) + (((long) iArr14[0]) & 4294967295L);
                iArr14[0] = (int) j75;
                long j76 = (((long) iArr12[1]) & 4294967295L) + (((long) iArr13[1]) & 4294967295L) + (((long) iArr14[1]) & 4294967295L) + (j75 >>> 32);
                iArr14[1] = (int) j76;
                long j77 = (((long) iArr12[2]) & 4294967295L) + (((long) iArr13[2]) & 4294967295L) + (((long) iArr14[2]) & 4294967295L) + (j76 >>> 32);
                iArr14[2] = (int) j77;
                long j78 = (((long) iArr12[3]) & 4294967295L) + (((long) iArr13[3]) & 4294967295L) + (((long) iArr14[3]) & 4294967295L) + (j77 >>> 32);
                iArr14[3] = (int) j78;
                long j79 = (((long) iArr12[4]) & 4294967295L) + (((long) iArr13[4]) & 4294967295L) + (((long) iArr14[4]) & 4294967295L) + (j78 >>> 32);
                iArr14[4] = (int) j79;
                long j80 = (((long) iArr12[5]) & 4294967295L) + (((long) iArr13[5]) & 4294967295L) + (((long) iArr14[5]) & 4294967295L) + (j79 >>> 32);
                iArr14[5] = (int) j80;
                int i644 = ((i639 ^ 6) + ((6 & i639) << 1)) - 1;
                f53928b = i644 % 128;
                int i645 = i644 % 2;
                return Integer.valueOf((int) (j80 >>> 32));
            case 22:
                return d(objArr);
            case 23:
                return a(objArr);
            case 24:
                int[] iArr15 = (int[]) objArr[0];
                int[] iArr16 = (int[]) objArr[1];
                int i646 = f53927a + 47;
                int i647 = i646 % 128;
                f53928b = i647;
                int i648 = i646 % 2 == 0 ? 3 : 5;
                int i649 = i647 + 101;
                f53927a = i649 % 128;
                while (true) {
                    int i650 = i649 % 2;
                    if (i648 >= 0) {
                        int i651 = f53927a;
                        int i652 = i651 & 35;
                        int i653 = (~i652) & (i651 | 35);
                        int i654 = i652 << 1;
                        int i655 = (i653 & i654) + (i654 | i653);
                        f53928b = i655 % 128;
                        int i656 = i655 % 2;
                        if (iArr15[i648] != iArr16[i648]) {
                            int i657 = i651 & 5;
                            int i658 = i657 + ((i651 ^ 5) | i657);
                            f53928b = i658 % 128;
                            objValueOf = Boolean.valueOf(i658 % 2 == 0);
                        } else {
                            i648--;
                            i649 = (i651 ^ 11) + ((i651 & 11) << 1);
                            f53928b = i649 % 128;
                        }
                    } else {
                        int i659 = f53927a;
                        int i660 = i659 & 99;
                        int i661 = (i659 ^ 99) | i660;
                        int i662 = (i660 ^ i661) + ((i661 & i660) << 1);
                        f53928b = i662 % 128;
                        int i663 = i662 % 2;
                        objValueOf = Boolean.TRUE;
                    }
                }
                return objValueOf;
            case 25:
                int[] iArr17 = (int[]) objArr[0];
                int[] iArr18 = (int[]) objArr[1];
                int i664 = f53927a;
                int i665 = i664 & 19;
                int i666 = (i664 ^ 19) | i665;
                int i667 = ((i665 | i666) << 1) - (i665 ^ i666);
                f53928b = i667 % 128;
                int i668 = i667 % 2;
                long j81 = ((long) iArr17[0]) & 4294967295L;
                int i669 = (i664 & 57) + (i664 | 57);
                f53928b = i669 % 128;
                int i670 = i669 % 2;
                int i671 = 0;
                int i672 = 12;
                int i673 = 5;
                while (true) {
                    int i674 = (i673 & (-25)) + (i673 | (-25));
                    int i675 = (i674 ^ 24) + ((i674 & 24) << 1);
                    long j82 = ((long) iArr17[i673]) & 4294967295L;
                    long j83 = j82 * j82;
                    int i676 = ~i672;
                    int i677 = -(-(i672 << 1));
                    int i678 = (i676 & i677) + (i676 | i677);
                    int i679 = i671 << 31;
                    int i680 = (int) (j83 >>> 33);
                    iArr18[i678] = (i679 & i680) | (i679 ^ i680);
                    i672 = ((i678 ^ (-53)) - (~((i678 & (-53)) << 1))) + 51;
                    iArr18[i672] = (int) (j83 >>> 1);
                    i671 = (int) j83;
                    if (i675 <= 0) {
                        int i681 = f53927a;
                        int i682 = i681 + 113;
                        f53928b = i682 % 128;
                        int i683 = i682 % 2;
                        long j84 = j81 * j81;
                        iArr18[0] = (int) j84;
                        int i684 = ((int) (j84 >>> 32)) & 1;
                        long j85 = ((long) iArr17[1]) & 4294967295L;
                        long j86 = ((long) iArr18[2]) & 4294967295L;
                        long j87 = (j85 * j81) + ((((long) (i671 << 31)) & 4294967295L) | (j84 >>> 33));
                        int i685 = (int) j87;
                        int i686 = i685 << 1;
                        iArr18[1] = (i686 ^ i684) | (i684 & i686);
                        int i687 = i685 >>> 31;
                        long j88 = j86 + (j87 >>> 32);
                        long j89 = ((long) iArr17[2]) & 4294967295L;
                        long j90 = ((long) iArr18[3]) & 4294967295L;
                        long j91 = ((long) iArr18[4]) & 4294967295L;
                        long j92 = (j89 * j81) + j88;
                        int i688 = (int) j92;
                        int i689 = i688 << 1;
                        int i690 = i689 & i687;
                        int i691 = (i687 | i689) & (~i690);
                        iArr18[2] = (i691 & i690) | (i691 ^ i690);
                        int i692 = i688 >>> 31;
                        long jA = a.a(j89, j85, j92 >>> 32, j90);
                        long j93 = j91 + (jA >>> 32);
                        long j94 = ((long) iArr17[3]) & 4294967295L;
                        long j95 = (((long) iArr18[5]) & 4294967295L) + (j93 >>> 32);
                        long j96 = j93 & 4294967295L;
                        long j97 = (((long) iArr18[6]) & 4294967295L) + (j95 >>> 32);
                        long j98 = (j94 * j81) + (jA & 4294967295L);
                        int i693 = (int) j98;
                        int i694 = i693 << 1;
                        int i695 = i694 & i692;
                        iArr18[3] = ((i692 | i694) & (~i695)) | i695;
                        int i696 = i693 >>> 31;
                        long jA2 = a.a(j94, j85, j98 >>> 32, j96);
                        long jA3 = a.a(j94, j89, jA2 >>> 32, j95 & 4294967295L);
                        long j99 = j97 + (jA3 >>> 32);
                        long j100 = jA3 & 4294967295L;
                        long j101 = ((long) iArr17[4]) & 4294967295L;
                        long j102 = (((long) iArr18[7]) & 4294967295L) + (j99 >>> 32);
                        long j103 = j99 & 4294967295L;
                        long j104 = (((long) iArr18[8]) & 4294967295L) + (j102 >>> 32);
                        long j105 = (j101 * j81) + (jA2 & 4294967295L);
                        int i697 = (int) j105;
                        int i698 = i697 << 1;
                        iArr18[4] = (i696 & i698) | ((~i696) & i698) | ((~i698) & i696);
                        int i699 = i697 >>> 31;
                        long jA4 = a.a(j101, j85, j105 >>> 32, j100);
                        long jA5 = a.a(j101, j89, jA4 >>> 32, j103);
                        long jA6 = a.a(j101, j94, jA5 >>> 32, j102 & 4294967295L);
                        long j106 = j104 + (jA6 >>> 32);
                        long j107 = jA6 & 4294967295L;
                        long j108 = ((long) iArr17[5]) & 4294967295L;
                        long j109 = (((long) iArr18[9]) & 4294967295L) + (j106 >>> 32);
                        long j110 = (((long) iArr18[10]) & 4294967295L) + (j109 >>> 32);
                        long j111 = j109 & 4294967295L;
                        long j112 = (j108 * j81) + (jA4 & 4294967295L);
                        int i700 = (int) j112;
                        int i701 = i700 << 1;
                        int i702 = i701 & i699;
                        int i703 = (i699 | i701) & (~i702);
                        iArr18[5] = (i703 & i702) | (i703 ^ i702);
                        int i704 = i700 >>> 31;
                        long jA7 = a.a(j108, j85, j112 >>> 32, jA5 & 4294967295L);
                        long jA8 = a.a(j108, j89, jA7 >>> 32, j107);
                        long jA9 = a.a(j108, j94, jA8 >>> 32, j106 & 4294967295L);
                        long jA10 = a.a(j108, j101, jA9 >>> 32, j111);
                        long j113 = j110 + (jA10 >>> 32);
                        int i705 = (int) jA7;
                        int i706 = i705 << 1;
                        iArr18[6] = (i704 & i706) | ((~i704) & i706) | ((~i706) & i704);
                        int i707 = i705 >>> 31;
                        int i708 = (int) jA8;
                        int i709 = i708 << 1;
                        int i710 = i709 ^ i707;
                        int i711 = i707 & i709;
                        iArr18[7] = (i711 & i710) | (i710 ^ i711);
                        int i712 = i708 >>> 31;
                        int i713 = (int) jA9;
                        int i714 = i713 << 1;
                        int i715 = i714 & i712;
                        int i716 = (i712 | i714) & (~i715);
                        iArr18[8] = (i716 & i715) | (i716 ^ i715);
                        int i717 = i713 >>> 31;
                        int i718 = (int) jA10;
                        iArr18[9] = i717 | (i718 << 1);
                        int i719 = i718 >>> 31;
                        int i720 = (int) j113;
                        int i721 = i720 << 1;
                        int i722 = i721 & i719;
                        int i723 = (i719 | i721) & (~i722);
                        iArr18[10] = (i723 & i722) | (i723 ^ i722);
                        int i724 = i720 >>> 31;
                        int i725 = iArr18[11];
                        int i726 = (int) (j113 >>> 32);
                        int i727 = ((i725 & i726) + (i726 | i725)) << 1;
                        int i728 = i727 ^ i724;
                        int i729 = i724 & i727;
                        iArr18[11] = (i729 & i728) | (i728 ^ i729);
                        int i730 = ((i681 | 19) << 1) - (i681 ^ 19);
                        f53928b = i730 % 128;
                        int i731 = i730 % 2;
                        return null;
                    }
                    i673 = i675;
                }
                break;
            case 26:
                return l(objArr);
            case 27:
                return e(objArr);
            case 28:
                long[] jArr5 = (long[]) objArr[0];
                int i732 = f53927a;
                int i733 = i732 & 31;
                int i734 = ((~i733) & (i732 | 31)) + (i733 << 1);
                f53928b = i734 % 128;
                int i735 = i734 % 2;
                if (jArr5[0] != 1) {
                    int i736 = i732 & 1;
                    int i737 = (i732 ^ 1) | i736;
                    int i738 = ((i736 | i737) << 1) - (i736 ^ i737);
                    int i739 = i738 % 128;
                    f53928b = i739;
                    int i740 = i738 % 2;
                    int i741 = i739 & 23;
                    int i742 = (i739 ^ 23) | i741;
                    int i743 = (i741 ^ i742) + ((i742 & i741) << 1);
                    f53927a = i743 % 128;
                    int i744 = i743 % 2;
                    objValueOf = Boolean.FALSE;
                } else {
                    int i745 = i732 & 43;
                    int i746 = -(-((i732 ^ 43) | i745));
                    int i747 = (i745 & i746) + (i746 | i745);
                    f53928b = i747 % 128;
                    int i748 = i747 % 2;
                    int i749 = 1;
                    while (i749 < 3) {
                        int i750 = f53928b;
                        int i751 = i750 + 28;
                        int i752 = (i751 ^ (-1)) + (i751 << 1);
                        int i753 = i752 % 128;
                        f53927a = i753;
                        int i754 = i752 % 2;
                        if (jArr5[i749] != 0) {
                            int i755 = i753 & 101;
                            int i756 = (i753 ^ 101) | i755;
                            int i757 = (i755 ^ i756) + ((i755 & i756) << 1);
                            f53928b = i757 % 128;
                            boolean z10 = i757 % 2 == 0;
                            int i758 = ((i753 & 85) - (~(i753 | 85))) - 1;
                            f53928b = i758 % 128;
                            int i759 = i758 % 2;
                            objValueOf = Boolean.valueOf(z10);
                        } else {
                            i749 = ((i749 & 1) << 1) + (i749 ^ 1);
                            int i760 = (i750 & (-64)) | ((~i750) & 63);
                            int i761 = (i750 & 63) << 1;
                            int i762 = ((i760 | i761) << 1) - (i761 ^ i760);
                            f53927a = i762 % 128;
                            int i763 = i762 % 2;
                        }
                    }
                    int i764 = f53928b;
                    int i765 = i764 | 31;
                    int i766 = i765 << 1;
                    int i767 = -((~(i764 & 31)) & i765);
                    int i768 = ((i766 | i767) << 1) - (i767 ^ i766);
                    f53927a = i768 % 128;
                    int i769 = i768 % 2;
                    objValueOf = Boolean.TRUE;
                }
                return objValueOf;
            case 29:
                int[] iArr19 = (int[]) objArr[0];
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int[] iArr20 = (int[]) objArr[2];
                int iIntValue7 = ((Number) objArr[3]).intValue();
                int[] iArr21 = (int[]) objArr[4];
                ((Number) objArr[5]).intValue();
                int i770 = f53928b;
                int i771 = (i770 ^ 29) + ((i770 & 29) << 1);
                int i772 = i771 % 128;
                f53927a = i772;
                int i773 = i771 % 2;
                long j114 = (((long) iArr19[iIntValue6]) & 4294967295L) - (((long) iArr20[iIntValue7]) & 4294967295L);
                iArr21[0] = (int) j114;
                int i774 = iIntValue7 & 1;
                int i775 = -(-(iIntValue7 | 1));
                long j115 = ((((long) iArr19[iIntValue6 + 1]) & 4294967295L) - (((long) iArr20[(i774 & i775) + (i774 | i775)]) & 4294967295L)) + (j114 >> 32);
                iArr21[1] = (int) j115;
                long j116 = j115 >> 32;
                int i776 = iIntValue6 & 2;
                int i777 = ((iIntValue6 ^ 2) | i776) << 1;
                int i778 = -((~i776) & (iIntValue6 | 2));
                long j117 = ((long) iArr19[(i777 ^ i778) + ((i777 & i778) << 1)]) & 4294967295L;
                int i779 = (iIntValue7 | 2) << 1;
                int i780 = ~iIntValue7;
                int i781 = -((iIntValue7 & (-3)) | (i780 & 2));
                long j118 = (j117 - (((long) iArr20[(i779 & i781) + (i779 | i781)]) & 4294967295L)) + j116;
                iArr21[2] = (int) j118;
                long j119 = j118 >> 32;
                long j120 = ((long) iArr19[(iIntValue6 ^ 3) + ((iIntValue6 & 3) << 1)]) & 4294967295L;
                int i782 = iIntValue7 * 263;
                int i783 = ((((-1569) ^ i782) | ((-1569) & i782)) << 1) - ((i782 & 1568) | ((-1569) & (~i782)));
                int i784 = (-4) ^ iIntValue7;
                int i785 = (-4) & iIntValue7;
                int i786 = ~((i784 & i785) | (i784 ^ i785));
                int i787 = i780 & (-4);
                int i788 = ~i780;
                int i789 = i787 | (i788 & 3);
                int i790 = i780 & 3;
                int i791 = ~((i789 ^ i790) | (i789 & i790));
                int i792 = ((~i786) & i791) | ((~i791) & i786);
                int i793 = i786 & i791;
                int i794 = (i792 & i793) | (i792 ^ i793);
                int i795 = i780 ^ iIntValue6;
                int i796 = ~iIntValue6;
                int i797 = i780 & iIntValue6;
                int i798 = (i795 ^ i797) | (i795 & i797);
                int i799 = ~i798;
                int i800 = (i798 | i799) & i799;
                int i801 = (i783 - (~(((i794 & i800) | (i794 ^ i800)) * 262))) - 1;
                int i802 = -(-((~((i780 ^ 3) | i790)) * (-786)));
                int i803 = (i801 ^ i802) + ((i801 & i802) << 1);
                int i804 = ~i796;
                int i805 = (i780 & i804) | (i788 & i796);
                int i806 = i780 & i796;
                int i807 = ~((i805 ^ i806) | (i805 & i806));
                int i808 = i787 | (iIntValue7 & 3);
                int i809 = (i808 ^ i785) | (i785 & i808);
                int i810 = ~i809;
                int i811 = (i809 | i810) & i810;
                int i812 = (i811 & i807) | (i807 ^ i811);
                int i813 = i812 & i791;
                int i814 = (i812 | i791) & (~i813);
                int i815 = ((i814 & i813) | (i814 ^ i813)) * 262;
                long j121 = (j120 - (((long) iArr20[(i803 ^ i815) + ((i815 & i803) << 1)]) & 4294967295L)) + j119;
                iArr21[3] = (int) j121;
                long j122 = j121 >> 32;
                int i816 = iIntValue6 * (-167);
                int i817 = (((-668) | i816) << 1) - (i816 ^ (-668));
                int i818 = (-5) & i796;
                int i819 = ~(((-5) ^ i796) | i818);
                int i820 = (i796 & i796) | (iIntValue6 & i804);
                int i821 = i796 & iIntValue6;
                int i822 = ~((i820 & i821) | (i820 ^ i821));
                int i823 = -(-(((i819 & i822) | ((~i822) & i819) | ((~i819) & i822)) * 336));
                int i824 = ((i817 ^ i823) | (i817 & i823)) << 1;
                int i825 = -((i823 & (~i817)) | ((~i823) & i817));
                int i826 = ((i824 | i825) << 1) - (i825 ^ i824);
                int i827 = iIntValue6 ^ 4;
                int i828 = iIntValue6 & 4;
                int i829 = (i827 & i828) | (i827 ^ i828);
                int i830 = ~i829;
                int i831 = (i829 | i830) & i830;
                int i832 = iIntValue6 | 4;
                int i833 = ~i832;
                int i834 = (i832 | i833) & i833;
                int i835 = i831 & i834;
                int i836 = (i831 | i834) & (~i835);
                int i837 = (i826 - (~(-(~(-(-(((i836 & i835) | (i836 ^ i835)) * (-168)))))))) - 2;
                int i838 = (i796 | iIntValue6) & i796;
                int i839 = i818 | (i804 & 4);
                int i840 = i796 & 4;
                int i841 = ~((i839 & i840) | (i839 ^ i840));
                int i842 = -(-(((i841 & i838) | (i838 ^ i841)) * 168));
                int i843 = i837 & i842;
                int i844 = -(-((i842 ^ i837) | i843));
                long j123 = ((long) iArr19[(i843 & i844) + (i844 | i843)]) & 4294967295L;
                int i845 = iIntValue7 & 4;
                int i846 = (iIntValue7 ^ 4) | i845;
                long j124 = (j123 - (((long) iArr20[(i845 & i846) + (i845 | i846)]) & 4294967295L)) + j122;
                iArr21[4] = (int) j124;
                long j125 = j124 >> 32;
                int i847 = iIntValue6 * (-107);
                int i848 = ((~i847) & 275) | (i847 & (-276));
                int i849 = (i847 & 275) << 1;
                int i850 = ((i848 | i849) << 1) - (i849 ^ i848);
                int i851 = ~((-6) | iIntValue6);
                int i852 = i851 ^ i822;
                int i853 = i851 & i822;
                int i854 = -(~(-(-(((i853 & i852) | (i852 ^ i853)) * (-108)))));
                int i855 = (i850 ^ i854) + ((i854 & i850) << 1);
                int i856 = (i855 ^ (-1)) + (i855 << 1);
                int i857 = (-6) ^ iIntValue6;
                int i858 = (-6) & iIntValue6;
                int i859 = ~((i858 & i857) | (i857 ^ i858));
                int i860 = (i804 & 5) | (i796 & (-6));
                int i861 = i796 & 5;
                int i862 = ~(i860 | i861);
                int i863 = i859 & i862;
                int i864 = (i859 | i862) & (~i863);
                int i865 = (i864 & i863) | (i864 ^ i863);
                int i866 = i838 & 5;
                int i867 = (i838 | 5) & (~i866);
                int i868 = ~((i867 & i866) | (i867 ^ i866));
                int i869 = i865 & i868;
                int i870 = (((i868 | i865) & (~i869)) | i869) * 54;
                int i871 = ((~i870) & i856) | ((~i856) & i870);
                int i872 = (i856 & i870) << 1;
                int i873 = ((i871 | i872) << 1) - (i872 ^ i871);
                int i874 = ~((i860 & i861) | (i860 ^ i861));
                int i875 = iIntValue6 & i874;
                int i876 = (i874 | iIntValue6) & (~i875);
                int i877 = -(-(((i876 & i875) | (i876 ^ i875)) * 54));
                int i878 = i873 & i877;
                int i879 = i877 | i873;
                int i880 = (iIntValue7 & (-6)) | (i780 & 5);
                int i881 = (iIntValue7 & 5) << 1;
                long j126 = ((((long) iArr19[((i878 | i879) << 1) - (i879 ^ i878)]) & 4294967295L) - (((long) iArr20[((i880 | i881) << 1) - (i880 ^ i881)]) & 4294967295L)) + j125;
                iArr21[5] = (int) j126;
                int i882 = i772 & 37;
                int i883 = (i772 ^ 37) | i882;
                int i884 = (i882 ^ i883) + ((i882 & i883) << 1);
                f53928b = i884 % 128;
                int i885 = i884 % 2;
                return Integer.valueOf((int) (j126 >> 32));
            case 30:
                long[] jArr6 = (long[]) objArr[0];
                long[] jArr7 = (long[]) objArr[1];
                int i886 = f53927a;
                int i887 = i886 & 57;
                int i888 = ((i886 ^ 57) | i887) << 1;
                int i889 = -((i886 | 57) & (~i887));
                int i890 = (i888 ^ i889) + ((i889 & i888) << 1);
                f53928b = i890 % 128;
                if (i890 % 2 == 0) {
                    jArr7[0] = jArr6[0];
                    jArr7[0] = jArr6[1];
                    jArr7[5] = jArr6[4];
                } else {
                    jArr7[0] = jArr6[0];
                    jArr7[1] = jArr6[1];
                    jArr7[2] = jArr6[2];
                }
                return null;
            case 31:
                return b(objArr);
            case 32:
                int[] iArr22 = (int[]) objArr[0];
                int[] iArr23 = (int[]) objArr[1];
                int[] iArr24 = (int[]) objArr[2];
                int i891 = f53928b;
                int i892 = ((i891 & (-102)) | ((~i891) & 101)) + ((i891 & 101) << 1);
                int i893 = i892 % 128;
                f53927a = i893;
                int i894 = i892 % 2;
                long j127 = (((long) iArr22[0]) & 4294967295L) + (((long) iArr23[0]) & 4294967295L);
                iArr24[0] = (int) j127;
                long j128 = (((long) iArr22[1]) & 4294967295L) + (((long) iArr23[1]) & 4294967295L) + (j127 >>> 32);
                iArr24[1] = (int) j128;
                long j129 = (((long) iArr22[2]) & 4294967295L) + (((long) iArr23[2]) & 4294967295L) + (j128 >>> 32);
                iArr24[2] = (int) j129;
                long j130 = (((long) iArr22[3]) & 4294967295L) + (((long) iArr23[3]) & 4294967295L) + (j129 >>> 32);
                iArr24[3] = (int) j130;
                long j131 = (((long) iArr22[4]) & 4294967295L) + (((long) iArr23[4]) & 4294967295L) + (j130 >>> 32);
                iArr24[4] = (int) j131;
                long j132 = (((long) iArr22[5]) & 4294967295L) + (((long) iArr23[5]) & 4294967295L) + (j131 >>> 32);
                iArr24[5] = (int) j132;
                int i895 = ((i893 | 9) << 1) - (i893 ^ 9);
                f53928b = i895 % 128;
                int i896 = i895 % 2;
                return Integer.valueOf((int) (j132 >>> 32));
            default:
                return q(objArr);
        }
    }

    public static int setLayoutAnimation(int[] iArr, int[] iArr2) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2}, -1105853010, 1105853027, (int) System.currentTimeMillis())).intValue();
    }

    public static long setNavigationOnClickListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Long) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -1651870142, 1651870144, (int) System.currentTimeMillis())).longValue();
    }

    public static BigInteger setOnFocusChangeListener(int[] iArr) {
        return (BigInteger) setDividerPadding(new Object[]{iArr}, 1614125874, -1614125856, (int) System.currentTimeMillis());
    }

    public static int setX(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -275346568, 275346590, (int) System.currentTimeMillis())).intValue();
    }

    public static void setY(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, -1280600837, 1280600841, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 955273017, -955272992, (int) System.currentTimeMillis());
    }

    public static int setLayoutAnimation(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1996833703, -1996833684, (int) System.currentTimeMillis())).intValue();
    }

    public static void setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1843135733, -1843135721, (int) System.currentTimeMillis());
    }

    public static boolean setX(int[] iArr) {
        return ((Boolean) setDividerPadding(new Object[]{iArr}, -1281041716, 1281041721, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setY(long[] jArr) {
        return ((Boolean) setDividerPadding(new Object[]{jArr}, -325316095, 325316123, (int) System.currentTimeMillis())).booleanValue();
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3, int i10) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3, Integer.valueOf(i10)}, 469762607, -469762592, i10);
    }

    public static boolean setOnFocusChangeListener(long[] jArr) {
        return ((Boolean) setDividerPadding(new Object[]{jArr}, 1694485490, -1694485484, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setX(int[] iArr, int[] iArr2) {
        return ((Boolean) setDividerPadding(new Object[]{iArr, iArr2}, 2072990853, -2072990839, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setY(int[] iArr) {
        return ((Integer) setDividerPadding(new Object[]{iArr}, -1406133537, 1406133560, (int) System.currentTimeMillis())).intValue();
    }

    public static int[] setCompoundDrawableTintBlendMode(BigInteger bigInteger) {
        return (int[]) setDividerPadding(new Object[]{bigInteger}, 1502133921, -1502133895, (int) System.currentTimeMillis());
    }

    public static boolean setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        return ((Boolean) setDividerPadding(new Object[]{iArr, iArr2}, -556949880, 556949904, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setX(long[] jArr, long[] jArr2) {
        return ((Boolean) setDividerPadding(new Object[]{jArr, jArr2}, 571587941, -571587925, (int) System.currentTimeMillis())).booleanValue();
    }

    public static long[] setY() {
        return (long[]) setDividerPadding(new Object[0], 2080461159, -2080461152, (int) System.currentTimeMillis());
    }

    public static boolean setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Boolean) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1458157136, -1458157136, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setX() {
        return (int[]) setDividerPadding(new Object[0], -59948977, 59948985, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setDividerPadding(new Object[]{jArr, jArr2}, -644509532, 644509562, (int) System.currentTimeMillis());
    }

    public static long[] setCompoundDrawableTintBlendMode() {
        return (long[]) setDividerPadding(new Object[0], -1915146282, 1915146293, (int) System.currentTimeMillis());
    }

    public static int setY(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        return ((Integer) setDividerPadding(new Object[]{iArr, Integer.valueOf(i10), iArr2, Integer.valueOf(i11), Integer.valueOf(i12)}, -1286218780, 1286218793, i10)).intValue();
    }

    public static int setY(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -162499025, 162499057, (int) System.currentTimeMillis())).intValue();
    }

    public static int setDividerPadding(int i10, int[] iArr) {
        return ((Integer) setDividerPadding(new Object[]{Integer.valueOf(i10), iArr}, 1753148396, -1753148393, i10)).intValue();
    }

    public static int setDividerPadding(long j10, int[] iArr) {
        return ((Integer) setDividerPadding(new Object[]{Long.valueOf(j10), iArr}, -1057481709, 1057481719, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setDividerPadding(int[] iArr) {
        return ((Boolean) setDividerPadding(new Object[]{iArr}, 21461862, -21461835, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setDividerPadding() {
        return (int[]) setDividerPadding(new Object[0], -2028002813, 2028002814, (int) System.currentTimeMillis());
    }

    public static int setDividerPadding(int[] iArr, int[] iArr2) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2}, -77156620, 77156651, (int) System.currentTimeMillis())).intValue();
    }

    public static int setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 2131517316, -2131517295, (int) System.currentTimeMillis())).intValue();
    }
}
