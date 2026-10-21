package com.dasnano.vdvideoselfiecapture.fragments;

import com.veridas.camera.Camera;
import com.veridas.camera.MediaRecorderAction;
import com.veridas.camera.resolution.Resolution;

/* JADX INFO: compiled from: VideoFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class q extends MediaRecorderAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Camera f39853p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ VideoFragment f39854q0;

    public q(VideoFragment videoFragment, Camera camera) {
        this.f39854q0 = videoFragment;
        this.f39853p0 = camera;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        Resolution videoResolution = this.f39853p0.getProperties().getVideoResolution();
        this.mediaRecorder.setAudioSource(1);
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setOutputFile(this.f39854q0.O0);
        this.mediaRecorder.setVideoEncodingBitRate(1500000);
        this.mediaRecorder.setVideoFrameRate(30);
        this.mediaRecorder.setVideoSize(videoResolution.width, videoResolution.height);
        this.mediaRecorder.setAudioEncoder(3);
        this.mediaRecorder.setVideoEncoder(2);
    }
}
