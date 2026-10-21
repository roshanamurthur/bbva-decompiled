package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableMergeArrayDelayError extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f74337p0;

    public static final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74338p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f74339q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f74340r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f74341s0;

        public a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.f74338p0 = completableObserver;
            this.f74339q0 = compositeDisposable;
            this.f74340r0 = atomicThrowable;
            this.f74341s0 = atomicInteger;
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (this.f74341s0.decrementAndGet() == 0) {
                this.f74340r0.tryTerminateConsumer(this.f74338p0);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f74340r0;
            if (atomicThrowable.tryAddThrowableOrReport(th2) && this.f74341s0.decrementAndGet() == 0) {
                atomicThrowable.tryTerminateConsumer(this.f74338p0);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74339q0.add(disposable);
        }
    }

    public static final class b implements Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicThrowable f74342p0;

        public b(AtomicThrowable atomicThrowable) {
            this.f74342p0 = atomicThrowable;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74342p0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74342p0.isTerminated();
        }
    }

    public CompletableMergeArrayDelayError(CompletableSource[] completableSourceArr) {
        this.f74337p0 = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        CompletableSource[] completableSourceArr = this.f74337p0;
        AtomicInteger atomicInteger = new AtomicInteger(completableSourceArr.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        compositeDisposable.add(new b(atomicThrowable));
        completableObserver.onSubscribe(compositeDisposable);
        for (CompletableSource completableSource : completableSourceArr) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.tryAddThrowableOrReport(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new a(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            atomicThrowable.tryTerminateConsumer(completableObserver);
        }
    }
}
