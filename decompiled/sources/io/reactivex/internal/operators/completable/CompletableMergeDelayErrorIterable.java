package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.AtomicThrowable;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableMergeDelayErrorIterable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Iterable<? extends CompletableSource> f70084p0;

    public CompletableMergeDelayErrorIterable(Iterable<? extends CompletableSource> iterable) {
        this.f70084p0 = iterable;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        completableObserver.onSubscribe(compositeDisposable);
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f70084p0.iterator(), "The source iterator returned is null");
            AtomicInteger atomicInteger = new AtomicInteger(1);
            AtomicThrowable atomicThrowable = new AtomicThrowable();
            while (!compositeDisposable.isDisposed()) {
                try {
                    if (it.hasNext()) {
                        if (compositeDisposable.isDisposed()) {
                            return;
                        }
                        try {
                            CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null CompletableSource");
                            if (compositeDisposable.isDisposed()) {
                                return;
                            }
                            atomicInteger.getAndIncrement();
                            completableSource.subscribe(new CompletableMergeDelayErrorArray.a(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            atomicThrowable.addThrowable(th2);
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    atomicThrowable.addThrowable(th3);
                }
                if (atomicInteger.decrementAndGet() == 0) {
                    Throwable thTerminate = atomicThrowable.terminate();
                    if (thTerminate == null) {
                        completableObserver.onComplete();
                        return;
                    } else {
                        completableObserver.onError(thTerminate);
                        return;
                    }
                }
                return;
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            completableObserver.onError(th4);
        }
    }
}
