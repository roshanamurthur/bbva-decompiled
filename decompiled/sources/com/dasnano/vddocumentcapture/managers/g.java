package com.dasnano.vddocumentcapture.managers;

/* JADX INFO: compiled from: UserVisualHelpManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ UserVisualHelpManager f39457p0;

    public g(UserVisualHelpManager userVisualHelpManager) {
        this.f39457p0 = userVisualHelpManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39457p0.f39411b.setVisibility(8);
    }
}
