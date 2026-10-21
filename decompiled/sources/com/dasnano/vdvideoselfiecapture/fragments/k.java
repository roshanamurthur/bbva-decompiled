package com.dasnano.vdvideoselfiecapture.fragments;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39843p0;

    public k(VideoFragment videoFragment) {
        this.f39843p0 = videoFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment videoFragment = this.f39843p0;
        videoFragment.R0.setVisibility(0);
        videoFragment.S0.setVisibility(0);
        videoFragment.T0.setVisibility(0);
    }
}
