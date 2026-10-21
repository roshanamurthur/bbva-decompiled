package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableElementAtMaybe<T> extends Maybe<T> implements FuseToObservable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f72352p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f72353q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f72354p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f72355q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f72356r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f72357s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f72358t0;

        public a(MaybeObserver<? super T> maybeObserver, long j10) {
            this.f72354p0 = maybeObserver;
            this.f72355q0 = j10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f72356r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f72356r0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            if (this.f72358t0) {
                return;
            }
            this.f72358t0 = true;
            this.f72354p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            if (this.f72358t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f72358t0 = true;
                this.f72354p0.onError(th2);
            }
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            if (this.f72358t0) {
                return;
            }
            long j10 = this.f72357s0;
            if (j10 != this.f72355q0) {
                this.f72357s0 = j10 + 1;
                return;
            }
            this.f72358t0 = true;
            this.f72356r0.dispose();
            this.f72354p0.onSuccess(t10);
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f72356r0, disposable)) {
                this.f72356r0 = disposable;
                this.f72354p0.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtMaybe(ObservableSource<T> observableSource, long j10) {
        this.f72352p0 = observableSource;
        this.f72353q0 = j10;
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f72352p0, this.f72353q0, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f72352p0.subscribe(new a(maybeObserver, this.f72353q0));
    }
}
