package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableToObservable<T> extends Observable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f70141p0;

    public CompletableToObservable(CompletableSource completableSource) {
        this.f70141p0 = completableSource;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f70141p0.subscribe(new a(observer));
    }

    public static final class a extends BasicQueueDisposable<Void> implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Observer<?> f70142p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Disposable f70143q0;

        public a(Observer<?> observer) {
            this.f70142p0 = observer;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70143q0.dispose();
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70143q0.isDisposed();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f70142p0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f70142p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f70143q0, disposable)) {
                this.f70143q0 = disposable;
                this.f70142p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final /* bridge */ /* synthetic */ Object poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }
    }
}
