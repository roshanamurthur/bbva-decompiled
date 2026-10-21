package com.dasnano.vdvideoselfiecapture.fragments;

import com.veridas.camera.CameraAction;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39835p0;

    public e(VideoFragment videoFragment) {
        this.f39835p0 = videoFragment;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
        VideoFragment videoFragment = this.f39835p0;
        videoFragment.B();
        videoFragment.q(false);
    }
}
