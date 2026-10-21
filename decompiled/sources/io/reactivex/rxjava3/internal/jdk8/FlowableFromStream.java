package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.fuseable.QueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromStream<T> extends Flowable<T> {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f74042r0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Stream<T> f74043q0;

    public static abstract class a<T> extends AtomicLong implements QueueSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Iterator<T> f74044p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public AutoCloseable f74045q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f74046r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74047s0;

        public a(Iterator<T> it, AutoCloseable autoCloseable) {
            this.f74044p0 = it;
            this.f74045q0 = autoCloseable;
        }

        public abstract void a(long j10);

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74046r0 = true;
            request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74044p0 = null;
            AutoCloseable autoCloseable = this.f74045q0;
            this.f74045q0 = null;
            if (autoCloseable != null) {
                int i10 = FlowableFromStream.f74042r0;
                try {
                    autoCloseable.close();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<T> it = this.f74044p0;
            if (it == null) {
                return true;
            }
            if (!this.f74047s0 || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(@NonNull T t10) {
            throw new UnsupportedOperationException();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            Iterator<T> it = this.f74044p0;
            if (it == null) {
                return null;
            }
            if (!this.f74047s0) {
                this.f74047s0 = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            T next = this.f74044p0.next();
            Objects.requireNonNull(next, "The Stream's Iterator.next() returned a null value");
            return next;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10) && BackpressureHelper.add(this, j10) == 0) {
                a(j10);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 1) == 0) {
                return 0;
            }
            lazySet(Long.MAX_VALUE);
            return 1;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean offer(@NonNull T t10, @NonNull T t11) {
            throw new UnsupportedOperationException();
        }
    }

    public static final class b<T> extends a<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f74048t0;

        public b(ConditionalSubscriber<? super T> conditionalSubscriber, Iterator<T> it, AutoCloseable autoCloseable) {
            super(it, autoCloseable);
            this.f74048t0 = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.jdk8.FlowableFromStream.a
        public final void a(long j10) {
            Iterator<T> it = this.f74044p0;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f74048t0;
            long j11 = 0;
            while (!this.f74046r0) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    if (conditionalSubscriber.tryOnNext(next)) {
                        j11++;
                    }
                    if (this.f74046r0) {
                        continue;
                    } else {
                        try {
                            if (!it.hasNext()) {
                                conditionalSubscriber.onComplete();
                                this.f74046r0 = true;
                            } else if (j11 != j10) {
                                continue;
                            } else {
                                j10 = get();
                                if (j11 != j10) {
                                    continue;
                                } else if (compareAndSet(j10, 0L)) {
                                    return;
                                } else {
                                    j10 = get();
                                }
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            conditionalSubscriber.onError(th2);
                            this.f74046r0 = true;
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    conditionalSubscriber.onError(th3);
                    this.f74046r0 = true;
                }
            }
            clear();
        }
    }

    public static final class c<T> extends a<T> {

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final Subscriber<? super T> f74049t0;

        public c(Subscriber<? super T> subscriber, Iterator<T> it, AutoCloseable autoCloseable) {
            super(it, autoCloseable);
            this.f74049t0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.internal.jdk8.FlowableFromStream.a
        public final void a(long j10) {
            Iterator<T> it = this.f74044p0;
            Subscriber<? super T> subscriber = this.f74049t0;
            long j11 = 0;
            while (!this.f74046r0) {
                try {
                    T next = it.next();
                    Objects.requireNonNull(next, "The Stream's Iterator returned a null value");
                    subscriber.onNext(next);
                    if (this.f74046r0) {
                        continue;
                    } else {
                        try {
                            if (it.hasNext()) {
                                j11++;
                                if (j11 != j10) {
                                    continue;
                                } else {
                                    j10 = get();
                                    if (j11 != j10) {
                                        continue;
                                    } else if (compareAndSet(j10, 0L)) {
                                        return;
                                    } else {
                                        j10 = get();
                                    }
                                }
                            } else {
                                subscriber.onComplete();
                                this.f74046r0 = true;
                            }
                        } catch (Throwable th2) {
                            Exceptions.throwIfFatal(th2);
                            subscriber.onError(th2);
                            this.f74046r0 = true;
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    subscriber.onError(th3);
                    this.f74046r0 = true;
                }
            }
            clear();
        }
    }

    public FlowableFromStream(Stream<T> stream) {
        this.f74043q0 = stream;
    }

    public static <T> void subscribeStream(Subscriber<? super T> subscriber, Stream<T> stream) {
        try {
            Iterator it = stream.iterator();
            if (it.hasNext()) {
                if (subscriber instanceof ConditionalSubscriber) {
                    subscriber.onSubscribe(new b((ConditionalSubscriber) subscriber, it, stream));
                    return;
                } else {
                    subscriber.onSubscribe(new c(subscriber, it, stream));
                    return;
                }
            }
            EmptySubscription.complete(subscriber);
            try {
                stream.close();
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                RxJavaPlugins.onError(th2);
            }
        } catch (Throwable th3) {
            Exceptions.throwIfFatal(th3);
            EmptySubscription.error(th3, subscriber);
            try {
                stream.close();
            } catch (Throwable th4) {
                Exceptions.throwIfFatal(th4);
                RxJavaPlugins.onError(th4);
            }
        }
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        subscribeStream(subscriber, this.f74043q0);
    }
}
