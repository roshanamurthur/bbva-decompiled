package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDoOnTerminate<T> extends Maybe<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71596p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Action f71597q0;

    public final class a implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71598p0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71598p0 = maybeObserver;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            MaybeObserver<? super T> maybeObserver = this.f71598p0;
            try {
                MaybeDoOnTerminate.this.f71597q0.run();
                maybeObserver.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            try {
                MaybeDoOnTerminate.this.f71597q0.run();
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f71598p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            this.f71598p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            MaybeObserver<? super T> maybeObserver = this.f71598p0;
            try {
                MaybeDoOnTerminate.this.f71597q0.run();
                maybeObserver.onSuccess(t10);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                maybeObserver.onError(th2);
            }
        }
    }

    public MaybeDoOnTerminate(MaybeSource<T> maybeSource, Action action) {
        this.f71596p0 = maybeSource;
        this.f71597q0 = action;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f71596p0.subscribe(new a(maybeObserver));
    }
}
