package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import okio.Utf8;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class ada {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final char[] f52449a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52450b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52451c = 1;

    static {
        int i10 = 1 & 9;
        int i11 = (1 ^ 9) | i10;
        int i12 = (i10 & i11) + (i10 | i11);
        f52450b = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:137:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:139:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:140:0x0514  */
    /* JADX WARN: Code duplicated, block: B:207:0x0775  */
    /* JADX WARN: Code duplicated, block: B:220:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:233:0x07db  */
    /* JADX WARN: Code duplicated, block: B:235:0x07df  */
    /* JADX WARN: Code duplicated, block: B:236:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:24:0x012b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0136  */
    /* JADX WARN: Code duplicated, block: B:31:0x013a  */
    /* JADX WARN: Code duplicated, block: B:32:0x013c  */
    /* JADX WARN: Code duplicated, block: B:337:0x0ae8  */
    /* JADX WARN: Code duplicated, block: B:345:0x0af8  */
    /* JADX WARN: Code duplicated, block: B:347:0x0afc  */
    /* JADX WARN: Code duplicated, block: B:349:0x0bc4  */
    /* JADX WARN: Code duplicated, block: B:350:0x0bc6  */
    /* JADX WARN: Code duplicated, block: B:351:0x0bc8  */
    /* JADX WARN: Code duplicated, block: B:35:0x019e  */
    /* JADX WARN: Code duplicated, block: B:37:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:393:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:407:0x04da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:415:0x07d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:426:0x0aec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0aec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:431:0x0352 A[EDGE_INSN: B:431:0x0352->B:78:0x0352 BREAK  A[LOOP:1: B:34:0x019c->B:77:0x02c1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:48:0x024a  */
    /* JADX WARN: Code duplicated, block: B:73:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:76:0x02c0  */
    public static /* synthetic */ Integer a(Object[] objArr) {
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int i16;
        boolean z11;
        boolean z12;
        int i17;
        int i18;
        int i19;
        byte b10;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[] bArr = (byte[]) objArr[0];
        int i25 = 1;
        int iIntValue = ((Number) objArr[1]).intValue();
        int i26 = f52451c;
        int i27 = (i26 & (-122)) | ((~i26) & 121);
        int i28 = (i26 & 121) << 1;
        int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
        f52450b = i29 % 128;
        int i30 = 2;
        int i31 = i29 % 2;
        int length = bArr.length;
        int i32 = 0;
        int i33 = 0;
        int i34 = 0;
        while (i32 < length) {
            byte b11 = bArr[i32];
            if (b11 >= 0) {
                int i35 = f52451c;
                int i36 = i35 ^ 93;
                int i37 = -(-((i35 & 93) << 1));
                int i38 = (i36 ^ i37) + ((i36 & i37) << i25);
                int i39 = i38 % 128;
                f52450b = i39;
                int i40 = i38 % i30;
                int i41 = 469 - (~(-(~(i34 * 471))));
                int i42 = i34 ^ 1;
                int i43 = ~i34;
                int i44 = i34 & 1;
                int i45 = ((i42 ^ i44) | (i42 & i44)) * (-470);
                int i46 = i41 & i45;
                int i47 = i46 + ((i41 ^ i45) | i46);
                int i48 = ((~i43) & (-2)) | (i43 & 1) | ((-2) & i43);
                int i49 = ~i48;
                int i50 = (i48 | i49) & i49;
                int i51 = i43 & iIntValue;
                int i52 = (~i51) & (i43 | iIntValue);
                int i53 = (i52 ^ i51) | (i51 & i52);
                int i54 = ~i53;
                int i55 = (i53 | i54) & i54;
                int i56 = (i50 & i55) | (i50 ^ i55);
                int i57 = ~iIntValue;
                int i58 = ~i57;
                int i59 = (i57 & (-2)) | (i58 & 1) | (i57 & 1);
                int i60 = (i59 & i43) | ((~i59) & i34);
                int i61 = i59 & i34;
                int i62 = ~((i60 ^ i61) | (i60 & i61));
                int i63 = ((~i62) & i56) | ((~i56) & i62);
                int i64 = i56 & i62;
                int i65 = ((i64 & i63) | (i63 ^ i64)) * (-470);
                int i66 = ((i47 | i65) << i25) - (i47 ^ i65);
                int i67 = (i43 | i34) & i43;
                int i68 = (i67 & i25) | (i67 ^ 1);
                int i69 = i68 ^ iIntValue;
                int i70 = i68 & iIntValue;
                int i71 = (i70 & i69) | (i69 ^ i70);
                int i72 = ~i71;
                int i73 = (i71 | i72) & i72;
                int i74 = (i57 | iIntValue) & i57;
                int i75 = i74 & 1;
                int i76 = (i74 | i25) & (~i75);
                int i77 = (i76 & i75) | (i76 ^ i75);
                int i78 = (i77 & i34) | (i77 ^ i34);
                int i79 = ~i78;
                int i80 = (i78 | i79) & i79;
                int i81 = i73 & i80;
                int i82 = (i73 | i80) & (~i81);
                int i83 = ((i82 & i81) | (i82 ^ i81)) * 470;
                int i84 = i66 & i83;
                int i85 = (i83 ^ i66) | i84;
                int i86 = ((i84 | i85) << i25) - (i85 ^ i84);
                if (i34 == 64) {
                    int i87 = (i35 ^ 103) + ((i35 & 103) << i25);
                    f52450b = i87 % 128;
                    int i88 = i87 % 2;
                    return Integer.valueOf(i33);
                }
                if (b11 != 10 && b11 != 13) {
                    if (b11 >= 0 && b11 <= 31) {
                        int i89 = ((i39 | 90) << i25) - (i39 ^ 90);
                        int i90 = (i89 ^ (-1)) + (i89 << i25);
                        f52451c = i90 % 128;
                        int i91 = i90 % 2;
                    } else if (127 <= b11 && b11 <= 159) {
                        int i92 = ((i35 | 41) << i25) - (i35 ^ 41);
                        f52450b = i92 % 128;
                        int i93 = i92 % 2;
                    } else if (b11 == 65533) {
                        if (b11 < 65536) {
                            i18 = i25;
                        } else {
                            i18 = 2;
                        }
                        int i94 = -(~i18);
                        int i95 = ((i33 & i94) + (i94 | i33)) - i25;
                        int i96 = -(-(i32 * 917));
                        int i97 = (-1831) & i96;
                        int i98 = ((((-1831) ^ i96) | i97) << i25) - ((i96 | (-1831)) & (~i97));
                        int i99 = -(~(-(-((~(((-2) ^ i32) | ((-2) & i32))) * 2748))));
                        int i100 = ((i98 & i99) + (i99 | i98)) - i25;
                        int i101 = ~i32;
                        int i102 = (-2) & i101;
                        int i103 = -(~((((-2) ^ i101) | i102) * (-916)));
                        int i104 = ((i100 & i103) + (i100 | i103)) - i25;
                        int i105 = (i101 & i25) | ((~i101) & (-2));
                        int i106 = ~((i105 & i102) | (i105 ^ i102));
                        int i107 = i32 | 1;
                        int i108 = ~i107;
                        int i109 = (i107 | i108) & i108;
                        int i110 = i106 ^ i109;
                        int i111 = i106 & i109;
                        int i112 = -(-(((i111 & i110) | (i110 ^ i111)) * 916));
                        int i113 = i104 & i112;
                        int i114 = -(-(i112 | i104));
                        i32 = (i113 & i114) + (i114 | i113);
                        i33 = i95;
                        i34 = i86;
                        while (i32 < length) {
                            i19 = f52451c;
                            int i115 = i19 + 124;
                            int i116 = (i115 ^ (-1)) + (i115 << i25);
                            f52450b = i116 % 128;
                            int i117 = i116 % 2;
                            b10 = bArr[i32];
                            if (b10 >= 0) {
                                break;
                                break;
                            }
                            int i118 = i19 & 41;
                            int i119 = (i19 ^ 41) | i118;
                            int i120 = ((i118 | i119) << i25) - (i118 ^ i119);
                            f52450b = i120 % 128;
                            int i121 = i120 % 2;
                            int i122 = i32 & 1;
                            int i123 = (i32 ^ 1) | i122;
                            i32 = ((i122 | i123) << i25) - (i123 ^ i122);
                            i20 = (i34 & 1) + (i34 | 1);
                            if (i34 == 64) {
                                return Integer.valueOf(i33);
                            }
                            if (b10 != 10) {
                                int i124 = 1469609455 & iIntValue;
                                int i125 = (1469609455 | iIntValue) & (~i124);
                                int i126 = (i125 & i124) | (i125 ^ i124);
                                int i127 = ~i126;
                                int i128 = (i126 | i127) & i127;
                                int i129 = -(-(((i128 & (-1475999728)) | ((~i128) & (-1475999728)) | (1475999727 & i128)) * (-140)));
                                int i130 = 1657673309 ^ i129;
                                int i131 = ((i129 & 1657673309) | i130) << i25;
                                int i132 = -i130;
                                int i133 = (i131 & i132) + (i131 | i132);
                                int i134 = ((-6390273) & i57) | (6390272 & iIntValue);
                                int i135 = (-6390273) & iIntValue;
                                int i136 = (~((i135 & i134) | (i134 ^ i135))) * 70;
                                int i137 = i133 & i136;
                                i22 = (i137 - (~((i136 ^ i133) | i137))) - i25;
                                int i138 = ((-1391587848) & i57) | (1391587847 & iIntValue);
                                int i139 = (-1391587848) & iIntValue;
                                int i140 = ~((i139 & i138) | (i138 ^ i139));
                                i23 = -(-(((i140 & (-90802153)) | ((-90802153) ^ i140)) * 70));
                                if ((i22 & i23) + (i23 | i22) <= -2044121600) {
                                }
                                if (b10 != 65533) {
                                    if (b10 < 65536) {
                                        int i141 = f52451c;
                                        int i142 = (i141 ^ 71) + ((i141 & 71) << i25);
                                        f52450b = i142 % 128;
                                        int i143 = i142 % 2;
                                        i21 = i25;
                                    } else {
                                        i21 = 2;
                                    }
                                    int i144 = i21 * (-496);
                                    int i145 = -(-(i33 * (-496)));
                                    int i146 = (i144 ^ i145) + ((i144 & i145) << i25);
                                    int i147 = ~i21;
                                    int i148 = (i147 | i21) & i147;
                                    int i149 = ~i33;
                                    int i150 = -(-((~((i148 ^ i149) | (i148 & i149))) * 497));
                                    int i151 = ((i146 | i150) << i25) - (i146 ^ i150);
                                    int i152 = (i149 | i33) & i149;
                                    int i153 = i148 & i152;
                                    int i154 = (~i153) & (i152 | i148);
                                    int i155 = (i154 & i153) | (i154 ^ i153);
                                    int i156 = (i155 & i57) | ((~i155) & iIntValue);
                                    int i157 = i155 & iIntValue;
                                    int i158 = (i157 & i156) | (i156 ^ i157);
                                    int i159 = ~i158;
                                    int i160 = (i158 | i159) & i159;
                                    int i161 = (i149 & i58) | ((~i149) & i57);
                                    int i162 = i149 & i57;
                                    int i163 = (i161 ^ i162) | (i161 & i162);
                                    int i164 = ~((i163 & i21) | (i163 ^ i21));
                                    int i165 = -(-(((i160 & i164) | (i160 ^ i164)) * 497));
                                    int i166 = (i151 & i165) + (i165 | i151);
                                    int i167 = (i148 ^ i57) | (i148 & i57);
                                    int i168 = ~i167;
                                    int i169 = (i167 | i168) & i168;
                                    int i170 = ~((i147 & i33) | (i147 ^ i33));
                                    int i171 = i169 ^ i170;
                                    int i172 = i169 & i170;
                                    int i173 = (i172 & i171) | (i171 ^ i172);
                                    int i174 = i149 & i21;
                                    int i175 = (i21 | i149) & (~i174);
                                    int i176 = (i175 & i174) | (i175 ^ i174);
                                    int i177 = (i176 & i57) | ((~i176) & iIntValue);
                                    int i178 = i176 & iIntValue;
                                    int i179 = ~((i178 & i177) | (i177 ^ i178));
                                    int i180 = ((i179 & i173) | (i173 ^ i179)) * 497;
                                    int i181 = (i166 | i180) << 1;
                                    int i182 = -(i180 ^ i166);
                                    i33 = (i181 & i182) + (i182 | i181);
                                    i34 = i20;
                                    i25 = 1;
                                }
                            } else if (b10 != 65533) {
                                if (b10 < 65536) {
                                    int i1410 = f52451c;
                                    int i1411 = (i1410 ^ 71) + ((i1410 & 71) << i25);
                                    f52450b = i1411 % 128;
                                    int i1412 = i1411 % 2;
                                    i21 = i25;
                                } else {
                                    i21 = 2;
                                }
                                int i1413 = i21 * (-496);
                                int i1414 = -(-(i33 * (-496)));
                                int i1415 = (i1413 ^ i1414) + ((i1413 & i1414) << i25);
                                int i1416 = ~i21;
                                int i1417 = (i1416 | i21) & i1416;
                                int i1418 = ~i33;
                                int i1510 = -(-((~((i1417 ^ i1418) | (i1417 & i1418))) * 497));
                                int i1511 = ((i1415 | i1510) << i25) - (i1415 ^ i1510);
                                int i1512 = (i1418 | i33) & i1418;
                                int i1513 = i1417 & i1512;
                                int i1514 = (~i1513) & (i1512 | i1417);
                                int i1515 = (i1514 & i1513) | (i1514 ^ i1513);
                                int i1516 = (i1515 & i57) | ((~i1515) & iIntValue);
                                int i1517 = i1515 & iIntValue;
                                int i1518 = (i1517 & i1516) | (i1516 ^ i1517);
                                int i1519 = ~i1518;
                                int i1610 = (i1518 | i1519) & i1519;
                                int i1611 = (i1418 & i58) | ((~i1418) & i57);
                                int i1612 = i1418 & i57;
                                int i1613 = (i1611 ^ i1612) | (i1611 & i1612);
                                int i1614 = ~((i1613 & i21) | (i1613 ^ i21));
                                int i1615 = -(-(((i1610 & i1614) | (i1610 ^ i1614)) * 497));
                                int i1616 = (i1511 & i1615) + (i1615 | i1511);
                                int i1617 = (i1417 ^ i57) | (i1417 & i57);
                                int i1618 = ~i1617;
                                int i1619 = (i1617 | i1618) & i1618;
                                int i1710 = ~((i1416 & i33) | (i1416 ^ i33));
                                int i1711 = i1619 ^ i1710;
                                int i1712 = i1619 & i1710;
                                int i1713 = (i1712 & i1711) | (i1711 ^ i1712);
                                int i1714 = i1418 & i21;
                                int i1715 = (i21 | i1418) & (~i1714);
                                int i1716 = (i1715 & i1714) | (i1715 ^ i1714);
                                int i1717 = (i1716 & i57) | ((~i1716) & iIntValue);
                                int i1718 = i1716 & iIntValue;
                                int i1719 = ~((i1718 & i1717) | (i1717 ^ i1718));
                                int i183 = ((i1719 & i1713) | (i1713 ^ i1719)) * 497;
                                int i184 = (i1616 | i183) << 1;
                                int i185 = -(i183 ^ i1616);
                                i33 = (i184 & i185) + (i185 | i184);
                                i34 = i20;
                                i25 = 1;
                            }
                            return -1;
                        }
                    }
                    return -1;
                }
                if (b11 == 65533) {
                    if (b11 < 65536) {
                        i18 = i25;
                    } else {
                        i18 = 2;
                    }
                    int i910 = -(~i18);
                    int i911 = ((i33 & i910) + (i910 | i33)) - i25;
                    int i912 = -(-(i32 * 917));
                    int i913 = (-1831) & i912;
                    int i914 = ((((-1831) ^ i912) | i913) << i25) - ((i912 | (-1831)) & (~i913));
                    int i915 = -(~(-(-((~(((-2) ^ i32) | ((-2) & i32))) * 2748))));
                    int i1010 = ((i914 & i915) + (i915 | i914)) - i25;
                    int i1011 = ~i32;
                    int i1012 = (-2) & i1011;
                    int i1013 = -(~((((-2) ^ i1011) | i1012) * (-916)));
                    int i1014 = ((i1010 & i1013) + (i1010 | i1013)) - i25;
                    int i1015 = (i1011 & i25) | ((~i1011) & (-2));
                    int i1016 = ~((i1015 & i1012) | (i1015 ^ i1012));
                    int i1017 = i32 | 1;
                    int i1018 = ~i1017;
                    int i1019 = (i1017 | i1018) & i1018;
                    int i1110 = i1016 ^ i1019;
                    int i1111 = i1016 & i1019;
                    int i1112 = -(-(((i1111 & i1110) | (i1110 ^ i1111)) * 916));
                    int i1113 = i1014 & i1112;
                    int i1114 = -(-(i1112 | i1014));
                    i32 = (i1113 & i1114) + (i1114 | i1113);
                    i33 = i911;
                    i34 = i86;
                    while (i32 < length) {
                        i19 = f52451c;
                        int i1115 = i19 + 124;
                        int i1116 = (i1115 ^ (-1)) + (i1115 << i25);
                        f52450b = i1116 % 128;
                        int i1117 = i1116 % 2;
                        b10 = bArr[i32];
                        if (b10 >= 0) {
                            break;
                        }
                        int i1118 = i19 & 41;
                        int i1119 = (i19 ^ 41) | i1118;
                        int i1210 = ((i1118 | i1119) << i25) - (i1118 ^ i1119);
                        f52450b = i1210 % 128;
                        int i1211 = i1210 % 2;
                        int i1212 = i32 & 1;
                        int i1213 = (i32 ^ 1) | i1212;
                        i32 = ((i1212 | i1213) << i25) - (i1213 ^ i1212);
                        i20 = (i34 & 1) + (i34 | 1);
                        if (i34 == 64) {
                            return Integer.valueOf(i33);
                        }
                        if (b10 != 10) {
                            int i1214 = 1469609455 & iIntValue;
                            int i1215 = (1469609455 | iIntValue) & (~i1214);
                            int i1216 = (i1215 & i1214) | (i1215 ^ i1214);
                            int i1217 = ~i1216;
                            int i1218 = (i1216 | i1217) & i1217;
                            int i1219 = -(-(((i1218 & (-1475999728)) | ((~i1218) & (-1475999728)) | (1475999727 & i1218)) * (-140)));
                            int i1310 = 1657673309 ^ i1219;
                            int i1311 = ((i1219 & 1657673309) | i1310) << i25;
                            int i1312 = -i1310;
                            int i1313 = (i1311 & i1312) + (i1311 | i1312);
                            int i1314 = ((-6390273) & i57) | (6390272 & iIntValue);
                            int i1315 = (-6390273) & iIntValue;
                            int i1316 = (~((i1315 & i1314) | (i1314 ^ i1315))) * 70;
                            int i1317 = i1313 & i1316;
                            i22 = (i1317 - (~((i1316 ^ i1313) | i1317))) - i25;
                            int i1318 = ((-1391587848) & i57) | (1391587847 & iIntValue);
                            int i1319 = (-1391587848) & iIntValue;
                            int i1419 = ~((i1319 & i1318) | (i1318 ^ i1319));
                            i23 = -(-(((i1419 & (-90802153)) | ((-90802153) ^ i1419)) * 70));
                            if ((i22 & i23) + (i23 | i22) <= -2044121600 ? b10 != 13 : b10 != 3) {
                                if (b10 < 0 || b10 > 31) {
                                    i24 = 0;
                                } else {
                                    int i186 = ((i19 ^ 93) | (i19 & 93)) << i25;
                                    int i187 = -((i19 & (-94)) | ((~i19) & 93));
                                    int i188 = ((i186 | i187) << i25) - (i186 ^ i187);
                                    f52450b = i188 % 128;
                                    int i189 = i188 % 2;
                                    int i190 = i19 + 15;
                                    f52450b = i190 % 128;
                                    int i191 = i190 % 2;
                                    i24 = i25;
                                }
                                if ((i24 ^ i25) == i25) {
                                    if (127 <= b10) {
                                        int i192 = f52450b;
                                        int i193 = i192 & 67;
                                        int i194 = (((i192 ^ 67) | i193) << i25) - ((i192 | 67) & (~i193));
                                        f52451c = i194 % 128;
                                        if (i194 % 2 == 0) {
                                            if (b10 > 14963) {
                                                if (b10 != 65533) {
                                                    if (b10 < 65536) {
                                                        int i14110 = f52451c;
                                                        int i14111 = (i14110 ^ 71) + ((i14110 & 71) << i25);
                                                        f52450b = i14111 % 128;
                                                        int i14112 = i14111 % 2;
                                                        i21 = i25;
                                                    } else {
                                                        i21 = 2;
                                                    }
                                                    int i14113 = i21 * (-496);
                                                    int i14114 = -(-(i33 * (-496)));
                                                    int i14115 = (i14113 ^ i14114) + ((i14113 & i14114) << i25);
                                                    int i14116 = ~i21;
                                                    int i14117 = (i14116 | i21) & i14116;
                                                    int i14118 = ~i33;
                                                    int i15110 = -(-((~((i14117 ^ i14118) | (i14117 & i14118))) * 497));
                                                    int i15111 = ((i14115 | i15110) << i25) - (i14115 ^ i15110);
                                                    int i15112 = (i14118 | i33) & i14118;
                                                    int i15113 = i14117 & i15112;
                                                    int i15114 = (~i15113) & (i15112 | i14117);
                                                    int i15115 = (i15114 & i15113) | (i15114 ^ i15113);
                                                    int i15116 = (i15115 & i57) | ((~i15115) & iIntValue);
                                                    int i15117 = i15115 & iIntValue;
                                                    int i15118 = (i15117 & i15116) | (i15116 ^ i15117);
                                                    int i15119 = ~i15118;
                                                    int i16110 = (i15118 | i15119) & i15119;
                                                    int i16111 = (i14118 & i58) | ((~i14118) & i57);
                                                    int i16112 = i14118 & i57;
                                                    int i16113 = (i16111 ^ i16112) | (i16111 & i16112);
                                                    int i16114 = ~((i16113 & i21) | (i16113 ^ i21));
                                                    int i16115 = -(-(((i16110 & i16114) | (i16110 ^ i16114)) * 497));
                                                    int i16116 = (i15111 & i16115) + (i16115 | i15111);
                                                    int i16117 = (i14117 ^ i57) | (i14117 & i57);
                                                    int i16118 = ~i16117;
                                                    int i16119 = (i16117 | i16118) & i16118;
                                                    int i17110 = ~((i14116 & i33) | (i14116 ^ i33));
                                                    int i17111 = i16119 ^ i17110;
                                                    int i17112 = i16119 & i17110;
                                                    int i17113 = (i17112 & i17111) | (i17111 ^ i17112);
                                                    int i17114 = i14118 & i21;
                                                    int i17115 = (i21 | i14118) & (~i17114);
                                                    int i17116 = (i17115 & i17114) | (i17115 ^ i17114);
                                                    int i17117 = (i17116 & i57) | ((~i17116) & iIntValue);
                                                    int i17118 = i17116 & iIntValue;
                                                    int i17119 = ~((i17118 & i17117) | (i17117 ^ i17118));
                                                    int i1810 = ((i17119 & i17113) | (i17113 ^ i17119)) * 497;
                                                    int i1811 = (i16116 | i1810) << 1;
                                                    int i1812 = -(i1810 ^ i16116);
                                                    i33 = (i1811 & i1812) + (i1812 | i1811);
                                                    i34 = i20;
                                                    i25 = 1;
                                                }
                                            }
                                        } else if (b10 > 159) {
                                            if (b10 != 65533) {
                                                if (b10 < 65536) {
                                                    int i14119 = f52451c;
                                                    int i141110 = (i14119 ^ 71) + ((i14119 & 71) << i25);
                                                    f52450b = i141110 % 128;
                                                    int i141111 = i141110 % 2;
                                                    i21 = i25;
                                                } else {
                                                    i21 = 2;
                                                }
                                                int i141112 = i21 * (-496);
                                                int i141113 = -(-(i33 * (-496)));
                                                int i141114 = (i141112 ^ i141113) + ((i141112 & i141113) << i25);
                                                int i141115 = ~i21;
                                                int i141116 = (i141115 | i21) & i141115;
                                                int i141117 = ~i33;
                                                int i151110 = -(-((~((i141116 ^ i141117) | (i141116 & i141117))) * 497));
                                                int i151111 = ((i141114 | i151110) << i25) - (i141114 ^ i151110);
                                                int i151112 = (i141117 | i33) & i141117;
                                                int i151113 = i141116 & i151112;
                                                int i151114 = (~i151113) & (i151112 | i141116);
                                                int i151115 = (i151114 & i151113) | (i151114 ^ i151113);
                                                int i151116 = (i151115 & i57) | ((~i151115) & iIntValue);
                                                int i151117 = i151115 & iIntValue;
                                                int i151118 = (i151117 & i151116) | (i151116 ^ i151117);
                                                int i151119 = ~i151118;
                                                int i161110 = (i151118 | i151119) & i151119;
                                                int i161111 = (i141117 & i58) | ((~i141117) & i57);
                                                int i161112 = i141117 & i57;
                                                int i161113 = (i161111 ^ i161112) | (i161111 & i161112);
                                                int i161114 = ~((i161113 & i21) | (i161113 ^ i21));
                                                int i161115 = -(-(((i161110 & i161114) | (i161110 ^ i161114)) * 497));
                                                int i161116 = (i151111 & i161115) + (i161115 | i151111);
                                                int i161117 = (i141116 ^ i57) | (i141116 & i57);
                                                int i161118 = ~i161117;
                                                int i161119 = (i161117 | i161118) & i161118;
                                                int i171110 = ~((i141115 & i33) | (i141115 ^ i33));
                                                int i171111 = i161119 ^ i171110;
                                                int i171112 = i161119 & i171110;
                                                int i171113 = (i171112 & i171111) | (i171111 ^ i171112);
                                                int i171114 = i141117 & i21;
                                                int i171115 = (i21 | i141117) & (~i171114);
                                                int i171116 = (i171115 & i171114) | (i171115 ^ i171114);
                                                int i171117 = (i171116 & i57) | ((~i171116) & iIntValue);
                                                int i171118 = i171116 & iIntValue;
                                                int i171119 = ~((i171118 & i171117) | (i171117 ^ i171118));
                                                int i1813 = ((i171119 & i171113) | (i171113 ^ i171119)) * 497;
                                                int i1814 = (i161116 | i1813) << 1;
                                                int i1815 = -(i1813 ^ i161116);
                                                i33 = (i1814 & i1815) + (i1815 | i1814);
                                                i34 = i20;
                                                i25 = 1;
                                            }
                                        }
                                    } else if (b10 != 65533) {
                                        if (b10 < 65536) {
                                            int i141118 = f52451c;
                                            int i141119 = (i141118 ^ 71) + ((i141118 & 71) << i25);
                                            f52450b = i141119 % 128;
                                            int i1411110 = i141119 % 2;
                                            i21 = i25;
                                        } else {
                                            i21 = 2;
                                        }
                                        int i1411111 = i21 * (-496);
                                        int i1411112 = -(-(i33 * (-496)));
                                        int i1411113 = (i1411111 ^ i1411112) + ((i1411111 & i1411112) << i25);
                                        int i1411114 = ~i21;
                                        int i1411115 = (i1411114 | i21) & i1411114;
                                        int i1411116 = ~i33;
                                        int i1511110 = -(-((~((i1411115 ^ i1411116) | (i1411115 & i1411116))) * 497));
                                        int i1511111 = ((i1411113 | i1511110) << i25) - (i1411113 ^ i1511110);
                                        int i1511112 = (i1411116 | i33) & i1411116;
                                        int i1511113 = i1411115 & i1511112;
                                        int i1511114 = (~i1511113) & (i1511112 | i1411115);
                                        int i1511115 = (i1511114 & i1511113) | (i1511114 ^ i1511113);
                                        int i1511116 = (i1511115 & i57) | ((~i1511115) & iIntValue);
                                        int i1511117 = i1511115 & iIntValue;
                                        int i1511118 = (i1511117 & i1511116) | (i1511116 ^ i1511117);
                                        int i1511119 = ~i1511118;
                                        int i1611110 = (i1511118 | i1511119) & i1511119;
                                        int i1611111 = (i1411116 & i58) | ((~i1411116) & i57);
                                        int i1611112 = i1411116 & i57;
                                        int i1611113 = (i1611111 ^ i1611112) | (i1611111 & i1611112);
                                        int i1611114 = ~((i1611113 & i21) | (i1611113 ^ i21));
                                        int i1611115 = -(-(((i1611110 & i1611114) | (i1611110 ^ i1611114)) * 497));
                                        int i1611116 = (i1511111 & i1611115) + (i1611115 | i1511111);
                                        int i1611117 = (i1411115 ^ i57) | (i1411115 & i57);
                                        int i1611118 = ~i1611117;
                                        int i1611119 = (i1611117 | i1611118) & i1611118;
                                        int i1711110 = ~((i1411114 & i33) | (i1411114 ^ i33));
                                        int i1711111 = i1611119 ^ i1711110;
                                        int i1711112 = i1611119 & i1711110;
                                        int i1711113 = (i1711112 & i1711111) | (i1711111 ^ i1711112);
                                        int i1711114 = i1411116 & i21;
                                        int i1711115 = (i21 | i1411116) & (~i1711114);
                                        int i1711116 = (i1711115 & i1711114) | (i1711115 ^ i1711114);
                                        int i1711117 = (i1711116 & i57) | ((~i1711116) & iIntValue);
                                        int i1711118 = i1711116 & iIntValue;
                                        int i1711119 = ~((i1711118 & i1711117) | (i1711117 ^ i1711118));
                                        int i1816 = ((i1711119 & i1711113) | (i1711113 ^ i1711119)) * 497;
                                        int i1817 = (i1611116 | i1816) << 1;
                                        int i1818 = -(i1816 ^ i1611116);
                                        i33 = (i1817 & i1818) + (i1818 | i1817);
                                        i34 = i20;
                                        i25 = 1;
                                    }
                                }
                            } else if (b10 != 65533) {
                                if (b10 < 65536) {
                                    int i1411117 = f52451c;
                                    int i1411118 = (i1411117 ^ 71) + ((i1411117 & 71) << i25);
                                    f52450b = i1411118 % 128;
                                    int i1411119 = i1411118 % 2;
                                    i21 = i25;
                                } else {
                                    i21 = 2;
                                }
                                int i14111110 = i21 * (-496);
                                int i14111111 = -(-(i33 * (-496)));
                                int i14111112 = (i14111110 ^ i14111111) + ((i14111110 & i14111111) << i25);
                                int i14111113 = ~i21;
                                int i14111114 = (i14111113 | i21) & i14111113;
                                int i14111115 = ~i33;
                                int i15111110 = -(-((~((i14111114 ^ i14111115) | (i14111114 & i14111115))) * 497));
                                int i15111111 = ((i14111112 | i15111110) << i25) - (i14111112 ^ i15111110);
                                int i15111112 = (i14111115 | i33) & i14111115;
                                int i15111113 = i14111114 & i15111112;
                                int i15111114 = (~i15111113) & (i15111112 | i14111114);
                                int i15111115 = (i15111114 & i15111113) | (i15111114 ^ i15111113);
                                int i15111116 = (i15111115 & i57) | ((~i15111115) & iIntValue);
                                int i15111117 = i15111115 & iIntValue;
                                int i15111118 = (i15111117 & i15111116) | (i15111116 ^ i15111117);
                                int i15111119 = ~i15111118;
                                int i16111110 = (i15111118 | i15111119) & i15111119;
                                int i16111111 = (i14111115 & i58) | ((~i14111115) & i57);
                                int i16111112 = i14111115 & i57;
                                int i16111113 = (i16111111 ^ i16111112) | (i16111111 & i16111112);
                                int i16111114 = ~((i16111113 & i21) | (i16111113 ^ i21));
                                int i16111115 = -(-(((i16111110 & i16111114) | (i16111110 ^ i16111114)) * 497));
                                int i16111116 = (i15111111 & i16111115) + (i16111115 | i15111111);
                                int i16111117 = (i14111114 ^ i57) | (i14111114 & i57);
                                int i16111118 = ~i16111117;
                                int i16111119 = (i16111117 | i16111118) & i16111118;
                                int i17111110 = ~((i14111113 & i33) | (i14111113 ^ i33));
                                int i17111111 = i16111119 ^ i17111110;
                                int i17111112 = i16111119 & i17111110;
                                int i17111113 = (i17111112 & i17111111) | (i17111111 ^ i17111112);
                                int i17111114 = i14111115 & i21;
                                int i17111115 = (i21 | i14111115) & (~i17111114);
                                int i17111116 = (i17111115 & i17111114) | (i17111115 ^ i17111114);
                                int i17111117 = (i17111116 & i57) | ((~i17111116) & iIntValue);
                                int i17111118 = i17111116 & iIntValue;
                                int i17111119 = ~((i17111118 & i17111117) | (i17111117 ^ i17111118));
                                int i1819 = ((i17111119 & i17111113) | (i17111113 ^ i17111119)) * 497;
                                int i18110 = (i16111116 | i1819) << 1;
                                int i18111 = -(i1819 ^ i16111116);
                                i33 = (i18110 & i18111) + (i18111 | i18110);
                                i34 = i20;
                                i25 = 1;
                            }
                        } else if (b10 != 65533) {
                            if (b10 < 65536) {
                                int i14111116 = f52451c;
                                int i14111117 = (i14111116 ^ 71) + ((i14111116 & 71) << i25);
                                f52450b = i14111117 % 128;
                                int i14111118 = i14111117 % 2;
                                i21 = i25;
                            } else {
                                i21 = 2;
                            }
                            int i14111119 = i21 * (-496);
                            int i141111110 = -(-(i33 * (-496)));
                            int i141111111 = (i14111119 ^ i141111110) + ((i14111119 & i141111110) << i25);
                            int i141111112 = ~i21;
                            int i141111113 = (i141111112 | i21) & i141111112;
                            int i141111114 = ~i33;
                            int i151111110 = -(-((~((i141111113 ^ i141111114) | (i141111113 & i141111114))) * 497));
                            int i151111111 = ((i141111111 | i151111110) << i25) - (i141111111 ^ i151111110);
                            int i151111112 = (i141111114 | i33) & i141111114;
                            int i151111113 = i141111113 & i151111112;
                            int i151111114 = (~i151111113) & (i151111112 | i141111113);
                            int i151111115 = (i151111114 & i151111113) | (i151111114 ^ i151111113);
                            int i151111116 = (i151111115 & i57) | ((~i151111115) & iIntValue);
                            int i151111117 = i151111115 & iIntValue;
                            int i151111118 = (i151111117 & i151111116) | (i151111116 ^ i151111117);
                            int i151111119 = ~i151111118;
                            int i161111110 = (i151111118 | i151111119) & i151111119;
                            int i161111111 = (i141111114 & i58) | ((~i141111114) & i57);
                            int i161111112 = i141111114 & i57;
                            int i161111113 = (i161111111 ^ i161111112) | (i161111111 & i161111112);
                            int i161111114 = ~((i161111113 & i21) | (i161111113 ^ i21));
                            int i161111115 = -(-(((i161111110 & i161111114) | (i161111110 ^ i161111114)) * 497));
                            int i161111116 = (i151111111 & i161111115) + (i161111115 | i151111111);
                            int i161111117 = (i141111113 ^ i57) | (i141111113 & i57);
                            int i161111118 = ~i161111117;
                            int i161111119 = (i161111117 | i161111118) & i161111118;
                            int i171111110 = ~((i141111112 & i33) | (i141111112 ^ i33));
                            int i171111111 = i161111119 ^ i171111110;
                            int i171111112 = i161111119 & i171111110;
                            int i171111113 = (i171111112 & i171111111) | (i171111111 ^ i171111112);
                            int i171111114 = i141111114 & i21;
                            int i171111115 = (i21 | i141111114) & (~i171111114);
                            int i171111116 = (i171111115 & i171111114) | (i171111115 ^ i171111114);
                            int i171111117 = (i171111116 & i57) | ((~i171111116) & iIntValue);
                            int i171111118 = i171111116 & iIntValue;
                            int i171111119 = ~((i171111118 & i171111117) | (i171111117 ^ i171111118));
                            int i18112 = ((i171111119 & i171111113) | (i171111113 ^ i171111119)) * 497;
                            int i18113 = (i161111116 | i18112) << 1;
                            int i18114 = -(i18112 ^ i161111116);
                            i33 = (i18113 & i18114) + (i18114 | i18113);
                            i34 = i20;
                            i25 = 1;
                        }
                        return -1;
                    }
                }
                return -1;
                i30 = 2;
            } else {
                if ((b11 >> 5) == -2) {
                    int i195 = f52450b;
                    int i196 = (i195 & 87) + (i195 | 87);
                    int i197 = i196 % 128;
                    f52451c = i197;
                    int i198 = i196 % 2;
                    int i199 = -(-(i32 * (-885)));
                    int i200 = (1773 & i199) + (i199 | 1773);
                    int i201 = ~i32;
                    int i202 = (-2) & i201;
                    int i203 = ((-2) | i201) & (~i202);
                    int i204 = (i203 & i202) | (i203 ^ i202);
                    int i205 = ~i204;
                    int i206 = (i204 | i205) & i205;
                    int i207 = ~iIntValue;
                    int i208 = i201 & i207;
                    int i209 = ((~i201) & iIntValue) | i208;
                    int i210 = i201 & iIntValue;
                    int i211 = (i209 ^ i210) | (i209 & i210);
                    int i212 = ~i211;
                    int i213 = (i211 | i212) & i212;
                    int i214 = i206 & i213;
                    int i215 = iIntValue;
                    int i216 = (i213 | i206) & (~i214);
                    int i217 = (i216 & i214) | (i216 ^ i214);
                    int i218 = i207 & 1;
                    int i219 = (i207 ^ 1) | i218;
                    int i220 = i219 ^ i32;
                    int i221 = i219 & i32;
                    int i222 = ~((i220 ^ i221) | (i221 & i220));
                    int i223 = i217 & i222;
                    int i224 = (((i217 | i222) & (~i223)) | i223) * 886;
                    int i225 = (i200 & i224) + (i224 | i200);
                    int i226 = ((~i207) & i32) | i208;
                    int i227 = i207 & i32;
                    int i228 = ~((i226 & i227) | (i226 ^ i227));
                    int i229 = i228 & 1;
                    int i230 = (i225 - (~(-(~((((i228 | 1) & (~i229)) | i229) * (-1772)))))) - 2;
                    int i231 = (~i218) & (i207 | 1);
                    int i232 = (i231 & i218) | (i231 ^ i218);
                    int i233 = ~i232;
                    int i234 = -(-(((i232 | i233) & i233) * 886));
                    if (length <= ((i230 | i234) << 1) - (i234 ^ i230)) {
                        int i235 = i197 & 7;
                        int i236 = (i197 ^ 7) | i235;
                        int i237 = (i235 ^ i236) + ((i235 & i236) << 1);
                        int i238 = i237 % 128;
                        f52450b = i238;
                        if (i237 % 2 == 0 ? i34 != 64 : i34 != 27) {
                            return -1;
                        }
                        int i239 = (i238 & 13) + (i238 | 13);
                        f52451c = i239 % 128;
                        int i240 = i239 % 2;
                        return Integer.valueOf(i33);
                    }
                    int i241 = (i32 & (-2)) | (i201 & 1);
                    int i242 = (i32 & 1) << 1;
                    byte b12 = bArr[(i241 ^ i242) + ((i241 & i242) << 1)];
                    if ((b12 & Constants.CVR_B2b87_11_RFU) == 128) {
                        int i243 = ((((i195 ^ 85) | (i195 & 85)) << 1) - (~(-((i195 & (-86)) | ((~i195) & 85))))) - 1;
                        f52451c = i243 % 128;
                        if (i243 % 2 != 0) {
                            int i244 = (~b12) & Utf8.MASK_2BYTES;
                            int i245 = b12 & (-3969);
                            int i246 = (i245 & i244) | (i244 ^ i245);
                            int i247 = b11 << 6;
                            int i248 = (~i247) & i246;
                            int i249 = (~i246) & i247;
                            int i250 = (i249 & i248) | (i248 ^ i249);
                            if (i250 < 128) {
                                int i251 = i195 ^ 49;
                                int i252 = (i195 & 49) << 1;
                                int i253 = ((i251 | i252) << 1) - (i252 ^ i251);
                                f52451c = i253 % 128;
                                int i254 = i253 % 2;
                                if (i34 == 64) {
                                    return Integer.valueOf(i33);
                                }
                                return -1;
                            }
                            int i255 = i34 & 1;
                            int i256 = (i255 - (~(-(-((i34 ^ 1) | i255))))) - 1;
                            if (i34 == 64) {
                                int i257 = (i195 & 25) + (i195 | 25);
                                f52451c = i257 % 128;
                                int i258 = i257 % 2;
                                return Integer.valueOf(i33);
                            }
                            if (i250 == 10 || i250 == 13) {
                                if (i250 == 65533) {
                                    if (i250 < 65536) {
                                        int i259 = i195 + 84;
                                        int i260 = (i259 ^ (-1)) + (i259 << 1);
                                        f52451c = i260 % 128;
                                        int i261 = i260 % 2;
                                        int i262 = i195 & 123;
                                        int i263 = (((i195 ^ 123) | i262) << 1) - ((i195 | 123) & (~i262));
                                        f52451c = i263 % 128;
                                        int i264 = i263 % 2;
                                        i17 = 1;
                                    } else {
                                        i17 = 2;
                                    }
                                    int i265 = i33 ^ i17;
                                    int i266 = -(-((i17 & i33) << 1));
                                    i33 = ((i265 | i266) << 1) - (i266 ^ i265);
                                    Unit unit = Unit.INSTANCE;
                                    int i267 = -(-(i32 * (-68)));
                                    int i268 = (140 ^ i267) + ((i267 & 140) << 1);
                                    int i269 = ((-3) ^ i201) | ((-3) & i201);
                                    int i270 = i269 & i215;
                                    int i271 = (i269 | i215) & (~i270);
                                    int i272 = ~((i271 & i270) | (i271 ^ i270));
                                    int i273 = i32 & 2;
                                    int i274 = (~i273) & (i32 | 2);
                                    int i275 = (i273 & i274) | (i274 ^ i273);
                                    int i276 = i275 & i215;
                                    int i277 = (i275 | i215) & (~i276);
                                    int i278 = ~((i277 & i276) | (i277 ^ i276));
                                    int i279 = i272 & i278;
                                    int i280 = -(-((((i272 | i278) & (~i279)) | i279) * 69));
                                    int i281 = i268 & i280;
                                    int i282 = (i280 | i268) & (~i281);
                                    int i283 = i281 << 1;
                                    int i284 = ((i282 | i283) << 1) - (i282 ^ i283);
                                    int i285 = ((-3) ^ i32) | ((-3) & i32);
                                    int i286 = ~i285;
                                    int i287 = (i285 | i286) & i286;
                                    int i288 = (-3) & i215;
                                    int i289 = ((-3) | i215) & (~i288);
                                    int i290 = (i289 & i288) | (i289 ^ i288);
                                    int i291 = ~i290;
                                    int i292 = (i290 | i291) & i291;
                                    int i293 = i287 ^ i292;
                                    int i294 = i292 & i287;
                                    int i295 = (i294 & i293) | (i293 ^ i294);
                                    int i296 = i32 & i215;
                                    int i297 = ~(i296 | ((~i296) & (i32 | i215)));
                                    int i298 = ((~i297) & i295) | ((~i295) & i297);
                                    int i299 = i295 & i297;
                                    int i300 = ((i299 & i298) | (i298 ^ i299)) * (-69);
                                    int i301 = i284 ^ i300;
                                    int i302 = ((((i300 & i284) | i301) << 1) - (~(-i301))) - 1;
                                    int i303 = (~((i201 ^ 2) | (i201 & 2))) * 69;
                                    i32 = (i302 ^ i303) + ((i302 & i303) << 1);
                                    i34 = i256;
                                    iIntValue = i215;
                                }
                            } else if (i250 < 0 || i250 > 31) {
                                if (127 <= i250) {
                                    int i304 = (i195 & (-114)) | ((~i195) & 113);
                                    int i305 = (i195 & 113) << 1;
                                    int i306 = (i304 ^ i305) + ((i304 & i305) << 1);
                                    f52451c = i306 % 128;
                                    if (i306 % 2 == 0) {
                                        if (i250 <= 16512) {
                                        }
                                    } else if (i250 <= 159) {
                                    }
                                } else {
                                    int i307 = i195 + 101;
                                    f52451c = i307 % 128;
                                    int i308 = i307 % 2;
                                }
                                if (i250 == 65533) {
                                    if (i250 < 65536) {
                                        int i2510 = i195 + 84;
                                        int i2610 = (i2510 ^ (-1)) + (i2510 << 1);
                                        f52451c = i2610 % 128;
                                        int i2611 = i2610 % 2;
                                        int i2612 = i195 & 123;
                                        int i2613 = (((i195 ^ 123) | i2612) << 1) - ((i195 | 123) & (~i2612));
                                        f52451c = i2613 % 128;
                                        int i2614 = i2613 % 2;
                                        i17 = 1;
                                    } else {
                                        i17 = 2;
                                    }
                                    int i2615 = i33 ^ i17;
                                    int i2616 = -(-((i17 & i33) << 1));
                                    i33 = ((i2615 | i2616) << 1) - (i2616 ^ i2615);
                                    Unit unit2 = Unit.INSTANCE;
                                    int i2617 = -(-(i32 * (-68)));
                                    int i2618 = (140 ^ i2617) + ((i2617 & 140) << 1);
                                    int i2619 = ((-3) ^ i201) | ((-3) & i201);
                                    int i2710 = i2619 & i215;
                                    int i2711 = (i2619 | i215) & (~i2710);
                                    int i2712 = ~((i2711 & i2710) | (i2711 ^ i2710));
                                    int i2713 = i32 & 2;
                                    int i2714 = (~i2713) & (i32 | 2);
                                    int i2715 = (i2713 & i2714) | (i2714 ^ i2713);
                                    int i2716 = i2715 & i215;
                                    int i2717 = (i2715 | i215) & (~i2716);
                                    int i2718 = ~((i2717 & i2716) | (i2717 ^ i2716));
                                    int i2719 = i2712 & i2718;
                                    int i2810 = -(-((((i2712 | i2718) & (~i2719)) | i2719) * 69));
                                    int i2811 = i2618 & i2810;
                                    int i2812 = (i2810 | i2618) & (~i2811);
                                    int i2813 = i2811 << 1;
                                    int i2814 = ((i2812 | i2813) << 1) - (i2812 ^ i2813);
                                    int i2815 = ((-3) ^ i32) | ((-3) & i32);
                                    int i2816 = ~i2815;
                                    int i2817 = (i2815 | i2816) & i2816;
                                    int i2818 = (-3) & i215;
                                    int i2819 = ((-3) | i215) & (~i2818);
                                    int i2910 = (i2819 & i2818) | (i2819 ^ i2818);
                                    int i2911 = ~i2910;
                                    int i2912 = (i2910 | i2911) & i2911;
                                    int i2913 = i2817 ^ i2912;
                                    int i2914 = i2912 & i2817;
                                    int i2915 = (i2914 & i2913) | (i2913 ^ i2914);
                                    int i2916 = i32 & i215;
                                    int i2917 = ~(i2916 | ((~i2916) & (i32 | i215)));
                                    int i2918 = ((~i2917) & i2915) | ((~i2915) & i2917);
                                    int i2919 = i2915 & i2917;
                                    int i309 = ((i2919 & i2918) | (i2918 ^ i2919)) * (-69);
                                    int i3010 = i2814 ^ i309;
                                    int i3011 = ((((i309 & i2814) | i3010) << 1) - (~(-i3010))) - 1;
                                    int i3012 = (~((i201 ^ 2) | (i201 & 2))) * 69;
                                    i32 = (i3011 ^ i3012) + ((i3011 & i3012) << 1);
                                    i34 = i256;
                                    iIntValue = i215;
                                }
                            }
                            return -1;
                        }
                    }
                    if (i34 == 64) {
                        return Integer.valueOf(i33);
                    }
                    return -1;
                }
                int i310 = iIntValue;
                if ((b11 >> 4) == -2) {
                    int i311 = i32 + 2;
                    if (length <= i311) {
                        if (i34 == 64) {
                            return Integer.valueOf(i33);
                        }
                        return -1;
                    }
                    byte b13 = bArr[(i32 & 1) + (i32 | 1)];
                    if ((b13 & Constants.CVR_B2b87_11_RFU) != 128) {
                        if (i34 != 64) {
                            return -1;
                        }
                        int i312 = f52451c;
                        int i313 = (i312 & (-20)) | ((~i312) & 19);
                        int i314 = (i312 & 19) << 1;
                        int i315 = ((i313 | i314) << 1) - (i314 ^ i313);
                        f52450b = i315 % 128;
                        if (i315 % 2 == 0) {
                            return Integer.valueOf(i33);
                        }
                        int i316 = 80 / 0;
                        return Integer.valueOf(i33);
                    }
                    int i317 = f52450b;
                    int i318 = i317 & 31;
                    int i319 = -(-(i317 | 31));
                    int i320 = (i318 ^ i319) + ((i318 & i319) << 1);
                    int i321 = i320 % 128;
                    f52451c = i321;
                    int i322 = i320 % 2;
                    byte b14 = bArr[i311];
                    if ((b14 & Constants.CVR_B2b87_11_RFU) != 128) {
                        if (i34 != 64) {
                            return -1;
                        }
                        int i323 = ((((i317 ^ 67) | (i317 & 67)) << 1) - (~(-((i317 & (-68)) | ((~i317) & 67))))) - 1;
                        f52451c = i323 % 128;
                        if (i323 % 2 != 0) {
                            return Integer.valueOf(i33);
                        }
                        int i324 = 59 / 0;
                        return Integer.valueOf(i33);
                    }
                    int i325 = (-123008) & (~b14);
                    int i326 = b14 & 123007;
                    int i327 = (i326 & i325) | (i325 ^ i326);
                    int i328 = b13 << 6;
                    int i329 = i327 & i328;
                    int i330 = ((i327 ^ i328) | i329) & (~i329);
                    int i331 = b11 << 12;
                    int i332 = i330 & i331;
                    int i333 = ((i330 ^ i331) | i332) & (~i332);
                    if (i333 < 2048) {
                        int i334 = ((i317 | 43) << 1) - (i317 ^ 43);
                        f52451c = i334 % 128;
                        if (i334 % 2 != 0 ? i34 != 64 : i34 != 24) {
                            return -1;
                        }
                        return Integer.valueOf(i33);
                    }
                    if (55296 > i333 || i333 > 57343) {
                        i14 = 1;
                        i15 = 0;
                    } else {
                        i14 = 1;
                        i15 = 1;
                    }
                    if ((i15 ^ 1) != i14) {
                        if (i34 != 64) {
                            return -1;
                        }
                        int i335 = i317 & 123;
                        int i336 = (~i335) & (i317 | 123);
                        int i337 = -(-(i335 << i14));
                        int i338 = ((i336 | i337) << 1) - (i337 ^ i336);
                        f52451c = i338 % 128;
                        if (i338 % 2 != 0) {
                            return Integer.valueOf(i33);
                        }
                        throw null;
                    }
                    int i339 = -(-(i34 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                    int i340 = (((-519) | i339) << 1) - (i339 ^ (-519));
                    int i341 = ~i34;
                    int i342 = (-2) ^ i341;
                    int i343 = (-2) & i341;
                    int i344 = (i342 ^ i343) | (i342 & i343);
                    int i345 = ~i310;
                    int i346 = ((~i345) & i344) | ((~i344) & i345);
                    int i347 = i344 & i345;
                    int i348 = ~((i347 & i346) | (i346 ^ i347));
                    int i349 = (i34 & i345) | (i310 & i341);
                    int i350 = i34 & i310;
                    int i351 = ~((i349 ^ i350) | (i349 & i350));
                    int i352 = i348 ^ i351;
                    int i353 = i348 & i351;
                    int i354 = -(-(((i353 & i352) | (i352 ^ i353)) * 520));
                    int i355 = ((i340 ^ i354) - (~((i354 & i340) << 1))) - 1;
                    int i356 = (i345 | i310) & i345;
                    int i357 = i341 ^ i356;
                    int i358 = i341 & i356;
                    int i359 = ~((i357 ^ i358) | (i357 & i358));
                    int i360 = i310 & 1;
                    int i361 = (~i360) & (i310 | 1);
                    int i362 = ~((i361 ^ i360) | (i361 & i360));
                    byte[] bArr2 = bArr;
                    int i363 = length;
                    int i364 = ((~i362) & i359) | ((~i359) & i362);
                    int i365 = i362 & i359;
                    int i366 = -(-(((i364 & i365) | (i364 ^ i365)) * (-1040)));
                    int i367 = (i355 | i366) << 1;
                    int i368 = -((i366 & (~i355)) | ((~i366) & i355));
                    int i369 = (i367 ^ i368) + ((i368 & i367) << 1);
                    int i370 = ~(((~i356) & (-2)) | (i356 & 1) | ((-2) & i356));
                    int i371 = i341 & 1;
                    int i372 = i371 | ((i341 | 1) & (~i371));
                    int i373 = ~i372;
                    int i374 = (i372 | i373) & i373;
                    int i375 = (i370 & i374) | (i370 ^ i374);
                    int i376 = (i345 & 1) | (i310 & (-2));
                    int i377 = (i376 & i360) | (i376 ^ i360);
                    int i378 = ~i377;
                    int i379 = (i377 | i378) & i378;
                    int i380 = i375 ^ i379;
                    int i381 = i375 & i379;
                    int i382 = ((i381 & i380) | (i380 ^ i381)) * 520;
                    int i383 = ((((~i382) & i369) | ((~i369) & i382)) - (~((i382 & i369) << 1))) - 1;
                    if (i34 == 64) {
                        int i384 = (((i317 | 70) << 1) - (i317 ^ 70)) - 1;
                        f52451c = i384 % 128;
                        if (i384 % 2 != 0) {
                            return Integer.valueOf(i33);
                        }
                        throw null;
                    }
                    if (i333 != 10) {
                        int i385 = ((i321 | 65) << 1) - (i321 ^ 65);
                        f52450b = i385 % 128;
                        if (i385 % 2 == 0 ? i333 != 13 : i333 != 114) {
                            int i386 = i321 + 14;
                            int i387 = (i386 ^ (-1)) + (i386 << 1);
                            f52450b = i387 % 128;
                            int i388 = i387 % 2;
                            if (i333 >= 0) {
                                int i389 = ((i321 | 59) << 1) - (i321 ^ 59);
                                int i390 = i389 % 128;
                                f52450b = i390;
                                if (i389 % 2 == 0 ? i333 > 31 : i333 > 36) {
                                    int i391 = f52450b;
                                    int i392 = (i391 & 95) + (i391 | 95);
                                    f52451c = i392 % 128;
                                    int i393 = i392 % 2;
                                    if (127 <= i333 || i333 > 159) {
                                        z11 = true;
                                        z12 = false;
                                    }
                                } else {
                                    int i394 = ((i390 | 7) << 1) - (i390 ^ 7);
                                    f52451c = i394 % 128;
                                    int i395 = i394 % 2;
                                }
                                z11 = true;
                                z12 = true;
                            } else {
                                int i396 = f52450b;
                                int i397 = (i396 & 95) + (i396 | 95);
                                f52451c = i397 % 128;
                                int i398 = i397 % 2;
                                if (127 <= i333) {
                                }
                                z11 = true;
                                z12 = false;
                            }
                            if ((!z12) == z11) {
                                if (i333 != 65533) {
                                    if (i333 < 65536) {
                                        int i399 = f52450b + 13;
                                        f52451c = i399 % 128;
                                        int i400 = i399 % 2;
                                        i16 = 1;
                                    } else {
                                        i16 = 2;
                                    }
                                    int i401 = ((~i16) & i33) | ((~i33) & i16);
                                    int i402 = -(-((i16 & i33) << 1));
                                    i33 = (i401 & i402) + (i402 | i401);
                                    Unit unit3 = Unit.INSTANCE;
                                    int i403 = -(-(i32 * Constant.ERROR_CODE_408));
                                    int i404 = (((-2439) ^ i403) | ((-2439) & i403)) << 1;
                                    int i405 = -((i403 & 2438) | ((-2439) & (~i403)));
                                    int i406 = ((i404 | i405) << 1) - (i405 ^ i404);
                                    int i407 = ~i32;
                                    int i408 = (i407 ^ 3) | (i407 & 3);
                                    int i409 = ~i408;
                                    int i410 = (i408 | i409) & i409;
                                    int i411 = i310 & 3;
                                    int i412 = (~i411) & (i310 | 3);
                                    int i413 = ~((i411 & i412) | (i412 ^ i411));
                                    int i414 = i410 ^ i413;
                                    int i415 = i410 & i413;
                                    int i416 = ((i415 & i414) | (i414 ^ i415)) * (-814);
                                    int i417 = ((i406 | i416) << 1) - (i406 ^ i416);
                                    int i418 = i407 & i345;
                                    int i419 = (i407 | i345) & (~i418);
                                    int i420 = ~((i419 & i418) | (i419 ^ i418));
                                    int i421 = (-4) ^ i32;
                                    int i422 = (-4) & i32;
                                    int i423 = ~(i421 | i422);
                                    int i424 = ((~i423) & i420) | ((~i420) & i423);
                                    int i425 = i420 & i423;
                                    int i426 = (i425 & i424) | (i424 ^ i425);
                                    int i427 = -(-(((i426 & i413) | (i426 ^ i413)) * 407));
                                    int i428 = (i417 & i427) + (i427 | i417);
                                    int i429 = ~((i421 ^ i422) | (i422 & i421));
                                    int i430 = (-4) ^ i310;
                                    int i431 = (-4) & i310;
                                    int i432 = ~((i431 & i430) | (i430 ^ i431));
                                    int i433 = ((~i432) & i429) | ((~i429) & i432);
                                    int i434 = i429 & i432;
                                    int i435 = (i434 & i433) | (i433 ^ i434);
                                    int i436 = (i32 ^ i310) | (i32 & i310);
                                    int i437 = ~i436;
                                    int i438 = (i436 | i437) & i437;
                                    int i439 = -(-(((i435 & i438) | (i435 ^ i438)) * 407));
                                    i32 = ((i428 | i439) << 1) - (i439 ^ i428);
                                    i34 = i383;
                                    i25 = 1;
                                    iIntValue = i310;
                                    bArr = bArr2;
                                    length = i363;
                                }
                            }
                        } else if (i333 != 65533) {
                            if (i333 < 65536) {
                                int i3910 = f52450b + 13;
                                f52451c = i3910 % 128;
                                int i4010 = i3910 % 2;
                                i16 = 1;
                            } else {
                                i16 = 2;
                            }
                            int i4011 = ((~i16) & i33) | ((~i33) & i16);
                            int i4012 = -(-((i16 & i33) << 1));
                            i33 = (i4011 & i4012) + (i4012 | i4011);
                            Unit unit4 = Unit.INSTANCE;
                            int i4013 = -(-(i32 * Constant.ERROR_CODE_408));
                            int i4014 = (((-2439) ^ i4013) | ((-2439) & i4013)) << 1;
                            int i4015 = -((i4013 & 2438) | ((-2439) & (~i4013)));
                            int i4016 = ((i4014 | i4015) << 1) - (i4015 ^ i4014);
                            int i4017 = ~i32;
                            int i4018 = (i4017 ^ 3) | (i4017 & 3);
                            int i4019 = ~i4018;
                            int i4110 = (i4018 | i4019) & i4019;
                            int i4111 = i310 & 3;
                            int i4112 = (~i4111) & (i310 | 3);
                            int i4113 = ~((i4111 & i4112) | (i4112 ^ i4111));
                            int i4114 = i4110 ^ i4113;
                            int i4115 = i4110 & i4113;
                            int i4116 = ((i4115 & i4114) | (i4114 ^ i4115)) * (-814);
                            int i4117 = ((i4016 | i4116) << 1) - (i4016 ^ i4116);
                            int i4118 = i4017 & i345;
                            int i4119 = (i4017 | i345) & (~i4118);
                            int i4210 = ~((i4119 & i4118) | (i4119 ^ i4118));
                            int i4211 = (-4) ^ i32;
                            int i4212 = (-4) & i32;
                            int i4213 = ~(i4211 | i4212);
                            int i4214 = ((~i4213) & i4210) | ((~i4210) & i4213);
                            int i4215 = i4210 & i4213;
                            int i4216 = (i4215 & i4214) | (i4214 ^ i4215);
                            int i4217 = -(-(((i4216 & i4113) | (i4216 ^ i4113)) * 407));
                            int i4218 = (i4117 & i4217) + (i4217 | i4117);
                            int i4219 = ~((i4211 ^ i4212) | (i4212 & i4211));
                            int i4310 = (-4) ^ i310;
                            int i4311 = (-4) & i310;
                            int i4312 = ~((i4311 & i4310) | (i4310 ^ i4311));
                            int i4313 = ((~i4312) & i4219) | ((~i4219) & i4312);
                            int i4314 = i4219 & i4312;
                            int i4315 = (i4314 & i4313) | (i4313 ^ i4314);
                            int i4316 = (i32 ^ i310) | (i32 & i310);
                            int i4317 = ~i4316;
                            int i4318 = (i4316 | i4317) & i4317;
                            int i4319 = -(-(((i4315 & i4318) | (i4315 ^ i4318)) * 407));
                            i32 = ((i4218 | i4319) << 1) - (i4319 ^ i4218);
                            i34 = i383;
                            i25 = 1;
                            iIntValue = i310;
                            bArr = bArr2;
                            length = i363;
                        }
                    } else if (i333 != 65533) {
                        if (i333 < 65536) {
                            int i3911 = f52450b + 13;
                            f52451c = i3911 % 128;
                            int i40110 = i3911 % 2;
                            i16 = 1;
                        } else {
                            i16 = 2;
                        }
                        int i40111 = ((~i16) & i33) | ((~i33) & i16);
                        int i40112 = -(-((i16 & i33) << 1));
                        i33 = (i40111 & i40112) + (i40112 | i40111);
                        Unit unit5 = Unit.INSTANCE;
                        int i40113 = -(-(i32 * Constant.ERROR_CODE_408));
                        int i40114 = (((-2439) ^ i40113) | ((-2439) & i40113)) << 1;
                        int i40115 = -((i40113 & 2438) | ((-2439) & (~i40113)));
                        int i40116 = ((i40114 | i40115) << 1) - (i40115 ^ i40114);
                        int i40117 = ~i32;
                        int i40118 = (i40117 ^ 3) | (i40117 & 3);
                        int i40119 = ~i40118;
                        int i41110 = (i40118 | i40119) & i40119;
                        int i41111 = i310 & 3;
                        int i41112 = (~i41111) & (i310 | 3);
                        int i41113 = ~((i41111 & i41112) | (i41112 ^ i41111));
                        int i41114 = i41110 ^ i41113;
                        int i41115 = i41110 & i41113;
                        int i41116 = ((i41115 & i41114) | (i41114 ^ i41115)) * (-814);
                        int i41117 = ((i40116 | i41116) << 1) - (i40116 ^ i41116);
                        int i41118 = i40117 & i345;
                        int i41119 = (i40117 | i345) & (~i41118);
                        int i42110 = ~((i41119 & i41118) | (i41119 ^ i41118));
                        int i42111 = (-4) ^ i32;
                        int i42112 = (-4) & i32;
                        int i42113 = ~(i42111 | i42112);
                        int i42114 = ((~i42113) & i42110) | ((~i42110) & i42113);
                        int i42115 = i42110 & i42113;
                        int i42116 = (i42115 & i42114) | (i42114 ^ i42115);
                        int i42117 = -(-(((i42116 & i41113) | (i42116 ^ i41113)) * 407));
                        int i42118 = (i41117 & i42117) + (i42117 | i41117);
                        int i42119 = ~((i42111 ^ i42112) | (i42112 & i42111));
                        int i43110 = (-4) ^ i310;
                        int i43111 = (-4) & i310;
                        int i43112 = ~((i43111 & i43110) | (i43110 ^ i43111));
                        int i43113 = ((~i43112) & i42119) | ((~i42119) & i43112);
                        int i43114 = i42119 & i43112;
                        int i43115 = (i43114 & i43113) | (i43113 ^ i43114);
                        int i43116 = (i32 ^ i310) | (i32 & i310);
                        int i43117 = ~i43116;
                        int i43118 = (i43116 | i43117) & i43117;
                        int i43119 = -(-(((i43115 & i43118) | (i43115 ^ i43118)) * 407));
                        i32 = ((i42118 | i43119) << 1) - (i43119 ^ i42118);
                        i34 = i383;
                        i25 = 1;
                        iIntValue = i310;
                        bArr = bArr2;
                        length = i363;
                    }
                    return -1;
                }
                byte[] bArr3 = bArr;
                int i440 = length;
                if ((b11 >> 3) != -2) {
                    if (i34 == 64) {
                        return Integer.valueOf(i33);
                    }
                    return -1;
                }
                if (i440 <= i32 + 3) {
                    if (i34 == 64) {
                        return Integer.valueOf(i33);
                    }
                    return -1;
                }
                byte b15 = bArr3[((i32 | 1) << 1) - (i32 ^ 1)];
                if ((b15 & Constants.CVR_B2b87_11_RFU) != 128) {
                    int i441 = f52450b;
                    int i442 = (((i441 & (-116)) | ((~i441) & 115)) - (~((i441 & 115) << 1))) - 1;
                    f52451c = i442 % 128;
                    int i443 = i442 % 2;
                    if (i34 == 64) {
                        return Integer.valueOf(i33);
                    }
                    return -1;
                }
                int i444 = ~i310;
                int i445 = (-3) & i444;
                int i446 = ~(((~i445) & ((-3) | i444)) | i445);
                int i447 = ~i32;
                int i448 = (i447 & (-3)) | ((~i447) & 2);
                int i449 = i447 & 2;
                int i450 = ~((i449 & i448) | (i448 ^ i449));
                int i451 = (i446 & i450) | (i446 ^ i450);
                int i452 = (i444 & 2) | (i310 & (-3)) | (i310 & 2);
                int i453 = ~i452;
                int i454 = (i452 | i453) & i453;
                int i455 = i451 & i454;
                int i456 = (i451 | i454) & (~i455);
                int i457 = (((i456 & i455) | (i456 ^ i455)) * (-338)) + ((i32 * 339) - 674);
                int i458 = (-3) & i32;
                int i459 = (~i458) & ((-3) | i32);
                int i460 = (~((i458 & i459) | (i459 ^ i458))) * 338;
                int i461 = (i457 & i460) + (i457 | i460);
                int i462 = (-3) ^ i444;
                int i463 = ~((i462 & i445) | (i462 ^ i445));
                int i464 = i32 & 2;
                int i465 = i464 | ((~i464) & (i32 | 2));
                int i466 = ~((i465 & i310) | (i465 ^ i310));
                int i467 = -(-(((i463 & i466) | (i463 ^ i466)) * 338));
                int i468 = i461 & i467;
                byte b16 = bArr3[(i468 - (~((i467 ^ i461) | i468))) - 1];
                if ((b16 & Constants.CVR_B2b87_11_RFU) != 128) {
                    int i469 = f52451c;
                    int i470 = i469 & 83;
                    int i471 = (i470 - (~(-(-((i469 ^ 83) | i470))))) - 1;
                    f52450b = i471 % 128;
                    if (i471 % 2 == 0 ? i34 != 64 : i34 != 116) {
                        return -1;
                    }
                    int i472 = i469 & 89;
                    int i473 = (i472 - (~((i469 ^ 89) | i472))) - 1;
                    f52450b = i473 % 128;
                    int i474 = i473 % 2;
                    return Integer.valueOf(i33);
                }
                int i475 = i32 & 3;
                byte b17 = bArr3[((~i475) & (i32 | 3)) + (i475 << 1)];
                if ((b17 & Constants.CVR_B2b87_11_RFU) != 128) {
                    if (i34 != 64) {
                        return -1;
                    }
                    int i476 = f52450b;
                    int i477 = ((i476 & (-76)) | ((~i476) & 75)) + ((i476 & 75) << 1);
                    f52451c = i477 % 128;
                    if (i477 % 2 != 0) {
                        return Integer.valueOf(i33);
                    }
                    int i478 = 3 / 0;
                    return Integer.valueOf(i33);
                }
                int i479 = b17 & 3678080;
                int i480 = ((b17 ^ 3678080) | i479) & (~i479);
                int i481 = b16 << 6;
                int i482 = ((~i480) & i481) | ((~i481) & i480);
                int i483 = b15 << 12;
                int i484 = (i483 & (~i482)) | ((~i483) & i482);
                int i485 = b11 << MessageUtils.MESSAGE_18_DC2;
                int i486 = ((~i484) & i485) | ((~i485) & i484);
                if (i486 > 1114111) {
                    int i487 = f52451c;
                    int i488 = i487 & 115;
                    int i489 = ((i487 | 115) & (~i488)) + (i488 << 1);
                    f52450b = i489 % 128;
                    if (i489 % 2 == 0 ? i34 != 64 : i34 != 58) {
                        return -1;
                    }
                    return Integer.valueOf(i33);
                }
                if (55296 <= i486 && i486 <= 57343) {
                    int i490 = f52451c;
                    int i491 = i490 & 27;
                    int i492 = ((i490 ^ 27) | i491) << 1;
                    int i493 = -((~i491) & (i490 | 27));
                    int i494 = ((i492 | i493) << 1) - (i492 ^ i493);
                    f52450b = i494 % 128;
                    int i495 = i494 % 2;
                    int i496 = i490 & 119;
                    int i497 = (i490 | 119) & (~i496);
                    int i498 = -(-(i496 << 1));
                    int i499 = (i497 ^ i498) + ((i497 & i498) << 1);
                    int i500 = i499 % 128;
                    f52450b = i500;
                    int i501 = i499 % 2;
                    if (i34 != 64) {
                        return -1;
                    }
                    int i502 = (i500 ^ 39) + ((i500 & 39) << 1);
                    f52451c = i502 % 128;
                    if (i502 % 2 != 0) {
                        return Integer.valueOf(i33);
                    }
                    int i503 = 2 / 0;
                    return Integer.valueOf(i33);
                }
                if (i486 < 65536) {
                    if (i34 == 64) {
                        return Integer.valueOf(i33);
                    }
                    return -1;
                }
                int i504 = i34 & 1;
                int i505 = (i34 ^ 1) | i504;
                int i506 = ((i504 | i505) << 1) - (i504 ^ i505);
                if (i34 == 64) {
                    int i507 = f52451c;
                    int i508 = ((i507 | 101) << 1) - (i507 ^ 101);
                    f52450b = i508 % 128;
                    int i509 = i508 % 2;
                    return Integer.valueOf(i33);
                }
                if (i486 != 10 && i486 != 13) {
                    int i510 = f52450b;
                    int i511 = i510 & 51;
                    int i512 = (i510 ^ 51) | i511;
                    int i513 = (i511 ^ i512) + ((i512 & i511) << 1);
                    int i514 = i513 % 128;
                    f52451c = i514;
                    if (i513 % 2 == 0) {
                        throw null;
                    }
                    if (i486 < 0 || i486 > 31) {
                        if (127 <= i486) {
                            int i515 = (i514 ^ 123) + ((i514 & 123) << 1);
                            f52450b = i515 % 128;
                            if (i515 % 2 == 0 ? i486 > 159 : i486 > 1642) {
                            }
                            if (!z10) {
                                if (i486 == 65533) {
                                    if (i486 < 65536) {
                                        int i516 = (-1347722191) & i310;
                                        int i517 = ((-1347722191) | i310) & (~i516);
                                        int i518 = (i517 & i516) | (i517 ^ i516);
                                        int i519 = ~i518;
                                        int i520 = (i518 | i519) & i519;
                                        int i521 = i444 & 1448475598;
                                        int i522 = i521 | ((~i521) & (i444 | 1448475598));
                                        int i523 = ~((i522 & (-128148481)) | (i522 ^ (-128148481)));
                                        int i524 = (-1829923670) - (~(((i520 & i523) | (i520 ^ i523)) * (-318)));
                                        int i525 = 1448475598 ^ i310;
                                        int i526 = 1448475598 & i310;
                                        int i527 = ~((i525 & i526) | (i525 ^ i526));
                                        int i528 = (-1475870671) ^ i527;
                                        int i529 = i527 & (-1475870671);
                                        int i530 = -(-(((i529 & i528) | (i528 ^ i529)) * (-318)));
                                        int i531 = (i524 ^ i530) + ((i530 & i524) << 1);
                                        int i532 = ((-1448475599) & i310) | ((-1448475599) ^ i310);
                                        int i533 = ~i532;
                                        int i534 = (i532 | i533) & i533;
                                        int i535 = -(~(-(-(((i534 & 128148480) | (128148480 ^ i534)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                                        i11 = ((i531 ^ i535) + ((i535 & i531) << 1)) - 1;
                                        int i536 = ~i444;
                                        int i537 = ((-2016171111) & i536) | (2016171110 & i444);
                                        int i538 = (-2016171111) & i444;
                                        int i539 = -(~(-(-(((i538 & i537) | (i537 ^ i538)) * (-757)))));
                                        int i540 = ((1883621214 & i539) + (i539 | 1883621214)) - 1;
                                        int i541 = (~((-536875043) | i310)) * 1514;
                                        int i542 = i540 & i541;
                                        i12 = (((i540 ^ i541) | i542) << 1) - ((~i542) & (i541 | i540));
                                        int i543 = (i536 & (-617749299)) | (617749298 & i444);
                                        int i544 = (-617749299) & i444;
                                        int i545 = (i543 & i544) | (i543 ^ i544);
                                        int i546 = ~i545;
                                        int i547 = (i545 | i546) & i546;
                                        int i548 = (i547 & 80874256) | (80874256 ^ i547);
                                        int i549 = ~(((-1479296069) & i310) | ((-1479296069) ^ i310));
                                        i13 = -(~(-(-(((i548 & i549) | (i548 ^ i549)) * 757))));
                                        if (i11 <= ((i12 & i13) + (i13 | i12)) - 1) {
                                            i10 = 0;
                                        } else {
                                            i10 = 1;
                                        }
                                    } else {
                                        i10 = 2;
                                    }
                                    int i550 = ((i10 * (-1831)) - (~(-(-(i33 * 917))))) - 1;
                                    int i551 = ~i10;
                                    int i552 = ~i33;
                                    int i553 = i551 & i552;
                                    int i554 = -(-((~(((~i551) & i33) | i553 | (i551 & i33))) * 2748));
                                    int i555 = i550 & i554;
                                    int i556 = (i555 - (~(-(-((i550 ^ i554) | i555))))) - 1;
                                    int i557 = (i551 | i10) & i551;
                                    int i558 = -(-(((i557 & i552) | (i557 ^ i552)) * (-916)));
                                    int i559 = i556 & i558;
                                    int i560 = -(-((i558 ^ i556) | i559));
                                    int i561 = ((i559 | i560) << 1) - (i560 ^ i559);
                                    int i562 = ~((i551 ^ i552) | i553);
                                    int i563 = i10 ^ i33;
                                    int i564 = i10 & i33;
                                    int i565 = (i564 & i563) | (i563 ^ i564);
                                    int i566 = ~i565;
                                    int i567 = (i565 | i566) & i566;
                                    i33 = (-2) - ((-1) ^ (i561 - (~(-(-(((i567 & i562) | (i562 ^ i567)) * 916))))));
                                    Unit unit6 = Unit.INSTANCE;
                                    int i568 = i32 & 4;
                                    int i569 = -(-((i32 ^ 4) | i568));
                                    i32 = (i568 ^ i569) + ((i568 & i569) << 1);
                                    i34 = i506;
                                    length = i440;
                                    iIntValue = i310;
                                    bArr = bArr3;
                                }
                            }
                        }
                        z10 = false;
                        if (!z10) {
                            if (i486 == 65533) {
                                if (i486 < 65536) {
                                    int i5110 = (-1347722191) & i310;
                                    int i5111 = ((-1347722191) | i310) & (~i5110);
                                    int i5112 = (i5111 & i5110) | (i5111 ^ i5110);
                                    int i5113 = ~i5112;
                                    int i5210 = (i5112 | i5113) & i5113;
                                    int i5211 = i444 & 1448475598;
                                    int i5212 = i5211 | ((~i5211) & (i444 | 1448475598));
                                    int i5213 = ~((i5212 & (-128148481)) | (i5212 ^ (-128148481)));
                                    int i5214 = (-1829923670) - (~(((i5210 & i5213) | (i5210 ^ i5213)) * (-318)));
                                    int i5215 = 1448475598 ^ i310;
                                    int i5216 = 1448475598 & i310;
                                    int i5217 = ~((i5215 & i5216) | (i5215 ^ i5216));
                                    int i5218 = (-1475870671) ^ i5217;
                                    int i5219 = i5217 & (-1475870671);
                                    int i5310 = -(-(((i5219 & i5218) | (i5218 ^ i5219)) * (-318)));
                                    int i5311 = (i5214 ^ i5310) + ((i5310 & i5214) << 1);
                                    int i5312 = ((-1448475599) & i310) | ((-1448475599) ^ i310);
                                    int i5313 = ~i5312;
                                    int i5314 = (i5312 | i5313) & i5313;
                                    int i5315 = -(~(-(-(((i5314 & 128148480) | (128148480 ^ i5314)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                                    i11 = ((i5311 ^ i5315) + ((i5315 & i5311) << 1)) - 1;
                                    int i5316 = ~i444;
                                    int i5317 = ((-2016171111) & i5316) | (2016171110 & i444);
                                    int i5318 = (-2016171111) & i444;
                                    int i5319 = -(~(-(-(((i5318 & i5317) | (i5317 ^ i5318)) * (-757)))));
                                    int i5410 = ((1883621214 & i5319) + (i5319 | 1883621214)) - 1;
                                    int i5411 = (~((-536875043) | i310)) * 1514;
                                    int i5412 = i5410 & i5411;
                                    i12 = (((i5410 ^ i5411) | i5412) << 1) - ((~i5412) & (i5411 | i5410));
                                    int i5413 = (i5316 & (-617749299)) | (617749298 & i444);
                                    int i5414 = (-617749299) & i444;
                                    int i5415 = (i5413 & i5414) | (i5413 ^ i5414);
                                    int i5416 = ~i5415;
                                    int i5417 = (i5415 | i5416) & i5416;
                                    int i5418 = (i5417 & 80874256) | (80874256 ^ i5417);
                                    int i5419 = ~(((-1479296069) & i310) | ((-1479296069) ^ i310));
                                    i13 = -(~(-(-(((i5418 & i5419) | (i5418 ^ i5419)) * 757))));
                                    if (i11 <= ((i12 & i13) + (i13 | i12)) - 1) {
                                        i10 = 0;
                                    } else {
                                        i10 = 1;
                                    }
                                } else {
                                    i10 = 2;
                                }
                                int i5510 = ((i10 * (-1831)) - (~(-(-(i33 * 917))))) - 1;
                                int i5511 = ~i10;
                                int i5512 = ~i33;
                                int i5513 = i5511 & i5512;
                                int i5514 = -(-((~(((~i5511) & i33) | i5513 | (i5511 & i33))) * 2748));
                                int i5515 = i5510 & i5514;
                                int i5516 = (i5515 - (~(-(-((i5510 ^ i5514) | i5515))))) - 1;
                                int i5517 = (i5511 | i10) & i5511;
                                int i5518 = -(-(((i5517 & i5512) | (i5517 ^ i5512)) * (-916)));
                                int i5519 = i5516 & i5518;
                                int i5610 = -(-((i5518 ^ i5516) | i5519));
                                int i5611 = ((i5519 | i5610) << 1) - (i5610 ^ i5519);
                                int i5612 = ~((i5511 ^ i5512) | i5513);
                                int i5613 = i10 ^ i33;
                                int i5614 = i10 & i33;
                                int i5615 = (i5614 & i5613) | (i5613 ^ i5614);
                                int i5616 = ~i5615;
                                int i5617 = (i5615 | i5616) & i5616;
                                i33 = (-2) - ((-1) ^ (i5611 - (~(-(-(((i5617 & i5612) | (i5612 ^ i5617)) * 916))))));
                                Unit unit7 = Unit.INSTANCE;
                                int i5618 = i32 & 4;
                                int i5619 = -(-((i32 ^ 4) | i5618));
                                i32 = (i5618 ^ i5619) + ((i5618 & i5619) << 1);
                                i34 = i506;
                                length = i440;
                                iIntValue = i310;
                                bArr = bArr3;
                            }
                        }
                    } else {
                        int i570 = i514 & 61;
                        int i571 = ((i514 | 61) & (~i570)) + (i570 << 1);
                        f52450b = i571 % 128;
                        int i572 = i571 % 2;
                    }
                    z10 = true;
                    if (!z10) {
                        if (i486 == 65533) {
                            if (i486 < 65536) {
                                int i5114 = (-1347722191) & i310;
                                int i5115 = ((-1347722191) | i310) & (~i5114);
                                int i5116 = (i5115 & i5114) | (i5115 ^ i5114);
                                int i5117 = ~i5116;
                                int i52110 = (i5116 | i5117) & i5117;
                                int i52111 = i444 & 1448475598;
                                int i52112 = i52111 | ((~i52111) & (i444 | 1448475598));
                                int i52113 = ~((i52112 & (-128148481)) | (i52112 ^ (-128148481)));
                                int i52114 = (-1829923670) - (~(((i52110 & i52113) | (i52110 ^ i52113)) * (-318)));
                                int i52115 = 1448475598 ^ i310;
                                int i52116 = 1448475598 & i310;
                                int i52117 = ~((i52115 & i52116) | (i52115 ^ i52116));
                                int i52118 = (-1475870671) ^ i52117;
                                int i52119 = i52117 & (-1475870671);
                                int i53110 = -(-(((i52119 & i52118) | (i52118 ^ i52119)) * (-318)));
                                int i53111 = (i52114 ^ i53110) + ((i53110 & i52114) << 1);
                                int i53112 = ((-1448475599) & i310) | ((-1448475599) ^ i310);
                                int i53113 = ~i53112;
                                int i53114 = (i53112 | i53113) & i53113;
                                int i53115 = -(~(-(-(((i53114 & 128148480) | (128148480 ^ i53114)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                                i11 = ((i53111 ^ i53115) + ((i53115 & i53111) << 1)) - 1;
                                int i53116 = ~i444;
                                int i53117 = ((-2016171111) & i53116) | (2016171110 & i444);
                                int i53118 = (-2016171111) & i444;
                                int i53119 = -(~(-(-(((i53118 & i53117) | (i53117 ^ i53118)) * (-757)))));
                                int i54110 = ((1883621214 & i53119) + (i53119 | 1883621214)) - 1;
                                int i54111 = (~((-536875043) | i310)) * 1514;
                                int i54112 = i54110 & i54111;
                                i12 = (((i54110 ^ i54111) | i54112) << 1) - ((~i54112) & (i54111 | i54110));
                                int i54113 = (i53116 & (-617749299)) | (617749298 & i444);
                                int i54114 = (-617749299) & i444;
                                int i54115 = (i54113 & i54114) | (i54113 ^ i54114);
                                int i54116 = ~i54115;
                                int i54117 = (i54115 | i54116) & i54116;
                                int i54118 = (i54117 & 80874256) | (80874256 ^ i54117);
                                int i54119 = ~(((-1479296069) & i310) | ((-1479296069) ^ i310));
                                i13 = -(~(-(-(((i54118 & i54119) | (i54118 ^ i54119)) * 757))));
                                if (i11 <= ((i12 & i13) + (i13 | i12)) - 1) {
                                    i10 = 0;
                                } else {
                                    i10 = 1;
                                }
                            } else {
                                i10 = 2;
                            }
                            int i55110 = ((i10 * (-1831)) - (~(-(-(i33 * 917))))) - 1;
                            int i55111 = ~i10;
                            int i55112 = ~i33;
                            int i55113 = i55111 & i55112;
                            int i55114 = -(-((~(((~i55111) & i33) | i55113 | (i55111 & i33))) * 2748));
                            int i55115 = i55110 & i55114;
                            int i55116 = (i55115 - (~(-(-((i55110 ^ i55114) | i55115))))) - 1;
                            int i55117 = (i55111 | i10) & i55111;
                            int i55118 = -(-(((i55117 & i55112) | (i55117 ^ i55112)) * (-916)));
                            int i55119 = i55116 & i55118;
                            int i56110 = -(-((i55118 ^ i55116) | i55119));
                            int i56111 = ((i55119 | i56110) << 1) - (i56110 ^ i55119);
                            int i56112 = ~((i55111 ^ i55112) | i55113);
                            int i56113 = i10 ^ i33;
                            int i56114 = i10 & i33;
                            int i56115 = (i56114 & i56113) | (i56113 ^ i56114);
                            int i56116 = ~i56115;
                            int i56117 = (i56115 | i56116) & i56116;
                            i33 = (-2) - ((-1) ^ (i56111 - (~(-(-(((i56117 & i56112) | (i56112 ^ i56117)) * 916))))));
                            Unit unit8 = Unit.INSTANCE;
                            int i56118 = i32 & 4;
                            int i56119 = -(-((i32 ^ 4) | i56118));
                            i32 = (i56118 ^ i56119) + ((i56118 & i56119) << 1);
                            i34 = i506;
                            length = i440;
                            iIntValue = i310;
                            bArr = bArr3;
                        }
                    }
                } else if (i486 == 65533) {
                    if (i486 < 65536) {
                        int i5118 = (-1347722191) & i310;
                        int i5119 = ((-1347722191) | i310) & (~i5118);
                        int i51110 = (i5119 & i5118) | (i5119 ^ i5118);
                        int i51111 = ~i51110;
                        int i521110 = (i51110 | i51111) & i51111;
                        int i521111 = i444 & 1448475598;
                        int i521112 = i521111 | ((~i521111) & (i444 | 1448475598));
                        int i521113 = ~((i521112 & (-128148481)) | (i521112 ^ (-128148481)));
                        int i521114 = (-1829923670) - (~(((i521110 & i521113) | (i521110 ^ i521113)) * (-318)));
                        int i521115 = 1448475598 ^ i310;
                        int i521116 = 1448475598 & i310;
                        int i521117 = ~((i521115 & i521116) | (i521115 ^ i521116));
                        int i521118 = (-1475870671) ^ i521117;
                        int i521119 = i521117 & (-1475870671);
                        int i531110 = -(-(((i521119 & i521118) | (i521118 ^ i521119)) * (-318)));
                        int i531111 = (i521114 ^ i531110) + ((i531110 & i521114) << 1);
                        int i531112 = ((-1448475599) & i310) | ((-1448475599) ^ i310);
                        int i531113 = ~i531112;
                        int i531114 = (i531112 | i531113) & i531113;
                        int i531115 = -(~(-(-(((i531114 & 128148480) | (128148480 ^ i531114)) * TypedValues.AttributesType.TYPE_PIVOT_TARGET))));
                        i11 = ((i531111 ^ i531115) + ((i531115 & i531111) << 1)) - 1;
                        int i531116 = ~i444;
                        int i531117 = ((-2016171111) & i531116) | (2016171110 & i444);
                        int i531118 = (-2016171111) & i444;
                        int i531119 = -(~(-(-(((i531118 & i531117) | (i531117 ^ i531118)) * (-757)))));
                        int i541110 = ((1883621214 & i531119) + (i531119 | 1883621214)) - 1;
                        int i541111 = (~((-536875043) | i310)) * 1514;
                        int i541112 = i541110 & i541111;
                        i12 = (((i541110 ^ i541111) | i541112) << 1) - ((~i541112) & (i541111 | i541110));
                        int i541113 = (i531116 & (-617749299)) | (617749298 & i444);
                        int i541114 = (-617749299) & i444;
                        int i541115 = (i541113 & i541114) | (i541113 ^ i541114);
                        int i541116 = ~i541115;
                        int i541117 = (i541115 | i541116) & i541116;
                        int i541118 = (i541117 & 80874256) | (80874256 ^ i541117);
                        int i541119 = ~(((-1479296069) & i310) | ((-1479296069) ^ i310));
                        i13 = -(~(-(-(((i541118 & i541119) | (i541118 ^ i541119)) * 757))));
                        if (i11 <= ((i12 & i13) + (i13 | i12)) - 1) {
                            i10 = 0;
                        } else {
                            i10 = 1;
                        }
                    } else {
                        i10 = 2;
                    }
                    int i551110 = ((i10 * (-1831)) - (~(-(-(i33 * 917))))) - 1;
                    int i551111 = ~i10;
                    int i551112 = ~i33;
                    int i551113 = i551111 & i551112;
                    int i551114 = -(-((~(((~i551111) & i33) | i551113 | (i551111 & i33))) * 2748));
                    int i551115 = i551110 & i551114;
                    int i551116 = (i551115 - (~(-(-((i551110 ^ i551114) | i551115))))) - 1;
                    int i551117 = (i551111 | i10) & i551111;
                    int i551118 = -(-(((i551117 & i551112) | (i551117 ^ i551112)) * (-916)));
                    int i551119 = i551116 & i551118;
                    int i561110 = -(-((i551118 ^ i551116) | i551119));
                    int i561111 = ((i551119 | i561110) << 1) - (i561110 ^ i551119);
                    int i561112 = ~((i551111 ^ i551112) | i551113);
                    int i561113 = i10 ^ i33;
                    int i561114 = i10 & i33;
                    int i561115 = (i561114 & i561113) | (i561113 ^ i561114);
                    int i561116 = ~i561115;
                    int i561117 = (i561115 | i561116) & i561116;
                    i33 = (-2) - ((-1) ^ (i561111 - (~(-(-(((i561117 & i561112) | (i561112 ^ i561117)) * 916))))));
                    Unit unit9 = Unit.INSTANCE;
                    int i561118 = i32 & 4;
                    int i561119 = -(-((i32 ^ 4) | i561118));
                    i32 = (i561118 ^ i561119) + ((i561118 & i561119) << 1);
                    i34 = i506;
                    length = i440;
                    iIntValue = i310;
                    bArr = bArr3;
                }
                return -1;
                i30 = 2;
            }
            i25 = 1;
            i30 = 2;
        }
        return Integer.valueOf(i33);
    }

    public static final void setDividerPadding(@NotNull abw abwVar, @NotNull abx abxVar, int i10, int i11) throws NoSuchAlgorithmException, IOException {
        setY(new Object[]{abwVar, abxVar, Integer.valueOf(i10), Integer.valueOf(i11)}, -1883142877, 1883142882, i10);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws NoSuchAlgorithmException, IOException {
        int i13;
        Integer numValueOf;
        Object onFocusChangeListener;
        Object y7;
        int i14 = (i11 * 591) + (i10 * (-589));
        int i15 = ~i11;
        int i16 = ~i12;
        int i17 = (~(i15 | i10)) | (~(i15 | i16)) | (~(i16 | i10));
        int i18 = ~i10;
        int i19 = (((~(i18 | i16)) | (~(i11 | i16))) * 590) + (i17 * (-1180)) + (((~(i12 | i18 | i11)) | i17) * 590) + i14;
        if (i19 == 1) {
            int i20 = f52450b;
            int i21 = i20 & 91;
            int i22 = (i20 | 91) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 & i23) + (i22 | i23);
            int i25 = i24 % 128;
            f52451c = i25;
            if (i24 % 2 == 0) {
                throw null;
            }
            int i26 = (((i25 | 84) << 1) - (i25 ^ 84)) - 1;
            f52450b = i26 % 128;
            if (i26 % 2 != 0) {
                int i27 = 74 / 0;
            }
            return f52449a;
        }
        if (i19 != 2) {
            if (i19 == 3) {
                char cCharValue = ((Character) objArr[0]).charValue();
                int i28 = f52451c;
                int i29 = i28 & 77;
                int i30 = (((i28 | 77) & (~i29)) - (~(i29 << 1))) - 1;
                f52450b = i30 % 128;
                if (i30 % 2 != 0) {
                    ((Integer) setY(new Object[]{Character.valueOf(cCharValue)}, -297394422, 297394424, (int) System.currentTimeMillis())).intValue();
                    throw null;
                }
                int iIntValue = ((Integer) setY(new Object[]{Character.valueOf(cCharValue)}, -297394422, 297394424, (int) System.currentTimeMillis())).intValue();
                int i31 = f52450b;
                int i32 = ((i31 ^ 117) | (i31 & 117)) << 1;
                int i33 = -(((~i31) & 117) | (i31 & (-118)));
                int i34 = (i32 & i33) + (i33 | i32);
                f52451c = i34 % 128;
                int i35 = i34 % 2;
                return Integer.valueOf(iIntValue);
            }
            if (i19 == 4) {
                return a(objArr);
            }
            if (i19 != 5) {
                byte[] bArr = (byte[]) objArr[0];
                int i36 = f52450b;
                int i37 = i36 ^ 43;
                int i38 = ((i36 & 43) | i37) << 1;
                int i39 = -i37;
                int i40 = (i38 & i39) + (i38 | i39);
                f52451c = i40 % 128;
                Object[] objArr2 = new Object[2];
                if (i40 % 2 == 0) {
                    objArr2[0] = bArr;
                    objArr2[1] = 90;
                    y7 = setY(objArr2, -250572753, 250572757, 90);
                } else {
                    objArr2[0] = bArr;
                    objArr2[1] = 64;
                    y7 = setY(objArr2, -250572753, 250572757, 64);
                }
                return Integer.valueOf(((Integer) y7).intValue());
            }
            abw abwVar = (abw) objArr[0];
            abx abxVar = (abx) objArr[1];
            ((Number) objArr[2]).intValue();
            int iIntValue2 = ((Number) objArr[3]).intValue();
            int i41 = f52450b;
            int i42 = (i41 ^ 5) + ((5 & i41) << 1);
            f52451c = i42 % 128;
            if (i42 % 2 == 0) {
                Intrinsics.checkNotNullParameter(abwVar, "");
                Intrinsics.checkNotNullParameter(abxVar, "");
                onFocusChangeListener = abx.setOnFocusChangeListener(new Object[]{abxVar, (byte[]) abw.setX(new Object[]{abwVar}, 57927053, -57927042, System.identityHashCode(abwVar)), 1, Integer.valueOf(iIntValue2)}, 1169071493, -1169071470, 1);
            } else {
                Intrinsics.checkNotNullParameter(abwVar, "");
                Intrinsics.checkNotNullParameter(abxVar, "");
                onFocusChangeListener = abx.setOnFocusChangeListener(new Object[]{abxVar, (byte[]) abw.setX(new Object[]{abwVar}, 57927053, -57927042, System.identityHashCode(abwVar)), 0, Integer.valueOf(iIntValue2)}, 1169071493, -1169071470, 0);
            }
            return null;
        }
        char cCharValue2 = ((Character) objArr[0]).charValue();
        int i43 = f52451c;
        int i44 = i43 ^ 5;
        int i45 = ((((i43 & 5) | i44) << 1) - (~(-i44))) - 1;
        f52450b = i45 % 128;
        if (i45 % 2 == 0 ? '0' <= cCharValue2 : '>' <= cCharValue2) {
            if (cCharValue2 <= '9') {
                int i46 = i43 & 1;
                int i47 = (((~i46) & (i43 | 1)) - (~(i46 << 1))) - 1;
                f52450b = i47 % 128;
                int i48 = i47 % 2;
                int i49 = i43 ^ 11;
                int i50 = ((((i43 & 11) | i49) << 1) - (~(-i49))) - 1;
                int i51 = i50 % 128;
                f52450b = i51;
                int i52 = i50 % 2;
                int i53 = (((i51 | 104) << 1) - (i51 ^ 104)) - 1;
                f52451c = i53 % 128;
                int i54 = i53 % 2;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i55 = cCharValue2 * 628;
                int i56 = ((-30144) ^ i55) + ((i55 & (-30144)) << 1);
                int i57 = cCharValue2 & iCurrentTimeMillis;
                int i58 = (~i57) & (cCharValue2 | iCurrentTimeMillis);
                int i59 = ~iCurrentTimeMillis;
                int i60 = (i57 & i58) | (i58 ^ i57);
                int i61 = i60 & 47;
                int i62 = (i60 | 47) & (~i61);
                int i63 = ((i62 & i61) | (i62 ^ i61)) * (-627);
                int i64 = (i56 | i63) << 1;
                int i65 = -((i63 & (~i56)) | ((~i63) & i56));
                int i66 = (i64 ^ i65) + ((i65 & i64) << 1);
                int i67 = ~cCharValue2;
                int i68 = i67 & iCurrentTimeMillis;
                int i69 = (i67 | iCurrentTimeMillis) & (~i68);
                int i70 = ~((i69 & i68) | (i69 ^ i68));
                int i71 = -(-(((i70 & (-48)) | ((-48) ^ i70)) * (-627)));
                int i72 = i66 & i71;
                int i73 = ((i71 | i66) & (~i72)) + (i72 << 1);
                int i74 = (i59 | iCurrentTimeMillis) & i59;
                int i75 = (cCharValue2 & i74) | (i74 ^ cCharValue2);
                int i76 = ~i75;
                int i77 = (i75 | i76) & i76;
                int i78 = (-48) & iCurrentTimeMillis;
                int i79 = (iCurrentTimeMillis | (-48)) & (~i78);
                int i80 = (i79 & i78) | (i79 ^ i78);
                int i81 = ~i80;
                int i82 = (i80 | i81) & i81;
                int i83 = ((i77 & i82) | ((~i82) & i77) | ((~i77) & i82)) * 627;
                int i84 = ((i73 ^ i83) | (i73 & i83)) << 1;
                int i85 = -((i83 & (~i73)) | ((~i83) & i73));
                i13 = (i84 & i85) + (i85 | i84);
                int i86 = f52450b;
                int i87 = i86 & 93;
                int i88 = (i86 ^ 93) | i87;
                int i89 = ((i87 | i88) << 1) - (i88 ^ i87);
                f52451c = i89 % 128;
                if (i89 % 2 == 0) {
                    int i90 = 83 / 0;
                }
            } else {
                System.currentTimeMillis();
                System.currentTimeMillis();
            }
            numValueOf = Integer.valueOf(i13);
            return numValueOf;
        }
        int i91 = ((i43 ^ 19) | (i43 & 19)) << 1;
        int i92 = -(((~i43) & 19) | (i43 & (-20)));
        int i93 = ((i91 | i92) << 1) - (i92 ^ i91);
        f52450b = i93 % 128;
        int i94 = i93 % 2;
        if ('a' <= cCharValue2) {
            int i95 = f52450b;
            int i96 = (i95 ^ 77) + ((i95 & 77) << 1);
            int i97 = i96 % 128;
            f52451c = i97;
            int i98 = i96 % 2;
            if (cCharValue2 <= 'f') {
                int i99 = i97 & 87;
                int i100 = i99 + ((i97 ^ 87) | i99);
                f52450b = i100 % 128;
                int i101 = i100 % 2;
                int i102 = i97 + 107;
                int i103 = i102 % 128;
                f52450b = i103;
                int i104 = i102 % 2;
                int i105 = ((i103 ^ 49) | (i103 & 49)) << 1;
                int i106 = -(((~i103) & 49) | (i103 & (-50)));
                int i107 = (i105 & i106) + (i106 | i105);
                f52451c = i107 % 128;
                int i108 = i107 % 2;
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i109 = cCharValue2 * 407;
                int i110 = 39285 & i109;
                int i111 = i109 | 39285;
                int i112 = (i110 & i111) + (i111 | i110);
                int i113 = ~cCharValue2;
                int i114 = i113 & iCurrentTimeMillis2;
                int i115 = (~i114) & (i113 | iCurrentTimeMillis2);
                int i116 = ~iCurrentTimeMillis2;
                int i117 = (i114 & i115) | (i115 ^ i114);
                int i118 = ~i117;
                int i119 = (i117 | i118) & i118;
                int i120 = (i116 | iCurrentTimeMillis2) & i116;
                int i121 = i120 & (-97);
                int i122 = i121 | ((~i121) & (i120 | (-97)));
                int i123 = ~((i122 & cCharValue2) | (i122 ^ cCharValue2));
                int i124 = i119 & i123;
                int i125 = -(-((((i119 | i123) & (~i124)) | i124) * (-406)));
                int i126 = i112 & i125;
                int i127 = (i126 - (~((i112 ^ i125) | i126))) - 1;
                int i128 = i113 & i116;
                int i129 = (~i128) & (i113 | i116);
                int i130 = (i128 & i129) | (i129 ^ i128);
                int i131 = i130 & (-97);
                int i132 = (i130 | (-97)) & (~i131);
                int i133 = -(-((~((i132 & i131) | (i132 ^ i131))) * (-406)));
                int i134 = i127 & i133;
                int i135 = i134 + ((i133 ^ i127) | i134);
                int i136 = (iCurrentTimeMillis2 & 96) | (i116 & 96) | (iCurrentTimeMillis2 & (-97));
                int i137 = ~i136;
                int i138 = (i136 | i137) & i137;
                int i139 = (i113 & i120) | ((~i120) & cCharValue2);
                int i140 = cCharValue2 & i120;
                int i141 = ~((i140 & i139) | (i139 ^ i140));
                int i142 = i138 ^ i141;
                int i143 = i141 & i138;
                int i144 = -(~(-(-(((i143 & i142) | (i142 ^ i143)) * 406))));
                int i145 = ((i135 & i144) + (i144 | i135)) - 1;
                int i146 = ((i145 ^ 10) | (i145 & 10)) << 1;
                int i147 = -(((~i145) & 10) | (i145 & (-11)));
                int i148 = (i146 ^ i147) + ((i146 & i147) << 1);
                int i149 = f52450b;
                int i150 = (((i149 & (-102)) | ((~i149) & 101)) - (~(-(-((i149 & 101) << 1))))) - 1;
                f52451c = i150 % 128;
                if (i150 % 2 == 0) {
                    throw null;
                }
                numValueOf = Integer.valueOf(i148);
            } else {
                int i151 = i95 & 31;
                int i152 = -(-(i95 | 31));
                int i153 = ((i151 | i152) << 1) - (i152 ^ i151);
                f52451c = i153 % 128;
                int i154 = i153 % 2;
            }
            return numValueOf;
        }
        int i155 = f52451c;
        int i156 = i155 & 49;
        int i157 = (((i155 | 49) & (~i156)) - (~(i156 << 1))) - 1;
        f52450b = i157 % 128;
        int i158 = i157 % 2;
        if ('A' <= cCharValue2) {
            int i159 = f52451c;
            int i160 = i159 ^ 79;
            int i161 = ((((i159 & 79) | i160) << 1) - (~(-i160))) - 1;
            int i162 = i161 % 128;
            f52450b = i162;
            int i163 = i161 % 2;
            if (cCharValue2 <= 'F') {
                int i164 = (i159 ^ 54) + ((i159 & 54) << 1);
                int i165 = (i164 ^ (-1)) + (i164 << 1);
                f52450b = i165 % 128;
                int i166 = i165 % 2;
                int i167 = i159 & 15;
                int i168 = (i159 | 15) & (~i167);
                int i169 = -(-(i167 << 1));
                int i170 = (i168 & i169) + (i168 | i169);
                f52450b = i170 % 128;
                int i171 = i170 % 2;
                int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                int i172 = -(-(cCharValue2 * 65265));
                int i173 = (-17745) & i172;
                int i174 = (i172 ^ (-17745)) | i173;
                int i175 = (i173 ^ i174) + ((i174 & i173) << 1);
                int i176 = ~cCharValue2;
                int i177 = (i176 & 64) | (64 ^ i176);
                int i178 = ~iCurrentTimeMillis3;
                int i179 = i178 & (i178 | iCurrentTimeMillis3);
                int i180 = (i177 & i179) | (i177 ^ i179);
                int i181 = ~i180;
                int i182 = (i180 | i181) & i181;
                int i183 = ((-65) ^ cCharValue2) | ((-65) & cCharValue2);
                int i184 = i183 ^ iCurrentTimeMillis3;
                int i185 = i183 & iCurrentTimeMillis3;
                int i186 = ~((i185 & i184) | (i184 ^ i185));
                int i187 = -(~(((i182 & i186) | (i182 ^ i186)) * (-272)));
                int i188 = ((i175 ^ i187) + ((i187 & i175) << 1)) - 1;
                int i189 = '@' ^ cCharValue2;
                int i190 = '@' & cCharValue2;
                int i191 = (i189 & i190) | (i189 ^ i190);
                int i192 = ~i191;
                int i193 = (i191 | i192) & i192;
                int i194 = ~((64 & iCurrentTimeMillis3) | (64 ^ iCurrentTimeMillis3));
                int i195 = -(-(((i193 & i194) | (i193 ^ i194)) * (-272)));
                int i196 = i188 & i195;
                int i197 = ((i195 | i188) & (~i196)) + (i196 << 1);
                int i198 = (-65) & iCurrentTimeMillis3;
                int i199 = (iCurrentTimeMillis3 | (-65)) & (~i198);
                int i200 = ~((i199 & i198) | (i199 ^ i198));
                int i201 = cCharValue2 & i200;
                int i202 = (cCharValue2 | i200) & (~i201);
                int i203 = (i197 - (~(-(~(-(-(((i202 & i201) | (i202 ^ i201)) * 272))))))) - 1;
                int i204 = (i203 ^ (-1)) + (i203 << 1);
                int i205 = i204 & 10;
                int i206 = (i204 | 10) & (~i205);
                int i207 = -(-(i205 << 1));
                i13 = (i206 ^ i207) + ((i206 & i207) << 1);
                int i208 = f52451c;
                int i209 = (((i208 | 112) << 1) - (i208 ^ 112)) - 1;
                f52450b = i209 % 128;
                if (i209 % 2 != 0) {
                    int i210 = 62 / 0;
                }
                numValueOf = Integer.valueOf(i13);
                return numValueOf;
            }
            int i211 = (((i162 | 20) << 1) - (i162 ^ 20)) - 1;
            f52451c = i211 % 128;
            int i212 = i211 % 2;
        } else {
            int i213 = f52451c;
            int i214 = (i213 ^ 47) + ((i213 & 47) << 1);
            f52450b = i214 % 128;
            int i215 = i214 % 2;
        }
        throw new IllegalArgumentException(Intrinsics.stringPlus("Unexpected hex digit: ", Character.valueOf(cCharValue2)));
    }

    @NotNull
    public static final char[] setCompoundDrawableTintBlendMode() {
        return (char[]) setY(new Object[0], 772600238, -772600237, (int) System.currentTimeMillis());
    }
}
