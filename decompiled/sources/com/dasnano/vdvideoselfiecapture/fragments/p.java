package com.dasnano.vdvideoselfiecapture.fragments;

import android.view.View;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39851p0;

    /* JADX INFO: compiled from: VideoFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Logger.Tag tag = Logger.Tag.CLOSE;
            String str = VideoFragment.VIDEO_FRAGMENT_VIDEO_CAPTURED;
            VDLogger.log(tag, "CLOSE button called in: %s", "VideoFragment");
            VideoFragment.g(p.this.f39851p0);
        }
    }

    public p(VideoFragment videoFragment) {
        this.f39851p0 = videoFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f39851p0.runOnUiThread(new a());
    }
}
