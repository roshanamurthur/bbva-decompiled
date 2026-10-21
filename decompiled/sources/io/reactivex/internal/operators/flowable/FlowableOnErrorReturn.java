package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnErrorReturn<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends T> f70896q0;

    public static final class a<T> extends SinglePostCompleteSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends T> f70897p0;

        public a(Subscriber<? super T> subscriber, Function<? super Throwable, ? extends T> function) {
            super(subscriber);
            this.f70897p0 = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            try {
                complete(ObjectHelper.requireNonNull(this.f70897p0.apply(th2), "The valueSupplier returned a null value"));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.produced++;
            this.downstream.onNext((Object) t10);
        }
    }

    public FlowableOnErrorReturn(Flowable<T> flowable, Function<? super Throwable, ? extends T> function) {
        super(flowable);
        this.f70896q0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70896q0));
    }
}
