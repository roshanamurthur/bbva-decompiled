package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class ago extends aee {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52624x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52625y0 = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f52626w0;

    public ago(add[] addVarArr) {
        super(false, addVarArr);
        this.f52626w0 = -1;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int length;
        int i13;
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = (~(i14 | i15)) | (~(i15 | i12));
        int i17 = ~(i11 | (~i12) | i10);
        int i18 = (((~(i10 | i15 | i12)) | i17) * 470) + ((i16 | i17) * (-470)) + ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i19 = 0;
        if (i18 == 1) {
            ago agoVar = (ago) objArr[0];
            int i20 = f52625y0;
            int i21 = i20 & 7;
            int i22 = (i20 ^ 7) | i21;
            int i23 = (i21 ^ i22) + ((i21 & i22) << 1);
            f52624x0 = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = agoVar.f52626w0;
                throw null;
            }
            if (agoVar.f52626w0 < 0) {
                int i25 = ((i20 ^ 31) | (i20 & 31)) << 1;
                int i26 = -(((~i20) & 31) | (i20 & (-32)));
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                int i28 = i27 % 128;
                f52624x0 = i28;
                int i29 = i27 % 2;
                add[] addVarArr = agoVar.setOnFocusChangeListener;
                if (i29 != 0) {
                    length = addVarArr.length;
                    i13 = 1;
                } else {
                    length = addVarArr.length;
                    i13 = 0;
                }
                int i30 = (i28 & 97) + (i28 | 97);
                f52625y0 = i30 % 128;
                int i31 = i30 % 2;
                int i32 = 0;
                while (i32 < length) {
                    int i33 = f52625y0;
                    int i34 = i33 & 51;
                    int i35 = i34 + ((i33 ^ 51) | i34);
                    f52624x0 = i35 % 128;
                    int i36 = i35 % 2;
                    int iB = agoVar.setOnFocusChangeListener[i32].UiMessageCallbackKtWhenMappings().a().b(true);
                    int iIdentityHashCode = System.identityHashCode(agoVar);
                    int i37 = ((iB * 471) - (~(i13 * 471))) - 1;
                    int i38 = iB ^ i13;
                    int i39 = iB & i13;
                    int i40 = ((i38 & i39) | (i38 ^ i39)) * (-470);
                    int i41 = i37 & i40;
                    int i42 = (i37 | i40) & (~i41);
                    int i43 = -(-(i41 << 1));
                    int i44 = ((i42 | i43) << 1) - (i42 ^ i43);
                    int i45 = ~iB;
                    int i46 = (i45 | iB) & i45;
                    int i47 = ~i13;
                    int i48 = ((~i47) & i46) | ((~i46) & i47);
                    int i49 = i46 & i47;
                    int i50 = (i49 & i48) | (i48 ^ i49);
                    int i51 = ~i50;
                    int i52 = (i50 | i51) & i51;
                    int i53 = (i47 | i13) & i47;
                    int i54 = (i53 ^ iIdentityHashCode) | (i53 & iIdentityHashCode);
                    int i55 = ~i54;
                    int i56 = (i54 | i55) & i55;
                    int i57 = ((~i52) & i56) | ((~i56) & i52) | (i52 & i56);
                    int i58 = ~iIdentityHashCode;
                    int i59 = i58 & iB;
                    int i60 = (i58 | iB) & (~i59);
                    int i61 = (i60 & i59) | (i60 ^ i59);
                    int i62 = (i47 & i61) | ((~i61) & i13);
                    int i63 = i61 & i13;
                    int i64 = ~((i62 & i63) | (i62 ^ i63));
                    int i65 = i57 ^ i64;
                    int i66 = i57 & i64;
                    int i67 = ((i66 & i65) | (i65 ^ i66)) * (-470);
                    int i68 = (i44 & i67) + (i67 | i44);
                    int i69 = (i53 & i45) | ((~i53) & iB);
                    int i70 = iB & i53;
                    int i71 = (i69 & i70) | (i69 ^ i70);
                    int i72 = i71 & iIdentityHashCode;
                    int i73 = (i71 | iIdentityHashCode) & (~i72);
                    int i74 = ~((i73 & i72) | (i73 ^ i72));
                    int i75 = (i13 | i61) & (~i63);
                    int i76 = ~((i75 & i63) | (i75 ^ i63));
                    int i77 = i74 ^ i76;
                    int i78 = i74 & i76;
                    int i79 = (i68 - (~(-(~(((i78 & i77) | (i77 ^ i78)) * 470))))) - 1;
                    i13 = (i79 << 1) + (i79 ^ (-1));
                    int i80 = (((i32 & 37) | ((~i32) & (-38))) - (~(-(-((i32 & (-38)) << 1))))) - 1;
                    i32 = (((i80 ^ 39) | (i80 & 39)) << 1) - (((~i80) & 39) | (i80 & (-40)));
                    int i81 = f52625y0;
                    int i82 = ((i81 ^ 73) | (i81 & 73)) << 1;
                    int i83 = -(((~i81) & 73) | (i81 & (-74)));
                    int i84 = (i82 & i83) + (i83 | i82);
                    f52624x0 = i84 % 128;
                    int i85 = i84 % 2;
                }
                agoVar.f52626w0 = i13;
                int i86 = f52624x0;
                int i87 = ((i86 & 46) + (i86 | 46)) - 1;
                f52625y0 = i87 % 128;
                int i88 = i87 % 2;
            }
            int i89 = agoVar.f52626w0;
            int i90 = f52624x0;
            int i91 = i90 ^ 125;
            int i92 = (i90 & 125) << 1;
            int i93 = (i91 & i92) + (i92 | i91);
            f52625y0 = i93 % 128;
            if (i93 % 2 == 0) {
                int i94 = 96 / 0;
            }
            return Integer.valueOf(i89);
        }
        if (i18 != 2) {
            if (i18 == 3) {
                ago agoVar2 = (ago) objArr[0];
                int i95 = f52625y0;
                int i96 = i95 & 55;
                int i97 = (i95 | 55) & (~i96);
                int i98 = i96 << 1;
                int i99 = (i97 & i98) + (i97 | i98);
                int i100 = i99 % 128;
                f52624x0 = i100;
                int i101 = i99 % 2;
                int i102 = ((((i100 ^ 67) | (i100 & 67)) << 1) - (~(-(((~i100) & 67) | (i100 & (-68)))))) - 1;
                f52625y0 = i102 % 128;
                int i103 = i102 % 2;
                return agoVar2;
            }
            ago agoVar3 = (ago) objArr[0];
            boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
            int i104 = f52624x0;
            int i105 = ((i104 ^ 77) | (i104 & 77)) << 1;
            int i106 = -(((~i104) & 77) | (i104 & (-78)));
            int i107 = (i105 & i106) + (i106 | i105);
            f52625y0 = i107 % 128;
            if (i107 % 2 == 0) {
                int iIntValue = ((Integer) setOnFocusChangeListener(new Object[]{agoVar3}, 419729155, -419729154, System.identityHashCode(agoVar3))).intValue();
                ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue)}, 1150803379, -1150803367, iIntValue)).intValue();
                throw null;
            }
            int iIntValue2 = ((Integer) setOnFocusChangeListener(new Object[]{agoVar3}, 419729155, -419729154, System.identityHashCode(agoVar3))).intValue();
            int iIntValue3 = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue2)}, 1150803379, -1150803367, iIntValue2)).intValue();
            int i108 = f52624x0;
            int i109 = i108 ^ 25;
            int i110 = -(-((i108 & 25) << 1));
            int i111 = ((i109 | i110) << 1) - (i110 ^ i109);
            f52625y0 = i111 % 128;
            int i112 = i111 % 2;
            return Integer.valueOf(iIntValue3);
        }
        ago agoVar4 = (ago) objArr[0];
        aeb aebVar = (aeb) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i113 = f52625y0;
        int i114 = i113 & 21;
        int i115 = (i114 - (~(-(-((i113 ^ 21) | i114))))) - 1;
        f52624x0 = i115 % 128;
        int i116 = i115 % 2;
        aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 49}, 1303469841, -1303469839, 49);
        q0 q0VarH = aebVar.h();
        int length2 = agoVar4.setOnFocusChangeListener.length;
        if (agoVar4.f52626w0 < 0) {
            int i117 = f52625y0;
            int i118 = i117 & 111;
            int i119 = (((i117 ^ 111) | i118) << 1) - ((i117 | 111) & (~i118));
            int i120 = i119 % 128;
            f52624x0 = i120;
            if (i119 % 2 == 0 ? length2 <= 16 : length2 <= 110) {
                ady[] adyVarArr = new ady[length2];
                int i121 = i120 & 71;
                int i122 = ((~i121) & (i120 | 71)) + (i121 << 1);
                f52625y0 = i122 % 128;
                int i123 = i122 % 2;
                int i124 = 0;
                int i125 = 0;
                while (i124 < length2) {
                    int i126 = f52624x0;
                    int i127 = i126 & 107;
                    int i128 = (i126 ^ 107) | i127;
                    int i129 = (i127 ^ i128) + ((i128 & i127) << 1);
                    f52625y0 = i129 % 128;
                    int i130 = i129 % 2;
                    ady adyVarA = agoVar4.setOnFocusChangeListener[i124].UiMessageCallbackKtWhenMappings().a();
                    adyVarArr[i124] = adyVarA;
                    int iB2 = adyVarA.b(true);
                    int i131 = ((~iB2) & i125) | ((~i125) & iB2);
                    int i132 = -(-((i125 & iB2) << 1));
                    i125 = ((i132 & i131) << 1) + (i131 ^ i132);
                    i124++;
                    int i133 = f52625y0 + 13;
                    f52624x0 = i133 % 128;
                    int i134 = i133 % 2;
                }
                agoVar4.f52626w0 = i125;
                aeb.setX(new Object[]{aebVar, Integer.valueOf(i125)}, 1357165778, -1357165764, i125);
                int i135 = f52624x0;
                int i136 = i135 & 1;
                int i137 = -(-((i135 ^ 1) | i136));
                int i138 = ((i136 | i137) << 1) - (i137 ^ i136);
                f52625y0 = i138 % 128;
                int i139 = i138 % 2;
                int i140 = 0;
                while (i140 < length2) {
                    int iIdentityHashCode2 = System.identityHashCode(agoVar4);
                    int i141 = (-8400897) ^ iIdentityHashCode2;
                    int i142 = ~iIdentityHashCode2;
                    int i143 = (-8400897) & iIdentityHashCode2;
                    int i144 = (~((i143 & i141) | (i141 ^ i143))) * 623;
                    int i145 = 1991286692 & i144;
                    int i146 = -(-((i144 ^ 1991286692) | i145));
                    int i147 = (i145 & i146) + (i146 | i145);
                    int i148 = -(-((((-1021311903) & i142) | (i142 ^ (-1021311903))) * (-623)));
                    int i149 = i147 & i148;
                    int i150 = i149 + ((i148 ^ i147) | i149);
                    int i151 = (-143489435) & iIdentityHashCode2;
                    int i152 = ((-143489435) | iIdentityHashCode2) & (~i151);
                    int i153 = ~((i152 & i151) | (i152 ^ i151));
                    int i154 = (i153 & 8400896) | (8400896 ^ i153);
                    int i155 = ~((iIdentityHashCode2 & (-886223365)) | ((-886223365) ^ iIdentityHashCode2));
                    int i156 = i154 & i155;
                    int i157 = -(-((((i155 | i154) & (~i156)) | i156) * 623));
                    int i158 = (i150 ^ i157) + ((i157 & i150) << 1);
                    int iIdentityHashCode3 = System.identityHashCode(agoVar4);
                    int i159 = ~iIdentityHashCode3;
                    int i160 = (i159 | iIdentityHashCode3) & i159;
                    int i161 = ~(((-1076953121) & i160) | ((-1076953121) ^ i160));
                    int i162 = (i161 & 818446850) | (i161 ^ 818446850);
                    int i163 = (1278288297 & i159) | (iIdentityHashCode3 & (-1278288298));
                    int i164 = iIdentityHashCode3 & 1278288297;
                    int i165 = (i163 ^ i164) | (i164 & i163);
                    int i166 = ~i165;
                    int i167 = (i165 | i166) & i166;
                    int i168 = i162 ^ i167;
                    int i169 = i167 & i162;
                    int i170 = ((i169 & i168) | (i168 ^ i169)) * (-68);
                    int i171 = ((~i170) & (-1391453175)) | (i170 & 1391453174);
                    int i172 = (i170 & (-1391453175)) << 1;
                    int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
                    int i174 = 1019782027 ^ i160;
                    int i175 = i160 & 1019782027;
                    int i176 = (~((i174 ^ i175) | (i175 & i174) | 1278288297)) * (-68);
                    int i177 = (((i173 ^ i176) | (i173 & i176)) << 1) - ((i176 & (~i173)) | ((~i176) & i173));
                    int i178 = (-1278288298) & i159;
                    int i179 = ((-1278288298) | i159) & (~i178);
                    int i180 = ~((i179 & i178) | (i179 ^ i178));
                    int i181 = 1019782027 ^ i180;
                    int i182 = 1019782027 & i180;
                    if (i158 > (i177 - (~(-(-(((i182 & i181) | (i181 ^ i182)) * 68))))) - 1) {
                        q0VarH.m(adyVarArr[i140]);
                        int i183 = i140 & 108;
                        i140 = (i183 - (~((i140 ^ 108) | i183))) - 105;
                    } else {
                        q0VarH.m(adyVarArr[i140]);
                        i140++;
                    }
                }
                int i184 = f52624x0;
                int i185 = ((i184 ^ 109) | (i184 & 109)) << 1;
                int i186 = -(((~i184) & 109) | (i184 & (-110)));
                int i187 = (i185 ^ i186) + ((i186 & i185) << 1);
                f52625y0 = i187 % 128;
                if (i187 % 2 != 0) {
                    return null;
                }
                int i188 = 30 / 0;
                return null;
            }
        }
        int iIntValue4 = ((Integer) setOnFocusChangeListener(new Object[]{agoVar4}, 419729155, -419729154, System.identityHashCode(agoVar4))).intValue();
        aeb.setX(new Object[]{aebVar, Integer.valueOf(iIntValue4)}, 1357165778, -1357165764, iIntValue4);
        int i189 = f52624x0;
        int i190 = i189 & 3;
        int i191 = i189 | 3;
        while (true) {
            int i192 = i190 + i191;
            f52625y0 = i192 % 128;
            int i193 = i192 % 2;
            if (i19 >= length2) {
                int i194 = f52624x0 + 117;
                f52625y0 = i194 % 128;
                int i195 = i194 % 2;
                return null;
            }
            int i196 = f52625y0;
            int i197 = ((i196 & 103) - (~(i196 | 103))) - 1;
            f52624x0 = i197 % 128;
            int i198 = i197 % 2;
            q0VarH.m(agoVar4.setOnFocusChangeListener[i19].UiMessageCallbackKtWhenMappings());
            int i199 = i19 & (-35);
            int i200 = (i19 | (-35)) & (~i199);
            int i201 = -(-(i199 << 1));
            int i202 = (i200 & i201) + (i200 | i201);
            int i203 = i202 & 36;
            i19 = i203 + ((i202 ^ 36) | i203);
            int i204 = f52624x0;
            i190 = i204 ^ 1;
            i191 = (i204 & 1) << 1;
        }
    }

    @Override // com.mypinpad.tsdk.isolation.aee, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -1120114823, 1120114826, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setOnFocusChangeListener(new Object[]{this, Boolean.valueOf(z10)}, 1587482849, -1587482849, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setOnFocusChangeListener(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1471208892, -1471208890, System.identityHashCode(this));
    }

    public ago(adh adhVar) {
        super(adhVar, false);
        this.f52626w0 = -1;
    }

    public ago() {
        this.f52626w0 = -1;
    }
}
