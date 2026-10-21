package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class aim extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52793s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52794t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public aee f52795r0;

    public static Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) throws IOException, CloneNotSupportedException {
        Object compoundDrawableTintBlendMode;
        int i13 = ~i10;
        int i14 = ~(i13 | i11);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-108)) + (i11 * (-107)) + (i10 * 55);
        int i17 = ~(i13 | i12);
        int i18 = ~((~i11) | i10);
        int i19 = ((i18 | i12) * 54) + (((~(i10 | i15)) | i17 | i18) * 54) + i16;
        if (i19 == 1) {
            aim aimVar = (aim) objArr[0];
            int i20 = f52794t0;
            int i21 = ((i20 & 44) + (i20 | 44)) - 1;
            f52793s0 = i21 % 128;
            int i22 = i21 % 2;
            aee aeeVar = aimVar.f52795r0;
            int iIntValue = ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar}, -1113602318, 1113602320, System.identityHashCode(aeeVar))).intValue();
            int i23 = f52794t0 + 87;
            f52793s0 = i23 % 128;
            int i24 = i23 % 2;
            return Integer.valueOf(iIntValue);
        }
        Object obj = null;
        if (i19 == 2) {
            Object obj2 = objArr[0];
            int i25 = f52794t0;
            int i26 = ((i25 ^ 117) | (i25 & 117)) << 1;
            int i27 = -((i25 & (-118)) | ((~i25) & 117));
            int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
            int i29 = i28 % 128;
            f52793s0 = i29;
            int i30 = i28 % 2;
            if (!(!(obj2 instanceof aim))) {
                int i31 = (((i29 & (-40)) | ((~i29) & 39)) - (~(-(-((i29 & 39) << 1))))) - 1;
                f52794t0 = i31 % 128;
                aim aimVar2 = (aim) obj2;
                if (i31 % 2 == 0) {
                    int i32 = 61 / 0;
                }
                obj = aimVar2;
            } else if (obj2 != null) {
                aee aeeVar2 = (aee) aee.setCompoundDrawableTintBlendMode(new Object[]{obj2}, -156503718, 156503719, (int) System.currentTimeMillis());
                aim aimVar3 = new aim();
                aimVar3.f52795r0 = aeeVar2;
                int i33 = f52794t0;
                int i34 = i33 & 47;
                int i35 = (i33 ^ 47) | i34;
                int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
                f52793s0 = i36 % 128;
                if (i36 % 2 != 0) {
                    throw null;
                }
                obj = aimVar3;
            } else {
                int i37 = (i25 & 16) + (i25 | 16);
                int i38 = (i37 ^ (-1)) + (i37 << 1);
                f52793s0 = i38 % 128;
                if (i38 % 2 != 0) {
                    int i39 = 3 / 0;
                }
            }
        } else {
            if (i19 != 3) {
                if (i19 == 4) {
                    aim aimVar4 = (aim) objArr[0];
                    int i40 = f52793s0;
                    int i41 = (i40 ^ 35) + ((i40 & 35) << 1);
                    f52794t0 = i41 % 128;
                    int i42 = i41 % 2;
                    aee aeeVar3 = aimVar4.f52795r0;
                    if (((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar3}, -1113602318, 1113602320, System.identityHashCode(aeeVar3))).intValue() <= 1) {
                        int i43 = f52793s0;
                        int i44 = i43 & 45;
                        int i45 = (i43 | 45) & (~i44);
                        int i46 = i44 << 1;
                        int i47 = (i45 & i46) + (i45 | i46);
                        f52794t0 = i47 % 128;
                        if (i47 % 2 != 0) {
                            return Boolean.FALSE;
                        }
                        throw null;
                    }
                    int i48 = f52793s0;
                    int i49 = (-2) - ((((i48 | 24) << 1) - (i48 ^ 24)) ^ (-1));
                    f52794t0 = i49 % 128;
                    int i50 = i49 % 2;
                    int i51 = i48 ^ 3;
                    int i52 = -(-((i48 & 3) << 1));
                    int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
                    f52794t0 = i53 % 128;
                    int i54 = i53 % 2;
                    return Boolean.TRUE;
                }
                if (i19 != 5) {
                    aim aimVar5 = (aim) objArr[0];
                    int i55 = f52793s0;
                    int i56 = i55 + 58;
                    int i57 = (i56 ^ (-1)) + (i56 << 1);
                    f52794t0 = i57 % 128;
                    int i58 = i57 % 2;
                    aee aeeVar4 = aimVar5.f52795r0;
                    if (i58 == 0) {
                        throw null;
                    }
                    int i59 = i55 + 59;
                    f52794t0 = i59 % 128;
                    int i60 = i59 % 2;
                    return aeeVar4;
                }
                aim aimVar6 = (aim) objArr[0];
                int i61 = f52793s0 + 65;
                f52794t0 = i61 % 128;
                if (i61 % 2 == 0) {
                    aee aeeVar5 = aimVar6.f52795r0;
                    compoundDrawableTintBlendMode = aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar5}, -1113602318, 1113602320, System.identityHashCode(aeeVar5));
                } else {
                    aee aeeVar6 = aimVar6.f52795r0;
                    compoundDrawableTintBlendMode = aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar6}, -1113602318, 1113602320, System.identityHashCode(aeeVar6));
                }
                aii[] aiiVarArr = new aii[((Integer) compoundDrawableTintBlendMode).intValue()];
                int i62 = f52793s0;
                int i63 = (i62 & 125) + (i62 | 125);
                f52794t0 = i63 % 128;
                int i64 = i63 % 2;
                int i65 = 0;
                while (i65 != aiiVarArr.length) {
                    int i66 = f52794t0;
                    int i67 = i66 & 97;
                    int i68 = (((i66 ^ 97) | i67) << 1) - ((i66 | 97) & (~i67));
                    f52793s0 = i68 % 128;
                    int i69 = i68 % 2;
                    aiiVarArr[i65] = (aii) aii.setCompoundDrawableTintBlendMode(new Object[]{(add) aee.setCompoundDrawableTintBlendMode(new Object[]{aimVar6.f52795r0, Integer.valueOf(i65)}, -1624993461, 1624993461, i65)}, 1255857609, -1255857607, (int) System.currentTimeMillis());
                    int i70 = (i65 | 1) << 1;
                    int i71 = -(((~i65) & 1) | (i65 & (-2)));
                    i65 = ((i71 & i70) << 1) + (i70 ^ i71);
                    int i72 = f52794t0;
                    int i73 = ((i72 & (-64)) | ((~i72) & 63)) + ((i72 & 63) << 1);
                    f52793s0 = i73 % 128;
                    int i74 = i73 % 2;
                }
                int i75 = f52794t0;
                int i76 = (i75 ^ 105) + ((i75 & 105) << 1);
                f52793s0 = i76 % 128;
                if (i76 % 2 != 0) {
                    int i77 = 26 / 0;
                }
                return aiiVarArr;
            }
            aim aimVar7 = (aim) objArr[0];
            int i78 = f52793s0;
            int i79 = i78 & 57;
            int i80 = i78 | 57;
            int i81 = (i79 & i80) + (i80 | i79);
            f52794t0 = i81 % 128;
            if (i81 % 2 == 0) {
                aee aeeVar7 = aimVar7.f52795r0;
                ((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar7}, -1113602318, 1113602320, System.identityHashCode(aeeVar7))).intValue();
                throw null;
            }
            aee aeeVar8 = aimVar7.f52795r0;
            if (((Integer) aee.setCompoundDrawableTintBlendMode(new Object[]{aeeVar8}, -1113602318, 1113602320, System.identityHashCode(aeeVar8))).intValue() == 0) {
                int i82 = f52793s0 + 85;
                f52794t0 = i82 % 128;
                if (i82 % 2 == 0) {
                    throw null;
                }
            } else {
                obj = (aii) aii.setCompoundDrawableTintBlendMode(new Object[]{(add) aee.setCompoundDrawableTintBlendMode(new Object[]{aimVar7.f52795r0, 0}, -1624993461, 1624993461, 0)}, 1255857609, -1255857607, (int) System.currentTimeMillis());
                int i83 = f52793s0;
                int i84 = ((i83 & 96) + (i83 | 96)) - 1;
                f52794t0 = i84 % 128;
                if (i84 % 2 == 0) {
                    int i85 = 24 / 0;
                }
            }
        }
        return obj;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, -375118409, 375118409, System.identityHashCode(this));
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, 1665474108, -1665474107, System.identityHashCode(this))).intValue();
    }

    public final aii[] setX() {
        return (aii[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1291608961, -1291608956, System.identityHashCode(this));
    }

    public final boolean setY() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, -366917963, 366917967, System.identityHashCode(this))).booleanValue();
    }

    public static aim setY(Object obj) {
        return (aim) setCompoundDrawableTintBlendMode(new Object[]{obj}, -1233003478, 1233003480, (int) System.currentTimeMillis());
    }

    public final aii setCompoundDrawableTintBlendMode() {
        return (aii) setCompoundDrawableTintBlendMode(new Object[]{this}, -410583318, 410583321, System.identityHashCode(this));
    }
}
