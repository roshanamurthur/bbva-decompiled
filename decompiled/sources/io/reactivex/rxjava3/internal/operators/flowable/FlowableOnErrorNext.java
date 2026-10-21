package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnErrorNext<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends Publisher<? extends T>> f75167q0;

    public static final class a<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public boolean E0;
        public long F0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Subscriber<? super T> f75168w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends Publisher<? extends T>> f75169x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public boolean f75170y0;

        public a(Subscriber<? super T> subscriber, Function<? super Throwable, ? extends Publisher<? extends T>> function) {
            super(false);
            this.f75168w0 = subscriber;
            this.f75169x0 = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.E0) {
                return;
            }
            this.E0 = true;
            this.f75170y0 = true;
            this.f75168w0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            boolean z10 = this.f75170y0;
            Subscriber<? super T> subscriber = this.f75168w0;
            if (z10) {
                if (this.E0) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    subscriber.onError(th2);
                    return;
                }
            }
            this.f75170y0 = true;
            try {
                Publisher<? extends T> publisherApply = this.f75169x0.apply(th2);
                Objects.requireNonNull(publisherApply, "The nextSupplier returned a null Publisher");
                Publisher<? extends T> publisher = publisherApply;
                long j10 = this.F0;
                if (j10 != 0) {
                    produced(j10);
                }
                publisher.subscribe(this);
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                subscriber.onError(new CompositeException(th2, th3));
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.E0) {
                return;
            }
            if (!this.f75170y0) {
                this.F0++;
            }
            this.f75168w0.onNext(t10);
        }
    }

    public FlowableOnErrorNext(Flowable<T> flowable, Function<? super Throwable, ? extends Publisher<? extends T>> function) {
        super(flowable);
        this.f75167q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.f75167q0);
        subscriber.onSubscribe(aVar);
        this.source.subscribe((FlowableSubscriber) aVar);
    }
}
