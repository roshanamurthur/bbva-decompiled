package com.mypinpad.tsdk.isolation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;

/* JADX INFO: loaded from: classes10.dex */
public abstract class auh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f53912b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f53911a = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f53913c = 83 % 128;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f53914a = (int[]) auk.setY(new Object[0], 860894993, -860894980, (int) System.currentTimeMillis());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f53915b = (int[]) auk.setY(new Object[0], 860894993, -860894980, (int) System.currentTimeMillis());
    }

    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f53916a;

        public setOnFocusChangeListener(int[] iArr) {
            this.f53916a = iArr;
        }
    }

    static {
        int i10 = 83 % 2;
    }

    public static /* synthetic */ Boolean a(Object[] objArr) {
        char c10 = 0;
        byte[] bArr = (byte[]) objArr[0];
        int i10 = f53913c;
        int i11 = i10 + 57;
        f53912b = i11 % 128;
        int i12 = 2;
        int i13 = i11 % 2;
        int i14 = 1;
        if ((bArr[56] & 127) != 0) {
            int i15 = i10 & 7;
            int i16 = -(-((i10 ^ 7) | i15));
            int i17 = (i15 & i16) + (i15 | i16);
            int i18 = i17 % 128;
            f53912b = i18;
            int i19 = i17 % 2;
            int i20 = i18 & 33;
            int i21 = ((i18 ^ 33) | i20) << 1;
            int i22 = -((i18 | 33) & (~i20));
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            f53913c = i23 % 128;
            int i24 = i23 % 2;
            return Boolean.FALSE;
        }
        int i25 = 1332815424;
        int i26 = -1332815423;
        int iIntValue = s1.a(new Object[]{bArr, 52}, 1332815424, -1332815423, 52).intValue();
        int[] iArr = f53911a;
        int i27 = iArr[13];
        int i28 = (i27 | iIntValue) & (~(iIntValue & i27));
        int i29 = f53912b;
        int i30 = 12;
        int i31 = ((i29 & 12) + (i29 | 12)) - 1;
        f53913c = i31 % 128;
        int i32 = i31 % 2;
        while (i30 > 0) {
            int i33 = f53913c;
            int i34 = (i33 & (-44)) | ((~i33) & 43);
            int i35 = (i33 & 43) << i14;
            int i36 = (i34 & i35) + (i35 | i34);
            f53912b = i36 % 128;
            int i37 = i36 % i12;
            int i38 = i30 << 2;
            Object[] objArr2 = new Object[i12];
            objArr2[c10] = bArr;
            objArr2[i14] = Integer.valueOf(i38);
            int iIntValue2 = s1.a(objArr2, i25, i26, i38).intValue();
            if (i28 == 0) {
                int i39 = f53913c + 7;
                f53912b = i39 % 128;
                int i40 = i39 % i12;
                int iCurrentTimeMillis = (int) System.currentTimeMillis();
                int i41 = -(-(iIntValue2 * (-195)));
                int i42 = Integer.MIN_VALUE & i41;
                int i43 = (i41 ^ Integer.MIN_VALUE) | i42;
                int i44 = (i42 ^ i43) + ((i42 & i43) << i14);
                int i45 = ~iIntValue2;
                int i46 = i45 ^ Integer.MIN_VALUE;
                int i47 = i45 & Integer.MIN_VALUE;
                int i48 = ~((i46 ^ i47) | (i46 & i47));
                int i49 = iIntValue2 & iCurrentTimeMillis;
                int i50 = (~i49) & (iIntValue2 | iCurrentTimeMillis);
                int i51 = ~((i50 ^ i49) | (i50 & i49));
                int i52 = i48 ^ i51;
                int i53 = i51 & i48;
                int i54 = -(~(-(-(((i52 & i53) | (i52 ^ i53)) * (-196)))));
                int i55 = ((i44 ^ i54) + ((i44 & i54) << i14)) - 1;
                int i56 = (i47 | (iIntValue2 & Integer.MAX_VALUE) | (iIntValue2 & Integer.MIN_VALUE)) * 392;
                int i57 = i55 & i56;
                int i58 = ((i55 ^ i56) | i57) << i14;
                int i59 = -((i56 | i55) & (~i57));
                int i60 = (i58 ^ i59) + ((i59 & i58) << i14);
                int i61 = Integer.MAX_VALUE & i45;
                int i62 = ~(i61 | ((~i61) & (Integer.MAX_VALUE | i45)));
                int i63 = ~((iIntValue2 ^ iCurrentTimeMillis) | i49);
                int i64 = i62 & i63;
                int i65 = (i62 | i63) & (~i64);
                int i66 = -(-(((i65 & i64) | (i65 ^ i64)) * 196));
                int i67 = i60 & i66;
                int i68 = ((i60 ^ i66) | i67) << i14;
                int i69 = -((i66 | i60) & (~i67));
                int i70 = (i68 & i69) + (i69 | i68);
                int i71 = iArr[i30];
                int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                int i72 = -(-(i71 * (-903)));
                int i73 = Integer.MIN_VALUE | i72;
                int i74 = i73 << 1;
                int i75 = -((~(i72 & Integer.MIN_VALUE)) & i73);
                int i76 = (i74 & i75) + (i75 | i74);
                int i77 = ~((Integer.MAX_VALUE ^ iCurrentTimeMillis2) | (Integer.MAX_VALUE & iCurrentTimeMillis2));
                int i78 = ~iCurrentTimeMillis2;
                int i79 = i78 & i71;
                int i80 = (~i79) & (i78 | i71);
                int i81 = ~i71;
                int i82 = ((~((i80 ^ i79) | (i80 & i79))) | i77) * (-1808);
                int i83 = i76 & i82;
                int i84 = (i82 ^ i76) | i83;
                int i85 = (i83 & i84) + (i84 | i83);
                int i86 = ~i81;
                int i87 = (Integer.MAX_VALUE & i86) | (i81 & Integer.MIN_VALUE) | (Integer.MAX_VALUE & i81);
                int i88 = ((~i87) & iCurrentTimeMillis2) | (i87 & i78);
                int i89 = i87 & iCurrentTimeMillis2;
                int i90 = ~((i89 & i88) | (i88 ^ i89));
                int i91 = i78 & Integer.MIN_VALUE;
                int i92 = (i78 ^ Integer.MIN_VALUE) | i91;
                int i93 = ~(((~i92) & i71) | (i92 & i81) | (i92 & i71));
                int i94 = i90 & i93;
                int i95 = (i85 - (~(-(~((((i93 | i90) & (~i94)) | i94) * 904))))) - 2;
                int i96 = Integer.MAX_VALUE ^ i71;
                int i97 = i71 & Integer.MAX_VALUE;
                int i98 = (i97 & i96) | (i96 ^ i97);
                int i99 = ~i98;
                int i100 = ((i98 | i99) & i99) | (~((i81 & i78) | (i86 & iCurrentTimeMillis2) | (i81 & iCurrentTimeMillis2)));
                int i101 = (Integer.MAX_VALUE & i78) | ((~i78) & Integer.MIN_VALUE) | i91;
                int i102 = ~i101;
                int i103 = (i101 | i102) & i102;
                int i104 = ((i100 & i103) | (i100 ^ i103)) * 904;
                if (i70 > ((i95 | i104) << 1) - (i104 ^ i95)) {
                    int i105 = f53913c;
                    int i106 = i105 ^ 77;
                    int i107 = -(-((i105 & 77) << 1));
                    int i108 = ((i106 | i107) << 1) - (i107 ^ i106);
                    int i109 = i108 % 128;
                    f53912b = i109;
                    int i110 = i108 % 2;
                    int i111 = i109 & 109;
                    int i112 = ((i109 ^ 109) | i111) << 1;
                    int i113 = -((i109 | 109) & (~i111));
                    int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                    f53913c = i114 % 128;
                    if (i114 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
            }
            iIntValue = (iIntValue ^ iIntValue2) | (iIntValue & iIntValue2);
            int i115 = iArr[i30];
            int i116 = (i115 | iIntValue2) & (~(iIntValue2 & i115));
            i28 = (i28 ^ i116) | (i116 & i28);
            i30 = (-2) - (i30 ^ (-1));
            int i117 = f53913c + 39;
            f53912b = i117 % 128;
            int i118 = i117 % 2;
            i12 = 2;
            bArr = bArr;
            c10 = 0;
            i14 = 1;
            i25 = 1332815424;
            i26 = -1332815423;
        }
        Object[] objArr3 = new Object[i12];
        objArr3[0] = bArr;
        objArr3[1] = 0;
        int iIntValue3 = s1.a(objArr3, 1332815424, -1332815423, 0).intValue();
        if (iIntValue == 0) {
            int i119 = f53913c;
            int i120 = i119 & 63;
            int i121 = -(-(i119 | 63));
            int i122 = (i120 & i121) + (i121 | i120);
            f53912b = i122 % 128;
            int i123 = i122 % 2;
            int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
            int i124 = iIntValue3 * 503;
            int i125 = Integer.MIN_VALUE & i124;
            int i126 = i125 + ((i124 ^ Integer.MIN_VALUE) | i125);
            int i127 = ~iIntValue3;
            int i128 = (i127 & Integer.MIN_VALUE) | (iIntValue3 & Integer.MAX_VALUE);
            int i129 = iIntValue3 & Integer.MIN_VALUE;
            int i130 = (i126 - (~(-(-(((i128 ^ i129) | (i128 & i129)) * (-502)))))) - 1;
            int i131 = i127 & (i127 | iIntValue3);
            int i132 = ((~i131) & Integer.MAX_VALUE) | (i131 & Integer.MIN_VALUE);
            int i133 = i131 & Integer.MAX_VALUE;
            int i134 = ~((i133 & i132) | (i132 ^ i133));
            int i135 = ~iCurrentTimeMillis3;
            int i136 = (i135 | iCurrentTimeMillis3) & i135;
            int i137 = Integer.MAX_VALUE & i136;
            int i138 = ~(((~i137) & (i136 | Integer.MAX_VALUE)) | i137);
            int i139 = i134 ^ i138;
            int i140 = i134 & i138;
            int i141 = (i140 & i139) | (i139 ^ i140);
            int i142 = (~i129) & (iIntValue3 | Integer.MIN_VALUE);
            int i143 = i142 | i129;
            int i144 = i143 ^ iCurrentTimeMillis3;
            int i145 = i143 & iCurrentTimeMillis3;
            int i146 = ~((i145 & i144) | (i144 ^ i145));
            int i147 = i141 ^ i146;
            int i148 = i141 & i146;
            int i149 = (i130 - (~(-(~(-(-(((i148 & i147) | (i147 ^ i148)) * (-502)))))))) - 2;
            int i150 = (Integer.MAX_VALUE ^ i135) | (i135 & Integer.MAX_VALUE);
            int i151 = ~((i150 & iIntValue3) | (i150 ^ iIntValue3));
            int i152 = (i142 ^ i129) | (i142 & i129);
            int i153 = i152 & iCurrentTimeMillis3;
            int i154 = (iCurrentTimeMillis3 | i152) & (~i153);
            int i155 = ~((i154 & i153) | (i154 ^ i153));
            if ((((i155 & i151) | ((~i155) & i151) | ((~i151) & i155)) * 502) + i149 <= -2147483647) {
                int i156 = f53912b;
                int i157 = i156 & 53;
                int i158 = -(-((i156 ^ 53) | i157));
                int i159 = ((i157 | i158) << 1) - (i158 ^ i157);
                f53913c = i159 % 128;
                int i160 = i159 % 2;
                return Boolean.FALSE;
            }
        }
        if (i28 == 0) {
            int i161 = f53913c;
            int i162 = ((i161 ^ 61) | (i161 & 61)) << 1;
            int i163 = -(((~i161) & 61) | (i161 & (-62)));
            int i164 = (i162 ^ i163) + ((i163 & i162) << 1);
            f53912b = i164 % 128;
            int i165 = i164 % 2;
            int i166 = (((iIntValue3 ^ Integer.MIN_VALUE) | (iIntValue3 & Integer.MIN_VALUE)) << 1) - (((~iIntValue3) & Integer.MIN_VALUE) | (iIntValue3 & Integer.MAX_VALUE));
            int i167 = iArr[0];
            int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
            int i168 = i167 * (-949);
            int i169 = 949 & i168;
            int i170 = (i168 ^ 949) | i169;
            int i171 = (i169 & i170) + (i170 | i169);
            int i172 = ~i167;
            int i173 = ~iCurrentTimeMillis4;
            int i174 = ~((i172 & i173) | ((~i173) & i172) | ((~i172) & i173));
            int i175 = ((i174 & i173) | (i174 ^ i173)) * ReturnCode.ERR_REPOSITORY;
            int i176 = i171 & i175;
            int i177 = (i175 | i171) & (~i176);
            int i178 = -(-(i176 << 1));
            int i179 = (i177 ^ i178) + ((i177 & i178) << 1);
            int i180 = (i173 | iCurrentTimeMillis4) & i173;
            int i181 = ~(i180 | (i180 ^ (-1)));
            int i182 = i167 & iCurrentTimeMillis4;
            int i183 = (~i182) & (i167 | iCurrentTimeMillis4);
            int i184 = ~((i182 & i183) | (i183 ^ i182));
            int i185 = i181 & i184;
            int i186 = (i181 | i184) & (~i185);
            int i187 = -(-(((i186 & i185) | (i186 ^ i185)) * (-950)));
            int i188 = i179 & i187;
            int i189 = (((i187 | i179) & (~i188)) - (~(-(-(i188 << 1))))) - 1;
            int i190 = i173 ^ i167;
            int i191 = i167 & i173;
            int i192 = ~((i191 & i190) | (i190 ^ i191));
            int i193 = (-1) ^ iCurrentTimeMillis4;
            int i194 = ~((iCurrentTimeMillis4 & i193) | (i193 ^ iCurrentTimeMillis4));
            int i195 = i192 & i194;
            int i196 = (i192 | i194) & (~i195);
            int i197 = ((i196 & i195) | (i196 ^ i195)) * 950;
            int i198 = (((~i197) & i189) | ((~i189) & i197)) + ((i197 & i189) << 1);
            int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
            int i199 = i198 * (-97);
            int i200 = ~i198;
            int i201 = (i200 | i198) & i200;
            int i202 = ~iCurrentTimeMillis5;
            int i203 = i201 ^ i202;
            int i204 = i201 & i202;
            int i205 = i200 & Integer.MIN_VALUE;
            int i206 = -(-(((~(((i200 | Integer.MIN_VALUE) & (~i205)) | i205)) | (~((i203 & i204) | (i203 ^ i204)))) * 98));
            int i207 = i199 & i206;
            int i208 = (i199 | i206) & (~i207);
            int i209 = -(-(i207 << 1));
            int i210 = ((i208 | i209) << 1) - (i208 ^ i209);
            int i211 = ((~i202) & Integer.MAX_VALUE) | (i202 & Integer.MIN_VALUE);
            int i212 = Integer.MAX_VALUE & i202;
            int i213 = ~((i211 & i212) | (i211 ^ i212));
            int i214 = (~i213) & i201;
            int i215 = ~i201;
            int i216 = i214 | (i213 & i215);
            int i217 = i213 & i201;
            int i218 = (i217 & i216) | (i216 ^ i217);
            int i219 = iCurrentTimeMillis5 ^ Integer.MIN_VALUE;
            int i220 = iCurrentTimeMillis5 & Integer.MIN_VALUE;
            int i221 = ~((i219 ^ i220) | (i219 & i220));
            int i222 = -(-(((i218 & i221) | ((~i221) & i218) | ((~i218) & i221)) * (-49)));
            int i223 = i210 & i222;
            int i224 = i223 + ((i222 ^ i210) | i223);
            int i225 = (iCurrentTimeMillis5 & i215) | i204;
            int i226 = iCurrentTimeMillis5 & i201;
            int i227 = ~((i226 & i225) | (i225 ^ i226));
            int i228 = i198 & Integer.MIN_VALUE;
            int i229 = (i198 | Integer.MIN_VALUE) & (~i228);
            int i230 = ~((i229 & i228) | (i229 ^ i228));
            int i231 = -(~(((i227 & i230) | (i227 ^ i230)) * 49));
            int i232 = (i224 & i231) + (i231 | i224);
            if (i166 >= (i232 ^ (-1)) + (i232 << 1)) {
                int i233 = f53912b;
                int i234 = ((i233 & 33) - (~(-(-(i233 | 33))))) - 1;
                f53913c = i234 % 128;
                return Boolean.valueOf(i234 % 2 == 0);
            }
        }
        int i235 = f53912b;
        int i236 = i235 & 9;
        int i237 = (i236 - (~(-(-((i235 ^ 9) | i236))))) - 1;
        f53913c = i237 % 128;
        int i238 = i237 % 2;
        return Boolean.TRUE;
    }

    public static /* synthetic */ setOnFocusChangeListener b(Object[] objArr) {
        a aVar = (a) objArr[0];
        int[] iArr = new int[32];
        auk.setY(new Object[]{aVar.f53914a, iArr, 0}, -1684549240, 1684549241, 0);
        auk.setY(new Object[]{aVar.f53915b, iArr, 16}, -1684549240, 1684549241, 16);
        setOnFocusChangeListener setonfocuschangelistener = new setOnFocusChangeListener(iArr);
        int i10 = f53912b;
        int i11 = i10 ^ 61;
        int i12 = ((((i10 & 61) | i11) << 1) - (~(-i11))) - 1;
        f53913c = i12 % 128;
        if (i12 % 2 != 0) {
            return setonfocuschangelistener;
        }
        throw null;
    }

    public static /* synthetic */ Object c(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53913c + 101;
        f53912b = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArr2 = new byte[57];
        System.arraycopy(bArr, iIntValue, bArr2, 0, 57);
        int i12 = f53912b;
        int i13 = ((-1) << 1) - ((-1) ^ ((i12 & 110) + (i12 | 110)));
        f53913c = i13 % 128;
        if (i13 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    public static /* synthetic */ setOnFocusChangeListener d(Object[] objArr) {
        byte[] bArr = (byte[]) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i10 = f53913c + 37;
        f53912b = i10 % 128;
        if (i10 % 2 != 0) {
            ((Boolean) setDividerPadding(new Object[]{(byte[]) setDividerPadding(new Object[]{bArr, Integer.valueOf(iIntValue)}, 910214876, -910214874, iIntValue)}, -1056047918, 1056047919, (int) System.currentTimeMillis())).booleanValue();
            throw null;
        }
        byte[] bArr2 = (byte[]) setDividerPadding(new Object[]{bArr, Integer.valueOf(iIntValue)}, 910214876, -910214874, iIntValue);
        if (!((Boolean) setDividerPadding(new Object[]{bArr2}, -1056047918, 1056047919, (int) System.currentTimeMillis())).booleanValue()) {
            int i11 = f53912b;
            int i12 = i11 & 3;
            int i13 = ((i11 ^ 3) | i12) << 1;
            int i14 = -((i11 | 3) & (~i12));
            int i15 = (i13 & i14) + (i14 | i13);
            f53913c = i15 % 128;
            int i16 = i15 % 2;
            return null;
        }
        a aVar = new a();
        if (!((Boolean) setDividerPadding(new Object[]{bArr2, aVar}, -294864007, 294864011, (int) System.currentTimeMillis())).booleanValue()) {
            int i17 = f53912b + 65;
            f53913c = i17 % 128;
            if (i17 % 2 != 0) {
                return null;
            }
            throw null;
        }
        setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) setDividerPadding(new Object[]{aVar}, -766051416, 766051419, (int) System.currentTimeMillis());
        int i18 = f53913c;
        int i19 = i18 ^ 99;
        int i20 = ((i18 & 99) | i19) << 1;
        int i21 = -i19;
        int i22 = (i20 ^ i21) + ((i20 & i21) << 1);
        f53912b = i22 % 128;
        if (i22 % 2 == 0) {
            return setonfocuschangelistener;
        }
        throw null;
    }

    public static /* synthetic */ void e(Object[] objArr) {
        setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        ((Number) objArr[2]).intValue();
        int i10 = f53913c;
        int i11 = i10 & 99;
        int i12 = -(-(i10 | 99));
        int i13 = (i11 & i12) + (i12 | i11);
        f53912b = i13 % 128;
        if (i13 % 2 != 0) {
            auk.setY(new Object[]{setonfocuschangelistener.f53916a, bArr, 0}, 1511561246, -1511561242, 0);
            bArr[123] = (byte) ((setonfocuschangelistener.f53916a[0] & 1) << 73);
        } else {
            auk.setY(new Object[]{setonfocuschangelistener.f53916a, bArr, 0}, 1511561246, -1511561242, 0);
            bArr[56] = (byte) ((setonfocuschangelistener.f53916a[0] & 1) << 7);
        }
        int i14 = f53913c;
        int i15 = (i14 ^ 115) + ((i14 & 115) << 1);
        f53912b = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * TypedValues.MotionType.TYPE_EASING) + (i10 * 302);
        int i14 = ~i10;
        int i15 = ~i12;
        int i16 = ((~(i11 | i15)) * 301) + (((~(i10 | i15 | i11)) | (~(i12 | i14)) | (~((~i11) | i14))) * (-301)) + (((~(i14 | i15)) | i11) * (-602)) + i13;
        if (i16 == 1) {
            return a(objArr);
        }
        if (i16 == 2) {
            return c(objArr);
        }
        if (i16 == 3) {
            return b(objArr);
        }
        if (i16 != 4) {
            if (i16 == 5) {
                return d(objArr);
            }
            e(objArr);
            return null;
        }
        byte[] bArr = (byte[]) objArr[0];
        a aVar = (a) objArr[1];
        int i17 = f53913c;
        int i18 = (i17 & 81) + (i17 | 81);
        f53912b = i18 % 128;
        int i19 = i18 % 2;
        int i20 = (bArr[56] & 128) >>> 7;
        auk.setY(new Object[]{bArr, aVar.f53915b}, 199364792, -199364784, (int) System.currentTimeMillis());
        int[] iArr = (int[]) auk.setY(new Object[0], 860894993, -860894980, (int) System.currentTimeMillis());
        int[] iArr2 = (int[]) auk.setY(new Object[0], 860894993, -860894980, (int) System.currentTimeMillis());
        auk.setY(new Object[]{aVar.f53915b, iArr}, -1650818545, 1650818561, (int) System.currentTimeMillis());
        auk.setY(new Object[]{iArr, iArr2}, -1048810854, 1048810873, (int) System.currentTimeMillis());
        auk.setY(new Object[]{iArr, iArr}, -955467638, 955467641, (int) System.currentTimeMillis());
        auk.setY(new Object[]{iArr}, -159807732, 159807743, (int) System.currentTimeMillis());
        auk.setY(new Object[]{iArr2}, -159807732, 159807743, (int) System.currentTimeMillis());
        int[] iArr3 = aVar.f53914a;
        if (!((Boolean) auk.setY(new Object[]{iArr, iArr2, iArr3}, -363900717, 363900731, (int) System.currentTimeMillis())).booleanValue()) {
            int i21 = f53912b;
            int i22 = i21 & 61;
            int i23 = ((i21 ^ 61) | i22) << 1;
            int i24 = -((i21 | 61) & (~i22));
            int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
            f53913c = i25 % 128;
            return Boolean.valueOf(i25 % 2 == 0);
        }
        auk.setY(new Object[]{iArr3}, -1572332591, 1572332601, (int) System.currentTimeMillis());
        if (i20 == 1) {
            System.currentTimeMillis();
            System.currentTimeMillis();
            if (((Boolean) auk.setY(new Object[]{iArr3}, 1100099006, -1100098984, (int) System.currentTimeMillis())).booleanValue()) {
                System.currentTimeMillis();
                System.currentTimeMillis();
                int i26 = f53913c;
                int i27 = (i26 & (-54)) | ((~i26) & 53);
                int i28 = -(-((i26 & 53) << 1));
                int i29 = (i27 & i28) + (i28 | i27);
                f53912b = i29 % 128;
                int i30 = i29 % 2;
                return Boolean.FALSE;
            }
        }
        if (i20 != (iArr3[0] & 1)) {
            int i31 = f53913c + 15;
            int i32 = i31 % 128;
            f53912b = i32;
            int i33 = i31 % 2;
            int i34 = i32 & 75;
            int i35 = (i32 ^ 75) | i34;
            int i36 = ((i34 | i35) << 1) - (i34 ^ i35);
            int i37 = i36 % 128;
            f53913c = i37;
            int i38 = i36 % 2;
            int i39 = ((i37 | 69) << 1) - (i37 ^ 69);
            f53912b = i39 % 128;
            int i40 = i39 % 2;
            auk.setY(new Object[]{iArr3, iArr3}, -955467638, 955467641, (int) System.currentTimeMillis());
            auk.setY(new Object[]{iArr3}, -1572332591, 1572332601, (int) System.currentTimeMillis());
            int i41 = f53912b;
            int i42 = i41 ^ 81;
            int i43 = (((i41 & 81) | i42) << 1) - i42;
            f53913c = i43 % 128;
            int i44 = i43 % 2;
        } else {
            int i45 = f53912b;
            int i46 = ((i45 & (-24)) | ((~i45) & 23)) + ((i45 & 23) << 1);
            f53913c = i46 % 128;
            int i47 = i46 % 2;
        }
        int i48 = f53913c;
        int i49 = i48 & 123;
        int i50 = -(-((i48 ^ 123) | i49));
        int i51 = (i49 ^ i50) + ((i50 & i49) << 1);
        f53912b = i51 % 128;
        int i52 = i51 % 2;
        return Boolean.TRUE;
    }

    public static setOnFocusChangeListener setOnFocusChangeListener(byte[] bArr, int i10) {
        return (setOnFocusChangeListener) setDividerPadding(new Object[]{bArr, Integer.valueOf(i10)}, -2048804572, 2048804577, i10);
    }

    public static void setY(setOnFocusChangeListener setonfocuschangelistener, byte[] bArr, int i10) {
        setDividerPadding(new Object[]{setonfocuschangelistener, bArr, Integer.valueOf(i10)}, 1070668575, -1070668575, i10);
    }
}
