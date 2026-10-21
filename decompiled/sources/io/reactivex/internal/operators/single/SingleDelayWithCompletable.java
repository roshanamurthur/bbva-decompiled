package io.reactivex.internal.operators.single;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleDelayWithCompletable<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73404p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f73405q0;

    public static final class a<T> extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73406p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<T> f73407q0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<T> singleSource) {
            this.f73406p0 = singleObserver;
            this.f73407q0 = singleSource;
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
            this.f73407q0.subscribe(new ResumeSingleObserver(this, this.f73406p0));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f73406p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f73406p0.onSubscribe(this);
            }
        }
    }

    public SingleDelayWithCompletable(SingleSource<T> singleSource, CompletableSource completableSource) {
        this.f73404p0 = singleSource;
        this.f73405q0 = completableSource;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73405q0.subscribe(new a(singleObserver, this.f73404p0));
    }
}
