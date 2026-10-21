package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableCollect<T, U> extends io.reactivex.internal.operators.observable.a<T, U> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Callable<? extends U> f72163p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiConsumer<? super U, ? super T> f72164q0;

    public static final class a<T, U> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super U> f72165p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super U, ? super T> f72166q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final U f72167r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f72168s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72169t0;

        public a(Observer<? super U> observer, U u2, BiConsumer<? super U, ? super T> biConsumer) {
            this.f72165p0 = observer;
            this.f72166q0 = biConsumer;
            this.f72167r0 = u2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72168s0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72168s0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72169t0) {
                return;
            }
            this.f72169t0 = true;
            U u2 = this.f72167r0;
            Observer<? super U> observer = this.f72165p0;
            observer.onNext(u2);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72169t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72169t0 = true;
                this.f72165p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72169t0) {
                return;
            }
            try {
                this.f72166q0.accept(this.f72167r0, t10);
            } catch (Throwable th2) {
                this.f72168s0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72168s0, disposable)) {
                this.f72168s0 = disposable;
                this.f72165p0.onSubscribe(this);
            }
        }
    }

    public ObservableCollect(ObservableSource<T> observableSource, Callable<? extends U> callable, BiConsumer<? super U, ? super T> biConsumer) {
        super(observableSource);
        this.f72163p0 = callable;
        this.f72164q0 = biConsumer;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super U> observer) {
        try {
            this.source.subscribe(new a(observer, ObjectHelper.requireNonNull(this.f72163p0.call(), "The initialSupplier returned a null value"), this.f72164q0));
        } catch (Throwable th2) {
            EmptyDisposable.error(th2, observer);
        }
    }
}
