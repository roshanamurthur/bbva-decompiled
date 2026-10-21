package io.reactivex.internal.operators.maybe;

import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.internal.observers.DeferredScalarDisposable;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeToObservable<T> extends Observable<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final MaybeSource<T> f71792p0;

    public static final class a<T> extends DeferredScalarDisposable<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Disposable f71793p0;

        @Override // io.reactivex.internal.observers.DeferredScalarDisposable, io.reactivex.disposables.Disposable
        public final void dispose() {
            super.dispose();
            this.f71793p0.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71793p0, disposable)) {
                this.f71793p0 = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public MaybeToObservable(MaybeSource<T> maybeSource) {
        this.f71792p0 = maybeSource;
    }

    public static <T> MaybeObserver<T> create(Observer<? super T> observer) {
        return new a(observer);
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f71792p0;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        this.f71792p0.subscribe(create(observer));
    }
}
