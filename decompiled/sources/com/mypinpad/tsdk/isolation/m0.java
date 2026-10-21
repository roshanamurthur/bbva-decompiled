package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 extends InputStream {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f57024u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final aej f57025p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f57026q0 = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f57027r0 = 0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public adc f57028s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public InputStream f57029t0;

    public m0(aej aejVar) {
        this.f57025p0 = aejVar;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x006e  */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:18:0x0080  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:24:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:74:0x03c5 A[EDGE_INSN: B:74:0x03c5->B:61:0x0353 BREAK  A[LOOP:1: B:70:0x03b1->B:78:0x0418]] */
    /* JADX WARN: Code duplicated, block: B:75:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:78:0x0418 A[LOOP:1: B:70:0x03b1->B:78:0x0418, LOOP_END] */
    public static /* synthetic */ Object a(Object[] objArr, int i10, int i11, int i12) throws IOException {
        adc adcVar;
        int i13;
        int i14;
        adc adcVar2;
        int i15;
        int i16;
        adc adcVar3;
        int i17;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = (((~(i10 | i11)) | (~(i12 | i18))) * 49) + (((~((~i10) | i19)) | i18 | (~(i10 | i12))) * (-49)) + (((~(i18 | i19)) | (~(i18 | i10))) * 98) + (i11 * (-97)) + (i10 * 50);
        int i21 = 1;
        if (i20 == 1) {
            m0 m0Var = (m0) objArr[0];
            int i22 = v0;
            int i23 = i22 & 27;
            int i24 = (i22 | 27) & (~i23);
            int i25 = -(-(i23 << 1));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            f57024u0 = i26 % 128;
            if (i26 % 2 != 0) {
                aej aejVar = m0Var.f57025p0;
                throw null;
            }
            aej aejVar2 = m0Var.f57025p0;
            add addVar = (add) aej.setCompoundDrawableTintBlendMode(new Object[]{aejVar2}, -2132690708, 2132690715, System.identityHashCode(aejVar2));
            if (addVar == null) {
                int i27 = v0;
                int i28 = (i27 & 97) + (i27 | 97);
                f57024u0 = i28 % 128;
                if (i28 % 2 != 0) {
                    int i29 = 33 / 0;
                }
                adcVar = null;
            } else {
                if (!(addVar instanceof adc)) {
                    StringBuilder sb2 = new StringBuilder("unknown object encountered: ");
                    sb2.append(addVar.getClass());
                    throw new IOException(sb2.toString());
                }
                int i30 = f57024u0;
                int i31 = i30 & 41;
                int i32 = i31 + ((i30 ^ 41) | i31);
                v0 = i32 % 128;
                int i33 = i32 % 2;
                if (m0Var.f57027r0 != 0) {
                    throw new IOException("only the last nested bitstring can have padding");
                }
                adc adcVar4 = (adc) addVar;
                int i34 = i30 & 31;
                int i35 = -(-((i30 ^ 31) | i34));
                int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
                v0 = i36 % 128;
                if (i36 % 2 == 0) {
                    throw null;
                }
                adcVar = adcVar4;
            }
            return adcVar;
        }
        if (i20 == 2) {
            m0 m0Var2 = (m0) objArr[0];
            int iIdentityHashCode = System.identityHashCode(m0Var2);
            int i37 = ~iIdentityHashCode;
            int i38 = 394056721 ^ i37;
            int i39 = 394056721 & i37;
            int i40 = ~((i39 & i38) | (i38 ^ i39));
            int i41 = (-1277462565) - (~(((i40 & 756375313) | (756375313 ^ i40)) * (-865)));
            int i42 = (-394056722) & iIdentityHashCode;
            int i43 = (~i42) & ((-394056722) | iIdentityHashCode);
            int i44 = (i42 & i43) | (i43 ^ i42);
            int i45 = ~i44;
            int i46 = ((i44 | i45) & i45) * 865;
            int i47 = i41 & i46;
            int i48 = (((i41 ^ i46) | i47) << 1) - ((i41 | i46) & (~i47));
            int i49 = (iIdentityHashCode | i37) & i37;
            int i50 = ((~i49) & 756375313) | ((-756375314) & i49);
            int i51 = i49 & 756375313;
            int i52 = ~((i51 & i50) | (i50 ^ i51));
            int i53 = i37 & (-394056722);
            int i54 = (i37 | (-394056722)) & (~i53);
            int i55 = ~((i54 & i53) | (i54 ^ i53));
            int i56 = -(~(-(-(((i52 & i55) | (i52 ^ i55)) * 865))));
            int i57 = ((i48 ^ i56) + ((i56 & i48) << 1)) - 1;
            int iIdentityHashCode2 = System.identityHashCode(m0Var2);
            int i58 = (-1019053124) ^ iIdentityHashCode2;
            int i59 = iIdentityHashCode2 & (-1019053124);
            int i60 = ~(i58 | i59);
            int i61 = (-1056952188) & i60;
            int i62 = (i60 | (-1056952188)) & (~i61);
            int i63 = ((i62 & i61) | (i62 ^ i61)) * (-196);
            int i64 = (1688893949 ^ i63) + ((i63 & 1688893949) << 1);
            int i65 = i64 & 1984813928;
            int i66 = (1984813928 | i64) & (~i65);
            int i67 = i65 << 1;
            int i68 = (i66 & i67) + (i66 | i67);
            int i69 = (i59 & i58) | (i58 ^ i59);
            int i70 = ~i69;
            int i71 = (i69 | i70) & i70;
            int i72 = -(-(((i71 & 37899064) | (37899064 ^ i71)) * 196));
            int i73 = i68 & i72;
            int i74 = (i72 | i68) & (~i73);
            int i75 = -(-(i73 << 1));
            int i76 = ((i74 | i75) << 1) - (i74 ^ i75);
            int i77 = m0Var2.f57027r0;
            if (i57 > i76) {
                int i78 = 85 / 0;
            }
            return Integer.valueOf(i77);
        }
        if (i20 == 3) {
            m0 m0Var3 = (m0) objArr[0];
            int i79 = v0;
            int i80 = (((i79 & (-122)) | ((~i79) & 121)) - (~(-(-((i79 & 121) << 1))))) - 1;
            int i81 = i80 % 128;
            f57024u0 = i81;
            int i82 = i80 % 2;
            if (m0Var3.f57029t0 == null) {
                int i83 = (((i81 & (-106)) | ((~i81) & 105)) - (~((i81 & 105) << 1))) - 1;
                int i84 = i83 % 128;
                v0 = i84;
                if (i83 % 2 == 0) {
                    throw null;
                }
                if (!m0Var3.f57026q0) {
                    int i85 = ((i84 | 22) << 1) - (i84 ^ 22);
                    i13 = -1;
                    int i86 = (-2) - (i85 ^ (-1));
                    f57024u0 = i86 % 128;
                    if (i86 % 2 != 0) {
                        throw null;
                    }
                } else {
                    adc adcVar5 = (adc) a(new Object[]{m0Var3}, -240320499, 240320500, System.identityHashCode(m0Var3));
                    m0Var3.f57028s0 = adcVar5;
                    if (adcVar5 == null) {
                        int i87 = v0;
                        int i88 = ((i87 ^ 64) + ((i87 & 64) << 1)) - 1;
                        f57024u0 = i88 % 128;
                        int i89 = i88 % 2;
                        int i90 = i87 & 71;
                        int i91 = (i90 - (~((i87 ^ 71) | i90))) - 1;
                        f57024u0 = i91 % 128;
                        int i92 = i91 % 2;
                        return -1;
                    }
                    m0Var3.f57026q0 = false;
                    m0Var3.f57029t0 = adcVar5.setX();
                    int i93 = v0 + 23;
                    f57024u0 = i93 % 128;
                    int i94 = i93 % 2;
                    while (true) {
                        i13 = m0Var3.f57029t0.read();
                        if (i13 >= 0) {
                            i14 = f57024u0 + 27;
                            v0 = i14 % 128;
                            if (i14 % 2 == 0) {
                                break;
                            }
                            int i95 = 4 / 0;
                            break;
                        }
                        m0Var3.f57027r0 = m0Var3.f57028s0.setOnDragListener();
                        adcVar2 = (adc) a(new Object[]{m0Var3}, -240320499, 240320500, System.identityHashCode(m0Var3));
                        m0Var3.f57028s0 = adcVar2;
                        if (adcVar2 == null) {
                            int i96 = v0;
                            int i97 = i96 ^ 105;
                            int i98 = (((i96 & 105) | i97) << 1) - i97;
                            int i99 = i98 % 128;
                            f57024u0 = i99;
                            int i100 = i98 % 2;
                            m0Var3.f57029t0 = null;
                            int i101 = i99 & 51;
                            int i102 = (i99 ^ 51) | i101;
                            int i103 = ((i101 | i102) << 1) - (i101 ^ i102);
                            v0 = i103 % 128;
                            int i104 = i103 % 2;
                            return -1;
                        }
                        m0Var3.f57029t0 = adcVar2.setX();
                        System.identityHashCode(m0Var3);
                        System.identityHashCode(m0Var3);
                    }
                }
            } else {
                while (true) {
                    i13 = m0Var3.f57029t0.read();
                    if (i13 >= 0) {
                        i14 = f57024u0 + 27;
                        v0 = i14 % 128;
                        if (i14 % 2 == 0) {
                            break;
                        }
                        int i910 = 4 / 0;
                        break;
                    }
                    m0Var3.f57027r0 = m0Var3.f57028s0.setOnDragListener();
                    adcVar2 = (adc) a(new Object[]{m0Var3}, -240320499, 240320500, System.identityHashCode(m0Var3));
                    m0Var3.f57028s0 = adcVar2;
                    if (adcVar2 == null) {
                        int i911 = v0;
                        int i912 = i911 ^ 105;
                        int i913 = (((i911 & 105) | i912) << 1) - i912;
                        int i914 = i913 % 128;
                        f57024u0 = i914;
                        int i105 = i913 % 2;
                        m0Var3.f57029t0 = null;
                        int i106 = i914 & 51;
                        int i107 = (i914 ^ 51) | i106;
                        int i108 = ((i106 | i107) << 1) - (i106 ^ i107);
                        v0 = i108 % 128;
                        int i109 = i108 % 2;
                        return -1;
                    }
                    m0Var3.f57029t0 = adcVar2.setX();
                    System.identityHashCode(m0Var3);
                    System.identityHashCode(m0Var3);
                }
            }
            return Integer.valueOf(i13);
        }
        m0 m0Var4 = (m0) objArr[0];
        byte[] bArr = (byte[]) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        int i110 = f57024u0;
        int i111 = (i110 ^ 115) + ((i110 & 115) << 1);
        v0 = i111 % 128;
        if (i111 % 2 == 0) {
            int i112 = 1 / 0;
            if (m0Var4.f57029t0 == null) {
                i15 = (((i110 | 112) << 1) - (i110 ^ 112)) - 1;
                i16 = i15 % 128;
                v0 = i16;
                if (i15 % 2 != 0) {
                    boolean z10 = m0Var4.f57026q0;
                    throw null;
                }
                if (!m0Var4.f57026q0) {
                    int i113 = i16 ^ 11;
                    int i114 = -(-((i16 & 11) << 1));
                    int i115 = (i113 ^ i114) + ((i113 & i114) << 1);
                    f57024u0 = i115 % 128;
                    int i116 = i115 % 2;
                } else {
                    adcVar3 = (adc) a(new Object[]{m0Var4}, -240320499, 240320500, System.identityHashCode(m0Var4));
                    m0Var4.f57028s0 = adcVar3;
                    if (adcVar3 == null) {
                        int i117 = v0;
                        int i118 = (((i117 & (-28)) | ((~i117) & 27)) - (~((i117 & 27) << 1))) - 1;
                        int i119 = i118 % 128;
                        f57024u0 = i119;
                        int i120 = i118 % 2;
                        int i121 = ((i119 ^ 87) | (i119 & 87)) << 1;
                        int i122 = -(((~i119) & 87) | (i119 & (-88)));
                        int i123 = (i121 & i122) + (i122 | i121);
                        v0 = i123 % 128;
                        int i124 = i123 % 2;
                    } else {
                        m0Var4.f57026q0 = false;
                        m0Var4.f57029t0 = adcVar3.setX();
                    }
                }
                return -1;
            }
        } else if (m0Var4.f57029t0 == null) {
            i15 = (((i110 | 112) << 1) - (i110 ^ 112)) - 1;
            i16 = i15 % 128;
            v0 = i16;
            if (i15 % 2 != 0) {
                boolean z11 = m0Var4.f57026q0;
                throw null;
            }
            if (!m0Var4.f57026q0) {
                int i1110 = i16 ^ 11;
                int i1111 = -(-((i16 & 11) << 1));
                int i1112 = (i1110 ^ i1111) + ((i1110 & i1111) << 1);
                f57024u0 = i1112 % 128;
                int i1113 = i1112 % 2;
            } else {
                adcVar3 = (adc) a(new Object[]{m0Var4}, -240320499, 240320500, System.identityHashCode(m0Var4));
                m0Var4.f57028s0 = adcVar3;
                if (adcVar3 == null) {
                    int i1114 = v0;
                    int i1115 = (((i1114 & (-28)) | ((~i1114) & 27)) - (~((i1114 & 27) << 1))) - 1;
                    int i1116 = i1115 % 128;
                    f57024u0 = i1116;
                    int i125 = i1115 % 2;
                    int i126 = ((i1116 ^ 87) | (i1116 & 87)) << 1;
                    int i127 = -(((~i1116) & 87) | (i1116 & (-88)));
                    int i128 = (i126 & i127) + (i127 | i126);
                    v0 = i128 % 128;
                    int i129 = i128 % 2;
                } else {
                    m0Var4.f57026q0 = false;
                    m0Var4.f57029t0 = adcVar3.setX();
                }
            }
            return -1;
        }
        int i130 = v0;
        int i131 = ((i130 & 28) + (i130 | 28)) - 1;
        f57024u0 = i131 % 128;
        int i132 = i131 % 2;
        int i133 = 0;
        while (true) {
            InputStream inputStream = m0Var4.f57029t0;
            int i134 = i133 * (-949);
            int i135 = iIntValue * (-949);
            int i136 = ((i134 ^ i135) | (i134 & i135)) << 1;
            int i137 = -(((~i135) & i134) | ((~i134) & i135));
            int i138 = (i136 & i137) + (i136 | i137);
            int i139 = ~iIntValue;
            int i140 = i139 & i139;
            int i141 = (~i140) & (i139 | i139);
            int i142 = ~((i141 ^ i140) | (i141 & i140));
            int i143 = ~i133;
            int i144 = (i143 & i139) | ((~i143) & iIntValue);
            int i145 = i143 & iIntValue;
            int i146 = ~((i144 ^ i145) | (i144 & i145));
            int i147 = i142 ^ i146;
            int i148 = i142 & i146;
            int i149 = -(-(((i147 & i148) | (i147 ^ i148)) * ReturnCode.ERR_REPOSITORY));
            int i150 = i138 & i149;
            int i151 = (i149 ^ i138) | i150;
            int i152 = (i150 ^ i151) + ((i151 & i150) << i21);
            int i153 = ~((i139 ^ i133) | (i139 & i133));
            int i154 = iIntValue & iIntValue;
            int i155 = (~i154) & (iIntValue | iIntValue);
            int i156 = ~((i155 ^ i154) | (i154 & i155));
            int i157 = i153 ^ i156;
            int i158 = i153 & i156;
            int i159 = -(-(((i158 & i157) | (i157 ^ i158)) * (-950)));
            int i160 = (i152 & i159) + (i159 | i152);
            int i161 = (i139 | iIntValue) & i139;
            int i162 = (i161 ^ iIntValue) | (i161 & iIntValue);
            int i163 = ~i162;
            int i164 = (i162 | i163) & i163;
            int i165 = i133 & iIntValue;
            int i166 = (~i165) & (i133 | iIntValue);
            int i167 = ~((i166 ^ i165) | (i166 & i165));
            int i168 = ((~i164) & i167) | ((~i167) & i164);
            int i169 = i167 & i164;
            int i170 = ((i168 & i169) | (i168 ^ i169)) * 950;
            int i171 = (((i160 ^ i170) | (i160 & i170)) << i21) - ((i170 & (~i160)) | ((~i170) & i160));
            int i172 = -i133;
            int i173 = i172 * 860;
            int i174 = -(-(iIntValue2 * (-858)));
            int i175 = ((~i173) & i174) | ((~i174) & i173);
            int i176 = -(-((i173 & i174) << i21));
            int i177 = ((i175 | i176) << i21) - (i175 ^ i176);
            int i178 = ((i172 ^ iIntValue) | (i172 & iIntValue)) * (-859);
            int i179 = (i177 ^ i178) + ((i178 & i177) << i21);
            int i180 = i161 & i172;
            int i181 = (~i180) & (i161 | i172);
            int i182 = ~i172;
            int i183 = (i181 ^ i180) | (i180 & i181);
            int i184 = ~i183;
            int i185 = (i183 | i184) & i184;
            int i186 = ~iIntValue2;
            int i187 = (i182 ^ i186) | (i182 & i186);
            int i188 = ((~i187) & iIntValue) | (i139 & i187);
            int i189 = i187 & iIntValue;
            int i190 = ~((i188 & i189) | (i188 ^ i189));
            int i191 = ((i190 & i185) | (i185 ^ i190)) * 859;
            int i192 = (i179 | i191) << 1;
            int i193 = -((i191 & (~i179)) | ((~i191) & i179));
            int i194 = ((i192 | i193) << 1) - (i193 ^ i192);
            int i195 = ((~i161) & i186) | ((~i186) & i161);
            int i196 = i186 & i161;
            int i197 = ~((i195 & i196) | (i195 ^ i196));
            int i198 = (i186 | iIntValue2) & i186;
            int i199 = i198 ^ i172;
            int i200 = i172 & i198;
            int i201 = (i200 & i199) | (i199 ^ i200);
            int i202 = ~i201;
            int i203 = (i201 | i202) & i202;
            int i204 = -(-(((i197 & i203) | (i197 ^ i203)) * 859));
            int i205 = i194 ^ i204;
            int i206 = -(-((i204 & i194) << 1));
            int i207 = inputStream.read(bArr, i171, (i205 & i206) + (i206 | i205));
            if (i207 >= 0) {
                int i208 = f57024u0;
                int i209 = (i208 & (-98)) | ((~i208) & 97);
                int i210 = (i208 & 97) << 1;
                int i211 = (i209 & i210) + (i209 | i210);
                v0 = i211 % 128;
                int i212 = i211 % 2;
                int i213 = -(-i207);
                i133 = (((i133 ^ i213) | (i133 & i213)) << 1) - ((i213 & i143) | ((~i213) & i133));
                if (i133 == iIntValue2) {
                    int i214 = i208 & 91;
                    int i215 = ((((i208 ^ 91) | i214) << 1) - (~(-((~i214) & (i208 | 91))))) - 1;
                    v0 = i215 % 128;
                    if (i215 % 2 != 0) {
                        break;
                    }
                    throw null;
                }
                i17 = 2;
                int i216 = v0 + 27;
                f57024u0 = i216 % 128;
                int i217 = i216 % i17;
                i21 = 1;
            } else {
                m0Var4.f57027r0 = m0Var4.f57028s0.setOnDragListener();
                adc adcVar6 = (adc) a(new Object[]{m0Var4}, -240320499, 240320500, System.identityHashCode(m0Var4));
                m0Var4.f57028s0 = adcVar6;
                if (adcVar6 == null) {
                    int i218 = v0;
                    int i219 = (i218 & 99) + (i218 | 99);
                    int i220 = i219 % 128;
                    f57024u0 = i220;
                    if (i219 % 2 != 0) {
                        m0Var4.f57029t0 = null;
                        throw null;
                    }
                    m0Var4.f57029t0 = null;
                    if (i133 > 0) {
                        int i221 = ((i220 ^ 51) | (i220 & 51)) << 1;
                        int i222 = -((i220 & (-52)) | ((~i220) & 51));
                        int i223 = (i221 & i222) + (i221 | i222);
                        v0 = i223 % 128;
                        int i224 = i223 % 2;
                        break;
                    }
                    int i225 = ((((i218 ^ 25) | (i218 & 25)) << 1) - (~(-(((~i218) & 25) | (i218 & (-26)))))) - 1;
                    f57024u0 = i225 % 128;
                    if (i225 % 2 != 0) {
                        int i226 = 62 / 0;
                    }
                    return -1;
                }
                m0Var4.f57029t0 = adcVar6.setX();
                int i227 = f57024u0;
                int i228 = i227 & 115;
                int i229 = (((i227 ^ 115) | i228) << 1) - ((i227 | 115) & (~i228));
                v0 = i229 % 128;
                i17 = 2;
                int i230 = i229 % 2;
                int i2110 = v0 + 27;
                f57024u0 = i2110 % 128;
                int i2111 = i2110 % i17;
                i21 = 1;
            }
        }
        return Integer.valueOf(i133);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return ((Integer) a(new Object[]{this}, 209678992, -209678989, System.identityHashCode(this))).intValue();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        return ((Integer) a(new Object[]{this, bArr, Integer.valueOf(i10), Integer.valueOf(i11)}, -1535819164, 1535819164, i10)).intValue();
    }
}
