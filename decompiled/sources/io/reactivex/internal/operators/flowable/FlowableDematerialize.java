package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Notification;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDematerialize<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Notification<R>> f70478q0;

    public static final class a<T, R> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f70479p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Notification<R>> f70480q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70481r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f70482s0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Notification<R>> function) {
            this.f70479p0 = subscriber;
            this.f70480q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70482s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70481r0) {
                return;
            }
            this.f70481r0 = true;
            this.f70479p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70481r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70481r0 = true;
                this.f70479p0.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70481r0) {
                if (t10 instanceof Notification) {
                    Notification notification = (Notification) t10;
                    if (notification.isOnError()) {
                        RxJavaPlugins.onError(notification.getError());
                        return;
                    }
                    return;
                }
                return;
            }
            try {
                Notification notification2 = (Notification) ObjectHelper.requireNonNull(this.f70480q0.apply(t10), "The selector returned a null Notification");
                if (notification2.isOnError()) {
                    this.f70482s0.cancel();
                    onError(notification2.getError());
                } else if (!notification2.isOnComplete()) {
                    this.f70479p0.onNext((Object) notification2.getValue());
                } else {
                    this.f70482s0.cancel();
                    onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70482s0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70482s0, subscription)) {
                this.f70482s0 = subscription;
                this.f70479p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70482s0.request(j10);
        }
    }

    public FlowableDematerialize(Flowable<T> flowable, Function<? super T, ? extends Notification<R>> function) {
        super(flowable);
        this.f70478q0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70478q0));
    }
}
