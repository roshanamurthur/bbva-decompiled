package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aiw extends adw {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52827t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52828u0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adu f52829r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public add f52830s0;

    public aiw(adu aduVar, add addVar) {
        this.f52829r0 = aduVar;
        this.f52830s0 = addVar;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-344)) + (i10 * (-344));
        int i14 = ~i10;
        int i15 = ~i11;
        int i16 = i14 | i15;
        int i17 = ((~(i16 | i12)) * 345) + (((~(i10 | i15)) | (~(i14 | (~i12)))) * 345) + (((~i16) | (~(i14 | i12))) * 345) + i13;
        aiw aiwVar = null;
        if (i17 == 1) {
            aiw aiwVar2 = (aiw) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, aiwVar2.f52829r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            add addVar = aiwVar2.f52830s0;
            if (addVar != null) {
                int i18 = f52828u0;
                int i19 = ((i18 & 71) - (~(-(-(i18 | 71))))) - 1;
                f52827t0 = i19 % 128;
                if (i19 % 2 != 0) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, addVar}, 240298319, -240298315, System.identityHashCode(adhVar));
                    throw null;
                }
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, addVar}, 240298319, -240298315, System.identityHashCode(adhVar));
            }
            afv afvVar = new afv(adhVar);
            int i20 = f52827t0;
            int i21 = i20 & 85;
            int i22 = -(-(i20 | 85));
            int i23 = (i21 & i22) + (i22 | i21);
            f52828u0 = i23 % 128;
            if (i23 % 2 != 0) {
                return afvVar;
            }
            throw null;
        }
        if (i17 == 2) {
            aiw aiwVar3 = (aiw) objArr[0];
            int i24 = f52827t0;
            int i25 = ((i24 ^ 12) + ((i24 & 12) << 1)) - 1;
            f52828u0 = i25 % 128;
            int i26 = i25 % 2;
            add addVar2 = aiwVar3.f52830s0;
            int i27 = i24 & 101;
            int i28 = (((i24 ^ 101) | i27) << 1) - ((i24 | 101) & (~i27));
            f52828u0 = i28 % 128;
            int i29 = i28 % 2;
            return addVar2;
        }
        if (i17 == 3) {
            aiw aiwVar4 = (aiw) objArr[0];
            int i30 = f52827t0;
            int i31 = i30 & 67;
            int i32 = i30 | 67;
            int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
            int i34 = i33 % 128;
            f52828u0 = i34;
            int i35 = i33 % 2;
            adu aduVar = aiwVar4.f52829r0;
            int i36 = ((i34 ^ 32) + ((i34 & 32) << 1)) - 1;
            f52827t0 = i36 % 128;
            int i37 = i36 % 2;
            return aduVar;
        }
        if (i17 != 4) {
            aeh aehVar = (aeh) objArr[0];
            int i38 = f52828u0;
            int i39 = i38 & 9;
            int i40 = i39 + ((i38 ^ 9) | i39);
            f52827t0 = i40 % 128;
            aiw aiwVar5 = (aiw) (i40 % 2 != 0 ? setOnFocusChangeListener(new Object[]{(aed) aed.setY(new Object[]{aehVar, Boolean.FALSE}, 113370947, -113370947, (int) System.currentTimeMillis())}, 866360717, -866360713, (int) System.currentTimeMillis()) : setOnFocusChangeListener(new Object[]{(aed) aed.setY(new Object[]{aehVar, Boolean.TRUE}, 113370947, -113370947, (int) System.currentTimeMillis())}, 866360717, -866360713, (int) System.currentTimeMillis()));
            int i41 = f52828u0;
            int i42 = (i41 ^ 69) + ((i41 & 69) << 1);
            f52827t0 = i42 % 128;
            int i43 = i42 % 2;
            return aiwVar5;
        }
        Object obj = objArr[0];
        int i44 = f52828u0;
        int i45 = (i44 ^ 77) + ((i44 & 77) << 1);
        f52827t0 = i45 % 128;
        if (i45 % 2 != 0) {
            boolean z10 = obj instanceof aiw;
            throw null;
        }
        if (obj instanceof aiw) {
            aiwVar = (aiw) obj;
            int i46 = i44 + 43;
            f52827t0 = i46 % 128;
            int i47 = i46 % 2;
        } else if (obj != null) {
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            aiw aiwVar6 = new aiw();
            if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() <= 0 || compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() > 2) {
                StringBuilder sb2 = new StringBuilder("Bad sequence size: ");
                sb2.append(compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode());
                throw new IllegalArgumentException(sb2.toString());
            }
            aiwVar6.f52829r0 = (adu) adu.setCompoundDrawableTintBlendMode(new Object[]{compoundDrawableTintBlendMode.setX(0)}, -892573455, 892573460, (int) System.currentTimeMillis());
            if (compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode() == 2) {
                aiwVar6.f52830s0 = compoundDrawableTintBlendMode.setX(1);
            } else {
                aiwVar6.f52830s0 = null;
            }
            int i48 = f52828u0 + 75;
            f52827t0 = i48 % 128;
            if (i48 % 2 != 0) {
                throw null;
            }
            aiwVar = aiwVar6;
        } else {
            int i49 = ((i44 | 75) << 1) - (((~i44) & 75) | (i44 & (-76)));
            f52827t0 = i49 % 128;
            int i50 = i49 % 2;
        }
        return aiwVar;
    }

    public static aiw setY(aeh aehVar) {
        return (aiw) setOnFocusChangeListener(new Object[]{aehVar}, -724080672, 724080672, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setOnFocusChangeListener(new Object[]{this}, -192932924, 192932925, System.identityHashCode(this));
    }

    public final add setCompoundDrawableTintBlendMode() {
        return (add) setOnFocusChangeListener(new Object[]{this}, -513456911, 513456913, System.identityHashCode(this));
    }

    public final adu setDividerPadding() {
        return (adu) setOnFocusChangeListener(new Object[]{this}, -661220858, 661220861, System.identityHashCode(this));
    }

    public aiw(adu aduVar) {
        this.f52829r0 = aduVar;
    }

    public static aiw setOnFocusChangeListener(Object obj) {
        return (aiw) setOnFocusChangeListener(new Object[]{obj}, 866360717, -866360713, (int) System.currentTimeMillis());
    }
}
