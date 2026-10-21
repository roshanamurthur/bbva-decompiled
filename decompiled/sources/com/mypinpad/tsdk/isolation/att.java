package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class att extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53850e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53851f = 1;
    protected long[] setLayoutAnimation;

    public att(long[] jArr) {
        this.setLayoutAnimation = jArr;
    }

    public static /* synthetic */ BigInteger a(Object[] objArr) {
        att attVar = (att) objArr[0];
        int i10 = f53850e;
        int i11 = i10 & 23;
        int i12 = -(-((i10 ^ 23) | i11));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        f53851f = i13 % 128;
        int i14 = i13 % 2;
        long[] jArr = attVar.setLayoutAnimation;
        if (i14 != 0) {
            return (BigInteger) avi.setDividerPadding(new Object[]{jArr}, -1802999956, 1802999959, (int) System.currentTimeMillis());
        }
        throw null;
    }

    public static /* synthetic */ att b(Object[] objArr) {
        att attVar = (att) objArr[0];
        apk apkVar = (apk) objArr[1];
        apk apkVar2 = (apk) objArr[2];
        long[] jArr = attVar.setLayoutAnimation;
        long[] jArr2 = ((att) apkVar).setLayoutAnimation;
        long[] jArr3 = ((att) apkVar2).setLayoutAnimation;
        long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
        atr.setOnFocusChangeListener(new Object[]{jArr, jArr4}, 1068960675, -1068960651, (int) System.currentTimeMillis());
        atr.setOnFocusChangeListener(new Object[]{jArr2, jArr3, jArr4}, 378521458, -378521452, (int) System.currentTimeMillis());
        long[] jArr5 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
        atr.setOnFocusChangeListener(new Object[]{jArr4, jArr5}, 1843581176, -1843581157, (int) System.currentTimeMillis());
        att attVar2 = new att(jArr5);
        int i10 = f53851f + 11;
        f53850e = i10 % 128;
        if (i10 % 2 == 0) {
            return attVar2;
        }
        throw null;
    }

    public static /* synthetic */ Boolean c(Object[] objArr) {
        att attVar = (att) objArr[0];
        int i10 = f53850e;
        int i11 = i10 + 41;
        int i12 = i11 % 128;
        f53851f = i12;
        int i13 = i11 % 2;
        if ((attVar.setLayoutAnimation[0] & 1) != 0) {
            int i14 = (i12 & (-48)) | ((~i12) & 47);
            int i15 = (i12 & 47) << 1;
            int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
            f53850e = i16 % 128;
            return Boolean.valueOf(i16 % 2 == 0);
        }
        int i17 = i10 + 51;
        f53851f = i17 % 128;
        if (i17 % 2 != 0) {
            return Boolean.FALSE;
        }
        throw null;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i12;
        int i14 = i13 | i10;
        int i15 = ((~(i14 | i11)) * 52) + (i11 * 53) + (i10 * (-51));
        int i16 = ~i11;
        int i17 = (((~(i16 | i10)) | (~(i16 | i13)) | (~i14)) * (-52)) + i15;
        int i18 = ~i10;
        switch ((((~(i18 | i11)) | (~(i13 | i18))) * 52) + i17) {
            case 1:
                att attVar = (att) objArr[0];
                apk apkVar = (apk) objArr[1];
                int i19 = f53850e;
                int i20 = (i19 & 47) + (i19 | 47);
                f53851f = i20 % 128;
                if (i20 % 2 != 0) {
                    return attVar.setOnFocusChangeListener(apkVar);
                }
                attVar.setOnFocusChangeListener(apkVar);
                throw null;
            case 2:
                return b(objArr);
            case 3:
                return a(objArr);
            case 4:
                att attVar2 = (att) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                long[] jArr = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar2.setLayoutAnimation, ((att) apkVar2).setLayoutAnimation, jArr}, 994738673, -994738669, (int) System.currentTimeMillis());
                att attVar3 = new att(jArr);
                int i21 = f53850e;
                int i22 = (i21 ^ 23) + ((i21 & 23) << 1);
                f53851f = i22 % 128;
                int i23 = i22 % 2;
                return attVar3;
            case 5:
                att attVar4 = (att) objArr[0];
                long[] jArr2 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar4.setLayoutAnimation, jArr2}, -310260428, 310260449, (int) System.currentTimeMillis());
                att attVar5 = new att(jArr2);
                int i24 = f53851f + 105;
                f53850e = i24 % 128;
                int i25 = i24 % 2;
                return attVar5;
            case 6:
                return c(objArr);
            case 7:
                att attVar6 = (att) objArr[0];
                long[] jArr3 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar6.setLayoutAnimation, jArr3}, -1657265198, 1657265213, (int) System.currentTimeMillis());
                att attVar7 = new att(jArr3);
                int i26 = f53850e;
                int i27 = (i26 & 9) + (9 | i26);
                f53851f = i27 % 128;
                int i28 = i27 % 2;
                return attVar7;
            case 8:
                att attVar8 = (att) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i29 = f53851f;
                int i30 = i29 & 95;
                int i31 = (~i30) & (i29 | 95);
                int i32 = -(-(i30 << 1));
                int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
                f53850e = i33 % 128;
                if (i33 % 2 != 0) {
                    throw null;
                }
                if (iIntValue <= 0) {
                    int i34 = (i29 ^ 93) + ((i29 & 93) << 1);
                    f53850e = i34 % 128;
                    if (i34 % 2 == 0) {
                        return attVar8;
                    }
                    throw null;
                }
                long[] jArr4 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar8.setLayoutAnimation, Integer.valueOf(iIntValue), jArr4}, 1331770537, -1331770517, iIntValue);
                att attVar9 = new att(jArr4);
                int i35 = f53851f;
                int i36 = (i35 | 99) << 1;
                int i37 = -(((~i35) & 99) | (i35 & (-100)));
                int i38 = (i36 ^ i37) + ((i37 & i36) << 1);
                f53850e = i38 % 128;
                int i39 = i38 % 2;
                return attVar9;
            case 9:
                att attVar10 = (att) objArr[0];
                apk apkVar3 = (apk) objArr[1];
                apk apkVar4 = (apk) objArr[2];
                apk apkVar5 = (apk) objArr[3];
                int i40 = f53851f;
                int i41 = (i40 & 111) + (i40 | 111);
                f53850e = i41 % 128;
                if (i41 % 2 != 0) {
                    attVar10.setCompoundDrawableTintBlendMode(apkVar3, apkVar4, apkVar5);
                    throw null;
                }
                apk compoundDrawableTintBlendMode = attVar10.setCompoundDrawableTintBlendMode(apkVar3, apkVar4, apkVar5);
                int i42 = f53851f;
                int i43 = (i42 & (-62)) | ((~i42) & 61);
                int i44 = (i42 & 61) << 1;
                int i45 = (i43 & i44) + (i44 | i43);
                f53850e = i45 % 128;
                if (i45 % 2 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                throw null;
            case 10:
                att attVar11 = (att) objArr[0];
                int i46 = f53851f;
                int i47 = (i46 & 23) + (i46 | 23);
                f53850e = i47 % 128;
                if (i47 % 2 != 0) {
                    throw null;
                }
                int i48 = i46 + 57;
                f53850e = i48 % 128;
                int i49 = i48 % 2;
                return attVar11;
            case 11:
                att attVar12 = (att) objArr[0];
                int i50 = f53850e;
                int i51 = (i50 & 67) + (i50 | 67);
                f53851f = i51 % 128;
                int i52 = i51 % 2;
                boolean zBooleanValue = ((Boolean) avi.setDividerPadding(new Object[]{attVar12.setLayoutAnimation}, -1614623958, 1614623958, (int) System.currentTimeMillis())).booleanValue();
                int i53 = f53850e;
                int i54 = i53 & 41;
                int i55 = ((i53 ^ 41) | i54) << 1;
                int i56 = -((i53 | 41) & (~i54));
                int i57 = (i55 ^ i56) + ((i56 & i55) << 1);
                f53851f = i57 % 128;
                if (i57 % 2 != 0) {
                    return Boolean.valueOf(zBooleanValue);
                }
                throw null;
            case 12:
                att attVar13 = (att) objArr[0];
                long[] jArr5 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar13.setLayoutAnimation, jArr5}, -386758368, 386758380, (int) System.currentTimeMillis());
                att attVar14 = new att(jArr5);
                int i58 = f53850e + 32;
                int i59 = (i58 ^ (-1)) + (i58 << 1);
                f53851f = i59 % 128;
                if (i59 % 2 != 0) {
                    return attVar14;
                }
                int i60 = 33 / 0;
                return attVar14;
            case 13:
                att attVar15 = (att) objArr[0];
                int i61 = f53851f;
                int i62 = (i61 ^ 72) + ((i61 & 72) << 1);
                int i63 = (i62 ^ (-1)) + (i62 << 1);
                f53850e = i63 % 128;
                int i64 = i63 % 2;
                boolean zBooleanValue2 = ((Boolean) avi.setDividerPadding(new Object[]{attVar15.setLayoutAnimation}, -1276336312, 1276336317, (int) System.currentTimeMillis())).booleanValue();
                int i65 = f53851f;
                int i66 = (i65 & 125) + (i65 | 125);
                f53850e = i66 % 128;
                if (i66 % 2 != 0) {
                    int i67 = 52 / 0;
                }
                return Boolean.valueOf(zBooleanValue2);
            case 14:
                att attVar16 = (att) objArr[0];
                apk apkVar6 = (apk) objArr[1];
                long[] jArr6 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar16.setLayoutAnimation, ((att) apkVar6).setLayoutAnimation, jArr6}, -253482889, 253482896, (int) System.currentTimeMillis());
                att attVar17 = new att(jArr6);
                int i68 = f53850e;
                int i69 = i68 & 51;
                int i70 = i68 | 51;
                int i71 = ((i69 | i70) << 1) - (i70 ^ i69);
                f53851f = i71 % 128;
                int i72 = i71 % 2;
                return attVar17;
            case 15:
                att attVar18 = (att) objArr[0];
                int i73 = f53851f;
                int i74 = (((i73 & (-10)) | ((~i73) & 9)) - (~((9 & i73) << 1))) - 1;
                f53850e = i74 % 128;
                int i75 = i74 % 2;
                long[] jArr7 = attVar18.setLayoutAnimation;
                if (i75 == 0) {
                    return Integer.valueOf(((Integer) atr.setOnFocusChangeListener(new Object[]{jArr7}, 544051941, -544051940, (int) System.currentTimeMillis())).intValue());
                }
                ((Integer) atr.setOnFocusChangeListener(new Object[]{jArr7}, 544051941, -544051940, (int) System.currentTimeMillis())).intValue();
                throw null;
            case 16:
                int i76 = f53851f;
                int i77 = (i76 ^ 115) + ((i76 & 115) << 1);
                f53850e = i77 % 128;
                return Integer.valueOf(i77 % 2 != 0 ? 10288 : 571);
            case 17:
                att attVar19 = (att) objArr[0];
                Object obj = objArr[1];
                int i78 = f53851f;
                int i79 = (i78 ^ 39) + ((i78 & 39) << 1);
                f53850e = i79 % 128;
                if (i79 % 2 != 0) {
                    throw null;
                }
                if (obj == attVar19) {
                    int i80 = ((i78 | 45) << 1) - (i78 ^ 45);
                    f53850e = i80 % 128;
                    if (i80 % 2 == 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
                if (!(!(obj instanceof att))) {
                    boolean zBooleanValue3 = ((Boolean) avi.setDividerPadding(new Object[]{attVar19.setLayoutAnimation, ((att) obj).setLayoutAnimation}, -1456486518, 1456486522, (int) System.currentTimeMillis())).booleanValue();
                    int i81 = f53850e + 35;
                    f53851f = i81 % 128;
                    if (i81 % 2 != 0) {
                        return Boolean.valueOf(zBooleanValue3);
                    }
                    throw null;
                }
                int i82 = i78 & 111;
                int i83 = (((i78 ^ 111) | i82) << 1) - ((i78 | 111) & (~i82));
                f53850e = i83 % 128;
                int i84 = i83 % 2;
                int iIdentityHashCode = System.identityHashCode(attVar19);
                int i85 = ~iIdentityHashCode;
                int i86 = (-403177541) & i85;
                int i87 = (i85 | (-403177541)) & (~i86);
                int i88 = ((i87 & i86) | (i87 ^ i86)) * (-490);
                int i89 = 1383024488 & i88;
                int i90 = ((1383024488 ^ i88) | i89) << 1;
                int i91 = -((i88 | 1383024488) & (~i89));
                int i92 = ((i90 | i91) << 1) - (i91 ^ i90);
                int i93 = (-1519100101) & iIdentityHashCode;
                int i94 = (iIdentityHashCode | (-1519100101)) & (~i93);
                int i95 = (i94 & i93) | (i94 ^ i93);
                int i96 = ~i95;
                int i97 = -(~(-(-((((i95 | i96) & i96) | 1115922560) * 490))));
                int i98 = ((i92 & i97) + (i97 | i92)) - 1;
                int i99 = i98 & 1984101038;
                int i100 = i99 + ((1984101038 ^ i98) | i99);
                int iIdentityHashCode2 = System.identityHashCode(attVar19);
                int i101 = (-1930052) & iIdentityHashCode2;
                int i102 = i101 | ((~i101) & ((-1930052) | iIdentityHashCode2));
                int i103 = ~i102;
                int i104 = (i102 | i103) & i103;
                int i105 = ~iIdentityHashCode2;
                int i106 = ((i105 | iIdentityHashCode2) & i105) | (-819819364);
                int i107 = (i106 & 2061536424) | ((~i106) & (-2061536425));
                int i108 = i106 & (-2061536425);
                int i109 = ~((i108 & i107) | (i107 ^ i108));
                int i110 = ((~i109) & i104) | ((~i104) & i109);
                int i111 = i104 & i109;
                int i112 = ((i111 & i110) | (i110 ^ i111)) * 920;
                int i113 = (-1323320758) | i112;
                int i114 = i113 << 1;
                int i115 = -((~(i112 & (-1323320758))) & i113);
                int i116 = (i114 ^ i115) + ((i115 & i114) << 1);
                int i117 = ~(2061536424 | i105);
                int i118 = -(~(((i117 & 1930051) | (1930051 ^ i117)) * 920));
                int i119 = ((i116 & i118) + (i118 | i116)) - 1;
                int i120 = (-1930052) ^ i105;
                int i121 = (-1930052) & i105;
                int i122 = ~((i121 & i120) | (i120 ^ i121));
                int i123 = 2063466475 & iIdentityHashCode2;
                int i124 = (2063466475 | iIdentityHashCode2) & (~i123);
                int i125 = ~((i124 & i123) | (i124 ^ i123));
                int i126 = i122 ^ i125;
                int i127 = i122 & i125;
                int i128 = (i127 & i126) | (i126 ^ i127);
                int i129 = ~((iIdentityHashCode2 & (-817889313)) | (i105 & (-817889313)) | (817889312 & iIdentityHashCode2));
                int i130 = ((~i129) & i128) | ((~i128) & i129);
                int i131 = i129 & i128;
                int i132 = ((i131 & i130) | (i130 ^ i131)) * 920;
                if (i100 > (i119 ^ i132) + ((i132 & i119) << 1)) {
                    return Boolean.FALSE;
                }
                throw null;
            case 18:
                att attVar20 = (att) objArr[0];
                int i133 = f53850e;
                int i134 = (i133 & 115) + (i133 | 115);
                f53851f = i134 % 128;
                int i135 = i134 % 2;
                int iIdentityHashCode3 = System.identityHashCode(attVar20);
                int i136 = ~iIdentityHashCode3;
                int i137 = ~i136;
                int i138 = ~(((-1937574244) ^ i136) | ((-1937574244) & i136));
                int i139 = (i138 & 810551619) | (810551619 ^ i138);
                int i140 = i136 & (-1127064761);
                int i141 = (1127064760 & i137) | i140;
                int i142 = 1127064760 & i136;
                int i143 = ~((i141 & i142) | (i141 ^ i142));
                int i144 = 1618394585 - (~(((i139 & i143) | (i139 ^ i143)) * (-1136)));
                int i145 = ~((-1937574244) | iIdentityHashCode3);
                int i146 = (iIdentityHashCode3 & (-1127064761)) | i142;
                int i147 = 1127064760 & iIdentityHashCode3;
                int i148 = ~((i146 & i147) | (i146 ^ i147));
                int i149 = ((~i148) & i145) | ((~i145) & i148);
                int i150 = i145 & i148;
                int i151 = (i150 & i149) | (i149 ^ i150);
                int i152 = i136 & 1937574243;
                int i153 = (~i152) & (i136 | 1937574243);
                int i154 = (i153 ^ i152) | (i153 & i152);
                int i155 = i154 & (-1127064761);
                int i156 = (~i155) & (i154 | (-1127064761));
                int i157 = (i155 & i156) | (i156 ^ i155);
                int i158 = ~i157;
                int i159 = (i157 | i158) & i158;
                int i160 = i151 & i159;
                int i161 = (((i159 | i151) & (~i160)) | i160) * (-568);
                int i162 = i144 & i161;
                int i163 = (i161 | i144) & (~i162);
                int i164 = -(-(i162 << 1));
                int i165 = (i163 & i164) + (i163 | i164);
                int i166 = ~((i136 ^ 1937574243) | i152);
                int i167 = ~(((-1127064761) & i137) | i142 | i140);
                int i168 = i166 & i167;
                int i169 = (i166 | i167) & (~i168);
                int i170 = (i169 & i168) | (i169 ^ i168);
                int i171 = (i136 & (-810551620)) | (iIdentityHashCode3 & 810551619);
                int i172 = iIdentityHashCode3 & (-810551620);
                int i173 = ~((i172 & i171) | (i171 ^ i172));
                int i174 = i170 ^ i173;
                int i175 = i173 & i170;
                int i176 = ((i175 & i174) | (i174 ^ i175)) * 568;
                int i177 = i165 & i176;
                int i178 = ((i165 ^ i176) | i177) << 1;
                int i179 = -((i176 | i165) & (~i177));
                int i180 = (i178 ^ i179) + ((i179 & i178) << 1);
                int iIdentityHashCode4 = System.identityHashCode(attVar20);
                int i181 = ~iIdentityHashCode4;
                int i182 = ~i181;
                int i183 = (1104283875 & i181) | ((-1104283876) & i182);
                int i184 = i181 & (-1104283876);
                int i185 = ~((i183 & i184) | (i183 ^ i184));
                int i186 = (-1509751622) & i185;
                int i187 = (i185 | (-1509751622)) & (~i186);
                int i188 = 885633635 - (~(((i187 & i186) | (i187 ^ i186)) * (-1042)));
                int i189 = (-1104283876) & iIdentityHashCode4;
                int i190 = (~i189) & ((-1104283876) | iIdentityHashCode4);
                int i191 = -(~(-(-(((i189 & i190) | (i190 ^ i189)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))));
                int i192 = (i188 ^ i191) + ((i191 & i188) << 1);
                int i193 = (i192 ^ (-1)) + (i192 << 1);
                int i194 = 1509751621 & i181;
                int i195 = (iIdentityHashCode4 & (-1509751622)) | i194;
                int i196 = iIdentityHashCode4 & 1509751621;
                int i197 = (i196 & i195) | (i195 ^ i196);
                int i198 = ~i197;
                int i199 = (i197 | i198) & i198;
                int i200 = (i199 & (-1509882856)) | ((-1509882856) ^ i199);
                int i201 = (i182 & (-1509751622)) | i194;
                int i202 = i181 & (-1509751622);
                int i203 = (i202 & i201) | (i201 ^ i202);
                int i204 = i203 & (-1104283876);
                int i205 = (i203 | (-1104283876)) & (~i204);
                int i206 = (i205 & i204) | (i205 ^ i204);
                int i207 = ~i206;
                int i208 = (i206 | i207) & i207;
                if (i180 <= (i193 - (~(-(~(-(-(((i200 & i208) | (i200 ^ i208)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY))))))) - 2) {
                    return Boolean.TRUE;
                }
                throw null;
            case 19:
                att attVar21 = (att) objArr[0];
                long[] jArr8 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar21.setLayoutAnimation, jArr8}, 1461527585, -1461527582, (int) System.currentTimeMillis());
                att attVar22 = new att(jArr8);
                int i209 = f53850e;
                int i210 = i209 & 77;
                int i211 = (i209 | 77) & (~i210);
                int i212 = -(-(i210 << 1));
                int i213 = (i211 ^ i212) + ((i211 & i212) << 1);
                f53851f = i213 % 128;
                int i214 = i213 % 2;
                return attVar22;
            case 20:
                att attVar23 = (att) objArr[0];
                long[] jArr9 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{attVar23.setLayoutAnimation, jArr9}, -695938683, 695938691, (int) System.currentTimeMillis());
                att attVar24 = new att(jArr9);
                int i215 = f53850e;
                int i216 = (i215 & 121) + (i215 | 121);
                f53851f = i216 % 128;
                int i217 = i216 % 2;
                return attVar24;
            case 21:
                att attVar25 = (att) objArr[0];
                apk apkVar7 = (apk) objArr[1];
                int i218 = f53850e;
                int i219 = i218 & 65;
                int i220 = (i218 ^ 65) | i219;
                int i221 = ((i219 | i220) << 1) - (i220 ^ i219);
                f53851f = i221 % 128;
                int i222 = i221 % 2;
                apk compoundDrawableTintBlendMode2 = attVar25.setCompoundDrawableTintBlendMode(apkVar7.setNavigationOnClickListener());
                int i223 = f53850e + 85;
                f53851f = i223 % 128;
                int i224 = i223 % 2;
                return compoundDrawableTintBlendMode2;
            case 22:
                att attVar26 = (att) objArr[0];
                apk apkVar8 = (apk) objArr[1];
                apk apkVar9 = (apk) objArr[2];
                apk apkVar10 = (apk) objArr[3];
                long[] jArr10 = attVar26.setLayoutAnimation;
                long[] jArr11 = ((att) apkVar8).setLayoutAnimation;
                long[] jArr12 = ((att) apkVar9).setLayoutAnimation;
                long[] jArr13 = ((att) apkVar10).setLayoutAnimation;
                long[] jArr14 = (long[]) avi.setDividerPadding(new Object[0], 1969613513, -1969613507, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{jArr10, jArr11, jArr14}, 378521458, -378521452, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{jArr12, jArr13, jArr14}, 378521458, -378521452, (int) System.currentTimeMillis());
                long[] jArr15 = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
                atr.setOnFocusChangeListener(new Object[]{jArr14, jArr15}, 1843581176, -1843581157, (int) System.currentTimeMillis());
                att attVar27 = new att(jArr15);
                int i225 = f53850e + 125;
                f53851f = i225 % 128;
                if (i225 % 2 != 0) {
                    return attVar27;
                }
                throw null;
            default:
                att attVar28 = (att) objArr[0];
                int i226 = f53850e;
                int i227 = i226 & 81;
                int i228 = ((((i226 ^ 81) | i227) << 1) - (~(-((i226 | 81) & (~i227))))) - 1;
                f53851f = i228 % 128;
                int i229 = i228 % 2;
                int iIntValue2 = ((Integer) bek.setOnFocusChangeListener(new Object[]{attVar28.setLayoutAnimation, 9}, -1971094880, 1971094881, 9)).intValue();
                int i230 = (iIntValue2 & (-5711053)) | ((~iIntValue2) & 5711052);
                int i231 = f53851f;
                int i232 = i231 & 5;
                int i233 = (i231 ^ 5) | i232;
                int i234 = ((i232 | i233) << 1) - (i233 ^ i232);
                f53850e = i234 % 128;
                int i235 = i234 % 2;
                return Integer.valueOf(i230);
        }
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setY(new Object[]{this}, -1887657356, 1887657371, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setY(new Object[]{this, obj}, 220835480, -220835463, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setY(new Object[]{this}, 1488676775, -1488676764, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setY(new Object[]{this}, -472615935, 472615935, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setY(new Object[]{this}, 134464315, -134464309, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setY(new Object[]{this, Integer.valueOf(i10)}, 1638127786, -1638127778, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -724438670, 724438691, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setY(new Object[]{this}, 937725745, -937725726, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setY(new Object[]{this}, 448271046, -448271039, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setY(new Object[]{this}, 1481023800, -1481023787, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, 277971428, -277971424, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setY(new Object[]{this}, 550120473, -550120453, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setY(new Object[]{this}, 914925934, -914925929, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setY(new Object[]{this}, -1601837648, 1601837666, System.identityHashCode(this))).booleanValue();
    }

    public att() {
        this.setLayoutAnimation = (long[]) avi.setDividerPadding(new Object[0], -288338059, 288338061, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2, apkVar3}, -832916480, 832916502, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setY(new Object[]{this}, 969283550, -969283538, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setY(new Object[]{this}, 1865506747, -1865506731, System.identityHashCode(this))).intValue();
    }

    public att(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.setLayoutAnimation = (long[]) atr.setOnFocusChangeListener(new Object[]{bigInteger}, 116917515, -116917502, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -838854657, 838854671, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setY(new Object[]{this}, -645427623, 645427626, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2}, -1873406938, 1873406940, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setY(new Object[]{this}, 210813192, -210813182, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setY(new Object[]{this, apkVar, apkVar2, apkVar3}, -1033161411, 1033161420, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setY(new Object[]{this, apkVar}, -1004437825, 1004437826, System.identityHashCode(this));
    }
}
