package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class agm extends aeh {
    public static int E0 = 0;
    public static int F0 = 1;

    public agm(boolean z10, int i10, add addVar) {
        super(z10, i10, addVar);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    /* JADX WARN: Code duplicated, block: B:67:0x032a  */
    /* JADX WARN: Code duplicated, block: B:69:0x033e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0342  */
    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws IOException {
        int i13;
        Boolean bool;
        int i14 = (((~(i10 | i12)) | (~i11)) * 529) + (((~((~i12) | i10)) | (~(i10 | i11))) * 529) + (i11 * 530) + (i10 * 530) + 1058;
        int iIntValue = 0;
        if (i14 == 1) {
            agm agmVar = (agm) objArr[0];
            int i15 = E0 + 71;
            F0 = i15 % 128;
            int i16 = i15 % 2;
            if (agmVar.setOnFocusChangeListener()) {
                int i17 = F0;
                int i18 = i17 & 85;
                int i19 = (i17 | 85) & (~i18);
                int i20 = i18 << 1;
                i13 = (i19 ^ i20) + ((i19 & i20) << 1);
                E0 = i13 % 128;
                if (i13 % 2 == 0) {
                    throw null;
                }
                bool = Boolean.TRUE;
            } else {
                int i21 = E0 + 63;
                F0 = i21 % 128;
                int i22 = i21 % 2;
                ady adyVarA = agmVar.f52545w0.UiMessageCallbackKtWhenMappings().a();
                if (i22 == 0) {
                    adyVarA.setY();
                    throw null;
                }
                if (adyVarA.setY()) {
                    int i110 = F0;
                    int i111 = i110 & 85;
                    int i112 = (i110 | 85) & (~i111);
                    int i23 = i111 << 1;
                    i13 = (i112 ^ i23) + ((i112 & i23) << 1);
                    E0 = i13 % 128;
                    if (i13 % 2 == 0) {
                        throw null;
                    }
                    bool = Boolean.TRUE;
                } else {
                    int i24 = F0;
                    int i25 = i24 & 35;
                    int i26 = i25 + ((i24 ^ 35) | i25);
                    E0 = i26 % 128;
                    if (i26 % 2 != 0) {
                        throw null;
                    }
                    bool = Boolean.FALSE;
                }
            }
            return bool;
        }
        if (i14 == 2) {
            agm agmVar2 = (agm) objArr[0];
            int i27 = (-2) - ((E0 + 98) ^ (-1));
            int i28 = i27 % 128;
            F0 = i28;
            if (i27 % 2 == 0) {
                int i29 = 18 / 0;
            }
            int i30 = i28 & 113;
            int i31 = (i28 | 113) & (~i30);
            int i32 = i30 << 1;
            int i33 = (i31 & i32) + (i32 | i31);
            E0 = i33 % 128;
            int i34 = i33 % 2;
            return agmVar2;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                agi agiVar = new agi((ady) objArr[1]);
                int i35 = F0;
                int i36 = (i35 ^ 25) + ((i35 & 25) << 1);
                E0 = i36 % 128;
                if (i36 % 2 == 0) {
                    return agiVar;
                }
                int i37 = 50 / 0;
                return agiVar;
            }
            agm agmVar3 = (agm) objArr[0];
            aeb aebVar = (aeb) objArr[1];
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            int i38 = F0;
            int i39 = i38 ^ 27;
            int i40 = ((i38 & 27) | i39) << 1;
            int i41 = -i39;
            int i42 = (i40 & i41) + (i40 | i41);
            E0 = i42 % 128;
            int i43 = i42 % 2;
            ady adyVarA2 = agmVar3.f52545w0.UiMessageCallbackKtWhenMappings().a();
            boolean onFocusChangeListener = agmVar3.setOnFocusChangeListener();
            if (zBooleanValue) {
                int i44 = E0;
                int i45 = i44 & 41;
                int i46 = -(-((i44 ^ 41) | i45));
                int i47 = (i45 ^ i46) + ((i46 & i45) << 1);
                F0 = i47 % 128;
                int i48 = i47 % 2;
                int i49 = agmVar3.f52544u0;
                if (i48 == 0) {
                    int i50 = 2 / 0;
                    if (!onFocusChangeListener) {
                        if (!(!adyVarA2.setY())) {
                        }
                    }
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(i49), Integer.valueOf(agmVar3.v0)}, 1688519098, -1688519092, i49);
                    int i51 = E0 + 49;
                    F0 = i51 % 128;
                    int i52 = i51 % 2;
                } else {
                    if (!onFocusChangeListener) {
                        if (!(!adyVarA2.setY())) {
                        }
                    }
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(i49), Integer.valueOf(agmVar3.v0)}, 1688519098, -1688519092, i49);
                    int i53 = E0 + 49;
                    F0 = i53 % 128;
                    int i54 = i53 % 2;
                }
                i49 = (i49 & 32) | (i49 ^ 32);
                int i55 = E0;
                int i56 = ((i55 | 89) << 1) - (i55 ^ 89);
                F0 = i56 % 128;
                int i57 = i56 % 2;
                aeb.setX(new Object[]{aebVar, Integer.valueOf(i49), Integer.valueOf(agmVar3.v0)}, 1688519098, -1688519092, i49);
                int i58 = E0 + 49;
                F0 = i58 % 128;
                int i59 = i58 % 2;
            }
            if (onFocusChangeListener) {
                int i60 = E0;
                int i61 = ((i60 ^ 33) | (i60 & 33)) << 1;
                int i62 = -(((~i60) & 33) | (i60 & (-34)));
                int i63 = ((i61 | i62) << 1) - (i62 ^ i61);
                F0 = i63 % 128;
                if (i63 % 2 == 0) {
                    int iB = adyVarA2.b(true);
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(iB)}, 1357165778, -1357165764, iB);
                } else {
                    int iB2 = adyVarA2.b(true);
                    aeb.setX(new Object[]{aebVar, Integer.valueOf(iB2)}, 1357165778, -1357165764, iB2);
                }
                int i64 = F0;
                int i65 = i64 & 93;
                int i66 = ((i64 ^ 93) | i65) << 1;
                int i67 = -((i64 | 93) & (~i65));
                int i68 = (i66 ^ i67) + ((i67 & i66) << 1);
                E0 = i68 % 128;
                int i69 = i68 % 2;
            }
            adyVarA2.c(aebVar.h(), onFocusChangeListener);
            int i70 = F0;
            int i71 = ((i70 ^ 99) - (~(-(-((i70 & 99) << 1))))) - 1;
            E0 = i71 % 128;
            int i72 = i71 % 2;
            return null;
        }
        agm agmVar4 = (agm) objArr[0];
        boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
        int i73 = E0;
        int i74 = (i73 | 85) << 1;
        int i75 = -((85 & (~i73)) | (i73 & (-86)));
        int i76 = (i74 & i75) + (i75 | i74);
        F0 = i76 % 128;
        if (i76 % 2 == 0) {
            agmVar4.f52545w0.UiMessageCallbackKtWhenMappings().a().b(agmVar4.setOnFocusChangeListener());
            throw null;
        }
        ady adyVarA3 = agmVar4.f52545w0.UiMessageCallbackKtWhenMappings().a();
        boolean onFocusChangeListener2 = agmVar4.setOnFocusChangeListener();
        int iB3 = adyVarA3.b(onFocusChangeListener2);
        if (!(!onFocusChangeListener2)) {
            int i77 = -(-((Integer) aeb.setX(new Object[]{Integer.valueOf(iB3)}, 1896945642, -1896945627, iB3)).intValue());
            int i78 = iB3 & i77;
            int i79 = -(-(iB3 | i77));
            iB3 = (i79 | i78) + (i78 & i79);
            int i80 = E0 + 31;
            F0 = i80 % 128;
            int i81 = i80 % 2;
        }
        if (zBooleanValue2) {
            int i82 = F0 + 85;
            E0 = i82 % 128;
            int i83 = i82 % 2;
            int i84 = agmVar4.v0;
            if (i83 != 0) {
                ((Integer) aeb.setX(new Object[]{Integer.valueOf(i84)}, 111418850, -111418837, i84)).intValue();
                throw null;
            }
            iIntValue = ((Integer) aeb.setX(new Object[]{Integer.valueOf(i84)}, 111418850, -111418837, i84)).intValue();
            int i85 = E0;
            int i86 = i85 ^ 59;
            int i87 = (i85 & 59) << 1;
            int i88 = ((i86 | i87) << 1) - (i87 ^ i86);
            F0 = i88 % 128;
            int i89 = i88 % 2;
        } else {
            int i90 = E0;
            int i91 = ((i90 | 109) << 1) - (i90 ^ 109);
            F0 = i91 % 128;
            int i92 = i91 % 2;
        }
        int iIdentityHashCode = System.identityHashCode(agmVar4);
        int i93 = iIntValue * 51;
        int i94 = -(-(iB3 * (-49)));
        int i95 = (i93 & i94) + (i93 | i94);
        int i96 = iIntValue & iIdentityHashCode;
        int i97 = (~i96) & (iIntValue | iIdentityHashCode);
        int i98 = ~iIdentityHashCode;
        int i99 = ((i96 & i97) | (i97 ^ i96)) * (-50);
        int i100 = ((i95 | i99) << 1) - (i99 ^ i95);
        int i101 = ~iIntValue;
        int i102 = i101 & (i101 | iIntValue);
        int i103 = ~iB3;
        int i104 = ~i103;
        int i105 = (i102 & i104) | ((~i102) & i103);
        int i106 = i102 & i103;
        int i107 = (i106 & i105) | (i105 ^ i106);
        int i108 = ~((i107 & iIdentityHashCode) | (i107 ^ iIdentityHashCode));
        int i109 = (i104 & i98) | ((~i98) & i103);
        int i113 = i103 & i98;
        int i114 = (i109 & i113) | (i109 ^ i113);
        int i115 = ~((i114 & iIntValue) | (i114 ^ iIntValue));
        int i116 = ((i108 & i115) | (i108 ^ i115)) * 50;
        int i117 = (i100 & i116) + (i116 | i100);
        int i118 = (i103 | iB3) & i103;
        int i119 = (iIdentityHashCode | i98) & i98;
        int i120 = i118 & i119;
        int i121 = ~(((i119 | i118) & (~i120)) | i120);
        int i122 = ~(i103 | iIntValue);
        int i123 = i121 & i122;
        int i124 = (i121 | i122) & (~i123);
        int i125 = (i124 & i123) | (i124 ^ i123);
        int i126 = i98 | iIntValue;
        int i127 = ~i126;
        int i128 = (i126 | i127) & i127;
        int i129 = ((~i128) & i125) | ((~i125) & i128);
        int i130 = i125 & i128;
        int i131 = (i117 - (~(-(~(-(-(((i130 & i129) | (i129 ^ i130)) * 50))))))) - 1;
        int i132 = (i131 ^ (-1)) + (i131 << 1);
        int i133 = F0;
        int i134 = (i133 & (-24)) | ((~i133) & 23);
        int i135 = -(-((i133 & 23) << 1));
        int i136 = (i134 & i135) + (i135 | i134);
        E0 = i136 % 128;
        int i137 = i136 % 2;
        return Integer.valueOf(i132);
    }

    @Override // com.mypinpad.tsdk.isolation.aeh, com.mypinpad.tsdk.isolation.ady
    public final ady a() {
        return (ady) setX(new Object[]{this}, -548568055, 548568057, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final int b(boolean z10) throws IOException {
        return ((Integer) setX(new Object[]{this, Boolean.valueOf(z10)}, 1829543238, -1829543235, System.identityHashCode(this))).intValue();
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final void c(aeb aebVar, boolean z10) throws IOException {
        setX(new Object[]{this, aebVar, Boolean.valueOf(z10)}, 84719562, -84719562, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.aeh
    public final aed f(ady adyVar) {
        return (aed) setX(new Object[]{this, adyVar}, -1463913753, 1463913757, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.ady
    public final boolean setY() {
        return ((Boolean) setX(new Object[]{this}, 870587214, -870587213, System.identityHashCode(this))).booleanValue();
    }
}
