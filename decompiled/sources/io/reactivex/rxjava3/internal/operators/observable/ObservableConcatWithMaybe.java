package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableConcatWithMaybe<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T> f76517p0;

    public static final class a<T> extends AtomicReference<Disposable> implements Observer<T>, MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76518p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MaybeSource<? extends T> f76519q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f76520r0;

        public a(Observer<? super T> observer, MaybeSource<? extends T> maybeSource) {
            this.f76518p0 = observer;
            this.f76519q0 = maybeSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76520r0) {
                this.f76518p0.onComplete();
                return;
            }
            this.f76520r0 = true;
            DisposableHelper.replace(this, null);
            MaybeSource<? extends T> maybeSource = this.f76519q0;
            this.f76519q0 = null;
            maybeSource.subscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76518p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76518p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (!DisposableHelper.setOnce(this, disposable) || this.f76520r0) {
                return;
            }
            this.f76518p0.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            Observer<? super T> observer = this.f76518p0;
            observer.onNext(t10);
            observer.onComplete();
        }
    }

    public ObservableConcatWithMaybe(Observable<T> observable, MaybeSource<? extends T> maybeSource) {
        super(observable);
        this.f76517p0 = maybeSource;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76517p0));
    }
}
