package com.mypinpad.tsdk.isolation;

import androidx.databinding.c;

/* JADX INFO: loaded from: classes10.dex */
public final class avu extends adw {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54009u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final adp f54010r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int f54011s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final aiw f54012t0;

    public avu(aed aedVar) {
        this.f54010r0 = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(0)}, -837021952, 837021958, (int) System.currentTimeMillis());
        adp adpVar = (adp) adp.setOnFocusChangeListener(new Object[]{aedVar.setX(1)}, -837021952, 837021958, (int) System.currentTimeMillis());
        this.f54011s0 = ((Integer) adp.setOnFocusChangeListener(new Object[]{adpVar}, -2079758436, 2079758436, System.identityHashCode(adpVar))).intValue();
        this.f54012t0 = (aiw) aiw.setOnFocusChangeListener(new Object[]{aedVar.setX(2)}, 866360717, -866360713, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ~i10;
        int i14 = ~(i13 | i12);
        int i15 = ~i12;
        int i16 = ((i14 | (~(i15 | i11))) * (-1808)) + (i11 * (-903)) + (i10 * 905);
        int i17 = ~i11;
        int i18 = i10 | i15;
        int i19 = (((~i18) | (~(i11 | i13)) | (~(i12 | i17))) * 904) + (((~(i18 | i11)) | (~(i13 | i17 | i12))) * 904) + i16;
        if (i19 == 1) {
            avu avuVar = (avu) objArr[0];
            adh adhVar = new adh();
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, avuVar.f54010r0}, 240298319, -240298315, System.identityHashCode(adhVar));
            adh.setCompoundDrawableTintBlendMode(new Object[]{adhVar, new adp(avuVar.f54011s0)}, 240298319, -240298315, System.identityHashCode(adhVar));
            afv afvVarA = c.a(adhVar, new Object[]{adhVar, avuVar.f54012t0}, 240298319, -240298315, adhVar);
            int i20 = f54009u0;
            int i21 = (((i20 ^ 49) | (i20 & 49)) << 1) - (((~i20) & 49) | (i20 & (-50)));
            v0 = i21 % 128;
            int i22 = i21 % 2;
            return afvVarA;
        }
        if (i19 == 2) {
            avu avuVar2 = (avu) objArr[0];
            int i23 = v0;
            int i24 = i23 & 27;
            int i25 = (i24 - (~((i23 ^ 27) | i24))) - 1;
            f54009u0 = i25 % 128;
            int i26 = i25 % 2;
            int i27 = avuVar2.f54011s0;
            if (i26 == 0) {
                return Integer.valueOf(i27);
            }
            throw null;
        }
        if (i19 == 3) {
            avu avuVar3 = (avu) objArr[0];
            int i28 = f54009u0;
            int i29 = i28 + 121;
            v0 = i29 % 128;
            int i30 = i29 % 2;
            aiw aiwVar = avuVar3.f54012t0;
            int i31 = i28 + 98;
            int i32 = (i31 ^ (-1)) + (i31 << 1);
            v0 = i32 % 128;
            int i33 = i32 % 2;
            return aiwVar;
        }
        Object obj = objArr[0];
        int i34 = f54009u0;
        int i35 = ((i34 | 27) << 1) - (i34 ^ 27);
        int i36 = i35 % 128;
        v0 = i36;
        if (i35 % 2 == 0) {
            boolean z10 = obj instanceof avu;
            throw null;
        }
        if (obj instanceof avu) {
            int i37 = i36 + 11;
            f54009u0 = i37 % 128;
            avu avuVar4 = (avu) obj;
            if (i37 % 2 != 0) {
                int i38 = 48 / 0;
            }
            return avuVar4;
        }
        if (obj == null) {
            int i39 = (i34 & 43) + (i34 | 43);
            v0 = i39 % 128;
            if (i39 % 2 != 0) {
                return null;
            }
            int i40 = 70 / 0;
            return null;
        }
        avu avuVar5 = new avu(aed.setCompoundDrawableTintBlendMode(obj));
        int i41 = v0;
        int i42 = i41 & 25;
        int i43 = ((((i41 ^ 25) | i42) << 1) - (~(-((i41 | 25) & (~i42))))) - 1;
        f54009u0 = i43 % 128;
        int i44 = i43 % 2;
        return avuVar5;
    }

    public static avu setY(Object obj) {
        return (avu) setX(new Object[]{obj}, -1683941502, 1683941502, (int) System.currentTimeMillis());
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -143201959, 143201960, System.identityHashCode(this));
    }

    public final int setDividerPadding() {
        return ((Integer) setX(new Object[]{this}, 950834872, -950834870, System.identityHashCode(this))).intValue();
    }

    public final aiw setOnFocusChangeListener() {
        return (aiw) setX(new Object[]{this}, 1408999976, -1408999973, System.identityHashCode(this));
    }

    public avu(int i10, aiw aiwVar) {
        this.f54010r0 = new adp(0L);
        this.f54011s0 = i10;
        this.f54012t0 = aiwVar;
    }
}
