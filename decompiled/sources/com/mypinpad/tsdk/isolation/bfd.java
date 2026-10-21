package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class bfd extends IllegalStateException {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f54684q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f54685p0;

    public bfd(String str, Exception exc) {
        super(str);
        this.f54685p0 = exc;
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        bfd bfdVar = (bfd) objArr[0];
        int i13 = f54684q0;
        int i14 = i13 | 123;
        int i15 = i14 << 1;
        int i16 = -((~(i13 & 123)) & i14);
        int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
        int i18 = i17 % 128;
        int i19 = i17 % 2;
        Throwable th2 = bfdVar.f54685p0;
        int i20 = i18 & 39;
        int i21 = -(-(i18 | 39));
        int i22 = (i20 ^ i21) + ((i21 & i20) << 1);
        f54684q0 = i22 % 128;
        if (i22 % 2 != 0) {
            int i23 = 12 / 0;
        }
        return th2;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (Throwable) setDividerPadding(new Object[]{this}, -336793573, 336793573, System.identityHashCode(this));
    }
}
