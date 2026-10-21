package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class axs extends axm {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54104t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54105u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54106s0;

    public axs(axp axpVar, byte[] bArr) {
        super(axpVar);
        this.f54106s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        axs axsVar = (axs) objArr[0];
        int i13 = f54105u0;
        int i14 = (((i13 & (-16)) | ((~i13) & 15)) - (~(-(-((i13 & 15) << 1))))) - 1;
        f54104t0 = i14 % 128;
        int i15 = i14 % 2;
        byte[] bArr = axsVar.f54106s0;
        if (i15 != 0) {
            throw null;
        }
        byte[] bArr2 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i16 = f54104t0;
        int i17 = i16 & 51;
        int i18 = i16 | 51;
        int i19 = (i17 & i18) + (i18 | i17);
        f54105u0 = i19 % 128;
        if (i19 % 2 != 0) {
            return bArr2;
        }
        throw null;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setX(new Object[]{this}, 1657399956, -1657399956, System.identityHashCode(this));
    }
}
