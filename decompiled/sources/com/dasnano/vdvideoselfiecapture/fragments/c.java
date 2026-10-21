package com.dasnano.vdvideoselfiecapture.fragments;

import android.os.Handler;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39830p0;

    /* JADX INFO: compiled from: VideoFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            VideoFragment videoFragment = c.this.f39830p0;
            if (videoFragment.H1) {
                videoFragment.V0.setVisibility(0);
            } else {
                videoFragment.V0.setVisibility(8);
            }
            videoFragment.f39740h1.setVisibility(0);
        }
    }

    public c(VideoFragment videoFragment) {
        this.f39830p0 = videoFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment videoFragment = this.f39830p0;
        if (!videoFragment.Q1) {
            new Handler().postDelayed(new a(), 500L);
            return;
        }
        if (videoFragment.H1) {
            videoFragment.V0.setVisibility(0);
        } else {
            videoFragment.V0.setVisibility(8);
        }
        videoFragment.f39740h1.setVisibility(0);
    }
}
