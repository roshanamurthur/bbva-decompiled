package com.dasnano.vdphotoselfiecapture.fragments;

import android.content.Intent;
import android.view.View;
import com.veridas.log.Log;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: ShowSelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class r implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ShowSelfieFragment f39680p0;

    public r(ShowSelfieFragment showSelfieFragment) {
        this.f39680p0 = showSelfieFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str = ShowSelfieFragment.CHECK_SELFIE_FINISHED;
        Log.v("com.dasnano.vdphotoselfiecapture.fragments.ShowSelfieFragment", "Click on mPositiveButton");
        ShowSelfieFragment showSelfieFragment = this.f39680p0;
        showSelfieFragment.f39644t0.setClickable(false);
        VDLogger.log(Logger.Tag.CONTINUE, "continue");
        Intent intent = new Intent("com.dasnano.selfieCapture.showSelfieFragment.finished");
        intent.putExtra("com.dasnano.selfieCapture.showSelfieFragment.finished", true);
        showSelfieFragment.broadcastIntent(intent);
    }
}
