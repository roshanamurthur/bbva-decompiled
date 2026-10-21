package com.dasnano.vdphotoselfiecapture.fragments;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39672p0;

    public l(SelfieFragment selfieFragment) {
        this.f39672p0 = selfieFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
        this.f39672p0.J();
    }
}
