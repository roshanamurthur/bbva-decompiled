package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableDetach extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74285p0;

    public static final class a implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CompletableObserver f74286p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f74287q0;

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74286p0 = null;
            this.f74287q0.dispose();
            this.f74287q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74287q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74287q0 = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f74286p0;
            if (completableObserver != null) {
                this.f74286p0 = null;
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74287q0 = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f74286p0;
            if (completableObserver != null) {
                this.f74286p0 = null;
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f74287q0, disposable)) {
                this.f74287q0 = disposable;
                this.f74286p0.onSubscribe(this);
            }
        }
    }

    public CompletableDetach(CompletableSource completableSource) {
        this.f74285p0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a();
        aVar.f74286p0 = completableObserver;
        this.f74285p0.subscribe(aVar);
    }
}
