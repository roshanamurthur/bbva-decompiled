package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiConsumer;
import io.reactivex.internal.disposables.DisposableHelper;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoOnEvent<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final BiConsumer<? super T, ? super Throwable> f71592p0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71593p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiConsumer<? super T, ? super Throwable> f71594q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71595r0;

        public a(MaybeObserver<? super T> maybeObserver, BiConsumer<? super T, ? super Throwable> biConsumer) {
            this.f71593p0 = maybeObserver;
            this.f71594q0 = biConsumer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71595r0.dispose();
            this.f71595r0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71595r0.isDisposed();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            MaybeObserver<? super T> maybeObserver = this.f71593p0;
            this.f71595r0 = DisposableHelper.DISPOSED;
            try {
                this.f71594q0.accept(null, null);
                maybeObserver.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71595r0 = DisposableHelper.DISPOSED;
            try {
                this.f71594q0.accept(null, th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f71593p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71595r0, disposable)) {
                this.f71595r0 = disposable;
                this.f71593p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super T> maybeObserver = this.f71593p0;
            this.f71595r0 = DisposableHelper.DISPOSED;
            try {
                this.f71594q0.accept(t10, null);
                maybeObserver.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeDoOnEvent(MaybeSource<T> maybeSource, BiConsumer<? super T, ? super Throwable> biConsumer) {
        super(maybeSource);
        this.f71592p0 = biConsumer;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71592p0));
    }
}
