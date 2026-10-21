package com.dasnano.vdvideoselfiecapture.fragments;

import android.widget.RelativeLayout;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39842p0;

    public j(VideoFragment videoFragment) {
        this.f39842p0 = videoFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment videoFragment = this.f39842p0;
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) videoFragment.S0.getLayoutParams();
        layoutParams.topMargin = videoFragment.f39742i1.getBottom() + videoFragment.A(30);
        videoFragment.S0.setLayoutParams(layoutParams);
    }
}
