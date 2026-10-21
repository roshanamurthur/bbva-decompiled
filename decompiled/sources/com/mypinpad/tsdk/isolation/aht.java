package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class aht extends adw {
    public static int E0 = 0;
    public static int F0 = 1;
    public static final aiw v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final aiw f52676w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final adp f52677x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final adp f52678y0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public aiw f52679r0 = v0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aiw f52680s0 = f52676w0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public adp f52681t0 = f52677x0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public adp f52682u0 = f52678y0;

    static {
        aiw aiwVar = new aiw(ahr.setCompoundDrawableTintBlendMode, afq.setY);
        v0 = aiwVar;
        f52676w0 = new aiw(ahv.setOnFocusChangeListener, aiwVar);
        f52677x0 = new adp(20L);
        f52678y0 = new adp(1L);
        int i10 = E0;
        int i11 = i10 & 73;
        int i12 = ((i10 | 73) & (~i11)) + (i11 << 1);
        F0 = i12 % 128;
        int i13 = i12 % 2;
    }

    public static Object setY(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-448)) + (i10 * 450);
        int i14 = ~((~i10) | i11);
        int i15 = ~i11;
        int i16 = (((~(i10 | i15 | (~i12))) | i14) * 449) + (i14 * (-1347)) + (((~(i15 | i10 | i12)) | i14) * 449) + i13;
        adp adpVar = f52678y0;
        adp adpVar2 = f52677x0;
        aiw aiwVar = f52676w0;
        aiw aiwVar2 = v0;
        if (i16 == 1) {
            aht ahtVar = (aht) objArr[0];
            adh adhVar = new adh(4);
            if (!ahtVar.f52679r0.equals(aiwVar2)) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(true, 0, ahtVar.f52679r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i17 = F0;
                int i18 = (i17 ^ 77) + ((i17 & 77) << 1);
                E0 = i18 % 128;
                int i19 = i18 % 2;
            }
            aiw aiwVar3 = ahtVar.f52680s0;
            if (!aiwVar3.equals(aiwVar)) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(true, 1, aiwVar3)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i20 = F0;
                int i21 = (i20 & 115) + (i20 | 115);
                E0 = i21 % 128;
                int i22 = i21 % 2;
            }
            adp adpVar3 = ahtVar.f52681t0;
            if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{adpVar3, adpVar2}, -109201153, 109201153, System.identityHashCode(adpVar3))).booleanValue()) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(true, 2, adpVar3)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i23 = E0;
                int i24 = i23 ^ 53;
                int i25 = -(-((i23 & 53) << 1));
                int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
                F0 = i26 % 128;
                int i27 = i26 % 2;
            }
            adp adpVar4 = ahtVar.f52682u0;
            if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{adpVar4, adpVar}, -109201153, 109201153, System.identityHashCode(adpVar4))).booleanValue()) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(true, 3, adpVar4)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i28 = F0;
                int i29 = ((i28 | 121) << 1) - (i28 ^ 121);
                E0 = i29 % 128;
                int i30 = i29 % 2;
            }
            afv afvVar = new afv(adhVar);
            int i31 = F0;
            int i32 = i31 & 91;
            int i33 = (i31 | 91) & (~i32);
            int i34 = i32 << 1;
            int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
            E0 = i35 % 128;
            if (i35 % 2 == 0) {
                return afvVar;
            }
            int i36 = 27 / 0;
            return afvVar;
        }
        aht ahtVar2 = null;
        if (i16 != 2) {
            aht ahtVar3 = (aht) objArr[0];
            int i37 = E0;
            int i38 = i37 & 15;
            int i39 = (i37 ^ 15) | i38;
            int i40 = ((i38 | i39) << 1) - (i38 ^ i39);
            F0 = i40 % 128;
            int i41 = i40 % 2;
            aiw aiwVar4 = ahtVar3.f52679r0;
            int i42 = i37 & 123;
            int i43 = -(-((i37 ^ 123) | i42));
            int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
            F0 = i44 % 128;
            if (i44 % 2 != 0) {
                return aiwVar4;
            }
            throw null;
        }
        Object obj = objArr[0];
        int i45 = F0;
        int i46 = i45 + 121;
        E0 = i46 % 128;
        if (i46 % 2 != 0) {
            boolean z10 = obj instanceof aht;
            throw null;
        }
        if (obj instanceof aht) {
            ahtVar2 = (aht) obj;
            System.currentTimeMillis();
            System.currentTimeMillis();
        } else if (obj != null) {
            aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
            ahtVar2 = new aht();
            ahtVar2.f52679r0 = aiwVar2;
            ahtVar2.f52680s0 = aiwVar;
            ahtVar2.f52681t0 = adpVar2;
            ahtVar2.f52682u0 = adpVar;
            int i47 = 0;
            while (i47 != compoundDrawableTintBlendMode.setCompoundDrawableTintBlendMode()) {
                aeh aehVar = (aeh) compoundDrawableTintBlendMode.setX(i47);
                int iIntValue = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue();
                if (iIntValue == 0) {
                    ahtVar2.f52679r0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{aehVar}, -724080672, 724080672, (int) System.currentTimeMillis());
                } else if (iIntValue == 1) {
                    ahtVar2.f52680s0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{aehVar}, -724080672, 724080672, (int) System.currentTimeMillis());
                } else if (iIntValue == 2) {
                    ahtVar2.f52681t0 = (adp) adp.setOnFocusChangeListener(new Object[]{aehVar, Boolean.TRUE}, 522248224, -522248221, (int) System.currentTimeMillis());
                } else {
                    if (iIntValue != 3) {
                        throw new IllegalArgumentException("unknown tag");
                    }
                    ahtVar2.f52682u0 = (adp) adp.setOnFocusChangeListener(new Object[]{aehVar, Boolean.TRUE}, 522248224, -522248221, (int) System.currentTimeMillis());
                }
                int i48 = i47 & 1;
                int i49 = ((i47 ^ 1) | i48) << 1;
                int i50 = -((i47 | 1) & (~i48));
                i47 = ((i49 | i50) << 1) - (i50 ^ i49);
            }
            int i51 = F0;
            int i52 = (i51 ^ 48) + ((i51 & 48) << 1);
            int i53 = (i52 ^ (-1)) + (i52 << 1);
            E0 = i53 % 128;
            int i54 = i53 % 2;
        } else {
            int i55 = i45 | 69;
            int i56 = i55 << 1;
            int i57 = -(i55 & (~(i45 & 69)));
            int i58 = (i56 ^ i57) + ((i57 & i56) << 1);
            E0 = i58 % 128;
            if (i58 % 2 != 0) {
                int i59 = 75 / 0;
            }
        }
        return ahtVar2;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setY(new Object[]{this}, 1424419127, -1424419126, System.identityHashCode(this));
    }

    public final aiw setX() {
        return (aiw) setY(new Object[]{this}, -407865487, 407865487, System.identityHashCode(this));
    }

    public static aht setY(Object obj) {
        return (aht) setY(new Object[]{obj}, -2074451581, 2074451583, (int) System.currentTimeMillis());
    }
}
