package com.mypinpad.tsdk.isolation;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setLogger extends setOrientation {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static int f60035q0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public final Throwable f60036p0;

    public setLogger(@Nullable Throwable th2) {
        super(null);
        this.f60036p0 = th2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        setLogger setlogger = (setLogger) objArr[0];
        int i13 = f60035q0;
        int i14 = i13 & 79;
        int i15 = (i14 - (~((i13 ^ 79) | i14))) - 1;
        int i16 = i15 % 128;
        int i17 = i15 % 2;
        Throwable th2 = setlogger.f60036p0;
        if (i17 == 0) {
            throw null;
        }
        int i18 = i16 & 33;
        int i19 = (i16 ^ 33) | i18;
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        f60035q0 = i20 % 128;
        int i21 = i20 % 2;
        return th2;
    }

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        return (Throwable) setX(new Object[]{this}, 1465711064, -1465711064, System.identityHashCode(this));
    }
}
