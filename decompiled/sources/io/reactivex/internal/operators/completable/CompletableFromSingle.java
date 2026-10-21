package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableFromSingle<T> extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f70056p0;

    public static final class a<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70057p0;

        public a(CompletableObserver completableObserver) {
            this.f70057p0 = completableObserver;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f70057p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f70057p0.onSubscribe(disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f70057p0.onComplete();
        }
    }

    public CompletableFromSingle(SingleSource<T> singleSource) {
        this.f70056p0 = singleSource;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70056p0.subscribe(new a(completableObserver));
    }
}
