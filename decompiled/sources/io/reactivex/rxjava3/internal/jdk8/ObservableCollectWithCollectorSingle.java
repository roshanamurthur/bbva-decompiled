package io.reactivex.rxjava3.internal.jdk8;

import a.d;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCollectWithCollectorSingle<T, A, R> extends Single<R> implements FuseToObservable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f74093p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Collector<? super T, A, R> f74094q0;

    public static final class a<T, A, R> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super R> f74095p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<A, T> f74096q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<A, R> f74097r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f74098s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74099t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public A f74100u0;

        public a(SingleObserver<? super R> singleObserver, A a10, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            this.f74095p0 = singleObserver;
            this.f74100u0 = a10;
            this.f74096q0 = biConsumer;
            this.f74097r0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74098s0.dispose();
            this.f74098s0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74098s0 == DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            SingleObserver<? super R> singleObserver = this.f74095p0;
            if (this.f74099t0) {
                return;
            }
            this.f74099t0 = true;
            this.f74098s0 = DisposableHelper.DISPOSED;
            A a10 = this.f74100u0;
            this.f74100u0 = null;
            try {
                d dVar = (Object) this.f74097r0.apply(a10);
                Objects.requireNonNull(dVar, "The finisher returned a null value");
                singleObserver.onSuccess(dVar);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                singleObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f74099t0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74099t0 = true;
            this.f74098s0 = DisposableHelper.DISPOSED;
            this.f74100u0 = null;
            this.f74095p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f74099t0) {
                return;
            }
            try {
                this.f74096q0.accept(this.f74100u0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74098s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(@NonNull Disposable disposable) {
            if (DisposableHelper.validate(this.f74098s0, disposable)) {
                this.f74098s0 = disposable;
                this.f74095p0.onSubscribe(this);
            }
        }
    }

    public ObservableCollectWithCollectorSingle(Observable<T> observable, Collector<? super T, A, R> collector) {
        this.f74093p0 = observable;
        this.f74094q0 = collector;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<R> fuseToObservable() {
        return new ObservableCollectWithCollector(this.f74093p0, this.f74094q0);
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(@NonNull SingleObserver<? super R> singleObserver) {
        Collector<? super T, A, R> collector = this.f74094q0;
        try {
            this.f74093p0.subscribe(new a(singleObserver, collector.supplier().get(), collector.accumulator(), collector.finisher()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, singleObserver);
        }
    }
}
