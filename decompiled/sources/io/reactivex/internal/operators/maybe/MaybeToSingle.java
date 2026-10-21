package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeToSingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71794p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f71795q0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f71796p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f71797q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71798r0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f71796p0 = singleObserver;
            this.f71797q0 = t10;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71798r0.dispose();
            this.f71798r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71798r0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71798r0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f71796p0;
            T t10 = this.f71797q0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71798r0 = DisposableHelper.DISPOSED;
            this.f71796p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71798r0, disposable)) {
                this.f71798r0 = disposable;
                this.f71796p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71798r0 = DisposableHelper.DISPOSED;
            this.f71796p0.onSuccess(t10);
        }
    }

    public MaybeToSingle(MaybeSource<T> maybeSource, T t10) {
        this.f71794p0 = maybeSource;
        this.f71795q0 = t10;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f71794p0;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f71794p0.subscribe(new a(singleObserver, this.f71795q0));
    }
}
