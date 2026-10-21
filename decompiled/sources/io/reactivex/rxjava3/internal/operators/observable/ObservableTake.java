package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTake<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f77209p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77210p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f77211q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77212r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f77213s0;

        public a(Observer<? super T> observer, long j10) {
            this.f77210p0 = observer;
            this.f77213s0 = j10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77212r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77212r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77211q0) {
                return;
            }
            this.f77211q0 = true;
            this.f77212r0.dispose();
            this.f77210p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77211q0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f77211q0 = true;
            this.f77212r0.dispose();
            this.f77210p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77211q0) {
                return;
            }
            long j10 = this.f77213s0;
            long j11 = j10 - 1;
            this.f77213s0 = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f77210p0.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77212r0, disposable)) {
                this.f77212r0 = disposable;
                long j10 = this.f77213s0;
                Observer<? super T> observer = this.f77210p0;
                if (j10 != 0) {
                    observer.onSubscribe(this);
                    return;
                }
                this.f77211q0 = true;
                disposable.dispose();
                EmptyDisposable.complete(observer);
            }
        }
    }

    public ObservableTake(ObservableSource<T> observableSource, long j10) {
        super(observableSource);
        this.f77209p0 = j10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77209p0));
    }
}
