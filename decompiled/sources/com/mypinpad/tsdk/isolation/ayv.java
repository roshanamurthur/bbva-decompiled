package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ayv extends ayo {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54175t0;

    public ayv(ayr ayrVar, byte[] bArr) {
        super(false, ayrVar);
        this.f54175t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{((ayv) objArr[0]).f54175t0}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public final byte[] setDividerPadding() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 939728964, -939728964, System.identityHashCode(this));
    }
}
