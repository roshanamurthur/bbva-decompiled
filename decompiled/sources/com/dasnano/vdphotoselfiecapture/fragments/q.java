package com.dasnano.vdphotoselfiecapture.fragments;

import android.content.Intent;
import android.view.View;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: ShowSelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class q implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ShowSelfieFragment f39679p0;

    public q(ShowSelfieFragment showSelfieFragment) {
        this.f39679p0 = showSelfieFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = ShowSelfieFragment.CHECK_SELFIE_FINISHED;
        Log.v("com.dasnano.vdphotoselfiecapture.fragments.ShowSelfieFragment", "Click on mNegativeButton");
        ShowSelfieFragment showSelfieFragment = this.f39679p0;
        showSelfieFragment.f39643s0.setClickable(false);
        VDLogger.log(Logger.Tag.REPEAT, VDPhotoSelfieCapture.LOG_TAG_REPEAT);
        Intent intent = new Intent("com.dasnano.selfieCapture.showSelfieFragment.finished");
        intent.putExtra("com.dasnano.selfieCapture.showSelfieFragment.finished", false);
        showSelfieFragment.broadcastIntent(intent);
    }
}
