package com.dasnano.vdvideoselfiecapture.fragments;

import android.view.animation.AlphaAnimation;
import androidx.core.text.HtmlCompat;
import com.veridas.lib.entities.resources.Document;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f39849p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39850q0;

    public o(VideoFragment videoFragment, int i10) {
        this.f39850q0 = videoFragment;
        this.f39849p0 = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment videoFragment = this.f39850q0;
        Document document = videoFragment.X0;
        float aspectRatio = document != null ? (float) (240.0d / document.getAspectRatio()) : 140.0f;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(800L);
        alphaAnimation.setStartOffset(0L);
        alphaAnimation.setAnimationListener(new m(videoFragment));
        String strValueOf = String.valueOf(this.f39849p0);
        if (videoFragment.f39767w1) {
            videoFragment.f39750m1.setText(HtmlCompat.fromHtml(strValueOf, 0));
            videoFragment.f39750m1.setTextSize(aspectRatio);
            videoFragment.f39750m1.startAnimation(alphaAnimation);
            videoFragment.f39752n1.setText(HtmlCompat.fromHtml(strValueOf, 0));
            videoFragment.f39752n1.setTextSize(aspectRatio);
            videoFragment.f39752n1.startAnimation(alphaAnimation);
        } else {
            videoFragment.f39748l1.setText(HtmlCompat.fromHtml(strValueOf, 0));
            videoFragment.f39748l1.setTextSize(aspectRatio);
            videoFragment.f39748l1.startAnimation(alphaAnimation);
        }
        videoFragment.D(0);
    }
}
