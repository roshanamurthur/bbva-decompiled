package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.emoji2.text.flatbuffer.a;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class auz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53933a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53934b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        int[] iArr;
        int i10;
        int[] iArr2 = (int[]) objArr[0];
        int[] iArr3 = (int[]) objArr[1];
        int i11 = f53933a;
        int i12 = i11 & 61;
        int i13 = (i11 ^ 61) | i12;
        int i14 = (i12 & i13) + (i12 | i13);
        f53934b = i14 % 128;
        int i15 = i14 % 2;
        long j10 = ((long) iArr2[0]) & 4294967295L;
        int i16 = ((i11 & 105) - (~(i11 | 105))) - 1;
        f53934b = i16 % 128;
        int i17 = i16 % 2;
        int i18 = 10;
        int i19 = 0;
        int i20 = 4;
        while (true) {
            int i21 = (-2) - ((113 - ((i20 - 114) ^ (-1))) ^ (-1));
            long j11 = ((long) iArr2[i20]) & 4294967295L;
            long j12 = j11 * j11;
            int i22 = i18 & 23;
            int i23 = -(-((i18 ^ 23) | i22));
            int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
            int i25 = i24 & (-24);
            int i26 = -(-((i24 ^ (-24)) | i25));
            int i27 = (i25 & i26) + (i25 | i26);
            int i28 = i19 << 31;
            iArr = iArr2;
            int i29 = (int) (j12 >>> 33);
            iArr3[i27] = (i29 & i28) | (i28 ^ i29);
            i18 = i27 - 1;
            iArr3[i18] = (int) (j12 >>> 1);
            i10 = (int) j12;
            if (i21 <= 0) {
                break;
            }
            i19 = i10;
            i20 = i21;
            iArr2 = iArr;
        }
        int i30 = f53934b;
        int i31 = i30 & 13;
        int i32 = (i30 ^ 13) | i31;
        int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
        f53933a = i33 % 128;
        int i34 = i33 % 2;
        long j13 = j10 * j10;
        long j14 = (((long) (i10 << 31)) & 4294967295L) | (j13 >>> 33);
        iArr3[0] = (int) j13;
        int i35 = ((int) (j13 >>> 32)) & 1;
        long j15 = ((long) iArr[1]) & 4294967295L;
        long j16 = ((long) iArr3[2]) & 4294967295L;
        long j17 = (j15 * j10) + j14;
        int i36 = (int) j17;
        int i37 = i36 << 1;
        iArr3[1] = (i37 ^ i35) | (i37 & i35);
        int i38 = i36 >>> 31;
        long j18 = j16 + (j17 >>> 32);
        long j19 = ((long) iArr[2]) & 4294967295L;
        long j20 = ((long) iArr3[3]) & 4294967295L;
        long j21 = ((long) iArr3[4]) & 4294967295L;
        long j22 = (j19 * j10) + j18;
        int i39 = (int) j22;
        int i40 = i39 << 1;
        iArr3[2] = (i40 ^ i38) | (i40 & i38);
        int i41 = i39 >>> 31;
        long jA = a.a(j19, j15, j22 >>> 32, j20);
        long j23 = j21 + (jA >>> 32);
        long j24 = ((long) iArr[3]) & 4294967295L;
        long j25 = (((long) iArr3[5]) & 4294967295L) + (j23 >>> 32);
        long j26 = j23 & 4294967295L;
        long j27 = (((long) iArr3[6]) & 4294967295L) + (j25 >>> 32);
        long j28 = (j24 * j10) + (jA & 4294967295L);
        int i42 = (int) j28;
        int i43 = i42 << 1;
        int i44 = ((~i43) & i41) | ((~i41) & i43);
        int i45 = i43 & i41;
        iArr3[3] = (i44 & i45) | (i44 ^ i45);
        int i46 = i42 >>> 31;
        long jA2 = a.a(j24, j15, j28 >>> 32, j26);
        long jA3 = a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
        long j29 = j27 + (jA3 >>> 32);
        long j30 = jA3 & 4294967295L;
        long j31 = ((long) iArr[4]) & 4294967295L;
        long j32 = (((long) iArr3[7]) & 4294967295L) + (j29 >>> 32);
        long j33 = (((long) iArr3[8]) & 4294967295L) + (j32 >>> 32);
        long j34 = (j31 * j10) + (jA2 & 4294967295L);
        int i47 = (int) j34;
        int i48 = i47 << 1;
        int i49 = i48 & i46;
        int i50 = (i46 | i48) & (~i49);
        iArr3[4] = (i50 & i49) | (i50 ^ i49);
        int i51 = i47 >>> 31;
        long jA4 = a.a(j31, j15, j34 >>> 32, j30);
        long jA5 = a.a(j31, j19, jA4 >>> 32, j29 & 4294967295L);
        long jA6 = a.a(j31, j24, jA5 >>> 32, j32 & 4294967295L);
        long j35 = j33 + (jA6 >>> 32);
        int i52 = (int) jA4;
        int i53 = i52 << 1;
        int i54 = ((~i51) & i53) | ((~i53) & i51);
        int i55 = i53 & i51;
        iArr3[5] = (i55 & i54) | (i54 ^ i55);
        int i56 = i52 >>> 31;
        int i57 = (int) jA5;
        int i58 = i57 << 1;
        int i59 = i58 ^ i56;
        int i60 = i58 & i56;
        iArr3[6] = (i60 & i59) | (i59 ^ i60);
        int i61 = (int) jA6;
        iArr3[7] = (i57 >>> 31) | (i61 << 1);
        int i62 = i61 >>> 31;
        int i63 = (int) j35;
        int i64 = i63 << 1;
        iArr3[8] = (i62 & i64) | ((~i62) & i64) | ((~i64) & i62);
        int i65 = i63 >>> 31;
        int i66 = iArr3[9];
        int i67 = (int) (j35 >>> 32);
        int i68 = i66 & i67;
        int i69 = (((i66 | i67) & (~i68)) + (i68 << 1)) << 1;
        int i70 = i69 ^ i65;
        int i71 = i65 & i69;
        iArr3[9] = (i71 & i70) | (i70 ^ i71);
        int i72 = i30 + 111;
        f53933a = i72 % 128;
        if (i72 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object b(Object[] objArr) {
        int i10 = 0;
        BigInteger bigIntegerShiftRight = (BigInteger) objArr[0];
        int i11 = f53933a;
        int i12 = ((i11 & 44) + (i11 | 44)) - 1;
        f53934b = i12 % 128;
        int i13 = i12 % 2;
        if (bigIntegerShiftRight.signum() >= 0) {
            int i14 = f53933a;
            int i15 = i14 & 95;
            int i16 = (i14 | 95) & (~i15);
            int i17 = -(-(i15 << 1));
            int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
            f53934b = i18 % 128;
            int i19 = i18 % 2;
            int iBitLength = bigIntegerShiftRight.bitLength();
            if (i19 != 0 ? iBitLength <= 160 : iBitLength <= 16043) {
                int[] iArr = (int[]) setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
                int i20 = f53934b;
                int i21 = i20 & 121;
                int i22 = (i20 | 121) & (~i21);
                int i23 = i21 << 1;
                int i24 = ((i22 | i23) << 1) - (i22 ^ i23);
                f53933a = i24 % 128;
                int i25 = i24 % 2;
                while (i10 < 5) {
                    int i26 = f53933a;
                    int i27 = (i26 ^ 57) + ((i26 & 57) << 1);
                    f53934b = i27 % 128;
                    int i28 = i27 % 2;
                    iArr[i10] = bigIntegerShiftRight.intValue();
                    bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                    int i29 = (i10 ^ 71) + ((i10 & 71) << 1);
                    i10 = (i29 ^ (-70)) + ((i29 & (-70)) << 1);
                    int i30 = f53933a + 99;
                    f53934b = i30 % 128;
                    int i31 = i30 % 2;
                }
                int i32 = f53934b;
                int i33 = (i32 & 21) + (i32 | 21);
                f53933a = i33 % 128;
                if (i33 % 2 == 0) {
                    return iArr;
                }
                throw null;
            }
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53933a;
        int i11 = ~i10;
        int i12 = (i10 & (-42)) | (41 & i11);
        int i13 = (i10 & 41) << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        f53934b = i14 % 128;
        int i15 = i14 % 2;
        long j10 = ((long) iArr2[0]) & 4294967295L;
        long j11 = ((long) iArr2[1]) & 4294967295L;
        long j12 = ((long) iArr2[2]) & 4294967295L;
        long j13 = ((long) iArr2[3]) & 4294967295L;
        long j14 = ((long) iArr2[4]) & 4294967295L;
        long j15 = ((long) iArr[0]) & 4294967295L;
        long j16 = j15 * j10;
        iArr3[0] = (int) j16;
        long j17 = (j15 * j11) + (j16 >>> 32);
        iArr3[1] = (int) j17;
        long j18 = (j15 * j12) + (j17 >>> 32);
        iArr3[2] = (int) j18;
        long j19 = (j15 * j13) + (j18 >>> 32);
        iArr3[3] = (int) j19;
        long j20 = (j15 * j14) + (j19 >>> 32);
        iArr3[4] = (int) j20;
        iArr3[5] = (int) (j20 >>> 32);
        int i16 = (i10 | 69) << 1;
        int i17 = -((i10 & (-70)) | (i11 & 69));
        int i18 = (i16 & i17) + (i16 | i17);
        f53934b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 1;
        for (int i21 = 5; i20 < i21; i21 = 5) {
            int i22 = f53934b;
            int i23 = (((i22 ^ 23) | (i22 & 23)) << 1) - ((23 & (~i22)) | (i22 & (-24)));
            f53933a = i23 % 128;
            int i24 = i23 % 2;
            long j21 = ((long) iArr[i20]) & 4294967295L;
            long j22 = j14;
            long j23 = (j21 * j10) + (((long) iArr3[i20]) & 4294967295L);
            iArr3[i20] = (int) j23;
            int i25 = i20 & 1;
            long j24 = j10;
            long j25 = (j21 * j11) + (((long) iArr3[i25 + ((i20 ^ 1) | i25)]) & 4294967295L) + (j23 >>> 32);
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i26 = i20 * 382;
            int i27 = ((-380) & (~i26)) | (i26 & 379);
            int i28 = -(-(((-380) & i26) << 1));
            int i29 = (i27 & i28) + (i28 | i27);
            int i30 = ~iCurrentTimeMillis;
            int i31 = i20 & i30;
            long j26 = j11;
            int i32 = ~i20;
            int i33 = (iCurrentTimeMillis & i32) | i31;
            int i34 = iCurrentTimeMillis & i20;
            int i35 = (i33 ^ i34) | (i34 & i33);
            long j27 = j13;
            int i36 = (((i35 & (-2)) | ((~i35) & (-2)) | (i35 & 1)) * (-381)) + i29;
            int i37 = (i32 | i20) & i32;
            int i38 = (-2) ^ i37;
            int i39 = (-2) & i37;
            int i40 = ~((i38 ^ i39) | (i38 & i39));
            int i41 = ((~i30) & i20) | (i30 & i32);
            int i42 = ~((i41 & i31) | (i41 ^ i31));
            int i43 = i40 & i42;
            int i44 = (i42 | i40) & (~i43);
            int i45 = (i44 & i43) | (i44 ^ i43);
            int i46 = i20 & (-2);
            int i47 = ~(i25 | (i32 & 1) | i46);
            int i48 = ((~i47) & i45) | ((~i45) & i47);
            int i49 = i47 & i45;
            int i50 = -(-(((i49 & i48) | (i48 ^ i49)) * 381));
            int i51 = (((~i50) & i36) | ((~i36) & i50)) + ((i36 & i50) << 1);
            int i52 = (~i46) & ((-2) | i20);
            int i53 = -(~((~((i52 & i46) | (i52 ^ i46))) * 381));
            iArr3[(-2) - (((i51 ^ i53) + ((i53 & i51) << 1)) ^ (-1))] = (int) j25;
            int i54 = i20 & 2;
            long j28 = (j21 * j12) + (((long) iArr3[(((i20 ^ 2) | i54) << 1) - ((~i54) & (i20 | 2))]) & 4294967295L) + (j25 >>> 32);
            iArr3[i20 + 2] = (int) j28;
            long j29 = j28 >>> 32;
            long j30 = j21 * j27;
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i55 = -(-(i20 * (-183)));
            int i56 = (((-549) | i55) << 1) - (i55 ^ (-549));
            int i57 = ~iCurrentTimeMillis2;
            int i58 = (-4) & i57;
            long j31 = j12;
            int i59 = ((~i58) & ((-4) | i57)) | i58;
            int i60 = i59 & i20;
            int i61 = ~(((i59 | i20) & (~i60)) | i60);
            int i62 = (iCurrentTimeMillis2 | i57) & i57;
            int i63 = i37 & i62;
            int i64 = ~(i63 | ((~i63) & (i37 | i62)) | 3);
            int i65 = ((~i64) & i61) | ((~i61) & i64);
            int i66 = i61 & i64;
            int i67 = -(-(((i66 & i65) | (i65 ^ i66)) * (-184)));
            int i68 = i56 & i67;
            int i69 = i68 + ((i67 ^ i56) | i68);
            int i70 = i32 & 3;
            int i71 = ((~i32) & (-4)) | i70;
            int i72 = (-4) & i32;
            int i73 = ~((i71 & i72) | (i71 ^ i72));
            int i74 = ~((i57 ^ (-4)) | i58);
            int i75 = ((~i74) & i73) | ((~i73) & i74);
            int i76 = i73 & i74;
            int i77 = (i76 & i75) | (i75 ^ i76);
            int i78 = ~((i62 & i32) | (i32 ^ i62));
            int i79 = i77 & i78;
            int i80 = (i78 | i77) & (~i79);
            int i81 = (((i80 & i79) | (i80 ^ i79)) * 184) + i69;
            int i82 = i20 & (-4);
            int i83 = i70 | i82;
            int i84 = i20 & 3;
            int i85 = ((i83 & i84) | (i83 ^ i84)) * 184;
            int i86 = i81 & i85;
            int i87 = (i81 | i85) & (~i86);
            int i88 = i86 << 1;
            long j32 = j30 + (((long) iArr3[(i87 ^ i88) + ((i87 & i88) << 1)]) & 4294967295L) + j29;
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i89 = i20 * 561;
            int i90 = (-1677) & i89;
            int i91 = -(-(i89 | (-1677)));
            int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
            int i93 = ~iCurrentTimeMillis3;
            int i94 = ~i93;
            int i95 = (i93 & (-4)) | (i94 & 3);
            int i96 = i93 & 3;
            int i97 = -(-((~((i95 & i96) | (i95 ^ i96))) * (-560)));
            int i98 = i92 & i97;
            int i99 = i98 + ((i92 ^ i97) | i98);
            int i100 = (i37 & (-4)) | ((~i37) & 3);
            int i101 = i37 & 3;
            int i102 = (i100 & i101) | (i100 ^ i101);
            int i103 = i102 & iCurrentTimeMillis3;
            int i104 = (~(((iCurrentTimeMillis3 | i102) & (~i103)) | i103)) * (-560);
            int i105 = i99 & i104;
            int i106 = -(-((i104 ^ i99) | i105));
            int i107 = (i105 & i106) + (i106 | i105);
            int i108 = (-4) ^ i20;
            int i109 = ~((i108 & i82) | (i108 ^ i82));
            int i110 = (i93 & i20) | (i93 & i32) | (i20 & i94);
            int i111 = ~i110;
            int i112 = i107 - (~(-(-((i109 | ((i110 | i111) & i111)) * 560))));
            iArr3[(i112 ^ (-1)) + (i112 << 1)] = (int) j32;
            int i113 = ((i20 | 5) << 1) - (i20 ^ 5);
            long j33 = (j21 * j22) + (((long) iArr3[i113 - 1]) & 4294967295L) + (j32 >>> 32);
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i114 = i20 * 131;
            int i115 = (-516) & i114;
            int i116 = (i114 ^ (-516)) | i115;
            int i117 = (i115 ^ i116) + ((i116 & i115) << 1);
            int i118 = ~iCurrentTimeMillis4;
            int i119 = i37 & i118;
            int i120 = ((i118 | i37) & (~i119)) | i119;
            int i121 = (i120 & (-5)) | ((~i120) & 4);
            int i122 = i120 & 4;
            int i123 = (~((i122 & i121) | (i121 ^ i122))) * 130;
            int i124 = (i117 | i123) << 1;
            int i125 = -((i123 & (~i117)) | ((~i123) & i117));
            int i126 = (i124 & i125) + (i125 | i124);
            int i127 = i37 & 4;
            int i128 = (i37 | 4) & (~i127);
            int i129 = -(-((~((i127 & i128) | (i128 ^ i127))) * (-260)));
            int i130 = i126 ^ i129;
            int i131 = (((i129 & i126) | i130) << 1) - i130;
            int i132 = (-5) & i20;
            int i133 = ~((((-5) | i20) & (~i132)) | i132);
            int i134 = i32 & 4;
            int i135 = (~i134) & (i32 | 4);
            int i136 = (i134 & i135) | (i135 ^ i134);
            int i137 = i136 ^ iCurrentTimeMillis4;
            int i138 = iCurrentTimeMillis4 & i136;
            int i139 = ~((i138 & i137) | (i137 ^ i138));
            int i140 = i133 & i139;
            int i141 = (i139 | i133) & (~i140);
            int i142 = ((i141 & i140) | (i141 ^ i140)) * 130;
            iArr3[(i131 ^ i142) + ((i142 & i131) << 1)] = (int) j33;
            iArr3[i113] = (int) (j33 >>> 32);
            i20++;
            int i143 = f53934b;
            int i144 = i143 & 73;
            int i145 = ((((i143 ^ 73) | i144) << 1) - (~(-((i143 | 73) & (~i144))))) - 1;
            f53933a = i145 % 128;
            int i146 = i145 % 2;
            j14 = j22;
            j10 = j24;
            j11 = j26;
            j13 = j27;
            j12 = j31;
        }
        int i147 = f53934b;
        int i148 = (((i147 | 92) << 1) - (i147 ^ 92)) - 1;
        f53933a = i148 % 128;
        if (i148 % 2 != 0) {
            int i149 = 90 / 0;
        }
    }

    public static /* synthetic */ Long d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53934b;
        int i11 = ((i10 ^ 15) | (i10 & 15)) << 1;
        int i12 = -((i10 & (-16)) | ((~i10) & 15));
        int i13 = (i11 & i12) + (i11 | i12);
        f53933a = i13 % 128;
        int i14 = i13 % 2;
        long j10 = ((long) iArr[5]) & 4294967295L;
        long j11 = (j10 * 21389) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j11;
        long j12 = j11 >>> 32;
        long j13 = ((long) iArr[6]) & 4294967295L;
        long j14 = (j13 * 21389) + j10 + (((long) iArr2[1]) & 4294967295L) + j12;
        iArr3[1] = (int) j14;
        long j15 = ((long) iArr[7]) & 4294967295L;
        long j16 = (j15 * 21389) + j13 + (((long) iArr2[2]) & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j16;
        long j17 = ((long) iArr[8]) & 4294967295L;
        long j18 = (j17 * 21389) + j15 + (((long) iArr2[3]) & 4294967295L) + (j16 >>> 32);
        iArr3[3] = (int) j18;
        long j19 = ((long) iArr[9]) & 4294967295L;
        long j20 = (21389 * j19) + j17 + (4294967295L & ((long) iArr2[4])) + (j18 >>> 32);
        iArr3[4] = (int) j20;
        long j21 = (j20 >>> 32) + j19;
        int i15 = (i10 & 1) + (1 | i10);
        f53933a = i15 % 128;
        if (i15 % 2 == 0) {
            return Long.valueOf(j21);
        }
        throw null;
    }

    public static /* synthetic */ Boolean e(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53933a;
        int i11 = i10 + 93;
        int i12 = i11 % 128;
        f53934b = i12;
        int i13 = i11 % 2;
        if (iArr[0] != 1) {
            int i14 = i12 & 107;
            int i15 = (i14 - (~((i12 ^ 107) | i14))) - 1;
            f53933a = i15 % 128;
            int i16 = i15 % 2;
            int i17 = (i12 & 27) + (i12 | 27);
            f53933a = i17 % 128;
            int i18 = i17 % 2;
            return Boolean.FALSE;
        }
        int i19 = i10 & 115;
        int i20 = -(-(i10 | 115));
        int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
        f53934b = i21 % 128;
        int i22 = i21 % 2;
        int i23 = 1;
        while (i23 < 5) {
            int i24 = f53933a;
            int i25 = i24 & 105;
            int i26 = ((((i24 ^ 105) | i25) << 1) - (~(-((~i25) & (i24 | 105))))) - 1;
            int i27 = i26 % 128;
            f53934b = i27;
            if (i26 % 2 == 0) {
                int i28 = iArr[i23];
                throw null;
            }
            if (iArr[i23] != 0) {
                int i29 = i24 & 35;
                int i30 = i29 + ((i24 ^ 35) | i29);
                f53934b = i30 % 128;
                int i31 = i30 % 2;
                int i32 = (i24 ^ 27) + ((i24 & 27) << 1);
                f53934b = i32 % 128;
                int i33 = i32 % 2;
                return Boolean.FALSE;
            }
            int i34 = i23 & (-14);
            int i35 = (i23 | (-14)) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = (i35 & i36) + (i35 | i36);
            int i38 = i37 & 15;
            i23 = (i38 - (~((i37 ^ 15) | i38))) - 1;
            int i39 = i27 ^ 21;
            int i40 = (((i27 & 21) | i39) << 1) - i39;
            f53933a = i40 % 128;
            int i41 = i40 % 2;
        }
        System.currentTimeMillis();
        System.currentTimeMillis();
        return Boolean.TRUE;
    }

    public static /* synthetic */ Integer f(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53933a;
        int i11 = ((i10 & 69) - (~(-(-(i10 | 69))))) - 1;
        f53934b = i11 % 128;
        int i12 = i11 % 2;
        long j10 = (((long) iArr2[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) - (4294967295L & ((long) iArr[4]))) + (j13 >> 32);
        iArr2[4] = (int) j14;
        int i13 = (int) (j14 >> 32);
        int i14 = i10 | 93;
        int i15 = ((i14 << 1) - (~(-(i14 & (~(i10 & 93)))))) - 1;
        f53934b = i15 % 128;
        if (i15 % 2 != 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    public static /* synthetic */ Boolean g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        Boolean bool = Boolean.TRUE;
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53934b;
        int i11 = (i10 & 125) + (i10 | 125);
        f53933a = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 & 101;
        int i14 = (i10 ^ 101) | i13;
        int i15 = (i13 & i14) + (i14 | i13);
        f53933a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 4;
        while (i17 >= 0) {
            int i18 = f53934b;
            int i19 = i18 + 122;
            int i20 = (i19 ^ (-1)) + (i19 << 1);
            int i21 = i20 % 128;
            f53933a = i21;
            int i22 = i20 % 2;
            int i23 = iArr[i17];
            int i24 = i23 & Integer.MAX_VALUE;
            int i25 = (~i23) & Integer.MIN_VALUE;
            int i26 = (i25 & i24) | (i24 ^ i25);
            int i27 = iArr2[i17];
            int i28 = (Integer.MAX_VALUE & i27) | ((~i27) & Integer.MIN_VALUE);
            if (i26 < i28) {
                int i29 = i18 ^ 85;
                int i30 = ((i18 & 85) | i29) << 1;
                int i31 = -i29;
                int i32 = (i30 & i31) + (i31 | i30);
                f53933a = i32 % 128;
                return Boolean.valueOf(i32 % 2 != 0);
            }
            if (i26 > i28) {
                System.currentTimeMillis();
                System.currentTimeMillis();
                int i33 = f53933a;
                int i34 = i33 & 19;
                int i35 = ((i33 ^ 19) | i34) << 1;
                int i36 = -((i33 | 19) & (~i34));
                int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
                f53934b = i37 % 128;
                if (i37 % 2 == 0) {
                    int i38 = 93 / 0;
                }
                return bool;
            }
            int i39 = i17 & 52;
            int i40 = (i17 | 52) & (~i39);
            int i41 = -(-(i39 << 1));
            int i42 = (i40 ^ i41) + ((i40 & i41) << 1);
            int i43 = ((i42 ^ (-53)) | (i42 & (-53))) << 1;
            int i44 = -((i42 & 52) | ((~i42) & (-53)));
            i17 = ((i43 & i44) << 1) + (i43 ^ i44);
            int i45 = ((i21 ^ 77) | (i21 & 77)) << 1;
            int i46 = -(((~i21) & 77) | (i21 & (-78)));
            int i47 = (i45 & i46) + (i45 | i46);
            f53934b = i47 % 128;
            int i48 = i47 % 2;
        }
        int i49 = f53934b + 69;
        f53933a = i49 % 128;
        int i50 = i49 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Integer h(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int[] iArr = (int[]) objArr[1];
        System.currentTimeMillis();
        System.currentTimeMillis();
        long j10 = jLongValue & 4294967295L;
        long j11 = (j10 * 21389) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = jLongValue >>> 32;
        long j13 = (21389 * j12) + j10 + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
        iArr[1] = (int) j13;
        long j14 = j12 + (((long) iArr[2]) & 4294967295L) + (j13 >>> 32);
        iArr[2] = (int) j14;
        long j15 = (j14 >>> 32) + (4294967295L & ((long) iArr[3]));
        iArr[3] = (int) j15;
        if ((j15 >>> 32) == 0) {
            int i10 = f53933a + 115;
            f53934b = i10 % 128;
            return Integer.valueOf(i10 % 2 == 0 ? 1 : 0);
        }
        int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr, 0, 4}, 716282167, -716282152, 5)).intValue();
        int i11 = f53933a;
        int i12 = (((i11 ^ 75) | (i11 & 75)) << 1) - (((~i11) & 75) | (i11 & (-76)));
        f53934b = i12 % 128;
        if (i12 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        int i13 = 95 / 0;
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ Object i() {
        int i10 = f53933a;
        int i11 = ((i10 ^ 48) + ((i10 & 48) << 1)) - 1;
        f53934b = i11 % 128;
        int[] iArr = new int[i11 % 2 == 0 ? 3 : 5];
        int i12 = i10 + 101;
        f53934b = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 76 / 0;
        }
        return iArr;
    }

    public static /* synthetic */ Integer j(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53933a;
        int i11 = ((i10 & 59) - (~(-(-(i10 | 59))))) - 1;
        int i12 = i11 % 128;
        f53934b = i12;
        int i13 = i11 % 2;
        long j10 = ((long) iIntValue) & 4294967295L;
        long j11 = (21389 * j10) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = j10 + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
        iArr[1] = (int) j12;
        long j13 = (j12 >>> 32) + (4294967295L & ((long) iArr[2]));
        iArr[2] = (int) j13;
        if ((j13 >>> 32) != 0) {
            int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr, 0, 3}, 716282167, -716282152, 5)).intValue();
            int i14 = f53934b + 15;
            f53933a = i14 % 128;
            int i15 = i14 % 2;
            return Integer.valueOf(iIntValue2);
        }
        int i16 = i12 & 65;
        int i17 = (((~i16) & (i12 | 65)) - (~(i16 << 1))) - 1;
        f53933a = i17 % 128;
        int i18 = i17 % 2;
        int i19 = 557730130 & iIntValue;
        int i20 = (~i19) & (557730130 | iIntValue);
        int i21 = ~iIntValue;
        int i22 = ((i19 & i20) | (i20 ^ i19)) * 140;
        int i23 = (2080663162 | i22) << 1;
        int i24 = -(i22 ^ 2080663162);
        int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
        int i26 = i21 & 557730130;
        int i27 = (557730130 | i21) & (~i26);
        int i28 = ~((i27 & i26) | (i27 ^ i26));
        int i29 = 1279307816 & i28;
        int i30 = -(~((((i28 | 1279307816) & (~i29)) | i29) * (-280)));
        int i31 = (-2) - (((i25 & i30) + (i30 | i25)) ^ (-1));
        int i32 = i21 & 1818947640;
        int i33 = (1818947640 | i21) & (~i32);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = ((~i34) & 18090306) | ((-18090307) & i34);
        int i36 = i34 & 18090306;
        int i37 = (i36 & i35) | (i35 ^ i36);
        int i38 = (1279307816 & iIntValue) | ((-1279307817) & i21);
        int i39 = (-1279307817) & iIntValue;
        int i40 = ~((i38 & i39) | (i38 ^ i39));
        int i41 = i37 & i40;
        int i42 = (i31 - (~(-(~(-(-((((i40 | i37) & (~i41)) | i41) * 140))))))) - 2;
        int i43 = (-1042686001) & i21;
        int i44 = (~i43) & ((-1042686001) | i21);
        int i45 = ~((i43 & i44) | (i44 ^ i43));
        int i46 = (-1057478703) & iIntValue;
        int i47 = (~i46) & ((-1057478703) | iIntValue);
        int i48 = ~((i46 & i47) | (i47 ^ i46));
        int i49 = -(-(((i45 & i48) | (i45 ^ i48)) * (-370)));
        int i50 = (1772023866 & i49) + (i49 | 1772023866);
        int i51 = (i21 | iIntValue) & i21;
        int i52 = (-1057478703) ^ i51;
        int i53 = i51 & (-1057478703);
        int i54 = ~((i53 & i52) | (i52 ^ i53));
        int i55 = (-1042686001) ^ iIntValue;
        int i56 = (-1042686001) & iIntValue;
        int i57 = ~((i56 & i55) | (i55 ^ i56));
        int i58 = i54 & i57;
        int i59 = ((i57 | i54) & (~i58)) | i58;
        int i60 = i59 & (-1059584063);
        int i61 = (i59 | (-1059584063)) & (~i60);
        int i62 = -(-(((i61 & i60) | (i61 ^ i60)) * (-370)));
        int i63 = (i50 ^ i62) + ((i62 & i50) << 1);
        int i64 = i63 & (-1204079374);
        int i65 = ((i63 ^ (-1204079374)) | i64) << 1;
        int i66 = -(((-1204079374) | i63) & (~i64));
        if (i42 <= ((i65 | i66) << 1) - (i66 ^ i65)) {
            return 0;
        }
        throw null;
    }

    public static /* synthetic */ BigInteger k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53933a + 97;
        int i11 = i10 % 128;
        f53934b = i11;
        int i12 = i10 % 2;
        byte[] bArr = new byte[20];
        int i13 = (i11 & (-4)) | ((~i11) & 3);
        int i14 = -(-((i11 & 3) << 1));
        int i15 = (i13 & i14) + (i14 | i13);
        f53933a = i15 % 128;
        int i16 = i15 % 2;
        int i17 = 0;
        while (i17 < 5) {
            int i18 = f53933a;
            int i19 = i18 + 45;
            f53934b = i19 % 128;
            int i20 = i19 % 2;
            int i21 = iArr[i17];
            if (i21 != 0) {
                int i22 = ((i18 | 17) << 1) - (i18 ^ 17);
                f53934b = i22 % 128;
                int i23 = i22 % 2;
                int i24 = -(~(-i17));
                int i25 = (i24 ^ 4) + ((i24 & 4) << 1);
                ber.setDividerPadding(new Object[]{Integer.valueOf(i21), bArr, Integer.valueOf(((i25 ^ (-1)) + (i25 << 1)) << 2)}, -2092293587, 2092293591, i21);
                int i26 = (-2) - ((f53934b + 52) ^ (-1));
                f53933a = i26 % 128;
                int i27 = i26 % 2;
            }
            int i28 = ((i17 ^ 1) | (i17 & 1)) << 1;
            int i29 = -(((~i17) & 1) | (i17 & (-2)));
            i17 = ((i29 & i28) << 1) + (i28 ^ i29);
            int i30 = f53934b;
            int i31 = (i30 & 119) + (i30 | 119);
            f53933a = i31 % 128;
            int i32 = i31 % 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        int i33 = f53934b;
        int i34 = (((i33 | 56) << 1) - (i33 ^ 56)) - 1;
        f53933a = i34 % 128;
        if (i34 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    public static /* synthetic */ Boolean l(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53934b;
        int i11 = (i10 & (-92)) | ((~i10) & 91);
        int i12 = (i10 & 91) << 1;
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f53933a = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i10 & 113;
        int i16 = (i10 | 113) & (~i15);
        int i17 = i15 << 1;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        f53933a = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 0;
        while (i20 < 5) {
            int i21 = f53934b;
            int i22 = ~i21;
            int i23 = (i21 & (-118)) | (i22 & 117);
            int i24 = -(-((i21 & 117) << 1));
            int i25 = (i23 & i24) + (i23 | i24);
            int i26 = i25 % 128;
            f53933a = i26;
            int i27 = i25 % 2;
            if (iArr[i20] != 0) {
                int i28 = ((i21 & 10) + (i21 | 10)) - 1;
                f53933a = i28 % 128;
                boolean z10 = i28 % 2 != 0;
                int i29 = ((i21 & (-16)) | (i22 & 15)) + ((i21 & 15) << 1);
                f53933a = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.valueOf(z10);
            }
            int i31 = (i20 & (-2)) | ((~i20) & 1);
            int i32 = -(-((i20 & 1) << 1));
            i20 = (i32 | i31) + (i31 & i32);
            int i33 = (-2) - ((i26 + 98) ^ (-1));
            f53934b = i33 % 128;
            int i34 = i33 % 2;
        }
        int i35 = f53934b;
        int i36 = (((i35 ^ 97) | (i35 & 97)) << 1) - (((~i35) & 97) | (i35 & (-98)));
        f53933a = i36 % 128;
        if (i36 % 2 == 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Boolean m(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53933a;
        int i11 = i10 & 125;
        int i12 = ((i10 | 125) & (~i11)) + (i11 << 1);
        int i13 = i12 % 128;
        f53934b = i13;
        int i14 = i12 % 2 == 0 ? 3 : 4;
        int i15 = i13 + 56;
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        f53933a = i16 % 128;
        while (true) {
            int i17 = i16 % 2;
            if (i14 < 0) {
                int i18 = f53933a;
                int i19 = (i18 ^ 83) + ((i18 & 83) << 1);
                f53934b = i19 % 128;
                if (i19 % 2 != 0) {
                    return Boolean.TRUE;
                }
                throw null;
            }
            int i20 = f53933a;
            int i21 = i20 & 87;
            int i22 = ((i20 ^ 87) | i21) << 1;
            int i23 = -((~i21) & (i20 | 87));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            f53934b = i24 % 128;
            if (i24 % 2 == 0) {
                int i25 = iArr[i14];
                int i26 = iArr2[i14];
                throw null;
            }
            if (iArr[i14] != iArr2[i14]) {
                int i27 = i20 + 3;
                f53934b = i27 % 128;
                int i28 = i27 % 2;
                return Boolean.FALSE;
            }
            int i29 = i14 & (-3);
            int i30 = (i14 ^ (-3)) | i29;
            i14 = (i29 ^ i30) + ((i30 & i29) << 1) + 2;
            int i31 = i20 ^ 65;
            i16 = (((i20 & 65) | i31) << 1) - i31;
            f53934b = i16 % 128;
        }
    }

    public static /* synthetic */ Integer n(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53934b;
        int i11 = i10 & 73;
        int i12 = (((~i11) & (i10 | 73)) - (~(i11 << 1))) - 1;
        f53933a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = iArr[0] & 1;
        int i15 = ((i10 | 65) << 1) - (i10 ^ 65);
        f53933a = i15 % 128;
        if (i15 % 2 == 0) {
            return Integer.valueOf(i14);
        }
        throw null;
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        return ((Integer) setDividerPadding(new Object[]{Integer.valueOf(i10), iArr}, -1106364933, 1106364943, i10)).intValue();
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Integer numValueOf;
        int i13 = ~i11;
        int i14 = ~i12;
        int i15 = ~(i13 | i14);
        int i16 = ~i10;
        int i17 = ((~(i11 | i10)) * (-959)) + ((i15 | (~(i16 | i12)) | (~(i14 | i10))) * 959) + (i11 * (-958)) + (i10 * (-958));
        int i18 = (~(i13 | i12)) | (~(i16 | i14));
        int i19 = 5;
        int i20 = 2;
        switch ((((~(i10 | i12)) | i18) * 959) + i17) {
            case 1:
                return e(objArr);
            case 2:
                int i21 = f53933a + 65;
                int i22 = i21 % 128;
                f53934b = i22;
                int i23 = i21 % 2;
                int[] iArr = new int[10];
                int i24 = (i22 & 125) + (i22 | 125);
                f53933a = i24 % 128;
                int i25 = i24 % 2;
                return iArr;
            case 3:
                return n(objArr);
            case 4:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int[] iArr4 = (int[]) objArr[2];
                int i26 = f53934b;
                int i27 = ~i26;
                int i28 = (i26 & (-20)) | (i27 & 19);
                int i29 = (i26 & 19) << 1;
                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                f53933a = i30 % 128;
                int i31 = i30 % 2;
                long j10 = (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L) + (((long) iArr4[0]) & 4294967295L);
                iArr4[0] = (int) j10;
                long j11 = (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (((long) iArr4[1]) & 4294967295L) + (j10 >>> 32);
                iArr4[1] = (int) j11;
                long j12 = (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (((long) iArr4[2]) & 4294967295L) + (j11 >>> 32);
                iArr4[2] = (int) j12;
                long j13 = (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (((long) iArr4[3]) & 4294967295L) + (j12 >>> 32);
                iArr4[3] = (int) j13;
                long j14 = (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (((long) iArr4[4]) & 4294967295L) + (j13 >>> 32);
                iArr4[4] = (int) j14;
                int i32 = (int) (j14 >>> 32);
                int i33 = (i26 & (-54)) | (53 & i27);
                int i34 = -(-((i26 & 53) << 1));
                int i35 = (i33 & i34) + (i34 | i33);
                f53933a = i35 % 128;
                int i36 = i35 % 2;
                return Integer.valueOf(i32);
            case 5:
                int iIntValue = ((Number) objArr[0]).intValue();
                int[] iArr5 = (int[]) objArr[1];
                int i37 = f53933a;
                int i38 = (i37 & 55) + (i37 | 55);
                int i39 = i38 % 128;
                f53934b = i39;
                int i40 = i38 % 2;
                long j15 = ((((long) iIntValue) & 4294967295L) * 2147483649L) + (((long) iArr5[0]) & 4294967295L);
                iArr5[0] = (int) j15;
                long j16 = (j15 >>> 32) + (4294967295L & ((long) iArr5[1]));
                iArr5[1] = (int) j16;
                if ((j16 >>> 32) == 0) {
                    int i41 = i39 & 47;
                    int i42 = (i39 ^ 47) | i41;
                    int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                    f53933a = i43 % 128;
                    numValueOf = Integer.valueOf(i43 % 2 != 0 ? 1 : 0);
                } else {
                    int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{5, iArr5, 0, 2}, 716282167, -716282152, 5)).intValue();
                    int i44 = f53933a;
                    int i45 = i44 & 57;
                    int i46 = ((i44 ^ 57) | i45) << 1;
                    int i47 = -((i44 | 57) & (~i45));
                    int i48 = ((i46 | i47) << 1) - (i47 ^ i46);
                    f53934b = i48 % 128;
                    int i49 = i48 % 2;
                    numValueOf = Integer.valueOf(iIntValue2);
                }
                return numValueOf;
            case 6:
                return d(objArr);
            case 7:
                int[] iArr6 = (int[]) objArr[0];
                int[] iArr7 = (int[]) objArr[1];
                int[] iArr8 = (int[]) objArr[2];
                int i50 = f53934b;
                int i51 = (i50 ^ 123) + ((i50 & 123) << 1);
                int i52 = i51 % 128;
                f53933a = i52;
                int i53 = i51 % 2;
                long j17 = (((long) iArr6[0]) & 4294967295L) - (((long) iArr7[0]) & 4294967295L);
                iArr8[0] = (int) j17;
                long j18 = ((((long) iArr6[1]) & 4294967295L) - (((long) iArr7[1]) & 4294967295L)) + (j17 >> 32);
                iArr8[1] = (int) j18;
                long j19 = ((((long) iArr6[2]) & 4294967295L) - (((long) iArr7[2]) & 4294967295L)) + (j18 >> 32);
                iArr8[2] = (int) j19;
                long j20 = ((((long) iArr6[3]) & 4294967295L) - (((long) iArr7[3]) & 4294967295L)) + (j19 >> 32);
                iArr8[3] = (int) j20;
                long j21 = ((((long) iArr6[4]) & 4294967295L) - (((long) iArr7[4]) & 4294967295L)) + (j20 >> 32);
                iArr8[4] = (int) j21;
                int i54 = i52 & 69;
                int i55 = (i52 ^ 69) | i54;
                int i56 = ((i54 | i55) << 1) - (i55 ^ i54);
                f53934b = i56 % 128;
                int i57 = i56 % 2;
                return Integer.valueOf((int) (j21 >> 32));
            case 8:
                int[] iArr9 = (int[]) objArr[0];
                int[] iArr10 = (int[]) objArr[1];
                int[] iArr11 = (int[]) objArr[2];
                int i58 = f53933a;
                int i59 = ((i58 | 83) << 1) - (i58 ^ 83);
                f53934b = i59 % 128;
                int i60 = i59 % 2;
                long j22 = (((long) iArr9[0]) & 4294967295L) + (((long) iArr10[0]) & 4294967295L);
                iArr11[0] = (int) j22;
                long j23 = (((long) iArr9[1]) & 4294967295L) + (((long) iArr10[1]) & 4294967295L) + (j22 >>> 32);
                iArr11[1] = (int) j23;
                long j24 = (((long) iArr9[2]) & 4294967295L) + (((long) iArr10[2]) & 4294967295L) + (j23 >>> 32);
                iArr11[2] = (int) j24;
                long j25 = (((long) iArr9[3]) & 4294967295L) + (((long) iArr10[3]) & 4294967295L) + (j24 >>> 32);
                iArr11[3] = (int) j25;
                long j26 = (((long) iArr9[4]) & 4294967295L) + (((long) iArr10[4]) & 4294967295L) + (j25 >>> 32);
                iArr11[4] = (int) j26;
                int i61 = (int) (j26 >>> 32);
                int i62 = ((i58 | 20) << 1) - (i58 ^ 20);
                int i63 = (i62 ^ (-1)) + (i62 << 1);
                f53934b = i63 % 128;
                int i64 = i63 % 2;
                return Integer.valueOf(i61);
            case 9:
                return m(objArr);
            case 10:
                return j(objArr);
            case 11:
                return i();
            case 12:
                return b(objArr);
            case 13:
                return k(objArr);
            case 14:
                return h(objArr);
            case 15:
                return g(objArr);
            case 16:
                return l(objArr);
            case 17:
                return f(objArr);
            case 18:
                c(objArr);
                return null;
            case 19:
                a(objArr);
                return null;
            default:
                int[] iArr12 = (int[]) objArr[0];
                int[] iArr13 = (int[]) objArr[1];
                int[] iArr14 = (int[]) objArr[2];
                int i65 = f53934b + 97;
                int i66 = i65 % 128;
                f53933a = i66;
                int i67 = i65 % 2;
                long j27 = ((long) iArr13[0]) & 4294967295L;
                long j28 = ((long) iArr13[1]) & 4294967295L;
                long j29 = ((long) iArr13[2]) & 4294967295L;
                long j30 = ((long) iArr13[3]) & 4294967295L;
                long j31 = ((long) iArr13[4]) & 4294967295L;
                int i68 = (((i66 | 26) << 1) - (i66 ^ 26)) - 1;
                f53934b = i68 % 128;
                int i69 = i68 % 2;
                long j32 = 0;
                int i70 = 0;
                while (i70 < i19) {
                    int i71 = f53934b;
                    int i72 = i71 ^ 13;
                    int i73 = (((i72 | (i71 & 13)) << 1) - (~(-i72))) - 1;
                    f53933a = i73 % 128;
                    int i74 = i73 % i20;
                    long j33 = ((long) iArr12[i70]) & 4294967295L;
                    long j34 = (j33 * j27) + (((long) iArr14[i70]) & 4294967295L);
                    iArr14[i70] = (int) j34;
                    int i75 = ~i70;
                    int i76 = i70 & 1;
                    int[] iArr15 = iArr12;
                    long j35 = j27;
                    long j36 = (j33 * j28) + (((long) iArr14[(((i70 & (-2)) | (1 & i75)) - (~(-(-(i76 << 1))))) - 1]) & 4294967295L) + (j34 >>> 32);
                    int i77 = i70 ^ 1;
                    iArr14[(((i77 | i76) << 1) - (~(-i77))) - 1] = (int) j36;
                    long j37 = j30;
                    long j38 = (j33 * j29) + (((long) iArr14[i70 + 2]) & 4294967295L) + (j36 >>> 32);
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i78 = -(-(i70 * 421));
                    int i79 = ((((~i78) & (-838)) | (i78 & 837)) - (~(-(-((i78 & (-838)) << 1))))) - 1;
                    int i80 = ~iCurrentTimeMillis;
                    int i81 = i70 & i80;
                    int i82 = (iCurrentTimeMillis & i75) | i81;
                    int i83 = iCurrentTimeMillis & i70;
                    int i84 = -(-((~((i83 & i82) | (i82 ^ i83))) * TypedValues.CycleType.TYPE_EASING));
                    int i85 = i79 & i84;
                    int i86 = i84 | i79;
                    int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                    int i88 = i70 ^ (-3);
                    int i89 = i70 & (-3);
                    int i90 = -(-(((i88 & i89) | (i88 ^ i89)) * (-420)));
                    int i91 = ((i87 ^ i90) - (~(-(-((i90 & i87) << 1))))) - 1;
                    int i92 = ~i75;
                    int i93 = ~(((-3) & i75) | ((-3) ^ i75));
                    int i94 = ~((i80 ^ i70) | i81);
                    int i95 = ((i94 & i93) | (i93 ^ i94)) * TypedValues.CycleType.TYPE_EASING;
                    int i96 = i91 & i95;
                    iArr14[(i96 - (~(-(-((i95 ^ i91) | i96))))) - 1] = (int) j38;
                    int i97 = i70 & 3;
                    int i98 = (i70 ^ 3) | i97;
                    long j39 = j28;
                    long j40 = (j33 * j37) + (((long) iArr14[(i97 - (~i98)) - 1]) & 4294967295L) + (j38 >>> 32);
                    iArr14[i97 + i98] = (int) j40;
                    int i99 = i70 & 4;
                    long j41 = (j33 * j31) + (((long) iArr14[((~i99) & (i70 | 4)) + (i99 << 1)]) & 4294967295L) + (j40 >>> 32);
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i100 = 2855 - (~(-(-(i70 * (-712)))));
                    int i101 = ~iCurrentTimeMillis2;
                    int i102 = ~(((-5) ^ i101) | ((-5) & i101));
                    int i103 = (-5) & i70;
                    int i104 = (~i103) & ((-5) | i70);
                    int i105 = ~((i104 & i103) | (i104 ^ i103));
                    int i106 = (i105 & i102) | (i102 ^ i105);
                    int i107 = (i75 & (-5)) | (i92 & 4);
                    int i108 = i75 & 4;
                    int i109 = (i107 & i108) | (i107 ^ i108);
                    int i110 = i109 ^ iCurrentTimeMillis2;
                    int i111 = i109 & iCurrentTimeMillis2;
                    int i112 = ~((i110 ^ i111) | (i110 & i111));
                    int i113 = ((i106 ^ i112) | (i106 & i112)) * (-713);
                    int i114 = i100 & i113;
                    int i115 = -(-((i113 ^ i100) | i114));
                    int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                    int i117 = (i109 & i101) | (iCurrentTimeMillis2 & (~i109));
                    int i118 = -(-((~((i117 & i111) | (i117 ^ i111))) * 1426));
                    int i119 = (i116 & i118) + (i118 | i116);
                    int i120 = (~((i75 ^ i101) | (i75 & i101))) * 713;
                    iArr14[((i119 | i120) << 1) - (i120 ^ i119)] = (int) j41;
                    int i121 = i70 ^ 5;
                    int i122 = i70 & 5;
                    long j42 = (j41 >>> 32) + (((long) iArr14[((i121 | i122) << 1) - i121]) & 4294967295L) + j32;
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i123 = i70 * (-195);
                    int i124 = (-1955) & i123;
                    int i125 = (i123 ^ (-1955)) | i124;
                    int i126 = ((i124 | i125) << 1) - (i125 ^ i124);
                    int i127 = (i92 & 5) | (i75 & (-6));
                    int i128 = i75 & 5;
                    int i129 = (i127 & i128) | (i127 ^ i128);
                    int i130 = ~i129;
                    int i131 = (i129 | i130) & i130;
                    int i132 = ~((iCurrentTimeMillis3 & i70) | (i70 ^ iCurrentTimeMillis3));
                    int i133 = i131 & i132;
                    int i134 = (i131 | i132) & (~i133);
                    int i135 = ((i134 & i133) | (i134 ^ i133)) * (-196);
                    int i136 = i126 ^ i135;
                    int i137 = ((i135 & i126) | i136) << 1;
                    int i138 = -i136;
                    int i139 = (i137 & i138) + (i137 | i138);
                    int i140 = (~i122) & (i70 | 5);
                    int i141 = -(-(((i140 & i122) | (i140 ^ i122)) * 392));
                    int i142 = i139 & i141;
                    int i143 = i141 | i139;
                    int i144 = ((i142 | i143) << 1) - (i143 ^ i142);
                    int i145 = (i75 | i70) & i75;
                    int i146 = (-6) ^ i145;
                    int i147 = i145 & (-6);
                    int i148 = (i147 & i146) | (i146 ^ i147);
                    int i149 = ~i148;
                    int i150 = (i148 | i149) & i149;
                    int i151 = ((~i132) & i150) | ((~i150) & i132);
                    int i152 = i150 & i132;
                    int i153 = -(-(((i152 & i151) | (i151 ^ i152)) * 196));
                    int i154 = i144 & i153;
                    int i155 = -(-((i153 ^ i144) | i154));
                    iArr14[(i154 & i155) + (i155 | i154)] = (int) j42;
                    j32 = j42 >>> 32;
                    i70++;
                    int i156 = f53933a;
                    int i157 = ((((i156 ^ 13) | (i156 & 13)) << 1) - (~(-((13 & (~i156)) | (i156 & (-14)))))) - 1;
                    f53934b = i157 % 128;
                    int i158 = i157 % 2;
                    j30 = j37;
                    iArr12 = iArr15;
                    j27 = j35;
                    j28 = j39;
                    i19 = 5;
                    i20 = 2;
                }
                int i159 = f53933a;
                int i160 = i159 & 53;
                int i161 = (i160 - (~(-(-((i159 ^ 53) | i160))))) - 1;
                f53934b = i161 % 128;
                int i162 = i161 % 2;
                return Integer.valueOf((int) j32);
        }
    }

    public static BigInteger setOnFocusChangeListener(int[] iArr) {
        return (BigInteger) setDividerPadding(new Object[]{iArr}, -1221353937, 1221353950, (int) System.currentTimeMillis());
    }

    public static int setOnLongClickListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1886561196, -1886561189, (int) System.currentTimeMillis())).intValue();
    }

    public static int setX(int[] iArr, int[] iArr2) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2}, 633520833, -633520816, (int) System.currentTimeMillis())).intValue();
    }

    public static int setY(long j10, int[] iArr) {
        return ((Integer) setDividerPadding(new Object[]{Long.valueOf(j10), iArr}, 351918219, -351918205, (int) System.currentTimeMillis())).intValue();
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        setDividerPadding(new Object[]{iArr, iArr2, iArr3}, -751690120, 751690138, (int) System.currentTimeMillis());
    }

    public static int setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1240095778, -1240095774, (int) System.currentTimeMillis())).intValue();
    }

    public static int setX(int i10, int[] iArr) {
        return ((Integer) setDividerPadding(new Object[]{Integer.valueOf(i10), iArr}, -1617472533, 1617472538, i10)).intValue();
    }

    public static int setY(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 1133382827, -1133382827, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setCompoundDrawableTintBlendMode(int[] iArr) {
        return ((Boolean) setDividerPadding(new Object[]{iArr}, 1960671435, -1960671419, (int) System.currentTimeMillis())).booleanValue();
    }

    public static long setX(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Long) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 798398559, -798398553, (int) System.currentTimeMillis())).longValue();
    }

    public static boolean setY(int[] iArr, int[] iArr2) {
        return ((Boolean) setDividerPadding(new Object[]{iArr, iArr2}, 705102965, -705102950, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        return ((Boolean) setDividerPadding(new Object[]{iArr, iArr2}, -1508801311, 1508801320, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setX() {
        return (int[]) setDividerPadding(new Object[0], -733151149, 733151160, (int) System.currentTimeMillis());
    }

    public static int setY(int[] iArr) {
        return ((Integer) setDividerPadding(new Object[]{iArr}, 1594439211, -1594439208, (int) System.currentTimeMillis())).intValue();
    }

    public static int[] setY(BigInteger bigInteger) {
        return (int[]) setDividerPadding(new Object[]{bigInteger}, -951902132, 951902144, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(int[] iArr, int[] iArr2) {
        setDividerPadding(new Object[]{iArr, iArr2}, 1612100803, -1612100784, (int) System.currentTimeMillis());
    }

    public static boolean setDividerPadding(int[] iArr) {
        return ((Boolean) setDividerPadding(new Object[]{iArr}, -1357517306, 1357517307, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setDividerPadding() {
        return (int[]) setDividerPadding(new Object[0], -529696917, 529696919, (int) System.currentTimeMillis());
    }

    public static int setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setDividerPadding(new Object[]{iArr, iArr2, iArr3}, 140455191, -140455183, (int) System.currentTimeMillis())).intValue();
    }
}
