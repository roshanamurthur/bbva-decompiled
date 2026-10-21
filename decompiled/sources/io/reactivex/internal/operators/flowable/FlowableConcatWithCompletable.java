package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableConcatWithCompletable<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final CompletableSource f70394q0;

    public FlowableConcatWithCompletable(Flowable<T> flowable, CompletableSource completableSource) {
        super(flowable);
        this.f70394q0 = completableSource;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(subscriber, this.f70394q0));
    }

    public static final class a<T> extends AtomicReference<Disposable> implements FlowableSubscriber<T>, CompletableObserver, Subscription {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70395p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Subscription f70396q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public CompletableSource f70397r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public boolean f70398s0;

        public a(Subscriber<? super T> subscriber, CompletableSource completableSource) {
            this.f70395p0 = subscriber;
            this.f70397r0 = completableSource;
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70396q0.cancel();
            DisposableHelper.dispose(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (this.f70398s0) {
                this.f70395p0.onComplete();
                return;
            }
            this.f70398s0 = true;
            this.f70396q0 = SubscriptionHelper.CANCELLED;
            CompletableSource completableSource = this.f70397r0;
            this.f70397r0 = null;
            completableSource.subscribe(this);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            this.f70395p0.onError(th2);
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            this.f70395p0.onNext(t10);
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.f70396q0, subscription)) {
                this.f70396q0 = subscription;
                this.f70395p0.onSubscribe(this);
            }
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
            this.f70396q0.request(j10);
        }

        @Override // io.reactivex.CompletableObserver
        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.setOnce(this, disposable);
        }
    }
}
