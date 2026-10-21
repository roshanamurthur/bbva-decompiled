package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class afd extends aeh {
    public static int E0 = 0;
    public static int F0 = 1;

    public afd(add addVar) {
        super(true, 0, addVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x014b  */
    /* JADX WARN: Code duplicated, block: B:36:0x01c2 A[PHI: r6
      0x01c2: PHI (r6v7 boolean) = (r6v4 boolean), (r6v8 boolean) binds: [B:35:0x01c0, B:32:0x01b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:40:0x01de  */
    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws IOException {
        boolean onFocusChangeListener;
        int i13;
        Boolean bool;
        int i14 = ((i10 | i12) * (-50)) + (i11 * (-49)) + (i10 * 51);
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = ~(i15 | i16 | i12);
        int i18 = ~i12;
        int i19 = i16 | i18;
        int i20 = (((~(i10 | i18)) | (~(i16 | i10)) | (~i19)) * 50) + ((i17 | (~(i19 | i10))) * 50) + i14;
        int iIntValue = 0;
        if (i20 == 1) {
            afd afdVar = (afd) objArr[0];
            aeb aebVar = (aeb) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i21 = F0;
            int i22 = ((i21 ^ 45) - (~(-(-((i21 & 45) << 1))))) - 1;
            E0 = i22 % 128;
            int i23 = i22 % 2;
            ady adyVarUiMessageCallbackKtWhenMappings = afdVar.f52545w0.UiMessageCallbackKtWhenMappings();
            if (i23 != 0) {
                onFocusChangeListener = afdVar.setOnFocusChangeListener();
                int i24 = 49 / 0;
                if (!(!zBooleanValue)) {
                    i13 = afdVar.f52544u0;
                    if (onFocusChangeListener) {
                        int i25 = (i13 & (-33)) | ((~i13) & 32);
                        int i26 = i13 & 32;
                        i13 = (i26 & i25) | (i25 ^ i26);
                        int i27 = F0;
                        int i28 = ((i27 ^ 106) + ((i27 & 106) << 1)) - 1;
                        E0 = i28 % 128;
                        int i29 = i28 % 2;
                    } else {
                        int i30 = E0;
                        int i31 = i30 ^ 41;
                        int i32 = -(-((i30 & 41) << 1));
                        int i33 = (i31 & i32) + (i32 | i31);
                        F0 = i33 % 128;
                        int i34 = i33 % 2;
                        if (adyVarUiMessageCallbackKtWhenMappings.setY()) {
                            int i210 = (i13 & (-33)) | ((~i13) & 32);
                            int i211 = i13 & 32;
                            i13 = (i211 & i210) | (i210 ^ i211);
                            int i212 = F0;
                            int i213 = ((i212 ^ 106) + ((i212 & 106) << 1)) - 1;
                            E0 = i213 % 128;
                            int i214 = i213 % 2;
                        }
                    }
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(i13), Integer.valueOf(afdVar.v0)}, 1688519098, -1688519092, i13);
                    int i35 = E0;
                    int i36 = ((i35 & (-54)) | ((~i35) & 53)) + ((i35 & 53) << 1);
                    F0 = i36 % 128;
                    int i37 = i36 % 2;
                }
            } else {
                onFocusChangeListener = afdVar.setOnFocusChangeListener();
                if (!(!zBooleanValue)) {
                    i13 = afdVar.f52544u0;
                    if (onFocusChangeListener) {
                        int i38 = E0;
                        int i39 = i38 ^ 41;
                        int i310 = -(-((i38 & 41) << 1));
                        int i311 = (i39 & i310) + (i310 | i39);
                        F0 = i311 % 128;
                        int i312 = i311 % 2;
                        if (adyVarUiMessageCallbackKtWhenMappings.setY()) {
                            int i215 = (i13 & (-33)) | ((~i13) & 32);
                            int i216 = i13 & 32;
                            i13 = (i216 & i215) | (i215 ^ i216);
                            int i217 = F0;
                            int i218 = ((i217 ^ 106) + ((i217 & 106) << 1)) - 1;
                            E0 = i218 % 128;
                            int i219 = i218 % 2;
                        }
                    } else {
                        int i2110 = (i13 & (-33)) | ((~i13) & 32);
                        int i2111 = i13 & 32;
                        i13 = (i2111 & i2110) | (i2110 ^ i2111);
                        int i2112 = F0;
                        int i2113 = ((i2112 ^ 106) + ((i2112 & 106) << 1)) - 1;
                        E0 = i2113 % 128;
                        int i2114 = i2113 % 2;
                    }
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(i13), Integer.valueOf(afdVar.v0)}, 1688519098, -1688519092, i13);
                    int i313 = E0;
                    int i314 = ((i313 & (-54)) | ((~i313) & 53)) + ((i313 & 53) << 1);
                    F0 = i314 % 128;
                    int i315 = i314 % 2;
                }
            }
            if (!onFocusChangeListener) {
                adyVarUiMessageCallbackKtWhenMappings.c(aebVar, false);
                int i40 = E0;
                int i41 = i40 & 87;
                int i42 = (((i40 ^ 87) | i41) << 1) - ((i40 | 87) & (~i41));
                F0 = i42 % 128;
                if (i42 % 2 != 0) {
                    return null;
                }
                throw null;
            }
            int i43 = (-2) - ((F0 + 20) ^ (-1));
            E0 = i43 % 128;
            int i44 = i43 % 2;
            aeb.setX(new Object[]{aebVar, 128}, -478708408, 478708419, 128);
            adyVarUiMessageCallbackKtWhenMappings.c(aebVar, true);
            aeb.setX(new Object[]{aebVar, 0}, -478708408, 478708419, 0);
            aeb.setX(new Object[]{aebVar, 0}, -478708408, 478708419, 0);
            int i45 = E0;
            int i46 = (i45 ^ 5) + ((i45 & 5) << 1);
            F0 = i46 % 128;
            if (i46 % 2 != 0) {
                return null;
            }
            throw null;
        }
        if (i20 == 2) {
            aey aeyVar = new aey((ady) objArr[1]);
            int i47 = F0;
            int i48 = i47 & 39;
            int i49 = (i47 | 39) & (~i48);
            int i50 = -(-(i48 << 1));
            int i51 = (i49 & i50) + (i49 | i50);
            E0 = i51 % 128;
            int i52 = i51 % 2;
            return aeyVar;
        }
        if (i20 == 3) {
            afd afdVar2 = (afd) objArr[0];
            int i53 = F0 + 7;
            E0 = i53 % 128;
            int i54 = i53 % 2;
            if (!afdVar2.setOnFocusChangeListener()) {
                int i55 = F0;
                int i56 = i55 | 23;
                int i57 = i56 << 1;
                int i58 = -((~(i55 & 23)) & i56);
                int i59 = ((i57 | i58) << 1) - (i58 ^ i57);
                E0 = i59 % 128;
                int i60 = i59 % 2;
                ady adyVarUiMessageCallbackKtWhenMappings2 = afdVar2.f52545w0.UiMessageCallbackKtWhenMappings();
                if (i60 != 0) {
                    adyVarUiMessageCallbackKtWhenMappings2.setY();
                    throw null;
                }
                if (!adyVarUiMessageCallbackKtWhenMappings2.setY()) {
                    int i61 = E0;
                    int i62 = ((i61 | 11) << 1) - (i61 ^ 11);
                    F0 = i62 % 128;
                    int i63 = i62 % 2;
                    bool = Boolean.FALSE;
                } else {
                    int i64 = F0;
                    int i65 = (i64 & (-24)) | ((~i64) & 23);
                    int i66 = (i64 & 23) << 1;
                    int i67 = (i65 & i66) + (i66 | i65);
                    E0 = i67 % 128;
                    int i68 = i67 % 2;
                    bool = Boolean.TRUE;
                }
            } else {
                int i69 = F0;
                int i610 = (i69 & (-24)) | ((~i69) & 23);
                int i611 = (i69 & 23) << 1;
                int i612 = (i610 & i611) + (i611 | i610);
                E0 = i612 % 128;
                int i613 = i612 % 2;
                bool = Boolean.TRUE;
            }
            return bool;
        }
        afd afdVar3 = (afd) objArr[0];
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        int i70 = E0;
        int i71 = ((i70 & 44) + (i70 | 44)) - 1;
        F0 = i71 % 128;
        int i72 = i71 % 2;
        ady adyVarUiMessageCallbackKtWhenMappings3 = afdVar3.f52545w0.UiMessageCallbackKtWhenMappings();
        boolean onFocusChangeListener2 = afdVar3.setOnFocusChangeListener();
        int iB = adyVarUiMessageCallbackKtWhenMappings3.b(onFocusChangeListener2);
        if (onFocusChangeListener2) {
            int i73 = F0;
            int i74 = i73 ^ 27;
            int i75 = -(-((i73 & 27) << 1));
            int i76 = (i74 ^ i75) + ((i74 & i75) << 1);
            E0 = i76 % 128;
            int i77 = i76 % 2;
            int i78 = iB ^ 3;
            iB = ((((iB & 3) | i78) << 1) - (~(-i78))) - 1;
            int i79 = i73 + 59;
            E0 = i79 % 128;
            int i80 = i79 % 2;
        }
        if (zBooleanValue2) {
            int i81 = E0;
            int i82 = ((i81 ^ 105) - (~((i81 & 105) << 1))) - 1;
            F0 = i82 % 128;
            int i83 = i82 % 2;
            int i84 = afdVar3.v0;
            if (i83 == 0) {
                ((Integer) aeb.setX(new Object[]{Integer.valueOf(i84)}, 111418850, -111418837, i84)).intValue();
                throw null;
            }
            iIntValue = ((Integer) aeb.setX(new Object[]{Integer.valueOf(i84)}, 111418850, -111418837, i84)).intValue();
            int i85 = F0;
            int i86 = (((i85 ^ 33) | (i85 & 33)) << 1) - (((~i85) & 33) | (i85 & (-34)));
            E0 = i86 % 128;
            int i87 = i86 % 2;
        } else {
            int i88 = E0;
            int i89 = i88 & 125;
            int i90 = (i88 | 125) & (~i89);
            int i91 = -(-(i89 << 1));
            int i92 = ((i90 | i91) << 1) - (i90 ^ i91);
            F0 = i92 % 128;
            int i93 = i92 % 2;
        }
        int i94 = (iB - (~iIntValue)) - 1;
        int i95 = E0;
        int i96 = ((i95 ^ 50) + ((i95 & 50) << 1)) - 1;
        F0 = i96 % 128;
        int i97 = i96 % 2;
        return Integer.valueOf(i94);
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setY(new Object[]{this, Boolean.valueOf(z10)}, 1510535932, -1510535932, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setY(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 1495549377, -1495549376, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aeh
    public final aed f(ady adyVar) {
        return (aed) setY(new Object[]{this, adyVar}, 1306116990, -1306116988, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setY(new Object[]{this}, -1173572675, 1173572678, System.identityHashCode(this))).booleanValue();
    }
}
