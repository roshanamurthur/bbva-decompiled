package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiConsumer;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoOnEvent<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiConsumer<? super T, ? super Throwable> f75831p0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75832p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super T, ? super Throwable> f75833q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f75834r0;

        public a(MaybeObserver<? super T> maybeObserver, BiConsumer<? super T, ? super Throwable> biConsumer) {
            this.f75832p0 = maybeObserver;
            this.f75833q0 = biConsumer;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75834r0.dispose();
            this.f75834r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75834r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            MaybeObserver<? super T> maybeObserver = this.f75832p0;
            this.f75834r0 = DisposableHelper.DISPOSED;
            try {
                this.f75833q0.accept(null, null);
                maybeObserver.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75834r0 = DisposableHelper.DISPOSED;
            try {
                this.f75833q0.accept(null, th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f75832p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f75834r0, disposable)) {
                this.f75834r0 = disposable;
                this.f75832p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super T> maybeObserver = this.f75832p0;
            this.f75834r0 = DisposableHelper.DISPOSED;
            try {
                this.f75833q0.accept(t10, null);
                maybeObserver.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeDoOnEvent(MaybeSource<T> maybeSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        super(maybeSource);
        this.f75831p0 = biConsumer;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75831p0));
    }
}
