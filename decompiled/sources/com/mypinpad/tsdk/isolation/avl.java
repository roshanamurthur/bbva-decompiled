package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avl extends adw {
    public static int v0 = 0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f53972w0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f53973r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f53974s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final bdv f53975t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final aiw f53976u0;

    public avl(aed aedVar) {
        adp adpVar = (adp) aedVar.setX(0);
        this.f53973r0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
        adp adpVar2 = (adp) aedVar.setX(1);
        this.f53974s0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar2}, -2079758436, 2079758436, System.identityHashCode(adpVar2))).intValue();
        this.f53975t0 = new bdv(((ads) aedVar.setX(2)).setCompoundDrawableTintBlendMode());
        this.f53976u0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{aedVar.setX(3)}, 866360717, -866360713, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        int i13;
        int i14 = ((i10 | i11) * (-470)) + (i11 * 471) + (i10 * 471);
        int i15 = ~i10;
        int i16 = ~i11;
        int i17 = (~(i15 | i16)) | (~(i16 | i12));
        int i18 = ~(i11 | (~i12) | i10);
        int i19 = (((~(i10 | i16 | i12)) | i18) * 470) + ((i17 | i18) * (-470)) + i14;
        avl avlVar = null;
        if (i19 == 1) {
            Object obj = objArr[0];
            int i20 = f53972w0;
            int i21 = i20 | 111;
            int i22 = i21 << 1;
            int i23 = -(i21 & (~(i20 & 111)));
            int i24 = ((i22 | i23) << 1) - (i23 ^ i22);
            v0 = i24 % 128;
            int i25 = i24 % 2;
            if (obj != null) {
                avlVar = new avl(aed.setCompoundDrawableTintBlendMode(obj));
                int i26 = v0;
                int i27 = i26 & 25;
                int i28 = (i26 ^ 25) | i27;
                i13 = (i27 ^ i28) + ((i28 & i27) << 1);
                f53972w0 = i13 % 128;
            } else {
                int i29 = i20 & 39;
                int i30 = ((i20 ^ 39) | i29) << 1;
                int i31 = -((i20 | 39) & (~i29));
                i13 = ((i30 | i31) << 1) - (i30 ^ i31);
                v0 = i13 % 128;
            }
            int i32 = i13 % 2;
            return avlVar;
        }
        if (i19 == 2) {
            avl avlVar2 = (avl) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avlVar2.f53973r0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avlVar2.f53974s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            bdv bdvVar = avlVar2.f53975t0;
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new aft((byte[]) bdv.setX(new Object[]{bdvVar}, 495164032, -495164032, System.identityHashCode(bdvVar)))}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, avlVar2.f53976u0}, 240298319, -240298315, adhVar);
            int i33 = f53972w0;
            int i34 = (i33 ^ 45) + ((i33 & 45) << 1);
            v0 = i34 % 128;
            int i35 = i34 % 2;
            return afvVarA;
        }
        if (i19 == 3) {
            avl avlVar3 = (avl) objArr[0];
            int i36 = f53972w0;
            int i37 = i36 & 61;
            int i38 = (i36 | 61) & (~i37);
            int i39 = i37 << 1;
            int i40 = (i38 & i39) + (i38 | i39);
            v0 = i40 % 128;
            int i41 = i40 % 2;
            bdv bdvVar2 = avlVar3.f53975t0;
            if (i41 == 0) {
                return bdvVar2;
            }
            throw null;
        }
        if (i19 == 4) {
            avl avlVar4 = (avl) objArr[0];
            int i42 = f53972w0;
            int i43 = (i42 & (-106)) | ((~i42) & 105);
            int i44 = (i42 & 105) << 1;
            int i45 = (i43 & i44) + (i44 | i43);
            v0 = i45 % 128;
            int i46 = i45 % 2;
            aiw aiwVar = avlVar4.f53976u0;
            if (i46 == 0) {
                return aiwVar;
            }
            throw null;
        }
        if (i19 == 5) {
            avl avlVar5 = (avl) objArr[0];
            int i47 = f53972w0;
            int i48 = i47 & 11;
            int i49 = ((((i47 ^ 11) | i48) << 1) - (~(-((i47 | 11) & (~i48))))) - 1;
            v0 = i49 % 128;
            int i50 = i49 % 2;
            int i51 = avlVar5.f53974s0;
            if (i50 == 0) {
                return Integer.valueOf(i51);
            }
            throw null;
        }
        avl avlVar6 = (avl) objArr[0];
        int i52 = f53972w0;
        int i53 = i52 ^ 121;
        int i54 = ((i52 & 121) | i53) << 1;
        int i55 = -i53;
        int i56 = (i54 ^ i55) + ((i55 & i54) << 1);
        v0 = i56 % 128;
        int i57 = i56 % 2;
        int i58 = avlVar6.f53973r0;
        int i59 = (i52 & 115) + (i52 | 115);
        v0 = i59 % 128;
        if (i59 % 2 == 0) {
            return Integer.valueOf(i58);
        }
        throw null;
    }

    public static avl setX(Object obj) {
        return (avl) setCompoundDrawableTintBlendMode(new Object[]{obj}, -111967668, 111967669, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setCompoundDrawableTintBlendMode(new Object[]{this}, 1920079711, -1920079709, System.identityHashCode(this));
    }

    public final aiw setDividerPadding() {
        return (aiw) setCompoundDrawableTintBlendMode(new Object[]{this}, -1412950737, 1412950741, System.identityHashCode(this));
    }

    public final int setOnFocusChangeListener() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -833990003, 833990003, System.identityHashCode(this))).intValue();
    }

    public final int setY() {
        return ((Integer) setCompoundDrawableTintBlendMode(new Object[]{this}, -1194635053, 1194635058, System.identityHashCode(this))).intValue();
    }

    public avl(int i10, int i11, bdv bdvVar, aiw aiwVar) {
        this.f53973r0 = i10;
        this.f53974s0 = i11;
        this.f53975t0 = new bdv((byte[]) bdv.setX(new Object[]{bdvVar}, 495164032, -495164032, System.identityHashCode(bdvVar)));
        this.f53976u0 = aiwVar;
    }

    public final bdv setCompoundDrawableTintBlendMode() {
        return (bdv) setCompoundDrawableTintBlendMode(new Object[]{this}, 157862228, -157862225, System.identityHashCode(this));
    }
}
