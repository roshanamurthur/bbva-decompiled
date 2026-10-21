package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableMergeIterable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends CompletableSource> f74344p0;

    public static final class a extends AtomicBoolean implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompositeDisposable f74345p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompletableObserver f74346q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f74347r0;

        public a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicInteger atomicInteger) {
            this.f74346q0 = completableObserver;
            this.f74345p0 = compositeDisposable;
            this.f74347r0 = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74345p0.dispose();
            set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74345p0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f74347r0.decrementAndGet() == 0) {
                this.f74346q0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74345p0.dispose();
            if (compareAndSet(false, true)) {
                this.f74346q0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74345p0.add(disposable);
        }
    }

    public CompletableMergeIterable(Iterable<? extends CompletableSource> iterable) {
        this.f74344p0 = iterable;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicInteger atomicInteger = new AtomicInteger(1);
        a aVar = new a(completableObserver, compositeDisposable, atomicInteger);
        completableObserver.onSubscribe(aVar);
        try {
            Iterator<? extends CompletableSource> it = this.f74344p0.iterator();
            Objects.requireNonNull(it, "The source iterator returned is null");
            Iterator<? extends CompletableSource> it2 = it;
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it2.hasNext()) {
                        aVar.onComplete();
                        return;
                    }
                    if (compositeDisposable.isDisposed()) {
                        return;
                    }
                    try {
                        CompletableSource next = it2.next();
                        Objects.requireNonNull(next, "The iterator returned a null CompletableSource");
                        CompletableSource completableSource = next;
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        atomicInteger.getAndIncrement();
                        completableSource.subscribe(aVar);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        compositeDisposable.dispose();
                        aVar.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    compositeDisposable.dispose();
                    aVar.onError(th3);
                    return;
                }
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            completableObserver.onError(th4);
        }
    }
}
