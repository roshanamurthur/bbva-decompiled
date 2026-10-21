package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class setWebContentsDebuggingEnabled implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f60821a;

    public setWebContentsDebuggingEnabled(boolean z10) {
        this.f60821a = z10;
    }

    public static /* synthetic */ Object setCompoundDrawableTintBlendMode(Object[] objArr, int i10, int i11, int i12) {
        return Boolean.valueOf(((setWebContentsDebuggingEnabled) objArr[0]).f60821a);
    }

    public final boolean setCompoundDrawableTintBlendMode() {
        return ((Boolean) setCompoundDrawableTintBlendMode(new Object[]{this}, 1295836975, -1295836975, System.identityHashCode(this))).booleanValue();
    }
}
