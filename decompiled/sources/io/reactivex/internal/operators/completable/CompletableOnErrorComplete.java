package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableOnErrorComplete extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70094p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super Throwable> f70095q0;

    public final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70096p0;

        public a(CompletableObserver completableObserver) {
            this.f70096p0 = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70096p0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            CompletableObserver completableObserver = this.f70096p0;
            try {
                if (CompletableOnErrorComplete.this.f70095q0.test(th2)) {
                    completableObserver.onComplete();
                } else {
                    completableObserver.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                completableObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70096p0.onSubscribe(disposable);
        }
    }

    public CompletableOnErrorComplete(CompletableSource completableSource, Predicate<? super Throwable> predicate) {
        this.f70094p0 = completableSource;
        this.f70095q0 = predicate;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70094p0.subscribe(new a(completableObserver));
    }
}
