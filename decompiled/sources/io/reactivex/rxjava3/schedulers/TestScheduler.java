package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class TestScheduler extends Scheduler {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final PriorityBlockingQueue f78353q0 = new PriorityBlockingQueue(11);

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public long f78354r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public volatile long f78355s0;

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f78360p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Runnable f78361q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final a f78362r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f78363s0;

        public b(a aVar, long j10, Runnable runnable, long j11) {
            this.f78360p0 = j10;
            this.f78361q0 = runnable;
            this.f78362r0 = aVar;
            this.f78363s0 = j11;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            long j10 = bVar2.f78360p0;
            long j11 = this.f78360p0;
            return j11 == j10 ? Long.compare(this.f78363s0, bVar2.f78363s0) : Long.compare(j11, j10);
        }

        public final String toString() {
            return String.format("TimedRunnable(time = %d, run = %s)", Long.valueOf(this.f78360p0), this.f78361q0.toString());
        }
    }

    public TestScheduler() {
    }

    public final void a(long j10) {
        while (true) {
            b bVar = (b) this.f78353q0.peek();
            if (bVar == null) {
                break;
            }
            long j11 = bVar.f78360p0;
            if (j11 > j10) {
                break;
            }
            if (j11 == 0) {
                j11 = this.f78355s0;
            }
            this.f78355s0 = j11;
            this.f78353q0.remove(bVar);
            if (!bVar.f78362r0.f78356p0) {
                bVar.f78361q0.run();
            }
        }
        this.f78355s0 = j10;
    }

    public void advanceTimeBy(long j10, TimeUnit timeUnit) {
        advanceTimeTo(timeUnit.toNanos(j10) + this.f78355s0, TimeUnit.NANOSECONDS);
    }

    public void advanceTimeTo(long j10, TimeUnit timeUnit) {
        a(timeUnit.toNanos(j10));
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new a();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    public long now(@NonNull TimeUnit timeUnit) {
        return timeUnit.convert(this.f78355s0, TimeUnit.NANOSECONDS);
    }

    public void triggerActions() {
        a(this.f78355s0);
    }

    public TestScheduler(long j10, TimeUnit timeUnit) {
        this.f78355s0 = timeUnit.toNanos(j10);
    }

    public final class a extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public volatile boolean f78356p0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.schedulers.TestScheduler$a$a, reason: collision with other inner class name */
        public final class RunnableC0427a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final b f78358p0;

            public RunnableC0427a(b bVar) {
                this.f78358p0 = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                TestScheduler.this.f78353q0.remove(this.f78358p0);
            }
        }

        public a() {
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f78356p0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f78356p0;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        public final long now(@NonNull TimeUnit timeUnit) {
            return TestScheduler.this.now(timeUnit);
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            if (this.f78356p0) {
                return EmptyDisposable.INSTANCE;
            }
            long nanos = timeUnit.toNanos(j10) + TestScheduler.this.f78355s0;
            TestScheduler testScheduler = TestScheduler.this;
            long j11 = testScheduler.f78354r0;
            testScheduler.f78354r0 = 1 + j11;
            b bVar = new b(this, nanos, runnable, j11);
            testScheduler.f78353q0.add(bVar);
            return d.g(new RunnableC0427a(bVar));
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            if (this.f78356p0) {
                return EmptyDisposable.INSTANCE;
            }
            TestScheduler testScheduler = TestScheduler.this;
            long j10 = testScheduler.f78354r0;
            testScheduler.f78354r0 = 1 + j10;
            b bVar = new b(this, 0L, runnable, j10);
            testScheduler.f78353q0.add(bVar);
            return d.g(new RunnableC0427a(bVar));
        }
    }
}
