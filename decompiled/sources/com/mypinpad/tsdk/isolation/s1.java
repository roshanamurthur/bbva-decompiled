package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f58184a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f58185b = 1;

    public static /* synthetic */ Integer a(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15 = ~((~i10) | (~i11));
        int i16 = ~i12;
        if (((i10 | i11 | i12) * 220) + (((~(i16 | i11)) | i10) * (-440)) + ((i15 | (~(i16 | i10 | i11))) * 220) + (i11 * (-219)) + (i10 * 221) != 1) {
            byte[] bArr = (byte[]) objArr[0];
            int[] iArr = (int[]) objArr[1];
            int i17 = f58184a;
            int i18 = ((i17 | 75) << 1) - (i17 ^ 75);
            f58185b = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (i20 < 8) {
                int i21 = f58185b;
                int i22 = i21 & 81;
                int i23 = (i21 | 81) & (~i22);
                int i24 = i22 << 1;
                int i25 = (i23 ^ i24) + ((i23 & i24) << 1);
                f58184a = i25 % 128;
                int i26 = i25 % 2;
                int i27 = i20 << 2;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i28 = -(-(i27 * (-112)));
                int i29 = ~iCurrentTimeMillis;
                int i30 = ~i29;
                int i31 = (i30 & i29) | (i30 ^ i29);
                int i32 = ~i31;
                int i33 = (i31 | i32) & i32;
                int i34 = i27 ^ i33;
                int i35 = i33 & i27;
                int i36 = ((i35 & i34) | (i34 ^ i35)) * 226;
                int i37 = i28 & i36;
                int i38 = (i28 | i36) & (~i37);
                int i39 = -(-(i37 << 1));
                int i40 = (i38 & i39) + (i38 | i39);
                int i41 = ~i27;
                int i42 = ~i41;
                int i43 = ~((i41 ^ iCurrentTimeMillis) | (i41 & iCurrentTimeMillis));
                int i44 = i42 ^ i43;
                int i45 = i42 & i43;
                int i46 = (i45 & i44) | (i44 ^ i45);
                int i47 = iCurrentTimeMillis | i29;
                int i48 = i29 & i47;
                int i49 = ~i48;
                int i50 = (i48 & i49) | (i49 ^ i48);
                int i51 = (i41 & i50) | ((~i50) & i27);
                int i52 = i27 & i50;
                int i53 = ~((i52 & i51) | (i51 ^ i52));
                int i54 = i46 ^ i53;
                int i55 = i53 & i46;
                int i56 = (i40 - (~(-(~(((i55 & i54) | (i54 ^ i55)) * (-113)))))) - 2;
                int i57 = ~i47;
                int i58 = (i57 & (i47 | i57)) * 113;
                int i59 = (i56 ^ i58) + ((i58 & i56) << 1);
                iArr[i20] = a(new Object[]{bArr, Integer.valueOf(i59)}, 1332815424, -1332815423, i59).intValue();
                int i60 = i20 & 1;
                int i61 = ((i20 ^ 1) | i60) << 1;
                int i62 = -((i20 | 1) & (~i60));
                i20 = ((i62 & i61) << 1) + (i61 ^ i62);
                int i63 = f58184a;
                int i64 = i63 & 11;
                int i65 = (i63 | 11) & (~i64);
                int i66 = -(-(i64 << 1));
                int i67 = (i65 & i66) + (i65 | i66);
                f58185b = i67 % 128;
                int i68 = i67 % 2;
            }
            int i69 = f58185b;
            int i70 = i69 & 33;
            int i71 = (i69 ^ 33) | i70;
            int i72 = (i70 ^ i71) + ((i71 & i70) << 1);
            f58184a = i72 % 128;
            int i73 = i72 % 2;
            return null;
        }
        byte[] bArr2 = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i74 = ~iIntValue;
        int i75 = ~((-26405119) | i74);
        int i76 = -(~(-(-(((i75 & 2087874529) | (2087874529 ^ i75)) * (-865)))));
        int i77 = ((-26405119) & iIntValue) | (26405118 & i74);
        int i78 = 26405118 & iIntValue;
        int i79 = (i77 & i78) | (i77 ^ i78);
        int i80 = ~i79;
        int i81 = (((-2) - ((((1429325308 | i76) << 1) - (i76 ^ 1429325308)) ^ (-1))) - (~(-(~(((i79 | i80) & i80) * 865))))) - 2;
        int i82 = (i74 | iIntValue) & i74;
        int i83 = ~i82;
        int i84 = (2087874529 & i83) | ((-2087874530) & i82);
        int i85 = 2087874529 & i82;
        int i86 = ~((i85 & i84) | (i84 ^ i85));
        int i87 = i82 ^ 26405118;
        int i88 = 26405118 & i82;
        int i89 = (i88 & i87) | (i87 ^ i88);
        int i90 = ~i89;
        int i91 = (i89 | i90) & i90;
        int i92 = i86 & i91;
        int i93 = -(-((((i86 | i91) & (~i92)) | i92) * 865));
        int i94 = i81 & i93;
        int i95 = i94 + ((i81 ^ i93) | i94);
        int i96 = (i82 & 716481289) | (i83 & (-716481290));
        int i97 = i82 & (-716481290);
        int i98 = (i96 & i97) | (i96 ^ i97);
        int i99 = -(-((~((i98 & (-885758342)) | (i98 ^ (-885758342)))) * 52));
        int i100 = (-1814711744) & i99;
        int i101 = (i100 - (~((i99 ^ (-1814711744)) | i100))) - 1;
        int i102 = 885758341 ^ i82;
        int i103 = i82 & 885758341;
        int i104 = ~((i103 & i102) | (i102 ^ i103));
        int i105 = i104 & 171188744;
        int i106 = (i104 | 171188744) & (~i105);
        int i107 = (i106 & i105) | (i106 ^ i105);
        int i108 = (i74 ^ (-716481290)) | (i74 & (-716481290));
        int i109 = ~i108;
        int i110 = (i108 | i109) & i109;
        int i111 = (i101 - (~(((i107 & i110) | (i107 ^ i110)) * (-52)))) - 1;
        int i112 = 716481289 | i74;
        int i113 = ~i112;
        int i114 = (i112 | i113) & i113;
        int i115 = ((-340465797) & i114) | ((~i114) & 340465796);
        int i116 = i114 & 340465796;
        int i117 = ((i116 & i115) | (i115 ^ i116)) * 52;
        if (i95 > ((i111 & i117) - (~(-(-(i117 | i111))))) - 1) {
            int i118 = bArr2[iIntValue] & 14074;
            int i119 = (iIntValue | 138) << 1;
            int i120 = -((iIntValue & (-139)) | (i74 & 138));
            int i121 = ((i119 & i120) + (i120 | i119)) - 116;
            byte b10 = bArr2[i121];
            int i122 = ((((~(b10 & 15054)) & 73) | (b10 & 14982)) - (~((b10 & 72) << 1))) - 1;
            int i123 = i118 & i122;
            int i124 = (i118 | i122) & (~i123);
            int i125 = (i123 & i124) | (i124 ^ i123);
            int i126 = i121 & 165;
            int i127 = (i121 ^ 165) | i126;
            int i128 = (i126 ^ i127) + ((i126 & i127) << 1);
            int i129 = ((i128 ^ (-48)) - (~(-(-((i128 & (-48)) << 1))))) - 1;
            int i130 = (bArr2[i129] & 22149) ^ 34;
            int i131 = (i125 & i130) | (i125 ^ i130);
            int i132 = i129 & 61;
            int i133 = ((i129 | 61) & (~i132)) + (i132 << 1);
            int i134 = ((i133 | (-7)) << 1) - (i133 ^ (-7));
            int i135 = bArr2[(i134 ^ (-1)) + (i134 << 1)] << 94;
            int i136 = i131 & i135;
            int i137 = (i131 | i135) & (~i136);
            i13 = i137 ^ i136;
            i14 = i137 & i136;
        } else {
            int i138 = bArr2[iIntValue] & 255;
            int i139 = iIntValue - 63;
            int i140 = (i139 ^ 64) + ((i139 & 64) << 1);
            int i141 = (bArr2[i140] & 255) << 8;
            int i142 = i138 & i141;
            int i143 = (i141 | i138) & (~i142);
            int i144 = (i143 & i142) | (i143 ^ i142);
            int i145 = i140 & 95;
            int i146 = ((((i140 ^ 95) | i145) << 1) - (~(-((~i145) & (i140 | 95))))) - 94;
            int i147 = (i146 ^ (-1)) + (i146 << 1);
            int i148 = (bArr2[i147] & 255) << 16;
            int i149 = i144 ^ i148;
            int i150 = i144 & i148;
            int i151 = (i150 & i149) | (i149 ^ i150);
            int i152 = bArr2[(i147 & 1) + (i147 | 1)] << 24;
            int i153 = i151 ^ i152;
            int i154 = i151 & i152;
            i13 = i153 ^ i154;
            i14 = i154 & i153;
        }
        int i155 = i14 | i13;
        int i156 = f58184a;
        int i157 = (i156 | 5) << 1;
        int i158 = -(((~i156) & 5) | (i156 & (-6)));
        int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
        f58185b = i159 % 128;
        if (i159 % 2 != 0) {
            return Integer.valueOf(i155);
        }
        throw null;
    }
}
