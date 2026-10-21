package io.reactivex.internal.operators.observable;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatWithMaybe<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T> f72236p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72237p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MaybeSource<? extends T> f72238q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f72239r0;

        public a(Observer<? super T> observer, MaybeSource<? extends T> maybeSource) {
            this.f72237p0 = observer;
            this.f72238q0 = maybeSource;
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
            if (this.f72239r0) {
                this.f72237p0.onComplete();
                return;
            }
            this.f72239r0 = true;
            DisposableHelper.replace(this, null);
            MaybeSource<? extends T> maybeSource = this.f72238q0;
            this.f72238q0 = null;
            maybeSource.subscribe(this);
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72237p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72237p0.onNext(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (!DisposableHelper.setOnce(this, disposable) || this.f72239r0) {
                return;
            }
            this.f72237p0.onSubscribe(this);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            Observer<? super T> observer = this.f72237p0;
            observer.onNext(t10);
            observer.onComplete();
        }
    }

    public ObservableConcatWithMaybe(Observable<T> observable, MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.f72236p0 = maybeSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72236p0));
    }
}
