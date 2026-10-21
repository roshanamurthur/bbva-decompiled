package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Action;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoOnTerminate<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f75841p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f75842q0;

    public final class a implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75843p0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f75843p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            MaybeObserver<? super T> maybeObserver = this.f75843p0;
            try {
                MaybeDoOnTerminate.this.f75842q0.run();
                maybeObserver.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            try {
                MaybeDoOnTerminate.this.f75842q0.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f75843p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f75843p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super T> maybeObserver = this.f75843p0;
            try {
                MaybeDoOnTerminate.this.f75842q0.run();
                maybeObserver.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeDoOnTerminate(MaybeSource<T> maybeSource, Action action) {
        this.f75841p0 = maybeSource;
        this.f75842q0 = action;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75841p0.subscribe(new a(maybeObserver));
    }
}
