package com.mypinpad.tsdk.isolation;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ahq extends adw implements ahv {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52668u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adu f52669r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public add f52670s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f52671t0 = true;

    public ahq(adu aduVar, add addVar) {
        this.f52669r0 = aduVar;
        this.f52670s0 = addVar;
    }

    public static ahq setCompoundDrawableTintBlendMode(Object obj) {
        return (ahq) setX(new Object[]{obj}, 650865733, -650865733, (int) System.currentTimeMillis());
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object agiVar;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        if ((((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167)) != 1) {
            Object obj = objArr[0];
            int i18 = v0;
            int i19 = i18 & 101;
            int i20 = ((i18 | 101) & (~i19)) + (i19 << 1);
            int i21 = i20 % 128;
            f52668u0 = i21;
            int i22 = i20 % 2;
            if (!(obj instanceof ahq)) {
                if (obj == null) {
                    int i23 = (((i21 ^ 17) | (i21 & 17)) << 1) - ((i21 & (-18)) | ((~i21) & 17));
                    v0 = i23 % 128;
                    int i24 = i23 % 2;
                    return null;
                }
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                ahq ahqVar = new ahq();
                ahqVar.f52671t0 = true;
                Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
                ahqVar.f52669r0 = (adu) dividerPadding.nextElement();
                if (dividerPadding.hasMoreElements()) {
                    aeh aehVar = (aeh) dividerPadding.nextElement();
                    ahqVar.f52670s0 = (adw) aeh.setOnFocusChangeListener(new Object[]{aehVar}, 872654789, -872654774, System.identityHashCode(aehVar));
                }
                ahqVar.f52671t0 = compoundDrawableTintBlendMode instanceof aey;
                int i25 = v0;
                int i26 = (i25 ^ 65) + ((i25 & 65) << 1);
                f52668u0 = i26 % 128;
                int i27 = i26 % 2;
                return ahqVar;
            }
            int i28 = (i21 & 113) + (i21 | 113);
            int i29 = i28 % 128;
            v0 = i29;
            int i30 = i28 % 2;
            agiVar = (ahq) obj;
            int i31 = (-2) - (((i29 & 42) + (i29 | 42)) ^ (-1));
            f52668u0 = i31 % 128;
            if (i31 % 2 != 0) {
                throw null;
            }
        } else {
            ahq ahqVar2 = (ahq) objArr[0];
            adh adhVar = new adh(2);
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahqVar2.f52669r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            add addVar = ahqVar2.f52670s0;
            if (addVar != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afd(addVar)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i32 = v0;
                int i33 = (i32 & (-2)) | ((~i32) & 1);
                int i34 = (i32 & 1) << 1;
                int i35 = (i33 ^ i34) + ((i34 & i33) << 1);
                f52668u0 = i35 % 128;
                int i36 = i35 % 2;
            }
            if (ahqVar2.f52671t0) {
                agiVar = new aey(adhVar);
                int i37 = f52668u0;
                int i38 = (i37 ^ 69) + ((i37 & 69) << 1);
                v0 = i38 % 128;
                int i39 = i38 % 2;
            } else {
                agiVar = new agi(adhVar);
                int i40 = v0;
                int i41 = i40 & 3;
                int i42 = i41 + ((i40 ^ 3) | i41);
                f52668u0 = i42 % 128;
                if (i42 % 2 != 0) {
                    int i43 = 38 / 0;
                }
            }
        }
        return agiVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -559590289, 559590290, System.identityHashCode(this));
    }
}
