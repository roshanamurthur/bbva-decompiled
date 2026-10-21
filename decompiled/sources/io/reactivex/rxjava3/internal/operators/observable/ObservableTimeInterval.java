package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimeInterval<T> extends io.reactivex.rxjava3.internal.operators.observable.a<T, Timed<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f77275p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f77276q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Timed<T>> f77277p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TimeUnit f77278q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler f77279r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f77280s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f77281t0;

        public a(Observer<? super Timed<T>> observer, TimeUnit timeUnit, Scheduler scheduler) {
            this.f77277p0 = observer;
            this.f77279r0 = scheduler;
            this.f77278q0 = timeUnit;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f77281t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f77281t0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.f77277p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th2) {
            this.f77277p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(T t10) {
            Scheduler scheduler = this.f77279r0;
            TimeUnit timeUnit = this.f77278q0;
            long jNow = scheduler.now(timeUnit);
            long j10 = this.f77280s0;
            this.f77280s0 = jNow;
            this.f77277p0.onNext(new Timed(t10, jNow - j10, timeUnit));
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f77281t0, disposable)) {
                this.f77281t0 = disposable;
                this.f77280s0 = this.f77279r0.now(this.f77278q0);
                this.f77277p0.onSubscribe(this);
            }
        }
    }

    public ObservableTimeInterval(ObservableSource<T> observableSource, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f77275p0 = scheduler;
        this.f77276q0 = timeUnit;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public void subscribeActual(Observer<? super Timed<T>> observer) {
        this.source.subscribe(new a(observer, this.f77276q0, this.f77275p0));
    }
}
