package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class axn extends axg {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54097s0;

    public axn(axi axiVar, byte[] bArr) {
        super(true, axiVar);
        this.f54097s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{((axn) objArr[0]).f54097s0}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, 2136256723, -2136256723, System.identityHashCode(this));
    }
}
