package com.dasnano.vdvideoselfiecapture.fragments;

import com.veridas.camera.CameraAction;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39836p0;

    public f(VideoFragment videoFragment) {
        this.f39836p0 = videoFragment;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
        this.f39836p0.w();
    }
}
