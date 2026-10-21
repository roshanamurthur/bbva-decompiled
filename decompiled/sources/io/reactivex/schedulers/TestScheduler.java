package io.reactivex.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class TestScheduler extends Scheduler {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final PriorityBlockingQueue f78597r0 = new PriorityBlockingQueue(11);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f78598s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public volatile long f78599t0;

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f78604p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Runnable f78605q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a f78606r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f78607s0;

        public b(a aVar, long j10, Runnable runnable, long j11) {
            this.f78604p0 = j10;
            this.f78605q0 = runnable;
            this.f78606r0 = aVar;
            this.f78607s0 = j11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            long j10 = bVar2.f78604p0;
            long j11 = this.f78604p0;
            return j11 == j10 ? ObjectHelper.compare(this.f78607s0, bVar2.f78607s0) : ObjectHelper.compare(j11, j10);
        }

        public final String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f78604p0), this.f78605q0.toString());
        }
    }

    public TestScheduler() {
    }

    public final void a(long j10) {
        while (true) {
            b bVar = (b) this.f78597r0.peek();
            if (bVar == null) {
                break;
            }
            long j11 = bVar.f78604p0;
            if (j11 > j10) {
                break;
            }
            if (j11 == 0) {
                j11 = this.f78599t0;
            }
            this.f78599t0 = j11;
            this.f78597r0.remove(bVar);
            if (!bVar.f78606r0.f78600p0) {
                bVar.f78605q0.run();
            }
        }
        this.f78599t0 = j10;
    }

    public void advanceTimeBy(long j10, TimeUnit timeUnit) {
        advanceTimeTo(timeUnit.toNanos(j10) + this.f78599t0, TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j10, TimeUnit timeUnit) {
        a(timeUnit.toNanos(j10));
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new a();
    }

    @Override // io.reactivex.Scheduler
    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f78599t0, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        a(this.f78599t0);
    }

    public TestScheduler(long j10, TimeUnit timeUnit) {
        this.f78599t0 = timeUnit.toNanos(j10);
    }

    public final class a extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public volatile boolean f78600p0;

        /* JADX INFO: renamed from: io.reactivex.schedulers.TestScheduler$a$a, reason: collision with other inner class name */
        public final class RunnableC0428a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final b f78602p0;

            public RunnableC0428a(b bVar) {
                this.f78602p0 = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TestScheduler.this.f78597r0.remove(this.f78602p0);
            }
        }

        public a() {
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f78600p0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f78600p0;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final long now(@NonNull TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            if (this.f78600p0) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = timeUnit.toNanos(j10) + TestScheduler.this.f78599t0;
            TestScheduler testScheduler = TestScheduler.this;
            long j11 = testScheduler.f78598s0;
            testScheduler.f78598s0 = 1 + j11;
            b bVar = new b(this, nanos, runnable, j11);
            testScheduler.f78597r0.add(bVar);
            return Disposables.fromRunnable(new RunnableC0428a(bVar));
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            if (this.f78600p0) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j10 = testScheduler.f78598s0;
            testScheduler.f78598s0 = 1 + j10;
            b bVar = new b(this, 0L, runnable, j10);
            testScheduler.f78597r0.add(bVar);
            return Disposables.fromRunnable(new RunnableC0428a(bVar));
        }
    }
}
