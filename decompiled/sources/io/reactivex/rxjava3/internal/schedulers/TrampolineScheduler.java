package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class TrampolineScheduler extends Scheduler {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final TrampolineScheduler f78007q0 = new TrampolineScheduler();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f78008p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c f78009q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f78010r0;

        public a(Runnable runnable, c cVar, long j10) {
            this.f78008p0 = runnable;
            this.f78009q0 = cVar;
            this.f78010r0 = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f78009q0.f78018s0) {
                return;
            }
            long jNow = this.f78009q0.now(TimeUnit.MILLISECONDS);
            long j10 = this.f78010r0;
            if (j10 > jNow) {
                try {
                    Thread.sleep(j10 - jNow);
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.onError(e5);
                    return;
                }
            }
            if (this.f78009q0.f78018s0) {
                return;
            }
            this.f78008p0.run();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f78011p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f78012q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f78013r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f78014s0;

        public b(Runnable runnable, Long l6, int i10) {
            this.f78011p0 = runnable;
            this.f78012q0 = l6.longValue();
            this.f78013r0 = i10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int iCompare = Long.compare(this.f78012q0, bVar2.f78012q0);
            return iCompare == 0 ? Integer.compare(this.f78013r0, bVar2.f78013r0) : iCompare;
        }
    }

    public static final class c extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f78015p0 = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f78016q0 = new AtomicInteger();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f78017r0 = new AtomicInteger();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f78018s0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final b f78019p0;

            public a(b bVar) {
                this.f78019p0 = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f78019p0.f78014s0 = true;
                c.this.f78015p0.remove(this.f78019p0);
            }
        }

        public final Disposable a(Runnable runnable, long j10) {
            if (this.f78018s0) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f78017r0.incrementAndGet());
            this.f78015p0.add(bVar);
            if (this.f78016q0.getAndIncrement() != 0) {
                return d.g(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f78018s0) {
                b bVarPoll = this.f78015p0.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f78016q0.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f78014s0) {
                    bVarPoll.f78011p0.run();
                }
            }
            this.f78015p0.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f78018s0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f78018s0;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            return a(runnable, now(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j10) + now(TimeUnit.MILLISECONDS);
            return a(new a(runnable, this, millis), millis);
        }
    }

    public static TrampolineScheduler instance() {
        return f78007q0;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new c();
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable, long j10, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j10);
            RxJavaPlugins.onSchedule(runnable).run();
        } catch (InterruptedException e5) {
            Thread.currentThread().interrupt();
            RxJavaPlugins.onError(e5);
        }
        return EmptyDisposable.INSTANCE;
    }
}
