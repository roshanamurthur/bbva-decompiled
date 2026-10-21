package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class CompletableAndThenPublisher<R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f76074q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Publisher<? extends R> f76075r0;

    public CompletableAndThenPublisher(CompletableSource completableSource, Publisher<? extends R> publisher) {
        this.f76074q0 = completableSource;
        this.f76075r0 = publisher;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76074q0.subscribe(new a(this.f76075r0, subscriber));
    }

    public static final class a<R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, CompletableObserver, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f76076p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Publisher<? extends R> f76077q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76078r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f76079s0 = new AtomicLong();

        public a(Publisher publisher, Subscriber subscriber) {
            this.f76076p0 = subscriber;
            this.f76077q0 = publisher;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f76078r0.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            Publisher<? extends R> publisher = this.f76077q0;
            if (publisher == null) {
                this.f76076p0.onComplete();
            } else {
                this.f76077q0 = null;
                publisher.subscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f76076p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            this.f76076p0.onNext(r3);
        }

        @Override // io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76078r0, disposable)) {
                this.f76078r0 = disposable;
                this.f76076p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f76079s0, j10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f76079s0, subscription);
        }
    }
}
