package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableTakeUntilPredicate<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f75518q0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75519p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f75520q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75521r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f75522s0;

        public a(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            this.f75519p0 = subscriber;
            this.f75520q0 = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75521r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75522s0) {
                return;
            }
            this.f75522s0 = true;
            this.f75519p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75522s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75522s0 = true;
                this.f75519p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75522s0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f75519p0;
            subscriber.onNext(t10);
            try {
                if (this.f75520q0.test(t10)) {
                    this.f75522s0 = true;
                    this.f75521r0.cancel();
                    subscriber.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75521r0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75521r0, subscription)) {
                this.f75521r0 = subscription;
                this.f75519p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75521r0.request(j10);
        }
    }

    public FlowableTakeUntilPredicate(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f75518q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75518q0));
    }
}
