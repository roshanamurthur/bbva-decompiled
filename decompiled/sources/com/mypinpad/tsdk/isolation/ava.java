package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import c2.b;
import java.util.Random;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public abstract class ava {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53940a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53941b = 1;

    public static /* synthetic */ Boolean a(Object[] objArr) {
        int i10;
        char c10;
        char c11;
        char c12;
        char c13;
        int i11;
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i12 = f53940a;
        int i13 = (i12 ^ 89) + ((i12 & 89) << 1);
        f53941b = i13 % 128;
        int i14 = i13 % 2;
        int length = iArr.length;
        int i15 = length << 5;
        int i16 = iArr[length + ((length ^ (-1)) | length)];
        int i17 = -((Integer) beq.setY(new Object[]{Integer.valueOf(i16)}, 339562877, -339562877, i16)).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i18 = i17 * 503;
        int i19 = -(-(i15 * 503));
        int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
        int i21 = i17 & i15;
        int i22 = (~i21) & (i17 | i15);
        int i23 = ~i15;
        int i24 = -(-((i22 | i21) * (-502)));
        int i25 = i20 & i24;
        int i26 = (((i20 ^ i24) | i25) << 1) - ((~i25) & (i24 | i20));
        int i27 = ~i17;
        int i28 = (i23 | i15) & i23;
        int i29 = ~((i28 & i27) | ((~i28) & i27) | ((~i27) & i28));
        int i30 = ~iCurrentTimeMillis;
        int i31 = (i30 | iCurrentTimeMillis) & i30;
        int i32 = i27 & i31;
        int i33 = (~i32) & (i31 | i27);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = i29 & i34;
        int i36 = ((i34 | i29) & (~i35)) | i35;
        int i37 = i17 ^ i15;
        int i38 = (i37 ^ i21) | (i37 & i21);
        int i39 = ((~i38) & iCurrentTimeMillis) | (i38 & i30);
        int i40 = i38 & iCurrentTimeMillis;
        int i41 = ~((i39 & i40) | (i39 ^ i40));
        int i42 = i36 & i41;
        int i43 = (((i41 | i36) & (~i42)) | i42) * (-502);
        int i44 = i26 & i43;
        int i45 = (i26 ^ i43) | i44;
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        int i47 = (i27 | i17) & i27;
        int i48 = i47 ^ i30;
        int i49 = i47 & i30;
        int i50 = (i49 & i48) | (i48 ^ i49);
        int i51 = i50 ^ i15;
        int i52 = i50 & i15;
        int i53 = ~((i52 & i51) | (i51 ^ i52));
        int i54 = i37 | i21;
        int i55 = (i54 & i30) | ((~i54) & iCurrentTimeMillis);
        int i56 = i54 & iCurrentTimeMillis;
        int i57 = ~((i56 & i55) | (i55 ^ i56));
        int i58 = ((i53 & i57) | (i53 ^ i57)) * 502;
        int i59 = ((~i58) & i46) | ((~i46) & i58);
        int i60 = (i58 & i46) << 1;
        int i61 = (i59 & i60) + (i60 | i59);
        int i62 = i61 & 29;
        int i63 = ((i61 ^ 29) | i62) << 1;
        int i64 = -((~i62) & (i61 | 29));
        int i65 = (((i63 | i64) << 1) - (i63 ^ i64)) / 30;
        int[] iArr4 = new int[4];
        int[] iArr5 = new int[i65];
        int[] iArr6 = new int[i65];
        int[] iArr7 = new int[i65];
        int[] iArr8 = new int[i65];
        int[] iArr9 = new int[i65];
        iArr6[0] = 1;
        setOnFocusChangeListener(new Object[]{Integer.valueOf(i61), iArr2, 0, iArr8, 0}, -936326965, 936326971, i61);
        setOnFocusChangeListener(new Object[]{Integer.valueOf(i61), iArr, 0, iArr9, 0}, -936326965, 936326971, i61);
        System.arraycopy(iArr9, 0, iArr7, 0, i65);
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i66 = i65 * 306;
        int i67 = (304 ^ i66) + ((i66 & 304) << 1);
        int i68 = ~i65;
        int i69 = i68 | i65;
        int i70 = ~i69;
        int i71 = (i69 | i70) & i70;
        int i72 = ~iCurrentTimeMillis2;
        int i73 = ~((i72 ^ iCurrentTimeMillis2) | (iCurrentTimeMillis2 & i72));
        int i74 = ((~i71) & i73) | ((~i73) & i71);
        int i75 = i73 & i71;
        int i76 = -(-(((i75 & i74) | (i74 ^ i75)) * 305));
        int i77 = i67 ^ i76;
        int i78 = ((((i76 & i67) | i77) << 1) - (~(-i77))) - 1;
        int i79 = ~i72;
        int i80 = ~((i79 & i72) | (i79 ^ i72));
        int i81 = i68 & i80;
        int i82 = (((i80 | i68) & (~i81)) | i81) * 305;
        int i83 = iArr8[((i78 | i82) << 1) - (i78 ^ i82)];
        int i84 = (i83 & 1) | (i83 ^ 1);
        int iIntValue = ((Integer) beq.setY(new Object[]{Integer.valueOf(i84)}, 339562877, -339562877, i84)).intValue();
        int i85 = i65 * 30;
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i86 = -(-(i65 * (-9030)));
        int i87 = (i86 & (-607)) | ((~i86) & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO);
        int i88 = (i86 & TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO) << 1;
        int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
        int i90 = ~iCurrentTimeMillis3;
        int i91 = (i90 & (i90 | iCurrentTimeMillis3)) | (-3);
        int i92 = ~i85;
        int i93 = (i91 & i92) | ((~i91) & i85);
        int i94 = i91 & i85;
        int i95 = (i93 ^ i94) | (i94 & i93);
        int i96 = ~i95;
        int i97 = (i95 | i96) & i96;
        int i98 = i92 & 2;
        int i99 = i85 & (-3);
        int i100 = i98 | i99;
        int i101 = i85 & 2;
        int i102 = (i100 ^ i101) | (i100 & i101);
        int i103 = i102 ^ iCurrentTimeMillis3;
        int i104 = i102 & iCurrentTimeMillis3;
        int i105 = ~((i103 ^ i104) | (i103 & i104));
        int i106 = i97 & i105;
        int i107 = (i97 | i105) & (~i106);
        int i108 = -(~(((i107 & i106) | (i107 ^ i106)) * (-302)));
        int i109 = (((i89 | i108) << 1) - (i108 ^ i89)) - 1;
        int i110 = ((-3) ^ i85) | i99;
        int i111 = i110 ^ iCurrentTimeMillis3;
        int i112 = i110 & iCurrentTimeMillis3;
        int i113 = (~((i112 & i111) | (i111 ^ i112))) * (-604);
        int i114 = i109 & i113;
        int i115 = (i113 | i109) & (~i114);
        int i116 = i114 << 1;
        int i117 = (i115 ^ i116) + ((i115 & i116) << 1);
        int i118 = (i92 ^ 2) | i98;
        int i119 = ~i118;
        int i120 = (i118 | i119) & i119;
        int i121 = (i85 ^ iCurrentTimeMillis3) | (i85 & iCurrentTimeMillis3);
        int i122 = ~i121;
        int i123 = (i121 | i122) & i122;
        int i124 = -(-(((i120 & i123) | (i120 ^ i123)) * 302));
        int i125 = i117 & i124;
        int i126 = ((i124 | i117) & (~i125)) + (i125 << 1);
        int i127 = -i61;
        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
        int i128 = (i126 * 881) + (i127 * 881);
        int i129 = ~i127;
        int i130 = ~i126;
        int i131 = ~((i129 ^ i130) | (i129 & i130));
        int i132 = i129 & (i129 | i127);
        int i133 = ~iCurrentTimeMillis4;
        int i134 = i65;
        int i135 = ((~i132) & iCurrentTimeMillis4) | (i132 & i133);
        int i136 = i132 & iCurrentTimeMillis4;
        int i137 = ~((i135 ^ i136) | (i135 & i136));
        int i138 = (i137 & i131) | (i131 ^ i137);
        int i139 = (i130 & i133) | ((~i130) & iCurrentTimeMillis4);
        int i140 = i130 & iCurrentTimeMillis4;
        int i141 = ~((i140 & i139) | (i139 ^ i140));
        int i142 = -(-(((i138 & i141) | (i138 ^ i141)) * (-880)));
        int i143 = i128 & i142;
        int i144 = (i128 ^ i142) | i143;
        int i145 = (i143 ^ i144) + ((i144 & i143) << 1);
        int i146 = (i133 | iCurrentTimeMillis4) & i133;
        int i147 = i126 | (~((i132 & i146) | (i132 ^ i146)));
        int i148 = i127 & iCurrentTimeMillis4;
        int i149 = ~((i127 ^ iCurrentTimeMillis4) | i148);
        int i150 = (i127 | iCurrentTimeMillis4) & (~i148);
        int i151 = (i150 & i148) | (i150 ^ i148);
        int i152 = ~i151;
        int i153 = -((((((i147 & i149) | (i147 ^ i149)) * (-880)) + i145) - (~(((i151 | i152) & i152) * 880))) - 1);
        int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
        int i154 = i153 * 714;
        int i155 = -(-(iIntValue * (-712)));
        int i156 = i154 & i155;
        int i157 = ((i154 | i155) & (~i156)) + (i156 << 1);
        int i158 = ~i153;
        int i159 = ~iCurrentTimeMillis5;
        int i160 = i158 & i159;
        int i161 = (~i160) & (i158 | i159);
        int i162 = (i160 & i161) | (i161 ^ i160);
        int i163 = ~i162;
        int i164 = (i162 | i163) & i163;
        int i165 = ~iIntValue;
        int i166 = ~((i158 & i165) | ((~i158) & iIntValue) | (i158 & iIntValue));
        int i167 = i164 & i166;
        int i168 = (i164 | i166) & (~i167);
        int i169 = (i168 & i167) | (i168 ^ i167);
        int i170 = (iIntValue | i165) & i165;
        int i171 = i170 ^ i153;
        int i172 = i170 & i153;
        int i173 = (i171 & i172) | (i171 ^ i172);
        int i174 = i173 & iCurrentTimeMillis5;
        int i175 = ~(((~i174) & (i173 | iCurrentTimeMillis5)) | i174);
        int i176 = i169 & i175;
        int i177 = (i175 | i169) & (~i176);
        int i178 = -(-(((i177 & i176) | (i177 ^ i176)) * (-713)));
        int i179 = i157 & i178;
        int i180 = ((i157 | i178) & (~i179)) + (i179 << 1);
        int i181 = ((~i170) & i153) | (i158 & i170);
        int i182 = (i181 & i172) | (i181 ^ i172);
        int i183 = (i182 & iCurrentTimeMillis5) | (i182 ^ iCurrentTimeMillis5);
        int i184 = ~i183;
        int i185 = -(-(((i183 | i184) & i184) * 1426));
        int i186 = (((i180 | i185) << 1) - (~(-((i185 & (~i180)) | ((~i185) & i180))))) - 1;
        int i187 = (i165 ^ i159) | (i165 & i159);
        int i188 = ~i187;
        int i189 = -(~(-(-(((i187 | i188) & i188) * 713))));
        int i190 = -(((i186 ^ i189) + ((i189 & i186) << 1)) - 1);
        int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
        int i191 = i190 * (-563);
        int i192 = ((i191 & 564) | ((~i191) & (-565))) + ((i191 & (-565)) << 1);
        int i193 = ~i190;
        int i194 = ~iCurrentTimeMillis6;
        int i195 = ~i194;
        int i196 = i195 & (i195 | i194);
        int i197 = i193 & i196;
        int i198 = ((i196 | i193) & (~i197)) | i197;
        int i199 = i194 | iCurrentTimeMillis6;
        int i200 = ~i199;
        int i201 = i198 ^ i200;
        int i202 = i198 & i200;
        int i203 = -(-(((i202 & i201) | (i201 ^ i202)) * (-564)));
        int i204 = (i192 & i203) + (i192 | i203);
        int i205 = (i193 | i190) & i193;
        int i206 = i205 | (~i205);
        int i207 = (i206 & i194) | ((~i206) & iCurrentTimeMillis6);
        int i208 = iCurrentTimeMillis6 & i206;
        int i209 = -(-((~((i208 & i207) | (i207 ^ i208))) * 1128));
        int i210 = i204 & i209;
        int i211 = (i209 | i204) & (~i210);
        int i212 = -(-(i210 << 1));
        int i213 = (i211 & i212) + (i211 | i212);
        int i214 = i194 & i199;
        int i215 = ((~i214) & i193) | ((~i193) & i214);
        int i216 = i214 & i193;
        int i217 = ~((i216 & i215) | (i215 ^ i216));
        int i218 = ~((i190 & i193) | (i193 ^ i190));
        int i219 = i217 & i218;
        int i220 = (i213 - (~((((i218 | i217) & (~i219)) | i219) * 564))) - 1;
        int i221 = iArr9[0];
        int iIntValue2 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i221)}, -1352100494, 1352100499, i221)).intValue();
        int iIntValue3 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i61)}, -1589122953, 1589122962, i61)).intValue();
        int i222 = f53940a;
        int i223 = i222 & 123;
        char c14 = 1;
        int i224 = ((((i222 ^ 123) | i223) << 1) - (~(-((i222 | 123) & (~i223))))) - 1;
        f53941b = i224 % 128;
        int i225 = 2;
        int i226 = i224 % 2;
        int i227 = i134;
        int i228 = 0;
        while (true) {
            Object[] objArr2 = new Object[i225];
            objArr2[0] = Integer.valueOf(i227);
            objArr2[c14] = iArr8;
            if (((Boolean) auy.setOnFocusChangeListener(objArr2, -358164445, 358164482, i227)).booleanValue()) {
                int i229 = i61;
                int i230 = i134;
                int i231 = iArr7[(-3) - (~(-(~i227)))] >> 31;
                int iCurrentTimeMillis7 = (int) System.currentTimeMillis();
                int i232 = i230 * (-448);
                int i233 = (-450) ^ i232;
                int i234 = -(-(((-450) & i232) << 1));
                int i235 = ((i233 | i234) << 1) - (i234 ^ i233);
                int i236 = ~i230;
                int i237 = ~i68;
                int i238 = (i237 ^ i68) | (i237 & i68) | iCurrentTimeMillis7;
                int i239 = ~i238;
                int i240 = (i238 | i239) & i239;
                int i241 = i236 & i240;
                int i242 = -(-((((i236 | i240) & (~i241)) | i241) * 449));
                int i243 = ((i235 ^ i242) | (i235 & i242)) << 1;
                int i244 = -((i242 & (~i235)) | ((~i242) & i235));
                int i245 = (i243 ^ i244) + ((i244 & i243) << 1);
                int i246 = i68 * (-1347);
                int i247 = (i245 ^ i246) + ((i246 & i245) << 1);
                int i248 = ~iCurrentTimeMillis7;
                int i249 = ((~i248) & i68) | (i237 & i248);
                int i250 = i248 & i68;
                int i251 = (i250 & i249) | (i249 ^ i250);
                int i252 = ~i251;
                int i253 = ~((i251 & i252) | (i252 ^ i251));
                int i254 = i68 & i253;
                int i255 = (i253 | i68) & (~i254);
                int iIntValue4 = iArr5[(i247 - (~(((i255 & i254) | (i255 ^ i254)) * 449))) - 1] >> 31;
                if (iIntValue4 < 0) {
                    int i256 = f53941b;
                    int i257 = i256 & 59;
                    int i258 = (i257 - (~(-(-((i256 ^ 59) | i257))))) - 1;
                    f53940a = i258 % 128;
                    if (i258 % 2 != 0) {
                        ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i230), iArr5, iArr9}, 1779691143, -1779691136, i230)).intValue();
                        throw null;
                    }
                    iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i230), iArr5, iArr9}, 1779691143, -1779691136, i230)).intValue();
                }
                if (i231 < 0) {
                    int i259 = f53940a;
                    int i260 = i259 & 41;
                    int i261 = i259 | 41;
                    c10 = 1;
                    int i262 = (i260 ^ i261) + ((i261 & i260) << 1);
                    f53941b = i262 % 128;
                    int i263 = i262 % 2;
                    iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i230), iArr5}, 66229386, -66229371, i230)).intValue();
                    ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i227), iArr7}, 66229386, -66229371, i227)).intValue();
                    int i264 = f53940a;
                    int i265 = (((i264 | 124) << 1) - (i264 ^ 124)) - 1;
                    f53941b = i265 % 128;
                    i10 = 2;
                    int i266 = i265 % 2;
                } else {
                    i10 = 2;
                    c10 = 1;
                }
                Object[] objArr3 = new Object[i10];
                objArr3[0] = Integer.valueOf(i227);
                objArr3[c10] = iArr7;
                if (!((Boolean) auy.setOnFocusChangeListener(objArr3, -2060581098, 2060581111, i227)).booleanValue()) {
                    int i267 = f53941b;
                    int i268 = i267 & 99;
                    int i269 = (((i267 ^ 99) | i268) << 1) - ((~i268) & (i267 | 99));
                    f53940a = i269 % 128;
                    boolean z10 = i269 % 2 != 0;
                    int i270 = i267 + 59;
                    f53940a = i270 % 128;
                    int i271 = i270 % 2;
                    return Boolean.valueOf(z10);
                }
                if (iIntValue4 < 0) {
                    int i272 = f53940a;
                    int i273 = (i272 & 115) - (~(-(-(i272 | 115))));
                    c11 = 1;
                    int i274 = i273 - 1;
                    f53941b = i274 % 128;
                    c12 = 2;
                    if (i274 % 2 == 0) {
                        ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i230), iArr5, iArr9}, 1779691143, -1779691136, i230)).intValue();
                        throw null;
                    }
                    c13 = 0;
                    ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i230), iArr5, iArr9}, 1779691143, -1779691136, i230)).intValue();
                } else {
                    c11 = 1;
                    c12 = 2;
                    c13 = 0;
                }
                Object[] objArr4 = new Object[5];
                objArr4[c13] = Integer.valueOf(i229);
                objArr4[c11] = iArr5;
                objArr4[c12] = 0;
                objArr4[3] = iArr3;
                objArr4[4] = 0;
                setOnFocusChangeListener(objArr4, 1124350055, -1124350054, i229);
                int i275 = f53940a + 26;
                int i276 = (i275 ^ (-1)) + (i275 << 1);
                f53941b = i276 % 128;
                int i277 = i276 % 2;
                return Boolean.TRUE;
            }
            int i278 = f53941b;
            int i279 = ((i278 | 119) << 1) - (i278 ^ 119);
            int i280 = i279 % 128;
            f53940a = i280;
            int i281 = i279 % 2;
            if (i228 >= iIntValue3) {
                int i282 = i280 + 69;
                int i283 = i282 % 128;
                f53941b = i283;
                int i284 = i282 % 2;
                int i285 = i283 & 89;
                int i286 = i285 + ((i283 ^ 89) | i285);
                f53940a = i286 % 128;
                if (i286 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            int i287 = ((i228 | 30) << 1) - (i228 ^ 30);
            int iIntValue5 = ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i220), Integer.valueOf(iArr7[0]), Integer.valueOf(iArr8[0]), iArr4}, -1743850011, 1743850011, i220)).intValue();
            Object[] objArr5 = {Integer.valueOf(i134), iArr5, iArr6, iArr4, Integer.valueOf(iIntValue2), iArr9};
            int i288 = i134;
            setOnFocusChangeListener(objArr5, 1191810770, -1191810759, i288);
            setOnFocusChangeListener(new Object[]{Integer.valueOf(i227), iArr7, iArr8, iArr4}, 171385043, -171385029, i227);
            int i289 = i227 ^ (-1);
            int i290 = -(-(i227 << 1));
            int i291 = iArr7[(i289 & i290) + (i290 | i289)];
            int iCurrentTimeMillis8 = (int) System.currentTimeMillis();
            int i292 = -(-(i227 * (-112)));
            int i293 = ((112 | i292) << 1) - (i292 ^ 112);
            int i294 = ~i227;
            int i295 = (i294 | i227) & i294;
            int i296 = iIntValue3;
            int i297 = ~iCurrentTimeMillis8;
            int i298 = i295 & i297;
            int i299 = iIntValue2;
            int i300 = (i295 ^ i297) | i298;
            int i301 = ~i300;
            int i302 = (i300 | i301) & i301;
            int i303 = -(-((i302 | (~i302)) * 226));
            int i304 = ((i293 ^ i303) | (i293 & i303)) << 1;
            int i305 = -((i303 & (~i293)) | ((~i303) & i293));
            int i306 = (i304 & i305) + (i305 | i304);
            int i307 = ((~i297) & i295) | ((~i295) & i297);
            int i308 = (i307 & i298) | (i307 ^ i298);
            int i309 = i294 & i297;
            int i310 = (i297 | i294) & (~i309);
            int i311 = (i310 & i309) | (i310 ^ i309);
            int i312 = i311 | (i311 ^ (-1));
            int i313 = ~i312;
            int i314 = (i312 | i313) & i313;
            int i315 = i308 ^ i314;
            int i316 = i314 & i308;
            int i317 = -(-(((i316 & i315) | (i315 ^ i316)) * (-113)));
            int i318 = ((~i317) & i306) | ((~i306) & i317);
            int i319 = (i317 & i306) << 1;
            int i320 = ((i318 | i319) << 1) - (i319 ^ i318);
            int i321 = -(~(-(-((~((i294 ^ iCurrentTimeMillis8) | (i294 & iCurrentTimeMillis8))) * 113))));
            int i322 = iArr8[((i320 & i321) + (i321 | i320)) - 1];
            int iCurrentTimeMillis9 = (int) System.currentTimeMillis();
            int i323 = -(~(-(-(i227 * (-667)))));
            int i324 = ((2670 ^ i323) + ((i323 & 2670) << 1)) - 1;
            int i325 = ((~iCurrentTimeMillis9) & (-2)) | (iCurrentTimeMillis9 & 1);
            int i326 = (-2) & iCurrentTimeMillis9;
            int i327 = (i325 ^ i326) | (i325 & i326);
            int i328 = ~i327;
            int i329 = (i327 | i328) & i328;
            int i330 = -(-(((i329 & i294) | (i294 ^ i329)) * (-668)));
            int i331 = i324 & i330;
            int i332 = -(-((i330 ^ i324) | i331));
            int i333 = (i331 & i332) + (i332 | i331);
            int i334 = (i294 ^ iCurrentTimeMillis9) | (i294 & iCurrentTimeMillis9);
            int i335 = ~i334;
            int i336 = (i334 | i335) & i335;
            int i337 = ((-2) & (~i336)) | (i336 & 1);
            int i338 = (-2) & i336;
            int i339 = -(-(((i337 ^ i338) | (i338 & i337)) * 1336));
            int i340 = i61;
            int i341 = ((~i339) & i333) | ((~i333) & i339);
            int i342 = -(-((i339 & i333) << 1));
            int i343 = (i341 & i342) + (i342 | i341);
            int i344 = (iCurrentTimeMillis9 | (-2)) & (~i326);
            int i345 = (i344 & i326) | (i344 ^ i326);
            int i346 = ((~i294) & i345) | ((~i345) & i294);
            int i347 = i345 & i294;
            int i348 = ((i347 & i346) | (i346 ^ i347)) * 668;
            int i349 = (((((~i348) & i343) | ((~i343) & i348)) - (~(-(-((i348 & i343) << 1))))) - 1) >> 31;
            int i350 = i291 >> 31;
            int i351 = (i350 & (~i291)) | ((~i350) & i291);
            int i352 = i349 & i351;
            int i353 = (i349 | i351) & (~i352);
            int i354 = (i353 & i352) | (i353 ^ i352);
            int i355 = (i322 >> 31) ^ i322;
            int i356 = ((~i355) & i354) | ((~i354) & i355);
            int i357 = i354 & i355;
            if (((i357 & i356) | (i356 ^ i357)) == 0) {
                int i358 = f53941b;
                int i359 = ((i358 | 19) << 1) - (i358 ^ 19);
                f53940a = i359 % 128;
                int i360 = i359 % 2;
                int i361 = (-3) - i289;
                int i362 = iArr7[i361];
                int i363 = i291 << 30;
                int i364 = i362 & i363;
                int i365 = (i362 | i363) & (~i364);
                iArr7[i361] = (i365 & i364) | (i365 ^ i364);
                int iCurrentTimeMillis10 = (int) System.currentTimeMillis();
                int i366 = -(-(i227 * (-574)));
                int i367 = 1148 & i366;
                int i368 = ((((1148 ^ i366) | i367) << 1) - (~(-((i366 | 1148) & (~i367))))) - 1;
                int i369 = ~iCurrentTimeMillis10;
                int i370 = 1 ^ i369;
                int i371 = 1 & i369;
                int i372 = ~((i370 & i371) | (i370 ^ i371));
                int i373 = ~((i294 ^ iCurrentTimeMillis10) | (i294 & iCurrentTimeMillis10));
                int i374 = i372 & i373;
                int i375 = (i372 | i373) & (~i374);
                int i376 = -(-(((i375 & i374) | (i375 ^ i374)) * 1150));
                int i377 = i368 ^ i376;
                int i378 = (((i376 & i368) | i377) << 1) - i377;
                int i379 = i295 & iCurrentTimeMillis10;
                int i380 = (~i379) & (i295 | iCurrentTimeMillis10);
                int i381 = ~((i379 & i380) | (i380 ^ i379));
                int i382 = i369 & (i369 | iCurrentTimeMillis10);
                int i383 = i382 & i227;
                int i384 = (i227 | i382) & (~i383);
                int i385 = ~((i384 & i383) | (i384 ^ i383));
                int i386 = ((i385 & i381) | ((~i385) & i381) | ((~i381) & i385)) * (-575);
                int i387 = i378 ^ i386;
                int i388 = (i378 & i386) << 1;
                int i389 = (i387 ^ i388) + ((i388 & i387) << 1);
                int i390 = 1 ^ iCurrentTimeMillis10;
                int i391 = iCurrentTimeMillis10 & 1;
                int i392 = ~((i391 & i390) | (i390 ^ i391));
                int i393 = i382 ^ (-2);
                int i394 = i382 & (-2);
                int i395 = ~((i394 & i393) | (i393 ^ i394));
                int i396 = ((i392 & i395) | ((~i395) & i392) | ((~i392) & i395)) * 575;
                int i397 = ((i389 | i396) << 1) - (i396 ^ i389);
                int i398 = iArr8[i397];
                int i399 = i322 << 30;
                int i400 = i398 ^ i399;
                int i401 = i399 & i398;
                iArr8[i397] = (i401 & i400) | (i400 ^ i401);
                i227 = (-2) - i294;
                int i402 = f53941b + 51;
                f53940a = i402 % 128;
                i11 = 2;
                int i403 = i402 % 2;
            } else {
                i11 = 2;
            }
            int i404 = f53941b + 67;
            f53940a = i404 % 128;
            int i405 = i404 % i11;
            iIntValue3 = i296;
            i228 = i287;
            iIntValue2 = i299;
            i220 = iIntValue5;
            i61 = i340;
            i225 = 2;
            c14 = 1;
            i134 = i288;
        }
    }

    public static /* synthetic */ void b(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int[] iArr2 = (int[]) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i10 = f53941b;
        int i11 = i10 ^ 19;
        int i12 = ((i10 & 19) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 & i13) + (i12 | i13);
        int i15 = i14 % 128;
        f53940a = i15;
        int i16 = i14 % 2;
        int i17 = ((i15 & 110) + (i15 | 110)) - 1;
        f53941b = i17 % 128;
        int i18 = i17 % 2;
        long j10 = 0;
        int i19 = 0;
        while (iIntValue > 0) {
            while (i19 < Math.min(32, iIntValue)) {
                int i20 = f53940a + 107;
                f53941b = i20 % 128;
                if (i20 % 2 == 0) {
                    j10 /= ((long) iArr[iIntValue2]) << i19;
                    i19 = (i19 & 40) + (i19 | 40);
                    iIntValue2 = ((iIntValue2 | 27) << 1) - (iIntValue2 ^ 27);
                } else {
                    int i21 = iIntValue2 - 13;
                    int i22 = (i21 ^ (-1)) + (i21 << 1);
                    int i23 = i22 & 15;
                    int i24 = ((i22 ^ 15) | i23) << 1;
                    int i25 = -((i22 | 15) & (~i23));
                    j10 |= ((long) iArr[iIntValue2]) << i19;
                    i19 += 30;
                    iIntValue2 = (i24 & i25) + (i24 | i25);
                }
            }
            int i26 = iIntValue3 & 24;
            int i27 = (((~i26) & (iIntValue3 | 24)) - (~(i26 << 1))) - 1;
            int i28 = (i27 & (-23)) + (i27 | (-23));
            iArr2[iIntValue3] = (int) j10;
            j10 >>>= 32;
            i19 = ((((i19 ^ (-32)) | (i19 & (-32))) << 1) - (~(-(((~i19) & (-32)) | (i19 & 31))))) - 1;
            int i29 = ((iIntValue ^ (-32)) | (iIntValue & (-32))) << 1;
            int i30 = -(((~iIntValue) & (-32)) | (iIntValue & 31));
            iIntValue = ((i29 | i30) << 1) - (i29 ^ i30);
            int i31 = f53941b;
            int i32 = i31 ^ 83;
            int i33 = ((i31 & 83) | i32) << 1;
            int i34 = -i32;
            int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
            f53940a = i35 % 128;
            int i36 = i35 % 2;
            iIntValue3 = i28;
        }
        int i37 = f53940a + 45;
        f53941b = i37 % 128;
        if (i37 % 2 == 0) {
            int i38 = 81 / 0;
        }
    }

    public static /* synthetic */ Integer c(Object[] objArr) {
        int iIntValue = ((Number) objArr[0]).intValue();
        int i10 = f53941b;
        int i11 = i10 & 109;
        int i12 = (((i10 ^ 109) | i11) << 1) - ((~i11) & (i10 | 109));
        f53940a = i12 % 128;
        int i13 = i12 % 2;
        int i14 = -(iIntValue * iIntValue);
        int i15 = (i14 * (-244)) + 492;
        int i16 = ~iIntValue;
        int i17 = (i16 | iIntValue) & i16;
        int i18 = (-3) & i17;
        int i19 = (~i18) & ((-3) | i17);
        int i20 = ~((i18 & i19) | (i19 ^ i18));
        int i21 = ~(((-3) ^ i14) | ((-3) & i14));
        int i22 = ((~i21) & i20) | ((~i20) & i21);
        int i23 = i20 & i21;
        int i24 = -(-(((i23 & i22) | (i22 ^ i23)) * (-245)));
        int i25 = i15 ^ i24;
        int i26 = -(-((i15 & i24) << 1));
        int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
        int i28 = (-3) & iIntValue;
        int i29 = (~i28) & ((-3) | iIntValue);
        int i30 = -(-((~((i29 & i28) | (i29 ^ i28))) * (-245)));
        int i31 = ((i27 | i30) << 1) - (i27 ^ i30);
        int i32 = ~(((-3) ^ iIntValue) | i28);
        int i33 = -(-(((i14 & i32) | (i14 ^ i32)) * 245));
        int i34 = i31 & i33;
        int i35 = -(-((i33 ^ i31) | i34));
        int i36 = ((i34 & i35) + (i35 | i34)) * iIntValue;
        int i37 = -(iIntValue * i36);
        int i38 = i37 * (-183);
        int i39 = i38 & (-366);
        int i40 = (i38 | (-366)) & (~i39);
        int i41 = i39 << 1;
        int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
        int i43 = ~i37;
        int i44 = i43 & i17;
        int i45 = ((i17 | i43) & (~i44)) | i44;
        int i46 = (i45 & (-3)) | ((~i45) & 2);
        int i47 = i45 & 2;
        int i48 = ~((i47 & i46) | (i46 ^ i47));
        int i49 = (-3) & i16;
        int i50 = ((~i49) & ((-3) | i16)) | i49;
        int i51 = i50 ^ i37;
        int i52 = i50 & i37;
        int i53 = ~((i52 & i51) | (i51 ^ i52));
        int i54 = i48 ^ i53;
        int i55 = i48 & i53;
        int i56 = (i42 - (~(-(-(((i55 & i54) | (i54 ^ i55)) * (-184)))))) - 1;
        int i57 = i43 & 2;
        int i58 = ((~i43) & (-3)) | i57;
        int i59 = i43 & (-3);
        int i60 = ~((i58 & i59) | (i58 ^ i59));
        int i61 = i43 & i16;
        int i62 = (i43 | i16) & (~i61);
        int i63 = ~((i62 & i61) | (i62 ^ i61));
        int i64 = i60 & i63;
        int i65 = ((i63 | i60) & (~i64)) | i64;
        int i66 = (-3) ^ i16;
        int i67 = ~((i66 & i49) | (i66 ^ i49));
        int i68 = -(-(((i67 & i65) | (i65 ^ i67)) * 184));
        int i69 = ((((~i68) & i56) | ((~i56) & i68)) - (~((i68 & i56) << 1))) - 1;
        int i70 = i57 | (i37 & (-3));
        int i71 = i37 & 2;
        int i72 = -(-(((i71 & i70) | (i70 ^ i71)) * 184));
        int i73 = i69 & i72;
        int iE = b.e(i73, ~((i72 ^ i69) | i73), 1, i36);
        int i74 = -(iIntValue * iE);
        int i75 = i74 & 2;
        int i76 = (i74 | 2) & (~i75);
        int i77 = -(-(i75 << 1));
        int i78 = ((i76 & i77) + (i76 | i77)) * iE;
        int i79 = -(iIntValue * i78);
        int i80 = i79 * (-665);
        int i81 = (-2) - (((i80 ^ 669) + ((i80 & 669) << 1)) ^ (-1));
        int i82 = ~i79;
        int i83 = i82 * (-333);
        int i84 = ((((i81 ^ i83) | (i81 & i83)) << 1) - (~(-(((~i81) & i83) | ((~i83) & i81))))) - 1;
        int i85 = i82 ^ i16;
        int i86 = i82 & i16;
        int i87 = ~((i85 & i86) | (i85 ^ i86));
        int i88 = i16 & 2;
        int i89 = i28 | i88;
        int i90 = iIntValue & 2;
        int i91 = (i89 & i90) | (i89 ^ i90);
        int i92 = ~i91;
        int i93 = (i91 | i92) & i92;
        int i94 = ((~i93) & i87) | ((~i87) & i93);
        int i95 = i93 & i87;
        int i96 = ((i95 & i94) | (i94 ^ i95)) * 333;
        int i97 = i84 & i96;
        int i98 = ((i84 ^ i96) | i97) << 1;
        int i99 = -((i96 | i84) & (~i97));
        int i100 = (i98 & i99) + (i99 | i98);
        int i101 = i82 ^ iIntValue;
        int i102 = iIntValue & i82;
        int i103 = (i102 & i101) | (i101 ^ i102);
        int i104 = ~i103;
        int i105 = (i103 | i104) & i104;
        int i106 = (i16 ^ 2) | i88;
        int i107 = ~i106;
        int i108 = (i106 | i107) & i107;
        int i109 = ((i105 & i108) | (i105 ^ i108)) * 333;
        int i110 = (((i100 | i109) << 1) - (i109 ^ i100)) * i78;
        int i111 = i10 ^ 73;
        int i112 = (i10 & 73) << 1;
        int i113 = (i111 ^ i112) + ((i111 & i112) << 1);
        f53940a = i113 % 128;
        if (i113 % 2 == 0) {
            return Integer.valueOf(i110);
        }
        throw null;
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i11 = 1;
        int[] iArr = (int[]) objArr[1];
        int i12 = 2;
        int[] iArr2 = (int[]) objArr[2];
        int i13 = f53940a;
        int i14 = i13 & 11;
        int i15 = (~i14) & (i13 | 11);
        int i16 = -(-(i14 << 1));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        f53941b = i17 % 128;
        int i18 = i17 % 2;
        int i19 = ~iIntValue;
        int i20 = (i19 | iIntValue) << 1;
        int i21 = -i19;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        int i23 = ((i13 & (-62)) | ((~i13) & 61)) + ((i13 & 61) << 1);
        f53941b = i23 % 128;
        int i24 = i23 % 2;
        int i25 = 0;
        while (i10 < i22) {
            int i26 = f53941b;
            int i27 = i26 & 75;
            int i28 = ((i26 ^ 75) | i27) << i11;
            int i29 = -((~i27) & (i26 | 75));
            int i30 = (i28 & i29) + (i28 | i29);
            f53940a = i30 % 128;
            int i31 = i30 % i12;
            int i32 = iArr[i10];
            int i33 = iArr2[i10];
            int i34 = i33 * (-496);
            int i35 = -(-(i32 * (-496)));
            int i36 = (i34 ^ i35) + ((i34 & i35) << i11);
            int i37 = ~i33;
            int i38 = (i37 | i33) & i37;
            int i39 = ~i32;
            int i40 = (~((i38 ^ i39) | (i38 & i39))) * 497;
            int i41 = i36 & i40;
            int i42 = -(-(i40 | i36));
            int i43 = (i41 & i42) + (i41 | i42);
            int i44 = (i39 | i32) & i39;
            int[] iArr3 = iArr2;
            int i45 = ((~i44) & i38) | ((~i38) & i44) | (i38 & i44);
            int i46 = ~((i45 & iIntValue) | (i45 & i19) | ((~i45) & iIntValue));
            int i47 = (i44 ^ i19) | (i44 & i19);
            int i48 = (i47 & i37) | ((~i47) & i33);
            int i49 = i47 & i33;
            int i50 = ~((i49 & i48) | (i48 ^ i49));
            int i51 = ((~i50) & i46) | ((~i46) & i50);
            int i52 = i46 & i50;
            int i53 = (((i52 & i51) | (i51 ^ i52)) * 497) + i43;
            int i54 = i37 ^ i19;
            int i55 = i37 & i19;
            int i56 = (i54 & i55) | (i54 ^ i55);
            int i57 = ~i56;
            int i58 = (i56 | i57) & i57;
            int i59 = ~((i32 & i37) | (i37 ^ i32));
            int i60 = i58 & i59;
            int i61 = (i58 | i59) & (~i60);
            int i62 = (i39 & i37) | ((~i39) & i33);
            int i63 = i39 & i33;
            int i64 = (i63 & i62) | (i62 ^ i63);
            int i65 = (i64 & i19) | ((~i64) & iIntValue);
            int i66 = i64 & iIntValue;
            int i67 = ((~((i66 & i65) | (i65 ^ i66))) | (i61 & i60) | (i61 ^ i60)) * 497;
            int i68 = ((~i67) & i53) | ((~i53) & i67);
            int i69 = -(-((i53 & i67) << 1));
            int i70 = (i68 ^ i69) + ((i69 & i68) << 1);
            int i71 = i25 & i70;
            int i72 = -(-((i25 ^ i70) | i71));
            int i73 = ((i71 | i72) << 1) - (i71 ^ i72);
            iArr[i10] = 1073741823 & i73;
            i25 = i73 >> 30;
            i10 = (i10 | 1) + (i10 & 1);
            int i74 = (i26 & (-62)) | ((~i26) & 61);
            int i75 = -(-((i26 & 61) << 1));
            int i76 = (i74 & i75) + (i74 | i75);
            f53940a = i76 % 128;
            int i77 = i76 % 2;
            iArr2 = iArr3;
            i11 = 1;
            i12 = 2;
        }
        int i78 = iArr[i22];
        int i79 = iArr2[i22];
        int i80 = i79 * 371;
        int i81 = -(-(i78 * 371));
        int i82 = ((((i80 ^ i81) | (i80 & i81)) << 1) - (~(-(((~i80) & i81) | ((~i81) & i80))))) - 1;
        int i83 = ~i78;
        int i84 = i83 & i19;
        int i85 = (i83 ^ i19) | i84;
        int i86 = ~i85;
        int i87 = (i85 | i86) & i86;
        int i88 = ~i79;
        int i89 = ~((i88 ^ iIntValue) | (i88 & iIntValue));
        int i90 = ((i87 & i89) | ((~i89) & i87) | ((~i87) & i89)) * (-370);
        int i91 = (i82 | i90) << 1;
        int i92 = -((i90 & (~i82)) | ((~i90) & i82));
        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
        int i94 = (i88 | i79) & i88;
        int i95 = ~((i94 & i19) | (i94 ^ i19));
        int i96 = ~((iIntValue & i83) | ((~i83) & iIntValue) | i84);
        int i97 = i95 ^ i96;
        int i98 = i96 & i95;
        int i99 = (i98 & i97) | (i97 ^ i98);
        int i100 = i79 & i78;
        int i101 = (i78 | i79) & (~i100);
        int i102 = ~((i101 & i100) | (i101 ^ i100));
        int i103 = i99 & i102;
        int i104 = (i99 | i102) & (~i103);
        int i105 = ((i104 & i103) | (i104 ^ i103)) * (-370);
        int i106 = i93 ^ i105;
        int i107 = (((i105 & i93) | i106) << 1) - i106;
        int i108 = i102 * 370;
        int i109 = i107 & i108;
        int i110 = ((i107 ^ i108) | i109) << 1;
        int i111 = -((i108 | i107) & (~i109));
        int i112 = -(~((i110 & i111) + (i111 | i110)));
        int i113 = ((i25 ^ i112) + ((i112 & i25) << 1)) - 1;
        iArr[i22] = i113;
        int i114 = i113 >> 30;
        int i115 = f53940a;
        int i116 = (i115 ^ 69) + ((i115 & 69) << 1);
        f53941b = i116 % 128;
        if (i116 % 2 != 0) {
            return Integer.valueOf(i114);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0050  */
    public static /* synthetic */ void e(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int[] iArr = (int[]) objArr[1];
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int[] iArr2 = (int[]) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i11 = f53941b + 115;
        f53940a = i11 % 128;
        int i12 = i11 % 2;
        long j10 = 0;
        while (iIntValue > 0) {
            int i13 = f53941b;
            int i14 = ((i13 & 96) + (i13 | 96)) - 1;
            f53940a = i14 % 128;
            if (i14 % 2 != 0) {
                if (i10 < Math.min(3, iIntValue)) {
                    int i15 = iIntValue2 & 1;
                    int i16 = (~i15) & (iIntValue2 | 1);
                    int i17 = i15 << 1;
                    int i18 = (i16 ^ i17) + ((i17 & i16) << 1);
                    j10 |= (((long) iArr[iIntValue2]) & 4294967295L) << i10;
                    i10 = (-2) - ((i10 + 33) ^ (-1));
                    int i19 = f53940a;
                    int i20 = (i19 & 91) + (i19 | 91);
                    f53941b = i20 % 128;
                    int i21 = i20 % 2;
                    iIntValue2 = i18;
                }
            } else if (i10 < Math.min(30, iIntValue)) {
                int i110 = iIntValue2 & 1;
                int i111 = (~i110) & (iIntValue2 | 1);
                int i112 = i110 << 1;
                int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
                j10 |= (((long) iArr[iIntValue2]) & 4294967295L) << i10;
                i10 = (-2) - ((i10 + 33) ^ (-1));
                int i114 = f53940a;
                int i22 = (i114 & 91) + (i114 | 91);
                f53941b = i22 % 128;
                int i23 = i22 % 2;
                iIntValue2 = i113;
            }
            int i24 = iIntValue3 & (-29);
            int i25 = ((iIntValue3 ^ (-29)) | i24) << 1;
            int i26 = -((~i24) & (iIntValue3 | (-29)));
            int i27 = (i25 ^ i26) + ((i25 & i26) << 1);
            int i28 = i27 & 30;
            iArr2[iIntValue3] = ((int) j10) & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
            j10 >>>= 30;
            i10 = (-2) - (((i10 ^ (-29)) + ((i10 & (-29)) << 1)) ^ (-1));
            int i29 = ((iIntValue | 15) << 1) - (((~iIntValue) & 15) | (iIntValue & (-16)));
            int i30 = i29 ^ (-45);
            int i31 = (i29 & (-45)) << 1;
            iIntValue = (i30 | i31) + (i30 & i31);
            int i32 = f53940a;
            int i33 = (i32 ^ 109) + ((i32 & 109) << 1);
            f53941b = i33 % 128;
            int i34 = i33 % 2;
            iIntValue3 = i28 + ((i27 ^ 30) | i28);
        }
        int i35 = f53940a;
        int i36 = (i35 & (-98)) | ((~i35) & 97);
        int i37 = (i35 & 97) << 1;
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        f53941b = i38 % 128;
        if (i38 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object f(Object[] objArr) {
        int i10 = 0;
        int[] iArr = (int[]) objArr[0];
        int length = iArr.length;
        Random random = new Random();
        int[] iArr2 = (int[]) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(length)}, 1950542281, -1950542250, length);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i11 = (length * 971) + 1939;
        int i12 = ~length;
        int i13 = (~length) | length;
        int i14 = i12 & i13;
        int i15 = ~(-1);
        int i16 = ~iCurrentTimeMillis;
        int i17 = i16 & length;
        int i18 = (i16 | length) & (~i17);
        int i19 = ~((i18 & i17) | (i18 ^ i17));
        int i20 = i15 ^ i19;
        int i21 = i15 & i19;
        int i22 = -(~(-(-(((i21 & i20) | (i20 ^ i21)) * (-970)))));
        int i23 = (i11 & i22) + (i11 | i22);
        int i24 = (i23 ^ (-1)) + (i23 << 1);
        int i25 = (~length) * 1940;
        int i26 = i24 & i25;
        int i27 = ((((i24 ^ i25) | i26) << 1) - (~(-((i24 | i25) & (~i26))))) - 1;
        int i28 = ~length;
        int i29 = (i28 | (~i28)) & (~i28);
        int i30 = ~iCurrentTimeMillis;
        int i31 = i30 & length;
        int i32 = (i30 | length) & (~i31);
        int i33 = ~((i32 & i31) | (i32 ^ i31));
        int i34 = iArr[(i27 - (~(((i33 & i29) | (i29 ^ i33)) * 970))) - 1];
        int i35 = i34 >>> 1;
        int i36 = (i34 & i35) | (i34 ^ i35);
        int i37 = i36 >>> 2;
        int i38 = (i36 & i37) | (i36 ^ i37);
        int i39 = i38 >>> 4;
        int i40 = ((~i39) & i38) | ((~i38) & i39);
        int i41 = i38 & i39;
        int i42 = (i41 & i40) | (i40 ^ i41);
        int i43 = i42 >>> 8;
        int i44 = i42 & i43;
        int i45 = (i42 | i43) & (~i44);
        int i46 = (i45 & i44) | (i45 ^ i44);
        int i47 = i46 >>> 16;
        int i48 = ((~i47) & i46) | ((~i46) & i47);
        int i49 = i46 & i47;
        int i50 = (i49 & i48) | (i48 ^ i49);
        int i51 = f53940a;
        int i52 = i51 ^ 121;
        int i53 = -(-((i51 & 121) << 1));
        int i54 = (i52 & i53) + (i53 | i52);
        f53941b = i54 % 128;
        int i55 = 2;
        int i56 = i54 % 2;
        while (true) {
            int i57 = f53940a;
            int i58 = i57 & 21;
            int i59 = (i57 | 21) & (~i58);
            int i60 = -(-(i58 << 1));
            int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
            f53941b = i61 % 128;
            int i62 = i61 % i55;
            int i63 = i10;
            while (i63 != length) {
                int i64 = f53941b;
                int i65 = (i64 ^ 77) + ((i64 & 77) << 1);
                f53940a = i65 % 128;
                int i66 = i65 % i55;
                iArr2[i63] = random.nextInt();
                int i67 = i63 ^ (-120);
                int i68 = -(-((i63 & (-120)) << 1));
                int i69 = ((i67 | i68) << 1) - (i68 ^ i67);
                int i70 = i69 & 121;
                int i71 = (i69 ^ 121) | i70;
                i63 = ((i70 | i71) << 1) - (i70 ^ i71);
                int i72 = f53941b;
                int i73 = i72 & 77;
                int i74 = i73 + ((i72 ^ 77) | i73);
                f53940a = i74 % 128;
                int i75 = i74 % i55;
            }
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i76 = -(-(length * 319));
            int i77 = 317 & i76;
            int i78 = (i77 - (~((i76 ^ TypedValues.AttributesType.TYPE_EASING) | i77))) - 1;
            int i79 = i12 & iCurrentTimeMillis2;
            int i80 = (~i79) & (i12 | iCurrentTimeMillis2);
            int i81 = ~iCurrentTimeMillis2;
            int i82 = ~(i79 | i80);
            int i83 = ~iCurrentTimeMillis2;
            int i84 = (~i83) | i83;
            int i85 = i84 & length;
            int i86 = (~i85) & (i84 | length);
            int i87 = ~((i86 & i85) | (i86 ^ i85));
            int i88 = i82 & i87;
            int i89 = (i87 | i82) & (~i88);
            int i90 = ((i89 & i88) | (i89 ^ i88)) * (-318);
            int i91 = (((~i90) & i78) | ((~i78) & i90)) + ((i90 & i78) << 1);
            int i92 = i14 ^ (-1);
            int i93 = (i92 & i14) | (i92 ^ i14);
            int i94 = (i93 | (~i93)) & (~i93);
            int i95 = ~(i81 | iCurrentTimeMillis2);
            int i96 = -(-(((i94 & i95) | ((~i95) & i94) | ((~i94) & i95)) * (-318)));
            int i97 = i91 & i96;
            int i98 = (i96 | i91) & (~i97);
            int i99 = i97 << 1;
            int i100 = ((i98 | i99) << 1) - (i98 ^ i99);
            int i101 = i12 & i13;
            int i102 = (~iCurrentTimeMillis2) & (iCurrentTimeMillis2 | (~iCurrentTimeMillis2));
            int i103 = i101 & i102;
            int i104 = (i101 | i102) & (~i103);
            int i105 = (i100 - (~(-(-(((i104 & i103) | (i104 ^ i103)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))))) - 1;
            iArr2[i105] = iArr2[i105] & i50;
            if (!((Boolean) auy.setOnFocusChangeListener(new Object[]{Integer.valueOf(length), iArr2, iArr}, 280624047, -280624046, length)).booleanValue()) {
                break;
            }
            i10 = 0;
            i55 = 2;
        }
        int i106 = f53941b + 17;
        int i107 = i106 % 128;
        f53940a = i107;
        if (i106 % 2 != 0) {
            throw null;
        }
        int i108 = i107 + 49;
        f53941b = i108 % 128;
        if (i108 % 2 != 0) {
            return iArr2;
        }
        throw null;
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        int i10;
        int i11;
        int i12 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i13 = 1;
        int[] iArr = (int[]) objArr[1];
        int i14 = f53941b;
        int i15 = (i14 ^ 123) + ((i14 & 123) << 1);
        int i16 = i15 % 128;
        f53940a = i16;
        if (i15 % 2 != 0) {
            int i17 = (-2) - (((iIntValue ^ 67) + ((iIntValue & 67) << 1)) ^ (-1));
            int i18 = ((i17 ^ 22) | (i17 & 22)) << 1;
            int i19 = -(((~i17) & 22) | (i17 & (-23)));
            i10 = (i18 & i19) + (i19 | i18);
            i11 = 1;
        } else {
            int i20 = ~iIntValue;
            int i21 = iIntValue << 1;
            i10 = (i20 ^ i21) + ((i20 & i21) << 1);
            i11 = 0;
        }
        int i22 = i16 & 17;
        int i23 = -(-(i16 | 17));
        int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
        f53941b = i24 % 128;
        int i25 = i24 % 2;
        while (i12 < i10) {
            int i26 = f53941b;
            int i27 = i26 & 27;
            int i28 = -(-(i26 | 27));
            int i29 = ((i27 | i28) << i13) - (i28 ^ i27);
            int i30 = i29 % 128;
            f53940a = i30;
            int i31 = i29 % 2;
            int i32 = -iArr[i12];
            int i33 = i32 * (-958);
            int i34 = i11 * (-958);
            int i35 = (i33 & i34) + (i33 | i34);
            int i36 = ~i11;
            int i37 = ~iIntValue;
            int i38 = ~((i36 ^ i37) | (i36 & i37));
            int i39 = ~i32;
            int i40 = i39 & iIntValue;
            int i41 = (~i40) & (i39 | iIntValue);
            int i42 = ~((i41 & i40) | (i41 ^ i40));
            int i43 = ((~i38) & i42) | ((~i42) & i38);
            int i44 = i38 & i42;
            int i45 = (i43 & i44) | (i43 ^ i44);
            int i46 = (i37 & i39) | ((~i37) & i32);
            int i47 = i37 & i32;
            int i48 = (i46 & i47) | (i46 ^ i47);
            int i49 = ~i48;
            int i50 = (i48 | i49) & i49;
            int i51 = i45 & i50;
            int i52 = i10;
            int i53 = (i45 | i50) & (~i51);
            int i54 = -(-(((i53 & i51) | (i53 ^ i51)) * 959));
            int i55 = ((i35 ^ i54) | (i35 & i54)) << 1;
            int i56 = -((i54 & (~i35)) | ((~i54) & i35));
            int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
            int i58 = i32 ^ i11;
            int i59 = i11 & i32;
            int i60 = (~((i58 & i59) | (i58 ^ i59))) * (-959);
            int i61 = i57 & i60;
            int i62 = -(-((i60 ^ i57) | i61));
            int i63 = (i61 & i62) + (i62 | i61);
            int i64 = (i39 | i32) & i39;
            int i65 = i64 & i37;
            int i66 = (i64 | i37) & (~i65);
            int i67 = ~((i66 & i65) | (i66 ^ i65));
            int i68 = i36 & iIntValue;
            int i69 = (i36 | iIntValue) & (~i68);
            int i70 = (i68 & i69) | (i69 ^ i68);
            int i71 = ~i70;
            int i72 = (i70 | i71) & i71;
            int i73 = i67 & i72;
            int i74 = (i67 | i72) & (~i73);
            int i75 = (i74 & i73) | (i74 ^ i73);
            int i76 = i47 | i40;
            int i77 = i32 & iIntValue;
            int i78 = ~((i76 & i77) | (i76 ^ i77));
            int i79 = i75 ^ i78;
            int i80 = i75 & i78;
            int i81 = (i63 - (~(((i80 & i79) | (i79 ^ i80)) * 959))) - 1;
            iArr[i12] = 1073741823 & i81;
            i11 = i81 >> 30;
            int i82 = ((i12 ^ 1) | (i12 & 1)) << 1;
            int i83 = -(((~i12) & 1) | (i12 & (-2)));
            i12 = ((i83 & i82) << 1) + (i82 ^ i83);
            int i84 = ((i30 ^ 86) + ((i30 & 86) << 1)) - 1;
            f53941b = i84 % 128;
            int i85 = i84 % 2;
            i13 = 1;
            i10 = i52;
        }
        int i86 = i10;
        int i87 = -iArr[i86];
        int i88 = i87 * 714;
        int i89 = i11 * (-712);
        int i90 = i88 ^ i89;
        int i91 = ((i88 & i89) | i90) << 1;
        int i92 = -i90;
        int i93 = (i91 ^ i92) + ((i91 & i92) << 1);
        int i94 = ~i87;
        int i95 = ~iIntValue;
        int i96 = ~((i94 ^ i95) | (i94 & i95));
        int i97 = i94 & (i94 | i87);
        int i98 = ~i11;
        int i99 = ~((i97 & i11) | (i97 ^ i11));
        int i100 = (i99 & i96) | (i96 ^ i99);
        int i101 = i98 & i87;
        int i102 = ~((i98 ^ i87) | i101 | iIntValue);
        int i103 = i100 & i102;
        int i104 = (i100 | i102) & (~i103);
        int i105 = (i93 - (~(-(~(-(-(((i104 & i103) | (i104 ^ i103)) * (-713)))))))) - 2;
        int i106 = (i87 | i98) & (~i101);
        int i107 = (i106 & i101) | (i106 ^ i101);
        int i108 = (i107 & i95) | ((~i107) & iIntValue);
        int i109 = i107 & iIntValue;
        int i110 = -(-((~((i109 & i108) | (i108 ^ i109))) * 1426));
        int i111 = i105 ^ i110;
        int i112 = (i110 & i105) << 1;
        int i113 = (i111 & i112) + (i112 | i111);
        int i114 = (i95 | iIntValue) & i95;
        int i115 = i98 & i114;
        int i116 = (i114 | i98) & (~i115);
        int i117 = -(~(-(-((~((i116 & i115) | (i116 ^ i115))) * 713))));
        int i118 = ((i113 ^ i117) + ((i117 & i113) << 1)) - 1;
        iArr[i86] = i118;
        int i119 = i118 >> 30;
        int i120 = f53941b + 73;
        f53940a = i120 % 128;
        if (i120 % 2 == 0) {
            return Integer.valueOf(i119);
        }
        throw null;
    }

    public static /* synthetic */ void h(Object[] objArr) {
        int i10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int[] iArr = (int[]) objArr[2];
        int i11 = (-2) - ((iIntValue + 61) ^ (-1));
        int i12 = (-2) - (((i11 & (-60)) + (i11 | (-60))) ^ (-1));
        int i13 = f53940a;
        int i14 = (((i13 | 116) << 1) - (i13 ^ 116)) - 1;
        f53941b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i10 < i12) {
            int i17 = f53940a;
            int i18 = i17 & 17;
            int i19 = ((i17 ^ 17) | i18) << 1;
            int i20 = -((i17 | 17) & (~i18));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = i21 % 128;
            f53941b = i22;
            if (i21 % 2 == 0) {
                int i23 = i16 % ((iArr[i10] ^ iIntValue2) << iIntValue2);
                iArr[i10] = 1073741823 & i23;
                i16 = i23 >> 83;
                int i24 = i10 & 71;
                int i25 = -(-((i10 ^ 71) | i24));
                i10 = (i24 & i25) + (i25 | i24);
            } else {
                int i26 = iArr[i10] ^ iIntValue2;
                int i27 = -iIntValue2;
                int i28 = i26 ^ i27;
                int i29 = -(-(((((i26 & i27) | i28) << 1) - (~(-i28))) - 1));
                int i30 = ((~i29) & i16) | ((~i16) & i29);
                int i31 = (i16 & i29) << 1;
                int i32 = (i30 & i31) + (i31 | i30);
                iArr[i10] = i32 & LockFreeTaskQueueCore.MAX_CAPACITY_MASK;
                i16 = i32 >> 30;
                int i33 = i10 + 73;
                i10 = (i33 & (-72)) + (i33 | (-72));
            }
            int i34 = (i22 & 23) + (i22 | 23);
            f53940a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = iArr[i12];
        int i37 = i36 & iIntValue2;
        int i38 = ((i36 ^ iIntValue2) | i37) & (~i37);
        int i39 = -iIntValue2;
        int i40 = ((i38 ^ i39) | (i38 & i39)) << 1;
        int i41 = -(((~i38) & i39) | ((~i39) & i38));
        int i42 = -(-((i40 ^ i41) + ((i41 & i40) << 1)));
        int i43 = i16 & i42;
        int i44 = ((i16 ^ i42) | i43) << 1;
        int i45 = -((i42 | i16) & (~i43));
        iArr[i12] = (i44 ^ i45) + ((i45 & i44) << 1);
        int i46 = f53941b;
        int i47 = i46 & 65;
        int i48 = (i46 ^ 65) | i47;
        int i49 = (i47 & i48) + (i48 | i47);
        f53940a = i49 % 128;
        if (i49 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x013d A[PHI: r2 r3 r6 r9
      0x013d: PHI (r2v138 int) = (r2v137 int), (r2v162 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r3v33 int) = (r3v32 int), (r3v50 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r6v55 int) = (r6v54 int), (r6v58 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x013d: PHI (r9v35 int) = (r9v34 int), (r9v39 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x014b A[PHI: r2 r3 r6 r9
      0x014b: PHI (r2v161 int) = (r2v137 int), (r2v162 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r3v49 int) = (r3v32 int), (r3v50 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r6v57 int) = (r6v54 int), (r6v58 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]
      0x014b: PHI (r9v38 int) = (r9v34 int), (r9v39 int) binds: [B:17:0x013b, B:14:0x0126] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Integer i(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr;
        int i19;
        int iE;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        char c10 = 0;
        int iIntValue = ((Number) objArr[0]).intValue();
        int i28 = 1;
        int iIntValue2 = ((Number) objArr[1]).intValue();
        int iIntValue3 = ((Number) objArr[2]).intValue();
        int[] iArr2 = (int[]) objArr[3];
        int i29 = f53940a;
        int i30 = i29 & 119;
        int i31 = ((i29 | 119) & (~i30)) + (i30 << 1);
        f53941b = i31 % 128;
        if (i31 % 2 == 0) {
            i10 = 80;
            i12 = 0;
            i13 = 0;
            i11 = 1;
        } else {
            i10 = 30;
            i11 = 0;
            i12 = 1;
            i13 = 1;
        }
        int i32 = 0;
        int i33 = iIntValue;
        while (true) {
            int i34 = (-1) << i10;
            int i35 = iIntValue3 & i34;
            int i36 = (~i35) & (i34 | iIntValue3);
            int i37 = (i35 & i36) | (i36 ^ i35);
            Object[] objArr2 = new Object[i28];
            objArr2[c10] = Integer.valueOf(i37);
            int iIntValue4 = ((Integer) beq.setY(objArr2, -315691484, 315691486, i37)).intValue();
            int i38 = iIntValue3 >> iIntValue4;
            i14 = i12 << iIntValue4;
            i15 = i32 << iIntValue4;
            int i39 = -iIntValue4;
            int i40 = ~i39;
            i16 = (((i33 & i40) | ((~i33) & i39)) - (~(-(-((i33 & i39) << i28))))) - i28;
            int i41 = i39 * (-244);
            int i42 = -(-(i10 * 246));
            int i43 = (i41 ^ i42) + ((i41 & i42) << i28);
            int i44 = ~i10;
            int i45 = ~iIntValue;
            int i46 = ~i45;
            int i47 = (i44 & i46) | ((~i44) & i45);
            int i48 = i44 & i45;
            int i49 = ~((i47 ^ i48) | (i47 & i48));
            int i50 = ~(((i10 | i44) & i44) | i39);
            int i51 = i49 ^ i50;
            int i52 = i49 & i50;
            int i53 = ((i51 & i52) | (i51 ^ i52)) * (-245);
            int i54 = ((i43 & i53) - (~(-(-(i43 | i53))))) - 1;
            int i55 = i44 & iIntValue;
            i17 = i13;
            int i56 = (~i55) & (i44 | iIntValue);
            int i57 = -(-((~((i56 ^ i55) | (i56 & i55))) * (-245)));
            i18 = i11;
            iArr = iArr2;
            int i58 = ((~i54) & i57) | ((~i57) & i54);
            int i59 = -(-((i54 & i57) << 1));
            int i60 = (i58 & i59) + (i58 | i59);
            int i61 = ~(i55 | (i44 ^ iIntValue));
            int i62 = ((~i61) & i39) | (i61 & i40);
            int i63 = i39 & i61;
            int i64 = -(-(((i63 & i62) | (i62 ^ i63)) * 245));
            int i65 = (((i60 ^ i64) | (i60 & i64)) << 1) - ((i64 & (~i60)) | ((~i64) & i60));
            if (i65 <= 0) {
                break;
            }
            int i66 = f53941b;
            int i67 = i66 & 11;
            int i68 = ((i66 ^ 11) | i67) << 1;
            int i69 = -((~i67) & (i66 | 11));
            int i70 = (i68 & i69) + (i68 | i69);
            int i71 = i70 % 128;
            f53940a = i71;
            int i72 = i70 % 2;
            if (i16 < 0) {
                int i73 = (((i66 ^ 99) | (i66 & 99)) << 1) - ((i66 & (-100)) | ((~i66) & 99));
                int i74 = i73 % 128;
                f53940a = i74;
                if (i73 % 2 != 0) {
                    i23 = -i16;
                    i24 = -iIntValue2;
                    i25 = -i14;
                    i26 = -i15;
                    if (i23 > i65) {
                        int i75 = i66 & 9;
                        int i76 = i75 + ((i66 ^ 9) | i75);
                        f53940a = i76 % 128;
                        int i77 = i76 % 2;
                        i27 = i65;
                    } else {
                        i27 = i23 + 1;
                        int i78 = i74 + 79;
                        f53941b = i78 % 128;
                        int i79 = i78 % 2;
                    }
                } else {
                    i23 = -i16;
                    i24 = -iIntValue2;
                    i25 = -i14;
                    i26 = -i15;
                    if ((((i23 ^ 1) | (i23 & 1)) << 1) - ((i23 & (-2)) | ((~i23) & 1)) > i65) {
                        int i710 = i66 & 9;
                        int i711 = i710 + ((i66 ^ 9) | i710);
                        f53940a = i711 % 128;
                        int i712 = i711 % 2;
                        i27 = i65;
                    } else {
                        i27 = i23 + 1;
                        int i713 = i74 + 79;
                        f53941b = i713 % 128;
                        int i714 = i713 % 2;
                    }
                }
                int i80 = -i27;
                int i81 = i80 & 32;
                int i82 = ((-1) >>> (((((i80 ^ 32) | i81) << 1) - (~(-((i80 | 32) & (~i81))))) - 1)) & 63;
                int i83 = i38 * i24;
                int i84 = i38 * i38;
                int i85 = i84 * Constant.ERROR_CODE_408;
                int i86 = (1626 & i85) + (i85 | 1626);
                int i87 = ~i84;
                int i88 = (i87 | i84) & i87;
                int i89 = i88 & (-2);
                int i90 = (~i89) & (i88 | (-2));
                int i91 = (i90 ^ i89) | (i90 & i89);
                int i92 = ~i91;
                int i93 = (i91 | i92) & i92;
                int i94 = iIntValue & 1;
                int i95 = ((-2) & i45) | i94;
                int i96 = i23;
                int i97 = (-2) & iIntValue;
                int i98 = ~((i95 ^ i97) | (i95 & i97));
                int i99 = i93 ^ i98;
                int i100 = i93 & i98;
                int i101 = ((i99 & i100) | (i99 ^ i100)) * (-814);
                int i102 = ((i86 | i101) << 1) - (i101 ^ i86);
                int i103 = i88 & i45;
                int i104 = ~(i103 | ((i88 | i45) & (~i103)));
                int i105 = (1 & i87) | (i84 & (-2));
                int i106 = 1 & i84;
                int i107 = (i105 ^ i106) | (i105 & i106);
                int i108 = ~i107;
                int i109 = (i107 | i108) & i108;
                int i110 = i104 & i109;
                int i111 = i24;
                int i112 = (~i110) & (i104 | i109);
                int i113 = (i112 & i110) | (i112 ^ i110);
                int i114 = (~i97) & ((-2) | iIntValue);
                int i115 = ~((i114 & i97) | (i114 ^ i97));
                int i116 = -(~(((i113 & i115) | (i113 ^ i115)) * 407));
                int i117 = (i102 & i116) + (i116 | i102);
                int i118 = (i117 ^ (-1)) + (i117 << 1);
                int i119 = ~(1 | i84);
                int i120 = i97 | (1 & i45);
                int i121 = (i120 & i94) | (i120 ^ i94);
                int i122 = ~i121;
                int i123 = (i121 | i122) & i122;
                int i124 = ((~i123) & i119) | ((~i119) & i123);
                int i125 = i123 & i119;
                int i126 = (i125 & i124) | (i124 ^ i125);
                int i127 = (i84 & i45) | (i87 & iIntValue);
                int i128 = i84 & iIntValue;
                int i129 = (i127 & i128) | (i127 ^ i128);
                int i130 = ~i129;
                int i131 = (i129 | i130) & i130;
                int i132 = ((~i131) & i126) | ((~i126) & i131);
                int i133 = i126 & i131;
                int i134 = ((i133 & i132) | (i132 ^ i133)) * 407;
                int i135 = i118 ^ i134;
                iE = i82 & b.e(((i134 & i118) | i135) << 1, ~(-i135), 1, i83);
                int i136 = f53941b;
                int i137 = (((i136 | 58) << 1) - (i136 ^ 58)) - 1;
                f53940a = i137 % 128;
                int i138 = i137 % 2;
                i20 = i96;
                iIntValue2 = i38;
                i22 = i25;
                i21 = i26;
                i32 = i17;
                i12 = i18;
                i38 = i111;
            } else {
                int i139 = -(-(i16 * 434));
                int i140 = ((-432) & i139) + (i139 | (-432));
                int i141 = (-2) & i45;
                int i142 = ((-2) ^ i45) | i141;
                int i143 = i142 & i16;
                int i144 = (i142 | i16) & (~i143);
                int i145 = -(-((~((i144 & i143) | (i144 ^ i143))) * 433));
                int i146 = i140 & i145;
                int i147 = ((i140 ^ i145) | i146) << 1;
                int i148 = -((i145 | i140) & (~i146));
                int i149 = (i147 ^ i148) + ((i148 & i147) << 1);
                int i150 = ~i16;
                int i151 = (i150 & i45) | ((~i150) & iIntValue);
                int i152 = i150 & iIntValue;
                int i153 = (i151 ^ i152) | (i151 & i152);
                int i154 = ~i153;
                int i155 = (i153 | i154) & i154;
                int i156 = (-2) ^ i155;
                int i157 = i155 & (-2);
                int i158 = -(~(((i156 & i157) | (i156 ^ i157)) * (-433)));
                int i159 = ((i149 & i158) + (i158 | i149)) - 1;
                int i160 = (iIntValue & 1) | i141;
                int i161 = (-2) & iIntValue;
                int i162 = ~((i160 ^ i161) | (i160 & i161));
                int i163 = (i150 & 1) | (i16 & (-2));
                int i164 = i16 & 1;
                int i165 = ~((i163 ^ i164) | (i163 & i164));
                int i166 = ((~i162) & i165) | ((~i165) & i162);
                int i167 = i165 & i162;
                if ((i159 - (~(-(-(((i166 & i167) | (i166 ^ i167)) * 433))))) - 1 > i65) {
                    int i168 = i66 & 75;
                    int i169 = (i168 - (~((i66 ^ 75) | i168))) - 1;
                    f53940a = i169 % 128;
                    int i170 = i169 % 2;
                    int i171 = (i66 ^ 3) + ((i66 & 3) << 1);
                    f53940a = i171 % 128;
                    int i172 = i171 % 2;
                    i19 = i65;
                } else {
                    int i173 = i16 ^ 1;
                    int i174 = (i173 | i164) << 1;
                    int i175 = -i173;
                    i19 = (i174 & i175) + (i175 | i174);
                    int i176 = i71 + 98;
                    int i177 = (i176 ^ (-1)) + (i176 << 1);
                    f53941b = i177 % 128;
                    int i178 = i177 % 2;
                }
                int i179 = -i19;
                int i180 = i179 * 253;
                int i181 = (i180 ^ 8096) + ((i180 & 8096) << 1);
                int i182 = ~i179;
                int i183 = (i182 | i179) & i182;
                int i184 = ~((i183 & (-33)) | (i183 ^ (-33)));
                int i185 = (-33) ^ i45;
                int i186 = (-33) & i45;
                int i187 = (i185 & i186) | (i185 ^ i186);
                int i188 = ~i187;
                int i189 = (i187 | i188) & i188;
                int i190 = i184 & i189;
                int i191 = (i184 | i189) & (~i190);
                int i192 = (i191 & i190) | (i191 ^ i190);
                int i193 = (i179 & (-33)) | (i182 & 32);
                int i194 = i179 & 32;
                int i195 = (i193 & i194) | (i193 ^ i194);
                int i196 = i195 & iIntValue;
                int i197 = (~i196) & (i195 | iIntValue);
                int i198 = (i197 & i196) | (i197 ^ i196);
                int i199 = ~i198;
                int i200 = (i198 | i199) & i199;
                int i201 = (i181 - (~(-(~(-(-(((i192 & i200) | (i192 ^ i200)) * (-252)))))))) - 2;
                int i202 = (~i194) & (i179 | 32);
                int i203 = (i202 & i194) | (i202 ^ i194);
                int i204 = -(-(i203 * (-252)));
                int i205 = (i201 & i204) + (i201 | i204);
                int i206 = (i46 & (-33)) | (i45 & 32);
                int i207 = (i206 & i186) | (i206 ^ i186);
                int i208 = (i179 & i207) | (i182 & i207) | ((~i207) & i179);
                int i209 = ~i208;
                int i210 = (i208 | i209) & i209;
                int i211 = i203 ^ iIntValue;
                int i212 = i203 & iIntValue;
                int i213 = ~((i211 & i212) | (i211 ^ i212));
                int i214 = i210 ^ i213;
                int i215 = i210 & i213;
                int i216 = ((i215 & i214) | (i214 ^ i215)) * 252;
                int i217 = i205 & i216;
                int i218 = ((-1) >>> ((i217 - (~((i216 ^ i205) | i217))) - 1)) & 15;
                int i219 = iIntValue2 * (-301);
                int i220 = (303 & i219) + (i219 | 303);
                int i221 = ((~i141) & ((-2) | i45)) | i141;
                int i222 = i221 & iIntValue2;
                int i223 = (i221 | iIntValue2) & (~i222);
                int i224 = ~iIntValue2;
                int i225 = ~(i223 | i222);
                int i226 = iIntValue2 & (-2);
                int i227 = (i224 & 1) | i226;
                int i228 = iIntValue2 & 1;
                int i229 = (i227 & i228) | (i227 ^ i228);
                int i230 = ~((i229 & iIntValue) | (i229 & i45) | ((~i229) & iIntValue));
                int i231 = ((~i230) & i225) | ((~i225) & i230);
                int i232 = i225 & i230;
                int i233 = -(-(((i232 & i231) | (i231 ^ i232)) * (-302)));
                int i234 = i220 & i233;
                int i235 = -(-(i233 | i220));
                int i236 = (i234 ^ i235) + ((i235 & i234) << 1);
                int i237 = ((-2) & i224) | i228 | i226;
                int i238 = (i237 & iIntValue) | (i237 ^ iIntValue);
                int i239 = ~i238;
                int i240 = -(~(-(-(((i238 | i239) & i239) * (-604)))));
                int i241 = ((i236 & i240) + (i240 | i236)) - 1;
                int i242 = (i224 | iIntValue2) & i224;
                int i243 = i242 & 1;
                int i244 = (~i243) & (i242 | 1);
                int i245 = ~((i244 & i243) | (i244 ^ i243));
                int i246 = ~(iIntValue2 | iIntValue);
                int i247 = i245 & i246;
                int i248 = (i245 | i246) & (~i247);
                int i249 = -(-((((((i248 & i247) | (i248 ^ i247)) * 302) + i241) & 4) << 1));
                int i250 = iIntValue2 & i249;
                iE = i218 & ((-(((((iIntValue2 ^ i249) | i250) << 1) - (~(-((i249 | iIntValue2) & (~i250))))) - 1)) * i38);
                int i251 = (-2) - ((f53940a + 72) ^ (-1));
                f53941b = i251 % 128;
                int i252 = i251 % 2;
                i20 = i16;
                i21 = i17;
                i22 = i18;
                i32 = i15;
                i12 = i14;
            }
            int i253 = iIntValue2 * iE;
            int i254 = i253 * 677;
            int i255 = i38 * (-675);
            int i256 = i254 & i255;
            int i257 = (i254 | i255) & (~i256);
            int i258 = -(-(i256 << 1));
            int i259 = ((i257 | i258) << 1) - (i257 ^ i258);
            int i260 = i253 & i45;
            int i261 = ~i253;
            int i262 = (iIntValue & i261) | i260;
            int i263 = i253 & iIntValue;
            int i264 = (i262 ^ i263) | (i262 & i263);
            int i265 = ~i38;
            int i266 = iIntValue2;
            int i267 = i264 & i265;
            int i268 = i20;
            int i269 = (i264 | i265) & (~i267);
            int i270 = -(-(((i267 & i269) | (i269 ^ i267)) * (-676)));
            int i271 = i259 & i270;
            int i272 = (i270 ^ i259) | i271;
            int i273 = (i271 & i272) + (i272 | i271);
            int i274 = i265 & i261;
            int i275 = ((~i265) & i253) | i274;
            int i276 = i265 & i253;
            int i277 = ~((i275 ^ i276) | (i275 & i276));
            int i278 = ~(i260 | (i45 ^ i253));
            int i279 = -(-(((i278 & i277) | (i277 ^ i278)) * 676));
            int i280 = ((~i279) & i273) | ((~i273) & i279);
            int i281 = -(-((i279 & i273) << 1));
            int i282 = ((i280 | i281) << 1) - (i281 ^ i280);
            int i283 = (~i274) & (i261 | i265);
            int i284 = ~((i274 & i283) | (i283 ^ i274));
            int i285 = (i45 | iIntValue) & i45;
            int i286 = i265 & i285;
            int i287 = ~(((i285 | i265) & (~i286)) | i286);
            int i288 = (i284 & i287) | ((~i287) & i284) | ((~i284) & i287);
            int i289 = (i253 & i38) | (i253 ^ i38);
            int i290 = (i289 & i45) | ((~i289) & iIntValue);
            int i291 = i289 & iIntValue;
            int i292 = ~((i291 & i290) | (i290 ^ i291));
            int i293 = ((i292 & i288) | (i288 ^ i292)) * 676;
            int i294 = i282 & i293;
            int i295 = -(-(i293 | i282));
            int i296 = ((i294 | i295) << 1) - (i295 ^ i294);
            int i297 = -(-(i12 * iE));
            int i298 = i22 ^ i297;
            int i299 = -(-((i297 & i22) << 1));
            i11 = ((i298 | i299) << 1) - (i299 ^ i298);
            int i300 = -(-(iE * i32));
            int i301 = i21 & i300;
            int i302 = (i300 ^ i21) | i301;
            i13 = ((i301 | i302) << 1) - (i302 ^ i301);
            int i303 = f53940a;
            int i304 = i303 & 103;
            int i305 = (i303 ^ 103) | i304;
            int i306 = ((i304 | i305) << 1) - (i305 ^ i304);
            f53941b = i306 % 128;
            int i307 = i306 % 2;
            iIntValue2 = i266;
            i33 = i268;
            iArr2 = iArr;
            i10 = i65;
            c10 = 0;
            iIntValue3 = i296;
            i28 = 1;
        }
        iArr[0] = i14;
        iArr[1] = i15;
        iArr[2] = i18;
        iArr[3] = i17;
        int i308 = f53941b;
        int i309 = (i308 ^ 7) + ((i308 & 7) << 1);
        f53940a = i309 % 128;
        if (i309 % 2 == 0) {
            return Integer.valueOf(i16);
        }
        throw null;
    }

    public static boolean setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Boolean) setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, -626394176, 626394186, (int) System.currentTimeMillis())).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0b93, code lost:
    
        if (1 != ((java.lang.Integer) setOnFocusChangeListener(new java.lang.Object[]{r1, r3, r4}, 754311344, -754311332, (int) java.lang.System.currentTimeMillis())).intValue()) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0bb6, code lost:
    
        if (((java.lang.Integer) setOnFocusChangeListener(new java.lang.Object[]{r1, r3, r4}, 754311344, -754311332, (int) java.lang.System.currentTimeMillis())).intValue() != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0bb8, code lost:
    
        r0 = com.mypinpad.tsdk.isolation.ava.f53941b;
        r1 = r0 & 101;
        r0 = (r0 ^ 101) | r1;
        r2 = ((r1 | r0) << 1) - (r0 ^ r1);
        com.mypinpad.tsdk.isolation.ava.f53940a = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0bd4, code lost:
    
        throw new java.lang.ArithmeticException("Inverse does not exist.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object setOnFocusChangeListener(java.lang.Object[] r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instruction units count: 4116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ava.setOnFocusChangeListener(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static void setX(int[] iArr, int[] iArr2, int[] iArr3) {
        setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 1200653283, -1200653275, (int) System.currentTimeMillis());
    }

    public static int[] setOnFocusChangeListener(int[] iArr) {
        return (int[]) setOnFocusChangeListener(new Object[]{iArr}, -463204584, 463204587, (int) System.currentTimeMillis());
    }

    public static int setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setOnFocusChangeListener(new Object[]{iArr, iArr2, iArr3}, 754311344, -754311332, (int) System.currentTimeMillis())).intValue();
    }

    public static int setOnFocusChangeListener(int i10) {
        return ((Integer) setOnFocusChangeListener(new Object[]{Integer.valueOf(i10)}, -1352100494, 1352100499, i10)).intValue();
    }
}
