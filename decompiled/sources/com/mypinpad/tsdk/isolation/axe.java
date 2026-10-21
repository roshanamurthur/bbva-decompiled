package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class axe extends axc {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f54089t0 = 0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f54090u0 = 1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54091s0;

    public axe(axd axdVar, byte[] bArr) {
        super(false, axdVar);
        this.f54091s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        axe axeVar = (axe) objArr[0];
        int i13 = f54090u0;
        int i14 = i13 & 29;
        int i15 = i13 | 29;
        int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
        f54089t0 = i16 % 128;
        int i17 = i16 % 2;
        byte[] bArr = (byte[]) bek.setOnFocusChangeListener(new Object[]{axeVar.f54091s0}, -150521869, 150521882, (int) System.currentTimeMillis());
        int i18 = f54089t0;
        int i19 = i18 | 117;
        int i20 = (i19 << 1) - ((~(i18 & 117)) & i19);
        f54090u0 = i20 % 128;
        int i21 = i20 % 2;
        return bArr;
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, 2049260060, -2049260060, System.identityHashCode(this));
    }
}
