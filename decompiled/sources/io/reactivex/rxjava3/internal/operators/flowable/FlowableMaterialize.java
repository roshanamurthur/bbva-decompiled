package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Notification;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMaterialize<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, Notification<T>> {

    public static final class a<T> extends SinglePostCompleteSubscriber<T, Notification<T>> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            complete(Notification.createOnComplete());
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber
        public final void onDrop(Object obj) {
            Notification notification = (Notification) obj;
            if (notification.isOnError()) {
                RxJavaPlugins.onError(notification.getError());
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            complete(Notification.createOnError(th2));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.produced++;
            this.downstream.onNext(Notification.createOnNext(t10));
        }
    }

    public FlowableMaterialize(Flowable<T> flowable) {
        super(flowable);
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super Notification<T>> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber));
    }
}
