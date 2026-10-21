package com.facetec.sdk;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes9.dex */
final class cw extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f41072b;

    public cw(Runnable runnable) {
        this.f41072b = runnable;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f41072b.run();
    }
}
