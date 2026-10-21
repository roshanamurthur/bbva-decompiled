package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableUsing<T, D> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Supplier<? extends D> f75605q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super D, ? extends Publisher<? extends T>> f75606r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Consumer<? super D> f75607s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final boolean f75608t0;

    public static final class a<T, D> extends AtomicBoolean implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75609p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final D f75610q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Consumer<? super D> f75611r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f75612s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f75613t0;

        public a(Subscriber<? super T> subscriber, D d2, Consumer<? super D> consumer, boolean z10) {
            this.f75609p0 = subscriber;
            this.f75610q0 = d2;
            this.f75611r0 = consumer;
            this.f75612s0 = z10;
        }

        public final void a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f75611r0.accept(this.f75610q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.f75612s0) {
                a();
                this.f75613t0.cancel();
                this.f75613t0 = SubscriptionHelper.CANCELLED;
            } else {
                this.f75613t0.cancel();
                this.f75613t0 = SubscriptionHelper.CANCELLED;
                a();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            boolean z10 = this.f75612s0;
            Subscriber<? super T> subscriber = this.f75609p0;
            if (!z10) {
                subscriber.onComplete();
                this.f75613t0.cancel();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f75611r0.accept(this.f75610q0);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    subscriber.onError(th2);
                    return;
                }
            }
            this.f75613t0.cancel();
            subscriber.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            boolean z10 = this.f75612s0;
            Subscriber<? super T> subscriber = this.f75609p0;
            if (!z10) {
                subscriber.onError(th2);
                this.f75613t0.cancel();
                a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f75611r0.accept(this.f75610q0);
                } catch (Throwable th3) {
                    th = th3;
                    Exceptions.throwIfFatal(th);
                }
            }
            th = null;
            this.f75613t0.cancel();
            if (th != null) {
                subscriber.onError(new CompositeException(th2, th));
            } else {
                subscriber.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f75609p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75613t0, subscription)) {
                this.f75613t0 = subscription;
                this.f75609p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f75613t0.request(j10);
        }
    }

    public FlowableUsing(Supplier<? extends D> supplier, Function<? super D, ? extends Publisher<? extends T>> function, Consumer<? super D> consumer, boolean z10) {
        this.f75605q0 = supplier;
        this.f75606r0 = function;
        this.f75607s0 = consumer;
        this.f75608t0 = z10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        Consumer<? super D> consumer = this.f75607s0;
        try {
            D d2 = this.f75605q0.get();
            try {
                Publisher<? extends T> publisherApply = this.f75606r0.apply(d2);
                Objects.requireNonNull(publisherApply, "The sourceSupplier returned a null Publisher");
                publisherApply.subscribe(new a(subscriber, d2, consumer, this.f75608t0));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                try {
                    consumer.accept(d2);
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
