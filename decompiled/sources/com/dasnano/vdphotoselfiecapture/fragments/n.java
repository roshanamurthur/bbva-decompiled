package com.dasnano.vdphotoselfiecapture.fragments;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39676p0;

    public n(SelfieFragment selfieFragment) {
        this.f39676p0 = selfieFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SelfieFragment selfieFragment = this.f39676p0;
        if (selfieFragment.f39588p2) {
            selfieFragment.f39605z1.setVisibility(0);
        }
    }
}
