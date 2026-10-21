package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class TrampolineScheduler extends Scheduler {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final TrampolineScheduler f73716r0 = new TrampolineScheduler();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f73717p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c f73718q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final long f73719r0;

        public a(Runnable runnable, c cVar, long j10) {
            this.f73717p0 = runnable;
            this.f73718q0 = cVar;
            this.f73719r0 = j10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f73718q0.f73727s0) {
                return;
            }
            long jNow = this.f73718q0.now(TimeUnit.MILLISECONDS);
            long j10 = this.f73719r0;
            if (j10 > jNow) {
                try {
                    Thread.sleep(j10 - jNow);
                } catch (InterruptedException e5) {
                    Thread.currentThread().interrupt();
                    RxJavaPlugins.onError(e5);
                    return;
                }
            }
            if (this.f73718q0.f73727s0) {
                return;
            }
            this.f73717p0.run();
        }
    }

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f73720p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73721q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final int f73722r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f73723s0;

        public b(Runnable runnable, Long l6, int i10) {
            this.f73720p0 = runnable;
            this.f73721q0 = l6.longValue();
            this.f73722r0 = i10;
        }

        @Override // java.lang.Comparable
        public final int compareTo(b bVar) {
            b bVar2 = bVar;
            int iCompare = ObjectHelper.compare(this.f73721q0, bVar2.f73721q0);
            return iCompare == 0 ? ObjectHelper.compare(this.f73722r0, bVar2.f73722r0) : iCompare;
        }
    }

    public static final class c extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final PriorityBlockingQueue<b> f73724p0 = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicInteger f73725q0 = new AtomicInteger();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f73726r0 = new AtomicInteger();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f73727s0;

        public final class a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final b f73728p0;

            public a(b bVar) {
                this.f73728p0 = bVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f73728p0.f73723s0 = true;
                c.this.f73724p0.remove(this.f73728p0);
            }
        }

        public final Disposable a(Runnable runnable, long j10) {
            if (this.f73727s0) {
                return EmptyDisposable.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j10), this.f73726r0.incrementAndGet());
            this.f73724p0.add(bVar);
            if (this.f73725q0.getAndIncrement() != 0) {
                return Disposables.fromRunnable(new a(bVar));
            }
            int iAddAndGet = 1;
            while (!this.f73727s0) {
                b bVarPoll = this.f73724p0.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f73725q0.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return EmptyDisposable.INSTANCE;
                    }
                } else if (!bVarPoll.f73723s0) {
                    bVarPoll.f73720p0.run();
                }
            }
            this.f73724p0.clear();
            return EmptyDisposable.INSTANCE;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73727s0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73727s0;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            return a(runnable, now(TimeUnit.MILLISECONDS));
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            long millis = timeUnit.toMillis(j10) + now(TimeUnit.MILLISECONDS);
            return a(new a(runnable, this, millis), millis);
        }
    }

    public static TrampolineScheduler instance() {
        return f73716r0;
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        return new c();
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Disposable scheduleDirect(@NonNull Runnable runnable) {
        RxJavaPlugins.onSchedule(runnable).run();
        return EmptyDisposable.INSTANCE;
    }

    @Override // io.reactivex.Scheduler
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
