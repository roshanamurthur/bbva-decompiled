package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSwitchIfEmpty<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<? extends T> f71751p0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71752p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeSource<? extends T> f71753q0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$a$a, reason: collision with other inner class name */
        public static final class C0321a<T> implements MaybeObserver<T> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final MaybeObserver<? super T> f71754p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final AtomicReference<Disposable> f71755q0;

            public C0321a(MaybeObserver<? super T> maybeObserver, AtomicReference<Disposable> atomicReference) {
                this.f71754p0 = maybeObserver;
                this.f71755q0 = atomicReference;
            }

            @Override // io.reactivex.MaybeObserver
            public final void onComplete() {
                this.f71754p0.onComplete();
            }

            @Override // io.reactivex.MaybeObserver
            public final void onError(Throwable th2) {
                this.f71754p0.onError(th2);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this.f71755q0, disposable);
            }

            @Override // io.reactivex.MaybeObserver
            public final void onSuccess(T t10) {
                this.f71754p0.onSuccess(t10);
            }
        }

        public a(MaybeObserver<? super T> maybeObserver, MaybeSource<? extends T> maybeSource) {
            this.f71752p0 = maybeObserver;
            this.f71753q0 = maybeSource;
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
            this.f71753q0.subscribe(new C0321a(this.f71752p0, this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71752p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f71752p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71752p0.onSuccess(t10);
        }
    }

    public MaybeSwitchIfEmpty(MaybeSource<T> maybeSource, MaybeSource<? extends T> maybeSource2) {
        super(maybeSource);
        this.f71751p0 = maybeSource2;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71751p0));
    }
}
