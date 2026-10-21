package io.reactivex.internal.operators.observable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMapCompletable<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f72389p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final boolean f72390q0;

    public ObservableFlatMapCompletable(ObservableSource<T> observableSource, Function<? super T, ? extends CompletableSource> function, boolean z10) {
        super(observableSource);
        this.f72389p0 = function;
        this.f72390q0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72389p0, this.f72390q0));
    }

    public static final class a<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72391p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f72393r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f72394s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72396u0;
        public volatile boolean v0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f72392q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f72395t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.observable.ObservableFlatMapCompletable$a$a, reason: collision with other inner class name */
        public final class C0343a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0343a() {
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
                aVar.f72395t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f72395t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(Observer<? super T> observer, Function<? super T, ? extends CompletableSource> function, boolean z10) {
            this.f72391p0 = observer;
            this.f72393r0 = function;
            this.f72394s0 = z10;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.v0 = true;
            this.f72396u0.dispose();
            this.f72395t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72396u0.isDisposed();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                Throwable thTerminate = this.f72392q0.terminate();
                Observer<? super T> observer = this.f72391p0;
                if (thTerminate != null) {
                    observer.onError(thTerminate);
                } else {
                    observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f72392q0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            boolean z10 = this.f72394s0;
            Observer<? super T> observer = this.f72391p0;
            if (z10) {
                if (decrementAndGet() == 0) {
                    observer.onError(atomicThrowable.terminate());
                }
            } else {
                dispose();
                if (getAndSet(0) > 0) {
                    observer.onError(atomicThrowable.terminate());
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f72393r0.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0343a c0343a = new C0343a();
                if (this.v0 || !this.f72395t0.add(c0343a)) {
                    return;
                }
                completableSource.subscribe(c0343a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72396u0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72396u0, disposable)) {
                this.f72396u0 = disposable;
                this.f72391p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }
    }
}
