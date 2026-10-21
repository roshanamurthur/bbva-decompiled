package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTake<T> extends io.reactivex.internal.operators.observable.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f72932p0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super T> f72933p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f72934q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72935r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f72936s0;

        public a(Observer<? super T> observer, long j10) {
            this.f72933p0 = observer;
            this.f72936s0 = j10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72935r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72935r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72934q0) {
                return;
            }
            this.f72934q0 = true;
            this.f72935r0.dispose();
            this.f72933p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72934q0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f72934q0 = true;
            this.f72935r0.dispose();
            this.f72933p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72934q0) {
                return;
            }
            long j10 = this.f72936s0;
            long j11 = j10 - 1;
            this.f72936s0 = j11;
            if (j10 > 0) {
                boolean z10 = j11 == 0;
                this.f72933p0.onNext(t10);
                if (z10) {
                    onComplete();
                }
            }
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72935r0, disposable)) {
                this.f72935r0 = disposable;
                long j10 = this.f72936s0;
                Observer<? super T> observer = this.f72933p0;
                if (j10 != 0) {
                    observer.onSubscribe(this);
                    return;
                }
                this.f72934q0 = true;
                disposable.dispose();
                EmptyDisposable.complete(observer);
            }
        }
    }

    public ObservableTake(ObservableSource<T> observableSource, long j10) {
        super(observableSource);
        this.f72932p0 = j10;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.source.subscribe(new a(observer, this.f72932p0));
    }
}
