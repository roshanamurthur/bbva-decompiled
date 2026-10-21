package com.mypinpad.tsdk.isolation;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class n0 extends InputStream {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f57182s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f57183t0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final aej f57184p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f57185q0 = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public InputStream f57186r0;

    public n0(aej aejVar) {
        this.f57184p0 = aejVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0586 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x054c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x03d2  */
    /* JADX WARN: Code duplicated, block: B:68:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0516  */
    /* JADX WARN: Code duplicated, block: B:72:0x0522  */
    /* JADX WARN: Code duplicated, block: B:75:0x052f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0531  */
    /* JADX WARN: Code duplicated, block: B:82:0x055c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0568  */
    /* JADX WARN: Code duplicated, block: B:85:0x056d  */
    /* JADX WARN: Code duplicated, block: B:87:0x056f  */
    /* JADX WARN: Code duplicated, block: B:90:0x05a9 A[LOOP:1: B:78:0x0544->B:90:0x05a9, LOOP_END] */
    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws IOException {
        aea aeaVar;
        int i13;
        int i14;
        int i15;
        int i16;
        aea aeaVar2;
        aea aeaVar3;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23 = ~i11;
        int i24 = ~(i23 | i10);
        int i25 = ~i10;
        int i26 = ((~(i25 | (~i12) | i11)) * 501) + ((~(i23 | i25)) * 1002) + ((i24 | (~(i25 | i11 | i12))) * 501) + (i11 * (-500)) + (i10 * (-500));
        if (i26 == 1) {
            n0 n0Var = (n0) objArr[0];
            int i27 = f57182s0;
            int i28 = i27 & 63;
            int i29 = ((i27 ^ 63) | i28) << 1;
            int i30 = -((i27 | 63) & (~i28));
            int i31 = (i29 & i30) + (i30 | i29);
            f57183t0 = i31 % 128;
            int i32 = i31 % 2;
            aej aejVar = n0Var.f57184p0;
            add addVar = (add) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar}, -2132690708, 2132690715, System.identityHashCode(aejVar));
            if (addVar == null) {
                int i33 = f57182s0;
                int i34 = ((i33 & 87) - (~(-(-(i33 | 87))))) - 1;
                f57183t0 = i34 % 128;
                if (i34 % 2 == 0) {
                    int i35 = 84 / 0;
                }
                aeaVar = null;
            } else {
                if (!(addVar instanceof aea)) {
                    StringBuilder sb2 = new StringBuilder("unknown object encountered: ");
                    sb2.append(addVar.getClass());
                    throw new IOException(sb2.toString());
                }
                int i36 = f57182s0 + 30;
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                int i38 = i37 % 128;
                f57183t0 = i38;
                aea aeaVar4 = (aea) addVar;
                if (i37 % 2 == 0) {
                    int i39 = 55 / 0;
                }
                int i40 = i38 & 89;
                int i41 = ((i38 ^ 89) | i40) << 1;
                int i42 = -((i38 | 89) & (~i40));
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                f57182s0 = i43 % 128;
                int i44 = i43 % 2;
                aeaVar = aeaVar4;
            }
            return aeaVar;
        }
        if (i26 != 2) {
            n0 n0Var2 = (n0) objArr[0];
            byte[] bArr = (byte[]) objArr[1];
            int iIntValue = ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            int i45 = f57183t0;
            int i46 = i45 & 95;
            int i47 = (i46 - (~((i45 ^ 95) | i46))) - 1;
            f57182s0 = i47 % 128;
            if (i47 % 2 != 0) {
                InputStream inputStream = n0Var2.f57186r0;
                throw null;
            }
            if (n0Var2.f57186r0 == null) {
                int i48 = i45 | 99;
                int i49 = ((i48 << 1) - (~(-(i48 & (~(i45 & 99)))))) - 1;
                f57182s0 = i49 % 128;
                if (i49 % 2 != 0) {
                    throw null;
                }
                if (n0Var2.f57185q0) {
                    aea aeaVar5 = (aea) a(new Object[]{n0Var2}, -949870975, 949870976, System.identityHashCode(n0Var2));
                    if (aeaVar5 == null) {
                        int i50 = f57182s0;
                        int i51 = (i50 | 81) << 1;
                        int i52 = -(((~i50) & 81) | (i50 & (-82)));
                        int i53 = (i51 & i52) + (i52 | i51);
                        int i54 = i53 % 128;
                        f57183t0 = i54;
                        int i55 = i53 % 2;
                        int i56 = i54 & 25;
                        int i57 = ((i54 ^ 25) | i56) << 1;
                        int i58 = -((i54 | 25) & (~i56));
                        int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                        f57182s0 = i59 % 128;
                        int i60 = i59 % 2;
                    } else {
                        n0Var2.f57185q0 = false;
                        n0Var2.f57186r0 = aeaVar5.setDividerPadding();
                        int i61 = f57183t0;
                        int i62 = ((i61 & (-26)) | ((~i61) & 25)) + ((i61 & 25) << 1);
                        f57182s0 = i62 % 128;
                        int i63 = i62 % 2;
                    }
                } else {
                    int i64 = i45 + 121;
                    f57182s0 = i64 % 128;
                    int i65 = i64 % 2;
                }
                return -1;
            }
            int i66 = f57183t0;
            int i67 = (((i66 | 20) << 1) - (i66 ^ 20)) - 1;
            f57182s0 = i67 % 128;
            int i68 = i67 % 2;
            int i69 = 0;
            while (true) {
                InputStream inputStream2 = n0Var2.f57186r0;
                int i70 = i69 * 399;
                int i71 = iIntValue * 399;
                int i72 = ((i70 | i71) << 1) - (i70 ^ i71);
                int i73 = ~i69;
                int i74 = i73 & iIntValue;
                int i75 = (~i74) & (i73 | iIntValue);
                int i76 = (i75 & i74) | (i75 ^ i74);
                int i77 = ~i76;
                i21 = ~iIntValue;
                int i78 = i21 & i69;
                int i79 = (~i78) & (i21 | i69);
                int i80 = ~((i79 ^ i78) | (i79 & i78));
                int i81 = i77 & i80;
                int i82 = ((~i81) & (i80 | i77)) | i81;
                int i83 = ~((i21 ^ iIntValue) | (i21 & iIntValue));
                int i84 = i82 ^ i83;
                int i85 = i82 & i83;
                int i86 = (i72 - (~(((i85 & i84) | (i84 ^ i85)) * 398))) - 1;
                int i87 = ((i69 ^ iIntValue) | (i69 & iIntValue)) * (-1194);
                int i88 = i86 ^ i87;
                int i89 = (i86 & i87) << 1;
                int i90 = ((i88 | i89) << 1) - (i89 ^ i88);
                i22 = (i21 | iIntValue) & i21;
                int i91 = i21 | i22;
                int i92 = ~i91;
                int i93 = i92 & (i91 | i92);
                int i94 = (i76 | i77) & i77;
                int i95 = i93 & i94;
                int i96 = (i93 | i94) & (~i95);
                int i97 = (i96 & i95) | (i96 ^ i95);
                int i98 = i78 | (i21 ^ i69);
                int i99 = ~i98;
                int i100 = (i98 | i99) & i99;
                int i101 = -(-(((i97 & i100) | (i97 ^ i100)) * 398));
                int i102 = ((i90 | i101) << 1) - (i101 ^ i90);
                int i103 = -i69;
                int i104 = ((i103 * (-501)) - (~(iIntValue2 * 503))) - 1;
                int i105 = ~iIntValue2;
                int i106 = i105 ^ iIntValue;
                int i107 = i105 & iIntValue;
                int i108 = ~((i106 ^ i107) | (i106 & i107));
                int i109 = i103 & iIntValue2;
                int i110 = (~i109) & (i103 | iIntValue2);
                int i111 = ~((i110 ^ i109) | (i110 & i109));
                int i112 = i108 ^ i111;
                int i113 = i111 & i108;
                int i114 = ((i113 & i112) | (i112 ^ i113)) * (-502);
                int i115 = i104 & i114;
                int i116 = ((i114 | i104) & (~i115)) + (i115 << 1);
                int i117 = (i105 | iIntValue2) & i105;
                int i118 = i117 & i22;
                int i119 = (~i118) & (i117 | i22);
                int i120 = (i118 & i119) | (i119 ^ i118);
                int i121 = i120 & i103;
                int i122 = (i120 | i103) & (~i121);
                int i123 = ~i103;
                int i124 = (~((i122 & i121) | (i122 ^ i121))) * (-502);
                int i125 = ((i116 ^ i124) | (i116 & i124)) << 1;
                int i126 = -(((~i116) & i124) | ((~i124) & i116));
                int i127 = (i125 & i126) + (i126 | i125);
                int i128 = i123 & iIntValue;
                int i129 = (i123 | iIntValue) & (~i128);
                int i130 = (i129 & i128) | (i129 ^ i128);
                int i131 = ~i130;
                int i132 = (i130 | i131) & i131;
                int i133 = ((i132 & i117) | ((~i132) & i117) | ((~i117) & i132)) * 502;
                int i134 = i127 & i133;
                int i135 = (i133 | i127) & (~i134);
                int i136 = -(-(i134 << 1));
                int i137 = inputStream2.read(bArr, i102, (i135 & i136) + (i135 | i136));
                if (i137 >= 0) {
                    int i138 = f57183t0;
                    int i139 = i138 & 11;
                    int i140 = (i138 | 11) & (~i139);
                    int i141 = i139 << 1;
                    int i142 = (i140 ^ i141) + ((i140 & i141) << 1);
                    f57182s0 = i142 % 128;
                    if (i142 % 2 != 0) {
                        i69 *= i137;
                        if (i69 == iIntValue2) {
                            break;
                        }
                        int i143 = f57182s0;
                        int i144 = (((i143 | 56) << 1) - (i143 ^ 56)) - 1;
                        f57183t0 = i144 % 128;
                        int i145 = i144 % 2;
                    } else {
                        int i146 = -(-i137);
                        int i147 = i69 & i146;
                        i69 = (i147 - (~(-(-((i146 ^ i69) | i147))))) - 1;
                        if (i69 == iIntValue2) {
                            break;
                        }
                        int i148 = f57182s0;
                        int i149 = (((i148 | 56) << 1) - (i148 ^ 56)) - 1;
                        f57183t0 = i149 % 128;
                        int i1410 = i149 % 2;
                    }
                    return Integer.valueOf(i69);
                }
                aea aeaVar6 = (aea) a(new Object[]{n0Var2}, -949870975, 949870976, System.identityHashCode(n0Var2));
                if (aeaVar6 == null) {
                    int i150 = f57182s0;
                    int i151 = ((i150 & 46) + (i150 | 46)) - 1;
                    f57183t0 = i151 % 128;
                    if (i151 % 2 == 0) {
                        n0Var2.f57186r0 = null;
                        throw null;
                    }
                    n0Var2.f57186r0 = null;
                    if (i69 <= 0) {
                        int i152 = i150 + 107;
                        f57183t0 = i152 % 128;
                        if (i152 % 2 == 0) {
                            int i153 = 62 / 0;
                        }
                        return -1;
                    }
                    int i154 = (i150 & (-66)) | ((~i150) & 65);
                    int i155 = (i150 & 65) << 1;
                    int i156 = ((i154 | i155) << 1) - (i154 ^ i155);
                    f57183t0 = i156 % 128;
                    if (i156 % 2 == 0) {
                        int i157 = 29 / 0;
                    }
                    return Integer.valueOf(i69);
                }
                n0Var2.f57186r0 = aeaVar6.setDividerPadding();
                int i158 = f57183t0;
                int i159 = i158 & 121;
                int i160 = ((i158 | 121) & (~i159)) + (i159 << 1);
                f57182s0 = i160 % 128;
                int i161 = i160 % 2;
                int i1411 = f57182s0;
                int i1412 = (((i1411 | 56) << 1) - (i1411 ^ 56)) - 1;
                f57183t0 = i1412 % 128;
                int i1413 = i1412 % 2;
            }
            int i162 = (-759929559) & i22;
            int i163 = ~(i162 | ((~i162) & ((-759929559) | i22)));
            int i164 = 39840985 ^ iIntValue;
            int i165 = 39840985 & iIntValue;
            int i166 = (i164 & i165) | (i164 ^ i165);
            int i167 = ~i166;
            int i168 = (i166 | i167) & i167;
            int i169 = ((~i168) & i163) | ((~i163) & i168);
            int i170 = i163 & i168;
            int i171 = -(-(((i170 & i169) | (i169 ^ i170)) * 959));
            int i172 = (((~i171) & (-1198409406)) | (1198409405 & i171)) + ((i171 & (-1198409406)) << 1);
            int i173 = (i172 & (-1371993239)) + ((-1371993239) | i172);
            int i174 = ~(((-759929559) & iIntValue) | ((-759929559) ^ iIntValue));
            int i175 = (i22 ^ 39840985) | (39840985 & i22);
            int i176 = ~i175;
            int i177 = (i175 | i176) & i176;
            int i178 = -(-(((i174 & i177) | ((~i177) & i174) | ((~i174) & i177)) * 959));
            int i179 = (i173 & i178) + (i178 | i173);
            int i180 = ((~i21) & 1168610015) | ((-1168610016) & i21);
            int i181 = 1168610015 & i21;
            int i182 = ~((i180 & i181) | (i180 ^ i181));
            int i183 = 1216523505 ^ i182;
            int i184 = i182 & 1216523505;
            int i185 = -(-(((i184 & i183) | (i183 ^ i184)) * 226));
            int i186 = (-1071343472) & i185;
            int i187 = (((-1071343472) ^ i185) | i186) << 1;
            int i188 = -((i185 | (-1071343472)) & (~i186));
            int i189 = (i187 & i188) + (i188 | i187);
            int i190 = ((-1216523506) & i21) | (iIntValue & 1216523505);
            int i191 = (-1216523506) & iIntValue;
            int i192 = (i190 & i191) | (i190 ^ i191);
            int i193 = ~i192;
            int i194 = (i192 | i193) & i193;
            int i195 = 1082294481 & i194;
            int i196 = (i194 | 1082294481) & (~i195);
            int i197 = (i196 & i195) | (i196 ^ i195);
            int i198 = 1168610015 & i22;
            int i199 = (i22 | 1168610015) & (~i198);
            int i200 = (i199 & i198) | (i199 ^ i198);
            int i201 = ~(((-1216523506) & i200) | ((~i200) & 1216523505) | (i200 & 1216523505));
            int i202 = (i189 - (~(-(~(((i201 & i197) | (i197 ^ i201)) * (-113)))))) - 2;
            int i203 = 1168610015 ^ iIntValue;
            int i204 = 1168610015 & iIntValue;
            int i205 = (i203 & i204) | (i203 ^ i204);
            int i206 = ~i205;
            int i207 = ((i205 | i206) & i206) * 113;
            if (i179 <= (i202 ^ i207) + ((i207 & i202) << 1)) {
                throw null;
            }
            return Integer.valueOf(i69);
        }
        n0 n0Var3 = (n0) objArr[0];
        int i208 = f57182s0;
        int i209 = ((i208 & 92) + (i208 | 92)) - 1;
        int i210 = i209 % 128;
        f57183t0 = i210;
        int i211 = i209 % 2;
        if (n0Var3.f57186r0 == null) {
            int i212 = i210 & 29;
            int i213 = (i210 | 29) & (~i212);
            int i214 = i212 << 1;
            int i215 = ((i213 | i214) << 1) - (i213 ^ i214);
            int i216 = i215 % 128;
            f57182s0 = i216;
            int i217 = i215 % 2;
            boolean z10 = n0Var3.f57185q0;
            if (i217 != 0) {
                int i218 = 18 / 0;
                if (z10) {
                    aeaVar3 = (aea) a(new Object[]{n0Var3}, -949870975, 949870976, System.identityHashCode(n0Var3));
                    if (aeaVar3 == null) {
                        int iIdentityHashCode = System.identityHashCode(n0Var3);
                        int i219 = ~iIdentityHashCode;
                        int i220 = (i219 | iIdentityHashCode) & i219;
                        int i221 = 530950192 & i220;
                        int i222 = (~i221) & (530950192 | i220);
                        int i223 = (i221 & i222) | (i222 ^ i221);
                        int i224 = ~i223;
                        int i225 = (i223 | i224) & i224;
                        int i226 = 1073758217 & i225;
                        int i227 = (i225 | 1073758217) & (~i226);
                        int i228 = (i227 & i226) | (i227 ^ i226);
                        int i229 = i219 & 1319192617;
                        int i230 = ((~i219) & (-1319192618)) | i229;
                        int i231 = (-1319192618) & i219;
                        int i232 = ~((i230 & i231) | (i230 ^ i231));
                        int i233 = -(~(-(-(((i228 & i232) | (i228 ^ i232)) * (-1136)))));
                        int i234 = ((1833340472 & i233) + (i233 | 1833340472)) - 1;
                        int i235 = (530950192 & i219) | (iIdentityHashCode & (-530950193));
                        int i236 = 530950192 & iIdentityHashCode;
                        int i237 = (i236 & i235) | (i235 ^ i236);
                        int i238 = ~i237;
                        int i239 = (i237 | i238) & i238;
                        int i240 = ~(((-1319192618) ^ iIdentityHashCode) | ((-1319192618) & iIdentityHashCode));
                        int i241 = i239 & i240;
                        int i242 = (i239 | i240) & (~i241);
                        int i243 = (i242 & i241) | (i242 ^ i241);
                        int i244 = i219 ^ (-530950193);
                        int i245 = i219 & (-530950193);
                        int i246 = (i244 & i245) | (i244 ^ i245);
                        int i247 = i246 ^ 1319192617;
                        int i248 = i246 & 1319192617;
                        int i249 = (i248 & i247) | (i247 ^ i248);
                        int i250 = ~i249;
                        int i251 = (i249 | i250) & i250;
                        int i252 = ((i243 & i251) | (i243 ^ i251)) * (-568);
                        int i253 = ((~i252) & i234) | ((~i234) & i252);
                        int i254 = (i252 & i234) << 1;
                        int i255 = (i253 ^ i254) + ((i254 & i253) << 1);
                        int i256 = i220 ^ (-530950193);
                        int i257 = i220 & (-530950193);
                        int i258 = ~((i257 & i256) | (i256 ^ i257));
                        int i259 = i219 ^ 1319192617;
                        int i260 = ~((i259 & i229) | (i259 ^ i229));
                        int i261 = (i258 & i260) | (i258 ^ i260);
                        int i262 = ~((iIdentityHashCode & (-1073758218)) | (i219 & (-1073758218)) | (iIdentityHashCode & 1073758217));
                        int i263 = -(-(((i262 & i261) | ((~i262) & i261) | ((~i261) & i262)) * 568));
                        int i264 = i255 & i263;
                        int i265 = ((i255 ^ i263) | i264) << 1;
                        int i266 = -((i263 | i255) & (~i264));
                        i17 = (i265 & i266) + (i266 | i265);
                        int iIdentityHashCode2 = System.identityHashCode(n0Var3);
                        int i267 = ~iIdentityHashCode2;
                        int i268 = i267 ^ 1488453704;
                        int i269 = 1488453704 & i267;
                        int i270 = (i269 & i268) | (i268 ^ i269);
                        int i271 = i270 & 83968787;
                        int i272 = (i270 | 83968787) & (~i271);
                        int i273 = -(-(((i272 & i271) | (i272 ^ i271)) * 1444));
                        int i274 = 978657420 & i273;
                        int i275 = (i273 ^ 978657420) | i274;
                        int i276 = (i274 ^ i275) + ((i275 & i274) << 1);
                        int i277 = ~(((-117789492) & iIdentityHashCode2) | ((-117789492) ^ iIdentityHashCode2));
                        int i278 = (i277 & 83968787) | (83968787 ^ i277);
                        int i279 = (i267 & 1522274408) | ((-1522274409) & iIdentityHashCode2);
                        int i280 = iIdentityHashCode2 & 1522274408;
                        int i281 = ~((i280 & i279) | (i279 ^ i280));
                        int i282 = i278 ^ i281;
                        int i283 = i281 & i278;
                        int i284 = -(-(((i283 & i282) | (i282 ^ i283)) * (-1444)));
                        int i285 = i276 ^ i284;
                        int i286 = -(-((i284 & i276) << 1));
                        int i287 = (i285 ^ i286) + ((i286 & i285) << 1);
                        int i288 = i287 & (-1417673080);
                        i18 = ((-1417673080) | i287) & (~i288);
                        i19 = i288 << 1;
                        if (i17 <= ((i18 | i19) << 1) - (i18 ^ i19)) {
                            throw null;
                        }
                        i20 = f57183t0 + 57;
                        f57182s0 = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i289 = 53 / 0;
                        }
                    } else {
                        n0Var3.f57185q0 = false;
                        n0Var3.f57186r0 = aeaVar3.setDividerPadding();
                        int i290 = f57183t0 + 117;
                        f57182s0 = i290 % 128;
                        int i291 = i290 % 2;
                        while (true) {
                            i13 = n0Var3.f57186r0.read();
                            if (i13 >= 0) {
                                i14 = (-2) - ((f57182s0 + 34) ^ (-1));
                                i15 = i14 % 128;
                                f57183t0 = i15;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                                int i292 = i15 & 3;
                                i16 = i292 + ((i15 ^ 3) | i292);
                                f57182s0 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i293 = 70 / 0;
                                }
                            } else {
                                aeaVar2 = (aea) a(new Object[]{n0Var3}, -949870975, 949870976, System.identityHashCode(n0Var3));
                                if (aeaVar2 == null) {
                                    int i294 = f57183t0;
                                    int i295 = i294 & 73;
                                    int i296 = i294 | 73;
                                    int i297 = (i295 ^ i296) + ((i295 & i296) << 1);
                                    f57182s0 = i297 % 128;
                                    int i298 = i297 % 2;
                                    n0Var3.f57186r0 = null;
                                    int i299 = i294 + 121;
                                    f57182s0 = i299 % 128;
                                    int i300 = i299 % 2;
                                    return -1;
                                }
                                n0Var3.f57186r0 = aeaVar2.setDividerPadding();
                                int i301 = f57182s0;
                                int i302 = i301 & 43;
                                int i303 = i302 + ((i301 ^ 43) | i302);
                                f57183t0 = i303 % 128;
                                int i304 = i303 % 2;
                            }
                        }
                    }
                } else {
                    int i305 = (i216 & 31) + (i216 | 31);
                    f57183t0 = i305 % 128;
                    int i306 = i305 % 2;
                    int i307 = i216 & 83;
                    int i308 = ((i216 | 83) & (~i307)) + (i307 << 1);
                    f57183t0 = i308 % 128;
                    int i309 = i308 % 2;
                }
                i13 = -1;
            } else {
                if (!z10) {
                    int i3010 = (i216 & 31) + (i216 | 31);
                    f57183t0 = i3010 % 128;
                    int i3011 = i3010 % 2;
                    int i3012 = i216 & 83;
                    int i3013 = ((i216 | 83) & (~i3012)) + (i3012 << 1);
                    f57183t0 = i3013 % 128;
                    int i3014 = i3013 % 2;
                } else {
                    aeaVar3 = (aea) a(new Object[]{n0Var3}, -949870975, 949870976, System.identityHashCode(n0Var3));
                    if (aeaVar3 == null) {
                        int iIdentityHashCode3 = System.identityHashCode(n0Var3);
                        int i2110 = ~iIdentityHashCode3;
                        int i2210 = (i2110 | iIdentityHashCode3) & i2110;
                        int i2211 = 530950192 & i2210;
                        int i2212 = (~i2211) & (530950192 | i2210);
                        int i2213 = (i2211 & i2212) | (i2212 ^ i2211);
                        int i2214 = ~i2213;
                        int i2215 = (i2213 | i2214) & i2214;
                        int i2216 = 1073758217 & i2215;
                        int i2217 = (i2215 | 1073758217) & (~i2216);
                        int i2218 = (i2217 & i2216) | (i2217 ^ i2216);
                        int i2219 = i2110 & 1319192617;
                        int i2310 = ((~i2110) & (-1319192618)) | i2219;
                        int i2311 = (-1319192618) & i2110;
                        int i2312 = ~((i2310 & i2311) | (i2310 ^ i2311));
                        int i2313 = -(~(-(-(((i2218 & i2312) | (i2218 ^ i2312)) * (-1136)))));
                        int i2314 = ((1833340472 & i2313) + (i2313 | 1833340472)) - 1;
                        int i2315 = (530950192 & i2110) | (iIdentityHashCode3 & (-530950193));
                        int i2316 = 530950192 & iIdentityHashCode3;
                        int i2317 = (i2316 & i2315) | (i2315 ^ i2316);
                        int i2318 = ~i2317;
                        int i2319 = (i2317 | i2318) & i2318;
                        int i2410 = ~(((-1319192618) ^ iIdentityHashCode3) | ((-1319192618) & iIdentityHashCode3));
                        int i2411 = i2319 & i2410;
                        int i2412 = (i2319 | i2410) & (~i2411);
                        int i2413 = (i2412 & i2411) | (i2412 ^ i2411);
                        int i2414 = i2110 ^ (-530950193);
                        int i2415 = i2110 & (-530950193);
                        int i2416 = (i2414 & i2415) | (i2414 ^ i2415);
                        int i2417 = i2416 ^ 1319192617;
                        int i2418 = i2416 & 1319192617;
                        int i2419 = (i2418 & i2417) | (i2417 ^ i2418);
                        int i2510 = ~i2419;
                        int i2511 = (i2419 | i2510) & i2510;
                        int i2512 = ((i2413 & i2511) | (i2413 ^ i2511)) * (-568);
                        int i2513 = ((~i2512) & i2314) | ((~i2314) & i2512);
                        int i2514 = (i2512 & i2314) << 1;
                        int i2515 = (i2513 ^ i2514) + ((i2514 & i2513) << 1);
                        int i2516 = i2210 ^ (-530950193);
                        int i2517 = i2210 & (-530950193);
                        int i2518 = ~((i2517 & i2516) | (i2516 ^ i2517));
                        int i2519 = i2110 ^ 1319192617;
                        int i2610 = ~((i2519 & i2219) | (i2519 ^ i2219));
                        int i2611 = (i2518 & i2610) | (i2518 ^ i2610);
                        int i2612 = ~((iIdentityHashCode3 & (-1073758218)) | (i2110 & (-1073758218)) | (iIdentityHashCode3 & 1073758217));
                        int i2613 = -(-(((i2612 & i2611) | ((~i2612) & i2611) | ((~i2611) & i2612)) * 568));
                        int i2614 = i2515 & i2613;
                        int i2615 = ((i2515 ^ i2613) | i2614) << 1;
                        int i2616 = -((i2613 | i2515) & (~i2614));
                        i17 = (i2615 & i2616) + (i2616 | i2615);
                        int iIdentityHashCode4 = System.identityHashCode(n0Var3);
                        int i2617 = ~iIdentityHashCode4;
                        int i2618 = i2617 ^ 1488453704;
                        int i2619 = 1488453704 & i2617;
                        int i2710 = (i2619 & i2618) | (i2618 ^ i2619);
                        int i2711 = i2710 & 83968787;
                        int i2712 = (i2710 | 83968787) & (~i2711);
                        int i2713 = -(-(((i2712 & i2711) | (i2712 ^ i2711)) * 1444));
                        int i2714 = 978657420 & i2713;
                        int i2715 = (i2713 ^ 978657420) | i2714;
                        int i2716 = (i2714 ^ i2715) + ((i2715 & i2714) << 1);
                        int i2717 = ~(((-117789492) & iIdentityHashCode4) | ((-117789492) ^ iIdentityHashCode4));
                        int i2718 = (i2717 & 83968787) | (83968787 ^ i2717);
                        int i2719 = (i2617 & 1522274408) | ((-1522274409) & iIdentityHashCode4);
                        int i2810 = iIdentityHashCode4 & 1522274408;
                        int i2811 = ~((i2810 & i2719) | (i2719 ^ i2810));
                        int i2812 = i2718 ^ i2811;
                        int i2813 = i2811 & i2718;
                        int i2814 = -(-(((i2813 & i2812) | (i2812 ^ i2813)) * (-1444)));
                        int i2815 = i2716 ^ i2814;
                        int i2816 = -(-((i2814 & i2716) << 1));
                        int i2817 = (i2815 ^ i2816) + ((i2816 & i2815) << 1);
                        int i2818 = i2817 & (-1417673080);
                        i18 = ((-1417673080) | i2817) & (~i2818);
                        i19 = i2818 << 1;
                        if (i17 <= ((i18 | i19) << 1) - (i18 ^ i19)) {
                            throw null;
                        }
                        i20 = f57183t0 + 57;
                        f57182s0 = i20 % 128;
                        if (i20 % 2 != 0) {
                            int i2819 = 53 / 0;
                        }
                    } else {
                        n0Var3.f57185q0 = false;
                        n0Var3.f57186r0 = aeaVar3.setDividerPadding();
                        int i2910 = f57183t0 + 117;
                        f57182s0 = i2910 % 128;
                        int i2911 = i2910 % 2;
                        while (true) {
                            i13 = n0Var3.f57186r0.read();
                            if (i13 >= 0) {
                                i14 = (-2) - ((f57182s0 + 34) ^ (-1));
                                i15 = i14 % 128;
                                f57183t0 = i15;
                                if (i14 % 2 == 0) {
                                    throw null;
                                }
                                int i2912 = i15 & 3;
                                i16 = i2912 + ((i15 ^ 3) | i2912);
                                f57182s0 = i16 % 128;
                                if (i16 % 2 != 0) {
                                    int i2913 = 70 / 0;
                                }
                            } else {
                                aeaVar2 = (aea) a(new Object[]{n0Var3}, -949870975, 949870976, System.identityHashCode(n0Var3));
                                if (aeaVar2 == null) {
                                    int i2914 = f57183t0;
                                    int i2915 = i2914 & 73;
                                    int i2916 = i2914 | 73;
                                    int i2917 = (i2915 ^ i2916) + ((i2915 & i2916) << 1);
                                    f57182s0 = i2917 % 128;
                                    int i2918 = i2917 % 2;
                                    n0Var3.f57186r0 = null;
                                    int i2919 = i2914 + 121;
                                    f57182s0 = i2919 % 128;
                                    int i3015 = i2919 % 2;
                                    return -1;
                                }
                                n0Var3.f57186r0 = aeaVar2.setDividerPadding();
                                int i3016 = f57182s0;
                                int i3017 = i3016 & 43;
                                int i3018 = i3017 + ((i3016 ^ 43) | i3017);
                                f57183t0 = i3018 % 128;
                                int i3019 = i3018 % 2;
                            }
                        }
                    }
                }
                i13 = -1;
            }
        } else {
            while (true) {
                i13 = n0Var3.f57186r0.read();
                if (i13 >= 0) {
                    i14 = (-2) - ((f57182s0 + 34) ^ (-1));
                    i15 = i14 % 128;
                    f57183t0 = i15;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    int i29110 = i15 & 3;
                    i16 = i29110 + ((i15 ^ 3) | i29110);
                    f57182s0 = i16 % 128;
                    if (i16 % 2 != 0) {
                        int i29111 = 70 / 0;
                    }
                } else {
                    aeaVar2 = (aea) a(new Object[]{n0Var3}, -949870975, 949870976, System.identityHashCode(n0Var3));
                    if (aeaVar2 == null) {
                        int i29112 = f57183t0;
                        int i29113 = i29112 & 73;
                        int i29114 = i29112 | 73;
                        int i29115 = (i29113 ^ i29114) + ((i29113 & i29114) << 1);
                        f57182s0 = i29115 % 128;
                        int i29116 = i29115 % 2;
                        n0Var3.f57186r0 = null;
                        int i29117 = i29112 + 121;
                        f57182s0 = i29117 % 128;
                        int i30110 = i29117 % 2;
                        return -1;
                    }
                    n0Var3.f57186r0 = aeaVar2.setDividerPadding();
                    int i30111 = f57182s0;
                    int i30112 = i30111 & 43;
                    int i30113 = i30112 + ((i30111 ^ 43) | i30112);
                    f57183t0 = i30113 % 128;
                    int i30114 = i30113 % 2;
                }
            }
        }
        return Integer.valueOf(i13);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return ((Integer) a(new Object[]{this}, -1072415837, 1072415839, System.identityHashCode(this))).intValue();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((Integer) a(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, 346985204, -346985204, i10)).intValue();
    }
}
