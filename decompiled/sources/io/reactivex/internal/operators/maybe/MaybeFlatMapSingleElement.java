package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapSingleElement<T, R> extends Maybe<R> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71662p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends SingleSource<? extends R>> f71663q0;

    public static final class a<T, R> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super R> f71664p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends SingleSource<? extends R>> f71665q0;

        public a(MaybeObserver<? super R> maybeObserver, Function<? super T, ? extends SingleSource<? extends R>> function) {
            this.f71664p0 = maybeObserver;
            this.f71665q0 = function;
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
            this.f71664p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71664p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f71664p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            try {
                ((SingleSource) ObjectHelper.requireNonNull(this.f71665q0.apply(t10), "The mapper returned a null SingleSource")).subscribe(new b(this.f71664p0, this));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                onError(th2);
            }
        }
    }

    public static final class b<R> implements SingleObserver<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f71666p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeObserver<? super R> f71667q0;

        public b(MaybeObserver maybeObserver, AtomicReference atomicReference) {
            this.f71666p0 = atomicReference;
            this.f71667q0 = maybeObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f71667q0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f71666p0, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(R r3) {
            this.f71667q0.onSuccess(r3);
        }
    }

    public MaybeFlatMapSingleElement(MaybeSource<T> maybeSource, Function<? super T, ? extends SingleSource<? extends R>> function) {
        this.f71662p0 = maybeSource;
        this.f71663q0 = function;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super R> maybeObserver) {
        this.f71662p0.subscribe(new a(maybeObserver, this.f71663q0));
    }
}
