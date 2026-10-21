package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.FuseToObservable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableElementAtMaybe<T> extends Maybe<T> implements FuseToObservable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ObservableSource<T> f76633p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f76634q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76635p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f76636q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76637r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f76638s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f76639t0;

        public a(MaybeObserver<? super T> maybeObserver, long j10) {
            this.f76635p0 = maybeObserver;
            this.f76636q0 = j10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76637r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76637r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.f76639t0) {
                return;
            }
            this.f76639t0 = true;
            this.f76635p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            if (this.f76639t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f76639t0 = true;
                this.f76635p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            if (this.f76639t0) {
                return;
            }
            long j10 = this.f76638s0;
            if (j10 != this.f76636q0) {
                this.f76638s0 = j10 + 1;
                return;
            }
            this.f76639t0 = true;
            this.f76637r0.dispose();
            this.f76635p0.onSuccess(t10);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76637r0, disposable)) {
                this.f76637r0 = disposable;
                this.f76635p0.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtMaybe(ObservableSource<T> observableSource, long j10) {
        this.f76633p0 = observableSource;
        this.f76634q0 = j10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToObservable
    public Observable<T> fuseToObservable() {
        return RxJavaPlugins.onAssembly(new ObservableElementAt(this.f76633p0, this.f76634q0, null, false));
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f76633p0.subscribe(new a(maybeObserver, this.f76634q0));
    }
}
