package io.reactivex.rxjava3.internal.jdk8;

import a.d;
import androidx.appcompat.app.r;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableFlatMapStream<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Observable<T> f74103p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Stream<? extends R>> f74104q0;

    public static final class a<T, R> extends AtomicInteger implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super R> f74105p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Stream<? extends R>> f74106q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f74107r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public volatile boolean f74108s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f74109t0;

        public a(Observer<? super R> observer, Function<? super T, ? extends Stream<? extends R>> function) {
            this.f74105p0 = observer;
            this.f74106q0 = function;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74108s0 = true;
            this.f74107r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74108s0;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f74109t0) {
                return;
            }
            this.f74109t0 = true;
            this.f74105p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(@NonNull Throwable th2) {
            if (this.f74109t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74109t0 = true;
                this.f74105p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(@NonNull T t10) {
            if (this.f74109t0) {
                return;
            }
            try {
                Stream<? extends R> streamApply = this.f74106q0.apply(t10);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                Stream streamC = r.c(streamApply);
                try {
                    for (Object obj : streamC) {
                        if (this.f74108s0) {
                            this.f74109t0 = true;
                            break;
                        }
                        Objects.requireNonNull(obj, "The Stream's Iterator.next returned a null value");
                        if (this.f74108s0) {
                            this.f74109t0 = true;
                            break;
                        }
                        this.f74105p0.onNext(obj);
                        if (this.f74108s0) {
                            this.f74109t0 = true;
                            break;
                        }
                    }
                    streamC.close();
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        if (streamC != null) {
                            try {
                                streamC.close();
                            } catch (Throwable th4) {
                                th2.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th5) {
                Exceptions.throwIfFatal(th5);
                this.f74107r0.dispose();
                onError(th5);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(@NonNull Disposable disposable) {
            if (DisposableHelper.validate(this.f74107r0, disposable)) {
                this.f74107r0 = disposable;
                this.f74105p0.onSubscribe(this);
            }
        }
    }

    public ObservableFlatMapStream(Observable<T> observable, Function<? super T, ? extends Stream<? extends R>> function) {
        this.f74103p0 = observable;
        this.f74104q0 = function;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super R> observer) {
        Stream streamC;
        ObservableSource observableSource = this.f74103p0;
        boolean z10 = observableSource instanceof Supplier;
        Function<? super T, ? extends Stream<? extends R>> function = this.f74104q0;
        if (!z10) {
            observableSource.subscribe(new a(observer, function));
            return;
        }
        try {
            d dVar = (Object) ((Supplier) observableSource).get();
            if (dVar != null) {
                Stream<? extends R> streamApply = function.apply(dVar);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                streamC = r.c(streamApply);
            } else {
                streamC = null;
            }
            if (streamC != null) {
                ObservableFromStream.subscribeStream(observer, streamC);
            } else {
                EmptyDisposable.complete(observer);
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, observer);
        }
    }
}
