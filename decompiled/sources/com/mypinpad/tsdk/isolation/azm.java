package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class azm extends azl {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final byte[] f54206s0;

    public azm(azk azkVar, byte[] bArr) {
        super(true, azkVar);
        this.f54206s0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{((azm) objArr[0]).f54206s0}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public final byte[] setOnFocusChangeListener() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -1945720051, 1945720051, System.identityHashCode(this));
    }
}
