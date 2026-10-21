package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class ImmediateThinScheduler extends Scheduler {
    public static final Scheduler INSTANCE = new ImmediateThinScheduler();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final a f77949q0 = new a();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final Disposable f77950r0;

    static {
        Disposable disposableB = d.b();
        f77950r0 = disposableB;
        disposableB.dispose();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return f77949q0;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        runnable.run();
        return f77950r0;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }

    public static final class a extends Scheduler.Worker {
        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return false;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            runnable.run();
            return ImmediateThinScheduler.f77950r0;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedulePeriodically(@NonNull Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }
}
