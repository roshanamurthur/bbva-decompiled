package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableOnErrorComplete extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f74353p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super Throwable> f74354q0;

    public final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74355p0;

        public a(CompletableObserver completableObserver) {
            this.f74355p0 = completableObserver;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74355p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            CompletableObserver completableObserver = this.f74355p0;
            try {
                if (CompletableOnErrorComplete.this.f74354q0.test(th2)) {
                    completableObserver.onComplete();
                } else {
                    completableObserver.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                completableObserver.onError(new CompositeException(th2, th3));
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74355p0.onSubscribe(disposable);
        }
    }

    public CompletableOnErrorComplete(CompletableSource completableSource, Predicate<? super Throwable> predicate) {
        this.f74353p0 = completableSource;
        this.f74354q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f74353p0.subscribe(new a(completableObserver));
    }
}
