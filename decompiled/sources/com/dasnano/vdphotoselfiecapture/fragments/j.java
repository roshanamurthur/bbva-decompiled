package com.dasnano.vdphotoselfiecapture.fragments;

import com.veridas.camera.CameraAction;

/* JADX INFO: compiled from: SelfieFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class j implements CameraAction {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SelfieFragment f39668p0;

    public j(SelfieFragment selfieFragment) {
        this.f39668p0 = selfieFragment;
    }

    @Override // com.veridas.camera.CameraAction
    public final void execute(boolean z10) {
        String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
        this.f39668p0.G(false);
    }
}
