package com.mypinpad.tsdk.isolation;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class azf extends azg {
    public static int E0 = 0;
    public static int F0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final short[][][] f54198s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54199t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final short[][][] f54200u0;
    public final short[][][] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final short[][][] f54201w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final short[][][] f54202x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final short[][][] f54203y0;

    public azf(aze azeVar, byte[] bArr) {
        super(false, azeVar);
        int iIntValue = ((Integer) aze.setX(new Object[]{azeVar}, 1425583287, -1425583286, System.identityHashCode(azeVar))).intValue();
        int iIntValue2 = ((Integer) aze.setX(new Object[]{azeVar}, 1815361799, -1815361791, System.identityHashCode(azeVar))).intValue();
        aze y7 = setY();
        if (((q2) aze.setX(new Object[]{y7}, -2092851425, 2092851430, System.identityHashCode(y7))) == q2.setX) {
            this.f54198s0 = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, iIntValue, iIntValue2, iIntValue2);
            int i10 = 0;
            int i11 = 0;
            while (i10 < iIntValue2) {
                int i12 = 0;
                while (i12 < iIntValue2) {
                    for (int i13 = 0; i13 < iIntValue; i13++) {
                        short[][][] sArr = this.f54198s0;
                        if (i10 > i12) {
                            sArr[i13][i10][i12] = 0;
                        } else {
                            sArr[i13][i10][i12] = (short) (bArr[i11] & 255);
                            int i14 = i11 & 22;
                            int i15 = ((i11 ^ 22) | i14) << 1;
                            int i16 = -((i11 | 22) & (~i14));
                            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                            i11 = ((i17 ^ (-20)) + ((i17 & (-20)) << 1)) - 1;
                        }
                    }
                    int i18 = ((i12 ^ 1) | (i12 & 1)) << 1;
                    int i19 = -(((~i12) & 1) | (i12 & (-2)));
                    i12 = (i19 | i18) + (i18 & i19);
                }
                int i20 = i10 & (-59);
                int i21 = (i10 | (-59)) & (~i20);
                int i22 = i20 << 1;
                int i23 = ((i21 | i22) << 1) - (i21 ^ i22);
                int i24 = i23 & 60;
                int i25 = i23 | 60;
                i10 = ((i24 | i25) << 1) - (i24 ^ i25);
            }
            return;
        }
        this.f54199t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 0, Integer.valueOf(((Integer) aze.setX(new Object[0], -595593198, 595593202, (int) System.currentTimeMillis())).intValue())}, 525237936, -525237917, 0);
        int[] iArr = {((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, 495303548, -495303545, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue()};
        Class cls = Short.TYPE;
        short[][][] sArr2 = (short[][][]) Array.newInstance((Class<?>) cls, iArr);
        this.f54200u0 = sArr2;
        short[][][] sArr3 = (short[][][]) Array.newInstance((Class<?>) cls, ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue());
        this.v0 = sArr3;
        short[][][] sArr4 = (short[][][]) Array.newInstance((Class<?>) cls, ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue());
        this.f54201w0 = sArr4;
        short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue());
        this.f54202x0 = sArr5;
        short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue(), ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue());
        this.f54203y0 = sArr6;
        Boolean bool = Boolean.FALSE;
        int iIntValue3 = ((Integer) p2.d(new Object[]{sArr2, bArr, 32, bool}, -1043887544, 1043887552, 32)).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i26 = iIntValue3 * (-183);
        int i27 = i26 & 5920;
        int i28 = ((~i27) & (i26 | 5920)) + (i27 << 1);
        int i29 = ~iIntValue3;
        int i30 = (i29 | iIntValue3) & i29;
        int i31 = i30 & 32;
        int i32 = (~i31) & (i30 | 32);
        int i33 = -(-(((i31 & i32) | (i32 ^ i31)) * (-368)));
        int i34 = (((~i33) & i28) | ((~i28) & i33)) + ((i33 & i28) << 1);
        int i35 = (iIntValue3 ^ (-33)) | (iIntValue3 & (-33));
        int i36 = ~iCurrentTimeMillis;
        int i37 = ((i35 & i36) | (i35 ^ i36)) * 184;
        int i38 = (i34 & i37) + (i37 | i34);
        int i39 = (i29 & 32) | ((~i29) & (-33));
        int i40 = i29 & (-33);
        int i41 = ~((i39 & i40) | (i39 ^ i40));
        int i42 = ~((i36 ^ iIntValue3) | (i36 & iIntValue3));
        int i43 = ((~i42) & i41) | ((~i41) & i42);
        int i44 = i41 & i42;
        int i45 = (i44 & i43) | (i43 ^ i44);
        int i46 = iIntValue3 & 32;
        int i47 = (32 | iIntValue3) & (~i46);
        int i48 = (i47 & i46) | (i47 ^ i46);
        int i49 = ~i48;
        int i50 = (i48 | i49) & i49;
        int i51 = i45 & i50;
        int i52 = (i45 | i50) & (~i51);
        int i53 = -(-(((i52 & i51) | (i52 ^ i51)) * 184));
        int i54 = i38 & i53;
        int i55 = ((i38 ^ i53) | i54) << 1;
        int i56 = -((i53 | i38) & (~i54));
        int i57 = ((i55 | i56) << 1) - (i56 ^ i55);
        Boolean bool2 = Boolean.TRUE;
        int iIntValue4 = ((Integer) p2.d(new Object[]{sArr3, bArr, Integer.valueOf(i57), bool2}, -1043887544, 1043887552, i57)).intValue();
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i58 = iIntValue4 * 595;
        int i59 = i57 * (-1187);
        int i60 = ((i58 | i59) << 1) - (i58 ^ i59);
        int i61 = ~iIntValue4;
        int i62 = ~i57;
        int i63 = (i61 & i62) | ((~i61) & i57);
        int i64 = i61 & i57;
        int i65 = (i63 ^ i64) | (i63 & i64);
        int i66 = ~i65;
        int i67 = i66 & (i65 | i66);
        int i68 = ~iCurrentTimeMillis2;
        int i69 = (i68 & i62) | ((~i68) & i57);
        int i70 = i68 & i57;
        int i71 = ~((i69 ^ i70) | (i69 & i70));
        int i72 = ((~i71) & i67) | ((~i67) & i71);
        int i73 = i71 & i67;
        int i74 = ((i73 & i72) | (i72 ^ i73)) * (-1188);
        int i75 = i60 & i74;
        int i76 = i75 + ((i74 ^ i60) | i75);
        int i77 = (~i64) & (i61 | i57);
        int i78 = ~((i77 & i64) | (i77 ^ i64));
        int i79 = (i62 | i57) & i62;
        int i80 = ~((i79 & iCurrentTimeMillis2) | (i79 ^ iCurrentTimeMillis2));
        int i81 = ((~i80) & i78) | ((~i78) & i80);
        int i82 = i78 & i80;
        int i83 = (i82 & i81) | (i81 ^ i82);
        int i84 = i68 & iIntValue4;
        int i85 = (~i84) & (i68 | iIntValue4);
        int i86 = (i84 & i85) | (i85 ^ i84);
        int i87 = ~i86;
        int i88 = (i86 | i87) & i87;
        int i89 = i83 & i88;
        int i90 = (i83 | i88) & (~i89);
        int i91 = ((i90 & i89) | (i90 ^ i89)) * 594;
        int i92 = ((((i76 ^ i91) | (i76 & i91)) << 1) - (~(-((i91 & (~i76)) | ((~i91) & i76))))) - 1;
        int i93 = (i68 | iCurrentTimeMillis2) & i68;
        int i94 = i62 & i93;
        int i95 = (~i94) & (i62 | i93);
        int i96 = ~((i94 & i95) | (i95 ^ i94));
        int i97 = i62 & iIntValue4;
        int i98 = (~i97) & (i62 | iIntValue4);
        int i99 = ~((i97 & i98) | (i98 ^ i97));
        int i100 = (i96 & i99) | ((~i99) & i96) | ((~i96) & i99);
        int i101 = i93 & iIntValue4;
        int i102 = ~(((i93 | iIntValue4) & (~i101)) | i101);
        int i103 = i100 & i102;
        int i104 = (i102 | i100) & (~i103);
        int i105 = (-2) - ((i92 - (~(-(-(((i104 & i103) | (i104 ^ i103)) * 594))))) ^ (-1));
        int iIntValue5 = ((Integer) p2.d(new Object[]{sArr4, bArr, Integer.valueOf(i105), bool}, -1043887544, 1043887552, i105)).intValue();
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i106 = iIntValue5 * 367;
        int i107 = -(~(-(-(i105 * 367))));
        int i108 = (((i106 | i107) << 1) - (i106 ^ i107)) - 1;
        int i109 = iIntValue5 & i105;
        int i110 = (~i109) & (iIntValue5 | i105);
        int i111 = ~i105;
        int i112 = ((i109 & i110) | (i110 ^ i109)) * (-366);
        int i113 = ((i108 ^ i112) | (i108 & i112)) << 1;
        int i114 = -((i112 & (~i108)) | ((~i112) & i108));
        int i115 = (i113 & i114) + (i114 | i113);
        int i116 = (i111 | i105) & i111;
        int i117 = (i116 & iCurrentTimeMillis3) | (i116 ^ iCurrentTimeMillis3);
        int i118 = ~i117;
        int i119 = (i117 | i118) & i118;
        int i120 = iIntValue5 & i119;
        int i121 = (i119 | iIntValue5) & (~i120);
        int i122 = ((i121 & i120) | (i121 ^ i120)) * (-366);
        int i123 = i115 & i122;
        int i124 = -(-((i122 ^ i115) | i123));
        int i125 = ((i123 | i124) << 1) - (i124 ^ i123);
        int i126 = ~iIntValue5;
        int i127 = i126 & (i126 | iIntValue5);
        int i128 = ~((i105 & i127) | (i127 & i111) | ((~i127) & i105));
        int i129 = i111 & iIntValue5;
        int i130 = ((iIntValue5 | i111) & (~i129)) | i129;
        int i131 = i130 ^ iCurrentTimeMillis3;
        int i132 = i130 & iCurrentTimeMillis3;
        int i133 = ~((i132 & i131) | (i131 ^ i132));
        int i134 = ((~i133) & i128) | ((~i128) & i133);
        int i135 = i128 & i133;
        int i136 = ((i135 & i134) | (i134 ^ i135)) * 366;
        int i137 = (i125 & i136) + (i136 | i125);
        int iIntValue6 = ((Integer) p2.d(new Object[]{sArr5, bArr, Integer.valueOf(i137), bool2}, -1043887544, 1043887552, i137)).intValue();
        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
        int i138 = iIntValue6 * 755;
        int i139 = -(-(i137 * (-753)));
        int i140 = (i138 & i139) + (i138 | i139);
        int i141 = ~iIntValue6;
        int i142 = (i141 | iIntValue6) & i141;
        int i143 = (i142 ^ i137) | (i142 & i137);
        int i144 = ~i143;
        int i145 = (i143 | i144) & i144;
        int i146 = ~iCurrentTimeMillis4;
        int i147 = (i141 & i146) | ((~i141) & iCurrentTimeMillis4);
        int i148 = i141 & iCurrentTimeMillis4;
        int i149 = ~((i147 & i148) | (i147 ^ i148));
        int i150 = i145 & i149;
        int i151 = ((i145 | i149) & (~i150)) | i150;
        int i152 = ~((i137 ^ iCurrentTimeMillis4) | (i137 & iCurrentTimeMillis4));
        int i153 = i151 & i152;
        int i154 = (i151 | i152) & (~i153);
        int i155 = -(~(((i154 & i153) | (i154 ^ i153)) * (-754)));
        int i156 = ((i140 ^ i155) + ((i140 & i155) << 1)) - 1;
        int i157 = (i141 & i137) | (i141 ^ i137);
        int i158 = (i157 & iCurrentTimeMillis4) | (i157 ^ iCurrentTimeMillis4);
        int i159 = ~i158;
        int i160 = (i158 | i159) & i159;
        int i161 = iIntValue6 | i146;
        int i162 = i161 & i137;
        int i163 = (i161 | i137) & (~i162);
        int i164 = ~((i163 & i162) | (i163 ^ i162));
        int i165 = ((~i164) & i160) | ((~i160) & i164);
        int i166 = i164 & i160;
        int i167 = -(-(((i166 & i165) | (i165 ^ i166)) * (-754)));
        int i168 = i156 ^ i167;
        int i169 = (((i167 & i156) | i168) << 1) - i168;
        int i170 = (i146 | iCurrentTimeMillis4) & i146;
        int i171 = i142 & i170;
        int i172 = (i170 | i142) & (~i171);
        int i173 = -(-(((i172 & i171) | (i172 ^ i171)) * 754));
        int i174 = i169 ^ i173;
        int i175 = ((i169 & i173) | i174) << 1;
        int i176 = -i174;
        int i177 = ((i175 | i176) << 1) - (i175 ^ i176);
        int iIntValue7 = ((Integer) p2.d(new Object[]{sArr6, bArr, Integer.valueOf(i177), bool2}, -1043887544, 1043887552, i177)).intValue();
        int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
        int i178 = iIntValue7 * (-518);
        int i179 = i177 * (-518);
        int i180 = (((i178 ^ i179) | (i178 & i179)) << 1) - (((~i178) & i179) | ((~i179) & i178));
        int i181 = ~iIntValue7;
        int i182 = ~iCurrentTimeMillis5;
        int i183 = (i182 | iCurrentTimeMillis5) & i182;
        int i184 = ((~i183) & i181) | ((~i181) & i183);
        int i185 = i181 & i183;
        int i186 = ~((i184 & i185) | (i184 ^ i185));
        int i187 = ((~i186) & i177) | ((~i177) & i186);
        int i188 = i186 & i177;
        int i189 = (i180 - (~(-(~(((i188 & i187) | (i187 ^ i188)) * 519))))) - 1;
        int i190 = (i189 ^ (-1)) + (i189 << 1);
        int i191 = i181 ^ i183;
        int i192 = (i191 & i185) | (i191 ^ i185);
        int i193 = (i192 & i177) | (i192 ^ i177);
        int i194 = ~i193;
        int i195 = (i193 | i194) & i194;
        int i196 = iIntValue7 & i177;
        int i197 = (~i196) & (iIntValue7 | i177);
        int i198 = (i196 & i197) | (i197 ^ i196);
        int i199 = (i182 & i198) | ((~i198) & iCurrentTimeMillis5);
        int i200 = i198 & iCurrentTimeMillis5;
        int i201 = ~((i199 & i200) | (i199 ^ i200));
        if (((iIntValue7 | (~(iCurrentTimeMillis5 | i177))) * 519) + (((i195 & i201) | ((~i201) & i195) | ((~i195) & i201)) * (-519)) + i190 != bArr.length) {
            throw new IllegalArgumentException("unparsed data in key encoding");
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        byte[] bArr;
        azf azfVar = (azf) objArr[0];
        int i13 = F0;
        int i14 = i13 & 103;
        int i15 = ((i13 ^ 103) | i14) << 1;
        int i16 = -((i13 | 103) & (~i14));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        E0 = i17 % 128;
        int i18 = i17 % 2;
        aze y7 = azfVar.setY();
        if (((q2) aze.setX(new Object[]{y7}, -2092851425, 2092851430, System.identityHashCode(y7))) != q2.setX) {
            int i19 = F0;
            int i20 = i19 & 13;
            int i21 = ((((i19 ^ 13) | i20) << 1) - (~(-((i19 | 13) & (~i20))))) - 1;
            E0 = i21 % 128;
            int i22 = i21 % 2;
            Boolean bool = Boolean.FALSE;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{azfVar.f54199t0, (byte[]) p2.d(new Object[]{azfVar.f54200u0, bool}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            Boolean bool2 = Boolean.TRUE;
            bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2, (byte[]) p2.d(new Object[]{azfVar.v0, bool2}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azfVar.f54201w0, bool}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azfVar.f54202x0, bool2}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azfVar.f54203y0, bool2}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            int i23 = E0;
            int i24 = i23 | 123;
            int i25 = ((i24 << 1) - (~(-((~(i23 & 123)) & i24)))) - 1;
            F0 = i25 % 128;
            if (i25 % 2 == 0) {
                throw null;
            }
        } else {
            bArr = (byte[]) p2.d(new Object[]{azfVar.f54198s0, Boolean.TRUE}, 305922125, -305922124, (int) System.currentTimeMillis());
            int i26 = E0;
            int i27 = (i26 ^ 37) + ((i26 & 37) << 1);
            F0 = i27 % 128;
            if (i27 % 2 == 0) {
                throw null;
            }
        }
        return bArr;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 480823829, -480823829, System.identityHashCode(this));
    }
}
