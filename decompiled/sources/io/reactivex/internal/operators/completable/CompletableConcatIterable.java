package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableConcatIterable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends CompletableSource> f70010p0;

    public static final class a extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70011p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<? extends CompletableSource> f70012q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f70013r0 = new SequentialDisposable();

        public a(CompletableObserver completableObserver, Iterator<? extends CompletableSource> it) {
            this.f70011p0 = completableObserver;
            this.f70012q0 = it;
        }

        public final void a() {
            CompletableObserver completableObserver = this.f70011p0;
            SequentialDisposable sequentialDisposable = this.f70013r0;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                Iterator<? extends CompletableSource> it = this.f70012q0;
                while (!sequentialDisposable.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            completableObserver.onComplete();
                            return;
                        }
                        try {
                            ((CompletableSource) ObjectHelper.requireNonNull(it.next(), "The CompletableSource returned is null")).subscribe(this);
                            if (decrementAndGet() == 0) {
                                return;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            completableObserver.onError(th2);
                            return;
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        completableObserver.onError(th3);
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70011p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70013r0.replace(disposable);
        }
    }

    public CompletableConcatIterable(Iterable<? extends CompletableSource> iterable) {
        this.f70010p0 = iterable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            a aVar = new a(completableObserver, (Iterator) ObjectHelper.requireNonNull(this.f70010p0.iterator(), "The iterator returned is null"));
            completableObserver.onSubscribe(aVar.f70013r0);
            aVar.a();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, completableObserver);
        }
    }
}
