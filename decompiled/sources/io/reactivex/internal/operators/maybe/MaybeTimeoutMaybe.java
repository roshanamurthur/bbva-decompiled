package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimeoutMaybe<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<U> f71770p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T> f71771q0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71772p0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71772p0 = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71772p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71772p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71772p0.onSuccess(t10);
        }
    }

    public static final class b<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71773p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T, U> f71774q0 = new c<>(this);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final MaybeSource<? extends T> f71775r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final a<T> f71776s0;

        public b(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f71773p0 = maybeObserver;
            this.f71775r0 = maybeSource;
            this.f71776s0 = maybeSource != null ? new a<>(maybeObserver) : null;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f71774q0);
            a<T> aVar = this.f71776s0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.dispose(this.f71774q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71773p0.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f71774q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71773p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            DisposableHelper.dispose(this.f71774q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71773p0.onSuccess(t10);
            }
        }
    }

    public static final class c<T, U> extends AtomicReference<Disposable> implements MaybeObserver<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, U> f71777p0;

        public c(b<T, U> bVar) {
            this.f71777p0 = bVar;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            b<T, U> bVar = this.f71777p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                MaybeSource<? extends T> maybeSource = bVar.f71775r0;
                if (maybeSource != null) {
                    maybeSource.subscribe(bVar.f71776s0);
                } else {
                    bVar.f71773p0.onError(new TimeoutException());
                }
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            b<T, U> bVar = this.f71777p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                bVar.f71773p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(Object obj) {
            b<T, U> bVar = this.f71777p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                MaybeSource<? extends T> maybeSource = bVar.f71775r0;
                if (maybeSource != null) {
                    maybeSource.subscribe(bVar.f71776s0);
                } else {
                    bVar.f71773p0.onError(new TimeoutException());
                }
            }
        }
    }

    public MaybeTimeoutMaybe(MaybeSource<T> maybeSource, MaybeSource<U> maybeSource2, MaybeSource<? extends T> maybeSource3) {
        super(maybeSource);
        this.f71770p0 = maybeSource2;
        this.f71771q0 = maybeSource3;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        b bVar = new b(maybeObserver, this.f71771q0);
        maybeObserver.onSubscribe(bVar);
        this.f71770p0.subscribe(bVar.f71774q0);
        this.source.subscribe(bVar);
    }
}
