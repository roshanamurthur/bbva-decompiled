package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.ResumeSingleObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleResumeNext<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73549p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends SingleSource<? extends T>> f73550q0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73551p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends SingleSource<? extends T>> f73552q0;

        public a(SingleObserver<? super T> singleObserver, Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
            this.f73551p0 = singleObserver;
            this.f73552q0 = function;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            SingleObserver<? super T> singleObserver = this.f73551p0;
            try {
                ((SingleSource) ObjectHelper.requireNonNull(this.f73552q0.apply(th2), "The nextFunction returned a null SingleSource.")).subscribe(new ResumeSingleObserver(this, singleObserver));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                singleObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f73551p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73551p0.onSuccess(t10);
        }
    }

    public SingleResumeNext(SingleSource<? extends T> singleSource, Function<? super Throwable, ? extends SingleSource<? extends T>> function) {
        this.f73549p0 = singleSource;
        this.f73550q0 = function;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73549p0.subscribe(new a(singleObserver, this.f73550q0));
    }
}
