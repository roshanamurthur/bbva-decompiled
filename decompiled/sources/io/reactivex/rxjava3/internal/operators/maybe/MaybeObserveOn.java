package io.reactivex.rxjava3.internal.operators.maybe;

import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeObserveOn<T> extends io.reactivex.rxjava3.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f75957p0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable, Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75958p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Scheduler f75959q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f75960r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Throwable f75961s0;

        public a(MaybeObserver<? super T> maybeObserver, Scheduler scheduler) {
            this.f75958p0 = maybeObserver;
            this.f75959q0 = scheduler;
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
            DisposableHelper.replace(this, this.f75959q0.scheduleDirect(this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f75961s0 = th2;
            DisposableHelper.replace(this, this.f75959q0.scheduleDirect(this));
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f75958p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            this.f75960r0 = t10;
            DisposableHelper.replace(this, this.f75959q0.scheduleDirect(this));
        }

        @Override // java.lang.Runnable
        public final void run() {
            Throwable th2 = this.f75961s0;
            MaybeObserver<? super T> maybeObserver = this.f75958p0;
            if (th2 != null) {
                this.f75961s0 = null;
                maybeObserver.onError(th2);
                return;
            }
            T t10 = this.f75960r0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                this.f75960r0 = null;
                maybeObserver.onSuccess(t10);
            }
        }
    }

    public MaybeObserveOn(MaybeSource<T> maybeSource, Scheduler scheduler) {
        super(maybeSource);
        this.f75957p0 = scheduler;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.source.subscribe(new a(maybeObserver, this.f75957p0));
    }
}
