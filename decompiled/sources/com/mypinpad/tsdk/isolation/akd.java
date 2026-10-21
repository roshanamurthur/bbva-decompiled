package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class akd extends adw {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final int f52995s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f52996t0 = 1;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final apk f52997r0;

    static {
        new akc();
        int i10 = f52996t0;
        int i11 = i10 & 113;
        int i12 = ((((i10 ^ 113) | i11) << 1) - (~(-((i10 | 113) & (~i11))))) - 1;
        f52995s0 = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 45 / 0;
        }
    }

    public akd(apk apkVar) {
        this.f52997r0 = apkVar;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        akd akdVar = (akd) objArr[0];
        int iIntValue = ((Integer) akc.setDividerPadding(new Object[]{akdVar.f52997r0}, -545325898, 545325899, (int) System.currentTimeMillis())).intValue();
        aft aftVar = new aft((byte[]) akc.setDividerPadding(new Object[]{akdVar.f52997r0.setCompoundDrawableTintBlendMode(), Integer.valueOf(iIntValue)}, 51287140, -51287140, iIntValue));
        int i13 = f52995s0 + 25;
        f52996t0 = i13 % 128;
        if (i13 % 2 != 0) {
            return aftVar;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.adw, com.mypinpad.tsdk.isolation.add
    public final ady UiMessageCallbackKtWhenMappings() {
        return (ady) setX(new Object[]{this}, -153551342, 153551342, System.identityHashCode(this));
    }
}
