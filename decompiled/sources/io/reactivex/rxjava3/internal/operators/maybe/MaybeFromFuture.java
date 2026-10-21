package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import rj.d;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Future<? extends T> f75917p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75918q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f75919r0;

    public MaybeFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f75917p0 = future;
        this.f75918q0 = j10;
        this.f75919r0 = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableB = d.b();
        maybeObserver.onSubscribe(disposableB);
        if (disposableB.isDisposed()) {
            return;
        }
        try {
            long j10 = this.f75918q0;
            Future<? extends T> future = this.f75917p0;
            T t10 = j10 <= 0 ? future.get() : future.get(j10, this.f75919r0);
            if (disposableB.isDisposed()) {
                return;
            }
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t10);
            }
        } catch (Throwable th2) {
            th = th2;
            Exceptions.throwIfFatal(th);
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            Exceptions.throwIfFatal(th);
            if (disposableB.isDisposed()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
