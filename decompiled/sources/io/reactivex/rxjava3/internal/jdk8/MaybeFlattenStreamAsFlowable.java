package io.reactivex.rxjava3.internal.jdk8;

import androidx.appcompat.app.r;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Stream;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class MaybeFlattenStreamAsFlowable<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Maybe<T> f74058q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, ? extends Stream<? extends R>> f74059r0;

    public static final class a<T, R> extends BasicIntQueueSubscription<R> implements MaybeObserver<T>, SingleObserver<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74060p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, ? extends Stream<? extends R>> f74061q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final AtomicLong f74062r0 = new AtomicLong();

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Disposable f74063s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public volatile Iterator<? extends R> f74064t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public AutoCloseable f74065u0;
        public boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f74066w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public boolean f74067x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public long f74068y0;

        public a(Subscriber<? super R> subscriber, Function<? super T, ? extends Stream<? extends R>> function) {
            this.f74060p0 = subscriber;
            this.f74061q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74066w0 = true;
            this.f74063s0.dispose();
            if (this.f74067x0) {
                return;
            }
            drain();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74064t0 = null;
            AutoCloseable autoCloseable = this.f74065u0;
            this.f74065u0 = null;
            if (autoCloseable != null) {
                try {
                    autoCloseable.close();
                } catch (Throwable th2) {
                    Exceptions.throwIfFatal(th2);
                    RxJavaPlugins.onError(th2);
                }
            }
        }

        public final void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            Subscriber<? super R> subscriber = this.f74060p0;
            long j10 = this.f74068y0;
            long j11 = this.f74062r0.get();
            Iterator<? extends R> it = this.f74064t0;
            int iAddAndGet = 1;
            while (true) {
                if (this.f74066w0) {
                    clear();
                } else if (this.f74067x0) {
                    if (it != null) {
                        subscriber.onNext(null);
                        subscriber.onComplete();
                    }
                } else if (it != null && j10 != j11) {
                    try {
                        R next = it.next();
                        if (!this.f74066w0) {
                            subscriber.onNext(next);
                            j10++;
                            if (!this.f74066w0) {
                                try {
                                    boolean zHasNext = it.hasNext();
                                    if (!this.f74066w0 && !zHasNext) {
                                        subscriber.onComplete();
                                        this.f74066w0 = true;
                                    }
                                } catch (Throwable th2) {
                                    Exceptions.throwIfFatal(th2);
                                    subscriber.onError(th2);
                                    this.f74066w0 = true;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        Exceptions.throwIfFatal(th3);
                        subscriber.onError(th3);
                        this.f74066w0 = true;
                    }
                }
                this.f74068y0 = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
                j11 = this.f74062r0.get();
                if (it == null) {
                    it = this.f74064t0;
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            Iterator<? extends R> it = this.f74064t0;
            if (it == null) {
                return true;
            }
            if (!this.v0 || it.hasNext()) {
                return false;
            }
            clear();
            return true;
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onComplete() {
            this.f74060p0.onComplete();
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onError(@NonNull Throwable th2) {
            this.f74060p0.onError(th2);
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver, io.reactivex.rxjava3.core.CompletableObserver
        public final void onSubscribe(@NonNull Disposable disposable) {
            if (DisposableHelper.validate(this.f74063s0, disposable)) {
                this.f74063s0 = disposable;
                this.f74060p0.onSubscribe(this);
            }
        }

        @Override // io.reactivex.rxjava3.core.MaybeObserver, io.reactivex.rxjava3.core.SingleObserver
        public final void onSuccess(@NonNull T t10) {
            try {
                Stream<? extends R> streamApply = this.f74061q0.apply(t10);
                Objects.requireNonNull(streamApply, "The mapper returned a null Stream");
                Stream streamC = r.c(streamApply);
                Iterator<? extends R> it = streamC.iterator();
                if (it.hasNext()) {
                    this.f74064t0 = it;
                    this.f74065u0 = streamC;
                    drain();
                } else {
                    this.f74060p0.onComplete();
                    try {
                        streamC.close();
                    } catch (Throwable th2) {
                        Exceptions.throwIfFatal(th2);
                        RxJavaPlugins.onError(th2);
                    }
                }
            } catch (Throwable th3) {
                Exceptions.throwIfFatal(th3);
                this.f74060p0.onError(th3);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final R poll() throws Throwable {
            Iterator<? extends R> it = this.f74064t0;
            if (it == null) {
                return null;
            }
            if (!this.v0) {
                this.v0 = true;
            } else if (!it.hasNext()) {
                clear();
                return null;
            }
            return it.next();
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            if (SubscriptionHelper.validate(j10)) {
                BackpressureHelper.add(this.f74062r0, j10);
                drain();
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f74067x0 = true;
            return 2;
        }
    }

    public MaybeFlattenStreamAsFlowable(Maybe<T> maybe, Function<? super T, ? extends Stream<? extends R>> function) {
        this.f74058q0 = maybe;
        this.f74059r0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(@NonNull Subscriber<? super R> subscriber) {
        this.f74058q0.subscribe(new a(subscriber, this.f74059r0));
    }
}
