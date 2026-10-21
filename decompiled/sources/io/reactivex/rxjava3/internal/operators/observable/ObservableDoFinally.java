package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.QueueDisposable;
import io.reactivex.rxjava3.internal.observers.BasicIntQueueDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDoFinally<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Action f76606p0;

    public static final class a<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76607p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f76608q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76609r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public QueueDisposable<T> f76610s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76611t0;

        public a(Observer<? super T> observer, Action action) {
            this.f76607p0 = observer;
            this.f76608q0 = action;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f76608q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f76610s0.clear();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76609r0.dispose();
            a();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76609r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f76610s0.isEmpty();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76607p0.onComplete();
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76607p0.onError(th2);
            a();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76607p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76609r0, disposable)) {
                this.f76609r0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f76610s0 = (QueueDisposable) disposable;
                }
                this.f76607p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.f76610s0.poll();
            if (tPoll == null && this.f76611t0) {
                a();
            }
            return tPoll;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            QueueDisposable<T> queueDisposable = this.f76610s0;
            if (queueDisposable == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueDisposable.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f76611t0 = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public ObservableDoFinally(ObservableSource<T> observableSource, Action action) {
        super(observableSource);
        this.f76606p0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76606p0));
    }
}
