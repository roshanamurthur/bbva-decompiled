package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bew extends IllegalStateException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f54665p0;

    public bew(String str, Exception exc) {
        super(str);
        this.f54665p0 = exc;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return ((bew) objArr[0]).f54665p0;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (Throwable) setOnFocusChangeListener(new Object[]{this}, 1987940497, -1987940497, System.identityHashCode(this));
    }
}
