package com.airbnb.lottie.utils;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class LottieThreadFactory implements ThreadFactory {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final AtomicInteger f26198s0 = new AtomicInteger(1);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ThreadGroup f26199p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicInteger f26200q0 = new AtomicInteger(1);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final String f26201r0;

    public LottieThreadFactory() {
        SecurityManager securityManager = System.getSecurityManager();
        this.f26199p0 = securityManager == null ? Thread.currentThread().getThreadGroup() : securityManager.getThreadGroup();
        this.f26201r0 = "lottie-" + f26198s0.getAndIncrement() + "-thread-";
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f26199p0, runnable, this.f26201r0 + this.f26200q0.getAndIncrement(), 0L);
        thread.setDaemon(false);
        thread.setPriority(10);
        return thread;
    }
}
