package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Iterator;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableZipIterable<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, V> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<U> f71499q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiFunction<? super T, ? super U, ? extends V> f71500r0;

    public static final class a<T, U, V> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super V> f71501p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Iterator<U> f71502q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BiFunction<? super T, ? super U, ? extends V> f71503r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f71504s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f71505t0;

        public a(Subscriber<? super V> subscriber, Iterator<U> it, BiFunction<? super T, ? super U, ? extends V> biFunction) {
            this.f71501p0 = subscriber;
            this.f71502q0 = it;
            this.f71503r0 = biFunction;
        }

        public final void a(Throwable th2) {
            Exceptions.throwIfFatal(th2);
            this.f71505t0 = true;
            this.f71504s0.cancel();
            this.f71501p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71504s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71505t0) {
                return;
            }
            this.f71505t0 = true;
            this.f71501p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71505t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f71505t0 = true;
                this.f71501p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            Iterator<U> it = this.f71502q0;
            if (this.f71505t0) {
                return;
            }
            try {
                try {
                    Object objRequireNonNull = ObjectHelper.requireNonNull(this.f71503r0.apply(t10, ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value")), "The zipper function returned a null value");
                    Subscriber<? super V> subscriber = this.f71501p0;
                    subscriber.onNext(objRequireNonNull);
                    try {
                        if (it.hasNext()) {
                            return;
                        }
                        this.f71505t0 = true;
                        this.f71504s0.cancel();
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71504s0, subscription)) {
                this.f71504s0 = subscription;
                this.f71501p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f71504s0.request(j10);
        }
    }

    public FlowableZipIterable(Flowable<T> flowable, Iterable<U> iterable, BiFunction<? super T, ? super U, ? extends V> biFunction) {
        super(flowable);
        this.f71499q0 = iterable;
        this.f71500r0 = biFunction;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super V> subscriber) {
        try {
            Iterator it = (Iterator) ObjectHelper.requireNonNull(this.f71499q0.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.source.subscribe((FlowableSubscriber) new a(subscriber, it, this.f71500r0));
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
