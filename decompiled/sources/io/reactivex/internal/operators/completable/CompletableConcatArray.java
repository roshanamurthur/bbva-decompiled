package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableConcatArray extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource[] f70005p0;

    public static final class a extends AtomicInteger implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70006p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompletableSource[] f70007q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f70008r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final SequentialDisposable f70009s0 = new SequentialDisposable();

        public a(CompletableObserver completableObserver, CompletableSource[] completableSourceArr) {
            this.f70006p0 = completableObserver;
            this.f70007q0 = completableSourceArr;
        }

        public final void a() {
            SequentialDisposable sequentialDisposable = this.f70009s0;
            if (!sequentialDisposable.isDisposed() && getAndIncrement() == 0) {
                while (!sequentialDisposable.isDisposed()) {
                    int i10 = this.f70008r0;
                    this.f70008r0 = i10 + 1;
                    CompletableSource[] completableSourceArr = this.f70007q0;
                    if (i10 == completableSourceArr.length) {
                        this.f70006p0.onComplete();
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

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            a();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70006p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70009s0.replace(disposable);
        }
    }

    public CompletableConcatArray(CompletableSource[] completableSourceArr) {
        this.f70005p0 = completableSourceArr;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        a aVar = new a(completableObserver, this.f70005p0);
        completableObserver.onSubscribe(aVar.f70009s0);
        aVar.a();
    }
}
