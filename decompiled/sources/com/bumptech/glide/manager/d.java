package com.bumptech.glide.manager;

import com.bumptech.glide.util.Util;

/* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f38733p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ c.d.a f38734q0;

    public d(c.d.a aVar, boolean z10) {
        this.f38734q0 = aVar;
        this.f38733p0 = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c.d.a aVar = this.f38734q0;
        aVar.getClass();
        Util.assertMainThread();
        c.d dVar = c.d.this;
        boolean z10 = dVar.f38718a;
        boolean z11 = this.f38733p0;
        dVar.f38718a = z11;
        if (z10 != z11) {
            dVar.f38719b.onConnectivityChanged(z11);
        }
    }
}
