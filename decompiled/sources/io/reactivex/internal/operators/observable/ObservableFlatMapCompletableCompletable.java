package io.reactivex.internal.operators.observable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMapCompletableCompletable<T> extends Completable implements FuseToObservable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72398p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f72399q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f72400r0;

    public static final class a<T> extends AtomicInteger implements Disposable, Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f72401p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f72403r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f72404s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72406u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f72402q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f72405t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapCompletableCompletable$a$a, reason: collision with other inner class name */
        public final class C0344a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0344a() {
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f72405t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f72405t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(CompletableObserver completableObserver, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f72401p0 = completableObserver;
            this.f72403r0 = function;
            this.f72404s0 = z10;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            this.f72406u0.dispose();
            this.f72405t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72406u0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTerminate = this.f72402q0.terminate();
                CompletableObserver completableObserver = this.f72401p0;
                if (thTerminate != null) {
                    completableObserver.onError(thTerminate);
                } else {
                    completableObserver.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f72402q0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            boolean z10 = this.f72404s0;
            CompletableObserver completableObserver = this.f72401p0;
            if (z10) {
                if (decrementAndGet() == 0) {
                    completableObserver.onError(atomicThrowable.terminate());
                }
            } else {
                dispose();
                if (getAndSet(0) > 0) {
                    completableObserver.onError(atomicThrowable.terminate());
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f72403r0.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0344a c0344a = new C0344a();
                if (this.v0 || !this.f72405t0.add(c0344a)) {
                    return;
                }
                completableSource.subscribe(c0344a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72406u0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72406u0, disposable)) {
                this.f72406u0 = disposable;
                this.f72401p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapCompletableCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        this.f72398p0 = observableSource;
        this.f72399q0 = function;
        this.f72400r0 = z10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableFlatMapCompletable(this.f72398p0, this.f72399q0, this.f72400r0));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f72398p0.subscribe(new a(completableObserver, this.f72399q0, this.f72400r0));
    }
}
