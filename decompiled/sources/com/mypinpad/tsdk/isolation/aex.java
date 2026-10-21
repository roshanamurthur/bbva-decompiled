package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class aex extends ads {
    public static int F0 = 0;
    public static int G0 = 1;
    public final ads[] E0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f52567y0;

    public aex(byte[] bArr, ads[] adsVarArr) {
        super(bArr);
        this.E0 = adsVarArr;
        this.f52567y0 = 1000;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:15:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:16:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:18:0x00da  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f3 A[LOOP:0: B:19:0x00ee->B:21:0x00f3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d7 A[EDGE_INSN: B:71:0x00d7->B:17:0x00d7 BREAK  A[LOOP:0: B:19:0x00ee->B:21:0x00f3], SYNTHETIC] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13;
        byte[] bArr;
        int i14;
        int i15;
        ads[] adsVarArr;
        int i16;
        byte[] bArr2;
        int i17 = ~i11;
        int i18 = ~i12;
        int i19 = ~(i17 | i18);
        int i20 = ~i10;
        int i21 = ((i19 | (~(i20 | i12))) * (-370)) + (i11 * 371) + (i10 * 371);
        int i22 = (~(i12 | i17)) | (~(i20 | i18));
        int i23 = ~(i10 | i11);
        int i24 = (i23 * 370) + ((i22 | i23) * (-370)) + i21;
        int i25 = 0;
        int i26 = 2;
        int i27 = 1;
        if (i24 == 1) {
            aex aexVar = (aex) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int i28 = F0;
            int i29 = (((i28 | 114) << 1) - (i28 ^ 114)) - 1;
            int i30 = i29 % 128;
            G0 = i30;
            if (i29 % 2 == 0) {
                int i31 = 33 / 0;
                if (zBooleanValue) {
                    int i32 = i28 & 67;
                    int i33 = (i28 ^ 67) | i32;
                    int i34 = (i32 & i33) + (i32 | i33);
                    int i35 = i34 % 128;
                    G0 = i35;
                    int i36 = i34 % 2;
                    int i37 = ((((i35 ^ 103) | (i35 & 103)) << 1) - (~(-(((~i35) & 103) | (i35 & (-104)))))) - 1;
                    F0 = i37 % 128;
                    int i38 = i37 % 2;
                    i13 = 4;
                } else {
                    int i39 = (-2) - ((i30 + 96) ^ (-1));
                    F0 = i39 % 128;
                    int i40 = i39 % 2;
                    i13 = 3;
                }
            } else if (!zBooleanValue) {
                int i310 = (-2) - ((i30 + 96) ^ (-1));
                F0 = i310 % 128;
                int i41 = i310 % 2;
                i13 = 3;
            } else {
                int i311 = i28 & 67;
                int i312 = (i28 ^ 67) | i311;
                int i313 = (i311 & i312) + (i311 | i312);
                int i314 = i313 % 128;
                G0 = i314;
                int i315 = i313 % 2;
                int i316 = ((((i314 ^ 103) | (i314 & 103)) << 1) - (~(-(((~i314) & 103) | (i314 & (-104)))))) - 1;
                F0 = i316 % 128;
                int i317 = i316 % 2;
                i13 = 4;
            }
            if (aexVar.E0 != null) {
                int i42 = G0;
                int i43 = i42 & 21;
                int i44 = (i42 ^ 21) | i43;
                int i45 = (i43 & i44) + (i44 | i43);
                F0 = i45 % 128;
                int i46 = i45 % 2;
                int i47 = 0;
                while (true) {
                    ads[] adsVarArr2 = aexVar.E0;
                    if (i47 >= adsVarArr2.length) {
                        break;
                    }
                    int i48 = F0;
                    int i49 = i48 & 5;
                    int i50 = ((i48 | 5) & (~i49)) + (i49 << 1);
                    G0 = i50 % 128;
                    int i51 = i50 % 2;
                    int iB = adsVarArr2[i47].b(true);
                    int iIdentityHashCode = System.identityHashCode(aexVar);
                    int i52 = ~iB;
                    int i53 = ~i13;
                    int i54 = ~((i52 ^ i53) | (i52 & i53));
                    int i55 = ~iIdentityHashCode;
                    int i56 = (i53 & i55) | ((~i53) & iIdentityHashCode);
                    int i57 = i53 & iIdentityHashCode;
                    int i58 = ~((i57 & i56) | (i56 ^ i57));
                    int i59 = i54 & i58;
                    int i60 = ((i58 | i54) & (~i59)) | i59;
                    int i61 = (iIdentityHashCode | i55) & i55;
                    int i62 = (i52 & i61) | ((~i61) & iB);
                    int i63 = i61 & iB;
                    int i64 = (i63 & i62) | (i62 ^ i63);
                    int i65 = ~((i64 & i13) | (i64 ^ i13));
                    int i66 = i60 ^ i65;
                    int i67 = i65 & i60;
                    int i68 = (-2) - ((((i13 * (-885)) + (iB * 1773)) - (~(((i67 & i66) | (i66 ^ i67)) * 886))) ^ (-1));
                    int i69 = (i13 & i55) | (i55 ^ i13);
                    int i70 = ~i69;
                    int i71 = (i69 | i70) & i70;
                    int i72 = iB ^ i71;
                    int i73 = i71 & iB;
                    int i74 = (i68 - (~(-(~(((i73 & i72) | (i72 ^ i73)) * (-1772)))))) - 2;
                    int i75 = i55 & iB;
                    int i76 = (iB | i55) & (~i75);
                    int i77 = (~((i75 & i76) | (i76 ^ i75))) * 886;
                    i13 = ((((i74 ^ i77) | (i74 & i77)) << 1) - (~(-((i77 & (~i74)) | ((~i77) & i74))))) - 1;
                    int i78 = i47 & 1;
                    i47 = ((i47 | 1) & (~i78)) + (i78 << 1);
                    int i79 = G0;
                    int i80 = (((i79 ^ 39) | (i79 & 39)) << 1) - (((~i79) & 39) | (i79 & (-40)));
                    F0 = i80 % 128;
                    int i81 = i80 % 2;
                }
                int i82 = G0;
                int i83 = ((i82 ^ 67) | (i82 & 67)) << 1;
                int i84 = -(((~i82) & 67) | (i82 & (-68)));
                int i85 = (i83 ^ i84) + ((i84 & i83) << 1);
                F0 = i85 % 128;
                int i86 = i85 % 2;
            } else {
                byte[] bArr3 = aexVar.f52503t0;
                int length = bArr3.length;
                int i87 = aexVar.f52567y0;
                int i88 = length / i87;
                int iIntValue = ((Integer) aft.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i87)}, -262908172, 262908174, i87)).intValue() * i88;
                int i89 = i13 & iIntValue;
                i13 = (((i13 | iIntValue) & (~i89)) - (~(i89 << 1))) - 1;
                int length2 = bArr3.length;
                int i90 = -(i88 * i87);
                int iIdentityHashCode2 = System.identityHashCode(aexVar);
                int i91 = i90 * (-344);
                int i92 = length2 * (-344);
                int i93 = i91 & i92;
                int i94 = -(-((i91 ^ i92) | i93));
                int i95 = (i93 & i94) + (i94 | i93);
                int i96 = ~i90;
                int i97 = ~length2;
                int i98 = (length2 | i97) & i97;
                int i99 = i96 ^ i98;
                int i100 = i98 & i96;
                int i101 = (i100 & i99) | (i99 ^ i100);
                int i102 = ~i101;
                int i103 = (i95 - (~(-(~(-(-((((i101 | i102) & i102) | (~((i96 ^ iIdentityHashCode2) | (i96 & iIdentityHashCode2)))) * 345))))))) - 2;
                int i104 = ~iIdentityHashCode2;
                int i105 = ~((i104 & i96) | (i96 ^ i104));
                int i106 = (i90 & i97) | (i97 ^ i90);
                int i107 = ~i106;
                int i108 = (i106 | i107) & i107;
                int i109 = ((~i108) & i105) | ((~i105) & i108);
                int i110 = i105 & i108;
                int i111 = -(-(((i110 & i109) | (i109 ^ i110)) * 345));
                int i112 = i103 & i111;
                int i113 = ((i103 ^ i111) | i112) << 1;
                int i114 = -((i111 | i103) & (~i112));
                int i115 = (i113 ^ i114) + ((i114 & i113) << 1);
                int i116 = i96 ^ i97;
                int i117 = i96 & i97;
                int i118 = (i116 & i117) | (i116 ^ i117);
                int i119 = -(-((~((iIdentityHashCode2 & i118) | (i118 ^ iIdentityHashCode2))) * 345));
                int i120 = i115 & i119;
                int i121 = ((i115 ^ i119) | i120) << 1;
                int i122 = -((i119 | i115) & (~i120));
                int i123 = (i121 ^ i122) + ((i122 & i121) << 1);
                if (i123 > 0) {
                    int i124 = G0;
                    int i125 = ((i124 | 61) << 1) - (i124 ^ 61);
                    F0 = i125 % 128;
                    int i126 = i125 % 2;
                    int i127 = -(-((Integer) aft.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i123)}, -262908172, 262908174, i123)).intValue());
                    int i128 = i13 & i127;
                    int i129 = ((i13 ^ i127) | i128) << 1;
                    int i130 = -((i13 | i127) & (~i128));
                    i13 = ((i130 & i129) << 1) + (i129 ^ i130);
                    int i131 = F0 + 39;
                    G0 = i131 % 128;
                    int i132 = i131 % 2;
                }
            }
            int i133 = F0;
            int i134 = ((i133 & (-20)) | ((~i133) & 19)) + ((i133 & 19) << 1);
            G0 = i134 % 128;
            int i135 = i134 % 2;
            return Integer.valueOf(i13);
        }
        if (i24 == 2) {
            int i136 = G0;
            int i137 = (i136 ^ 79) + ((i136 & 79) << 1);
            int i138 = i137 % 128;
            F0 = i138;
            int i139 = i137 % 2;
            int i140 = i138 + 1;
            G0 = i140 % 128;
            if (i140 % 2 != 0) {
                return Boolean.TRUE;
            }
            throw null;
        }
        if (i24 == 3) {
            ads[] adsVarArr3 = (ads[]) objArr[0];
            int i141 = F0;
            int i142 = i141 + 55;
            int i143 = i142 % 128;
            G0 = i143;
            if (i142 % 2 == 0) {
                int length3 = adsVarArr3.length;
                throw null;
            }
            int length4 = adsVarArr3.length;
            if (length4 != 0) {
                i14 = 80;
                if (length4 != 1) {
                    int i144 = (((i143 | 80) << 1) - (80 ^ i143)) - 1;
                    F0 = i144 % 128;
                    int i145 = i144 % 2;
                    int i146 = 0;
                    int i147 = 0;
                    while (i146 < length4) {
                        int i148 = F0;
                        int i149 = ((i148 & (-66)) | ((~i148) & 65)) + ((i148 & 65) << 1);
                        G0 = i149 % 128;
                        int i150 = i149 % 2;
                        int i151 = -(-adsVarArr3[i146].f52503t0.length);
                        int i152 = i147 ^ i151;
                        int i153 = (i147 & i151) << 1;
                        i147 = ((i152 | i153) << 1) - (i153 ^ i152);
                        int i154 = i146 & 1;
                        int i155 = ((i146 ^ 1) | i154) << 1;
                        int i156 = -((i146 | 1) & (~i154));
                        i146 = ((i156 & i155) << 1) + (i155 ^ i156);
                        int i157 = i148 & 115;
                        int i158 = ((i148 ^ 115) | i157) << 1;
                        int i159 = -((i148 | 115) & (~i157));
                        int i160 = (i158 ^ i159) + ((i159 & i158) << 1);
                        G0 = i160 % 128;
                        int i161 = i160 % 2;
                    }
                    byte[] bArr4 = new byte[i147];
                    int i162 = F0;
                    int i163 = i162 & 11;
                    int i164 = ((((i162 ^ 11) | i163) << 1) - (~(-((i162 | 11) & (~i163))))) - 1;
                    G0 = i164 % 128;
                    int i165 = i164 % 2;
                    int i166 = 0;
                    int i167 = 0;
                    while (i166 < length4) {
                        int i168 = F0;
                        int i169 = (-2) - ((((i168 | 70) << i27) - (i168 ^ 70)) ^ (-1));
                        G0 = i169 % 128;
                        int i170 = i169 % 2;
                        byte[] bArr5 = adsVarArr3[i166].f52503t0;
                        System.arraycopy(bArr5, i25, bArr4, i167, bArr5.length);
                        int length5 = bArr5.length;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i171 = length5 * (-523);
                        int i172 = -(-(i167 * 263));
                        int i173 = i171 & i172;
                        int i174 = (i171 | i172) & (~i173);
                        int i175 = -(-(i173 << 1));
                        int i176 = (i174 & i175) + (i174 | i175);
                        int i177 = ~length5;
                        int i178 = ~i167;
                        int i179 = i177 & i178;
                        int i180 = ((~i177) & i167) | i179;
                        int i181 = i177 & i167;
                        int i182 = (i180 & i181) | (i180 ^ i181);
                        int i183 = ~i182;
                        int i184 = (i182 | i183) & i183;
                        int i185 = i178 & length5;
                        int i186 = (~i185) & (i178 | length5);
                        int i187 = ~((i186 ^ i185) | (i186 & i185));
                        int i188 = i184 & i187;
                        byte[] bArr6 = bArr4;
                        int i189 = (~i188) & (i187 | i184);
                        int i190 = (i189 & i188) | (i189 ^ i188);
                        int i191 = i178 | iCurrentTimeMillis;
                        int i192 = ~i191;
                        int i193 = (i191 | i192) & i192;
                        int i194 = i190 & i193;
                        int i195 = (((i190 | i193) & (~i194)) | i194) * 262;
                        int i196 = i176 ^ i195;
                        int i197 = -(-((i195 & i176) << 1));
                        int i198 = ((i196 | i197) << 1) - (i197 ^ i196);
                        int i199 = (i178 | i167) & i178;
                        int i200 = (i199 & i177) | ((~i199) & length5);
                        int i201 = i199 & length5;
                        int i202 = -(-((~((i201 & i200) | (i200 ^ i201))) * (-786)));
                        int i203 = ((i198 ^ i202) | (i198 & i202)) << 1;
                        int i204 = -((i202 & (~i198)) | ((~i202) & i198));
                        int i205 = (i203 & i204) + (i204 | i203);
                        int i206 = ~iCurrentTimeMillis;
                        int i207 = (~i206) & i178;
                        int i208 = ~i178;
                        int i209 = i207 | (i206 & i208);
                        int i210 = i206 & i178;
                        int i211 = ~((i210 & i209) | (i209 ^ i210));
                        int i212 = ~((i177 ^ i167) | i181);
                        int i213 = ((~i212) & i211) | ((~i211) & i212);
                        int i214 = i211 & i212;
                        int i215 = (i214 & i213) | (i213 ^ i214);
                        int i216 = (length5 & i208) | i179;
                        int i217 = ~((i216 & i185) | (i216 ^ i185));
                        int i218 = -(-(((i215 & i217) | (i215 ^ i217)) * 262));
                        int i219 = i205 & i218;
                        i167 = (i219 - (~(-(-((i218 ^ i205) | i219))))) - 1;
                        i166++;
                        int i220 = F0;
                        int i221 = ((i220 & (-60)) | ((~i220) & 59)) + ((i220 & 59) << 1);
                        G0 = i221 % 128;
                        int i222 = i221 % 2;
                        i27 = 1;
                        bArr4 = bArr6;
                        i25 = 0;
                    }
                    byte[] bArr7 = bArr4;
                    int i223 = F0;
                    int i224 = (-2) - ((((i223 | 84) << 1) - (i223 ^ 84)) ^ (-1));
                    G0 = i224 % 128;
                    int i225 = i224 % 2;
                    return bArr7;
                }
                bArr = adsVarArr3[0].f52503t0;
                int i226 = i143 & 125;
                int i227 = (i143 ^ 125) | i226;
                int i228 = ((i226 | i227) << 1) - (i226 ^ i227);
                F0 = i228 % 128;
                if (i228 % 2 != 0) {
                    int i229 = i14 / 0;
                }
            } else {
                int i230 = i141 & 59;
                int i231 = -(-((i141 ^ 59) | i230));
                int i232 = ((i230 | i231) << 1) - (i230 ^ i231);
                G0 = i232 % 128;
                int i233 = i232 % 2;
                bArr = ads.v0;
                if (i233 == 0) {
                    i14 = 78;
                    int i2210 = i14 / 0;
                }
            }
            return bArr;
        }
        aex aexVar2 = (aex) objArr[0];
        aeb aebVar = (aeb) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i234 = G0;
        int i235 = ((i234 & 32) + (i234 | 32)) - 1;
        F0 = i235 % 128;
        if (i235 % 2 == 0) {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 36}, 1303469841, -1303469839, 36);
            aeb.setX(new Object[]{aebVar, 128}, -478708408, 478708419, 128);
            if (aexVar2.E0 == null) {
                int i236 = G0;
                int i237 = i236 | 101;
                int i238 = ((i237 << 1) - (~(-((~(i236 & 101)) & i237)))) - 1;
                F0 = i238 % 128;
                int i239 = i238 % 2;
                i16 = 0;
                while (true) {
                    bArr2 = aexVar2.f52503t0;
                    if (i16 < bArr2.length) {
                        break;
                        break;
                    }
                    int i240 = F0;
                    int i241 = i240 ^ 87;
                    int i242 = -(-((i240 & 87) << 1));
                    int i243 = (i241 & i242) + (i242 | i241);
                    G0 = i243 % 128;
                    int i244 = i243 % i26;
                    int length6 = bArr2.length;
                    int i245 = -i16;
                    int iIdentityHashCode3 = System.identityHashCode(aexVar2);
                    int i246 = i245 * (-523);
                    int i247 = -(-(length6 * 263));
                    int i248 = ((i246 ^ i247) | (i246 & i247)) << 1;
                    int i249 = -(((~i247) & i246) | ((~i246) & i247));
                    int i250 = (i248 & i249) + (i248 | i249);
                    int i251 = ~i245;
                    int i252 = i251 & length6;
                    int i253 = ~((i251 ^ length6) | i252);
                    int i254 = ~length6;
                    int i255 = i254 & (i254 | length6);
                    int i256 = (~((i255 & i251) | ((~i255) & i245) | (i255 & i245))) | i253;
                    int i257 = ~iIdentityHashCode3;
                    int i258 = ~((iIdentityHashCode3 & i255) | (i255 ^ iIdentityHashCode3));
                    int i259 = i256 & i258;
                    int i260 = (i256 | i258) & (~i259);
                    int i261 = (-2) - ((i250 - (~(((i260 & i259) | (i260 ^ i259)) * 262))) ^ (-1));
                    int i262 = i254 & i245;
                    int i263 = (i254 ^ i245) | i262;
                    int i264 = ~i263;
                    int i265 = -(-(((i263 | i264) & i264) * (-786)));
                    int i266 = ((i261 ^ i265) | (i261 & i265)) << 1;
                    int i267 = -(((~i261) & i265) | ((~i265) & i261));
                    int i268 = (i266 ^ i267) + ((i267 & i266) << 1);
                    int i269 = ((~i257) & i254) | ((~i254) & i257);
                    int i270 = i257 & i254;
                    int i271 = (i269 & i270) | (i269 ^ i270);
                    int i272 = ~i271;
                    int i273 = (i271 | i272) & i272;
                    int i274 = (i251 & i254) | ((~i251) & length6);
                    int i275 = ~((i274 & i252) | (i274 ^ i252));
                    int i276 = (i273 & i275) | (i273 ^ i275);
                    int i277 = (~i262) & (i254 | i245);
                    int i278 = (i277 & i262) | (i277 ^ i262);
                    int i279 = ~i278;
                    int i280 = (i278 | i279) & i279;
                    int i281 = ((i276 & i280) | (i276 ^ i280)) * 262;
                    int iMin = Math.min((((i268 ^ i281) | (i268 & i281)) << 1) - ((i281 & (~i268)) | ((~i281) & i268)), aexVar2.f52567y0);
                    aft.setCompoundDrawableTintBlendMode(new Object[]{aebVar, aexVar2.f52503t0, Integer.valueOf(i16), Integer.valueOf(iMin)}, -2109330963, 2109330964, i16);
                    int iIdentityHashCode4 = System.identityHashCode(aexVar2);
                    int i282 = (-2) - ((((iMin * (-711)) - (~(-(~(i16 * 713))))) - 1) ^ (-1));
                    int i283 = ~i16;
                    int i284 = i283 ^ iMin;
                    int i285 = i283 & iMin;
                    int i286 = (i284 & i285) | (i284 ^ i285);
                    int i287 = ~i286;
                    int i288 = (i286 | i287) & i287;
                    int i289 = ~iIdentityHashCode4;
                    int i290 = (i289 | iIdentityHashCode4) & i289;
                    int i291 = ((~iMin) & i290) | ((~i290) & iMin);
                    int i292 = i290 & iMin;
                    int i293 = ~((i292 & i291) | (i291 ^ i292));
                    int i294 = i288 & i293;
                    int i295 = (i288 | i293) & (~i294);
                    int i296 = ((i295 & i294) | (i295 ^ i294)) * (-712);
                    int i297 = i282 & i296;
                    int i298 = (i282 ^ i296) | i297;
                    int i299 = ((i297 | i298) << 1) - (i298 ^ i297);
                    int i300 = (i283 | i16) & i283;
                    int i301 = i300 ^ i289;
                    int i302 = i300 & i289;
                    int i303 = (i302 & i301) | (i301 ^ i302);
                    int i304 = i303 & iMin;
                    int i305 = (i303 | iMin) & (~i304);
                    int i306 = ~((i305 & i304) | (i305 ^ i304));
                    int i307 = iMin ^ i16;
                    int i308 = i16 & iMin;
                    int i309 = (i308 & i307) | (i307 ^ i308);
                    int i318 = i309 ^ iIdentityHashCode4;
                    int i319 = iIdentityHashCode4 & i309;
                    int i320 = (i319 & i318) | (i318 ^ i319);
                    int i321 = ~i320;
                    int i322 = (i320 | i321) & i321;
                    int i323 = -(~(((i322 & i306) | ((~i322) & i306) | ((~i306) & i322)) * (-712)));
                    int i324 = ((i299 & i323) + (i323 | i299)) - 1;
                    int i325 = i289 & iMin;
                    int i326 = (iMin | i289) & (~i325);
                    int i327 = ~((i326 & i325) | (i326 ^ i325));
                    i16 = (((i327 & i283) | (i283 ^ i327)) * 712) + i324;
                    int i328 = F0;
                    int i329 = i328 & 79;
                    int i330 = (i328 ^ 79) | i329;
                    int i331 = (i329 & i330) + (i330 | i329);
                    G0 = i331 % 128;
                    int i332 = i331 % 2;
                    i26 = 2;
                }
            } else {
                int i333 = F0;
                int i334 = i333 & 9;
                int i335 = ((i333 ^ 9) | i334) << 1;
                int i336 = -((i333 | 9) & (~i334));
                int i337 = ((i335 | i336) << 1) - (i336 ^ i335);
                G0 = i337 % 128;
                i15 = i337 % 2;
                adsVarArr = aexVar2.E0;
                if (i15 == 0) {
                    aebVar.d(adsVarArr);
                    int i338 = 95 / 0;
                } else {
                    aebVar.d(adsVarArr);
                }
            }
        } else {
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 116}, 1303469841, -1303469839, 116);
            aeb.setX(new Object[]{aebVar, 5943}, -478708408, 478708419, 5943);
            if (aexVar2.E0 == null) {
                int i2310 = G0;
                int i2311 = i2310 | 101;
                int i2312 = ((i2311 << 1) - (~(-((~(i2310 & 101)) & i2311)))) - 1;
                F0 = i2312 % 128;
                int i2313 = i2312 % 2;
                i16 = 0;
                while (true) {
                    bArr2 = aexVar2.f52503t0;
                    if (i16 < bArr2.length) {
                        break;
                    }
                    int i2410 = F0;
                    int i2411 = i2410 ^ 87;
                    int i2412 = -(-((i2410 & 87) << 1));
                    int i2413 = (i2411 & i2412) + (i2412 | i2411);
                    G0 = i2413 % 128;
                    int i2414 = i2413 % i26;
                    int length7 = bArr2.length;
                    int i2415 = -i16;
                    int iIdentityHashCode5 = System.identityHashCode(aexVar2);
                    int i2416 = i2415 * (-523);
                    int i2417 = -(-(length7 * 263));
                    int i2418 = ((i2416 ^ i2417) | (i2416 & i2417)) << 1;
                    int i2419 = -(((~i2417) & i2416) | ((~i2416) & i2417));
                    int i2510 = (i2418 & i2419) + (i2418 | i2419);
                    int i2511 = ~i2415;
                    int i2512 = i2511 & length7;
                    int i2513 = ~((i2511 ^ length7) | i2512);
                    int i2514 = ~length7;
                    int i2515 = i2514 & (i2514 | length7);
                    int i2516 = (~((i2515 & i2511) | ((~i2515) & i2415) | (i2515 & i2415))) | i2513;
                    int i2517 = ~iIdentityHashCode5;
                    int i2518 = ~((iIdentityHashCode5 & i2515) | (i2515 ^ iIdentityHashCode5));
                    int i2519 = i2516 & i2518;
                    int i2610 = (i2516 | i2518) & (~i2519);
                    int i2611 = (-2) - ((i2510 - (~(((i2610 & i2519) | (i2610 ^ i2519)) * 262))) ^ (-1));
                    int i2612 = i2514 & i2415;
                    int i2613 = (i2514 ^ i2415) | i2612;
                    int i2614 = ~i2613;
                    int i2615 = -(-(((i2613 | i2614) & i2614) * (-786)));
                    int i2616 = ((i2611 ^ i2615) | (i2611 & i2615)) << 1;
                    int i2617 = -(((~i2611) & i2615) | ((~i2615) & i2611));
                    int i2618 = (i2616 ^ i2617) + ((i2617 & i2616) << 1);
                    int i2619 = ((~i2517) & i2514) | ((~i2514) & i2517);
                    int i2710 = i2517 & i2514;
                    int i2711 = (i2619 & i2710) | (i2619 ^ i2710);
                    int i2712 = ~i2711;
                    int i2713 = (i2711 | i2712) & i2712;
                    int i2714 = (i2511 & i2514) | ((~i2511) & length7);
                    int i2715 = ~((i2714 & i2512) | (i2714 ^ i2512));
                    int i2716 = (i2713 & i2715) | (i2713 ^ i2715);
                    int i2717 = (~i2612) & (i2514 | i2415);
                    int i2718 = (i2717 & i2612) | (i2717 ^ i2612);
                    int i2719 = ~i2718;
                    int i2810 = (i2718 | i2719) & i2719;
                    int i2811 = ((i2716 & i2810) | (i2716 ^ i2810)) * 262;
                    int iMin2 = Math.min((((i2618 ^ i2811) | (i2618 & i2811)) << 1) - ((i2811 & (~i2618)) | ((~i2811) & i2618)), aexVar2.f52567y0);
                    aft.setCompoundDrawableTintBlendMode(new Object[]{aebVar, aexVar2.f52503t0, Integer.valueOf(i16), Integer.valueOf(iMin2)}, -2109330963, 2109330964, i16);
                    int iIdentityHashCode6 = System.identityHashCode(aexVar2);
                    int i2812 = (-2) - ((((iMin2 * (-711)) - (~(-(~(i16 * 713))))) - 1) ^ (-1));
                    int i2813 = ~i16;
                    int i2814 = i2813 ^ iMin2;
                    int i2815 = i2813 & iMin2;
                    int i2816 = (i2814 & i2815) | (i2814 ^ i2815);
                    int i2817 = ~i2816;
                    int i2818 = (i2816 | i2817) & i2817;
                    int i2819 = ~iIdentityHashCode6;
                    int i2910 = (i2819 | iIdentityHashCode6) & i2819;
                    int i2911 = ((~iMin2) & i2910) | ((~i2910) & iMin2);
                    int i2912 = i2910 & iMin2;
                    int i2913 = ~((i2912 & i2911) | (i2911 ^ i2912));
                    int i2914 = i2818 & i2913;
                    int i2915 = (i2818 | i2913) & (~i2914);
                    int i2916 = ((i2915 & i2914) | (i2915 ^ i2914)) * (-712);
                    int i2917 = i2812 & i2916;
                    int i2918 = (i2812 ^ i2916) | i2917;
                    int i2919 = ((i2917 | i2918) << 1) - (i2918 ^ i2917);
                    int i3010 = (i2813 | i16) & i2813;
                    int i3011 = i3010 ^ i2819;
                    int i3012 = i3010 & i2819;
                    int i3013 = (i3012 & i3011) | (i3011 ^ i3012);
                    int i3014 = i3013 & iMin2;
                    int i3015 = (i3013 | iMin2) & (~i3014);
                    int i3016 = ~((i3015 & i3014) | (i3015 ^ i3014));
                    int i3017 = iMin2 ^ i16;
                    int i3018 = i16 & iMin2;
                    int i3019 = (i3018 & i3017) | (i3017 ^ i3018);
                    int i3110 = i3019 ^ iIdentityHashCode6;
                    int i3111 = iIdentityHashCode6 & i3019;
                    int i3210 = (i3111 & i3110) | (i3110 ^ i3111);
                    int i3211 = ~i3210;
                    int i3212 = (i3210 | i3211) & i3211;
                    int i3213 = -(~(((i3212 & i3016) | ((~i3212) & i3016) | ((~i3016) & i3212)) * (-712)));
                    int i3214 = ((i2919 & i3213) + (i3213 | i2919)) - 1;
                    int i3215 = i2819 & iMin2;
                    int i3216 = (iMin2 | i2819) & (~i3215);
                    int i3217 = ~((i3216 & i3215) | (i3216 ^ i3215));
                    i16 = (((i3217 & i2813) | (i2813 ^ i3217)) * 712) + i3214;
                    int i3218 = F0;
                    int i3219 = i3218 & 79;
                    int i339 = (i3218 ^ 79) | i3219;
                    int i3310 = (i3219 & i339) + (i339 | i3219);
                    G0 = i3310 % 128;
                    int i3311 = i3310 % 2;
                    i26 = 2;
                }
            } else {
                int i3312 = F0;
                int i3313 = i3312 & 9;
                int i3314 = ((i3312 ^ 9) | i3313) << 1;
                int i3315 = -((i3312 | 9) & (~i3313));
                int i3316 = ((i3314 | i3315) << 1) - (i3315 ^ i3314);
                G0 = i3316 % 128;
                i15 = i3316 % 2;
                adsVarArr = aexVar2.E0;
                if (i15 == 0) {
                    aebVar.d(adsVarArr);
                    int i3317 = 95 / 0;
                } else {
                    aebVar.d(adsVarArr);
                }
            }
        }
        int i340 = i26;
        Object[] objArr2 = new Object[i340];
        objArr2[0] = aebVar;
        objArr2[1] = 0;
        aeb.setX(objArr2, -478708408, 478708419, 0);
        Object[] objArr3 = new Object[i340];
        objArr3[0] = aebVar;
        objArr3[1] = 0;
        aeb.setX(objArr3, -478708408, 478708419, 0);
        int i341 = F0;
        int i342 = (i341 & 13) + (i341 | 13);
        G0 = i342 % 128;
        int i343 = i342 % 2;
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 1455610872, -1455610871, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1613412318, 1613412318, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1295862220, -1295862218, System.identityHashCode(this))).booleanValue();
    }

    public aex(ads[] adsVarArr) {
        this((byte[]) setCompoundDrawableTintBlendMode(new Object[]{adsVarArr}, 1752883718, -1752883715, (int) System.currentTimeMillis()), adsVarArr);
    }

    public aex(byte[] bArr) {
        this(bArr, null);
    }
}
