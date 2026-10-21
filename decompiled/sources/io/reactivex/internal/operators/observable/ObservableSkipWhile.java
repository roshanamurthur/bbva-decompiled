package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableSkipWhile<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f72900p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72901p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f72902q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72903r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72904s0;

        public a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f72901p0 = observer;
            this.f72902q0 = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72903r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72903r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f72901p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f72901p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            boolean z10 = this.f72904s0;
            Observer<? super T> observer = this.f72901p0;
            if (z10) {
                observer.onNext(t10);
                return;
            }
            try {
                if (this.f72902q0.test(t10)) {
                    return;
                }
                this.f72904s0 = true;
                observer.onNext(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72903r0.dispose();
                observer.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72903r0, disposable)) {
                this.f72903r0 = disposable;
                this.f72901p0.onSubscribe(this);
            }
        }
    }

    public ObservableSkipWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f72900p0 = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72900p0));
    }
}
