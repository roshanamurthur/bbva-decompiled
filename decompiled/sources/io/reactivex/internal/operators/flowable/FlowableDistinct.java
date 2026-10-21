package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscribers.BasicFuseableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.concurrent.Callable;
import org.reactivestreams.Subscriber;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableDistinct<T, K> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, K> f70485q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Callable<? extends Collection<? super K>> f70486r0;

    public static final class a<T, K> extends BasicFuseableSubscriber<T, T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Collection<? super K> f70487p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Function<? super T, K> f70488q0;

        public a(Subscriber<? super T> subscriber, Function<? super T, K> function, Collection<? super K> collection) {
            super(subscriber);
            this.f70488q0 = function;
            this.f70487p0 = collection;
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
            this.f70487p0.clear();
            super.clear();
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            this.f70487p0.clear();
            this.downstream.onComplete();
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.done) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.done = true;
            this.f70487p0.clear();
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
                if (this.f70487p0.add(ObjectHelper.requireNonNull(this.f70488q0.apply(t10), "The keySelector returned a null key"))) {
                    this.downstream.onNext((Object) t10);
                } else {
                    this.upstream.request(1L);
                }
            } catch (Throwable th2) {
                fail(th2);
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            T tPoll;
            while (true) {
                tPoll = this.qs.poll();
                if (tPoll == null) {
                    break;
                }
                if (this.f70487p0.add(ObjectHelper.requireNonNull(this.f70488q0.apply(tPoll), "The keySelector returned a null key"))) {
                    break;
                }
                if (this.sourceMode == 2) {
                    this.upstream.request(1L);
                }
            }
            return tPoll;
        }
    }

    public FlowableDistinct(Flowable<T> flowable, Function<? super T, K> function, Callable<? extends Collection<? super K>> callable) {
        super(flowable);
        this.f70485q0 = function;
        this.f70486r0 = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        try {
            this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70485q0, (Collection) ObjectHelper.requireNonNull(this.f70486r0.call(), "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources.")));
        } catch (Throwable th2) {
            Exceptions.throwIfFatal(th2);
            EmptySubscription.error(th2, subscriber);
        }
    }
}
