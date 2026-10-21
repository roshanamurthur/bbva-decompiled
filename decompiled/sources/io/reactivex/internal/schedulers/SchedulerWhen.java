package io.reactivex.internal.schedulers;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.Scheduler;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public class SchedulerWhen extends Scheduler implements Disposable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final g f73693u0 = new g();
    public static final Disposable v0 = Disposables.disposed();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f73694r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final FlowableProcessor<Flowable<Completable>> f73695s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final Disposable f73696t0;

    public static final class a implements Function<f, Completable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Scheduler.Worker f73697p0;

        /* JADX INFO: renamed from: io.reactivex.internal.schedulers.SchedulerWhen$a$a, reason: collision with other inner class name */
        public final class C0359a extends Completable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final f f73698p0;

            public C0359a(f fVar) {
                this.f73698p0 = fVar;
            }

            @Override // io.reactivex.Completable
            public final void subscribeActual(CompletableObserver completableObserver) {
                g gVar;
                f fVar = this.f73698p0;
                completableObserver.onSubscribe(fVar);
                Scheduler.Worker worker = a.this.f73697p0;
                Disposable disposable = fVar.get();
                if (disposable != SchedulerWhen.v0 && disposable == (gVar = SchedulerWhen.f73693u0)) {
                    Disposable disposableA = fVar.a(worker, completableObserver);
                    if (fVar.compareAndSet(gVar, disposableA)) {
                        return;
                    }
                    disposableA.dispose();
                }
            }
        }

        public a(Scheduler.Worker worker) {
            this.f73697p0 = worker;
        }

        @Override // io.reactivex.functions.Function
        public final Completable apply(f fVar) throws Exception {
            return new C0359a(fVar);
        }
    }

    public static class b extends f {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f73700p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f73701q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f73702r0;

        public b(Runnable runnable, long j10, TimeUnit timeUnit) {
            this.f73700p0 = runnable;
            this.f73701q0 = j10;
            this.f73702r0 = timeUnit;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.f
        public final Disposable a(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new d(this.f73700p0, completableObserver), this.f73701q0, this.f73702r0);
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Runnable f73703p0;

        public c(Runnable runnable) {
            this.f73703p0 = runnable;
        }

        @Override // io.reactivex.internal.schedulers.SchedulerWhen.f
        public final Disposable a(Scheduler.Worker worker, CompletableObserver completableObserver) {
            return worker.schedule(new d(this.f73703p0, completableObserver));
        }
    }

    public static class d implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f73704p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Runnable f73705q0;

        public d(Runnable runnable, CompletableObserver completableObserver) {
            this.f73705q0 = runnable;
            this.f73704p0 = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CompletableObserver completableObserver = this.f73704p0;
            try {
                this.f73705q0.run();
            } finally {
                completableObserver.onComplete();
            }
        }
    }

    public static abstract class f extends AtomicReference<Disposable> implements Disposable {
        public f() {
            super(SchedulerWhen.f73693u0);
        }

        public abstract Disposable a(Scheduler.Worker worker, CompletableObserver completableObserver);

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            Disposable disposable;
            Disposable disposable2 = SchedulerWhen.v0;
            do {
                disposable = get();
                if (disposable == SchedulerWhen.v0) {
                    return;
                }
            } while (!compareAndSet(disposable, disposable2));
            if (disposable != SchedulerWhen.f73693u0) {
                disposable.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return get().isDisposed();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SchedulerWhen(Function<Flowable<Flowable<Completable>>, Completable> function, Scheduler scheduler) {
        this.f73694r0 = scheduler;
        FlowableProcessor serialized = UnicastProcessor.create().toSerialized();
        this.f73695s0 = serialized;
        try {
            this.f73696t0 = ((Completable) function.apply(serialized)).subscribe();
        } catch (Throwable th2) {
            throw ExceptionHelper.wrapOrThrow(th2);
        }
    }

    @Override // io.reactivex.Scheduler
    @NonNull
    public Scheduler.Worker createWorker() {
        Scheduler.Worker workerCreateWorker = this.f73694r0.createWorker();
        FlowableProcessor<T> serialized = UnicastProcessor.create().toSerialized();
        Flowable<Completable> map = serialized.map(new a(workerCreateWorker));
        e eVar = new e(serialized, workerCreateWorker);
        this.f73695s0.onNext(map);
        return eVar;
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
        this.f73696t0.dispose();
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return this.f73696t0.isDisposed();
    }

    public static final class e extends Scheduler.Worker {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f73706p0 = new AtomicBoolean();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FlowableProcessor<f> f73707q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler.Worker f73708r0;

        public e(FlowableProcessor<f> flowableProcessor, Scheduler.Worker worker) {
            this.f73707q0 = flowableProcessor;
            this.f73708r0 = worker;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            if (this.f73706p0.compareAndSet(false, true)) {
                this.f73707q0.onComplete();
                this.f73708r0.dispose();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73706p0.get();
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable, long j10, @NonNull TimeUnit timeUnit) {
            b bVar = new b(runnable, j10, timeUnit);
            this.f73707q0.onNext(bVar);
            return bVar;
        }

        @Override // io.reactivex.Scheduler.Worker
        @NonNull
        public final Disposable schedule(@NonNull Runnable runnable) {
            c cVar = new c(runnable);
            this.f73707q0.onNext(cVar);
            return cVar;
        }
    }

    public static final class g implements Disposable {
        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return false;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
        }
    }
}
