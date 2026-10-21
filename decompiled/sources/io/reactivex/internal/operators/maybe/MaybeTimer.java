package io.reactivex.internal.operators.maybe;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeTimer extends Maybe<Long> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final long f71786p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TimeUnit f71787q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Scheduler f71788r0;

    public static final class a extends AtomicReference<Disposable> implements Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super Long> f71789p0;

        public a(MaybeObserver<? super Long> maybeObserver) {
            this.f71789p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f71789p0.onSuccess(0L);
        }
    }

    public MaybeTimer(long j10, TimeUnit timeUnit, Scheduler scheduler) {
        this.f71786p0 = j10;
        this.f71787q0 = timeUnit;
        this.f71788r0 = scheduler;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super Long> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        DisposableHelper.replace(aVar, this.f71788r0.scheduleDirect(aVar, this.f71786p0, this.f71787q0));
    }
}
