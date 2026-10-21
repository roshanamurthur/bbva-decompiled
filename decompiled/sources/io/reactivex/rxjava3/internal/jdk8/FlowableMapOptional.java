package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import java.util.Objects;
import java.util.Optional;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMapOptional<T, R> extends Flowable<R> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Flowable<T> f74052q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Function<? super T, Optional<? extends R>> f74053r0;

    public static final class a<T, R> extends BasicFuseableConditionalSubscriber<T, R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74054p0;

        public a(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, Optional<? extends R>> function) {
            super(conditionalSubscriber);
            this.f74054p0 = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final R poll() throws Throwable {
            while (true) {
                T tPoll = this.qs.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.f74054p0.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional optionalB = cm.a.b(optionalApply);
                if (optionalB.isPresent()) {
                    return (R) optionalB.get();
                }
                if (this.sourceMode == 2) {
                    this.qs.request(1L);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return true;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return true;
            }
            try {
                Optional<? extends R> optionalApply = this.f74054p0.apply(t10);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional optionalB = cm.a.b(optionalApply);
                if (optionalB.isPresent()) {
                    return this.downstream.tryOnNext((Object) optionalB.get());
                }
                return false;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public static final class b<T, R> extends BasicFuseableSubscriber<T, R> implements ConditionalSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74055p0;

        public b(Subscriber<? super R> subscriber, Function<? super T, Optional<? extends R>> function) {
            super(subscriber);
            this.f74055p0 = function;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.upstream.request(1L);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final R poll() throws Throwable {
            while (true) {
                T tPoll = this.qs.poll();
                if (tPoll == null) {
                    return null;
                }
                Optional<? extends R> optionalApply = this.f74055p0.apply(tPoll);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional optionalB = cm.a.b(optionalApply);
                if (optionalB.isPresent()) {
                    return (R) optionalB.get();
                }
                if (this.sourceMode == 2) {
                    this.qs.request(1L);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return true;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return true;
            }
            try {
                Optional<? extends R> optionalApply = this.f74055p0.apply(t10);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional optionalB = cm.a.b(optionalApply);
                if (!optionalB.isPresent()) {
                    return false;
                }
                this.downstream.onNext((Object) optionalB.get());
                return true;
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public FlowableMapOptional(Flowable<T> flowable, Function<? super T, Optional<? extends R>> function) {
        this.f74052q0 = flowable;
        this.f74053r0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super R> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        Function<? super T, Optional<? extends R>> function = this.f74053r0;
        Flowable<T> flowable = this.f74052q0;
        if (z10) {
            flowable.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, function));
        } else {
            flowable.subscribe((FlowableSubscriber) new b(subscriber, function));
        }
    }
}
