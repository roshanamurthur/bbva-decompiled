package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkipWhile<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f77177p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f77178p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f77179q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f77180r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f77181s0;

        public a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f77178p0 = observer;
            this.f77179q0 = predicate;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77180r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77180r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77178p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77178p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            boolean z10 = this.f77181s0;
            Observer<? super T> observer = this.f77178p0;
            if (z10) {
                observer.onNext(t10);
                return;
            }
            try {
                if (this.f77179q0.test(t10)) {
                    return;
                }
                this.f77181s0 = true;
                observer.onNext(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77180r0.dispose();
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77180r0, disposable)) {
                this.f77180r0 = disposable;
                this.f77178p0.onSubscribe(this);
            }
        }
    }

    public ObservableSkipWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f77177p0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f77177p0));
    }
}
