package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.emoji2.text.flatbuffer.a;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.vasco.digipass.sdk.DigipassSDKReturnCodes;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public abstract class avf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f53950a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53951b = 1;

    /* JADX WARN: Code duplicated, block: B:23:0x00bb A[LOOP:0: B:3:0x003e->B:23:0x00bb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x00aa A[SYNTHETIC] */
    public static /* synthetic */ Boolean a(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int[] iArr = (int[]) objArr[0];
        ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        ((Number) objArr[3]).intValue();
        int i13 = f53950a;
        int i14 = (i13 ^ 97) + ((i13 & 97) << 1);
        int i15 = i14 % 128;
        f53951b = i15;
        int i16 = i14 % 2;
        int i17 = ((i15 ^ 91) | (i15 & 91)) << 1;
        int i18 = -(((~i15) & 91) | (i15 & (-92)));
        int i19 = (i17 & i18) + (i18 | i17);
        f53950a = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 7;
        while (true) {
            if (i21 < 0) {
                int i22 = f53951b + 20;
                int i23 = (i22 ^ (-1)) + (i22 << 1);
                f53950a = i23 % 128;
                int i24 = i23 % 2;
                return Boolean.TRUE;
            }
            int i25 = f53950a;
            int i26 = (i25 ^ 39) + ((i25 & 39) << 1);
            i10 = i26 % 128;
            f53951b = i10;
            if (i26 % 2 == 0) {
                int i27 = iArr[(i21 & 2) + (i21 | 2)];
                i11 = ((~i27) & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i27);
                int i28 = iArr2[i21];
                int i29 = i28 & Integer.MIN_VALUE;
                i12 = ((Integer.MIN_VALUE ^ i28) | i29) & (~i29);
                if (i11 < i12) {
                    break;
                }
                if (i11 > i12) {
                    int i30 = (i25 & 86) + (i25 | 86);
                    int i31 = (i30 ^ (-1)) + (i30 << 1);
                    f53951b = i31 % 128;
                    int i32 = i31 % 2;
                    return Boolean.TRUE;
                }
                i21 = (i21 << 1) + (~i21);
                int i33 = i25 & 109;
                int i34 = (i33 - (~((i25 ^ 109) | i33))) - 1;
                f53951b = i34 % 128;
                int i35 = i34 % 2;
            } else {
                int i36 = i21 ^ 8;
                int i37 = (i21 & 8) << 1;
                int i38 = iArr[((i36 | i37) << 1) - (i36 ^ i37)];
                i11 = (i38 | Integer.MIN_VALUE) & (~(i38 & Integer.MIN_VALUE));
                int i39 = iArr2[i21];
                int i40 = i39 & Integer.MIN_VALUE;
                i12 = ((Integer.MIN_VALUE ^ i39) | i40) & (~i40);
                if (i11 < i12) {
                    break;
                }
                if (i11 > i12) {
                    int i310 = (i25 & 86) + (i25 | 86);
                    int i311 = (i310 ^ (-1)) + (i310 << 1);
                    f53951b = i311 % 128;
                    int i312 = i311 % 2;
                    return Boolean.TRUE;
                }
                i21 = (i21 << 1) + (~i21);
                int i313 = i25 & 109;
                int i314 = (i313 - (~((i25 ^ 109) | i313))) - 1;
                f53951b = i314 % 128;
                int i315 = i314 % 2;
            }
        }
        int i41 = ((i10 ^ 112) + ((i10 & 112) << 1)) - 1;
        int i42 = i41 % 128;
        f53950a = i42;
        boolean z10 = i41 % 2 != 0;
        int i43 = (i42 & 47) + (i42 | 47);
        f53951b = i43 % 128;
        if (i43 % 2 != 0) {
            return Boolean.valueOf(z10);
        }
        throw null;
    }

    public static /* synthetic */ Integer b(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53950a;
        int i11 = ((i10 | 19) << 1) - (i10 ^ 19);
        f53951b = i11 % 128;
        int i12 = i11 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7])) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        int i13 = (int) (j17 >>> 32);
        int i14 = ((i10 & 113) - (~(i10 | 113))) - 1;
        f53951b = i14 % 128;
        if (i14 % 2 != 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    public static /* synthetic */ void c(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int iIntValue = ((Number) objArr[3]).intValue();
        int i10 = f53950a;
        int i11 = i10 + 55;
        f53951b = i11 % 128;
        int i12 = i11 % 2;
        long j10 = ((long) iArr2[8]) & 4294967295L;
        long j11 = ((long) iArr2[9]) & 4294967295L;
        long j12 = ((long) iArr2[10]) & 4294967295L;
        long j13 = ((long) iArr2[11]) & 4294967295L;
        long j14 = ((long) iArr2[12]) & 4294967295L;
        long j15 = ((long) iArr2[13]) & 4294967295L;
        long j16 = ((long) iArr2[14]) & 4294967295L;
        long j17 = ((long) iArr2[15]) & 4294967295L;
        int i13 = iIntValue;
        long j18 = ((long) iArr[8]) & 4294967295L;
        long j19 = j18 * j10;
        iArr3[16] = (int) j19;
        long j20 = (j18 * j11) + (j19 >>> 32);
        iArr3[17] = (int) j20;
        long j21 = (j18 * j12) + (j20 >>> 32);
        iArr3[18] = (int) j21;
        long j22 = (j18 * j13) + (j21 >>> 32);
        iArr3[19] = (int) j22;
        long j23 = (j18 * j14) + (j22 >>> 32);
        iArr3[20] = (int) j23;
        long j24 = (j18 * j15) + (j23 >>> 32);
        iArr3[21] = (int) j24;
        long j25 = (j18 * j16) + (j24 >>> 32);
        iArr3[22] = (int) j25;
        long j26 = (j18 * j17) + (j25 >>> 32);
        iArr3[23] = (int) j26;
        iArr3[24] = (int) (j26 >>> 32);
        int i14 = i10 & 119;
        int i15 = i14 + ((i10 ^ 119) | i14);
        f53951b = i15 % 128;
        int i16 = i15 % 2;
        int i17 = i13;
        int i18 = 1;
        for (int i19 = 8; i18 < i19; i19 = 8) {
            int i20 = f53950a;
            int i21 = (-2) - (((i20 & 44) + (i20 | 44)) ^ (-1));
            f53951b = i21 % 128;
            int i22 = i21 % 2;
            int i23 = ((i17 ^ 35) - (~(-(-((i17 & 35) << 1))))) - 1;
            int i24 = i23 & (-34);
            int i25 = ((i23 ^ (-34)) | i24) << 1;
            int i26 = -((i23 | (-34)) & (~i24));
            i17 = (i25 & i26) + (i26 | i25);
            int i27 = -(-(i18 * 319));
            int i28 = (-2536) & i27;
            int i29 = i27 | (-2536);
            int i30 = (i28 ^ i29) + ((i29 & i28) << 1);
            int i31 = ~i18;
            int i32 = (-9) & i31;
            int i33 = (~i32) & ((-9) | i31);
            int i34 = (i33 ^ i32) | (i33 & i32);
            int i35 = i13;
            int i36 = ~i35;
            int i37 = (i34 & i36) | ((~i34) & i35);
            int i38 = i34 & i35;
            int i39 = (i37 ^ i38) | (i38 & i37);
            int i40 = ~i39;
            int i41 = (i39 | i40) & i40;
            int i42 = (i36 ^ 8) | (i36 & 8);
            int i43 = i42 ^ i18;
            int i44 = i42 & i18;
            int i45 = (i43 ^ i44) | (i43 & i44);
            long j27 = j16;
            int i46 = ~i45;
            int i47 = i46 & (i46 | i45);
            int i48 = ((~i47) & i41) | ((~i41) & i47);
            int i49 = i47 & i41;
            int i50 = ((i49 & i48) | (i48 ^ i49)) * (-318);
            int i51 = i30 & i50;
            int i52 = (i51 - (~(-(-((i50 ^ i30) | i51))))) - 1;
            int i53 = (i31 | i18) & i31;
            int i54 = ~((i53 & 8) | (i53 ^ 8));
            int i55 = ~((i35 ^ 8) | (i35 & 8));
            int i56 = ((i54 & i55) | (i54 ^ i55)) * (-318);
            int i57 = ((~i56) & i52) | ((~i52) & i56);
            int i58 = (i56 & i52) << 1;
            int i59 = (i57 ^ i58) + ((i58 & i57) << 1);
            int i60 = ~(((-9) & i35) | ((-9) ^ i35));
            int i61 = -(~(((i31 & i60) | (i31 ^ i60)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET));
            long j28 = ((long) iArr[(((i59 | i61) << 1) - (i61 ^ i59)) - 1]) & 4294967295L;
            long j29 = (j28 * j10) + (((long) iArr3[i17]) & 4294967295L);
            iArr3[i17] = (int) j29;
            long j30 = j28 * j11;
            int i62 = i17 * (-271);
            int i63 = i18;
            int i64 = (((i62 & (-274)) | (273 & (~i62))) - (~((273 & i62) << 1))) - 1;
            int i65 = ~i17;
            int i66 = (i65 | i17) & i65;
            long j31 = j14;
            int i67 = ~i66;
            int i68 = ((-2) & i67) | (i66 & 1) | ((-2) & i66);
            int i69 = (i68 ^ i36) | (i68 & i36);
            long j32 = j13;
            int i70 = ~i69;
            int i71 = i70 & (i70 | i69);
            int i72 = i17 & 1;
            int i73 = (~i72) & (i17 | 1);
            int i74 = (i73 ^ i72) | (i72 & i73);
            int i75 = i74 & i35;
            int i76 = ~(((i74 | i35) & (~i75)) | i75);
            int i77 = -(~(((i71 & i76) | ((~i76) & i71) | ((~i71) & i76)) * (-272)));
            int i78 = ((i64 | i77) << 1) - (i64 ^ i77);
            int i79 = (i78 ^ (-1)) + (i78 << 1);
            int i80 = (-2) ^ i17;
            int i81 = (-2) & i17;
            int i82 = ~((i80 & i81) | (i80 ^ i81));
            int i83 = (-2) & i35;
            int i84 = ~(((~i83) & ((-2) | i35)) | i83);
            int i85 = i82 ^ i84;
            int i86 = i84 & i82;
            int i87 = ((i86 & i85) | (i85 ^ i86)) * (-272);
            int i88 = ((i79 | i87) << 1) - (i79 ^ i87);
            int i89 = i36 & 1;
            int i90 = i89 | i83;
            int i91 = i35 & 1;
            int i92 = ~((i90 & i91) | (i90 ^ i91));
            int i93 = ((~i92) & i17) | (i92 & i65);
            int i94 = i92 & i17;
            int i95 = -(-(((i94 & i93) | (i93 ^ i94)) * 272));
            long j33 = j30 + (((long) iArr3[((i88 & i95) - (~(i95 | i88))) - 1]) & 4294967295L) + (j29 >>> 32);
            int i96 = -(-(i17 * (-885)));
            int i97 = 1773 & i96;
            int i98 = (i96 ^ 1773) | i97;
            int i99 = (i97 & i98) + (i98 | i97);
            int i100 = (-2) ^ i65;
            int i101 = (-2) & i65;
            int i102 = ~((i101 & i100) | (i100 ^ i101));
            int i103 = i65 & i35;
            int i104 = (~i103) & (i65 | i35);
            int i105 = (i104 ^ i103) | (i103 & i104);
            int i106 = ~i105;
            int i107 = (i105 | i106) & i106;
            int i108 = ((~i107) & i102) | ((~i102) & i107);
            int i109 = i102 & i107;
            int i110 = (i109 & i108) | (i108 ^ i109);
            int i111 = i36 | 1;
            int i112 = (~i89) & i111;
            int i113 = (i89 & i112) | (i112 ^ i89);
            int i114 = i113 ^ i17;
            int i115 = i113 & i17;
            int i116 = ~((i115 & i114) | (i114 ^ i115));
            int i117 = -(-(((i116 & i110) | (i110 ^ i116)) * 886));
            int i118 = i99 & i117;
            int i119 = (i117 ^ i99) | i118;
            int i120 = ((i118 | i119) << 1) - (i119 ^ i118);
            int i121 = i36 & i17;
            int i122 = ~((i36 ^ i17) | i121);
            int i123 = ((i122 & 1) | (i122 ^ 1)) * (-1772);
            int i124 = i120 ^ i123;
            int i125 = -(-((i123 & i120) << 1));
            int i126 = (i124 & i125) + (i125 | i124);
            int i127 = (~i111) * 886;
            iArr3[((i126 | i127) << 1) - (i127 ^ i126)] = (int) j33;
            long j34 = j28 * j12;
            int i128 = -(-(i17 * (-219)));
            int i129 = 442 ^ i128;
            int i130 = (((i128 & 442) | i129) << 1) - i129;
            int i131 = ~i65;
            int i132 = ~(((-3) & i131) | (i65 & 2) | ((-3) & i65));
            int i133 = i36 ^ 2;
            int i134 = i36 & 2;
            long j35 = j12;
            int i135 = (i133 ^ i134) | (i133 & i134);
            int i136 = ((~i135) & i17) | (i135 & i65);
            int i137 = i135 & i17;
            int i138 = ~((i136 & i137) | (i136 ^ i137));
            int i139 = -(-(((i138 & i132) | (i132 ^ i138)) * 220));
            int i140 = i130 & i139;
            int i141 = (i130 | i139) & (~i140);
            int i142 = i140 << 1;
            int i143 = ((i141 | i142) << 1) - (i141 ^ i142);
            int i144 = ~(((~i121) & (i36 | i17)) | i121);
            int i145 = i144 & 2;
            int i146 = (i144 | 2) & (~i145);
            int i147 = ((i146 & i145) | (i146 ^ i145)) * (-440);
            int i148 = ((i143 ^ i147) | (i143 & i147)) << 1;
            int i149 = -((i147 & (~i143)) | ((~i147) & i143));
            int i150 = (i148 & i149) + (i149 | i148);
            int i151 = (i17 ^ 2) | (i17 & 2);
            int i152 = i151 & i35;
            int i153 = -(~((((i151 | i35) & (~i152)) | i152) * 220));
            int i154 = (i150 & i153) + (i153 | i150);
            long j36 = j34 + (((long) iArr3[(i154 ^ (-1)) + (i154 << 1)]) & 4294967295L) + (j33 >>> 32);
            int i155 = i17 * 881;
            int i156 = 1762 & i155;
            int i157 = ((i155 | 1762) & (~i156)) + (i156 << 1);
            int i158 = ~(((-3) ^ i66) | ((-3) & i66));
            int i159 = ~(((-3) ^ i35) | ((-3) & i35));
            int i160 = i158 & i159;
            int i161 = (i159 | i158) & (~i160);
            int i162 = (i161 & i160) | (i161 ^ i160);
            int i163 = (i66 & i36) | (i35 & i67);
            int i164 = i66 & i35;
            int i165 = ~((i163 & i164) | (i163 ^ i164));
            int i166 = i162 & i165;
            int i167 = (i162 | i165) & (~i166);
            int i168 = ((i167 & i166) | (i167 ^ i166)) * (-880);
            int i169 = ((((i157 ^ i168) | (i157 & i168)) << 1) - (~(-(((~i157) & i168) | ((~i168) & i157))))) - 1;
            int i170 = (i36 | i35) & i36;
            int i171 = (-3) ^ i170;
            int i172 = (-3) & i170;
            int i173 = ~((i172 & i171) | (i171 ^ i172));
            int i174 = (i173 & i17) | (i17 ^ i173);
            int i175 = i35 ^ 2;
            int i176 = i35 & 2;
            int i177 = ~((i175 & i176) | (i175 ^ i176));
            int i178 = -(-(((i174 & i177) | (i174 ^ i177)) * (-880)));
            int i179 = i169 & i178;
            int i180 = i178 | i169;
            int i181 = (i179 & i180) + (i180 | i179);
            int i182 = i177 * 880;
            int i183 = ((~i182) & i181) | ((~i181) & i182);
            int i184 = -(-((i181 & i182) << 1));
            iArr3[((i183 | i184) << 1) - (i183 ^ i184)] = (int) j36;
            long j37 = (j28 * j32) + (((long) iArr3[i17 + 3]) & 4294967295L) + (j36 >>> 32);
            iArr3[((i17 ^ 3) - (~(-(-((i17 & 3) << 1))))) - 1] = (int) j37;
            int i185 = -(-(i17 * (-623)));
            int i186 = (-2492) & i185;
            int i187 = (i185 ^ (-2492)) | i186;
            int i188 = (i186 & i187) + (i187 | i186);
            int i189 = ((i188 ^ 3121) + ((i188 & 3121) << 1)) - 1;
            int i190 = i17 ^ (-5);
            int i191 = i17 & (-5);
            int i192 = ((i190 & i191) | (i190 ^ i191)) * 624;
            int i193 = ((i189 ^ i192) | (i189 & i192)) << 1;
            int i194 = -(((~i189) & i192) | ((~i192) & i189));
            int i195 = (i193 ^ i194) + ((i194 & i193) << 1);
            int i196 = i17 & 4;
            int i197 = (~i196) & (i17 | 4);
            int i198 = -(~(-(-(((i197 & i196) | (i197 ^ i196)) * 624))));
            long j38 = (j28 * j31) + (((long) iArr3[((i195 & i198) + (i195 | i198)) - 1]) & 4294967295L) + (j37 >>> 32);
            int i199 = i17 * (-919);
            int i200 = (-3676) & i199;
            int i201 = (i199 | (-3676)) & (~i200);
            int i202 = i200 << 1;
            int i203 = (i201 ^ i202) + ((i201 & i202) << 1);
            int i204 = ((-5) & i67) | (i66 & 4);
            int i205 = (-5) & i66;
            int i206 = (i204 & i205) | (i204 ^ i205);
            int i207 = (i206 & i36) | ((~i206) & i35);
            int i208 = i206 & i35;
            int i209 = ~((i208 & i207) | (i207 ^ i208));
            int i210 = (i65 ^ i170) | (i65 & i170);
            int i211 = i210 ^ 4;
            int i212 = i210 & 4;
            int i213 = ~((i211 ^ i212) | (i212 & i211));
            int i214 = ((~i209) & i213) | ((~i213) & i209);
            int i215 = i209 & i213;
            int i216 = (i203 - (~(-(~(((i214 & i215) | (i214 ^ i215)) * 920))))) - 1;
            int i217 = (i216 ^ (-1)) + (i216 << 1);
            int i218 = (-5) & i65;
            int i219 = ~(((~i218) & ((-5) | i65)) | i218);
            int i220 = (-5) & i36;
            int i221 = (~i220) & ((-5) | i36);
            int i222 = ~((i221 & i220) | (i221 ^ i220));
            int i223 = i219 ^ i222;
            int i224 = i222 & i219;
            int i225 = ((i224 & i223) | (i223 ^ i224)) * 920;
            int i226 = ((~i225) & i217) | ((~i217) & i225);
            int i227 = -(-((i225 & i217) << 1));
            int i228 = (i226 ^ i227) + ((i227 & i226) << 1);
            int i229 = i65 & 4;
            int i230 = ((-5) & i131) | i229 | i218;
            int i231 = (i230 & i36) | (i230 ^ i36);
            int i232 = ~i231;
            int i233 = (i231 | i232) & i232;
            int i234 = i218 | i196;
            int i235 = (i234 & i191) | (i234 ^ i191);
            int i236 = i235 & i35;
            int i237 = (i235 | i35) & (~i236);
            int i238 = (i237 & i236) | (i237 ^ i236);
            int i239 = ~i238;
            int i240 = (i238 | i239) & i239;
            int i241 = i233 & i240;
            int i242 = (i233 | i240) & (~i241);
            int i243 = (i242 & i241) | (i242 ^ i241);
            int i244 = (~i229) & (i65 | 4);
            int i245 = (i229 & i244) | (i244 ^ i229);
            int i246 = (i36 & i245) | ((~i245) & i35);
            int i247 = i245 & i35;
            int i248 = ~((i246 & i247) | (i246 ^ i247));
            int i249 = -(-(((i243 & i248) | (i243 ^ i248)) * 920));
            iArr3[(((~i249) & i228) | ((~i228) & i249)) + ((i249 & i228) << 1)] = (int) j38;
            int i250 = -(-(i17 * 185));
            int i251 = (-915) & i250;
            int i252 = ((i250 | (-915)) & (~i251)) + (i251 << 1);
            int i253 = i17 & 5;
            int i254 = (((-6) & i65) | i253 | (i17 & (-6))) * (-368);
            int i255 = ((~i254) & i252) | ((~i252) & i254);
            int i256 = -(-((i252 & i254) << 1));
            int i257 = (i255 ^ i256) + ((i256 & i255) << 1);
            int i258 = (i66 ^ 5) | (i66 & 5);
            int i259 = ~i170;
            int i260 = -(~(-(-(((i258 & i170) | ((~i258) & i170) | (i258 & i259)) * 184))));
            int i261 = (((i257 | i260) << 1) - (i260 ^ i257)) - 1;
            int i262 = (-6) ^ i66;
            int i263 = (-6) & i66;
            int i264 = ~((i263 & i262) | (i262 ^ i263));
            int i265 = ~((i170 & 5) | (i259 & 5) | (i170 & (-6)));
            int i266 = (i264 & i265) | (i264 ^ i265);
            int i267 = i253 | ((~i253) & (i17 | 5));
            int i268 = ~i267;
            int i269 = (i267 | i268) & i268;
            int i270 = ((i266 & i269) | (i266 ^ i269)) * 184;
            long j39 = (j28 * j15) + (((long) iArr3[(i261 ^ i270) + ((i270 & i261) << 1)]) & 4294967295L) + (j38 >>> 32);
            int i271 = i17 | 6;
            iArr3[((i271 << 1) - (i17 ^ 6)) - 1] = (int) j39;
            int i272 = i17 & 6;
            int i273 = i271 & (~i272);
            int i274 = i272 << 1;
            long j40 = (j28 * j27) + (((long) iArr3[(i273 - (~i274)) - 1]) & 4294967295L) + (j39 >>> 32);
            iArr3[i273 + i274] = (int) j40;
            long j41 = j40 >>> 32;
            long j42 = j28 * j17;
            int i275 = -(-(i17 * 917));
            int i276 = (-12817) & i275;
            int i277 = (((-12817) ^ i275) | i276) << 1;
            int i278 = -((i275 | (-12817)) & (~i276));
            int i279 = (i277 & i278) + (i278 | i277);
            int i280 = (-8) & i65;
            int i281 = i17 & 7;
            int i282 = i280 | i281;
            int i283 = (-8) & i17;
            int i284 = (i282 & i283) | (i282 ^ i283);
            int i285 = ~i284;
            int i286 = -(-(((i284 | i285) & i285) * 2748));
            int i287 = i279 & i286;
            int i288 = (i279 ^ i286) | i287;
            int i289 = (i287 & i288) + (i288 | i287);
            int i290 = (~i280) & ((-8) | i65);
            int i291 = -(-(((i290 & i280) | (i290 ^ i280)) * (-916)));
            int i292 = i289 & i291;
            int i293 = ((((i289 ^ i291) | i292) << 1) - (~(-((i291 | i289) & (~i292))))) - 1;
            int i294 = (-8) ^ i65;
            int i295 = (i294 & i280) | (i294 ^ i280);
            int i296 = ~i295;
            int i297 = (i295 | i296) & i296;
            int i298 = (i65 & 7) | i283;
            int i299 = (i298 & i281) | (i298 ^ i281);
            int i300 = ~i299;
            int i301 = (i299 | i300) & i300;
            int i302 = -(~(((i301 & i297) | (i297 ^ i301)) * 916));
            long j43 = j42 + (((long) iArr3[((i293 ^ i302) + ((i302 & i293) << 1)) - 1]) & 4294967295L) + j41;
            int i303 = -(-((i17 ^ 7) | i281));
            iArr3[(i281 ^ i303) + ((i303 & i281) << 1)] = (int) j43;
            int i304 = i17 & 8;
            iArr3[((~i304) & (i17 | 8)) + (i304 << 1)] = (int) (j43 >>> 32);
            int i305 = ((i63 & (-78)) + (i63 | (-78))) - 1;
            int i306 = i305 & 80;
            int i307 = -(-((i305 ^ 80) | i306));
            i18 = ((i307 & i306) << 1) + (i306 ^ i307);
            i13 = i35;
            j16 = j27;
            j14 = j31;
            j13 = j32;
            j12 = j35;
        }
        int i308 = f53950a;
        int i309 = i308 & 69;
        int i310 = (i308 | 69) & (~i309);
        int i311 = i309 << 1;
        int i312 = (i310 & i311) + (i310 | i311);
        f53951b = i312 % 128;
        if (i312 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Integer d(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int iIntValue3 = ((Number) objArr[4]).intValue();
        int i10 = f53950a;
        int i11 = ((i10 & 86) + (i10 | 86)) - 1;
        int i12 = i11 % 128;
        f53951b = i12;
        int i13 = i11 % 2;
        long j10 = (((long) iArr[iIntValue]) & 4294967295L) + (((long) iArr2[iIntValue2]) & 4294967295L) + (((long) iIntValue3) & 4294967295L);
        iArr2[iIntValue2] = (int) j10;
        int i14 = -(-(iIntValue * 881));
        int i15 = 881 & i14;
        int i16 = (i14 | 881) & (~i15);
        int i17 = -(-(i15 << 1));
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        int i19 = ~iIntValue;
        int i20 = (-2) & i19;
        int i21 = ~(((-2) ^ i19) | i20);
        int i22 = iIntValue & 1;
        int i23 = i20 | i22;
        int i24 = (-2) & iIntValue;
        int i25 = ~((i23 ^ i24) | (i23 & i24));
        int i26 = i21 & i25;
        int i27 = (i25 | i21) & (~i26);
        int i28 = (i26 & i27) | (i27 ^ i26);
        int i29 = (i19 | iIntValue) & i19;
        int i30 = i29 ^ iIntValue;
        int i31 = i29 & iIntValue;
        int i32 = (i18 - (~((i28 | (~((i30 & i31) | (i30 ^ i31)))) * (-880)))) - 1;
        int i33 = ~i29;
        int i34 = ((-2) & i33) | (i29 & 1);
        int i35 = (-2) & i29;
        int i36 = (i34 ^ i35) | (i34 & i35);
        int i37 = ~i36;
        int i38 = (i36 | i37) & i37;
        int i39 = ((~i38) & iIntValue) | (i38 & i19);
        int i40 = i38 & iIntValue;
        int i41 = (i39 ^ i40) | (i40 & i39);
        int i42 = iIntValue ^ 1;
        int i43 = ~((i42 ^ i22) | (i42 & i22));
        int i44 = i41 & i43;
        int i45 = (~i44) & (i41 | i43);
        int i46 = -(-(((i45 & i44) | (i45 ^ i44)) * (-880)));
        int i47 = (i32 ^ i46) + ((i46 & i32) << 1);
        int i48 = (i19 & 1) | i24;
        int i49 = -(~(-(-((~((i48 & i22) | (i48 ^ i22))) * 880))));
        long j11 = ((long) iArr[(((i47 | i49) << 1) - (i49 ^ i47)) - 1]) & 4294967295L;
        int i50 = iIntValue2 * (-751);
        int i51 = (-751) ^ i50;
        int i52 = ((i50 & (-751)) | i51) << 1;
        int i53 = -i51;
        int i54 = (i52 & i53) + (i52 | i53);
        int i55 = ~iIntValue2;
        int i56 = ~i55;
        int i57 = i55 & 1;
        int i58 = ((-2) & i56) | i57;
        int i59 = (-2) & i55;
        int i60 = ~((i58 ^ i59) | (i58 & i59));
        int i61 = (~i24) & ((-2) | iIntValue);
        int i62 = ~((i61 ^ i24) | (i24 & i61));
        int i63 = ((~i62) & i60) | ((~i60) & i62);
        int i64 = i62 & i60;
        int i65 = ((i64 & i63) | (i63 ^ i64)) * ReturnCode.ERR_CONN_IO;
        int i66 = ((i54 | i65) << 1) - (i65 ^ i54);
        int i67 = iIntValue2 & 1;
        int i68 = (-2) & iIntValue2;
        int i69 = i59 | i67 | i68;
        int i70 = -(-((~(((~i69) & iIntValue) | (i69 & i19) | (i69 & iIntValue))) * (-1504)));
        int i71 = i66 & i70;
        int i72 = i70 | i66;
        int i73 = (i71 & i72) + (i72 | i71);
        int i74 = (-2) ^ iIntValue2;
        int i75 = ~((i74 ^ i68) | (i74 & i68));
        int i76 = i55 ^ 1;
        int i77 = -(~(-(-((i75 | (~((i76 & i57) | (i76 ^ i57)))) * 752))));
        int i78 = (i73 & i77) + (i77 | i73);
        long j12 = j11 + (((long) iArr2[(i78 ^ (-1)) + (i78 << 1)]) & 4294967295L) + (j10 >>> 32);
        int i79 = ((iIntValue2 ^ 1) | i67) << 1;
        int i80 = -((~i67) & (iIntValue2 | 1));
        iArr2[(i79 ^ i80) + ((i79 & i80) << 1)] = (int) j12;
        int i81 = (iIntValue & (-3)) | (i19 & 2);
        int i82 = -(-((iIntValue & 2) << 1));
        long j13 = (((long) iArr[(i81 ^ i82) + ((i81 & i82) << 1)]) & 4294967295L) + (((long) iArr2[(iIntValue2 & 2) + (iIntValue2 | 2)]) & 4294967295L) + (j12 >>> 32);
        iArr2[(((iIntValue2 | 3) << 1) - (iIntValue2 ^ 3)) - 1] = (int) j13;
        long j14 = j13 >>> 32;
        int i83 = iIntValue * 85;
        int i84 = 255 & i83;
        int i85 = (i83 ^ 255) | i84;
        int i86 = (i84 ^ i85) + ((i85 & i84) << 1);
        int i87 = (-4) & i19;
        int i88 = (~i87) & ((-4) | i19);
        int i89 = (i88 & i87) | (i88 ^ i87);
        int i90 = ~i89;
        int i91 = (i89 | i90) & i90;
        int i92 = ~i19;
        int i93 = ((-4) & i92) | (i19 & 3);
        int i94 = ~((i87 & i93) | (i93 ^ i87));
        int i95 = i91 & i94;
        int i96 = ((i94 | i91) & (~i95)) | i95;
        int i97 = i19 & i29;
        int i98 = ~((i19 ^ i29) | i97);
        int i99 = i96 & i98;
        int i100 = ((i96 | i98) & (~i99)) | i99;
        int i101 = iIntValue ^ 3;
        int i102 = iIntValue & 3;
        int i103 = (i101 & i102) | (i101 ^ i102);
        int i104 = i103 & iIntValue;
        int i105 = (i103 | iIntValue) & (~i104);
        int i106 = ~((i105 & i104) | (i105 ^ i104));
        int i107 = ((~i106) & i100) | ((~i100) & i106);
        int i108 = i100 & i106;
        int i109 = ((i108 & i107) | (i107 ^ i108)) * (-84);
        int i110 = i86 & i109;
        int i111 = ((i86 ^ i109) | i110) << 1;
        int i112 = -((i86 | i109) & (~i110));
        int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
        int i114 = (iIntValue & i33) | i97;
        int i115 = ~(i114 | i31);
        int i116 = i115 & 3;
        int i117 = (i115 | 3) & (~i116);
        int i118 = (i117 & i116) | (i117 ^ i116);
        int i119 = ~((i114 & i31) | (i114 ^ i31));
        int i120 = -(-(((i119 & i118) | (i118 ^ i119)) * (-84)));
        int i121 = i113 ^ i120;
        int i122 = -(-((i120 & i113) << 1));
        int i123 = ((i121 | i122) << 1) - (i122 ^ i121);
        int i124 = i19 & iIntValue;
        int i125 = ~((i19 & i19) | (iIntValue & i92) | i124);
        int i126 = ~(iIntValue | 3);
        int i127 = i125 ^ i126;
        int i128 = i125 & i126;
        long j15 = (((long) iArr[(((i128 & i127) | (i127 ^ i128)) * 84) + i123]) & 4294967295L) + (((long) iArr2[(((iIntValue2 | 4) << 1) - (iIntValue2 ^ 4)) - 1]) & 4294967295L) + j14;
        int i129 = -(-(iIntValue2 * 131));
        int i130 = (((-387) | i129) << 1) - ((i129 & 386) | ((~i129) & (-387)));
        int i131 = (i55 & i33) | (i29 & i56) | (i55 & i29);
        int i132 = i131 ^ 3;
        int i133 = i131 & 3;
        int i134 = (~((i133 & i132) | (i132 ^ i133))) * 130;
        int i135 = ((~i134) & i130) | ((~i130) & i134);
        int i136 = -(-((i134 & i130) << 1));
        int i137 = (i135 ^ i136) + ((i136 & i135) << 1);
        int i138 = (i55 | iIntValue2) & i55;
        int i139 = i138 & 3;
        int i140 = -(-((~(i139 | ((~i139) & (i138 | 3)))) * (-260)));
        int i141 = i137 & i140;
        int i142 = -(-((i140 ^ i137) | i141));
        int i143 = (i141 & i142) + (i142 | i141);
        int i144 = (-4) & i55;
        int i145 = ~(((-4) & iIntValue2) | (iIntValue2 & 3) | i144);
        int i146 = i144 | (i56 & 3);
        int i147 = i55 & 3;
        int i148 = (i146 & i147) | (i146 ^ i147);
        int i149 = -(-((i145 | (~((i148 & iIntValue) | (i148 ^ iIntValue)))) * 130));
        int i150 = ((~i149) & i143) | ((~i143) & i149);
        int i151 = (i149 & i143) << 1;
        iArr2[(i150 ^ i151) + ((i151 & i150) << 1)] = (int) j15;
        long j16 = j15 >>> 32;
        long j17 = ((long) iArr[iIntValue + 4]) & 4294967295L;
        int i152 = -(~(-(-(iIntValue2 * (-518)))));
        int i153 = (((-2072) & i152) + (i152 | (-2072))) - 1;
        int i154 = (-5) & i19;
        int i155 = (~i154) & ((-5) | i19);
        int i156 = (i155 ^ i154) | (i155 & i154);
        int i157 = ~i156;
        int i158 = i157 & (i156 | i157);
        int i159 = iIntValue2 ^ i158;
        int i160 = i158 & iIntValue2;
        int i161 = (i153 - (~(-(-(((i159 ^ i160) | (i160 & i159)) * 519))))) - 1;
        int i162 = ((-5) ^ i19) | i154;
        int i163 = (i162 & i55) | ((~i162) & iIntValue2);
        int i164 = i162 & iIntValue2;
        int i165 = ~((i164 & i163) | (i163 ^ i164));
        int i166 = i55 & 4;
        int i167 = (iIntValue2 & (-5)) | i166;
        int i168 = iIntValue2 & 4;
        int i169 = (i167 ^ i168) | (i167 & i168);
        int i170 = ~((i169 & i19) | ((~i169) & iIntValue) | (i169 & iIntValue));
        int i171 = i165 & i170;
        int i172 = (i170 | i165) & (~i171);
        int i173 = -(~(((i172 & i171) | (i172 ^ i171)) * (-519)));
        int i174 = (-2) - ((((i161 | i173) << 1) - (i173 ^ i161)) ^ (-1));
        int i175 = ~((iIntValue2 ^ iIntValue) | (iIntValue2 & iIntValue));
        int i176 = -(-(((i175 & 4) | (i175 ^ 4)) * 519));
        int i177 = i174 & i176;
        long j18 = j17 + (((long) iArr2[(i177 - (~(-(-((i174 ^ i176) | i177))))) - 1]) & 4294967295L) + j16;
        int i178 = -(~(iIntValue2 * TypedValues.MotionType.TYPE_EASING));
        int i179 = (-2) - (((1208 ^ i178) + ((i178 & ReturnCode.ERR_CRY_ENCRYPT) << 1)) ^ (-1));
        int i180 = ~(((-5) ^ i29) | ((-5) & i29));
        int i181 = -(-(((i180 & iIntValue2) | ((~i180) & iIntValue2) | (i180 & i55)) * (-602)));
        int i182 = i179 & i181;
        int i183 = (i179 ^ i181) | i182;
        int i184 = ((i182 | i183) << 1) - (i183 ^ i182);
        int i185 = ~(((-5) & i56) | i166 | ((-5) & i55));
        int i186 = (-5) ^ iIntValue;
        int i187 = (-5) & iIntValue;
        int i188 = ~((i187 & i186) | (i186 ^ i187));
        int i189 = ((~i188) & i185) | ((~i185) & i188);
        int i190 = i188 & i185;
        int i191 = (i190 & i189) | (i189 ^ i190);
        int i192 = (i29 ^ 4) | (i29 & 4);
        int i193 = i192 & iIntValue2;
        int i194 = (i192 | iIntValue2) & (~i193);
        int i195 = ~((i194 & i193) | (i194 ^ i193));
        int i196 = ((~i195) & i191) | ((~i191) & i195);
        int i197 = i191 & i195;
        int i198 = ((i197 & i196) | (i196 ^ i197)) * (-301);
        int i199 = ((((~i198) & i184) | ((~i184) & i198)) - (~(-(-((i198 & i184) << 1))))) - 1;
        int i200 = -(-((~((i19 ^ iIntValue2) | (i19 & iIntValue2))) * 301));
        int i201 = i199 & i200;
        iArr2[((i200 | i199) & (~i201)) + (i201 << 1)] = (int) j18;
        int i202 = iIntValue & 5;
        int i203 = ((iIntValue ^ 5) | i202) << 1;
        int i204 = -((~i202) & (iIntValue | 5));
        long j19 = ((long) iArr[((i203 | i204) << 1) - (i203 ^ i204)]) & 4294967295L;
        int i205 = -(-(iIntValue2 * 339));
        int i206 = (((-1685) | i205) << 1) - ((i205 & 1684) | ((~i205) & (-1685)));
        int i207 = (-6) & i19;
        int i208 = (~i207) & ((-6) | i19);
        int i209 = ~((i208 & i207) | (i208 ^ i207));
        int i210 = i55 & 5;
        int i211 = ~((i55 ^ 5) | i210);
        int i212 = ((~i211) & i209) | ((~i209) & i211);
        int i213 = i209 & i211;
        int i214 = (i212 & i213) | (i212 ^ i213);
        int i215 = (i19 & 5) | (iIntValue & (-6));
        int i216 = (i202 & i215) | (i215 ^ i202);
        int i217 = ~i216;
        int i218 = (i216 | i217) & i217;
        int i219 = -(-(((i214 & i218) | (i214 ^ i218)) * (-338)));
        int i220 = i206 & i219;
        int i221 = ((i206 ^ i219) | i220) << 1;
        int i222 = -((i219 | i206) & (~i220));
        int i223 = (i221 ^ i222) + ((i222 & i221) << 1);
        int i224 = (-6) ^ iIntValue2;
        int i225 = (-6) & iIntValue2;
        int i226 = (i223 - (~(-(-((~((i224 ^ i225) | (i224 & i225))) * 338))))) - 1;
        int i227 = ~(((-6) ^ i19) | i207);
        int i228 = i210 | i225;
        int i229 = iIntValue2 & 5;
        int i230 = (i228 ^ i229) | (i228 & i229);
        int i231 = (i230 & i19) | ((~i230) & iIntValue);
        int i232 = i230 & iIntValue;
        int i233 = ~((i232 & i231) | (i231 ^ i232));
        int i234 = i226 - (~(-(-(((i227 & i233) | (((~i233) & i227) | ((~i227) & i233))) * 338))));
        long j20 = j19 + (((long) iArr2[(i234 ^ (-1)) + (i234 << 1)]) & 4294967295L) + (j18 >>> 32);
        int i235 = i229 << 1;
        iArr2[(i228 & i235) + (i235 | i228)] = (int) j20;
        long j21 = j20 >>> 32;
        int i236 = -(~(-(-(iIntValue * (-721)))));
        int i237 = (((-4326) & i236) + (i236 | (-4326))) - 1;
        int i238 = (-7) & i19;
        int i239 = ~(i238 | ((~i238) & ((-7) | i19)));
        int i240 = i19 & i239;
        int i241 = ((i239 | i19) & (~i240)) | i240;
        int i242 = iIntValue | 6;
        int i243 = ~i242;
        int i244 = ((i241 & i243) | (i241 ^ i243)) * 1444;
        int i245 = i237 | i244;
        int i246 = i245 << 1;
        int i247 = -((~(i237 & i244)) & i245);
        int i248 = ((i246 | i247) << 1) - (i247 ^ i246);
        int i249 = iIntValue & 6;
        int i250 = ~((iIntValue ^ 6) | i249);
        int i251 = (i242 & (~i249)) | i249;
        int i252 = ~i251;
        int i253 = (i251 | i252) & i252;
        int i254 = ((~i253) & i250) | ((~i250) & i253);
        int i255 = i250 & i253;
        int i256 = (i255 & i254) | (i254 ^ i255);
        int i257 = ~(i124 | i124 | (iIntValue & iIntValue));
        int i258 = ((~i257) & i256) | ((~i256) & i257);
        int i259 = i256 & i257;
        int i260 = ((i259 & i258) | (i258 ^ i259)) * (-1444);
        int i261 = ((~i260) & i248) | ((~i248) & i260);
        int i262 = -(-((i260 & i248) << 1));
        int i263 = ((i261 | i262) << 1) - (i262 ^ i261);
        int i264 = (-7) ^ iIntValue;
        int i265 = (-7) & iIntValue;
        int i266 = ~((i264 & i265) | (i264 ^ i265));
        int i267 = ~(i19 | 6);
        int i268 = i266 ^ i267;
        int i269 = i266 & i267;
        int i270 = ((i269 & i268) | (i268 ^ i269)) * ErrorCodes.STORAGE_PERMISSION;
        long j22 = ((long) iArr[((i263 | i270) << 1) - (i270 ^ i263)]) & 4294967295L;
        int i271 = -(-(iIntValue2 * 399));
        int i272 = 2394 ^ i271;
        int i273 = -(-((i271 & 2394) << 1));
        int i274 = (i272 & i273) + (i273 | i272);
        int i275 = iIntValue2 & 6;
        int i276 = (-7) & iIntValue2;
        int i277 = ~(((-7) & i55) | i275 | i276);
        int i278 = i138 & 6;
        int i279 = (~i278) & (i138 | 6);
        int i280 = (i279 ^ i278) | (i278 & i279);
        int i281 = ~i280;
        int i282 = (i280 | i281) & i281;
        int i283 = i277 ^ i282;
        int i284 = i277 & i282;
        int i285 = (i284 & i283) | (i283 ^ i284);
        int i286 = i55 & iIntValue;
        int i287 = (~i286) & (i55 | iIntValue);
        int i288 = ~((i287 ^ i286) | (i286 & i287));
        int i289 = -(-(((i285 & i288) | (i285 ^ i288)) * 398));
        int i290 = i274 ^ i289;
        int i291 = ((i289 & i274) | i290) << 1;
        int i292 = -i290;
        int i293 = (i291 & i292) + (i291 | i292);
        int i294 = iIntValue2 ^ 6;
        int i295 = ((i294 | i275) * (-1194)) + i293;
        int i296 = (i29 & (~i138)) | (i138 & i33);
        int i297 = i138 & i29;
        int i298 = (i296 ^ i297) | (i296 & i297);
        int i299 = ~i298;
        int i300 = (i298 | i299) & i299;
        int i301 = (~i276) & ((-7) | iIntValue2);
        int i302 = i300 | (~((i301 ^ i276) | (i276 & i301)));
        int i303 = i55 & 6;
        int i304 = (~i303) & (i55 | 6);
        int i305 = ~((i304 ^ i303) | (i303 & i304));
        int i306 = i302 ^ i305;
        int i307 = i302 & i305;
        int i308 = -(-(((i307 & i306) | (i306 ^ i307)) * 398));
        int i309 = i295 ^ i308;
        int i310 = ((i308 & i295) | i309) << 1;
        int i311 = -i309;
        long j23 = j22 + (((long) iArr2[(i310 & i311) + (i310 | i311)]) & 4294967295L) + j21;
        iArr2[i294 + (i275 << 1)] = (int) j23;
        long j24 = j23 >>> 32;
        long j25 = ((long) iArr[(-2) - ((iIntValue + 8) ^ (-1))]) & 4294967295L;
        int i312 = -(~(iIntValue2 * (-67)));
        int i313 = ((483 & i312) + (i312 | 483)) - 1;
        int i314 = i55 & 7;
        int i315 = (-8) & i55;
        int i316 = ((-8) & i56) | i314 | i315;
        int i317 = i316 & i19;
        int i318 = (~i317) & (i316 | i19);
        int i319 = ~((i318 & i317) | (i318 ^ i317));
        int i320 = iIntValue2 ^ 7;
        int i321 = iIntValue2 & 7;
        int i322 = (i320 ^ i321) | (i320 & i321);
        int i323 = ~i322;
        int i324 = (i322 | i323) & i323;
        int i325 = i319 & i324;
        int i326 = (~i325) & (i319 | i324);
        int i327 = (i326 & i325) | (i326 ^ i325);
        int i328 = iIntValue | iIntValue2;
        int i329 = ~i328;
        int i330 = (i328 | i329) & i329;
        int i331 = ((~i330) & i327) | ((~i327) & i330);
        int i332 = i327 & i330;
        int i333 = (i313 - (~(((i332 & i331) | (i331 ^ i332)) * (-68)))) - 1;
        int i334 = (-8) ^ i19;
        int i335 = (-8) & i19;
        int i336 = (i334 ^ i335) | (i334 & i335);
        int i337 = i336 & iIntValue2;
        int i338 = (i336 | iIntValue2) & (~i337);
        int i339 = -(-((~((i338 & i337) | (i338 ^ i337))) * (-68)));
        int i340 = (i333 & i339) + (i339 | i333);
        int i341 = ~((i138 ^ i19) | (i138 & i19));
        int i342 = (-8) ^ i341;
        int i343 = i341 & (-8);
        int i344 = ((i343 & i342) | (i342 ^ i343)) * 68;
        long j26 = j25 + (((long) iArr2[(((~i344) & i340) | ((~i340) & i344)) + ((i344 & i340) << 1)]) & 4294967295L) + j24;
        int i345 = -(-(iIntValue2 * (-493)));
        int i346 = (3465 & i345) + (i345 | 3465);
        int i347 = (i56 & 7) | i315;
        int i348 = -(-(((i347 & i314) | (i347 ^ i314)) * (-988)));
        int i349 = i346 & i348;
        int i350 = -(-((i348 ^ i346) | i349));
        int i351 = ((i349 | i350) << 1) - (i350 ^ i349);
        int i352 = ((iIntValue2 ^ (-8)) | (iIntValue2 & (-8)) | i19) * 494;
        int i353 = i351 & i352;
        int i354 = (((i351 ^ i352) | i353) << 1) - ((i352 | i351) & (~i353));
        int i355 = ~(((~i315) & ((-8) | i55)) | i315);
        int i356 = ~(i19 | iIntValue2);
        int i357 = i355 & i356;
        int i358 = (i355 | i356) & (~i357);
        int i359 = (i358 & i357) | (i358 ^ i357);
        int i360 = iIntValue2 | 7;
        int i361 = ~i360;
        int i362 = (i360 | i361) & i361;
        int i363 = i359 ^ i362;
        int i364 = i359 & i362;
        int i365 = ((i364 & i363) | (i363 ^ i364)) * 494;
        iArr2[(((i354 ^ i365) | (i354 & i365)) << 1) - ((i365 & (~i354)) | ((~i365) & i354))] = (int) j26;
        int i366 = (int) (j26 >>> 32);
        int i367 = i12 & 3;
        int i368 = i12 | 3;
        int i369 = (i367 & i368) + (i367 | i368);
        f53950a = i369 % 128;
        if (i369 % 2 == 0) {
            return Integer.valueOf(i366);
        }
        int i370 = 84 / 0;
        return Integer.valueOf(i366);
    }

    public static /* synthetic */ void e(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53951b;
        int i11 = ((i10 ^ 30) + ((i10 & 30) << 1)) - 1;
        f53950a = i11 % 128;
        if (i11 % 2 != 0) {
            jArr2[0] = jArr[0];
            jArr2[1] = jArr[1];
            long j10 = jArr[2];
            jArr2[4] = j10;
            jArr2[5] = j10;
        } else {
            jArr2[0] = jArr[0];
            jArr2[1] = jArr[1];
            jArr2[2] = jArr[2];
            jArr2[3] = jArr[3];
        }
        int i12 = (-2) - ((((i10 | 94) << 1) - (i10 ^ 94)) ^ (-1));
        f53950a = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Boolean f(Object[] objArr) {
        int i10 = 0;
        long[] jArr = (long[]) objArr[0];
        int i11 = f53951b;
        int i12 = i11 ^ 1;
        int i13 = (i11 & 1) << 1;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        int i15 = i14 % 128;
        f53950a = i15;
        int i16 = i14 % 2;
        int i17 = i15 & 59;
        int i18 = (i17 - (~((i15 ^ 59) | i17))) - 1;
        f53951b = i18 % 128;
        int i19 = i18 % 2;
        while (i10 < 4) {
            int i20 = f53951b;
            int i21 = i20 + 47;
            int i22 = i21 % 128;
            f53950a = i22;
            if (i21 % 2 != 0) {
                if (jArr[i10] != 1) {
                    int i23 = ((i20 & 24) + (i20 | 24)) - 1;
                    f53950a = i23 % 128;
                    int i24 = i23 % 2;
                    return Boolean.FALSE;
                }
                i10 = (-2) - ((i10 + 2) ^ (-1));
                int i25 = i22 ^ 37;
                int i26 = -(-((i22 & 37) << 1));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                f53951b = i27 % 128;
                int i28 = i27 % 2;
            } else {
                if (jArr[i10] != 0) {
                    int i29 = ((i20 & 24) + (i20 | 24)) - 1;
                    f53950a = i29 % 128;
                    int i210 = i29 % 2;
                    return Boolean.FALSE;
                }
                i10 = (-2) - ((i10 + 2) ^ (-1));
                int i211 = i22 ^ 37;
                int i212 = -(-((i22 & 37) << 1));
                int i213 = ((i211 | i212) << 1) - (i211 ^ i212);
                f53951b = i213 % 128;
                int i214 = i213 % 2;
            }
        }
        int i30 = f53950a;
        int i31 = ((i30 ^ 96) + ((i30 & 96) << 1)) - 1;
        f53951b = i31 % 128;
        if (i31 % 2 != 0) {
            return Boolean.TRUE;
        }
        throw null;
    }

    public static /* synthetic */ Integer g(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53950a;
        int i11 = ((i10 ^ 35) | (i10 & 35)) << 1;
        int i12 = -((i10 & (-36)) | ((~i10) & 35));
        int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
        f53951b = i13 % 128;
        int i14 = i13 % 2;
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
        long j16 = ((((long) iArr2[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j15 >> 32);
        iArr2[6] = (int) j16;
        long j17 = ((((long) iArr2[7]) & 4294967295L) - (4294967295L & ((long) iArr[7]))) + (j16 >> 32);
        iArr2[7] = (int) j17;
        int i15 = (int) (j17 >> 32);
        int i16 = ((i10 | 65) << 1) - (i10 ^ 65);
        f53951b = i16 % 128;
        if (i16 % 2 != 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static int getNavBarTitleString(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setX(new Object[]{iArr, iArr2, iArr3}, -854306397, 854306423, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Integer h(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53951b;
        int i11 = ((i10 ^ 23) - (~(-(-((i10 & 23) << 1))))) - 1;
        int i12 = i11 % 128;
        f53950a = i12;
        int i13 = i11 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (((long) iArr[7]) & 4294967295L) + (4294967295L & ((long) iArr2[7])) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        int i14 = (int) (j17 >>> 32);
        int i15 = (i12 ^ 105) + ((i12 & 105) << 1);
        f53951b = i15 % 128;
        if (i15 % 2 != 0) {
            return Integer.valueOf(i14);
        }
        throw null;
    }

    public static /* synthetic */ Object i(Object[] objArr) {
        int i10 = 0;
        BigInteger bigIntegerShiftRight = (BigInteger) objArr[0];
        int i11 = f53950a;
        int i12 = i11 & 55;
        int i13 = ((i11 ^ 55) | i12) << 1;
        int i14 = -((i11 | 55) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        f53951b = i15 % 128;
        if (i15 % 2 == 0) {
            bigIntegerShiftRight.signum();
            throw null;
        }
        if (bigIntegerShiftRight.signum() >= 0) {
            int i16 = f53950a + 77;
            f53951b = i16 % 128;
            int i17 = i16 % 2;
            if (bigIntegerShiftRight.bitLength() <= 256) {
                int[] iArr = (int[]) setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
                int i18 = f53951b;
                int i19 = (i18 & 77) + (i18 | 77);
                f53950a = i19 % 128;
                int i20 = i19 % 2;
                while (i10 < 8) {
                    int i21 = f53951b;
                    int i22 = i21 ^ 35;
                    int i23 = -(-((i21 & 35) << 1));
                    int i24 = (i22 & i23) + (i23 | i22);
                    f53950a = i24 % 128;
                    int i25 = i24 % 2;
                    int iIntValue = bigIntegerShiftRight.intValue();
                    if (i25 != 0) {
                        iArr[i10] = iIntValue;
                        bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(36);
                        i10 = (((i10 | 40) << 1) - (i10 ^ 40)) - 1;
                    } else {
                        iArr[i10] = iIntValue;
                        bigIntegerShiftRight = bigIntegerShiftRight.shiftRight(32);
                        int i26 = i10 & 1;
                        int i27 = -(-((i10 ^ 1) | i26));
                        i10 = (i26 & i27) + (i27 | i26);
                    }
                }
                int i28 = f53951b;
                int i29 = i28 & 11;
                int i30 = (i28 | 11) & (~i29);
                int i31 = -(-(i29 << 1));
                int i32 = (i30 ^ i31) + ((i30 & i31) << 1);
                f53950a = i32 % 128;
                int i33 = i32 % 2;
                return iArr;
            }
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ Integer j(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53950a;
        int i11 = i10 & 71;
        int i12 = ((((i10 ^ 71) | i11) << 1) - (~(-((i10 | 71) & (~i11))))) - 1;
        int i13 = i12 % 128;
        f53951b = i13;
        int i14 = i12 % 2;
        long j10 = (((long) iArr[0]) & 4294967295L) + (((long) iArr2[0]) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
        iArr3[0] = (int) j10;
        long j11 = (((long) iArr[1]) & 4294967295L) + (((long) iArr2[1]) & 4294967295L) + (((long) iArr3[1]) & 4294967295L) + (j10 >>> 32);
        iArr3[1] = (int) j11;
        long j12 = (((long) iArr[2]) & 4294967295L) + (((long) iArr2[2]) & 4294967295L) + (((long) iArr3[2]) & 4294967295L) + (j11 >>> 32);
        iArr3[2] = (int) j12;
        long j13 = (((long) iArr[3]) & 4294967295L) + (((long) iArr2[3]) & 4294967295L) + (((long) iArr3[3]) & 4294967295L) + (j12 >>> 32);
        iArr3[3] = (int) j13;
        long j14 = (((long) iArr[4]) & 4294967295L) + (((long) iArr2[4]) & 4294967295L) + (((long) iArr3[4]) & 4294967295L) + (j13 >>> 32);
        iArr3[4] = (int) j14;
        long j15 = (((long) iArr[5]) & 4294967295L) + (((long) iArr2[5]) & 4294967295L) + (((long) iArr3[5]) & 4294967295L) + (j14 >>> 32);
        iArr3[5] = (int) j15;
        long j16 = (((long) iArr[6]) & 4294967295L) + (((long) iArr2[6]) & 4294967295L) + (((long) iArr3[6]) & 4294967295L) + (j15 >>> 32);
        iArr3[6] = (int) j16;
        long j17 = (((long) iArr[7]) & 4294967295L) + (((long) iArr2[7]) & 4294967295L) + (4294967295L & ((long) iArr3[7])) + (j16 >>> 32);
        iArr3[7] = (int) j17;
        int i15 = (int) (j17 >>> 32);
        int i16 = i13 ^ 33;
        int i17 = (i13 & 33) << 1;
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        f53950a = i18 % 128;
        if (i18 % 2 == 0) {
            return Integer.valueOf(i15);
        }
        throw null;
    }

    public static /* synthetic */ Integer k(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53950a;
        int i11 = i10 & 31;
        int i12 = -(-((i10 ^ 31) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        f53951b = i14;
        int i15 = i13 % 2;
        long j10 = ((((long) iArr2[0]) & 4294967295L) * 19) + (((long) iArr[0]) & 4294967295L);
        iArr2[0] = (int) j10;
        long j11 = ((((long) iArr2[1]) & 4294967295L) * 19) + (((long) iArr[1]) & 4294967295L) + (j10 >>> 32);
        iArr2[1] = (int) j11;
        long j12 = ((((long) iArr2[2]) & 4294967295L) * 19) + (((long) iArr[2]) & 4294967295L) + (j11 >>> 32);
        iArr2[2] = (int) j12;
        long j13 = ((((long) iArr2[3]) & 4294967295L) * 19) + (((long) iArr[3]) & 4294967295L) + (j12 >>> 32);
        iArr2[3] = (int) j13;
        long j14 = ((((long) iArr2[4]) & 4294967295L) * 19) + (((long) iArr[4]) & 4294967295L) + (j13 >>> 32);
        iArr2[4] = (int) j14;
        long j15 = ((((long) iArr2[5]) & 4294967295L) * 19) + (((long) iArr[5]) & 4294967295L) + (j14 >>> 32);
        iArr2[5] = (int) j15;
        long j16 = ((((long) iArr2[6]) & 4294967295L) * 19) + (((long) iArr[6]) & 4294967295L) + (j15 >>> 32);
        iArr2[6] = (int) j16;
        long j17 = ((((long) iArr2[7]) & 4294967295L) * 19) + (4294967295L & ((long) iArr[7])) + (j16 >>> 32);
        iArr2[7] = (int) j17;
        int i16 = (int) (j17 >>> 32);
        int i17 = (((i14 | 36) << 1) - (i14 ^ 36)) - 1;
        f53950a = i17 % 128;
        if (i17 % 2 == 0) {
            return Integer.valueOf(i16);
        }
        throw null;
    }

    public static /* synthetic */ Boolean l(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int i10 = f53951b;
        int i11 = (i10 & 39) + (i10 | 39);
        f53950a = i11 % 128;
        if (i11 % 2 == 0 ? iArr[0] != 1 : iArr[0] != 0) {
            int i12 = ((i10 & 52) + (i10 | 52)) - 1;
            f53950a = i12 % 128;
            if (i12 % 2 == 0) {
                return Boolean.FALSE;
            }
            int i13 = 27 / 0;
            return Boolean.FALSE;
        }
        int i14 = (i10 ^ 105) + ((i10 & 105) << 1);
        f53950a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 1;
        while (i16 < 8) {
            int i17 = f53951b;
            int i18 = i17 & 99;
            int i19 = (i17 ^ 99) | i18;
            int i20 = (i18 ^ i19) + ((i18 & i19) << 1);
            int i21 = i20 % 128;
            f53950a = i21;
            int i22 = i20 % 2;
            if (iArr[i16] != 0) {
                int i23 = i17 & 89;
                int i24 = i17 | 89;
                int i25 = ((i23 | i24) << 1) - (i23 ^ i24);
                int i26 = i25 % 128;
                f53950a = i26;
                int i27 = i25 % 2;
                int i28 = (((i26 | 11) << 1) - (~(-(((~i26) & 11) | (i26 & (-12)))))) - 1;
                f53951b = i28 % 128;
                if (i28 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            int i29 = (i16 & (-72)) | ((~i16) & 71);
            int i30 = -(-((i16 & 71) << 1));
            int i31 = (i29 & i30) + (i30 | i29);
            int i32 = ((i31 ^ (-70)) | (i31 & (-70))) << 1;
            int i33 = -((i31 & 69) | ((~i31) & (-70)));
            i16 = ((i32 | i33) << 1) - (i32 ^ i33);
            int i34 = i21 & 9;
            int i35 = (i21 | 9) & (~i34);
            int i36 = -(-(i34 << 1));
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            f53951b = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = f53951b;
        int i40 = i39 & 49;
        int i41 = (((i39 ^ 49) | i40) << 1) - ((i39 | 49) & (~i40));
        f53950a = i41 % 128;
        int i42 = i41 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Long m(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53950a;
        int i11 = (((i10 | 89) << 1) - (~(-((i10 & (-90)) | ((~i10) & 89))))) - 1;
        f53951b = i11 % 128;
        int i12 = i11 % 2;
        long j10 = ((long) iArr[8]) & 4294967295L;
        long j11 = (j10 * 977) + (((long) iArr2[0]) & 4294967295L);
        iArr3[0] = (int) j11;
        long j12 = j11 >>> 32;
        long j13 = ((long) iArr[9]) & 4294967295L;
        long j14 = (j13 * 977) + j10 + (((long) iArr2[1]) & 4294967295L) + j12;
        iArr3[1] = (int) j14;
        long j15 = ((long) iArr[10]) & 4294967295L;
        long j16 = (j15 * 977) + j13 + (((long) iArr2[2]) & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j16;
        long j17 = ((long) iArr[11]) & 4294967295L;
        long j18 = (j17 * 977) + j15 + (((long) iArr2[3]) & 4294967295L) + (j16 >>> 32);
        iArr3[3] = (int) j18;
        long j19 = ((long) iArr[12]) & 4294967295L;
        long j20 = (j19 * 977) + j17 + (((long) iArr2[4]) & 4294967295L) + (j18 >>> 32);
        iArr3[4] = (int) j20;
        long j21 = ((long) iArr[13]) & 4294967295L;
        long j22 = (j21 * 977) + j19 + (((long) iArr2[5]) & 4294967295L) + (j20 >>> 32);
        iArr3[5] = (int) j22;
        long j23 = ((long) iArr[14]) & 4294967295L;
        long j24 = (j23 * 977) + j21 + (((long) iArr2[6]) & 4294967295L) + (j22 >>> 32);
        iArr3[6] = (int) j24;
        long j25 = ((long) iArr[15]) & 4294967295L;
        long j26 = (977 * j25) + j23 + (((long) iArr2[7]) & 4294967295L) + (j24 >>> 32);
        iArr3[7] = (int) j26;
        long j27 = (j26 >>> 32) + j25;
        int i13 = i10 & 35;
        int i14 = (i10 ^ 35) | i13;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        f53951b = i15 % 128;
        if (i15 % 2 != 0) {
            return Long.valueOf(j27);
        }
        throw null;
    }

    public static /* synthetic */ Object n() {
        int i10 = f53951b;
        int i11 = ((((i10 ^ 63) | (i10 & 63)) << 1) - (~(-((i10 & (-64)) | ((~i10) & 63))))) - 1;
        f53950a = i11 % 128;
        int i12 = i11 % 2;
        long[] jArr = new long[4];
        int i13 = (i10 & 25) + (i10 | 25);
        f53950a = i13 % 128;
        if (i13 % 2 != 0) {
            int i14 = 15 / 0;
        }
        return jArr;
    }

    public static /* synthetic */ Boolean o(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        int i10 = f53951b;
        int i11 = (i10 & 21) + (i10 | 21);
        int i12 = i11 % 128;
        f53950a = i12;
        if (i11 % 2 == 0 ? jArr[0] != 1 : jArr[0] != 1) {
            int i13 = (i10 & (-14)) | ((~i10) & 13);
            int i14 = (i10 & 13) << 1;
            int i15 = (i13 & i14) + (i13 | i14);
            f53950a = i15 % 128;
            if (i15 % 2 == 0) {
                return Boolean.FALSE;
            }
            throw null;
        }
        int i16 = (i12 | 35) << 1;
        int i17 = -(i12 ^ 35);
        int i18 = (i16 ^ i17) + ((i16 & i17) << 1);
        f53951b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = 1;
        while (i20 < 4) {
            int i21 = f53950a;
            int i22 = i21 & 107;
            int i23 = (~i22) & (i21 | 107);
            int i24 = i22 << 1;
            int i25 = (i23 & i24) + (i24 | i23);
            int i26 = i25 % 128;
            f53951b = i26;
            int i27 = i25 % 2;
            if (jArr[i20] != 0) {
                int i28 = i21 & 41;
                int i29 = i28 + ((i21 ^ 41) | i28);
                f53951b = i29 % 128;
                int i30 = i29 % 2;
                int i31 = ((i21 | 75) << 1) - (i21 ^ 75);
                f53951b = i31 % 128;
                int i32 = i31 % 2;
                return Boolean.FALSE;
            }
            int i33 = (-2) - (((i20 & 88) + (i20 | 88)) ^ (-1));
            i20 = ((i33 & (-85)) + (i33 | (-85))) - 1;
            int i34 = ((i26 & 71) - (~(-(-(i26 | 71))))) - 1;
            f53950a = i34 % 128;
            int i35 = i34 % 2;
        }
        int i36 = f53950a;
        int i37 = ((i36 | 36) << 1) - (i36 ^ 36);
        int i38 = (i37 ^ (-1)) + (i37 << 1);
        f53951b = i38 % 128;
        int i39 = i38 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ Integer p(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int[] iArr3 = (int[]) objArr[2];
        int i10 = f53950a;
        int i11 = (i10 ^ 69) + ((i10 & 69) << 1);
        f53951b = i11 % 128;
        int i12 = i11 % 2;
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
        long j15 = ((((long) iArr[5]) & 4294967295L) - (((long) iArr2[5]) & 4294967295L)) + (j14 >> 32);
        iArr3[5] = (int) j15;
        long j16 = ((((long) iArr[6]) & 4294967295L) - (((long) iArr2[6]) & 4294967295L)) + (j15 >> 32);
        iArr3[6] = (int) j16;
        long j17 = ((((long) iArr[7]) & 4294967295L) - (4294967295L & ((long) iArr2[7]))) + (j16 >> 32);
        iArr3[7] = (int) j17;
        int i13 = (int) (j17 >> 32);
        int i14 = ((i10 | 37) << 1) - (i10 ^ 37);
        f53951b = i14 % 128;
        if (i14 % 2 != 0) {
            return Integer.valueOf(i13);
        }
        throw null;
    }

    public static /* synthetic */ Boolean q(Object[] objArr) {
        long[] jArr = (long[]) objArr[0];
        long[] jArr2 = (long[]) objArr[1];
        int i10 = f53951b;
        int i11 = i10 & 111;
        int i12 = (i10 | 111) & (~i11);
        int i13 = -(-(i11 << 1));
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = i14 % 128;
        f53950a = i15;
        int i16 = i14 % 2;
        int i17 = (i15 & (-124)) | ((~i15) & 123);
        int i18 = -(-((i15 & 123) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        f53951b = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 3;
        while (i21 >= 0) {
            int i22 = f53951b;
            int i23 = i22 & 59;
            int i24 = ((i22 ^ 59) | i23) << 1;
            int i25 = -((~i23) & (i22 | 59));
            int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
            int i27 = i26 % 128;
            f53950a = i27;
            if (i26 % 2 != 0) {
                long j10 = jArr[i21];
                long j11 = jArr2[i21];
                throw null;
            }
            if (jArr[i21] != jArr2[i21]) {
                int i28 = i27 & 41;
                int i29 = -(-((i27 ^ 41) | i28));
                int i30 = ((i28 | i29) << 1) - (i28 ^ i29);
                f53951b = i30 % 128;
                return Boolean.valueOf(!(i30 % 2 != 0));
            }
            int i31 = i21 & (-86);
            int i32 = ((i21 | (-86)) & (~i31)) + (i31 << 1);
            int i33 = i32 & 85;
            i21 = ((i32 ^ 85) | i33) + i33;
            int i34 = i22 & 117;
            int i35 = (i22 | 117) & (~i34);
            int i36 = i34 << 1;
            int i37 = (i35 ^ i36) + ((i35 & i36) << 1);
            f53950a = i37 % 128;
            int i38 = i37 % 2;
        }
        int i39 = f53951b;
        int i40 = ((i39 | 67) << 1) - (i39 ^ 67);
        f53950a = i40 % 128;
        int i41 = i40 % 2;
        return Boolean.TRUE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0048 A[PHI: r5
      0x0048: PHI (r5v14 long) = (r5v8 long), (r5v23 long) binds: [B:11:0x0046, B:8:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ BigInteger r(Object[] objArr) {
        long j10;
        long[] jArr = (long[]) objArr[0];
        int i10 = f53951b;
        int i11 = ((i10 | 71) << 1) - (i10 ^ 71);
        int i12 = i11 % 128;
        f53950a = i12;
        int i13 = i11 % 2;
        byte[] bArr = new byte[32];
        int i14 = ((i12 & (-32)) | ((~i12) & 31)) + ((i12 & 31) << 1);
        f53951b = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 0;
        while (i16 < 4) {
            int i17 = f53951b;
            int i18 = (i17 & 101) + (i17 | 101);
            f53950a = i18 % 128;
            if (i18 % 2 != 0) {
                j10 = jArr[i16];
                if (j10 != 0) {
                    int i19 = -i16;
                    int i20 = i19 & 3;
                    int i21 = (((i19 | 3) & (~i20)) + (i20 << 1)) << 3;
                    ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i21)}, 108647497, -108647488, i21);
                    int i22 = f53951b;
                    int i23 = (((i22 ^ 91) | (i22 & 91)) << 1) - (((~i22) & 91) | (i22 & (-92)));
                    f53950a = i23 % 128;
                    int i24 = i23 % 2;
                }
            } else {
                j10 = jArr[i16];
                if (j10 != 0) {
                    int i110 = -i16;
                    int i25 = i110 & 3;
                    int i26 = (((i110 | 3) & (~i25)) + (i25 << 1)) << 3;
                    ber.setDividerPadding(new Object[]{Long.valueOf(j10), bArr, Integer.valueOf(i26)}, 108647497, -108647488, i26);
                    int i27 = f53951b;
                    int i28 = (((i27 ^ 91) | (i27 & 91)) << 1) - (((~i27) & 91) | (i27 & (-92)));
                    f53950a = i28 % 128;
                    int i29 = i28 % 2;
                }
            }
            i16 = (i16 ^ (-73)) + ((i16 & (-73)) << 1) + 74;
            int i30 = f53951b + 115;
            f53950a = i30 % 128;
            int i31 = i30 % 2;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        int i32 = f53951b;
        int i33 = i32 & 27;
        int i34 = i32 | 27;
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        f53950a = i35 % 128;
        if (i35 % 2 == 0) {
            return bigInteger;
        }
        throw null;
    }

    public static /* synthetic */ void s(Object[] objArr) {
        long j10;
        int i10;
        int i11;
        int[] iArr;
        int[] iArr2 = (int[]) objArr[0];
        int i12 = 1;
        int[] iArr3 = (int[]) objArr[1];
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i13 = ~iCurrentTimeMillis;
        int i14 = (-940162344) | i13;
        int i15 = ~i14;
        int i16 = (i14 | i15) & i15;
        int i17 = 805348612 ^ i16;
        int i18 = i16 & 805348612;
        int i19 = (i18 & i17) | (i17 ^ i18);
        int i20 = 968867623 & iCurrentTimeMillis;
        int i21 = ~((968867623 ^ iCurrentTimeMillis) | i20);
        int i22 = (-1962673662) - (~(-(-(((i19 & i21) | (i19 ^ i21)) * (-502)))));
        int i23 = ((~i13) & (-940162344)) | (940162343 & i13);
        int i24 = i13 & (-940162344);
        int i25 = (i24 & i23) | (i23 ^ i24);
        int i26 = i25 & 834053892;
        int i27 = (i25 | 834053892) & (~i26);
        int i28 = ~((i27 & i26) | (i27 ^ i26));
        int i29 = (iCurrentTimeMillis | 968867623) & (~i20);
        int i30 = (i29 & i20) | (i29 ^ i20);
        int i31 = ~i30;
        int i32 = (i30 | i31) & i31;
        int i33 = ((i32 & i28) | (i28 ^ i32)) * 502;
        int i34 = i22 ^ i33;
        int i35 = (((i33 & i22) | i34) << 1) - i34;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i36 = ~iCurrentTimeMillis2;
        int i37 = (i36 | iCurrentTimeMillis2) & i36;
        int i38 = ~((i37 & (-1818463604)) | ((-1818463604) ^ i37));
        int i39 = ((~i36) & (-1931543610)) | (1931543609 & i36);
        int i40 = (-1931543610) & i36;
        int i41 = (i39 & i40) | (i39 ^ i40);
        int i42 = ~i41;
        int i43 = (i41 | i42) & i42;
        int i44 = (-2) - (((-578950352) - (~(-(-(((i38 & i43) | (((~i43) & i38) | ((~i38) & i43))) * (-867)))))) ^ (-1));
        int i45 = (-1818463604) & iCurrentTimeMillis2;
        int i46 = ((-1818463604) | iCurrentTimeMillis2) & (~i45);
        int i47 = (i46 & i45) | (i46 ^ i45);
        int i48 = ~i47;
        int i49 = (i47 | i48) & i48;
        int i50 = 1612776497 & i49;
        int i51 = ((i49 | 1612776497) & (~i50)) | i50;
        int i52 = ((-1931543610) ^ iCurrentTimeMillis2) | ((-1931543610) & iCurrentTimeMillis2);
        int i53 = ~i52;
        int i54 = (i52 | i53) & i53;
        int i55 = i51 ^ i54;
        int i56 = i51 & i54;
        int i57 = (i44 - (~(-(-(((i56 & i55) | (i55 ^ i56)) * (-1734)))))) - 1;
        int i58 = (-1612776498) & i36;
        int i59 = (i36 | (-1612776498)) & (~i58);
        int i60 = ~((i59 & i58) | (i59 ^ i58));
        int i61 = (-205687107) & iCurrentTimeMillis2;
        int i62 = ((-205687107) | iCurrentTimeMillis2) & (~i61);
        int i63 = (i62 & i61) | (i62 ^ i61);
        int i64 = ~i63;
        int i65 = (i63 | i64) & i64;
        int i66 = ((~i65) & i60) | ((~i60) & i65);
        int i67 = i60 & i65;
        int i68 = (i67 & i66) | (i66 ^ i67);
        int i69 = ~((iCurrentTimeMillis2 & (-318767113)) | ((-318767113) ^ iCurrentTimeMillis2));
        int i70 = i68 & i69;
        int i71 = (i69 | i68) & (~i70);
        int i72 = -(-(((i71 & i70) | (i71 ^ i70)) * 867));
        int i73 = (((i57 ^ i72) | (i57 & i72)) << 1) - ((i72 & (~i57)) | ((~i72) & i57));
        int i74 = 8;
        long j11 = 4294967295L;
        if (i35 <= i73) {
            j10 = ((long) iArr2[67]) & 4294967295L;
            i10 = 80;
            i11 = 119;
        } else {
            j10 = ((long) iArr2[8]) & 4294967295L;
            i10 = 7;
            i11 = 16;
        }
        int i75 = 0;
        while (true) {
            int i76 = i10 & 123;
            int i77 = (i76 - (~((i10 ^ 123) | i76))) - i12;
            int i78 = (-2) - (((i77 & (-123)) + (i77 | (-123))) ^ (-1));
            int i79 = i10 & 8;
            long j12 = ((long) iArr2[(((i10 | i74) & (~i79)) - (~(i79 << i12))) - i12]) & j11;
            long j13 = j12 * j12;
            int i80 = (((i11 | (-11)) << i12) - (i11 ^ (-11))) - i12;
            int i81 = i80 ^ 11;
            int i82 = (((i80 & 11) | i81) << i12) - i81;
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i83 = i82 * (-755);
            int i84 = ((i83 & (-12080)) - (~(i83 | (-12080)))) - i12;
            int i85 = ~i82;
            int i86 = i85 & (-17);
            int i87 = (~i86) & (i85 | (-17));
            int i88 = (~((i87 ^ i86) | (i87 & i86))) * 1512;
            int i89 = (((~i84) & i88) | ((~i88) & i84)) + ((i84 & i88) << 1);
            int i90 = (i85 ^ (-17)) | i86;
            int i91 = ~i90;
            int i92 = (i90 | i91) & i91;
            int i93 = i82 & 16;
            int i94 = ((~i93) & (i82 | 16)) | i93;
            int i95 = i94 ^ iCurrentTimeMillis3;
            int i96 = i94 & iCurrentTimeMillis3;
            int i97 = ~((i95 ^ i96) | (i96 & i95));
            iArr = iArr2;
            int i98 = -(~(((i92 & i97) | ((~i92) & i97) | ((~i97) & i92)) * (-756)));
            int i99 = ((i89 ^ i98) + ((i98 & i89) << 1)) - 1;
            int i100 = (i82 & (-17)) | (i85 & 16) | i93;
            int i101 = ~iCurrentTimeMillis3;
            int i102 = i101 & (iCurrentTimeMillis3 | i101);
            int i103 = i100 & i102;
            int i104 = -(-((((i100 | i102) & (~i103)) | i103) * 756));
            int i105 = i99 & i104;
            int i106 = -(-((i104 ^ i99) | i105));
            int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
            int i108 = i75 << 31;
            int i109 = (int) (j13 >>> 33);
            int i110 = i108 & i109;
            iArr3[i107] = ((i108 | i109) & (~i110)) | i110;
            i11 = ((i82 & 20) + (i82 | 20)) - 21;
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i111 = (i11 * 399) + 6385;
            int i112 = (i111 ^ (-1)) + (i111 << 1);
            int i113 = ~i11;
            int i114 = i113 & (-17);
            int i115 = ~(((~i113) & 16) | i114 | (i113 & 16));
            int i116 = i11 & 16;
            int i117 = i114 | i116;
            int i118 = (-17) & i11;
            int i119 = (i117 ^ i118) | (i117 & i118);
            int i120 = ~i119;
            int i121 = i120 & (i119 | i120);
            int i122 = ((~i115) & i121) | ((~i121) & i115);
            int i123 = i121 & i115;
            int i124 = (i123 & i122) | (i122 ^ i123);
            int i125 = (-17) & iCurrentTimeMillis4;
            int i126 = (~i125) & ((-17) | iCurrentTimeMillis4);
            int i127 = ~iCurrentTimeMillis4;
            int i128 = i125 | i126;
            int i129 = ~i128;
            int i130 = (i128 | i129) & i129;
            int i131 = ((~i130) & i124) | ((~i124) & i130);
            int i132 = i124 & i130;
            int i133 = ((i132 & i131) | (i131 ^ i132)) * 398;
            int i134 = i112 & i133;
            int i135 = (i133 ^ i112) | i134;
            int i136 = (i134 & i135) + (i135 | i134);
            int i137 = -(-(((i11 ^ 16) | i116) * (-1194)));
            int i138 = i136 & i137;
            int i139 = -(-((i137 ^ i136) | i138));
            int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
            int i141 = ((-17) & (~i127)) | (i127 & 16);
            int i142 = (-17) & i127;
            int i143 = ~((i142 & i141) | (i141 ^ i142));
            int i144 = (i113 | i11) & i113;
            int i145 = i144 ^ 16;
            int i146 = i144 & 16;
            int i147 = ~((i146 & i145) | (i145 ^ i146));
            int i148 = i143 & i147;
            int i149 = (i143 | i147) & (~i148);
            int i150 = (i149 & i148) | (i149 ^ i148);
            int i151 = ~(((~i118) & ((-17) | i11)) | i118);
            int i152 = ((i150 & i151) | ((~i151) & i150) | ((~i150) & i151)) * 398;
            iArr3[(i140 & i152) + (i152 | i140)] = (int) (j13 >>> 1);
            i75 = (int) j13;
            if (i78 <= 0) {
                break;
            }
            i12 = 1;
            i10 = i78;
            iArr2 = iArr;
            i74 = 8;
            j11 = 4294967295L;
        }
        int i153 = f53951b;
        int i154 = i153 & 15;
        int i155 = ((i153 ^ 15) | i154) << 1;
        int i156 = -((~i154) & (i153 | 15));
        int i157 = (i155 & i156) + (i156 | i155);
        f53950a = i157 % 128;
        int i158 = i157 % 2;
        long j14 = j10 * j10;
        long j15 = (((long) (i75 << 31)) & 4294967295L) | (j14 >>> 33);
        iArr3[16] = (int) j14;
        int i159 = ((int) (j14 >>> 32)) & 1;
        long j16 = ((long) iArr[9]) & 4294967295L;
        long j17 = ((long) iArr3[18]) & 4294967295L;
        long j18 = (j16 * j10) + j15;
        int i160 = (int) j18;
        int i161 = i160 << 1;
        int i162 = ((~i161) & i159) | ((~i159) & i161);
        int i163 = i159 & i161;
        iArr3[17] = (i163 & i162) | (i162 ^ i163);
        int i164 = i160 >>> 31;
        long j19 = ((long) iArr[10]) & 4294967295L;
        long j20 = ((long) iArr3[19]) & 4294967295L;
        long j21 = ((long) iArr3[20]) & 4294967295L;
        long j22 = (j19 * j10) + j17 + (j18 >>> 32);
        int i165 = (int) j22;
        int i166 = i165 << 1;
        int i167 = i166 & i164;
        iArr3[18] = ((~i167) & (i166 | i164)) | i167;
        int i168 = i165 >>> 31;
        long jA = a.a(j19, j16, j22 >>> 32, j20);
        long j23 = j21 + (jA >>> 32);
        long j24 = ((long) iArr[11]) & 4294967295L;
        long j25 = (((long) iArr3[21]) & 4294967295L) + (j23 >>> 32);
        long j26 = j23 & 4294967295L;
        long j27 = (((long) iArr3[22]) & 4294967295L) + (j25 >>> 32);
        long j28 = (j24 * j10) + (jA & 4294967295L);
        int i169 = (int) j28;
        int i170 = i169 << 1;
        int i171 = i170 & i168;
        int i172 = (~i171) & (i168 | i170);
        iArr3[19] = (i172 & i171) | (i172 ^ i171);
        int i173 = i169 >>> 31;
        long jA2 = a.a(j24, j16, j28 >>> 32, j26);
        long jA3 = a.a(j24, j19, jA2 >>> 32, j25 & 4294967295L);
        long j29 = j27 + (jA3 >>> 32);
        long j30 = jA3 & 4294967295L;
        long j31 = ((long) iArr[12]) & 4294967295L;
        long j32 = j10;
        long j33 = (((long) iArr3[23]) & 4294967295L) + (j29 >>> 32);
        long j34 = (((long) iArr3[24]) & 4294967295L) + (j33 >>> 32);
        long j35 = (j31 * j32) + (jA2 & 4294967295L);
        int i174 = (int) j35;
        int i175 = i174 << 1;
        int i176 = i175 & i173;
        int i177 = (i173 | i175) & (~i176);
        iArr3[20] = (i177 & i176) | (i177 ^ i176);
        int i178 = i174 >>> 31;
        long jA4 = a.a(j31, j16, j35 >>> 32, j30);
        long jA5 = a.a(j31, j19, jA4 >>> 32, j29 & 4294967295L);
        long jA6 = a.a(j31, j24, jA5 >>> 32, j33 & 4294967295L);
        long j36 = jA5 & 4294967295L;
        long j37 = j34 + (jA6 >>> 32);
        long j38 = jA6 & 4294967295L;
        long j39 = ((long) iArr[13]) & 4294967295L;
        long j40 = (((long) iArr3[25]) & 4294967295L) + (j37 >>> 32);
        long j41 = j37 & 4294967295L;
        long j42 = (((long) iArr3[26]) & 4294967295L) + (j40 >>> 32);
        long j43 = j40 & 4294967295L;
        long j44 = (j39 * j32) + (jA4 & 4294967295L);
        int i179 = (int) j44;
        int i180 = i179 << 1;
        int i181 = i180 & i178;
        int i182 = (i178 | i180) & (~i181);
        iArr3[21] = (i182 & i181) | (i182 ^ i181);
        int i183 = i179 >>> 31;
        long jA7 = a.a(j39, j16, j44 >>> 32, j36);
        long jA8 = a.a(j39, j19, jA7 >>> 32, j38);
        long jA9 = a.a(j39, j24, jA8 >>> 32, j41);
        long j45 = jA8 & 4294967295L;
        long jA10 = a.a(j39, j31, jA9 >>> 32, j43);
        long j46 = j42 + (jA10 >>> 32);
        long j47 = ((long) iArr[14]) & 4294967295L;
        long j48 = (((long) iArr3[27]) & 4294967295L) + (j46 >>> 32);
        long j49 = j46 & 4294967295L;
        long j50 = (((long) iArr3[28]) & 4294967295L) + (j48 >>> 32);
        long j51 = (j47 * j32) + (jA7 & 4294967295L);
        int i184 = (int) j51;
        int i185 = i184 << 1;
        int i186 = i185 & i183;
        int i187 = (i185 | i183) & (~i186);
        iArr3[22] = (i187 & i186) | (i187 ^ i186);
        int i188 = i184 >>> 31;
        long jA11 = a.a(j47, j16, j51 >>> 32, j45);
        long jA12 = a.a(j47, j19, jA11 >>> 32, jA9 & 4294967295L);
        long jA13 = a.a(j47, j24, jA12 >>> 32, jA10 & 4294967295L);
        long j52 = jA12 & 4294967295L;
        long jA14 = a.a(j47, j31, jA13 >>> 32, j49);
        long jA15 = a.a(j47, j39, jA14 >>> 32, j48 & 4294967295L);
        long j53 = jA14 & 4294967295L;
        long j54 = j50 + (jA15 >>> 32);
        long j55 = jA15 & 4294967295L;
        long j56 = ((long) iArr[15]) & 4294967295L;
        long j57 = (((long) iArr3[29]) & 4294967295L) + (j54 >>> 32);
        long j58 = (((long) iArr3[30]) & 4294967295L) + (j57 >>> 32);
        long j59 = (j56 * j32) + (jA11 & 4294967295L);
        int i189 = (int) j59;
        int i190 = i189 << 1;
        iArr3[23] = (i188 & i190) | (i190 ^ i188);
        int i191 = i189 >>> 31;
        long jA16 = a.a(j56, j16, j59 >>> 32, j52);
        long jA17 = a.a(j56, j19, jA16 >>> 32, jA13 & 4294967295L);
        long jA18 = a.a(j56, j24, jA17 >>> 32, j53);
        long jA19 = a.a(j56, j31, jA18 >>> 32, j55);
        long jA20 = a.a(j56, j39, jA19 >>> 32, j54 & 4294967295L);
        long jA21 = a.a(j56, j47, jA20 >>> 32, j57 & 4294967295L);
        long j60 = j58 + (jA21 >>> 32);
        int i192 = (int) jA16;
        int i193 = i192 << 1;
        int i194 = i193 & i191;
        int i195 = (i191 | i193) & (~i194);
        iArr3[24] = (i195 & i194) | (i195 ^ i194);
        int i196 = i192 >>> 31;
        int i197 = (int) jA17;
        int i198 = i197 << 1;
        int i199 = i198 & i196;
        int i200 = (i198 | i196) & (~i199);
        iArr3[25] = (i200 & i199) | (i200 ^ i199);
        int i201 = i197 >>> 31;
        int i202 = (int) jA18;
        int i203 = i202 << 1;
        iArr3[26] = (i201 & i203) | (i203 ^ i201);
        int i204 = i202 >>> 31;
        int i205 = (int) jA19;
        int i206 = i205 << 1;
        int i207 = ((~i204) & i206) | ((~i206) & i204);
        int i208 = i204 & i206;
        iArr3[27] = (i208 & i207) | (i207 ^ i208);
        int i209 = i205 >>> 31;
        int i210 = (int) jA20;
        int i211 = i210 << 1;
        int i212 = ((~i209) & i211) | ((~i211) & i209);
        int i213 = i209 & i211;
        iArr3[28] = (i213 & i212) | (i212 ^ i213);
        int i214 = i210 >>> 31;
        int i215 = (int) jA21;
        int i216 = i215 << 1;
        iArr3[29] = (i214 & i216) | (i216 ^ i214);
        int i217 = i215 >>> 31;
        int i218 = (int) j60;
        int i219 = i218 << 1;
        int i220 = i219 & i217;
        iArr3[30] = ((i217 | i219) & (~i220)) | i220;
        int i221 = i218 >>> 31;
        int i222 = iArr3[31];
        int i223 = (int) (j60 >>> 32);
        int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
        int i224 = ((i223 * 302) - (~(-(-(i222 * TypedValues.MotionType.TYPE_EASING))))) - 1;
        int i225 = ~i223;
        int i226 = ~iCurrentTimeMillis5;
        int i227 = i225 & i226;
        int i228 = (~i227) & (i225 | i226);
        int i229 = (i228 & i227) | (i228 ^ i227);
        int i230 = ~i229;
        int i231 = (i229 | i230) & i230;
        int i232 = ((i231 & i222) | (i222 ^ i231)) * (-602);
        int i233 = i224 ^ i232;
        int i234 = (i224 & i232) << 1;
        int i235 = ((i233 | i234) << 1) - (i234 ^ i233);
        int i236 = ~i222;
        int i237 = (i236 | i222) & i236;
        int i238 = i225 ^ i237;
        int i239 = i237 & i225;
        int i240 = ~((i239 & i238) | (i238 ^ i239));
        int i241 = i225 & (i225 | i223);
        int i242 = i241 & iCurrentTimeMillis5;
        int i243 = (iCurrentTimeMillis5 | i241) & (~i242);
        int i244 = ~((i243 & i242) | (i243 ^ i242));
        int i245 = (i244 & i240) | ((~i244) & i240) | ((~i240) & i244);
        int i246 = ((~i226) & i223) | i227;
        int i247 = i223 & i226;
        int i248 = (i247 & i246) | (i246 ^ i247);
        int i249 = (i236 & i248) | ((~i248) & i222);
        int i250 = i248 & i222;
        int i251 = ~((i250 & i249) | (i249 ^ i250));
        int i252 = ((~i251) & i245) | ((~i245) & i251);
        int i253 = i251 & i245;
        int i254 = ((i253 & i252) | (i252 ^ i253)) * (-301);
        int i255 = (((~i254) & i235) | ((~i235) & i254)) + ((i254 & i235) << 1);
        int i256 = i226 & i222;
        int i257 = (i222 | i226) & (~i256);
        int i258 = -(~((~((i256 & i257) | (i257 ^ i256))) * 301));
        iArr3[31] = i221 | (((-2) - ((((i255 | i258) << 1) - (i258 ^ i255)) ^ (-1))) << 1);
        int i259 = f53951b;
        int i260 = i259 & 107;
        int i261 = ((((i259 ^ 107) | i260) << 1) - (~(-((i259 | 107) & (~i260))))) - 1;
        f53950a = i261 % 128;
        if (i261 % 2 != 0) {
            int i262 = 97 / 0;
        }
    }

    public static BigInteger setCompoundDrawableTintBlendMode(int[] iArr) {
        return (BigInteger) setX(new Object[]{iArr}, -651651242, 651651245, (int) System.currentTimeMillis());
    }

    public static BigInteger setDividerPadding(long[] jArr) {
        return (BigInteger) setX(new Object[]{jArr}, -692671830, 692671838, (int) System.currentTimeMillis());
    }

    public static int setLayoutAnimation(int[] iArr, int[] iArr2) {
        return ((Integer) setX(new Object[]{iArr, iArr2}, 1877956622, -1877956593, (int) System.currentTimeMillis())).intValue();
    }

    public static void setOnDragListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, -44054691, 44054719, (int) System.currentTimeMillis());
    }

    public static int setOnFocusChangeListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setX(new Object[]{iArr, iArr2, iArr3}, 340994627, -340994605, (int) System.currentTimeMillis())).intValue();
    }

    public static void setOnLongClickListener(int[] iArr, int[] iArr2) {
        setX(new Object[]{iArr, iArr2}, 1466054543, -1466054530, (int) System.currentTimeMillis());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x1413 A[PHI: r4
      0x1413: PHI (r4v33 boolean) = (r4v30 boolean), (r4v39 boolean) binds: [B:63:0x1437, B:58:0x1411] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        boolean zBooleanValue;
        char c10;
        long j10;
        int i13;
        int i14 = ~i10;
        int i15 = (((~(i14 | i11)) | (~(i14 | i12))) * (-283)) + (i11 * (-282)) + (i10 * 284);
        int i16 = ~i11;
        int i17 = ((~(i16 | i14 | i12)) * 283) + ((~(i10 | i16)) * 283) + i15;
        Boolean bool = Boolean.FALSE;
        int iValueOf = 0;
        int i18 = 16;
        int i19 = 7;
        switch (i17) {
            case 1:
                return u(objArr);
            case 2:
                return h(objArr);
            case 3:
                return v(objArr);
            case 4:
                return q(objArr);
            case 5:
                c(objArr);
                return null;
            case 6:
                return n();
            case 7:
                return o(objArr);
            case 8:
                return r(objArr);
            case 9:
                int i20 = f53951b;
                int i21 = (((i20 | 10) << 1) - (i20 ^ 10)) - 1;
                f53950a = i21 % 128;
                int i22 = i21 % 2;
                int[] iArr = new int[16];
                int i23 = (i20 & 69) + (i20 | 69);
                f53950a = i23 % 128;
                int i24 = i23 % 2;
                return iArr;
            case 10:
                return k(objArr);
            case 11:
                return w(objArr);
            case 12:
                return a(objArr);
            case 13:
                s(objArr);
                return null;
            case 14:
                e(objArr);
                return null;
            case 15:
                int[] iArr2 = (int[]) objArr[0];
                int[] iArr3 = (int[]) objArr[1];
                int i25 = f53951b;
                int i26 = (i25 ^ 53) + ((i25 & 53) << 1);
                int i27 = i26 % 128;
                f53950a = i27;
                int i28 = i26 % 2;
                int i29 = i27 + 101;
                f53951b = i29 % 128;
                int i30 = i29 % 2;
                while (i19 >= 0) {
                    int i31 = f53951b;
                    int i32 = i31 & 85;
                    int i33 = -(-(i31 | 85));
                    int i34 = (i32 & i33) + (i32 | i33);
                    f53950a = i34 % 128;
                    int i35 = i34 % 2;
                    if (iArr2[i19] != iArr3[i19]) {
                        int i36 = i31 & 73;
                        int i37 = (~i36) & (i31 | 73);
                        int i38 = -(-(i36 << 1));
                        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
                        f53950a = i39 % 128;
                        int i40 = i39 % 2;
                        int i41 = ((i31 & 26) + (i31 | 26)) - 1;
                        f53950a = i41 % 128;
                        int i42 = i41 % 2;
                        return bool;
                    }
                    i19--;
                    int i43 = i31 ^ 87;
                    int i44 = -(-((i31 & 87) << 1));
                    int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                    f53950a = i45 % 128;
                    int i46 = i45 % 2;
                }
                int i47 = f53951b;
                int i48 = (i47 | 39) << 1;
                int i49 = -(i47 ^ 39);
                int i50 = ((i48 | i49) << 1) - (i49 ^ i48);
                f53950a = i50 % 128;
                int i51 = i50 % 2;
                bool = Boolean.TRUE;
                return bool;
            case 16:
                int[] iArr4 = (int[]) objArr[0];
                int[] iArr5 = (int[]) objArr[1];
                int[] iArr6 = (int[]) objArr[2];
                int i52 = (-2) - ((f53951b + 2) ^ (-1));
                f53950a = i52 % 128;
                if (i52 % 2 != 0) {
                    zBooleanValue = ((Boolean) setX(new Object[]{iArr4, 105, iArr5, 1}, 1545111964, -1545111952, 105)).booleanValue();
                    if (!(!zBooleanValue)) {
                        ((Integer) setX(new Object[]{iArr4, 8, iArr5, 0, iArr6, 0}, 1634276850, -1634276830, 8)).intValue();
                        int i53 = f53951b;
                        int i54 = (((i53 | 40) << 1) - (i53 ^ 40)) - 1;
                        f53950a = i54 % 128;
                        int i55 = i54 % 2;
                    } else {
                        c10 = 1;
                        Object[] objArr2 = new Object[6];
                        objArr2[0] = iArr5;
                        objArr2[c10] = 0;
                        objArr2[2] = iArr4;
                        objArr2[3] = 8;
                        objArr2[4] = iArr6;
                        objArr2[5] = 0;
                        ((Integer) setX(objArr2, 1634276850, -1634276830, 0)).intValue();
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                } else {
                    zBooleanValue = ((Boolean) setX(new Object[]{iArr4, 8, iArr5, 0}, 1545111964, -1545111952, 8)).booleanValue();
                    if (zBooleanValue) {
                        ((Integer) setX(new Object[]{iArr4, 8, iArr5, 0, iArr6, 0}, 1634276850, -1634276830, 8)).intValue();
                        int i56 = f53951b;
                        int i57 = (((i56 | 40) << 1) - (i56 ^ 40)) - 1;
                        f53950a = i57 % 128;
                        int i58 = i57 % 2;
                    } else {
                        c10 = 1;
                        Object[] objArr3 = new Object[6];
                        objArr3[0] = iArr5;
                        objArr3[c10] = 0;
                        objArr3[2] = iArr4;
                        objArr3[3] = 8;
                        objArr3[4] = iArr6;
                        objArr3[5] = 0;
                        ((Integer) setX(objArr3, 1634276850, -1634276830, 0)).intValue();
                        System.currentTimeMillis();
                        System.currentTimeMillis();
                    }
                }
                int i59 = f53951b;
                int i60 = i59 & 49;
                int i61 = i60 + ((i59 ^ 49) | i60);
                f53950a = i61 % 128;
                int i62 = i61 % 2;
                return Boolean.valueOf(zBooleanValue);
            case 17:
                int[] iArr7 = (int[]) objArr[0];
                int i63 = f53950a;
                int i64 = i63 & 39;
                int i65 = ((i63 ^ 39) | i64) << 1;
                int i66 = -((i63 | 39) & (~i64));
                int i67 = ((i65 | i66) << 1) - (i66 ^ i65);
                int i68 = i67 % 128;
                f53951b = i68;
                int i69 = i67 % 2;
                int i70 = iArr7[0] & 1;
                int i71 = i68 & 73;
                int i72 = i68 | 73;
                int i73 = (i71 & i72) + (i72 | i71);
                f53950a = i73 % 128;
                int i74 = i73 % 2;
                return Integer.valueOf(i70);
            case 18:
                int iIntValue = ((Number) objArr[0]).intValue();
                int[] iArr8 = (int[]) objArr[1];
                int i75 = f53950a;
                int i76 = i75 + 111;
                f53951b = i76 % 128;
                int i77 = i76 % 2;
                long j11 = ((long) iIntValue) & 4294967295L;
                long j12 = (977 * j11) + (((long) iArr8[0]) & 4294967295L);
                iArr8[0] = (int) j12;
                long j13 = j11 + (((long) iArr8[1]) & 4294967295L) + (j12 >>> 32);
                iArr8[1] = (int) j13;
                long j14 = (j13 >>> 32) + (((long) iArr8[2]) & 4294967295L);
                iArr8[2] = (int) j14;
                if ((j14 >>> 32) == 0) {
                    int i78 = (((i75 ^ 33) | (i75 & 33)) << 1) - ((i75 & (-34)) | ((~i75) & 33));
                    f53951b = i78 % 128;
                    int i79 = i78 % 2;
                    int i80 = i75 & 115;
                    int i81 = -(-(i75 | 115));
                    int i82 = (i80 ^ i81) + ((i80 & i81) << 1);
                    f53951b = i82 % 128;
                    int i83 = i82 % 2;
                } else {
                    int iIntValue2 = ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr8, 0, 3}, 716282167, -716282152, 8)).intValue();
                    int i84 = f53950a;
                    int i85 = i84 & 81;
                    int i86 = -(-((i84 ^ 81) | i85));
                    int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
                    f53951b = i87 % 128;
                    int i88 = i87 % 2;
                    iValueOf = Integer.valueOf(iIntValue2);
                }
                return iValueOf;
            case 19:
                return j(objArr);
            case 20:
                return t(objArr);
            case 21:
                int[] iArr9 = (int[]) objArr[0];
                int i89 = f53951b;
                int i90 = i89 + 57;
                f53950a = i90 % 128;
                int i91 = i90 % 2;
                int i92 = i89 + 75;
                f53950a = i92 % 128;
                int i93 = i92 % 2;
                int i94 = 0;
                for (int i95 = 8; i94 < i95; i95 = 8) {
                    int i96 = f53951b;
                    int i97 = (i96 & 115) + (i96 | 115);
                    int i98 = i97 % 128;
                    f53950a = i98;
                    int i99 = i97 % 2;
                    if (iArr9[i94] != 0) {
                        int i100 = (i96 & (-92)) | ((~i96) & 91);
                        int i101 = -(-((i96 & 91) << 1));
                        int i102 = (i100 & i101) + (i100 | i101);
                        f53950a = i102 % 128;
                        int i103 = i102 % 2;
                        int i104 = i96 + 16;
                        int i105 = (i104 ^ (-1)) + (i104 << 1);
                        f53950a = i105 % 128;
                        int i106 = i105 % 2;
                        return bool;
                    }
                    int i107 = i94 & 1;
                    i94 = i107 + ((i94 ^ 1) | i107);
                    int i108 = (i98 ^ 83) + ((i98 & 83) << 1);
                    f53951b = i108 % 128;
                    int i109 = i108 % 2;
                }
                int i110 = f53951b;
                int i111 = i110 & 7;
                int i112 = i111 + ((i110 ^ 7) | i111);
                f53950a = i112 % 128;
                int i113 = i112 % 2;
                bool = Boolean.TRUE;
                return bool;
            case 22:
                int[] iArr10 = (int[]) objArr[0];
                int[] iArr11 = (int[]) objArr[1];
                int[] iArr12 = (int[]) objArr[2];
                int i114 = f53950a + 5;
                int i115 = i114 % 128;
                f53951b = i115;
                int i116 = i114 % 2;
                long j15 = ((long) iArr11[0]) & 4294967295L;
                long j16 = ((long) iArr11[1]) & 4294967295L;
                long j17 = ((long) iArr11[2]) & 4294967295L;
                long j18 = ((long) iArr11[3]) & 4294967295L;
                long j19 = j15;
                long j20 = ((long) iArr11[4]) & 4294967295L;
                long j21 = ((long) iArr11[5]) & 4294967295L;
                long j22 = ((long) iArr11[6]) & 4294967295L;
                long j23 = ((long) iArr11[7]) & 4294967295L;
                int i117 = i115 & 89;
                int i118 = -(-((i115 ^ 89) | i117));
                int i119 = (i117 & i118) + (i117 | i118);
                f53950a = i119 % 128;
                int i120 = i119 % 2;
                long j24 = 0;
                int i121 = 0;
                while (i121 < 8) {
                    int i122 = f53950a;
                    int i123 = ((i122 ^ 15) | (i122 & 15)) << 1;
                    int i124 = -((15 & (~i122)) | (i122 & (-16)));
                    int i125 = (i123 ^ i124) + ((i124 & i123) << 1);
                    f53951b = i125 % 128;
                    int i126 = i125 % 2;
                    long j25 = ((long) iArr10[i121]) & 4294967295L;
                    long j26 = j19;
                    long j27 = j16;
                    long j28 = (j25 * j26) + (((long) iArr12[i121]) & 4294967295L);
                    iArr12[i121] = (int) j28;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i127 = -(-(i121 * 253));
                    int i128 = (253 & i127) + (i127 | 253);
                    int i129 = ~i121;
                    int i130 = (-2) & i129;
                    int[] iArr13 = iArr10;
                    int i131 = (~i130) & ((-2) | i129);
                    long j29 = j24;
                    int i132 = ~i129;
                    int i133 = ~((i131 & i130) | (i131 ^ i130));
                    int i134 = (i129 | i121) & i129;
                    int i135 = ~iCurrentTimeMillis;
                    long j30 = j18;
                    int i136 = (i134 ^ i135) | (i134 & i135);
                    int i137 = ~i136;
                    int i138 = (i136 | i137) & i137;
                    int i139 = (i133 & i138) | (i133 ^ i138);
                    int i140 = i121 & 1;
                    int i141 = i121 | 1;
                    int i142 = (~i140) & i141;
                    int i143 = (i142 ^ i140) | (i142 & i140);
                    int i144 = i143 & iCurrentTimeMillis;
                    long j31 = j17;
                    int i145 = (~i144) & (i143 | iCurrentTimeMillis);
                    int i146 = ~((i144 & i145) | (i145 ^ i144));
                    int i147 = i139 & i146;
                    int i148 = (i139 | i146) & (~i147);
                    int i149 = -(~(((i148 & i147) | (i148 ^ i147)) * (-252)));
                    int i150 = (((i128 | i149) << 1) - (i128 ^ i149)) - 1;
                    int i151 = (i142 | i140) * (-252);
                    int i152 = i150 ^ i151;
                    int i153 = (((i151 & i150) | i152) << 1) - i152;
                    int i154 = ((~i135) & i129) | (i135 & i132);
                    int i155 = i129 & i135;
                    int i156 = (i154 & i155) | (i154 ^ i155);
                    int i157 = (i156 & 1) | (i156 ^ 1);
                    int i158 = ~i157;
                    int i159 = (i157 | i158) & i158;
                    int i160 = (i129 & 1) | (i121 & (-2));
                    int i161 = (i160 & i140) | (i160 ^ i140);
                    int i162 = ~((iCurrentTimeMillis & i161) | (i161 & i135) | ((~i161) & iCurrentTimeMillis));
                    int i163 = ((i159 & i162) | (i159 ^ i162)) * 252;
                    long j32 = (j25 * j27) + (((long) iArr12[(((i153 ^ i163) | (i153 & i163)) << 1) - (((~i153) & i163) | ((~i163) & i153))]) & 4294967295L) + (j28 >>> 32);
                    int i164 = i121 ^ 2;
                    iArr12[(((i121 | 2) << 1) - i164) - 1] = (int) j32;
                    long j33 = j32 >>> 32;
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i165 = -(-(i121 * (-68)));
                    int i166 = ~i134;
                    int i167 = ((-3) & i166) | (i134 & 2) | ((-3) & i134);
                    int i168 = ~((i167 & iCurrentTimeMillis2) | (i167 ^ iCurrentTimeMillis2));
                    int i169 = i121 & 2;
                    int i170 = i164 | i169;
                    int i171 = i170 ^ iCurrentTimeMillis2;
                    int i172 = ~iCurrentTimeMillis2;
                    int i173 = i170 & iCurrentTimeMillis2;
                    int i174 = ~((i171 ^ i173) | (i171 & i173));
                    int i175 = (-2) - ((((140 & i165) + (i165 | 140)) - (~(-(-(((i168 ^ i174) | (i174 & i168)) * 69))))) ^ (-1));
                    int i176 = ((-3) & i129) | i169;
                    int i177 = (-3) & i121;
                    int i178 = ~((i176 & i177) | (i176 ^ i177));
                    int i179 = ~(((-3) & i172) | (iCurrentTimeMillis2 & 2) | ((-3) & iCurrentTimeMillis2));
                    int i180 = i178 & i179;
                    int i181 = (~i180) & (i178 | i179);
                    int i182 = (i181 & i180) | (i181 ^ i180);
                    int i183 = (i121 & i172) | (iCurrentTimeMillis2 & i129);
                    int i184 = iCurrentTimeMillis2 & i121;
                    int i185 = ~((i184 & i183) | (i183 ^ i184));
                    int i186 = i182 & i185;
                    int i187 = (i185 | i182) & (~i186);
                    int i188 = ((i187 & i186) | (i187 ^ i186)) * (-69);
                    int i189 = i175 & i188;
                    int i190 = i189 + ((i188 ^ i175) | i189);
                    int i191 = i129 & 2;
                    int i192 = (~i191) & (i129 | 2);
                    int i193 = ~((i191 & i192) | (i192 ^ i191));
                    int i194 = i193 * 69;
                    int i195 = ((~i194) & i190) | ((~i190) & i194);
                    int i196 = -(-((i190 & i194) << 1));
                    long j34 = (j25 * j31) + (((long) iArr12[((i195 | i196) << 1) - (i196 ^ i195)]) & 4294967295L) + j33;
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i197 = i121 * 989;
                    int i198 = ((-3950) ^ i197) + ((i197 & (-3950)) << 1);
                    int i199 = ~(((-3) ^ i121) | i177);
                    int i200 = (~i199) & iCurrentTimeMillis3;
                    int i201 = ~iCurrentTimeMillis3;
                    int i202 = i200 | (i199 & i201);
                    int i203 = iCurrentTimeMillis3 & i199;
                    int i204 = ((i202 & i203) | (i202 ^ i203)) * 988;
                    int i205 = ((~i204) & i198) | ((~i198) & i204);
                    int i206 = (i204 & i198) << 1;
                    int i207 = (i205 ^ i206) + ((i206 & i205) << 1);
                    int i208 = (i201 | iCurrentTimeMillis3) & i201;
                    int i209 = i208 & 2;
                    int i210 = (i208 | 2) & (~i209);
                    int i211 = ~((i210 & i209) | (i210 ^ i209));
                    int i212 = ((~i211) & i193) | ((~i193) & i211);
                    int i213 = i193 & i211;
                    int i214 = -(-(((i213 & i212) | (i212 ^ i213)) * (-1976)));
                    int i215 = i207 & i214;
                    int i216 = (i214 | i207) & (~i215);
                    int i217 = -(-(i215 << 1));
                    int i218 = (i216 & i217) + (i216 | i217);
                    int i219 = i129 ^ iCurrentTimeMillis3;
                    int i220 = iCurrentTimeMillis3 & i129;
                    int i221 = ~((i219 & i220) | (i219 ^ i220));
                    int i222 = i199 & i221;
                    int i223 = (i221 | i199) & (~i222);
                    int i224 = (i223 & i222) | (i223 ^ i222);
                    int i225 = ~((i201 ^ i121) | (i201 & i121));
                    int i226 = -(~(-(-(((i224 & i225) | (i224 ^ i225)) * 988))));
                    iArr12[(-2) - (((i218 & i226) + (i226 | i218)) ^ (-1))] = (int) j34;
                    long j35 = j34 >>> 32;
                    int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                    int i227 = -(-(i121 * 881));
                    int i228 = 2643 ^ i227;
                    int i229 = (((i227 & 2643) | i228) << 1) - i228;
                    int i230 = (-4) & i129;
                    int i231 = (~i230) & ((-4) | i129);
                    int i232 = ~((i230 & i231) | (i231 ^ i230));
                    int i233 = (-4) & iCurrentTimeMillis4;
                    int i234 = (~i233) & ((-4) | iCurrentTimeMillis4);
                    int i235 = ~((i234 & i233) | (i234 ^ i233));
                    int i236 = i232 & i235;
                    int i237 = (i232 | i235) & (~i236);
                    int i238 = (i237 & i236) | (i237 ^ i236);
                    int i239 = i129 & iCurrentTimeMillis4;
                    int i240 = (~i239) & (i129 | iCurrentTimeMillis4);
                    int i241 = ~((i239 & i240) | (i240 ^ i239));
                    int i242 = ((~i241) & i238) | ((~i238) & i241);
                    int i243 = i238 & i241;
                    int i244 = ((i243 & i242) | (i242 ^ i243)) * (-880);
                    int i245 = i229 & i244;
                    int i246 = (i229 | i244) & (~i245);
                    int i247 = i245 << 1;
                    int i248 = (i246 ^ i247) + ((i246 & i247) << 1);
                    int i249 = ~iCurrentTimeMillis4;
                    int i250 = (i249 | iCurrentTimeMillis4) & i249;
                    int i251 = (-4) ^ i250;
                    int i252 = (-4) & i250;
                    int i253 = ~((i252 & i251) | (i251 ^ i252));
                    int i254 = i121 ^ i253;
                    int i255 = i253 & i121;
                    int i256 = (i255 & i254) | (i254 ^ i255);
                    int i257 = (i249 & 3) | i233;
                    int i258 = iCurrentTimeMillis4 & 3;
                    int i259 = ~((i257 & i258) | (i257 ^ i258));
                    int i260 = (i248 - (~(((i259 & i256) | (((~i259) & i256) | ((~i256) & i259))) * (-880)))) - 1;
                    int i261 = (iCurrentTimeMillis4 | 3) & (~i258);
                    long j36 = (j25 * j30) + (((long) iArr12[((~((i261 & i258) | (i261 ^ i258))) * 880) + i260]) & 4294967295L) + j35;
                    int i262 = i121 ^ 4;
                    int i263 = i121 & 4;
                    iArr12[(-2) - (((i263 << 1) + i262) ^ (-1))] = (int) j36;
                    long j37 = j36 >>> 32;
                    long j38 = j25 * j20;
                    int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
                    int i264 = -(-(i121 * 399));
                    int i265 = 1596 & i264;
                    int i266 = ((i264 | 1596) & (~i265)) + (i265 << 1);
                    int i267 = (-5) & i129;
                    int i268 = (-5) & i121;
                    int i269 = i267 | i263 | i268;
                    int i270 = ~i269;
                    int i271 = (i269 | i270) & i270;
                    int i272 = i129 ^ 4;
                    int i273 = i129 & 4;
                    int i274 = ~((i272 ^ i273) | (i272 & i273));
                    int i275 = i121;
                    int i276 = ((~i274) & i271) | ((~i271) & i274);
                    int i277 = i274 & i271;
                    int i278 = (i276 & i277) | (i276 ^ i277);
                    int i279 = ~iCurrentTimeMillis5;
                    int i280 = (i129 & i279) | (iCurrentTimeMillis5 & i132) | (i129 & iCurrentTimeMillis5);
                    int i281 = ~i280;
                    int i282 = (i280 | i281) & i281;
                    int i283 = i278 & i282;
                    int i284 = (i278 | i282) & (~i283);
                    int i285 = (i266 - (~(((i284 & i283) | (i284 ^ i283)) * 398))) - 1;
                    int i286 = i273 | i268;
                    int i287 = -(-(((i286 & i263) | (i286 ^ i263)) * (-1194)));
                    int i288 = i285 & i287;
                    int i289 = -(-((i287 ^ i285) | i288));
                    int i290 = (i288 ^ i289) + ((i289 & i288) << 1);
                    int i291 = (i279 | iCurrentTimeMillis5) & i279;
                    int i292 = (i134 & (~i291)) | (i291 & i166);
                    int i293 = i134 & i291;
                    int i294 = (i293 & i292) | (i292 ^ i293);
                    int i295 = ~i294;
                    int i296 = (i294 | i295) & i295;
                    int i297 = i296 ^ i270;
                    int i298 = i296 & i270;
                    int i299 = (i298 & i297) | (i297 ^ i298);
                    int i300 = (i132 & 4) | i267;
                    int i301 = ~((i300 & i273) | (i300 ^ i273));
                    int i302 = ((~i301) & i299) | ((~i299) & i301);
                    int i303 = i299 & i301;
                    int i304 = -(-(((i303 & i302) | (i302 ^ i303)) * 398));
                    int i305 = i290 & i304;
                    long j39 = j38 + (((long) iArr12[i305 + ((i304 ^ i290) | i305)]) & 4294967295L) + j37;
                    int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                    int i306 = -(~(i275 * 382));
                    int i307 = ((((-1520) | i306) << 1) - (i306 ^ (-1520))) - 1;
                    int i308 = i275 & iCurrentTimeMillis6;
                    int i309 = (~i308) & (i275 | iCurrentTimeMillis6);
                    int i310 = (i308 & i309) | (i309 ^ i308);
                    int i311 = i310 ^ (-5);
                    int i312 = i310 & (-5);
                    int i313 = (((i312 & i311) | (i311 ^ i312)) * (-381)) + i307;
                    int i314 = (~i267) & ((-5) | i129);
                    int i315 = ~((i314 & i267) | (i314 ^ i267));
                    int i316 = ~iCurrentTimeMillis6;
                    int i317 = (i316 & i129) | ((~i316) & i275);
                    int i318 = i316 & i275;
                    int i319 = ~((i318 & i317) | (i317 ^ i318));
                    int i320 = ((~i319) & i315) | ((~i315) & i319);
                    int i321 = i319 & i315;
                    int i322 = -(-(((i321 & i320) | (i320 ^ i321) | (~((i262 & i263) | (i262 ^ i263)))) * 381));
                    int i323 = i313 & i322;
                    int i324 = -(-((i322 ^ i313) | i323));
                    int i325 = (i323 ^ i324) + ((i324 & i323) << 1);
                    int i326 = (-5) ^ i275;
                    int i327 = (i326 & i268) | (i326 ^ i268);
                    int i328 = ~i327;
                    int i329 = -(~(((i327 | i328) & i328) * 381));
                    int i330 = (i325 ^ i329) + ((i329 & i325) << 1);
                    iArr12[(i330 ^ (-1)) + (i330 << 1)] = (int) j39;
                    long j40 = j39 >>> 32;
                    int iCurrentTimeMillis7 = (int) System.currentTimeMillis();
                    int i331 = -(~(-(-(i275 * 471))));
                    int i332 = ((2355 & i331) + (i331 | 2355)) - 1;
                    int i333 = i275 | 5;
                    int i334 = -(-(i333 * (-470)));
                    int i335 = i332 & i334;
                    int i336 = (i332 | i334) & (~i335);
                    int i337 = -(-(i335 << 1));
                    int i338 = (i336 & i337) + (i337 | i336);
                    int i339 = i134 & 5;
                    int i340 = ((-6) & i166) | i339;
                    int i341 = (-6) & i134;
                    int i342 = ~((i341 & i340) | (i340 ^ i341));
                    int i343 = i129 & iCurrentTimeMillis7;
                    int i344 = (~i343) & (i129 | iCurrentTimeMillis7);
                    int i345 = ~iCurrentTimeMillis7;
                    int i346 = ~((i344 ^ i343) | (i343 & i344));
                    int i347 = (i342 & i346) | (i342 ^ i346);
                    int i348 = i345 & 5;
                    int i349 = (~i348) & (i345 | 5);
                    int i350 = (i349 ^ i348) | (i349 & i348);
                    int i351 = (i350 ^ i275) | (i350 & i275);
                    int i352 = ~i351;
                    int i353 = i352 & (i351 | i352);
                    int i354 = ((i353 & i347) | (i347 ^ i353)) * (-470);
                    int i355 = (i338 | i354) << 1;
                    int i356 = -((i354 & (~i338)) | ((~i354) & i338));
                    int i357 = ((i355 | i356) << 1) - (i356 ^ i355);
                    int i358 = (i134 ^ 5) | i339;
                    int i359 = i358 & iCurrentTimeMillis7;
                    int i360 = (iCurrentTimeMillis7 | i358) & (~i359);
                    int i361 = ~((i360 & i359) | (i360 ^ i359));
                    int i362 = i345 ^ 5;
                    int i363 = (i362 & i348) | (i362 ^ i348);
                    int i364 = (i363 & i129) | ((~i363) & i275);
                    int i365 = i363 & i275;
                    int i366 = ~((i365 & i364) | (i364 ^ i365));
                    int i367 = i361 ^ i366;
                    int i368 = i361 & i366;
                    int i369 = -(-(((i368 & i367) | (i367 ^ i368)) * 470));
                    int i370 = i357 & i369;
                    int i371 = (i369 ^ i357) | i370;
                    long j41 = (j25 * j21) + (((long) iArr12[((i370 | i371) << 1) - (i371 ^ i370)]) & 4294967295L) + j40;
                    iArr12[(i333 << 1) - (i275 ^ 5)] = (int) j41;
                    long j42 = j41 >>> 32;
                    int iCurrentTimeMillis8 = (int) System.currentTimeMillis();
                    int i372 = -(-(i275 * (-949)));
                    int i373 = (-5694) & i372;
                    int i374 = (i372 | (-5694)) & (~i373);
                    int i375 = -(-(i373 << 1));
                    int i376 = (i374 ^ i375) + ((i374 & i375) << 1);
                    int i377 = ~iCurrentTimeMillis8;
                    int i378 = ~i377;
                    int i379 = ~((i134 ^ i377) | (i134 & i377));
                    int i380 = ~(((-7) ^ iCurrentTimeMillis8) | ((-7) & iCurrentTimeMillis8));
                    int i381 = ((i379 & i380) | ((~i380) & i379) | ((~i379) & i380)) * ReturnCode.ERR_REPOSITORY;
                    int i382 = i376 & i381;
                    int i383 = i382 + ((i381 ^ i376) | i382);
                    int i384 = (i377 & (-7)) | (i378 & 6);
                    int i385 = i377 & 6;
                    int i386 = ~((i384 & i385) | (i384 ^ i385));
                    int i387 = ~((i275 ^ iCurrentTimeMillis8) | (i275 & iCurrentTimeMillis8));
                    int i388 = i386 & i387;
                    int i389 = (i386 | i387) & (~i388);
                    int i390 = ((i389 & i388) | (i389 ^ i388)) * (-950);
                    int i391 = i383 & i390;
                    int i392 = i390 | i383;
                    int i393 = (i391 & i392) + (i392 | i391);
                    int i394 = i377 & i275;
                    int i395 = (i377 | i275) & (~i394);
                    int i396 = ~((i395 & i394) | (i395 ^ i394));
                    int i397 = ~((iCurrentTimeMillis8 & 6) | (iCurrentTimeMillis8 ^ 6));
                    int i398 = i396 ^ i397;
                    int i399 = i397 & i396;
                    long j43 = (j25 * j22) + (((long) iArr12[(-2) - ((i393 - (~(-(-(((i399 & i398) | (i398 ^ i399)) * 950))))) ^ (-1))]) & 4294967295L) + j42;
                    int iCurrentTimeMillis9 = (int) System.currentTimeMillis();
                    int i400 = -(-(i275 * (-518)));
                    int i401 = ((-3108) ^ i400) + ((i400 & (-3108)) << 1);
                    int i402 = ~iCurrentTimeMillis9;
                    int i403 = (-7) ^ i402;
                    int i404 = (-7) & i402;
                    int i405 = ~((i403 & i404) | (i403 ^ i404));
                    int i406 = ((~i405) & i275) | (i405 & i129);
                    int i407 = i405 & i275;
                    int i408 = ((i407 & i406) | (i406 ^ i407)) * 519;
                    int i409 = i401 & i408;
                    int i410 = (i408 ^ i401) | i409;
                    int i411 = ((i409 | i410) << 1) - (i410 ^ i409);
                    int i412 = (((-7) | i402) & (~i404)) | i404;
                    int i413 = i412 & i275;
                    int i414 = (i412 | i275) & (~i413);
                    int i415 = ~((i414 & i413) | (i414 ^ i413));
                    int i416 = (i129 & 6) | (i275 & (-7));
                    int i417 = i275 & 6;
                    int i418 = (i416 & i417) | (i416 ^ i417);
                    int i419 = i418 & iCurrentTimeMillis9;
                    int i420 = (i418 | iCurrentTimeMillis9) & (~i419);
                    int i421 = ~((i420 & i419) | (i420 ^ i419));
                    int i422 = i415 & i421;
                    int i423 = (i415 | i421) & (~i422);
                    int i424 = (i411 - (~(-(-(((i423 & i422) | (i423 ^ i422)) * (-519)))))) - 1;
                    int i425 = i275 ^ iCurrentTimeMillis9;
                    int i426 = iCurrentTimeMillis9 & i275;
                    int i427 = (i426 & i425) | (i425 ^ i426);
                    int i428 = ~i427;
                    int i429 = (i427 | i428) & i428;
                    int i430 = i429 & 6;
                    int i431 = -(~(-(-((((i429 | 6) & (~i430)) | i430) * 519))));
                    iArr12[(((i424 | i431) << 1) - (i431 ^ i424)) - 1] = (int) j43;
                    int i432 = i275 & 7;
                    long j44 = (j25 * j23) + (((long) iArr12[i432 + ((i275 ^ 7) | i432)]) & 4294967295L) + (j43 >>> 32);
                    int iCurrentTimeMillis10 = (int) System.currentTimeMillis();
                    int i433 = -(-(i275 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY));
                    int i434 = ((-3640) & i433) + (i433 | (-3640));
                    int i435 = ((-8) & i275) | ((-8) ^ i275);
                    int i436 = (~((i435 & iCurrentTimeMillis10) | (i435 ^ iCurrentTimeMillis10))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                    int i437 = i434 ^ i436;
                    int i438 = -(-((i436 & i434) << 1));
                    int i439 = ((i437 | i438) << 1) - (i438 ^ i437);
                    int i440 = i134 & 7;
                    int i441 = (~i440) & (i134 | 7);
                    int i442 = (i440 & i441) | (i441 ^ i440);
                    int i443 = ~i442;
                    int i444 = -(~(-(-(((i442 | i443) & i443) * (-1042)))));
                    int i445 = ((i439 | i444) << 1) - (i444 ^ i439);
                    int i446 = (i445 ^ (-1)) + (i445 << 1);
                    int i447 = (i129 ^ 7) | (i129 & 7);
                    int i448 = ~i447;
                    int i449 = (i447 | i448) & i448;
                    int i450 = ~iCurrentTimeMillis10;
                    int i451 = (i450 & (-8)) | ((~i450) & (-8)) | (i450 & 7);
                    int i452 = (i451 & i275) | (i451 ^ i275);
                    int i453 = ~i452;
                    int i454 = (i452 | i453) & i453;
                    int i455 = -(-(((i454 & i449) | (i449 ^ i454)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                    int i456 = i446 & i455;
                    int i457 = ((i446 ^ i455) | i456) << 1;
                    int i458 = -((i455 | i446) & (~i456));
                    iArr12[((i457 | i458) << 1) - (i458 ^ i457)] = (int) j44;
                    long j45 = (j44 >>> 32) + (((long) iArr12[i275 + 8]) & 4294967295L) + j29;
                    int iCurrentTimeMillis11 = (int) System.currentTimeMillis();
                    int i459 = -(-(i275 * 965));
                    int i460 = ((-8668) & i459) + (i459 | (-8668));
                    int i461 = i129 ^ iCurrentTimeMillis11;
                    int i462 = i129 & iCurrentTimeMillis11;
                    int i463 = ~((i461 & i462) | (i461 ^ i462));
                    int i464 = (-9) & i463;
                    int i465 = (i463 | (-9)) & (~i464);
                    int i466 = -(-(((i465 & i464) | (i465 ^ i464)) * (-964)));
                    int i467 = (((~i466) & i460) | ((~i460) & i466)) + ((i466 & i460) << 1);
                    int i468 = ~iCurrentTimeMillis11;
                    int i469 = (iCurrentTimeMillis11 | i468) & i468;
                    int i470 = ~((i469 & i129) | (i129 ^ i469));
                    int i471 = (i129 & (-9)) | (i132 & 8);
                    int i472 = i129 & 8;
                    int i473 = ~((i471 & i472) | (i471 ^ i472));
                    int i474 = i470 ^ i473;
                    int i475 = i470 & i473;
                    iArr12[(((i475 & i474) | (i474 ^ i475)) * (-964)) + i467] = (int) j45;
                    j24 = j45 >>> 32;
                    i121 = i140 + i141;
                    int i476 = f53950a;
                    int i477 = i476 & 95;
                    int i478 = ((i476 ^ 95) | i477) << 1;
                    int i479 = -((i476 | 95) & (~i477));
                    int i480 = (i478 ^ i479) + ((i479 & i478) << 1);
                    f53951b = i480 % 128;
                    int i481 = i480 % 2;
                    j16 = j27;
                    iArr10 = iArr13;
                    j19 = j26;
                    j18 = j30;
                    j17 = j31;
                }
                int i482 = f53950a;
                int i483 = ((i482 | 11) << 1) - (i482 ^ 11);
                f53951b = i483 % 128;
                int i484 = i483 % 2;
                return Integer.valueOf((int) j24);
            case 23:
                int i485 = f53950a;
                int i486 = i485 + 114;
                int i487 = (i486 ^ (-1)) + (i486 << 1);
                f53951b = i487 % 128;
                int i488 = i487 % 2;
                int[] iArr14 = new int[8];
                int i489 = (i485 ^ 69) + ((i485 & 69) << 1);
                f53951b = i489 % 128;
                int i490 = i489 % 2;
                return iArr14;
            case 24:
                return b(objArr);
            case 25:
                return f(objArr);
            case 26:
                return p(objArr);
            case 27:
                int i491 = f53951b;
                int i492 = ((i491 | 5) << 1) - (i491 ^ 5);
                f53950a = i492 % 128;
                long[] jArr = new long[i492 % 2 != 0 ? 92 : 8];
                int i493 = ((i491 ^ 41) | (i491 & 41)) << 1;
                int i494 = -(((~i491) & 41) | (i491 & (-42)));
                int i495 = (i493 & i494) + (i494 | i493);
                f53950a = i495 % 128;
                int i496 = i495 % 2;
                return jArr;
            case 28:
                int[] iArr15 = (int[]) objArr[0];
                int[] iArr16 = (int[]) objArr[1];
                int i497 = f53950a;
                int i498 = (-2) - ((i497 + 110) ^ (-1));
                f53951b = i498 % 128;
                if (i498 % 2 == 0) {
                    j10 = ((long) iArr15[1]) & 4294967295L;
                    i13 = 94;
                    i18 = 95;
                } else {
                    j10 = ((long) iArr15[0]) & 4294967295L;
                    i13 = 7;
                }
                int i499 = i497 & 19;
                int i500 = (((i497 | 19) & (~i499)) - (~(i499 << 1))) - 1;
                f53951b = i500 % 128;
                int i501 = i500 % 2;
                int i502 = 0;
                while (true) {
                    int i503 = (i13 & 117) | ((~i13) & (-118));
                    int i504 = -(-((i13 & (-118)) << 1));
                    int i505 = (i503 ^ i504) + ((i503 & i504) << 1);
                    int i506 = (i505 & (-118)) | (117 & (~i505));
                    int i507 = (i505 & 117) << 1;
                    int i508 = ((i506 & i507) << 1) + (i506 ^ i507);
                    long j46 = ((long) iArr15[i13]) & 4294967295L;
                    long j47 = j46 * j46;
                    int i509 = i18 - 1;
                    int i510 = i502 << 31;
                    int i511 = (int) (j47 >>> 33);
                    int i512 = ((~i511) & i510) | ((~i510) & i511);
                    int i513 = i510 & i511;
                    iArr16[i509] = (i513 & i512) | (i512 ^ i513);
                    int i514 = i509 & (-69);
                    int i515 = (~i514) & (i509 | (-69));
                    int i516 = i514 << 1;
                    int i517 = (i515 & i516) + (i516 | i515);
                    int i518 = i517 & 68;
                    int i519 = -(-(i517 | 68));
                    int i520 = ((i518 | i519) << 1) - (i518 ^ i519);
                    iArr16[i520] = (int) (j47 >>> 1);
                    int i521 = (int) j47;
                    if (i508 <= 0) {
                        int i522 = f53951b + 77;
                        int i523 = i522 % 128;
                        f53950a = i523;
                        int i524 = i522 % 2;
                        long j48 = j10 * j10;
                        long j49 = (((long) (i521 << 31)) & 4294967295L) | (j48 >>> 33);
                        iArr16[0] = (int) j48;
                        int i525 = ((int) (j48 >>> 32)) & 1;
                        long j50 = ((long) iArr15[1]) & 4294967295L;
                        long j51 = ((long) iArr16[2]) & 4294967295L;
                        long j52 = (j50 * j10) + j49;
                        int i526 = (int) j52;
                        int i527 = i526 << 1;
                        int i528 = i527 & i525;
                        int i529 = (i525 | i527) & (~i528);
                        iArr16[1] = (i529 & i528) | (i529 ^ i528);
                        int i530 = i526 >>> 31;
                        long j53 = j51 + (j52 >>> 32);
                        long j54 = ((long) iArr15[2]) & 4294967295L;
                        long j55 = ((long) iArr16[3]) & 4294967295L;
                        long j56 = ((long) iArr16[4]) & 4294967295L;
                        long j57 = (j54 * j10) + j53;
                        int i531 = (int) j57;
                        int i532 = i531 << 1;
                        int i533 = i532 & i530;
                        long j58 = j10;
                        int i534 = (i530 | i532) & (~i533);
                        iArr16[2] = (i534 & i533) | (i534 ^ i533);
                        int i535 = i531 >>> 31;
                        long jA = a.a(j54, j50, j57 >>> 32, j55);
                        long j59 = j56 + (jA >>> 32);
                        long j60 = ((long) iArr15[3]) & 4294967295L;
                        long j61 = (((long) iArr16[5]) & 4294967295L) + (j59 >>> 32);
                        long j62 = j59 & 4294967295L;
                        long j63 = (((long) iArr16[6]) & 4294967295L) + (j61 >>> 32);
                        long j64 = (j60 * j58) + (jA & 4294967295L);
                        int i536 = (int) j64;
                        int i537 = i536 << 1;
                        int i538 = i537 ^ i535;
                        int i539 = i535 & i537;
                        iArr16[3] = (i538 & i539) | (i538 ^ i539);
                        int i540 = i536 >>> 31;
                        long jA2 = a.a(j60, j50, j64 >>> 32, j62);
                        long jA3 = a.a(j60, j54, jA2 >>> 32, j61 & 4294967295L);
                        long j65 = j63 + (jA3 >>> 32);
                        long j66 = jA3 & 4294967295L;
                        long j67 = ((long) iArr15[4]) & 4294967295L;
                        long j68 = (((long) iArr16[7]) & 4294967295L) + (j65 >>> 32);
                        long j69 = j65 & 4294967295L;
                        long j70 = (((long) iArr16[8]) & 4294967295L) + (j68 >>> 32);
                        long j71 = (j67 * j58) + (jA2 & 4294967295L);
                        int i541 = (int) j71;
                        int i542 = i541 << 1;
                        int i543 = ((~i540) & i542) | ((~i542) & i540);
                        int i544 = i540 & i542;
                        iArr16[4] = (i544 & i543) | (i543 ^ i544);
                        int i545 = i541 >>> 31;
                        long jA4 = a.a(j67, j50, j71 >>> 32, j66);
                        long jA5 = a.a(j67, j54, jA4 >>> 32, j69);
                        long jA6 = a.a(j67, j60, jA5 >>> 32, j68 & 4294967295L);
                        long j72 = jA5 & 4294967295L;
                        long j73 = j70 + (jA6 >>> 32);
                        long j74 = jA6 & 4294967295L;
                        long j75 = ((long) iArr15[5]) & 4294967295L;
                        long j76 = (((long) iArr16[9]) & 4294967295L) + (j73 >>> 32);
                        long j77 = j73 & 4294967295L;
                        long j78 = (((long) iArr16[10]) & 4294967295L) + (j76 >>> 32);
                        long j79 = j76 & 4294967295L;
                        long j80 = (j75 * j58) + (jA4 & 4294967295L);
                        int i546 = (int) j80;
                        int i547 = i546 << 1;
                        int i548 = i547 & i545;
                        int i549 = (i545 | i547) & (~i548);
                        iArr16[5] = (i549 & i548) | (i549 ^ i548);
                        int i550 = i546 >>> 31;
                        long jA7 = a.a(j75, j50, j80 >>> 32, j72);
                        long jA8 = a.a(j75, j54, jA7 >>> 32, j74);
                        long jA9 = a.a(j75, j60, jA8 >>> 32, j77);
                        long j81 = jA8 & 4294967295L;
                        long jA10 = a.a(j75, j67, jA9 >>> 32, j79);
                        long j82 = j78 + (jA10 >>> 32);
                        long j83 = jA10 & 4294967295L;
                        long j84 = ((long) iArr15[6]) & 4294967295L;
                        long j85 = (((long) iArr16[11]) & 4294967295L) + (j82 >>> 32);
                        long j86 = (((long) iArr16[12]) & 4294967295L) + (j85 >>> 32);
                        long j87 = (j84 * j58) + (jA7 & 4294967295L);
                        int i551 = (int) j87;
                        int i552 = i551 << 1;
                        int i553 = ((~i550) & i552) | ((~i552) & i550);
                        int i554 = i550 & i552;
                        iArr16[6] = (i554 & i553) | (i553 ^ i554);
                        int i555 = i551 >>> 31;
                        long jA11 = a.a(j84, j50, j87 >>> 32, j81);
                        long jA12 = a.a(j84, j54, jA11 >>> 32, jA9 & 4294967295L);
                        long jA13 = a.a(j84, j60, jA12 >>> 32, j83);
                        long j88 = jA12 & 4294967295L;
                        long jA14 = a.a(j84, j67, jA13 >>> 32, j82 & 4294967295L);
                        long jA15 = a.a(j84, j75, jA14 >>> 32, j85 & 4294967295L);
                        long j89 = jA14 & 4294967295L;
                        long j90 = j86 + (jA15 >>> 32);
                        long j91 = jA15 & 4294967295L;
                        long j92 = ((long) iArr15[7]) & 4294967295L;
                        long j93 = (((long) iArr16[13]) & 4294967295L) + (j90 >>> 32);
                        long j94 = (((long) iArr16[14]) & 4294967295L) + (j93 >>> 32);
                        long j95 = (j58 * j92) + (jA11 & 4294967295L);
                        int i556 = (int) j95;
                        int i557 = i556 << 1;
                        int i558 = ((~i555) & i557) | ((~i557) & i555);
                        int i559 = i555 & i557;
                        iArr16[7] = (i559 & i558) | (i558 ^ i559);
                        int i560 = i556 >>> 31;
                        long jA16 = a.a(j92, j50, j95 >>> 32, j88);
                        long jA17 = a.a(j92, j54, jA16 >>> 32, jA13 & 4294967295L);
                        long jA18 = a.a(j92, j60, jA17 >>> 32, j89);
                        long jA19 = a.a(j92, j67, jA18 >>> 32, j91);
                        long jA20 = a.a(j92, j75, jA19 >>> 32, j90 & 4294967295L);
                        long jA21 = a.a(j92, j84, jA20 >>> 32, j93 & 4294967295L);
                        long j96 = j94 + (jA21 >>> 32);
                        int i561 = (int) jA16;
                        int i562 = i561 << 1;
                        int i563 = i562 ^ i560;
                        int i564 = i560 & i562;
                        iArr16[8] = (i564 & i563) | (i563 ^ i564);
                        int i565 = i561 >>> 31;
                        int i566 = (int) jA17;
                        int i567 = i566 << 1;
                        int i568 = i567 ^ i565;
                        int i569 = i565 & i567;
                        iArr16[9] = (i569 & i568) | (i568 ^ i569);
                        int i570 = i566 >>> 31;
                        int i571 = (int) jA18;
                        int i572 = i571 << 1;
                        int i573 = i572 & i570;
                        int i574 = (i570 | i572) & (~i573);
                        iArr16[10] = (i574 & i573) | (i574 ^ i573);
                        int i575 = i571 >>> 31;
                        int i576 = (int) jA19;
                        int i577 = i576 << 1;
                        int i578 = ((~i575) & i577) | ((~i577) & i575);
                        int i579 = i575 & i577;
                        iArr16[11] = (i579 & i578) | (i578 ^ i579);
                        int i580 = i576 >>> 31;
                        int i581 = (int) jA20;
                        int i582 = i581 << 1;
                        int i583 = ((~i580) & i582) | ((~i582) & i580);
                        int i584 = i580 & i582;
                        iArr16[12] = (i584 & i583) | (i583 ^ i584);
                        int i585 = i581 >>> 31;
                        int i586 = (int) jA21;
                        int i587 = i586 << 1;
                        int i588 = i587 ^ i585;
                        int i589 = i585 & i587;
                        iArr16[13] = (i589 & i588) | (i588 ^ i589);
                        int i590 = i586 >>> 31;
                        int i591 = (int) j96;
                        int i592 = i591 << 1;
                        iArr16[14] = (i590 & i592) | ((~i590) & i592) | ((~i592) & i590);
                        int i593 = i591 >>> 31;
                        int i594 = iArr16[15];
                        int i595 = (int) (j96 >>> 32);
                        int i596 = i594 | i595;
                        int i597 = i596 << 1;
                        int i598 = -((~(i594 & i595)) & i596);
                        int i599 = (((i597 | i598) << 1) - (i598 ^ i597)) << 1;
                        int i600 = i599 & i593;
                        int i601 = (i593 | i599) & (~i600);
                        iArr16[15] = (i601 & i600) | (i601 ^ i600);
                        int i602 = i523 & 55;
                        int i603 = (i523 ^ 55) | i602;
                        int i604 = (i602 & i603) + (i602 | i603);
                        f53951b = i604 % 128;
                        int i605 = i604 % 2;
                        return null;
                    }
                    i18 = i520;
                    i502 = i521;
                    i13 = i508;
                }
                break;
            case 29:
                return g(objArr);
            case 30:
                return d(objArr);
            case 31:
                return m(objArr);
            case 32:
                return l(objArr);
            case 33:
                int[] iArr17 = (int[]) objArr[0];
                int[] iArr18 = (int[]) objArr[1];
                int[] iArr19 = (int[]) objArr[2];
                int i606 = f53951b;
                int i607 = ((i606 | 23) << 1) - (i606 ^ 23);
                f53950a = i607 % 128;
                int i608 = i607 % 2;
                long j97 = ((long) iArr18[0]) & 4294967295L;
                long j98 = ((long) iArr18[1]) & 4294967295L;
                long j99 = ((long) iArr18[2]) & 4294967295L;
                long j100 = ((long) iArr18[3]) & 4294967295L;
                long j101 = ((long) iArr18[4]) & 4294967295L;
                long j102 = ((long) iArr18[5]) & 4294967295L;
                long j103 = ((long) iArr18[6]) & 4294967295L;
                long j104 = ((long) iArr18[7]) & 4294967295L;
                long j105 = ((long) iArr17[0]) & 4294967295L;
                long j106 = j105 * j97;
                iArr19[0] = (int) j106;
                long j107 = (j105 * j98) + (j106 >>> 32);
                iArr19[1] = (int) j107;
                long j108 = (j105 * j99) + (j107 >>> 32);
                iArr19[2] = (int) j108;
                long j109 = (j105 * j100) + (j108 >>> 32);
                iArr19[3] = (int) j109;
                long j110 = (j105 * j101) + (j109 >>> 32);
                iArr19[4] = (int) j110;
                long j111 = (j105 * j102) + (j110 >>> 32);
                iArr19[5] = (int) j111;
                long j112 = (j105 * j103) + (j111 >>> 32);
                iArr19[6] = (int) j112;
                long j113 = (j105 * j104) + (j112 >>> 32);
                iArr19[7] = (int) j113;
                iArr19[8] = (int) (j113 >>> 32);
                System.currentTimeMillis();
                System.currentTimeMillis();
                int i609 = 1;
                for (int i610 = 8; i609 < i610; i610 = 8) {
                    int i611 = f53951b + 23;
                    f53950a = i611 % 128;
                    int i612 = i611 % 2;
                    long j114 = ((long) iArr17[i609]) & 4294967295L;
                    long j115 = j103;
                    long j116 = (j114 * j97) + (((long) iArr19[i609]) & 4294967295L);
                    iArr19[i609] = (int) j116;
                    int i613 = i609 ^ 1;
                    int i614 = i609 & 1;
                    long j117 = j102;
                    long j118 = (j114 * j98) + (((long) iArr19[(((i613 | i614) << 1) - (~(-i613))) - 1]) & 4294967295L) + (j116 >>> 32);
                    int iCurrentTimeMillis12 = (int) System.currentTimeMillis();
                    int i615 = -(~(i609 * (-667)));
                    int i616 = ((((-1335) | i615) << 1) - (i615 ^ (-1335))) - 1;
                    int i617 = ~i609;
                    int i618 = ~i617;
                    int i619 = iCurrentTimeMillis12 & 1;
                    int i620 = (~i619) & (iCurrentTimeMillis12 | 1);
                    long j119 = j100;
                    int i621 = ~iCurrentTimeMillis12;
                    int i622 = ~((i620 & i619) | (i620 ^ i619));
                    int i623 = ((i622 & i617) | (i617 ^ i622)) * (-668);
                    int i624 = ((i616 | i623) << 1) - (i616 ^ i623);
                    int i625 = (i617 & i621) | (iCurrentTimeMillis12 & i618);
                    int i626 = i617 & iCurrentTimeMillis12;
                    int i627 = (i625 & i626) | (i625 ^ i626);
                    int i628 = ~i627;
                    int i629 = (i627 | i628) & i628;
                    int i630 = i629 ^ 1;
                    int i631 = i629 & 1;
                    int i632 = ((i630 ^ i631) | (i631 & i630)) * 1336;
                    int i633 = i624 & i632;
                    int i634 = ((i632 | i624) & (~i633)) + (i633 << 1);
                    int i635 = (iCurrentTimeMillis12 ^ 1) | i619;
                    int i636 = (i635 & i618) | ((~i635) & i617);
                    int i637 = i635 & i617;
                    int i638 = -(-(((i637 & i636) | (i636 ^ i637)) * 668));
                    iArr19[((i634 | i638) << 1) - (i638 ^ i634)] = (int) j118;
                    long j120 = j118 >>> 32;
                    long j121 = j114 * j99;
                    int i639 = i609 * (-782);
                    int i640 = 1568 & i639;
                    int i641 = i639 | 1568;
                    int i642 = ((i640 | i641) << 1) - (i641 ^ i640);
                    int i643 = -(-(i617 * (-783)));
                    int i644 = ((i642 | i643) << 1) - (i643 ^ i642);
                    int i645 = ~((int) System.currentTimeMillis());
                    int i646 = ((-3) ^ i645) | ((-3) & i645);
                    int i647 = i646 & i609;
                    long j122 = j99;
                    int i648 = -(-((~(((~i647) & (i646 | i609)) | i647)) * (-783)));
                    int i649 = i644 ^ i648;
                    int i650 = -(-((i648 & i644) << 1));
                    int i651 = (i649 ^ i650) + ((i650 & i649) << 1);
                    int i652 = (i645 & i617) | ((~i645) & i609);
                    int i653 = i645 & i609;
                    int i654 = (i653 & i652) | (i652 ^ i653);
                    int i655 = ~i654;
                    int i656 = (i654 | i655) & i655;
                    int i657 = ((-3) & (~i656)) | (i656 & 2);
                    int i658 = (-3) & i656;
                    int i659 = i651 - (~(((i658 & i657) | (i657 ^ i658)) * 783));
                    long j123 = j121 + (((long) iArr19[(i659 ^ (-1)) + (i659 << 1)]) & 4294967295L) + j120;
                    int iCurrentTimeMillis13 = (int) System.currentTimeMillis();
                    int i660 = i609 * (-493);
                    int i661 = 990 & i660;
                    int i662 = -(-((i660 ^ 990) | i661));
                    int i663 = ((i661 | i662) << 1) - (i662 ^ i661);
                    int i664 = (i617 | i609) & i617;
                    int i665 = i664 ^ 2;
                    int i666 = ~i664;
                    int i667 = i664 & 2;
                    int i668 = -(-(((i665 & i667) | (i665 ^ i667)) * (-988)));
                    int i669 = i663 & i668;
                    int i670 = ((i663 ^ i668) | i669) << 1;
                    int i671 = -((i663 | i668) & (~i669));
                    int i672 = (i670 & i671) + (i671 | i670);
                    int i673 = i609 ^ (-3);
                    int i674 = i609 & (-3);
                    int i675 = (i673 & i674) | (i673 ^ i674);
                    int i676 = ~iCurrentTimeMillis13;
                    int i677 = i675 & i676;
                    int i678 = (i675 | i676) & (~i677);
                    int i679 = -(-(((i678 & i677) | (i678 ^ i677)) * 494));
                    int i680 = ((i672 ^ i679) - (~((i679 & i672) << 1))) - 1;
                    int i681 = ((-3) & i618) | (i617 & 2);
                    int i682 = (-3) & i617;
                    int i683 = ~((i681 & i682) | (i681 ^ i682));
                    int i684 = (iCurrentTimeMillis13 | i676) & i676;
                    int i685 = (i684 & i617) | ((~i684) & i609);
                    int i686 = i684 & i609;
                    int i687 = (i686 & i685) | (i685 ^ i686);
                    int i688 = ~i687;
                    int i689 = (i687 | i688) & i688;
                    int i690 = i683 & i689;
                    int i691 = ((i689 | i683) & (~i690)) | i690;
                    int i692 = ~(i609 | 2);
                    int i693 = -(-(((i691 & i692) | (i691 ^ i692)) * 494));
                    iArr19[(i680 ^ i693) + ((i693 & i680) << 1)] = (int) j123;
                    long j124 = (j114 * j119) + (((long) iArr19[i609 + 3]) & 4294967295L) + (j123 >>> 32);
                    int iCurrentTimeMillis14 = (int) System.currentTimeMillis();
                    int i694 = -(-(i609 * (-885)));
                    int i695 = (5319 & i694) + (5319 | i694);
                    int i696 = ~(((-4) ^ i617) | ((-4) & i617));
                    int i697 = i664 & iCurrentTimeMillis14;
                    int i698 = (~i697) & (i664 | iCurrentTimeMillis14);
                    int i699 = ~iCurrentTimeMillis14;
                    int i700 = (i698 ^ i697) | (i697 & i698);
                    int i701 = ~i700;
                    int i702 = (i700 | i701) & i701;
                    int i703 = (i696 & i702) | (i696 ^ i702);
                    int i704 = i699 & 3;
                    int i705 = (~i704) & (i699 | 3);
                    int i706 = (i705 ^ i704) | (i705 & i704);
                    int i707 = (i706 & i617) | ((~i706) & i609);
                    int i708 = i706 & i609;
                    int i709 = (i707 ^ i708) | (i707 & i708);
                    int i710 = ~i709;
                    int i711 = (i709 | i710) & i710;
                    int i712 = -(-(((i711 & i703) | ((~i703) & i711) | ((~i711) & i703)) * 886));
                    int i713 = i695 & i712;
                    int i714 = i713 + ((i712 ^ i695) | i713);
                    int i715 = (iCurrentTimeMillis14 | i699) & i699;
                    int i716 = (i715 & i617) | ((~i715) & i609);
                    int i717 = i715 & i609;
                    int i718 = ~((i717 & i716) | (i716 ^ i717));
                    int i719 = i718 & 3;
                    int i720 = (i718 | 3) & (~i719);
                    int i721 = (((i720 & i719) | (i720 ^ i719)) * (-1772)) + i714;
                    int i722 = (i699 & (-4)) | ((~i699) & 3);
                    int i723 = (i722 & i704) | (i722 ^ i704);
                    int i724 = ~i723;
                    int i725 = -(-(((i723 | i724) & i724) * 886));
                    int i726 = i721 & i725;
                    int i727 = ((i721 ^ i725) | i726) << 1;
                    int i728 = -((i721 | i725) & (~i726));
                    iArr19[(i727 ^ i728) + ((i728 & i727) << 1)] = (int) j124;
                    long j125 = j124 >>> 32;
                    long j126 = j114 * j101;
                    int iCurrentTimeMillis15 = (int) System.currentTimeMillis();
                    int i729 = -(-(i609 * (-68)));
                    int i730 = (280 & i729) + (i729 | 280);
                    int i731 = ((-5) & i666) | (i664 & 4);
                    int i732 = (-5) & i664;
                    int i733 = (i731 & i732) | (i731 ^ i732);
                    int i734 = ~iCurrentTimeMillis15;
                    int i735 = (i733 & iCurrentTimeMillis15) | (i733 & i734) | ((~i733) & iCurrentTimeMillis15);
                    int i736 = ~i735;
                    int i737 = (i735 | i736) & i736;
                    int i738 = i617 & 4;
                    int i739 = i609 & (-5);
                    int i740 = i738 | i739;
                    int i741 = i609 & 4;
                    int i742 = (i740 ^ i741) | (i740 & i741);
                    int i743 = ((~i742) & iCurrentTimeMillis15) | (i734 & i742);
                    int i744 = i742 & iCurrentTimeMillis15;
                    int i745 = (i743 & i744) | (i743 ^ i744);
                    int i746 = ~i745;
                    int i747 = (i745 | i746) & i746;
                    int i748 = i737 ^ i747;
                    int i749 = i747 & i737;
                    int i750 = ((i749 & i748) | (i748 ^ i749)) * 69;
                    int i751 = ((~i750) & i730) | ((~i730) & i750);
                    int i752 = (i750 & i730) << 1;
                    int i753 = ((i751 | i752) << 1) - (i752 ^ i751);
                    int i754 = (-5) & i617;
                    int i755 = i754 | i741;
                    int i756 = ~((i755 & i739) | (i755 ^ i739));
                    int i757 = (-5) & iCurrentTimeMillis15;
                    int i758 = (~i757) & ((-5) | iCurrentTimeMillis15);
                    int i759 = ~((i757 & i758) | (i758 ^ i757));
                    int i760 = (i756 & i759) | (i756 ^ i759);
                    int i761 = i609 & iCurrentTimeMillis15;
                    int i762 = ~(((iCurrentTimeMillis15 | i609) & (~i761)) | i761);
                    int i763 = -(-(((i760 & i762) | ((~i762) & i760) | ((~i760) & i762)) * (-69)));
                    int i764 = ((~i763) & i753) | ((~i753) & i763);
                    int i765 = -(-((i763 & i753) << 1));
                    int i766 = ((i764 | i765) << 1) - (i765 ^ i764);
                    int i767 = i617 | 4;
                    int i768 = ~i767;
                    long j127 = j126 + (((long) iArr19[(i766 - (~(((i767 | i768) & i768) * 69))) - 1]) & 4294967295L) + j125;
                    int iCurrentTimeMillis16 = (int) System.currentTimeMillis();
                    int i769 = -(-(i609 * (-489)));
                    int i770 = 1964 ^ i769;
                    int i771 = (((i769 & 1964) | i770) << 1) - i770;
                    int i772 = (-5) ^ i617;
                    int i773 = (i754 & i772) | (i772 ^ i754);
                    int i774 = ~iCurrentTimeMillis16;
                    int i775 = i773 & i774;
                    int i776 = (i773 | i774) & (~i775);
                    int i777 = ((i776 & i775) | (i776 ^ i775)) * (-490);
                    int i778 = ((i771 | i777) << 1) - (i777 ^ i771);
                    int i779 = (i617 ^ 4) | i738;
                    int i780 = ~i779;
                    int i781 = (i779 | i780) & i780;
                    int i782 = i617 & iCurrentTimeMillis16;
                    int i783 = (iCurrentTimeMillis16 | i617) & (~i782);
                    int i784 = ~((i783 & i782) | (i783 ^ i782));
                    int i785 = -(~(-(-(((i781 & i784) | (i781 ^ i784)) * 490))));
                    int i786 = ((i778 ^ i785) + ((i785 & i778) << 1)) - 1;
                    int i787 = i786 ^ (-2450);
                    int i788 = ((i786 & (-2450)) | i787) << 1;
                    int i789 = -i787;
                    iArr19[((i788 | i789) << 1) - (i789 ^ i788)] = (int) j127;
                    long j128 = j127 >>> 32;
                    int i790 = i609 & 5;
                    int i791 = (i609 ^ 5) | i790;
                    long j129 = (j114 * j117) + (((long) iArr19[(i790 ^ i791) + ((i790 & i791) << 1)]) & 4294967295L) + j128;
                    iArr19[((i609 & 6) + (i609 | 6)) - 1] = (int) j129;
                    int iCurrentTimeMillis17 = (int) System.currentTimeMillis();
                    int i792 = -(~(-(-(i609 * 971))));
                    int i793 = (-2) - ((((-11634) ^ i792) + ((i792 & (-11634)) << 1)) ^ (-1));
                    int i794 = i664 ^ 6;
                    int i795 = i664 & 6;
                    int i796 = ~((i794 & i795) | (i794 ^ i795));
                    int i797 = ~iCurrentTimeMillis17;
                    int i798 = (iCurrentTimeMillis17 | i797) & i797;
                    int i799 = i798 ^ i609;
                    int i800 = i798 & i609;
                    int i801 = ~((i800 & i799) | (i799 ^ i800));
                    int i802 = -(-(((i801 & i796) | (i796 ^ i801)) * (-970)));
                    int i803 = i793 & i802;
                    int i804 = i803 + ((i802 ^ i793) | i803);
                    int i805 = (-7) ^ i609;
                    int i806 = (-7) & i609;
                    int i807 = -(-((~((i805 & i806) | (i805 ^ i806))) * 1940));
                    int i808 = ((i804 ^ i807) | (i804 & i807)) << 1;
                    int i809 = -((i807 & (~i804)) | ((~i807) & i804));
                    int i810 = (i808 ^ i809) + ((i809 & i808) << 1);
                    int i811 = ~(((-7) ^ i617) | ((-7) & i617));
                    int i812 = i797 & i609;
                    int i813 = (i797 | i609) & (~i812);
                    int i814 = (i812 & i813) | (i813 ^ i812);
                    int i815 = ~i814;
                    int i816 = (i814 | i815) & i815;
                    int i817 = i811 & i816;
                    int i818 = (i811 | i816) & (~i817);
                    int i819 = -(~(-(-(((i818 & i817) | (i818 ^ i817)) * 970))));
                    long j130 = (j114 * j115) + (((long) iArr19[((i810 & i819) + (i819 | i810)) - 1]) & 4294967295L) + (j129 >>> 32);
                    iArr19[i609 + 6] = (int) j130;
                    long j131 = (j114 * j104) + (((long) iArr19[(i609 ^ 7) + ((i609 & 7) << 1)]) & 4294967295L) + (j130 >>> 32);
                    int iCurrentTimeMillis18 = (int) System.currentTimeMillis();
                    int i820 = ((12411 ^ i694) | (12411 & i694)) << 1;
                    int i821 = -((12411 & (~i694)) | (i694 & (-12412)));
                    int i822 = ((i820 | i821) << 1) - (i821 ^ i820);
                    int i823 = ((-8) & i666) | (i664 & 7);
                    int i824 = (-8) & i664;
                    int i825 = ~((i824 & i823) | (i823 ^ i824));
                    int i826 = i617 & iCurrentTimeMillis18;
                    int i827 = (~i826) & (i617 | iCurrentTimeMillis18);
                    int i828 = ~iCurrentTimeMillis18;
                    int i829 = ~((i826 & i827) | (i827 ^ i826));
                    int i830 = i825 & i829;
                    int i831 = (i825 | i829) & (~i830);
                    int i832 = (i831 & i830) | (i831 ^ i830);
                    int i833 = i828 | 7;
                    int i834 = i833 & i609;
                    int i835 = ~(((i833 | i609) & (~i834)) | i834);
                    int i836 = ((i832 & i835) | (i832 ^ i835)) * 886;
                    int i837 = ((i822 | i836) << 1) - (i836 ^ i822);
                    int i838 = ~((i828 ^ i609) | (i828 & i609));
                    int i839 = i838 & 7;
                    int i840 = (((i838 | 7) & (~i839)) | i839) * (-1772);
                    int i841 = ((~i840) & i837) | ((~i837) & i840);
                    int i842 = (i840 & i837) << 1;
                    int i843 = (i841 & i842) + (i842 | i841);
                    int i844 = (iCurrentTimeMillis18 | i828) & i828;
                    int i845 = (i844 & (-8)) | ((~i844) & 7);
                    int i846 = i844 & 7;
                    int i847 = (i846 & i845) | (i845 ^ i846);
                    int i848 = ~i847;
                    iArr19[(i843 - (~(-(-(((i847 | i848) & i848) * 886))))) - 1] = (int) j131;
                    long j132 = j131 >>> 32;
                    System.currentTimeMillis();
                    int i849 = i609 * (-628);
                    int i850 = 5040 & i849;
                    int i851 = -(-((i849 ^ 5040) | i850));
                    int i852 = (i850 ^ i851) + ((i851 & i850) << 1);
                    int i853 = -(-(i617 * (-629)));
                    int i854 = ((i852 ^ i853) | (i852 & i853)) << 1;
                    int i855 = -((i853 & (~i852)) | ((~i853) & i852));
                    int i856 = ((i854 | i855) << 1) - (i855 ^ i854);
                    int i857 = (~((-9) | i664)) * (-629);
                    int i858 = (i856 & i857) + (i856 | i857);
                    int i859 = (i609 & 8) | (i617 & (-9));
                    int i860 = i609 & (-9);
                    int i861 = -(-(((i860 & i859) | (i859 ^ i860)) * 629));
                    int i862 = ((~i861) & i858) | ((~i858) & i861);
                    int i863 = (i861 & i858) << 1;
                    iArr19[(i862 ^ i863) + ((i863 & i862) << 1)] = (int) j132;
                    i609 = i613 + (i614 << 1);
                    int i864 = f53950a + 49;
                    f53951b = i864 % 128;
                    int i865 = i864 % 2;
                    j103 = j115;
                    j102 = j117;
                    j100 = j119;
                    j99 = j122;
                }
                int i866 = f53950a;
                int i867 = i866 & 117;
                int i868 = i867 + ((i866 ^ 117) | i867);
                f53951b = i868 % 128;
                int i869 = i868 % 2;
                return null;
            case 34:
                int[] iArr20 = (int[]) objArr[0];
                int[] iArr21 = (int[]) objArr[1];
                int i870 = f53950a;
                int i871 = i870 & 43;
                int i872 = (i870 ^ 43) | i871;
                int i873 = (i871 & i872) + (i871 | i872);
                f53951b = i873 % 128;
                int i874 = i873 % 2;
                long j133 = (((long) iArr20[8]) & 4294967295L) + (((long) iArr21[16]) & 4294967295L);
                int i875 = (int) j133;
                iArr20[8] = i875;
                iArr21[16] = i875;
                long j134 = (((long) iArr20[9]) & 4294967295L) + (((long) iArr21[17]) & 4294967295L) + (j133 >>> 32);
                int i876 = (int) j134;
                iArr20[9] = i876;
                iArr21[17] = i876;
                long j135 = (((long) iArr20[10]) & 4294967295L) + (((long) iArr21[18]) & 4294967295L) + (j134 >>> 32);
                int i877 = (int) j135;
                iArr20[10] = i877;
                iArr21[18] = i877;
                long j136 = (((long) iArr20[11]) & 4294967295L) + (((long) iArr21[19]) & 4294967295L) + (j135 >>> 32);
                int i878 = (int) j136;
                iArr20[11] = i878;
                iArr21[19] = i878;
                long j137 = (((long) iArr20[12]) & 4294967295L) + (((long) iArr21[20]) & 4294967295L) + (j136 >>> 32);
                int i879 = (int) j137;
                iArr20[12] = i879;
                iArr21[20] = i879;
                long j138 = (((long) iArr20[13]) & 4294967295L) + (((long) iArr21[21]) & 4294967295L) + (j137 >>> 32);
                int i880 = (int) j138;
                iArr20[13] = i880;
                iArr21[21] = i880;
                long j139 = (((long) iArr20[14]) & 4294967295L) + (((long) iArr21[22]) & 4294967295L) + (j138 >>> 32);
                int i881 = (int) j139;
                iArr20[14] = i881;
                iArr21[22] = i881;
                long j140 = (((long) iArr20[15]) & 4294967295L) + (((long) iArr21[23]) & 4294967295L) + (j139 >>> 32);
                int i882 = (int) j140;
                iArr20[15] = i882;
                iArr21[23] = i882;
                int i883 = (i870 & 65) + (i870 | 65);
                f53951b = i883 % 128;
                int i884 = i883 % 2;
                return Integer.valueOf((int) (j140 >>> 32));
            default:
                return i(objArr);
        }
    }

    public static int setY(int[] iArr, int[] iArr2) {
        return ((Integer) setX(new Object[]{iArr, iArr2}, -1398444665, 1398444675, (int) System.currentTimeMillis())).intValue();
    }

    public static /* synthetic */ Integer t(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int[] iArr2 = (int[]) objArr[2];
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int[] iArr3 = (int[]) objArr[4];
        ((Number) objArr[5]).intValue();
        int i10 = f53950a;
        int i11 = (i10 & 6) + (i10 | 6);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        f53951b = i12 % 128;
        int i13 = i12 % 2;
        long j10 = (((long) iArr[iIntValue]) & 4294967295L) - (((long) iArr2[iIntValue2]) & 4294967295L);
        iArr3[0] = (int) j10;
        int i14 = ((iIntValue2 | 2) << 1) - (iIntValue2 ^ 2);
        long j11 = ((((long) iArr[((iIntValue ^ 1) - (~(-(-((iIntValue & 1) << 1))))) - 1]) & 4294967295L) - (((long) iArr2[(i14 ^ (-1)) + (i14 << 1)]) & 4294967295L)) + (j10 >> 32);
        iArr3[1] = (int) j11;
        long j12 = j11 >> 32;
        int i15 = iIntValue * (-958);
        int i16 = (-1916) | i15;
        int i17 = i16 << 1;
        int i18 = -((~(i15 & (-1916))) & i16);
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        int i20 = ~iIntValue;
        int i21 = ~i20;
        int i22 = i20 & i21;
        int i23 = i22 | i22;
        int i24 = i20 & i20;
        int i25 = ~((i23 ^ i24) | (i23 & i24));
        int i26 = (-3) & iIntValue;
        int i27 = (~i26) & ((-3) | iIntValue);
        int i28 = (i27 ^ i26) | (i27 & i26);
        int i29 = ~i28;
        int i30 = (i28 | i29) & i29;
        int i31 = i25 & i30;
        int i32 = (i30 | i25) & (~i31);
        int i33 = (i32 & i31) | (i32 ^ i31);
        int i34 = i20 | iIntValue;
        int i35 = i20 & i34;
        int i36 = ~((i35 ^ 2) | (i35 & 2));
        int i37 = i33 ^ i36;
        int i38 = i33 & i36;
        int i39 = (i19 - (~(((i37 & i38) | (i37 ^ i38)) * 959))) - 1;
        int i40 = iIntValue & 2;
        int i41 = (~i40) & (iIntValue | 2);
        int i42 = -(~((~((i41 ^ i40) | (i41 & i40))) * (-959)));
        int i43 = (((i39 | i42) << 1) - (i39 ^ i42)) - 1;
        int i44 = (-3) & i20;
        int i45 = (~i44) & ((-3) | i20);
        int i46 = ~((i45 ^ i44) | (i45 & i44));
        int i47 = i24 | (iIntValue & i21);
        int i48 = i20 & iIntValue;
        int i49 = ~((i47 ^ i48) | (i47 & i48));
        int i50 = ((~i49) & i46) | ((~i46) & i49);
        int i51 = i46 & i49;
        int i52 = (i50 & i51) | (i50 ^ i51);
        int i53 = i26 | (i20 & 2);
        int i54 = ~((i40 & i53) | (i53 ^ i40));
        int i55 = i52 ^ i54;
        int i56 = i54 & i52;
        int i57 = -(-(((i56 & i55) | (i55 ^ i56)) * 959));
        int i58 = i43 & i57;
        int i59 = ((i43 ^ i57) | i58) << 1;
        int i60 = -((i43 | i57) & (~i58));
        long j13 = ((long) iArr[(i59 & i60) + (i60 | i59)]) & 4294967295L;
        int i61 = -(-(iIntValue2 * (-396)));
        int i62 = ((796 | i61) << 1) - (i61 ^ 796);
        int i63 = ~(i44 | ((-3) ^ i20));
        int i64 = (-3) ^ iIntValue2;
        int i65 = (-3) & iIntValue2;
        int i66 = ~((i64 ^ i65) | (i64 & i65));
        int i67 = (i63 ^ i66) | (i63 & i66);
        int i68 = i35 ^ iIntValue2;
        int i69 = ~iIntValue2;
        int i70 = i35 & iIntValue2;
        int i71 = ~((i68 ^ i70) | (i68 & i70));
        int i72 = -(~(((i67 ^ i71) | (i67 & i71)) * (-397)));
        int i73 = ((i62 ^ i72) + ((i72 & i62) << 1)) - 1;
        int i74 = (~i65) & ((-3) | iIntValue2);
        int i75 = -(-((~((i74 & i65) | (i74 ^ i65))) * (-397)));
        int i76 = i73 & i75;
        int i77 = (i75 | i73) & (~i76);
        int i78 = i76 << 1;
        int i79 = (i77 ^ i78) + ((i77 & i78) << 1);
        int i80 = iIntValue ^ i66;
        int i81 = i66 & iIntValue;
        int i82 = (i80 & i81) | (i80 ^ i81);
        int i83 = i69 | 2;
        int i84 = ~i83;
        int i85 = (i83 | i84) & i84;
        int i86 = ((~i85) & i82) | ((~i82) & i85);
        int i87 = i82 & i85;
        int i88 = ((i87 & i86) | (i86 ^ i87)) * 397;
        int i89 = i79 & i88;
        int i90 = (i88 ^ i79) | i89;
        long j14 = (j13 - (((long) iArr2[(i89 & i90) + (i90 | i89)]) & 4294967295L)) + j12;
        iArr3[2] = (int) j14;
        long j15 = j14 >> 32;
        int i91 = iIntValue & 3;
        int i92 = -(-((iIntValue ^ 3) | i91));
        long j16 = ((long) iArr[(i91 & i92) + (i91 | i92)]) & 4294967295L;
        int i93 = iIntValue2 * (-475);
        int i94 = 1431 & i93;
        int i95 = ((1431 ^ i93) | i94) << 1;
        int i96 = -((i93 | 1431) & (~i94));
        int i97 = (i95 & i96) + (i96 | i95);
        int i98 = (-4) ^ iIntValue2;
        int i99 = (-4) & iIntValue2;
        int i100 = ~((i99 & i98) | (i98 ^ i99));
        int i101 = (i69 | iIntValue2) & i69;
        int i102 = (i101 & (-4)) | ((~i101) & 3);
        int i103 = i101 & 3;
        int i104 = i102 | i103;
        int i105 = (i104 & i20) | ((~i104) & iIntValue);
        int i106 = i104 & iIntValue;
        int i107 = ~((i105 ^ i106) | (i105 & i106));
        int i108 = ((i107 & i100) | (i100 ^ i107)) * (-476);
        int i109 = i97 | i108;
        int i110 = (i109 << 1) - ((~(i108 & i97)) & i109);
        int i111 = (i102 ^ i103) | (i102 & i103);
        int i112 = i111 & iIntValue;
        int i113 = ((i111 | iIntValue) & (~i112)) | i112;
        int i114 = ~i113;
        int i115 = ((i113 | i114) & i114) * 952;
        int i116 = i110 & i115;
        int i117 = (i115 | i110) & (~i116);
        int i118 = i116 << 1;
        int i119 = (i117 & i118) + (i117 | i118);
        int i120 = (i101 ^ i35) | (i101 & i35);
        int i121 = i120 & 3;
        int i122 = (i120 | 3) & (~i121);
        int i123 = (i122 & i121) | (i122 ^ i121);
        int i124 = ~i123;
        int i125 = -(-(((i123 | i124) & i124) * 476));
        long j17 = (j16 - (((long) iArr2[(((i119 ^ i125) | (i119 & i125)) << 1) - ((i125 & (~i119)) | ((~i125) & i119))]) & 4294967295L)) + j15;
        iArr3[3] = (int) j17;
        int i126 = ((iIntValue ^ 4) | (iIntValue & 4)) << 1;
        int i127 = 4 & i20;
        int i128 = -((iIntValue & (-5)) | i127);
        long j18 = ((long) iArr[(i126 ^ i128) + ((i126 & i128) << 1)]) & 4294967295L;
        int i129 = iIntValue2 * (-885);
        int i130 = ((((7092 ^ i129) | (7092 & i129)) << 1) - (~(-(((~i129) & 7092) | (i129 & (-7093)))))) - 1;
        int i131 = (-5) & i101;
        int i132 = ((-5) | i101) & (~i131);
        int i133 = ~((i132 & i131) | (i132 ^ i131));
        int i134 = ~((i69 ^ iIntValue) | (i69 & iIntValue));
        int i135 = (i133 & i134) | (i133 ^ i134);
        int i136 = i35 & 4;
        int i137 = (~i136) & (i35 | 4);
        int i138 = (i137 ^ i136) | (i136 & i137);
        int i139 = ~((i138 & iIntValue2) | (i138 ^ iIntValue2));
        int i140 = ((~i135) & i139) | ((~i139) & i135);
        int i141 = i135 & i139;
        int i142 = ((i141 & i140) | (i140 ^ i141)) * 886;
        int i143 = i130 & i142;
        int i144 = -(-((i142 ^ i130) | i143));
        int i145 = (i143 & i144) + (i144 | i143);
        int i146 = (~i70) & (i35 | iIntValue2);
        int i147 = ~((i70 & i146) | (i146 ^ i70));
        int i148 = i147 & 4;
        int i149 = (i147 | 4) & (~i148);
        int i150 = -(~(((i149 & i148) | (i149 ^ i148)) * (-1772)));
        int i151 = ((i145 | i150) << 1) - (i150 ^ i145);
        int i152 = (i151 ^ (-1)) + (i151 << 1);
        int i153 = (~(i127 | (i20 & (-5)) | (i21 & 4))) * 886;
        long j19 = (j18 - (((long) iArr2[(i152 & i153) + (i152 | i153)]) & 4294967295L)) + (j17 >> 32);
        iArr3[4] = (int) j19;
        long j20 = j19 >> 32;
        int i154 = iIntValue & 5;
        int i155 = (~i154) & (iIntValue | 5);
        int i156 = -(-(i154 << 1));
        long j21 = ((long) iArr[((i155 | i156) << 1) - (i156 ^ i155)]) & 4294967295L;
        int i157 = ((iIntValue2 ^ 5) | (iIntValue2 & 5)) << 1;
        int i158 = -((iIntValue2 & (-6)) | (i69 & 5));
        long j22 = (j21 - (((long) iArr2[((i157 | i158) << 1) - (i157 ^ i158)]) & 4294967295L)) + j20;
        iArr3[5] = (int) j22;
        long j23 = j22 >> 32;
        int i159 = -(-(iIntValue * (-489)));
        int i160 = 2946 & i159;
        int i161 = (i160 - (~(-(-((i159 ^ 2946) | i160))))) - 1;
        int i162 = ((-7) ^ i20) | ((-7) & i20);
        int i163 = ~i35;
        int i164 = (i162 & i163) | ((~i162) & i35);
        int i165 = i162 & i35;
        int i166 = ((i165 & i164) | (i164 ^ i165)) * (-490);
        int i167 = i161 & i166;
        int i168 = i167 + ((i166 ^ i161) | i167);
        int i169 = (i35 & (-7)) | (i163 & 6);
        int i170 = i35 & 6;
        int i171 = ~((i169 & i170) | (i169 ^ i170));
        int i172 = (~i48) & i34;
        int i173 = (i48 & i172) | (i172 ^ i48);
        int i174 = ~i173;
        int i175 = (i173 | i174) & i174;
        int i176 = i171 & i175;
        int i177 = (i171 | i175) & (~i176);
        int i178 = -(-(((i177 & i176) | (i177 ^ i176)) * 490));
        int i179 = ((i168 | i178) << 1) - (i178 ^ i168);
        int i180 = (i179 & 3429) | ((~i179) & (-3430));
        int i181 = (i179 & (-3430)) << 1;
        long j24 = ((long) iArr[(i180 ^ i181) + ((i180 & i181) << 1)]) & 4294967295L;
        int i182 = -(-(iIntValue2 * (-676)));
        int i183 = ((~i182) & 4068) | (i182 & DigipassSDKReturnCodes.SECURE_CHANNEL_MESSAGE_INCORRECT_LENGTH);
        int i184 = -(-((i182 & 4068) << 1));
        int i185 = ((i183 | i184) << 1) - (i184 ^ i183);
        int i186 = i185 & (-4739);
        int i187 = (~i186) & (i185 | (-4739));
        int i188 = i186 << 1;
        int i189 = (i187 & i188) + (i188 | i187);
        int i190 = (((-7) & i69) | ((-7) ^ i69)) * (-677);
        int i191 = ((i189 ^ i190) | (i189 & i190)) << 1;
        int i192 = -((i190 & (~i189)) | ((~i190) & i189));
        int i193 = ((i191 | i192) << 1) - (i192 ^ i191);
        int i194 = i69 & 6;
        int i195 = (~i194) & (i69 | 6);
        long j25 = (j24 - (((long) iArr2[(-2) - ((i193 - (~((~((i194 & i195) | (i195 ^ i194))) * 677))) ^ (-1))]) & 4294967295L)) + j23;
        iArr3[6] = (int) j25;
        long j26 = j25 >> 32;
        long j27 = ((long) iArr[((iIntValue & 8) + (iIntValue | 8)) - 1]) & 4294967295L;
        int i196 = -(-(iIntValue2 * (-495)));
        int i197 = (-3465) & i196;
        int i198 = (i196 | (-3465)) & (~i197);
        int i199 = -(-(i197 << 1));
        int i200 = (i198 & i199) + (i198 | i199);
        int i201 = (-8) ^ i69;
        int i202 = (-8) & i69;
        int i203 = ~((i201 & i202) | (i201 ^ i202));
        int i204 = (-8) & iIntValue;
        int i205 = (~i204) & ((-8) | iIntValue);
        int i206 = ~((i205 & i204) | (i205 ^ i204));
        int i207 = -(-(((i203 & i206) | ((~i206) & i203) | ((~i203) & i206)) * 992));
        int i208 = i200 & i207;
        int i209 = (i207 | i200) & (~i208);
        int i210 = i208 << 1;
        int i211 = (i209 & i210) + (i209 | i210);
        int i212 = (-8) & i101;
        int i213 = (~i212) & ((-8) | i101);
        int i214 = (i212 & i213) | (i213 ^ i212);
        int i215 = ~i214;
        int i216 = (i214 | i215) & i215;
        int i217 = (-8) & i20;
        int i218 = (iIntValue & 7) | i217;
        int i219 = ~((i204 & i218) | (i218 ^ i204));
        int i220 = ((~i219) & i216) | ((~i216) & i219);
        int i221 = i216 & i219;
        int i222 = (i221 & i220) | (i220 ^ i221);
        int i223 = i217 | (i21 & 7);
        int i224 = i20 & 7;
        int i225 = (i224 & i223) | (i223 ^ i224);
        int i226 = ~((i225 & iIntValue2) | (i225 ^ iIntValue2));
        int i227 = ((~i226) & i222) | ((~i222) & i226);
        int i228 = i226 & i222;
        int i229 = ((i228 & i227) | (i227 ^ i228)) * (-496);
        int i230 = i211 & i229;
        int i231 = -(-((i229 ^ i211) | i230));
        int i232 = (i230 & i231) + (i231 | i230);
        int i233 = iIntValue2 & iIntValue;
        int i234 = (iIntValue2 | iIntValue) & (~i233);
        int i235 = -(-(((i234 & i233) | (i234 ^ i233)) * 496));
        long j28 = (j27 - (((long) iArr2[((i232 | i235) << 1) - (i235 ^ i232)]) & 4294967295L)) + j26;
        iArr3[7] = (int) j28;
        int i236 = (int) (j28 >> 32);
        int i237 = ((i10 ^ 71) | (i10 & 71)) << 1;
        int i238 = -((i10 & (-72)) | ((~i10) & 71));
        int i239 = ((i237 | i238) << 1) - (i237 ^ i238);
        f53951b = i239 % 128;
        if (i239 % 2 != 0) {
            return Integer.valueOf(i236);
        }
        throw null;
    }

    public static /* synthetic */ Integer u(Object[] objArr) {
        long jLongValue = ((Number) objArr[0]).longValue();
        int[] iArr = (int[]) objArr[1];
        int i10 = f53950a;
        int i11 = i10 & 27;
        int i12 = -(-((i10 ^ 27) | i11));
        int i13 = (i11 ^ i12) + ((i11 & i12) << 1);
        f53951b = i13 % 128;
        int i14 = i13 % 2;
        long j10 = jLongValue & 4294967295L;
        long j11 = (j10 * 977) + (((long) iArr[0]) & 4294967295L);
        iArr[0] = (int) j11;
        long j12 = jLongValue >>> 32;
        long j13 = (977 * j12) + j10 + (((long) iArr[1]) & 4294967295L) + (j11 >>> 32);
        iArr[1] = (int) j13;
        long j14 = j12 + (((long) iArr[2]) & 4294967295L) + (j13 >>> 32);
        iArr[2] = (int) j14;
        long j15 = (j14 >>> 32) + (4294967295L & ((long) iArr[3]));
        iArr[3] = (int) j15;
        if ((j15 >>> 32) == 0) {
            int i15 = i10 & 55;
            int i16 = (((i10 ^ 55) | i15) << 1) - ((~i15) & (i10 | 55));
            f53951b = i16 % 128;
            int i17 = i16 % 2;
            int i18 = i10 & 25;
            int i19 = (((~i18) & (i10 | 25)) - (~(-(-(i18 << 1))))) - 1;
            f53951b = i19 % 128;
            int i20 = i19 % 2;
            return 0;
        }
        int iIntValue = ((Integer) auy.setOnFocusChangeListener(new Object[]{8, iArr, 0, 4}, 716282167, -716282152, 8)).intValue();
        int i21 = f53950a;
        int i22 = ((i21 ^ 21) | (i21 & 21)) << 1;
        int i23 = -(((~i21) & 21) | (i21 & (-22)));
        int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
        f53951b = i24 % 128;
        if (i24 % 2 != 0) {
            return Integer.valueOf(iIntValue);
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0050 A[PHI: r2
      0x0050: PHI (r2v30 int) = (r2v16 int), (r2v32 int) binds: [B:15:0x004e, B:12:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    public static /* synthetic */ BigInteger v(Object[] objArr) {
        byte[] bArr;
        int i10;
        int i11;
        int i12 = 0;
        int[] iArr = (int[]) objArr[0];
        int i13 = f53951b;
        int i14 = i13 & 25;
        int i15 = i14 + ((i13 ^ 25) | i14);
        f53950a = i15 % 128;
        if (i15 % 2 != 0) {
            bArr = new byte[48];
            i10 = 1;
        } else {
            bArr = new byte[32];
            i10 = 0;
        }
        int i16 = i13 & 11;
        int i17 = ((i13 ^ 11) | i16) << 1;
        int i18 = -((i13 | 11) & (~i16));
        int i19 = (i17 & i18) + (i18 | i17);
        f53950a = i19 % 128;
        int i20 = i19 % 2;
        while (i10 < 8) {
            int i21 = f53950a + 25;
            f53951b = i21 % 128;
            if (i21 % 2 == 0) {
                i11 = iArr[i10];
                int i22 = 59 / i12;
                if (i11 != 0) {
                    int i23 = -i10;
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i24 = (i23 * (-716)) + 10045;
                    int i25 = ~i23;
                    int i26 = i25 & 7;
                    int i27 = -(-(((i25 ^ 7) | i26) * (-1434)));
                    int i28 = i24 ^ i27;
                    int i29 = ((i24 & i27) | i28) << 1;
                    int i30 = -i28;
                    int i31 = (i29 & i30) + (i29 | i30);
                    int i32 = ~iCurrentTimeMillis;
                    int i33 = (i32 & (-8)) | ((~i32) & 7);
                    int i34 = i32 & 7;
                    int i35 = (i33 & i34) | (i33 ^ i34);
                    int i36 = ~i35;
                    int i37 = (i35 | i36) & i36;
                    int i38 = i23 & 7;
                    int i39 = ~(i26 | (i23 & (-8)) | i38);
                    int i40 = i37 & i39;
                    int i41 = (~i40) & (i37 | i39);
                    int i42 = (i41 & i40) | (i41 ^ i40);
                    int i43 = (i25 | i23) & i25;
                    int i44 = (i43 & 7) | ((-8) & (~i43));
                    int i45 = i43 & (-8);
                    int i46 = (i45 & i44) | (i44 ^ i45);
                    int i47 = i46 & iCurrentTimeMillis;
                    int i48 = (i46 | iCurrentTimeMillis) & (~i47);
                    int i49 = ~((i48 & i47) | (i48 ^ i47));
                    int i50 = i42 ^ i49;
                    int i51 = i42 & i49;
                    int i52 = (-2) - ((i31 - (~(-(-(((i51 & i50) | (i50 ^ i51)) * 717))))) ^ (-1));
                    int i53 = (i25 & (-8)) | (i25 ^ (-8));
                    int i54 = i32 & (i32 | iCurrentTimeMillis);
                    int i55 = i53 & i54;
                    int i56 = (i54 | i53) & (~i55);
                    int i57 = (i56 & i55) | (i56 ^ i55);
                    int i58 = ~i57;
                    int i59 = (i57 | i58) & i58;
                    int i60 = (i23 | 7) & (~i38);
                    int i61 = ~((i60 & i38) | (i60 ^ i38));
                    int i62 = (i61 & i59) | (i59 ^ i61);
                    int i63 = ~(iCurrentTimeMillis | 7);
                    int i64 = ((~i63) & i62) | ((~i62) & i63);
                    int i65 = i62 & i63;
                    int i66 = ((i65 & i64) | (i64 ^ i65)) * 717;
                    int i67 = i52 & i66;
                    ber.setDividerPadding(new Object[]{Integer.valueOf(i11), bArr, Integer.valueOf((((i52 | i66) & (~i67)) + (i67 << 1)) << 2)}, -2092293587, 2092293591, i11);
                    int i68 = f53950a + 101;
                    f53951b = i68 % 128;
                    int i69 = i68 % 2;
                }
            } else {
                i11 = iArr[i10];
                if (i11 != 0) {
                    int i210 = -i10;
                    int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                    int i211 = (i210 * (-716)) + 10045;
                    int i212 = ~i210;
                    int i213 = i212 & 7;
                    int i214 = -(-(((i212 ^ 7) | i213) * (-1434)));
                    int i215 = i211 ^ i214;
                    int i216 = ((i211 & i214) | i215) << 1;
                    int i310 = -i215;
                    int i311 = (i216 & i310) + (i216 | i310);
                    int i312 = ~iCurrentTimeMillis2;
                    int i313 = (i312 & (-8)) | ((~i312) & 7);
                    int i314 = i312 & 7;
                    int i315 = (i313 & i314) | (i313 ^ i314);
                    int i316 = ~i315;
                    int i317 = (i315 | i316) & i316;
                    int i318 = i210 & 7;
                    int i319 = ~(i213 | (i210 & (-8)) | i318);
                    int i410 = i317 & i319;
                    int i411 = (~i410) & (i317 | i319);
                    int i412 = (i411 & i410) | (i411 ^ i410);
                    int i413 = (i212 | i210) & i212;
                    int i414 = (i413 & 7) | ((-8) & (~i413));
                    int i415 = i413 & (-8);
                    int i416 = (i415 & i414) | (i414 ^ i415);
                    int i417 = i416 & iCurrentTimeMillis2;
                    int i418 = (i416 | iCurrentTimeMillis2) & (~i417);
                    int i419 = ~((i418 & i417) | (i418 ^ i417));
                    int i510 = i412 ^ i419;
                    int i511 = i412 & i419;
                    int i512 = (-2) - ((i311 - (~(-(-(((i511 & i510) | (i510 ^ i511)) * 717))))) ^ (-1));
                    int i513 = (i212 & (-8)) | (i212 ^ (-8));
                    int i514 = i312 & (i312 | iCurrentTimeMillis2);
                    int i515 = i513 & i514;
                    int i516 = (i514 | i513) & (~i515);
                    int i517 = (i516 & i515) | (i516 ^ i515);
                    int i518 = ~i517;
                    int i519 = (i517 | i518) & i518;
                    int i610 = (i210 | 7) & (~i318);
                    int i611 = ~((i610 & i318) | (i610 ^ i318));
                    int i612 = (i611 & i519) | (i519 ^ i611);
                    int i613 = ~(iCurrentTimeMillis2 | 7);
                    int i614 = ((~i613) & i612) | ((~i612) & i613);
                    int i615 = i612 & i613;
                    int i616 = ((i615 & i614) | (i614 ^ i615)) * 717;
                    int i617 = i512 & i616;
                    ber.setDividerPadding(new Object[]{Integer.valueOf(i11), bArr, Integer.valueOf((((i512 | i616) & (~i617)) + (i617 << 1)) << 2)}, -2092293587, 2092293591, i11);
                    int i618 = f53950a + 101;
                    f53951b = i618 % 128;
                    int i619 = i618 % 2;
                }
            }
            int i70 = i10 & 101;
            int i71 = (i70 - (~(-(-((i10 ^ 101) | i70))))) - 1;
            i10 = (-2) - ((((i71 | (-99)) << 1) - (i71 ^ (-99))) ^ (-1));
            int i72 = f53951b;
            int i73 = (((i72 & (-58)) | ((~i72) & 57)) - (~((i72 & 57) << 1))) - 1;
            f53950a = i73 % 128;
            int i74 = i73 % 2;
            i12 = 0;
        }
        BigInteger bigInteger = new BigInteger(1, bArr);
        int i75 = f53950a;
        int i76 = (((i75 | 116) << 1) - (i75 ^ 116)) - 1;
        f53951b = i76 % 128;
        if (i76 % 2 == 0) {
            int i77 = 14 / 0;
        }
        return bigInteger;
    }

    public static /* synthetic */ Boolean w(Object[] objArr) {
        int[] iArr = (int[]) objArr[0];
        int[] iArr2 = (int[]) objArr[1];
        int i10 = f53950a + 99;
        int i11 = i10 % 128;
        f53951b = i11;
        int i12 = i10 % 2;
        int i13 = i11 & 11;
        int i14 = i13 + ((i11 ^ 11) | i13);
        f53950a = i14 % 128;
        int i15 = i14 % 2;
        int i16 = 7;
        while (i16 >= 0) {
            int i17 = f53951b;
            int i18 = i17 ^ 77;
            int i19 = -(-((i17 & 77) << 1));
            int i20 = (i18 & i19) + (i18 | i19);
            int i21 = i20 % 128;
            f53950a = i21;
            if (i20 % 2 != 0) {
                int i22 = iArr[i16];
                int i23 = iArr2[i16];
                throw null;
            }
            int i24 = iArr[i16];
            int i25 = i24 & Integer.MIN_VALUE;
            int i26 = ((i24 ^ Integer.MIN_VALUE) | i25) & (~i25);
            int i27 = iArr2[i16];
            int i28 = Integer.MAX_VALUE & i27;
            int i29 = Integer.MIN_VALUE & (~i27);
            int i30 = (i29 & i28) | (i28 ^ i29);
            if (i26 < i30) {
                int i31 = i21 & 27;
                int i32 = -(-((i21 ^ 27) | i31));
                int i33 = ((i31 | i32) << 1) - (i31 ^ i32);
                f53951b = i33 % 128;
                if (i33 % 2 != 0) {
                    return Boolean.FALSE;
                }
                throw null;
            }
            if (i26 > i30) {
                int i34 = (i17 | 79) << 1;
                int i35 = -((i17 & (-80)) | ((~i17) & 79));
                int i36 = (i34 & i35) + (i34 | i35);
                f53950a = i36 % 128;
                int i37 = i36 % 2;
                return Boolean.TRUE;
            }
            int i38 = ~i16;
            int i39 = (i16 | i38) << 1;
            int i40 = -i38;
            i16 = (i39 | i40) + (i39 & i40);
            int i41 = i21 + 15;
            f53951b = i41 % 128;
            int i42 = i41 % 2;
        }
        int i43 = f53950a;
        int i44 = i43 & 69;
        int i45 = -(-((i43 ^ 69) | i44));
        int i46 = ((i44 | i45) << 1) - (i45 ^ i44);
        f53951b = i46 % 128;
        int i47 = i46 % 2;
        return Boolean.TRUE;
    }

    public static int setCompoundDrawableTintBlendMode(int i10, int[] iArr) {
        return ((Integer) setX(new Object[]{Integer.valueOf(i10), iArr}, -1491946461, 1491946479, i10)).intValue();
    }

    public static boolean setDividerPadding(int[] iArr, int[] iArr2) {
        return ((Boolean) setX(new Object[]{iArr, iArr2}, 1543463789, -1543463778, (int) System.currentTimeMillis())).booleanValue();
    }

    public static long setOnDragListener(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Long) setX(new Object[]{iArr, iArr2, iArr3}, 812976775, -812976744, (int) System.currentTimeMillis())).longValue();
    }

    public static int setOnFocusChangeListener(int[] iArr) {
        return ((Integer) setX(new Object[]{iArr}, 1932638258, -1932638241, (int) System.currentTimeMillis())).intValue();
    }

    public static void setY(int[] iArr, int[] iArr2, int[] iArr3) {
        setX(new Object[]{iArr, iArr2, iArr3}, -701222223, 701222256, (int) System.currentTimeMillis());
    }

    public static void setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3, int i10) {
        setX(new Object[]{iArr, iArr2, iArr3, Integer.valueOf(i10)}, 559032188, -559032183, i10);
    }

    public static long[] setDividerPadding() {
        return (long[]) setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
    }

    public static boolean setOnFocusChangeListener(int[] iArr, int[] iArr2) {
        return ((Boolean) setX(new Object[]{iArr, iArr2}, -434699419, 434699434, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setY(long[] jArr) {
        return ((Boolean) setX(new Object[]{jArr}, -1422980310, 1422980335, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Boolean) setX(new Object[]{iArr, iArr2, iArr3}, -1853348607, 1853348623, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setDividerPadding(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setX(new Object[]{iArr, iArr2, iArr3}, -575176837, 575176856, (int) System.currentTimeMillis())).intValue();
    }

    public static int[] setOnFocusChangeListener() {
        return (int[]) setX(new Object[0], 2141150830, -2141150807, (int) System.currentTimeMillis());
    }

    public static boolean setY(int[] iArr) {
        return ((Boolean) setX(new Object[]{iArr}, -362565938, 362565959, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setCompoundDrawableTintBlendMode() {
        return (int[]) setX(new Object[0], 959688236, -959688227, (int) System.currentTimeMillis());
    }

    public static void setOnFocusChangeListener(long[] jArr, long[] jArr2) {
        setX(new Object[]{jArr, jArr2}, -2094914201, 2094914215, (int) System.currentTimeMillis());
    }

    public static boolean setY(long[] jArr, long[] jArr2) {
        return ((Boolean) setX(new Object[]{jArr, jArr2}, 479700147, -479700143, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int setCompoundDrawableTintBlendMode(int[] iArr, int[] iArr2) {
        return ((Integer) setX(new Object[]{iArr, iArr2}, -1750371744, 1750371778, (int) System.currentTimeMillis())).intValue();
    }

    public static long[] setY() {
        return (long[]) setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
    }

    public static int setCompoundDrawableTintBlendMode(int[] iArr, int i10, int[] iArr2, int i11, int i12) {
        return ((Integer) setX(new Object[]{iArr, Integer.valueOf(i10), iArr2, Integer.valueOf(i11), Integer.valueOf(i12)}, -1800016288, 1800016318, i10)).intValue();
    }

    public static int setX(long j10, int[] iArr) {
        return ((Integer) setX(new Object[]{Long.valueOf(j10), iArr}, 1440394292, -1440394291, (int) System.currentTimeMillis())).intValue();
    }

    public static boolean setX(long[] jArr) {
        return ((Boolean) setX(new Object[]{jArr}, 572389043, -572389036, (int) System.currentTimeMillis())).booleanValue();
    }

    public static boolean setX(int[] iArr) {
        return ((Boolean) setX(new Object[]{iArr}, -1194902711, 1194902743, (int) System.currentTimeMillis())).booleanValue();
    }

    public static int[] setX(BigInteger bigInteger) {
        return (int[]) setX(new Object[]{bigInteger}, -1818387099, 1818387099, (int) System.currentTimeMillis());
    }

    public static int setX(int[] iArr, int[] iArr2) {
        return ((Integer) setX(new Object[]{iArr, iArr2}, -860139930, 860139954, (int) System.currentTimeMillis())).intValue();
    }

    public static int setX(int[] iArr, int[] iArr2, int[] iArr3) {
        return ((Integer) setX(new Object[]{iArr, iArr2, iArr3}, -993304868, 993304870, (int) System.currentTimeMillis())).intValue();
    }
}
