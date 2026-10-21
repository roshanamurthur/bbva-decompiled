package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleTimeInterval<T> extends Single<Timed<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final SingleSource<T> f77843p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f77844q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f77845r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f77846s0;

    public static final class a<T> implements SingleObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SingleObserver<? super Timed<T>> f77847p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TimeUnit f77848q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler f77849r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f77850s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f77851t0;

        public a(SingleObserver<? super Timed<T>> singleObserver, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f77847p0 = singleObserver;
            this.f77848q0 = timeUnit;
            this.f77849r0 = scheduler;
            this.f77850s0 = z10 ? scheduler.now(timeUnit) : 0L;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77851t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77851t0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(@NonNull Throwable th2) {
            this.f77847p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(@NonNull Disposable disposable) {
            if (DisposableHelper.validate(this.f77851t0, disposable)) {
                this.f77851t0 = disposable;
                this.f77847p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(@NonNull T t10) {
            Scheduler scheduler = this.f77849r0;
            TimeUnit timeUnit = this.f77848q0;
            this.f77847p0.onSuccess(new Timed(t10, scheduler.now(timeUnit) - this.f77850s0, timeUnit));
        }
    }

    public SingleTimeInterval(SingleSource<T> singleSource, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        this.f77843p0 = singleSource;
        this.f77844q0 = timeUnit;
        this.f77845r0 = scheduler;
        this.f77846s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public void subscribeActual(@NonNull SingleObserver<? super Timed<T>> singleObserver) {
        this.f77843p0.subscribe(new a(singleObserver, this.f77844q0, this.f77845r0, this.f77846s0));
    }
}
