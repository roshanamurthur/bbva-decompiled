package com.mypinpad.tsdk.isolation;

import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class adk extends IOException {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Throwable f52474p0;

    public adk(String str, Throwable th2) {
        super(str);
        this.f52474p0 = th2;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
        return ((adk) objArr[0]).f52474p0;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return (Throwable) setX(new Object[]{this}, 1142949537, -1142949537, System.identityHashCode(this));
    }

    public adk(String str) {
        super(str);
    }
}
