package com.dasnano.vdphotoselfiecapture.fragments;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: ShowSelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class p implements View.OnTouchListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ShowSelfieFragment f39678p0;

    public p(ShowSelfieFragment showSelfieFragment) {
        this.f39678p0 = showSelfieFragment;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str = ShowSelfieFragment.CHECK_SELFIE_FINISHED;
        ShowSelfieFragment showSelfieFragment = this.f39678p0;
        showSelfieFragment.getClass();
        showSelfieFragment.runOnUiThread(new s(showSelfieFragment));
        return true;
    }
}
