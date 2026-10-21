package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.processors.FlowableProcessor;
import io.reactivex.rxjava3.processors.UnicastProcessor;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableRetryWhen<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Flowable<Throwable>, ? extends Publisher<?>> f75330q0;

    public static final class a<T> extends FlowableRepeatWhen.c<T, Throwable> {
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75272y0.cancel();
            this.f75270w0.onComplete();
        }
    }

    public FlowableRetryWhen(Flowable<T> flowable, Function<? super Flowable<Throwable>, ? extends Publisher<?>> function) {
        super(flowable);
        this.f75330q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(subscriber);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            Publisher<?> publisherApply = this.f75330q0.apply(serialized);
            Objects.requireNonNull(publisherApply, "handler returned a null Publisher");
            Publisher<?> publisher = publisherApply;
            FlowableRepeatWhen.b bVar = new FlowableRepeatWhen.b(this.source);
            a aVar = new a(serializedSubscriber, serialized, bVar);
            bVar.f75269s0 = aVar;
            subscriber.onSubscribe(aVar);
            publisher.subscribe(bVar);
            bVar.onNext(0);
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
