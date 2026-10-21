package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableDoOnEach<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f72331p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f72332q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f72333r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Action f72334s0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72335p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f72336q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super Throwable> f72337r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Action f72338s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Action f72339t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Disposable f72340u0;
        public boolean v0;

        public a(Observer<? super T> observer, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
            this.f72335p0 = observer;
            this.f72336q0 = consumer;
            this.f72337r0 = consumer2;
            this.f72338s0 = action;
            this.f72339t0 = action2;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72340u0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72340u0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            try {
                this.f72338s0.run();
                this.v0 = true;
                this.f72335p0.onComplete();
                try {
                    this.f72339t0.run();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                onError(th3);
            }
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.v0 = true;
            try {
                this.f72337r0.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f72335p0.onError(th2);
            try {
                this.f72339t0.run();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            try {
                this.f72336q0.accept(t10);
                this.f72335p0.onNext(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72340u0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72340u0, disposable)) {
                this.f72340u0 = disposable;
                this.f72335p0.onSubscribe(this);
            }
        }
    }

    public ObservableDoOnEach(ObservableSource<T> observableSource, Consumer<? super T> consumer, Consumer<? super Throwable> consumer2, Action action, Action action2) {
        super(observableSource);
        this.f72331p0 = consumer;
        this.f72332q0 = consumer2;
        this.f72333r0 = action;
        this.f72334s0 = action2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72331p0, this.f72332q0, this.f72333r0, this.f72334s0));
    }
}
