package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableZipIterable<T, U, V> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, V> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<U> f75731q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends V> f75732r0;

    public static final class a<T, U, V> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super V> f75733p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<U> f75734q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends V> f75735r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f75736s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f75737t0;

        public a(Subscriber<? super V> subscriber, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.f75733p0 = subscriber;
            this.f75734q0 = it;
            this.f75735r0 = biFunction;
        }

        public final void a(Throwable th2) {
            Exceptions.throwIfFatal(th2);
            this.f75737t0 = true;
            this.f75736s0.cancel();
            this.f75733p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75736s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75737t0) {
                return;
            }
            this.f75737t0 = true;
            this.f75733p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75737t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75737t0 = true;
                this.f75733p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            Iterator<U> it = this.f75734q0;
            if (this.f75737t0) {
                return;
            }
            try {
                U next = it.next();
                Objects.requireNonNull(next, "The iterator returned a null value");
                try {
                    V vApply = this.f75735r0.apply(t10, next);
                    Objects.requireNonNull(vApply, "The zipper function returned a null value");
                    Subscriber<? super V> subscriber = this.f75733p0;
                    subscriber.onNext(vApply);
                    try {
                        if (it.hasNext()) {
                            return;
                        }
                        this.f75737t0 = true;
                        this.f75736s0.cancel();
                        subscriber.onComplete();
                    } catch (Throwable th2) {
                        a(th2);
                    }
                } catch (Throwable th3) {
                    a(th3);
                }
            } catch (Throwable th4) {
                a(th4);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75736s0, subscription)) {
                this.f75736s0 = subscription;
                this.f75733p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75736s0.request(j10);
        }
    }

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.f75731q0 = iterable;
        this.f75732r0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super V> subscriber) {
        try {
            Iterator<U> it = this.f75731q0.iterator();
            Objects.requireNonNull(it, "The iterator returned by other is null");
            Iterator<U> it2 = it;
            try {
                if (it2.hasNext()) {
                    this.source.subscribe((FlowableSubscriber) new a(subscriber, it2, this.f75732r0));
                } else {
                    EmptySubscription.complete(subscriber);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                EmptySubscription.error(th2, subscriber);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, subscriber);
        }
    }
}
