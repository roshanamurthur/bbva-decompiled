package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class getDecimalSeparator extends setForeground {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f55759p0;

    public getDecimalSeparator(long j10) {
        super(null);
        this.f55759p0 = j10;
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        return Long.valueOf(((getDecimalSeparator) objArr[0]).f55759p0);
    }

    public final long setX() {
        return ((Long) setOnFocusChangeListener(new Object[]{this}, 1401997899, -1401997899, System.identityHashCode(this))).longValue();
    }
}
