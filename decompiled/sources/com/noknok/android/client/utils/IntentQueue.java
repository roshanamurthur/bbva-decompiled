package com.noknok.android.client.utils;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes11.dex */
public class IntentQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f63451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadPoolExecutor f63452b = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public static void finishRequest() {
        f63451a--;
    }

    public static ThreadPoolExecutor getExecutor() {
        return f63452b;
    }

    public static void startRequest() {
        int i10 = f63451a + 1;
        f63451a = i10;
        if (i10 > 1) {
            Logger.w("IntentQueue", f63451a + " concurrently active requests");
        }
        ThreadPoolExecutor threadPoolExecutor = f63452b;
        if (threadPoolExecutor.getCorePoolSize() != f63451a) {
            Logger.w("IntentQueue", "Setting Pool Size to " + f63451a);
            threadPoolExecutor.setCorePoolSize(f63451a);
            threadPoolExecutor.setMaximumPoolSize(f63451a);
        }
    }
}
