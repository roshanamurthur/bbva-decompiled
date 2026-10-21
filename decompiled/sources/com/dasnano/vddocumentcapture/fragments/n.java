package com.dasnano.vddocumentcapture.fragments;

/* JADX INFO: compiled from: DocumentFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ DocumentFragment f39380p0;

    public n(DocumentFragment documentFragment) {
        this.f39380p0 = documentFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39380p0.showValidationTick();
    }
}
