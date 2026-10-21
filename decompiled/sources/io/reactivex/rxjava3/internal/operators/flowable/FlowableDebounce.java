package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDebounce<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends Publisher<U>> f74694q0;

    public static final class a<T, U> extends AtomicLong implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74695p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Publisher<U>> f74696q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74697r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final AtomicReference<Disposable> f74698s0 = new AtomicReference<>();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile long f74699t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f74700u0;

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableDebounce$a$a, reason: collision with other inner class name */
        public static final class C0366a<T, U> extends DisposableSubscriber<U> {

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final a<T, U> f74701q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final long f74702r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final T f74703s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public boolean f74704t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final AtomicBoolean f74705u0 = new AtomicBoolean();

            public C0366a(a<T, U> aVar, long j10, T t10) {
                this.f74701q0 = aVar;
                this.f74702r0 = j10;
                this.f74703s0 = t10;
            }

            public final void a() {
                if (this.f74705u0.compareAndSet(false, true)) {
                    a<T, U> aVar = this.f74701q0;
                    long j10 = this.f74702r0;
                    T t10 = this.f74703s0;
                    if (j10 == aVar.f74699t0) {
                        if (aVar.get() != 0) {
                            aVar.f74695p0.onNext(t10);
                            BackpressureHelper.produced(aVar, 1L);
                        } else {
                            aVar.cancel();
                            aVar.f74695p0.onError(new MissingBackpressureException("Could not deliver value due to lack of requests"));
                        }
                    }
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onComplete() {
                if (this.f74704t0) {
                    return;
                }
                this.f74704t0 = true;
                a();
            }

            @Override // org.reactivestreams.Subscriber
            public final void onError(Throwable th2) {
                if (this.f74704t0) {
                    RxJavaPlugins.onError(th2);
                } else {
                    this.f74704t0 = true;
                    this.f74701q0.onError(th2);
                }
            }

            @Override // org.reactivestreams.Subscriber
            public final void onNext(U u2) {
                if (this.f74704t0) {
                    return;
                }
                this.f74704t0 = true;
                cancel();
                a();
            }
        }

        public a(SerializedSubscriber serializedSubscriber, Function function) {
            this.f74695p0 = serializedSubscriber;
            this.f74696q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74697r0.cancel();
            DisposableHelper.dispose(this.f74698s0);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74700u0) {
                return;
            }
            this.f74700u0 = true;
            AtomicReference<Disposable> atomicReference = this.f74698s0;
            Disposable disposable = atomicReference.get();
            if (DisposableHelper.isDisposed(disposable)) {
                return;
            }
            C0366a c0366a = (C0366a) disposable;
            if (c0366a != null) {
                c0366a.a();
            }
            DisposableHelper.dispose(atomicReference);
            this.f74695p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            DisposableHelper.dispose(this.f74698s0);
            this.f74695p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f74700u0) {
                return;
            }
            long j10 = this.f74699t0 + 1;
            this.f74699t0 = j10;
            Disposable disposable = this.f74698s0.get();
            if (disposable != null) {
                disposable.dispose();
            }
            try {
                Publisher<U> publisherApply = this.f74696q0.apply(t10);
                Objects.requireNonNull(publisherApply, "The publisher supplied is null");
                Publisher<U> publisher = publisherApply;
                C0366a c0366a = new C0366a(this, j10, t10);
                AtomicReference<Disposable> atomicReference = this.f74698s0;
                while (!atomicReference.compareAndSet(disposable, c0366a)) {
                    if (atomicReference.get() != disposable) {
                        return;
                    }
                }
                publisher.subscribe(c0366a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                this.f74695p0.onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74697r0, subscription)) {
                this.f74697r0 = subscription;
                this.f74695p0.onSubscribe(this);
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
        this.f74694q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(new SerializedSubscriber(subscriber), this.f74694q0));
    }
}
