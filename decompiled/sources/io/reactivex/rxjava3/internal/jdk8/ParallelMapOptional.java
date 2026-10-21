package io.reactivex.rxjava3.internal.jdk8;

import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.parallel.ParallelFlowable;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import java.util.Optional;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class ParallelMapOptional<T, R> extends ParallelFlowable<R> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ParallelFlowable<T> f74144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function<? super T, Optional<? extends R>> f74145b;

    public static final class a<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final ConditionalSubscriber<? super R> f74146p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74147q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74148r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74149s0;

        public a(ConditionalSubscriber<? super R> conditionalSubscriber, Function<? super T, Optional<? extends R>> function) {
            this.f74146p0 = conditionalSubscriber;
            this.f74147q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74148r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74149s0) {
                return;
            }
            this.f74149s0 = true;
            this.f74146p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74149s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74149s0 = true;
                this.f74146p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.f74148r0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74148r0, subscription)) {
                this.f74148r0 = subscription;
                this.f74146p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74148r0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.f74149s0) {
                return false;
            }
            try {
                Optional<? extends R> optionalApply = this.f74147q0.apply(t10);
                Objects.requireNonNull(optionalApply, "The mapper returned a null value");
                Optional optionalB = cm.a.b(optionalApply);
                return optionalB.isPresent() && this.f74146p0.tryOnNext((Object) optionalB.get());
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
                return false;
            }
        }
    }

    public static final class b<T, R> implements ConditionalSubscriber<T>, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super R> f74150p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, Optional<? extends R>> f74151q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Subscription f74152r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f74153s0;

        public b(Subscriber<? super R> subscriber, Function<? super T, Optional<? extends R>> function) {
            this.f74150p0 = subscriber;
            this.f74151q0 = function;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74152r0.cancel();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f74153s0) {
                return;
            }
            this.f74153s0 = true;
            this.f74150p0.onComplete();
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74153s0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f74153s0 = true;
                this.f74150p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (tryOnNext(t10)) {
                return;
            }
            this.f74152r0.request(1L);
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f74152r0, subscription)) {
                this.f74152r0 = subscription;
                this.f74150p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f74152r0.request(j10);
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.ConditionalSubscriber
        public final boolean tryOnNext(T t10) {
            if (this.f74153s0) {
                return true;
            }
            try {
                Optional<? extends R> optionalApply = this.f74151q0.apply(t10);
                Objects.requireNonNull(optionalApply, "The mapper returned a null Optional");
                Optional optionalB = cm.a.b(optionalApply);
                if (!optionalB.isPresent()) {
                    return false;
                }
                this.f74150p0.onNext((Object) optionalB.get());
                return true;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                cancel();
                onError(th2);
                return true;
            }
        }
    }

    public ParallelMapOptional(ParallelFlowable<T> parallelFlowable, Function<? super T, Optional<? extends R>> function) {
        this.f74144a = parallelFlowable;
        this.f74145b = function;
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public int parallelism() {
        return this.f74144a.parallelism();
    }

    @Override // io.reactivex.rxjava3.parallel.ParallelFlowable
    public void subscribe(Subscriber<? super R>[] subscriberArr) {
        if (validate(subscriberArr)) {
            int length = subscriberArr.length;
            Subscriber<? super T>[] subscriberArr2 = new Subscriber[length];
            for (int i10 = 0; i10 < length; i10++) {
                Subscriber<? super R> subscriber = subscriberArr[i10];
                boolean z10 = subscriber instanceof ConditionalSubscriber;
                Function<? super T, Optional<? extends R>> function = this.f74145b;
                if (z10) {
                    subscriberArr2[i10] = new a((ConditionalSubscriber) subscriber, function);
                } else {
                    subscriberArr2[i10] = new b(subscriber, function);
                }
            }
            this.f74144a.subscribe(subscriberArr2);
        }
    }
}
