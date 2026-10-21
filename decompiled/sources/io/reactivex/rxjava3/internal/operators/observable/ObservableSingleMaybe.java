package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f77133p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f77134p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f77135q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f77136r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77137s0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f77134p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77135q0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77135q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f77137s0) {
                return;
            }
            this.f77137s0 = true;
            T t10 = this.f77136r0;
            this.f77136r0 = null;
            MaybeObserver<? super T> maybeObserver = this.f77134p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f77137s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f77137s0 = true;
                this.f77134p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f77137s0) {
                return;
            }
            if (this.f77136r0 == null) {
                this.f77136r0 = t10;
                return;
            }
            this.f77137s0 = true;
            this.f77135q0.dispose();
            this.f77134p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77135q0, disposable)) {
                this.f77135q0 = disposable;
                this.f77134p0.onSubscribe(this);
            }
        }
    }

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.f77133p0 = observableSource;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f77133p0.subscribe(new a(maybeObserver));
    }
}
