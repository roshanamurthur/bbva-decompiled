package com.dasnano.vddocumentcapture.fragments;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* JADX INFO: compiled from: DocumentCaptureTutorialFragment.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Activity f39361p0;

    public c(FragmentActivity fragmentActivity) {
        this.f39361p0 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Activity activity = this.f39361p0;
        if (activity != null) {
            activity.finish();
        }
    }
}
