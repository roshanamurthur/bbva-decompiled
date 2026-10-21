package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFromArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T[] f70647q0;

    public static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f70648s0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.f70648s0 = conditionalSubscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public final void a() {
            T[] tArr = this.f70650p0;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f70648s0;
            for (int i10 = this.f70651q0; i10 != length; i10++) {
                if (this.f70652r0) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    conditionalSubscriber.onError(new NullPointerException(androidx.camera.core.impl.utils.b.a("The element at index ", i10, " is null")));
                    return;
                }
                conditionalSubscriber.tryOnNext(t10);
            }
            if (this.f70652r0) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public final void e(long j10) {
            T[] tArr = this.f70650p0;
            int length = tArr.length;
            int i10 = this.f70651q0;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f70648s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f70652r0) {
                                return;
                            }
                            conditionalSubscriber.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f70652r0) {
                            return;
                        }
                        T t10 = tArr[i10];
                        if (t10 == null) {
                            conditionalSubscriber.onError(new NullPointerException(androidx.camera.core.impl.utils.b.a("The element at index ", i10, " is null")));
                            return;
                        } else {
                            if (conditionalSubscriber.tryOnNext(t10)) {
                                j11++;
                            }
                            i10++;
                        }
                    }
                }
                this.f70651q0 = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subscriber<? super T> f70649s0;

        public b(Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.f70649s0 = subscriber;
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public final void a() {
            T[] tArr = this.f70650p0;
            int length = tArr.length;
            Subscriber<? super T> subscriber = this.f70649s0;
            for (int i10 = this.f70651q0; i10 != length; i10++) {
                if (this.f70652r0) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    subscriber.onError(new NullPointerException(androidx.camera.core.impl.utils.b.a("The element at index ", i10, " is null")));
                    return;
                }
                subscriber.onNext(t10);
            }
            if (this.f70652r0) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableFromArray.c
        public final void e(long j10) {
            T[] tArr = this.f70650p0;
            int length = tArr.length;
            int i10 = this.f70651q0;
            Subscriber<? super T> subscriber = this.f70649s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f70652r0) {
                                return;
                            }
                            subscriber.onComplete();
                            return;
                        } else {
                            j10 = get();
                            if (j11 == j10) {
                                break;
                            }
                        }
                    } else {
                        if (this.f70652r0) {
                            return;
                        }
                        T t10 = tArr[i10];
                        if (t10 == null) {
                            subscriber.onError(new NullPointerException(androidx.camera.core.impl.utils.b.a("The element at index ", i10, " is null")));
                            return;
                        } else {
                            subscriber.onNext(t10);
                            j11++;
                            i10++;
                        }
                    }
                }
                this.f70651q0 = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static abstract class c<T> extends BasicQueueSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T[] f70650p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f70651q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f70652r0;

        public c(T[] tArr) {
            this.f70650p0 = tArr;
        }

        public abstract void a();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70652r0 = true;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70651q0 = this.f70650p0.length;
        }

        public abstract void e(long j10);

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f70651q0 == this.f70650p0.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i10 = this.f70651q0;
            T[] tArr = this.f70650p0;
            if (i10 == tArr.length) {
                return null;
            }
            this.f70651q0 = i10 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i10], "array element is null");
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

    public FlowableFromArray(T[] tArr) {
        this.f70647q0 = tArr;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        T[] tArr = this.f70647q0;
        if (z10) {
            subscriber.onSubscribe(new a((ConditionalSubscriber) subscriber, tArr));
        } else {
            subscriber.onSubscribe(new b(subscriber, tArr));
        }
    }
}
