package com.dasnano.vdphotoselfiecapture.fragments;

import com.veridas.util.AppUtil;

/* JADX INFO: compiled from: ShowSelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ShowSelfieFragment f39681p0;

    public s(ShowSelfieFragment showSelfieFragment) {
        this.f39681p0 = showSelfieFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppUtil.dismiss(this.f39681p0.f39645u0);
    }
}
