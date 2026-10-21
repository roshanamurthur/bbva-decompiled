package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTakeUntilMaybe<T, U> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<U> f71762p0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71763p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0323a<U> f71764q0 = new C0323a<>(this);

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.MaybeTakeUntilMaybe$a$a, reason: collision with other inner class name */
        public static final class C0323a<U> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, U> f71765p0;

            public C0323a(a<?, U> aVar) {
                this.f71765p0 = aVar;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                a<?, U> aVar = this.f71765p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f71763p0.onComplete();
                }
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                a<?, U> aVar = this.f71765p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f71763p0.onError(th2);
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
                a<?, U> aVar = this.f71765p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f71763p0.onComplete();
                }
            }
        }

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71763p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f71764q0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.dispose(this.f71764q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71763p0.onComplete();
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f71764q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71763p0.onError(th2);
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
            DisposableHelper.dispose(this.f71764q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f71763p0.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilMaybe(MaybeSource<T> maybeSource, MaybeSource<U> maybeSource2) {
        super(maybeSource);
        this.f71762p0 = maybeSource2;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        this.f71762p0.subscribe(aVar.f71764q0);
        this.source.subscribe(aVar);
    }
}
