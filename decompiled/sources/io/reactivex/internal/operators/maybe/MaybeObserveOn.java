package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeObserveOn<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f71717p0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71718p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f71719q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f71720r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f71721s0;

        public a(MaybeObserver<? super T> maybeObserver, Scheduler scheduler) {
            this.f71718p0 = maybeObserver;
            this.f71719q0 = scheduler;
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
            DisposableHelper.replace(this, this.f71719q0.scheduleDirect(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71721s0 = th2;
            DisposableHelper.replace(this, this.f71719q0.scheduleDirect(this));
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f71718p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71720r0 = t10;
            DisposableHelper.replace(this, this.f71719q0.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f71721s0;
            MaybeObserver<? super T> maybeObserver = this.f71718p0;
            if (th2 != null) {
                this.f71721s0 = null;
                maybeObserver.onError(th2);
                return;
            }
            T t10 = this.f71720r0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                this.f71720r0 = null;
                maybeObserver.onSuccess(t10);
            }
        }
    }

    public MaybeObserveOn(MaybeSource<T> maybeSource, Scheduler scheduler) {
        super(maybeSource);
        this.f71717p0 = scheduler;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f71717p0));
    }
}
