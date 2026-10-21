package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableMergeArray extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f74333p0;

    public static final class a extends AtomicInteger implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74334p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicBoolean f74335q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final CompositeDisposable f74336r0;

        public a(CompletableObserver completableObserver, AtomicBoolean atomicBoolean, CompositeDisposable compositeDisposable, int i10) {
            this.f74334p0 = completableObserver;
            this.f74335q0 = atomicBoolean;
            this.f74336r0 = compositeDisposable;
            lazySet(i10);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f74336r0.dispose();
            this.f74335q0.set(true);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f74336r0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f74334p0.onComplete();
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f74336r0.dispose();
            if (this.f74335q0.compareAndSet(false, true)) {
                this.f74334p0.onError(th2);
            } else {
                RxJavaPlugins.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74336r0.add(disposable);
        }
    }

    public CompletableMergeArray(CompletableSource[] completableSourceArr) {
        this.f74333p0 = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        CompletableSource[] completableSourceArr = this.f74333p0;
        a aVar = new a(completableObserver, atomicBoolean, compositeDisposable, completableSourceArr.length + 1);
        completableObserver.onSubscribe(aVar);
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
