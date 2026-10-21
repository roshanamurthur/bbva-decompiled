package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.HasUpstreamMaybeSource;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeToFlowable<T> extends Flowable<T> implements HasUpstreamMaybeSource<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<T> f71790q0;

    public static final class a<T> extends DeferredScalarSubscription<T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Disposable f71791p0;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f71791p0.dispose();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71791p0, disposable)) {
                this.f71791p0 = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public MaybeToFlowable(MaybeSource<T> maybeSource) {
        this.f71790q0 = maybeSource;
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public MaybeSource<T> source() {
        return this.f71790q0;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f71790q0.subscribe(new a(subscriber));
    }
}
