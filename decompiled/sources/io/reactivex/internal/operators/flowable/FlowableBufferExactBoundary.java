package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.MpscLinkedQueue;
import io.reactivex.internal.subscribers.QueueDrainSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.subscribers.DisposableSubscriber;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableBufferExactBoundary<T, U extends Collection<? super T>, B> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Publisher<B> f70266q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Callable<U> f70267r0;

    public static final class a<T, U extends Collection<? super T>, B> extends DisposableSubscriber<B> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final b<T, U, B> f70268q0;

        public a(b<T, U, B> bVar) {
            this.f70268q0 = bVar;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f70268q0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70268q0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(B b10) {
            this.f70268q0.a();
        }
    }

    public static final class b<T, U extends Collection<? super T>, B> extends QueueDrainSubscriber<T, U, U> implements Subscription, Disposable {

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Callable<U> f70269r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Publisher<B> f70270s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Subscription f70271t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public a f70272u0;
        public U v0;

        public b(SerializedSubscriber serializedSubscriber, Callable callable, Publisher publisher) {
            super(serializedSubscriber, new MpscLinkedQueue());
            this.f70269r0 = callable;
            this.f70270s0 = publisher;
        }

        public final void a() {
            try {
                U u2 = (U) ObjectHelper.requireNonNull(this.f70269r0.call(), "The buffer supplied is null");
                synchronized (this) {
                    try {
                        U u3 = this.v0;
                        if (u3 == null) {
                            return;
                        }
                        this.v0 = u2;
                        fastPathEmitMax(u3, false, this);
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
            this.f70272u0.dispose();
            this.f70271t0.cancel();
            if (enter()) {
                this.queue.clear();
            }
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            cancel();
        }

        @Override // io.reactivex.disposables.Disposable
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70271t0, subscription)) {
                this.f70271t0 = subscription;
                try {
                    this.v0 = (U) ObjectHelper.requireNonNull(this.f70269r0.call(), "The buffer supplied is null");
                    a aVar = new a(this);
                    this.f70272u0 = aVar;
                    this.downstream.onSubscribe(this);
                    if (this.cancelled) {
                        return;
                    }
                    subscription.request(Long.MAX_VALUE);
                    this.f70270s0.subscribe(aVar);
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    this.cancelled = true;
                    subscription.cancel();
                    EmptySubscription.error(th2, this.downstream);
                }
            }
        }
    }

    public FlowableBufferExactBoundary(Flowable<T> flowable, Publisher<B> publisher, Callable<U> callable) {
        super(flowable);
        this.f70266q0 = publisher;
        this.f70267r0 = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(new SerializedSubscriber(subscriber), this.f70267r0, this.f70266q0));
    }
}
