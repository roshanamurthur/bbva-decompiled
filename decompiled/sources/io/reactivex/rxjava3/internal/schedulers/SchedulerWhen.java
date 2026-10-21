package io.reactivex.rxjava3.internal.schedulers;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public class SchedulerWhen extends Scheduler implements Disposable {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final g f77983t0 = new g();

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final Disposable f77984u0 = rj.d.a();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f77985q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final FlowableProcessor<Flowable<Completable>> f77986r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Disposable f77987s0;

    public static final class a implements Function<f, Completable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Scheduler.Worker f77988p0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.schedulers.SchedulerWhen$a$a, reason: collision with other inner class name */
        public final class C0426a extends Completable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final f f77989p0;

            public C0426a(f fVar) {
                this.f77989p0 = fVar;
            }

            @Override // io.reactivex.rxjava3.core.Completable
            public final void subscribeActual(CompletableObserver completableObserver) {
                g gVar;
                f fVar = this.f77989p0;
                completableObserver.onSubscribe(fVar);
                Scheduler.Worker worker = a.this.f77988p0;
                Disposable disposable = fVar.get();
                if (disposable != SchedulerWhen.f77984u0 && disposable == (gVar = SchedulerWhen.f77983t0)) {
                    Disposable disposableA = fVar.a(worker, completableObserver);
                    if (fVar.compareAndSet(gVar, disposableA)) {
                        return;
                    }
                    disposableA.dispose();
                }
            }
        }

        public a(Scheduler.Worker worker) {
            this.f77988p0 = worker;
        }

        @Override // io.reactivex.rxjava3.functions.Function
        public final Completable apply(f fVar) throws Throwable {
            return new C0426a(fVar);
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f77991p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f77992q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f77993r0;

        public b(Runnable runnable, long j10, TimeUnit timeUnit) {
            this.f77991p0 = runnable;
            this.f77992q0 = j10;
            this.f77993r0 = timeUnit;
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.SchedulerWhen.f
        public final Disposable a(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new d(this.f77991p0, completableObserver), this.f77992q0, this.f77993r0);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f77994p0;

        public c(Runnable runnable) {
            this.f77994p0 = runnable;
        }

        @Override // io.reactivex.rxjava3.internal.schedulers.SchedulerWhen.f
        public final Disposable a(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new d(this.f77994p0, completableObserver));
        }
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f77995p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Runnable f77996q0;

        public d(Runnable runnable, CompletableObserver completableObserver) {
            this.f77996q0 = runnable;
            this.f77995p0 = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CompletableObserver completableObserver = this.f77995p0;
            try {
                this.f77996q0.run();
            } finally {
                completableObserver.onComplete();
            }
        }
    }

    public static abstract class f extends AtomicReference<Disposable> implements Disposable {
        public f() {
            super(SchedulerWhen.f77983t0);
        }

        public abstract Disposable a(Scheduler.Worker worker, CompletableObserver completableObserver);

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            getAndSet(SchedulerWhen.f77984u0).dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return get().isDisposed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchedulerWhen(Function<Flowable<Flowable<Completable>>, Completable> function, Scheduler scheduler) {
        this.f77985q0 = scheduler;
        FlowableProcessor serialized = UnicastProcessor.create().toSerialized();
        this.f77986r0 = serialized;
        try {
            this.f77987s0 = ((Completable) function.apply(serialized)).subscribe();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.rxjava3.core.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        Scheduler.Worker workerCreateWorker = this.f77985q0.createWorker();
        FlowableProcessor<T> serialized = UnicastProcessor.create().toSerialized();
        Flowable<Completable> map = serialized.map(new a(workerCreateWorker));
        e eVar = new e(serialized, workerCreateWorker);
        this.f77986r0.onNext(map);
        return eVar;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public void dispose() {
        this.f77987s0.dispose();
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public boolean isDisposed() {
        return this.f77987s0.isDisposed();
    }

    public static final class e extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f77997p0 = new AtomicBoolean();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableProcessor<f> f77998q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler.Worker f77999r0;

        public e(FlowableProcessor<f> flowableProcessor, Scheduler.Worker worker) {
            this.f77998q0 = flowableProcessor;
            this.f77999r0 = worker;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            if (this.f77997p0.compareAndSet(false, true)) {
                this.f77998q0.onComplete();
                this.f77999r0.dispose();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77997p0.get();
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            b bVar = new b(runnable, j10, timeUnit);
            this.f77998q0.onNext(bVar);
            return bVar;
        }

        @Override // io.reactivex.rxjava3.core.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            c cVar = new c(runnable);
            this.f77998q0.onNext(cVar);
            return cVar;
        }
    }

    public static final class g implements Disposable {
        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return false;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
        }
    }
}
