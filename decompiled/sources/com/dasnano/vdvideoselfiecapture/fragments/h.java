package com.dasnano.vdvideoselfiecapture.fragments;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39839p0;

    /* JADX INFO: compiled from: VideoFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            VideoFragment videoFragment = hVar.f39839p0;
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            videoFragment.y();
            hVar.f39839p0.v(null);
            VideoFragment.l(hVar.f39839p0);
            VideoFragment.h(hVar.f39839p0);
        }
    }

    public h(VideoFragment videoFragment) {
        this.f39839p0 = videoFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment.VideoState videoState = VideoFragment.VideoState.VIDEO_RECORDED;
        VideoFragment videoFragment = this.f39839p0;
        videoFragment.setVideoState(videoState);
        videoFragment.Y0.set(0);
        videoFragment.runOnUiThread(new a());
    }
}
