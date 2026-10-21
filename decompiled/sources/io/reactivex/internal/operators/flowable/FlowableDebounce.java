package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDebounce<T, U> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<U>> f70429q0;

    public static final class a<T, U> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70430p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<U>> f70431q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f70432r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f70433s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile long f70434t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f70435u0;

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableDebounce$a$a, reason: collision with other inner class name */
        public static final class C0302a<T, U> extends DisposableSubscriber<U> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<T, U> f70436q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final long f70437r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final T f70438s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public boolean f70439t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final AtomicBoolean f70440u0 = new AtomicBoolean();

            public C0302a(a<T, U> aVar, long j10, T t10) {
                this.f70436q0 = aVar;
                this.f70437r0 = j10;
                this.f70438s0 = t10;
            }

            public final void a() {
                if (this.f70440u0.compareAndSet(false, true)) {
                    a<T, U> aVar = this.f70436q0;
                    long j10 = this.f70437r0;
                    T t10 = this.f70438s0;
                    if (j10 == aVar.f70434t0) {
                        if (aVar.get() != 0) {
                            aVar.f70430p0.onNext(t10);
                            BackpressureHelper.produced(aVar, 1L);
                        } else {
                            aVar.cancel();
                            aVar.f70430p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                        }
                    }
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (this.f70439t0) {
                    return;
                }
                this.f70439t0 = true;
                a();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                if (this.f70439t0) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f70439t0 = true;
                    this.f70436q0.onError(th2);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(U u2) {
                if (this.f70439t0) {
                    return;
                }
                this.f70439t0 = true;
                cancel();
                a();
            }
        }

        public a(SerializedSubscriber serializedSubscriber, Function function) {
            this.f70430p0 = serializedSubscriber;
            this.f70431q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70432r0.cancel();
            DisposableHelper.dispose(this.f70433s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70435u0) {
                return;
            }
            this.f70435u0 = true;
            AtomicReference<Disposable> atomicReference = this.f70433s0;
            Disposable disposable = atomicReference.get();
            if (DisposableHelper.isDisposed(disposable)) {
                return;
            }
            C0302a c0302a = (C0302a) disposable;
            if (c0302a != null) {
                c0302a.a();
            }
            DisposableHelper.dispose(atomicReference);
            this.f70430p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f70433s0);
            this.f70430p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70435u0) {
                return;
            }
            long j10 = this.f70434t0 + 1;
            this.f70434t0 = j10;
            Disposable disposable = this.f70433s0.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f70431q0.apply(t10), "The publisher supplied is null");
                C0302a c0302a = new C0302a(this, j10, t10);
                AtomicReference<Disposable> atomicReference = this.f70433s0;
                while (!atomicReference.compareAndSet(disposable, c0302a)) {
                    if (atomicReference.get() != disposable) {
                        return;
                    }
                }
                publisher.subscribe(c0302a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.f70430p0.onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70432r0, subscription)) {
                this.f70432r0 = subscription;
                this.f70430p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this, j10);
            }
        }
    }

    public FlowableDebounce(Flowable<T> flowable, Function<? super T, ? extends Publisher<U>> function) {
        super(flowable);
        this.f70429q0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(new SerializedSubscriber(subscriber), this.f70429q0));
    }
}
