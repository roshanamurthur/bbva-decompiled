package io.reactivex.internal.operators.single;

import io.reactivex.Flowable;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class SingleFlatMapIterableFlowable<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final SingleSource<T> f73489q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f73490r0;

    public static final class a<T, R> extends BasicIntQueueSubscription<R> implements SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f73491p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f73492q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f73493r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f73494s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile Iterator<? extends R> f73495t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f73496u0;
        public boolean v0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f73491p0 = subscriber;
            this.f73492q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f73496u0 = true;
            this.f73494s0.dispose();
            this.f73494s0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f73495t0 = null;
        }

        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f73491p0;
            Iterator<? extends R> it = this.f73495t0;
            if (this.v0 && it != null) {
                subscriber.onNext(null);
                subscriber.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j10 = this.f73493r0.get();
                    if (j10 == Long.MAX_VALUE) {
                        while (!this.f73496u0) {
                            try {
                                subscriber.onNext(it.next());
                                if (this.f73496u0) {
                                    return;
                                }
                                try {
                                    if (!it.hasNext()) {
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
                        return;
                    }
                    long j11 = 0;
                    while (j11 != j10) {
                        if (this.f73496u0) {
                            return;
                        }
                        try {
                            subscriber.onNext((Object) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.f73496u0) {
                                return;
                            }
                            j11++;
                            try {
                                if (!it.hasNext()) {
                                    subscriber.onComplete();
                                    return;
                                }
                            } catch (Throwable th4) {
                                Exceptions.throwIfFatal(th4);
                                subscriber.onError(th4);
                                return;
                            }
                        } catch (Throwable th5) {
                            Exceptions.throwIfFatal(th5);
                            subscriber.onError(th5);
                            return;
                        }
                    }
                    if (j11 != 0) {
                        BackpressureHelper.produced(this.f73493r0, j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f73495t0;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f73495t0 == null;
        }

        @Override // io.reactivex.SingleObserver
        public final void onError(Throwable th2) {
            this.f73494s0 = DisposableHelper.DISPOSED;
            this.f73491p0.onError(th2);
        }

        @Override // io.reactivex.SingleObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f73494s0, disposable)) {
                this.f73494s0 = disposable;
                this.f73491p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.SingleObserver
        public final void onSuccess(T t10) {
            try {
                Iterator<? extends R> it = this.f73492q0.apply(t10).iterator();
                if (!it.hasNext()) {
                    this.f73491p0.onComplete();
                } else {
                    this.f73495t0 = it;
                    drain();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f73491p0.onError(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Exception {
            Iterator<? extends R> it = this.f73495t0;
            if (it == null) {
                return null;
            }
            R r3 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f73495t0 = null;
            }
            return r3;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f73493r0, j10);
                drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.v0 = true;
            return 2;
        }
    }

    public SingleFlatMapIterableFlowable(SingleSource<T> singleSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f73489q0 = singleSource;
        this.f73490r0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f73489q0.subscribe(new a(subscriber, this.f73490r0));
    }
}
