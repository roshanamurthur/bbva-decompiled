package com.google.android.material.snackbar;

/* JADX INFO: compiled from: BaseTransientBottomBar.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f45466p0;

    public h(BaseTransientBottomBar baseTransientBottomBar) {
        this.f45466p0 = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f45466p0.a(3);
    }
}
