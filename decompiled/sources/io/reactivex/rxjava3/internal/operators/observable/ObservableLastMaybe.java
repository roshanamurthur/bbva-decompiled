package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76851p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76852p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f76853q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f76854r0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f76852p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76853q0.dispose();
            this.f76853q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76853q0 == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f76853q0 = DisposableHelper.DISPOSED;
            T t10 = this.f76854r0;
            MaybeObserver<? super T> maybeObserver = this.f76852p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                this.f76854r0 = null;
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f76853q0 = DisposableHelper.DISPOSED;
            this.f76854r0 = null;
            this.f76852p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            this.f76854r0 = t10;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76853q0, disposable)) {
                this.f76853q0 = disposable;
                this.f76852p0.onSubscribe(this);
            }
        }
    }

    public ObservableLastMaybe(ObservableSource<T> observableSource) {
        this.f76851p0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f76851p0.subscribe(new a(maybeObserver));
    }
}
