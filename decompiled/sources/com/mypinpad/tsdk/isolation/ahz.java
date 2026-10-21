package com.mypinpad.tsdk.isolation;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes10.dex */
public final class ahz extends adw implements ahv {

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static int f52732x0 = 0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static int f52733y0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public adp f52734r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public aee f52735s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ahq f52736t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public aee f52737u0;
    public aee v0 = null;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public aee f52738w0;

    public ahz(adp adpVar, aee aeeVar, ahq ahqVar, aee aeeVar2, aee aeeVar3) {
        this.f52734r0 = adpVar;
        this.f52735s0 = aeeVar;
        this.f52736t0 = ahqVar;
        this.f52737u0 = aeeVar2;
        this.f52738w0 = aeeVar3;
    }

    public static Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        int i16 = ~i12;
        int i17 = (~(i13 | i16)) | i15 | (~(i14 | i16));
        int i18 = i10 | i11;
        int i19 = ((i17 | (~(i18 | i12))) * (-84)) + (i11 * 85) + (i10 * 85);
        int i20 = i10 | (~(i12 | i14));
        int i21 = ~(i11 | i16);
        int i22 = ((i21 | (~i18)) * 84) + ((i20 | i21) * (-84)) + i19;
        ahz ahzVar = null;
        if (i22 == 1) {
            Object obj = objArr[0];
            int i23 = f52732x0;
            int i24 = ((i23 & (-116)) | ((~i23) & 115)) + ((i23 & 115) << 1);
            int i25 = i24 % 128;
            f52733y0 = i25;
            if (i24 % 2 == 0) {
                throw null;
            }
            if (obj != null) {
                aed compoundDrawableTintBlendMode = aed.setCompoundDrawableTintBlendMode(obj);
                ahzVar = new ahz();
                Enumeration dividerPadding = compoundDrawableTintBlendMode.setDividerPadding();
                ahzVar.f52734r0 = (adp) dividerPadding.nextElement();
                ahzVar.f52735s0 = (aee) dividerPadding.nextElement();
                ahzVar.f52736t0 = (ahq) ahq.setX(new Object[]{dividerPadding.nextElement()}, 650865733, -650865733, (int) System.currentTimeMillis());
                while (dividerPadding.hasMoreElements()) {
                    ady adyVar = (ady) dividerPadding.nextElement();
                    if (adyVar instanceof aeh) {
                        aeh aehVar = (aeh) adyVar;
                        int iIntValue = ((Integer) aeh.setOnFocusChangeListener(new Object[]{aehVar}, -1417963191, 1417963201, System.identityHashCode(aehVar))).intValue();
                        if (iIntValue == 0) {
                            ahzVar.f52737u0 = (aee) aee.setCompoundDrawableTintBlendMode(new Object[]{aehVar}, -474267233, 474267237, (int) System.currentTimeMillis());
                        } else {
                            if (iIntValue != 1) {
                                StringBuilder sb2 = new StringBuilder("unknown tag value ");
                                sb2.append(aehVar.setCompoundDrawableTintBlendMode());
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            ahzVar.v0 = (aee) aee.setCompoundDrawableTintBlendMode(new Object[]{aehVar}, -474267233, 474267237, (int) System.currentTimeMillis());
                        }
                    } else {
                        ahzVar.f52738w0 = (aee) adyVar;
                    }
                }
                int i26 = f52732x0;
                int i27 = (((i26 ^ 103) | (i26 & 103)) << 1) - (((~i26) & 103) | (i26 & (-104)));
                f52733y0 = i27 % 128;
                int i28 = i27 % 2;
            } else {
                int i29 = i25 & 105;
                int i30 = (((i25 ^ 105) | i29) << 1) - ((i25 | 105) & (~i29));
                f52732x0 = i30 % 128;
                if (i30 % 2 != 0) {
                    int i31 = 29 / 0;
                }
            }
            return ahzVar;
        }
        if (i22 == 2) {
            ahz ahzVar2 = (ahz) objArr[0];
            int i32 = f52733y0;
            int i33 = i32 & 121;
            int i34 = -(-((i32 ^ 121) | i33));
            int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
            f52732x0 = i35 % 128;
            int i36 = i35 % 2;
            aee aeeVar = ahzVar2.f52737u0;
            int i37 = ((i32 | 25) << 1) - (i32 ^ 25);
            f52732x0 = i37 % 128;
            if (i37 % 2 == 0) {
                return aeeVar;
            }
            throw null;
        }
        if (i22 != 3) {
            ahz ahzVar3 = (ahz) objArr[0];
            int i38 = f52732x0;
            int i39 = i38 & 91;
            int i40 = ((i38 ^ 91) | i39) << 1;
            int i41 = -((i38 | 91) & (~i39));
            int i42 = (i40 ^ i41) + ((i41 & i40) << 1);
            int i43 = i42 % 128;
            f52733y0 = i43;
            int i44 = i42 % 2;
            aee aeeVar2 = ahzVar3.v0;
            int i45 = i43 & 7;
            int i46 = ((((i43 ^ 7) | i45) << 1) - (~(-((i43 | 7) & (~i45))))) - 1;
            f52732x0 = i46 % 128;
            if (i46 % 2 == 0) {
                return aeeVar2;
            }
            throw null;
        }
        ahz ahzVar4 = (ahz) objArr[0];
        adh adhVar = new adh(6);
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahzVar4.f52734r0}, 240298319, -240298315, System.identityHashCode(adhVar));
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahzVar4.f52735s0}, 240298319, -240298315, System.identityHashCode(adhVar));
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahzVar4.f52736t0}, 240298319, -240298315, System.identityHashCode(adhVar));
        aee aeeVar3 = ahzVar4.f52737u0;
        if (aeeVar3 != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 0, aeeVar3)}, 240298319, -240298315, System.identityHashCode(adhVar));
            int i47 = f52732x0;
            int i48 = ((i47 | 113) << 1) - (i47 ^ 113);
            f52733y0 = i48 % 128;
            int i49 = i48 % 2;
        }
        aee aeeVar4 = ahzVar4.v0;
        if (aeeVar4 != null) {
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afx(false, 1, aeeVar4)}, 240298319, -240298315, System.identityHashCode(adhVar));
            int i50 = f52733y0;
            int i51 = ((i50 & 93) - (~(i50 | 93))) - 1;
            f52732x0 = i51 % 128;
            int i52 = i51 % 2;
        }
        adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, ahzVar4.f52738w0}, 240298319, -240298315, System.identityHashCode(adhVar));
        aey aeyVar = new aey(adhVar);
        int i53 = f52732x0;
        int i54 = i53 & 11;
        int i55 = i53 | 11;
        int i56 = (i54 & i55) + (i55 | i54);
        f52733y0 = i56 % 128;
        if (i56 % 2 != 0) {
            return aeyVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -1339530980, 1339530983, System.identityHashCode(this));
    }

    public final aee setCompoundDrawableTintBlendMode() {
        return (aee) setX(new Object[]{this}, 875563904, -875563904, System.identityHashCode(this));
    }

    public final aee setX() {
        return (aee) setX(new Object[]{this}, -730401705, 730401707, System.identityHashCode(this));
    }

    public static ahz setX(Object obj) {
        return (ahz) setX(new Object[]{obj}, 1328596349, -1328596348, (int) System.currentTimeMillis());
    }
}
