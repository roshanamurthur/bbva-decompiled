package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.fuseable.QueueSubscription;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFilter<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Predicate<? super T> f70559q0;

    public static final class a<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f70560p0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, Predicate<? super T> predicate) {
            super(conditionalSubscriber);
            this.f70560p0 = predicate;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            QueueSubscription<T> queueSubscription = this.qs;
            while (true) {
                T tPoll = queueSubscription.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f70560p0.test(tPoll)) {
                    return tPoll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1L);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.downstream.tryOnNext(null);
            }
            try {
                return this.f70560p0.test(t10) && this.downstream.tryOnNext((Object) t10);
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public static final class b<T> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Predicate<? super T> f70561p0;

        public b(Subscriber<? super T> subscriber, Predicate<? super T> predicate) {
            super(subscriber);
            this.f70561p0 = predicate;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            QueueSubscription<T> queueSubscription = this.qs;
            while (true) {
                T tPoll = queueSubscription.poll();
                if (tPoll == null) {
                    return null;
                }
                if (this.f70561p0.test(tPoll)) {
                    return tPoll;
                }
                if (this.sourceMode == 2) {
                    queueSubscription.request(1L);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return true;
            }
            try {
                boolean zTest = this.f70561p0.test(t10);
                if (zTest) {
                    this.downstream.onNext((Object) t10);
                }
                return zTest;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public FlowableFilter(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.f70559q0 = predicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        Predicate<? super T> predicate = this.f70559q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, predicate));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, predicate));
        }
    }
}
