package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class beg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f54631e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f54632f = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bdt f54633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bdz f54634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bdz[] f54635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bdz[] f54636d;

    public beg(bdt bdtVar, bdz bdzVar) {
        this.f54633a = bdtVar;
        this.f54634b = bdzVar;
        setCompoundDrawableTintBlendMode(new Object[]{this}, 427692750, -427692749, System.identityHashCode(this));
        setCompoundDrawableTintBlendMode(new Object[]{this}, 632513027, -632513025, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x021f  */
    /* JADX WARN: Code duplicated, block: B:29:0x023b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0253  */
    /* JADX WARN: Code duplicated, block: B:32:0x0258  */
    /* JADX WARN: Code duplicated, block: B:34:0x0264  */
    /* JADX WARN: Code duplicated, block: B:36:0x0273  */
    /* JADX WARN: Code duplicated, block: B:38:0x028d  */
    /* JADX WARN: Code duplicated, block: B:39:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x030b A[SYNTHETIC] */
    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        Object obj;
        int iIntValue;
        int i13;
        bdt bdtVar;
        int i14;
        int i15;
        boolean z10;
        int i16;
        int i17 = ~i10;
        int i18 = ((~(i11 | i17)) * 381) + (((~(i10 | i11)) | (~((~i12) | i11)) | (~((~i11) | i17))) * 381) + ((i11 | i12 | i17) * (-381)) + (i11 * 382) + (i10 * (-380));
        if (i18 == 1) {
            obj = null;
            beg begVar = (beg) objArr[0];
            int i19 = f54631e;
            int i20 = (i19 & (-74)) | ((~i19) & 73);
            int i21 = (i19 & 73) << 1;
            int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
            f54632f = i22 % 128;
            if (i22 % 2 == 0) {
                bdz bdzVar = begVar.f54634b;
                iIntValue = ((Integer) bdz.setDividerPadding(new Object[]{bdzVar}, 1803293290, -1803293286, System.identityHashCode(bdzVar))).intValue();
                begVar.f54635c = new bdz[iIntValue];
            } else {
                bdz bdzVar2 = begVar.f54634b;
                iIntValue = ((Integer) bdz.setDividerPadding(new Object[]{bdzVar2}, 1803293290, -1803293286, System.identityHashCode(bdzVar2))).intValue();
                begVar.f54635c = new bdz[iIntValue];
            }
            int i23 = f54631e;
            int i24 = (i23 ^ 63) + ((i23 & 63) << 1);
            f54632f = i24 % 128;
            int i25 = i24 % 2;
            int i26 = 0;
            while (true) {
                i13 = iIntValue >> 1;
                if (i26 >= i13) {
                    break;
                }
                int i27 = i26 << 1;
                int iIdentityHashCode = System.identityHashCode(begVar);
                int i28 = -(-(i27 * (-55)));
                int i29 = (-55) & i28;
                int i30 = (((-55) ^ i28) | i29) << 1;
                int i31 = -((i28 | (-55)) & (~i29));
                int i32 = (i30 & i31) + (i31 | i30);
                int i33 = iIdentityHashCode ^ 1;
                int i34 = ~iIdentityHashCode;
                int i35 = iIdentityHashCode & 1;
                int i36 = ~((i35 & i33) | (i33 ^ i35));
                int i37 = -(~(-(-(((i36 & i27) | ((~i36) & i27) | ((~i27) & i36)) * 56))));
                int i38 = (i32 & i37) + (i37 | i32);
                int i39 = (i38 ^ (-1)) + (i38 << 1);
                int i40 = i27 ^ 1;
                int i41 = i27 & 1;
                int i42 = -(-((~((i40 & i41) | (i40 ^ i41))) * (-56)));
                int i43 = i39 & i42;
                int i44 = i43 + ((i39 ^ i42) | i43);
                int i45 = ~(i34 | i27);
                int i46 = i45 & 1;
                int i47 = (i45 | 1) & (~i46);
                int i48 = ((i47 & i46) | (i47 ^ i46)) * 56;
                int[] iArr = new int[(((i44 ^ i48) | (i44 & i48)) << 1) - ((i48 & (~i44)) | ((~i48) & i44))];
                iArr[i27] = 1;
                begVar.f54635c[i26] = new bdz(begVar.f54633a, iArr);
                i26++;
                int i49 = f54631e;
                int i50 = i49 & 13;
                int i51 = ((i49 ^ 13) | i50) << 1;
                int i52 = -((i49 | 13) & (~i50));
                int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                f54632f = i53 % 128;
                int i54 = i53 % 2;
            }
            int i55 = f54631e + 108;
            int i56 = (i55 ^ (-1)) + (i55 << 1);
            f54632f = i56 % 128;
            int i57 = i56 % 2;
            while (i13 < iIntValue) {
                int i58 = i13 << 1;
                int[] iArr2 = new int[i58 + 1];
                iArr2[i58] = 1;
                bdz bdzVar3 = new bdz(begVar.f54633a, iArr2);
                begVar.f54635c[i13] = (bdz) bdz.setDividerPadding(new Object[]{bdzVar3, begVar.f54634b}, 1699950918, -1699950918, System.identityHashCode(bdzVar3));
                int i59 = i13 & 1;
                int i60 = ((i13 ^ 1) | i59) << 1;
                int i61 = -((i13 | 1) & (~i59));
                i13 = (i60 & i61) + (i60 | i61);
                int i62 = f54631e + 37;
                f54632f = i62 % 128;
                int i63 = i62 % 2;
            }
            int i64 = (-2) - ((f54632f + 70) ^ (-1));
            f54631e = i64 % 128;
            if (i64 % 2 != 0) {
                int i65 = 5 / 0;
            }
        } else {
            if (i18 != 2) {
                if (i18 != 3) {
                    beg begVar2 = (beg) objArr[0];
                    int i66 = f54631e;
                    int i67 = i66 & 113;
                    int i68 = (((i66 ^ 113) | i67) << 1) - ((~i67) & (i66 | 113));
                    f54632f = i68 % 128;
                    int i69 = i68 % 2;
                    bdz[] bdzVarArr = begVar2.f54636d;
                    int i70 = (i66 ^ 79) + ((i66 & 79) << 1);
                    f54632f = i70 % 128;
                    if (i70 % 2 != 0) {
                        return bdzVarArr;
                    }
                    throw null;
                }
                bdz[] bdzVarArr2 = (bdz[]) objArr[0];
                int iIntValue2 = ((Number) objArr[1]).intValue();
                int iIntValue3 = ((Number) objArr[2]).intValue();
                int i71 = f54632f;
                int i72 = ((((i71 ^ 61) | (i71 & 61)) << 1) - (~(-(((~i71) & 61) | (i71 & (-62)))))) - 1;
                int i73 = i72 % 128;
                f54631e = i73;
                int i74 = i72 % 2;
                bdz bdzVar4 = bdzVarArr2[iIntValue2];
                bdzVarArr2[iIntValue2] = bdzVarArr2[iIntValue3];
                bdzVarArr2[iIntValue3] = bdzVar4;
                int i75 = i73 + 97;
                f54632f = i75 % 128;
                int i76 = i75 % 2;
                return null;
            }
            beg begVar3 = (beg) objArr[0];
            int i77 = f54632f;
            int i78 = i77 & 109;
            int i79 = -(-(i77 | 109));
            int i80 = (i78 ^ i79) + ((i79 & i78) << 1);
            f54631e = i80 % 128;
            int i81 = i80 % 2;
            bdz bdzVar5 = begVar3.f54634b;
            int iIntValue4 = ((Integer) bdz.setDividerPadding(new Object[]{bdzVar5}, 1803293290, -1803293286, System.identityHashCode(bdzVar5))).intValue();
            bdz[] bdzVarArr3 = new bdz[iIntValue4];
            int iIdentityHashCode2 = System.identityHashCode(begVar3);
            int i82 = -(-(iIntValue4 * 46));
            int i83 = (((((-46) ^ i82) | ((-46) & i82)) << 1) - (~(-(((~i82) & (-46)) | (i82 & 45))))) - 1;
            int i84 = ~iIntValue4;
            int i85 = ~iIdentityHashCode2;
            int i86 = (i85 | iIdentityHashCode2) & i85;
            int i87 = i84 & i86;
            int i88 = (~i87) & (i86 | i84);
            int i89 = (i88 & i87) | (i88 ^ i87);
            int i90 = ~i89;
            int i91 = ~i90;
            int i92 = ((i91 ^ i90) | (i90 & i91)) * (-90);
            int i93 = i83 & i92;
            int i94 = i93 + ((i83 ^ i92) | i93);
            int i95 = i84 & iIdentityHashCode2;
            int i96 = (~i95) & (i84 | iIdentityHashCode2);
            int i97 = ~((i96 & i95) | (i96 ^ i95));
            int i98 = (-1) ^ iIntValue4;
            int i99 = ~((i98 ^ iIntValue4) | (i98 & iIntValue4));
            int i100 = i97 ^ i99;
            int i101 = i97 & i99;
            int i102 = ((i101 & i100) | (i100 ^ i101)) * (-45);
            int i103 = ((i94 ^ i102) | (i94 & i102)) << 1;
            int i104 = -((i102 & (~i94)) | ((~i102) & i94));
            int i105 = (i103 & i104) + (i104 | i103);
            int i106 = ~i85;
            int i107 = ~((i106 & i85) | (i106 ^ i85));
            int i108 = i89 & i107;
            int i109 = (i107 | i89) & (~i108);
            int i110 = -(-(((i109 & i108) | (i109 ^ i108)) * 45));
            int i111 = ((~i110) & i105) | ((~i105) & i110);
            int i112 = -(-((i110 & i105) << 1));
            int i113 = (i111 ^ i112) + ((i112 & i111) << 1);
            int i114 = f54631e;
            int i115 = (i114 & (-64)) | ((~i114) & 63);
            int i116 = -(-((i114 & 63) << 1));
            int i117 = (i115 & i116) + (i116 | i115);
            f54632f = i117 % 128;
            int i118 = i117 % 2;
            while (i113 >= 0) {
                bdzVarArr3[i113] = new bdz(begVar3.f54635c[i113]);
                i113 = (i113 ^ (-85)) + ((i113 & (-85)) << 1) + 84;
                int i119 = f54631e;
                int i120 = i119 & 61;
                int i121 = (i119 | 61) & (~i120);
                int i122 = -(-(i120 << 1));
                int i123 = (i121 ^ i122) + ((i121 & i122) << 1);
                f54632f = i123 % 128;
                int i124 = i123 % 2;
            }
            begVar3.f54636d = new bdz[iIntValue4];
            int i125 = -(-(i98 | iIntValue4));
            int i126 = ((iIntValue4 | i125) << 1) - (i125 ^ iIntValue4);
            int i127 = f54632f;
            int i128 = (i127 ^ 69) + ((i127 & 69) << 1);
            f54631e = i128 % 128;
            int i129 = i128 % 2;
            while (true) {
                bdtVar = begVar3.f54633a;
                if (i126 < 0) {
                    break;
                }
                begVar3.f54636d[i126] = new bdz(bdtVar, i126);
                int i130 = -(~i126);
                i126 = ((-2) & i130) + (i130 | (-2));
                int i131 = f54631e;
                int i132 = i131 ^ 5;
                int i133 = ((i131 & 5) | i132) << 1;
                int i134 = -i132;
                int i135 = ((i133 | i134) << 1) - (i133 ^ i134);
                f54632f = i135 % 128;
                int i136 = i135 % 2;
            }
            int i137 = f54632f;
            int i138 = (i137 & (-76)) | ((~i137) & 75);
            int i139 = (i137 & 75) << 1;
            int i140 = (i138 ^ i139) + ((i139 & i138) << 1);
            f54631e = i140 % 128;
            int i141 = i140 % 2;
            int i142 = 0;
            while (i142 < iIntValue4) {
                int i143 = f54631e;
                int i144 = i143 & 7;
                int i145 = -(-(i143 | 7));
                int i146 = (i144 & i145) + (i145 | i144);
                f54632f = i146 % 128;
                int i147 = 1470802737;
                if (i146 % 2 == 0) {
                    int i148 = 88 / 0;
                    if (((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i142], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue() == 0) {
                        int i149 = f54631e;
                        int i150 = (i149 | 105) << 1;
                        int i151 = -(((~i149) & 105) | (i149 & (-106)));
                        i14 = ((i150 | i151) << 1) - (i151 ^ i150);
                        f54632f = i14 % 128;
                        if (i14 % 2 == 0) {
                            i15 = i142 % 0;
                            z10 = true;
                        } else {
                            int i152 = i142 & 1;
                            i15 = (i152 - (~((i142 ^ 1) | i152))) - 1;
                            z10 = false;
                        }
                        while (i15 < iIntValue4) {
                            int i153 = f54632f + 28;
                            i16 = (i153 ^ (-1)) + (i153 << 1);
                            f54631e = i16 % 128;
                            if (i16 % 2 == 0) {
                                ((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i15], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue();
                                throw null;
                            }
                            if (((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i15], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue() != 0) {
                                int i154 = f54632f;
                                int i155 = i154 ^ 23;
                                int i156 = (i154 & 23) << 1;
                                int i157 = (i155 & i156) + (i156 | i155);
                                f54631e = i157 % 128;
                                int i158 = i157 % 2;
                                setCompoundDrawableTintBlendMode(new Object[]{bdzVarArr3, Integer.valueOf(i142), Integer.valueOf(i15)}, -1711929099, 1711929102, i142);
                                setCompoundDrawableTintBlendMode(new Object[]{begVar3.f54636d, Integer.valueOf(i142), Integer.valueOf(i15)}, -1711929099, 1711929102, i142);
                                System.identityHashCode(begVar3);
                                System.identityHashCode(begVar3);
                                i15 = iIntValue4;
                                z10 = true;
                            }
                            int i159 = i15 - 99;
                            i15 = ((i159 | 100) << 1) - (i159 ^ 100);
                            int i160 = f54632f + 33;
                            f54631e = i160 % 128;
                            int i161 = i160 % 2;
                        }
                        if (!z10) {
                            throw new ArithmeticException("Squaring matrix is not invertible.");
                        }
                    }
                } else if (((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i142], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue() == 0) {
                    int i1410 = f54631e;
                    int i1510 = (i1410 | 105) << 1;
                    int i1511 = -(((~i1410) & 105) | (i1410 & (-106)));
                    i14 = ((i1510 | i1511) << 1) - (i1511 ^ i1510);
                    f54632f = i14 % 128;
                    if (i14 % 2 == 0) {
                        i15 = i142 % 0;
                        z10 = true;
                    } else {
                        int i1512 = i142 & 1;
                        i15 = (i1512 - (~((i142 ^ 1) | i1512))) - 1;
                        z10 = false;
                    }
                    while (i15 < iIntValue4) {
                        int i1513 = f54632f + 28;
                        i16 = (i1513 ^ (-1)) + (i1513 << 1);
                        f54631e = i16 % 128;
                        if (i16 % 2 == 0) {
                            ((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i15], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue();
                            throw null;
                        }
                        if (((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i15], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue() != 0) {
                            int i1514 = f54632f;
                            int i1515 = i1514 ^ 23;
                            int i1516 = (i1514 & 23) << 1;
                            int i1517 = (i1515 & i1516) + (i1516 | i1515);
                            f54631e = i1517 % 128;
                            int i1518 = i1517 % 2;
                            setCompoundDrawableTintBlendMode(new Object[]{bdzVarArr3, Integer.valueOf(i142), Integer.valueOf(i15)}, -1711929099, 1711929102, i142);
                            setCompoundDrawableTintBlendMode(new Object[]{begVar3.f54636d, Integer.valueOf(i142), Integer.valueOf(i15)}, -1711929099, 1711929102, i142);
                            System.identityHashCode(begVar3);
                            System.identityHashCode(begVar3);
                            i15 = iIntValue4;
                            z10 = true;
                        }
                        int i1519 = i15 - 99;
                        i15 = ((i1519 | 100) << 1) - (i1519 ^ 100);
                        int i162 = f54632f + 33;
                        f54631e = i162 % 128;
                        int i163 = i162 % 2;
                    }
                    if (!z10) {
                        throw new ArithmeticException("Squaring matrix is not invertible.");
                    }
                }
                int iIntValue5 = ((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i142], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue();
                int iIntValue6 = ((Integer) bdt.setX(new Object[]{bdtVar, Integer.valueOf(iIntValue5)}, 2104839888, -2104839886, iIntValue5)).intValue();
                bdz.setDividerPadding(new Object[]{bdzVarArr3[i142], Integer.valueOf(iIntValue6)}, -1103206351, 1103206362, iIntValue6);
                bdz.setDividerPadding(new Object[]{begVar3.f54636d[i142], Integer.valueOf(iIntValue6)}, -1103206351, 1103206362, iIntValue6);
                int i164 = f54632f;
                int i165 = ((i164 ^ 55) | (i164 & 55)) << 1;
                int i166 = -(((~i164) & 55) | (i164 & (-56)));
                int i167 = (i165 ^ i166) + ((i166 & i165) << 1);
                f54631e = i167 % 128;
                int i168 = i167 % 2;
                int i169 = 0;
                while (i169 < iIntValue4) {
                    int i170 = f54631e;
                    int i171 = i170 & 39;
                    int i172 = i170 ^ 39;
                    int i173 = -(-(i172 | i171));
                    int i174 = (i171 ^ i173) + ((i173 & i171) << 1);
                    f54632f = i174 % 128;
                    int i175 = i174 % 2;
                    if (i169 != i142) {
                        int i176 = i172 + (i171 << 1);
                        f54632f = i176 % 128;
                        if (i176 % 2 == 0) {
                            ((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i169], Integer.valueOf(i142)}, -1470802724, 1470802737, i142)).intValue();
                            throw null;
                        }
                        int iIntValue7 = ((Integer) bdz.setDividerPadding(new Object[]{bdzVarArr3[i169], Integer.valueOf(i142)}, -1470802724, i147, i142)).intValue();
                        if (iIntValue7 != 0) {
                            bdz bdzVar6 = (bdz) bdz.setDividerPadding(new Object[]{bdzVarArr3[i142], Integer.valueOf(iIntValue7)}, -20767297, 20767299, iIntValue7);
                            bdz bdzVar7 = (bdz) bdz.setDividerPadding(new Object[]{begVar3.f54636d[i142], Integer.valueOf(iIntValue7)}, -20767297, 20767299, iIntValue7);
                            bdz bdzVar8 = bdzVarArr3[i169];
                            bdz.setDividerPadding(new Object[]{bdzVar8, bdzVar6}, 1560654763, -1560654747, System.identityHashCode(bdzVar8));
                            bdz bdzVar9 = begVar3.f54636d[i169];
                            bdz.setDividerPadding(new Object[]{bdzVar9, bdzVar7}, 1560654763, -1560654747, System.identityHashCode(bdzVar9));
                            int i177 = f54631e;
                            int i178 = (-2) - (((i177 & 126) + (i177 | 126)) ^ (-1));
                            f54632f = i178 % 128;
                            int i179 = i178 % 2;
                            i147 = 1470802737;
                        }
                    }
                    int i180 = (((i169 ^ 122) | (i169 & 122)) << 1) - (((~i169) & 122) | (i169 & (-123)));
                    int i181 = i180 & (-121);
                    i169 = (((i180 | (-121)) & (~i181)) - (~(-(-(i181 << 1))))) - 1;
                    int i182 = f54632f + 43;
                    f54631e = i182 % 128;
                    int i183 = i182 % 2;
                }
                int i184 = i142 & 1;
                int i185 = (i142 | 1) & (~i184);
                int i186 = i184 << 1;
                i142 = ((i185 | i186) << 1) - (i186 ^ i185);
                int i187 = f54632f;
                int i188 = i187 ^ 35;
                int i189 = (((i187 & 35) | i188) << 1) - i188;
                f54631e = i189 % 128;
                int i190 = i189 % 2;
            }
            obj = null;
            int i191 = f54631e;
            int i192 = (i191 & (-70)) | ((~i191) & 69);
            int i193 = -(-((i191 & 69) << 1));
            int i194 = ((i192 | i193) << 1) - (i193 ^ i192);
            f54632f = i194 % 128;
            int i195 = i194 % 2;
        }
        return obj;
    }

    public final bdz[] setDividerPadding() {
        return (bdz[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 2136519579, -2136519579, System.identityHashCode(this));
    }
}
