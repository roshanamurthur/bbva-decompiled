package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelayWithCompletable<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71576p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f71577q0;

    public static final class a<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f71578p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71579q0;

        public a(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.f71578p0 = atomicReference;
            this.f71579q0 = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71579q0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71579q0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f71578p0, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71579q0.onSuccess(t10);
        }
    }

    public static final class b<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71580p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeSource<T> f71581q0;

        public b(MaybeObserver<? super T> maybeObserver, MaybeSource<T> maybeSource) {
            this.f71580p0 = maybeObserver;
            this.f71581q0 = maybeSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71581q0.subscribe(new a(this.f71580p0, this));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f71580p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f71580p0.onSubscribe(this);
            }
        }
    }

    public MaybeDelayWithCompletable(MaybeSource<T> maybeSource, CompletableSource completableSource) {
        this.f71576p0 = maybeSource;
        this.f71577q0 = completableSource;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f71577q0.subscribe(new b(maybeObserver, this.f71576p0));
    }
}
