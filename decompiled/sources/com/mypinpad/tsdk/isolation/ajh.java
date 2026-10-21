package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ajh extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f52879s0 = 0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52880t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ajg[] f52881r0;

    public ajh(aed aedVar) {
        this.f52881r0 = new ajg[aedVar.setCompoundDrawableTintBlendMode()];
        int i10 = 0;
        while (i10 != aedVar.setCompoundDrawableTintBlendMode()) {
            this.f52881r0[i10] = (ajg) ajg.setY(new Object[]{aedVar.setX(i10)}, -614136404, 614136407, (int) System.currentTimeMillis());
            int i11 = (((i10 | (-29)) << 1) - (i10 ^ (-29))) - 1;
            int i12 = i11 & 31;
            i10 = (i12 << 1) + ((i11 | 31) & (~i12));
        }
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        Object afvVar;
        int i13 = ~i10;
        int i14 = (~((~i11) | i13)) | i12;
        int i15 = ~(i10 | i11);
        int i16 = ((i11 | (~(i12 | i13))) * 376) + (((~(i10 | (~i12))) | i15) * (-376)) + ((i14 | i15) * 376) + (i11 * (-375)) + (i10 * (-375));
        if (i16 == 1) {
            ajh ajhVar = (ajh) objArr[0];
            StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
            String str = (String) bez.setX(new Object[0], 464644689, -464644689, (int) System.currentTimeMillis());
            stringBuffer.append(str);
            int i17 = f52880t0;
            int i18 = ((i17 | 51) << 1) - (i17 ^ 51);
            f52879s0 = i18 % 128;
            int i19 = i18 % 2;
            int i20 = 0;
            while (true) {
                ajg[] ajgVarArr = ajhVar.f52881r0;
                if (i20 == ajgVarArr.length) {
                    break;
                }
                int i21 = f52879s0;
                int i22 = i21 ^ 55;
                int i23 = (i21 & 55) << 1;
                int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                f52880t0 = i24 % 128;
                int i25 = i24 % 2;
                stringBuffer.append("    ");
                if (i25 == 0) {
                    stringBuffer.append(ajgVarArr[i20]);
                    stringBuffer.append(str);
                    i20 = ((i20 | 40) << 1) - (i20 ^ 40);
                } else {
                    stringBuffer.append(ajgVarArr[i20]);
                    stringBuffer.append(str);
                    int i26 = (i20 ^ (-127)) + ((i20 & (-127)) << 1);
                    i20 = (i26 ^ 128) + ((i26 & 128) << 1);
                }
                System.identityHashCode(ajhVar);
                System.identityHashCode(ajhVar);
            }
            String string = stringBuffer.toString();
            int i27 = f52880t0;
            int i28 = (i27 & 25) + (i27 | 25);
            f52879s0 = i28 % 128;
            if (i28 % 2 == 0) {
                return string;
            }
            int i29 = 99 / 0;
            return string;
        }
        if (i16 == 2) {
            ajg[] ajgVarArr2 = (ajg[]) objArr[0];
            int i30 = f52879s0;
            int i31 = (i30 | 101) << 1;
            int i32 = -(((~i30) & 101) | (i30 & (-102)));
            int i33 = (i31 ^ i32) + ((i32 & i31) << 1);
            f52880t0 = i33 % 128;
            int i34 = i33 % 2;
            ajg[] ajgVarArr3 = new ajg[ajgVarArr2.length];
            if (i34 == 0) {
                System.arraycopy(ajgVarArr2, 1, ajgVarArr3, 1, ajgVarArr2.length);
            } else {
                System.arraycopy(ajgVarArr2, 0, ajgVarArr3, 0, ajgVarArr2.length);
            }
            int i35 = f52880t0;
            int i36 = i35 ^ 99;
            int i37 = -(-((99 & i35) << 1));
            int i38 = (i36 & i37) + (i37 | i36);
            f52879s0 = i38 % 128;
            int i39 = i38 % 2;
            return ajgVarArr3;
        }
        if (i16 == 3) {
            afvVar = new afv(((ajh) objArr[0]).f52881r0);
            int i40 = f52879s0;
            int i41 = (i40 & (-86)) | ((~i40) & 85);
            int i42 = (i40 & 85) << 1;
            int i43 = (i41 ^ i42) + ((i42 & i41) << 1);
            f52880t0 = i43 % 128;
            int i44 = i43 % 2;
        } else if (i16 == 4) {
            afvVar = new ajh(aed.setOnFocusChangeListener((aeh) objArr[0], false));
            int i45 = f52879s0 + 103;
            f52880t0 = i45 % 128;
            if (i45 % 2 == 0) {
                int i46 = 31 / 0;
            }
        } else {
            if (i16 != 5) {
                ajh ajhVar2 = (ajh) objArr[0];
                int i47 = f52880t0;
                int i48 = i47 & 87;
                int i49 = (i47 ^ 87) | i48;
                int i50 = (i48 & i49) + (i49 | i48);
                f52879s0 = i50 % 128;
                int i51 = i50 % 2;
                ajg[] ajgVarArr4 = (ajg[]) setDividerPadding(new Object[]{ajhVar2.f52881r0}, 260565022, -260565020, (int) System.currentTimeMillis());
                int i52 = f52880t0;
                int i53 = (i52 & 9) + (i52 | 9);
                f52879s0 = i53 % 128;
                if (i53 % 2 == 0) {
                    return ajgVarArr4;
                }
                int i54 = 26 / 0;
                return ajgVarArr4;
            }
            Object obj = objArr[0];
            int i55 = f52880t0;
            int i56 = i55 ^ 21;
            int i57 = (((i55 & 21) | i56) << 1) - i56;
            int i58 = i57 % 128;
            f52879s0 = i58;
            int i59 = i57 % 2;
            if (obj instanceof ajh) {
                int i60 = i55 & 19;
                int i61 = (i55 | 19) & (~i60);
                int i62 = i60 << 1;
                int i63 = (i61 ^ i62) + ((i61 & i62) << 1);
                f52879s0 = i63 % 128;
                ajh ajhVar3 = (ajh) obj;
                if (i63 % 2 == 0) {
                    return ajhVar3;
                }
                throw null;
            }
            if (obj == null) {
                int i64 = (-2) - ((i58 + 114) ^ (-1));
                f52880t0 = i64 % 128;
                int i65 = i64 % 2;
                return null;
            }
            afvVar = new ajh(aed.setCompoundDrawableTintBlendMode(obj));
            int i66 = f52880t0;
            int i67 = i66 ^ 119;
            int i68 = -(-((i66 & 119) << 1));
            int i69 = (i67 & i68) + (i68 | i67);
            f52879s0 = i69 % 128;
            if (i69 % 2 != 0) {
                int i70 = 33 / 0;
            }
        }
        return afvVar;
    }

    public static ajh setY(Object obj) {
        return (ajh) setDividerPadding(new Object[]{obj}, 1669444485, -1669444480, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setDividerPadding(new Object[]{this}, -1055848798, 1055848801, System.identityHashCode(this));
    }

    public final ajg[] setOnFocusChangeListener() {
        return (ajg[]) setDividerPadding(new Object[]{this}, -1505918645, 1505918645, System.identityHashCode(this));
    }

    public final String toString() {
        return (String) setDividerPadding(new Object[]{this}, 553948175, -553948174, System.identityHashCode(this));
    }

    public static ajh setDividerPadding(aeh aehVar) {
        return (ajh) setDividerPadding(new Object[]{aehVar}, -875421438, 875421442, (int) System.currentTimeMillis());
    }
}
