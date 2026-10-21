package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setOnScrollListener extends notifyAll {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f60256b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f60257a;

    public setOnScrollListener(long j10) {
        super(null);
        this.f60257a = j10;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        setOnScrollListener setonscrolllistener = (setOnScrollListener) objArr[0];
        int i13 = f60256b;
        int i14 = i13 & 81;
        int i15 = ((i13 ^ 81) | i14) << 1;
        int i16 = -((i13 | 81) & (~i14));
        int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
        int i18 = i17 % 128;
        int i19 = i17 % 2;
        long j10 = setonscrolllistener.f60257a;
        int i20 = (-2) - (((i18 ^ 46) + ((i18 & 46) << 1)) ^ (-1));
        f60256b = i20 % 128;
        int i21 = i20 % 2;
        return Long.valueOf(j10);
    }

    public final long setCompoundDrawableTintBlendMode() {
        return ((Long) setY(new Object[]{this}, -652295806, 652295806, System.identityHashCode(this))).longValue();
    }
}
