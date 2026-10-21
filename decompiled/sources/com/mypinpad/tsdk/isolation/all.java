package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;

/* JADX INFO: loaded from: classes10.dex */
public class all implements akv {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53039f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f53041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f53042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f53044d;
    protected boolean setCompoundDrawableTintBlendMode;
    protected int setDividerPadding;
    protected final akp setOnFocusChangeListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long[] f53038e = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53040g = 35 % 128;

    static {
        if (35 % 2 == 0) {
            throw null;
        }
    }

    public all(int i10, akp akpVar) {
        this.f53041a = new long[25];
        this.f53042b = new byte[192];
        this.setOnFocusChangeListener = akpVar;
        setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, -836858430, 836858434, i10);
        setCompoundDrawableTintBlendMode();
        aku.setCompoundDrawableTintBlendMode(new Object[0], -825950727, 825950727, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ void a(Object[] objArr) {
        int i10;
        all allVar = (all) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i11 = f53039f;
        int i12 = ((i11 & (-60)) | ((~i11) & 59)) + ((i11 & 59) << 1);
        f53040g = i12 % 128;
        if (i12 % 2 != 0 ? allVar.f53044d % 8 != 0 : (allVar.f53044d >>> 66) != 0) {
            throw new IllegalStateException("attempt to absorb with odd length queue");
        }
        if (allVar.setCompoundDrawableTintBlendMode) {
            throw new IllegalStateException("attempt to absorb while squeezing");
        }
        int i13 = allVar.f53044d >>> 3;
        int i14 = allVar.f53043c >>> 3;
        int i15 = -i13;
        int i16 = i15 * (-337);
        int i17 = -(-(i14 * 339));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        int i19 = ~i15;
        int i20 = (i19 | i15) & i19;
        int i21 = ~iIntValue;
        int i22 = i21 & (i21 | iIntValue);
        int i23 = i20 & i22;
        int i24 = (~i23) & (i20 | i22);
        int i25 = ~((i23 & i24) | (i24 ^ i23));
        int i26 = ~i14;
        int i27 = (i26 | i14) & i26;
        int i28 = ~((i27 ^ i15) | (i27 & i15));
        int i29 = i25 ^ i28;
        int i30 = i25 & i28;
        int i31 = (i29 & i30) | (i29 ^ i30);
        int i32 = i15 & iIntValue;
        int i33 = (~i32) & (i15 | iIntValue);
        int i34 = (i33 ^ i32) | (i33 & i32);
        int i35 = ~i34;
        int i36 = (i34 | i35) & i35;
        int i37 = i31 & i36;
        int i38 = -(-((((i31 | i36) & (~i37)) | i37) * (-338)));
        int i39 = (((~i38) & i18) | ((~i18) & i38)) + ((i38 & i18) << 1);
        int i40 = (i19 & i26) | ((~i19) & i14);
        int i41 = i19 & i14;
        int i42 = -(-((~((i40 & i41) | (i40 ^ i41))) * 338));
        int i43 = i39 ^ i42;
        int i44 = (((i42 & i39) | i43) << 1) - i43;
        int i45 = ~((i19 ^ i21) | (i19 & i21));
        int i46 = i41 | (i15 & i26);
        int i47 = i15 & i14;
        int i48 = (i46 & i47) | (i46 ^ i47);
        int i49 = i48 & iIntValue;
        int i50 = (i48 | iIntValue) & (~i49);
        int i51 = ~((i50 & i49) | (i50 ^ i49));
        int i52 = ((i45 & i51) | (i45 ^ i51)) * 338;
        int i53 = ((i44 & i52) << 1) + (i44 ^ i52);
        byte[] bArr2 = allVar.f53042b;
        if (iIntValue2 < i53) {
            int i54 = i11 & 95;
            int i55 = (i11 ^ 95) | i54;
            int i56 = ((i54 | i55) << 1) - (i54 ^ i55);
            f53040g = i56 % 128;
            int i57 = i56 % 2;
            System.arraycopy(bArr, iIntValue, bArr2, i13, iIntValue2);
            int i58 = allVar.f53044d;
            int i59 = iIntValue2 << 3;
            int i60 = (-965) - (~(i59 * (-963)));
            int i61 = -(~(-(-(i58 * 965))));
            int i62 = (((i60 | i61) << 1) - (i60 ^ i61)) - 1;
            int i63 = ~i59;
            int i64 = ~i58;
            int i65 = i64 & iIntValue;
            int i66 = ~(i65 | ((~i65) & (i64 | iIntValue)));
            int i67 = i63 & i66;
            int i68 = (i66 | i63) & (~i67);
            int i69 = (i62 - (~(((i68 & i67) | (i68 ^ i67)) * (-964)))) - 1;
            int i70 = (i58 | i64) & i64;
            int i71 = ~((i70 & i21) | (i70 ^ i21));
            int i72 = (i63 & i64) | ((~i64) & i59);
            int i73 = i59 & i64;
            int i74 = ~((i73 & i72) | (i72 ^ i73));
            int i75 = ((~i74) & i71) | ((~i71) & i74);
            int i76 = i71 & i74;
            int i77 = ((i76 & i75) | (i75 ^ i76)) * (-964);
            allVar.f53044d = (i69 & i77) + (i77 | i69);
            int i78 = 925358750 ^ iIntValue;
            int i79 = 925358750 & iIntValue;
            int i80 = (i79 & i78) | (i78 ^ i79);
            int i81 = ~i80;
            int i82 = ((i80 | i81) & i81) * (-301);
            int i83 = (-1464271268) & i82;
            int i84 = (i82 ^ (-1464271268)) | i83;
            int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
            int i86 = (-606459935) & iIntValue;
            int i87 = ~(i86 | ((~i86) & ((-606459935) | iIntValue)));
            int i88 = i22 & 386318982;
            int i89 = ((i22 | 386318982) & (~i88)) | i88;
            int i90 = ~i89;
            int i91 = (i89 | i90) & i90;
            int i92 = ((~i91) & i87) | ((~i87) & i91);
            int i93 = i87 & i91;
            int i94 = -(-(((i93 & i92) | (i92 ^ i93)) * (-301)));
            int i95 = (((~i94) & i85) | ((~i85) & i94)) + ((i85 & i94) << 1);
            int i96 = ~(((-386318983) & iIntValue) | ((-386318983) ^ iIntValue));
            int i97 = (-606459935) ^ i96;
            int i98 = (-606459935) & i96;
            int i99 = ((i98 & i97) | (i97 ^ i98)) * 301;
            int i100 = i95 ^ i99;
            int i101 = (((i99 & i95) | i100) << 1) - i100;
            int i102 = (-1582731739) & i22;
            int i103 = (~i102) & ((-1582731739) | i22);
            int i104 = (i102 & i103) | (i103 ^ i102);
            int i105 = ~i104;
            int i106 = (i104 | i105) & i105;
            int i107 = ((-1212416347) & i106) | ((~i106) & 1212416346);
            int i108 = i106 & 1212416346;
            int i109 = ((i108 & i107) | (i107 ^ i108)) * (-245);
            int i110 = (-1967160916) & i109;
            int i111 = (((-1967160916) ^ i109) | i110) << 1;
            int i112 = -((i109 | (-1967160916)) & (~i110));
            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
            int i114 = (-1582731739) & iIntValue;
            int i115 = (~i114) & ((-1582731739) | iIntValue);
            int i116 = (i113 - (~((~((i115 & i114) | (i115 ^ i114))) * (-245)))) - 1;
            int i117 = ((-1582731739) & i21) | (iIntValue & 1582731738);
            int i118 = ~((i117 & i114) | (i117 ^ i114));
            int i119 = -(~(((i118 & 389206660) | (389206660 ^ i118)) * 245));
            if (i101 > ((i116 & i119) + (i119 | i116)) - 1) {
                throw null;
            }
            return;
        }
        int i120 = 1218641592;
        int i121 = -1218641584;
        if (i13 > 0) {
            int i122 = ((i11 ^ 122) + ((i11 & 122) << 1)) - 1;
            f53040g = i122 % 128;
            int i123 = i122 % 2;
            System.arraycopy(bArr, iIntValue, bArr2, i13, i53);
            setCompoundDrawableTintBlendMode(new Object[]{allVar, bArr2, 0}, -1218641584, 1218641592, 0);
            int i124 = f53040g + 115;
            f53039f = i124 % 128;
            int i125 = i124 % 2;
        } else {
            i53 = 0;
        }
        while (true) {
            int i126 = -i53;
            int i127 = i126 * (-55);
            int i128 = -(-(iIntValue2 * (-55)));
            int i129 = i127 & i128;
            int i130 = i129 + ((i127 ^ i128) | i129);
            int i131 = (i126 & i21) | ((~i126) & iIntValue);
            int i132 = i126 & iIntValue;
            int i133 = (i131 ^ i132) | (i131 & i132);
            int i134 = ~i133;
            int i135 = ((((i133 | i134) & i134) | iIntValue2) * 56) + i130;
            int i136 = i126 & iIntValue2;
            int i137 = (~i136) & (i126 | iIntValue2);
            int i138 = (i135 - (~(-(-((~((i137 ^ i136) | (i136 & i137))) * (-56)))))) - 1;
            int i139 = (i21 ^ iIntValue2) | (i21 & iIntValue2);
            int i140 = ~i139;
            int i141 = (i139 | i140) & i140;
            int i142 = ((i126 & i141) | (i126 ^ i141)) * 56;
            int i143 = i138 & i142;
            i10 = (i143 - (~((i142 ^ i138) | i143))) - 1;
            if (i10 < i14) {
                break;
            }
            int i144 = f53039f;
            int i145 = (i144 ^ 45) + ((i144 & 45) << 1);
            f53040g = i145 % 128;
            int i146 = i145 % 2;
            int i147 = ~i53;
            int i148 = iIntValue & i53;
            int i149 = -(-((iIntValue ^ i53) | i148));
            int i150 = (i148 & i149) + (i148 | i149);
            setCompoundDrawableTintBlendMode(new Object[]{allVar, bArr, Integer.valueOf(i150)}, i121, i120, i150);
            int i151 = i14 * (-711);
            int i152 = -(-(i53 * 713));
            int i153 = i151 & i152;
            int i154 = (i151 | i152) & (~i153);
            int i155 = -(-(i153 << 1));
            int i156 = ((i154 | i155) << 1) - (i154 ^ i155);
            int i157 = (i147 ^ i14) | (i147 & i14);
            int i158 = ~i157;
            int i159 = (i157 | i158) & i158;
            int i160 = i21 & i14;
            int i161 = (~i160) & (i21 | i14);
            int i162 = ~((i161 ^ i160) | (i161 & i160));
            int i163 = -(-((((~i159) & i162) | ((~i162) & i159) | (i159 & i162)) * (-712)));
            int i164 = i156 & i163;
            int i165 = (i163 | i156) & (~i164);
            int i166 = i164 << 1;
            int i167 = (i165 & i166) + (i165 | i166);
            int i168 = (i147 ^ i22) | (i147 & i22);
            int i169 = i168 & i14;
            int i170 = (i168 | i14) & (~i169);
            int i171 = ~((i170 & i169) | (i170 ^ i169));
            int i172 = i14 & i53;
            int i173 = (i53 | i14) & (~i172);
            int i174 = (i173 & i172) | (i173 ^ i172);
            int i175 = ~((i174 & iIntValue) | (i174 ^ iIntValue));
            int i176 = i171 & i175;
            int i177 = (i175 | i171) & (~i176);
            int i178 = ((i177 & i176) | (i177 ^ i176)) * (-712);
            int i179 = i167 & i178;
            int i180 = i179 + ((i178 ^ i167) | i179);
            int i181 = (i21 & i26) | ((~i21) & i14);
            int i182 = ~((i181 & i160) | (i181 ^ i160));
            int i183 = i147 & i182;
            int i184 = (i182 | i147) & (~i183);
            i53 = (-2) - (((i180 - (~(-(~(((i184 & i183) | (i184 ^ i183)) * 712))))) - 1) ^ (-1));
            i120 = 1218641592;
            i121 = -1218641584;
        }
        int i185 = i53 * (-337);
        int i186 = -(-(iIntValue * 339));
        int i187 = (i185 ^ i186) + ((i185 & i186) << 1);
        int i188 = ~i53;
        int i189 = i188 & i21;
        int i190 = ~((i188 ^ i21) | i189);
        int i191 = i21 & i53;
        int i192 = ~((i21 ^ i53) | i191);
        int i193 = (i190 & i192) | (i190 ^ i192);
        int i194 = i53 & iIntValue;
        int i195 = (i53 | iIntValue) & (~i194);
        int i196 = -(-(((~((i195 & i194) | (i195 ^ i194))) | i193) * (-338)));
        int i197 = ((((i187 ^ i196) | (i187 & i196)) << 1) - (~(-((i196 & (~i187)) | ((~i196) & i187))))) - 1;
        int i198 = i188 & iIntValue;
        int i199 = (~(((~i188) & iIntValue) | i189 | i198)) * 338;
        int i200 = i197 & i199;
        int i201 = ((i197 ^ i199) | i200) << 1;
        int i202 = -((i199 | i197) & (~i200));
        int i203 = (i201 & i202) + (i202 | i201);
        int i204 = i188 | i22;
        int i205 = ~i204;
        int i206 = (i204 | i205) & i205;
        int i207 = i191 | i198 | i194 | iIntValue;
        int i208 = ~i207;
        int i209 = (i207 | i208) & i208;
        int i210 = i206 & i209;
        int i211 = (((i206 | i209) & (~i210)) | i210) * 338;
        System.arraycopy(bArr, (i203 ^ i211) + ((i211 & i203) << 1), bArr2, 0, i10);
        allVar.f53044d = i10 << 3;
        int i212 = (-302662149) ^ iIntValue;
        int i213 = (-302662149) & iIntValue;
        int i214 = ((~((i213 & i212) | (i212 ^ i213))) | 301192) * 449;
        int i215 = (950180470 & i214) + (i214 | 950180470);
        int i216 = i215 & (-405705624);
        int i217 = i216 + (((-405705624) ^ i215) | i216);
        int i218 = ((-1934312248) & i22) | ((-1934312248) ^ i22);
        int i219 = ~((i218 & 1631951291) | (i218 ^ 1631951291));
        int i220 = ((~i219) & 301192) | ((-301193) & i219);
        int i221 = i219 & 301192;
        int i222 = ((i221 & i220) | (i220 ^ i221)) * 449;
        int i223 = i217 & i222;
        int i224 = (i222 ^ i217) | i223;
        if ((i223 ^ i224) + ((i224 & i223) << 1) > 1891370339) {
            throw null;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        all allVar = (all) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f53040g;
        int i11 = i10 + 125;
        f53039f = i11 % 128;
        int i12 = i11 % 2;
        if (iIntValue2 > 0) {
            int i13 = i10 & 89;
            int i14 = -(-(i10 | 89));
            int i15 = (i13 & i14) + (i14 | i13);
            int i16 = i15 % 128;
            f53039f = i16;
            int i17 = i15 % 2;
            if (iIntValue2 <= 7) {
                int i18 = allVar.f53044d;
                if (i18 % 8 != 0) {
                    throw new IllegalStateException("attempt to absorb with odd length queue");
                }
                if (allVar.setCompoundDrawableTintBlendMode) {
                    throw new IllegalStateException("attempt to absorb while squeezing");
                }
                int i19 = 1 << iIntValue2;
                int i20 = -(~(-(-(i19 * (-375)))));
                int i21 = (375 & i20) + (i20 | 375);
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                int i23 = ~i19;
                int i24 = ~i23;
                int i25 = (~i24) & iIntValue;
                int i26 = ~iIntValue;
                int i27 = i25 | (i24 & i26);
                int i28 = i24 & iIntValue;
                int i29 = (i28 & i27) | (i27 ^ i28);
                int i30 = (i23 & i19) | (i23 ^ i19);
                int i31 = ~i30;
                int i32 = (i30 | i31) & i31;
                int i33 = ((~i32) & i29) | ((~i29) & i32);
                int i34 = i32 & i29;
                int i35 = -(~(((i34 & i33) | (i33 ^ i34)) * 376));
                int i36 = (((i22 | i35) << 1) - (i22 ^ i35)) - 1;
                int i37 = (i26 | iIntValue) & i26;
                int i38 = i37 ^ (-1);
                int i39 = (i37 & i38) | (i38 ^ i37);
                int i40 = ~i39;
                int i41 = (i39 | i40) & i40;
                int i42 = (-1) ^ i19;
                int i43 = (i42 & i19) | (i42 ^ i19);
                int i44 = ~i43;
                int i45 = (i43 | i44) & i44;
                int i46 = i41 & i45;
                int i47 = (i36 - (~(-(-((((i41 | i45) & (~i46)) | i46) * (-376)))))) - 1;
                int i48 = -(-(((i19 & i26) | (i19 ^ i26)) * 376));
                int i49 = i47 & i48;
                int i50 = (i48 | i47) & (~i49);
                int i51 = i49 << 1;
                byte b10 = (byte) (iIntValue & ((i50 & i51) + (i50 | i51)));
                allVar.f53042b[i18 >>> 3] = b10;
                int i52 = iIntValue2 * (-405);
                int i53 = -(-(i18 * 407));
                int i54 = i52 | i53;
                int i55 = i54 << 1;
                int i56 = -((~(i52 & i53)) & i54);
                int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
                int i58 = ~i18;
                int i59 = i58 & iIntValue;
                int i60 = (~i59) & (i58 | iIntValue);
                int i61 = (i59 & i60) | (i60 ^ i59);
                int i62 = ~i61;
                int i63 = (i61 | i62) & i62;
                int i64 = (i26 ^ iIntValue2) | (i26 & iIntValue2);
                int i65 = ~((i64 & i18) | (i64 ^ i18));
                int i66 = (i57 - (~(((i63 & i65) | (i63 ^ i65)) * (-406)))) - 1;
                int i67 = ~i26;
                int i68 = (i58 & i67) | ((~i58) & i26);
                int i69 = i58 & i26;
                int i70 = (i68 & i69) | (i68 ^ i69);
                int i71 = ~iIntValue2;
                int i72 = ((~((iIntValue2 & i70) | (i70 & i71) | ((~i70) & iIntValue2))) * (-406)) + i66;
                int i73 = i71 ^ iIntValue;
                int i74 = iIntValue & i71;
                int i75 = ~((i74 & i73) | (i73 ^ i74));
                int i76 = i69 | (i18 & i67);
                int i77 = i18 & i26;
                int i78 = ~((i77 & i76) | (i76 ^ i77));
                int i79 = -(-(((i75 & i78) | ((~i78) & i75) | ((~i75) & i78)) * 406));
                allVar.f53044d = ((i72 | i79) << 1) - (i72 ^ i79);
                int i80 = (i16 & 65) + (i16 | 65);
                f53040g = i80 % 128;
                if (i80 % 2 == 0) {
                    throw null;
                }
                return;
            }
        }
        throw new IllegalArgumentException("'bits' must be in the range 1 to 7");
    }

    public static /* synthetic */ void c(Object[] objArr) {
        char c10 = 0;
        all allVar = (all) objArr[0];
        int i10 = 1;
        byte[] bArr = (byte[]) objArr[1];
        int i11 = 2;
        int iIntValue = ((Number) objArr[2]).intValue();
        long jLongValue = ((Number) objArr[3]).longValue();
        int i12 = f53039f;
        int i13 = (((i12 ^ 51) | (i12 & 51)) << 1) - ((i12 & (-52)) | ((~i12) & 51));
        f53040g = i13 % 128;
        int i14 = i13 % 2;
        if (!allVar.setCompoundDrawableTintBlendMode) {
            int i15 = (i12 ^ 3) + ((3 & i12) << 1);
            f53040g = i15 % 128;
            if (i15 % 2 == 0) {
                setCompoundDrawableTintBlendMode(new Object[]{allVar}, -463130863, 463130869, System.identityHashCode(allVar));
                int i16 = 43 / 0;
            } else {
                setCompoundDrawableTintBlendMode(new Object[]{allVar}, -463130863, 463130869, System.identityHashCode(allVar));
            }
            int i17 = f53039f;
            int i18 = ((((i17 ^ 39) | (i17 & 39)) << 1) - (~(-(((~i17) & 39) | (i17 & (-40)))))) - 1;
            f53040g = i18 % 128;
            int i19 = i18 % 2;
        }
        long j10 = 0;
        if (jLongValue % 8 != 0) {
            throw new IllegalStateException("outputLength not a multiple of 8");
        }
        int i20 = f53039f;
        int i21 = i20 & 29;
        int i22 = (((i20 ^ 29) | i21) << 1) - ((i20 | 29) & (~i21));
        f53040g = i22 % 128;
        int i23 = i22 % 2;
        while (j10 < jLongValue) {
            int i24 = f53039f + 55;
            int i25 = i24 % 128;
            f53040g = i25;
            int i26 = i24 % i11;
            if (allVar.f53044d == 0) {
                int i27 = ((i25 | 95) << i10) - (i25 ^ 95);
                f53039f = i27 % 128;
                if (i27 % i11 != 0) {
                    Object[] objArr2 = new Object[i10];
                    objArr2[c10] = allVar;
                    setCompoundDrawableTintBlendMode(objArr2, -846557461, 846557471, System.identityHashCode(allVar));
                    throw null;
                }
                Object[] objArr3 = new Object[i10];
                objArr3[c10] = allVar;
                setCompoundDrawableTintBlendMode(objArr3, -846557461, 846557471, System.identityHashCode(allVar));
                int i28 = f53040g;
                int i29 = i28 ^ 83;
                int i30 = ((i28 & 83) | i29) << i10;
                int i31 = -i29;
                int i32 = ((i30 | i31) << i10) - (i30 ^ i31);
                f53039f = i32 % 128;
                int i33 = i32 % i11;
            }
            int iMin = (int) Math.min(allVar.f53044d, jLongValue - j10);
            int i34 = allVar.f53043c;
            int i35 = -allVar.f53044d;
            int i36 = i35 * 1773;
            int i37 = -(-(i34 * (-885)));
            int i38 = (i36 & i37) + (i36 | i37);
            int i39 = ~i35;
            int i40 = ~i34;
            int i41 = i40 & (i40 | i34);
            int i42 = i39 ^ i41;
            int i43 = i39 & i41;
            int i44 = ~((i42 ^ i43) | (i42 & i43));
            int i45 = ~iIntValue;
            int i46 = i40 & i45;
            int i47 = i46 | ((~i40) & iIntValue);
            int i48 = i40 & iIntValue;
            int i49 = ~((i47 ^ i48) | (i47 & i48));
            int i50 = i44 ^ i49;
            int i51 = i44 & i49;
            int i52 = (i50 & i51) | (i50 ^ i51);
            int i53 = ~i45;
            int i54 = (i45 & i39) | (i35 & i53);
            int i55 = i45 & i35;
            int i56 = (i54 ^ i55) | (i54 & i55);
            long j11 = jLongValue;
            int i57 = ((~i56) & i34) | (i40 & i56);
            int i58 = i56 & i34;
            int i59 = ~((i58 & i57) | (i57 ^ i58));
            int i60 = i52 ^ i59;
            int i61 = i52 & i59;
            int i62 = ((i61 & i60) | (i60 ^ i61)) * 886;
            int i63 = i38 & i62;
            int i64 = ((i38 ^ i62) | i63) << 1;
            int i65 = -((i38 | i62) & (~i63));
            int i66 = (i64 & i65) + (i65 | i64);
            int i67 = i46 | (i34 & i53);
            int i68 = i45 & i34;
            int i69 = (i67 & i68) | (i67 ^ i68);
            int i70 = ~i69;
            int i71 = (i69 | i70) & i70;
            int i72 = i35 ^ i71;
            int i73 = i71 & i35;
            int i74 = ((i73 & i72) | (i72 ^ i73)) * (-1772);
            int i75 = (((i66 | i74) << 1) - (~(-((i74 & (~i66)) | ((~i74) & i66))))) - 1;
            int i76 = (i45 | iIntValue) & i45;
            int i77 = (i76 & i39) | ((~i76) & i35);
            int i78 = i76 & i35;
            int i79 = -(-((~((i78 & i77) | (i77 ^ i78))) * 886));
            int i80 = i75 & i79;
            int i81 = ((i75 ^ i79) | i80) << 1;
            int i82 = -((i79 | i75) & (~i80));
            int i83 = (((i81 | i82) << 1) - (i82 ^ i81)) / 8;
            int i84 = -(~(-(-((int) (j10 / 8)))));
            System.arraycopy(allVar.f53042b, i83, bArr, (-2) - ((((iIntValue | i84) << 1) - (i84 ^ iIntValue)) ^ (-1)), iMin / 8);
            allVar.f53044d -= iMin;
            j10 += (long) iMin;
            int i85 = f53039f;
            int i86 = ((i85 | 125) << 1) - (i85 ^ 125);
            f53040g = i86 % 128;
            int i87 = i86 % 2;
            jLongValue = j11;
            c10 = 0;
            i10 = 1;
            i11 = 2;
        }
        int i88 = f53040g;
        int i89 = i88 & 23;
        int i90 = -(-((i88 ^ 23) | i89));
        int i91 = ((i89 | i90) << 1) - (i90 ^ i89);
        f53039f = i91 % 128;
        int i92 = i91 % 2;
    }

    public static /* synthetic */ void d(Object[] objArr) {
        all allVar = (all) objArr[0];
        byte bByteValue = ((Byte) objArr[1]).byteValue();
        int i10 = f53040g + 100;
        int i11 = (i10 ^ (-1)) + (i10 << 1);
        f53039f = i11 % 128;
        Object[] objArr2 = new Object[2];
        if (i11 % 2 == 0) {
            objArr2[0] = allVar;
            objArr2[1] = Byte.valueOf(bByteValue);
            setCompoundDrawableTintBlendMode(objArr2, 842521848, -842521843, System.identityHashCode(allVar));
        } else {
            objArr2[0] = allVar;
            objArr2[1] = Byte.valueOf(bByteValue);
            setCompoundDrawableTintBlendMode(objArr2, 842521848, -842521843, System.identityHashCode(allVar));
            throw null;
        }
    }

    public static /* synthetic */ void e(Object[] objArr) {
        all allVar = (all) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53040g;
        int i11 = i10 & 3;
        int i12 = (i10 ^ 3) | i11;
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        int i14 = i13 % 128;
        f53039f = i14;
        if (i13 % 2 != 0) {
            throw null;
        }
        if (iIntValue > 0 && iIntValue < 1600) {
            int i15 = i14 ^ 59;
            int i16 = ((i14 & 59) | i15) << 1;
            int i17 = -i15;
            int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
            f53040g = i18 % 128;
            if (i18 % 2 != 0 ? iIntValue % 64 == 0 : iIntValue * 98 == 0) {
                allVar.f53043c = iIntValue;
                int i19 = i14 + 112;
                int i20 = (i19 ^ (-1)) + (i19 << 1);
                f53040g = i20 % 128;
                int i21 = i20 % 2;
                int i22 = 0;
                while (true) {
                    long[] jArr = allVar.f53041a;
                    if (i22 >= jArr.length) {
                        bek.setOnFocusChangeListener(new Object[]{allVar.f53042b}, -949833373, 949833375, (int) System.currentTimeMillis());
                        allVar.f53044d = 0;
                        allVar.setCompoundDrawableTintBlendMode = false;
                        int i23 = -iIntValue;
                        allVar.setDividerPadding = (((i23 | ReturnCode.ERR_STORAGE) << 1) - (i23 ^ ReturnCode.ERR_STORAGE)) / 2;
                        int i24 = f53040g;
                        int i25 = i24 | 85;
                        int i26 = i25 << 1;
                        int i27 = -((~(i24 & 85)) & i25);
                        int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                        f53039f = i28 % 128;
                        int i29 = i28 % 2;
                        return;
                    }
                    int i30 = f53040g + 33;
                    f53039f = i30 % 128;
                    if (i30 % 2 != 0) {
                        jArr[i22] = 1;
                        i22 += 20;
                    } else {
                        jArr[i22] = 0;
                        int i31 = i22 & 1;
                        int i32 = (i22 | 1) & (~i31);
                        int i33 = -(-(i31 << 1));
                        i22 = (i32 ^ i33) + ((i32 & i33) << 1);
                    }
                }
            }
        }
        throw new IllegalStateException("invalid rate value");
    }

    public static /* synthetic */ void f(Object[] objArr) {
        all allVar = (all) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53040g;
        int i11 = (((i10 | 69) << 1) - (~(-(((~i10) & 69) | (i10 & (-70)))))) - 1;
        f53039f = i11 % 128;
        int i12 = i11 % 2;
        if (iIntValue != 128 && iIntValue != 224 && iIntValue != 256 && iIntValue != 288 && iIntValue != 384 && iIntValue != 512) {
            throw new IllegalArgumentException("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
        int i13 = -(iIntValue << 1);
        int i14 = i13 & ReturnCode.ERR_STORAGE;
        int i15 = (i13 ^ ReturnCode.ERR_STORAGE) | i14;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        setCompoundDrawableTintBlendMode(new Object[]{allVar, Integer.valueOf(i16)}, 1460903739, -1460903737, i16);
        int i17 = f53039f;
        int i18 = ((i17 ^ 117) | (i17 & 117)) << 1;
        int i19 = -(((~i17) & 117) | (i17 & (-118)));
        int i20 = (i18 & i19) + (i19 | i18);
        f53040g = i20 % 128;
        if (i20 % 2 == 0) {
            int i21 = 7 / 0;
        }
    }

    public static /* synthetic */ void g(Object[] objArr) {
        all allVar = (all) objArr[0];
        int i10 = f53040g + 105;
        f53039f = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr = allVar.f53042b;
        int i12 = allVar.f53044d;
        int i13 = i12 >>> 3;
        byte b10 = bArr[i13];
        byte b11 = (byte) (1 << (i12 & 7));
        int i14 = ((~b11) & b10) | ((~b10) & b11);
        int i15 = b10 & b11;
        bArr[i13] = (byte) ((i15 & i14) | (i14 ^ i15));
        int iIdentityHashCode = System.identityHashCode(allVar);
        int i16 = (-565) - (~(-(~(i12 * 565))));
        int i17 = ~i12;
        int i18 = ~iIdentityHashCode;
        int i19 = ~(((~i18) & i17) | ((~i17) & i18) | (i17 & i18));
        int i20 = (-2) & i19;
        int i21 = (i19 | (-2)) & (~i20);
        int i22 = (i21 & i20) | (i21 ^ i20);
        int i23 = ~((i12 & i18) | (iIdentityHashCode & i17) | (i12 & iIdentityHashCode));
        int i24 = i22 & i23;
        int i25 = -(-((((i22 | i23) & (~i24)) | i24) * (-564)));
        int i26 = i16 & i25;
        int i27 = (i16 | i25) & (~i26);
        int i28 = i26 << 1;
        int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
        int i30 = (-2) & i12;
        int i31 = ((-2) ^ i12) | i30;
        int i32 = (i31 & i18) | ((~i31) & iIdentityHashCode);
        int i33 = iIdentityHashCode & i31;
        int i34 = (i33 & i32) | (i32 ^ i33);
        int i35 = ~i34;
        int i36 = ((i34 | i35) & i35) * 1128;
        int i37 = ((i29 ^ i36) | (i29 & i36)) << 1;
        int i38 = -((i36 & (~i29)) | ((~i36) & i29));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        int i40 = ~(((-2) ^ i18) | ((-2) & i18));
        int i41 = (i17 & 1) | i30;
        int i42 = i12 & 1;
        int i43 = ~((i42 & i41) | (i41 ^ i42));
        int i44 = ((~i43) & i40) | ((~i40) & i43);
        int i45 = i40 & i43;
        int i46 = ((i45 & i44) | (i44 ^ i45)) * 564;
        int i47 = i39 & i46;
        int i48 = i46 | i39;
        int i49 = (i47 ^ i48) + ((i48 & i47) << 1);
        allVar.f53044d = i49;
        int i50 = allVar.f53043c;
        long[] jArr = allVar.f53041a;
        byte[] bArr2 = allVar.f53042b;
        if (i49 == i50) {
            int i51 = f53039f;
            int i52 = i51 & 89;
            int i53 = -(-((i51 ^ 89) | i52));
            int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
            f53040g = i54 % 128;
            Object[] objArr2 = new Object[3];
            if (i54 % 2 == 0) {
                objArr2[0] = allVar;
                objArr2[1] = bArr2;
                objArr2[2] = 1;
                setCompoundDrawableTintBlendMode(objArr2, -1218641584, 1218641592, 1);
            } else {
                objArr2[0] = allVar;
                objArr2[1] = bArr2;
                objArr2[2] = 0;
                setCompoundDrawableTintBlendMode(objArr2, -1218641584, 1218641592, 0);
            }
        } else {
            int i55 = i49 >>> 6;
            int i56 = i49 & 63;
            int i57 = f53040g;
            int i58 = i57 & 63;
            int i59 = (((i57 ^ 63) | i58) << 1) - ((i57 | 63) & (~i58));
            f53039f = i59 % 128;
            int i60 = i59 % 2;
            int i61 = 0;
            int i62 = 0;
            while (i61 < i55) {
                int i63 = f53039f;
                int i64 = i63 ^ 75;
                int i65 = ((i63 & 75) | i64) << 1;
                int i66 = -i64;
                int i67 = (i65 & i66) + (i65 | i66);
                f53040g = i67 % 128;
                int i68 = i67 % 2;
                jArr[i61] = ((Long) ber.setDividerPadding(new Object[]{bArr2, Integer.valueOf(i62)}, 1511464331, -1511464319, i62)).longValue() ^ jArr[i61];
                int i69 = i62 - 108;
                i62 = ((i69 | 116) << 1) - (i69 ^ 116);
                int i70 = (((i61 | (-30)) << 1) - (~(-(((~i61) & (-30)) | (i61 & 29))))) - 1;
                int i71 = i70 & 31;
                int i72 = (i70 | 31) & (~i71);
                int i73 = -(-(i71 << 1));
                i61 = ((i72 | i73) << 1) - (i73 ^ i72);
                int i74 = f53039f;
                int i75 = (i74 | 101) << 1;
                int i76 = -(((~i74) & 101) | (i74 & (-102)));
                int i77 = ((i75 | i76) << 1) - (i76 ^ i75);
                f53040g = i77 % 128;
                int i78 = i77 % 2;
            }
            if (i56 > 0) {
                int i79 = f53039f;
                int i80 = ((i79 ^ 107) | (i79 & 107)) << 1;
                int i81 = -(((~i79) & 107) | (i79 & (-108)));
                int i82 = (i80 ^ i81) + ((i81 & i80) << 1);
                f53040g = i82 % 128;
                if (i82 % 2 == 0) {
                    jArr[i55] = jArr[i55] - (((Long) ber.setDividerPadding(new Object[]{bArr2, Integer.valueOf(i62)}, 1511464331, -1511464319, i62)).longValue() / (1 >>> i56));
                } else {
                    jArr[i55] = (((Long) ber.setDividerPadding(new Object[]{bArr2, Integer.valueOf(i62)}, 1511464331, -1511464319, i62)).longValue() & ((1 << i56) - 1)) ^ jArr[i55];
                }
            }
        }
        int i83 = allVar.f53043c;
        int iIdentityHashCode2 = System.identityHashCode(allVar);
        int i84 = -(-(i83 * 334));
        int i85 = 665 & i84;
        int i86 = -(-((i84 ^ 665) | i85));
        int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
        int i88 = i87 << 1;
        int i89 = -i87;
        int i90 = (i88 ^ i89) + ((i88 & i89) << 1);
        int i91 = ~iIdentityHashCode2;
        int i92 = (i91 | iIdentityHashCode2) & i91;
        int i93 = ~i92;
        int i94 = (i92 | i93) & i93;
        int i95 = i83 ^ iIdentityHashCode2;
        int i96 = iIdentityHashCode2 & i83;
        int i97 = ~((i96 & i95) | (i95 ^ i96));
        int i98 = ((~i97) & i94) | ((~i94) & i97);
        int i99 = i97 & i94;
        int i100 = ((i99 & i98) | (i98 ^ i99)) * 333;
        int i101 = ((i90 | i100) << 1) - (i100 ^ i90);
        int i102 = ~((i83 & i91) | (i91 ^ i83));
        int i103 = i91 ^ i102;
        int i104 = i102 & i91;
        int i105 = ((i101 - (~(((i104 & i103) | (i103 ^ i104)) * 333))) - 1) >>> 6;
        jArr[i105] = jArr[i105] ^ Long.MIN_VALUE;
        allVar.f53044d = 0;
        allVar.setCompoundDrawableTintBlendMode = true;
        int i106 = f53039f;
        int i107 = ((i106 ^ 91) | (i106 & 91)) << 1;
        int i108 = -(((~i106) & 91) | (i106 & (-92)));
        int i109 = (i107 & i108) + (i108 | i107);
        f53040g = i109 % 128;
        if (i109 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0263, code lost:
    
        if ((((r7 | r4) << 1) - (r4 ^ r7)) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0268, code lost:
    
        if ((r4 % 8) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x026c, code lost:
    
        if (r1.setCompoundDrawableTintBlendMode != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x026e, code lost:
    
        r4 = r1.f53044d;
        r8 = r1.f53042b;
        r8[r4 >>> 3] = r3;
        r3 = java.lang.System.identityHashCode(r1);
        r7 = r4 * 503;
        r10 = 4024 & r7;
        r7 = (r7 | 4024) & (~r10);
        r9 = r10 << 1;
        r10 = (r7 ^ r9) + ((r7 & r9) << 1);
        r7 = (r4 ^ 8) | (r4 & 8);
        r9 = -(-(r7 * (-502)));
        r11 = r10 | r9;
        r13 = (r11 << 1) - ((~(r9 & r10)) & r11);
        r9 = ~r4;
        r11 = (-9) & r9;
        r9 = (r9 | (-9)) & (~r11);
        r9 = ~((r9 & r11) | (r9 ^ r11));
        r11 = ~r3;
        r14 = (r11 | r3) & r11;
        r0 = ((~r14) & (-9)) | (r14 & 8);
        r14 = r14 & (-9);
        r0 = (~((r0 ^ r14) | (r0 & r14))) | r9;
        r9 = r7 & r3;
        r3 = (r3 | r7) & (~r9);
        r7 = ~((r3 ^ r9) | (r3 & r9));
        r0 = ((r0 & r7) | (r0 ^ r7)) * (-502);
        r7 = r13 & r0;
        r0 = -(-((r0 ^ r13) | r7));
        r13 = (r7 ^ r0) + ((r0 & r7) << 1);
        r0 = (-9) & r11;
        r7 = (~r0) & ((-9) | r11);
        r0 = (r0 & r7) | (r7 ^ r0);
        r7 = r0 & r4;
        r0 = ((r0 | r4) & (~r7)) | r7;
        r4 = ~r0;
        r0 = (r0 | r4) & r4;
        r3 = ~(r3 | r9);
        r4 = r0 & r3;
        r0 = (r0 | r3) & (~r4);
        r0 = ((r0 & r4) | (r0 ^ r4)) * 502;
        r3 = r13 ^ r0;
        r0 = ((((r0 & r13) | r3) << 1) - (~(-r3))) - 1;
        r1.f53044d = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0302, code lost:
    
        if (r0 != r1.f53043c) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0304, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.all.f53039f + 81;
        com.mypinpad.tsdk.isolation.all.f53040g = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x030c, code lost:
    
        if ((r0 % 2) != 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x030e, code lost:
    
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1, r8, 0}, -1218641584, 1218641592, 0);
        r1.f53044d = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0332, code lost:
    
        setCompoundDrawableTintBlendMode(new java.lang.Object[]{r1, r8, 0}, -1218641584, 1218641592, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0335, code lost:
    
        r1.f53044d = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0337, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.all.f53039f;
        r1 = r0 & 59;
        r0 = -(-((r0 ^ 59) | r1));
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.all.f53040g = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x034e, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.all.f53040g;
        r1 = r0 ^ 73;
        r0 = -(-((r0 & 73) << 1));
        r2 = (r1 & r0) + (r0 | r1);
        com.mypinpad.tsdk.isolation.all.f53039f = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0369, code lost:
    
        throw new java.lang.IllegalStateException("attempt to absorb while squeezing");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0371, code lost:
    
        throw new java.lang.IllegalStateException("attempt to absorb with odd length queue");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r94, int r95, int r96, int r97) {
        /*
            Method dump skipped, instruction units count: 1798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.all.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public final void setDividerPadding(byte[] bArr, int i10, long j10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Long.valueOf(j10)}, 1851243165, -1851243162, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final void setOnFocusChangeListener() {
        setCompoundDrawableTintBlendMode(new Object[]{this}, -61078505, 61078518, System.identityHashCode(this));
    }

    public final void setX(int i10, int i11) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10), Integer.valueOf(i11)}, 1880552318, -1880552318, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public int setY() {
        int i10 = f53040g;
        int i11 = i10 & 101;
        int i12 = -(-(i10 | 101));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53039f = i13 % 128;
        int i14 = i13 % 2;
        int i15 = this.setDividerPadding;
        return i14 != 0 ? i15 - 107 : i15 / 8;
    }

    public all() {
        this(288, akp.getNavBarTitleString);
    }

    @Override // com.mypinpad.tsdk.isolation.akv
    public final int setDividerPadding() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1346701317, -1346701306, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final void setX(byte b10) {
        setCompoundDrawableTintBlendMode(new Object[]{this, Byte.valueOf(b10)}, 956521981, -956521974, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public String setX() {
        StringBuilder sb2 = new StringBuilder("Keccak-");
        sb2.append(this.setDividerPadding);
        String string = sb2.toString();
        int i10 = f53039f;
        int i11 = i10 & 79;
        int i12 = (i10 | 79) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
        f53040g = i14 % 128;
        if (i14 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public akl setCompoundDrawableTintBlendMode() {
        akl aklVarA;
        int i10 = f53040g;
        int i11 = ((i10 | 88) << 1) - (i10 ^ 88);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53039f = i12 % 128;
        if (i12 % 2 != 0) {
            int y7 = setY() >>> 4;
            aklVarA = y0.a(new Object[]{this, Integer.valueOf(y7), this.setOnFocusChangeListener}, 1475452988, -1475452988, y7);
        } else {
            int y10 = setY() << 3;
            aklVarA = y0.a(new Object[]{this, Integer.valueOf(y10), this.setOnFocusChangeListener}, 1475452988, -1475452988, y10);
        }
        int i13 = f53040g + 117;
        f53039f = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 45 / 0;
        }
        return aklVarA;
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public int setCompoundDrawableTintBlendMode(byte[] bArr, int i10) {
        int y7;
        int i11 = f53040g;
        int i12 = (i11 & 27) + (i11 | 27);
        f53039f = i12 % 128;
        if (i12 % 2 != 0) {
            setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Long.valueOf(this.setDividerPadding)}, 1851243165, -1851243162, i10);
            setCompoundDrawableTintBlendMode(new Object[]{this}, -61078505, 61078518, System.identityHashCode(this));
            y7 = setY();
            int i13 = 92 / 0;
        } else {
            setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Long.valueOf(this.setDividerPadding)}, 1851243165, -1851243162, i10);
            setCompoundDrawableTintBlendMode(new Object[]{this}, -61078505, 61078518, System.identityHashCode(this));
            y7 = setY();
        }
        int i14 = f53039f;
        int i15 = i14 | 113;
        int i16 = ((i15 << 1) - (~(-((~(i14 & 113)) & i15)))) - 1;
        f53040g = i16 % 128;
        if (i16 % 2 != 0) {
            return y7;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.aky
    public final void setCompoundDrawableTintBlendMode(byte[] bArr, int i10, int i11) {
        setCompoundDrawableTintBlendMode(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1651784998, 1651785007, i10);
    }
}
