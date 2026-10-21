package io.reactivex.rxjava3.internal.operators.flowable;

import a.d;
import io.reactivex.rxjava3.core.BackpressureOverflowStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableOnBackpressureBufferStrategy<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f75136q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Action f75137r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final BackpressureOverflowStrategy f75138s0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75139a;

        static {
            int[] iArr = new int[BackpressureOverflowStrategy.values().length];
            f75139a = iArr;
            try {
                iArr[BackpressureOverflowStrategy.DROP_LATEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f75139a[BackpressureOverflowStrategy.DROP_OLDEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final class b<T> extends AtomicInteger implements FlowableSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f75140p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Action f75141q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final BackpressureOverflowStrategy f75142r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final long f75143s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final AtomicLong f75144t0 = new AtomicLong();

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final ArrayDeque f75145u0 = new ArrayDeque();
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f75146w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public volatile boolean f75147x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public Throwable f75148y0;

        public b(Subscriber<? super T> subscriber, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy, long j10) {
            this.f75140p0 = subscriber;
            this.f75141q0 = action;
            this.f75142r0 = backpressureOverflowStrategy;
            this.f75143s0 = j10;
        }

        public final void a(ArrayDeque arrayDeque) {
            synchronized (arrayDeque) {
                arrayDeque.clear();
            }
        }

        public final void b() {
            boolean zIsEmpty;
            d dVar;
            if (getAndIncrement() != 0) {
                return;
            }
            ArrayDeque arrayDeque = this.f75145u0;
            Subscriber<? super T> subscriber = this.f75140p0;
            int iAddAndGet = 1;
            do {
                long j10 = this.f75144t0.get();
                long j11 = 0;
                while (j11 != j10) {
                    if (this.f75146w0) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z10 = this.f75147x0;
                    synchronized (arrayDeque) {
                        dVar = (Object) arrayDeque.poll();
                    }
                    boolean z11 = dVar == null;
                    if (z10) {
                        Throwable th2 = this.f75148y0;
                        if (th2 != null) {
                            a(arrayDeque);
                            subscriber.onError(th2);
                            return;
                        } else if (z11) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                    if (z11) {
                        break;
                    }
                    subscriber.onNext(dVar);
                    j11++;
                }
                if (j11 == j10) {
                    if (this.f75146w0) {
                        a(arrayDeque);
                        return;
                    }
                    boolean z12 = this.f75147x0;
                    synchronized (arrayDeque) {
                        zIsEmpty = arrayDeque.isEmpty();
                    }
                    if (z12) {
                        Throwable th3 = this.f75148y0;
                        if (th3 != null) {
                            a(arrayDeque);
                            subscriber.onError(th3);
                            return;
                        } else if (zIsEmpty) {
                            subscriber.onComplete();
                            return;
                        }
                    }
                }
                if (j11 != 0) {
                    BackpressureHelper.produced(this.f75144t0, j11);
                }
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f75146w0 = true;
            this.v0.cancel();
            if (getAndIncrement() == 0) {
                a(this.f75145u0);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            this.f75147x0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75147x0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f75148y0 = th2;
            this.f75147x0 = true;
            b();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            boolean z10;
            boolean z11;
            if (this.f75147x0) {
                return;
            }
            ArrayDeque arrayDeque = this.f75145u0;
            synchronized (arrayDeque) {
                try {
                    z10 = false;
                    if (arrayDeque.size() == this.f75143s0) {
                        int i10 = a.f75139a[this.f75142r0.ordinal()];
                        z11 = true;
                        if (i10 == 1) {
                            arrayDeque.pollLast();
                            arrayDeque.offer(t10);
                        } else if (i10 == 2) {
                            arrayDeque.poll();
                            arrayDeque.offer(t10);
                        }
                        z11 = false;
                        z10 = true;
                    } else {
                        arrayDeque.offer(t10);
                        z11 = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (!z10) {
                if (!z11) {
                    b();
                    return;
                } else {
                    this.v0.cancel();
                    onError(new MissingBackpressureException());
                    return;
                }
            }
            Action action = this.f75141q0;
            if (action != null) {
                try {
                    action.run();
                } catch (Throwable th3) {
                    Exceptions.throwIfFatal(th3);
                    this.v0.cancel();
                    onError(th3);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f75140p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f75144t0, j10);
                b();
            }
        }
    }

    public FlowableOnBackpressureBufferStrategy(Flowable<T> flowable, long j10, Action action, BackpressureOverflowStrategy backpressureOverflowStrategy) {
        super(flowable);
        this.f75136q0 = j10;
        this.f75137r0 = action;
        this.f75138s0 = backpressureOverflowStrategy;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new b(subscriber, this.f75137r0, this.f75138s0, this.f75136q0));
    }
}
