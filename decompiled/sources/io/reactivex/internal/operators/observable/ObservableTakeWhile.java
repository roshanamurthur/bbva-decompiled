package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTakeWhile<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f72971p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72972p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f72973q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72974r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72975s0;

        public a(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.f72972p0 = observer;
            this.f72973q0 = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72974r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72974r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72975s0) {
                return;
            }
            this.f72975s0 = true;
            this.f72972p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72975s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72975s0 = true;
                this.f72972p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72975s0) {
                return;
            }
            try {
                boolean zTest = this.f72973q0.test(t10);
                Observer<? super T> observer = this.f72972p0;
                if (zTest) {
                    observer.onNext(t10);
                    return;
                }
                this.f72975s0 = true;
                this.f72974r0.dispose();
                observer.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72974r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72974r0, disposable)) {
                this.f72974r0 = disposable;
                this.f72972p0.onSubscribe(this);
            }
        }
    }

    public ObservableTakeWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f72971p0 = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72971p0));
    }
}
