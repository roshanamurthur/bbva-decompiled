package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromIterable<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Iterable<? extends T> f70657q0;

    public static abstract class a<T> extends BasicQueueSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Iterator<? extends T> f70658p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public volatile boolean f70659q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f70660r0;

        public a(Iterator<? extends T> it) {
            this.f70658p0 = it;
        }

        public abstract void a();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70659q0 = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70658p0 = null;
        }

        public abstract void e(long j10);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends T> it = this.f70658p0;
            return it == null || !it.hasNext();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<? extends T> it = this.f70658p0;
            if (it == null) {
                return null;
            }
            if (!this.f70660r0) {
                this.f70660r0 = true;
            } else if (!it.hasNext()) {
                return null;
            }
            return (T) ObjectHelper.requireNonNull(this.f70658p0.next(), "Iterator.next() returned a null value");
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                if (j10 == Long.MAX_VALUE) {
                    a();
                } else {
                    e(j10);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    public static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f70661s0;

        public b(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<? extends T> it) {
            super(it);
            this.f70661s0 = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.a
        public final void a() {
            Iterator<? extends T> it = this.f70658p0;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f70661s0;
            while (!this.f70659q0) {
                try {
                    T next = it.next();
                    if (this.f70659q0) {
                        return;
                    }
                    if (next == null) {
                        conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    conditionalSubscriber.tryOnNext(next);
                    if (this.f70659q0) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f70659q0) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        conditionalSubscriber.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    conditionalSubscriber.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.a
        public final void e(long j10) {
            Iterator<? extends T> it = this.f70658p0;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f70661s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        j10 = get();
                        if (j11 == j10) {
                            break;
                        }
                    } else {
                        if (this.f70659q0) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f70659q0) {
                                return;
                            }
                            if (next == null) {
                                conditionalSubscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            boolean zTryOnNext = conditionalSubscriber.tryOnNext(next);
                            if (this.f70659q0) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f70659q0) {
                                        return;
                                    }
                                    conditionalSubscriber.onComplete();
                                    return;
                                } else if (zTryOnNext) {
                                    j11++;
                                }
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                conditionalSubscriber.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            conditionalSubscriber.onError(th3);
                            return;
                        }
                    }
                }
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subscriber<? super T> f70662s0;

        public c(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
            super(it);
            this.f70662s0 = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.a
        public final void a() {
            Iterator<? extends T> it = this.f70658p0;
            Subscriber<? super T> subscriber = this.f70662s0;
            while (!this.f70659q0) {
                try {
                    T next = it.next();
                    if (this.f70659q0) {
                        return;
                    }
                    if (next == null) {
                        subscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                        return;
                    }
                    subscriber.onNext(next);
                    if (this.f70659q0) {
                        return;
                    }
                    try {
                        if (!it.hasNext()) {
                            if (this.f70659q0) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        }
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        subscriber.onError(th2);
                        return;
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    subscriber.onError(th3);
                    return;
                }
            }
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromIterable.a
        public final void e(long j10) {
            Iterator<? extends T> it = this.f70658p0;
            Subscriber<? super T> subscriber = this.f70662s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        j10 = get();
                        if (j11 == j10) {
                            break;
                        }
                    } else {
                        if (this.f70659q0) {
                            return;
                        }
                        try {
                            T next = it.next();
                            if (this.f70659q0) {
                                return;
                            }
                            if (next == null) {
                                subscriber.onError(new NullPointerException("Iterator.next() returned a null value"));
                                return;
                            }
                            subscriber.onNext(next);
                            if (this.f70659q0) {
                                return;
                            }
                            try {
                                if (!it.hasNext()) {
                                    if (this.f70659q0) {
                                        return;
                                    }
                                    subscriber.onComplete();
                                    return;
                                }
                                j11++;
                            } catch (Throwable th2) {
                                Exceptions.throwIfFatal(th2);
                                subscriber.onError(th2);
                                return;
                            }
                        } catch (Throwable th3) {
                            Exceptions.throwIfFatal(th3);
                            subscriber.onError(th3);
                            return;
                        }
                    }
                }
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public FlowableFromIterable(Iterable<? extends T> iterable) {
        this.f70657q0 = iterable;
    }

    public static <T> void subscribe(Subscriber<? super T> subscriber, Iterator<? extends T> it) {
        try {
            if (!it.hasNext()) {
                EmptySubscription.complete(subscriber);
            } else if (subscriber instanceof ConditionalSubscriber) {
                subscriber.onSubscribe(new b((ConditionalSubscriber) subscriber, it));
            } else {
                subscriber.onSubscribe(new c(subscriber, it));
            }
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            subscribe(subscriber, this.f70657q0.iterator());
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
