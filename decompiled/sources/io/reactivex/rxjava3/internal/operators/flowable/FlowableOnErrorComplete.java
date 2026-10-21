package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnErrorComplete<T> extends a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super Throwable> f75163q0;

    public static final class OnErrorCompleteSubscriber<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75164p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super Throwable> f75165q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75166r0;

        public OnErrorCompleteSubscriber(Subscriber<? super T> subscriber, Predicate<? super Throwable> predicate) {
            this.f75164p0 = subscriber;
            this.f75165q0 = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
            this.f75166r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
            this.f75164p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(Throwable th2) {
            Subscriber<? super T> subscriber = this.f75164p0;
            try {
                if (this.f75165q0.test(th2)) {
                    subscriber.onComplete();
                } else {
                    subscriber.onError(th2);
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                subscriber.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T t10) {
            this.f75164p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75166r0, subscription)) {
                this.f75166r0 = subscription;
                this.f75164p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public void request(long j10) {
            this.f75166r0.request(j10);
        }
    }

    public FlowableOnErrorComplete(Flowable<T> flowable, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.f75163q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new OnErrorCompleteSubscriber(subscriber, this.f75163q0));
    }
}
