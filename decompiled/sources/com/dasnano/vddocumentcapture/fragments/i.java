package com.dasnano.vddocumentcapture.fragments;

/* JADX INFO: compiled from: DocumentFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DocumentFragment f39371p0;

    public i(DocumentFragment documentFragment) {
        this.f39371p0 = documentFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39371p0.userVisualHelpManager.hideTickImageView();
    }
}
