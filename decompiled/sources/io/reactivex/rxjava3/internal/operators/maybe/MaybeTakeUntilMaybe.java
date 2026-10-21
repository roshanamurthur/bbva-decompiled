package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTakeUntilMaybe<T, U> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<U> f76000p0;

    public static final class a<T, U> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f76001p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final C0387a<U> f76002q0 = new C0387a<>(this);

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.MaybeTakeUntilMaybe$a$a, reason: collision with other inner class name */
        public static final class C0387a<U> extends AtomicReference<Disposable> implements MaybeObserver<U> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final a<?, U> f76003p0;

            public C0387a(a<?, U> aVar) {
                this.f76003p0 = aVar;
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a<?, U> aVar = this.f76003p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f76001p0.onComplete();
                }
            }

            @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a<?, U> aVar = this.f76003p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f76001p0.onError(th2);
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
                a<?, U> aVar = this.f76003p0;
                aVar.getClass();
                if (DisposableHelper.dispose(aVar)) {
                    aVar.f76001p0.onComplete();
                }
            }
        }

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f76001p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            DisposableHelper.dispose(this.f76002q0);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            DisposableHelper.dispose(this.f76002q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76001p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f76002q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76001p0.onError(th2);
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
            DisposableHelper.dispose(this.f76002q0);
            DisposableHelper disposableHelper = DisposableHelper.DISPOSED;
            if (getAndSet(disposableHelper) != disposableHelper) {
                this.f76001p0.onSuccess(t10);
            }
        }
    }

    public MaybeTakeUntilMaybe(MaybeSource<T> maybeSource, MaybeSource<U> maybeSource2) {
        super(maybeSource);
        this.f76000p0 = maybeSource2;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        this.f76000p0.subscribe(aVar.f76002q0);
        this.source.subscribe(aVar);
    }
}
