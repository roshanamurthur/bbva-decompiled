package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends Completable implements FuseToObservable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76678p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f76679q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f76680r0;

    public static final class a<T> extends AtomicInteger implements Disposable, Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f76681p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f76683r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f76684s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f76686u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f76682q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f76685t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.observable.ObservableFlatMapCompletableCompletable$a$a, reason: collision with other inner class name */
        public final class C0409a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0409a() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f76685t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f76685t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f76681p0 = completableObserver;
            this.f76683r0 = function;
            this.f76684s0 = z10;
            lazySet(1);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            this.f76686u0.dispose();
            this.f76685t0.dispose();
            this.f76682q0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76686u0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f76682q0.tryTerminateConsumer(this.f76681p0);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76682q0.tryAddThrowableOrReport(th2)) {
                if (this.f76684s0) {
                    if (decrementAndGet() == 0) {
                        this.f76682q0.tryTerminateConsumer(this.f76681p0);
                    }
                } else {
                    this.v0 = true;
                    this.f76686u0.dispose();
                    this.f76685t0.dispose();
                    this.f76682q0.tryTerminateConsumer(this.f76681p0);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            try {
                CompletableSource completableSourceApply = this.f76683r0.apply(t10);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                getAndIncrement();
                C0409a c0409a = new C0409a();
                if (this.v0 || !this.f76685t0.add(c0409a)) {
                    return;
                }
                completableSource.subscribe(c0409a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76686u0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76686u0, disposable)) {
                this.f76686u0 = disposable;
                this.f76681p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapCompletableCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        this.f76678p0 = observableSource;
        this.f76679q0 = function;
        this.f76680r0 = z10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableFlatMapCompletable(this.f76678p0, this.f76679q0, this.f76680r0));
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f76678p0.subscribe(new a(completableObserver, this.f76679q0, this.f76680r0));
    }
}
