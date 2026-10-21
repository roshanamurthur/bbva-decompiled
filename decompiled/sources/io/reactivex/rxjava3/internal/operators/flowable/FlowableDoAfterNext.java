package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDoAfterNext<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Consumer<? super T> f74764q0;

    public static final class a<T> extends BasicFuseableConditionalSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super T> f74765p0;

        public a(ConditionalSubscriber<? super T> conditionalSubscriber, Consumer<? super T> consumer) {
            super(conditionalSubscriber);
            this.f74765p0 = consumer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.downstream.onNext((Object) t10);
            if (this.sourceMode == 0) {
                try {
                    this.f74765p0.accept(t10);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.qs.poll();
            if (tPoll != null) {
                this.f74765p0.accept(tPoll);
            }
            return tPoll;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            boolean zTryOnNext = this.downstream.tryOnNext((Object) t10);
            try {
                this.f74765p0.accept(t10);
            } catch (Throwable th2) {
                fail(th2);
            }
            return zTryOnNext;
        }
    }

    public static final class b<T> extends BasicFuseableSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Consumer<? super T> f74766p0;

        public b(Subscriber<? super T> subscriber, Consumer<? super T> consumer) {
            super(subscriber);
            this.f74766p0 = consumer;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.done) {
                return;
            }
            this.downstream.onNext((Object) t10);
            if (this.sourceMode == 0) {
                try {
                    this.f74766p0.accept(t10);
                } catch (Throwable th2) {
                    fail(th2);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll = this.qs.poll();
            if (tPoll != null) {
                this.f74766p0.accept(tPoll);
            }
            return tPoll;
        }
    }

    public FlowableDoAfterNext(Flowable<T> flowable, Consumer<? super T> consumer) {
        super(flowable);
        this.f74764q0 = consumer;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        boolean z10 = subscriber instanceof ConditionalSubscriber;
        Consumer<? super T> consumer = this.f74764q0;
        if (z10) {
            this.source.subscribe((FlowableSubscriber) new a((ConditionalSubscriber) subscriber, consumer));
        } else {
            this.source.subscribe((FlowableSubscriber) new b(subscriber, consumer));
        }
    }
}
