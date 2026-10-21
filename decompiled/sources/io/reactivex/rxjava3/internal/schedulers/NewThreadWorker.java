package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.disposables.DisposableContainer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class NewThreadWorker extends Scheduler.Worker {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ScheduledExecutorService f77971p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public volatile boolean f77972q0;

    public NewThreadWorker(ThreadFactory threadFactory) {
        this.f77971p0 = SchedulerPoolFactory.create(threadFactory);
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        if (this.f77972q0) {
            return;
        }
        this.f77972q0 = true;
        this.f77971p0.shutdownNow();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f77972q0;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
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
        ScheduledExecutorService scheduledExecutorService = this.f77971p0;
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
        ScheduledExecutorService scheduledExecutorService = this.f77971p0;
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
                scheduledDirectPeriodicTask.setFuture(this.f77971p0.scheduleAtFixedRate(scheduledDirectPeriodicTask, j10, j11, timeUnit));
                return scheduledDirectPeriodicTask;
            } catch (RejectedExecutionException e5) {
                RxJavaPlugins.onError(e5);
                return EmptyDisposable.INSTANCE;
            }
        }
        ScheduledExecutorService scheduledExecutorService = this.f77971p0;
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
        if (this.f77972q0) {
            return;
        }
        this.f77972q0 = true;
        this.f77971p0.shutdown();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler.Worker
    @NonNull
    public Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        return this.f77972q0 ? EmptyDisposable.INSTANCE : scheduleActual(runnable, j10, timeUnit, null);
    }
}
