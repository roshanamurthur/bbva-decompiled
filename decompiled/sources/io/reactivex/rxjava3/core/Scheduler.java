package io.reactivex.rxjava3.core;

import com.noknok.android.client.utils.UIConfigTags;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import io.reactivex.rxjava3.internal.schedulers.NewThreadWorker;
import io.reactivex.rxjava3.internal.schedulers.SchedulerWhen;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public abstract class Scheduler {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final long f73945p0;

    public static abstract class Worker implements Disposable {

        public final class a implements Runnable, SchedulerRunnableIntrospection {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            @NonNull
            public final Runnable f73946p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            @NonNull
            public final SequentialDisposable f73947q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final long f73948r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public long f73949s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public long f73950t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public long f73951u0;

            public a(@NonNull long j10, Runnable runnable, @NonNull long j11, SequentialDisposable sequentialDisposable, long j12) {
                this.f73946p0 = runnable;
                this.f73947q0 = sequentialDisposable;
                this.f73948r0 = j12;
                this.f73950t0 = j11;
                this.f73951u0 = j10;
            }

            @Override // io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection
            public final Runnable getWrappedRunnable() {
                return this.f73946p0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j10;
                this.f73946p0.run();
                SequentialDisposable sequentialDisposable = this.f73947q0;
                if (sequentialDisposable.isDisposed()) {
                    return;
                }
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                Worker worker = Worker.this;
                long jNow = worker.now(timeUnit);
                long j11 = Scheduler.f73945p0;
                long j12 = jNow + j11;
                long j13 = this.f73950t0;
                long j14 = this.f73948r0;
                if (j12 < j13 || jNow >= j13 + j14 + j11) {
                    j10 = jNow + j14;
                    long j15 = this.f73949s0 + 1;
                    this.f73949s0 = j15;
                    this.f73951u0 = j10 - (j14 * j15);
                } else {
                    long j16 = this.f73951u0;
                    long j17 = this.f73949s0 + 1;
                    this.f73949s0 = j17;
                    j10 = (j17 * j14) + j16;
                }
                this.f73950t0 = jNow;
                sequentialDisposable.replace(worker.schedule(this, j10 - jNow, timeUnit));
            }
        }

        public long now(@NonNull TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
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
        public final Runnable f73952p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public final Worker f73953q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public Thread f73954r0;

        public a(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.f73952p0 = runnable;
            this.f73953q0 = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            Thread thread = this.f73954r0;
            Thread threadCurrentThread = Thread.currentThread();
            Worker worker = this.f73953q0;
            if (thread == threadCurrentThread && (worker instanceof NewThreadWorker)) {
                ((NewThreadWorker) worker).shutdown();
            } else {
                worker.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection
        public final Runnable getWrappedRunnable() {
            return this.f73952p0;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73953q0.isDisposed();
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f73954r0 = Thread.currentThread();
            try {
                this.f73952p0.run();
                dispose();
                this.f73954r0 = null;
            } catch (Throwable th2) {
                try {
                    RxJavaPlugins.onError(th2);
                    throw th2;
                } catch (Throwable th3) {
                    dispose();
                    this.f73954r0 = null;
                    throw th3;
                }
            }
        }
    }

    public static final class b implements Disposable, Runnable, SchedulerRunnableIntrospection {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NonNull
        public final Runnable f73955p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @NonNull
        public final Worker f73956q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f73957r0;

        public b(@NonNull Runnable runnable, @NonNull Worker worker) {
            this.f73955p0 = runnable;
            this.f73956q0 = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f73957r0 = true;
            this.f73956q0.dispose();
        }

        @Override // io.reactivex.rxjava3.schedulers.SchedulerRunnableIntrospection
        public final Runnable getWrappedRunnable() {
            return this.f73955p0;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73957r0;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f73957r0) {
                return;
            }
            try {
                this.f73955p0.run();
            } catch (Throwable th2) {
                dispose();
                RxJavaPlugins.onError(th2);
                throw th2;
            }
        }
    }

    static {
        long nanos;
        long jLongValue = Long.getLong("rx3.scheduler.drift-tolerance", 15L).longValue();
        String property = System.getProperty("rx3.scheduler.drift-tolerance-unit", UIConfigTags.TAG_MINUTES);
        if (UIConfigTags.TAG_SECONDS.equalsIgnoreCase(property)) {
            nanos = TimeUnit.SECONDS.toNanos(jLongValue);
        } else {
            nanos = "milliseconds".equalsIgnoreCase(property) ? TimeUnit.MILLISECONDS.toNanos(jLongValue) : TimeUnit.MINUTES.toNanos(jLongValue);
        }
        f73945p0 = nanos;
    }

    public static long clockDriftTolerance() {
        return f73945p0;
    }

    @NonNull
    public abstract Worker createWorker();

    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
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
        Objects.requireNonNull(function, "combine is null");
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
