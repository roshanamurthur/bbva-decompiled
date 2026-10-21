package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableUsing<T, D> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends D> f71349q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super D, ? extends Publisher<? extends T>> f71350r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super D> f71351s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f71352t0;

    public static final class a<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f71353p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final D f71354q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super D> f71355r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f71356s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f71357t0;

        public a(Subscriber<? super T> subscriber, D d2, Consumer<? super D> consumer, boolean z10) {
            this.f71353p0 = subscriber;
            this.f71354q0 = d2;
            this.f71355r0 = consumer;
            this.f71356s0 = z10;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f71355r0.accept(this.f71354q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            a();
            this.f71357t0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            boolean z10 = this.f71356s0;
            Subscriber<? super T> subscriber = this.f71353p0;
            if (!z10) {
                subscriber.onComplete();
                this.f71357t0.cancel();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f71355r0.accept(this.f71354q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    subscriber.onError(th2);
                    return;
                }
            }
            this.f71357t0.cancel();
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            boolean z10 = this.f71356s0;
            Subscriber<? super T> subscriber = this.f71353p0;
            if (!z10) {
                subscriber.onError(th2);
                this.f71357t0.cancel();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f71355r0.accept(this.f71354q0);
                } catch (Throwable th3) {
                    th = th3;
                    Exceptions.throwIfFatal(th);
                }
            }
            th = null;
            this.f71357t0.cancel();
            if (th != null) {
                subscriber.onError(new CompositeException(th2, th));
            } else {
                subscriber.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f71353p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71357t0, subscription)) {
                this.f71357t0 = subscription;
                this.f71353p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f71357t0.request(j10);
        }
    }

    public FlowableUsing(Callable<? extends D> callable, Function<? super D, ? extends Publisher<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        this.f71349q0 = callable;
        this.f71350r0 = function;
        this.f71351s0 = consumer;
        this.f71352t0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Consumer<? super D> consumer = this.f71351s0;
        try {
            D dCall = this.f71349q0.call();
            try {
                ((Publisher) ObjectHelper.requireNonNull(this.f71350r0.apply(dCall), "The sourceSupplier returned a null Publisher")).subscribe(new a(subscriber, dCall, consumer, this.f71352t0));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    consumer.accept(dCall);
                    EmptySubscription.error(th2, subscriber);
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    EmptySubscription.error(new CompositeException(th2, th3), subscriber);
                }
            }
        } catch (Throwable th4) {
            Exceptions.throwIfFatal(th4);
            EmptySubscription.error(th4, subscriber);
        }
    }
}
