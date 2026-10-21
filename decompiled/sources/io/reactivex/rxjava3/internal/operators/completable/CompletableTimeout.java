package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableTimeout extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74387p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f74388q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f74389r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Scheduler f74390s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final CompletableSource f74391t0;

    public final class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicBoolean f74392p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f74393q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableObserver f74394r0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.completable.CompletableTimeout$a$a, reason: collision with other inner class name */
        public final class C0363a implements CompletableObserver {
            public C0363a() {
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f74393q0.dispose();
                aVar.f74394r0.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f74393q0.dispose();
                aVar.f74394r0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                a.this.f74393q0.add(disposable);
            }
        }

        public a(AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, CompletableObserver completableObserver) {
            this.f74392p0 = atomicBoolean;
            this.f74393q0 = compositeDisposable;
            this.f74394r0 = completableObserver;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f74392p0.compareAndSet(false, true)) {
                this.f74393q0.clear();
                CompletableTimeout completableTimeout = CompletableTimeout.this;
                CompletableSource completableSource = completableTimeout.f74391t0;
                if (completableSource != null) {
                    completableSource.subscribe(new C0363a());
                } else {
                    this.f74394r0.onError(new TimeoutException(ExceptionHelper.timeoutMessage(completableTimeout.f74388q0, completableTimeout.f74389r0)));
                }
            }
        }
    }

    public static final class b implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompositeDisposable f74397p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicBoolean f74398q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompletableObserver f74399r0;

        public b(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicBoolean atomicBoolean) {
            this.f74397p0 = compositeDisposable;
            this.f74398q0 = atomicBoolean;
            this.f74399r0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f74398q0.compareAndSet(false, true)) {
                this.f74397p0.dispose();
                this.f74399r0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            if (!this.f74398q0.compareAndSet(false, true)) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74397p0.dispose();
                this.f74399r0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74397p0.add(disposable);
        }
    }

    public CompletableTimeout(CompletableSource completableSource, long j10, TimeUnit timeUnit, Scheduler scheduler, CompletableSource completableSource2) {
        this.f74387p0 = completableSource;
        this.f74388q0 = j10;
        this.f74389r0 = timeUnit;
        this.f74390s0 = scheduler;
        this.f74391t0 = completableSource2;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        compositeDisposable.add(this.f74390s0.scheduleDirect(new a(atomicBoolean, compositeDisposable, completableObserver), this.f74388q0, this.f74389r0));
        this.f74387p0.subscribe(new b(completableObserver, compositeDisposable, atomicBoolean));
    }
}
