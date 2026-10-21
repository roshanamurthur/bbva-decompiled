package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afv extends aed {
    public static int E0 = 1;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52606y0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f52607x0;

    public afv(add[] addVarArr) {
        super(addVarArr);
        this.f52607x0 = -1;
    }

    public static /* synthetic */ afv l(Object[] objArr) {
        aed aedVar = (aed) objArr[0];
        int i10 = f52606y0;
        int i11 = i10 & 119;
        int i12 = (i10 ^ 119) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        E0 = i13 % 128;
        int i14 = i13 % 2;
        afv afvVar = (afv) aedVar.e();
        if (i14 != 0) {
            return afvVar;
        }
        throw null;
    }

    public static /* synthetic */ afv m(Object[] objArr) {
        afv afvVar = (afv) objArr[0];
        int i10 = f52606y0;
        int i11 = i10 ^ 23;
        int i12 = -(-((i10 & 23) << 1));
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        int i14 = i13 % 128;
        E0 = i14;
        int i15 = i13 % 2;
        int i16 = i14 + 49;
        f52606y0 = i16 % 128;
        if (i16 % 2 == 0) {
            return afvVar;
        }
        throw null;
    }

    public static /* synthetic */ Integer n(Object[] objArr) {
        int iIntValue;
        afv afvVar = (afv) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i10 = f52606y0;
        int i11 = i10 & 97;
        int i12 = -(-((i10 ^ 97) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        E0 = i13 % 128;
        if (i13 % 2 == 0) {
            int iIntValue2 = ((Integer) setDividerPadding(new Object[]{afvVar}, -459398468, 459398477, System.identityHashCode(afvVar))).intValue();
            iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue2)}, 1150803379, -1150803367, iIntValue2)).intValue();
            int i14 = 90 / 0;
        } else {
            int iIntValue3 = ((Integer) setDividerPadding(new Object[]{afvVar}, -459398468, 459398477, System.identityHashCode(afvVar))).intValue();
            iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue3)}, 1150803379, -1150803367, iIntValue3)).intValue();
        }
        return Integer.valueOf(iIntValue);
    }

    public static /* synthetic */ afv o(Object[] objArr) {
        afv afvVar = (afv) objArr[0];
        int i10 = (-2) - ((E0 + 110) ^ (-1));
        f52606y0 = i10 % 128;
        if (i10 % 2 == 0) {
            return afvVar;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x01a8 A[PHI: r11 r13
      0x01a8: PHI (r11v28 com.mypinpad.tsdk.i.o0) = (r11v27 com.mypinpad.tsdk.i.o0), (r11v41 com.mypinpad.tsdk.i.o0) binds: [B:26:0x01a6, B:23:0x0187] A[DONT_GENERATE, DONT_INLINE]
      0x01a8: PHI (r13v15 int A[IMMUTABLE_TYPE]) = (r13v14 int), (r13v18 int) binds: [B:26:0x01a6, B:23:0x0187] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x01cf A[LOOP:2: B:36:0x01cd->B:37:0x01cf, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x023b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x024c A[SYNTHETIC] */
    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException {
        o0 o0VarL;
        int length;
        int i13;
        int i14;
        ady[] adyVarArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19 = (i11 * 334) + (i10 * (-665));
        int i20 = ~i10;
        int i21 = (i20 * (-333)) + i19;
        int i22 = ~i12;
        int i23 = (((~(i20 | i12)) | (~(i11 | i22))) * 333) + (((~(i20 | i22)) | (~(i11 | i12))) * 333) + i21;
        int i24 = 0;
        switch (i23) {
            case 1:
                ago agoVar = new ago(((afv) objArr[0]).k());
                int i25 = E0;
                int i26 = ((i25 & 57) - (~(-(-(i25 | 57))))) - 1;
                f52606y0 = i26 % 128;
                int i27 = i26 % 2;
                return agoVar;
            case 2:
                afk afkVar = new afk((byte[]) aev.setX(new Object[]{((afv) objArr[0]).f()}, 573205290, -573205287, (int) System.currentTimeMillis()));
                int i28 = E0;
                int i29 = i28 & 119;
                int i30 = ((i28 ^ 119) | i29) << 1;
                int i31 = -((i28 | 119) & (~i29));
                int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
                f52606y0 = i32 % 128;
                int i33 = i32 % 2;
                return afkVar;
            case 3:
                return m(objArr);
            case 4:
                afv afvVar = (afv) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
                int i34 = E0;
                int i35 = (i34 ^ 125) + ((i34 & 125) << 1);
                f52606y0 = i35 % 128;
                Object[] objArr2 = new Object[3];
                if (i35 % 2 != 0) {
                    objArr2[0] = aebVar;
                    objArr2[1] = Boolean.valueOf(zBooleanValue);
                    objArr2[2] = 13;
                    aeb.setX(objArr2, 1303469841, -1303469839, 13);
                    o0VarL = aebVar.l();
                    length = afvVar.f52530t0.length;
                    if (afvVar.f52607x0 < 0) {
                        i13 = E0;
                        i14 = (i13 & 11) + (i13 | 11);
                        f52606y0 = i14 % 128;
                        if (i14 % 2 != 0 ? length <= 16 : length <= 49) {
                            adyVarArr = new ady[length];
                            int i36 = i13 + 55;
                            f52606y0 = i36 % 128;
                            int i37 = i36 % 2;
                            i15 = 0;
                            i16 = 0;
                            while (i15 < length) {
                                int i38 = E0;
                                int i39 = i38 & 35;
                                int i40 = ((i38 ^ 35) | i39) << 1;
                                int i41 = -((i38 | 35) & (~i39));
                                int i42 = (i40 & i41) + (i41 | i40);
                                f52606y0 = i42 % 128;
                                int i43 = i42 % 2;
                                ady adyVarE = afvVar.f52530t0[i15].UiMessageCallbackKtWhenMappings().e();
                                adyVarArr[i15] = adyVarE;
                                int i44 = -(-adyVarE.b(true));
                                i16 = ((i16 | i44) << 1) - (i16 ^ i44);
                                i15++;
                                int i45 = f52606y0;
                                int i46 = ((i45 ^ 121) | (i45 & 121)) << 1;
                                int i47 = -(((~i45) & 121) | (i45 & (-122)));
                                int i48 = (i46 & i47) + (i47 | i46);
                                E0 = i48 % 128;
                                int i49 = i48 % 2;
                            }
                            afvVar.f52607x0 = i16;
                            aeb.setX(new Object[]{aebVar, Integer.valueOf(i16)}, 1357165778, -1357165764, i16);
                            int i50 = E0;
                            int i51 = i50 & 59;
                            int i52 = i50 | 59;
                            int i53 = (i51 ^ i52) + ((i52 & i51) << 1);
                            f52606y0 = i53 % 128;
                            int i54 = i53 % 2;
                            while (i24 < length) {
                                int i55 = E0;
                                int i56 = i55 & 113;
                                i18 = (i56 - (~((i55 ^ 113) | i56))) - 1;
                                f52606y0 = i18 % 128;
                                if (i18 % 2 != 0) {
                                    adyVarArr[i24].c(o0VarL, true);
                                    i24 += 50;
                                } else {
                                    adyVarArr[i24].c(o0VarL, true);
                                    int i57 = ((i24 ^ 62) + ((i24 & 62) << 1)) - 1;
                                    i24 = (i57 ^ (-60)) + ((i57 & (-60)) << 1);
                                }
                            }
                            int i58 = f52606y0;
                            int i59 = i58 & 25;
                            i17 = (i59 - (~(-(-((i58 ^ 25) | i59))))) - 1;
                        }
                    }
                    E0 = i17 % 128;
                    int i60 = i17 % 2;
                    return null;
                }
                objArr2[0] = aebVar;
                objArr2[1] = Boolean.valueOf(zBooleanValue);
                objArr2[2] = 48;
                aeb.setX(objArr2, 1303469841, -1303469839, 48);
                o0VarL = aebVar.l();
                length = afvVar.f52530t0.length;
                if (afvVar.f52607x0 < 0) {
                    i13 = E0;
                    i14 = (i13 & 11) + (i13 | 11);
                    f52606y0 = i14 % 128;
                    if (i14 % 2 != 0) {
                        adyVarArr = new ady[length];
                        int i310 = i13 + 55;
                        f52606y0 = i310 % 128;
                        int i311 = i310 % 2;
                        i15 = 0;
                        i16 = 0;
                        while (i15 < length) {
                            int i312 = E0;
                            int i313 = i312 & 35;
                            int i410 = ((i312 ^ 35) | i313) << 1;
                            int i411 = -((i312 | 35) & (~i313));
                            int i412 = (i410 & i411) + (i411 | i410);
                            f52606y0 = i412 % 128;
                            int i413 = i412 % 2;
                            ady adyVarE2 = afvVar.f52530t0[i15].UiMessageCallbackKtWhenMappings().e();
                            adyVarArr[i15] = adyVarE2;
                            int i414 = -(-adyVarE2.b(true));
                            i16 = ((i16 | i414) << 1) - (i16 ^ i414);
                            i15++;
                            int i415 = f52606y0;
                            int i416 = ((i415 ^ 121) | (i415 & 121)) << 1;
                            int i417 = -(((~i415) & 121) | (i415 & (-122)));
                            int i418 = (i416 & i417) + (i417 | i416);
                            E0 = i418 % 128;
                            int i419 = i418 % 2;
                        }
                        afvVar.f52607x0 = i16;
                        aeb.setX(new Object[]{aebVar, Integer.valueOf(i16)}, 1357165778, -1357165764, i16);
                        int i510 = E0;
                        int i511 = i510 & 59;
                        int i512 = i510 | 59;
                        int i513 = (i511 ^ i512) + ((i512 & i511) << 1);
                        f52606y0 = i513 % 128;
                        int i514 = i513 % 2;
                        while (i24 < length) {
                            int i515 = E0;
                            int i516 = i515 & 113;
                            i18 = (i516 - (~((i515 ^ 113) | i516))) - 1;
                            f52606y0 = i18 % 128;
                            if (i18 % 2 != 0) {
                                adyVarArr[i24].c(o0VarL, true);
                                i24 += 50;
                            } else {
                                adyVarArr[i24].c(o0VarL, true);
                                int i517 = ((i24 ^ 62) + ((i24 & 62) << 1)) - 1;
                                i24 = (i517 ^ (-60)) + ((i517 & (-60)) << 1);
                            }
                        }
                        int i518 = f52606y0;
                        int i519 = i518 & 25;
                        i17 = (i519 - (~(-(-((i518 ^ 25) | i519))))) - 1;
                    } else {
                        adyVarArr = new ady[length];
                        int i314 = i13 + 55;
                        f52606y0 = i314 % 128;
                        int i315 = i314 % 2;
                        i15 = 0;
                        i16 = 0;
                        while (i15 < length) {
                            int i316 = E0;
                            int i317 = i316 & 35;
                            int i4110 = ((i316 ^ 35) | i317) << 1;
                            int i4111 = -((i316 | 35) & (~i317));
                            int i4112 = (i4110 & i4111) + (i4111 | i4110);
                            f52606y0 = i4112 % 128;
                            int i4113 = i4112 % 2;
                            ady adyVarE3 = afvVar.f52530t0[i15].UiMessageCallbackKtWhenMappings().e();
                            adyVarArr[i15] = adyVarE3;
                            int i4114 = -(-adyVarE3.b(true));
                            i16 = ((i16 | i4114) << 1) - (i16 ^ i4114);
                            i15++;
                            int i4115 = f52606y0;
                            int i4116 = ((i4115 ^ 121) | (i4115 & 121)) << 1;
                            int i4117 = -(((~i4115) & 121) | (i4115 & (-122)));
                            int i4118 = (i4116 & i4117) + (i4117 | i4116);
                            E0 = i4118 % 128;
                            int i4119 = i4118 % 2;
                        }
                        afvVar.f52607x0 = i16;
                        aeb.setX(new Object[]{aebVar, Integer.valueOf(i16)}, 1357165778, -1357165764, i16);
                        int i5110 = E0;
                        int i5111 = i5110 & 59;
                        int i5112 = i5110 | 59;
                        int i5113 = (i5111 ^ i5112) + ((i5112 & i5111) << 1);
                        f52606y0 = i5113 % 128;
                        int i5114 = i5113 % 2;
                        while (i24 < length) {
                            int i5115 = E0;
                            int i5116 = i5115 & 113;
                            i18 = (i5116 - (~((i5115 ^ 113) | i5116))) - 1;
                            f52606y0 = i18 % 128;
                            if (i18 % 2 != 0) {
                                adyVarArr[i24].c(o0VarL, true);
                                i24 += 50;
                            } else {
                                adyVarArr[i24].c(o0VarL, true);
                                int i5117 = ((i24 ^ 62) + ((i24 & 62) << 1)) - 1;
                                i24 = (i5117 ^ (-60)) + ((i5117 & (-60)) << 1);
                            }
                        }
                        int i5118 = f52606y0;
                        int i5119 = i5118 & 25;
                        i17 = (i5119 - (~(-(-((i5118 ^ 25) | i5119))))) - 1;
                    }
                }
                E0 = i17 % 128;
                int i61 = i17 % 2;
                return null;
                int iIntValue = ((Integer) setDividerPadding(new Object[]{afvVar}, -459398468, 459398477, System.identityHashCode(afvVar))).intValue();
                aeb.setX(new Object[]{aebVar, Integer.valueOf(iIntValue)}, 1357165778, -1357165764, iIntValue);
                int i62 = E0 + 7;
                f52606y0 = i62 % 128;
                int i63 = i62 % 2;
                int i64 = 0;
                while (i64 < length) {
                    int i65 = f52606y0;
                    int i66 = i65 & 121;
                    int i67 = i66 + ((i65 ^ 121) | i66);
                    E0 = i67 % 128;
                    int i68 = i67 % 2;
                    add[] addVarArr = afvVar.f52530t0;
                    if (i68 == 0) {
                        addVarArr[i64].UiMessageCallbackKtWhenMappings().e().c(o0VarL, false);
                        i64 += 4;
                    } else {
                        addVarArr[i64].UiMessageCallbackKtWhenMappings().e().c(o0VarL, true);
                        int i69 = (i64 & 125) + (i64 | 125);
                        int i70 = (i69 ^ (-1)) + (i69 << 1);
                        int i71 = ((i70 ^ (-123)) | (i70 & (-123))) << 1;
                        int i72 = -(((~i70) & (-123)) | (i70 & 122));
                        i64 = (i71 ^ i72) + ((i72 & i71) << 1);
                    }
                }
                int i73 = f52606y0;
                i17 = (i73 & 39) + (i73 | 39);
                E0 = i17 % 128;
                int i610 = i17 % 2;
                return null;
            case 5:
                aft aftVar = new aft((byte[]) aex.setCompoundDrawableTintBlendMode(new Object[]{((afv) objArr[0]).j()}, 1752883718, -1752883715, (int) System.currentTimeMillis()));
                int i74 = E0 + 108;
                int i75 = (i74 ^ (-1)) + (i74 << 1);
                f52606y0 = i75 % 128;
                int i76 = i75 % 2;
                return aftVar;
            case 6:
                return l(objArr);
            case 7:
                return n(objArr);
            case 8:
                return o(objArr);
            case 9:
                afv afvVar2 = (afv) objArr[0];
                System.identityHashCode(afvVar2);
                System.identityHashCode(afvVar2);
                if (afvVar2.f52607x0 < 0) {
                    int i77 = E0;
                    int i78 = ((i77 ^ 85) - (~((i77 & 85) << 1))) - 1;
                    int i79 = i78 % 128;
                    f52606y0 = i79;
                    int i80 = i78 % 2;
                    int length2 = afvVar2.f52530t0.length;
                    int i81 = i79 + 57;
                    E0 = i81 % 128;
                    int i82 = i81 % 2;
                    int i83 = 0;
                    int iB = 0;
                    while (i83 < length2) {
                        int i84 = f52606y0 + 31;
                        E0 = i84 % 128;
                        if (i84 % 2 == 0) {
                            iB <<= afvVar2.f52530t0[i83].UiMessageCallbackKtWhenMappings().e().b(false);
                            int i85 = i83 & (-36);
                            int i86 = (i85 - (~(-(-((i83 ^ (-36)) | i85))))) - 1;
                            i83 = ((i86 ^ 111) - (~((i86 & 111) << 1))) - 1;
                        } else {
                            int i87 = -(~(-(-afvVar2.f52530t0[i83].UiMessageCallbackKtWhenMappings().e().b(true))));
                            i83 = (-2) - (((i83 & 2) + (i83 | 2)) ^ (-1));
                            iB = ((iB ^ i87) + ((iB & i87) << 1)) - 1;
                        }
                        int i88 = E0;
                        int i89 = i88 & 35;
                        int i90 = (((i88 | 35) & (~i89)) - (~(i89 << 1))) - 1;
                        f52606y0 = i90 % 128;
                        int i91 = i90 % 2;
                    }
                    afvVar2.f52607x0 = iB;
                    int i92 = f52606y0;
                    int i93 = i92 & 57;
                    int i94 = i92 | 57;
                    int i95 = (i93 ^ i94) + ((i94 & i93) << 1);
                    E0 = i95 % 128;
                    int i96 = i95 % 2;
                }
                int i97 = afvVar2.f52607x0;
                int i98 = E0;
                int i99 = (i98 ^ 98) + ((i98 & 98) << 1);
                int i100 = (i99 ^ (-1)) + (i99 << 1);
                f52606y0 = i100 % 128;
                int i101 = i100 % 2;
                return Integer.valueOf(i97);
            default:
                afg afgVar = new afg((afv) objArr[0]);
                int i102 = E0;
                int i103 = i102 ^ 3;
                int i104 = ((i102 & 3) | i103) << 1;
                int i105 = -i103;
                int i106 = ((i104 | i105) << 1) - (i104 ^ i105);
                f52606y0 = i106 % 128;
                int i107 = i106 % 2;
                return afgVar;
        }
    }

    public static afv setY(aed aedVar) {
        return (afv) setDividerPadding(new Object[]{aedVar}, -1887470030, 1887470036, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.aed, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setDividerPadding(new Object[]{this}, -584153316, 584153319, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, -1769087615, 1769087622, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1299931738, -1299931734, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setDividerPadding(new Object[]{this}, -1431364797, 1431364805, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final aee g() {
        return (aee) setDividerPadding(new Object[]{this}, -462794465, 462794466, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final ads h() {
        return (ads) setDividerPadding(new Object[]{this}, 1604591405, -1604591400, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final adl i() {
        return (adl) setDividerPadding(new Object[]{this}, -1924717973, 1924717973, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aed
    public final acz setOnFocusChangeListener() {
        return (acz) setDividerPadding(new Object[]{this}, 2062640126, -2062640124, System.identityHashCode(this));
    }

    public afv(adh adhVar) {
        super(adhVar);
        this.f52607x0 = -1;
    }

    public afv(add addVar) {
        super(addVar);
        this.f52607x0 = -1;
    }

    public afv() {
        this.f52607x0 = -1;
    }
}
