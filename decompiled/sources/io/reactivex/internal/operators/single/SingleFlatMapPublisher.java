package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<T> f73511q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f73512r0;

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends Publisher<? extends R>> function) {
        this.f73511q0 = singleSource;
        this.f73512r0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f73511q0.subscribe(new a(subscriber, this.f73512r0));
    }

    public static final class a<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f73513p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super S, ? extends Publisher<? extends T>> f73514q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Subscription> f73515r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f73516s0;

        public a(Subscriber<? super T> subscriber, Function<? super S, ? extends Publisher<? extends T>> function) {
            this.f73513p0 = subscriber;
            this.f73514q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73516s0.dispose();
            SubscriptionHelper.cancel(this.f73515r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f73513p0.onComplete();
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73513p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f73513p0.onNext(t10);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            this.f73516s0 = disposable;
            this.f73513p0.onSubscribe(this);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(S s4) {
            try {
                ((Publisher) ObjectHelper.requireNonNull(this.f73514q0.apply(s4), "the mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f73513p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f73515r0, this, j10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f73515r0, this, subscription);
        }
    }
}
