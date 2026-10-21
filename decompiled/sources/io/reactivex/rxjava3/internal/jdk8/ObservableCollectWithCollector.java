package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCollectWithCollector<T, A, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f74086p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Collector<? super T, A, R> f74087q0;

    public static final class a<T, A, R> extends DeferredScalarDisposable<R> implements Observer<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final BiConsumer<A, T> f74088p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<A, R> f74089q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74090r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74091s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public A f74092t0;

        public a(Observer<? super R> observer, A a10, BiConsumer<A, T> biConsumer, Function<A, R> function) {
            super(observer);
            this.f74092t0 = a10;
            this.f74088p0 = biConsumer;
            this.f74089q0 = function;
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f74090r0.dispose();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f74091s0) {
                return;
            }
            this.f74091s0 = true;
            this.f74090r0 = DisposableHelper.DISPOSED;
            A a10 = this.f74092t0;
            this.f74092t0 = null;
            try {
                Object objApply = this.f74089q0.apply(a10);
                Objects.requireNonNull(objApply, "The finisher returned a null value");
                complete(objApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.observers.DeferredScalarDisposable, io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f74091s0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f74091s0 = true;
            this.f74090r0 = DisposableHelper.DISPOSED;
            this.f74092t0 = null;
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f74091s0) {
                return;
            }
            try {
                this.f74088p0.accept(this.f74092t0, t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74090r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(@NonNull Disposable disposable) {
            if (DisposableHelper.validate(this.f74090r0, disposable)) {
                this.f74090r0 = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public ObservableCollectWithCollector(Observable<T> observable, Collector<? super T, A, R> collector) {
        this.f74086p0 = observable;
        this.f74087q0 = collector;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(@NonNull Observer<? super R> observer) {
        Collector<? super T, A, R> collector = this.f74087q0;
        try {
            this.f74086p0.subscribe(new a(observer, collector.supplier().get(), collector.accumulator(), collector.finisher()));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
