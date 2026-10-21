package com.dasnano.vddocumentcapture.managers;

import android.os.Handler;
import android.os.HandlerThread;
import com.veridas.log.Log;

/* JADX INFO: loaded from: classes9.dex */
public class BackgroundThreadsManager {
    public static final long THREAD_JOIN_TIMEOUT = 30000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f39383a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f39384b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f39385c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f39386d = null;

    public Handler getHelpBackgroundHandler() {
        return this.f39386d;
    }

    public Handler getProcessImageHandler() {
        return this.f39384b;
    }

    public void startBackgroundThreads() {
        if (this.f39383a == null) {
            HandlerThread handlerThread = new HandlerThread("SaveImage");
            this.f39383a = handlerThread;
            handlerThread.start();
        }
        if (this.f39384b == null) {
            this.f39384b = new Handler(this.f39383a.getLooper());
        }
        if (this.f39385c == null) {
            HandlerThread handlerThread2 = new HandlerThread("helpThread");
            this.f39385c = handlerThread2;
            handlerThread2.setPriority(10);
            this.f39385c.start();
        }
        if (this.f39386d == null) {
            this.f39386d = new Handler(this.f39385c.getLooper());
        }
    }

    public void stopBackgroundThreads() {
        HandlerThread handlerThread = this.f39385c;
        this.f39386d.removeCallbacksAndMessages(null);
        handlerThread.quit();
        try {
            handlerThread.join(30000L);
        } catch (InterruptedException e5) {
            Log.e("BackgroundThreadsManager", e5);
        }
        this.f39385c = null;
        this.f39386d = null;
        HandlerThread handlerThread2 = this.f39383a;
        this.f39384b.removeCallbacksAndMessages(null);
        handlerThread2.quit();
        try {
            handlerThread2.join(30000L);
        } catch (InterruptedException e7) {
            Log.e("BackgroundThreadsManager", e7);
        }
        this.f39383a = null;
        this.f39384b = null;
    }
}
