package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.fuseable.FuseToFlowable;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableSingleMaybe<T> extends Maybe<T> implements FuseToFlowable<T> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Flowable<T> f71145p0;

    public static final class a<T> implements FlowableSubscriber<T>, Disposable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final MaybeObserver<? super T> f71146p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f71147q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f71148r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public T f71149s0;

        public a(MaybeObserver<? super T> maybeObserver) {
            this.f71146p0 = maybeObserver;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.f71147q0.cancel();
            this.f71147q0 = SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean isDisposed() {
            return this.f71147q0 == SubscriptionHelper.CANCELLED;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f71148r0) {
                return;
            }
            this.f71148r0 = true;
            this.f71147q0 = SubscriptionHelper.CANCELLED;
            T t10 = this.f71149s0;
            this.f71149s0 = null;
            MaybeObserver<? super T> maybeObserver = this.f71146p0;
            if (t10 == null) {
                maybeObserver.onComplete();
            } else {
                maybeObserver.onSuccess(t10);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f71148r0) {
                RxJavaPlugins.onError(th2);
                return;
            }
            this.f71148r0 = true;
            this.f71147q0 = SubscriptionHelper.CANCELLED;
            this.f71146p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            if (this.f71148r0) {
                return;
            }
            if (this.f71149s0 == null) {
                this.f71149s0 = t10;
                return;
            }
            this.f71148r0 = true;
            this.f71147q0.cancel();
            this.f71147q0 = SubscriptionHelper.CANCELLED;
            this.f71146p0.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f71147q0, subscription)) {
                this.f71147q0 = subscription;
                this.f71146p0.onSubscribe(this);
                subscription.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingleMaybe(Flowable<T> flowable) {
        this.f71145p0 = flowable;
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public Flowable<T> fuseToFlowable() {
        return RxJavaPlugins.onAssembly(new FlowableSingle(this.f71145p0, null, false));
    }

    @Override // io.reactivex.Maybe
    public void subscribeActual(MaybeObserver<? super T> maybeObserver) {
        this.f71145p0.subscribe((FlowableSubscriber) new a(maybeObserver));
    }
}
