package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import xf.s;

/* JADX INFO: loaded from: classes10.dex */
public final class ExecutorUtils {

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f47760p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ AtomicLong f47761q0;

        /* JADX INFO: renamed from: com.google.firebase.crashlytics.internal.common.ExecutorUtils$a$a, reason: collision with other inner class name */
        public class C0208a extends BackgroundPriorityRunnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Runnable f47762p0;

            public C0208a(Runnable runnable) {
                this.f47762p0 = runnable;
            }

            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public final void onRun() {
                this.f47762p0.run();
            }
        }

        public a(String str, AtomicLong atomicLong) {
            this.f47760p0 = str;
            this.f47761q0 = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0208a(runnable));
            threadNewThread.setName(this.f47760p0 + this.f47761q0.getAndIncrement());
            return threadNewThread;
        }
    }

    public static void a(String str, ExecutorService executorService) {
        Runtime.getRuntime().addShutdownHook(new Thread(new s(str, executorService, TimeUnit.SECONDS), androidx.camera.core.processing.f.d("Crashlytics Shutdown Hook for ", str)));
    }

    public static ExecutorService buildSingleThreadExecutorService(String str) {
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), getNamedThreadFactory(str), new ThreadPoolExecutor.DiscardPolicy()));
        a(str, executorServiceUnconfigurableExecutorService);
        return executorServiceUnconfigurableExecutorService;
    }

    public static ScheduledExecutorService buildSingleThreadScheduledExecutorService(String str) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        a(str, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    public static ThreadFactory getNamedThreadFactory(String str) {
        return new a(str, new AtomicLong(1L));
    }
}
