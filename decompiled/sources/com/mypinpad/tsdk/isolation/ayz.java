package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ayz extends ayt {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54181s0;

    public ayz(ayu ayuVar, byte[] bArr) {
        super(false, ayuVar);
        this.f54181s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{((ayz) objArr[0]).f54181s0}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setY(new Object[]{this}, -8039635, 8039635, System.identityHashCode(this));
    }
}
