package com.mypinpad.tsdk.isolation;

/* JADX INFO: loaded from: classes10.dex */
public final class unregisterForContextMenu implements onPinPadLaunchRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f61388a;

    public unregisterForContextMenu(long j10) {
        this.f61388a = j10;
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) {
        return Long.valueOf(((unregisterForContextMenu) objArr[0]).f61388a);
    }

    public final long setOnFocusChangeListener() {
        return ((Long) setY(new Object[]{this}, -1131266999, 1131266999, System.identityHashCode(this))).longValue();
    }
}
