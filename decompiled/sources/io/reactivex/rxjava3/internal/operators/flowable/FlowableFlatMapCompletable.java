package io.reactivex.rxjava3.internal.operators.flowable;

import io.reactivex.rxjava3.annotations.Nullable;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.FlowableSubscriber;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.Exceptions;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes12.dex */
public final class FlowableFlatMapCompletable<T> extends io.reactivex.rxjava3.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f74849q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f74850r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f74851s0;

    public FlowableFlatMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        super(flowable);
        this.f74849q0 = function;
        this.f74851s0 = z10;
        this.f74850r0 = i10;
    }

    @Override // io.reactivex.rxjava3.core.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(this.f74850r0, this.f74849q0, subscriber, this.f74851s0));
    }

    public static final class a<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f74852p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f74854r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f74855s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f74857u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f74858w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f74853q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f74856t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.rxjava3.internal.operators.flowable.FlowableFlatMapCompletable$a$a, reason: collision with other inner class name */
        public final class C0369a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0369a() {
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.rxjava3.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f74856t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f74856t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.rxjava3.core.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(int i10, Function function, Subscriber subscriber, boolean z10) {
            this.f74852p0 = subscriber;
            this.f74854r0 = function;
            this.f74855s0 = z10;
            this.f74857u0 = i10;
            lazySet(1);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f74858w0 = true;
            this.v0.cancel();
            this.f74856t0.dispose();
            this.f74853q0.tryTerminateAndReport();
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() == 0) {
                this.f74853q0.tryTerminateConsumer(this.f74852p0);
            } else if (this.f74857u0 != Integer.MAX_VALUE) {
                this.v0.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            if (this.f74853q0.tryAddThrowableOrReport(th2)) {
                if (!this.f74855s0) {
                    this.f74858w0 = true;
                    this.v0.cancel();
                    this.f74856t0.dispose();
                    this.f74853q0.tryTerminateConsumer(this.f74852p0);
                    return;
                }
                if (decrementAndGet() == 0) {
                    this.f74853q0.tryTerminateConsumer(this.f74852p0);
                } else if (this.f74857u0 != Integer.MAX_VALUE) {
                    this.v0.request(1L);
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                CompletableSource completableSourceApply = this.f74854r0.apply(t10);
                Objects.requireNonNull(completableSourceApply, "The mapper returned a null CompletableSource");
                CompletableSource completableSource = completableSourceApply;
                getAndIncrement();
                C0369a c0369a = new C0369a();
                if (this.f74858w0 || !this.f74856t0.add(c0369a)) {
                    return;
                }
                completableSource.subscribe(c0369a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f74852p0.onSubscribe(this);
                int i10 = this.f74857u0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() {
            return null;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 2;
        }

        @Override // io.reactivex.rxjava3.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
        }
    }
}
