package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeSubscribeOn<T> extends io.reactivex.internal.operators.maybe.a<T, T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Scheduler f71746p0;

    public static final class a<T> extends AtomicReference<Disposable> implements MaybeObserver<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final SequentialDisposable f71747p0 = new SequentialDisposable();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71748q0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71748q0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
            this.f71747p0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71748q0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71748q0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            this.f71748q0.onSuccess(t10);
        }
    }

    public static final class b<T> implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71749p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final MaybeSource<T> f71750q0;

        public b(a aVar, MaybeSource maybeSource) {
            this.f71749p0 = aVar;
            this.f71750q0 = maybeSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f71750q0.subscribe(this.f71749p0);
        }
    }

    public MaybeSubscribeOn(MaybeSource<T> maybeSource, Scheduler scheduler) {
        super(maybeSource);
        this.f71746p0 = scheduler;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        a aVar = new a(maybeObserver);
        maybeObserver.onSubscribe(aVar);
        aVar.f71747p0.replace(this.f71746p0.scheduleDirect(new b(aVar, this.source)));
    }
}
