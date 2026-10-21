package io.reactivex.internal.operators.flowable;

import io.reactivex.Completable;
import io.reactivex.CompletableObserver;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableIgnoreElementsCompletable<T> extends Completable implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70724p0;

    public FlowableIgnoreElementsCompletable(Flowable<T> flowable) {
        this.f70724p0 = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableIgnoreElements(this.f70724p0));
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(CompletableObserver completableObserver) {
        this.f70724p0.subscribe((FlowableSubscriber) new a(completableObserver));
    }

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final CompletableObserver f70725p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70726q0;

        public a(CompletableObserver completableObserver) {
            this.f70725p0 = completableObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70726q0.cancel();
            this.f70726q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70726q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70726q0 = SubscriptionHelper.CANCELLED;
            this.f70725p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70726q0 = SubscriptionHelper.CANCELLED;
            this.f70725p0.onError(th2);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70726q0, subscription)) {
                this.f70726q0 = subscription;
                this.f70725p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
        }
    }
}
