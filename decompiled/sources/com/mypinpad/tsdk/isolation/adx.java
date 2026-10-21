package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class adx extends IllegalStateException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f52520p0;

    public adx(String str, Throwable th2) {
        super(str);
        this.f52520p0 = th2;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return ((adx) objArr[0]).f52520p0;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (Throwable) setY(new Object[]{this}, 1256319949, -1256319949, System.identityHashCode(this));
    }

    public adx(String str) {
        super(str);
    }
}
