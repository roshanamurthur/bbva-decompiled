package io.reactivex.internal.operators.maybe;

import io.reactivex.Flowable;
import io.reactivex.MaybeObserver;
import io.reactivex.MaybeSource;
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
public final class MaybeFlatMapIterableFlowable<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final MaybeSource<T> f71631q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Iterable<? extends R>> f71632r0;

    public static final class a<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f71633p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Iterable<? extends R>> f71634q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f71635r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f71636s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile Iterator<? extends R> f71637t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public volatile boolean f71638u0;
        public boolean v0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.f71633p0 = subscriber;
            this.f71634q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f71638u0 = true;
            this.f71636s0.dispose();
            this.f71636s0 = DisposableHelper.DISPOSED;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f71637t0 = null;
        }

        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f71633p0;
            Iterator<? extends R> it = this.f71637t0;
            if (this.v0 && it != null) {
                subscriber.onNext(null);
                subscriber.onComplete();
                return;
            }
            int iAddAndGet = 1;
            while (true) {
                if (it != null) {
                    long j10 = this.f71635r0.get();
                    if (j10 == Long.MAX_VALUE) {
                        while (!this.f71638u0) {
                            try {
                                subscriber.onNext(it.next());
                                if (this.f71638u0) {
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
                        if (this.f71638u0) {
                            return;
                        }
                        try {
                            subscriber.onNext((Object) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value"));
                            if (this.f71638u0) {
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
                        BackpressureHelper.produced(this.f71635r0, j11);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                if (it == null) {
                    it = this.f71637t0;
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f71637t0 == null;
        }

        @Override // io.reactivex.MaybeObserver
        public final void onComplete() {
            this.f71633p0.onComplete();
        }

        @Override // io.reactivex.MaybeObserver
        public final void onError(Throwable th2) {
            this.f71636s0 = DisposableHelper.DISPOSED;
            this.f71633p0.onError(th2);
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.f71636s0, disposable)) {
                this.f71636s0 = disposable;
                this.f71633p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.MaybeObserver
        public final void onSuccess(T t10) {
            try {
                Iterator<? extends R> it = this.f71634q0.apply(t10).iterator();
                if (!it.hasNext()) {
                    this.f71633p0.onComplete();
                } else {
                    this.f71637t0 = it;
                    drain();
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f71633p0.onError(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Exception {
            Iterator<? extends R> it = this.f71637t0;
            if (it == null) {
                return null;
            }
            R r3 = (R) ObjectHelper.requireNonNull(it.next(), "The iterator returned a null value");
            if (!it.hasNext()) {
                this.f71637t0 = null;
            }
            return r3;
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f71635r0, j10);
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

    public MaybeFlatMapIterableFlowable(MaybeSource<T> maybeSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        this.f71631q0 = maybeSource;
        this.f71632r0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        this.f71631q0.subscribe(new a(subscriber, this.f71632r0));
    }
}
