package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class ann implements akk {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final byte[] f53333p0;

    public ann(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        this.f53333p0 = bArr2;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return ((ann) objArr[0]).f53333p0;
    }

    public final byte[] setCompoundDrawableTintBlendMode() {
        return (byte[]) setCompoundDrawableTintBlendMode(new Object[]{this}, 1947371801, -1947371801, System.identityHashCode(this));
    }

    public ann(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }
}
