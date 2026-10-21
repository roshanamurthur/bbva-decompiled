package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSwitchIfEmptySingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f75994p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f75995q0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f75996p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<? extends T> f75997q0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.maybe.MaybeSwitchIfEmptySingle$a$a, reason: collision with other inner class name */
        public static final class C0386a<T> implements SingleObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SingleObserver<? super T> f75998p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final AtomicReference<Disposable> f75999q0;

            public C0386a(AtomicReference atomicReference, SingleObserver singleObserver) {
                this.f75998p0 = singleObserver;
                this.f75999q0 = atomicReference;
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                this.f75998p0.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f75999q0, disposable);
            }

            @Override // io.reactivex.rxjava3.core.SingleObserver
            public final void onSuccess(T t10) {
                this.f75998p0.onSuccess(t10);
            }
        }

        public a(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f75996p0 = singleObserver;
            this.f75997q0 = singleSource;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            Disposable disposable = get();
            if (disposable == DisposableHelper.DISPOSED || !compareAndSet(disposable, null)) {
                return;
            }
            this.f75997q0.subscribe(new C0386a(this, this.f75996p0));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75996p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f75996p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75996p0.onSuccess(t10);
        }
    }

    public MaybeSwitchIfEmptySingle(MaybeSource<T> maybeSource, SingleSource<? extends T> singleSource) {
        this.f75994p0 = maybeSource;
        this.f75995q0 = singleSource;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f75994p0;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f75994p0.subscribe(new a(singleObserver, this.f75995q0));
    }
}
