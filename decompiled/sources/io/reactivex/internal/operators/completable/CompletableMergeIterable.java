package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableMergeIterable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends CompletableSource> f70085p0;

    public static final class a extends AtomicBoolean implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompositeDisposable f70086p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompletableObserver f70087q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicInteger f70088r0;

        public a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicInteger atomicInteger) {
            this.f70087q0 = completableObserver;
            this.f70086p0 = compositeDisposable;
            this.f70088r0 = atomicInteger;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f70088r0.decrementAndGet() == 0 && compareAndSet(false, true)) {
                this.f70087q0.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70086p0.dispose();
            if (compareAndSet(false, true)) {
                this.f70087q0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70086p0.add(disposable);
        }
    }

    public CompletableMergeIterable(Iterable<? extends CompletableSource> iterable) {
        this.f70085p0 = iterable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f70085p0.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            a aVar = new a(completableObserver, compositeDisposable, atomicInteger);
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (!it.hasNext()) {
                        aVar.onComplete();
                        return;
                    }
                    if (compositeDisposable.isDisposed()) {
                        return;
                    }
                    try {
                        CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
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
