package io.reactivex.rxjava3.internal.operators.single;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<T> f77788q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f77789r0;

    public SingleFlatMapPublisher(SingleSource<T> singleSource, Function<? super T, ? extends Publisher<? extends R>> function) {
        this.f77788q0 = singleSource;
        this.f77789r0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f77788q0.subscribe(new a(subscriber, this.f77789r0));
    }

    public static final class a<S, T> extends AtomicLong implements SingleObserver<S>, FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f77790p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super S, ? extends Publisher<? extends T>> f77791q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicReference<Subscription> f77792r0 = new AtomicReference<>();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f77793s0;

        public a(Subscriber<? super T> subscriber, Function<? super S, ? extends Publisher<? extends T>> function) {
            this.f77790p0 = subscriber;
            this.f77791q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f77793s0.dispose();
            SubscriptionHelper.cancel(this.f77792r0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f77790p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(Throwable th2) {
            this.f77790p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f77790p0.onNext(t10);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            this.f77793s0 = disposable;
            this.f77790p0.onSubscribe(this);
        }

        @Override // io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(S s4) {
            try {
                Publisher<? extends T> publisherApply = this.f77791q0.apply(s4);
                Objects.requireNonNull(publisherApply, "the mapper returned a null Publisher");
                Publisher<? extends T> publisher = publisherApply;
                if (this.f77792r0.get() != SubscriptionHelper.CANCELLED) {
                    publisher.subscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f77790p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this.f77792r0, this, j10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this.f77792r0, this, subscription);
        }
    }
}
