package com.dasnano.vdvideoselfiecapture.fragments;

import com.dasnano.vdvideoselfiecapture.other.DocumentRectangleOrFace;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ String f39832p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f39833q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39834r0;

    public d(VideoFragment videoFragment, String str, String str2) {
        this.f39834r0 = videoFragment;
        this.f39832p0 = str;
        this.f39833q0 = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment videoFragment = this.f39834r0;
        videoFragment.f39740h1.setDocumentOrFaceRectangle(0, videoFragment.f39736f1, DocumentRectangleOrFace.typesDrawables.ROUNDED_RECTANGLE, 0, videoFragment.getActivity());
        videoFragment.t(null);
        VideoFragment.e(videoFragment, this.f39832p0, this.f39833q0).show();
    }
}
