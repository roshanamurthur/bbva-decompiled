package com.dasnano.vdphotoselfiecapture.fragments;

import android.media.MediaRecorder;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.veridas.camera.MediaRecorderAction;
import com.veridas.camera.resolution.Resolution;
import com.veridas.fragment.DasCaptureFragment;
import com.veridas.fragment.DasFragment;
import java.util.List;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class f extends MediaRecorderAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Runnable f39661p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39662q0;

    public f(SelfieFragment selfieFragment, Runnable runnable) {
        this.f39662q0 = selfieFragment;
        this.f39661p0 = runnable;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        SelfieFragment selfieFragment = this.f39662q0;
        List<int[]> supportedPreviewFpsRange = ((DasCaptureFragment) selfieFragment).camera.getProperties().getSupportedPreviewFpsRange();
        selfieFragment.getClass();
        int i10 = 30000;
        for (int[] iArr : supportedPreviewFpsRange) {
            int i11 = iArr[0];
            if (i11 == iArr[1] && Math.abs(i11 - 10000) < Math.abs(i10 - 10000)) {
                i10 = iArr[0];
            }
        }
        this.mediaRecorder.setOutputFormat(2);
        this.mediaRecorder.setOutputFile(((VDPhotoSelfieViewModel) ((DasFragment) selfieFragment).viewModel).getChallengeVideoPath());
        this.mediaRecorder.setVideoEncodingBitRate(750000);
        this.mediaRecorder.setVideoFrameRate(i10 / 1000);
        MediaRecorder mediaRecorder = this.mediaRecorder;
        Resolution resolution = SelfieFragment.f39557e3;
        mediaRecorder.setVideoSize(resolution.width, resolution.height);
        this.mediaRecorder.setVideoEncoder(2);
        Runnable runnable = this.f39661p0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
