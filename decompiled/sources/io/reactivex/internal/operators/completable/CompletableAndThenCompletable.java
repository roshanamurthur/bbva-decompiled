package io.reactivex.internal.operators.completable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class CompletableAndThenCompletable extends Completable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CompletableSource f69979p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f69980q0;

    public static final class a implements CompletableObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f69981p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompletableObserver f69982q0;

        public a(AtomicReference<Disposable> atomicReference, CompletableObserver completableObserver) {
            this.f69981p0 = atomicReference;
            this.f69982q0 = completableObserver;
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f69982q0.onComplete();
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f69982q0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.replace(this.f69981p0, disposable);
        }
    }

    public static final class b extends AtomicReference<Disposable> implements CompletableObserver, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f69983p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final CompletableSource f69984q0;

        public b(CompletableObserver completableObserver, CompletableSource completableSource) {
            this.f69983p0 = completableObserver;
            this.f69984q0 = completableSource;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            DisposableHelper.dispose(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return DisposableHelper.isDisposed(get());
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f69984q0.subscribe(new a(this, this.f69983p0));
        }

        @Override // io.reactivex.CompletableObserver
        public final void onError(Throwable th2) {
            this.f69983p0.onError(th2);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable)) {
                this.f69983p0.onSubscribe(this);
            }
        }
    }

    public CompletableAndThenCompletable(CompletableSource completableSource, CompletableSource completableSource2) {
        this.f69979p0 = completableSource;
        this.f69980q0 = completableSource2;
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f69979p0.subscribe(new b(completableObserver, this.f69980q0));
    }
}
