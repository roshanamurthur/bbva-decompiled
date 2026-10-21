package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFromFuture<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Future<? extends T> f71678p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f71679q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TimeUnit f71680r0;

    public MaybeFromFuture(Future<? extends T> future, long j10, TimeUnit timeUnit) {
        this.f71678p0 = future;
        this.f71679q0 = j10;
        this.f71680r0 = timeUnit;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        Disposable disposableEmpty = Disposables.empty();
        maybeObserver.onSubscribe(disposableEmpty);
        if (disposableEmpty.isDisposed()) {
            return;
        }
        try {
            long j10 = this.f71679q0;
            Future<? extends T> future = this.f71678p0;
            T t10 = j10 <= 0 ? future.get() : future.get(j10, this.f71680r0);
            if (disposableEmpty.isDisposed()) {
                return;
            }
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t10);
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof ExecutionException) {
                th = th.getCause();
            }
            Exceptions.throwIfFatal(th);
            if (disposableEmpty.isDisposed()) {
                return;
            }
            maybeObserver.onError(th);
        }
    }
}
