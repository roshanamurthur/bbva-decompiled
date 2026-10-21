package com.dasnano.vdphotoselfiecapture.fragments;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39663p0;

    public g(SelfieFragment selfieFragment) {
        this.f39663p0 = selfieFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SelfieFragment selfieFragment = this.f39663p0;
        if (selfieFragment.getActivity() != null) {
            selfieFragment.f39565d1.setVisibility(8);
        }
    }
}
