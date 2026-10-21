package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoAfterSuccess<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Consumer<? super T> f71584p0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71585p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Consumer<? super T> f71586q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71587r0;

        public a(MaybeObserver<? super T> maybeObserver, Consumer<? super T> consumer) {
            this.f71585p0 = maybeObserver;
            this.f71586q0 = consumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71587r0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71587r0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71585p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71585p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71587r0, disposable)) {
                this.f71587r0 = disposable;
                this.f71585p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71585p0.onSuccess(t10);
            try {
                this.f71586q0.accept(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        }
    }

    public MaybeDoAfterSuccess(MaybeSource<T> maybeSource, Consumer<? super T> consumer) {
        super(maybeSource);
        this.f71584p0 = consumer;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71584p0));
    }
}
