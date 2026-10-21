package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afx extends aeh {
    public static int E0 = 0;
    public static int F0 = 1;

    public afx(boolean z10, int i10, add addVar) {
        super(z10, i10, addVar);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x01cf  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        Object obj;
        int iIntValue;
        int i13 = i10 | i11;
        int i14 = (i13 * (-502)) + (i11 * 503) + (i10 * 503);
        int i15 = ~i10;
        int i16 = ~((~i11) | i15);
        int i17 = i15 | (~i12);
        int i18 = i16 | (~i17);
        int i19 = ~(i12 | i13);
        int i20 = (((~(i17 | i11)) | i19) * 502) + ((i18 | i19) * (-502)) + i14;
        int i21 = 0;
        if (i20 == 1) {
            obj = (afx) objArr[0];
            int i22 = E0;
            int i23 = i22 & 27;
            int i24 = ((i22 | 27) & (~i23)) + (i23 << 1);
            F0 = i24 % 128;
            if (i24 % 2 == 0) {
                throw null;
            }
        } else {
            if (i20 == 2) {
                afx afxVar = (afx) objArr[0];
                int i25 = E0;
                int i26 = i25 & 71;
                int i27 = i26 + ((i25 ^ 71) | i26);
                int i28 = i27 % 128;
                F0 = i28;
                if (i27 % 2 == 0) {
                    int i29 = 78 / 0;
                }
                int i30 = i28 + 107;
                E0 = i30 % 128;
                int i31 = i30 % 2;
                return afxVar;
            }
            if (i20 != 3) {
                if (i20 != 4) {
                    if (i20 != 5) {
                        afv afvVar = new afv((ady) objArr[1]);
                        int i32 = F0;
                        int i33 = (i32 & 73) + (i32 | 73);
                        E0 = i33 % 128;
                        int i34 = i33 % 2;
                        return afvVar;
                    }
                    afx afxVar2 = (afx) objArr[0];
                    boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
                    int i35 = F0 + 43;
                    E0 = i35 % 128;
                    if (i35 % 2 != 0) {
                        afxVar2.f52545w0.UiMessageCallbackKtWhenMappings().e().b(afxVar2.setOnFocusChangeListener());
                        throw null;
                    }
                    ady adyVarE = afxVar2.f52545w0.UiMessageCallbackKtWhenMappings().e();
                    boolean onFocusChangeListener = afxVar2.setOnFocusChangeListener();
                    int iB = adyVarE.b(onFocusChangeListener);
                    if (onFocusChangeListener) {
                        int iIntValue2 = ((Integer) aeb.setX(new Object[]{Integer.valueOf(iB)}, 1896945642, -1896945627, iB)).intValue();
                        int iIdentityHashCode = System.identityHashCode(afxVar2);
                        int i36 = iIntValue2 * (-159);
                        int i37 = iB * (-159);
                        int i38 = i36 & i37;
                        int i39 = (i38 - (~(-(-((i36 ^ i37) | i38))))) - 1;
                        int i40 = ~iIntValue2;
                        int i41 = (~i40) & iB;
                        int i42 = ~iB;
                        int i43 = ((i40 & iB) | i41 | (i40 & i42)) * 160;
                        int i44 = (i39 ^ i43) + ((i43 & i39) << 1);
                        int i45 = ~iIdentityHashCode;
                        int i46 = (iIdentityHashCode | i45) & i45;
                        int i47 = i46 ^ iIntValue2;
                        int i48 = i46 & iIntValue2;
                        int i49 = (i48 & i47) | (i47 ^ i48);
                        int i50 = ~i49;
                        int i51 = (i49 | i50) & i50;
                        int i52 = ~((iB & iIntValue2) | (iIntValue2 ^ iB));
                        int i53 = i51 & i52;
                        int i54 = (i52 | i51) & (~i53);
                        int i55 = -(-(((i54 & i53) | (i54 ^ i53)) * (-160)));
                        int i56 = i44 & i55;
                        int i57 = -(-((i55 ^ i44) | i56));
                        int i58 = ((i56 | i57) << 1) - (i57 ^ i56);
                        int i59 = ~(((~i45) & i42) | ((~i42) & i45) | (i42 & i45));
                        int i60 = iIntValue2 & i59;
                        int i61 = (((i59 | iIntValue2) & (~i60)) | i60) * 160;
                        iB = (i61 | i58) + (i58 & i61);
                        int i62 = E0;
                        int i63 = (i62 & 75) + (i62 | 75);
                        F0 = i63 % 128;
                        int i64 = i63 % 2;
                    }
                    if (!zBooleanValue) {
                        int i65 = F0;
                        int i66 = i65 & 125;
                        int i67 = -(-((i65 ^ 125) | i66));
                        int i68 = (i66 & i67) + (i67 | i66);
                        E0 = i68 % 128;
                        int i69 = i68 % 2;
                    } else {
                        int i70 = E0 + 85;
                        F0 = i70 % 128;
                        int i71 = i70 % 2;
                        int i72 = afxVar2.v0;
                        if (i71 == 0) {
                            iIntValue = ((Integer) aeb.setX(new Object[]{Integer.valueOf(i72)}, 111418850, -111418837, i72)).intValue();
                            int i73 = 94 / 0;
                        } else {
                            iIntValue = ((Integer) aeb.setX(new Object[]{Integer.valueOf(i72)}, 111418850, -111418837, i72)).intValue();
                        }
                        i21 = iIntValue;
                    }
                    int i74 = (-2) - ((iB - (~(-(-i21)))) ^ (-1));
                    int i75 = E0;
                    int i76 = (i75 & 107) + (i75 | 107);
                    F0 = i76 % 128;
                    int i77 = i76 % 2;
                    return Integer.valueOf(i74);
                }
                afx afxVar3 = (afx) objArr[0];
                aeb aebVar = (aeb) objArr[1];
                boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
                int i78 = F0;
                int i79 = (((i78 | 60) << 1) - (i78 ^ 60)) - 1;
                E0 = i79 % 128;
                if (i79 % 2 != 0) {
                    afxVar3.f52545w0.UiMessageCallbackKtWhenMappings().e();
                    afxVar3.setOnFocusChangeListener();
                    throw null;
                }
                ady adyVarE2 = afxVar3.f52545w0.UiMessageCallbackKtWhenMappings().e();
                boolean onFocusChangeListener2 = afxVar3.setOnFocusChangeListener();
                if (zBooleanValue2) {
                    int i80 = afxVar3.f52544u0;
                    if (onFocusChangeListener2) {
                        int i81 = i80 & 32;
                        int i82 = (i80 | 32) & (~i81);
                        i80 = (i82 & i81) | (i82 ^ i81);
                        int i83 = F0;
                        int i84 = (i83 & 9) + (i83 | 9);
                        E0 = i84 % 128;
                        int i85 = i84 % 2;
                    } else {
                        int i86 = E0;
                        int i87 = i86 & 119;
                        int i88 = (i86 ^ 119) | i87;
                        int i89 = (i87 ^ i88) + ((i88 & i87) << 1);
                        F0 = i89 % 128;
                        int i90 = i89 % 2;
                        boolean y7 = adyVarE2.setY();
                        if (i90 == 0) {
                            int i91 = 48 / 0;
                            if (!(!y7)) {
                                int i810 = i80 & 32;
                                int i811 = (i80 | 32) & (~i810);
                                i80 = (i811 & i810) | (i811 ^ i810);
                                int i812 = F0;
                                int i813 = (i812 & 9) + (i812 | 9);
                                E0 = i813 % 128;
                                int i814 = i813 % 2;
                            }
                        } else if (!(!y7)) {
                            int i815 = i80 & 32;
                            int i816 = (i80 | 32) & (~i815);
                            i80 = (i816 & i815) | (i816 ^ i815);
                            int i817 = F0;
                            int i818 = (i817 & 9) + (i817 | 9);
                            E0 = i818 % 128;
                            int i819 = i818 % 2;
                        }
                    }
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(i80), Integer.valueOf(afxVar3.v0)}, 1688519098, -1688519092, i80);
                    int i92 = F0 + 11;
                    E0 = i92 % 128;
                    int i93 = i92 % 2;
                }
                if (onFocusChangeListener2) {
                    int i94 = E0;
                    int i95 = i94 | 117;
                    int i96 = i95 << 1;
                    int i97 = -((~(i94 & 117)) & i95);
                    int i98 = (i96 & i97) + (i97 | i96);
                    F0 = i98 % 128;
                    if (i98 % 2 == 0) {
                        int iB2 = adyVarE2.b(false);
                        aeb.setX(new Object[]{aebVar, Integer.valueOf(iB2)}, 1357165778, -1357165764, iB2);
                    } else {
                        int iB3 = adyVarE2.b(true);
                        aeb.setX(new Object[]{aebVar, Integer.valueOf(iB3)}, 1357165778, -1357165764, iB3);
                    }
                    int i99 = F0 + 27;
                    E0 = i99 % 128;
                    int i100 = i99 % 2;
                }
                adyVarE2.c(aebVar.l(), onFocusChangeListener2);
                int i101 = F0;
                int i102 = i101 & 23;
                int i103 = (i101 ^ 23) | i102;
                int i104 = (i102 ^ i103) + ((i103 & i102) << 1);
                E0 = i104 % 128;
                if (i104 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            afx afxVar4 = (afx) objArr[0];
            int i105 = E0;
            int i106 = ((i105 & 22) + (i105 | 22)) - 1;
            F0 = i106 % 128;
            if (i106 % 2 == 0) {
                afxVar4.setOnFocusChangeListener();
                throw null;
            }
            if (afxVar4.setOnFocusChangeListener() || afxVar4.f52545w0.UiMessageCallbackKtWhenMappings().e().setY()) {
                int i107 = F0 + 85;
                E0 = i107 % 128;
                if (i107 % 2 != 0) {
                    int i108 = 94 / 0;
                }
                obj = Boolean.TRUE;
            } else {
                int i109 = F0;
                int i110 = (-2) - ((((i109 | 118) << 1) - (i109 ^ 118)) ^ (-1));
                E0 = i110 % 128;
                if (i110 % 2 != 0) {
                    int i111 = 2 / 0;
                }
                obj = Boolean.FALSE;
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.aeh, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setX(new Object[]{this}, -995363252, 995363253, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, 620129574, -620129569, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, -136990800, 136990804, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aeh, com.mypinpad.tsdk.isolation.ady
    public final ady e() {
        return (ady) setX(new Object[]{this}, 1585129543, -1585129541, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aeh
    public final aed f(ady adyVar) {
        return (aed) setX(new Object[]{this, adyVar}, -1746531671, 1746531671, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, -1471868310, 1471868313, System.identityHashCode(this))).booleanValue();
    }

    public afx(add addVar) {
        super(true, 0, addVar);
    }
}
