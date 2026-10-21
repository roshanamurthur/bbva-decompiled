package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableSkipWhile<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f75445q0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75446p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f75447q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f75448r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f75449s0;

        public a(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            this.f75446p0 = subscriber;
            this.f75447q0 = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75448r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75446p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f75446p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            boolean z10 = this.f75449s0;
            Subscriber<? super T> subscriber = this.f75446p0;
            if (z10) {
                subscriber.onNext(t10);
                return;
            }
            try {
                if (this.f75447q0.test(t10)) {
                    this.f75448r0.request(1L);
                } else {
                    this.f75449s0 = true;
                    subscriber.onNext(t10);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75448r0.cancel();
                subscriber.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75448r0, subscription)) {
                this.f75448r0 = subscription;
                this.f75446p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75448r0.request(j10);
        }
    }

    public FlowableSkipWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f75445q0 = predicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75445q0));
    }
}
