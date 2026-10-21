package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeDelay<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f75789p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f75790q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f75791r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f75792s0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75793p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final long f75794q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final TimeUnit f75795r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Scheduler f75796s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final boolean f75797t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public T f75798u0;
        public Throwable v0;

        public a(MaybeObserver<? super T> maybeObserver, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
            this.f75793p0 = maybeObserver;
            this.f75794q0 = j10;
            this.f75795r0 = timeUnit;
            this.f75796s0 = scheduler;
            this.f75797t0 = z10;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            DisposableHelper.replace(this, this.f75796s0.scheduleDirect(this, this.f75794q0, this.f75795r0));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.v0 = th2;
            DisposableHelper.replace(this, this.f75796s0.scheduleDirect(this, this.f75797t0 ? this.f75794q0 : 0L, this.f75795r0));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f75793p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75798u0 = t10;
            DisposableHelper.replace(this, this.f75796s0.scheduleDirect(this, this.f75794q0, this.f75795r0));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.v0;
            MaybeObserver<? super T> maybeObserver = this.f75793p0;
            if (th2 != null) {
                maybeObserver.onError(th2);
                return;
            }
            T t10 = this.f75798u0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }
    }

    public MaybeDelay(MaybeSource<T> maybeSource, long j10, TimeUnit timeUnit, Scheduler scheduler, boolean z10) {
        super(maybeSource);
        this.f75789p0 = j10;
        this.f75790q0 = timeUnit;
        this.f75791r0 = scheduler;
        this.f75792s0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75789p0, this.f75790q0, this.f75791r0, this.f75792s0));
    }
}
