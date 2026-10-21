package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.MaybeObserver;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.internal.fuseable.FuseToFlowable;
import io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import java.util.Objects;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableReduceMaybe<T> extends Maybe<T> implements HasUpstreamPublisher<T>, FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f75222p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<T, T, T> f75223q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f75224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f75225q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f75226r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f75227s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f75228t0;

        public a(MaybeObserver<? super T> maybeObserver, BiFunction<T, T, T> biFunction) {
            this.f75224p0 = maybeObserver;
            this.f75225q0 = biFunction;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.f75227s0.cancel();
            this.f75228t0 = true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final boolean isDisposed() {
            return this.f75228t0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f75228t0) {
                return;
            }
            this.f75228t0 = true;
            T t10 = this.f75226r0;
            MaybeObserver<? super T> maybeObserver = this.f75224p0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f75228t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f75228t0 = true;
                this.f75224p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f75228t0) {
                return;
            }
            T t11 = this.f75226r0;
            if (t11 == null) {
                this.f75226r0 = t10;
                return;
            }
            try {
                T tApply = this.f75225q0.apply(t11, t10);
                Objects.requireNonNull(tApply, "The reducer returned a null value");
                this.f75226r0 = tApply;
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f75227s0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f75227s0, subscription)) {
                this.f75227s0 = subscription;
                this.f75224p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceMaybe(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        this.f75222p0 = flowable;
        this.f75223q0 = biFunction;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableReduce(this.f75222p0, this.f75223q0));
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f75222p0;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f75222p0.subscribe((FlowableSubscriber) new a(maybeObserver, this.f75223q0));
    }
}
