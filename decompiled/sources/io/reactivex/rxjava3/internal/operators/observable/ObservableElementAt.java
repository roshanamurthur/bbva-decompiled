package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableElementAt<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f76624p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f76625q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f76626r0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f76627p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76628q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final T f76629r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f76630s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f76631t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f76632u0;
        public boolean v0;

        public a(Observer<? super T> observer, long j10, T t10, boolean z10) {
            this.f76627p0 = observer;
            this.f76628q0 = j10;
            this.f76629r0 = t10;
            this.f76630s0 = z10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76631t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76631t0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            Observer<? super T> observer = this.f76627p0;
            T t10 = this.f76629r0;
            if (t10 == null && this.f76630s0) {
                observer.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                observer.onNext(t10);
            }
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.v0 = true;
                this.f76627p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            long j10 = this.f76632u0;
            if (j10 != this.f76628q0) {
                this.f76632u0 = j10 + 1;
                return;
            }
            this.v0 = true;
            this.f76631t0.dispose();
            Observer<? super T> observer = this.f76627p0;
            observer.onNext(t10);
            observer.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76631t0, disposable)) {
                this.f76631t0 = disposable;
                this.f76627p0.onSubscribe(this);
            }
        }
    }

    public ObservableElementAt(ObservableSource<T> observableSource, long j10, T t10, boolean z10) {
        super(observableSource);
        this.f76624p0 = j10;
        this.f76625q0 = t10;
        this.f76626r0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f76624p0, this.f76625q0, this.f76626r0));
    }
}
