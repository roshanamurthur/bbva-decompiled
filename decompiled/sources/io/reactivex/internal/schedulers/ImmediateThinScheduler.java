package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ImmediateThinScheduler extends Scheduler {
    public static final Scheduler INSTANCE = new ImmediateThinScheduler();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a f73659r0 = new a();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final Disposable f73660s0;

    static {
        Disposable disposableEmpty = Disposables.empty();
        f73660s0 = disposableEmpty;
        disposableEmpty.dispose();
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return f73659r0;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        runnable.run();
        return f73660s0;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    public static final class a extends Scheduler.Worker {
        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return false;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            runnable.run();
            return ImmediateThinScheduler.f73660s0;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedulePeriodically(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
}
