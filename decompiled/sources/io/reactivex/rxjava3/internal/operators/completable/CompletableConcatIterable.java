package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableConcatIterable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends CompletableSource> f74267p0;

    public static final class a extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74268p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<? extends CompletableSource> f74269q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SequentialDisposable f74270r0 = new SequentialDisposable();

        public a(CompletableObserver completableObserver, Iterator<? extends CompletableSource> it) {
            this.f74268p0 = completableObserver;
            this.f74269q0 = it;
        }

        public final void a() {
            CompletableObserver completableObserver = this.f74268p0;
            SequentialDisposable sequentialDisposable = this.f74270r0;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                Iterator<? extends CompletableSource> it = this.f74269q0;
                while (!sequentialDisposable.isDisposed()) {
                    try {
                        if (!it.hasNext()) {
                            completableObserver.onComplete();
                            return;
                        }
                        try {
                            CompletableSource next = it.next();
                            Objects.requireNonNull(next, "The CompletableSource returned is null");
                            next.subscribe(this);
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

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74268p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74270r0.replace(disposable);
        }
    }

    public CompletableConcatIterable(Iterable<? extends CompletableSource> iterable) {
        this.f74267p0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        try {
            Iterator<? extends CompletableSource> it = this.f74267p0.iterator();
            Objects.requireNonNull(it, "The iterator returned is null");
            a aVar = new a(completableObserver, it);
            completableObserver.onSubscribe(aVar.f74270r0);
            aVar.a();
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptyDisposable.error(th2, completableObserver);
        }
    }
}
