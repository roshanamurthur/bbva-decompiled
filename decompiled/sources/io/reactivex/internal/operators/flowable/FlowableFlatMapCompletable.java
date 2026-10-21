package io.reactivex.internal.operators.flowable;

import io.reactivex.CompletableObserver;
import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.annotations.Nullable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/* JADX INFO: loaded from: classes11.dex */
public final class FlowableFlatMapCompletable<T> extends io.reactivex.internal.operators.flowable.a<T, T> {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Function<? super T, ? extends CompletableSource> f70582q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f70583r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final boolean f70584s0;

    public FlowableFlatMapCompletable(Flowable<T> flowable, Function<? super T, ? extends CompletableSource> function, boolean z10, int i10) {
        super(flowable);
        this.f70582q0 = function;
        this.f70584s0 = z10;
        this.f70583r0 = i10;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(Subscriber<? super T> subscriber) {
        this.source.subscribe((FlowableSubscriber) new a(this.f70583r0, this.f70582q0, subscriber, this.f70584s0));
    }

    public static final class a<T> extends BasicIntQueueSubscription<T> implements FlowableSubscriber<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Subscriber<? super T> f70585p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final Function<? super T, ? extends CompletableSource> f70587r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final boolean f70588s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final int f70590u0;
        public Subscription v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public volatile boolean f70591w0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final AtomicThrowable f70586q0 = new AtomicThrowable();

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final CompositeDisposable f70589t0 = new CompositeDisposable();

        /* JADX INFO: renamed from: io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable$a$a, reason: collision with other inner class name */
        public final class C0305a extends AtomicReference<Disposable> implements CompletableObserver, Disposable {
            public C0305a() {
            }

            @Override // io.reactivex.disposables.Disposable
            public final void dispose() {
                DisposableHelper.dispose(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public final boolean isDisposed() {
                return DisposableHelper.isDisposed(get());
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public final void onComplete() {
                a aVar = a.this;
                aVar.f70589t0.delete(this);
                aVar.onComplete();
            }

            @Override // io.reactivex.CompletableObserver
            public final void onError(Throwable th2) {
                a aVar = a.this;
                aVar.f70589t0.delete(this);
                aVar.onError(th2);
            }

            @Override // io.reactivex.CompletableObserver
            public final void onSubscribe(Disposable disposable) {
                DisposableHelper.setOnce(this, disposable);
            }
        }

        public a(int i10, Function function, Subscriber subscriber, boolean z10) {
            this.f70585p0 = subscriber;
            this.f70587r0 = function;
            this.f70588s0 = z10;
            this.f70590u0 = i10;
            lazySet(1);
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
            this.f70591w0 = true;
            this.v0.cancel();
            this.f70589t0.dispose();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final boolean isEmpty() {
            return true;
        }

        @Override // org.reactivestreams.Subscriber
        public final void onComplete() {
            if (decrementAndGet() != 0) {
                if (this.f70590u0 != Integer.MAX_VALUE) {
                    this.v0.request(1L);
                }
            } else {
                Throwable thTerminate = this.f70586q0.terminate();
                Subscriber<? super T> subscriber = this.f70585p0;
                if (thTerminate != null) {
                    subscriber.onError(thTerminate);
                } else {
                    subscriber.onComplete();
                }
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onError(Throwable th2) {
            AtomicThrowable atomicThrowable = this.f70586q0;
            if (!atomicThrowable.addThrowable(th2)) {
                RxJavaPlugins.onError(th2);
                return;
            }
            boolean z10 = this.f70588s0;
            Subscriber<? super T> subscriber = this.f70585p0;
            if (!z10) {
                cancel();
                if (getAndSet(0) > 0) {
                    subscriber.onError(atomicThrowable.terminate());
                    return;
                }
                return;
            }
            if (decrementAndGet() == 0) {
                subscriber.onError(atomicThrowable.terminate());
            } else if (this.f70590u0 != Integer.MAX_VALUE) {
                this.v0.request(1L);
            }
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T t10) {
            try {
                CompletableSource completableSource = (CompletableSource) ObjectHelper.requireNonNull(this.f70587r0.apply(t10), "The mapper returned a null CompletableSource");
                getAndIncrement();
                C0305a c0305a = new C0305a();
                if (this.f70591w0 || !this.f70589t0.add(c0305a)) {
                    return;
                }
                completableSource.subscribe(c0305a);
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.v0.cancel();
                onError(th2);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public final void onSubscribe(Subscription subscription) {
            if (SubscriptionHelper.validate(this.v0, subscription)) {
                this.v0 = subscription;
                this.f70585p0.onSubscribe(this);
                int i10 = this.f70590u0;
                if (i10 == Integer.MAX_VALUE) {
                    subscription.request(Long.MAX_VALUE);
                } else {
                    subscription.request(i10);
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public final T poll() throws Exception {
            return null;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public final int requestFusion(int i10) {
            return i10 & 2;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public final void clear() {
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long j10) {
        }
    }
}
