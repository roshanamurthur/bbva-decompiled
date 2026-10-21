package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleToFlowable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<? extends T> f73579q0;

    public static final class a<T> extends DeferredScalarSubscription<T> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Disposable f73580p0;

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            this.f73580p0.dispose();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73580p0, disposable)) {
                this.f73580p0 = disposable;
                this.downstream.onSubscribe(this);
            }
        }
    }

    public SingleToFlowable(SingleSource<? extends T> singleSource) {
        this.f73579q0 = singleSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.f73579q0.subscribe(new a(subscriber));
    }
}
