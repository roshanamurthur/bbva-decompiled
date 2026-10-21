package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.BasicQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.BackpressureHelper;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFromArray<T> extends Flowable<T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final T[] f74918q0;

    public static final class a<T> extends c<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final ConditionalSubscriber<? super T> f74919s0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, T[] tArr) {
            super(tArr);
            this.f74919s0 = conditionalSubscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.c
        public final void a() {
            T[] tArr = this.f74921p0;
            int length = tArr.length;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f74919s0;
            for (int i10 = this.f74922q0; i10 != length; i10++) {
                if (this.f74923r0) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    conditionalSubscriber.onError(new NullPointerException(androidx.camera.core.impl.utils.b.a("The element at index ", i10, " is null")));
                    return;
                }
                conditionalSubscriber.tryOnNext(t10);
            }
            if (this.f74923r0) {
                return;
            }
            conditionalSubscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.c
        public final void e(long j10) {
            T[] tArr = this.f74921p0;
            int length = tArr.length;
            int i10 = this.f74922q0;
            ConditionalSubscriber<? super T> conditionalSubscriber = this.f74919s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f74923r0) {
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
                        if (this.f74923r0) {
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
                this.f74922q0 = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static final class b<T> extends c<T> {

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final Subscriber<? super T> f74920s0;

        public b(Subscriber<? super T> subscriber, T[] tArr) {
            super(tArr);
            this.f74920s0 = subscriber;
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.c
        public final void a() {
            T[] tArr = this.f74921p0;
            int length = tArr.length;
            Subscriber<? super T> subscriber = this.f74920s0;
            for (int i10 = this.f74922q0; i10 != length; i10++) {
                if (this.f74923r0) {
                    return;
                }
                T t10 = tArr[i10];
                if (t10 == null) {
                    subscriber.onError(new NullPointerException(androidx.camera.core.impl.utils.b.a("The element at index ", i10, " is null")));
                    return;
                }
                subscriber.onNext(t10);
            }
            if (this.f74923r0) {
                return;
            }
            subscriber.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.operators.flowable.FlowableFromArray.c
        public final void e(long j10) {
            T[] tArr = this.f74921p0;
            int length = tArr.length;
            int i10 = this.f74922q0;
            Subscriber<? super T> subscriber = this.f74920s0;
            do {
                long j11 = 0;
                while (true) {
                    if (j11 == j10 || i10 == length) {
                        if (i10 == length) {
                            if (this.f74923r0) {
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
                        if (this.f74923r0) {
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
                this.f74922q0 = i10;
                j10 = addAndGet(-j11);
            } while (j10 != 0);
        }
    }

    public static abstract class c<T> extends BasicQueueSubscription<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final T[] f74921p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f74922q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public volatile boolean f74923r0;

        public c(T[] tArr) {
            this.f74921p0 = tArr;
        }

        public abstract void a();

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74923r0 = true;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74922q0 = this.f74921p0.length;
        }

        public abstract void e(long j10);

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return this.f74922q0 == this.f74921p0.length;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            int i10 = this.f74922q0;
            T[] tArr = this.f74921p0;
            if (i10 == tArr.length) {
                return null;
            }
            this.f74922q0 = i10 + 1;
            T t10 = tArr[i10];
            Objects.requireNonNull(t10, "array element is null");
            return t10;
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

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 1;
        }
    }

    public FlowableFromArray(T[] tArr) {
        this.f74918q0 = tArr;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        T[] tArr = this.f74918q0;
        if (z10) {
            subscriber.onSubscribe(new a((ConditionalSubscriber) subscriber, tArr));
        } else {
            subscriber.onSubscribe(new b(subscriber, tArr));
        }
    }
}
