package io.reactivex.internal.operators.mixed;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f71827q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<? extends R> f71828r0;

    public CompletableAndThenPublisher(CompletableSource completableSource, Publisher<? extends R> publisher) {
        this.f71827q0 = completableSource;
        this.f71828r0 = publisher;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f71827q0.subscribe(new a(this.f71828r0, subscriber));
    }

    public static final class a<R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, CompletableObserver, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71829p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Publisher<? extends R> f71830q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71831r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71832s0 = new AtomicLong();

        public a(Publisher publisher, Subscriber subscriber) {
            this.f71829p0 = subscriber;
            this.f71830q0 = publisher;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71831r0.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Publisher<? extends R> publisher = this.f71830q0;
            if (publisher == null) {
                this.f71829p0.onComplete();
            } else {
                this.f71830q0 = null;
                publisher.subscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71829p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            this.f71829p0.onNext(r3);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71831r0, disposable)) {
                this.f71831r0 = disposable;
                this.f71829p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f71832s0, j10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f71832s0, subscription);
        }
    }
}
