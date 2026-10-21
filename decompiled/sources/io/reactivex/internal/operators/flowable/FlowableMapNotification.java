package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableMapNotification<T, R> extends io.reactivex.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends R> f70801q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends R> f70802r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Callable<? extends R> f70803s0;

    public static final class a<T, R> extends SinglePostCompleteSubscriber<T, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f70804p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends R> f70805q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Callable<? extends R> f70806r0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends R> function, Function<? super Throwable, ? extends R> function2, Callable<? extends R> callable) {
            super(subscriber);
            this.f70804p0 = function;
            this.f70805q0 = function2;
            this.f70806r0 = callable;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                complete(ObjectHelper.requireNonNull(this.f70806r0.call(), "The onComplete publisher returned is null"));
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            try {
                complete(ObjectHelper.requireNonNull(this.f70805q0.apply(th2), "The onError publisher returned is null"));
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                Object objRequireNonNull = ObjectHelper.requireNonNull(this.f70804p0.apply(t10), "The onNext publisher returned is null");
                this.produced++;
                this.downstream.onNext(objRequireNonNull);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }
    }

    public FlowableMapNotification(Flowable<T> flowable, Function<? super T, ? extends R> function, Function<? super Throwable, ? extends R> function2, Callable<? extends R> callable) {
        super(flowable);
        this.f70801q0 = function;
        this.f70802r0 = function2;
        this.f70803s0 = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70801q0, this.f70802r0, this.f70803s0));
    }
}
