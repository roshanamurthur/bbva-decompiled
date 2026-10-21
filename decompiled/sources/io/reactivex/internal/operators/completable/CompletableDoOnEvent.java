package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableDoOnEvent extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70042p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super Throwable> f70043q0;

    public final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70044p0;

        public a(CompletableObserver completableObserver) {
            this.f70044p0 = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            CompletableObserver completableObserver = this.f70044p0;
            try {
                CompletableDoOnEvent.this.f70043q0.accept(null);
                completableObserver.onComplete();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                completableObserver.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            try {
                CompletableDoOnEvent.this.f70043q0.accept(th2);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                th2 = new CompositeException(th2, th3);
            }
            this.f70044p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70044p0.onSubscribe(disposable);
        }
    }

    public CompletableDoOnEvent(CompletableSource completableSource, Consumer<? super Throwable> consumer) {
        this.f70042p0 = completableSource;
        this.f70043q0 = consumer;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70042p0.subscribe(new a(completableObserver));
    }
}
