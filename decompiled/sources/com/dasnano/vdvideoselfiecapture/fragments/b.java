package com.dasnano.vdvideoselfiecapture.fragments;

import android.os.Handler;
import com.veridas.camera.Camera;
import com.veridas.lib.entities.resources.Document;
import com.veridas.log.Log;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Camera f39828p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39829q0;

    public b(VideoFragment videoFragment, Camera camera) {
        this.f39829q0 = videoFragment;
        this.f39828p0 = camera;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VideoFragment videoFragment = this.f39829q0;
        videoFragment.V0.setVisibility(8);
        videoFragment.f39740h1.setVisibility(8);
        videoFragment.f39729b1.set(false);
        videoFragment.Y0.set(0);
        videoFragment.y();
        videoFragment.u(null);
        videoFragment.v(null);
        videoFragment.f39744j1.setVisibility(4);
        videoFragment.runOnUiThread(new c(videoFragment));
        int i10 = videoFragment.f39762t1 + 1000;
        Handler handler = videoFragment.L0;
        if (handler == null) {
            Log.w("VideoFragment", "The mRunnablesHandler is not available");
        } else {
            handler.postDelayed(videoFragment.N2, 1000L);
            videoFragment.L0.postDelayed(videoFragment.O2, videoFragment.f39762t1);
            if (!videoFragment.O1) {
                videoFragment.L0.postDelayed(new h(videoFragment), videoFragment.f39762t1);
            } else if (videoFragment.f39731c1.get()) {
                videoFragment.L0.postDelayed(videoFragment.P2, i10);
                videoFragment.L0.postDelayed(videoFragment.S2, videoFragment.f39764u1);
                videoFragment.J0 = System.currentTimeMillis();
            } else if (Document.isPassport(VideoFragment.V2) || !videoFragment.x()) {
                videoFragment.L0.postDelayed(videoFragment.Q2, i10);
            } else {
                videoFragment.L0.postDelayed(videoFragment.P2, i10);
                videoFragment.L0.postDelayed(videoFragment.O2, videoFragment.f39762t1 + videoFragment.f39755p1);
                videoFragment.L0.postDelayed(videoFragment.Q2, i10 + videoFragment.f39755p1);
            }
        }
        Camera camera = this.f39828p0;
        if (camera == null) {
            return;
        }
        camera.initializeMediaRecorder(new q(videoFragment, camera));
    }
}
