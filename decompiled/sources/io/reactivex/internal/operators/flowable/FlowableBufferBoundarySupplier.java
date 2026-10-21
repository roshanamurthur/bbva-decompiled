package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableBufferBoundarySupplier<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Callable<? extends Publisher<B>> f70258q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Callable<U> f70259r0;

    public static final class a<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U, B> f70260q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70261r0;

        public a(b<T, U, B> bVar) {
            this.f70260q0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70261r0) {
                return;
            }
            this.f70261r0 = true;
            this.f70260q0.a();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70261r0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70261r0 = true;
                this.f70260q0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b10) {
            if (this.f70261r0) {
                return;
            }
            this.f70261r0 = true;
            cancel();
            this.f70260q0.a();
        }
    }

    public static final class b<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements Subscription, Disposable {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Callable<U> f70262r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Callable<? extends Publisher<B>> f70263s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f70264t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final AtomicReference<Disposable> f70265u0;
        public U v0;

        public b(SerializedSubscriber serializedSubscriber, Callable callable, Callable callable2) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f70265u0 = new AtomicReference<>();
            this.f70262r0 = callable;
            this.f70263s0 = callable2;
        }

        public final void a() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.f70262r0.call(), "The buffer supplied is null");
                try {
                    Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f70263s0.call(), "The boundary publisher supplied is null");
                    a aVar = new a(this);
                    if (DisposableHelper.replace(this.f70265u0, aVar)) {
                        synchronized (this) {
                            try {
                                U u3 = this.v0;
                                if (u3 == null) {
                                    return;
                                }
                                this.v0 = u2;
                                publisher.subscribe(aVar);
                                fastPathEmitMax(u3, false, this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    this.f70264t0.cancel();
                    this.downstream.onError(th3);
                }
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                cancel();
                this.downstream.onError(th4);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.subscribers.QueueDrainSubscriber, io.reactivex.internal.util.QueueDrain
        public final boolean accept(Subscriber subscriber, Object obj) {
            this.downstream.onNext((Collection) obj);
            return true;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.f70264t0.cancel();
            DisposableHelper.dispose(this.f70265u0);
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70264t0.cancel();
            DisposableHelper.dispose(this.f70265u0);
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70265u0.get() == DisposableHelper.DISPOSED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            synchronized (this) {
                try {
                    U u2 = this.v0;
                    if (u2 == null) {
                        return;
                    }
                    this.v0 = null;
                    this.queue.offer(u2);
                    this.done = true;
                    if (enter()) {
                        QueueDrainHelper.drainMaxLoop(this.queue, this.downstream, false, this, this);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            cancel();
            this.downstream.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            synchronized (this) {
                try {
                    U u2 = this.v0;
                    if (u2 == null) {
                        return;
                    }
                    u2.add(t10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70264t0, subscription)) {
                this.f70264t0 = subscription;
                Subscriber<? super V> subscriber = this.downstream;
                try {
                    this.v0 = (U) ObjectHelper.requireNonNull(this.f70262r0.call(), "The buffer supplied is null");
                    try {
                        Publisher publisher = (Publisher) ObjectHelper.requireNonNull(this.f70263s0.call(), "The boundary publisher supplied is null");
                        a aVar = new a(this);
                        this.f70265u0.set(aVar);
                        subscriber.onSubscribe(this);
                        if (this.cancelled) {
                            return;
                        }
                        subscription.request(Long.MAX_VALUE);
                        publisher.subscribe(aVar);
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        this.cancelled = true;
                        subscription.cancel();
                        EmptySubscription.error(th2, subscriber);
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.cancelled = true;
                    subscription.cancel();
                    EmptySubscription.error(th3, subscriber);
                }
            }
        }
    }

    public FlowableBufferBoundarySupplier(Flowable<T> flowable, Callable<? extends Publisher<B>> callable, Callable<U> callable2) {
        super(flowable);
        this.f70258q0 = callable;
        this.f70259r0 = callable2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(new SerializedSubscriber(subscriber), this.f70259r0, this.f70258q0));
    }
}
