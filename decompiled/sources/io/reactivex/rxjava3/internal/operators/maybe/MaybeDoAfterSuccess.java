package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoAfterSuccess<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f75823p0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75824p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f75825q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75826r0;

        public a(MaybeObserver<? super T> maybeObserver, Consumer<? super T> consumer) {
            this.f75824p0 = maybeObserver;
            this.f75825q0 = consumer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75826r0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75826r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f75824p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75824p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75826r0, disposable)) {
                this.f75826r0 = disposable;
                this.f75824p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75824p0.onSuccess(t10);
            try {
                this.f75825q0.accept(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public MaybeDoAfterSuccess(MaybeSource<T> maybeSource, Consumer<? super T> consumer) {
        super(maybeSource);
        this.f75823p0 = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75823p0));
    }
}
