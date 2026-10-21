package com.dasnano.vdvideoselfiecapture.fragments;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.veridas.lifecycle.VeridasPackageBroadcastHelper;

/* JADX INFO: compiled from: VideoTutorialFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Activity f39856p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Intent f39857q0;

    public s(FragmentActivity fragmentActivity, Intent intent) {
        this.f39856p0 = fragmentActivity;
        this.f39857q0 = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VeridasPackageBroadcastHelper.INSTANCE.send(this.f39856p0, this.f39857q0);
    }
}
