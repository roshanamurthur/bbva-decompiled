package io.reactivex.internal.operators.maybe;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamCompletableSource;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> implements HasUpstreamCompletableSource {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f71675p0;

    public static final class a<T> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71676p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f71677q0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71676p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71677q0.dispose();
            this.f71677q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71677q0.isDisposed();
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71677q0 = DisposableHelper.DISPOSED;
            this.f71676p0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f71677q0 = DisposableHelper.DISPOSED;
            this.f71676p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71677q0, disposable)) {
                this.f71677q0 = disposable;
                this.f71676p0.onSubscribe(this);
            }
        }
    }

    public MaybeFromCompletable(CompletableSource completableSource) {
        this.f71675p0 = completableSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamCompletableSource
    public CompletableSource source() {
        return this.f71675p0;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f71675p0.subscribe(new a(maybeObserver));
    }
}
