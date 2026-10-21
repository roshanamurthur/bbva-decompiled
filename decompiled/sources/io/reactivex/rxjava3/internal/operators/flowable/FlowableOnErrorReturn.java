package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnErrorReturn<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends T> f75171q0;

    public static final class a<T> extends SinglePostCompleteSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends T> f75172p0;

        public a(Subscriber<? super T> subscriber, Function<? super Throwable, ? extends T> function) {
            super(subscriber);
            this.f75172p0 = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.downstream.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            try {
                T tApply = this.f75172p0.apply(th2);
                Objects.requireNonNull(tApply, "The valueSupplier returned a null value");
                complete(tApply);
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
        this.f75171q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75171q0));
    }
}
