package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeToSingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f76041p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T f76042q0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f76043p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final T f76044q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76045r0;

        public a(SingleObserver<? super T> singleObserver, T t10) {
            this.f76043p0 = singleObserver;
            this.f76044q0 = t10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76045r0.dispose();
            this.f76045r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76045r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f76045r0 = DisposableHelper.DISPOSED;
            SingleObserver<? super T> singleObserver = this.f76043p0;
            T t10 = this.f76044q0;
            if (t10 != null) {
                singleObserver.onSuccess(t10);
            } else {
                singleObserver.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f76045r0 = DisposableHelper.DISPOSED;
            this.f76043p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76045r0, disposable)) {
                this.f76045r0 = disposable;
                this.f76043p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f76045r0 = DisposableHelper.DISPOSED;
            this.f76043p0.onSuccess(t10);
        }
    }

    public MaybeToSingle(MaybeSource<T> maybeSource, T t10) {
        this.f76041p0 = maybeSource;
        this.f76042q0 = t10;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f76041p0;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f76041p0.subscribe(new a(singleObserver, this.f76042q0));
    }
}
