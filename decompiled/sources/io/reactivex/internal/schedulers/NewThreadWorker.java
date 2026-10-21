package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class NewThreadWorker extends Scheduler.Worker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ScheduledExecutorService f73681p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f73682q0;

    public NewThreadWorker(ThreadFactory threadFactory) {
        this.f73681p0 = SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        if (this.f73682q0) {
            return;
        }
        this.f73682q0 = true;
        this.f73681p0.shutdownNow();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f73682q0;
    }

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable) {
        return schedule(runnable, 0L, null);
    }

    @NonNull
    public ScheduledRunnable scheduleActual(Runnable runnable, long j10, @NonNull TimeUnit timeUnit, @Nullable DisposableContainer disposableContainer) {
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(RxJavaPlugins.onSchedule(runnable), disposableContainer);
        if (disposableContainer != null && !disposableContainer.add(scheduledRunnable)) {
            return scheduledRunnable;
        }
        ScheduledExecutorService scheduledExecutorService = this.f73681p0;
        try {
            scheduledRunnable.setFuture(j10 <= 0 ? scheduledExecutorService.submit((Callable) scheduledRunnable) : scheduledExecutorService.schedule((Callable) scheduledRunnable, j10, timeUnit));
        } catch (RejectedExecutionException e5) {
            if (disposableContainer != null) {
                disposableContainer.remove(scheduledRunnable);
            }
            RxJavaPlugins.onError(e5);
        }
        return scheduledRunnable;
    }

    public Disposable scheduleDirect(Runnable runnable, long j10, TimeUnit timeUnit) {
        ScheduledDirectTask scheduledDirectTask = new ScheduledDirectTask(RxJavaPlugins.onSchedule(runnable));
        ScheduledExecutorService scheduledExecutorService = this.f73681p0;
        try {
            scheduledDirectTask.setFuture(j10 <= 0 ? scheduledExecutorService.submit(scheduledDirectTask) : scheduledExecutorService.schedule(scheduledDirectTask, j10, timeUnit));
            return scheduledDirectTask;
        } catch (RejectedExecutionException e5) {
            RxJavaPlugins.onError(e5);
            return EmptyDisposable.INSTANCE;
        }
    }

    public Disposable schedulePeriodicallyDirect(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
        if (j11 > 0) {
            ScheduledDirectPeriodicTask scheduledDirectPeriodicTask = new ScheduledDirectPeriodicTask(runnableOnSchedule);
            try {
                scheduledDirectPeriodicTask.setFuture(this.f73681p0.scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e5) {
                RxJavaPlugins.onError(e5);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f73681p0;
        c cVar = new c(runnableOnSchedule, scheduledExecutorService);
        try {
            cVar.a(j10 <= 0 ? scheduledExecutorService.submit(cVar) : scheduledExecutorService.schedule(cVar, j10, timeUnit));
            return cVar;
        } catch (RejectedExecutionException e7) {
            RxJavaPlugins.onError(e7);
            return EmptyDisposable.INSTANCE;
        }
    }

    public void shutdown() {
        if (this.f73682q0) {
            return;
        }
        this.f73682q0 = true;
        this.f73681p0.shutdown();
    }

    @Override // io.reactivex.Scheduler.Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        return this.f73682q0 ? EmptyDisposable.INSTANCE : scheduleActual(runnable, j10, timeUnit, null);
    }
}
