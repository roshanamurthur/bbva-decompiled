package com.dasnano.vdphotoselfiecapture.fragments;

import android.content.Intent;
import android.view.View;
import com.veridas.logger.Logger;
import com.veridas.logger.VDLogger;

/* JADX INFO: compiled from: SelfieTutorialFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class o implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelfieTutorialFragment f39677p0;

    public o(SelfieTutorialFragment selfieTutorialFragment) {
        this.f39677p0 = selfieTutorialFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.Tag tag = Logger.Tag.CLOSE;
        String str = SelfieTutorialFragment.TUTORIAL_FINISHED;
        VDLogger.log(tag, "CLOSE button called in: %s", "SelfieTutorialFragment");
        SelfieTutorialFragment selfieTutorialFragment = this.f39677p0;
        selfieTutorialFragment.getClass();
        Intent intent = new Intent("com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished");
        intent.putExtra("com.veridas.selfieCapture.selfieTutorialFragment.tutorialFinished", false);
        selfieTutorialFragment.broadcastIntent(intent);
    }
}
