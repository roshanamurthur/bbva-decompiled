package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSwitchIfEmptySingle<T> extends Single<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71756p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f71757q0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f71758p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SingleSource<? extends T> f71759q0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmptySingle$a$a, reason: collision with other inner class name */
        public static final class C0322a<T> implements SingleObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final SingleObserver<? super T> f71760p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final AtomicReference<Disposable> f71761q0;

            public C0322a(AtomicReference atomicReference, SingleObserver singleObserver) {
                this.f71760p0 = singleObserver;
                this.f71761q0 = atomicReference;
            }

            @Override // io.reactivex.SingleObserver
            public final void onError(Throwable th2) {
                this.f71760p0.onError(th2);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f71761q0, disposable);
            }

            @Override // io.reactivex.SingleObserver
            public final void onSuccess(T t10) {
                this.f71760p0.onSuccess(t10);
            }
        }

        public a(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f71758p0 = singleObserver;
            this.f71759q0 = singleSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            Disposable disposable = get();
            if (disposable == DisposableHelper.DISPOSED || !compareAndSet(disposable, null)) {
                return;
            }
            this.f71759q0.subscribe(new C0322a(this, this.f71758p0));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71758p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f71758p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71758p0.onSuccess(t10);
        }
    }

    public MaybeSwitchIfEmptySingle(MaybeSource<T> maybeSource, SingleSource<? extends T> singleSource) {
        this.f71756p0 = maybeSource;
        this.f71757q0 = singleSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f71756p0;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f71756p0.subscribe(new a(singleObserver, this.f71757q0));
    }
}
