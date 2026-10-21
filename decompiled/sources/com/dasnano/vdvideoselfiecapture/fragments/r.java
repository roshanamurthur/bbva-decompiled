package com.dasnano.vdvideoselfiecapture.fragments;

import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: VideoTutorialFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class r implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ VideoTutorialFragment f39855p0;

    public r(VideoTutorialFragment videoTutorialFragment) {
        this.f39855p0 = videoTutorialFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.Tag tag = Logger.Tag.CLOSE;
        String str = VideoTutorialFragment.TUTORIAL_FRAGMENT_FINISHED;
        VDLogger.log(tag, "CLOSE button called in: %s", "VideoTutorialFragment");
        FragmentActivity activity = this.f39855p0.getActivity();
        Intent intent = new Intent("com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED");
        intent.putExtra("com.veridas.videoSelfieCapture.videoTutorialFragment.TUTORIAL_FINISHED", false);
        if (activity != null) {
            activity.runOnUiThread(new s(activity, intent));
        }
    }
}
