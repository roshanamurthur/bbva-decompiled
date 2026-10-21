package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableDetach extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70028p0;

    public static final class a implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public CompletableObserver f70029p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f70030q0;

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70029p0 = null;
            this.f70030q0.dispose();
            this.f70030q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70030q0.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70030q0 = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f70029p0;
            if (completableObserver != null) {
                this.f70029p0 = null;
                completableObserver.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70030q0 = DisposableHelper.DISPOSED;
            CompletableObserver completableObserver = this.f70029p0;
            if (completableObserver != null) {
                this.f70029p0 = null;
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f70030q0, disposable)) {
                this.f70030q0 = disposable;
                this.f70029p0.onSubscribe(this);
            }
        }
    }

    public CompletableDetach(CompletableSource completableSource) {
        this.f70028p0 = completableSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a();
        aVar.f70029p0 = completableObserver;
        this.f70028p0.subscribe(aVar);
    }
}
