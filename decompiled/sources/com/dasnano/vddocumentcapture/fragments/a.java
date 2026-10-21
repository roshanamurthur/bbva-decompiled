package com.dasnano.vddocumentcapture.fragments;

/* JADX INFO: compiled from: CheckDocumentFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CheckDocumentFragment f39359p0;

    public a(CheckDocumentFragment checkDocumentFragment) {
        this.f39359p0 = checkDocumentFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckDocumentFragment checkDocumentFragment = this.f39359p0;
        checkDocumentFragment.f39316s0.setVisibility(4);
        checkDocumentFragment.v0.setVisibility(4);
        checkDocumentFragment.f39318u0.setVisibility(4);
        checkDocumentFragment.f39319w0.setVisibility(4);
        checkDocumentFragment.f39317t0.setImageBitmap(null);
        checkDocumentFragment.v0.setEnabled(false);
        checkDocumentFragment.f39318u0.setEnabled(false);
        checkDocumentFragment.f39320x0.setVisibility(4);
        checkDocumentFragment.f39317t0.setVisibility(4);
    }
}
