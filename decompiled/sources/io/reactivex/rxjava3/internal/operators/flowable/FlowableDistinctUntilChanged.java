package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.BiPredicate;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDistinctUntilChanged<T, K> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, K> f74754q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super K, ? super K> f74755r0;

    public static final class a<T, K> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, K> f74756p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super K, ? super K> f74757q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public K f74758r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74759s0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.f74756p0 = function;
            this.f74757q0 = biPredicate;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            while (true) {
                T tPoll = this.qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f74756p0.apply(tPoll);
                if (!this.f74759s0) {
                    this.f74759s0 = true;
                    this.f74758r0 = kApply;
                    return tPoll;
                }
                if (!this.f74757q0.test(this.f74758r0, kApply)) {
                    this.f74758r0 = kApply;
                    return tPoll;
                }
                this.f74758r0 = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                return this.downstream.tryOnNext((Object) t10);
            }
            try {
                K kApply = this.f74756p0.apply(t10);
                if (this.f74759s0) {
                    boolean zTest = this.f74757q0.test(this.f74758r0, kApply);
                    this.f74758r0 = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f74759s0 = true;
                    this.f74758r0 = kApply;
                }
                this.downstream.onNext((Object) t10);
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public static final class b<T, K> extends BasicFuseableSubscriber<T, T> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, K> f74760p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super K, ? super K> f74761q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public K f74762r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74763s0;

        public b(Subscriber<? super T> subscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(subscriber);
            this.f74760p0 = function;
            this.f74761q0 = biPredicate;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            while (true) {
                T tPoll = this.qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f74760p0.apply(tPoll);
                if (!this.f74763s0) {
                    this.f74763s0 = true;
                    this.f74762r0 = kApply;
                    return tPoll;
                }
                if (!this.f74761q0.test(this.f74762r0, kApply)) {
                    this.f74762r0 = kApply;
                    return tPoll;
                }
                this.f74762r0 = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext((Object) t10);
                return true;
            }
            try {
                K kApply = this.f74760p0.apply(t10);
                if (this.f74763s0) {
                    boolean zTest = this.f74761q0.test(this.f74762r0, kApply);
                    this.f74762r0 = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f74763s0 = true;
                    this.f74762r0 = kApply;
                }
                this.downstream.onNext((Object) t10);
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public FlowableDistinctUntilChanged(Flowable<T> flowable, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(flowable);
        this.f74754q0 = function;
        this.f74755r0 = biPredicate;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        BiPredicate<? super K, ? super K> biPredicate = this.f74755r0;
        Function<? super T, K> function = this.f74754q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, function, biPredicate));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, function, biPredicate));
        }
    }
}
