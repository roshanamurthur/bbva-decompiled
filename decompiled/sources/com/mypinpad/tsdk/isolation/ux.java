package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import java.nio.ByteBuffer;
import kotlin.UByte;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nByteArrayExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteArrayExtensions.kt\ncom/mypinpad/tsdk/internal/utils/extensions/ByteArrayExtensionsKt\n+ 2 HexEncoding.kt\ncom/mypinpad/common/bytes/encoding/hex/HexEncodingKt\n+ 3 Junkification.kt\ncom/mypinpad/common/bytes/JunkificationKt\n+ 4 ByteArrayFunctions.kt\ncom/mypinpad/common/bytes/ByteArrayFunctionsKt\n*L\n1#1,14:1\n71#2,7:15\n114#2:22\n90#2,18:23\n78#2:41\n119#2:42\n90#2,18:43\n79#2,3:61\n13#3:64\n40#4,17:65\n*S KotlinDebug\n*F\n+ 1 ByteArrayExtensions.kt\ncom/mypinpad/tsdk/internal/utils/extensions/ByteArrayExtensionsKt\n*L\n10#1:15,7\n10#1:22\n10#1:23,18\n10#1:41\n10#1:42\n10#1:43,18\n10#1:61,3\n12#1:64\n14#1:65,17\n*E\n"})
public final class ux {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61428a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61429b = 1;

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object objWrap;
        char c10;
        char c11;
        int i13 = ~i10;
        int i14 = ((i11 | i13) * (-1434)) + (i11 * 1435) + (i10 * (-716));
        int i15 = ~i12;
        int i16 = ~(i15 | i11);
        int i17 = ~(i10 | i11);
        int i18 = i13 | (~i11);
        int i19 = ((i17 | (~(i18 | i15)) | (~(i11 | i12))) * 717) + ((i16 | i17 | (~(i18 | i12))) * 717) + i14;
        int i20 = 0;
        int i21 = 2;
        if (i19 == 1) {
            byte[] bArr = (byte[]) objArr[0];
            int i22 = f61428a + 99;
            f61429b = i22 % 128;
            int i23 = i22 % 2;
            Intrinsics.checkNotNullParameter(bArr, "");
            String x4 = setScrollIndicators.setX(bArr);
            int i24 = f61428a;
            int i25 = (((i24 | 106) << 1) - (i24 ^ 106)) - 1;
            f61429b = i25 % 128;
            if (i25 % 2 != 0) {
                return x4;
            }
            throw null;
        }
        if (i19 == 2) {
            byte[] bArr2 = (byte[]) objArr[0];
            int i26 = f61429b;
            int i27 = ((i26 ^ 61) | (i26 & 61)) << 1;
            int i28 = -(((~i26) & 61) | (i26 & (-62)));
            int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
            f61428a = i29 % 128;
            int i30 = i29 % 2;
            Intrinsics.checkNotNullParameter(bArr2, "");
            byte[] bArrNextBytes = Random.INSTANCE.nextBytes(bArr2);
            int i31 = f61428a;
            int i32 = (((i31 & (-64)) | ((~i31) & 63)) - (~(-(-((i31 & 63) << 1))))) - 1;
            f61429b = i32 % 128;
            if (i32 % 2 != 0) {
                return bArrNextBytes;
            }
            throw null;
        }
        if (i19 == 3) {
            byte[] bArr3 = (byte[]) objArr[0];
            int i33 = f61429b + 99;
            f61428a = i33 % 128;
            if (i33 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr3, "");
                objWrap = ByteBuffer.wrap(bArr3);
                Intrinsics.checkNotNullExpressionValue(objWrap, "");
                int i34 = 34 / 0;
            } else {
                Intrinsics.checkNotNullParameter(bArr3, "");
                objWrap = ByteBuffer.wrap(bArr3);
                Intrinsics.checkNotNullExpressionValue(objWrap, "");
            }
        } else if (i19 != 4) {
            byte[] bArr4 = (byte[]) objArr[0];
            int i35 = f61429b;
            int i36 = i35 & 31;
            int i37 = ((((i35 ^ 31) | i36) << 1) - (~(-((i35 | 31) & (~i36))))) - 1;
            f61428a = i37 % 128;
            if (i37 % 2 != 0) {
                Intrinsics.checkNotNullParameter(bArr4, "");
                int length = bArr4.length;
                throw null;
            }
            Intrinsics.checkNotNullParameter(bArr4, "");
            if (bArr4.length == 0) {
                int i38 = f61429b;
                int i39 = (i38 & 77) + (i38 | 77);
                f61428a = i39 % 128;
                int i40 = i39 % 2;
                int i41 = ((i38 ^ 110) + ((i38 & 110) << 1)) - 1;
                f61428a = i41 % 128;
                if (i41 % 2 != 0) {
                    throw null;
                }
                int i42 = i38 + 83;
                f61428a = i42 % 128;
                if (i42 % 2 == 0) {
                    return "";
                }
                int i43 = 27 / 0;
                return "";
            }
            int i44 = f61429b;
            int i45 = i44 | 89;
            int i46 = ((i45 << 1) - (~(-((~(i44 & 89)) & i45)))) - 1;
            int i47 = i46 % 128;
            f61428a = i47;
            int i48 = i46 % 2;
            char[] cArr = new char[bArr4.length << 1];
            int i49 = ((i47 & 108) + (i47 | 108)) - 1;
            f61429b = i49 % 128;
            int i50 = i49 % 2;
            while (i20 < bArr4.length) {
                int i51 = f61428a;
                int i52 = (((i51 | 66) << 1) - (i51 ^ 66)) - 1;
                int i53 = i52 % 128;
                f61429b = i53;
                int i54 = i52 % i21;
                byte b10 = bArr4[i20];
                int i55 = i20 << 1;
                byte b11 = (byte) ((b10 >>> 4) & 15);
                switch (b11) {
                    case 0:
                        int i56 = i53 & 85;
                        int i57 = i53 | 85;
                        int i58 = (i56 & i57) + (i56 | i57);
                        f61428a = i58 % 128;
                        int i59 = i58 % i21;
                        c10 = '0';
                        break;
                    case 1:
                        c10 = '1';
                        break;
                    case 2:
                        int i60 = (i53 & (-70)) | ((~i53) & 69);
                        int i61 = -(-((i53 & 69) << 1));
                        int i62 = (i60 & i61) + (i60 | i61);
                        f61428a = i62 % 128;
                        int i63 = i62 % i21;
                        c10 = '2';
                        break;
                    case 3:
                        c10 = '3';
                        break;
                    case 4:
                        c10 = '4';
                        break;
                    case 5:
                        int i64 = (i51 & 57) + (i51 | 57);
                        f61429b = i64 % 128;
                        int i65 = i64 % i21;
                        c10 = '5';
                        break;
                    case 6:
                        c10 = '6';
                        break;
                    case 7:
                        int i66 = i51 + 123;
                        f61429b = i66 % 128;
                        int i67 = i66 % i21;
                        c10 = '7';
                        break;
                    case 8:
                        c10 = '8';
                        break;
                    case 9:
                        c10 = '9';
                        break;
                    case 10:
                        int i68 = i51 & 71;
                        int i69 = (i68 - (~(-(-((i51 ^ 71) | i68))))) - 1;
                        f61429b = i69 % 128;
                        int i70 = i69 % i21;
                        c10 = 'a';
                        break;
                    case 11:
                        c10 = 'b';
                        break;
                    case 12:
                        int i71 = (((i51 & (-82)) | ((~i51) & 81)) - (~(-(-((i51 & 81) << 1))))) - 1;
                        f61429b = i71 % 128;
                        int i72 = i71 % i21;
                        c10 = 'c';
                        break;
                    case 13:
                        c10 = 'd';
                        break;
                    case 14:
                        c10 = 'e';
                        break;
                    case 15:
                        int i73 = i53 & 115;
                        int i74 = i53 | 115;
                        int i75 = (i73 ^ i74) + ((i73 & i74) << 1);
                        f61428a = i75 % 128;
                        int i76 = i75 % i21;
                        c10 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b11));
                }
                cArr[i55] = c10;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i77 = -(~(-(-(i55 * (-396)))));
                int i78 = ~iCurrentTimeMillis;
                int i79 = (-2) & i78;
                int i80 = (~i79) & ((-2) | i78);
                int i81 = (i80 ^ i79) | (i79 & i80);
                int i82 = ~i81;
                int i83 = (i81 | i82) & i82;
                int i84 = ~i55;
                int i85 = ((-2) & i84) | (i55 & 1);
                int i86 = (-2) & i55;
                int i87 = (i85 ^ i86) | (i85 & i86);
                int i88 = ~i87;
                int i89 = i88 & (i87 | i88);
                int i90 = i83 & i89;
                int i91 = (~i90) & (i89 | i83);
                int i92 = (((i91 & i90) | (i91 ^ i90) | (~((i78 ^ i55) | (i78 & i55)))) * (-397)) + ((-2) - (((398 ^ i77) + ((i77 & 398) << 1)) ^ (-1)));
                int i93 = (~i86) & ((-2) | i55);
                int i94 = -(~(-(-((~((i93 & i86) | (i93 ^ i86))) * (-397)))));
                int i95 = (((i92 | i94) << 1) - (i92 ^ i94)) - 1;
                int i96 = i85 | i86;
                int i97 = ~i96;
                int i98 = (i96 | i97) & i97;
                int i99 = (iCurrentTimeMillis & i98) | (iCurrentTimeMillis ^ i98);
                int i100 = i84 ^ 1;
                int i101 = i84 & 1;
                int i102 = ~((i100 & i101) | (i100 ^ i101));
                int i103 = i99 ^ i102;
                int i104 = i99 & i102;
                int i105 = -(-(((i104 & i103) | (i103 ^ i104)) * 397));
                int i106 = (i95 ^ i105) + ((i105 & i95) << 1);
                byte b12 = (byte) (b10 & 15);
                switch (b12) {
                    case 0:
                        int i107 = f61428a;
                        int i108 = i107 & 27;
                        int i109 = (((i107 ^ 27) | i108) << 1) - ((i107 | 27) & (~i108));
                        f61429b = i109 % 128;
                        int i110 = i109 % 2;
                        c11 = '0';
                        continue;
                        cArr[i106] = c11;
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i111 = (-517) - (~(-(~(-(-(i20 * 517))))));
                        int i112 = ~i20;
                        int i113 = ~((i112 ^ iCurrentTimeMillis2) | (i112 & iCurrentTimeMillis2));
                        int i114 = ~iCurrentTimeMillis2;
                        int i115 = (i114 ^ 1) | (i114 & 1);
                        int i116 = ~i115;
                        int i117 = (i115 | i116) & i116;
                        int i118 = i113 & i117;
                        int i119 = ((i113 | i117) & (~i118)) | i118;
                        int i120 = i114 ^ i20;
                        int i121 = i114 & i20;
                        int i122 = ~((i120 ^ i121) | (i120 & i121));
                        int i123 = ((i119 & i122) | ((~i122) & i119) | ((~i119) & i122)) * (-516);
                        int i124 = i111 & i123;
                        int i125 = (i111 ^ i123) | i124;
                        int i126 = (i124 ^ i125) + ((i125 & i124) << 1);
                        int i127 = (i112 | i20) & i112;
                        int i128 = (-2) & i127;
                        int i129 = (i127 | (-2)) & (~i128);
                        int i130 = (i129 & i128) | (i129 ^ i128);
                        int i131 = i130 & iCurrentTimeMillis2;
                        int i132 = (i130 | iCurrentTimeMillis2) & (~i131);
                        int i133 = ~((i132 & i131) | (i132 ^ i131));
                        int i134 = (iCurrentTimeMillis2 | i114) & i114;
                        int i135 = (-2) ^ i134;
                        int i136 = i134 & (-2);
                        int i137 = ~((i136 & i135) | (i135 ^ i136) | i20);
                        int i138 = ((i137 & i133) | (i133 ^ i137)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                        int i139 = i126 & i138;
                        int i140 = i138 | i126;
                        int i141 = (i139 ^ i140) + ((i140 & i139) << 1);
                        int i142 = ((-2) & i112) | (i20 & 1);
                        int i143 = i20 & (-2);
                        int i144 = (i142 & i143) | (i142 ^ i143);
                        int i145 = ~i144;
                        int i146 = (i144 | i145) & i145;
                        int i147 = ~(i120 | i121);
                        int i148 = -(-(((i146 & i147) | (i146 ^ i147)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
                        int i149 = ((i141 ^ i148) | (i141 & i148)) << 1;
                        int i150 = -((i148 & (~i141)) | ((~i148) & i141));
                        i20 = (i149 ^ i150) + ((i150 & i149) << 1);
                        int i151 = f61429b;
                        int i152 = ((((i151 ^ 97) | (i151 & 97)) << 1) - (~(-(((~i151) & 97) | (i151 & (-98)))))) - 1;
                        f61428a = i152 % 128;
                        int i153 = i152 % 2;
                        i21 = 2;
                        break;
                    case 1:
                        c11 = '1';
                        break;
                    case 2:
                        c11 = '2';
                        break;
                    case 3:
                        int i154 = f61429b;
                        int i155 = (i154 & 37) + (i154 | 37);
                        f61428a = i155 % 128;
                        int i156 = i155 % 2;
                        c11 = '3';
                        break;
                    case 4:
                        int i157 = f61429b;
                        int i158 = (((i157 ^ 121) | (i157 & 121)) << 1) - (((~i157) & 121) | (i157 & (-122)));
                        f61428a = i158 % 128;
                        int i159 = i158 % 2;
                        c11 = '4';
                        break;
                    case 5:
                        c11 = '5';
                        break;
                    case 6:
                        int i160 = f61429b;
                        int i161 = (((i160 & (-62)) | ((~i160) & 61)) - (~(-(-((i160 & 61) << 1))))) - 1;
                        f61428a = i161 % 128;
                        int i162 = i161 % 2;
                        c11 = '6';
                        break;
                    case 7:
                        int i163 = f61428a;
                        int i164 = i163 & 43;
                        int i165 = (((i163 | 43) & (~i164)) - (~(-(-(i164 << 1))))) - 1;
                        f61429b = i165 % 128;
                        int i166 = i165 % 2;
                        c11 = '7';
                        break;
                    case 8:
                        c11 = '8';
                        break;
                    case 9:
                        int i167 = f61429b + 23;
                        f61428a = i167 % 128;
                        int i168 = i167 % 2;
                        c11 = '9';
                        break;
                    case 10:
                        c11 = 'a';
                        break;
                    case 11:
                        c11 = 'b';
                        break;
                    case 12:
                        c11 = 'c';
                        break;
                    case 13:
                        c11 = 'd';
                        break;
                    case 14:
                        int i169 = f61428a + 7;
                        f61429b = i169 % 128;
                        int i170 = i169 % 2;
                        c11 = 'e';
                        break;
                    case 15:
                        int i171 = f61428a;
                        int i172 = (((i171 | 74) << 1) - (i171 ^ 74)) - 1;
                        f61429b = i172 % 128;
                        int i173 = i172 % 2;
                        c11 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b12));
                }
                cArr[i106] = c11;
                int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                int i1110 = (-517) - (~(-(~(-(-(i20 * 517))))));
                int i1111 = ~i20;
                int i1112 = ~((i1111 ^ iCurrentTimeMillis3) | (i1111 & iCurrentTimeMillis3));
                int i1113 = ~iCurrentTimeMillis3;
                int i1114 = (i1113 ^ 1) | (i1113 & 1);
                int i1115 = ~i1114;
                int i1116 = (i1114 | i1115) & i1115;
                int i1117 = i1112 & i1116;
                int i1118 = ((i1112 | i1116) & (~i1117)) | i1117;
                int i1210 = i1113 ^ i20;
                int i1211 = i1113 & i20;
                int i1212 = ~((i1210 ^ i1211) | (i1210 & i1211));
                int i1213 = ((i1118 & i1212) | ((~i1212) & i1118) | ((~i1118) & i1212)) * (-516);
                int i1214 = i1110 & i1213;
                int i1215 = (i1110 ^ i1213) | i1214;
                int i1216 = (i1214 ^ i1215) + ((i1215 & i1214) << 1);
                int i1217 = (i1111 | i20) & i1111;
                int i1218 = (-2) & i1217;
                int i1219 = (i1217 | (-2)) & (~i1218);
                int i1310 = (i1219 & i1218) | (i1219 ^ i1218);
                int i1311 = i1310 & iCurrentTimeMillis3;
                int i1312 = (i1310 | iCurrentTimeMillis3) & (~i1311);
                int i1313 = ~((i1312 & i1311) | (i1312 ^ i1311));
                int i1314 = (iCurrentTimeMillis3 | i1113) & i1113;
                int i1315 = (-2) ^ i1314;
                int i1316 = i1314 & (-2);
                int i1317 = ~((i1316 & i1315) | (i1315 ^ i1316) | i20);
                int i1318 = ((i1317 & i1313) | (i1313 ^ i1317)) * LibMCryptConstants.IND_HEX_SEGMENTO2;
                int i1319 = i1216 & i1318;
                int i1410 = i1318 | i1216;
                int i1411 = (i1319 ^ i1410) + ((i1410 & i1319) << 1);
                int i1412 = ((-2) & i1111) | (i20 & 1);
                int i1413 = i20 & (-2);
                int i1414 = (i1412 & i1413) | (i1412 ^ i1413);
                int i1415 = ~i1414;
                int i1416 = (i1414 | i1415) & i1415;
                int i1417 = ~(i1210 | i1211);
                int i1418 = -(-(((i1416 & i1417) | (i1416 ^ i1417)) * LibMCryptConstants.IND_HEX_SEGMENTO2));
                int i1419 = ((i1411 ^ i1418) | (i1411 & i1418)) << 1;
                int i1510 = -((i1418 & (~i1411)) | ((~i1418) & i1411));
                i20 = (i1419 ^ i1510) + ((i1510 & i1419) << 1);
                int i1511 = f61429b;
                int i1512 = ((((i1511 ^ 97) | (i1511 & 97)) << 1) - (~(-(((~i1511) & 97) | (i1511 & (-98)))))) - 1;
                f61428a = i1512 % 128;
                int i1513 = i1512 % 2;
                i21 = 2;
            }
            objWrap = new String(cArr);
        } else {
            byte[] bArr5 = (byte[]) objArr[0];
            Intrinsics.checkNotNullParameter(bArr5, "");
            int length2 = bArr5.length;
            byte[] bArrSliceArray = ArraysKt___ArraysKt.sliceArray(bArr5, new IntRange(0, 7));
            int length3 = bArrSliceArray.length - 1;
            long j10 = 0;
            if (length3 >= 0) {
                int i174 = 0;
                while (true) {
                    int i175 = i174 + 84;
                    int i176 = (i175 & (-83)) + (i175 | (-83));
                    long jM5545constructorimpl = UByte.m5545constructorimpl(bArrSliceArray[i174]) & 255;
                    int length4 = bArrSliceArray.length;
                    int i177 = -i174;
                    int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                    int i178 = i177 * (-563);
                    int i179 = length4 * 565;
                    int i180 = (i178 & i179) + (i178 | i179);
                    int i181 = ~i177;
                    int i182 = ~length4;
                    int i183 = ~iCurrentTimeMillis4;
                    int i184 = ~((i182 ^ i183) | (i182 & i183));
                    int i185 = i181 & i184;
                    int i186 = i185 | ((~i185) & (i184 | i181));
                    int i187 = (length4 ^ iCurrentTimeMillis4) | (length4 & iCurrentTimeMillis4);
                    int i188 = ~i187;
                    int i189 = (i187 | i188) & i188;
                    int i190 = i186 & i189;
                    byte[] bArr6 = bArrSliceArray;
                    int i191 = (((~i190) & (i186 | i189)) | i190) * (-564);
                    int i192 = (i180 & i191) + (i191 | i180);
                    int i193 = i181 ^ length4;
                    int i194 = i181 & length4;
                    int i195 = (i193 & i194) | (i193 ^ i194);
                    int i196 = i195 & iCurrentTimeMillis4;
                    int i197 = (i195 | iCurrentTimeMillis4) & (~i196);
                    int i198 = (i197 & i196) | (i197 ^ i196);
                    int i199 = ~i198;
                    int i200 = (((i198 | i199) & i199) * 1128) + i192;
                    int i201 = i181 & i183;
                    int i202 = ~(i201 | ((~i201) & (i181 | i183)));
                    int i203 = i177 & length4;
                    int i204 = (i177 | length4) & (~i203);
                    int i205 = ~((i204 & i203) | (i204 ^ i203));
                    int i206 = i202 & i205;
                    int i207 = (i205 | i202) & (~i206);
                    int i208 = ((i207 & i206) | (i207 ^ i206)) * 564;
                    int i209 = i200 & i208;
                    j10 += jM5545constructorimpl << (((((i200 | i208) & (~i209)) + (i209 << 1)) - 1) * 8);
                    if (i176 > length3) {
                        break;
                    }
                    bArrSliceArray = bArr6;
                    i174 = i176;
                }
            }
            int i210 = f61428a;
            int i211 = i210 & 13;
            int i212 = (((i210 | 13) & (~i211)) - (~(-(-(i211 << 1))))) - 1;
            f61429b = i212 % 128;
            if (i212 % 2 == 0) {
                int i213 = 25 / 0;
            }
            objWrap = Long.valueOf(j10);
        }
        return objWrap;
    }

    public static final long setDividerPadding(@NotNull byte[] bArr) {
        return ((Long) setCompoundDrawableTintBlendMode(new Object[]{bArr}, -515644978, 515644982, (int) System.currentTimeMillis())).longValue();
    }

    @NotNull
    public static final String setOnFocusChangeListener(@NotNull byte[] bArr) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{bArr}, -907784665, 907784665, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final ByteBuffer setX(@NotNull byte[] bArr) {
        return (ByteBuffer) setCompoundDrawableTintBlendMode(new Object[]{bArr}, 948738577, -948738574, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final String setY(@NotNull byte[] bArr) {
        return (String) setCompoundDrawableTintBlendMode(new Object[]{bArr}, 1019201663, -1019201662, (int) System.currentTimeMillis());
    }

    @NotNull
    public static final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] bArr) {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{bArr}, -1177771276, 1177771278, (int) System.currentTimeMillis());
    }
}
