package io.reactivex.rxjava3.internal.operators.mixed;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<T> f76184q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f76185r0;

    public MaybeFlatMapPublisher(MaybeSource<T> maybeSource, Function<? super T, ? extends Publisher<? extends R>> function) {
        this.f76184q0 = maybeSource;
        this.f76185r0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f76184q0.subscribe(new a(subscriber, this.f76185r0));
    }

    public static final class a<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f76186p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f76187q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f76188r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f76189s0 = new AtomicLong();

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
            this.f76186p0 = subscriber;
            this.f76187q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f76188r0.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f76186p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f76186p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            this.f76186p0.onNext(r3);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f76188r0, disposable)) {
                this.f76188r0 = disposable;
                this.f76186p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(T t10) {
            try {
                Publisher<? extends R> publisherApply = this.f76187q0.apply(t10);
                Objects.requireNonNull(publisherApply, "The mapper returned a null Publisher");
                Publisher<? extends R> publisher = publisherApply;
                if (get() != SubscriptionHelper.CANCELLED) {
                    publisher.subscribe(this);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f76186p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f76189s0, j10);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f76189s0, subscription);
        }
    }
}
