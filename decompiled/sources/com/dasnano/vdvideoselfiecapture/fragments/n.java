package com.dasnano.vdvideoselfiecapture.fragments;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f39847p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39848q0;

    public n(VideoFragment videoFragment, int i10) {
        this.f39848q0 = videoFragment;
        this.f39847p0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment.j(this.f39848q0, this.f39847p0 - 1);
    }
}
