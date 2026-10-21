package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDematerialize<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Notification<R>> f74743q0;

    public static final class a<T, R> implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74744p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Notification<R>> f74745q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f74746r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f74747s0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Notification<R>> function) {
            this.f74744p0 = subscriber;
            this.f74745q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74747s0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74746r0) {
                return;
            }
            this.f74746r0 = true;
            this.f74744p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74746r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74746r0 = true;
                this.f74744p0.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74746r0) {
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
                Notification<R> notificationApply = this.f74745q0.apply(t10);
                Objects.requireNonNull(notificationApply, "The selector returned a null Notification");
                Notification<R> notification2 = notificationApply;
                if (notification2.isOnError()) {
                    this.f74747s0.cancel();
                    onError(notification2.getError());
                } else if (!notification2.isOnComplete()) {
                    this.f74744p0.onNext(notification2.getValue());
                } else {
                    this.f74747s0.cancel();
                    onComplete();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f74747s0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74747s0, subscription)) {
                this.f74747s0 = subscription;
                this.f74744p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74747s0.request(j10);
        }
    }

    public FlowableDematerialize(Flowable<T> flowable, Function<? super T, ? extends Notification<R>> function) {
        super(flowable);
        this.f74743q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74743q0));
    }
}
