package com.dasnano.vdphotoselfiecapture.fragments;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39667p0;

    public i(SelfieFragment selfieFragment) {
        this.f39667p0 = selfieFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
        SelfieFragment selfieFragment = this.f39667p0;
        selfieFragment.s();
        selfieFragment.G(true);
        if (selfieFragment.f39575i2) {
            return;
        }
        selfieFragment.t(true);
    }
}
