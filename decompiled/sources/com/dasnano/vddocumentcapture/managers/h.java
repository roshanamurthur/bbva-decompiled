package com.dasnano.vddocumentcapture.managers;

/* JADX INFO: compiled from: UserVisualHelpManager.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ UserVisualHelpManager f39458p0;

    public h(UserVisualHelpManager userVisualHelpManager) {
        this.f39458p0 = userVisualHelpManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39458p0.f39411b.setVisibility(0);
    }
}
