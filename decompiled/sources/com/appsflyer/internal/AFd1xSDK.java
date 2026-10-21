package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1xSDK extends TimerTask {
    private final Thread values;

    public AFd1xSDK(Thread thread) {
        this.values = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.values.interrupt();
    }
}
