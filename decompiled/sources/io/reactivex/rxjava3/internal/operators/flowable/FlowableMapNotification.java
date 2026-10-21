package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscribers.SinglePostCompleteSubscriber;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMapNotification<T, R> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends R> f75073q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends R> f75074r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Supplier<? extends R> f75075s0;

    public static final class a<T, R> extends SinglePostCompleteSubscriber<T, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends R> f75076p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends R> f75077q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Supplier<? extends R> f75078r0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends R> function, Function<? super Throwable, ? extends R> function2, Supplier<? extends R> supplier) {
            super(subscriber);
            this.f75076p0 = function;
            this.f75077q0 = function2;
            this.f75078r0 = supplier;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            try {
                R r3 = this.f75078r0.get();
                Objects.requireNonNull(r3, "The onComplete publisher returned is null");
                complete(r3);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            try {
                R rApply = this.f75077q0.apply(th2);
                Objects.requireNonNull(rApply, "The onError publisher returned is null");
                complete(rApply);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.downstream.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                R rApply = this.f75076p0.apply(t10);
                Objects.requireNonNull(rApply, "The onNext publisher returned is null");
                this.produced++;
                this.downstream.onNext(rApply);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(th2);
            }
        }
    }

    public FlowableMapNotification(Flowable<T> flowable, Function<? super T, ? extends R> function, Function<? super Throwable, ? extends R> function2, Supplier<? extends R> supplier) {
        super(flowable);
        this.f75073q0 = function;
        this.f75074r0 = function2;
        this.f75075s0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f75073q0, this.f75074r0, this.f75075s0));
    }
}
