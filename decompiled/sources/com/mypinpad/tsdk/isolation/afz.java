package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afz extends aee {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52608x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52609y0 = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f52610w0;

    public afz(adh adhVar) {
        super(adhVar, true);
        this.f52610w0 = -1;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x024f A[PHI: r2 r11
      0x024f: PHI (r2v7 int A[IMMUTABLE_TYPE]) = (r2v6 int), (r2v10 int) binds: [B:52:0x024d, B:49:0x022b] A[DONT_GENERATE, DONT_INLINE]
      0x024f: PHI (r11v7 com.mypinpad.tsdk.i.o0) = (r11v6 com.mypinpad.tsdk.i.o0), (r11v20 com.mypinpad.tsdk.i.o0) binds: [B:52:0x024d, B:49:0x022b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0268  */
    /* JADX WARN: Code duplicated, block: B:58:0x0275  */
    /* JADX WARN: Code duplicated, block: B:60:0x0285  */
    /* JADX WARN: Code duplicated, block: B:61:0x029e  */
    /* JADX WARN: Code duplicated, block: B:65:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0309 A[SYNTHETIC] */
    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws IOException, CloneNotSupportedException {
        o0 o0VarL;
        int length;
        int i13;
        ady[] adyVarArr;
        int i14;
        int iB;
        int i15;
        int i16;
        add[] addVarArr;
        int iIntValue;
        afz afzVar;
        Object objValueOf;
        int length2;
        int i17;
        int i18 = ~i12;
        int i19 = ~(i18 | i10);
        int i20 = ~((~i10) | i11);
        int i21 = (((~(i10 | (~i11))) | i20 | i19) * 764) + (((~(i18 | i11)) | i20) * (-1528)) + ((i11 | i19) * 764) + (i11 * (-1527)) + (i10 * 765);
        int i22 = 0;
        if (i21 != 1) {
            if (i21 == 2) {
                afz afzVar2 = (afz) objArr[0];
                boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                int i23 = f52608x0;
                int i24 = ((i23 & 65) - (~(-(-(i23 | 65))))) - 1;
                f52609y0 = i24 % 128;
                if (i24 % 2 == 0) {
                    int iIntValue2 = ((Integer) setDividerPadding(new Object[]{afzVar2}, -1775913193, 1775913198, System.identityHashCode(afzVar2))).intValue();
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue2)}, 1150803379, -1150803367, iIntValue2)).intValue();
                    int i25 = 32 / 0;
                } else {
                    int iIntValue3 = ((Integer) setDividerPadding(new Object[]{afzVar2}, -1775913193, 1775913198, System.identityHashCode(afzVar2))).intValue();
                    iIntValue = ((Integer) aeb.setX(new Object[]{Boolean.valueOf(zBooleanValue), Integer.valueOf(iIntValue3)}, 1150803379, -1150803367, iIntValue3)).intValue();
                }
                return Integer.valueOf(iIntValue);
            }
            if (i21 == 3) {
                ((Boolean) objArr[0]).booleanValue();
                int i26 = f52608x0;
                int i27 = i26 & 47;
                int i28 = ((~i27) & (i26 | 47)) + (i27 << 1);
                f52609y0 = i28 % 128;
                int i29 = i28 % 2;
                int i30 = (i26 & 23) + (i26 | 23);
                f52609y0 = i30 % 128;
                int i31 = i30 % 2;
                return true;
            }
            if (i21 == 4) {
                afzVar = (afz) objArr[0];
                int i32 = f52608x0;
                int i33 = i32 + 123;
                f52609y0 = i33 % 128;
                if (i33 % 2 == 0) {
                    add[] addVarArr2 = afzVar.setCompoundDrawableTintBlendMode;
                    throw null;
                }
                if (afzVar.setCompoundDrawableTintBlendMode != null) {
                    int i34 = (i32 ^ 99) + ((i32 & 99) << 1);
                    f52609y0 = i34 % 128;
                    if (i34 % 2 == 0) {
                        objValueOf = afzVar;
                        throw null;
                    }
                } else {
                    ady adyVarE = super.e();
                    int i35 = f52609y0;
                    int i36 = (((i35 | 64) << 1) - (i35 ^ 64)) - 1;
                    f52608x0 = i36 % 128;
                    int i37 = i36 % 2;
                    objValueOf = adyVarE;
                }
            } else {
                if (i21 != 5) {
                    afz afzVar3 = (afz) objArr[0];
                    int i38 = f52608x0;
                    int i39 = (i38 ^ 39) + ((i38 & 39) << 1);
                    f52609y0 = i39 % 128;
                    if (i39 % 2 != 0) {
                        return afzVar3;
                    }
                    int i40 = 14 / 0;
                    return afzVar3;
                }
                afz afzVar4 = (afz) objArr[0];
                int i41 = f52608x0;
                int i42 = i41 & 11;
                int i43 = (~i42) & (i41 | 11);
                int i44 = -(-(i42 << 1));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                f52609y0 = i45 % 128;
                int i46 = i45 % 2;
                if (afzVar4.f52610w0 < 0) {
                    int i47 = (-2) - ((((i41 | 36) << 1) - (i41 ^ 36)) ^ (-1));
                    f52609y0 = i47 % 128;
                    if (i47 % 2 == 0) {
                        length2 = afzVar4.setOnFocusChangeListener.length;
                        i17 = 1;
                    } else {
                        length2 = afzVar4.setOnFocusChangeListener.length;
                        i17 = 0;
                    }
                    int i48 = i17;
                    int i49 = i41 & 99;
                    int i50 = (((i41 ^ 99) | i49) << 1) - ((i41 | 99) & (~i49));
                    f52609y0 = i50 % 128;
                    int i51 = i50 % 2;
                    while (i48 < length2) {
                        int i52 = f52608x0 + 83;
                        f52609y0 = i52 % 128;
                        int i53 = i52 % 2;
                        int iB2 = afzVar4.setOnFocusChangeListener[i48].UiMessageCallbackKtWhenMappings().e().b(true);
                        int i54 = i17 & iB2;
                        int i55 = (iB2 | i17) & (~i54);
                        int i56 = -(-(i54 << 1));
                        i17 = (i55 & i56) + (i55 | i56);
                        int i57 = i48 & 1;
                        i48 = (((i48 ^ 1) | i57) << 1) - ((i48 | 1) & (~i57));
                        int i58 = f52609y0;
                        int i59 = i58 ^ 15;
                        int i60 = (i58 & 15) << 1;
                        int i61 = (i59 & i60) + (i60 | i59);
                        f52608x0 = i61 % 128;
                        int i62 = i61 % 2;
                    }
                    afzVar4.f52610w0 = i17;
                    int i63 = f52608x0 + 105;
                    f52609y0 = i63 % 128;
                    int i64 = i63 % 2;
                }
                int i65 = afzVar4.f52610w0;
                int i66 = f52608x0;
                int i67 = (i66 ^ 111) + ((i66 & 111) << 1);
                f52609y0 = i67 % 128;
                if (i67 % 2 == 0) {
                    int i68 = 13 / 0;
                }
                objValueOf = Integer.valueOf(i65);
            }
            objValueOf = afzVar;
            return objValueOf;
        }
        afz afzVar5 = (afz) objArr[0];
        aeb aebVar = (aeb) objArr[1];
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i69 = f52609y0;
        int i70 = ((i69 | 88) << 1) - (i69 ^ 88);
        int i71 = (i70 ^ (-1)) + (i70 << 1);
        f52608x0 = i71 % 128;
        Object[] objArr2 = new Object[3];
        if (i71 % 2 != 0) {
            objArr2[0] = aebVar;
            objArr2[1] = Boolean.valueOf(zBooleanValue2);
            objArr2[2] = 1;
            aeb.setX(objArr2, 1303469841, -1303469839, 1);
            o0VarL = aebVar.l();
            length = afzVar5.setOnFocusChangeListener.length;
            if (afzVar5.f52610w0 < 0) {
                int i72 = f52609y0;
                int i73 = i72 | 9;
                int i74 = ((i73 << 1) - (~(-((~(i72 & 9)) & i73)))) - 1;
                i13 = i74 % 128;
                f52608x0 = i13;
                int i75 = i74 % 2;
                if (length <= 16) {
                    adyVarArr = new ady[length];
                    int i76 = i13 + 71;
                    f52609y0 = i76 % 128;
                    int i77 = i76 % 2;
                    i14 = 0;
                    iB = 0;
                    while (i14 < length) {
                        int i78 = f52608x0;
                        int i79 = (i78 & 121) + (i78 | 121);
                        f52609y0 = i79 % 128;
                        i16 = i79 % 2;
                        addVarArr = afzVar5.setOnFocusChangeListener;
                        if (i16 == 0) {
                            ady adyVarE2 = addVarArr[i14].UiMessageCallbackKtWhenMappings().e();
                            adyVarArr[i14] = adyVarE2;
                            iB /= adyVarE2.b(true);
                            i14 = ((i14 | 27) << 1) - (i14 ^ 27);
                        } else {
                            ady adyVarE3 = addVarArr[i14].UiMessageCallbackKtWhenMappings().e();
                            adyVarArr[i14] = adyVarE3;
                            int i80 = -(-adyVarE3.b(true));
                            int i81 = ((((~i80) & iB) | ((~iB) & i80)) - (~(-(-((iB & i80) << 1))))) - 1;
                            int i82 = i14 & 1;
                            int i83 = ((i14 ^ 1) | i82) << 1;
                            int i84 = -((i14 | 1) & (~i82));
                            i14 = (i83 & i84) + (i84 | i83);
                            iB = i81;
                        }
                        int i85 = f52609y0;
                        int i86 = ((i85 | 13) << 1) - (i85 ^ 13);
                        f52608x0 = i86 % 128;
                        int i87 = i86 % 2;
                    }
                    afzVar5.f52610w0 = iB;
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(iB)}, 1357165778, -1357165764, iB);
                    int i88 = f52608x0 + 63;
                    f52609y0 = i88 % 128;
                    int i89 = i88 % 2;
                    while (i22 < length) {
                        int i90 = f52608x0;
                        int i91 = i90 & 47;
                        i15 = i91 + ((i90 ^ 47) | i91);
                        f52609y0 = i15 % 128;
                        if (i15 % 2 == 0) {
                            adyVarArr[i22].c(o0VarL, true);
                            int i92 = ((i22 ^ (-74)) | (i22 & (-74))) << 1;
                            int i93 = -((i22 & 73) | ((~i22) & (-74)));
                            int i94 = (i92 ^ i93) + ((i92 & i93) << 1);
                            int i95 = (i94 & (-95)) | ((~i94) & 94);
                            int i96 = -(-((i94 & 94) << 1));
                            i22 = (i95 ^ i96) + ((i95 & i96) << 1);
                        } else {
                            adyVarArr[i22].c(o0VarL, true);
                            i22 = (i22 & 1) + (i22 | 1);
                        }
                    }
                    int i97 = f52609y0;
                    int i98 = i97 & 113;
                    int i99 = (i98 - (~((i97 ^ 113) | i98))) - 1;
                    f52608x0 = i99 % 128;
                    int i100 = i99 % 2;
                    return null;
                }
            }
        } else {
            objArr2[0] = aebVar;
            objArr2[1] = Boolean.valueOf(zBooleanValue2);
            objArr2[2] = 49;
            aeb.setX(objArr2, 1303469841, -1303469839, 49);
            o0VarL = aebVar.l();
            length = afzVar5.setOnFocusChangeListener.length;
            if (afzVar5.f52610w0 < 0) {
                int i710 = f52609y0;
                int i711 = i710 | 9;
                int i712 = ((i711 << 1) - (~(-((~(i710 & 9)) & i711)))) - 1;
                i13 = i712 % 128;
                f52608x0 = i13;
                int i713 = i712 % 2;
                if (length <= 16) {
                    adyVarArr = new ady[length];
                    int i714 = i13 + 71;
                    f52609y0 = i714 % 128;
                    int i715 = i714 % 2;
                    i14 = 0;
                    iB = 0;
                    while (i14 < length) {
                        int i716 = f52608x0;
                        int i717 = (i716 & 121) + (i716 | 121);
                        f52609y0 = i717 % 128;
                        i16 = i717 % 2;
                        addVarArr = afzVar5.setOnFocusChangeListener;
                        if (i16 == 0) {
                            ady adyVarE4 = addVarArr[i14].UiMessageCallbackKtWhenMappings().e();
                            adyVarArr[i14] = adyVarE4;
                            iB /= adyVarE4.b(true);
                            i14 = ((i14 | 27) << 1) - (i14 ^ 27);
                        } else {
                            ady adyVarE5 = addVarArr[i14].UiMessageCallbackKtWhenMappings().e();
                            adyVarArr[i14] = adyVarE5;
                            int i810 = -(-adyVarE5.b(true));
                            int i811 = ((((~i810) & iB) | ((~iB) & i810)) - (~(-(-((iB & i810) << 1))))) - 1;
                            int i812 = i14 & 1;
                            int i813 = ((i14 ^ 1) | i812) << 1;
                            int i814 = -((i14 | 1) & (~i812));
                            i14 = (i813 & i814) + (i814 | i813);
                            iB = i811;
                        }
                        int i815 = f52609y0;
                        int i816 = ((i815 | 13) << 1) - (i815 ^ 13);
                        f52608x0 = i816 % 128;
                        int i817 = i816 % 2;
                    }
                    afzVar5.f52610w0 = iB;
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(iB)}, 1357165778, -1357165764, iB);
                    int i818 = f52608x0 + 63;
                    f52609y0 = i818 % 128;
                    int i819 = i818 % 2;
                    while (i22 < length) {
                        int i910 = f52608x0;
                        int i911 = i910 & 47;
                        i15 = i911 + ((i910 ^ 47) | i911);
                        f52609y0 = i15 % 128;
                        if (i15 % 2 == 0) {
                            adyVarArr[i22].c(o0VarL, true);
                            int i912 = ((i22 ^ (-74)) | (i22 & (-74))) << 1;
                            int i913 = -((i22 & 73) | ((~i22) & (-74)));
                            int i914 = (i912 ^ i913) + ((i912 & i913) << 1);
                            int i915 = (i914 & (-95)) | ((~i914) & 94);
                            int i916 = -(-((i914 & 94) << 1));
                            i22 = (i915 ^ i916) + ((i915 & i916) << 1);
                        } else {
                            adyVarArr[i22].c(o0VarL, true);
                            i22 = (i22 & 1) + (i22 | 1);
                        }
                    }
                    int i917 = f52609y0;
                    int i918 = i917 & 113;
                    int i919 = (i918 - (~((i917 ^ 113) | i918))) - 1;
                    f52608x0 = i919 % 128;
                    int i101 = i919 % 2;
                    return null;
                }
            }
        }
        int iIntValue4 = ((Integer) setDividerPadding(new Object[]{afzVar5}, -1775913193, 1775913198, System.identityHashCode(afzVar5))).intValue();
        aeb.setX(new Object[]{aebVar, Integer.valueOf(iIntValue4)}, 1357165778, -1357165764, iIntValue4);
        int i102 = f52608x0;
        int i103 = i102 & 107;
        int i104 = ((i102 ^ 107) | i103) << 1;
        int i105 = -((i102 | 107) & (~i103));
        int i106 = (i104 ^ i105) + ((i105 & i104) << 1);
        f52609y0 = i106 % 128;
        int i107 = i106 % 2;
        while (i22 < length) {
            int i108 = f52608x0;
            int i109 = ((i108 ^ 83) | (i108 & 83)) << 1;
            int i110 = -(((~i108) & 83) | (i108 & (-84)));
            int i111 = (i109 ^ i110) + ((i110 & i109) << 1);
            f52609y0 = i111 % 128;
            int i112 = i111 % 2;
            add[] addVarArr3 = afzVar5.setOnFocusChangeListener;
            if (i112 == 0) {
                addVarArr3[i22].UiMessageCallbackKtWhenMappings().e().c(o0VarL, true);
                int i113 = i22 & (-74);
                int i114 = ((i22 ^ (-74)) | i113) << 1;
                int i115 = -((~i113) & (i22 | (-74)));
                int i116 = (i114 & i115) + (i114 | i115);
                int i117 = i116 ^ 122;
                i22 = (((i116 & 122) | i117) << 1) - i117;
            } else {
                addVarArr3[i22].UiMessageCallbackKtWhenMappings().e().c(o0VarL, true);
                i22 = ((((i22 ^ 1) | (i22 & 1)) << 1) - (~(-((i22 & (-2)) | ((~i22) & 1))))) - 1;
            }
        }
        int i118 = f52608x0 + 111;
        f52609y0 = i118 % 128;
        int i119 = i118 % 2;
        return null;
    }

    @Override // com.mypinpad.tsdk.isolation.aee, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setDividerPadding(new Object[]{this}, 730711265, -730711265, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setDividerPadding(new Object[]{this, Boolean.valueOf(z10)}, 849791153, -849791151, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException, CloneNotSupportedException {
        setDividerPadding(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1423407946, -1423407945, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aee, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setDividerPadding(new Object[]{this}, -1752560060, 1752560064, System.identityHashCode(this));
    }

    public afz() {
        this.f52610w0 = -1;
    }
}
