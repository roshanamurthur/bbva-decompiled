package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;

/* JADX INFO: loaded from: classes10.dex */
public final class awk extends awm {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54045t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54046u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54047s0;

    public awk(awn awnVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(true, awnVar);
        int length = ((-1) << 1) - (((bArr.length - (~(-(~bArr2.length)))) - 1) ^ (-1));
        int length2 = bArr3.length;
        int i10 = length ^ length2;
        int i11 = -(-((length2 & length) << 1));
        int i12 = (i10 & i11) + (i11 | i10);
        int length3 = bArr4.length;
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i13 = length3 * 398;
        int i14 = -(-(i12 * (-396)));
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        int i16 = ~length3;
        int i17 = ~iCurrentTimeMillis;
        int i18 = (~i17) & i16;
        int i19 = ~i16;
        int i20 = i18 | (i17 & i19);
        int i21 = i17 & i16;
        int i22 = ~((i21 & i20) | (i20 ^ i21));
        int i23 = ~i12;
        int i24 = (i19 & i12) | (i16 & i23);
        int i25 = i16 & i12;
        int i26 = (i24 ^ i25) | (i24 & i25);
        int i27 = ((~i26) | i26) & (~i26);
        int i28 = i22 & i27;
        int i29 = (i27 | i22) & (~i28);
        int i30 = (i29 & i28) | (i29 ^ i28);
        int i31 = ~iCurrentTimeMillis;
        int i32 = i31 & i12;
        int i33 = (i31 | i12) & (~i32);
        int i34 = ~((i33 & i32) | (i33 ^ i32));
        int i35 = i30 ^ i34;
        int i36 = i30 & i34;
        int i37 = -(-(((i36 & i35) | (i35 ^ i36)) * (-397)));
        int i38 = i15 ^ i37;
        int i39 = (i37 & i15) << 1;
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        int i41 = ~length3;
        int i42 = (i16 | length3) & i41;
        int i43 = (i42 & i23) | ((~i42) & i12);
        int i44 = i42 & i12;
        int i45 = -(-((~((i44 & i43) | (i43 ^ i44))) * (-397)));
        int i46 = i40 & i45;
        int i47 = i46 + ((i45 ^ i40) | i46);
        int i48 = i41 ^ i12;
        int i49 = i41 & i12;
        int i50 = ~((i49 & i48) | (i48 ^ i49));
        int i51 = (i50 & iCurrentTimeMillis) | (iCurrentTimeMillis ^ i50);
        int i52 = ~(length3 | (~i12));
        int i53 = -(-(((i51 & i52) | (i51 ^ i52)) * 397));
        int i54 = i47 & i53;
        int i55 = (i54 - (~(-(-((i53 ^ i47) | i54))))) - 1;
        int length4 = bArr5.length;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i56 = length4 * (-1965);
        int i57 = -(-(i55 * 984));
        int i58 = ((((~i57) & i56) | ((~i56) & i57)) - (~((i56 & i57) << 1))) - 1;
        int i59 = ~i55;
        int i60 = length4 & i59;
        int i61 = ((i60 | ((~i60) & (length4 | i59))) * 983) + i58;
        int i62 = ~length4;
        int i63 = ~length4;
        int i64 = (length4 | i63) & i62;
        int i65 = ~iCurrentTimeMillis2;
        int i66 = ~(((iCurrentTimeMillis2 | (~iCurrentTimeMillis2)) & i65) | i59);
        int i67 = i64 & i66;
        int i68 = (i66 | i64) & (~i67);
        int i69 = -(~(((i68 & i67) | (i68 ^ i67)) * (-983)));
        int i70 = ((i61 & i69) + (i69 | i61)) - 1;
        int i71 = i63 ^ i65;
        int i72 = i63 & i65;
        int i73 = (i71 & i72) | (i71 ^ i72);
        int i74 = (i73 | (~i73)) & (~i73);
        int i75 = ~((i64 & i55) | (i64 ^ i55));
        int i76 = ((~i75) & i74) | ((~i74) & i75);
        int i77 = i75 & i74;
        int i78 = -(-(((i77 & i76) | (i76 ^ i77)) * 983));
        byte[] bArr6 = new byte[(((i70 ^ i78) | (i70 & i78)) << 1) - ((i78 & (~i70)) | ((~i78) & i70))];
        this.f54047s0 = bArr6;
        System.arraycopy(bArr, 0, bArr6, 0, bArr.length);
        int length5 = bArr.length;
        int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
        int i79 = length5 * 677;
        int i80 = ((i79 ^ 1) + ((i79 & 1) << 1)) - 1;
        int i81 = ~iCurrentTimeMillis3;
        int i82 = ~length5;
        int i83 = (length5 & i81) | (iCurrentTimeMillis3 & i82);
        int i84 = length5 & iCurrentTimeMillis3;
        int i85 = (i83 & i84) | (i83 ^ i84);
        int i86 = i85 ^ (-1);
        int i87 = ((i85 & i86) | (i86 ^ i85)) * (-676);
        int i88 = i80 & i87;
        int i89 = ((i80 | i87) & (~i88)) + (i88 << 1);
        int i90 = ~length5;
        int i91 = (i90 & length5) | (i90 ^ length5);
        int i92 = (i91 | (~i91)) & (~i91);
        int i93 = ~iCurrentTimeMillis3;
        int i94 = (i93 & i82) | ((~i93) & length5);
        int i95 = i93 & length5;
        int i96 = (i95 & i94) | (i94 ^ i95);
        int i97 = (i96 | (~i96)) & (~i96);
        int i98 = i92 & i97;
        int i99 = -(~((((i92 | i97) & (~i98)) | i98) * 676));
        int i100 = ((-1) << 1) - ((((i89 | i99) << 1) - (i89 ^ i99)) ^ (-1));
        int i101 = ~i82;
        int i102 = (i101 & i82) | (i101 ^ i82);
        int i103 = (i102 | (~i102)) & (~i102);
        int i104 = i81 | (~i81);
        int i105 = (i104 | (~i104)) & (~i104);
        int i106 = (i105 & i103) | (i103 ^ i105);
        int i107 = length5 & (~0);
        int i108 = i107 & iCurrentTimeMillis3;
        int i109 = (i107 | iCurrentTimeMillis3) & (~i108);
        int i110 = (i109 & i108) | (i109 ^ i108);
        int i111 = (i110 | (~i110)) & (~i110);
        int i112 = i106 & i111;
        int i113 = (i111 | i106) & (~i112);
        int i114 = ((i113 & i112) | (i113 ^ i112)) * 676;
        int i115 = i100 & i114;
        int i116 = -(-((i114 ^ i100) | i115));
        int i117 = ((i115 | i116) << 1) - (i116 ^ i115);
        System.arraycopy(bArr2, 0, bArr6, i117, bArr2.length);
        int length6 = bArr2.length;
        int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
        int i118 = length6 * (-55);
        int i119 = i117 * (-55);
        int i120 = i118 & i119;
        int i121 = -(-((i118 ^ i119) | i120));
        int i122 = ((i120 | i121) << 1) - (i121 ^ i120);
        int i123 = length6 ^ iCurrentTimeMillis4;
        int i124 = length6 & iCurrentTimeMillis4;
        int i125 = ~((i123 & i124) | (i123 ^ i124));
        int i126 = i117 & i125;
        int i127 = (i125 | i117) & (~i126);
        int i128 = -(-(((i127 & i126) | (i127 ^ i126)) * 56));
        int i129 = ((i122 ^ i128) | (i122 & i128)) << 1;
        int i130 = -((i128 & (~i122)) | ((~i128) & i122));
        int i131 = (i129 & i130) + (i130 | i129);
        int i132 = length6 & i117;
        int i133 = -(-((~(i132 | ((~i132) & (length6 | i117)))) * (-56)));
        int i134 = (((i131 ^ i133) | (i131 & i133)) << 1) - ((i133 & (~i131)) | ((~i133) & i131));
        int i135 = ~iCurrentTimeMillis4;
        int i136 = ~((i135 & i117) | (i135 ^ i117));
        int i137 = ((~i136) & length6) | ((~length6) & i136);
        int i138 = length6 & i136;
        int i139 = ((i138 & i137) | (i137 ^ i138)) * 56;
        int i140 = (((i134 | i139) << 1) - (~(-((i139 & (~i134)) | ((~i139) & i134))))) - 1;
        System.arraycopy(bArr3, 0, bArr6, i140, bArr3.length);
        int length7 = bArr3.length;
        System.currentTimeMillis();
        int i141 = ((length7 * (-623)) - (~(-(~(i140 * (-623)))))) - 2;
        int i142 = ~length7;
        int i143 = i142 * (-624);
        int i144 = i141 & i143;
        int i145 = (i141 ^ i143) | i144;
        int i146 = (i144 & i145) + (i145 | i144);
        int i147 = (~length7) & (i142 | length7);
        int i148 = ((~i147) & i140) | ((~i140) & i147);
        int i149 = i147 & i140;
        int i150 = -(-(((i149 & i148) | (i148 ^ i149)) * 624));
        int i151 = i146 & i150;
        int i152 = ((i146 ^ i150) | i151) << 1;
        int i153 = -((i150 | i146) & (~i151));
        int i154 = (i152 & i153) + (i153 | i152);
        int i155 = length7 & i140;
        int i156 = (((length7 | i140) & (~i155)) | i155) * 624;
        int i157 = i154 & i156;
        int i158 = -(-((i156 ^ i154) | i157));
        int i159 = (i157 & i158) + (i158 | i157);
        System.arraycopy(bArr4, 0, bArr6, i159, bArr4.length);
        int length8 = bArr4.length;
        int iCurrentTimeMillis5 = (int) System.currentTimeMillis();
        int i160 = length8 * 465;
        int i161 = i159 * (-463);
        int i162 = (i160 & i161) + (i160 | i161);
        int i163 = ~i159;
        int i164 = ~i159;
        int i165 = ~iCurrentTimeMillis5;
        int i166 = ~((i163 & (i164 | i159)) | i165);
        int i167 = ~(i164 | length8);
        int i168 = (i166 & i167) | (i166 ^ i167);
        int i169 = (~iCurrentTimeMillis5) & (i165 | iCurrentTimeMillis5);
        int i170 = i169 ^ length8;
        int i171 = ~length8;
        int i172 = i169 & length8;
        int i173 = ~((i172 & i170) | (i170 ^ i172));
        int i174 = -(~(((i168 & i173) | (i168 ^ i173)) * 464));
        int i175 = ((i162 & i174) + (i174 | i162)) - 1;
        int i176 = ~length8;
        int i177 = iCurrentTimeMillis5 ^ i176;
        int i178 = i176 & iCurrentTimeMillis5;
        int i179 = (i178 & i177) | (i177 ^ i178);
        int i180 = ~i159;
        int i181 = i179 ^ i180;
        int i182 = ~i180;
        int i183 = i179 & i180;
        int i184 = -(-(((i183 & i181) | (i181 ^ i183)) * (-464)));
        int i185 = ((i175 ^ i184) | (i175 & i184)) << 1;
        int i186 = -((i184 & (~i175)) | ((~i184) & i175));
        int i187 = ((i185 | i186) << 1) - (i186 ^ i185);
        int i188 = (i180 & i171) | (length8 & i182);
        int i189 = i180 & length8;
        int i190 = (i189 & i188) | (i188 ^ i189);
        int i191 = (i190 | (~i190)) & (~i190);
        int i192 = (length8 & i165) | (iCurrentTimeMillis5 & i171);
        int i193 = length8 & iCurrentTimeMillis5;
        int i194 = ~((i193 & i192) | (i192 ^ i193));
        int i195 = ((~i194) & i191) | ((~i191) & i194);
        int i196 = i194 & i191;
        int i197 = ((i196 & i195) | (i195 ^ i196)) * 464;
        int i198 = i187 & i197;
        System.arraycopy(bArr5, 0, bArr6, ((((i187 ^ i197) | i198) << 1) - (~(-((i197 | i187) & (~i198))))) - 1, bArr5.length);
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        Object onFocusChangeListener;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i17 = ~(i13 | i12);
        int i18 = ~((~i11) | i10);
        int i19 = ((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16;
        if (i19 == 1) {
            awk awkVar = (awk) objArr[0];
            int i20 = f54046u0;
            int i21 = i20 & 29;
            int i22 = ((i20 ^ 29) | i21) << 1;
            int i23 = -((i20 | 29) & (~i21));
            int i24 = (i22 & i23) + (i23 | i22);
            f54045t0 = i24 % 128;
            byte[] bArr = (byte[]) (i24 % 2 != 0 ? bek.setOnFocusChangeListener(new Object[]{awkVar.f54047s0, 1, 95}, 525237936, -525237917, 1) : bek.setOnFocusChangeListener(new Object[]{awkVar.f54047s0, 0, 32}, 525237936, -525237917, 0));
            int i25 = f54046u0;
            int i26 = i25 & 45;
            int i27 = (i26 - (~((i25 ^ 45) | i26))) - 1;
            f54045t0 = i27 % 128;
            int i28 = i27 % 2;
            return bArr;
        }
        if (i19 == 2) {
            awk awkVar2 = (awk) objArr[0];
            int i29 = f54045t0;
            int i30 = (i29 & 21) + (i29 | 21);
            f54046u0 = i30 % 128;
            int i31 = i30 % 2;
            byte[] bArr2 = awkVar2.f54047s0;
            awn y7 = awkVar2.setY();
            int iIntValue = ((Integer) awn.setX(new Object[]{y7}, -1903363914, 1903363915, System.identityHashCode(y7))).intValue() << 1;
            int i32 = (iIntValue & 40) + (iIntValue | 40);
            int length = awkVar2.f54047s0.length;
            byte[] bArr3 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2, Integer.valueOf(i32), Integer.valueOf((((length & 31) | ((~length) & (-32))) - (~((length & (-32)) << 1))) - 1)}, 525237936, -525237917, i32);
            int i33 = f54045t0 + 123;
            f54046u0 = i33 % 128;
            if (i33 % 2 != 0) {
                return bArr3;
            }
            throw null;
        }
        if (i19 == 3) {
            awk awkVar3 = (awk) objArr[0];
            int i34 = f54046u0;
            int i35 = (-2) - ((((i34 | 74) << 1) - (i34 ^ 74)) ^ (-1));
            f54045t0 = i35 % 128;
            int i36 = i35 % 2;
            awn y10 = awkVar3.setY();
            y1 y1Var = (y1) awn.setX(new Object[]{y10}, 40459668, -40459668, System.identityHashCode(y10));
            byte[] bArr4 = new byte[((Integer) y1.g(new Object[]{y1Var}, 1648377774, -1648377774, System.identityHashCode(y1Var))).intValue()];
            int i37 = f54045t0;
            int i38 = ((i37 | 97) << 1) - (i37 ^ 97);
            f54046u0 = i38 % 128;
            int i39 = i38 % 2;
            return bArr4;
        }
        if (i19 == 4) {
            awk awkVar4 = (awk) objArr[0];
            int i40 = f54045t0;
            int i41 = i40 & 61;
            int i42 = (((i40 | 61) & (~i41)) - (~(i41 << 1))) - 1;
            f54046u0 = i42 % 128;
            int i43 = i42 % 2;
            byte[] bArr5 = awkVar4.f54047s0;
            if (i43 == 0) {
                int length2 = bArr5.length >> 40;
                onFocusChangeListener = bek.setOnFocusChangeListener(new Object[]{bArr5, Integer.valueOf(length2), Integer.valueOf(bArr5.length)}, 525237936, -525237917, length2);
            } else {
                int length3 = bArr5.length;
                int i44 = length3 & (-32);
                int i45 = ((((length3 ^ (-32)) | i44) << 1) - (~(-((length3 | (-32)) & (~i44))))) - 1;
                onFocusChangeListener = bek.setOnFocusChangeListener(new Object[]{bArr5, Integer.valueOf(i45), Integer.valueOf(bArr5.length)}, 525237936, -525237917, i45);
            }
            return (byte[]) onFocusChangeListener;
        }
        if (i19 != 5) {
            awk awkVar5 = (awk) objArr[0];
            int i46 = f54045t0;
            int i47 = (i46 & 1) + (i46 | 1);
            f54046u0 = i47 % 128;
            int i48 = i47 % 2;
            byte[] bArr6 = (byte[]) bek.setOnFocusChangeListener(new Object[]{awkVar5.f54047s0, 32, 40}, 525237936, -525237917, 32);
            int i49 = f54045t0;
            int i50 = ((i49 ^ 10) + ((i49 & 10) << 1)) - 1;
            f54046u0 = i50 % 128;
            int i51 = i50 % 2;
            return bArr6;
        }
        awk awkVar6 = (awk) objArr[0];
        int i52 = f54045t0;
        int i53 = i52 & 35;
        int i54 = (((i52 ^ 35) | i53) << 1) - ((i52 | 35) & (~i53));
        f54046u0 = i54 % 128;
        int i55 = i54 % 2;
        byte[] bArr7 = awkVar6.f54047s0;
        awn y11 = awkVar6.setY();
        int iIntValue2 = ((Integer) awn.setX(new Object[]{y11}, -1903363914, 1903363915, System.identityHashCode(y11))).intValue() << 1;
        int iIdentityHashCode = System.identityHashCode(awkVar6);
        int i56 = iIntValue2 * (-209);
        int i57 = i56 & (-8360);
        int i58 = -(-(i56 | (-8360)));
        int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
        int i60 = ~iIntValue2;
        int i61 = (i60 | iIntValue2) & i60;
        int i62 = i61 & (-41);
        int i63 = (~i62) & (i61 | (-41));
        int i64 = (~((i63 ^ i62) | (i62 & i63))) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
        int i65 = ((i59 ^ i64) | (i59 & i64)) << 1;
        int i66 = -(((~i64) & i59) | ((~i59) & i64));
        int i67 = (i65 ^ i66) + ((i66 & i65) << 1);
        int i68 = ~iIdentityHashCode;
        int i69 = ((~i68) & (-41)) | (i68 & 40);
        int i70 = (-41) & i68;
        int i71 = ~((i69 ^ i70) | (i69 & i70));
        int i72 = i60 & iIdentityHashCode;
        int i73 = (~i72) & (i60 | iIdentityHashCode);
        int i74 = (i73 ^ i72) | (i72 & i73);
        int i75 = ~i74;
        int i76 = (i74 | i75) & i75;
        int i77 = ((i76 & i71) | ((~i76) & i71) | ((~i71) & i76)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
        int i78 = i67 & i77;
        int i79 = (i77 ^ i67) | i78;
        int i80 = (i78 & i79) + (i79 | i78);
        int i81 = i61 & i68;
        int i82 = (~i81) & (i68 | i61);
        int i83 = (i81 & i82) | (i82 ^ i81);
        int i84 = (i83 & (-41)) | ((~i83) & 40);
        int i85 = i83 & 40;
        int i86 = ~((i85 & i84) | (i84 ^ i85));
        int i87 = ((-41) & i60) | (iIntValue2 & 40);
        int i88 = iIntValue2 & (-41);
        int i89 = (i87 & i88) | (i87 ^ i88);
        int i90 = i89 ^ iIdentityHashCode;
        int i91 = iIdentityHashCode & i89;
        int i92 = ~((i91 & i90) | (i90 ^ i91));
        int i93 = ((~i92) & i86) | ((~i86) & i92);
        int i94 = i92 & i86;
        int i95 = ((i94 & i93) | (i93 ^ i94)) * ErrorCodes.ERR_CRY_IO_PROPERTIES;
        byte[] bArr8 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr7, 40, Integer.valueOf(((i80 | i95) << 1) - (i95 ^ i80))}, 525237936, -525237917, 40);
        int i96 = f54045t0;
        int i97 = i96 & 55;
        int i98 = (i96 ^ 55) | i97;
        int i99 = (i97 & i98) + (i98 | i97);
        f54046u0 = i99 % 128;
        if (i99 % 2 != 0) {
            return bArr8;
        }
        throw null;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setY(new Object[]{this}, 164809812, -164809812, System.identityHashCode(this));
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, -629892837, 629892838, System.identityHashCode(this));
    }

    public final byte[] setLayoutAnimation() {
        return (byte[]) setY(new Object[]{this}, 873036347, -873036343, System.identityHashCode(this));
    }

    public final byte[] setNavigationOnClickListener() {
        return (byte[]) setY(new Object[]{this}, -1359551197, 1359551202, System.identityHashCode(this));
    }

    public final byte[] setOnDragListener() {
        return (byte[]) setY(new Object[]{this}, 1267407632, -1267407630, System.identityHashCode(this));
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setY(new Object[]{this}, -73620001, 73620004, System.identityHashCode(this));
    }
}
