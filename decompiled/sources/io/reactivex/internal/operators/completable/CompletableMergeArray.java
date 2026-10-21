package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableMergeArray extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f70075p0;

    public static final class a extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70076p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicBoolean f70077q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f70078r0;

        public a(CompletableObserver completableObserver, AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, int i10) {
            this.f70076p0 = completableObserver;
            this.f70077q0 = atomicBoolean;
            this.f70078r0 = compositeDisposable;
            lazySet(i10);
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            if (decrementAndGet() == 0 && this.f70077q0.compareAndSet(false, true)) {
                this.f70076p0.onComplete();
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70078r0.dispose();
            if (this.f70077q0.compareAndSet(false, true)) {
                this.f70076p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70078r0.add(disposable);
        }
    }

    public CompletableMergeArray(CompletableSource[] completableSourceArr) {
        this.f70075p0 = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompletableSource[] completableSourceArr = this.f70075p0;
        a aVar = new a(completableObserver, atomicBoolean, compositeDisposable, completableSourceArr.length + 1);
        completableObserver.onSubscribe(compositeDisposable);
        for (CompletableSource completableSource : completableSourceArr) {
            if (compositeDisposable.isDisposed()) {
                return;
            }
            if (completableSource == null) {
                compositeDisposable.dispose();
                aVar.onError(new NullPointerException("A completable source is null"));
                return;
            }
            completableSource.subscribe(aVar);
        }
        aVar.onComplete();
    }
}
