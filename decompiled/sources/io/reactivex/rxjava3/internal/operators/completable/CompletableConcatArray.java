package io.reactivex.rxjava3.internal.operators.completable;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableConcatArray extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f74262p0;

    public static final class a extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f74263p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompletableSource[] f74264q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f74265r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f74266s0 = new SequentialDisposable();

        public a(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.f74263p0 = completableObserver;
            this.f74264q0 = completableSourceArr;
        }

        public final void a() {
            SequentialDisposable sequentialDisposable = this.f74266s0;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                while (!sequentialDisposable.isDisposed()) {
                    int i10 = this.f74265r0;
                    this.f74265r0 = i10 + 1;
                    CompletableSource[] completableSourceArr = this.f74264q0;
                    if (i10 == completableSourceArr.length) {
                        this.f74263p0.onComplete();
                        return;
                    } else {
                        completableSourceArr[i10].subscribe(this);
                        if (decrementAndGet() == 0) {
                            return;
                        }
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
            this.f74263p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f74266s0.replace(disposable);
        }
    }

    public CompletableConcatArray(CompletableSource[] completableSourceArr) {
        this.f74262p0 = completableSourceArr;
    }

    @Override // io.reactivex.rxjava3.core.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver, this.f74262p0);
        completableObserver.onSubscribe(aVar.f74266s0);
        aVar.a();
    }
}
