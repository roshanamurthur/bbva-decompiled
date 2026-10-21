package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class ObservableTimeInterval<T> extends io.reactivex.internal.operators.observable.a<T, Timed<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f72998p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f72999q0;

    public static final class a<T> implements Observer<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<? super Timed<T>> f73000p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TimeUnit f73001q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler f73002r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public long f73003s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f73004t0;

        public a(Observer<? super Timed<T>> observer, TimeUnit timeUnit, Scheduler scheduler) {
            this.f73000p0 = observer;
            this.f73002r0 = scheduler;
            this.f73001q0 = timeUnit;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f73004t0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f73004t0.isDisposed();
        }

        @Override // io.reactivex.Observer
        public final void onComplete() {
            this.f73000p0.onComplete();
        }

        @Override // io.reactivex.Observer
        public final void onError(Throwable th2) {
            this.f73000p0.onError(th2);
        }

        @Override // io.reactivex.Observer
        public final void onNext(T t10) {
            Scheduler scheduler = this.f73002r0;
            TimeUnit timeUnit = this.f73001q0;
            long jNow = scheduler.now(timeUnit);
            long j10 = this.f73003s0;
            this.f73003s0 = jNow;
            this.f73000p0.onNext(new Timed(t10, jNow - j10, timeUnit));
        }

        @Override // io.reactivex.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73004t0, disposable)) {
                this.f73004t0 = disposable;
                this.f73003s0 = this.f73002r0.now(this.f73001q0);
                this.f73000p0.onSubscribe(this);
            }
        }
    }

    public ObservableTimeInterval(ObservableSource<T> observableSource, TimeUnit timeUnit, Scheduler scheduler) {
        super(observableSource);
        this.f72998p0 = scheduler;
        this.f72999q0 = timeUnit;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Timed<T>> observer) {
        this.source.subscribe(new a(observer, this.f72999q0, this.f72998p0));
    }
}
