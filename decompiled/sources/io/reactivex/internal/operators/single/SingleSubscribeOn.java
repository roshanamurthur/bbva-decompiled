package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleSubscribeOn<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<? extends T> f73553p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f73554q0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73555p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final SequentialDisposable f73556q0 = new SequentialDisposable();

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final SingleSource<? extends T> f73557r0;

        public a(SingleObserver<? super T> singleObserver, SingleSource<? extends T> singleSource) {
            this.f73555p0 = singleObserver;
            this.f73557r0 = singleSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f73556q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73555p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73555p0.onSuccess(t10);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f73557r0.subscribe(this);
        }
    }

    public SingleSubscribeOn(SingleSource<? extends T> singleSource, Scheduler scheduler) {
        this.f73553p0 = singleSource;
        this.f73554q0 = scheduler;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        a aVar = new a(singleObserver, this.f73553p0);
        singleObserver.onSubscribe(aVar);
        aVar.f73556q0.replace(this.f73554q0.scheduleDirect(aVar));
    }
}
