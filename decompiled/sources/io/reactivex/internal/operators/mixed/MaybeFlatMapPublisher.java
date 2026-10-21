package io.reactivex.internal.operators.mixed;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlatMapPublisher<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<T> f71920q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<? extends R>> f71921r0;

    public MaybeFlatMapPublisher(MaybeSource<T> maybeSource, Function<? super T, ? extends Publisher<? extends R>> function) {
        this.f71920q0 = maybeSource;
        this.f71921r0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f71920q0.subscribe(new a(subscriber, this.f71921r0));
    }

    public static final class a<T, R> extends AtomicReference<Subscription> implements FlowableSubscriber<R>, MaybeObserver<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71922p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<? extends R>> f71923q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Disposable f71924r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicLong f71925s0 = new AtomicLong();

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Publisher<? extends R>> function) {
            this.f71922p0 = subscriber;
            this.f71923q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71924r0.dispose();
            SubscriptionHelper.cancel(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71922p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f71922p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(R r3) {
            this.f71922p0.onNext(r3);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71924r0, disposable)) {
                this.f71924r0 = disposable;
                this.f71922p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            try {
                ((Publisher) ObjectHelper.requireNonNull(this.f71923q0.apply(t10), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f71922p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            SubscriptionHelper.deferredRequest(this, this.f71925s0, j10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            SubscriptionHelper.deferredSetOnce(this, this.f71925s0, subscription);
        }
    }
}
