package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class bdv extends bdy {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54599d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54600e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[][] f54601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54602c;

    public bdv(bdv bdvVar) {
        this.setY = ((Integer) bdy.setDividerPadding(new Object[]{bdvVar}, 1226377489, -1226377489, System.identityHashCode(bdvVar))).intValue();
        this.setCompoundDrawableTintBlendMode = ((Integer) bdy.setDividerPadding(new Object[]{bdvVar}, -1110144417, 1110144418, System.identityHashCode(bdvVar))).intValue();
        this.f54602c = bdvVar.f54602c;
        this.f54601b = new int[bdvVar.f54601b.length][];
        int i10 = 0;
        while (true) {
            int[][] iArr = this.f54601b;
            if (i10 >= iArr.length) {
                return;
            }
            iArr[i10] = (int[]) bds.setCompoundDrawableTintBlendMode(new Object[]{bdvVar.f54601b[i10]}, 1409201840, -1409201839, (int) System.currentTimeMillis());
            int i11 = (i10 ^ (-13)) + ((i10 & (-13)) << 1);
            int i12 = (i11 ^ (-1)) + (i11 << 1);
            i10 = ((i12 ^ 16) + ((i12 & 16) << 1)) - 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0647  */
    /* JADX WARN: Code duplicated, block: B:112:0x0652  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        Boolean bool;
        int i14;
        int i15;
        int[][] iArr;
        int i16;
        int i17;
        int i18;
        int[][] iArr2;
        int i19 = ~i10;
        int i20 = ~i11;
        int i21 = ((i10 | i20) * 948) + ((~((~i12) | i19 | i20)) * (-948)) + (((~(i20 | i12)) | i19) * (-948)) + (i11 * 949) + (i10 * (-947));
        if (i21 == 1) {
            bdv bdvVar = (bdv) objArr[0];
            Object obj = objArr[1];
            int i22 = f54599d;
            int i23 = i22 + 13;
            int i24 = i23 % 128;
            f54600e = i24;
            int i25 = i23 % 2;
            if (obj instanceof bdv) {
                bdv bdvVar2 = (bdv) obj;
                if (bdvVar.setCompoundDrawableTintBlendMode == bdvVar2.setCompoundDrawableTintBlendMode) {
                    int i26 = i24 & 43;
                    int i27 = ((((i24 ^ 43) | i26) << 1) - (~(-((~i26) & (i24 | 43))))) - 1;
                    int i28 = i27 % 128;
                    f54599d = i28;
                    int i29 = i27 % 2;
                    if (bdvVar.setY == bdvVar2.setY) {
                        int i30 = ((i28 ^ 40) + ((i28 & 40) << 1)) - 1;
                        f54600e = i30 % 128;
                        int i31 = i30 % 2;
                        if (bdvVar.f54602c == bdvVar2.f54602c) {
                            int i32 = i28 + 31;
                            f54600e = i32 % 128;
                            int i33 = i32 % 2;
                            int i34 = 0;
                            while (true) {
                                if (i34 >= bdvVar.setCompoundDrawableTintBlendMode) {
                                    int i35 = f54599d;
                                    int i36 = i35 & 77;
                                    int i37 = i36 + ((i35 ^ 77) | i36);
                                    f54600e = i37 % 128;
                                    int i38 = i37 % 2;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                                int i39 = f54600e;
                                int i40 = i39 & 49;
                                int i41 = ((((i39 ^ 49) | i40) << 1) - (~(-((i39 | 49) & (~i40))))) - 1;
                                f54599d = i41 % 128;
                                int i42 = i41 % 2;
                                int[][] iArr3 = bdvVar.f54601b;
                                int[][] iArr4 = bdvVar2.f54601b;
                                if (i42 != 0) {
                                    ((Boolean) bds.setCompoundDrawableTintBlendMode(new Object[]{iArr3[i34], iArr4[i34]}, -134876455, 134876455, (int) System.currentTimeMillis())).booleanValue();
                                    throw null;
                                }
                                if (((Boolean) bds.setCompoundDrawableTintBlendMode(new Object[]{iArr3[i34], iArr4[i34]}, -134876455, 134876455, (int) System.currentTimeMillis())).booleanValue()) {
                                    i34 = ((i34 & 1) << 1) + ((i34 & (-2)) | ((~i34) & 1));
                                    int i43 = f54600e;
                                    int i44 = (i43 & (-110)) | ((~i43) & 109);
                                    int i45 = -(-((i43 & 109) << 1));
                                    int i46 = (i44 & i45) + (i45 | i44);
                                    f54599d = i46 % 128;
                                    int i47 = i46 % 2;
                                } else {
                                    int i48 = f54600e;
                                    int i49 = (i48 ^ 85) + ((i48 & 85) << 1);
                                    f54599d = i49 % 128;
                                    int i50 = i49 % 2;
                                }
                            }
                        } else {
                            i13 = f54600e + 123;
                            f54599d = i13 % 128;
                            if (i13 % 2 != 0) {
                                int i51 = 30 / 0;
                            }
                        }
                    } else {
                        i13 = f54600e + 123;
                        f54599d = i13 % 128;
                        if (i13 % 2 != 0) {
                            int i52 = 30 / 0;
                        }
                    }
                } else {
                    i13 = f54600e + 123;
                    f54599d = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i53 = 30 / 0;
                    }
                }
                return bool;
            }
            int i54 = i22 ^ 107;
            int i55 = (((i22 & 107) | i54) << 1) - i54;
            int i56 = i55 % 128;
            f54600e = i56;
            int i57 = i55 % 2;
            int i58 = (((i56 | 30) << 1) - (i56 ^ 30)) - 1;
            f54599d = i58 % 128;
            if (i58 % 2 != 0) {
                throw null;
            }
            bool = Boolean.FALSE;
            return bool;
        }
        if (i21 == 2) {
            bdv bdvVar3 = (bdv) objArr[0];
            int i59 = f54600e;
            int i60 = (i59 ^ 125) + ((i59 & 125) << 1);
            int i61 = i60 % 128;
            f54599d = i61;
            if (i60 % 2 == 0 ? (i14 = bdvVar3.setY & 31) != 0 : (i14 = bdvVar3.setY & 28) != 0) {
                i15 = (-2) - (bdvVar3.f54602c ^ (-1));
                int i62 = (i61 ^ 2) + ((i61 & 2) << 1);
                int i63 = (i62 ^ (-1)) + (i62 << 1);
                f54600e = i63 % 128;
                int i64 = i63 % 2;
            } else {
                int i65 = i59 ^ 11;
                int i66 = -(-((i59 & 11) << 1));
                int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
                f54599d = i67 % 128;
                int i68 = i67 % 2;
                i15 = bdvVar3.f54602c;
                if (i68 != 0) {
                    int i69 = 59 / 0;
                }
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i70 = f54599d + 79;
            f54600e = i70 % 128;
            int i71 = i70 % 2;
            int i72 = 0;
            while (i72 < bdvVar3.setCompoundDrawableTintBlendMode) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(i72);
                sb2.append(": ");
                stringBuffer.append(sb2.toString());
                int i73 = f54599d;
                int i74 = i73 & 15;
                int i75 = (i73 | 15) & (~i74);
                int i76 = -(-(i74 << 1));
                int i77 = (i75 ^ i76) + ((i75 & i76) << 1);
                f54600e = i77 % 128;
                int i78 = i77 % 2;
                int i79 = 0;
                while (true) {
                    iArr = bdvVar3.f54601b;
                    if (i79 >= i15) {
                        break;
                    }
                    int i80 = f54599d;
                    int i81 = (((i80 ^ 9) | (i80 & 9)) << 1) - (((~i80) & 9) | (i80 & (-10)));
                    f54600e = i81 % 128;
                    int i82 = i81 % 2 == 0 ? iArr[i72][i79] : iArr[i72][i79];
                    int i83 = 0;
                    while (i83 < 32) {
                        int i84 = f54600e + 99;
                        f54599d = i84 % 128;
                        if (i84 % 2 == 0 ? ((i82 >>> i83) & 1) != 0 : ((i82 << i83) & 1) != 0) {
                            stringBuffer.append('1');
                            int i85 = f54599d;
                            i18 = (i85 & 47) + (i85 | 47);
                        } else {
                            stringBuffer.append('0');
                            int i86 = f54599d;
                            int i87 = i86 & 33;
                            i18 = (i87 - (~((i86 ^ 33) | i87))) - 1;
                        }
                        f54600e = i18 % 128;
                        int i88 = i18 % 2;
                        i83 = (((i83 | 81) << 1) - (i83 ^ 81)) - 80;
                        int i89 = f54599d;
                        int i90 = (i89 & 45) + (i89 | 45);
                        f54600e = i90 % 128;
                        int i91 = i90 % 2;
                    }
                    stringBuffer.append(' ');
                    int i92 = i79 & (-23);
                    int i93 = (i92 - (~((i79 ^ (-23)) | i92))) - 1;
                    i79 = ((((i93 ^ 24) | (i93 & 24)) << 1) - (~(-(((~i93) & 24) | (i93 & (-25)))))) - 1;
                    int i94 = f54600e;
                    int i95 = i94 & 89;
                    int i96 = -(-(i94 | 89));
                    int i97 = ((i95 | i96) << 1) - (i96 ^ i95);
                    f54599d = i97 % 128;
                    int i98 = i97 % 2;
                }
                int i99 = iArr[i72][bdvVar3.f54602c - 1];
                int i100 = f54600e + 81;
                f54599d = i100 % 128;
                int i101 = i100 % 2;
                int i102 = 0;
                while (i102 < i14) {
                    int i103 = f54600e;
                    int i104 = ((i103 | 78) << 1) - (i103 ^ 78);
                    int i105 = (i104 ^ (-1)) + (i104 << 1);
                    int i106 = i105 % 128;
                    f54599d = i106;
                    int i107 = i105 % 2;
                    if (((i99 >>> i102) & 1) == 0) {
                        int i108 = i106 + 101;
                        f54600e = i108 % 128;
                        int i109 = i108 % 2;
                        stringBuffer.append('0');
                        int i110 = f54599d;
                        i16 = (i110 & (-24)) | (23 & (~i110));
                        i17 = ~((i110 & 23) << 1);
                    } else {
                        stringBuffer.append('1');
                        int i111 = f54599d;
                        i16 = (i111 | 84) << 1;
                        i17 = i111 ^ 84;
                    }
                    int i112 = (i16 - i17) - 1;
                    f54600e = i112 % 128;
                    int i113 = i112 % 2;
                    i102++;
                    int i114 = f54599d;
                    int i115 = ((i114 | 97) << 1) - (i114 ^ 97);
                    f54600e = i115 % 128;
                    int i116 = i115 % 2;
                }
                stringBuffer.append('\n');
                int i117 = (i72 | 66) << 1;
                int i118 = -(((~i72) & 66) | (i72 & (-67)));
                int i119 = ((i117 | i118) << 1) - (i118 ^ i117);
                int i120 = i119 ^ (-65);
                int i121 = ((i119 & (-65)) | i120) << 1;
                int i122 = -i120;
                i72 = ((i122 & i121) << 1) + (i121 ^ i122);
                int i123 = f54599d;
                int i124 = ((i123 & 53) - (~(-(-(i123 | 53))))) - 1;
                f54600e = i124 % 128;
                int i125 = i124 % 2;
            }
            String string = stringBuffer.toString();
            int i126 = f54600e;
            int i127 = (i126 | 11) << 1;
            int i128 = -(((~i126) & 11) | (i126 & (-12)));
            int i129 = (i127 & i128) + (i128 | i127);
            f54599d = i129 % 128;
            int i130 = i129 % 2;
            return string;
        }
        int i131 = 3;
        if (i21 == 3) {
            bdv bdvVar4 = (bdv) objArr[0];
            int i132 = f54599d;
            int i133 = i132 ^ 35;
            int i134 = ((i132 & 35) | i133) << 1;
            int i135 = -i133;
            int i136 = (i134 ^ i135) + ((i134 & i135) << 1);
            f54600e = i136 % 128;
            int i137 = i136 % 2;
            int i138 = bdvVar4.setCompoundDrawableTintBlendMode * 31;
            int i139 = -(-bdvVar4.setY);
            int i140 = ((i138 | i139) << 1) - (i138 ^ i139);
            int i141 = i140 * 31;
            int iIdentityHashCode = System.identityHashCode(bdvVar4);
            int i142 = bdvVar4.f54602c;
            int i143 = i142 * 69;
            int i144 = i140 * (-2077);
            int i145 = i143 & i144;
            int i146 = -(-((i144 ^ i143) | i145));
            int i147 = (i145 ^ i146) + ((i146 & i145) << 1);
            int i148 = ~i142;
            int i149 = ~i141;
            int i150 = i149 & (i149 | i141);
            int i151 = ~i150;
            int i152 = (i148 & i151) | ((~i148) & i150);
            int i153 = i148 & i150;
            int i154 = (i152 & i153) | (i152 ^ i153);
            int i155 = ~iIdentityHashCode;
            int i156 = (i155 | iIdentityHashCode) & i155;
            int i157 = ~((i154 & i156) | (i154 ^ i156));
            int i158 = ~((i142 & i141) | (i142 ^ i141));
            int i159 = i157 & i158;
            int i160 = (i158 | i157) & (~i159);
            int i161 = (i160 & i159) | (i160 ^ i159);
            int i162 = ~((iIdentityHashCode & i141) | (i141 ^ iIdentityHashCode));
            int i163 = i161 & i162;
            int i164 = (i162 | i161) & (~i163);
            int i165 = ((i164 & i163) | (i164 ^ i163)) * (-68);
            int i166 = i147 & i165;
            int i167 = (i165 | i147) & (~i166);
            int i168 = -(-(i166 << 1));
            int i169 = (i167 ^ i168) + ((i167 & i168) << 1);
            int i170 = i148 & i155;
            int i171 = (~i170) & (i148 | i155);
            int i172 = (i170 & i171) | (i171 ^ i170);
            int i173 = i172 ^ i141;
            int i174 = i141 & i172;
            int i175 = (i174 & i173) | (i173 ^ i174);
            int i176 = ~i175;
            int i177 = ((i175 | i176) & i176) * (-68);
            int i178 = (((i169 ^ i177) | (i169 & i177)) << 1) - ((i177 & (~i169)) | ((~i177) & i169));
            int i179 = ((~i155) & i150) | (i155 & i151) | (i150 & i155);
            int i180 = ~i179;
            int i181 = (i179 | i180) & i180;
            int i182 = (((i181 & i148) | (i148 ^ i181)) * 68) + i178;
            int i183 = f54599d;
            int i184 = i183 ^ 5;
            int i185 = ((i183 & 5) | i184) << 1;
            int i186 = -i184;
            int i187 = ((i185 | i186) << 1) - (i185 ^ i186);
            f54600e = i187 % 128;
            int i188 = i187 % 2;
            int i189 = 0;
            while (i189 < bdvVar4.setCompoundDrawableTintBlendMode) {
                int i190 = f54600e;
                int i191 = (i190 & 93) + (i190 | 93);
                f54599d = i191 % 128;
                int i192 = i191 % 2;
                i182 = ((i182 * 31) - (~(-(-((Integer) bek.setOnFocusChangeListener(new Object[]{bdvVar4.f54601b[i189]}, 2105780221, -2105780203, (int) System.currentTimeMillis())).intValue())))) - 1;
                int i193 = i189 & 1;
                i189 = ((((i189 ^ 1) | i193) << 1) - (~(-((i189 | 1) & (~i193))))) - 1;
                int i194 = f54600e;
                int i195 = (i194 ^ 63) + ((i194 & 63) << 1);
                f54599d = i195 % 128;
                int i196 = i195 % 2;
            }
            int i197 = f54600e;
            int i198 = i197 & 101;
            int i199 = i197 | 101;
            int i200 = (i198 ^ i199) + ((i199 & i198) << 1);
            f54599d = i200 % 128;
            if (i200 % 2 == 0) {
                return Integer.valueOf(i182);
            }
            throw null;
        }
        bdv bdvVar5 = (bdv) objArr[0];
        int i201 = f54600e;
        int i202 = ((i201 ^ 69) - (~((i201 & 69) << 1))) - 1;
        f54599d = i202 % 128;
        int i203 = i202 % 2;
        int i204 = bdvVar5.setY;
        int iIdentityHashCode2 = System.identityHashCode(bdvVar5);
        int i205 = 1154 - (~(-(-(i204 * (-163)))));
        int i206 = ~iIdentityHashCode2;
        int i207 = (i206 ^ i204) | (i206 & i204);
        int i208 = ~i207;
        int i209 = (i207 | i208) & i208;
        int i210 = ((~i209) & 7) | (i209 & (-8));
        int i211 = i209 & 7;
        int i212 = ((i211 & i210) | (i210 ^ i211)) * (-328);
        int i213 = i205 & i212;
        int i214 = i213 + ((i205 ^ i212) | i213);
        int i215 = iIdentityHashCode2 ^ 7;
        int i216 = iIdentityHashCode2 & 7;
        int i217 = ((i215 & i216) | (i215 ^ i216)) * 164;
        int i218 = (i214 & i217) + (i217 | i214);
        int i219 = ~i204;
        int i220 = (-8) ^ i219;
        int i221 = (-8) & i219;
        int i222 = (i221 & i220) | (i220 ^ i221);
        int i223 = ~i222;
        int i224 = (i222 | i223) & i223;
        int i225 = (i219 & i206) | ((~i219) & iIdentityHashCode2);
        int i226 = i219 & iIdentityHashCode2;
        int i227 = ~((i226 & i225) | (i225 ^ i226));
        int i228 = i224 & i227;
        int i229 = (i227 | i224) & (~i228);
        int i230 = (i229 & i228) | (i229 ^ i228);
        int i231 = (iIdentityHashCode2 | i206) & i206;
        int i232 = i231 & 7;
        int i233 = (i231 | 7) & (~i232);
        int i234 = (i233 & i232) | (i233 ^ i232);
        int i235 = ~((i204 & i234) | (i234 ^ i204));
        int i236 = i230 ^ i235;
        int i237 = i235 & i230;
        int i238 = ((i218 - (~(-(-(((i237 & i236) | (i236 ^ i237)) * 164))))) - 1) >>> 3;
        int i239 = bdvVar5.setCompoundDrawableTintBlendMode;
        int i240 = i238 * i239;
        byte[] bArr = new byte[(((i240 | 9) << 1) - (9 ^ i240)) - 1];
        bea.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i239), bArr, 0}, 518212810, -518212810, i239);
        int i241 = bdvVar5.setY;
        bea.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i241), bArr, 4}, 518212810, -518212810, i241);
        int i242 = bdvVar5.setY;
        int i243 = i242 >>> 5;
        int i244 = i242 & 31;
        int i245 = f54599d;
        int i246 = i245 & 115;
        int i247 = -(-((i245 ^ 115) | i246));
        int i248 = ((i246 | i247) << 1) - (i247 ^ i246);
        f54600e = i248 % 128;
        int i249 = i248 % 2;
        int i250 = 8;
        int i251 = 0;
        while (i251 < bdvVar5.setCompoundDrawableTintBlendMode) {
            int i252 = f54600e;
            int i253 = ((i252 & 58) + (i252 | 58)) - 1;
            int i254 = i253 % 128;
            f54599d = i254;
            int i255 = i253 % 2 != 0 ? 1 : 0;
            int i256 = ((i254 & 52) + (i254 | 52)) - 1;
            f54600e = i256 % 128;
            int i257 = i256 % 2;
            while (true) {
                iArr2 = bdvVar5.f54601b;
                if (i255 >= i243) {
                    break;
                }
                int i258 = f54599d + 101;
                f54600e = i258 % 128;
                if (i258 % 2 == 0) {
                    int i259 = iArr2[i251][i255];
                    Object[] objArr2 = new Object[i131];
                    objArr2[0] = Integer.valueOf(i259);
                    objArr2[1] = bArr;
                    objArr2[2] = Integer.valueOf(i250);
                    bea.setCompoundDrawableTintBlendMode(objArr2, 518212810, -518212810, i259);
                    int i260 = ((i255 | 196) << 1) - (((~i255) & 196) | (i255 & (-197)));
                    int i261 = i260 | (-117);
                    int i262 = i261 << 1;
                    int i263 = -((~(i260 & (-117))) & i261);
                    i255 = (i262 ^ i263) + ((i263 & i262) << 1);
                    int i264 = i250 & 50;
                    i250 = i264 + ((i250 ^ 50) | i264);
                } else {
                    int i265 = iArr2[i251][i255];
                    Object[] objArr3 = new Object[i131];
                    objArr3[0] = Integer.valueOf(i265);
                    objArr3[1] = bArr;
                    objArr3[2] = Integer.valueOf(i250);
                    bea.setCompoundDrawableTintBlendMode(objArr3, 518212810, -518212810, i265);
                    i255++;
                    int i266 = i250 & 4;
                    int i267 = -(-((i250 ^ 4) | i266));
                    i250 = ((i266 | i267) << 1) - (i267 ^ i266);
                }
            }
            int i268 = f54599d;
            int i269 = i268 & 75;
            int i270 = ((i268 | 75) & (~i269)) + (i269 << 1);
            f54600e = i270 % 128;
            int i271 = i270 % 2;
            int i272 = 0;
            while (i272 < i244) {
                int i273 = f54600e + 29;
                int i274 = i273 % 128;
                f54599d = i274;
                int i275 = i273 % 2;
                int i276 = i250 & 1;
                int i277 = ((i250 ^ 1) | i276) << 1;
                int i278 = -((~i276) & (i250 | 1));
                int i279 = (i277 ^ i278) + ((i278 & i277) << 1);
                bArr[i250] = (byte) (iArr2[i251][i243] >>> i272);
                int i280 = i272 & 8;
                int i281 = ((i272 ^ 8) | i280) << 1;
                int i282 = -((~i280) & (i272 | 8));
                i272 = (i281 ^ i282) + ((i281 & i282) << 1);
                int i283 = i274 & 59;
                int i284 = -(-((i274 ^ 59) | i283));
                int i285 = (i283 ^ i284) + ((i283 & i284) << 1);
                f54600e = i285 % 128;
                int i286 = i285 % 2;
                i250 = i279;
            }
            int i287 = i251 + 2;
            i251 = (i287 << 1) + (i287 ^ (-1));
            int i288 = f54600e;
            int i289 = ((i288 ^ 69) | (i288 & 69)) << 1;
            int i290 = -(((~i288) & 69) | (i288 & (-70)));
            int i291 = (i289 ^ i290) + ((i290 & i289) << 1);
            f54599d = i291 % 128;
            int i292 = i291 % 2;
            i131 = 3;
        }
        int i293 = f54600e;
        int i294 = ((i293 | 105) << 1) - (i293 ^ 105);
        f54599d = i294 % 128;
        if (i294 % 2 == 0) {
            return bArr;
        }
        int i295 = 32 / 0;
        return bArr;
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, 1102853621, -1102853620, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 674670993, -674670990, System.identityHashCode(this))).intValue();
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 495164032, -495164032, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setX(new Object[]{this}, -1477719637, 1477719639, System.identityHashCode(this));
    }

    public bdv(int i10, int[][] iArr) {
        int i11;
        int i12 = 0;
        int[] iArr2 = iArr[0];
        int i13 = i10 ^ 31;
        int i14 = i10 & 31;
        int i15 = (i13 | i14) << 1;
        int i16 = -i13;
        if (iArr2.length != ((((i15 | i16) << 1) - (i16 ^ i15)) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.setY = i10;
        this.setCompoundDrawableTintBlendMode = iArr.length;
        this.f54602c = iArr2.length;
        if (i14 == 0) {
            i11 = -1;
        } else {
            int i17 = 1 << i14;
            int i18 = -(-(i17 * 319));
            int i19 = 317 & i18;
            int i20 = -(-(i18 | TypedValues.AttributesType.TYPE_EASING));
            int i21 = (i19 ^ i20) + ((i20 & i19) << 1);
            int i22 = (~i17) & (~0);
            int i23 = ~i10;
            int i24 = (i22 & i23) | ((~i22) & i10);
            int i25 = i22 & i10;
            int i26 = ~((i25 & i24) | (i24 ^ i25));
            int i27 = ~i17;
            int i28 = ~i17;
            int i29 = ~((i17 & i27) | (i27 ^ i17));
            int i30 = ((~i29) & i26) | ((~i26) & i29);
            int i31 = i29 & i26;
            int i32 = (i21 - (~(-(~(-(-(((i31 & i30) | (i30 ^ i31)) * (-318)))))))) - 2;
            int i33 = ~i28;
            int i34 = ~((i33 & i28) | (i33 ^ i28));
            int i35 = ~((i23 ^ i10) | (i23 & i10));
            int i36 = i34 & i35;
            int i37 = (i34 | i35) & (~i36);
            int i38 = ((i37 & i36) | (i37 ^ i36)) * (-318);
            int i39 = i32 ^ i38;
            int i40 = (i38 & i32) << 1;
            int i41 = (i39 ^ i40) + ((i40 & i39) << 1);
            int i42 = (~i10) & ((~i10) | i10);
            int i43 = i28 & i42;
            int i44 = -(-((((i42 | i28) & (~i43)) | i43) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            int i45 = i41 ^ i44;
            int i46 = ((i44 & i41) | i45) << 1;
            int i47 = -i45;
            i11 = ((i46 | i47) << 1) - (i46 ^ i47);
        }
        while (i12 < this.setCompoundDrawableTintBlendMode) {
            int[] iArr3 = iArr[i12];
            int i48 = this.f54602c;
            int i49 = -(~(-(-(i48 * (-55)))));
            int i50 = (55 ^ i49) + ((i49 & 55) << 1);
            int i51 = (i50 ^ (-1)) + (i50 << 1);
            int i52 = ~(((-1) ^ i10) | i10);
            int i53 = -(-(((i52 & i48) | (i48 ^ i52)) * 56));
            int i54 = (i51 & i53) + (i51 | i53);
            int i55 = (-1) ^ i48;
            int i56 = (i55 & i48) | (i55 ^ i48);
            int i57 = ((i56 | (~i56)) & (~i56)) * (-56);
            int i58 = i54 ^ i57;
            int i59 = (((i57 & i54) | i58) << 1) - i58;
            int i60 = ~i10;
            int i61 = ~((i48 & i60) | (i60 ^ i48));
            int i62 = ~i61;
            int i63 = ((i61 & i62) | (i62 ^ i61)) * 56;
            int i64 = ((i59 | i63) << 1) - (i63 ^ i59);
            iArr3[i64] = iArr3[i64] & i11;
            int i65 = i12 ^ 83;
            int i66 = ((((i12 & 83) | i65) << 1) - (~(-i65))) - 1;
            int i67 = (i66 ^ (-81)) + ((i66 & (-81)) << 1);
            i12 = (i67 ^ (-1)) + (i67 << 1);
        }
        this.f54601b = iArr;
    }

    public bdv(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.setCompoundDrawableTintBlendMode = ((Integer) bea.setCompoundDrawableTintBlendMode(new Object[]{bArr, 0}, -1589824718, 1589824722, 0)).intValue();
        int iIntValue = ((Integer) bea.setCompoundDrawableTintBlendMode(new Object[]{bArr, 4}, -1589824718, 1589824722, 4)).intValue();
        this.setY = iIntValue;
        int i10 = iIntValue - (-8);
        int i11 = this.setCompoundDrawableTintBlendMode;
        int i12 = (((i10 ^ (-1)) + (i10 << 1)) >>> 3) * i11;
        if (i11 > 0) {
            int length = bArr.length;
            int iCurrentTimeMillis = (int) System.currentTimeMillis();
            int i13 = 3951 - (~(length * (-494)));
            int i14 = (-8) & length;
            int i15 = -(~(-(-((~(i14 | ((~i14) & ((-8) | length)))) * (-495)))));
            int i16 = (i13 & i15) + (i13 | i15);
            int i17 = (i16 ^ (-1)) + (i16 << 1);
            int i18 = ~iCurrentTimeMillis;
            int i19 = ~i18;
            int i20 = ((~i18) & (-8)) | (i18 & 7);
            int i21 = (-8) & i18;
            int i22 = (((i20 ^ i21) | (i20 & i21)) * 495) + i17;
            int i23 = ~length;
            int i24 = ~((i23 & 7) | (7 ^ i23));
            int i25 = ((-8) & i18) | (i18 & 7) | (i19 & (-8));
            int i26 = (i25 | (~i25)) & (~i25);
            int i27 = i24 & i26;
            int i28 = (i26 | i24) & (~i27);
            int i29 = ((i28 & i27) | (i28 ^ i27)) * 495;
            int i30 = i22 & i29;
            int i31 = -(-((i29 ^ i22) | i30));
            if (i12 == (i30 & i31) + (i31 | i30)) {
                int i32 = this.setY;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i33 = -(-(i32 * (-753)));
                int i34 = (23405 & i33) + (i33 | 23405);
                int i35 = (-32) ^ i32;
                int i36 = ~i32;
                int i37 = (-32) & i32;
                int i38 = ~((i35 & i37) | (i35 ^ i37));
                int i39 = ~((-32) | iCurrentTimeMillis2);
                int i40 = i38 & i39;
                int i41 = (i38 | i39) & (~i40);
                int i42 = (i41 & i40) | (i41 ^ i40);
                int i43 = i32 & iCurrentTimeMillis2;
                int i44 = (~i43) & (i32 | iCurrentTimeMillis2);
                int i45 = ~iCurrentTimeMillis2;
                int i46 = (i44 ^ i43) | (i43 & i44);
                int i47 = ((~i46) | i46) & (~i46);
                int i48 = ((~i47) & i42) | ((~i42) & i47);
                int i49 = i47 & i42;
                int i50 = ((i49 & i48) | (i48 ^ i49)) * (-754);
                int i51 = i34 & i50;
                int i52 = ((i34 ^ i50) | i51) << 1;
                int i53 = -((i50 | i34) & (~i51));
                int i54 = (i52 ^ i53) + ((i53 & i52) << 1);
                int i55 = ((-32) ^ i32) | ((-32) & i32);
                int i56 = i55 & iCurrentTimeMillis2;
                int i57 = (i55 | iCurrentTimeMillis2) & (~i56);
                int i58 = ~((i57 & i56) | (i57 ^ i56));
                int i59 = (i45 & (-32)) | ((~i45) & 31) | (i45 & 31);
                int i60 = (i36 & i59) | ((~i59) & i32);
                int i61 = i32 & i59;
                int i62 = (i61 & i60) | (i60 ^ i61);
                int i63 = (i62 | (~i62)) & (~i62);
                int i64 = ((~i63) & i58) | ((~i58) & i63);
                int i65 = i63 & i58;
                int i66 = ((i65 & i64) | (i64 ^ i65)) * (-754);
                int i67 = i54 ^ i66;
                int i68 = (i66 & i54) << 1;
                int i69 = (i67 ^ i68) + ((i68 & i67) << 1);
                int i70 = ~iCurrentTimeMillis2;
                int i71 = ((~i70) & (-32)) | (i70 & 31);
                int i72 = i70 & (-32);
                int i73 = ((i72 & i71) | (i71 ^ i72)) * 754;
                int i74 = ((~i73) & i69) | ((~i69) & i73);
                int i75 = -(-((i73 & i69) << 1));
                int i76 = ((i74 ^ i75) + ((i75 & i74) << 1)) >>> 5;
                this.f54602c = i76;
                this.f54601b = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.setCompoundDrawableTintBlendMode, i76);
                int i77 = this.setY;
                int i78 = i77 >> 5;
                int i79 = i77 & 31;
                int i80 = 8;
                int i81 = 0;
                while (i81 < this.setCompoundDrawableTintBlendMode) {
                    int i82 = 0;
                    while (i82 < i78) {
                        this.f54601b[i81][i82] = ((Integer) bea.setCompoundDrawableTintBlendMode(new Object[]{bArr, Integer.valueOf(i80)}, -1589824718, 1589824722, i80)).intValue();
                        int i83 = i82 & (-84);
                        int i84 = (i82 ^ (-84)) | i83;
                        int i85 = ((i83 | i84) << 1) - (i84 ^ i83);
                        i82 = ((-1) << 1) - ((((i85 | 86) << 1) - (i85 ^ 86)) ^ (-1));
                        int i86 = i80 & 103;
                        int i87 = (i80 | 103) & (~i86);
                        int i88 = -(-(i86 << 1));
                        int i89 = ((i87 | i88) << 1) - (i87 ^ i88);
                        int i90 = ((i89 ^ (-99)) | (i89 & (-99))) << 1;
                        int i91 = -((i89 & 98) | ((~i89) & (-99)));
                        i80 = ((i90 & i91) << 1) + (i90 ^ i91);
                    }
                    int i92 = 0;
                    while (i92 < i79) {
                        int[] iArr = this.f54601b[i81];
                        int i93 = iArr[i78];
                        int i94 = ((i80 & (-2)) | ((~i80) & 1)) + ((i80 & 1) << 1);
                        int i95 = (bArr[i80] & 255) << i92;
                        int i96 = (~i95) & i93;
                        int i97 = i95 & (~i93);
                        iArr[i78] = (i97 & i96) | (i96 ^ i97);
                        int i98 = i92 & (-31);
                        int i99 = (i92 | (-31)) & (~i98);
                        int i100 = -(-(i98 << 1));
                        int i101 = (i99 & i100) + (i100 | i99);
                        int i102 = i101 & 39;
                        i92 = ((~i102) & (i101 | 39)) + (i102 << 1);
                        i80 = i94;
                    }
                    int i103 = i81 & 1;
                    i81 = ((((i81 ^ 1) | i103) << 1) - (~(-((i81 | 1) & (~i103))))) - 1;
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
