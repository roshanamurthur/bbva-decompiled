package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class azr extends azo {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54212t0;

    public azr(byte[] bArr, String str) {
        super(true, str);
        this.f54212t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{((azr) objArr[0]).f54212t0}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public final byte[] setY() {
        return (byte[]) setX(new Object[]{this}, -1255903986, 1255903986, System.identityHashCode(this));
    }
}
