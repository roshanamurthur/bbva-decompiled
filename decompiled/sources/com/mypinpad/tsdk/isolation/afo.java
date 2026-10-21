package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afo extends adm {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f52598w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52599x0 = 1;

    public afo(byte[] bArr) {
        super(bArr);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        Object obj;
        afo afoVar;
        afo afoVar2;
        int i13 = ~i10;
        int i14 = ((~(i11 | i13)) * 381) + (((~(i10 | i11)) | (~((~i12) | i11)) | (~((~i11) | i13))) * 381) + ((i11 | i12 | i13) * (-381)) + (i11 * 382) + (i10 * (-380));
        if (i14 != 1) {
            if (i14 == 2) {
                afo afoVar3 = (afo) objArr[0];
                System.identityHashCode(afoVar3);
                System.identityHashCode(afoVar3);
                byte[] bArr5 = afoVar3.f52481t0;
                int length = bArr5.length;
                int iIdentityHashCode = System.identityHashCode(afoVar3);
                int i15 = -(-(length * 881));
                int i16 = (((((-881) ^ i15) | ((-881) & i15)) << 1) - (~(-((i15 & 880) | ((-881) & (~i15)))))) - 1;
                int i17 = ~length;
                int i18 = ~i17;
                int i19 = i18 & (i18 | i17);
                int i20 = ~iIdentityHashCode;
                int i21 = i19 & i20;
                int i22 = (i19 | i20) & (~i21);
                int i23 = (i22 & i21) | (i22 ^ i21);
                int i24 = ~(((i17 | length) & i17) | iIdentityHashCode);
                int i25 = i23 & i24;
                int i26 = (~i25) & (i23 | i24);
                int i27 = -(-(((i26 & i25) | (i26 ^ i25)) * (-880)));
                int i28 = i16 ^ i27;
                int i29 = (i27 & i16) << 1;
                int i30 = ((i28 | i29) << 1) - (i29 ^ i28);
                int i31 = ~i20;
                int i32 = (i17 & i31) | ((~i31) & length);
                int i33 = length & i31;
                int i34 = (i33 & i32) | (i32 ^ i33);
                int i35 = (i20 ^ iIdentityHashCode) | (i20 & iIdentityHashCode);
                int i36 = ~i35;
                int i37 = (i35 | i36) & i36;
                int i38 = ((~i37) & i34) | ((~i34) & i37);
                int i39 = i34 & i37;
                int i40 = ((i39 & i38) | (i38 ^ i39)) * (-880);
                int i41 = i30 & i40;
                int i42 = (i40 ^ i30) | i41;
                int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
                int i44 = (-1) ^ iIdentityHashCode;
                int i45 = (~((iIdentityHashCode & i44) | (i44 ^ iIdentityHashCode))) * 880;
                int i46 = i43 & i45;
                byte b10 = bArr5[((((i43 ^ i45) | i46) << 1) - (~(-((i45 | i43) & (~i46))))) - 1];
                byte[] bArr6 = afoVar3.f52481t0;
                if (b10 != 90) {
                    int i47 = f52599x0;
                    int i48 = (((i47 | 10) << 1) - (i47 ^ 10)) - 1;
                    f52598w0 = i48 % 128;
                    int i49 = i48 % 2;
                    return bArr6;
                }
                int i50 = f52598w0;
                int i51 = i50 & 49;
                int i52 = ((i50 | 49) & (~i51)) + (i51 << 1);
                f52599x0 = i52 % 128;
                if (i52 % 2 == 0) {
                    afoVar3.setLayoutAnimation();
                    throw null;
                }
                if (!afoVar3.setLayoutAnimation()) {
                    int length2 = bArr6.length;
                    int i53 = length2 & 4;
                    bArr = new byte[i53 + ((length2 ^ 4) | i53)];
                    System.arraycopy(bArr6, 0, bArr, 0, bArr6.length - 1);
                    byte[] bArr7 = (byte[]) bez.setX(new Object[]{"0000Z"}, -491566229, 491566235, (int) System.currentTimeMillis());
                    int length3 = bArr6.length;
                    int iIdentityHashCode2 = System.identityHashCode(afoVar3);
                    int i54 = (length3 * (-1917)) - 960;
                    int i55 = ~length3;
                    int i56 = ~iIdentityHashCode2;
                    int i57 = i55 ^ i56;
                    int i58 = i55 & i56;
                    int i59 = ~((i57 & i58) | (i57 ^ i58));
                    int i60 = (-1) ^ iIdentityHashCode2;
                    int i61 = ~((i60 & iIdentityHashCode2) | (i60 ^ iIdentityHashCode2));
                    int i62 = i59 & i61;
                    int i63 = (i61 | i59) & (~i62);
                    int i64 = ((i63 & i62) | (i63 ^ i62)) * 959;
                    int i65 = i54 ^ i64;
                    int i66 = ((i64 & i54) | i65) << 1;
                    int i67 = -i65;
                    int i68 = ((((i66 | i67) << 1) - (i66 ^ i67)) - (~(-(~(i55 * (-959)))))) - 2;
                    int i69 = iIdentityHashCode2 | i55;
                    int i70 = ~i69;
                    int i71 = (i69 | i70) & i70;
                    int i72 = ~i56;
                    int i73 = ~((i72 & i56) | (i72 ^ i56));
                    int i74 = i71 & i73;
                    int i75 = -(~((((i71 | i73) & (~i74)) | i74) * 959));
                    int i76 = (i68 & i75) + (i75 | i68);
                    System.arraycopy(bArr7, 0, bArr, (i76 ^ (-1)) + (i76 << 1), 5);
                    int i77 = f52598w0 + 47;
                    f52599x0 = i77 % 128;
                    int i78 = i77 % 2;
                } else if (!afoVar3.setX()) {
                    int i79 = f52598w0;
                    int i80 = i79 & 27;
                    int i81 = (i79 | 27) & (~i80);
                    int i82 = i80 << 1;
                    int i83 = ((i81 | i82) << 1) - (i81 ^ i82);
                    f52599x0 = i83 % 128;
                    int i84 = i83 % 2;
                    int length4 = bArr6.length;
                    int iIdentityHashCode3 = System.identityHashCode(afoVar3);
                    int i85 = -(-(length4 * (-520)));
                    int i86 = 1044 ^ i85;
                    int i87 = ((((i85 & 1044) | i86) << 1) - (~(-i86))) - 1;
                    int i88 = ~iIdentityHashCode3;
                    int i89 = ~((i88 ^ length4) | (i88 & length4));
                    int i90 = ((~i89) & 2) | (i89 & (-3));
                    int i91 = i89 & 2;
                    int i92 = ((i91 & i90) | (i90 ^ i91)) * (-1042);
                    int i93 = i87 & i92;
                    int i94 = ((i87 ^ i92) | i93) << 1;
                    int i95 = -((i87 | i92) & (~i93));
                    int i96 = ((i94 | i95) << 1) - (i95 ^ i94);
                    int i97 = length4 ^ iIdentityHashCode3;
                    int i98 = length4 & iIdentityHashCode3;
                    int i99 = -(-(((i97 & i98) | (i97 ^ i98)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                    int i100 = i96 & i99;
                    int i101 = (i99 ^ i96) | i100;
                    int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
                    int i103 = ~length4;
                    int i104 = (-3) ^ i103;
                    int i105 = i103 & (-3);
                    int i106 = ~((i104 ^ i105) | (i105 & i104));
                    int i107 = ((-3) & i88) | (iIdentityHashCode3 & 2);
                    int i108 = iIdentityHashCode3 & (-3);
                    int i109 = ~((i108 & i107) | (i107 ^ i108));
                    int i110 = ((~i109) & i106) | ((~i106) & i109);
                    int i111 = i109 & i106;
                    int i112 = (i111 & i110) | (i110 ^ i111);
                    int i113 = i88 & 2;
                    int i114 = (i88 | 2) & (~i113);
                    int i115 = (i113 & i114) | (i114 ^ i113);
                    int i116 = ~((length4 & i115) | (i115 ^ length4));
                    int i117 = i112 ^ i116;
                    int i118 = i112 & i116;
                    int i119 = -(~(((i118 & i117) | (i117 ^ i118)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                    bArr4 = new byte[(-2) - (((i102 & i119) + (i119 | i102)) ^ (-1))];
                    int length5 = bArr6.length;
                    System.arraycopy(bArr6, 0, bArr4, 0, ((~length5) - (~(length5 << 1))) - 1);
                    System.arraycopy((byte[]) bez.setX(new Object[]{"00Z"}, -491566229, 491566235, (int) System.currentTimeMillis()), 0, bArr4, bArr6.length - 1, 3);
                    int i120 = f52598w0;
                    int i121 = ((i120 | 13) << 1) - (((~i120) & 13) | (i120 & (-14)));
                    f52599x0 = i121 % 128;
                    if (i121 % 2 == 0) {
                        obj = bArr4;
                        throw null;
                    }
                } else {
                    if (!afoVar3.setOnFocusChangeListener()) {
                        int i122 = f52598w0 + 69;
                        f52599x0 = i122 % 128;
                        if (i122 % 2 != 0) {
                            return bArr6;
                        }
                        throw null;
                    }
                    int i123 = f52598w0;
                    int i124 = i123 | 51;
                    int i125 = i124 << 1;
                    int i126 = -((~(i123 & 51)) & i124);
                    int i127 = (i125 ^ i126) + ((i126 & i125) << 1);
                    f52599x0 = i127 % 128;
                    int i128 = i127 % 2;
                    int length6 = bArr6.length;
                    int iIdentityHashCode4 = System.identityHashCode(afoVar3);
                    int i129 = (-2) - ((1000 - (~(-(-(length6 * (-500)))))) ^ (-1));
                    int i130 = ~length6;
                    int i131 = i130 & 1;
                    int i132 = ~i130;
                    int i133 = ((-2) & i132) | i131;
                    int i134 = i130 & (-2);
                    int i135 = (i133 & i134) | (i133 ^ i134);
                    int i136 = ~i135;
                    int i137 = (i135 | i136) & i136;
                    int i138 = (length6 & (-2)) | i131;
                    int i139 = 1 & length6;
                    int i140 = (i138 ^ i139) | (i138 & i139);
                    int i141 = ~iIdentityHashCode4;
                    int i142 = -(-(((~((iIdentityHashCode4 & i140) | (i140 & i141) | ((~i140) & iIdentityHashCode4))) | i137) * 501));
                    int i143 = i129 & i142;
                    int i144 = -(-((i142 ^ i129) | i143));
                    int i145 = ((i143 | i144) << 1) - (i144 ^ i143);
                    int i146 = (1 & i132) | i134 | i131;
                    int i147 = ~i146;
                    int i148 = ((i146 | i147) & i147) * 1002;
                    int i149 = (i145 & i148) + (i148 | i145);
                    int i150 = ((~i141) & 1) | (i141 & (-2));
                    int i151 = i141 & 1;
                    int i152 = (i150 & i151) | (i150 ^ i151);
                    int i153 = i152 ^ length6;
                    int i154 = i152 & length6;
                    int i155 = (~((i154 & i153) | (i153 ^ i154))) * 501;
                    int i156 = i149 & i155;
                    int i157 = ((i149 ^ i155) | i156) << 1;
                    int i158 = -((i155 | i149) & (~i156));
                    int i159 = (i157 & i158) + (i158 | i157);
                    int i160 = f52599x0;
                    int i161 = i160 & 81;
                    int i162 = i161 + ((i160 ^ 81) | i161);
                    while (true) {
                        f52598w0 = i162 % 128;
                        int i163 = i162 % 2;
                        if (i159 <= 0) {
                            break;
                        }
                        int i164 = f52599x0;
                        int i165 = (i164 | 3) << 1;
                        int i166 = -(((~i164) & 3) | (i164 & (-4)));
                        int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                        int i168 = i167 % 128;
                        f52598w0 = i168;
                        int i169 = i167 % 2;
                        if (bArr6[i159] != 48) {
                            break;
                        }
                        int i170 = i168 & 109;
                        int i171 = -(-((i168 ^ 109) | i170));
                        int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                        int i173 = i172 % 128;
                        f52599x0 = i173;
                        if (i172 % 2 == 0) {
                            int i174 = i159 + 94;
                            i159 = ((i174 ^ (-1)) + (i174 << 1)) - 41;
                        } else {
                            int i175 = ~i159;
                            int i176 = -(-(i159 << 1));
                            i159 = (i175 ^ i176) + ((i175 & i176) << 1);
                        }
                        i162 = ((i173 | 115) << 1) - (((~i173) & 115) | (i173 & (-116)));
                    }
                    if (bArr6[i159] == 46) {
                        int i177 = f52598w0;
                        int i178 = i177 & 89;
                        int i179 = -(-((i177 ^ 89) | i178));
                        int i180 = (i178 ^ i179) + ((i179 & i178) << 1);
                        f52599x0 = i180 % 128;
                        int i181 = i180 % 2;
                        bArr3 = new byte[(i159 ^ 1) + ((i159 & 1) << 1)];
                        System.arraycopy(bArr6, 0, bArr3, 0, i159);
                        bArr3[i159] = 90;
                        int i182 = f52598w0;
                        int i183 = (((i182 | 22) << 1) - (i182 ^ 22)) - 1;
                        f52599x0 = i183 % 128;
                        if (i183 % 2 == 0) {
                            obj = bArr3;
                            int i184 = 42 / 0;
                            obj = bArr3;
                        }
                    } else {
                        bArr2 = new byte[(-2) - ((((i159 | 3) << 1) - (i159 ^ 3)) ^ (-1))];
                        int i185 = i159 | 2;
                        System.arraycopy(bArr6, 0, bArr2, 0, ((i159 & 2) + i185) - 1);
                        bArr2[((i185 << 1) - (i159 ^ 2)) - 1] = 90;
                        int i186 = f52598w0;
                        int i187 = (i186 ^ 93) + ((i186 & 93) << 1);
                        f52599x0 = i187 % 128;
                        if (i187 % 2 == 0) {
                            obj = bArr2;
                            throw null;
                        }
                    }
                }
            } else if (i14 == 3) {
                afoVar = (afo) objArr[0];
                int i188 = f52598w0;
                int i189 = ((i188 & 7) - (~(i188 | 7))) - 1;
                f52599x0 = i189 % 128;
                if (i189 % 2 == 0) {
                    obj = afoVar;
                    throw null;
                }
            } else {
                if (i14 == 4) {
                    afo afoVar4 = (afo) objArr[0];
                    boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                    int i190 = f52598w0;
                    int i191 = ((i190 ^ 30) + ((i190 & 30) << 1)) - 1;
                    f52599x0 = i191 % 128;
                    if (i191 % 2 == 0) {
                        int length7 = ((byte[]) setCompoundDrawableTintBlendMode(new Object[]{afoVar4}, -469476099, 469476101, System.identityHashCode(afoVar4))).length;
                        ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length7)}, 1150803379, -1150803367, length7)).intValue();
                        throw null;
                    }
                    int length8 = ((byte[]) setCompoundDrawableTintBlendMode(new Object[]{afoVar4}, -469476099, 469476101, System.identityHashCode(afoVar4))).length;
                    int iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length8)}, 1150803379, -1150803367, length8)).intValue();
                    int i192 = f52599x0 + 23;
                    f52598w0 = i192 % 128;
                    int i193 = i192 % 2;
                    return Integer.valueOf(iIntValue);
                }
                afoVar2 = (afo) objArr[0];
                int i194 = f52599x0;
                int i195 = ((i194 ^ 113) | (i194 & 113)) << 1;
                int i196 = -(((~i194) & 113) | (i194 & (-114)));
                int i197 = (i195 & i196) + (i196 | i195);
                int i198 = i197 % 128;
                f52598w0 = i198;
                int i199 = i197 % 2;
                int i200 = i198 & 119;
                int i201 = (((i198 ^ 119) | i200) << 1) - ((i198 | 119) & (~i200));
                f52599x0 = i201 % 128;
                if (i201 % 2 == 0) {
                    obj = afoVar2;
                    throw null;
                }
            }
            obj = bArr2;
            obj = bArr3;
            obj = bArr4;
            obj = afoVar;
            obj = afoVar2;
            return obj;
        }
        bArr = null;
        afo afoVar5 = (afo) objArr[0];
        aeb aebVar = (aeb) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i202 = f52599x0;
        int i203 = (i202 & (-114)) | ((~i202) & 113);
        int i204 = (113 & i202) << 1;
        int i205 = ((i203 | i204) << 1) - (i204 ^ i203);
        f52598w0 = i205 % 128;
        Object[] objArr2 = new Object[1];
        if (i205 % 2 != 0) {
            objArr2[0] = afoVar5;
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 77, (byte[]) setCompoundDrawableTintBlendMode(objArr2, -469476099, 469476101, System.identityHashCode(afoVar5))}, 478760665, -478760661, 77);
        } else {
            objArr2[0] = afoVar5;
            aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue2), 24, (byte[]) setCompoundDrawableTintBlendMode(objArr2, -469476099, 469476101, System.identityHashCode(afoVar5))}, 478760665, -478760661, 24);
        }
        int i206 = f52599x0;
        int i207 = i206 & 37;
        int i208 = (((i206 ^ 37) | i207) << 1) - ((i206 | 37) & (~i207));
        f52598w0 = i208 % 128;
        int i209 = i208 % 2;
        return bArr;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 404313434, -404313431, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adm, com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this, Boolean.valueOf(z10)}, 1945408219, -1945408215, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.adm, com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setCompoundDrawableTintBlendMode(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -1828616083, 1828616084, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.adm, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 850203862, -850203862, System.identityHashCode(this));
    }
}
