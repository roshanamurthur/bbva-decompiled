package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.schedulers.Timed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimeInterval<T> extends Maybe<Timed<T>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f76008p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f76009q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f76010r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f76011s0;

    public static final class a<T> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super Timed<T>> f76012p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final TimeUnit f76013q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Scheduler f76014r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f76015s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Disposable f76016t0;

        public a(MaybeObserver<? super Timed<T>> maybeObserver, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f76012p0 = maybeObserver;
            this.f76013q0 = timeUnit;
            this.f76014r0 = scheduler;
            this.f76015s0 = z10 ? scheduler.now(timeUnit) : 0L;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f76016t0.dispose();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f76016t0.isDisposed();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f76012p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(@NonNull Throwable th2) {
            this.f76012p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(@NonNull Disposable disposable) {
            if (DisposableHelper.validate(this.f76016t0, disposable)) {
                this.f76016t0 = disposable;
                this.f76012p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(@NonNull T t10) {
            Scheduler scheduler = this.f76014r0;
            TimeUnit timeUnit = this.f76013q0;
            this.f76012p0.onSuccess(new Timed(t10, scheduler.now(timeUnit) - this.f76015s0, timeUnit));
        }
    }

    public MaybeTimeInterval(MaybeSource<T> maybeSource, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        this.f76008p0 = maybeSource;
        this.f76009q0 = timeUnit;
        this.f76010r0 = scheduler;
        this.f76011s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(@NonNull MaybeObserver<? super Timed<T>> maybeObserver) {
        this.f76008p0.subscribe(new a(maybeObserver, this.f76009q0, this.f76010r0, this.f76011s0));
    }
}
