package com.dasnano.vdvideoselfiecapture.fragments;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import com.veridas.view.animation.AnimationAdapter;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i extends AnimationAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39841a;

    public i(VideoFragment videoFragment) {
        this.f39841a = videoFragment;
    }

    @Override // com.veridas.view.animation.AnimationAdapter, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        VideoFragment videoFragment = this.f39841a;
        AlphaAnimation alphaAnimation = new AlphaAnimation(videoFragment.T1, 0.0f);
        alphaAnimation.setDuration(625L);
        alphaAnimation.setStartOffset(625L);
        alphaAnimation.setFillAfter(true);
        videoFragment.f39769x1.startAnimation(alphaAnimation);
    }
}
