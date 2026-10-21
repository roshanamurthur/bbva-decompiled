package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableOnErrorNext<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super Throwable, ? extends Publisher<? extends T>> f70891q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final boolean f70892r0;

    public static final class a<T> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        public boolean E0;
        public boolean F0;
        public long G0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final Subscriber<? super T> f70893w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final Function<? super Throwable, ? extends Publisher<? extends T>> f70894x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final boolean f70895y0;

        public a(Subscriber<? super T> subscriber, Function<? super Throwable, ? extends Publisher<? extends T>> function, boolean z10) {
            super(false);
            this.f70893w0 = subscriber;
            this.f70894x0 = function;
            this.f70895y0 = z10;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.F0) {
                return;
            }
            this.F0 = true;
            this.E0 = true;
            this.f70893w0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            boolean z10 = this.E0;
            Subscriber<? super T> subscriber = this.f70893w0;
            if (z10) {
                if (this.F0) {
                    RxJavaPlugins.onError(th2);
                    return;
                } else {
                    subscriber.onError(th2);
                    return;
                }
            }
            this.E0 = true;
            if (this.f70895y0 && !(th2 instanceof Exception)) {
                subscriber.onError(th2);
                return;
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f70894x0.apply(th2), "The nextSupplier returned a null Publisher");
                long j10 = this.G0;
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
            if (this.F0) {
                return;
            }
            if (!this.E0) {
                this.G0++;
            }
            this.f70893w0.onNext(t10);
        }
    }

    public FlowableOnErrorNext(Flowable<T> flowable, Function<? super Throwable, ? extends Publisher<? extends T>> function, boolean z10) {
        super(flowable);
        this.f70891q0 = function;
        this.f70892r0 = z10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        a aVar = new a(subscriber, this.f70891q0, this.f70892r0);
        subscriber.onSubscribe(aVar);
        this.source.subscribe((FlowableSubscriber) aVar);
    }
}
