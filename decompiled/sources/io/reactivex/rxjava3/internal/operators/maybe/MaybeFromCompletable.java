package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromCompletable<T> extends Maybe<T> implements HasUpstreamCompletableSource {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f75914p0;

    public static final class a<T> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75915p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f75916q0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f75915p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75916q0.dispose();
            this.f75916q0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75916q0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75916q0 = DisposableHelper.DISPOSED;
            this.f75915p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75916q0 = DisposableHelper.DISPOSED;
            this.f75915p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75916q0, disposable)) {
                this.f75916q0 = disposable;
                this.f75915p0.onSubscribe(this);
            }
        }
    }

    public MaybeFromCompletable(CompletableSource completableSource) {
        this.f75914p0 = completableSource;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamCompletableSource
    public CompletableSource source() {
        return this.f75914p0;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75914p0.subscribe(new a(maybeObserver));
    }
}
