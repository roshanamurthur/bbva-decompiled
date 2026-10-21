package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import okio.Utf8;

/* JADX INFO: loaded from: classes10.dex */
public final class bff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final short[] f54690a = new short[128];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f54691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54692c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54693d = 1;

    static {
        byte[] bArr = new byte[112];
        f54691b = bArr;
        byte[] bArr2 = new byte[128];
        int i10 = 0;
        setX(new Object[]{bArr2, 0, 15, (byte) 1}, 518260285, -518260284, 0);
        setX(new Object[]{bArr2, 16, 31, (byte) 2}, 518260285, -518260284, 16);
        setX(new Object[]{bArr2, 32, 63, (byte) 3}, 518260285, -518260284, 32);
        setX(new Object[]{bArr2, 64, 65, (byte) 0}, 518260285, -518260284, 64);
        setX(new Object[]{bArr2, 66, 95, (byte) 4}, 518260285, -518260284, 66);
        setX(new Object[]{bArr2, 96, 96, (byte) 5}, 518260285, -518260284, 96);
        setX(new Object[]{bArr2, 97, 108, (byte) 6}, 518260285, -518260284, 97);
        setX(new Object[]{bArr2, 109, 109, (byte) 7}, 518260285, -518260284, 109);
        setX(new Object[]{bArr2, 110, 111, (byte) 6}, 518260285, -518260284, 110);
        setX(new Object[]{bArr2, 112, 112, (byte) 8}, 518260285, -518260284, 112);
        setX(new Object[]{bArr2, 113, 115, (byte) 9}, 518260285, -518260284, 113);
        setX(new Object[]{bArr2, 116, 116, (byte) 10}, 518260285, -518260284, 116);
        setX(new Object[]{bArr2, 117, 127, (byte) 0}, 518260285, -518260284, 117);
        int length = bArr.length;
        int i11 = ((length ^ (-1)) | length) << 1;
        int i12 = -(~length);
        setX(new Object[]{bArr, 0, Integer.valueOf((i11 & i12) + (i12 | i11)), (byte) -2}, 518260285, -518260284, 0);
        setX(new Object[]{bArr, 8, 11, (byte) -1}, 518260285, -518260284, 8);
        setX(new Object[]{bArr, 24, 27, (byte) 0}, 518260285, -518260284, 24);
        setX(new Object[]{bArr, 40, 43, (byte) 16}, 518260285, -518260284, 40);
        setX(new Object[]{bArr, 58, 59, (byte) 0}, 518260285, -518260284, 58);
        setX(new Object[]{bArr, 72, 73, (byte) 0}, 518260285, -518260284, 72);
        setX(new Object[]{bArr, 89, 91, (byte) 16}, 518260285, -518260284, 89);
        setX(new Object[]{bArr, 104, 104, (byte) 16}, 518260285, -518260284, 104);
        byte[] bArr3 = {0, 0, 0, 0, 31, 15, 15, 15, 7, 7, 7};
        byte[] bArr4 = {-2, -2, -2, -2, 0, 48, 16, 64, Constants.CVR_B1b85_0101_MOBILE_APP, 32, Constants.CVR_B1b85_0110_TERMINAL};
        int i13 = f54692c + 65;
        f54693d = i13 % 128;
        int i14 = i13 % 2;
        while (i10 < 128) {
            int i15 = f54693d;
            int i16 = (i15 & 97) + (i15 | 97);
            f54692c = i16 % 128;
            int i17 = i16 % 2;
            byte b10 = bArr2[i10];
            int i18 = bArr3[b10] & i10;
            byte b11 = bArr4[b10];
            short[] sArr = f54690a;
            int i19 = i18 << 8;
            int i20 = i19 & b11;
            int i21 = (b11 | i19) & (~i20);
            sArr[i10] = (short) ((i21 & i20) | (i21 ^ i20));
            int i22 = i10 ^ 104;
            int i23 = -(-((i10 & 104) << 1));
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            int i25 = i24 & (-103);
            i10 = (i25 - (~(-(-((i24 ^ (-103)) | i25))))) - 1;
            int i26 = (((i15 | 100) << 1) - (i15 ^ 100)) - 1;
            f54692c = i26 % 128;
            int i27 = i26 % 2;
        }
        int i28 = f54693d + 31;
        f54692c = i28 % 128;
        if (i28 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:21:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:22:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:26:0x010f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0142  */
    /* JADX WARN: Code duplicated, block: B:32:0x0143 A[LOOP:1: B:24:0x010c->B:32:0x0143, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x0244  */
    /* JADX WARN: Code duplicated, block: B:41:0x0246  */
    /* JADX WARN: Code duplicated, block: B:45:0x0263  */
    /* JADX WARN: Code duplicated, block: B:49:0x0279  */
    /* JADX WARN: Code duplicated, block: B:50:0x027f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0340  */
    /* JADX WARN: Code duplicated, block: B:72:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x02b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x02b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0266 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x024b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x021d A[SYNTHETIC] */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        Integer numValueOf;
        int i13;
        byte b10;
        int i14;
        byte b11;
        byte[] bArr;
        int i15;
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
        int i26 = ~i11;
        int i27 = ~(i26 | i12);
        int i28 = ~i12;
        int i29 = i27 | (~(i28 | i10));
        int i30 = ~(i28 | i11);
        int i31 = ~i10;
        int i32 = (((~(i31 | i11)) | i30) * LibMCryptConstants.IND_HEX_SEGMENTO2) + (((~(i12 | i26 | i31)) | (~(i31 | i28 | i11))) * LibMCryptConstants.IND_HEX_SEGMENTO2) + ((i29 | i30) * (-516)) + (i11 * 517) + (i10 * (-515));
        Throwable th2 = null;
        int i33 = 2;
        int i34 = 1;
        if (i32 == 1) {
            byte[] bArr2 = (byte[]) objArr[0];
            int iIntValue = ((Number) objArr[1]).intValue();
            int iIntValue2 = ((Number) objArr[2]).intValue();
            byte bByteValue = ((Byte) objArr[3]).byteValue();
            while (iIntValue <= iIntValue2) {
                int i35 = f54693d;
                int i36 = i35 & 69;
                int i37 = (i35 ^ 69) | i36;
                int i38 = ((i36 | i37) << 1) - (i36 ^ i37);
                f54692c = i38 % 128;
                int i39 = i38 % 2;
                bArr2[iIntValue] = bByteValue;
                int i40 = ((iIntValue ^ 1) | (iIntValue & 1)) << 1;
                int i41 = -(((~iIntValue) & 1) | (iIntValue & (-2)));
                iIntValue = (i41 | i40) + (i40 & i41);
                int i42 = i35 + 28;
                int i43 = (i42 ^ (-1)) + (i42 << 1);
                f54692c = i43 % 128;
                int i44 = i43 % 2;
            }
            int i45 = f54692c;
            int i46 = ((i45 ^ 102) + ((i45 & 102) << 1)) - 1;
            f54693d = i46 % 128;
            if (i46 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i32 == 2) {
            byte[] bArr3 = (byte[]) objArr[0];
            char[] cArr = (char[]) objArr[1];
            int i47 = f54693d;
            int i48 = i47 & 105;
            int i49 = (i47 | 105) & (~i48);
            int i50 = -(-(i48 << 1));
            int i51 = (i49 & i50) + (i50 | i49);
            f54692c = i51 % 128;
            if (i51 % 2 == 0) {
                int length = bArr3.length;
                return Integer.valueOf(((Integer) setX(new Object[]{bArr3, Integer.valueOf(length), cArr}, 1734852529, -1734852529, length)).intValue());
            }
            int length2 = bArr3.length;
            ((Integer) setX(new Object[]{bArr3, Integer.valueOf(length2), cArr}, 1734852529, -1734852529, length2)).intValue();
            throw null;
        }
        byte[] bArr4 = (byte[]) objArr[0];
        int iIntValue3 = ((Number) objArr[1]).intValue();
        char[] cArr2 = (char[]) objArr[2];
        int i52 = f54693d;
        int i53 = ((i52 ^ 104) + ((i52 & 104) << 1)) - 1;
        int i54 = i53 % 128;
        f54692c = i54;
        int i55 = i53 % 2;
        int i56 = i54 & 17;
        int i57 = i54 | 17;
        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
        f54693d = i58 % 128;
        int i59 = i58 % 2;
        int i60 = 0;
        int i61 = 0;
        while (true) {
            if (i60 < iIntValue3) {
                int i62 = f54693d;
                int i63 = ~i62;
                int i64 = ((i62 | 117) << i34) - ((i62 & (-118)) | (117 & i63));
                int i65 = i64 % 128;
                f54692c = i65;
                int i66 = -1;
                if (i64 % i33 != 0) {
                    int i67 = i60 & 63;
                    int i68 = i67 + ((i60 ^ 63) | i67);
                    int i69 = ((i68 | (-5)) << i34) - (i68 ^ (-5));
                    i13 = (i69 ^ (-1)) + (i69 << i34);
                    b10 = bArr4[i60];
                    if (b10 < 0) {
                        short s4 = f54690a[b10 & 127];
                        i14 = s4 >>> 8;
                        b11 = (byte) s4;
                        int i70 = i65 | 51;
                        int i71 = i70 << 1;
                        int i72 = -((~(i65 & 51)) & i70);
                        int i73 = (i71 ^ i72) + ((i72 & i71) << i34);
                        f54693d = i73 % 128;
                        int i74 = i73 % i33;
                        while (true) {
                            if (b11 >= 0) {
                                i23 = f54692c;
                                int i75 = (-2) - (((i23 ^ 88) + ((i23 & 88) << i34)) ^ i66);
                                f54693d = i75 % 128;
                                int i76 = i75 % i33;
                                if (i13 >= iIntValue3) {
                                    int i77 = (i23 ^ 77) + ((i23 & 77) << i34);
                                    int i78 = i77 % 128;
                                    f54693d = i78;
                                    int i79 = i77 % i33;
                                    int i80 = i78 & 13;
                                    int i81 = ((i78 ^ 13) | i80) << i34;
                                    int i82 = -((i78 | 13) & (~i80));
                                    i24 = (i81 & i82) + (i81 | i82);
                                    f54692c = i24 % 128;
                                    if (i24 % i33 != 0) {
                                        throw th2;
                                    }
                                    numValueOf = Integer.valueOf(i66);
                                } else {
                                    int i83 = (((i13 & (-2)) | ((~i13) & i34)) - (~((i13 & 1) << i34))) - i34;
                                    byte b12 = bArr4[i13];
                                    int i84 = i14 << 6;
                                    int i85 = b12 & 63;
                                    int i86 = i84 & i85;
                                    int i87 = (~i86) & (i84 | i85);
                                    int i88 = (i87 ^ i86) | (i87 & i86);
                                    byte[] bArr5 = f54691b;
                                    int i89 = (b12 & 255) >>> 4;
                                    int i90 = i89 * 905;
                                    int i91 = b11 * (-903);
                                    int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
                                    int i93 = ~i89;
                                    int i94 = i93 & iIntValue3;
                                    int i95 = (~i94) & (i93 | iIntValue3);
                                    int i96 = ~iIntValue3;
                                    int i97 = ~((i95 ^ i94) | (i95 & i94));
                                    int i98 = (i96 | iIntValue3) & i96;
                                    int i99 = i98 & b11;
                                    int i100 = (~i99) & (i98 | b11);
                                    int i101 = ~((i99 & i100) | (i100 ^ i99));
                                    int i102 = -(-(((i97 & i101) | (i97 ^ i101)) * (-1808)));
                                    int i103 = i92 & i102;
                                    int i104 = (i92 | i102) & (~i103);
                                    int i105 = -(-(i103 << 1));
                                    int i106 = ((i104 | i105) << 1) - (i104 ^ i105);
                                    int i107 = ~b11;
                                    int i108 = i93 & i107;
                                    int i109 = i108 | ((~i108) & (i93 | i107));
                                    int i110 = i109 ^ iIntValue3;
                                    int i111 = i109 & iIntValue3;
                                    int i112 = ~((i110 ^ i111) | (i111 & i110));
                                    int i113 = i96 & i89;
                                    byte[] bArr6 = bArr4;
                                    int i114 = (~i113) & (i96 | i89);
                                    int i115 = (i114 ^ i113) | (i114 & i113);
                                    int i116 = i115 & b11;
                                    int i117 = (i115 | b11) & (~i116);
                                    int i118 = ~((i117 & i116) | (i117 ^ i116));
                                    int i119 = ((~i118) & i112) | ((~i112) & i118);
                                    int i120 = i118 & i112;
                                    int i121 = ((i120 & i119) | (i119 ^ i120)) * 904;
                                    int i122 = (i106 ^ i121) + ((i121 & i106) << 1);
                                    int i123 = ~(i93 | b11);
                                    int i124 = ~((i107 & iIntValue3) | (i107 ^ iIntValue3));
                                    int i125 = (i123 & i124) | (i123 ^ i124);
                                    int i126 = (i96 & i93) | ((~i96) & i89);
                                    int i127 = ~((i126 & i113) | (i126 ^ i113));
                                    int i128 = i125 & i127;
                                    int i129 = (i125 | i127) & (~i128);
                                    int i130 = ((i129 & i128) | (i129 ^ i128)) * 904;
                                    b11 = bArr5[(i122 & i130) + (i130 | i122)];
                                    int i131 = i23 + 85;
                                    f54693d = i131 % 128;
                                    int i132 = i131 % 2;
                                    bArr4 = bArr6;
                                    i14 = i88;
                                    i13 = i83;
                                    th2 = null;
                                    i33 = 2;
                                    i34 = 1;
                                    i66 = -1;
                                }
                            } else {
                                bArr = bArr4;
                                if (b11 == -2) {
                                    int i133 = f54692c;
                                    i15 = ((((i133 ^ 61) | (i133 & 61)) << 1) - (~(-(((~i133) & 61) | (i133 & (-62)))))) - 1;
                                    f54693d = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                } else {
                                    if (i14 <= 65535) {
                                        int i134 = f54693d;
                                        int i135 = i134 & 45;
                                        int i136 = (i134 | 45) & (~i135);
                                        int i137 = -(-(i135 << 1));
                                        i17 = (i136 & i137) + (i136 | i137);
                                        i18 = i17 % 128;
                                        f54692c = i18;
                                        if (i17 % 2 == 0) {
                                            int length3 = cArr2.length;
                                            throw null;
                                        }
                                        if (i61 >= cArr2.length) {
                                            i19 = ((i18 ^ 7) - (~(-(-((i18 & 7) << 1))))) - 1;
                                            f54693d = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                int i138 = 10 / 0;
                                                i16 = -1;
                                            }
                                        } else {
                                            int i139 = i61 & (-22);
                                            int i140 = i61 | (-22);
                                            int i141 = ((i139 | i140) << 1) - (i139 ^ i140);
                                            int i142 = i141 ^ 23;
                                            int i143 = -(-((i141 & 23) << 1));
                                            int i144 = (i142 ^ i143) + ((i142 & i143) << 1);
                                            cArr2[i61] = (char) i14;
                                            int i145 = i18 ^ 15;
                                            int i146 = (i18 & 15) << 1;
                                            int i147 = (i145 ^ i146) + ((i146 & i145) << 1);
                                            f54693d = i147 % 128;
                                            int i148 = i147 % 2;
                                            i60 = i13;
                                            i61 = i144;
                                            bArr4 = bArr;
                                            th2 = null;
                                            i33 = 2;
                                            i34 = 1;
                                        }
                                    } else {
                                        int length4 = cArr2.length;
                                        int i149 = -(~(-(-(length4 * 829))));
                                        int i150 = (((-829) ^ i149) + ((i149 & (-829)) << 1)) - 1;
                                        int i151 = ~length4;
                                        int i152 = ~((i151 | length4) & i151);
                                        int i153 = ~iIntValue3;
                                        int i154 = (i153 | iIntValue3) & i153;
                                        int i155 = i154 | (~i154);
                                        int i156 = ~((i155 & length4) | (i155 & i151) | ((~i155) & length4));
                                        int i157 = i152 ^ i156;
                                        int i158 = i152 & i156;
                                        int i159 = ((i158 & i157) | (i157 ^ i158)) * (-828);
                                        int i160 = i150 & i159;
                                        int i161 = ((i150 ^ i159) | i160) << 1;
                                        int i162 = -((i159 | i150) & (~i160));
                                        int i163 = (i161 & i162) + (i162 | i161);
                                        i20 = (length4 & i151) | (i151 ^ length4);
                                        int i164 = i20 ^ i153;
                                        int i165 = i20 & i153;
                                        int i166 = -(-(((i164 & i165) | (i164 ^ i165)) * (-828)));
                                        int i167 = ((~i166) & i163) | ((~i163) & i166);
                                        int i168 = (i166 & i163) << 1;
                                        i21 = (i167 & i168) + (i168 | i167);
                                        i22 = ~i20;
                                        if (i61 >= (i21 - (~(-(-(((i20 | i22) & i22) * 828))))) - 1) {
                                            int i169 = f54693d;
                                            int i170 = (((i169 | 98) << 1) - (i169 ^ 98)) - 1;
                                            int i171 = i170 % 128;
                                            f54692c = i171;
                                            int i172 = i170 % 2;
                                            int i173 = i171 ^ 39;
                                            int i174 = ((i171 & 39) | i173) << 1;
                                            int i175 = -i173;
                                            int i176 = (i174 ^ i175) + ((i174 & i175) << 1);
                                            f54693d = i176 % 128;
                                            int i177 = i176 % 2;
                                        } else {
                                            int i178 = i61 + 1;
                                            int i179 = -(~(-(-(i14 >>> 10))));
                                            cArr2[i61] = (char) (((i179 ^ Utf8.HIGH_SURROGATE_HEADER) + ((i179 & Utf8.HIGH_SURROGATE_HEADER) << 1)) - 1);
                                            int i180 = i178 & 1;
                                            i61 = (((~i180) & (i178 | 1)) - (~(i180 << 1))) - 1;
                                            int i181 = i14 & 1023;
                                            cArr2[i178] = (char) (i181 | ((~i181) & 56320));
                                            int i182 = f54692c;
                                            int i183 = (((i182 | 4) << 1) - (i182 ^ 4)) - 1;
                                            f54693d = i183 % 128;
                                            int i184 = i183 % 2;
                                            i33 = 2;
                                            i34 = 1;
                                            i60 = i13;
                                            bArr4 = bArr;
                                            th2 = null;
                                        }
                                    }
                                    numValueOf = Integer.valueOf(i16);
                                }
                                i16 = -1;
                                numValueOf = Integer.valueOf(i16);
                            }
                        }
                    } else if (i61 >= cArr2.length) {
                        int i185 = i62 ^ 13;
                        int i186 = -(-((i62 & 13) << i34));
                        i25 = (i185 & i186) + (i185 | i186);
                        f54692c = i25 % 128;
                        if (i25 % i33 == 0) {
                            throw th2;
                        }
                        int i187 = i62 & 49;
                        int i188 = (i62 ^ 49) | i187;
                        int i189 = (i187 & i188) + (i187 | i188);
                        f54692c = i189 % 128;
                        int i190 = i189 % i33;
                        numValueOf = Integer.valueOf(i66);
                    } else {
                        int i191 = (((i61 & (-2)) | ((~i61) & i34)) - (~(-(-((i61 & 1) << i34))))) - i34;
                        cArr2[i61] = (char) b10;
                        int i192 = (i62 & (-112)) | (i63 & 111);
                        int i193 = (i62 & 111) << i34;
                        int i194 = ((i192 | i193) << i34) - (i192 ^ i193);
                        f54692c = i194 % 128;
                        int i195 = i194 % i33;
                        i60 = i13;
                        i61 = i191;
                    }
                } else {
                    int i196 = (i60 ^ (-22)) + ((i60 & (-22)) << i34);
                    i13 = ((i196 & 23) << i34) + (i196 ^ 23);
                    b10 = bArr4[i60];
                    if (b10 < 0) {
                        short s7 = f54690a[b10 & 127];
                        i14 = s7 >>> 8;
                        b11 = (byte) s7;
                        int i710 = i65 | 51;
                        int i711 = i710 << 1;
                        int i712 = -((~(i65 & 51)) & i710);
                        int i713 = (i711 ^ i712) + ((i712 & i711) << i34);
                        f54693d = i713 % 128;
                        int i714 = i713 % i33;
                        while (true) {
                            if (b11 >= 0) {
                                i23 = f54692c;
                                int i715 = (-2) - (((i23 ^ 88) + ((i23 & 88) << i34)) ^ i66);
                                f54693d = i715 % 128;
                                int i716 = i715 % i33;
                                if (i13 >= iIntValue3) {
                                    int i717 = (i23 ^ 77) + ((i23 & 77) << i34);
                                    int i718 = i717 % 128;
                                    f54693d = i718;
                                    int i719 = i717 % i33;
                                    int i810 = i718 & 13;
                                    int i811 = ((i718 ^ 13) | i810) << i34;
                                    int i812 = -((i718 | 13) & (~i810));
                                    i24 = (i811 & i812) + (i811 | i812);
                                    f54692c = i24 % 128;
                                    if (i24 % i33 != 0) {
                                        throw th2;
                                    }
                                    numValueOf = Integer.valueOf(i66);
                                } else {
                                    int i813 = (((i13 & (-2)) | ((~i13) & i34)) - (~((i13 & 1) << i34))) - i34;
                                    byte b13 = bArr4[i13];
                                    int i814 = i14 << 6;
                                    int i815 = b13 & 63;
                                    int i816 = i814 & i815;
                                    int i817 = (~i816) & (i814 | i815);
                                    int i818 = (i817 ^ i816) | (i817 & i816);
                                    byte[] bArr7 = f54691b;
                                    int i819 = (b13 & 255) >>> 4;
                                    int i910 = i819 * 905;
                                    int i911 = b11 * (-903);
                                    int i912 = ((i910 | i911) << 1) - (i910 ^ i911);
                                    int i913 = ~i819;
                                    int i914 = i913 & iIntValue3;
                                    int i915 = (~i914) & (i913 | iIntValue3);
                                    int i916 = ~iIntValue3;
                                    int i917 = ~((i915 ^ i914) | (i915 & i914));
                                    int i918 = (i916 | iIntValue3) & i916;
                                    int i919 = i918 & b11;
                                    int i1010 = (~i919) & (i918 | b11);
                                    int i1011 = ~((i919 & i1010) | (i1010 ^ i919));
                                    int i1012 = -(-(((i917 & i1011) | (i917 ^ i1011)) * (-1808)));
                                    int i1013 = i912 & i1012;
                                    int i1014 = (i912 | i1012) & (~i1013);
                                    int i1015 = -(-(i1013 << 1));
                                    int i1016 = ((i1014 | i1015) << 1) - (i1014 ^ i1015);
                                    int i1017 = ~b11;
                                    int i1018 = i913 & i1017;
                                    int i1019 = i1018 | ((~i1018) & (i913 | i1017));
                                    int i1110 = i1019 ^ iIntValue3;
                                    int i1111 = i1019 & iIntValue3;
                                    int i1112 = ~((i1110 ^ i1111) | (i1111 & i1110));
                                    int i1113 = i916 & i819;
                                    byte[] bArr8 = bArr4;
                                    int i1114 = (~i1113) & (i916 | i819);
                                    int i1115 = (i1114 ^ i1113) | (i1114 & i1113);
                                    int i1116 = i1115 & b11;
                                    int i1117 = (i1115 | b11) & (~i1116);
                                    int i1118 = ~((i1117 & i1116) | (i1117 ^ i1116));
                                    int i1119 = ((~i1118) & i1112) | ((~i1112) & i1118);
                                    int i1210 = i1118 & i1112;
                                    int i1211 = ((i1210 & i1119) | (i1119 ^ i1210)) * 904;
                                    int i1212 = (i1016 ^ i1211) + ((i1211 & i1016) << 1);
                                    int i1213 = ~(i913 | b11);
                                    int i1214 = ~((i1017 & iIntValue3) | (i1017 ^ iIntValue3));
                                    int i1215 = (i1213 & i1214) | (i1213 ^ i1214);
                                    int i1216 = (i916 & i913) | ((~i916) & i819);
                                    int i1217 = ~((i1216 & i1113) | (i1216 ^ i1113));
                                    int i1218 = i1215 & i1217;
                                    int i1219 = (i1215 | i1217) & (~i1218);
                                    int i1310 = ((i1219 & i1218) | (i1219 ^ i1218)) * 904;
                                    b11 = bArr7[(i1212 & i1310) + (i1310 | i1212)];
                                    int i1311 = i23 + 85;
                                    f54693d = i1311 % 128;
                                    int i1312 = i1311 % 2;
                                    bArr4 = bArr8;
                                    i14 = i818;
                                    i13 = i813;
                                    th2 = null;
                                    i33 = 2;
                                    i34 = 1;
                                    i66 = -1;
                                }
                            } else {
                                bArr = bArr4;
                                if (b11 == -2) {
                                    int i1313 = f54692c;
                                    i15 = ((((i1313 ^ 61) | (i1313 & 61)) << 1) - (~(-(((~i1313) & 61) | (i1313 & (-62)))))) - 1;
                                    f54693d = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        throw null;
                                    }
                                } else {
                                    if (i14 <= 65535) {
                                        int i1314 = f54693d;
                                        int i1315 = i1314 & 45;
                                        int i1316 = (i1314 | 45) & (~i1315);
                                        int i1317 = -(-(i1315 << 1));
                                        i17 = (i1316 & i1317) + (i1316 | i1317);
                                        i18 = i17 % 128;
                                        f54692c = i18;
                                        if (i17 % 2 == 0) {
                                            int length5 = cArr2.length;
                                            throw null;
                                        }
                                        if (i61 >= cArr2.length) {
                                            i19 = ((i18 ^ 7) - (~(-(-((i18 & 7) << 1))))) - 1;
                                            f54693d = i19 % 128;
                                            if (i19 % 2 == 0) {
                                                int i1318 = 10 / 0;
                                                i16 = -1;
                                            }
                                        } else {
                                            int i1319 = i61 & (-22);
                                            int i1410 = i61 | (-22);
                                            int i1411 = ((i1319 | i1410) << 1) - (i1319 ^ i1410);
                                            int i1412 = i1411 ^ 23;
                                            int i1413 = -(-((i1411 & 23) << 1));
                                            int i1414 = (i1412 ^ i1413) + ((i1412 & i1413) << 1);
                                            cArr2[i61] = (char) i14;
                                            int i1415 = i18 ^ 15;
                                            int i1416 = (i18 & 15) << 1;
                                            int i1417 = (i1415 ^ i1416) + ((i1416 & i1415) << 1);
                                            f54693d = i1417 % 128;
                                            int i1418 = i1417 % 2;
                                            i60 = i13;
                                            i61 = i1414;
                                            bArr4 = bArr;
                                            th2 = null;
                                            i33 = 2;
                                            i34 = 1;
                                        }
                                    } else {
                                        int length6 = cArr2.length;
                                        int i1419 = -(~(-(-(length6 * 829))));
                                        int i1510 = (((-829) ^ i1419) + ((i1419 & (-829)) << 1)) - 1;
                                        int i1511 = ~length6;
                                        int i1512 = ~((i1511 | length6) & i1511);
                                        int i1513 = ~iIntValue3;
                                        int i1514 = (i1513 | iIntValue3) & i1513;
                                        int i1515 = i1514 | (~i1514);
                                        int i1516 = ~((i1515 & length6) | (i1515 & i1511) | ((~i1515) & length6));
                                        int i1517 = i1512 ^ i1516;
                                        int i1518 = i1512 & i1516;
                                        int i1519 = ((i1518 & i1517) | (i1517 ^ i1518)) * (-828);
                                        int i1610 = i1510 & i1519;
                                        int i1611 = ((i1510 ^ i1519) | i1610) << 1;
                                        int i1612 = -((i1519 | i1510) & (~i1610));
                                        int i1613 = (i1611 & i1612) + (i1612 | i1611);
                                        i20 = (length6 & i1511) | (i1511 ^ length6);
                                        int i1614 = i20 ^ i1513;
                                        int i1615 = i20 & i1513;
                                        int i1616 = -(-(((i1614 & i1615) | (i1614 ^ i1615)) * (-828)));
                                        int i1617 = ((~i1616) & i1613) | ((~i1613) & i1616);
                                        int i1618 = (i1616 & i1613) << 1;
                                        i21 = (i1617 & i1618) + (i1618 | i1617);
                                        i22 = ~i20;
                                        if (i61 >= (i21 - (~(-(-(((i20 | i22) & i22) * 828))))) - 1) {
                                            int i1619 = f54693d;
                                            int i1710 = (((i1619 | 98) << 1) - (i1619 ^ 98)) - 1;
                                            int i1711 = i1710 % 128;
                                            f54692c = i1711;
                                            int i1712 = i1710 % 2;
                                            int i1713 = i1711 ^ 39;
                                            int i1714 = ((i1711 & 39) | i1713) << 1;
                                            int i1715 = -i1713;
                                            int i1716 = (i1714 ^ i1715) + ((i1714 & i1715) << 1);
                                            f54693d = i1716 % 128;
                                            int i1717 = i1716 % 2;
                                        } else {
                                            int i1718 = i61 + 1;
                                            int i1719 = -(~(-(-(i14 >>> 10))));
                                            cArr2[i61] = (char) (((i1719 ^ Utf8.HIGH_SURROGATE_HEADER) + ((i1719 & Utf8.HIGH_SURROGATE_HEADER) << 1)) - 1);
                                            int i1810 = i1718 & 1;
                                            i61 = (((~i1810) & (i1718 | 1)) - (~(i1810 << 1))) - 1;
                                            int i1811 = i14 & 1023;
                                            cArr2[i1718] = (char) (i1811 | ((~i1811) & 56320));
                                            int i1812 = f54692c;
                                            int i1813 = (((i1812 | 4) << 1) - (i1812 ^ 4)) - 1;
                                            f54693d = i1813 % 128;
                                            int i1814 = i1813 % 2;
                                            i33 = 2;
                                            i34 = 1;
                                            i60 = i13;
                                            bArr4 = bArr;
                                            th2 = null;
                                        }
                                    }
                                    numValueOf = Integer.valueOf(i16);
                                }
                                i16 = -1;
                                numValueOf = Integer.valueOf(i16);
                            }
                        }
                    } else if (i61 >= cArr2.length) {
                        int i1815 = i62 ^ 13;
                        int i1816 = -(-((i62 & 13) << i34));
                        i25 = (i1815 & i1816) + (i1815 | i1816);
                        f54692c = i25 % 128;
                        if (i25 % i33 == 0) {
                            throw th2;
                        }
                        int i1817 = i62 & 49;
                        int i1818 = (i62 ^ 49) | i1817;
                        int i1819 = (i1817 & i1818) + (i1817 | i1818);
                        f54692c = i1819 % 128;
                        int i197 = i1819 % i33;
                        numValueOf = Integer.valueOf(i66);
                    } else {
                        int i198 = (((i61 & (-2)) | ((~i61) & i34)) - (~(-(-((i61 & 1) << i34))))) - i34;
                        cArr2[i61] = (char) b10;
                        int i199 = (i62 & (-112)) | (i63 & 111);
                        int i1910 = (i62 & 111) << i34;
                        int i1911 = ((i199 | i1910) << i34) - (i199 ^ i1910);
                        f54692c = i1911 % 128;
                        int i1912 = i1911 % i33;
                        i60 = i13;
                        i61 = i198;
                    }
                }
            } else {
                int i200 = f54692c + i34;
                f54693d = i200 % 128;
                int i201 = i200 % i33;
                numValueOf = Integer.valueOf(i61);
            }
            return numValueOf;
        }
    }

    public static int setY(byte[] bArr, char[] cArr) {
        return ((Integer) setX(new Object[]{bArr, cArr}, 1424297102, -1424297100, (int) System.currentTimeMillis())).intValue();
    }
}
