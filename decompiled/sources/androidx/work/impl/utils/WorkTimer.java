package androidx.work.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WorkTimer {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24677e = Logger.tagWithPrefix("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f24678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f24679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f24680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f24681d;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public interface TimeLimitExceededListener {
        void onTimeLimitExceeded(@NonNull String str);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class WorkTimerRunnable implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final WorkTimer f24682p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final String f24683q0;

        public WorkTimerRunnable(@NonNull WorkTimer workTimer, @NonNull String str) {
            this.f24682p0 = workTimer;
            this.f24683q0 = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f24682p0.f24681d) {
                try {
                    if (((WorkTimerRunnable) this.f24682p0.f24679b.remove(this.f24683q0)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.f24682p0.f24680c.remove(this.f24683q0);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.onTimeLimitExceeded(this.f24683q0);
                        }
                    } else {
                        Logger.get().debug("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f24683q0), new Throwable[0]);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public class a implements ThreadFactory {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f24684p0;

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f24684p0);
            this.f24684p0 = this.f24684p0 + 1;
            return threadNewThread;
        }
    }

    public WorkTimer() {
        a aVar = new a();
        aVar.f24684p0 = 0;
        this.f24679b = new HashMap();
        this.f24680c = new HashMap();
        this.f24681d = new Object();
        this.f24678a = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    @NonNull
    @VisibleForTesting
    public ScheduledExecutorService getExecutorService() {
        return this.f24678a;
    }

    @NonNull
    @VisibleForTesting
    public synchronized Map<String, TimeLimitExceededListener> getListeners() {
        return this.f24680c;
    }

    @NonNull
    @VisibleForTesting
    public synchronized Map<String, WorkTimerRunnable> getTimerMap() {
        return this.f24679b;
    }

    public void onDestroy() {
        ScheduledExecutorService scheduledExecutorService = this.f24678a;
        if (scheduledExecutorService.isShutdown()) {
            return;
        }
        scheduledExecutorService.shutdownNow();
    }

    public void startTimer(@NonNull String str, long j10, @NonNull TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.f24681d) {
            Logger.get().debug(f24677e, String.format("Starting timer for %s", str), new Throwable[0]);
            stopTimer(str);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, str);
            this.f24679b.put(str, workTimerRunnable);
            this.f24680c.put(str, timeLimitExceededListener);
            this.f24678a.schedule(workTimerRunnable, j10, TimeUnit.MILLISECONDS);
        }
    }

    public void stopTimer(@NonNull String str) {
        synchronized (this.f24681d) {
            try {
                if (((WorkTimerRunnable) this.f24679b.remove(str)) != null) {
                    Logger.get().debug(f24677e, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.f24680c.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
