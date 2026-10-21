package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: loaded from: classes10.dex */
public abstract class amu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53268a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53269b = 1;

    public static /* synthetic */ void a(Object[] objArr) {
        int i10 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int i11 = 1;
        byte[] bArr2 = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        byte[] bArr3 = (byte[]) objArr[3];
        int iIntValue2 = ((Number) objArr[4]).intValue();
        int i12 = f53269b;
        int i13 = (i12 ^ 99) + ((i12 & 99) << 1);
        int i14 = i13 % 128;
        f53268a = i14;
        int i15 = i13 % 2;
        int i16 = ((i14 & 22) + (i14 | 22)) - 1;
        f53269b = i16 % 128;
        int i17 = i16 % 2;
        while (true) {
            int i18 = i10 * 471;
            int i19 = -(-(iIntValue2 * 471));
            int i20 = i18 & i19;
            int i21 = ((i18 ^ i19) | i20) << i11;
            int i22 = -((i18 | i19) & (~i20));
            int i23 = ((i21 | i22) << i11) - (i22 ^ i21);
            int i24 = ~iIntValue2;
            int i25 = i10 & i24;
            int i26 = ~i10;
            int i27 = -(-(((iIntValue2 & i26) | i25 | (i10 & iIntValue2)) * (-470)));
            int i28 = i23 & i27;
            int i29 = ((i23 | i27) & (~i28)) + (i28 << 1);
            int i30 = (i24 | iIntValue2) & i24;
            int i31 = (i26 ^ i30) | (i26 & i30);
            int i32 = ~i31;
            int i33 = (i31 | i32) & i32;
            int i34 = i30 ^ iIntValue;
            int i35 = ~iIntValue;
            int i36 = i30 & iIntValue;
            int i37 = ~((i34 ^ i36) | (i34 & i36));
            int i38 = i33 & i37;
            int i39 = (~i38) & (i33 | i37);
            int i40 = (i39 & i38) | (i39 ^ i38);
            int i41 = ~i35;
            int i42 = (i35 & i26) | (i10 & i41) | (i35 & i10);
            int i43 = i42 & iIntValue2;
            int i44 = (i42 | iIntValue2) & (~i43);
            int i45 = ~((i44 & i43) | (i44 ^ i43));
            int i46 = i40 & i45;
            int i47 = (i40 | i45) & (~i46);
            int i48 = -(-(((i47 & i46) | (i47 ^ i46)) * (-470)));
            int i49 = ((((i29 ^ i48) | (i29 & i48)) << 1) - (~(-((i48 & (~i29)) | ((~i48) & i29))))) - 1;
            int i50 = (i24 ^ i10) | i25;
            int i51 = (i50 & i35) | ((~i50) & iIntValue);
            int i52 = i50 & iIntValue;
            int i53 = ~((i52 & i51) | (i51 ^ i52));
            int i54 = i35 | iIntValue;
            int i55 = i35 & i54;
            int i56 = (i55 & i26) | ((~i55) & i10);
            int i57 = i55 & i10;
            int i58 = (i56 ^ i57) | (i56 & i57);
            int i59 = (i58 & iIntValue2) | (i58 ^ iIntValue2);
            int i60 = ~i59;
            int i61 = (i59 | i60) & i60;
            int i62 = i53 & i61;
            int i63 = -(-((((i53 | i61) & (~i62)) | i62) * 470));
            int i64 = ((i49 & i63) - (~(-(-(i63 | i49))))) - 1;
            byte b10 = bArr[i10];
            int i65 = -(-i10);
            int i66 = iIntValue & i65;
            byte b11 = bArr2[(i66 - (~((i65 ^ iIntValue) | i66))) - 1];
            int i67 = (~b11) & b10;
            int i68 = b11 & (~b10);
            bArr3[i64] = (byte) ((i68 & i67) | (i67 ^ i68));
            int i69 = (((i10 ^ (-104)) | (i10 & (-104))) << 1) - ((i10 & 103) | (i26 & (-104)));
            int i70 = (i69 ^ 105) + ((i69 & 105) << 1);
            int i71 = -(-i70);
            int i72 = (iIntValue2 & i71) + (i71 | iIntValue2);
            byte b12 = bArr[i70];
            int i73 = i70 * 615;
            int i74 = -(-(iIntValue * (-613)));
            int i75 = i73 & i74;
            int i76 = (i73 ^ i74) | i75;
            int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
            int i78 = ~i70;
            int i79 = (i78 | i70) & i78;
            int i80 = i79 & i35;
            int i81 = ~i79;
            int i82 = i80 | (iIntValue & i81);
            int i83 = i79 & iIntValue;
            int i84 = i82 ^ i83;
            int i85 = i82 & i83;
            byte[] bArr4 = bArr;
            int i86 = i84 | i85;
            int i87 = iIntValue2;
            int i88 = ~i86;
            int i89 = ((i86 | i88) & i88) | iIntValue;
            int i90 = (i35 ^ i70) | (i35 & i70);
            int i91 = ~i90;
            int i92 = -(-(((i89 ^ i91) | (i91 & i89)) * 614));
            int i93 = (i77 ^ i92) + ((i92 & i77) << 1);
            int i94 = i79 ^ i55;
            int i95 = i79 & i55;
            int i96 = ~((i94 ^ i95) | (i94 & i95));
            int i97 = i78 ^ iIntValue;
            int i98 = i78 & iIntValue;
            int i99 = i96 | (~((i97 ^ i98) | (i98 & i97)));
            int i100 = i35 & iIntValue;
            int i101 = ~((i35 ^ iIntValue) | i100);
            int i102 = ~i101;
            int i103 = (i99 & i102) | ((~i99) & i101);
            int i104 = i99 & i101;
            int i105 = ((i103 ^ i104) | (i104 & i103)) * (-1228);
            int i106 = i93 & i105;
            int i107 = i106 + ((i105 ^ i93) | i106);
            int i108 = (i79 & i41) | (i35 & i81);
            int i109 = (i108 & i80) | (i108 ^ i80);
            int i110 = i109 ^ i35;
            int i111 = i109 & i35;
            int i112 = -(-(((~((i111 & i110) | (i110 ^ i111))) | (~(i90 | iIntValue))) * 614));
            int i113 = i107 & i112;
            byte b13 = bArr2[i113 + ((i112 ^ i107) | i113)];
            int i114 = b12 & b13;
            bArr3[i72] = (byte) (((b13 ^ b12) | i114) & (~i114));
            int i115 = i70 & 1;
            int i116 = (((~i115) & (i70 | 1)) - (~(-(-(i115 << 1))))) - 1;
            byte b14 = bArr4[i116];
            int i117 = i116 * 765;
            int i118 = iIntValue * (-1527);
            int i119 = i117 & i118;
            int i120 = (i119 - (~(-(-((i117 ^ i118) | i119))))) - 1;
            int i121 = i55 ^ i116;
            int i122 = i55 & i116;
            int i123 = ~((i121 ^ i122) | (i121 & i122));
            int i124 = -(~(((i123 & iIntValue) | (iIntValue ^ i123)) * 764));
            int i125 = ((i120 & i124) + (i120 | i124)) - 1;
            int i126 = ~i116;
            int i127 = i126 & i35;
            int i128 = ((~i126) & iIntValue) | i127;
            int i129 = i126 & iIntValue;
            int i130 = ~((i128 ^ i129) | (i128 & i129));
            int i131 = (i130 & i102) | ((~i130) & i101);
            int i132 = i101 & i130;
            int i133 = -(-(((i131 & i132) | (i131 ^ i132)) * (-1528)));
            int i134 = ((i125 ^ i133) | (i125 & i133)) << 1;
            int i135 = -((i133 & (~i125)) | ((~i133) & i125));
            int i136 = (i134 ^ i135) + ((i135 & i134) << 1);
            int i137 = i126 ^ iIntValue;
            int i138 = ~((i137 & i129) | (i137 ^ i129));
            int i139 = i121 | i122;
            int i140 = ~i139;
            int i141 = i138 | ((i139 | i140) & i140);
            int i142 = (i116 & i41) | i127;
            int i143 = i35 & i116;
            int i144 = (i142 & i143) | (i142 ^ i143);
            int i145 = ~i144;
            int i146 = (i144 | i145) & i145;
            int i147 = ((~i146) & i141) | ((~i141) & i146);
            int i148 = i141 & i146;
            int i149 = ((i148 & i147) | (i147 ^ i148)) * 764;
            int i150 = ((i136 ^ i149) | (i136 & i149)) << 1;
            int i151 = -((i149 & (~i136)) | ((~i149) & i136));
            byte b15 = bArr2[((i150 | i151) << 1) - (i151 ^ i150)];
            int i152 = (~b15) & b14;
            int i153 = b15 & (~b14);
            bArr3[((i87 | i116) << 1) - (i87 ^ i116)] = (byte) ((i153 & i152) | (i152 ^ i153));
            int i154 = ((i116 | 1) << 1) - (i116 ^ 1);
            int i155 = (-2) - ((((i154 * (-300)) - (~(-(~(-(-(i87 * 302))))))) - 1) ^ (-1));
            int i156 = ~i154;
            int i157 = (i154 & i24) | (i87 & i156) | (i154 & i87);
            int i158 = i157 & iIntValue;
            int i159 = (i157 | iIntValue) & (~i158);
            int i160 = -(-((~((i159 & i158) | (i159 ^ i158))) * (-301)));
            int i161 = (i155 ^ i160) + ((i155 & i160) << 1);
            int i162 = i24 & iIntValue;
            int i163 = (~i162) & (i24 | iIntValue);
            int i164 = ~((i162 & i163) | (i163 ^ i162));
            int i165 = i35 & i156;
            int i166 = (i154 & i41) | i165;
            int i167 = i35 & i154;
            int i168 = (i166 & i167) | (i166 ^ i167);
            int i169 = ~i168;
            int i170 = -(-(((i164 & i169) | (i164 ^ i169)) * (-301)));
            int i171 = i161 & i170;
            int i172 = ((i161 ^ i170) | i171) << 1;
            int i173 = -((i170 | i161) & (~i171));
            int i174 = ((i172 | i173) << 1) - (i173 ^ i172);
            int i175 = ~(i156 | iIntValue);
            int i176 = -(-(((i30 & i175) | (i30 ^ i175)) * 301));
            int i177 = i174 & i176;
            int i178 = i176 | i174;
            int i179 = (i177 & i178) + (i178 | i177);
            byte b16 = bArr4[i154];
            int i180 = (iIntValue * 471) + (i154 * 471);
            int i181 = i154 & iIntValue;
            int i182 = (~i181) & (i154 | iIntValue);
            int i183 = ((i181 & i182) | (i182 ^ i181)) * (-470);
            int i184 = i180 & i183;
            int i185 = -(-(i183 | i180));
            int i186 = (i184 & i185) + (i185 | i184);
            int i187 = i156 ^ i35;
            int i188 = ~((i165 & i187) | (i187 ^ i165));
            int i189 = (~i100) & i54;
            int i190 = ~((i100 & i189) | (i189 ^ i100));
            int i191 = i188 & i190;
            int i192 = (i188 | i190) & (~i191);
            int i193 = (i192 & i191) | (i192 ^ i191);
            int i194 = (~i167) & (i35 | i154);
            int i195 = (i194 & i167) | (i194 ^ i167) | iIntValue;
            int i196 = ~i195;
            int i197 = (i195 | i196) & i196;
            int i198 = i193 & i197;
            int i199 = (i193 | i197) & (~i198);
            int i200 = -(-(((i199 & i198) | (i199 ^ i198)) * (-470)));
            int i201 = (i186 & i200) + (i200 | i186);
            int i202 = (i168 ^ iIntValue) | (i168 & iIntValue);
            int i203 = ~i202;
            int i204 = (i202 | i203) & i203;
            int i205 = (~i204) & i204;
            int i206 = i205 | i205;
            int i207 = i204 & i204;
            int i208 = -(-(((i207 & i206) | (i206 ^ i207)) * 470));
            int i209 = i201 & i208;
            int i210 = (i208 ^ i201) | i209;
            bArr3[i179] = (byte) (b16 ^ bArr2[(i209 ^ i210) + ((i210 & i209) << 1)]);
            i10 = i154 + 1;
            if (i10 >= 16) {
                break;
            }
            iIntValue2 = i87;
            bArr = bArr4;
            i11 = 1;
        }
        int i211 = f53268a;
        int i212 = i211 & 39;
        int i213 = -(-((i211 ^ 39) | i212));
        int i214 = ((i212 | i213) << 1) - (i213 ^ i212);
        f53269b = i214 % 128;
        if (i214 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        System.currentTimeMillis();
        System.currentTimeMillis();
        long[] jArr3 = new long[4];
        auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[0]), jArr3, 0}, 391891282, -391891281, 0);
        auu.setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jArr[1]), jArr3, 2}, 391891282, -391891281, 2);
        long j10 = jArr3[0];
        long j11 = jArr3[1];
        long j12 = jArr3[2];
        long j13 = jArr3[3];
        long j14 = ((((j13 >>> 1) ^ j13) ^ (j13 >>> 2)) ^ (j13 >>> 7)) ^ j11;
        long j15 = (((j13 << 63) ^ (j13 << 62)) ^ (j13 << 57)) ^ j12;
        jArr2[0] = j10 ^ ((((j15 >>> 1) ^ j15) ^ (j15 >>> 2)) ^ (j15 >>> 7));
        jArr2[1] = j14 ^ ((j15 << 57) ^ ((j15 << 63) ^ (j15 << 62)));
        int i10 = f53268a;
        int i11 = ((i10 & (-76)) | ((~i10) & 75)) + ((i10 & 75) << 1);
        f53269b = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object c() {
        System.currentTimeMillis();
        System.currentTimeMillis();
        long[] jArr = {Long.MIN_VALUE, 0};
        int i10 = f53269b;
        int i11 = (((i10 ^ 101) | (i10 & 101)) << 1) - (((~i10) & 101) | (i10 & (-102)));
        f53268a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 50 / 0;
        }
        return jArr;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53269b + 67;
        f53268a = i10 % 128;
        int i11 = i10 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = jArr2[0];
        long j13 = jArr2[1];
        long jLongValue = ((Long) bes.setDividerPadding(new Object[]{Long.valueOf(j10)}, -826172331, 826172331, (int) System.currentTimeMillis())).longValue();
        long jLongValue2 = ((Long) bes.setDividerPadding(new Object[]{Long.valueOf(j11)}, -826172331, 826172331, (int) System.currentTimeMillis())).longValue();
        long jLongValue3 = ((Long) bes.setDividerPadding(new Object[]{Long.valueOf(j12)}, -826172331, 826172331, (int) System.currentTimeMillis())).longValue();
        long jLongValue4 = ((Long) bes.setDividerPadding(new Object[]{Long.valueOf(j13)}, -826172331, 826172331, (int) System.currentTimeMillis())).longValue();
        long jLongValue5 = ((Long) bes.setDividerPadding(new Object[]{Long.valueOf(((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jLongValue), Long.valueOf(jLongValue3)}, 337162203, -337162203, (int) System.currentTimeMillis())).longValue())}, -826172331, 826172331, (int) System.currentTimeMillis())).longValue();
        long jLongValue6 = ((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(j10), Long.valueOf(j12)}, 337162203, -337162203, (int) System.currentTimeMillis())).longValue() << 1;
        long jLongValue7 = ((Long) bes.setDividerPadding(new Object[]{Long.valueOf(((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jLongValue2), Long.valueOf(jLongValue4)}, 337162203, -337162203, (int) System.currentTimeMillis())).longValue())}, -826172331, 826172331, (int) System.currentTimeMillis())).longValue();
        long jLongValue8 = ((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(j11), Long.valueOf(j13)}, 337162203, -337162203, (int) System.currentTimeMillis())).longValue();
        long j14 = jLongValue8 << 1;
        long jLongValue9 = ((Long) bes.setDividerPadding(new Object[]{Long.valueOf(((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(jLongValue ^ jLongValue2), Long.valueOf(jLongValue3 ^ jLongValue4)}, 337162203, -337162203, (int) System.currentTimeMillis())).longValue())}, -826172331, 826172331, (int) System.currentTimeMillis())).longValue();
        long jLongValue10 = ((((Long) setCompoundDrawableTintBlendMode(new Object[]{Long.valueOf(j10 ^ j11), Long.valueOf(j12 ^ j13)}, 337162203, -337162203, (int) System.currentTimeMillis())).longValue() << 1) ^ ((jLongValue7 ^ jLongValue6) ^ j14)) ^ ((jLongValue8 << 63) ^ (jLongValue8 << 58));
        jArr[0] = jLongValue5 ^ ((jLongValue10 >>> 7) ^ (((jLongValue10 >>> 1) ^ jLongValue10) ^ (jLongValue10 >>> 2)));
        jArr[1] = ((((j14 ^ (j14 >>> 1)) ^ (j14 >>> 2)) ^ (j14 >>> 7)) ^ (jLongValue9 ^ ((jLongValue6 ^ jLongValue5) ^ jLongValue7))) ^ ((jLongValue10 << 57) ^ ((jLongValue10 << 63) ^ (jLongValue10 << 62)));
        int i12 = f53268a + 113;
        f53269b = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        ((Number) objArr[1]).intValue();
        byte[] bArr2 = (byte[]) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i10 = f53269b;
        int i11 = (((i10 ^ 119) | (i10 & 119)) << 1) - ((i10 & (-120)) | ((~i10) & 119));
        f53268a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 82 / 0;
        }
        int i13 = i10 & 19;
        int i14 = (i13 - (~(-(-((i10 ^ 19) | i13))))) - 1;
        f53268a = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            iIntValue = ((iIntValue & 115) + (iIntValue | 115)) - 116;
            if (iIntValue < 0) {
                break;
            }
            int i16 = f53269b;
            int i17 = (-2) - (((i16 & 26) + (i16 | 26)) ^ (-1));
            f53268a = i17 % 128;
            int i18 = i17 % 2;
            int i19 = ((iIntValue ^ 1) + ((iIntValue & 1) << 1)) - 1;
            byte b10 = bArr[i19];
            byte b11 = bArr2[iIntValue];
            int i20 = (~b11) & b10;
            int i21 = (~b10) & b11;
            bArr[i19] = (byte) ((i21 & i20) | (i20 ^ i21));
            int i22 = ((i16 | 87) << 1) - (i16 ^ 87);
            f53268a = i22 % 128;
            int i23 = i22 % 2;
        }
        int i24 = (-2) - ((f53269b + 118) ^ (-1));
        f53268a = i24 % 128;
        if (i24 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void f(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i10 = f53269b;
        int i11 = i10 + 93;
        f53268a = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 75 / 0;
        }
        int i13 = ((i10 & (-84)) | ((~i10) & 83)) + ((i10 & 83) << 1);
        f53268a = i13 % 128;
        int i14 = i13 % 2;
        while (true) {
            int i15 = -(-((~iIntValue2) | iIntValue2));
            iIntValue2 = (iIntValue2 | i15) + (iIntValue2 & i15);
            if (iIntValue2 < 0) {
                break;
            }
            int i16 = f53269b;
            int i17 = ((i16 | 83) << 1) - (i16 ^ 83);
            int i18 = i17 % 128;
            f53268a = i18;
            int i19 = i17 % 2;
            byte b10 = bArr[iIntValue2];
            int i20 = iIntValue2 * (-947);
            int i21 = -(~(-(-(iIntValue * 949))));
            int i22 = (((i20 | i21) << 1) - (i20 ^ i21)) - 1;
            int i23 = ~iIntValue2;
            int i24 = ~iIntValue;
            int i25 = (i24 | iIntValue) & i24;
            int i26 = i25 ^ iIntValue;
            int i27 = i25 & iIntValue;
            int i28 = ~((i27 & i26) | (i26 ^ i27));
            int i29 = (i22 - (~(-(-(((i28 & i23) | (i23 ^ i28)) * (-948)))))) - 1;
            int i30 = ~i24;
            int i31 = (i23 & i30) | ((~i23) & i24);
            int i32 = i23 & i24;
            int i33 = (i32 & i31) | (i31 ^ i32);
            int i34 = (i30 & i33) | ((~i33) & i24);
            int i35 = i33 & i24;
            bArr[iIntValue2] = (byte) (b10 ^ bArr2[(((i29 - (~(-(~(-(-((~((i35 & i34) | (i34 ^ i35))) * (-948)))))))) - 2) - (~(-(-(((iIntValue2 ^ i24) | (i24 & iIntValue2)) * 948))))) - 1]);
            int i36 = i18 & 15;
            int i37 = (i18 | 15) & (~i36);
            int i38 = -(-(i36 << 1));
            int i39 = (i37 ^ i38) + ((i37 & i38) << 1);
            f53269b = i39 % 128;
            int i40 = i39 % 2;
        }
        int i41 = f53269b + 53;
        f53268a = i41 % 128;
        if (i41 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53269b;
        int i11 = i10 & 85;
        int i12 = (((i10 ^ 85) | i11) << 1) - ((~i11) & (i10 | 85));
        f53268a = i12 % 128;
        int i13 = i12 % 2;
        long j10 = jArr[0];
        long j11 = jArr[1];
        long j12 = j11 << 57;
        jArr2[0] = (j12 >>> 7) ^ ((((j10 >>> 7) ^ j12) ^ (j12 >>> 1)) ^ (j12 >>> 2));
        jArr2[1] = (j10 << 57) | (j11 >>> 7);
        int i14 = i10 & 55;
        int i15 = i14 + ((i10 ^ 55) | i14);
        f53268a = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void h(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53269b;
        int i11 = i10 & 7;
        int i12 = i10 | 7;
        int i13 = (i11 & i12) + (i11 | i12);
        f53268a = i13 % 128;
        if (i13 % 2 != 0) {
            jArr2[1] = jArr[1];
            jArr2[1] = jArr[0];
        } else {
            jArr2[0] = jArr[0];
            jArr2[1] = jArr[1];
        }
        int i14 = i10 & 99;
        int i15 = ((i10 ^ 99) | i14) << 1;
        int i16 = -((~i14) & (i10 | 99));
        int i17 = (i15 & i16) + (i15 | i16);
        f53268a = i17 % 128;
        if (i17 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void i(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        byte[] bArr2 = (byte[]) objArr[1];
        int i10 = f53269b;
        int i11 = i10 & 55;
        int i12 = i11 + ((i10 ^ 55) | i11);
        f53268a = i12 % 128;
        int i13 = i12 % 2 != 0 ? 1 : 0;
        while (i13 < 16) {
            int i14 = f53268a;
            int i15 = ((i14 | 25) << 1) - (i14 ^ 25);
            f53269b = i15 % 128;
            int i16 = i15 % 2;
            bArr2[i13] = bArr[i13];
            int i17 = i13 & 33;
            int i18 = (i13 | 33) & (~i17);
            int i19 = -(-(i17 << 1));
            i13 = ((i18 ^ i19) + ((i18 & i19) << 1)) - 32;
            int i20 = i14 + 109;
            f53269b = i20 % 128;
            int i21 = i20 % 2;
        }
        int i22 = f53268a;
        int i23 = (i22 ^ 43) + ((i22 & 43) << 1);
        f53269b = i23 % 128;
        if (i23 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        long[] jArr;
        int i13 = ~((~i10) | (~i11));
        int i14 = i10 | i11;
        int i15 = 0;
        int i16 = 2;
        switch (((i14 | (~i12)) * 756) + (((~(i14 | i12)) | i13) * (-756)) + (i13 * 1512) + (i11 * (-755)) + (i10 * (-755))) {
            case 1:
                byte[] bArr = (byte[]) objArr[0];
                byte[] bArr2 = (byte[]) objArr[1];
                int i17 = f53269b;
                int i18 = (i17 & (-104)) | ((~i17) & 103);
                int i19 = -(-((103 & i17) << 1));
                int i20 = (i18 & i19) + (i19 | i18);
                int i21 = i20 % 128;
                f53268a = i21;
                int i22 = i20 % 2;
                int i23 = i21 & 99;
                int i24 = ((i21 | 99) & (~i23)) + (i23 << 1);
                f53269b = i24 % 128;
                int i25 = i24 % 2;
                int i26 = 0;
                while (i15 < 16) {
                    int i27 = f53269b;
                    int i28 = i27 & 119;
                    int i29 = -(-(i27 | 119));
                    int i30 = (i28 & i29) + (i29 | i28);
                    int i31 = i30 % 128;
                    f53268a = i31;
                    int i32 = i30 % 2;
                    byte b10 = bArr[i15];
                    byte b11 = bArr2[i15];
                    int i33 = b10 & b11;
                    int i34 = ((b10 ^ b11) | i33) & (~i33);
                    int i35 = i26 & i34;
                    i26 = ((i26 | i34) & (~i35)) | i35;
                    int i36 = (-2) - ((((i15 | 123) << 1) - (i15 ^ 123)) ^ (-1));
                    int i37 = i36 & (-121);
                    int i38 = (i36 | (-121)) & (~i37);
                    int i39 = -(-(i37 << 1));
                    i15 = (i38 | i39) + (i38 & i39);
                    int i40 = i31 + 107;
                    f53269b = i40 % 128;
                    int i41 = i40 % 2;
                }
                int i42 = i26 >>> 1;
                int i43 = i26 & 1;
                int i44 = i42 & i43;
                int i45 = ((i42 | i43) & (~i44)) | i44;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i46 = (-142) - (~(-(-(i45 * (-279)))));
                int i47 = i45 ^ iCurrentTimeMillis;
                int i48 = ~iCurrentTimeMillis;
                int i49 = i45 & iCurrentTimeMillis;
                int i50 = (i46 - (~(((i47 & i49) | (i47 ^ i49)) * 140))) - 1;
                int i51 = ~i45;
                int i52 = ((i48 | iCurrentTimeMillis) & i48) | i45;
                int i53 = ~i52;
                int i54 = (i52 | i53) & i53;
                int i55 = i51 & i54;
                int i56 = (i54 | i51) & (~i55);
                int i57 = ((i56 & i55) | (i56 ^ i55)) * (-280);
                int i58 = (i50 ^ i57) + ((i50 & i57) << 1);
                int i59 = ~i45;
                int i60 = ~i59;
                int i61 = ~((i59 & i60) | (i60 ^ i59));
                int i62 = ~i48;
                int i63 = ~((i62 & i48) | (i62 ^ i48));
                int i64 = ((~i63) & i61) | ((~i61) & i63);
                int i65 = i61 & i63;
                int i66 = (i65 & i64) | (i64 ^ i65);
                int i67 = ~((i45 & iCurrentTimeMillis) | (i51 & iCurrentTimeMillis) | (i48 & i45));
                int i68 = -(-(((i67 & i66) | ((~i67) & i66) | ((~i66) & i67)) * 140));
                byte b12 = (byte) (((i58 ^ i68) + ((i68 & i58) << 1)) >> 31);
                int i69 = f53268a;
                int i70 = (i69 & 110) + (i69 | 110);
                int i71 = (i70 ^ (-1)) + (i70 << 1);
                f53269b = i71 % 128;
                int i72 = i71 % 2;
                return Byte.valueOf(b12);
            case 2:
                long[] jArr2 = (long[]) objArr[0];
                long[] jArr3 = (long[]) objArr[1];
                int i73 = f53269b;
                int i74 = i73 & 121;
                int i75 = -(-((i73 ^ 121) | i74));
                int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
                f53268a = i76 % 128;
                int i77 = i76 % 2;
                long j10 = jArr2[0];
                long j11 = jArr2[1];
                long j12 = j10 >> 63;
                jArr3[0] = ((j10 ^ ((-2233785415175766016L) & j12)) << 1) | (j11 >>> 63);
                jArr3[1] = (j11 << 1) | (-j12);
                int i78 = (((i73 & (-86)) | ((~i73) & 85)) - (~(-(-((i73 & 85) << 1))))) - 1;
                f53268a = i78 % 128;
                int i79 = i78 % 2;
                return null;
            case 3:
                byte[] bArr3 = (byte[]) objArr[0];
                int i80 = f53269b;
                int i81 = i80 & 13;
                int i82 = -(-((i80 ^ 13) | i81));
                int i83 = (i81 ^ i82) + ((i82 & i81) << 1);
                f53268a = i83 % 128;
                if (i83 % 2 != 0) {
                    jArr = new long[3];
                    ber.setDividerPadding(new Object[]{bArr3, 0, jArr}, 854484345, -854484345, 0);
                } else {
                    jArr = new long[2];
                    ber.setDividerPadding(new Object[]{bArr3, 0, jArr}, 854484345, -854484345, 0);
                }
                return jArr;
            case 4:
                byte[] bArr4 = (byte[]) objArr[0];
                byte[] bArr5 = (byte[]) objArr[1];
                int i84 = f53269b;
                int i85 = i84 | 89;
                int i86 = i85 << 1;
                int i87 = -((~(i84 & 89)) & i85);
                int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
                f53268a = i88 % 128;
                int i89 = i88 % 2;
                do {
                    byte b13 = bArr4[i15];
                    byte b14 = bArr5[i15];
                    bArr4[i15] = (byte) ((b13 | b14) & (~(b13 & b14)));
                    int i90 = (i15 ^ 1) + ((i15 & 1) << 1);
                    byte b15 = bArr4[i90];
                    byte b16 = bArr5[i90];
                    bArr4[i90] = (byte) (((~b15) & b16) | ((~b16) & b15));
                    int i91 = i90 + 1;
                    byte b17 = bArr4[i91];
                    byte b18 = bArr5[i91];
                    int i92 = b17 & b18;
                    bArr4[i91] = (byte) (((b17 ^ b18) | i92) & (~i92));
                    int i93 = i91 & 1;
                    int i94 = (i91 ^ 1) | i93;
                    int i95 = ((i93 | i94) << 1) - (i93 ^ i94);
                    byte b19 = bArr4[i95];
                    byte b20 = bArr5[i95];
                    bArr4[i95] = (byte) ((b19 | b20) & (~(b19 & b20)));
                    i15 = ((i95 & 2) + (i95 | 2)) - 1;
                } while (i15 < 16);
                int i96 = f53268a;
                int i97 = i96 ^ 103;
                int i98 = ((i96 & 103) | i97) << 1;
                int i99 = -i97;
                int i100 = ((i98 | i99) << 1) - (i98 ^ i99);
                f53269b = i100 % 128;
                int i101 = i100 % 2;
                return null;
            case 5:
                a(objArr);
                return null;
            case 6:
                h(objArr);
                return null;
            case 7:
                f(objArr);
                return null;
            case 8:
                byte[] bArr6 = (byte[]) objArr[0];
                long[] jArr4 = (long[]) objArr[1];
                int i102 = f53268a;
                int i103 = i102 ^ 53;
                int i104 = ((((i102 & 53) | i103) << 1) - (~(-i103))) - 1;
                f53269b = i104 % 128;
                if (i104 % 2 == 0) {
                    ber.setDividerPadding(new Object[]{bArr6, 0, jArr4}, 854484345, -854484345, 0);
                } else {
                    ber.setDividerPadding(new Object[]{bArr6, 0, jArr4}, 854484345, -854484345, 0);
                }
                return null;
            case 9:
                long[] jArr5 = (long[]) objArr[0];
                long[] jArr6 = (long[]) objArr[1];
                long[] jArr7 = (long[]) objArr[2];
                int i105 = f53269b;
                int i106 = i105 & 39;
                int i107 = -(-(i105 | 39));
                int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                int i109 = i108 % 128;
                f53268a = i109;
                if (i108 % 2 != 0) {
                    jArr7[1] = jArr5[1] ^ jArr6[0];
                    jArr7[1] = jArr5[0] | jArr6[1];
                } else {
                    jArr7[0] = jArr5[0] ^ jArr6[0];
                    jArr7[1] = jArr5[1] ^ jArr6[1];
                }
                int i110 = i109 & 95;
                int i111 = ((i109 ^ 95) | i110) << 1;
                int i112 = -((i109 | 95) & (~i110));
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                f53269b = i113 % 128;
                int i114 = i113 % 2;
                return null;
            case 10:
                i(objArr);
                return null;
            case 11:
                b(objArr);
                return null;
            case 12:
                byte[] bArr7 = (byte[]) objArr[0];
                byte[] bArr8 = (byte[]) objArr[1];
                int i115 = f53268a + 87;
                f53269b = i115 % 128;
                int i116 = i115 % 2;
                long[] jArr8 = (long[]) setCompoundDrawableTintBlendMode(new Object[]{bArr7}, -304715478, 304715481, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr8, (long[]) setCompoundDrawableTintBlendMode(new Object[]{bArr8}, -304715478, 304715481, (int) System.currentTimeMillis())}, -144881152, 144881167, (int) System.currentTimeMillis());
                setCompoundDrawableTintBlendMode(new Object[]{jArr8, bArr7}, -2024198581, 2024198595, (int) System.currentTimeMillis());
                int i117 = f53268a;
                int i118 = ((i117 ^ 107) | (i117 & 107)) << 1;
                int i119 = -(((~i117) & 107) | (i117 & (-108)));
                int i120 = (i118 ^ i119) + ((i119 & i118) << 1);
                f53269b = i120 % 128;
                int i121 = i120 % 2;
                return null;
            case 13:
                g(objArr);
                return null;
            case 14:
                long[] jArr9 = (long[]) objArr[0];
                byte[] bArr9 = (byte[]) objArr[1];
                int i122 = f53268a;
                int i123 = i122 | 23;
                int i124 = (i123 << 1) - ((~(i122 & 23)) & i123);
                f53269b = i124 % 128;
                if (i124 % 2 == 0) {
                    ber.setDividerPadding(new Object[]{jArr9, bArr9, 1}, -1441180578, 1441180583, 1);
                } else {
                    ber.setDividerPadding(new Object[]{jArr9, bArr9, 0}, -1441180578, 1441180583, 0);
                }
                return null;
            case 15:
                d(objArr);
                return null;
            case 16:
                e(objArr);
                return null;
            case 17:
                return c();
            case 18:
                byte[] bArr10 = (byte[]) objArr[0];
                byte[] bArr11 = (byte[]) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int i125 = f53269b;
                int i126 = ((i125 ^ 69) | (i125 & 69)) << 1;
                int i127 = -(((~i125) & 69) | (i125 & (-70)));
                int i128 = (i126 & i127) + (i127 | i126);
                f53268a = i128 % 128;
                i15 = i128 % 2 != 0 ? 1 : 0;
                while (true) {
                    byte b21 = bArr10[i15];
                    int i129 = -(~(-(-i15)));
                    byte b22 = bArr11[(((iIntValue | i129) << 1) - (i129 ^ iIntValue)) - 1];
                    int i130 = b21 & b22;
                    bArr10[i15] = (byte) (((b21 ^ b22) | i130) & (~i130));
                    int i131 = i15 & (-114);
                    int i132 = ((((i15 ^ (-114)) | i131) << 1) - (~(-((i15 | (-114)) & (~i131))))) - 1;
                    int i133 = (i132 & 116) + (i132 | 116);
                    int i134 = (i133 ^ (-1)) + (i133 << 1);
                    byte b23 = bArr10[i134];
                    int i135 = ((i134 * 881) - (~(-(~(iIntValue * 881))))) - i16;
                    int i136 = ~i134;
                    int i137 = ~iIntValue;
                    int i138 = i136 & i137;
                    int i139 = (~i138) & (i136 | i137);
                    int i140 = (i139 & i138) | (i139 ^ i138);
                    int i141 = ~i140;
                    int i142 = (i140 | i141) & i141;
                    int i143 = (i136 | i134) & i136;
                    int i144 = i143 & iIntValue;
                    int i145 = (~i144) & (i143 | iIntValue);
                    int i146 = ~((i145 & i144) | (i145 ^ i144));
                    int i147 = i142 & i146;
                    int i148 = ((i146 | i142) & (~i147)) | i147;
                    int i149 = (i137 | iIntValue) & i137;
                    int i150 = ~((i149 ^ iIntValue) | (i149 & iIntValue));
                    int i151 = ((~i148) & i150) | ((~i150) & i148);
                    int i152 = i148 & i150;
                    int i153 = ((i151 & i152) | (i151 ^ i152)) * (-880);
                    int i154 = i135 & i153;
                    int i155 = -(-(i153 | i135));
                    int i156 = (i154 ^ i155) + ((i155 & i154) << 1);
                    int i157 = (i136 ^ i137) | i138;
                    int i158 = ~i157;
                    int i159 = (i157 | i158) & i158;
                    int i160 = (i159 & iIntValue) | (iIntValue ^ i159);
                    int i161 = i134 ^ iIntValue;
                    int i162 = i134 & iIntValue;
                    int i163 = ~((i161 & i162) | (i161 ^ i162));
                    int i164 = i160 & i163;
                    int i165 = (i160 | i163) & (~i164);
                    int i166 = ((i165 & i164) | (i165 ^ i164)) * (-880);
                    int i167 = ((i156 | i166) << 1) - (i166 ^ i156);
                    int i168 = (i134 & i137) | (iIntValue & i136);
                    int i169 = (i168 & i162) | (i168 ^ i162);
                    int i170 = ~i169;
                    byte b24 = bArr11[(i167 - (~(-(~(-(-(((i169 | i170) & i170) * 880))))))) - 2];
                    bArr10[i134] = (byte) (((~b23) & b24) | ((~b24) & b23));
                    int i171 = i134 & 1;
                    int i172 = i134 | 1;
                    int i173 = (i171 ^ i172) + ((i171 & i172) << 1);
                    byte b25 = bArr10[i173];
                    int i174 = i173 * (-1335);
                    int i175 = iIntValue * (-667);
                    int i176 = i174 & i175;
                    int i177 = (i174 | i175) & (~i176);
                    int i178 = -(-(i176 << 1));
                    int i179 = ((i177 | i178) << 1) - (i177 ^ i178);
                    int i180 = (i173 & i137) | ((~i173) & iIntValue);
                    int i181 = i173 & iIntValue;
                    int i182 = ~((i180 & i181) | (i180 ^ i181));
                    int i183 = (~i182) & i137;
                    int i184 = ~i137;
                    int i185 = ((i182 & i137) | i183 | (i182 & i184)) * (-668);
                    int i186 = i179 & i185;
                    int i187 = ((i185 | i179) & (~i186)) + (i186 << 1);
                    int i188 = ((i173 ^ i150) | (i173 & i150)) * 1336;
                    int i189 = (i187 | i188) << 1;
                    int i190 = -(i187 ^ i188);
                    int i191 = (i189 ^ i190) + ((i190 & i189) << 1);
                    int i192 = (~i181) & (i173 | iIntValue);
                    int i193 = (i192 & i181) | (i192 ^ i181);
                    int i194 = (i193 & i184) | ((~i193) & i137);
                    int i195 = i193 & i137;
                    byte b26 = bArr11[(i191 - (~(-(~(((i195 & i194) | (i194 ^ i195)) * 668))))) - 2];
                    bArr10[i173] = (byte) (((~b25) & b26) | ((~b26) & b25));
                    int i196 = i173 + 1;
                    byte b27 = bArr10[i196];
                    int i197 = ((i196 * 319) - (~(-(-(iIntValue * (-317)))))) - 1;
                    int i198 = ~i196;
                    int i199 = (i198 | i196) & i198;
                    int i200 = i199 & iIntValue;
                    int i201 = (i199 | iIntValue) & (~i200);
                    int i202 = ~((i201 & i200) | (i201 ^ i200));
                    int i203 = i149 & i202;
                    int i204 = -(-((((i202 | i149) & (~i203)) | i203) * (-318)));
                    int i205 = (i197 ^ i204) + ((i197 & i204) << 1);
                    int i206 = i137 ^ iIntValue;
                    int i207 = i137 & iIntValue;
                    int i208 = (i206 & i207) | (i206 ^ i207);
                    int i209 = ~i208;
                    int i210 = (i208 | i209) & i209;
                    int i211 = (i198 & i137) | (i196 & i184);
                    int i212 = i137 & i196;
                    int i213 = (i211 & i212) | (i211 ^ i212);
                    int i214 = i213 & iIntValue;
                    int i215 = (i213 | iIntValue) & (~i214);
                    int i216 = ~((i215 & i214) | (i215 ^ i214));
                    int i217 = i210 & i216;
                    int i218 = -(~(-(-((((i210 | i216) & (~i217)) | i217) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                    int i219 = ((i205 ^ i218) + ((i218 & i205) << 1)) - 1;
                    int i220 = i137 & i149;
                    int i221 = i220 | ((~i220) & (i137 | i149));
                    int i222 = i221 & i196;
                    int i223 = (i221 | i196) & (~i222);
                    int i224 = (i223 & i222) | (i223 ^ i222);
                    int i225 = ~i224;
                    int i226 = (i224 | i225) & i225;
                    int i227 = i196 & iIntValue;
                    int i228 = (~i227) & (i196 | iIntValue);
                    int i229 = (i227 & i228) | (i228 ^ i227);
                    int i230 = (i229 & i137) | ((~i229) & iIntValue);
                    int i231 = i229 & iIntValue;
                    int i232 = ~((i231 & i230) | (i230 ^ i231));
                    int i233 = i226 & i232;
                    int i234 = (i226 | i232) & (~i233);
                    int i235 = ((i234 & i233) | (i234 ^ i233)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET;
                    int i236 = ((~i235) & i219) | ((~i219) & i235);
                    int i237 = -(-((i235 & i219) << 1));
                    byte b28 = bArr11[(i236 ^ i237) + ((i237 & i236) << 1)];
                    int i238 = b27 & b28;
                    bArr10[i196] = (byte) (((b27 ^ b28) | i238) & (~i238));
                    int i239 = i196 & (-51);
                    int i240 = (~i239) & (i196 | (-51));
                    int i241 = i239 << 1;
                    int i242 = (i240 & i241) + (i241 | i240);
                    i15 = ((i242 & 53) + (i242 | 53)) - 1;
                    if (i15 >= 16) {
                        int i243 = f53269b;
                        int i244 = i243 & 11;
                        int i245 = (i243 ^ 11) | i244;
                        int i246 = ((i244 | i245) << 1) - (i245 ^ i244);
                        f53268a = i246 % 128;
                        int i247 = i246 % 2;
                        return null;
                    }
                    i16 = 2;
                }
                break;
            default:
                long jLongValue = ((Number) objArr[0]).longValue();
                long jLongValue2 = ((Number) objArr[1]).longValue();
                int i248 = f53268a;
                int i249 = ((i248 & 75) - (~(-(-(i248 | 75))))) - 1;
                f53269b = i249 % 128;
                int i250 = i249 % 2;
                long j13 = jLongValue & 1229782938247303441L;
                long j14 = jLongValue & 2459565876494606882L;
                long j15 = jLongValue & 4919131752989213764L;
                long j16 = jLongValue & (-8608480567731124088L);
                long j17 = jLongValue2 & 1229782938247303441L;
                long j18 = jLongValue2 & 2459565876494606882L;
                long j19 = jLongValue2 & 4919131752989213764L;
                long j20 = jLongValue2 & (-8608480567731124088L);
                long j21 = (((j13 * j17) ^ (j14 * j20)) ^ (j15 * j19)) ^ (j16 * j18);
                long j22 = (((j13 * j18) ^ (j14 * j17)) ^ (j15 * j20)) ^ (j16 * j19);
                long j23 = (((j13 * j19) ^ (j14 * j18)) ^ (j15 * j17)) ^ (j16 * j20);
                long j24 = (j16 * j17) ^ (((j13 * j20) ^ (j14 * j19)) ^ (j15 * j18));
                long j25 = (j21 & 1229782938247303441L) | (j22 & 2459565876494606882L);
                System.currentTimeMillis();
                System.currentTimeMillis();
                return Long.valueOf((j24 & (-8608480567731124088L)) | j25 | (j23 & 4919131752989213764L));
        }
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2, long[] jArr3) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2, jArr3}, -164048949, 164048958, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(byte[] bArr, byte[] bArr2, int i10, int i11) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2, Integer.valueOf(i10), Integer.valueOf(i11)}, -715499913, 715499920, i10);
    }

    public static void setX(byte[] bArr, byte[] bArr2, int i10, byte[] bArr3, int i11) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2, Integer.valueOf(i10), bArr3, Integer.valueOf(i11)}, 108747681, -108747676, i10);
    }

    public static void setY(byte[] bArr, int i10, byte[] bArr2, int i11) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(i10), bArr2, Integer.valueOf(i11)}, -1548604082, 1548604098, i10);
    }

    public static void setDividerPadding(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, -144881152, 144881167, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(byte[] bArr, byte[] bArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, 808178728, -808178716, (int) System.currentTimeMillis());
    }

    public static void setX(byte[] bArr, byte[] bArr2, int i10) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2, Integer.valueOf(i10)}, -1690911169, 1690911187, i10);
    }

    public static void setY(byte[] bArr, byte[] bArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, 1367451466, -1367451462, (int) System.currentTimeMillis());
    }

    public static void setDividerPadding(long[] jArr, byte[] bArr) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, bArr}, -2024198581, 2024198595, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 550161453, -550161447, (int) System.currentTimeMillis());
    }

    public static void setX(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 1717577473, -1717577460, (int) System.currentTimeMillis());
    }

    public static void setY(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, 666181894, -666181883, (int) System.currentTimeMillis());
    }

    public static void setX(byte[] bArr, long[] jArr) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, jArr}, -4469678, 4469686, (int) System.currentTimeMillis());
    }

    public static byte setX(byte[] bArr, byte[] bArr2) {
        return ((Byte) setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, -2137959665, 2137959666, (int) System.currentTimeMillis())).byteValue();
    }

    public static long[] setX() {
        return (long[]) setCompoundDrawableTintBlendMode(new Object[0], -1233866299, 1233866316, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(long[] jArr, long[] jArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{jArr, jArr2}, -160753496, 160753498, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(byte[] bArr, byte[] bArr2) {
        setCompoundDrawableTintBlendMode(new Object[]{bArr, bArr2}, -1028003531, 1028003541, (int) System.currentTimeMillis());
    }

    public static long[] setCompoundDrawableTintBlendMode(byte[] bArr) {
        return (long[]) setCompoundDrawableTintBlendMode(new Object[]{bArr}, -304715478, 304715481, (int) System.currentTimeMillis());
    }
}
