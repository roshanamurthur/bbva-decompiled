package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.rxjava3.internal.subscriptions.EmptySubscription;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Objects;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableDistinct<T, K> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, K> f74750q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Supplier<? extends Collection<? super K>> f74751r0;

    public static final class a<T, K> extends BasicFuseableSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Collection<? super K> f74752p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, K> f74753q0;

        public a(Subscriber<? super T> subscriber, Function<? super T, K> function, Collection<? super K> collection) {
            super(subscriber);
            this.f74753q0 = function;
            this.f74752p0 = collection;
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f74752p0.clear();
            super.clear();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.f74752p0.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.rxjava3.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.f74752p0.clear();
            this.downstream.onError(th2);
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
                K kApply = this.f74753q0.apply(t10);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (this.f74752p0.add(kApply)) {
                    this.downstream.onNext((Object) t10);
                } else {
                    this.upstream.request(1L);
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Throwable {
            T tPoll;
            while (true) {
                tPoll = this.qs.poll();
                if (tPoll == null) {
                    break;
                }
                K kApply = this.f74753q0.apply(tPoll);
                Objects.requireNonNull(kApply, "The keySelector returned a null key");
                if (this.f74752p0.add(kApply)) {
                    break;
                }
                if (this.sourceMode == 2) {
                    this.upstream.request(1L);
                }
            }
            return tPoll;
        }
    }

    public FlowableDistinct(Flowable<T> flowable, Function<? super T, K> function, Supplier<? extends Collection<? super K>> supplier) {
        super(flowable);
        this.f74750q0 = function;
        this.f74751r0 = supplier;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f74750q0, (Collection) ExceptionHelper.nullCheck(this.f74751r0.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
