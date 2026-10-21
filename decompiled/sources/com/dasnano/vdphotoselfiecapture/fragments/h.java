package com.dasnano.vdphotoselfiecapture.fragments;

import android.content.Intent;
import com.dasnano.vdphotoselfiecapture.model.VDPhotoSelfieViewModel;
import com.dasnano.vdphotoselfiecapture.other.WebVTTBuilder;
import com.veridas.camera.CameraAction;
import com.veridas.fragment.DasFragment;
import com.veridas.log.Log;
import java.io.File;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class h implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Runnable f39664p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39665q0;

    /* JADX INFO: compiled from: SelfieFragment.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h hVar = h.this;
            Runnable runnable = hVar.f39664p0;
            if (runnable != null) {
                runnable.run();
            }
            SelfieFragment selfieFragment = hVar.f39665q0;
            String challengeVideoPath = ((VDPhotoSelfieViewModel) ((DasFragment) selfieFragment).viewModel).getChallengeVideoPath();
            String strBuildWebVTTString = WebVTTBuilder.buildWebVTTString(((VDPhotoSelfieViewModel) ((DasFragment) selfieFragment).viewModel).getChallengeToken());
            Intent intent = new Intent(SelfieFragment.CHALLENGE_CAPTURED);
            intent.putExtra(SelfieFragment.CHALLENGE_VIDEO_PATH, challengeVideoPath);
            intent.putExtra(SelfieFragment.CHALLENGE_VTT, strBuildWebVTTString);
            selfieFragment.broadcastIntent(intent);
            selfieFragment.s();
            selfieFragment.G(true);
            if (selfieFragment.f39575i2) {
                return;
            }
            selfieFragment.t(true);
        }
    }

    public h(SelfieFragment selfieFragment, androidx.camera.core.processing.m mVar) {
        this.f39665q0 = selfieFragment;
        this.f39664p0 = mVar;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        SelfieFragment selfieFragment = this.f39665q0;
        if (new File(((VDPhotoSelfieViewModel) ((DasFragment) selfieFragment).viewModel).getChallengeVideoPath()).exists()) {
            selfieFragment.runOnUiThread(new a());
        } else {
            Log.e(SelfieFragment.d3, "Video file %s does not exist.", ((VDPhotoSelfieViewModel) ((DasFragment) selfieFragment).viewModel).getChallengeVideoPath());
        }
    }
}
