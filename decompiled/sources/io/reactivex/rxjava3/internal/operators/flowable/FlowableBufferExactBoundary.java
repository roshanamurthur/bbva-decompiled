package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.queue.MpscLinkedQueue;
import io.reactivex.rxjava3.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.QueueDrainHelper;
import io.reactivex.rxjava3.subscribers.DisposableSubscriber;
import io.reactivex.rxjava3.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<B> f74520q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Supplier<U> f74521r0;

    public static final class a<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U, B> f74522q0;

        public a(b<T, U, B> bVar) {
            this.f74522q0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f74522q0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f74522q0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b10) {
            this.f74522q0.a();
        }
    }

    public static final class b<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements Subscription, Disposable {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Supplier<U> f74523r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Publisher<B> f74524s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f74525t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public a f74526u0;
        public U v0;

        public b(SerializedSubscriber serializedSubscriber, Supplier supplier, Publisher publisher) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f74523r0 = supplier;
            this.f74524s0 = publisher;
        }

        public final void a() {
            try {
                U u2 = this.f74523r0.get();
                Objects.requireNonNull(u2, "The buffer supplied is null");
                U u3 = u2;
                synchronized (this) {
                    try {
                        U u6 = this.v0;
                        if (u6 == null) {
                            return;
                        }
                        this.v0 = u3;
                        fastPathEmitMax(u6, false, this);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                cancel();
                this.downstream.onError(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.subscribers.QueueDrainSubscriber, io.reactivex.rxjava3.internal.util.QueueDrain
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
            this.f74526u0.dispose();
            this.f74525t0.cancel();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            cancel();
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.cancelled;
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

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74525t0, subscription)) {
                this.f74525t0 = subscription;
                try {
                    U u2 = this.f74523r0.get();
                    Objects.requireNonNull(u2, "The buffer supplied is null");
                    this.v0 = u2;
                    a aVar = new a(this);
                    this.f74526u0 = aVar;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    this.f74524s0.subscribe(aVar);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    subscription.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }
    }

    public FlowableBufferExactBoundary(Flowable<T> flowable, Publisher<B> publisher, Supplier<U> supplier) {
        super(flowable);
        this.f74520q0 = publisher;
        this.f74521r0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(new SerializedSubscriber(subscriber), this.f74521r0, this.f74520q0));
    }
}
