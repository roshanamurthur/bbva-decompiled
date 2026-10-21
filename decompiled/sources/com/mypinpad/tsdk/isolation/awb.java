package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class awb extends awc {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final byte[] f54040t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final byte[] f54041u0;
    public final byte[] v0;

    public awb(awa awaVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        super(true, awaVar);
        this.f54040t0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.f54041u0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr2}, -150521869, 150521882, (int) System.currentTimeMillis());
        this.v0 = (byte[]) bek.setOnFocusChangeListener(new Object[]{bArr3}, -150521869, 150521882, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        awb awbVar = (awb) objArr[0];
        return (byte[]) bek.setOnFocusChangeListener(new Object[]{awbVar.f54040t0, awbVar.f54041u0, awbVar.v0}, -271182023, 271182030, (int) System.currentTimeMillis());
    }

    public final byte[] setY() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, -42266507, 42266507, System.identityHashCode(this));
    }
}
