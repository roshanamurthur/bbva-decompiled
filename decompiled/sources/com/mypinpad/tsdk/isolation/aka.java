package com.mypinpad.tsdk.isolation;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes10.dex */
public final class aka extends adw implements akf {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52985u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final aph f52986r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f52987s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public adu f52988t0;

    public aka(ake akeVar, BigInteger bigInteger, BigInteger bigInteger2, aed aedVar) {
        int iIntValue;
        int iIntValue2;
        int i10;
        this.f52988t0 = null;
        adu aduVar = (adu) ake.setY(new Object[]{akeVar}, -1045465378, 1045465379, System.identityHashCode(akeVar));
        this.f52988t0 = aduVar;
        if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, akf.setCompoundDrawableTintBlendMode}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue()) {
            adp adpVar = (adp) ((ady) ake.setY(new Object[]{akeVar}, -1604615837, 1604615837, System.identityHashCode(akeVar)));
            this.f52986r0 = new aph.setX((BigInteger) adp.setOnFocusChangeListener(new Object[]{adpVar}, 1599682974, -1599682960, System.identityHashCode(adpVar)), new BigInteger(1, ads.setX(aedVar.setX(0)).setCompoundDrawableTintBlendMode()), new BigInteger(1, ads.setX(aedVar.setX(1)).setCompoundDrawableTintBlendMode()), bigInteger, bigInteger2);
        } else {
            adu aduVar2 = this.f52988t0;
            if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, akf.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                throw new IllegalArgumentException("This type of ECCurve is not implemented");
            }
            aed aedVar2 = (aed) aed.setY(new Object[]{(ady) ake.setY(new Object[]{akeVar}, -1604615837, 1604615837, System.identityHashCode(akeVar))}, 691787085, -691787084, (int) System.currentTimeMillis());
            adp adpVar2 = (adp) aedVar2.setX(0);
            int iIntValue3 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -2079758436, 2079758436, System.identityHashCode(adpVar2))).intValue();
            adu aduVar3 = (adu) aedVar2.setX(1);
            if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar3, akf.setOnFocusChangeListener}, -109201153, 109201153, System.identityHashCode(aduVar3))).booleanValue()) {
                adp adpVar3 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar2.setX(2)}, -837021952, 837021958, (int) System.currentTimeMillis());
                iIntValue2 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar3}, -2079758436, 2079758436, System.identityHashCode(adpVar3))).intValue();
                i10 = 0;
                iIntValue = 0;
            } else {
                if (!((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar3, akf.setOnDragListener}, -109201153, 109201153, System.identityHashCode(aduVar3))).booleanValue()) {
                    throw new IllegalArgumentException("This type of EC basis is not implemented");
                }
                aed aedVar3 = (aed) aed.setY(new Object[]{aedVar2.setX(2)}, 691787085, -691787084, (int) System.currentTimeMillis());
                adp adpVar4 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar3.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
                int iIntValue4 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar4}, -2079758436, 2079758436, System.identityHashCode(adpVar4))).intValue();
                adp adpVar5 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar3.setX(1)}, -837021952, 837021958, (int) System.currentTimeMillis());
                int iIntValue5 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar5}, -2079758436, 2079758436, System.identityHashCode(adpVar5))).intValue();
                adp adpVar6 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar3.setX(2)}, -837021952, 837021958, (int) System.currentTimeMillis());
                iIntValue = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar6}, -2079758436, 2079758436, System.identityHashCode(adpVar6))).intValue();
                iIntValue2 = iIntValue4;
                i10 = iIntValue5;
            }
            this.f52986r0 = new aph.setCompoundDrawableTintBlendMode(iIntValue3, iIntValue2, i10, iIntValue, new BigInteger(1, ads.setX(aedVar.setX(0)).setCompoundDrawableTintBlendMode()), new BigInteger(1, ads.setX(aedVar.setX(1)).setCompoundDrawableTintBlendMode()), bigInteger, bigInteger2);
        }
        if (aedVar.setCompoundDrawableTintBlendMode() == 3) {
            afk afkVar = (afk) aedVar.setX(2);
            this.f52987s0 = (byte[]) acz.setDividerPadding(new Object[]{afkVar}, -2004692391, 2004692392, System.identityHashCode(afkVar));
        }
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        Object afvVar;
        int i13 = (~i10) | i11;
        int i14 = ~i13;
        int i15 = ~i12;
        int i16 = (((~(i10 | i15)) | (~((~i11) | i10)) | (~(i13 | i12))) * 140) + ((i14 | (~(i15 | i11))) * (-280)) + ((i11 | i12) * 140) + (i11 * (-279)) + (i10 * 141);
        if (i16 == 1) {
            aka akaVar = (aka) objArr[0];
            int i17 = v0;
            int i18 = ((i17 & (-82)) | ((~i17) & 81)) + ((81 & i17) << 1);
            f52985u0 = i18 % 128;
            int i19 = i18 % 2;
            byte[] bArr = akaVar.f52987s0;
            if (i19 != 0) {
                throw null;
            }
            byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
            int i20 = v0;
            int i21 = ((i20 | 49) << 1) - (i20 ^ 49);
            f52985u0 = i21 % 128;
            if (i21 % 2 == 0) {
                return bArr2;
            }
            int i22 = 72 / 0;
            return bArr2;
        }
        if (i16 == 2) {
            aka akaVar2 = (aka) objArr[0];
            adh adhVar = new adh(3);
            adu aduVar = akaVar2.f52988t0;
            boolean zBooleanValue = ((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar, akf.setCompoundDrawableTintBlendMode}, -109201153, 109201153, System.identityHashCode(aduVar))).booleanValue();
            aph aphVar = akaVar2.f52986r0;
            if (zBooleanValue) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new akd((apk) aph.setX(new Object[]{aphVar}, -277774148, 277774152, System.identityHashCode(aphVar))).UiMessageCallbackKtWhenMappings()}, 240298319, -240298315, System.identityHashCode(adhVar));
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new akd((apk) aph.setX(new Object[]{aphVar}, -1036175453, 1036175463, System.identityHashCode(aphVar))).UiMessageCallbackKtWhenMappings()}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i23 = v0;
                int i24 = ((i23 ^ 17) | (i23 & 17)) << 1;
                int i25 = -(((~i23) & 17) | (i23 & (-18)));
                int i26 = ((i24 | i25) << 1) - (i25 ^ i24);
                f52985u0 = i26 % 128;
                int i27 = i26 % 2;
            } else {
                adu aduVar2 = akaVar2.f52988t0;
                if (((Boolean) ady.setNavigationOnClickListener(new Object[]{aduVar2, akf.setDividerPadding}, -109201153, 109201153, System.identityHashCode(aduVar2))).booleanValue()) {
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new akd((apk) aph.setX(new Object[]{aphVar}, -277774148, 277774152, System.identityHashCode(aphVar))).UiMessageCallbackKtWhenMappings()}, 240298319, -240298315, System.identityHashCode(adhVar));
                    adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new akd((apk) aph.setX(new Object[]{aphVar}, -1036175453, 1036175463, System.identityHashCode(aphVar))).UiMessageCallbackKtWhenMappings()}, 240298319, -240298315, System.identityHashCode(adhVar));
                    int i28 = f52985u0;
                    int i29 = i28 & 85;
                    int i30 = i29 + ((i28 ^ 85) | i29);
                    v0 = i30 % 128;
                    int i31 = i30 % 2;
                }
            }
            byte[] bArr3 = akaVar2.f52987s0;
            if (bArr3 != null) {
                adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new afk(bArr3)}, 240298319, -240298315, System.identityHashCode(adhVar));
                int i32 = f52985u0;
                int i33 = i32 & 17;
                int i34 = (i33 - (~((i32 ^ 17) | i33))) - 1;
                v0 = i34 % 128;
                int i35 = i34 % 2;
            }
            afvVar = new afv(adhVar);
            int i36 = v0;
            int i37 = (i36 & (-12)) | ((~i36) & 11);
            int i38 = (i36 & 11) << 1;
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f52985u0 = i39 % 128;
            if (i39 % 2 != 0) {
                throw null;
            }
        } else {
            if (i16 != 3) {
                aka akaVar3 = (aka) objArr[0];
                int i40 = f52985u0;
                int i41 = i40 & 3;
                int i42 = ((i40 ^ 3) | i41) << 1;
                int i43 = -((i40 | 3) & (~i41));
                int i44 = (i42 ^ i43) + ((i43 & i42) << 1);
                v0 = i44 % 128;
                int i45 = i44 % 2;
                if (!((Boolean) api.setX(new Object[]{akaVar3.f52986r0}, 2068174862, -2068174856, (int) System.currentTimeMillis())).booleanValue()) {
                    if (!((Boolean) api.setX(new Object[]{akaVar3.f52986r0}, 784073018, -784073015, (int) System.currentTimeMillis())).booleanValue()) {
                        throw new IllegalArgumentException("This type of ECCurve is not implemented");
                    }
                    int i46 = f52985u0;
                    int i47 = ((i46 & (-28)) | ((~i46) & 27)) + ((i46 & 27) << 1);
                    int i48 = i47 % 128;
                    v0 = i48;
                    int i49 = i47 % 2;
                    akaVar3.f52988t0 = akf.setDividerPadding;
                    int i50 = i48 & 79;
                    int i51 = i50 + ((i48 ^ 79) | i50);
                    f52985u0 = i51 % 128;
                    int i52 = i51 % 2;
                    return null;
                }
                int i53 = f52985u0;
                int i54 = i53 & 89;
                int i55 = (i53 ^ 89) | i54;
                int i56 = (i54 & i55) + (i55 | i54);
                int i57 = i56 % 128;
                v0 = i57;
                int i58 = i56 % 2;
                akaVar3.f52988t0 = akf.setCompoundDrawableTintBlendMode;
                int i59 = i57 & 11;
                int i60 = -(-(i57 | 11));
                int i61 = (i59 ^ i60) + ((i59 & i60) << 1);
                f52985u0 = i61 % 128;
                int i62 = i61 % 2;
                return null;
            }
            aka akaVar4 = (aka) objArr[0];
            int i63 = f52985u0;
            int i64 = ((i63 & 28) + (i63 | 28)) - 1;
            v0 = i64 % 128;
            int i65 = i64 % 2;
            afvVar = akaVar4.f52986r0;
            int i66 = i63 & 81;
            int i67 = i66 + ((81 ^ i63) | i66);
            v0 = i67 % 128;
            if (i67 % 2 == 0) {
                throw null;
            }
        }
        return afvVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -1637768020, 1637768022, System.identityHashCode(this));
    }

    public final aph setOnFocusChangeListener() {
        return (aph) setX(new Object[]{this}, 1388224118, -1388224115, System.identityHashCode(this));
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, 861568773, -861568772, System.identityHashCode(this));
    }

    public aka(aph aphVar, byte[] bArr) {
        this.f52988t0 = null;
        this.f52986r0 = aphVar;
        this.f52987s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        setX(new Object[]{this}, -556657632, 556657632, System.identityHashCode(this));
    }
}
