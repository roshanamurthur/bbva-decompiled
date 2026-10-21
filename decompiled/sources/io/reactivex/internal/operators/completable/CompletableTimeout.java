package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableTimeout extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70123p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f70124q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f70125r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f70126s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final CompletableSource f70127t0;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f70128p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f70129q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableObserver f70130r0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.completable.CompletableTimeout$a$a, reason: collision with other inner class name */
        public final class C0299a implements CompletableObserver {
            public C0299a() {
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f70129q0.dispose();
                aVar.f70130r0.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f70129q0.dispose();
                aVar.f70130r0.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                a.this.f70129q0.add(disposable);
            }
        }

        public a(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.f70128p0 = atomicBoolean;
            this.f70129q0 = compositeDisposable;
            this.f70130r0 = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f70128p0.compareAndSet(false, true)) {
                this.f70129q0.clear();
                CompletableTimeout completableTimeout = CompletableTimeout.this;
                CompletableSource completableSource = completableTimeout.f70127t0;
                if (completableSource != null) {
                    completableSource.subscribe(new C0299a());
                } else {
                    this.f70130r0.onError(new TimeoutException(ExceptionHelper.timeoutMessage(completableTimeout.f70124q0, completableTimeout.f70125r0)));
                }
            }
        }
    }

    public static final class b implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompositeDisposable f70133p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicBoolean f70134q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableObserver f70135r0;

        public b(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f70133p0 = compositeDisposable;
            this.f70134q0 = atomicBoolean;
            this.f70135r0 = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f70134q0.compareAndSet(false, true)) {
                this.f70133p0.dispose();
                this.f70135r0.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f70134q0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70133p0.dispose();
                this.f70135r0.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70133p0.add(disposable);
        }
    }

    public CompletableTimeout(CompletableSource completableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource2) {
        this.f70123p0 = completableSource;
        this.f70124q0 = j10;
        this.f70125r0 = timeUnit;
        this.f70126s0 = scheduler;
        this.f70127t0 = completableSource2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.add(this.f70126s0.scheduleDirect(new a(atomicBoolean, compositeDisposable, completableObserver), this.f70124q0, this.f70125r0));
        this.f70123p0.subscribe(new b(completableObserver, compositeDisposable, atomicBoolean));
    }
}
