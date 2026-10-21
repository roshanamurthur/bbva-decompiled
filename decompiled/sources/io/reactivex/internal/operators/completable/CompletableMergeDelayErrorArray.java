package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableMergeDelayErrorArray extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f70079p0;

    public static final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70080p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompositeDisposable f70081q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicThrowable f70082r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicInteger f70083s0;

        public a(CompletableObserver completableObserver, CompositeDisposable compositeDisposable, AtomicThrowable atomicThrowable, AtomicInteger atomicInteger) {
            this.f70080p0 = completableObserver;
            this.f70081q0 = compositeDisposable;
            this.f70082r0 = atomicThrowable;
            this.f70083s0 = atomicInteger;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (this.f70083s0.decrementAndGet() == 0) {
                Throwable thTerminate = this.f70082r0.terminate();
                CompletableObserver completableObserver = this.f70080p0;
                if (thTerminate == null) {
                    completableObserver.onComplete();
                } else {
                    completableObserver.onError(thTerminate);
                }
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f70082r0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            if (this.f70083s0.decrementAndGet() == 0) {
                Throwable thTerminate = atomicThrowable.terminate();
                CompletableObserver completableObserver = this.f70080p0;
                if (thTerminate == null) {
                    completableObserver.onComplete();
                } else {
                    completableObserver.onError(thTerminate);
                }
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70081q0.add(disposable);
        }
    }

    public CompletableMergeDelayErrorArray(CompletableSource[] completableSourceArr) {
        this.f70079p0 = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        CompletableSource[] completableSourceArr = this.f70079p0;
        AtomicInteger atomicInteger = new AtomicInteger(completableSourceArr.length + 1);
        AtomicThrowable atomicThrowable = new AtomicThrowable();
        completableObserver.onSubscribe(compositeDisposable);
        for (CompletableSource completableSource : completableSourceArr) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                atomicThrowable.addThrowable(new NullPointerException("A completable source is null"));
                atomicInteger.decrementAndGet();
            } else {
                completableSource.subscribe(new a(completableObserver, compositeDisposable, atomicThrowable, atomicInteger));
            }
        }
        if (atomicInteger.decrementAndGet() == 0) {
            Throwable thTerminate = atomicThrowable.terminate();
            if (thTerminate == null) {
                completableObserver.onComplete();
            } else {
                completableObserver.onError(thTerminate);
            }
        }
    }
}
