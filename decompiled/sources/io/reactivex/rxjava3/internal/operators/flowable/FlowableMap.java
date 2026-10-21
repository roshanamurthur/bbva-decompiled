package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableMap<T, U> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends U> f75070q0;

    public static final class a<T, U> extends BasicFuseableConditionalSubscriber<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends U> f75071p0;

        public a(ConditionalSubscriber<? super U> conditionalSubscriber, Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.f75071p0 = function;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                U uApply = this.f75071p0.apply(t10);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.downstream.onNext((Object) uApply);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final U poll() throws Throwable {
            T tPoll = this.qs.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f75071p0.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return true;
            }
            if (this.sourceMode != 0) {
                this.downstream.tryOnNext(null);
                return true;
            }
            try {
                U uApply = this.f75071p0.apply(t10);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                return this.downstream.tryOnNext((Object) uApply);
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public static final class b<T, U> extends BasicFuseableSubscriber<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends U> f75072p0;

        public b(Subscriber<? super U> subscriber, Function<? super T, ? extends U> function) {
            super(subscriber);
            this.f75072p0 = function;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            if (this.sourceMode != 0) {
                this.downstream.onNext(null);
                return;
            }
            try {
                U uApply = this.f75072p0.apply(t10);
                Objects.requireNonNull(uApply, "The mapper function returned a null value.");
                this.downstream.onNext((Object) uApply);
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final U poll() throws Throwable {
            T tPoll = this.qs.poll();
            if (tPoll == null) {
                return null;
            }
            U uApply = this.f75072p0.apply(tPoll);
            Objects.requireNonNull(uApply, "The mapper function returned a null value.");
            return uApply;
        }
    }

    public FlowableMap(Flowable<T> flowable, Function<? super T, ? extends U> function) {
        super(flowable);
        this.f75070q0 = function;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        Function<? super T, ? extends U> function = this.f75070q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, function));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, function));
        }
    }
}
