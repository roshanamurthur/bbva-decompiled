package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableElementAt<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72343p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f72344q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f72345r0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72346p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72347q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final T f72348r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f72349s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f72350t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public long f72351u0;
        public boolean v0;

        public a(Observer<? super T> observer, long j10, T t10, boolean z10) {
            this.f72346p0 = observer;
            this.f72347q0 = j10;
            this.f72348r0 = t10;
            this.f72349s0 = z10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72350t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72350t0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.v0) {
                return;
            }
            this.v0 = true;
            Observer<? super T> observer = this.f72346p0;
            T t10 = this.f72348r0;
            if (t10 == null && this.f72349s0) {
                observer.onError(new NoSuchElementException());
                return;
            }
            if (t10 != null) {
                observer.onNext(t10);
            }
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.v0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.v0 = true;
                this.f72346p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.v0) {
                return;
            }
            long j10 = this.f72351u0;
            if (j10 != this.f72347q0) {
                this.f72351u0 = j10 + 1;
                return;
            }
            this.v0 = true;
            this.f72350t0.dispose();
            Observer<? super T> observer = this.f72346p0;
            observer.onNext(t10);
            observer.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72350t0, disposable)) {
                this.f72350t0 = disposable;
                this.f72346p0.onSubscribe(this);
            }
        }
    }

    public ObservableElementAt(ObservableSource<T> observableSource, long j10, T t10, boolean z10) {
        super(observableSource);
        this.f72343p0 = j10;
        this.f72344q0 = t10;
        this.f72345r0 = z10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72343p0, this.f72344q0, this.f72345r0));
    }
}
