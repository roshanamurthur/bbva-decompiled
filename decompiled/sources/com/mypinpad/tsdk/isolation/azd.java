package com.mypinpad.tsdk.isolation;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes10.dex */
public final class azd extends azg {
    public static int L0 = 0;
    public static int M0 = 1;
    public final short[][][] E0;
    public final short[][][] F0;
    public final short[][][] G0;
    public final short[][][] H0;
    public final short[][][] I0;
    public final byte[] J0;
    public final byte[] K0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54184s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final short[][] f54185t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final short[][] f54186u0;
    public final short[][] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final short[][] f54187w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final short[][][] f54188x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final short[][][] f54189y0;

    public azd(aze azeVar, byte[] bArr) {
        super(true, azeVar);
        if (((q2) aze.setX(new Object[]{azeVar}, -2092851425, 2092851430, System.identityHashCode(azeVar))) == q2.setDividerPadding) {
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 0, Integer.valueOf(((Integer) aze.setX(new Object[0], -595593198, 595593202, (int) System.currentTimeMillis())).intValue())}, 525237936, -525237917, 0);
            this.J0 = bArr2;
            int iIntValue = ((Integer) aze.setX(new Object[0], -595593198, 595593202, (int) System.currentTimeMillis())).intValue();
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(iIntValue), 64}, 525237936, -525237917, iIntValue);
            this.f54184s0 = bArr3;
            o2 o2Var = new o2(azeVar, bArr2, bArr3);
            azd azdVar = (azd) o2.b(new Object[]{o2Var}, 1398733853, -1398733849, System.identityHashCode(o2Var));
            this.K0 = azdVar.K0;
            this.f54185t0 = azdVar.f54185t0;
            this.f54186u0 = azdVar.f54186u0;
            this.v0 = azdVar.v0;
            this.f54187w0 = azdVar.f54187w0;
            this.f54188x0 = azdVar.f54188x0;
            this.f54189y0 = azdVar.f54189y0;
            this.E0 = azdVar.E0;
            this.F0 = azdVar.F0;
            this.G0 = azdVar.G0;
            this.H0 = azdVar.H0;
            this.I0 = azdVar.I0;
            return;
        }
        int iIntValue2 = ((Integer) aze.setX(new Object[]{azeVar}, 495303548, -495303545, System.identityHashCode(azeVar))).intValue();
        int iIntValue3 = ((Integer) aze.setX(new Object[]{azeVar}, 1889555108, -1889555108, System.identityHashCode(azeVar))).intValue();
        int iIntValue4 = ((Integer) aze.setX(new Object[]{azeVar}, -1471741731, 1471741733, System.identityHashCode(azeVar))).intValue();
        Class cls = Short.TYPE;
        short[][] sArr = (short[][]) Array.newInstance((Class<?>) cls, iIntValue3, iIntValue4);
        this.f54185t0 = sArr;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) cls, iIntValue2, iIntValue3);
        this.f54186u0 = sArr2;
        short[][] sArr3 = (short[][]) Array.newInstance((Class<?>) cls, iIntValue2, iIntValue4);
        this.f54187w0 = sArr3;
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) cls, iIntValue3, iIntValue4);
        this.v0 = sArr4;
        short[][][] sArr5 = (short[][][]) Array.newInstance((Class<?>) cls, iIntValue3, iIntValue2, iIntValue2);
        this.f54188x0 = sArr5;
        short[][][] sArr6 = (short[][][]) Array.newInstance((Class<?>) cls, iIntValue3, iIntValue2, iIntValue3);
        this.f54189y0 = sArr6;
        short[][][] sArr7 = (short[][][]) Array.newInstance((Class<?>) cls, iIntValue4, iIntValue2, iIntValue2);
        this.E0 = sArr7;
        short[][][] sArr8 = (short[][][]) Array.newInstance((Class<?>) cls, iIntValue4, iIntValue2, iIntValue3);
        this.F0 = sArr8;
        short[][][] sArr9 = (short[][][]) Array.newInstance((Class<?>) cls, iIntValue4, iIntValue2, iIntValue4);
        this.G0 = sArr9;
        short[][][] sArr10 = (short[][][]) Array.newInstance((Class<?>) cls, iIntValue4, iIntValue3, iIntValue3);
        this.H0 = sArr10;
        short[][][] sArr11 = (short[][][]) Array.newInstance((Class<?>) cls, iIntValue4, iIntValue3, iIntValue4);
        this.I0 = sArr11;
        this.J0 = null;
        byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, 0, Integer.valueOf(((Integer) aze.setX(new Object[0], -1550205341, 1550205348, (int) System.currentTimeMillis())).intValue())}, 525237936, -525237917, 0);
        this.f54184s0 = bArr4;
        int length = bArr4.length;
        int iIntValue5 = ((Integer) p2.d(new Object[]{sArr, bArr, Integer.valueOf(length)}, 1628745383, -1628745380, length)).intValue();
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i10 = iIntValue5 * (-337);
        int i11 = length * 339;
        int i12 = (i10 & i11) + (i11 | i10);
        int i13 = ~iIntValue5;
        int i14 = i13 & (i13 | iIntValue5);
        int i15 = ~iCurrentTimeMillis;
        int i16 = i14 ^ i15;
        int i17 = i14 & i15;
        int i18 = ~((i16 ^ i17) | (i16 & i17));
        int i19 = ~length;
        int i20 = i19 & (i19 | length);
        int i21 = i20 ^ iIntValue5;
        int i22 = i20 & iIntValue5;
        int i23 = (i21 ^ i22) | (i21 & i22);
        int i24 = ~i23;
        int i25 = (i23 | i24) & i24;
        int i26 = i18 ^ i25;
        int i27 = i18 & i25;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = ~((iIntValue5 ^ iCurrentTimeMillis) | (iIntValue5 & iCurrentTimeMillis));
        int i30 = ((~i28) & i29) | ((~i29) & i28);
        int i31 = i28 & i29;
        int i32 = ((i31 & i30) | (i30 ^ i31)) * (-338);
        int i33 = ((~i32) & i12) | ((~i12) & i32);
        int i34 = -(-((i32 & i12) << 1));
        int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
        int i36 = -(-((~((i14 ^ length) | (i14 & length))) * 338));
        int i37 = i35 & i36;
        int i38 = i37 + ((i36 ^ i35) | i37);
        int i39 = ~(i16 | i17);
        int i40 = (iIntValue5 & i19) | (length & i13);
        int i41 = length & iIntValue5;
        int i42 = (i41 & i40) | (i40 ^ i41);
        int i43 = (i42 & i15) | ((~i42) & iCurrentTimeMillis);
        int i44 = i42 & iCurrentTimeMillis;
        int i45 = (i44 & i43) | (i43 ^ i44);
        int i46 = ~i45;
        int i47 = (i45 | i46) & i46;
        int i48 = (((i39 & i47) | (i39 ^ i47)) * 338) + i38;
        int i49 = -(-((Integer) p2.d(new Object[]{sArr2, bArr, Integer.valueOf(i48)}, 1628745383, -1628745380, i48)).intValue());
        int i50 = i48 & i49;
        int i51 = ((i48 ^ i49) | i50) << 1;
        int i52 = -((i48 | i49) & (~i50));
        int i53 = (i51 & i52) + (i52 | i51);
        int iIntValue6 = ((Integer) p2.d(new Object[]{sArr3, bArr, Integer.valueOf(i53)}, 1628745383, -1628745380, i53)).intValue();
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i54 = iIntValue6 * (-494);
        int i55 = i53 * (-494);
        int i56 = (i54 & i55) + (i54 | i55);
        int i57 = iIntValue6 ^ i53;
        int i58 = ~i53;
        int i59 = iIntValue6 & i53;
        int i60 = (i57 & i59) | (i57 ^ i59);
        int i61 = ~i60;
        int i62 = (i56 - (~(-(-(((i60 | i61) & i61) * (-495)))))) - 1;
        int i63 = ~iCurrentTimeMillis2;
        int i64 = (iCurrentTimeMillis2 | i63) & i63;
        int i65 = (~i64) & iIntValue6;
        int i66 = ~iIntValue6;
        int i67 = i65 | (i64 & i66);
        int i68 = i64 & iIntValue6;
        int i69 = ((i68 & i67) | (i67 ^ i68)) * 495;
        int i70 = ((((~i69) & i62) | ((~i62) & i69)) - (~((i69 & i62) << 1))) - 1;
        int i71 = (i58 | i53) & i58;
        int i72 = i66 & i71;
        int i73 = (i71 | i66) & (~i72);
        int i74 = ~((i73 & i72) | (i73 ^ i72));
        int i75 = ~(iIntValue6 | i63);
        int i76 = i74 & i75;
        int i77 = (i75 | i74) & (~i76);
        int i78 = ((i77 & i76) | (i77 ^ i76)) * 495;
        int i79 = ((i70 | i78) << 1) - (i78 ^ i70);
        int iIntValue7 = ((Integer) p2.d(new Object[]{sArr4, bArr, Integer.valueOf(i79)}, 1628745383, -1628745380, i79)).intValue();
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i80 = iIntValue7 * (-919);
        int i81 = i79 * (-919);
        int i82 = ((i80 | i81) << 1) - (i80 ^ i81);
        int i83 = ~iIntValue7;
        int i84 = (i83 | iIntValue7) & i83;
        int i85 = ~i79;
        int i86 = i84 & i85;
        int i87 = (i84 | i85) & (~i86);
        int i88 = (i87 & i86) | (i87 ^ i86);
        int i89 = i88 & iCurrentTimeMillis3;
        int i90 = (i88 | iCurrentTimeMillis3) & (~i89);
        int i91 = ~iCurrentTimeMillis3;
        int i92 = ~((i90 & i89) | (i90 ^ i89));
        int i93 = (i85 | i79) & i85;
        int i94 = (i93 & i91) | (i93 ^ i91);
        int i95 = (i94 & iIntValue7) | (i94 ^ iIntValue7);
        int i96 = ~i95;
        int i97 = (i95 | i96) & i96;
        int i98 = i92 & i97;
        int i99 = (i92 | i97) & (~i98);
        int i100 = ((i99 & i98) | (i99 ^ i98)) * 920;
        int i101 = (i82 ^ i100) + ((i100 & i82) << 1);
        int i102 = i83 & i85;
        int i103 = (i83 ^ i85) | i102;
        int i104 = ~i103;
        int i105 = i83 ^ i91;
        int i106 = i83 & i91;
        int i107 = ~((i105 & i106) | (i105 ^ i106));
        int i108 = i104 & i107;
        int i109 = (i104 | i107) & (~i108);
        int i110 = ((i109 & i108) | (i109 ^ i108)) * 920;
        int i111 = i101 ^ i110;
        int i112 = ((i101 & i110) | i111) << 1;
        int i113 = -i111;
        int i114 = (i112 & i113) + (i112 | i113);
        int i115 = (i103 & i91) | (i103 ^ i91);
        int i116 = ~i115;
        int i117 = (i115 | i116) & i116;
        int i118 = i83 ^ i79;
        int i119 = i79 & i83;
        int i120 = (i119 & i118) | (i118 ^ i119);
        int i121 = (i120 & iCurrentTimeMillis3) | (i120 ^ iCurrentTimeMillis3);
        int i122 = ~i121;
        int i123 = (i121 | i122) & i122;
        int i124 = ((~i123) & i117) | ((~i117) & i123);
        int i125 = i123 & i117;
        int i126 = (i125 & i124) | (i124 ^ i125);
        int i127 = ((~i85) & iIntValue7) | i102;
        int i128 = iIntValue7 & i85;
        int i129 = (i128 & i127) | (i127 ^ i128);
        int i130 = (i129 & i91) | ((~i129) & iCurrentTimeMillis3);
        int i131 = i129 & iCurrentTimeMillis3;
        int i132 = ((~((i131 & i130) | (i130 ^ i131))) | i126) * 920;
        int i133 = i114 & i132;
        int i134 = ((((i114 ^ i132) | i133) << 1) - (~(-((i132 | i114) & (~i133))))) - 1;
        Boolean bool = Boolean.TRUE;
        int iIntValue8 = ((Integer) p2.d(new Object[]{sArr5, bArr, Integer.valueOf(i134), bool}, -1043887544, 1043887552, i134)).intValue() + i134;
        Boolean bool2 = Boolean.FALSE;
        int iIntValue9 = ((Integer) p2.d(new Object[]{sArr6, bArr, Integer.valueOf(iIntValue8), bool2}, -1043887544, 1043887552, iIntValue8)).intValue();
        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
        int i135 = iIntValue9 * (-55);
        int i136 = -(~(-(-(iIntValue8 * (-55)))));
        int i137 = ((i135 ^ i136) + ((i135 & i136) << 1)) - 1;
        int i138 = ~iCurrentTimeMillis4;
        int i139 = -(-(((~((iCurrentTimeMillis4 & iIntValue9) | (iIntValue9 ^ iCurrentTimeMillis4))) | iIntValue8) * 56));
        int i140 = i137 & i139;
        int i141 = ((i137 ^ i139) | i140) << 1;
        int i142 = -((i139 | i137) & (~i140));
        int i143 = ((i141 | i142) << 1) - (i142 ^ i141);
        int i144 = iIntValue9 ^ iIntValue8;
        int i145 = iIntValue9 & iIntValue8;
        int i146 = -(-((~((i144 & i145) | (i144 ^ i145))) * (-56)));
        int i147 = (((i143 | i146) << 1) - (~(-(i146 ^ i143)))) - 1;
        int i148 = i138 & iIntValue8;
        int i149 = (iIntValue8 | i138) & (~i148);
        int i150 = ~((i149 & i148) | (i149 ^ i148));
        int i151 = iIntValue9 & i150;
        int i152 = (iIntValue9 | i150) & (~i151);
        int i153 = -(-(((i152 & i151) | (i152 ^ i151)) * 56));
        int i154 = (i147 & i153) + (i153 | i147);
        int iIntValue10 = ((Integer) p2.d(new Object[]{sArr7, bArr, Integer.valueOf(i154), bool}, -1043887544, 1043887552, i154)).intValue();
        int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
        int i155 = iIntValue10 * 881;
        int i156 = i154 * 881;
        int i157 = i155 ^ i156;
        int i158 = ((i155 & i156) | i157) << 1;
        int i159 = -i157;
        int i160 = ((i158 | i159) << 1) - (i158 ^ i159);
        int i161 = ~iIntValue10;
        int i162 = (i161 | iIntValue10) & i161;
        int i163 = ~i154;
        int i164 = ~(((~i163) & i162) | ((~i162) & i163) | (i162 & i163));
        int i165 = ~iCurrentTimeMillis5;
        int i166 = ((~i161) & iCurrentTimeMillis5) | (i161 & i165);
        int i167 = i161 & iCurrentTimeMillis5;
        int i168 = ~(i166 | i167);
        int i169 = i164 ^ i168;
        int i170 = i168 & i164;
        int i171 = (i170 & i169) | (i169 ^ i170);
        int i172 = i163 & iCurrentTimeMillis5;
        int i173 = ~(i172 | ((~i172) & (i163 | iCurrentTimeMillis5)));
        int i174 = ((~i171) & i173) | ((~i173) & i171);
        int i175 = i171 & i173;
        int i176 = ((i175 & i174) | (i174 ^ i175)) * (-880);
        int i177 = ((((~i176) & i160) | ((~i160) & i176)) - (~((i176 & i160) << 1))) - 1;
        int i178 = (i165 | iCurrentTimeMillis5) & i165;
        int i179 = i162 ^ i178;
        int i180 = i178 & i162;
        int i181 = ~((i180 & i179) | (i179 ^ i180));
        int i182 = ((~i181) & i154) | (i163 & i181);
        int i183 = i154 & i181;
        int i184 = (i183 & i182) | (i182 ^ i183);
        int i185 = (iIntValue10 & i165) | i167;
        int i186 = iIntValue10 & iCurrentTimeMillis5;
        int i187 = ~((i185 & i186) | (i185 ^ i186));
        int i188 = ((i184 & i187) | ((~i187) & i184) | ((~i184) & i187)) * (-880);
        int i189 = ((i177 | i188) << 1) - (i188 ^ i177);
        int i190 = (iIntValue10 | iCurrentTimeMillis5) & (~i186);
        int i191 = -(-((~((i190 & i186) | (i190 ^ i186))) * 880));
        int i192 = ((i189 & i191) - (~(-(-(i191 | i189))))) - 1;
        int iIntValue11 = ((Integer) p2.d(new Object[]{sArr8, bArr, Integer.valueOf(i192), bool2}, -1043887544, 1043887552, i192)).intValue();
        int iCurrentTimeMillis6 = (int) System.currentTimeMillis();
        int i193 = (i192 * 949) + (iIntValue11 * (-947));
        int i194 = ~iIntValue11;
        int i195 = (i194 | iIntValue11) & i194;
        int i196 = ~i192;
        int i197 = (i192 | i196) & i196;
        int i198 = (i197 & iCurrentTimeMillis6) | (i197 ^ iCurrentTimeMillis6);
        int i199 = ~i198;
        int i200 = (i198 | i199) & i199;
        int i201 = -(-(((i200 & i195) | (i195 ^ i200)) * (-948)));
        int i202 = ((i193 | i201) << 1) - (i201 ^ i193);
        int i203 = i194 ^ i196;
        int i204 = i194 & i196;
        int i205 = i203 | i204;
        int i206 = ~iCurrentTimeMillis6;
        int i207 = (iCurrentTimeMillis6 | i206) & i206;
        int i208 = (~((i205 & i207) | (i205 ^ i207))) * (-948);
        int i209 = (i202 | i208) << 1;
        int i210 = -((i208 & (~i202)) | ((~i208) & i202));
        int i211 = ((i209 | i210) << 1) - (i210 ^ i209);
        int i212 = ((~i196) & iIntValue11) | i204;
        int i213 = iIntValue11 & i196;
        int i214 = ((i213 & i212) | (i212 ^ i213)) * 948;
        int i215 = i211 & i214;
        int i216 = (i215 - (~(-(-((i214 ^ i211) | i215))))) - 1;
        int i217 = -(-((Integer) p2.d(new Object[]{sArr9, bArr, Integer.valueOf(i216), bool2}, -1043887544, 1043887552, i216)).intValue());
        int i218 = i216 & i217;
        int i219 = -(-(i217 | i216));
        int i220 = ((i218 | i219) << 1) - (i219 ^ i218);
        int i221 = -(~(-(-((Integer) p2.d(new Object[]{sArr10, bArr, Integer.valueOf(i220), bool}, -1043887544, 1043887552, i220)).intValue())));
        int i222 = (((i220 | i221) << 1) - (i221 ^ i220)) - 1;
        int i223 = -(-((Integer) p2.d(new Object[]{sArr11, bArr, Integer.valueOf(i222), bool2}, -1043887544, 1043887552, i222)).intValue());
        int i224 = i222 & i223;
        int i225 = (i224 - (~((i223 ^ i222) | i224))) - 1;
        this.K0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr, Integer.valueOf(i225), Integer.valueOf(bArr.length)}, 525237936, -525237917, i225);
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = (~i12) | i13;
        if ((((~(i10 | i14)) | (~(i11 | i16))) * 241) + ((i10 | i11) * (-482)) + (((~i16) | i15) * (-241)) + (i11 * 242) + (i10 * 483) == 1) {
            azd azdVar = (azd) objArr[0];
            int i17 = M0;
            int i18 = (i17 & (-8)) | ((~i17) & 7);
            int i19 = -(-((i17 & 7) << 1));
            int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
            L0 = i20 % 128;
            int i21 = i20 % 2;
            aze y7 = azdVar.setY();
            if (((q2) aze.setX(new Object[]{y7}, -2092851425, 2092851430, System.identityHashCode(y7))) != q2.setDividerPadding) {
                byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) setDividerPadding(new Object[]{azdVar}, 162605998, -162605998, System.identityHashCode(azdVar)), azdVar.K0}, 1396275083, -1396275074, (int) System.currentTimeMillis());
                int i22 = L0;
                int i23 = ((i22 | 73) << 1) - (i22 ^ 73);
                M0 = i23 % 128;
                int i24 = i23 % 2;
                return bArr;
            }
            int i25 = M0;
            int i26 = (((i25 & (-98)) | ((~i25) & 97)) - (~(-(-((i25 & 97) << 1))))) - 1;
            L0 = i26 % 128;
            int i27 = i26 % 2;
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{azdVar.J0, azdVar.f54184s0}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            int i28 = L0 + 47;
            M0 = i28 % 128;
            if (i28 % 2 != 0) {
                return bArr2;
            }
            int i29 = 10 / 0;
            return bArr2;
        }
        azd azdVar2 = (azd) objArr[0];
        int i30 = L0;
        int i31 = ((i30 & 60) + (i30 | 60)) - 1;
        M0 = i31 % 128;
        int i32 = i31 % 2;
        aze y10 = azdVar2.setY();
        q2 q2Var = (q2) aze.setX(new Object[]{y10}, -2092851425, 2092851430, System.identityHashCode(y10));
        q2 q2Var2 = q2.setDividerPadding;
        byte[] bArr3 = azdVar2.f54184s0;
        if (q2Var != q2Var2) {
            byte[] bArr4 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3, (byte[]) p2.d(new Object[]{azdVar2.f54185t0}, -2000648145, 2000648149, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.f54186u0}, -2000648145, 2000648149, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.f54187w0}, -2000648145, 2000648149, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.v0}, -2000648145, 2000648149, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            Boolean bool = Boolean.TRUE;
            byte[] bArr5 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr4, (byte[]) p2.d(new Object[]{azdVar2.f54188x0, bool}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            Boolean bool2 = Boolean.FALSE;
            byte[] bArr6 = (byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{(byte[]) bek.setOnFocusChangeListener(new Object[]{bArr5, (byte[]) p2.d(new Object[]{azdVar2.f54189y0, bool2}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.E0, bool}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.F0, bool2}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.G0, bool2}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.H0, bool}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis()), (byte[]) p2.d(new Object[]{azdVar2.I0, bool2}, 305922125, -305922124, (int) System.currentTimeMillis())}, 1396275083, -1396275074, (int) System.currentTimeMillis());
            int i33 = L0;
            int i34 = i33 | 47;
            int i35 = i34 << 1;
            int i36 = -((~(i33 & 47)) & i34);
            int i37 = (i35 ^ i36) + ((i36 & i35) << 1);
            M0 = i37 % 128;
            if (i37 % 2 != 0) {
                return bArr6;
            }
            throw null;
        }
        int i38 = L0;
        int i39 = (i38 & 17) + (i38 | 17);
        M0 = i39 % 128;
        int i40 = i39 % 2;
        byte[] bArr7 = azdVar2.J0;
        Object[] objArr2 = new Object[2];
        if (i40 == 0) {
            objArr2[0] = bArr7;
            objArr2[1] = bArr3;
            throw null;
        }
        objArr2[0] = bArr7;
        objArr2[1] = bArr3;
        byte[] bArr8 = (byte[]) bek.setOnFocusChangeListener(objArr2, 1396275083, -1396275074, (int) System.currentTimeMillis());
        int i41 = L0;
        int i42 = (((i41 | 44) << 1) - (i41 ^ 44)) - 1;
        M0 = i42 % 128;
        int i43 = i42 % 2;
        return bArr8;
    }

    public azd(aze azeVar, byte[] bArr, short[][] sArr, short[][] sArr2, short[][] sArr3, short[][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11) {
        super(true, azeVar);
        this.J0 = null;
        this.K0 = null;
        this.f54184s0 = (byte[]) bArr.clone();
        this.f54185t0 = (short[][]) p2.d(new Object[]{sArr}, -1195209818, 1195209820, (int) System.currentTimeMillis());
        this.f54186u0 = (short[][]) p2.d(new Object[]{sArr2}, -1195209818, 1195209820, (int) System.currentTimeMillis());
        this.v0 = (short[][]) p2.d(new Object[]{sArr3}, -1195209818, 1195209820, (int) System.currentTimeMillis());
        this.f54187w0 = (short[][]) p2.d(new Object[]{sArr4}, -1195209818, 1195209820, (int) System.currentTimeMillis());
        this.f54188x0 = (short[][][]) p2.d(new Object[]{sArr5}, 135398520, -135398515, (int) System.currentTimeMillis());
        this.f54189y0 = (short[][][]) p2.d(new Object[]{sArr6}, 135398520, -135398515, (int) System.currentTimeMillis());
        this.E0 = (short[][][]) p2.d(new Object[]{sArr7}, 135398520, -135398515, (int) System.currentTimeMillis());
        this.F0 = (short[][][]) p2.d(new Object[]{sArr8}, 135398520, -135398515, (int) System.currentTimeMillis());
        this.G0 = (short[][][]) p2.d(new Object[]{sArr9}, 135398520, -135398515, (int) System.currentTimeMillis());
        this.H0 = (short[][][]) p2.d(new Object[]{sArr10}, 135398520, -135398515, (int) System.currentTimeMillis());
        this.I0 = (short[][][]) p2.d(new Object[]{sArr11}, 135398520, -135398515, (int) System.currentTimeMillis());
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, -318319228, 318319229, System.identityHashCode(this));
    }
}
