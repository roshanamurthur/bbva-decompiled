package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableTakeUntilPredicate<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f71262q0;

    public static final class a<T> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71263p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Predicate<? super T> f71264q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f71265r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f71266s0;

        public a(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            this.f71263p0 = subscriber;
            this.f71264q0 = predicate;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71265r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71266s0) {
                return;
            }
            this.f71266s0 = true;
            this.f71263p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71266s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71266s0 = true;
                this.f71263p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71266s0) {
                return;
            }
            Subscriber<? super T> subscriber = this.f71263p0;
            subscriber.onNext(t10);
            try {
                if (this.f71264q0.test(t10)) {
                    this.f71266s0 = true;
                    this.f71265r0.cancel();
                    subscriber.onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f71265r0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71265r0, subscription)) {
                this.f71265r0 = subscription;
                this.f71263p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f71265r0.request(j10);
        }
    }

    public FlowableTakeUntilPredicate(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f71262q0 = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f71262q0));
    }
}
