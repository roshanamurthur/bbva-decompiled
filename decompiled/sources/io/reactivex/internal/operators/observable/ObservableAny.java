package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableAny<T> extends io.reactivex.internal.operators.observable.a<T, Boolean> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Predicate<? super T> f72054p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Boolean> f72055p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f72056q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72057r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f72058s0;

        public a(Observer<? super Boolean> observer, Predicate<? super T> predicate) {
            this.f72055p0 = observer;
            this.f72056q0 = predicate;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72057r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72057r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72058s0) {
                return;
            }
            this.f72058s0 = true;
            Boolean bool = Boolean.FALSE;
            Observer<? super Boolean> observer = this.f72055p0;
            observer.onNext(bool);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72058s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72058s0 = true;
                this.f72055p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72058s0) {
                return;
            }
            try {
                if (this.f72056q0.test(t10)) {
                    this.f72058s0 = true;
                    this.f72057r0.dispose();
                    Boolean bool = Boolean.TRUE;
                    Observer<? super Boolean> observer = this.f72055p0;
                    observer.onNext(bool);
                    observer.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f72057r0.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72057r0, disposable)) {
                this.f72057r0 = disposable;
                this.f72055p0.onSubscribe(this);
            }
        }
    }

    public ObservableAny(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.f72054p0 = predicate;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Boolean> observer) {
        this.source.subscribe(new a(observer, this.f72054p0));
    }
}
