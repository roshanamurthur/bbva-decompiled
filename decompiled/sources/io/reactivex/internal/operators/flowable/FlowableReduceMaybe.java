package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.fuseable.HasUpstreamPublisher;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Publisher;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableReduceMaybe<T> extends Maybe<T> implements HasUpstreamPublisher<T>, FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f70965p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final BiFunction<T, T, T> f70966q0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f70967p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final BiFunction<T, T, T> f70968q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public T f70969r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Subscription f70970s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public boolean f70971t0;

        public a(MaybeObserver<? super T> maybeObserver, BiFunction<T, T, T> biFunction) {
            this.f70967p0 = maybeObserver;
            this.f70968q0 = biFunction;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f70970s0.cancel();
            this.f70971t0 = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f70971t0;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70971t0) {
                return;
            }
            this.f70971t0 = true;
            T t10 = this.f70969r0;
            MaybeObserver<? super T> maybeObserver = this.f70967p0;
            if (t10 != null) {
                maybeObserver.onSuccess(t10);
            } else {
                maybeObserver.onComplete();
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f70971t0) {
                RxJavaPlugins.onError(th2);
            } else {
                this.f70971t0 = true;
                this.f70967p0.onError(th2);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f70971t0) {
                return;
            }
            T t11 = this.f70969r0;
            if (t11 == null) {
                this.f70969r0 = t10;
                return;
            }
            try {
                this.f70969r0 = (T) ObjectHelper.requireNonNull(this.f70968q0.apply(t11, t10), "The reducer returned a null value");
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.f70970s0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70970s0, subscription)) {
                this.f70970s0 = subscription;
                this.f70967p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableReduceMaybe(Flowable<T> flowable, BiFunction<T, T, T> biFunction) {
        this.f70965p0 = flowable;
        this.f70966q0 = biFunction;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableReduce(this.f70965p0, this.f70966q0));
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public Publisher<T> source() {
        return this.f70965p0;
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f70965p0.subscribe((FlowableSubscriber) new a(maybeObserver, this.f70966q0));
    }
}
