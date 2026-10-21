package com.bumptech.glide.manager;

/* JADX INFO: compiled from: SingletonConnectivityReceiver.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ boolean f38736p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ c.e f38737q0;

    public f(c.e eVar, boolean z10) {
        this.f38737q0 = eVar;
        this.f38736p0 = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38737q0.f38725b.onConnectivityChanged(this.f38736p0);
    }
}
