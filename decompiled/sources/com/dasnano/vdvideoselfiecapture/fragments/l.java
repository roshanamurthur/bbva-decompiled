package com.dasnano.vdvideoselfiecapture.fragments;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import com.dasnano.vdvideoselfiecapture.other.DocumentRectangleOrFace;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Activity f39844p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39845q0;

    public l(VideoFragment videoFragment, FragmentActivity fragmentActivity) {
        this.f39845q0 = videoFragment;
        this.f39844p0 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment videoFragment = this.f39845q0;
        videoFragment.f39740h1.setDocumentOrFaceRectangle(0, videoFragment.f39736f1, DocumentRectangleOrFace.typesDrawables.ROUNDED_RECTANGLE, videoFragment.P0, this.f39844p0);
        videoFragment.t(null);
        videoFragment.v(null);
        videoFragment.f39746k1.setVisibility(0);
    }
}
