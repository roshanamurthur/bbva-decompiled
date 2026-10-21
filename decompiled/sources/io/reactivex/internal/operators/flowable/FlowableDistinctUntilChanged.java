package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDistinctUntilChanged<T, K> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, K> f70489q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final BiPredicate<? super K, ? super K> f70490r0;

    public static final class a<T, K> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, K> f70491p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super K, ? super K> f70492q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public K f70493r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70494s0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(conditionalSubscriber);
            this.f70491p0 = function;
            this.f70492q0 = biPredicate;
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
            while (true) {
                T tPoll = this.qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f70491p0.apply(tPoll);
                if (!this.f70494s0) {
                    this.f70494s0 = true;
                    this.f70493r0 = kApply;
                    return tPoll;
                }
                if (!this.f70492q0.test(this.f70493r0, kApply)) {
                    this.f70493r0 = kApply;
                    return tPoll;
                }
                this.f70493r0 = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
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
                return this.downstream.tryOnNext((Object) t10);
            }
            try {
                K kApply = this.f70491p0.apply(t10);
                if (this.f70494s0) {
                    boolean zTest = this.f70492q0.test(this.f70493r0, kApply);
                    this.f70493r0 = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f70494s0 = true;
                    this.f70493r0 = kApply;
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
        public final Function<? super T, K> f70495p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiPredicate<? super K, ? super K> f70496q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public K f70497r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70498s0;

        public b(Subscriber<? super T> subscriber, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(subscriber);
            this.f70495p0 = function;
            this.f70496q0 = biPredicate;
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
            while (true) {
                T tPoll = this.qs.poll();
                if (tPoll == null) {
                    return null;
                }
                K kApply = this.f70495p0.apply(tPoll);
                if (!this.f70498s0) {
                    this.f70498s0 = true;
                    this.f70497r0 = kApply;
                    return tPoll;
                }
                if (!this.f70496q0.test(this.f70497r0, kApply)) {
                    this.f70497r0 = kApply;
                    return tPoll;
                }
                this.f70497r0 = kApply;
                if (this.sourceMode != 1) {
                    this.upstream.request(1L);
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
                this.downstream.onNext((Object) t10);
                return true;
            }
            try {
                K kApply = this.f70495p0.apply(t10);
                if (this.f70498s0) {
                    boolean zTest = this.f70496q0.test(this.f70497r0, kApply);
                    this.f70497r0 = kApply;
                    if (zTest) {
                        return false;
                    }
                } else {
                    this.f70498s0 = true;
                    this.f70497r0 = kApply;
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
        this.f70489q0 = function;
        this.f70490r0 = biPredicate;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        BiPredicate<? super K, ? super K> biPredicate = this.f70490r0;
        Function<? super T, K> function = this.f70489q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, function, biPredicate));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, function, biPredicate));
        }
    }
}
