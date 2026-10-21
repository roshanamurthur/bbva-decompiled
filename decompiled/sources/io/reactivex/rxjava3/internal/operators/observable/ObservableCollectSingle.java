package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCollectSingle<T, U> extends Single<U> implements FuseToObservable<U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76425p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<? extends U> f76426q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f76427r0;

    public static final class a<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super U> f76428p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f76429q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final U f76430r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76431s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76432t0;

        public a(SingleObserver<? super U> singleObserver, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            this.f76428p0 = singleObserver;
            this.f76429q0 = biConsumer;
            this.f76430r0 = u2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76431s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76431s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76432t0) {
                return;
            }
            this.f76432t0 = true;
            this.f76428p0.onSuccess(this.f76430r0);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76432t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76432t0 = true;
                this.f76428p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76432t0) {
                return;
            }
            try {
                this.f76429q0.accept(this.f76430r0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76431s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76431s0, disposable)) {
                this.f76431s0 = disposable;
                this.f76428p0.onSubscribe(this);
            }
        }
    }

    public ObservableCollectSingle(ObservableSource<T> observableSource, Supplier<? extends U> supplier, BiConsumer<? super U, ? super T> biConsumer) {
        this.f76425p0 = observableSource;
        this.f76426q0 = supplier;
        this.f76427r0 = biConsumer;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<U> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableCollect(this.f76425p0, this.f76426q0, this.f76427r0));
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super U> singleObserver) {
        try {
            U u2 = this.f76426q0.get();
            Objects.requireNonNull(u2, "The initialSupplier returned a null value");
            this.f76425p0.subscribe(new a(singleObserver, u2, this.f76427r0));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
