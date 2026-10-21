package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awj extends awc {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54044t0;

    public awj(awa awaVar, byte[] bArr) {
        super(false, awaVar);
        this.f54044t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{((awj) objArr[0]).f54044t0}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -2071768257, 2071768257, System.identityHashCode(this));
    }
}
