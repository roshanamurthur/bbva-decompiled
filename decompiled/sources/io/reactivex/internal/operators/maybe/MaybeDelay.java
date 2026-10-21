package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelay<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f71555p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f71556q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f71557r0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71558p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f71559q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f71560r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f71561s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public T f71562t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Throwable f71563u0;

        public a(MaybeObserver<? super T> maybeObserver, long j10, TimeUnit timeUnit, Scheduler scheduler) {
            this.f71558p0 = maybeObserver;
            this.f71559q0 = j10;
            this.f71560r0 = timeUnit;
            this.f71561s0 = scheduler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            DisposableHelper.replace(this, this.f71561s0.scheduleDirect(this, this.f71559q0, this.f71560r0));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71563u0 = th2;
            DisposableHelper.replace(this, this.f71561s0.scheduleDirect(this, this.f71559q0, this.f71560r0));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f71558p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71562t0 = t10;
            DisposableHelper.replace(this, this.f71561s0.scheduleDirect(this, this.f71559q0, this.f71560r0));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f71563u0;
            MaybeObserver<? super T> maybeObserver = this.f71558p0;
            if (th2 != null) {
                maybeObserver.onError(th2);
                return;
            }
            T t10 = this.f71562t0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }
    }

    public MaybeDelay(MaybeSource<T> maybeSource, long j10, TimeUnit timeUnit, Scheduler scheduler) {
        super(maybeSource);
        this.f71555p0 = j10;
        this.f71556q0 = timeUnit;
        this.f71557r0 = scheduler;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71555p0, this.f71556q0, this.f71557r0));
    }
}
