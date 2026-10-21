package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.ConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableMap<T, U> extends io.reactivex.internal.operators.flowable.a<T, U> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends U> f70798q0;

    public static final class a<T, U> extends BasicFuseableConditionalSubscriber<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends U> f70799p0;

        public a(ConditionalSubscriber<? super U> conditionalSubscriber, Function<? super T, ? extends U> function) {
            super(conditionalSubscriber);
            this.f70799p0 = function;
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
                this.downstream.onNext((Object) ObjectHelper.requireNonNull(this.f70799p0.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final U poll() throws Exception {
            T tPoll = this.qs.poll();
            if (tPoll != null) {
                return (U) ObjectHelper.requireNonNull(this.f70799p0.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.done) {
                return false;
            }
            try {
                return this.downstream.tryOnNext((Object) ObjectHelper.requireNonNull(this.f70799p0.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
                return true;
            }
        }
    }

    public static final class b<T, U> extends BasicFuseableSubscriber<T, U> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Function<? super T, ? extends U> f70800p0;

        public b(Subscriber<? super U> subscriber, Function<? super T, ? extends U> function) {
            super(subscriber);
            this.f70800p0 = function;
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
                this.downstream.onNext((Object) ObjectHelper.requireNonNull(this.f70800p0.apply(t10), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final U poll() throws Exception {
            T tPoll = this.qs.poll();
            if (tPoll != null) {
                return (U) ObjectHelper.requireNonNull(this.f70800p0.apply(tPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public FlowableMap(Flowable<T> flowable, Function<? super T, ? extends U> function) {
        super(flowable);
        this.f70798q0 = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super U> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        Function<? super T, ? extends U> function = this.f70798q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, function));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, function));
        }
    }
}
