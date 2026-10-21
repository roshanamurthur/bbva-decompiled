package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableLastMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72565p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f72566p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72567q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f72568r0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f72566p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72567q0.dispose();
            this.f72567q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72567q0 == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72567q0 = DisposableHelper.DISPOSED;
            T t10 = this.f72568r0;
            MaybeObserver<? super T> maybeObserver = this.f72566p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                this.f72568r0 = null;
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72567q0 = DisposableHelper.DISPOSED;
            this.f72568r0 = null;
            this.f72566p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            this.f72568r0 = t10;
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72567q0, disposable)) {
                this.f72567q0 = disposable;
                this.f72566p0.onSubscribe(this);
            }
        }
    }

    public ObservableLastMaybe(ObservableSource<T> observableSource) {
        this.f72565p0 = observableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f72565p0.subscribe(new a(maybeObserver));
    }
}
