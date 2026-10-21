package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class atf extends apk.setOnFocusChangeListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53813f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f53814g = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f53815e;

    public atf(long[] jArr) {
        this.f53815e = jArr;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        BigInteger bigInteger;
        int iIntValue;
        atf atfVar;
        int i13 = ~i11;
        int i14 = i13 | i10;
        switch ((((~(i10 | i12)) | (~(i13 | i12)) | (~i14)) * 623) + (((~(i11 | (~i10))) | (~i12)) * (-623)) + ((~(i14 | i12)) * 623) + (i11 * (-622)) + (i10 * 624)) {
            case 1:
                int i15 = f53814g + 122;
                int i16 = (i15 ^ (-1)) + (i15 << 1);
                f53813f = i16 % 128;
                return Integer.valueOf(i16 % 2 != 0 ? 31986 : 239);
            case 2:
                atf atfVar2 = (atf) objArr[0];
                apk apkVar = (apk) objArr[1];
                long[] jArr = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar2.f53815e, ((atf) apkVar).f53815e, jArr}, -107110555, 107110559, (int) System.currentTimeMillis());
                atf atfVar3 = new atf(jArr);
                int i17 = f53813f + 49;
                f53814g = i17 % 128;
                if (i17 % 2 != 0) {
                    return atfVar3;
                }
                throw null;
            case 3:
                atf atfVar4 = (atf) objArr[0];
                apk apkVar2 = (apk) objArr[1];
                apk apkVar3 = (apk) objArr[2];
                apk apkVar4 = (apk) objArr[3];
                int i18 = f53814g + 39;
                f53813f = i18 % 128;
                if (i18 % 2 != 0) {
                    atfVar4.setCompoundDrawableTintBlendMode(apkVar2, apkVar3, apkVar4);
                    throw null;
                }
                apk compoundDrawableTintBlendMode = atfVar4.setCompoundDrawableTintBlendMode(apkVar2, apkVar3, apkVar4);
                int i19 = f53814g;
                int i20 = (i19 ^ 85) + ((i19 & 85) << 1);
                f53813f = i20 % 128;
                if (i20 % 2 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                throw null;
            case 4:
                atf atfVar5 = (atf) objArr[0];
                int i21 = f53814g;
                int i22 = (i21 ^ 49) + ((i21 & 49) << 1);
                f53813f = i22 % 128;
                int i23 = i22 % 2;
                long[] jArr2 = atfVar5.f53815e;
                if (i23 != 0) {
                    bigInteger = (BigInteger) avf.setX(new Object[]{jArr2}, -692671830, 692671838, (int) System.currentTimeMillis());
                    int i24 = 18 / 0;
                } else {
                    bigInteger = (BigInteger) avf.setX(new Object[]{jArr2}, -692671830, 692671838, (int) System.currentTimeMillis());
                }
                int i25 = f53814g;
                int i26 = i25 & 27;
                int i27 = -(-((i25 ^ 27) | i26));
                int i28 = (i26 & i27) + (i27 | i26);
                f53813f = i28 % 128;
                int i29 = i28 % 2;
                return bigInteger;
            case 5:
                atf atfVar6 = (atf) objArr[0];
                int i30 = f53813f;
                int i31 = ((i30 & 96) + (i30 | 96)) - 1;
                int i32 = i31 % 128;
                f53814g = i32;
                int i33 = i31 % 2;
                if ((atfVar6.f53815e[0] & 1) != 0) {
                    int i34 = i32 & 3;
                    int i35 = ((i32 | 3) & (~i34)) + (i34 << 1);
                    f53813f = i35 % 128;
                    return Boolean.valueOf(i35 % 2 == 0);
                }
                int i36 = (-2) - (((i32 ^ 76) + ((i32 & 76) << 1)) ^ (-1));
                f53813f = i36 % 128;
                if (i36 % 2 == 0) {
                    return Boolean.FALSE;
                }
                throw null;
            case 6:
                atf atfVar7 = (atf) objArr[0];
                long[] jArr3 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar7.f53815e, jArr3}, 59301668, -59301658, (int) System.currentTimeMillis());
                atf atfVar8 = new atf(jArr3);
                int i37 = f53813f;
                int i38 = i37 ^ 19;
                int i39 = ((i37 & 19) | i38) << 1;
                int i40 = -i38;
                int i41 = (i39 ^ i40) + ((i39 & i40) << 1);
                f53814g = i41 % 128;
                if (i41 % 2 != 0) {
                    return atfVar8;
                }
                int i42 = 16 / 0;
                return atfVar8;
            case 7:
                atf atfVar9 = (atf) objArr[0];
                long[] jArr4 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar9.f53815e, jArr4}, 1669919721, -1669919710, (int) System.currentTimeMillis());
                atf atfVar10 = new atf(jArr4);
                int iIdentityHashCode = System.identityHashCode(atfVar9);
                int i43 = iIdentityHashCode & 134432515;
                int i44 = (~i43) & (iIdentityHashCode | 134432515);
                int i45 = (i43 & i44) | (i44 ^ i43);
                int i46 = ((i45 & 89923744) | (i45 ^ 89923744)) * 614;
                int i47 = (-901416547) & i46;
                int i48 = i47 + ((i46 ^ (-901416547)) | i47);
                int i49 = ~iIdentityHashCode;
                int i50 = (-939738952) ^ i49;
                int i51 = (-939738952) & i49;
                int i52 = ~((i51 & i50) | (i50 ^ i51));
                int i53 = i52 & 134432515;
                int i54 = (134432515 | i52) & (~i53);
                int i55 = (i54 & i53) | (i54 ^ i53);
                int i56 = i49 & 895230180;
                int i57 = (~i56) & (i49 | 895230180);
                int i58 = ~((i56 & i57) | (i57 ^ i56));
                int i59 = i55 & i58;
                int i60 = -(-((((i55 | i58) & (~i59)) | i59) * (-1228)));
                int i61 = i48 | i60;
                int i62 = i61 << 1;
                int i63 = -((~(i60 & i48)) & i61);
                int i64 = ((i62 | i63) << 1) - (i63 ^ i62);
                int i65 = (-805306437) ^ i49;
                int i66 = (-805306437) & i49;
                int i67 = ~((i66 & i65) | (i65 ^ i66));
                int i68 = ((iIdentityHashCode | i49) & i49) | 939738951;
                int i69 = i68 ^ 895230180;
                int i70 = i68 & 895230180;
                int i71 = (i70 & i69) | (i69 ^ i70);
                int i72 = ~i71;
                int i73 = (i71 | i72) & i72;
                int i74 = i67 ^ i73;
                int i75 = i73 & i67;
                int i76 = -(~(-(-(((i75 & i74) | (i74 ^ i75)) * 614))));
                int i77 = ((i64 ^ i76) + ((i76 & i64) << 1)) - 1;
                int iIdentityHashCode2 = System.identityHashCode(atfVar9);
                int i78 = ((~iIdentityHashCode2) & (-270079896)) | (270079895 & iIdentityHashCode2);
                int i79 = (-270079896) & iIdentityHashCode2;
                int i80 = ~((i78 & i79) | (i78 ^ i79));
                int i81 = (-290265764) ^ i80;
                int i82 = i80 & (-290265764);
                int i83 = ((i82 & i81) | (i81 ^ i82)) * (-366);
                int i84 = ((364068747 | i83) << 1) - (i83 ^ 364068747);
                int i85 = (-269030020) & iIdentityHashCode2;
                int i86 = (iIdentityHashCode2 | (-269030020)) & (~i85);
                int i87 = ~((i86 & i85) | (i86 ^ i85));
                int i88 = ((~i87) & (-291315640)) | (291315639 & i87);
                int i89 = i87 & (-291315640);
                int i90 = -(-(((i89 & i88) | (i88 ^ i89)) * 366));
                int i91 = i84 ^ i90;
                int i92 = (i90 & i84) << 1;
                if (i77 <= ((i91 | i92) << 1) - (i92 ^ i91)) {
                    int i93 = 20 / 0;
                }
                return atfVar10;
            case 8:
                atf atfVar11 = (atf) objArr[0];
                Object obj = objArr[1];
                int i94 = f53813f;
                int i95 = i94 | 44;
                int i96 = (i95 << 1) - (i94 ^ 44);
                int i97 = (i96 ^ (-1)) + (i96 << 1);
                int i98 = i97 % 128;
                f53814g = i98;
                if (i97 % 2 == 0) {
                    throw null;
                }
                if (obj == atfVar11) {
                    int i99 = ((i94 & 44) + i95) - 1;
                    f53814g = i99 % 128;
                    int i100 = i99 % 2;
                    int i101 = i94 ^ 49;
                    int i102 = ((((i94 & 49) | i101) << 1) - (~(-i101))) - 1;
                    f53814g = i102 % 128;
                    if (i102 % 2 != 0) {
                        return Boolean.TRUE;
                    }
                    throw null;
                }
                if (obj instanceof atf) {
                    boolean zBooleanValue = ((Boolean) avf.setX(new Object[]{atfVar11.f53815e, ((atf) obj).f53815e}, 479700147, -479700143, (int) System.currentTimeMillis())).booleanValue();
                    int i103 = f53814g;
                    int i104 = ((i103 | 31) << 1) - (i103 ^ 31);
                    f53813f = i104 % 128;
                    if (i104 % 2 != 0) {
                        int i105 = 89 / 0;
                    }
                    return Boolean.valueOf(zBooleanValue);
                }
                int i106 = i98 ^ 123;
                int i107 = ((i98 & 123) | i106) << 1;
                int i108 = -i106;
                int i109 = (i107 ^ i108) + ((i108 & i107) << 1);
                f53813f = i109 % 128;
                int i110 = i109 % 2;
                int i111 = (((i98 & (-38)) | ((~i98) & 37)) - (~(-(-((i98 & 37) << 1))))) - 1;
                f53813f = i111 % 128;
                int i112 = i111 % 2;
                return Boolean.FALSE;
            case 9:
                atf atfVar12 = (atf) objArr[0];
                long[] jArr5 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar12.f53815e, jArr5}, -472943092, 472943101, (int) System.currentTimeMillis());
                atf atfVar13 = new atf(jArr5);
                int i113 = f53813f;
                int i114 = i113 & 49;
                int i115 = i114 + ((i113 ^ 49) | i114);
                f53814g = i115 % 128;
                if (i115 % 2 != 0) {
                    return atfVar13;
                }
                int i116 = 74 / 0;
                return atfVar13;
            case 10:
                atf atfVar14 = (atf) objArr[0];
                apk apkVar5 = (apk) objArr[1];
                int i117 = f53813f;
                int i118 = i117 & 125;
                int i119 = ((((i117 ^ 125) | i118) << 1) - (~(-((i117 | 125) & (~i118))))) - 1;
                f53814g = i119 % 128;
                int i120 = i119 % 2;
                apk compoundDrawableTintBlendMode2 = atfVar14.setCompoundDrawableTintBlendMode(apkVar5.setNavigationOnClickListener());
                if (i120 == 0) {
                    int i121 = 33 / 0;
                }
                int i122 = f53813f + 95;
                f53814g = i122 % 128;
                if (i122 % 2 != 0) {
                    return compoundDrawableTintBlendMode2;
                }
                throw null;
            case 11:
                atf atfVar15 = (atf) objArr[0];
                long[] jArr6 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar15.f53815e, jArr6}, 1087566092, -1087566076, (int) System.currentTimeMillis());
                atf atfVar16 = new atf(jArr6);
                int i123 = f53814g + 113;
                f53813f = i123 % 128;
                if (i123 % 2 == 0) {
                    return atfVar16;
                }
                throw null;
            case 12:
                atf atfVar17 = (atf) objArr[0];
                long[] jArr7 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar17.f53815e, jArr7}, 2127439901, -2127439888, (int) System.currentTimeMillis());
                atf atfVar18 = new atf(jArr7);
                int i124 = f53814g;
                int i125 = i124 ^ 13;
                int i126 = ((i124 & 13) | i125) << 1;
                int i127 = -i125;
                int i128 = (i126 ^ i127) + ((i126 & i127) << 1);
                f53813f = i128 % 128;
                int i129 = i128 % 2;
                return atfVar18;
            case 13:
                atf atfVar19 = (atf) objArr[0];
                apk apkVar6 = (apk) objArr[1];
                long[] jArr8 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar19.f53815e, ((atf) apkVar6).f53815e, jArr8}, 354064377, -354064360, (int) System.currentTimeMillis());
                atf atfVar20 = new atf(jArr8);
                int i130 = f53813f;
                int i131 = (((i130 & (-94)) | ((~i130) & 93)) - (~((i130 & 93) << 1))) - 1;
                f53814g = i131 % 128;
                if (i131 % 2 != 0) {
                    return atfVar20;
                }
                int i132 = 38 / 0;
                return atfVar20;
            case 14:
                atf atfVar21 = (atf) objArr[0];
                int i133 = f53814g;
                int i134 = ((i133 & 5) - (~(i133 | 5))) - 1;
                f53813f = i134 % 128;
                int i135 = i134 % 2;
                long[] jArr9 = atfVar21.f53815e;
                if (i135 != 0) {
                    iIntValue = ((Integer) atg.setCompoundDrawableTintBlendMode(new Object[]{jArr9}, -1533714022, 1533714029, (int) System.currentTimeMillis())).intValue();
                    int i136 = 31 / 0;
                } else {
                    iIntValue = ((Integer) atg.setCompoundDrawableTintBlendMode(new Object[]{jArr9}, -1533714022, 1533714029, (int) System.currentTimeMillis())).intValue();
                }
                int i137 = f53814g;
                int i138 = i137 & 59;
                int i139 = i137 | 59;
                int i140 = ((i138 | i139) << 1) - (i139 ^ i138);
                f53813f = i140 % 128;
                if (i140 % 2 == 0) {
                    return Integer.valueOf(iIntValue);
                }
                throw null;
            case 15:
                atf atfVar22 = (atf) objArr[0];
                int i141 = f53814g;
                int i142 = ((i141 ^ 106) + ((i141 & 106) << 1)) - 1;
                f53813f = i142 % 128;
                int i143 = i142 % 2;
                boolean zBooleanValue2 = ((Boolean) avf.setX(new Object[]{atfVar22.f53815e}, 572389043, -572389036, (int) System.currentTimeMillis())).booleanValue();
                int i144 = f53813f;
                int i145 = (i144 ^ 43) + ((i144 & 43) << 1);
                f53814g = i145 % 128;
                if (i145 % 2 == 0) {
                    int i146 = 37 / 0;
                }
                return Boolean.valueOf(zBooleanValue2);
            case 16:
                atfVar = (atf) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int i147 = f53813f + 63;
                int i148 = i147 % 128;
                f53814g = i148;
                if (i147 % 2 == 0) {
                    throw null;
                }
                if (iIntValue2 > 0) {
                    long[] jArr10 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                    atg.setCompoundDrawableTintBlendMode(new Object[]{atfVar.f53815e, Integer.valueOf(iIntValue2), jArr10}, 2140407636, -2140407635, iIntValue2);
                    atf atfVar23 = new atf(jArr10);
                    int i149 = f53813f;
                    int i150 = (i149 ^ 73) + ((i149 & 73) << 1);
                    f53814g = i150 % 128;
                    if (i150 % 2 != 0) {
                        return atfVar23;
                    }
                    throw null;
                }
                int i151 = (i148 & (-28)) | ((~i148) & 27);
                int i152 = -(-((i148 & 27) << 1));
                int i153 = (i151 & i152) + (i151 | i152);
                f53813f = i153 % 128;
                int i154 = i153 % 2;
                int i155 = ((i148 & 100) + (i148 | 100)) - 1;
                f53813f = i155 % 128;
                if (i155 % 2 != 0) {
                    throw null;
                }
                break;
            case 17:
                atf atfVar24 = (atf) objArr[0];
                int i156 = f53813f;
                int i157 = i156 ^ 19;
                int i158 = -(-((i156 & 19) << 1));
                int i159 = (i157 & i158) + (i158 | i157);
                f53814g = i159 % 128;
                int i160 = i159 % 2;
                boolean zBooleanValue3 = ((Boolean) avf.setX(new Object[]{atfVar24.f53815e}, -1422980310, 1422980335, (int) System.currentTimeMillis())).booleanValue();
                int i161 = f53813f;
                int i162 = i161 & 115;
                int i163 = -(-(i161 | 115));
                int i164 = (i162 & i163) + (i163 | i162);
                f53814g = i164 % 128;
                int i165 = i164 % 2;
                return Boolean.valueOf(zBooleanValue3);
            case 18:
                int i166 = f53813f;
                int i167 = ((i166 | 57) << 1) - (i166 ^ 57);
                f53814g = i167 % 128;
                return Boolean.valueOf(i167 % 2 != 0);
            case 19:
                atf atfVar25 = (atf) objArr[0];
                apk apkVar7 = (apk) objArr[1];
                apk apkVar8 = (apk) objArr[2];
                apk apkVar9 = (apk) objArr[3];
                long[] jArr11 = atfVar25.f53815e;
                long[] jArr12 = ((atf) apkVar7).f53815e;
                long[] jArr13 = ((atf) apkVar8).f53815e;
                long[] jArr14 = ((atf) apkVar9).f53815e;
                long[] jArr15 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{jArr11, jArr12, jArr15}, -1128112406, 1128112418, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{jArr13, jArr14, jArr15}, -1128112406, 1128112418, (int) System.currentTimeMillis());
                long[] jArr16 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{jArr15, jArr16}, 558413775, -558413772, (int) System.currentTimeMillis());
                atfVar = new atf(jArr16);
                int i168 = f53814g;
                int i169 = (i168 & 1) + (i168 | 1);
                f53813f = i169 % 128;
                int i170 = i169 % 2;
                break;
            case 20:
                atf atfVar26 = (atf) objArr[0];
                apk apkVar10 = (apk) objArr[1];
                apk apkVar11 = (apk) objArr[2];
                long[] jArr17 = atfVar26.f53815e;
                long[] jArr18 = ((atf) apkVar10).f53815e;
                long[] jArr19 = ((atf) apkVar11).f53815e;
                long[] jArr20 = (long[]) avf.setX(new Object[0], -69286722, 69286749, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{jArr17, jArr20}, -943814066, 943814080, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{jArr18, jArr19, jArr20}, -1128112406, 1128112418, (int) System.currentTimeMillis());
                long[] jArr21 = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
                atg.setCompoundDrawableTintBlendMode(new Object[]{jArr20, jArr21}, 558413775, -558413772, (int) System.currentTimeMillis());
                atfVar = new atf(jArr21);
                int i171 = (-2) - ((f53813f + 74) ^ (-1));
                f53814g = i171 % 128;
                if (i171 % 2 == 0) {
                    throw null;
                }
                break;
            case 21:
                atf atfVar27 = (atf) objArr[0];
                apk apkVar12 = (apk) objArr[1];
                int i172 = f53813f;
                int i173 = i172 & 109;
                int i174 = (((i172 | 109) & (~i173)) - (~(-(-(i173 << 1))))) - 1;
                f53814g = i174 % 128;
                int i175 = i174 % 2;
                apk onFocusChangeListener = atfVar27.setOnFocusChangeListener(apkVar12);
                int i176 = f53814g;
                int i177 = i176 & 15;
                int i178 = (i176 | 15) & (~i177);
                int i179 = i177 << 1;
                int i180 = (i178 & i179) + (i178 | i179);
                f53813f = i180 % 128;
                if (i180 % 2 == 0) {
                    return onFocusChangeListener;
                }
                throw null;
            case 22:
                atf atfVar28 = (atf) objArr[0];
                int i181 = f53814g;
                int i182 = (i181 & 45) + (i181 | 45);
                f53813f = i182 % 128;
                int i183 = i182 % 2;
                int iIntValue3 = ((Integer) bek.setOnFocusChangeListener(new Object[]{atfVar28.f53815e, 4}, -1971094880, 1971094881, 4)).intValue();
                int i184 = iIntValue3 & 23900158;
                int i185 = ((iIntValue3 ^ 23900158) | i184) & (~i184);
                int i186 = f53814g;
                int i187 = (((i186 | 64) << 1) - (i186 ^ 64)) - 1;
                f53813f = i187 % 128;
                if (i187 % 2 != 0) {
                    int i188 = 63 / 0;
                }
                return Integer.valueOf(i185);
            default:
                atf atfVar29 = (atf) objArr[0];
                int i189 = f53814g;
                int i190 = i189 + 125;
                f53813f = i190 % 128;
                int i191 = i190 % 2;
                int i192 = ((i189 | 75) << 1) - (i189 ^ 75);
                f53813f = i192 % 128;
                if (i192 % 2 == 0) {
                    return atfVar29;
                }
                throw null;
        }
        return atfVar;
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final int UiMessageCallbackKtWhenMappings() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -703630766, 703630780, System.identityHashCode(this))).intValue();
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this, obj}, -1128656206, 1128656214, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean getNavBarTitleString() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1353039552, -1353039537, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1811230991, 1811231013, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setAlwaysDrawnWithCacheEnabled() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -976956841, 976956846, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 1025517699, -1025517689, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final apk setIncludeFontPadding() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 2093756628, -2093756619, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setNavigationOnClickListener() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, -415398196, 415398208, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final boolean setOnDragListener() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 757461738, -757461721, System.identityHashCode(this))).booleanValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnFocusChangeListener(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, -737670765, 737670778, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setOnLongClickListener() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, -213794198, 213794204, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setX() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 123879437, -123879426, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2}, -1523539642, 1523539662, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.i.apk.setOnFocusChangeListener
    public final boolean setZ() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -1615809678, 1615809696, System.identityHashCode(this))).booleanValue();
    }

    public atf() {
        this.f53815e = (long[]) avf.setX(new Object[0], 261521621, -261521615, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setDividerPadding() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, -200593626, 200593633, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1624019707, 1624019708, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY() {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this}, 1488741685, -1488741685, System.identityHashCode(this));
    }

    public atf(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f53815e = (long[]) atg.setCompoundDrawableTintBlendMode(new Object[]{bigInteger}, 1236138735, -1236138716, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2, apkVar3}, -1649222708, 1649222711, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setY(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, -849586233, 849586254, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(int i10) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, Integer.valueOf(i10)}, 1137311151, -1137311135, i10);
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar, apk apkVar2, apk apkVar3) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar, apkVar2, apkVar3}, 1600705847, -1600705828, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final apk setCompoundDrawableTintBlendMode(apk apkVar) {
        return (apk) setCompoundDrawableTintBlendMode(new Object[]{this, apkVar}, 2140092927, -2140092925, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.apk
    public final BigInteger setCompoundDrawableTintBlendMode() {
        return (BigInteger) setCompoundDrawableTintBlendMode(new Object[]{this}, -245870906, 245870910, System.identityHashCode(this));
    }
}
