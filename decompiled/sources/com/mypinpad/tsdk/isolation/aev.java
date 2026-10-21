package com.mypinpad.tsdk.isolation;

import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class aev extends acz {
    public static int F0 = 0;
    public static int G0 = 1;
    public final acz[] E0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f52566y0;

    public aev(acz[] aczVarArr) {
        super((byte[]) setX(new Object[]{aczVarArr}, 573205290, -573205287, (int) System.currentTimeMillis()));
        this.E0 = aczVarArr;
        this.f52566y0 = 1000;
    }

    public static /* synthetic */ Integer h(Object[] objArr) throws IOException {
        int i10;
        int i11 = 0;
        aev aevVar = (aev) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i12 = F0;
        int i13 = i12 & 19;
        int i14 = (i12 ^ 19) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        G0 = i15 % 128;
        if (i15 % 2 == 0) {
            ((Boolean) setX(new Object[]{aevVar}, -758431779, 758431780, System.identityHashCode(aevVar))).booleanValue();
            throw null;
        }
        if (!((Boolean) setX(new Object[]{aevVar}, -758431779, 758431780, System.identityHashCode(aevVar))).booleanValue()) {
            int i16 = G0;
            int i17 = i16 | 71;
            int i18 = (i17 << 1) - ((~(i16 & 71)) & i17);
            F0 = i18 % 128;
            int i19 = i18 % 2;
            byte[] bArr = aevVar.f52440t0;
            if (i19 != 0) {
                int length = bArr.length;
                ((Integer) agd.setY(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length)}, 1254005658, -1254005655, length)).intValue();
                throw null;
            }
            int length2 = bArr.length;
            int iIntValue = ((Integer) agd.setY(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(length2)}, 1254005658, -1254005655, length2)).intValue();
            int i20 = F0;
            int i21 = i20 ^ 37;
            int i22 = (i20 & 37) << 1;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            G0 = i23 % 128;
            int i24 = i23 % 2;
            return Integer.valueOf(iIntValue);
        }
        if (!zBooleanValue) {
            int i25 = G0;
            int i26 = (i25 & 77) + (i25 | 77);
            F0 = i26 % 128;
            int i27 = i26 % 2;
            i10 = 3;
        } else {
            int i28 = F0;
            int i29 = (-2) - ((((i28 | 80) << 1) - (i28 ^ 80)) ^ (-1));
            G0 = i29 % 128;
            int i30 = i29 % 2;
            int i31 = i28 + 55;
            G0 = i31 % 128;
            int i32 = i31 % 2;
            i10 = 4;
        }
        if (aevVar.E0 != null) {
            int i33 = G0;
            int i34 = i33 & 5;
            int i35 = (i33 ^ 5) | i34;
            int i36 = (i34 ^ i35) + ((i34 & i35) << 1);
            F0 = i36 % 128;
            int i37 = i36 % 2;
            int i38 = ((i33 | 71) << 1) - (i33 ^ 71);
            F0 = i38 % 128;
            while (true) {
                int i39 = i38 % 2;
                acz[] aczVarArr = aevVar.E0;
                if (i11 >= aczVarArr.length) {
                    break;
                }
                int i40 = F0;
                int i41 = (((i40 & (-114)) | ((~i40) & 113)) - (~((i40 & 113) << 1))) - 1;
                G0 = i41 % 128;
                int i42 = i41 % 2;
                int iB = aczVarArr[i11].b(true);
                int iIdentityHashCode = System.identityHashCode(aevVar);
                int i43 = iB * (-380);
                int i44 = -(-(i10 * 382));
                int i45 = i43 & i44;
                int i46 = (i43 ^ i44) | i45;
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                int i48 = i10 & iIdentityHashCode;
                int i49 = (~i48) & (i10 | iIdentityHashCode);
                int i50 = ~iIdentityHashCode;
                int i51 = i48 | i49;
                int i52 = ~iB;
                int i53 = (i52 | iB) & i52;
                int i54 = i51 ^ i53;
                int i55 = i51 & i53;
                int i56 = -(-(((i55 & i54) | (i54 ^ i55)) * (-381)));
                int i57 = i47 & i56;
                int i58 = -(-((i56 ^ i47) | i57));
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                int i60 = ~i10;
                int i61 = i53 ^ i60;
                int i62 = i53 & i60;
                int i63 = (i62 & i61) | (i61 ^ i62);
                int i64 = ~i63;
                int i65 = (i63 | i64) & i64;
                int i66 = (iIdentityHashCode | i50) & i50;
                int i67 = i66 & i10;
                int i68 = ((i66 | i10) & (~i67)) | i67;
                int i69 = ~i68;
                int i70 = (i68 | i69) & i69;
                int i71 = (i70 & i65) | (i65 ^ i70);
                int i72 = i10 & i52;
                int i73 = (i60 & iB) | i72;
                int i74 = iB & i10;
                int i75 = ~((i74 & i73) | (i73 ^ i74));
                int i76 = (((i75 & i71) | (i71 ^ i75)) * 381) + i59;
                int i77 = i10 ^ i52;
                int i78 = -(~((~((i77 & i72) | (i77 ^ i72))) * 381));
                i10 = (-2) - (((i76 ^ i78) + ((i78 & i76) << 1)) ^ (-1));
                int i79 = i11 ^ (-59);
                int i80 = (((i11 & (-59)) | i79) << 1) - i79;
                i11 = ((i80 & 60) << 1) + ((i80 & (-61)) | ((~i80) & 60));
                int i81 = F0;
                i38 = ((i81 ^ 24) + ((i81 & 24) << 1)) - 1;
                G0 = i38 % 128;
            }
            int i82 = F0 + 77;
            G0 = i82 % 128;
            int i83 = i82 % 2;
        } else {
            byte[] bArr2 = aevVar.f52440t0;
            if (bArr2.length >= 2) {
                int i84 = G0;
                int i85 = i84 & 93;
                int i86 = i85 + ((i84 ^ 93) | i85);
                F0 = i86 % 128;
                int i87 = i86 % 2;
                int length3 = bArr2.length;
                int i88 = length3 & (-2);
                int i89 = i88 + ((length3 ^ (-2)) | i88);
                int iIdentityHashCode2 = System.identityHashCode(aevVar);
                int i90 = aevVar.f52566y0;
                int i91 = i90 * (-271);
                int i92 = ((-273) & i91) + (i91 | (-273));
                int i93 = ~i90;
                int i94 = ~iIdentityHashCode2;
                int i95 = (i94 | iIdentityHashCode2) & i94;
                int i96 = ~(((~i93) & i95) | ((~i95) & i93) | (i95 & i93));
                int i97 = (i93 ^ i90) | (i93 & i90);
                int i98 = i97 & iIdentityHashCode2;
                int i99 = (~i98) & (i97 | iIdentityHashCode2);
                int i100 = (i99 & i98) | (i99 ^ i98);
                int i101 = ~i100;
                int i102 = (i100 | i101) & i101;
                int i103 = i96 ^ i102;
                int i104 = i96 & i102;
                int i105 = -(-(((i104 & i103) | (i103 ^ i104)) * (-272)));
                int i106 = i92 & i105;
                int i107 = i106 + ((i105 ^ i92) | i106);
                int i108 = i93 & i94;
                int i109 = (i93 | i94) & (~i108);
                int i110 = ((i108 & i109) | (i109 ^ i108)) * (-272);
                int i111 = i107 & i110;
                int i112 = i111 + ((i110 ^ i107) | i111);
                int i113 = ~((iIdentityHashCode2 & i94) | (i94 ^ iIdentityHashCode2));
                int i114 = i90 ^ i113;
                int i115 = i113 & i90;
                int i116 = ((i115 & i114) | (i114 ^ i115)) * 272;
                int i117 = i112 & i116;
                int i118 = (i116 ^ i112) | i117;
                int i119 = i89 / ((i117 ^ i118) + ((i118 & i117) << 1));
                Boolean bool = Boolean.TRUE;
                int iIntValue2 = ((Integer) agd.setY(new Object[]{bool, Integer.valueOf(i90)}, 1254005658, -1254005655, i90)).intValue() * i119;
                int i120 = ((i10 | iIntValue2) << 1) - (i10 ^ iIntValue2);
                int length4 = bArr2.length;
                int i121 = -(((i90 ^ (-1)) + (i90 << 1)) * i119);
                int iIdentityHashCode3 = System.identityHashCode(aevVar);
                int i122 = i121 * (-947);
                int i123 = length4 * 949;
                int i124 = (i122 & i123) + (i122 | i123);
                int i125 = ~i121;
                int i126 = ~length4;
                int i127 = ~iIdentityHashCode3;
                int i128 = ~i126;
                int i129 = (i126 & i127) | (iIdentityHashCode3 & i128);
                int i130 = iIdentityHashCode3 & i126;
                int i131 = ~((i130 & i129) | (i129 ^ i130));
                int i132 = i125 & i131;
                int i133 = (i131 | i125) & (~i132);
                int i134 = -(-(((i133 & i132) | (i133 ^ i132)) * (-948)));
                int i135 = i124 & i134;
                int i136 = -(-((i134 ^ i124) | i135));
                int i137 = (i135 & i136) + (i136 | i135);
                int i138 = i125 & i126;
                int i139 = (i125 | i126) & (~i138);
                int i140 = (i139 & i138) | (i139 ^ i138);
                int i141 = -(~(-(-((~((i140 & i127) | (i140 ^ i127))) * (-948)))));
                int i142 = (((i137 | i141) << 1) - (i141 ^ i137)) - 1;
                int i143 = i138 | (i121 & i128);
                int i144 = i126 & i121;
                int i145 = ((i144 & i143) | (i143 ^ i144)) * 948;
                int i146 = ((i142 | i145) << 1) - (i145 ^ i142);
                int iIntValue3 = ((Integer) agd.setY(new Object[]{bool, Integer.valueOf(i146)}, 1254005658, -1254005655, i146)).intValue();
                int iIdentityHashCode4 = System.identityHashCode(aevVar);
                int i147 = iIntValue3 * (-112);
                int i148 = -(-(i120 * (-112)));
                int i149 = i147 & i148;
                int i150 = ((i147 ^ i148) | i149) << 1;
                int i151 = -((i147 | i148) & (~i149));
                int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
                int i153 = ~i120;
                int i154 = ~iIdentityHashCode4;
                int i155 = ~(((i154 | iIdentityHashCode4) & i154) | i153);
                int i156 = -(~(-(-(((i155 & iIntValue3) | (iIntValue3 ^ i155)) * 226))));
                int i157 = (-2) - ((((i152 | i156) << 1) - (i152 ^ i156)) ^ (-1));
                int i158 = ~iIntValue3;
                int i159 = ~((i158 & i153) | ((~i158) & i120) | (i158 & i120));
                int i160 = (i158 & iIdentityHashCode4) | (i158 ^ iIdentityHashCode4);
                int i161 = ~i160;
                int i162 = (i160 | i161) & i161;
                int i163 = ((~i162) & i159) | ((~i159) & i162);
                int i164 = i162 & i159;
                int i165 = (i164 & i163) | (i163 ^ i164);
                int i166 = (i120 | i153) & i153;
                int i167 = ~(iIntValue3 | (i154 & i166) | ((~i154) & i166) | ((~i166) & i154));
                int i168 = i165 ^ i167;
                int i169 = i167 & i165;
                int i170 = -(-(((i169 & i168) | (i168 ^ i169)) * (-113)));
                int i171 = ((i157 ^ i170) | (i157 & i170)) << 1;
                int i172 = -((i170 & (~i157)) | ((~i170) & i157));
                int i173 = (i171 ^ i172) + ((i172 & i171) << 1);
                int i174 = i153 & iIdentityHashCode4;
                int i175 = (~(i174 | ((iIdentityHashCode4 | i153) & (~i174)))) * 113;
                int i176 = i173 & i175;
                int i177 = (i175 ^ i173) | i176;
                i10 = ((i176 | i177) << 1) - (i177 ^ i176);
                int i178 = G0;
                int i179 = i178 & 71;
                int i180 = (i179 - (~(-(-((i178 ^ 71) | i179))))) - 1;
                F0 = i180 % 128;
                int i181 = i180 % 2;
            }
        }
        int i182 = G0;
        int i183 = i182 & 33;
        int i184 = (i183 - (~(-(-((i182 ^ 33) | i183))))) - 1;
        F0 = i184 % 128;
        int i185 = i184 % 2;
        return Integer.valueOf(i10);
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0665  */
    /* JADX WARN: Code duplicated, block: B:73:0x067c  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13;
        Object obj;
        byte[] bArr;
        int i14;
        byte[] bArr2;
        Integer num;
        int i15;
        int i16 = ~i10;
        int i17 = ~i11;
        int i18 = (~(i16 | i17)) | (~(i17 | i12));
        int i19 = ~i12;
        int i20 = i19 | i10;
        int i21 = ((~i20) * 886) + ((i10 | (~(i11 | i19))) * (-1772)) + ((i18 | (~(i20 | i11))) * 886) + (i11 * (-885)) + (i10 * 1773);
        char c10 = 1;
        if (i21 != 1) {
            if (i21 == 2) {
                return h(objArr);
            }
            if (i21 != 3) {
                Integer num2 = 0;
                aev aevVar = (aev) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i22 = G0;
                int i23 = ((i22 & (-22)) | ((~i22) & 21)) + ((21 & i22) << 1);
                F0 = i23 % 128;
                if (i23 % 2 != 0) {
                    ((Boolean) setX(new Object[]{aevVar}, -758431779, 758431780, System.identityHashCode(aevVar))).booleanValue();
                    throw null;
                }
                if (!(!((Boolean) setX(new Object[]{aevVar}, -758431779, 758431780, System.identityHashCode(aevVar))).booleanValue())) {
                    aeb.setX(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), 35}, 1303469841, -1303469839, 35);
                    aeb.setX(new Object[]{aebVar, 128}, -478708408, 478708419, 128);
                    acz[] aczVarArr = aevVar.E0;
                    if (aczVarArr != null) {
                        int i24 = G0;
                        int i25 = (i24 & 57) + (i24 | 57);
                        F0 = i25 % 128;
                        int i26 = i25 % 2;
                        aebVar.d(aczVarArr);
                        if (i26 != 0) {
                            int i27 = 87 / 0;
                        }
                        int i28 = G0;
                        int i29 = (((i28 | 58) << 1) - (i28 ^ 58)) - 1;
                        F0 = i29 % 128;
                        int i30 = i29 % 2;
                    } else {
                        byte[] bArr3 = aevVar.f52440t0;
                        if (bArr3.length >= 2) {
                            int i31 = F0;
                            int i32 = i31 & 115;
                            int i33 = -(-((i31 ^ 115) | i32));
                            int i34 = (i32 ^ i33) + ((i33 & i32) << 1);
                            G0 = i34 % 128;
                            int i35 = i34 % 2;
                            byte b10 = bArr3[0];
                            int length = bArr3.length;
                            int i36 = ~length;
                            int iIdentityHashCode = System.identityHashCode(aevVar);
                            int i37 = aevVar.f52566y0;
                            int i38 = -(-(i37 * (-301)));
                            int i39 = (-303) & i38;
                            int i40 = ((-303) ^ i38) | i39;
                            int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                            int i42 = ~iIdentityHashCode;
                            int i43 = i42 ^ i37;
                            int i44 = i42 & i37;
                            int i45 = i43 | i44;
                            int i46 = ~i45;
                            int i47 = i46 & (i45 | i46);
                            int i48 = ~i37;
                            int i49 = i48 | i37;
                            int i50 = ~((i49 ^ iIdentityHashCode) | (i49 & iIdentityHashCode));
                            int i51 = ((~i47) & i50) | ((~i50) & i47);
                            int i52 = i50 & i47;
                            int i53 = ((i52 & i51) | (i51 ^ i52)) * (-302);
                            int i54 = i41 ^ i53;
                            int i55 = -(-((i41 & i53) << 1));
                            int i56 = (i54 & i55) + (i55 | i54);
                            int i57 = ~((iIdentityHashCode & i48) | i44 | (i37 & iIdentityHashCode));
                            int i58 = -(-(i57 * (-604)));
                            int i59 = i56 & i58;
                            int i60 = ((i56 ^ i58) | i59) << 1;
                            int i61 = -((i58 | i56) & (~i59));
                            int i62 = (i60 & i61) + (i61 | i60);
                            int i63 = ~i48;
                            int i64 = ~((i63 & i48) | (i63 ^ i48));
                            int i65 = ((~i57) & i64) | ((~i64) & i57);
                            int i66 = i57 & i64;
                            int i67 = (((i66 & i65) | (i65 ^ i66)) * 302) + i62;
                            int i68 = G0 + 93;
                            F0 = i68 % 128;
                            int i69 = i68 % 2;
                            int i70 = i36 + (length << 1);
                            while (i70 > i67) {
                                int i71 = G0 + 77;
                                F0 = i71 % 128;
                                int i72 = i71 % 2;
                                int i73 = -i70;
                                int i74 = (length & i73) + (i73 | length);
                                Object[] objArr2 = new Object[5];
                                objArr2[0] = aebVar;
                                objArr2[c10] = (byte) 0;
                                objArr2[2] = bArr3;
                                objArr2[3] = Integer.valueOf(i74);
                                objArr2[4] = Integer.valueOf(i67);
                                agd.setY(objArr2, -985189263, 985189269, i74);
                                int i75 = -i67;
                                int iIdentityHashCode2 = System.identityHashCode(aevVar);
                                int i76 = ((i75 * (-721)) - (~(i70 * (-721)))) - 1;
                                int i77 = ~iIdentityHashCode2;
                                int i78 = i77 & (i77 | iIdentityHashCode2);
                                int i79 = ~i75;
                                int i80 = ~i70;
                                int i81 = i67;
                                int i82 = ((~i80) & i79) | ((~i79) & i80) | (i79 & i80);
                                int i83 = ~i82;
                                int i84 = (i82 | i83) & i83;
                                int i85 = i78 ^ i84;
                                int i86 = i84 & i78;
                                int i87 = (i86 & i85) | (i85 ^ i86);
                                int i88 = (i75 & i80) | (i70 & i79);
                                int i89 = i75 & i70;
                                int i90 = ~((i88 ^ i89) | (i88 & i89));
                                int i91 = ((i87 & i90) | (i87 ^ i90)) * 1444;
                                Integer num3 = num2;
                                int i92 = (((~i76) & i91) | ((~i91) & i76)) + ((i91 & i76) << 1);
                                int i93 = i75 & iIdentityHashCode2;
                                int i94 = ~(i93 | ((~i93) & (i75 | iIdentityHashCode2)));
                                int i95 = (i94 & i90) | (i90 ^ i94);
                                int i96 = i70 & iIdentityHashCode2;
                                int i97 = (iIdentityHashCode2 | i70) & (~i96);
                                int i98 = ~((i96 & i97) | (i97 ^ i96));
                                int i99 = -(~(((i95 & i98) | ((~i98) & i95) | ((~i95) & i98)) * (-1444)));
                                int i100 = ((i92 & i99) + (i99 | i92)) - 1;
                                int i101 = ((i79 | i75) & i79) | i70;
                                int i102 = ~i101;
                                int i103 = (i101 | i102) & i102;
                                int i104 = (i80 | i70) & i80;
                                int i105 = (i104 & i79) | ((~i104) & i75);
                                int i106 = i104 & i75;
                                int i107 = ~((i106 & i105) | (i105 ^ i106));
                                int i108 = ((i103 & i107) | ((~i107) & i103) | ((~i103) & i107)) * ErrorCodes.STORAGE_PERMISSION;
                                i70 = ((i100 & i108) - (~(-(-(i108 | i100))))) - 1;
                                int i109 = G0;
                                int i110 = (i109 & (-46)) | ((~i109) & 45);
                                int i111 = (i109 & 45) << 1;
                                int i112 = ((i110 | i111) << 1) - (i110 ^ i111);
                                F0 = i112 % 128;
                                int i113 = i112 % 2;
                                i67 = i81;
                                num2 = num3;
                                c10 = 1;
                            }
                            num = num2;
                            int i114 = -i70;
                            int iIdentityHashCode3 = System.identityHashCode(aevVar);
                            int i115 = i114 * 495;
                            int i116 = -(~(length * (-493)));
                            int i117 = ((i115 & i116) + (i115 | i116)) - 1;
                            int i118 = (~i36) & i114;
                            int i119 = ~i114;
                            int i120 = i36 & i119;
                            int i121 = i118 | i120;
                            int i122 = i114 & i36;
                            int i123 = (i117 - (~(-(~(-(-(((i121 & i122) | (i121 ^ i122)) * (-988)))))))) - 1;
                            int i124 = (i123 ^ (-1)) + (i123 << 1);
                            int i125 = (i119 | i114) & i119;
                            int i126 = length ^ i125;
                            int i127 = i125 & length;
                            int i128 = (i126 ^ i127) | (i127 & i126);
                            int i129 = ~iIdentityHashCode3;
                            int i130 = i128 ^ i129;
                            int i131 = i128 & i129;
                            int i132 = ((i130 ^ i131) | (i130 & i131)) * 494;
                            int i133 = ((i124 ^ i132) - (~((i132 & i124) << 1))) - 1;
                            int i134 = (i36 | i119) & (~i120);
                            int i135 = ~((i134 & i120) | (i134 ^ i120));
                            int i136 = ~(((iIdentityHashCode3 | i129) & i129) | length);
                            int i137 = i135 & i136;
                            int i138 = ((i136 | i135) & (~i137)) | i137;
                            int i139 = (length & i119) | i122;
                            int i140 = i114 & length;
                            int i141 = ~((i140 & i139) | (i139 ^ i140));
                            int i142 = i138 ^ i141;
                            int i143 = i141 & i138;
                            int i144 = ((i143 & i142) | (i142 ^ i143)) * 494;
                            int i145 = (i133 & i144) + (i133 | i144);
                            agd.setY(new Object[]{aebVar, Byte.valueOf(b10), bArr3, Integer.valueOf(i145), Integer.valueOf(i70)}, -985189263, 985189269, i145);
                            int i146 = G0;
                            int i147 = ((i146 ^ 45) | (i146 & 45)) << 1;
                            int i148 = -(((~i146) & 45) | (i146 & (-46)));
                            int i149 = (i147 & i148) + (i148 | i147);
                            F0 = i149 % 128;
                            i15 = 2;
                            int i150 = i149 % 2;
                        }
                        Object[] objArr3 = new Object[i15];
                        objArr3[0] = aebVar;
                        objArr3[1] = num;
                        aeb.setX(objArr3, -478708408, 478708419, 0);
                        Object[] objArr4 = new Object[i15];
                        objArr4[0] = aebVar;
                        objArr4[1] = num;
                        aeb.setX(objArr4, -478708408, 478708419, 0);
                        int i151 = F0;
                        int i152 = (((i151 | 14) << 1) - (i151 ^ 14)) - 1;
                        G0 = i152 % 128;
                        int i153 = i152 % 2;
                    }
                    num = num2;
                    i15 = 2;
                    Object[] objArr5 = new Object[i15];
                    objArr5[0] = aebVar;
                    objArr5[1] = num;
                    aeb.setX(objArr5, -478708408, 478708419, 0);
                    Object[] objArr6 = new Object[i15];
                    objArr6[0] = aebVar;
                    objArr6[1] = num;
                    aeb.setX(objArr6, -478708408, 478708419, 0);
                    int i154 = F0;
                    int i155 = (((i154 | 14) << 1) - (i154 ^ 14)) - 1;
                    G0 = i155 % 128;
                    int i156 = i155 % 2;
                } else {
                    byte[] bArr4 = aevVar.f52440t0;
                    int length2 = bArr4.length;
                    agd.setY(new Object[]{aebVar, Boolean.valueOf(zBooleanValue), bArr4, Integer.valueOf(length2)}, -282115254, 282115256, length2);
                    int i157 = G0;
                    int i158 = i157 & 19;
                    int i159 = ((i157 ^ 19) | i158) << 1;
                    int i160 = -((i157 | 19) & (~i158));
                    int i161 = ((i159 | i160) << 1) - (i160 ^ i159);
                    F0 = i161 % 128;
                    int i162 = i161 % 2;
                }
                return null;
            }
            acz[] aczVarArr2 = (acz[]) objArr[0];
            int i163 = F0;
            int i164 = i163 & 73;
            int i165 = ((((i163 ^ 73) | i164) << 1) - (~(-((~i164) & (i163 | 73))))) - 1;
            int i166 = i165 % 128;
            G0 = i166;
            int i167 = i165 % 2;
            int length3 = aczVarArr2.length;
            if (length3 == 0) {
                bArr = new byte[]{0};
                int i168 = i166 & 51;
                int i169 = ((i166 ^ 51) | i168) << 1;
                int i170 = -((i166 | 51) & (~i168));
                int i171 = (i169 ^ i170) + ((i169 & i170) << 1);
                F0 = i171 % 128;
                if (i171 % 2 != 0) {
                    i14 = 73;
                    int i172 = i14 / 0;
                }
            } else if (length3 != 1) {
                int i173 = ((~length3) - (~(-(-(length3 << 1))))) - 1;
                int i174 = ((i163 | 111) << 1) - (i163 ^ 111);
                G0 = i174 % 128;
                int i175 = i174 % 2;
                int i176 = 0;
                int i177 = 0;
                while (i176 < i173) {
                    int i178 = G0;
                    int i179 = (((i178 & (-48)) | ((~i178) & 47)) - (~((i178 & 47) << 1))) - 1;
                    F0 = i179 % 128;
                    if (i179 % 2 != 0) {
                        bArr2 = aczVarArr2[i176].f52440t0;
                        if (bArr2[0] != 0) {
                            throw new IllegalArgumentException("only the last nested bitstring can have padding");
                        }
                        int length4 = bArr2.length;
                        int iCurrentTimeMillis = (int) System.currentTimeMillis();
                        int i180 = -(-(length4 * (-159)));
                        int i181 = 159 & i180;
                        int i182 = (((i180 | 159) & (~i181)) - (~(i181 << 1))) - 1;
                        int i183 = -(-(length4 * 160));
                        int i184 = (i182 ^ i183) + ((i182 & i183) << 1);
                        int i185 = ~iCurrentTimeMillis;
                        int i186 = (~i185) | i185;
                        int i187 = ~i186;
                        int i188 = (i186 | i187) & i187;
                        int i189 = ~length4;
                        int i190 = (length4 & i189) | (i189 ^ length4);
                        int i191 = ~i190;
                        int i192 = (((i190 | i191) & i191) | i188) * (-160);
                        int i193 = i184 & i192;
                        int i194 = -(-((i192 ^ i184) | i193));
                        int i195 = ((i193 | i194) << 1) - (i194 ^ i193);
                        int i196 = (i185 | iCurrentTimeMillis) & i185;
                        int i197 = i189 & i196;
                        int i198 = ~(((i196 | i189) & (~i197)) | i197);
                        int i199 = (i198 | ((-1) ^ i198)) * 160;
                        int i200 = i195 & i199;
                        int i201 = -(-(i200 + ((i199 ^ i195) | i200)));
                        int i202 = i177 & i201;
                        int i203 = i177 | i201;
                        i177 = ((i202 | i203) << 1) - (i203 ^ i202);
                        int i204 = i176 & 1;
                        int i205 = (i176 | 1) & (~i204);
                        int i206 = -(-(i204 << 1));
                        i176 = (i205 | i206) + (i205 & i206);
                        int i207 = G0 + 85;
                        F0 = i207 % 128;
                        int i208 = i207 % 2;
                    } else {
                        bArr2 = aczVarArr2[i176].f52440t0;
                        if (bArr2[0] != 0) {
                            throw new IllegalArgumentException("only the last nested bitstring can have padding");
                        }
                        int length5 = bArr2.length;
                        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
                        int i1810 = -(-(length5 * (-159)));
                        int i1811 = 159 & i1810;
                        int i1812 = (((i1810 | 159) & (~i1811)) - (~(i1811 << 1))) - 1;
                        int i1813 = -(-(length5 * 160));
                        int i1814 = (i1812 ^ i1813) + ((i1812 & i1813) << 1);
                        int i1815 = ~iCurrentTimeMillis2;
                        int i1816 = (~i1815) | i1815;
                        int i1817 = ~i1816;
                        int i1818 = (i1816 | i1817) & i1817;
                        int i1819 = ~length5;
                        int i1910 = (length5 & i1819) | (i1819 ^ length5);
                        int i1911 = ~i1910;
                        int i1912 = (((i1910 | i1911) & i1911) | i1818) * (-160);
                        int i1913 = i1814 & i1912;
                        int i1914 = -(-((i1912 ^ i1814) | i1913));
                        int i1915 = ((i1913 | i1914) << 1) - (i1914 ^ i1913);
                        int i1916 = (i1815 | iCurrentTimeMillis2) & i1815;
                        int i1917 = i1819 & i1916;
                        int i1918 = ~(((i1916 | i1819) & (~i1917)) | i1917);
                        int i1919 = (i1918 | ((-1) ^ i1918)) * 160;
                        int i209 = i1915 & i1919;
                        int i2010 = -(-(i209 + ((i1919 ^ i1915) | i209)));
                        int i2011 = i177 & i2010;
                        int i2012 = i177 | i2010;
                        i177 = ((i2011 | i2012) << 1) - (i2012 ^ i2011);
                        int i2013 = i176 & 1;
                        int i2014 = (i176 | 1) & (~i2013);
                        int i2015 = -(-(i2013 << 1));
                        i176 = (i2014 | i2015) + (i2014 & i2015);
                        int i2016 = G0 + 85;
                        F0 = i2016 % 128;
                        int i2017 = i2016 % 2;
                    }
                }
                byte[] bArr5 = aczVarArr2[i173].f52440t0;
                byte b11 = bArr5[0];
                int length6 = bArr5.length;
                bArr = new byte[(i177 ^ length6) + ((length6 & i177) << 1)];
                bArr[0] = b11;
                int i210 = G0 + 21;
                F0 = i210 % 128;
                int i211 = i210 % 2;
                int i212 = 1;
                int i213 = 0;
                while (i213 < length3) {
                    int i214 = G0;
                    int i215 = ((i214 | 5) << 1) - (i214 ^ 5);
                    F0 = i215 % 128;
                    int i216 = i215 % 2;
                    byte[] bArr6 = aczVarArr2[i213].f52440t0;
                    int length7 = bArr6.length;
                    int iCurrentTimeMillis3 = (int) System.currentTimeMillis();
                    int i217 = -(-(length7 * (-68)));
                    int i218 = (-70) & i217;
                    int i219 = (i218 - (~(-(-((i217 ^ (-70)) | i218))))) - 1;
                    int i220 = ~length7;
                    int i221 = i220 & iCurrentTimeMillis3;
                    int i222 = ~(i221 | ((~i221) & (i220 | iCurrentTimeMillis3)));
                    int i223 = (-1) ^ length7;
                    int i224 = (i223 ^ length7) | (i223 & length7);
                    int i225 = i224 & iCurrentTimeMillis3;
                    int i226 = (i224 | iCurrentTimeMillis3) & (~i225);
                    int i227 = ~((i226 & i225) | (i226 ^ i225));
                    int i228 = (i219 - (~(-(~(((i222 & i227) | (i222 ^ i227)) * 69))))) - 2;
                    int i229 = (i220 | length7) & i220;
                    int i230 = ~iCurrentTimeMillis3;
                    int i231 = ((~i230) & i229) | ((~i229) & i230);
                    int i232 = i229 & i230;
                    int i233 = (i232 & i231) | (i231 ^ i232);
                    int i234 = length7 ^ iCurrentTimeMillis3;
                    int i235 = length7 & iCurrentTimeMillis3;
                    int i236 = ~((i235 & i234) | (i234 ^ i235));
                    int i237 = i233 & i236;
                    int i238 = (i236 | i233) & (~i237);
                    int i239 = ((i238 & i237) | (i238 ^ i237)) * (-69);
                    int i240 = i228 | i239;
                    int i241 = (i240 << 1) - ((~(i239 & i228)) & i240);
                    int i242 = -(-((~((i220 ^ (-1)) | i220)) * 69));
                    int i243 = i241 ^ i242;
                    int i244 = ((i242 & i241) | i243) << 1;
                    int i245 = -i243;
                    int i246 = (i244 ^ i245) + ((i244 & i245) << 1);
                    System.arraycopy(bArr6, 1, bArr, i212, i246);
                    int iCurrentTimeMillis4 = (int) System.currentTimeMillis();
                    int i247 = i246 * 624;
                    int i248 = -(-(i212 * (-622)));
                    int i249 = (i247 ^ i248) + ((i247 & i248) << 1);
                    int i250 = ~i212;
                    int i251 = ~i246;
                    int i252 = i250 & i251;
                    int i253 = i250 & i246;
                    int i254 = ((~i250) & i246) | i252 | i253;
                    int i255 = i254 & iCurrentTimeMillis4;
                    int i256 = (i254 | iCurrentTimeMillis4) & (~i255);
                    int i257 = (~((i256 & i255) | (i256 ^ i255))) * 623;
                    int i258 = ((((i249 ^ i257) | (i249 & i257)) << 1) - (~(-(((~i257) & i249) | ((~i249) & i257))))) - 1;
                    int i259 = ~iCurrentTimeMillis4;
                    int i260 = i252 | ((~i251) & i212);
                    int i261 = i212 & i251;
                    int i262 = ~((i261 & i260) | (i260 ^ i261));
                    int i263 = ((~i262) & i259) | ((~i259) & i262);
                    int i264 = i262 & i259;
                    int i265 = (((i264 & i263) | (i263 ^ i264)) * (-623)) + i258;
                    int i266 = (~i253) & (i250 | i246);
                    int i267 = (i266 & i253) | (i266 ^ i253);
                    int i268 = ~i267;
                    int i269 = (i267 | i268) & i268;
                    int i270 = i250 ^ iCurrentTimeMillis4;
                    int i271 = i250 & iCurrentTimeMillis4;
                    int i272 = ~((i271 & i270) | (i270 ^ i271));
                    int i273 = i269 ^ i272;
                    int i274 = i272 & i269;
                    int i275 = (i274 & i273) | (i273 ^ i274);
                    int i276 = i246 & iCurrentTimeMillis4;
                    int i277 = (iCurrentTimeMillis4 | i246) & (~i276);
                    int i278 = ~((i277 & i276) | (i277 ^ i276));
                    int i279 = ((~i278) & i275) | ((~i275) & i278);
                    int i280 = i278 & i275;
                    int i281 = -(~(-(-(((i280 & i279) | (i279 ^ i280)) * 623))));
                    int i282 = i213 ^ (-89);
                    int i283 = -(-((i213 & (-89)) << 1));
                    int i284 = ((i282 | i283) << 1) - (i283 ^ i282);
                    i213 = (((i284 | 91) << 1) - (i284 ^ 91)) - 1;
                    int i285 = G0;
                    int i286 = ((i285 ^ 69) | (i285 & 69)) << 1;
                    int i287 = -(((~i285) & 69) | (i285 & (-70)));
                    int i288 = (i286 ^ i287) + ((i287 & i286) << 1);
                    F0 = i288 % 128;
                    int i289 = i288 % 2;
                    i212 = (-2) - (((i265 & i281) + (i265 | i281)) ^ (-1));
                }
                int i290 = G0;
                int i291 = i290 ^ 75;
                int i292 = ((i290 & 75) | i291) << 1;
                int i293 = -i291;
                int i294 = (i292 ^ i293) + ((i292 & i293) << 1);
                F0 = i294 % 128;
                if (i294 % 2 != 0) {
                    i14 = 27;
                    int i1710 = i14 / 0;
                }
            } else {
                obj = aczVarArr2[0].f52440t0;
                int i295 = i166 + 119;
                F0 = i295 % 128;
                int i296 = i295 % 2;
            }
            return bArr;
        }
        aev aevVar2 = (aev) objArr[0];
        int i297 = G0;
        int i298 = (i297 & 17) + (i297 | 17);
        F0 = i298 % 128;
        if (i298 % 2 != 0) {
            acz[] aczVarArr3 = aevVar2.E0;
            throw null;
        }
        if (aevVar2.E0 == null) {
            int i299 = (i297 ^ 59) + ((i297 & 59) << 1);
            int i300 = i299 % 128;
            F0 = i300;
            if (i299 % 2 != 0) {
                int length8 = aevVar2.f52440t0.length;
                throw null;
            }
            if (aevVar2.f52440t0.length > aevVar2.f52566y0) {
                int i301 = (i297 & (-72)) | ((~i297) & 71);
                int i302 = (i297 & 71) << 1;
                i13 = (i301 ^ i302) + ((i301 & i302) << 1);
                F0 = i13 % 128;
                if (i13 % 2 != 0) {
                    int i303 = 24 / 0;
                }
                obj = Boolean.TRUE;
            } else {
                int i304 = (((i300 | 50) << 1) - (i300 ^ 50)) - 1;
                G0 = i304 % 128;
                int i305 = i304 % 2;
                obj = Boolean.FALSE;
            }
        } else {
            int i306 = (i297 & (-72)) | ((~i297) & 71);
            int i307 = (i297 & 71) << 1;
            i13 = (i306 ^ i307) + ((i306 & i307) << 1);
            F0 = i13 % 128;
            if (i13 % 2 != 0) {
                int i308 = 24 / 0;
            }
            obj = Boolean.TRUE;
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, 450635872, -450635870, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -992041649, 992041649, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -758431779, 758431780, System.identityHashCode(this))).booleanValue();
    }

    public aev(byte[] bArr, int i10) {
        super(bArr, i10);
        this.E0 = null;
        this.f52566y0 = 1000;
    }
}
