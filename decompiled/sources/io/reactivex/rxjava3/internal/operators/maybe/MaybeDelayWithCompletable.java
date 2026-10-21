package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelayWithCompletable<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f75811p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f75812q0;

    public static final class a<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f75813p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75814q0;

        public a(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.f75813p0 = atomicReference;
            this.f75814q0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75814q0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75814q0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f75813p0, disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75814q0.onSuccess(t10);
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75815p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeSource<T> f75816q0;

        public b(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.f75815p0 = maybeObserver;
            this.f75816q0 = maybeSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75816q0.subscribe(new a(this.f75815p0, this));
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75815p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f75815p0.onSubscribe(this);
            }
        }
    }

    public MaybeDelayWithCompletable(MaybeSource<T> maybeSource, CompletableSource completableSource) {
        this.f75811p0 = maybeSource;
        this.f75812q0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75812q0.subscribe(new b(maybeObserver, this.f75811p0));
    }
}
