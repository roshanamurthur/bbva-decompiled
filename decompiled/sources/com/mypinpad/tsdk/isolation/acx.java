package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class acx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f52432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f52433b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f52434c = 1;

    static {
        abw.Companion companion = abw.INSTANCE;
        abw abwVar = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        f52432a = (byte[]) abw.setX(new Object[]{abwVar}, 57927053, -57927042, System.identityHashCode(abwVar));
        abw abwVar2 = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"}, 1688839712, -1688839706, (int) System.currentTimeMillis());
        int i10 = f52434c;
        int i11 = (i10 ^ 37) + ((i10 & 37) << 1);
        f52433b = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 80 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x045a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0594  */
    /* JADX WARN: Code duplicated, block: B:112:0x059f A[LOOP:1: B:26:0x00c5->B:112:0x059f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:137:0x00b4 A[EDGE_INSN: B:137:0x00b4->B:23:0x00b4 BREAK  A[LOOP:0: B:3:0x0037->B:22:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00b4 A[EDGE_INSN: B:138:0x00b4->B:23:0x00b4 BREAK  A[LOOP:0: B:3:0x0037->B:22:0x00b1], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:143:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:144:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:146:0x03a4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0599 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x007f  */
    /* JADX WARN: Code duplicated, block: B:16:0x0095  */
    /* JADX WARN: Code duplicated, block: B:18:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:21:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0198  */
    /* JADX WARN: Code duplicated, block: B:49:0x0288  */
    /* JADX WARN: Code duplicated, block: B:51:0x0291  */
    /* JADX WARN: Code duplicated, block: B:53:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:55:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:56:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:59:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:61:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:62:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:63:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0308  */
    /* JADX WARN: Code duplicated, block: B:68:0x031e  */
    /* JADX WARN: Code duplicated, block: B:69:0x032a  */
    /* JADX WARN: Code duplicated, block: B:71:0x032e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0359  */
    /* JADX WARN: Code duplicated, block: B:82:0x0363  */
    /* JADX WARN: Code duplicated, block: B:84:0x0367  */
    /* JADX WARN: Code duplicated, block: B:85:0x036a  */
    /* JADX WARN: Code duplicated, block: B:86:0x036c  */
    /* JADX WARN: Code duplicated, block: B:87:0x036e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0371  */
    /* JADX WARN: Code duplicated, block: B:92:0x0383  */
    /* JADX WARN: Code duplicated, block: B:94:0x0387  */
    /* JADX WARN: Code duplicated, block: B:95:0x038a  */
    public static /* synthetic */ Object a(Object[] objArr) {
        char c10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        boolean z11;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31 = 0;
        String str2 = (String) objArr[0];
        int i32 = f52434c;
        int i33 = i32 & 77;
        int i34 = (i32 ^ 77) | i33;
        int i35 = (i33 & i34) + (i34 | i33);
        f52433b = i35 % 128;
        int i36 = 2;
        int i37 = i35 % 2;
        Intrinsics.checkNotNullParameter(str2, "");
        int length = str2.length();
        int i38 = f52434c;
        int i39 = (i38 & (-90)) | ((~i38) & 89);
        int i40 = 1;
        int i41 = -(-((i38 & 89) << 1));
        int i42 = (i39 ^ i41) + ((i41 & i39) << 1);
        f52433b = i42 % 128;
        int i43 = i42 % 2;
        while (true) {
            c10 = '\n';
            i10 = -1;
            if (length <= 0) {
                break;
            }
            int i44 = f52434c + 107;
            f52433b = i44 % 128;
            int i45 = i44 % 2;
            int i46 = -(-((length ^ (-1)) | length));
            char cCharAt = str2.charAt((length & i46) + (i46 | length));
            if (cCharAt != '=') {
                int i47 = f52434c;
                int i48 = (i47 & 37) + (i47 | 37);
                int i49 = i48 % 128;
                f52433b = i49;
                int i50 = i48 % 2;
                if (cCharAt != '\n') {
                    int i51 = ((i49 ^ 76) + ((i49 & 76) << 1)) - 1;
                    f52434c = i51 % 128;
                    if (i51 % 2 == 0) {
                        if (cCharAt != ';') {
                            int i52 = (i49 & (-52)) | ((~i49) & 51);
                            int i53 = -(-((i49 & 51) << 1));
                            int i54 = (i52 & i53) + (i53 | i52);
                            i29 = i54 % 128;
                            f52434c = i29;
                            int i55 = i54 % 2;
                            if (cCharAt != ' ') {
                                int i56 = (i29 & (-86)) | ((~i29) & 85);
                                int i57 = (i29 & 85) << 1;
                                i30 = (i56 ^ i57) + ((i57 & i56) << 1);
                                f52433b = i30 % 128;
                                if (i30 % 2 != 0) {
                                    if (cCharAt == '\t') {
                                        break;
                                    }
                                } else if (cCharAt == 'm') {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (cCharAt != '\r') {
                        int i58 = (i49 & (-52)) | ((~i49) & 51);
                        int i59 = -(-((i49 & 51) << 1));
                        int i510 = (i58 & i59) + (i59 | i58);
                        i29 = i510 % 128;
                        f52434c = i29;
                        int i511 = i510 % 2;
                        if (cCharAt != ' ') {
                            int i512 = (i29 & (-86)) | ((~i29) & 85);
                            int i513 = (i29 & 85) << 1;
                            i30 = (i512 ^ i513) + ((i513 & i512) << 1);
                            f52433b = i30 % 128;
                            if (i30 % 2 != 0) {
                                if (cCharAt == '\t') {
                                    break;
                                    break;
                                }
                            } else if (cCharAt == 'm') {
                                break;
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            length--;
        }
        int i60 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i60];
        if (length > 0) {
            int i61 = 0;
            int i62 = 0;
            int i63 = 0;
            while (true) {
                int i64 = i31 ^ 1;
                int i65 = ((i64 | (i31 & 1)) << 1) - i64;
                char cCharAt2 = str2.charAt(i31);
                if ('A' <= cCharAt2) {
                    int i66 = f52434c;
                    int i67 = ((i66 | 23) << 1) - (i66 ^ 23);
                    f52433b = i67 % 128;
                    int i68 = i67 % i36;
                    if (cCharAt2 <= 'Z') {
                        int i69 = i66 ^ 31;
                        int i70 = -(-((i66 & 31) << i40));
                        int i71 = ((i69 | i70) << 1) - (i69 ^ i70);
                        f52433b = i71 % 128;
                        int i72 = i71 % i36;
                        int i73 = i66 & 53;
                        int i74 = ((i66 ^ 53) | i73) << i40;
                        int i75 = -((~i73) & (i66 | 53));
                        int i76 = (i74 ^ i75) + ((i74 & i75) << i40);
                        f52433b = i76 % 128;
                        if (i76 % i36 != 0) {
                            i16 = cCharAt2 >>> '\'';
                        } else {
                            int i77 = cCharAt2 ^ (-65);
                            int i78 = ((cCharAt2 & (-65)) | i77) << i40;
                            int i79 = -i77;
                            i16 = ((i78 | i79) << i40) - (i78 ^ i79);
                        }
                        str = str2;
                        i11 = i60;
                    } else {
                        int i80 = (i66 & 6) + (i66 | 6);
                        int i81 = (i80 ^ (-1)) + (i80 << i40);
                        f52433b = i81 % 128;
                        int i82 = i81 % i36;
                    }
                    i28 = i16 | (i63 << 6);
                    int iCurrentTimeMillis = (int) System.currentTimeMillis();
                    int i83 = (i61 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 520;
                    int i84 = (-2) & i61;
                    int i85 = (~i84) & ((-2) | i61);
                    int i86 = ~i61;
                    int i87 = (i85 ^ i84) | (i85 & i84);
                    int i88 = ~iCurrentTimeMillis;
                    int i89 = (~((iCurrentTimeMillis & i87) | (i87 ^ iCurrentTimeMillis))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                    int i90 = i83 & i89;
                    int i91 = (i90 - (~(-(-((i89 ^ i83) | i90))))) - 1;
                    int i92 = (~(i86 | 1)) * (-1042);
                    int i93 = (((~i92) & i91) | ((~i91) & i92)) + ((i92 & i91) << 1);
                    int i94 = ~i61;
                    int i95 = i94 & 1;
                    int i96 = (~i95) & (i94 | 1);
                    int i97 = ~((i96 & i95) | (i96 ^ i95));
                    int i98 = (i88 & (-2)) | ((-2) ^ i88);
                    int i99 = ~((i98 & i61) | (i98 ^ i61));
                    int i100 = ((~i99) & i97) | ((~i97) & i99);
                    int i101 = i97 & i99;
                    int i102 = ((i101 & i100) | (i100 ^ i101)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                    int i103 = i93 ^ i102;
                    i61 = (((i102 & i93) | i103) << 1) - i103;
                    if (i61 % 4 == 0) {
                        int i104 = f52434c;
                        int i105 = ((i104 & 70) + (i104 | 70)) - 1;
                        f52433b = i105 % 128;
                        int i106 = i105 % 2;
                        int i107 = i62;
                        int i108 = (((i107 ^ 1) | (i107 & 1)) << 1) - ((i107 & (-2)) | ((~i107) & 1));
                        bArr[i107] = (byte) (i28 >> 16);
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i109 = (-1337) - (~(-(~(i108 * (-667)))));
                        int i110 = ~i108;
                        int i111 = iCurrentTimeMillis2 & 1;
                        int i112 = ~(((~iCurrentTimeMillis2) & 1) | (iCurrentTimeMillis2 & (-2)) | i111);
                        int i113 = i110 ^ i112;
                        int i114 = i112 & i110;
                        int i115 = (i109 - (~(-(-(((i113 ^ i114) | (i113 & i114)) * (-668)))))) - 1;
                        int i116 = ~i108;
                        int i117 = i116 ^ iCurrentTimeMillis2;
                        int i118 = i116 & iCurrentTimeMillis2;
                        int i119 = ~((i117 ^ i118) | (i117 & i118));
                        int i120 = ((i119 & 1) | ((~i119) & 1) | (i119 & (-2))) * 1336;
                        int i121 = ((i115 ^ i120) | (i115 & i120)) << 1;
                        int i122 = -(((~i115) & i120) | ((~i120) & i115));
                        int i123 = (i121 & i122) + (i122 | i121);
                        int i124 = (iCurrentTimeMillis2 | 1) & (~i111);
                        int i125 = (i124 & i111) | (i124 ^ i111);
                        int i126 = (i116 | i108) & i110;
                        int i127 = -(-(((i125 & i126) | (i125 ^ i126)) * 668));
                        int i128 = i123 & i127;
                        int i129 = (i127 | i123) & (~i128);
                        int i130 = -(-(i128 << 1));
                        int i131 = (i129 & i130) + (i129 | i130);
                        bArr[i108] = (byte) (i28 >> 8);
                        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                        int i132 = -(-(i131 * (-344)));
                        int i133 = ((-344) & i132) + (i132 | (-344));
                        int i134 = ~i131;
                        int i135 = ((~i134) & (-2)) | (i134 & 1) | ((-2) & i134);
                        int i136 = (i135 | (~i135)) & (~i135);
                        int i137 = (-2) & iCurrentTimeMillis3;
                        int i138 = (~i137) & ((-2) | iCurrentTimeMillis3);
                        int i139 = ~iCurrentTimeMillis3;
                        int i140 = ~((i138 & i137) | (i138 ^ i137));
                        int i141 = ((~i140) & i136) | ((~i136) & i140);
                        int i142 = i136 & i140;
                        int i143 = i133 - (~(((i142 & i141) | (i141 ^ i142)) * 345));
                        int i144 = (i143 ^ (-1)) + (i143 << 1);
                        int i145 = (~iCurrentTimeMillis3) & (i139 | iCurrentTimeMillis3);
                        int i146 = ~((i145 & (-2)) | ((-2) ^ i145));
                        int i147 = (~i131) & (i134 | i131);
                        int i148 = ~((i147 & 1) | (i147 & (-2)) | ((~i147) & 1));
                        int i149 = i146 & i148;
                        int i150 = (i146 | i148) & (~i149);
                        int i151 = -(-(((i150 & i149) | (i150 ^ i149)) * 345));
                        int i152 = (i144 ^ i151) + ((i144 & i151) << 1);
                        int i153 = ((~i134) & (-2)) | (i134 & 1);
                        int i154 = i134 & (-2);
                        int i155 = (i154 & i153) | (i153 ^ i154);
                        int i156 = i155 & iCurrentTimeMillis3;
                        int i157 = (iCurrentTimeMillis3 | i155) & (~i156);
                        int i158 = (~((i157 & i156) | (i157 ^ i156))) * 345;
                        int i159 = i152 & i158;
                        int i160 = -(-((i158 ^ i152) | i159));
                        i62 = ((i159 | i160) << 1) - (i160 ^ i159);
                        bArr[i131] = (byte) i28;
                        int i161 = f52433b;
                        int i162 = ((-1) << 1) - ((((i161 | 16) << 1) - (i161 ^ 16)) ^ (-1));
                        f52434c = i162 % 128;
                        int i163 = i162 % 2;
                    }
                    i63 = i28;
                    if (i65 >= length) {
                        i12 = i61;
                        i13 = i62;
                        i14 = i63;
                        break;
                    }
                    i31 = i65;
                    i60 = i11;
                    str2 = str;
                    i36 = 2;
                    i40 = 1;
                    c10 = '\n';
                    i10 = -1;
                } else {
                    int i164 = ((-1) << i40) - ((f52433b + 6) ^ i10);
                    f52434c = i164 % 128;
                    int i165 = i164 % i36;
                }
                if ('a' <= cCharAt2) {
                    int i166 = f52433b;
                    int i167 = (((i166 | 116) << i40) - (i166 ^ 116)) - i40;
                    int i168 = i167 % 128;
                    f52434c = i168;
                    int i169 = i167 % i36;
                    if (cCharAt2 <= 'z') {
                        int i170 = i168 + 5;
                        f52433b = i170 % 128;
                        int i171 = i170 % i36;
                        int i172 = ((i168 & 116) + (i168 | 116)) - i40;
                        f52433b = i172 % 128;
                        int i173 = i172 % i36;
                        i15 = i40;
                    } else {
                        int i174 = (((i168 | 84) << i40) - (i168 ^ 84)) - i40;
                        f52433b = i174 % 128;
                        int i175 = i174 % i36;
                    }
                    if (i15 != 0) {
                        int i176 = f52433b;
                        int i177 = i176 & 17;
                        int i178 = (i176 ^ 17) | i177;
                        int i179 = (i177 & i178) + (i178 | i177);
                        f52434c = i179 % 128;
                        int i180 = i179 % i36;
                        i11 = i60;
                        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                        int i181 = -(-(cCharAt2 * 64772));
                        int i182 = (108559 & (~i181)) | (i181 & (-108560));
                        int i183 = (108559 & i181) << i40;
                        int i184 = (i182 & i183) + (i183 | i182);
                        int i185 = ~cCharAt2;
                        int i186 = ~cCharAt2;
                        int i187 = i186 | cCharAt2;
                        int i188 = i185 & i187;
                        int i189 = (70 & (~i188)) | (i188 & (-71));
                        int i190 = 70 & i188;
                        int i191 = (i189 ^ i190) | (i190 & i189);
                        int i192 = ~iCurrentTimeMillis4;
                        int i193 = ~iCurrentTimeMillis4;
                        int i194 = i193 | iCurrentTimeMillis4;
                        int i195 = i192 & i194;
                        str = str2;
                        int i196 = ((~i191) & i195) | ((~i195) & i191);
                        int i197 = i195 & i191;
                        int i198 = ~((i196 & i197) | (i196 ^ i197));
                        int i199 = ('F' ^ cCharAt2) | ('F' & cCharAt2);
                        int i200 = i199 ^ iCurrentTimeMillis4;
                        int i201 = i199 & iCurrentTimeMillis4;
                        int i202 = ~((i201 & i200) | (i200 ^ i201));
                        int i203 = i198 ^ i202;
                        int i204 = i198 & i202;
                        int i205 = (i204 & i203) | (i203 ^ i204);
                        int i206 = (~cCharAt2) & i187;
                        int i207 = (i206 & 70) | ((~i206) & (-71));
                        int i208 = i206 & (-71);
                        int i209 = (i208 & i207) | (i207 ^ i208);
                        int i210 = (i209 & i193) | ((~i209) & iCurrentTimeMillis4);
                        int i211 = i209 & iCurrentTimeMillis4;
                        int i212 = ~((i211 & i210) | (i210 ^ i211));
                        int i213 = i205 & i212;
                        int i214 = (i212 | i205) & (~i213);
                        int i215 = -(-(((i214 & i213) | (i214 ^ i213)) * 765));
                        int i216 = i184 & i215;
                        int i217 = i216 + ((i184 ^ i215) | i216);
                        int i218 = (70 ^ i186) | (70 & i186);
                        int i219 = (i218 | (~i218)) & (~i218);
                        int i220 = (70 & (~i193)) | (i193 & (-71));
                        int i221 = 70 & i193;
                        int i222 = ~((i220 & i221) | (i220 ^ i221));
                        int i223 = ((i219 & i222) | (i219 ^ i222)) * 1530;
                        int i224 = i217 & i223;
                        int i225 = (i223 | i217) & (~i224);
                        int i226 = -(-(i224 << 1));
                        int i227 = (i225 & i226) + (i225 | i226);
                        int i228 = 70 & iCurrentTimeMillis4;
                        int i229 = (~i228) & (70 | iCurrentTimeMillis4);
                        int i230 = (i228 & i229) | (i229 ^ i228);
                        int i231 = (i230 | (~i230)) & (~i230);
                        int i232 = i192 & i194;
                        int i233 = (i232 & i185) | (i185 ^ i232);
                        int i234 = (i233 & 70) | ((~i233) & (-71));
                        int i235 = i233 & (-71);
                        int i236 = ~((i235 & i234) | (i234 ^ i235));
                        int i237 = ((i231 & i236) | (i231 ^ i236)) * 765;
                        int i238 = i227 & i237;
                        i16 = ((i237 ^ i227) | i238) + i238;
                    } else {
                        str = str2;
                        i11 = i60;
                        if ('0' <= cCharAt2) {
                            int i239 = f52434c;
                            int i240 = i239 & 95;
                            int i241 = (i240 - (~(-(-((i239 ^ 95) | i240))))) - 1;
                            i23 = i241 % 128;
                            f52433b = i23;
                            int i242 = i241 % 2;
                            if (cCharAt2 <= '9') {
                                i24 = i23 + 75;
                                f52434c = i24 % 128;
                                if (i24 % 2 == 0) {
                                    i25 = 1;
                                    z10 = true;
                                } else {
                                    i25 = 1;
                                    z10 = false;
                                }
                                z11 = !z10;
                                int i243 = ((i23 ^ 17) | (i23 & 17)) << i25;
                                int i244 = -(((~i23) & 17) | (i23 & (-18)));
                                int i245 = (i243 & i244) + (i244 | i243);
                                i26 = i245 % 128;
                                f52434c = i26;
                                int i246 = i245 % 2;
                                if (z11) {
                                    int i247 = i26 & 39;
                                    int i248 = -(-((i26 ^ 39) | i247));
                                    i27 = (i247 & i248) + (i248 | i247);
                                    f52433b = i27 % 128;
                                    if (i27 % 2 != 0) {
                                        i16 = cCharAt2 << 3;
                                    } else {
                                        int i249 = cCharAt2 & 4;
                                        int i250 = -(-((cCharAt2 ^ 4) | i249));
                                        i16 = ((i249 | i250) << 1) - (i250 ^ i249);
                                    }
                                }
                                if (i65 >= length) {
                                    i12 = i61;
                                    i13 = i62;
                                    i14 = i63;
                                    break;
                                }
                                i31 = i65;
                                i60 = i11;
                                str2 = str;
                                i36 = 2;
                                i40 = 1;
                                c10 = '\n';
                                i10 = -1;
                            } else {
                                int i251 = i23 & 21;
                                int i252 = i251 + ((i23 ^ 21) | i251);
                                f52434c = i252 % 128;
                                int i253 = i252 % 2;
                            }
                        }
                        if (cCharAt2 != '+') {
                            i17 = f52433b;
                            int i254 = i17 & 15;
                            int i255 = i17 | 15;
                            int i256 = (i254 ^ i255) + ((i254 & i255) << 1);
                            f52434c = i256 % 128;
                            int i257 = i256 % 2;
                            if (cCharAt2 == '-') {
                                int i258 = f52433b;
                                int i259 = ((-1) << 1) - ((((i258 | 98) << 1) - (i258 ^ 98)) ^ (-1));
                                f52434c = i259 % 128;
                                int i260 = i259 % 2;
                                i16 = 62;
                            } else {
                                if (cCharAt2 != '/') {
                                    int i261 = i17 & 35;
                                    int i262 = -(-((i17 ^ 35) | i261));
                                    i18 = (i261 & i262) + (i261 | i262);
                                    i19 = i18 % 128;
                                    f52434c = i19;
                                    if (i18 % 2 == 0 ? cCharAt2 != '_' : cCharAt2 != 'K') {
                                        if (cCharAt2 != '\n') {
                                            i20 = i19 + 9;
                                            i21 = i20 % 128;
                                            f52433b = i21;
                                            if (i20 % 2 != 0) {
                                                if (cCharAt2 != 'K') {
                                                }
                                            } else if (cCharAt2 != '\r') {
                                            }
                                            int i263 = i21 & 9;
                                            i22 = i263 + ((i21 ^ 9) | i263);
                                            f52434c = i22 % 128;
                                            if (i22 % 2 == 0) {
                                                if (cCharAt2 != '{') {
                                                }
                                            } else if (cCharAt2 != ' ') {
                                            }
                                            int i264 = ((i21 ^ 89) - (~(-(-((i21 & 89) << 1))))) - 1;
                                            f52434c = i264 % 128;
                                            int i265 = i264 % 2;
                                            if (cCharAt2 != '\t') {
                                                int i266 = (i21 ^ 37) + ((i21 & 37) << 1);
                                                f52434c = i266 % 128;
                                                int i267 = i266 % 2;
                                                return null;
                                            }
                                        }
                                        int i268 = f52433b;
                                        int i269 = i268 ^ 59;
                                        int i270 = (i268 & 59) << 1;
                                        int i271 = (i269 & i270) + (i270 | i269);
                                        f52434c = i271 % 128;
                                        int i272 = i271 % 2;
                                    }
                                }
                                int i273 = i17 ^ 95;
                                int i274 = ((i17 & 95) | i273) << 1;
                                int i275 = -i273;
                                int i276 = (i274 ^ i275) + ((i275 & i274) << 1);
                                f52434c = i276 % 128;
                                int i277 = i276 % 2;
                                i16 = 63;
                            }
                            i28 = i16 | (i63 << 6);
                            int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
                            int i810 = (i61 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 520;
                            int i811 = (-2) & i61;
                            int i812 = (~i811) & ((-2) | i61);
                            int i813 = ~i61;
                            int i814 = (i812 ^ i811) | (i812 & i811);
                            int i815 = ~iCurrentTimeMillis5;
                            int i816 = (~((iCurrentTimeMillis5 & i814) | (i814 ^ iCurrentTimeMillis5))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                            int i910 = i810 & i816;
                            int i911 = (i910 - (~(-(-((i816 ^ i810) | i910))))) - 1;
                            int i912 = (~(i813 | 1)) * (-1042);
                            int i913 = (((~i912) & i911) | ((~i911) & i912)) + ((i912 & i911) << 1);
                            int i914 = ~i61;
                            int i915 = i914 & 1;
                            int i916 = (~i915) & (i914 | 1);
                            int i917 = ~((i916 & i915) | (i916 ^ i915));
                            int i918 = (i815 & (-2)) | ((-2) ^ i815);
                            int i919 = ~((i918 & i61) | (i918 ^ i61));
                            int i1010 = ((~i919) & i917) | ((~i917) & i919);
                            int i1011 = i917 & i919;
                            int i1012 = ((i1011 & i1010) | (i1010 ^ i1011)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                            int i1013 = i913 ^ i1012;
                            i61 = (((i1012 & i913) | i1013) << 1) - i1013;
                            if (i61 % 4 == 0) {
                                int i1014 = f52434c;
                                int i1015 = ((i1014 & 70) + (i1014 | 70)) - 1;
                                f52433b = i1015 % 128;
                                int i1016 = i1015 % 2;
                                int i1017 = i62;
                                int i1018 = (((i1017 ^ 1) | (i1017 & 1)) << 1) - ((i1017 & (-2)) | ((~i1017) & 1));
                                bArr[i1017] = (byte) (i28 >> 16);
                                int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                                int i1019 = (-1337) - (~(-(~(i1018 * (-667)))));
                                int i1110 = ~i1018;
                                int i1111 = iCurrentTimeMillis6 & 1;
                                int i1112 = ~(((~iCurrentTimeMillis6) & 1) | (iCurrentTimeMillis6 & (-2)) | i1111);
                                int i1113 = i1110 ^ i1112;
                                int i1114 = i1112 & i1110;
                                int i1115 = (i1019 - (~(-(-(((i1113 ^ i1114) | (i1113 & i1114)) * (-668)))))) - 1;
                                int i1116 = ~i1018;
                                int i1117 = i1116 ^ iCurrentTimeMillis6;
                                int i1118 = i1116 & iCurrentTimeMillis6;
                                int i1119 = ~((i1117 ^ i1118) | (i1117 & i1118));
                                int i1210 = ((i1119 & 1) | ((~i1119) & 1) | (i1119 & (-2))) * 1336;
                                int i1211 = ((i1115 ^ i1210) | (i1115 & i1210)) << 1;
                                int i1212 = -(((~i1115) & i1210) | ((~i1210) & i1115));
                                int i1213 = (i1211 & i1212) + (i1212 | i1211);
                                int i1214 = (iCurrentTimeMillis6 | 1) & (~i1111);
                                int i1215 = (i1214 & i1111) | (i1214 ^ i1111);
                                int i1216 = (i1116 | i1018) & i1110;
                                int i1217 = -(-(((i1215 & i1216) | (i1215 ^ i1216)) * 668));
                                int i1218 = i1213 & i1217;
                                int i1219 = (i1217 | i1213) & (~i1218);
                                int i1310 = -(-(i1218 << 1));
                                int i1311 = (i1219 & i1310) + (i1219 | i1310);
                                bArr[i1018] = (byte) (i28 >> 8);
                                int iCurrentTimeMillis7 = (int) System.currentTimeMillis();
                                int i1312 = -(-(i1311 * (-344)));
                                int i1313 = ((-344) & i1312) + (i1312 | (-344));
                                int i1314 = ~i1311;
                                int i1315 = ((~i1314) & (-2)) | (i1314 & 1) | ((-2) & i1314);
                                int i1316 = (i1315 | (~i1315)) & (~i1315);
                                int i1317 = (-2) & iCurrentTimeMillis7;
                                int i1318 = (~i1317) & ((-2) | iCurrentTimeMillis7);
                                int i1319 = ~iCurrentTimeMillis7;
                                int i1410 = ~((i1318 & i1317) | (i1318 ^ i1317));
                                int i1411 = ((~i1410) & i1316) | ((~i1316) & i1410);
                                int i1412 = i1316 & i1410;
                                int i1413 = i1313 - (~(((i1412 & i1411) | (i1411 ^ i1412)) * 345));
                                int i1414 = (i1413 ^ (-1)) + (i1413 << 1);
                                int i1415 = (~iCurrentTimeMillis7) & (i1319 | iCurrentTimeMillis7);
                                int i1416 = ~((i1415 & (-2)) | ((-2) ^ i1415));
                                int i1417 = (~i1311) & (i1314 | i1311);
                                int i1418 = ~((i1417 & 1) | (i1417 & (-2)) | ((~i1417) & 1));
                                int i1419 = i1416 & i1418;
                                int i1510 = (i1416 | i1418) & (~i1419);
                                int i1511 = -(-(((i1510 & i1419) | (i1510 ^ i1419)) * 345));
                                int i1512 = (i1414 ^ i1511) + ((i1414 & i1511) << 1);
                                int i1513 = ((~i1314) & (-2)) | (i1314 & 1);
                                int i1514 = i1314 & (-2);
                                int i1515 = (i1514 & i1513) | (i1513 ^ i1514);
                                int i1516 = i1515 & iCurrentTimeMillis7;
                                int i1517 = (iCurrentTimeMillis7 | i1515) & (~i1516);
                                int i1518 = (~((i1517 & i1516) | (i1517 ^ i1516))) * 345;
                                int i1519 = i1512 & i1518;
                                int i1610 = -(-((i1518 ^ i1512) | i1519));
                                i62 = ((i1519 | i1610) << 1) - (i1610 ^ i1519);
                                bArr[i1311] = (byte) i28;
                                int i1611 = f52433b;
                                int i1612 = ((-1) << 1) - ((((i1611 | 16) << 1) - (i1611 ^ 16)) ^ (-1));
                                f52434c = i1612 % 128;
                                int i1613 = i1612 % 2;
                            }
                            i63 = i28;
                        } else {
                            int i2510 = f52433b;
                            int i2511 = ((-1) << 1) - ((((i2510 | 98) << 1) - (i2510 ^ 98)) ^ (-1));
                            f52434c = i2511 % 128;
                            int i2610 = i2511 % 2;
                            i16 = 62;
                            i28 = i16 | (i63 << 6);
                            int iCurrentTimeMillis8 = (int) System.currentTimeMillis();
                            int i817 = (i61 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 520;
                            int i818 = (-2) & i61;
                            int i819 = (~i818) & ((-2) | i61);
                            int i8110 = ~i61;
                            int i8111 = (i819 ^ i818) | (i819 & i818);
                            int i8112 = ~iCurrentTimeMillis8;
                            int i8113 = (~((iCurrentTimeMillis8 & i8111) | (i8111 ^ iCurrentTimeMillis8))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                            int i9110 = i817 & i8113;
                            int i9111 = (i9110 - (~(-(-((i8113 ^ i817) | i9110))))) - 1;
                            int i9112 = (~(i8110 | 1)) * (-1042);
                            int i9113 = (((~i9112) & i9111) | ((~i9111) & i9112)) + ((i9112 & i9111) << 1);
                            int i9114 = ~i61;
                            int i9115 = i9114 & 1;
                            int i9116 = (~i9115) & (i9114 | 1);
                            int i9117 = ~((i9116 & i9115) | (i9116 ^ i9115));
                            int i9118 = (i8112 & (-2)) | ((-2) ^ i8112);
                            int i9119 = ~((i9118 & i61) | (i9118 ^ i61));
                            int i10110 = ((~i9119) & i9117) | ((~i9117) & i9119);
                            int i10111 = i9117 & i9119;
                            int i10112 = ((i10111 & i10110) | (i10110 ^ i10111)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                            int i10113 = i9113 ^ i10112;
                            i61 = (((i10112 & i9113) | i10113) << 1) - i10113;
                            if (i61 % 4 == 0) {
                                int i10114 = f52434c;
                                int i10115 = ((i10114 & 70) + (i10114 | 70)) - 1;
                                f52433b = i10115 % 128;
                                int i10116 = i10115 % 2;
                                int i10117 = i62;
                                int i10118 = (((i10117 ^ 1) | (i10117 & 1)) << 1) - ((i10117 & (-2)) | ((~i10117) & 1));
                                bArr[i10117] = (byte) (i28 >> 16);
                                int iCurrentTimeMillis9 = (int) System.currentTimeMillis();
                                int i10119 = (-1337) - (~(-(~(i10118 * (-667)))));
                                int i11110 = ~i10118;
                                int i11111 = iCurrentTimeMillis9 & 1;
                                int i11112 = ~(((~iCurrentTimeMillis9) & 1) | (iCurrentTimeMillis9 & (-2)) | i11111);
                                int i11113 = i11110 ^ i11112;
                                int i11114 = i11112 & i11110;
                                int i11115 = (i10119 - (~(-(-(((i11113 ^ i11114) | (i11113 & i11114)) * (-668)))))) - 1;
                                int i11116 = ~i10118;
                                int i11117 = i11116 ^ iCurrentTimeMillis9;
                                int i11118 = i11116 & iCurrentTimeMillis9;
                                int i11119 = ~((i11117 ^ i11118) | (i11117 & i11118));
                                int i12110 = ((i11119 & 1) | ((~i11119) & 1) | (i11119 & (-2))) * 1336;
                                int i12111 = ((i11115 ^ i12110) | (i11115 & i12110)) << 1;
                                int i12112 = -(((~i11115) & i12110) | ((~i12110) & i11115));
                                int i12113 = (i12111 & i12112) + (i12112 | i12111);
                                int i12114 = (iCurrentTimeMillis9 | 1) & (~i11111);
                                int i12115 = (i12114 & i11111) | (i12114 ^ i11111);
                                int i12116 = (i11116 | i10118) & i11110;
                                int i12117 = -(-(((i12115 & i12116) | (i12115 ^ i12116)) * 668));
                                int i12118 = i12113 & i12117;
                                int i12119 = (i12117 | i12113) & (~i12118);
                                int i13110 = -(-(i12118 << 1));
                                int i13111 = (i12119 & i13110) + (i12119 | i13110);
                                bArr[i10118] = (byte) (i28 >> 8);
                                int iCurrentTimeMillis10 = (int) System.currentTimeMillis();
                                int i13112 = -(-(i13111 * (-344)));
                                int i13113 = ((-344) & i13112) + (i13112 | (-344));
                                int i13114 = ~i13111;
                                int i13115 = ((~i13114) & (-2)) | (i13114 & 1) | ((-2) & i13114);
                                int i13116 = (i13115 | (~i13115)) & (~i13115);
                                int i13117 = (-2) & iCurrentTimeMillis10;
                                int i13118 = (~i13117) & ((-2) | iCurrentTimeMillis10);
                                int i13119 = ~iCurrentTimeMillis10;
                                int i14110 = ~((i13118 & i13117) | (i13118 ^ i13117));
                                int i14111 = ((~i14110) & i13116) | ((~i13116) & i14110);
                                int i14112 = i13116 & i14110;
                                int i14113 = i13113 - (~(((i14112 & i14111) | (i14111 ^ i14112)) * 345));
                                int i14114 = (i14113 ^ (-1)) + (i14113 << 1);
                                int i14115 = (~iCurrentTimeMillis10) & (i13119 | iCurrentTimeMillis10);
                                int i14116 = ~((i14115 & (-2)) | ((-2) ^ i14115));
                                int i14117 = (~i13111) & (i13114 | i13111);
                                int i14118 = ~((i14117 & 1) | (i14117 & (-2)) | ((~i14117) & 1));
                                int i14119 = i14116 & i14118;
                                int i15110 = (i14116 | i14118) & (~i14119);
                                int i15111 = -(-(((i15110 & i14119) | (i15110 ^ i14119)) * 345));
                                int i15112 = (i14114 ^ i15111) + ((i14114 & i15111) << 1);
                                int i15113 = ((~i13114) & (-2)) | (i13114 & 1);
                                int i15114 = i13114 & (-2);
                                int i15115 = (i15114 & i15113) | (i15113 ^ i15114);
                                int i15116 = i15115 & iCurrentTimeMillis10;
                                int i15117 = (iCurrentTimeMillis10 | i15115) & (~i15116);
                                int i15118 = (~((i15117 & i15116) | (i15117 ^ i15116))) * 345;
                                int i15119 = i15112 & i15118;
                                int i1614 = -(-((i15118 ^ i15112) | i15119));
                                i62 = ((i15119 | i1614) << 1) - (i1614 ^ i15119);
                                bArr[i13111] = (byte) i28;
                                int i1615 = f52433b;
                                int i1616 = ((-1) << 1) - ((((i1615 | 16) << 1) - (i1615 ^ 16)) ^ (-1));
                                f52434c = i1616 % 128;
                                int i1617 = i1616 % 2;
                            }
                            i63 = i28;
                        }
                        if (i65 >= length) {
                            i12 = i61;
                            i13 = i62;
                            i14 = i63;
                            break;
                        }
                        i31 = i65;
                        i60 = i11;
                        str2 = str;
                        i36 = 2;
                        i40 = 1;
                        c10 = '\n';
                        i10 = -1;
                    }
                    i28 = i16 | (i63 << 6);
                    int iCurrentTimeMillis11 = (int) System.currentTimeMillis();
                    int i8114 = (i61 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 520;
                    int i8115 = (-2) & i61;
                    int i8116 = (~i8115) & ((-2) | i61);
                    int i8117 = ~i61;
                    int i8118 = (i8116 ^ i8115) | (i8116 & i8115);
                    int i8119 = ~iCurrentTimeMillis11;
                    int i81110 = (~((iCurrentTimeMillis11 & i8118) | (i8118 ^ iCurrentTimeMillis11))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                    int i91110 = i8114 & i81110;
                    int i91111 = (i91110 - (~(-(-((i81110 ^ i8114) | i91110))))) - 1;
                    int i91112 = (~(i8117 | 1)) * (-1042);
                    int i91113 = (((~i91112) & i91111) | ((~i91111) & i91112)) + ((i91112 & i91111) << 1);
                    int i91114 = ~i61;
                    int i91115 = i91114 & 1;
                    int i91116 = (~i91115) & (i91114 | 1);
                    int i91117 = ~((i91116 & i91115) | (i91116 ^ i91115));
                    int i91118 = (i8119 & (-2)) | ((-2) ^ i8119);
                    int i91119 = ~((i91118 & i61) | (i91118 ^ i61));
                    int i101110 = ((~i91119) & i91117) | ((~i91117) & i91119);
                    int i101111 = i91117 & i91119;
                    int i101112 = ((i101111 & i101110) | (i101110 ^ i101111)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                    int i101113 = i91113 ^ i101112;
                    i61 = (((i101112 & i91113) | i101113) << 1) - i101113;
                    if (i61 % 4 == 0) {
                        int i101114 = f52434c;
                        int i101115 = ((i101114 & 70) + (i101114 | 70)) - 1;
                        f52433b = i101115 % 128;
                        int i101116 = i101115 % 2;
                        int i101117 = i62;
                        int i101118 = (((i101117 ^ 1) | (i101117 & 1)) << 1) - ((i101117 & (-2)) | ((~i101117) & 1));
                        bArr[i101117] = (byte) (i28 >> 16);
                        int iCurrentTimeMillis12 = (int) System.currentTimeMillis();
                        int i101119 = (-1337) - (~(-(~(i101118 * (-667)))));
                        int i111110 = ~i101118;
                        int i111111 = iCurrentTimeMillis12 & 1;
                        int i111112 = ~(((~iCurrentTimeMillis12) & 1) | (iCurrentTimeMillis12 & (-2)) | i111111);
                        int i111113 = i111110 ^ i111112;
                        int i111114 = i111112 & i111110;
                        int i111115 = (i101119 - (~(-(-(((i111113 ^ i111114) | (i111113 & i111114)) * (-668)))))) - 1;
                        int i111116 = ~i101118;
                        int i111117 = i111116 ^ iCurrentTimeMillis12;
                        int i111118 = i111116 & iCurrentTimeMillis12;
                        int i111119 = ~((i111117 ^ i111118) | (i111117 & i111118));
                        int i121110 = ((i111119 & 1) | ((~i111119) & 1) | (i111119 & (-2))) * 1336;
                        int i121111 = ((i111115 ^ i121110) | (i111115 & i121110)) << 1;
                        int i121112 = -(((~i111115) & i121110) | ((~i121110) & i111115));
                        int i121113 = (i121111 & i121112) + (i121112 | i121111);
                        int i121114 = (iCurrentTimeMillis12 | 1) & (~i111111);
                        int i121115 = (i121114 & i111111) | (i121114 ^ i111111);
                        int i121116 = (i111116 | i101118) & i111110;
                        int i121117 = -(-(((i121115 & i121116) | (i121115 ^ i121116)) * 668));
                        int i121118 = i121113 & i121117;
                        int i121119 = (i121117 | i121113) & (~i121118);
                        int i131110 = -(-(i121118 << 1));
                        int i131111 = (i121119 & i131110) + (i121119 | i131110);
                        bArr[i101118] = (byte) (i28 >> 8);
                        int iCurrentTimeMillis13 = (int) System.currentTimeMillis();
                        int i131112 = -(-(i131111 * (-344)));
                        int i131113 = ((-344) & i131112) + (i131112 | (-344));
                        int i131114 = ~i131111;
                        int i131115 = ((~i131114) & (-2)) | (i131114 & 1) | ((-2) & i131114);
                        int i131116 = (i131115 | (~i131115)) & (~i131115);
                        int i131117 = (-2) & iCurrentTimeMillis13;
                        int i131118 = (~i131117) & ((-2) | iCurrentTimeMillis13);
                        int i131119 = ~iCurrentTimeMillis13;
                        int i141110 = ~((i131118 & i131117) | (i131118 ^ i131117));
                        int i141111 = ((~i141110) & i131116) | ((~i131116) & i141110);
                        int i141112 = i131116 & i141110;
                        int i141113 = i131113 - (~(((i141112 & i141111) | (i141111 ^ i141112)) * 345));
                        int i141114 = (i141113 ^ (-1)) + (i141113 << 1);
                        int i141115 = (~iCurrentTimeMillis13) & (i131119 | iCurrentTimeMillis13);
                        int i141116 = ~((i141115 & (-2)) | ((-2) ^ i141115));
                        int i141117 = (~i131111) & (i131114 | i131111);
                        int i141118 = ~((i141117 & 1) | (i141117 & (-2)) | ((~i141117) & 1));
                        int i141119 = i141116 & i141118;
                        int i151110 = (i141116 | i141118) & (~i141119);
                        int i151111 = -(-(((i151110 & i141119) | (i151110 ^ i141119)) * 345));
                        int i151112 = (i141114 ^ i151111) + ((i141114 & i151111) << 1);
                        int i151113 = ((~i131114) & (-2)) | (i131114 & 1);
                        int i151114 = i131114 & (-2);
                        int i151115 = (i151114 & i151113) | (i151113 ^ i151114);
                        int i151116 = i151115 & iCurrentTimeMillis13;
                        int i151117 = (iCurrentTimeMillis13 | i151115) & (~i151116);
                        int i151118 = (~((i151117 & i151116) | (i151117 ^ i151116))) * 345;
                        int i151119 = i151112 & i151118;
                        int i1618 = -(-((i151118 ^ i151112) | i151119));
                        i62 = ((i151119 | i1618) << 1) - (i1618 ^ i151119);
                        bArr[i131111] = (byte) i28;
                        int i1619 = f52433b;
                        int i16110 = ((-1) << 1) - ((((i1619 | 16) << 1) - (i1619 ^ 16)) ^ (-1));
                        f52434c = i16110 % 128;
                        int i16111 = i16110 % 2;
                    }
                    i63 = i28;
                    if (i65 >= length) {
                        i12 = i61;
                        i13 = i62;
                        i14 = i63;
                        break;
                    }
                    i31 = i65;
                    i60 = i11;
                    str2 = str;
                    i36 = 2;
                    i40 = 1;
                    c10 = '\n';
                    i10 = -1;
                } else {
                    int i278 = f52434c;
                    int i279 = i278 & 29;
                    int i280 = (i279 - (~((i278 ^ 29) | i279))) - i40;
                    f52433b = i280 % 128;
                    int i281 = i280 % i36;
                }
                i15 = 0;
                if (i15 != 0) {
                    int i1710 = f52433b;
                    int i1711 = i1710 & 17;
                    int i1712 = (i1710 ^ 17) | i1711;
                    int i1713 = (i1711 & i1712) + (i1712 | i1711);
                    f52434c = i1713 % 128;
                    int i1810 = i1713 % i36;
                    i11 = i60;
                    int iCurrentTimeMillis14 = (int) System.currentTimeMillis();
                    int i1811 = -(-(cCharAt2 * 64772));
                    int i1812 = (108559 & (~i1811)) | (i1811 & (-108560));
                    int i1813 = (108559 & i1811) << i40;
                    int i1814 = (i1812 & i1813) + (i1813 | i1812);
                    int i1815 = ~cCharAt2;
                    int i1816 = ~cCharAt2;
                    int i1817 = i1816 | cCharAt2;
                    int i1818 = i1815 & i1817;
                    int i1819 = (70 & (~i1818)) | (i1818 & (-71));
                    int i1910 = 70 & i1818;
                    int i1911 = (i1819 ^ i1910) | (i1910 & i1819);
                    int i1912 = ~iCurrentTimeMillis14;
                    int i1913 = ~iCurrentTimeMillis14;
                    int i1914 = i1913 | iCurrentTimeMillis14;
                    int i1915 = i1912 & i1914;
                    str = str2;
                    int i1916 = ((~i1911) & i1915) | ((~i1915) & i1911);
                    int i1917 = i1915 & i1911;
                    int i1918 = ~((i1916 & i1917) | (i1916 ^ i1917));
                    int i1919 = ('F' ^ cCharAt2) | ('F' & cCharAt2);
                    int i2010 = i1919 ^ iCurrentTimeMillis14;
                    int i2011 = i1919 & iCurrentTimeMillis14;
                    int i2012 = ~((i2011 & i2010) | (i2010 ^ i2011));
                    int i2013 = i1918 ^ i2012;
                    int i2014 = i1918 & i2012;
                    int i2015 = (i2014 & i2013) | (i2013 ^ i2014);
                    int i2016 = (~cCharAt2) & i1817;
                    int i2017 = (i2016 & 70) | ((~i2016) & (-71));
                    int i2018 = i2016 & (-71);
                    int i2019 = (i2018 & i2017) | (i2017 ^ i2018);
                    int i2110 = (i2019 & i1913) | ((~i2019) & iCurrentTimeMillis14);
                    int i2111 = i2019 & iCurrentTimeMillis14;
                    int i2112 = ~((i2111 & i2110) | (i2110 ^ i2111));
                    int i2113 = i2015 & i2112;
                    int i2114 = (i2112 | i2015) & (~i2113);
                    int i2115 = -(-(((i2114 & i2113) | (i2114 ^ i2113)) * 765));
                    int i2116 = i1814 & i2115;
                    int i2117 = i2116 + ((i1814 ^ i2115) | i2116);
                    int i2118 = (70 ^ i1816) | (70 & i1816);
                    int i2119 = (i2118 | (~i2118)) & (~i2118);
                    int i2210 = (70 & (~i1913)) | (i1913 & (-71));
                    int i2211 = 70 & i1913;
                    int i2212 = ~((i2210 & i2211) | (i2210 ^ i2211));
                    int i2213 = ((i2119 & i2212) | (i2119 ^ i2212)) * 1530;
                    int i2214 = i2117 & i2213;
                    int i2215 = (i2213 | i2117) & (~i2214);
                    int i2216 = -(-(i2214 << 1));
                    int i2217 = (i2215 & i2216) + (i2215 | i2216);
                    int i2218 = 70 & iCurrentTimeMillis14;
                    int i2219 = (~i2218) & (70 | iCurrentTimeMillis14);
                    int i2310 = (i2218 & i2219) | (i2219 ^ i2218);
                    int i2311 = (i2310 | (~i2310)) & (~i2310);
                    int i2312 = i1912 & i1914;
                    int i2313 = (i2312 & i1815) | (i1815 ^ i2312);
                    int i2314 = (i2313 & 70) | ((~i2313) & (-71));
                    int i2315 = i2313 & (-71);
                    int i2316 = ~((i2315 & i2314) | (i2314 ^ i2315));
                    int i2317 = ((i2311 & i2316) | (i2311 ^ i2316)) * 765;
                    int i2318 = i2217 & i2317;
                    i16 = ((i2317 ^ i2217) | i2318) + i2318;
                } else {
                    str = str2;
                    i11 = i60;
                    if ('0' <= cCharAt2) {
                        int i2319 = f52434c;
                        int i2410 = i2319 & 95;
                        int i2411 = (i2410 - (~(-(-((i2319 ^ 95) | i2410))))) - 1;
                        i23 = i2411 % 128;
                        f52433b = i23;
                        int i2412 = i2411 % 2;
                        if (cCharAt2 <= '9') {
                            i24 = i23 + 75;
                            f52434c = i24 % 128;
                            if (i24 % 2 == 0) {
                                i25 = 1;
                                z10 = true;
                            } else {
                                i25 = 1;
                                z10 = false;
                            }
                            z11 = !z10;
                            int i2413 = ((i23 ^ 17) | (i23 & 17)) << i25;
                            int i2414 = -(((~i23) & 17) | (i23 & (-18)));
                            int i2415 = (i2413 & i2414) + (i2414 | i2413);
                            i26 = i2415 % 128;
                            f52434c = i26;
                            int i2416 = i2415 % 2;
                            if (z11) {
                                int i2417 = i26 & 39;
                                int i2418 = -(-((i26 ^ 39) | i2417));
                                i27 = (i2417 & i2418) + (i2418 | i2417);
                                f52433b = i27 % 128;
                                if (i27 % 2 != 0) {
                                    i16 = cCharAt2 << 3;
                                } else {
                                    int i2419 = cCharAt2 & 4;
                                    int i2512 = -(-((cCharAt2 ^ 4) | i2419));
                                    i16 = ((i2419 | i2512) << 1) - (i2512 ^ i2419);
                                }
                            }
                            if (i65 >= length) {
                                i12 = i61;
                                i13 = i62;
                                i14 = i63;
                                break;
                            }
                            i31 = i65;
                            i60 = i11;
                            str2 = str;
                            i36 = 2;
                            i40 = 1;
                            c10 = '\n';
                            i10 = -1;
                        } else {
                            int i2513 = i23 & 21;
                            int i2514 = i2513 + ((i23 ^ 21) | i2513);
                            f52434c = i2514 % 128;
                            int i2515 = i2514 % 2;
                        }
                    }
                    if (cCharAt2 != '+') {
                        i17 = f52433b;
                        int i2516 = i17 & 15;
                        int i2517 = i17 | 15;
                        int i2518 = (i2516 ^ i2517) + ((i2516 & i2517) << 1);
                        f52434c = i2518 % 128;
                        int i2519 = i2518 % 2;
                        if (cCharAt2 == '-') {
                            int i25110 = f52433b;
                            int i25111 = ((-1) << 1) - ((((i25110 | 98) << 1) - (i25110 ^ 98)) ^ (-1));
                            f52434c = i25111 % 128;
                            int i2611 = i25111 % 2;
                            i16 = 62;
                        } else {
                            if (cCharAt2 != '/') {
                                int i2612 = i17 & 35;
                                int i2613 = -(-((i17 ^ 35) | i2612));
                                i18 = (i2612 & i2613) + (i2612 | i2613);
                                i19 = i18 % 128;
                                f52434c = i19;
                                if (i18 % 2 == 0) {
                                    if (cCharAt2 != '\n') {
                                        i20 = i19 + 9;
                                        i21 = i20 % 128;
                                        f52433b = i21;
                                        if (i20 % 2 != 0) {
                                            if (cCharAt2 != 'K') {
                                            }
                                        } else if (cCharAt2 != '\r') {
                                        }
                                        int i2614 = i21 & 9;
                                        i22 = i2614 + ((i21 ^ 9) | i2614);
                                        f52434c = i22 % 128;
                                        if (i22 % 2 == 0) {
                                            if (cCharAt2 != '{') {
                                            }
                                        } else if (cCharAt2 != ' ') {
                                        }
                                        int i2615 = ((i21 ^ 89) - (~(-(-((i21 & 89) << 1))))) - 1;
                                        f52434c = i2615 % 128;
                                        int i2616 = i2615 % 2;
                                        if (cCharAt2 != '\t') {
                                            int i2617 = (i21 ^ 37) + ((i21 & 37) << 1);
                                            f52434c = i2617 % 128;
                                            int i2618 = i2617 % 2;
                                            return null;
                                        }
                                    }
                                    int i2619 = f52433b;
                                    int i2620 = i2619 ^ 59;
                                    int i2710 = (i2619 & 59) << 1;
                                    int i2711 = (i2620 & i2710) + (i2710 | i2620);
                                    f52434c = i2711 % 128;
                                    int i2712 = i2711 % 2;
                                } else {
                                    if (cCharAt2 != '\n') {
                                        i20 = i19 + 9;
                                        i21 = i20 % 128;
                                        f52433b = i21;
                                        if (i20 % 2 != 0) {
                                            if (cCharAt2 != 'K') {
                                            }
                                        } else if (cCharAt2 != '\r') {
                                        }
                                        int i26110 = i21 & 9;
                                        i22 = i26110 + ((i21 ^ 9) | i26110);
                                        f52434c = i22 % 128;
                                        if (i22 % 2 == 0) {
                                            if (cCharAt2 != '{') {
                                            }
                                        } else if (cCharAt2 != ' ') {
                                        }
                                        int i26111 = ((i21 ^ 89) - (~(-(-((i21 & 89) << 1))))) - 1;
                                        f52434c = i26111 % 128;
                                        int i26112 = i26111 % 2;
                                        if (cCharAt2 != '\t') {
                                            int i26113 = (i21 ^ 37) + ((i21 & 37) << 1);
                                            f52434c = i26113 % 128;
                                            int i26114 = i26113 % 2;
                                            return null;
                                        }
                                    }
                                    int i26115 = f52433b;
                                    int i2621 = i26115 ^ 59;
                                    int i2713 = (i26115 & 59) << 1;
                                    int i2714 = (i2621 & i2713) + (i2713 | i2621);
                                    f52434c = i2714 % 128;
                                    int i2715 = i2714 % 2;
                                }
                            }
                            int i2716 = i17 ^ 95;
                            int i2717 = ((i17 & 95) | i2716) << 1;
                            int i2718 = -i2716;
                            int i2719 = (i2717 ^ i2718) + ((i2718 & i2717) << 1);
                            f52434c = i2719 % 128;
                            int i2720 = i2719 % 2;
                            i16 = 63;
                        }
                        i28 = i16 | (i63 << 6);
                        int iCurrentTimeMillis15 = (int) System.currentTimeMillis();
                        int i81111 = (i61 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 520;
                        int i81112 = (-2) & i61;
                        int i81113 = (~i81112) & ((-2) | i61);
                        int i81114 = ~i61;
                        int i81115 = (i81113 ^ i81112) | (i81113 & i81112);
                        int i81116 = ~iCurrentTimeMillis15;
                        int i81117 = (~((iCurrentTimeMillis15 & i81115) | (i81115 ^ iCurrentTimeMillis15))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                        int i911110 = i81111 & i81117;
                        int i911111 = (i911110 - (~(-(-((i81117 ^ i81111) | i911110))))) - 1;
                        int i911112 = (~(i81114 | 1)) * (-1042);
                        int i911113 = (((~i911112) & i911111) | ((~i911111) & i911112)) + ((i911112 & i911111) << 1);
                        int i911114 = ~i61;
                        int i911115 = i911114 & 1;
                        int i911116 = (~i911115) & (i911114 | 1);
                        int i911117 = ~((i911116 & i911115) | (i911116 ^ i911115));
                        int i911118 = (i81116 & (-2)) | ((-2) ^ i81116);
                        int i911119 = ~((i911118 & i61) | (i911118 ^ i61));
                        int i1011110 = ((~i911119) & i911117) | ((~i911117) & i911119);
                        int i1011111 = i911117 & i911119;
                        int i1011112 = ((i1011111 & i1011110) | (i1011110 ^ i1011111)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                        int i1011113 = i911113 ^ i1011112;
                        i61 = (((i1011112 & i911113) | i1011113) << 1) - i1011113;
                        if (i61 % 4 == 0) {
                            int i1011114 = f52434c;
                            int i1011115 = ((i1011114 & 70) + (i1011114 | 70)) - 1;
                            f52433b = i1011115 % 128;
                            int i1011116 = i1011115 % 2;
                            int i1011117 = i62;
                            int i1011118 = (((i1011117 ^ 1) | (i1011117 & 1)) << 1) - ((i1011117 & (-2)) | ((~i1011117) & 1));
                            bArr[i1011117] = (byte) (i28 >> 16);
                            int iCurrentTimeMillis16 = (int) System.currentTimeMillis();
                            int i1011119 = (-1337) - (~(-(~(i1011118 * (-667)))));
                            int i1111110 = ~i1011118;
                            int i1111111 = iCurrentTimeMillis16 & 1;
                            int i1111112 = ~(((~iCurrentTimeMillis16) & 1) | (iCurrentTimeMillis16 & (-2)) | i1111111);
                            int i1111113 = i1111110 ^ i1111112;
                            int i1111114 = i1111112 & i1111110;
                            int i1111115 = (i1011119 - (~(-(-(((i1111113 ^ i1111114) | (i1111113 & i1111114)) * (-668)))))) - 1;
                            int i1111116 = ~i1011118;
                            int i1111117 = i1111116 ^ iCurrentTimeMillis16;
                            int i1111118 = i1111116 & iCurrentTimeMillis16;
                            int i1111119 = ~((i1111117 ^ i1111118) | (i1111117 & i1111118));
                            int i1211110 = ((i1111119 & 1) | ((~i1111119) & 1) | (i1111119 & (-2))) * 1336;
                            int i1211111 = ((i1111115 ^ i1211110) | (i1111115 & i1211110)) << 1;
                            int i1211112 = -(((~i1111115) & i1211110) | ((~i1211110) & i1111115));
                            int i1211113 = (i1211111 & i1211112) + (i1211112 | i1211111);
                            int i1211114 = (iCurrentTimeMillis16 | 1) & (~i1111111);
                            int i1211115 = (i1211114 & i1111111) | (i1211114 ^ i1111111);
                            int i1211116 = (i1111116 | i1011118) & i1111110;
                            int i1211117 = -(-(((i1211115 & i1211116) | (i1211115 ^ i1211116)) * 668));
                            int i1211118 = i1211113 & i1211117;
                            int i1211119 = (i1211117 | i1211113) & (~i1211118);
                            int i1311110 = -(-(i1211118 << 1));
                            int i1311111 = (i1211119 & i1311110) + (i1211119 | i1311110);
                            bArr[i1011118] = (byte) (i28 >> 8);
                            int iCurrentTimeMillis17 = (int) System.currentTimeMillis();
                            int i1311112 = -(-(i1311111 * (-344)));
                            int i1311113 = ((-344) & i1311112) + (i1311112 | (-344));
                            int i1311114 = ~i1311111;
                            int i1311115 = ((~i1311114) & (-2)) | (i1311114 & 1) | ((-2) & i1311114);
                            int i1311116 = (i1311115 | (~i1311115)) & (~i1311115);
                            int i1311117 = (-2) & iCurrentTimeMillis17;
                            int i1311118 = (~i1311117) & ((-2) | iCurrentTimeMillis17);
                            int i1311119 = ~iCurrentTimeMillis17;
                            int i1411110 = ~((i1311118 & i1311117) | (i1311118 ^ i1311117));
                            int i1411111 = ((~i1411110) & i1311116) | ((~i1311116) & i1411110);
                            int i1411112 = i1311116 & i1411110;
                            int i1411113 = i1311113 - (~(((i1411112 & i1411111) | (i1411111 ^ i1411112)) * 345));
                            int i1411114 = (i1411113 ^ (-1)) + (i1411113 << 1);
                            int i1411115 = (~iCurrentTimeMillis17) & (i1311119 | iCurrentTimeMillis17);
                            int i1411116 = ~((i1411115 & (-2)) | ((-2) ^ i1411115));
                            int i1411117 = (~i1311111) & (i1311114 | i1311111);
                            int i1411118 = ~((i1411117 & 1) | (i1411117 & (-2)) | ((~i1411117) & 1));
                            int i1411119 = i1411116 & i1411118;
                            int i1511110 = (i1411116 | i1411118) & (~i1411119);
                            int i1511111 = -(-(((i1511110 & i1411119) | (i1511110 ^ i1411119)) * 345));
                            int i1511112 = (i1411114 ^ i1511111) + ((i1411114 & i1511111) << 1);
                            int i1511113 = ((~i1311114) & (-2)) | (i1311114 & 1);
                            int i1511114 = i1311114 & (-2);
                            int i1511115 = (i1511114 & i1511113) | (i1511113 ^ i1511114);
                            int i1511116 = i1511115 & iCurrentTimeMillis17;
                            int i1511117 = (iCurrentTimeMillis17 | i1511115) & (~i1511116);
                            int i1511118 = (~((i1511117 & i1511116) | (i1511117 ^ i1511116))) * 345;
                            int i1511119 = i1511112 & i1511118;
                            int i16112 = -(-((i1511118 ^ i1511112) | i1511119));
                            i62 = ((i1511119 | i16112) << 1) - (i16112 ^ i1511119);
                            bArr[i1311111] = (byte) i28;
                            int i16113 = f52433b;
                            int i16114 = ((-1) << 1) - ((((i16113 | 16) << 1) - (i16113 ^ 16)) ^ (-1));
                            f52434c = i16114 % 128;
                            int i16115 = i16114 % 2;
                        }
                        i63 = i28;
                    } else {
                        int i25112 = f52433b;
                        int i25113 = ((-1) << 1) - ((((i25112 | 98) << 1) - (i25112 ^ 98)) ^ (-1));
                        f52434c = i25113 % 128;
                        int i26116 = i25113 % 2;
                        i16 = 62;
                        i28 = i16 | (i63 << 6);
                        int iCurrentTimeMillis18 = (int) System.currentTimeMillis();
                        int i81118 = (i61 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 520;
                        int i81119 = (-2) & i61;
                        int i811110 = (~i81119) & ((-2) | i61);
                        int i811111 = ~i61;
                        int i811112 = (i811110 ^ i81119) | (i811110 & i81119);
                        int i811113 = ~iCurrentTimeMillis18;
                        int i811114 = (~((iCurrentTimeMillis18 & i811112) | (i811112 ^ iCurrentTimeMillis18))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                        int i9111110 = i81118 & i811114;
                        int i9111111 = (i9111110 - (~(-(-((i811114 ^ i81118) | i9111110))))) - 1;
                        int i9111112 = (~(i811111 | 1)) * (-1042);
                        int i9111113 = (((~i9111112) & i9111111) | ((~i9111111) & i9111112)) + ((i9111112 & i9111111) << 1);
                        int i9111114 = ~i61;
                        int i9111115 = i9111114 & 1;
                        int i9111116 = (~i9111115) & (i9111114 | 1);
                        int i9111117 = ~((i9111116 & i9111115) | (i9111116 ^ i9111115));
                        int i9111118 = (i811113 & (-2)) | ((-2) ^ i811113);
                        int i9111119 = ~((i9111118 & i61) | (i9111118 ^ i61));
                        int i10111110 = ((~i9111119) & i9111117) | ((~i9111117) & i9111119);
                        int i10111111 = i9111117 & i9111119;
                        int i10111112 = ((i10111111 & i10111110) | (i10111110 ^ i10111111)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                        int i10111113 = i9111113 ^ i10111112;
                        i61 = (((i10111112 & i9111113) | i10111113) << 1) - i10111113;
                        if (i61 % 4 == 0) {
                            int i10111114 = f52434c;
                            int i10111115 = ((i10111114 & 70) + (i10111114 | 70)) - 1;
                            f52433b = i10111115 % 128;
                            int i10111116 = i10111115 % 2;
                            int i10111117 = i62;
                            int i10111118 = (((i10111117 ^ 1) | (i10111117 & 1)) << 1) - ((i10111117 & (-2)) | ((~i10111117) & 1));
                            bArr[i10111117] = (byte) (i28 >> 16);
                            int iCurrentTimeMillis19 = (int) System.currentTimeMillis();
                            int i10111119 = (-1337) - (~(-(~(i10111118 * (-667)))));
                            int i11111110 = ~i10111118;
                            int i11111111 = iCurrentTimeMillis19 & 1;
                            int i11111112 = ~(((~iCurrentTimeMillis19) & 1) | (iCurrentTimeMillis19 & (-2)) | i11111111);
                            int i11111113 = i11111110 ^ i11111112;
                            int i11111114 = i11111112 & i11111110;
                            int i11111115 = (i10111119 - (~(-(-(((i11111113 ^ i11111114) | (i11111113 & i11111114)) * (-668)))))) - 1;
                            int i11111116 = ~i10111118;
                            int i11111117 = i11111116 ^ iCurrentTimeMillis19;
                            int i11111118 = i11111116 & iCurrentTimeMillis19;
                            int i11111119 = ~((i11111117 ^ i11111118) | (i11111117 & i11111118));
                            int i12111110 = ((i11111119 & 1) | ((~i11111119) & 1) | (i11111119 & (-2))) * 1336;
                            int i12111111 = ((i11111115 ^ i12111110) | (i11111115 & i12111110)) << 1;
                            int i12111112 = -(((~i11111115) & i12111110) | ((~i12111110) & i11111115));
                            int i12111113 = (i12111111 & i12111112) + (i12111112 | i12111111);
                            int i12111114 = (iCurrentTimeMillis19 | 1) & (~i11111111);
                            int i12111115 = (i12111114 & i11111111) | (i12111114 ^ i11111111);
                            int i12111116 = (i11111116 | i10111118) & i11111110;
                            int i12111117 = -(-(((i12111115 & i12111116) | (i12111115 ^ i12111116)) * 668));
                            int i12111118 = i12111113 & i12111117;
                            int i12111119 = (i12111117 | i12111113) & (~i12111118);
                            int i13111110 = -(-(i12111118 << 1));
                            int i13111111 = (i12111119 & i13111110) + (i12111119 | i13111110);
                            bArr[i10111118] = (byte) (i28 >> 8);
                            int iCurrentTimeMillis110 = (int) System.currentTimeMillis();
                            int i13111112 = -(-(i13111111 * (-344)));
                            int i13111113 = ((-344) & i13111112) + (i13111112 | (-344));
                            int i13111114 = ~i13111111;
                            int i13111115 = ((~i13111114) & (-2)) | (i13111114 & 1) | ((-2) & i13111114);
                            int i13111116 = (i13111115 | (~i13111115)) & (~i13111115);
                            int i13111117 = (-2) & iCurrentTimeMillis110;
                            int i13111118 = (~i13111117) & ((-2) | iCurrentTimeMillis110);
                            int i13111119 = ~iCurrentTimeMillis110;
                            int i14111110 = ~((i13111118 & i13111117) | (i13111118 ^ i13111117));
                            int i14111111 = ((~i14111110) & i13111116) | ((~i13111116) & i14111110);
                            int i14111112 = i13111116 & i14111110;
                            int i14111113 = i13111113 - (~(((i14111112 & i14111111) | (i14111111 ^ i14111112)) * 345));
                            int i14111114 = (i14111113 ^ (-1)) + (i14111113 << 1);
                            int i14111115 = (~iCurrentTimeMillis110) & (i13111119 | iCurrentTimeMillis110);
                            int i14111116 = ~((i14111115 & (-2)) | ((-2) ^ i14111115));
                            int i14111117 = (~i13111111) & (i13111114 | i13111111);
                            int i14111118 = ~((i14111117 & 1) | (i14111117 & (-2)) | ((~i14111117) & 1));
                            int i14111119 = i14111116 & i14111118;
                            int i15111110 = (i14111116 | i14111118) & (~i14111119);
                            int i15111111 = -(-(((i15111110 & i14111119) | (i15111110 ^ i14111119)) * 345));
                            int i15111112 = (i14111114 ^ i15111111) + ((i14111114 & i15111111) << 1);
                            int i15111113 = ((~i13111114) & (-2)) | (i13111114 & 1);
                            int i15111114 = i13111114 & (-2);
                            int i15111115 = (i15111114 & i15111113) | (i15111113 ^ i15111114);
                            int i15111116 = i15111115 & iCurrentTimeMillis110;
                            int i15111117 = (iCurrentTimeMillis110 | i15111115) & (~i15111116);
                            int i15111118 = (~((i15111117 & i15111116) | (i15111117 ^ i15111116))) * 345;
                            int i15111119 = i15111112 & i15111118;
                            int i16116 = -(-((i15111118 ^ i15111112) | i15111119));
                            i62 = ((i15111119 | i16116) << 1) - (i16116 ^ i15111119);
                            bArr[i13111111] = (byte) i28;
                            int i16117 = f52433b;
                            int i16118 = ((-1) << 1) - ((((i16117 | 16) << 1) - (i16117 ^ 16)) ^ (-1));
                            f52434c = i16118 % 128;
                            int i16119 = i16118 % 2;
                        }
                        i63 = i28;
                    }
                    if (i65 >= length) {
                        i12 = i61;
                        i13 = i62;
                        i14 = i63;
                        break;
                    }
                    i31 = i65;
                    i60 = i11;
                    str2 = str;
                    i36 = 2;
                    i40 = 1;
                    c10 = '\n';
                    i10 = -1;
                }
                i28 = i16 | (i63 << 6);
                int iCurrentTimeMillis111 = (int) System.currentTimeMillis();
                int i811115 = (i61 * ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) - 520;
                int i811116 = (-2) & i61;
                int i811117 = (~i811116) & ((-2) | i61);
                int i811118 = ~i61;
                int i811119 = (i811117 ^ i811116) | (i811117 & i811116);
                int i8111110 = ~iCurrentTimeMillis111;
                int i8111111 = (~((iCurrentTimeMillis111 & i811119) | (i811119 ^ iCurrentTimeMillis111))) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                int i91111110 = i811115 & i8111111;
                int i91111111 = (i91111110 - (~(-(-((i8111111 ^ i811115) | i91111110))))) - 1;
                int i91111112 = (~(i811118 | 1)) * (-1042);
                int i91111113 = (((~i91111112) & i91111111) | ((~i91111111) & i91111112)) + ((i91111112 & i91111111) << 1);
                int i91111114 = ~i61;
                int i91111115 = i91111114 & 1;
                int i91111116 = (~i91111115) & (i91111114 | 1);
                int i91111117 = ~((i91111116 & i91111115) | (i91111116 ^ i91111115));
                int i91111118 = (i8111110 & (-2)) | ((-2) ^ i8111110);
                int i91111119 = ~((i91111118 & i61) | (i91111118 ^ i61));
                int i101111110 = ((~i91111119) & i91111117) | ((~i91111117) & i91111119);
                int i101111111 = i91111117 & i91111119;
                int i101111112 = ((i101111111 & i101111110) | (i101111110 ^ i101111111)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                int i101111113 = i91111113 ^ i101111112;
                i61 = (((i101111112 & i91111113) | i101111113) << 1) - i101111113;
                if (i61 % 4 == 0) {
                    int i101111114 = f52434c;
                    int i101111115 = ((i101111114 & 70) + (i101111114 | 70)) - 1;
                    f52433b = i101111115 % 128;
                    int i101111116 = i101111115 % 2;
                    int i101111117 = i62;
                    int i101111118 = (((i101111117 ^ 1) | (i101111117 & 1)) << 1) - ((i101111117 & (-2)) | ((~i101111117) & 1));
                    bArr[i101111117] = (byte) (i28 >> 16);
                    int iCurrentTimeMillis112 = (int) System.currentTimeMillis();
                    int i101111119 = (-1337) - (~(-(~(i101111118 * (-667)))));
                    int i111111110 = ~i101111118;
                    int i111111111 = iCurrentTimeMillis112 & 1;
                    int i111111112 = ~(((~iCurrentTimeMillis112) & 1) | (iCurrentTimeMillis112 & (-2)) | i111111111);
                    int i111111113 = i111111110 ^ i111111112;
                    int i111111114 = i111111112 & i111111110;
                    int i111111115 = (i101111119 - (~(-(-(((i111111113 ^ i111111114) | (i111111113 & i111111114)) * (-668)))))) - 1;
                    int i111111116 = ~i101111118;
                    int i111111117 = i111111116 ^ iCurrentTimeMillis112;
                    int i111111118 = i111111116 & iCurrentTimeMillis112;
                    int i111111119 = ~((i111111117 ^ i111111118) | (i111111117 & i111111118));
                    int i121111110 = ((i111111119 & 1) | ((~i111111119) & 1) | (i111111119 & (-2))) * 1336;
                    int i121111111 = ((i111111115 ^ i121111110) | (i111111115 & i121111110)) << 1;
                    int i121111112 = -(((~i111111115) & i121111110) | ((~i121111110) & i111111115));
                    int i121111113 = (i121111111 & i121111112) + (i121111112 | i121111111);
                    int i121111114 = (iCurrentTimeMillis112 | 1) & (~i111111111);
                    int i121111115 = (i121111114 & i111111111) | (i121111114 ^ i111111111);
                    int i121111116 = (i111111116 | i101111118) & i111111110;
                    int i121111117 = -(-(((i121111115 & i121111116) | (i121111115 ^ i121111116)) * 668));
                    int i121111118 = i121111113 & i121111117;
                    int i121111119 = (i121111117 | i121111113) & (~i121111118);
                    int i131111110 = -(-(i121111118 << 1));
                    int i131111111 = (i121111119 & i131111110) + (i121111119 | i131111110);
                    bArr[i101111118] = (byte) (i28 >> 8);
                    int iCurrentTimeMillis113 = (int) System.currentTimeMillis();
                    int i131111112 = -(-(i131111111 * (-344)));
                    int i131111113 = ((-344) & i131111112) + (i131111112 | (-344));
                    int i131111114 = ~i131111111;
                    int i131111115 = ((~i131111114) & (-2)) | (i131111114 & 1) | ((-2) & i131111114);
                    int i131111116 = (i131111115 | (~i131111115)) & (~i131111115);
                    int i131111117 = (-2) & iCurrentTimeMillis113;
                    int i131111118 = (~i131111117) & ((-2) | iCurrentTimeMillis113);
                    int i131111119 = ~iCurrentTimeMillis113;
                    int i141111110 = ~((i131111118 & i131111117) | (i131111118 ^ i131111117));
                    int i141111111 = ((~i141111110) & i131111116) | ((~i131111116) & i141111110);
                    int i141111112 = i131111116 & i141111110;
                    int i141111113 = i131111113 - (~(((i141111112 & i141111111) | (i141111111 ^ i141111112)) * 345));
                    int i141111114 = (i141111113 ^ (-1)) + (i141111113 << 1);
                    int i141111115 = (~iCurrentTimeMillis113) & (i131111119 | iCurrentTimeMillis113);
                    int i141111116 = ~((i141111115 & (-2)) | ((-2) ^ i141111115));
                    int i141111117 = (~i131111111) & (i131111114 | i131111111);
                    int i141111118 = ~((i141111117 & 1) | (i141111117 & (-2)) | ((~i141111117) & 1));
                    int i141111119 = i141111116 & i141111118;
                    int i151111110 = (i141111116 | i141111118) & (~i141111119);
                    int i151111111 = -(-(((i151111110 & i141111119) | (i151111110 ^ i141111119)) * 345));
                    int i151111112 = (i141111114 ^ i151111111) + ((i141111114 & i151111111) << 1);
                    int i151111113 = ((~i131111114) & (-2)) | (i131111114 & 1);
                    int i151111114 = i131111114 & (-2);
                    int i151111115 = (i151111114 & i151111113) | (i151111113 ^ i151111114);
                    int i151111116 = i151111115 & iCurrentTimeMillis113;
                    int i151111117 = (iCurrentTimeMillis113 | i151111115) & (~i151111116);
                    int i151111118 = (~((i151111117 & i151111116) | (i151111117 ^ i151111116))) * 345;
                    int i151111119 = i151111112 & i151111118;
                    int i161110 = -(-((i151111118 ^ i151111112) | i151111119));
                    i62 = ((i151111119 | i161110) << 1) - (i161110 ^ i151111119);
                    bArr[i131111111] = (byte) i28;
                    int i161111 = f52433b;
                    int i161112 = ((-1) << 1) - ((((i161111 | 16) << 1) - (i161111 ^ 16)) ^ (-1));
                    f52434c = i161112 % 128;
                    int i161113 = i161112 % 2;
                }
                i63 = i28;
                if (i65 >= length) {
                    i12 = i61;
                    i13 = i62;
                    i14 = i63;
                    break;
                }
                i31 = i65;
                i60 = i11;
                str2 = str;
                i36 = 2;
                i40 = 1;
                c10 = '\n';
                i10 = -1;
            }
        } else {
            i11 = i60;
            i12 = 0;
            i13 = 0;
            i14 = 0;
        }
        int i282 = i12 % 4;
        if (i282 == 1) {
            int i283 = f52434c;
            int i284 = (i283 | 101) << 1;
            int i285 = -(i283 ^ 101);
            int i286 = (i284 & i285) + (i285 | i284);
            f52433b = i286 % 128;
            if (i286 % 2 == 0) {
                return null;
            }
            throw null;
        }
        if (i282 == 2) {
            int iCurrentTimeMillis20 = (int) System.currentTimeMillis();
            int i287 = -(-(i13 * (-675)));
            int i288 = (677 & i287) + (i287 | 677);
            int i289 = ~iCurrentTimeMillis20;
            int i290 = i289 & 1;
            int i291 = (iCurrentTimeMillis20 & (-2)) | i290 | (iCurrentTimeMillis20 & 1);
            int i292 = ~i13;
            int i293 = i291 ^ i292;
            int i294 = i291 & i292;
            int i295 = ((i294 & i293) | (i293 ^ i294)) * (-676);
            int i296 = i288 & i295;
            int i297 = (i288 ^ i295) | i296;
            int i298 = (i296 ^ i297) + ((i297 & i296) << 1);
            int i299 = ~i13;
            int i300 = i299 & 1;
            int i301 = (~i300) & (i299 | 1);
            int i302 = i290 | (i289 ^ 1);
            int i303 = -(-((((i302 | (~i302)) & (~i302)) | (~((i300 & i301) | (i301 ^ i300)))) * 676));
            int i304 = (i298 & i303) + (i303 | i298);
            int i305 = (i299 | i13) & i292;
            int i306 = (-2) & i305;
            int i307 = (i305 | (-2)) & (~i306);
            int i308 = (i307 & i306) | (i307 ^ i306);
            int i309 = (i308 | (~i308)) & (~i308);
            int i310 = (~iCurrentTimeMillis20) & (i289 | iCurrentTimeMillis20);
            int i311 = ((~i310) & i292) | ((~i292) & i310);
            int i312 = i310 & i292;
            int i313 = ~((i312 & i311) | (i311 ^ i312));
            int i314 = i309 ^ i313;
            int i315 = i309 & i313;
            int i316 = (i315 & i314) | (i314 ^ i315);
            int i317 = i13 & 1;
            int i318 = (~i317) & (i13 | 1);
            int i319 = (i317 & i318) | (i318 ^ i317);
            int i320 = (i289 & i319) | ((~i319) & iCurrentTimeMillis20);
            int i321 = iCurrentTimeMillis20 & i319;
            int i322 = ~((i321 & i320) | (i320 ^ i321));
            int i323 = ((~i322) & i316) | ((~i316) & i322);
            int i324 = i322 & i316;
            int i325 = -(-(((i324 & i323) | (i323 ^ i324)) * 676));
            int i326 = (i304 | i325) << 1;
            int i327 = -((i325 & (~i304)) | ((~i325) & i304));
            bArr[i13] = (byte) ((i14 << 12) >> 16);
            int i328 = f52433b;
            int i329 = (i328 ^ 47) + ((i328 & 47) << 1);
            f52434c = i329 % 128;
            int i330 = i329 % 2;
            i13 = ((i326 | i327) << 1) - (i327 ^ i326);
        } else if (i282 == 3) {
            int i331 = i14 << 6;
            int i332 = i13 & 1;
            int i333 = (i13 ^ 1) | i332;
            int i334 = (i332 ^ i333) + ((i332 & i333) << 1);
            bArr[i13] = (byte) (i331 >> 16);
            int i335 = i334 & 1;
            i13 = i335 + ((i334 ^ 1) | i335);
            bArr[i334] = (byte) (i331 >> 8);
            int i336 = f52433b;
            int i337 = (((i336 | 43) << 1) - (~(-(i336 ^ 43)))) - 1;
            f52434c = i337 % 128;
            int i338 = i337 % 2;
        }
        if (i13 != i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i13);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            int i339 = f52434c;
            int i340 = i339 & 121;
            int i341 = (i340 - (~((i339 ^ 121) | i340))) - 1;
            f52433b = i341 % 128;
            int i342 = i341 % 2;
            return bArrCopyOf;
        }
        int i343 = f52433b;
        int i344 = ((i343 ^ 50) + ((i343 & 50) << 1)) - 1;
        f52434c = i344 % 128;
        if (i344 % 2 == 0) {
            throw null;
        }
        int i345 = ((-1) << 1) - ((i343 + 94) ^ (-1));
        f52434c = i345 % 128;
        int i346 = i345 % 2;
        return bArr;
    }

    @Nullable
    public static final byte[] setCompoundDrawableTintBlendMode(@NotNull String str) {
        return (byte[]) setX(new Object[]{str}, -732811547, 732811548, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ String setOnFocusChangeListener(byte[] bArr) {
        return (String) setX(new Object[]{bArr}, -1739718784, 1739718784, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = (i11 * Constant.ERROR_CODE_408) + (i10 * (-813));
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = ~(i10 | i12);
        int i18 = ((i16 | i17) * (-814)) + i14;
        int i19 = ~(i15 | (~i12));
        int i20 = ~i10;
        int i21 = ~(i20 | i11);
        int i22 = (((~(i20 | i12)) | i21 | (~(i11 | i12))) * 407) + ((i19 | i21 | i17) * 407) + i18;
        int i23 = 1;
        if (i22 == 1) {
            return a(objArr);
        }
        int i24 = 2;
        int i25 = -2;
        if (i22 != 2) {
            byte[] bArr = (byte[]) objArr[0];
            int i26 = f52433b;
            int i27 = i26 ^ 37;
            int i28 = -(-((i26 & 37) << 1));
            int i29 = (i27 ^ i28) + ((i28 & i27) << 1);
            f52434c = i29 % 128;
            int i30 = i29 % 2;
            String str = (String) setX(new Object[]{bArr, f52432a}, -984102103, 984102105, (int) System.currentTimeMillis());
            int i31 = (-2) - ((f52433b + 122) ^ (-1));
            f52434c = i31 % 128;
            if (i31 % 2 != 0) {
                return str;
            }
            throw null;
        }
        byte[] bArr2 = (byte[]) objArr[0];
        byte[] bArr3 = (byte[]) objArr[1];
        int i32 = f52434c;
        int i33 = (i32 & 33) + (i32 | 33);
        f52433b = i33 % 128;
        int i34 = i33 % 2;
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        int length = bArr2.length;
        int i35 = length & 2;
        int i36 = length | 2;
        byte[] bArr4 = new byte[(((i35 & i36) + (i36 | i35)) / 3) << 2];
        int length2 = bArr2.length;
        int i37 = -(bArr2.length % 3);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i38 = i37 * 495;
        int i39 = -(-(length2 * (-493)));
        int i40 = ((i38 ^ i39) | (i38 & i39)) << 1;
        int i41 = -(((~i38) & i39) | ((~i39) & i38));
        int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
        int i43 = ~length2;
        int i44 = (i37 | i43) * (-988);
        int i45 = ((((~i44) & i42) | ((~i42) & i44)) - (~(-(-((i42 & i44) << 1))))) - 1;
        int i46 = ~i37;
        int i47 = ((~i46) & length2) | (i46 & i43);
        int i48 = length2 & i46;
        int i49 = (i47 & i48) | (i47 ^ i48);
        int i50 = ~iCurrentTimeMillis;
        int i51 = (iCurrentTimeMillis | i50) & i50;
        int i52 = i49 & i51;
        int i53 = -(~(-(-((((~i52) & (i51 | i49)) | i52) * 494))));
        int i54 = (i45 ^ i53) + ((i53 & i45) << 1);
        int i55 = (i54 ^ (-1)) + (i54 << 1);
        int i56 = (i46 | i37) & i46;
        int i57 = i56 ^ i43;
        int i58 = i56 & i43;
        int i59 = ~((i58 & i57) | (i57 ^ i58));
        int i60 = i50 & length2;
        int i61 = (~i60) & (i50 | length2);
        int i62 = ~((i60 & i61) | (i61 ^ i60));
        int i63 = ((~i62) & i59) | ((~i59) & i62);
        int i64 = i59 & i62;
        int i65 = i37 ^ length2;
        int i66 = length2 & i37;
        int i67 = ((~((i66 & i65) | (i65 ^ i66))) | (i64 & i63) | (i63 ^ i64)) * 494;
        int i68 = (i55 & i67) + (i55 | i67);
        int i69 = f52433b + 36;
        int i70 = (i69 ^ (-1)) + (i69 << 1);
        f52434c = i70 % 128;
        int i71 = i70 % 2;
        int i72 = 0;
        int i73 = 0;
        while (i72 < i68) {
            int i74 = f52433b;
            int i75 = (-2) - ((((i74 | 26) << i23) - (26 ^ i74)) ^ (-1));
            f52434c = i75 % 128;
            int i76 = i75 % i24;
            System.currentTimeMillis();
            int i77 = i72 * (-623);
            int i78 = (-623) | i77;
            int i79 = (i78 << 1) - ((~((-623) & i77)) & i78);
            int i80 = (i79 & (-1249)) | ((~i79) & 1248);
            int i81 = (i79 & 1248) << i23;
            int i82 = (i80 & i81) + (i80 | i81);
            int i83 = i72 ^ (-2);
            int i84 = i72 & (-2);
            int i85 = ((i83 & i84) | (i83 ^ i84)) * 624;
            int i86 = i82 & i85;
            int i87 = ((i82 ^ i85) | i86) << i23;
            int i88 = -((i85 | i82) & (~i86));
            int i89 = (i87 & i88) + (i88 | i87);
            int i90 = -(-((((~i72) & i23) | i84 | (i72 & 1)) * 624));
            int i91 = i89 & i90;
            int i92 = (((i89 ^ i90) | i91) << i23) - ((i90 | i89) & (~i91));
            byte b10 = bArr2[i72];
            int i93 = i92 + 1;
            byte b11 = bArr2[i92];
            int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
            int i94 = i93 * (-215);
            int i95 = (217 & i94) + (i94 | 217);
            int i96 = iCurrentTimeMillis2 ^ 1;
            int i97 = ~iCurrentTimeMillis2;
            int i98 = iCurrentTimeMillis2 & i23;
            int i99 = (i96 ^ i98) | (i98 & i96);
            int i100 = ~i99;
            int i101 = -(~(-(-(((i99 | i100) & i100) * 216))));
            int i102 = ((i95 & i101) + (i101 | i95)) - i23;
            int i103 = ~i93;
            int i104 = (i103 & i23) | (i103 ^ 1);
            int i105 = i104 ^ i97;
            int i106 = i104 & i97;
            int i107 = -(-(((i105 ^ i106) | (i106 & i105)) * (-216)));
            int i108 = i102 & i107;
            int i109 = (i107 ^ i102) | i108;
            int i110 = (i108 ^ i109) + ((i109 & i108) << i23);
            int i111 = i97 & 1;
            int i112 = (i97 | i23) & (~i111);
            int i113 = ~((i111 & i112) | (i112 ^ i111));
            int i114 = i93 ^ i113;
            int i115 = i113 & i93;
            int i116 = -(-(((i115 & i114) | (i114 ^ i115)) * 216));
            int i117 = (((i110 ^ i116) | (i110 & i116)) << i23) - ((i116 & (~i110)) | ((~i116) & i110));
            byte b12 = bArr2[i93];
            int i118 = i73 + 1;
            bArr4[i73] = bArr3[(b10 & 255) >> i24];
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i119 = 828 - (~(i118 * 829));
            int i120 = ~i118;
            int i121 = ~(((~i120) & i25) | (i120 & 1) | (i25 & i120));
            int i122 = ~iCurrentTimeMillis3;
            int i123 = i122 | 1;
            int i124 = ((~i123) & i118) | (i120 & i123);
            int i125 = i123 & i118;
            int i126 = ~((i125 & i124) | (i124 ^ i125));
            int i127 = ((~i126) & i121) | ((~i121) & i126);
            int i128 = i126 & i121;
            int i129 = ((i128 & i127) | (i127 ^ i128)) * (-828);
            int i130 = (((~i129) & i119) | ((~i119) & i129)) + ((i129 & i119) << i23);
            int i131 = i118 & 1;
            int i132 = (~i131) & (i118 | 1);
            int i133 = i132 | i131;
            int i134 = i133 & i122;
            int i135 = (~i134) & (i122 | i133);
            int i136 = -(-(((i135 & i134) | (i135 ^ i134)) * (-828)));
            int i137 = i130 & i136;
            int i138 = -(-((i136 ^ i130) | i137));
            int i139 = (i137 ^ i138) + ((i138 & i137) << 1);
            int i140 = (~((i132 ^ i131) | (i131 & i132))) * 828;
            int i141 = (i139 & i140) + (i140 | i139);
            int i142 = (b10 & 3) << 4;
            int i143 = (b11 & 255) >> 4;
            bArr4[i118] = bArr3[(i142 & i143) | (i142 ^ i143)];
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i144 = -(-(i141 * (-864)));
            int i145 = 866 & i144;
            int i146 = (((i144 | 866) & (~i145)) - (~(-(-(i145 << 1))))) - 1;
            int i147 = ~i141;
            int i148 = ~iCurrentTimeMillis4;
            int i149 = ((-2) ^ i148) | ((-2) & i148);
            int i150 = ~i149;
            int i151 = (i149 | i150) & i150;
            int i152 = (~i151) & i147;
            int i153 = ~i147;
            int i154 = -(-(((i151 & i147) | i152 | (i151 & i153)) * (-865)));
            int i155 = i146 & i154;
            int i156 = i155 + ((i146 ^ i154) | i155);
            int i157 = i148 & 1;
            int i158 = (iCurrentTimeMillis4 & (-2)) | i157;
            int i159 = iCurrentTimeMillis4 & 1;
            int i160 = (i159 & i158) | (i158 ^ i159);
            int i161 = ~i160;
            int i162 = ((i160 | i161) & i161) * 865;
            int i163 = (i156 & i162) + (i162 | i156);
            int i164 = ((~i148) & i147) | (i148 & i153);
            int i165 = i147 & i148;
            int i166 = ~((i164 & i165) | (i164 ^ i165));
            int i167 = ~(i157 | (i148 ^ 1));
            int i168 = i166 & i167;
            int i169 = (i166 | i167) & (~i168);
            int i170 = -(-(((i169 & i168) | (i169 ^ i168)) * 865));
            int i171 = i163 & i170;
            int i172 = i171 + ((i170 ^ i163) | i171);
            int i173 = (b11 & 15) << 2;
            int i174 = (b12 & 255) >> 6;
            int i175 = i173 ^ i174;
            int i176 = i173 & i174;
            bArr4[i141] = bArr3[(i176 & i175) | (i175 ^ i176)];
            int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
            int i177 = i172 * 989;
            int i178 = ((-1975) ^ i177) + ((i177 & (-1975)) << 1);
            int i179 = (-2) & i172;
            int i180 = (~i179) & ((-2) | i172);
            int i181 = (i180 & i179) | (i180 ^ i179);
            int i182 = ~i181;
            int i183 = (i181 | i182) & i182;
            int i184 = iCurrentTimeMillis5 & i183;
            int i185 = (i183 | iCurrentTimeMillis5) & (~i184);
            int i186 = -(~(((i185 & i184) | (i185 ^ i184)) * 988));
            int i187 = ((i178 & i186) + (i186 | i178)) - 1;
            int i188 = ~i172;
            int i189 = i188 & 1;
            int i190 = (~i189) & (i188 | 1);
            int i191 = (i189 & i190) | (i190 ^ i189);
            int i192 = ~i191;
            int i193 = (i191 | i192) & i192;
            int i194 = ~iCurrentTimeMillis5;
            int i195 = ~(i194 | 1);
            int i196 = ((~i195) & i193) | ((~i193) & i195);
            int i197 = i193 & i195;
            int i198 = ((i197 & i196) | (i196 ^ i197)) * (-1976);
            int i199 = i187 & i198;
            int i200 = (i198 ^ i187) | i199;
            int i201 = (i199 & i200) + (i200 | i199);
            int i202 = (i188 & i194) | ((~i188) & iCurrentTimeMillis5);
            int i203 = iCurrentTimeMillis5 & i188;
            int i204 = (i203 & i202) | (i202 ^ i203);
            int i205 = ~i204;
            int i206 = (i204 | i205) & i205;
            int i207 = ((~i206) & i182) | ((~i182) & i206);
            int i208 = i206 & i182;
            int i209 = (i208 & i207) | (i207 ^ i208);
            int i210 = (i194 ^ i172) | (i194 & i172);
            int i211 = ~i210;
            int i212 = (i210 | i211) & i211;
            int i213 = i201 - (~(-(-(((i209 & i212) | (i209 ^ i212)) * 988))));
            i73 = (i213 ^ (-1)) + (i213 << 1);
            bArr4[i172] = bArr3[b12 & 63];
            int i214 = f52434c;
            int i215 = ((i214 & (-66)) | ((~i214) & 65)) + ((i214 & 65) << 1);
            f52433b = i215 % 128;
            int i216 = i215 % 2;
            i24 = 2;
            i72 = i117;
            i23 = 1;
            i25 = -2;
        }
        int i217 = i24;
        int length3 = (bArr2.length - (~(-i68))) - 1;
        if (length3 != 1) {
            if (length3 == i217) {
                int i218 = i72 + 1;
                byte b13 = bArr2[i72];
                byte b14 = bArr2[i218];
                int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
                int i219 = -(-(i73 * (-49)));
                int i220 = ((~i219) & 51) | (i219 & (-52));
                int i221 = (i219 & 51) << 1;
                int i222 = (i220 ^ i221) + ((i221 & i220) << 1);
                int i223 = ~iCurrentTimeMillis6;
                int i224 = i223 & 1;
                int i225 = -(-(((iCurrentTimeMillis6 & (-2)) | i224 | (iCurrentTimeMillis6 & 1)) * (-50)));
                int i226 = (i222 & i225) + (i225 | i222);
                int i227 = ~i73;
                int i228 = ((-2) ^ i227) | ((-2) & i227);
                int i229 = (i228 & i223) | ((~i228) & iCurrentTimeMillis6);
                int i230 = i228 & iCurrentTimeMillis6;
                int i231 = ~((i230 & i229) | (i229 ^ i230));
                int i232 = (i227 | i73) & i227;
                int i233 = ((~i223) & i232) | ((~i232) & i223);
                int i234 = i232 & i223;
                int i235 = (i234 & i233) | (i233 ^ i234);
                int i236 = -(~((i231 | (~((i235 & 1) | (i235 ^ 1)))) * 50));
                int i237 = (((i226 | i236) << 1) - (i236 ^ i226)) - 1;
                int i238 = (iCurrentTimeMillis6 | i223) & i223;
                int i239 = ~((i238 & i227) | (i227 ^ i238));
                int i240 = ~((i227 & 1) | (i227 ^ 1));
                int i241 = i239 & i240;
                int i242 = (i239 | i240) & (~i241);
                int i243 = (i242 & i241) | (i242 ^ i241);
                int i244 = ((i223 | 1) & (~i224)) | i224;
                int i245 = ~i244;
                int i246 = (i244 | i245) & i245;
                int i247 = -(-(((i243 & i246) | ((~i246) & i243) | ((~i243) & i246)) * 50));
                int i248 = i237 & i247;
                int i249 = ((((i237 ^ i247) | i248) << 1) - (~(-((i247 | i237) & (~i248))))) - 1;
                bArr4[i73] = bArr3[(b13 & 255) >> 2];
                int iCurrentTimeMillis7 = (int) System.currentTimeMillis();
                int i250 = -(-(i249 * (-520)));
                int i251 = 522 & i250;
                int i252 = (i250 ^ ResultCode.ERROR_TRUST_CERT_DATE_BEFOREVALIDITY) | i251;
                int i253 = ((i251 | i252) << 1) - (i252 ^ i251);
                int i254 = ~iCurrentTimeMillis7;
                int i255 = ~i249;
                int i256 = (i254 & i255) | ((~i254) & i249);
                int i257 = i254 & i249;
                int i258 = ~((i256 & i257) | (i256 ^ i257));
                int i259 = i258 ^ 1;
                int i260 = i258 & 1;
                int i261 = (((((i260 & i259) | (i259 ^ i260)) * (-1042)) + i253) - (~((i249 | iCurrentTimeMillis7) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))) - 1;
                int i262 = ~((-2) | i255);
                int i263 = ~(((-2) & i254) | (iCurrentTimeMillis7 & 1) | ((-2) & iCurrentTimeMillis7));
                int i264 = (i263 & i262) | (i262 ^ i263);
                int i265 = ((iCurrentTimeMillis7 | i254) & i254) | 1;
                int i266 = (i265 & i255) | ((~i265) & i249);
                int i267 = i265 & i249;
                int i268 = ~((i267 & i266) | (i266 ^ i267));
                int i269 = ((i268 & i264) | (i264 ^ i268)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY;
                int i270 = i261 & i269;
                int i271 = ((((i261 ^ i269) | i270) << 1) - (~(-((i269 | i261) & (~i270))))) - 1;
                int i272 = (b13 & 3) << 4;
                int i273 = (b14 & 255) >> 4;
                bArr4[i249] = bArr3[(i272 & i273) | ((~i273) & i272) | ((~i272) & i273)];
                int iCurrentTimeMillis8 = (int) System.currentTimeMillis();
                int i274 = i271 * (-565);
                int i275 = ((((~i274) & 567) | (i274 & (-568))) - (~((i274 & 567) << 1))) - 1;
                int i276 = (-2) & i271;
                int i277 = (~i276) & ((-2) | i271);
                int i278 = ~i271;
                int i279 = i276 | i277;
                int i280 = ~i279;
                int i281 = (i279 | i280) & i280;
                int i282 = (-2) & iCurrentTimeMillis8;
                int i283 = (~i282) & ((-2) | iCurrentTimeMillis8);
                int i284 = ~((i283 & i282) | (i283 ^ i282));
                int i285 = i281 & i284;
                int i286 = (i284 | i281) & (~i285);
                int i287 = -(-(((i286 & i285) | (i286 ^ i285)) * (-566)));
                int i288 = i275 | i287;
                int i289 = i288 << 1;
                int i290 = -((~(i287 & i275)) & i288);
                int i291 = (i289 & i290) + (i290 | i289);
                int i292 = i278 & 1;
                int i293 = (~i292) & (i278 | 1);
                int i294 = (~((i292 & i293) | (i293 ^ i292))) * 566;
                int i295 = i291 & i294;
                int i296 = i294 | i291;
                int i297 = (i295 & i296) + (i296 | i295);
                int i298 = (-2) & i278;
                int i299 = ((-2) | i278) & (~i298);
                int i300 = (i299 & i298) | (i299 ^ i298);
                int i301 = ((~iCurrentTimeMillis8) & i300) | ((~i300) & iCurrentTimeMillis8);
                int i302 = iCurrentTimeMillis8 & i300;
                int i303 = -(-((~((i302 & i301) | (i301 ^ i302))) * 566));
                int i304 = ((((i297 ^ i303) | (i297 & i303)) << 1) - (~(-((i303 & (~i297)) | ((~i303) & i297))))) - 1;
                bArr4[i271] = bArr3[(b14 & 15) << 2];
                bArr4[i304] = Base64.padSymbol;
                int i305 = f52433b;
                int i306 = i305 & 99;
                int i307 = i306 + ((i305 ^ 99) | i306);
                f52434c = i307 % 128;
                int i308 = i307 % 2;
            }
            i13 = 1;
        } else {
            byte b15 = bArr2[i72];
            int iCurrentTimeMillis9 = (int) System.currentTimeMillis();
            int i309 = -(-(i73 * 989));
            int i310 = ((-1975) ^ i309) + ((i309 & (-1975)) << 1);
            int i311 = (-2) | i73;
            int i312 = ~i311;
            int i313 = ((i312 & iCurrentTimeMillis9) | (iCurrentTimeMillis9 ^ i312)) * 988;
            int i314 = ((i310 | i313) << 1) - (i313 ^ i310);
            int i315 = ~i73;
            int i316 = i315 & (i315 | i73);
            int i317 = i316 & 1;
            int i318 = (~i317) & (i316 | 1);
            int i319 = (i317 & i318) | (i318 ^ i317);
            int i320 = ~i319;
            int i321 = (i319 | i320) & i320;
            int i322 = ~iCurrentTimeMillis9;
            int i323 = ~((i322 & (-2)) | ((~i322) & 1) | (i322 & 1));
            int i324 = ((~i321) & i323) | ((~i323) & i321);
            int i325 = i321 & i323;
            int i326 = (i314 - (~(-(-(((i325 & i324) | (i324 ^ i325)) * (-1976)))))) - 1;
            int i327 = (-2) & i73;
            int i328 = (~i327) & i311;
            int i329 = ~((i328 & i327) | (i328 ^ i327));
            int i330 = i316 ^ iCurrentTimeMillis9;
            int i331 = i316 & iCurrentTimeMillis9;
            int i332 = ~((i331 & i330) | (i330 ^ i331));
            int i333 = i329 & i332;
            int i334 = ((i332 | i329) & (~i333)) | i333;
            int i335 = (iCurrentTimeMillis9 | i322) & i322;
            int i336 = i335 ^ i73;
            int i337 = i335 & i73;
            int i338 = ~((i337 & i336) | (i336 ^ i337));
            int i339 = i334 ^ i338;
            int i340 = i338 & i334;
            int i341 = ((i340 & i339) | (i339 ^ i340)) * 988;
            int i342 = (((~i341) & i326) | ((~i326) & i341)) + ((i341 & i326) << 1);
            bArr4[i73] = bArr3[(b15 & 255) >> 2];
            int i343 = i342 ^ 1;
            int i344 = (((i342 & 1) | i343) << 1) - i343;
            bArr4[i342] = bArr3[(b15 & 3) << 4];
            int iCurrentTimeMillis10 = (int) System.currentTimeMillis();
            int i345 = -(-(i344 * (-622)));
            int i346 = (624 & i345) + (i345 | 624);
            int i347 = ~i344;
            int i348 = i347 & (i347 | i344);
            int i349 = i348 ^ 1;
            int i350 = i348 & 1;
            int i351 = (i349 ^ i350) | (i349 & i350);
            int i352 = i351 & iCurrentTimeMillis10;
            int i353 = (i351 | iCurrentTimeMillis10) & (~i352);
            int i354 = -(-((~((i353 & i352) | (i353 ^ i352))) * 623));
            int i355 = i346 & i354;
            int i356 = ((((i346 ^ i354) | i355) << 1) - (~(-((i346 | i354) & (~i355))))) - 1;
            int i357 = ~iCurrentTimeMillis10;
            int i358 = (-2) & i344;
            int i359 = ((-2) | i344) & (~i358);
            int i360 = (i359 & i358) | (i359 ^ i358);
            int i361 = ~i360;
            int i362 = (i360 | i361) & i361;
            int i363 = ((~i362) & i357) | ((~i357) & i362);
            int i364 = i357 & i362;
            int i365 = (((i364 & i363) | (i363 ^ i364)) * (-623)) + i356;
            int i366 = ~(i349 | i350);
            int i367 = i348 & iCurrentTimeMillis10;
            int i368 = ~(((i348 | iCurrentTimeMillis10) & (~i367)) | i367);
            int i369 = ((~i368) & i366) | ((~i366) & i368);
            int i370 = i368 & i366;
            int i371 = (i370 & i369) | (i369 ^ i370);
            int i372 = ~((iCurrentTimeMillis10 & 1) | (iCurrentTimeMillis10 ^ 1));
            int i373 = ((~i372) & i371) | ((~i371) & i372);
            int i374 = i372 & i371;
            int i375 = -(-(((i374 & i373) | (i373 ^ i374)) * 623));
            int i376 = ((~i375) & i365) | ((~i365) & i375);
            int i377 = (i375 & i365) << 1;
            bArr4[i344] = Base64.padSymbol;
            bArr4[(i376 & i377) + (i377 | i376)] = Base64.padSymbol;
            int i378 = f52434c;
            i13 = 1;
            int i379 = (((i378 & (-94)) | ((~i378) & 93)) - (~(-(-((i378 & 93) << 1))))) - 1;
            f52433b = i379 % 128;
            int i380 = i379 % 2;
        }
        Object[] objArr2 = new Object[i13];
        objArr2[0] = bArr4;
        String str2 = (String) acw.setDividerPadding(objArr2, 1446332990, -1446332990, (int) System.currentTimeMillis());
        int i381 = f52434c;
        int i382 = (i381 ^ 121) + ((i381 & 121) << 1);
        f52433b = i382 % 128;
        if (i382 % 2 == 0) {
            return str2;
        }
        int i383 = 26 / 0;
        return str2;
    }
}
