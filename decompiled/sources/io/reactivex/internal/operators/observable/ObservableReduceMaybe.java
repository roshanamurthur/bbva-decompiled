package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReduceMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72677p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<T, T, T> f72678q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f72679p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f72680q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f72681r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f72682s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f72683t0;

        public a(MaybeObserver<? super T> maybeObserver, BiFunction<T, T, T> biFunction) {
            this.f72679p0 = maybeObserver;
            this.f72680q0 = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72683t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72683t0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72681r0) {
                return;
            }
            this.f72681r0 = true;
            T t10 = this.f72682s0;
            this.f72682s0 = null;
            MaybeObserver<? super T> maybeObserver = this.f72679p0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72681r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f72681r0 = true;
            this.f72682s0 = null;
            this.f72679p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72681r0) {
                return;
            }
            T t11 = this.f72682s0;
            if (t11 == null) {
                this.f72682s0 = t10;
                return;
            }
            try {
                this.f72682s0 = (T) ObjectHelper.requireNonNull(this.f72680q0.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72683t0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72683t0, disposable)) {
                this.f72683t0 = disposable;
                this.f72679p0.onSubscribe(this);
            }
        }
    }

    public ObservableReduceMaybe(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        this.f72677p0 = observableSource;
        this.f72678q0 = biFunction;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f72677p0.subscribe(new a(maybeObserver, this.f72678q0));
    }
}
