package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleObserveOn<T> extends Single<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77816p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Scheduler f77817q0;

    public static final class a<T> extends AtomicReference<Disposable> implements SingleObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super T> f77818p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f77819q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f77820r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f77821s0;

        public a(SingleObserver<? super T> singleObserver, Scheduler scheduler) {
            this.f77818p0 = singleObserver;
            this.f77819q0 = scheduler;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77821s0 = th2;
            DisposableHelper.replace(this, this.f77819q0.scheduleDirect(this));
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f77818p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f77820r0 = t10;
            DisposableHelper.replace(this, this.f77819q0.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f77821s0;
            SingleObserver<? super T> singleObserver = this.f77818p0;
            if (th2 != null) {
                singleObserver.onError(th2);
            } else {
                singleObserver.onSuccess(this.f77820r0);
            }
        }
    }

    public SingleObserveOn(SingleSource<T> singleSource, Scheduler scheduler) {
        this.f77816p0 = singleSource;
        this.f77817q0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(SingleObserver<? super T> singleObserver) {
        this.f77816p0.subscribe(new a(singleObserver, this.f77817q0));
    }
}
