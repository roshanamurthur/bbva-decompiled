package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ayd extends amw {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final byte[] f54148r0;

    public ayd(byte[] bArr) {
        super(false);
        this.f54148r0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{((ayd) objArr[0]).f54148r0}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setDividerPadding(new Object[]{this}, -726179413, 726179413, System.identityHashCode(this));
    }
}
