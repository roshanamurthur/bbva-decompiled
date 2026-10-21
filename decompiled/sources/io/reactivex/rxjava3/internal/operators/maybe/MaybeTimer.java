package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimer extends Maybe<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f76033p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f76034q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f76035r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super Long> f76036p0;

        public a(MaybeObserver<? super Long> maybeObserver) {
            this.f76036p0 = maybeObserver;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f76036p0.onSuccess(0L);
        }
    }

    public MaybeTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f76033p0 = j10;
        this.f76034q0 = timeUnit;
        this.f76035r0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super Long> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar, this.f76035r0.scheduleDirect(aVar, this.f76033p0, this.f76034q0));
    }
}
