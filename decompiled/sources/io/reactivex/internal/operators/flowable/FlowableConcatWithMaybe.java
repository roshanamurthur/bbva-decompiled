package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatWithMaybe<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<? extends T> f70399q0;

    public static final class a<T> extends SinglePostCompleteSubscriber<T, T> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AtomicReference<Disposable> f70400p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public MaybeSource<? extends T> f70401q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70402r0;

        public a(Subscriber<? super T> subscriber, MaybeSource<? extends T> maybeSource) {
            super(subscriber);
            this.f70401q0 = maybeSource;
            this.f70400p0 = new AtomicReference<>();
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public final void cancel() {
            super.cancel();
            DisposableHelper.dispose(this.f70400p0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70402r0) {
                this.downstream.onComplete();
                return;
            }
            this.f70402r0 = true;
            this.upstream = SubscriptionHelper.CANCELLED;
            MaybeSource<? extends T> maybeSource = this.f70401q0;
            this.f70401q0 = null;
            maybeSource.subscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.downstream.onError(th2);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.produced++;
            this.downstream.onNext((Object) t10);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this.f70400p0, disposable);
        }
    }

    public FlowableConcatWithMaybe(Flowable<T> flowable, MaybeSource<? extends T> maybeSource) {
        super(flowable);
        this.f70399q0 = maybeSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70399q0));
    }
}
