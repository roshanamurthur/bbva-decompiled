package com.dasnano.vdphotoselfiecapture.fragments;

/* JADX INFO: compiled from: ShowSelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ShowSelfieFragment f39682p0;

    public t(ShowSelfieFragment showSelfieFragment) {
        this.f39682p0 = showSelfieFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ShowSelfieFragment showSelfieFragment = this.f39682p0;
        showSelfieFragment.f39645u0.showAtLocation(showSelfieFragment.v0, 17, 0, 0);
    }
}
