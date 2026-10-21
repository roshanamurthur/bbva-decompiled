package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableHide extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70059p0;

    public static final class a implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70060p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f70061q0;

        public a(CompletableObserver completableObserver) {
            this.f70060p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70061q0.dispose();
            this.f70061q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70061q0.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70060p0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70060p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f70061q0, disposable)) {
                this.f70061q0 = disposable;
                this.f70060p0.onSubscribe(this);
            }
        }
    }

    public CompletableHide(CompletableSource completableSource) {
        this.f70059p0 = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70059p0.subscribe(new a(completableObserver));
    }
}
