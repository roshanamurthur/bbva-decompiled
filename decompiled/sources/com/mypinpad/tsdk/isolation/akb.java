package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class akb extends adw {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f52989u0 = 0;
    public static int v0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final aft f52990r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final aph f52991s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public apl f52992t0;

    public akb(aph aphVar, ads adsVar) {
        this(aphVar, adsVar.setCompoundDrawableTintBlendMode());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        akb akbVar = (akb) objArr[0];
        int i13 = v0;
        int i14 = i13 | 113;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 113)) & i14);
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = i17 % 128;
        f52989u0 = i18;
        int i19 = i17 % 2;
        aft aftVar = akbVar.f52990r0;
        if (i19 != 0) {
            throw null;
        }
        int i20 = i18 + 117;
        v0 = i20 % 128;
        int i21 = i20 % 2;
        return aftVar;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, 1484501038, -1484501038, System.identityHashCode(this));
    }

    public akb(aph aphVar, byte[] bArr) {
        this.f52991s0 = aphVar;
        this.f52990r0 = new aft((byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis()));
    }

    public final synchronized apl setX() {
        try {
            int i10 = f52989u0;
            int i11 = i10 & 111;
            int i12 = ((i10 ^ 111) | i11) << 1;
            int i13 = -((i10 | 111) & (~i11));
            int i14 = (i12 & i13) + (i13 | i12);
            v0 = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (this.f52992t0 == null) {
                aph aphVar = this.f52991s0;
                aft aftVar = this.f52990r0;
                apl aplVar = (apl) aph.setX(new Object[]{aphVar, (byte[]) ads.setDividerPadding(new Object[]{aftVar}, -952512304, 952512305, System.identityHashCode(aftVar))}, 390612441, -390612434, System.identityHashCode(aphVar));
                this.f52992t0 = (apl) apl.setOnFocusChangeListener(new Object[]{aplVar}, 1013204546, -1013204533, System.identityHashCode(aplVar));
                int i15 = v0;
                int i16 = i15 & 25;
                int i17 = (i15 | 25) & (~i16);
                int i18 = -(-(i16 << 1));
                int i19 = ((i17 | i18) << 1) - (i17 ^ i18);
                f52989u0 = i19 % 128;
                int i20 = i19 % 2;
            }
            apl aplVar2 = this.f52992t0;
            int i21 = v0;
            int i22 = i21 | 7;
            int i23 = i22 << 1;
            int i24 = -((~(i21 & 7)) & i22);
            int i25 = (i23 & i24) + (i24 | i23);
            f52989u0 = i25 % 128;
            if (i25 % 2 == 0) {
                return aplVar2;
            }
            int i26 = 53 / 0;
            return aplVar2;
        } catch (Throwable th2) {
            throw th2;
        }
        throw th2;
    }

    public akb(apl aplVar) {
        this.f52992t0 = (apl) apl.setOnFocusChangeListener(new Object[]{aplVar}, 1013204546, -1013204533, System.identityHashCode(aplVar));
        this.f52990r0 = new aft((byte[]) apl.setOnFocusChangeListener(new Object[]{aplVar, Boolean.FALSE}, -866502364, 866502380, System.identityHashCode(aplVar)));
    }
}
