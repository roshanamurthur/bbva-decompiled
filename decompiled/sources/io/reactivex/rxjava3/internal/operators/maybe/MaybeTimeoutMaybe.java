package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimeoutMaybe<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<U> f76017p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T> f76018q0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76019p0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f76019p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f76019p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f76019p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f76019p0.onSuccess(t10);
        }
    }

    public static final class b<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76020p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final c<T, U> f76021q0 = new c<>(this);

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final MaybeSource<? extends T> f76022r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final a<T> f76023s0;

        public b(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f76020p0 = maybeObserver;
            this.f76022r0 = maybeSource;
            this.f76023s0 = maybeSource != null ? new a<>(maybeObserver) : null;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f76021q0);
            a<T> aVar = this.f76023s0;
            if (aVar != null) {
                DisposableHelper.dispose(aVar);
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            DisposableHelper.dispose(this.f76021q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76020p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f76021q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76020p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            DisposableHelper.dispose(this.f76021q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76020p0.onSuccess(t10);
            }
        }
    }

    public static final class c<T, U> extends AtomicReference<Disposable> implements MaybeObserver<Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final b<T, U> f76024p0;

        public c(b<T, U> bVar) {
            this.f76024p0 = bVar;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            b<T, U> bVar = this.f76024p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                MaybeSource<? extends T> maybeSource = bVar.f76022r0;
                if (maybeSource != null) {
                    maybeSource.subscribe(bVar.f76023s0);
                } else {
                    bVar.f76020p0.onError(new TimeoutException());
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            b<T, U> bVar = this.f76024p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                bVar.f76020p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(Object obj) {
            b<T, U> bVar = this.f76024p0;
            bVar.getClass();
            if (DisposableHelper.dispose(bVar)) {
                MaybeSource<? extends T> maybeSource = bVar.f76022r0;
                if (maybeSource != null) {
                    maybeSource.subscribe(bVar.f76023s0);
                } else {
                    bVar.f76020p0.onError(new TimeoutException());
                }
            }
        }
    }

    public MaybeTimeoutMaybe(MaybeSource<T> maybeSource, MaybeSource<U> maybeSource2, MaybeSource<? extends T> maybeSource3) {
        super(maybeSource);
        this.f76017p0 = maybeSource2;
        this.f76018q0 = maybeSource3;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        b bVar = new b(maybeObserver, this.f76018q0);
        maybeObserver.onSubscribe(bVar);
        this.f76017p0.subscribe(bVar.f76021q0);
        this.source.subscribe(bVar);
    }
}
