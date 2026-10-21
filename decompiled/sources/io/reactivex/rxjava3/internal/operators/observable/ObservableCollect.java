package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCollect<T, U> extends io.reactivex.rxjava3.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Supplier<? extends U> f76418p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f76419q0;

    public static final class a<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f76420p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f76421q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final U f76422r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f76423s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76424t0;

        public a(Observer<? super U> observer, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            this.f76420p0 = observer;
            this.f76421q0 = biConsumer;
            this.f76422r0 = u2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76423s0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76423s0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76424t0) {
                return;
            }
            this.f76424t0 = true;
            U u2 = this.f76422r0;
            Observer<? super U> observer = this.f76420p0;
            observer.onNext(u2);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76424t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76424t0 = true;
                this.f76420p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76424t0) {
                return;
            }
            try {
                this.f76421q0.accept(this.f76422r0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76423s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76423s0, disposable)) {
                this.f76423s0 = disposable;
                this.f76420p0.onSubscribe(this);
            }
        }
    }

    public ObservableCollect(ObservableSource<T> observableSource, Supplier<? extends U> supplier, BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.f76418p0 = supplier;
        this.f76419q0 = biConsumer;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super U> observer) {
        try {
            U u2 = this.f76418p0.get();
            Objects.requireNonNull(u2, "The initialSupplier returned a null value");
            this.source.subscribe(new a(observer, u2, this.f76419q0));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
