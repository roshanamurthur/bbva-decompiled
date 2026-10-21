package io.reactivex;

import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.schedulers.NewThreadWorker;
import io.reactivex.internal.schedulers.SchedulerWhen;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.schedulers.SchedulerRunnableIntrospection;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Scheduler {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final boolean f69863p0 = Boolean.getBoolean("rx2.scheduler.use-nanotime");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final long f69864q0 = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    public static abstract class Worker implements Disposable {

        public final class a implements Runnable, SchedulerRunnableIntrospection {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NonNull
            public final Runnable f69865p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            @NonNull
            public final SequentialDisposable f69866q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final long f69867r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public long f69868s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public long f69869t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public long f69870u0;

            public a(@NonNull long j10, Runnable runnable, @NonNull long j11, SequentialDisposable sequentialDisposable, long j12) {
                this.f69865p0 = runnable;
                this.f69866q0 = sequentialDisposable;
                this.f69867r0 = j12;
                this.f69869t0 = j11;
                this.f69870u0 = j10;
            }

            @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
            public final Runnable getWrappedRunnable() {
                return this.f69865p0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j10;
                this.f69865p0.run();
                SequentialDisposable sequentialDisposable = this.f69866q0;
                if (sequentialDisposable.isDisposed()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                Worker worker = Worker.this;
                long jNow = worker.now(timeUnit);
                long j11 = Scheduler.f69864q0;
                long j12 = jNow + j11;
                long j13 = this.f69869t0;
                long j14 = this.f69867r0;
                if (j12 < j13 || jNow >= j13 + j14 + j11) {
                    j10 = jNow + j14;
                    long j15 = this.f69868s0 + 1;
                    this.f69868s0 = j15;
                    this.f69870u0 = j10 - (j14 * j15);
                } else {
                    long j16 = this.f69870u0;
                    long j17 = this.f69868s0 + 1;
                    this.f69868s0 = j17;
                    j10 = (j17 * j14) + j16;
                }
                this.f69869t0 = jNow;
                sequentialDisposable.replace(worker.schedule(this, j10 - jNow, timeUnit));
            }
        }

        public long now(@NonNull TimeUnit timeUnit) {
            return !Scheduler.f69863p0 ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
        }

        @NonNull
        public Disposable schedule(@NonNull Runnable runnable) {
            return schedule(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        @NonNull
        public abstract Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit);

        @NonNull
        public Disposable schedulePeriodically(@NonNull Runnable runnable, long j10, long j11, @NonNull TimeUnit timeUnit) {
            SequentialDisposable sequentialDisposable = new SequentialDisposable();
            SequentialDisposable sequentialDisposable2 = new SequentialDisposable(sequentialDisposable);
            Runnable runnableOnSchedule = RxJavaPlugins.onSchedule(runnable);
            long nanos = timeUnit.toNanos(j11);
            long jNow = now(TimeUnit.NANOSECONDS);
            Disposable disposableSchedule = schedule(new a(timeUnit.toNanos(j10) + jNow, runnableOnSchedule, jNow, sequentialDisposable2, nanos), j10, timeUnit);
            if (disposableSchedule == EmptyDisposable.INSTANCE) {
                return disposableSchedule;
            }
            sequentialDisposable.replace(disposableSchedule);
            return sequentialDisposable2;
        }
    }

    public static final class a implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final Runnable f69871p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public final Worker f69872q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public Thread f69873r0;

        public a(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.f69871p0 = runnable;
            this.f69872q0 = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Thread thread = this.f69873r0;
            Thread threadCurrentThread = Thread.currentThread();
            Worker worker = this.f69872q0;
            if (thread == threadCurrentThread && (worker instanceof NewThreadWorker)) {
                ((NewThreadWorker) worker).shutdown();
            } else {
                worker.dispose();
            }
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public final Runnable getWrappedRunnable() {
            return this.f69871p0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f69872q0.isDisposed();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f69873r0 = Thread.currentThread();
            try {
                this.f69871p0.run();
            } finally {
                dispose();
                this.f69873r0 = null;
            }
        }
    }

    public static final class b implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final Runnable f69874p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public final Worker f69875q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f69876r0;

        public b(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.f69874p0 = runnable;
            this.f69875q0 = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f69876r0 = true;
            this.f69875q0.dispose();
        }

        @Override // io.reactivex.schedulers.SchedulerRunnableIntrospection
        public final Runnable getWrappedRunnable() {
            return this.f69874p0;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f69876r0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f69876r0) {
                return;
            }
            try {
                this.f69874p0.run();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f69875q0.dispose();
                throw ExceptionHelper.wrapOrThrow(th2);
            }
        }
    }

    public static long clockDriftTolerance() {
        return f69864q0;
    }

    @NonNull
    public abstract Worker createWorker();

    public long now(@NonNull TimeUnit timeUnit) {
        return !f69863p0 ? timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS) : timeUnit.convert(System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        return scheduleDirect(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    @NonNull
    public Disposable schedulePeriodicallyDirect(@NonNull Runnable runnable, long j10, long j11, @NonNull TimeUnit timeUnit) {
        Worker workerCreateWorker = createWorker();
        b bVar = new b(RxJavaPlugins.onSchedule(runnable), workerCreateWorker);
        Disposable disposableSchedulePeriodically = workerCreateWorker.schedulePeriodically(bVar, j10, j11, timeUnit);
        return disposableSchedulePeriodically == EmptyDisposable.INSTANCE ? disposableSchedulePeriodically : bVar;
    }

    @NonNull
    public <S extends Scheduler & Disposable> S when(@NonNull Function<Flowable<Flowable<Completable>>, Completable> function) {
        return new SchedulerWhen(function, this);
    }

    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
        Worker workerCreateWorker = createWorker();
        a aVar = new a(RxJavaPlugins.onSchedule(runnable), workerCreateWorker);
        workerCreateWorker.schedule(aVar, j10, timeUnit);
        return aVar;
    }

    public void shutdown() {
    }

    public void start() {
    }
}
