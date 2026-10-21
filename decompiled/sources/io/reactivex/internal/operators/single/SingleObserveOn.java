package io.reactivex.internal.operators.single;

import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleObserveOn<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f73538p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f73539q0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f73540p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f73541q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f73542r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f73543s0;

        public a(SingleObserver<? super T> singleObserver, Scheduler scheduler) {
            this.f73540p0 = singleObserver;
            this.f73541q0 = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73543s0 = th2;
            DisposableHelper.replace(this, this.f73541q0.scheduleDirect(this));
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f73540p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            this.f73542r0 = t10;
            DisposableHelper.replace(this, this.f73541q0.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f73543s0;
            SingleObserver<? super T> singleObserver = this.f73540p0;
            if (th2 != null) {
                singleObserver.onError(th2);
            } else {
                singleObserver.onSuccess(this.f73542r0);
            }
        }
    }

    public SingleObserveOn(SingleSource<T> singleSource, Scheduler scheduler) {
        this.f73538p0 = singleSource;
        this.f73539q0 = scheduler;
    }

    @Override // io.reactivex.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f73538p0.subscribe(new a(singleObserver, this.f73539q0));
    }
}
