package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableRetryWhen<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Flowable<Throwable>, ? extends Publisher<?>> f71072q0;

    public static final class a<T> extends FlowableRepeatWhen.c<T, Throwable> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f71015y0.cancel();
            this.f71013w0.onComplete();
        }
    }

    public FlowableRetryWhen(Flowable<T> flowable, Function<? super Flowable<Throwable>, ? extends Publisher<?>> function) {
        super(flowable);
        this.f71072q0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f71072q0.apply(serialized), "handler returned a null Publisher");
            FlowableRepeatWhen.b bVar = new FlowableRepeatWhen.b(this.source);
            a aVar = new a(serializedSubscriber, serialized, bVar);
            bVar.f71012s0 = aVar;
            subscriber.onSubscribe(aVar);
            publisher.subscribe(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
