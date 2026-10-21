package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDoFinally<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Action f72325p0;

    public static final class a<T> extends BasicIntQueueDisposable<T> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72326p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f72327q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72328r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public QueueDisposable<T> f72329s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72330t0;

        public a(Observer<? super T> observer, Action action) {
            this.f72326p0 = observer;
            this.f72327q0 = action;
        }

        public final void a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f72327q0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f72329s0.clear();
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72328r0.dispose();
            a();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72328r0.isDisposed();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f72329s0.isEmpty();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72326p0.onComplete();
            a();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72326p0.onError(th2);
            a();
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72326p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72328r0, disposable)) {
                this.f72328r0 = disposable;
                if (disposable instanceof QueueDisposable) {
                    this.f72329s0 = (QueueDisposable) disposable;
                }
                this.f72326p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            T tPoll = this.f72329s0.poll();
            if (tPoll == null && this.f72330t0) {
                a();
            }
            return tPoll;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            QueueDisposable<T> queueDisposable = this.f72329s0;
            if (queueDisposable == null || (i10 & 4) != 0) {
                return 0;
            }
            int iRequestFusion = queueDisposable.requestFusion(i10);
            if (iRequestFusion != 0) {
                this.f72330t0 = iRequestFusion == 1;
            }
            return iRequestFusion;
        }
    }

    public ObservableDoFinally(ObservableSource<T> observableSource, Action action) {
        super(observableSource);
        this.f72325p0 = action;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72325p0));
    }
}
