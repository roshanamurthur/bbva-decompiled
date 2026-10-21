package io.reactivex.internal.operators.single;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelayWithObservable<T, U> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73408p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ObservableSource<U> f73409q0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements Observer<U>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73410p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<T> f73411q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f73412r0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f73410p0 = singleObserver;
            this.f73411q0 = singleSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f73412r0) {
                return;
            }
            this.f73412r0 = true;
            this.f73411q0.subscribe(new ResumeSingleObserver(this, this.f73410p0));
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f73412r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f73412r0 = true;
                this.f73410p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(U u2) {
            get().dispose();
            onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.set(this, disposable)) {
                this.f73410p0.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithObservable(SingleSource<T> singleSource, ObservableSource<U> observableSource) {
        this.f73408p0 = singleSource;
        this.f73409q0 = observableSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73409q0.subscribe(new a(singleObserver, this.f73408p0));
    }
}
