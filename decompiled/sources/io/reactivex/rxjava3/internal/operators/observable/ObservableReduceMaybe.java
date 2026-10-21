package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableReduceMaybe<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76954p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<T, T, T> f76955q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76956p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f76957q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f76958r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f76959s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f76960t0;

        public a(MaybeObserver<? super T> maybeObserver, BiFunction<T, T, T> biFunction) {
            this.f76956p0 = maybeObserver;
            this.f76957q0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76960t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76960t0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76958r0) {
                return;
            }
            this.f76958r0 = true;
            T t10 = this.f76959s0;
            this.f76959s0 = null;
            MaybeObserver<? super T> maybeObserver = this.f76956p0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76958r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f76958r0 = true;
            this.f76959s0 = null;
            this.f76956p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76958r0) {
                return;
            }
            T t11 = this.f76959s0;
            if (t11 == null) {
                this.f76959s0 = t10;
                return;
            }
            try {
                T tApply = this.f76957q0.apply(t11, t10);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.f76959s0 = tApply;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76960t0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76960t0, disposable)) {
                this.f76960t0 = disposable;
                this.f76956p0.onSubscribe(this);
            }
        }
    }

    public ObservableReduceMaybe(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        this.f76954p0 = observableSource;
        this.f76955q0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f76954p0.subscribe(new a(maybeObserver, this.f76955q0));
    }
}
