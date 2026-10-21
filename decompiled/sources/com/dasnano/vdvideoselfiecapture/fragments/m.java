package com.dasnano.vdvideoselfiecapture.fragments;

import android.view.animation.Animation;
import com.veridas.view.animation.AnimationAdapter;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class m extends AnimationAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39846a;

    public m(VideoFragment videoFragment) {
        this.f39846a = videoFragment;
    }

    @Override // com.veridas.view.animation.AnimationAdapter, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
        this.f39846a.D(4);
    }
}
