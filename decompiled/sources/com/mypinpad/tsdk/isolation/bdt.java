package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;

/* JADX INFO: loaded from: classes10.dex */
public final class bdt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f54594c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f54595d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54597b;

    public bdt(byte[] bArr) {
        this.f54596a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int iIntValue = ((Integer) bea.setCompoundDrawableTintBlendMode(new Object[]{bArr}, -395531773, 395531774, (int) System.currentTimeMillis())).intValue();
        this.f54597b = iIntValue;
        if (!((Boolean) bed.setY(new Object[]{Integer.valueOf(iIntValue)}, 76866021, -76866021, iIntValue)).booleanValue()) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f54596a = ((Integer) bed.setY(new Object[]{Integer.valueOf(iIntValue)}, 1719558927, -1719558925, iIntValue)).intValue();
    }

    public static /* synthetic */ Integer a(Object[] objArr) {
        bdt bdtVar = (bdt) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int iIntValue2 = ((Number) objArr[2]).intValue();
        int i10 = f54594c;
        int i11 = i10 + 115;
        int i12 = i11 % 128;
        f54595d = i12;
        int i13 = i11 % 2;
        if (iIntValue2 == 0) {
            int i14 = ((i10 | 79) << 1) - (i10 ^ 79);
            int i15 = i14 % 128;
            f54595d = i15;
            int i16 = i14 % 2;
            int i17 = i15 ^ 69;
            int i18 = -(-((i15 & 69) << 1));
            int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
            f54594c = i19 % 128;
            int i20 = i19 % 2;
            return 1;
        }
        if (iIntValue == 0) {
            int i21 = i12 ^ 33;
            int i22 = (((i12 & 33) | i21) << 1) - i21;
            int i23 = i22 % 128;
            f54594c = i23;
            int i24 = i22 % 2;
            int i25 = (i23 & (-78)) | ((~i23) & 77);
            int i26 = (i23 & 77) << 1;
            int i27 = (i25 & i26) + (i26 | i25);
            f54595d = i27 % 128;
            int i28 = i27 % 2;
            return 0;
        }
        if (iIntValue == 1) {
            int i29 = ((i12 | 107) << 1) - (i12 ^ 107);
            f54594c = i29 % 128;
            int i30 = i29 % 2;
            int i31 = ((i12 ^ 113) | (i12 & 113)) << 1;
            int i32 = -((i12 & (-114)) | ((~i12) & 113));
            int i33 = (i31 ^ i32) + ((i31 & i32) << 1);
            f54594c = i33 % 128;
            if (i33 % 2 == 0) {
                return 1;
            }
            throw null;
        }
        if (iIntValue2 < 0) {
            int i34 = i12 + 73;
            f54594c = i34 % 128;
            int i35 = i34 % 2;
            iIntValue = ((Integer) setX(new Object[]{bdtVar, Integer.valueOf(iIntValue)}, 2104839888, -2104839886, iIntValue)).intValue();
            iIntValue2 = -iIntValue2;
            int i36 = f54595d;
            int i37 = (i36 & (-120)) | ((~i36) & 119);
            int i38 = -(-((i36 & 119) << 1));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f54594c = i39 % 128;
            int i40 = i39 % 2;
        }
        int iIntValue3 = 1;
        while (iIntValue2 != 0) {
            int i41 = f54594c;
            int i42 = i41 & 109;
            int i43 = (~i42) & (i41 | 109);
            int i44 = i42 << 1;
            int i45 = (i43 & i44) + (i44 | i43);
            f54595d = i45 % 128;
            int i46 = i45 % 2;
            if ((iIntValue2 & 1) == 1) {
                int i47 = ((((i41 ^ 7) | (i41 & 7)) << 1) - (~(-(((~i41) & 7) | (i41 & (-8)))))) - 1;
                f54595d = i47 % 128;
                int i48 = i47 % 2;
                iIntValue3 = ((Integer) setX(new Object[]{bdtVar, Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue)}, 1119876470, -1119876464, iIntValue3)).intValue();
                int i49 = f54594c;
                int i50 = (((i49 | 48) << 1) - (i49 ^ 48)) - 1;
                f54595d = i50 % 128;
                int i51 = i50 % 2;
            }
            iIntValue = ((Integer) setX(new Object[]{bdtVar, Integer.valueOf(iIntValue), Integer.valueOf(iIntValue)}, 1119876470, -1119876464, iIntValue)).intValue();
            iIntValue2 >>>= 1;
            int i52 = f54594c;
            int i53 = (i52 ^ 33) + ((i52 & 33) << 1);
            f54595d = i53 % 128;
            int i54 = i53 % 2;
        }
        int i55 = f54594c + 52;
        int i56 = (i55 ^ (-1)) + (i55 << 1);
        f54595d = i56 % 128;
        int i57 = i56 % 2;
        return Integer.valueOf(iIntValue3);
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x020d  */
    /* JADX WARN: Code duplicated, block: B:40:0x021d  */
    /* JADX WARN: Code duplicated, block: B:41:0x021e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0223  */
    /* JADX WARN: Code duplicated, block: B:46:0x0262  */
    /* JADX WARN: Code duplicated, block: B:48:0x0270  */
    /* JADX WARN: Code duplicated, block: B:76:0x0396  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object x4;
        String strConcat;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = ~i11;
        int i19 = ~i12;
        int i20 = ~(i18 | i19);
        int i21 = ~i10;
        int i22 = (((~(i10 | i12)) | (~(i18 | i12)) | (~(i21 | i19))) * 959) + ((~(i11 | i10)) * (-959)) + ((i20 | (~(i21 | i12)) | (~(i19 | i10))) * 959) + (i11 * (-958)) + (i10 * (-958));
        String string = "0";
        String str = "";
        switch (i22) {
            case 1:
                bdt bdtVar = (bdt) objArr[0];
                int i23 = f54595d;
                int i24 = ((i23 | 4) << 1) - (i23 ^ 4);
                int i25 = (i24 ^ (-1)) + (i24 << 1);
                f54594c = i25 % 128;
                int i26 = i25 % 2;
                int i27 = bdtVar.f54596a;
                int i28 = i23 & 115;
                int i29 = (((i23 | 115) & (~i28)) - (~(-(-(i28 << 1))))) - 1;
                f54594c = i29 % 128;
                int i30 = i29 % 2;
                return Integer.valueOf(i27);
            case 2:
                bdt bdtVar2 = (bdt) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                int i31 = f54595d;
                int i32 = (-2) - ((((i31 | 26) << 1) - (i31 ^ 26)) ^ (-1));
                f54594c = i32 % 128;
                if (i32 % 2 != 0) {
                    int i33 = bdtVar2.f54596a;
                    x4 = setX(new Object[]{bdtVar2, Integer.valueOf(iIntValue), 0}, -1226716551, 1226716556, iIntValue);
                } else {
                    int i34 = 1 << bdtVar2.f54596a;
                    int i35 = i34 & (-2);
                    x4 = setX(new Object[]{bdtVar2, Integer.valueOf(iIntValue), Integer.valueOf((((i34 | (-2)) & (~i35)) - (~(i35 << 1))) - 1)}, -1226716551, 1226716556, iIntValue);
                }
                int iIntValue2 = ((Integer) x4).intValue();
                int i36 = f54594c;
                int i37 = ((i36 | 37) << 1) - (i36 ^ 37);
                f54595d = i37 % 128;
                int i38 = i37 % 2;
                return Integer.valueOf(iIntValue2);
            case 3:
                bdt bdtVar3 = (bdt) objArr[0];
                int iIntValue3 = ((Number) objArr[1]).intValue();
                int i39 = f54595d;
                int i40 = i39 & 81;
                int i41 = -(-(i39 | 81));
                int i42 = ((i40 | i41) << 1) - (i40 ^ i41);
                f54594c = i42 % 128;
                int i43 = i42 % 2 != 0 ? 1 : 0;
                int i44 = (i39 | 111) << 1;
                int i45 = -(i39 ^ 111);
                int i46 = (i44 & i45) + (i45 | i44);
                f54594c = i46 % 128;
                int i47 = i46 % 2;
                while (i43 < bdtVar3.f54596a) {
                    int i48 = f54594c;
                    int i49 = ((i48 & (-116)) | ((~i48) & 115)) + ((i48 & 115) << 1);
                    int i50 = i49 % 128;
                    f54595d = i50;
                    if (i49 % 2 == 0 || (((byte) iIntValue3) & 1) == 0) {
                        int i51 = i50 & 19;
                        int i52 = (i50 | 19) & (~i51);
                        int i53 = -(-(i51 << 1));
                        int i54 = (i52 ^ i53) + ((i52 & i53) << 1);
                        f54594c = i54 % 128;
                        int i55 = i54 % 2;
                        strConcat = "0".concat(String.valueOf(str));
                        int i56 = f54594c;
                        int i57 = ((i56 | 75) << 1) - (i56 ^ 75);
                        f54595d = i57 % 128;
                        int i58 = i57 % 2;
                    } else {
                        strConcat = "1".concat(String.valueOf(str));
                        int i59 = f54595d;
                        int i60 = i59 & 99;
                        int i61 = (i59 | 99) & (~i60);
                        int i62 = i60 << 1;
                        int i63 = (i61 ^ i62) + ((i61 & i62) << 1);
                        f54594c = i63 % 128;
                        int i64 = i63 % 2;
                    }
                    str = strConcat;
                    iIntValue3 >>>= 1;
                    int i65 = i43 + 58;
                    int i66 = i65 & (-57);
                    int i67 = (~i66) & (i65 | (-57));
                    int i68 = -(-(i66 << 1));
                    i43 = ((i67 | i68) << 1) - (i68 ^ i67);
                    int i69 = f54595d;
                    int i70 = i69 & 11;
                    int i71 = ((((i69 ^ 11) | i70) << 1) - (~(-((i69 | 11) & (~i70))))) - 1;
                    f54594c = i71 % 128;
                    int i72 = i71 % 2;
                }
                int i73 = f54594c;
                int i74 = i73 & 101;
                int i75 = (i73 ^ 101) | i74;
                int i76 = (i74 & i75) + (i75 | i74);
                f54595d = i76 % 128;
                int i77 = i76 % 2;
                return str;
            case 4:
                int iIntValue4 = ((Number) objArr[0]).intValue();
                int iIntValue5 = ((Number) objArr[1]).intValue();
                int i78 = f54595d;
                int i79 = (((i78 | 110) << 1) - (i78 ^ 110)) - 1;
                f54594c = i79 % 128;
                int i80 = i79 % 2;
                int i81 = (iIntValue5 | iIntValue4) & (~(iIntValue4 & iIntValue5));
                int i82 = ((i78 | 67) << 1) - (i78 ^ 67);
                f54594c = i82 % 128;
                if (i82 % 2 != 0) {
                    int i83 = 90 / 0;
                }
                return Integer.valueOf(i81);
            case 5:
                return a(objArr);
            case 6:
                bdt bdtVar4 = (bdt) objArr[0];
                int iIntValue6 = ((Number) objArr[1]).intValue();
                int iIntValue7 = ((Number) objArr[2]).intValue();
                int i84 = f54595d;
                int i85 = i84 & 39;
                int i86 = -(-((i84 ^ 39) | i85));
                int i87 = (i85 & i86) + (i86 | i85);
                f54594c = i87 % 128;
                int i88 = i87 % 2;
                int i89 = bdtVar4.f54597b;
                if (i88 != 0) {
                    ((Integer) bed.setY(new Object[]{Integer.valueOf(iIntValue6), Integer.valueOf(iIntValue7), Integer.valueOf(i89)}, 1338242645, -1338242644, iIntValue6)).intValue();
                    throw null;
                }
                int iIntValue8 = ((Integer) bed.setY(new Object[]{Integer.valueOf(iIntValue6), Integer.valueOf(iIntValue7), Integer.valueOf(i89)}, 1338242645, -1338242644, iIntValue6)).intValue();
                int i90 = f54595d;
                int i91 = i90 & 121;
                int i92 = (i90 ^ 121) | i91;
                int i93 = (i91 ^ i92) + ((i92 & i91) << 1);
                f54594c = i93 % 128;
                int i94 = i93 % 2;
                return Integer.valueOf(iIntValue8);
            case 7:
                bdt bdtVar5 = (bdt) objArr[0];
                StringBuilder sb2 = new StringBuilder("Finite Field GF(2^");
                sb2.append(bdtVar5.f54596a);
                sb2.append(") = GF(2)[X]/<");
                int i95 = bdtVar5.f54597b;
                sb2.append((String) setX(new Object[]{Integer.valueOf(i95)}, -1778110185, 1778110196, i95));
                sb2.append("> ");
                String string2 = sb2.toString();
                int i96 = f54594c;
                int i97 = i96 & 65;
                int i98 = (i96 ^ 65) | i97;
                int i99 = (i97 & i98) + (i98 | i97);
                f54595d = i99 % 128;
                int i100 = i99 % 2;
                return string2;
            case 8:
                bdt bdtVar6 = (bdt) objArr[0];
                Object obj = objArr[1];
                int i101 = f54594c;
                int i102 = ((i101 | 59) << 1) - (i101 ^ 59);
                int i103 = i102 % 128;
                f54595d = i103;
                int i104 = i102 % 2;
                if (obj != null) {
                    int i105 = i103 ^ 69;
                    int i106 = -(-((i103 & 69) << 1));
                    int i107 = (i105 ^ i106) + ((i106 & i105) << 1);
                    int i108 = i107 % 128;
                    f54594c = i108;
                    int i109 = i107 % 2;
                    if (obj instanceof bdt) {
                        bdt bdtVar7 = (bdt) obj;
                        if (bdtVar6.f54596a == bdtVar7.f54596a) {
                            int i110 = (((i108 | 24) << 1) - (i108 ^ 24)) - 1;
                            f54595d = i110 % 128;
                            if (i110 % 2 == 0) {
                                throw null;
                            }
                            if (bdtVar6.f54597b == bdtVar7.f54597b) {
                                int i111 = i108 ^ 101;
                                int i112 = ((i108 & 101) | i111) << 1;
                                int i113 = -i111;
                                int i114 = (i112 & i113) + (i113 | i112);
                                f54595d = i114 % 128;
                                int i115 = i114 % 2;
                                int i116 = i108 & 19;
                                int i117 = i116 + ((i108 ^ 19) | i116);
                                f54595d = i117 % 128;
                                if (i117 % 2 != 0) {
                                    return Boolean.TRUE;
                                }
                                throw null;
                            }
                        }
                        int i118 = f54595d;
                        int i119 = (i118 & (-110)) | ((~i118) & 109);
                        int i120 = -(-((i118 & 109) << 1));
                        i13 = (i119 & i120) + (i120 | i119);
                        f54594c = i13 % 128;
                    } else {
                        int i121 = f54594c;
                        int i122 = (i121 & (-74)) | ((~i121) & 73);
                        int i123 = (i121 & 73) << 1;
                        i13 = (i122 & i123) + (i123 | i122);
                        f54595d = i13 % 128;
                    }
                } else {
                    int i124 = f54594c;
                    int i125 = (i124 & (-74)) | ((~i124) & 73);
                    int i126 = (i124 & 73) << 1;
                    i13 = (i125 & i126) + (i126 | i125);
                    f54595d = i13 % 128;
                }
                int i127 = i13 % 2;
                return Boolean.FALSE;
            case 9:
                bdt bdtVar8 = (bdt) objArr[0];
                int i128 = f54594c;
                int i129 = i128 & 95;
                int i130 = ((i128 | 95) & (~i129)) + (i129 << 1);
                f54595d = i130 % 128;
                int i131 = i130 % 2;
                int i132 = bdtVar8.f54597b;
                if (i131 == 0) {
                    int i133 = 37 / 0;
                }
                return Integer.valueOf(i132);
            case 10:
                bdt bdtVar9 = (bdt) objArr[0];
                int i134 = f54594c;
                int i135 = (i134 ^ 27) + ((i134 & 27) << 1);
                f54595d = i135 % 128;
                int i136 = i135 % 2;
                int i137 = bdtVar9.f54597b;
                byte[] bArr = (byte[]) bea.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(i137)}, 1963840984, -1963840981, i137);
                int i138 = f54595d + 43;
                f54594c = i138 % 128;
                if (i138 % 2 == 0) {
                    return bArr;
                }
                int i139 = 18 / 0;
                return bArr;
            case 11:
                int iIntValue9 = ((Number) objArr[0]).intValue();
                int i140 = f54595d;
                int i141 = i140 ^ 115;
                int i142 = -(-((i140 & 115) << 1));
                int i143 = ((i141 | i142) << 1) - (i141 ^ i142);
                int i144 = i143 % 128;
                f54594c = i144;
                if (i143 % 2 != 0) {
                    int i145 = 48 / 0;
                    if (iIntValue9 == 0) {
                        i14 = ((i140 & 27) - (~(i140 | 27))) - 1;
                        i15 = i14 % 128;
                        f54594c = i15;
                        if (i14 % 2 == 0) {
                            throw null;
                        }
                        int i146 = i15 & 89;
                        int i147 = (i15 ^ 89) | i146;
                        int i148 = (i146 & i147) + (i146 | i147);
                        f54595d = i148 % 128;
                        int i149 = i148 % 2;
                    } else {
                        if (((byte) (iIntValue9 & 1)) == 1) {
                            int i150 = (i144 & 33) + (i144 | 33);
                            f54595d = i150 % 128;
                            int i151 = i150 % 2;
                            int i152 = ((i144 ^ 13) | (i144 & 13)) << 1;
                            int i153 = -((i144 & (-14)) | ((~i144) & 13));
                            int i154 = (i152 ^ i153) + ((i152 & i153) << 1);
                            f54595d = i154 % 128;
                            int i155 = i154 % 2;
                            str = "1";
                        }
                        i16 = iIntValue9 >>> 1;
                        int i156 = f54595d;
                        int i157 = ((i156 ^ 19) | (i156 & 19)) << 1;
                        int i158 = -(((~i156) & 19) | (i156 & (-20)));
                        int i159 = (i157 & i158) + (i158 | i157);
                        f54594c = i159 % 128;
                        int i160 = i159 % 2;
                        string = str;
                        i17 = 1;
                        while (i16 != 0) {
                            int i161 = f54595d + 91;
                            f54594c = i161 % 128;
                            int i162 = i161 % 2;
                            if (((byte) (i16 & 1)) == 1) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(string);
                                sb3.append("+x^");
                                sb3.append(i17);
                                string = sb3.toString();
                                int i163 = f54594c;
                                int i164 = i163 ^ 3;
                                int i165 = (i163 & 3) << 1;
                                int i166 = (i164 ^ i165) + ((i165 & i164) << 1);
                                f54595d = i166 % 128;
                                int i167 = i166 % 2;
                            }
                            i16 >>>= 1;
                            i17++;
                            int i168 = f54595d;
                            int i169 = ((i168 ^ 119) | (i168 & 119)) << 1;
                            int i170 = -(((~i168) & 119) | (i168 & (-120)));
                            int i171 = (i169 & i170) + (i170 | i169);
                            f54594c = i171 % 128;
                            int i172 = i171 % 2;
                        }
                    }
                } else if (iIntValue9 == 0) {
                    i14 = ((i140 & 27) - (~(i140 | 27))) - 1;
                    i15 = i14 % 128;
                    f54594c = i15;
                    if (i14 % 2 == 0) {
                        throw null;
                    }
                    int i1410 = i15 & 89;
                    int i1411 = (i15 ^ 89) | i1410;
                    int i1412 = (i1410 & i1411) + (i1410 | i1411);
                    f54595d = i1412 % 128;
                    int i1413 = i1412 % 2;
                } else {
                    if (((byte) (iIntValue9 & 1)) == 1) {
                        int i1510 = (i144 & 33) + (i144 | 33);
                        f54595d = i1510 % 128;
                        int i1511 = i1510 % 2;
                        int i1512 = ((i144 ^ 13) | (i144 & 13)) << 1;
                        int i1513 = -((i144 & (-14)) | ((~i144) & 13));
                        int i1514 = (i1512 ^ i1513) + ((i1512 & i1513) << 1);
                        f54595d = i1514 % 128;
                        int i1515 = i1514 % 2;
                        str = "1";
                    }
                    i16 = iIntValue9 >>> 1;
                    int i1516 = f54595d;
                    int i1517 = ((i1516 ^ 19) | (i1516 & 19)) << 1;
                    int i1518 = -(((~i1516) & 19) | (i1516 & (-20)));
                    int i1519 = (i1517 & i1518) + (i1518 | i1517);
                    f54594c = i1519 % 128;
                    int i1610 = i1519 % 2;
                    string = str;
                    i17 = 1;
                    while (i16 != 0) {
                        int i1611 = f54595d + 91;
                        f54594c = i1611 % 128;
                        int i1612 = i1611 % 2;
                        if (((byte) (i16 & 1)) == 1) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(string);
                            sb4.append("+x^");
                            sb4.append(i17);
                            string = sb4.toString();
                            int i1613 = f54594c;
                            int i1614 = i1613 ^ 3;
                            int i1615 = (i1613 & 3) << 1;
                            int i1616 = (i1614 ^ i1615) + ((i1615 & i1614) << 1);
                            f54595d = i1616 % 128;
                            int i1617 = i1616 % 2;
                        }
                        i16 >>>= 1;
                        i17++;
                        int i1618 = f54595d;
                        int i1619 = ((i1618 ^ 119) | (i1618 & 119)) << 1;
                        int i173 = -(((~i1618) & 119) | (i1618 & (-120)));
                        int i174 = (i1619 & i173) + (i173 | i1619);
                        f54594c = i174 % 128;
                        int i175 = i174 % 2;
                    }
                }
                int i176 = f54594c + 47;
                f54595d = i176 % 128;
                int i177 = i176 % 2;
                return string;
            default:
                bdt bdtVar10 = (bdt) objArr[0];
                int iIntValue10 = ((Number) objArr[1]).intValue();
                int i178 = f54595d;
                int i179 = ((i178 & 30) + (i178 | 30)) - 1;
                int i180 = i179 % 128;
                f54594c = i180;
                if (i179 % 2 == 0 ? bdtVar10.f54596a != 31 : bdtVar10.f54596a != 123) {
                    if (iIntValue10 >= 0) {
                        int i181 = (((i180 & (-24)) | ((~i180) & 23)) - (~((i180 & 23) << 1))) - 1;
                        int i182 = i181 % 128;
                        f54595d = i182;
                        int i183 = i181 % 2;
                        if (iIntValue10 < (1 << bdtVar10.f54596a)) {
                            int i184 = (-2) - (((i182 & 106) + (i182 | 106)) ^ (-1));
                            f54594c = i184 % 128;
                            int i185 = i184 % 2;
                            int i186 = i182 & 107;
                            int i187 = (i186 - (~(-(-((i182 ^ 107) | i186))))) - 1;
                            f54594c = i187 % 128;
                            int i188 = i187 % 2;
                            return Boolean.TRUE;
                        }
                    }
                    int i189 = f54595d;
                    int i190 = (i189 & (-106)) | ((~i189) & 105);
                    int i191 = -(-((i189 & 105) << 1));
                    int i192 = (i190 & i191) + (i191 | i190);
                    f54594c = i192 % 128;
                    if (i192 % 2 != 0) {
                        int i193 = 83 / 0;
                    }
                    return Boolean.FALSE;
                }
                int i194 = ((i178 | 103) << 1) - (i178 ^ 103);
                f54594c = i194 % 128;
                if (i194 % 2 != 0) {
                    throw null;
                }
                if (iIntValue10 >= 0) {
                    int i195 = i178 & 31;
                    int i196 = (~i195) & (i178 | 31);
                    int i197 = i195 << 1;
                    int i198 = (i196 ^ i197) + ((i197 & i196) << 1);
                    f54594c = i198 % 128;
                    if (i198 % 2 != 0) {
                        int i199 = 34 / 0;
                    }
                    return Boolean.TRUE;
                }
                int i200 = ~iIntValue10;
                int i201 = (i200 | iIntValue10) & i200;
                int i202 = i201 ^ 1708715529;
                int i203 = i201 & 1708715529;
                int i204 = (i202 & i203) | (i202 ^ i203);
                int i205 = ~i204;
                int i206 = (i204 | i205) & i205;
                int i207 = (-674416893) ^ i206;
                int i208 = i206 & (-674416893);
                int i209 = -(-(((i208 & i207) | (i207 ^ i208)) * (-1042)));
                int i210 = 667855318 & i209;
                int i211 = -(-((i209 ^ 667855318) | i210));
                int i212 = (i210 ^ i211) + ((i211 & i210) << 1);
                int i213 = 1708715529 & iIntValue10;
                int i214 = (~i213) & (1708715529 | iIntValue10);
                int i215 = -(-(((i213 & i214) | (i214 ^ i213)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i216 = i212 & i215;
                int i217 = i216 + ((i215 ^ i212) | i216);
                int i218 = 674416892 & iIntValue10;
                int i219 = (674416892 | iIntValue10) & (~i218);
                int i220 = (i219 & i218) | (i219 ^ i218);
                int i221 = ~i220;
                int i222 = (i220 | i221) & i221;
                int i223 = 1170744833 & i222;
                int i224 = (i222 | 1170744833) & (~i223);
                int i225 = (i224 & i223) | (i224 ^ i223);
                int i226 = i200 & (-674416893);
                int i227 = ((-674416893) | i200) & (~i226);
                int i228 = (i227 & i226) | (i227 ^ i226);
                int i229 = ((-1708715530) & i228) | ((~i228) & 1708715529);
                int i230 = 1708715529 & i228;
                int i231 = ~((i230 & i229) | (i229 ^ i230));
                int i232 = i225 ^ i231;
                int i233 = i231 & i225;
                int i234 = -(-(((i233 & i232) | (i232 ^ i233)) * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY));
                int i235 = ((((~i234) & i217) | ((~i217) & i234)) - (~(-(-((i234 & i217) << 1))))) - 1;
                int i236 = ~((iIntValue10 & (-362538170)) | ((-362538170) & i200) | (iIntValue10 & 362538169));
                int i237 = 336757913 ^ i236;
                int i238 = i236 & 336757913;
                int i239 = (i238 & i237) | (i237 ^ i238);
                int i240 = i200 ^ (-596473895);
                int i241 = i200 & (-596473895);
                int i242 = (i240 & i241) | (i240 ^ i241);
                int i243 = ~((i242 & 362538169) | (i242 ^ 362538169));
                int i244 = ((~i243) & i239) | ((~i239) & i243);
                int i245 = i239 & i243;
                int i246 = -(-(((i245 & i244) | (i244 ^ i245)) * 886));
                int i247 = (((~i246) & 290006616) | ((-290006617) & i246)) + ((i246 & 290006616) << 1);
                int i248 = ~((i200 ^ 362538169) | (i200 & 362538169));
                int i249 = (-596473895) & i248;
                int i250 = (i248 | (-596473895)) & (~i249);
                int i251 = -(~(-(-(((i250 & i249) | (i250 ^ i249)) * (-1772)))));
                int i252 = (-2) - (((i247 & i251) + (i251 | i247)) ^ (-1));
                int i253 = i201 & (-596473895);
                int i254 = (i201 | (-596473895)) & (~i253);
                if (i235 <= (i252 - (~((~((i253 & i254) | (i254 ^ i253))) * 886))) - 1) {
                    throw null;
                }
                return Boolean.FALSE;
        }
    }

    public final boolean equals(Object obj) {
        return ((Boolean) setX(new Object[]{this, obj}, -560404733, 560404741, System.identityHashCode(this))).booleanValue();
    }

    public final int hashCode() {
        return ((Integer) setX(new Object[]{this}, 1317580576, -1317580567, System.identityHashCode(this))).intValue();
    }

    public final int setCompoundDrawableTintBlendMode(int i10) {
        return ((Integer) setX(new Object[]{this, Integer.valueOf(i10)}, 2104839888, -2104839886, i10)).intValue();
    }

    public final String setDividerPadding(int i10) {
        return (String) setX(new Object[]{this, Integer.valueOf(i10)}, 1140470754, -1140470751, i10);
    }

    public final int setOnFocusChangeListener(int i10, int i11) {
        return ((Integer) setX(new Object[]{this, Integer.valueOf(i10), Integer.valueOf(i11)}, 1119876470, -1119876464, i10)).intValue();
    }

    public final boolean setY(int i10) {
        return ((Boolean) setX(new Object[]{this, Integer.valueOf(i10)}, 704366847, -704366847, i10)).booleanValue();
    }

    public final String toString() {
        return (String) setX(new Object[]{this}, 741093183, -741093176, System.identityHashCode(this));
    }

    public static int setY(int i10, int i11) {
        return ((Integer) setX(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, -1259450993, 1259450997, i10)).intValue();
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -1008508006, 1008508016, System.identityHashCode(this));
    }

    public final int setX() {
        return ((Integer) setX(new Object[]{this}, -2076948404, 2076948405, System.identityHashCode(this))).intValue();
    }
}
