package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSingleMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72856p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f72857p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f72858q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f72859r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72860s0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f72857p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72858q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72858q0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72860s0) {
                return;
            }
            this.f72860s0 = true;
            T t10 = this.f72859r0;
            this.f72859r0 = null;
            MaybeObserver<? super T> maybeObserver = this.f72857p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72860s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72860s0 = true;
                this.f72857p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72860s0) {
                return;
            }
            if (this.f72859r0 == null) {
                this.f72859r0 = t10;
                return;
            }
            this.f72860s0 = true;
            this.f72858q0.dispose();
            this.f72857p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72858q0, disposable)) {
                this.f72858q0 = disposable;
                this.f72857p0.onSubscribe(this);
            }
        }
    }

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.f72856p0 = observableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f72856p0.subscribe(new a(maybeObserver));
    }
}
